package sekwah.mods.narutomod.animation;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.TextureOffset;
import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.client.renderer.Tessellator;
import org.lwjgl.opengl.GL11;
import sekwah.mods.narutomod.animation.modelparts.IShouldBake;
import sekwah.mods.narutomod.animation.modelparts.ModelRetexturedBoxSharpBend;
import sekwah.mods.narutomod.client.player.models.ModelNinjaBiped;

import java.util.ArrayList;
import java.util.List;

public class AnimModelRenderer extends ModelRenderer {
    public final String boxName;
    /**
     * The X offset into the texture used for displaying this model
     */
    private int textureOffsetX;
    /**
     * The Y offset into the texture used for displaying this model
     */
    private int textureOffsetY;
    private boolean compiled;

    /*private boolean needsReCompile = false;*/

    /**
     * The GL display list rendered by the Tessellator for this model
     */
    private int displayList;
    private ModelBase baseModel;

    public List<ModelBox> unbakedList;

    public AnimModelRenderer(ModelBase p_i1172_1_, String boxName) {
        super(p_i1172_1_, boxName);
        this.unbakedList = new ArrayList<>();
        this.textureWidth = 64.0F;
        this.textureHeight = 32.0F;
        this.showModel = true;
        this.cubeList = new ArrayList();
        this.baseModel = p_i1172_1_;
        this.boxName = boxName;
        this.setTextureSize(p_i1172_1_.textureWidth, p_i1172_1_.textureHeight);
    }

    public AnimModelRenderer(ModelBase p_i1174_1_, int p_i1174_2_, int p_i1174_3_) {
        this(p_i1174_1_, null);
        this.setTextureOffset(p_i1174_2_, p_i1174_3_);
    }

    public AnimModelRenderer(ModelBase p_i1174_1_, int p_i1174_2_, int p_i1174_3_, String boxName) {
        this(p_i1174_1_, boxName);
        this.setTextureOffset(p_i1174_2_, p_i1174_3_);
    }

    public AnimModelRenderer(ModelNinjaBiped modelNinjaBiped, int textureX, int textureY, String boxName, AnimModelRenderer prevModel) {
        this(modelNinjaBiped, textureX, textureY, boxName);
        if(prevModel != null) {
            this.isHidden = prevModel.isHidden;
            this.showModel = prevModel.showModel;
        }
    }

    /**
     * Sets the current box's rotation points and rotation angles to another box.
     */
    public void addChild(ModelRenderer child) {
        if (this.childModels == null) {
            this.childModels = new ArrayList();
        }

        this.childModels.add(child);
    }

    public ModelRenderer setTextureOffset(int p_78784_1_, int p_78784_2_) {
        this.textureOffsetX = p_78784_1_;
        this.textureOffsetY = p_78784_2_;
        return this;
    }

    public ModelRenderer addBox(String p_78786_1_, float p_78786_2_, float p_78786_3_, float p_78786_4_, int p_78786_5_, int p_78786_6_, int p_78786_7_) {
        p_78786_1_ = this.boxName + "." + p_78786_1_;
        TextureOffset textureoffset = this.baseModel.getTextureOffset(p_78786_1_);
        this.setTextureOffset(textureoffset.textureOffsetX, textureoffset.textureOffsetY);
        this.cubeList.add((new ModelBox(this, this.textureOffsetX, this.textureOffsetY, p_78786_2_, p_78786_3_, p_78786_4_, p_78786_5_, p_78786_6_, p_78786_7_, 0.0F)).func_78244_a(p_78786_1_));
        return this;
    }

    public ModelRenderer addBox(float p_78789_1_, float p_78789_2_, float p_78789_3_, int p_78789_4_, int p_78789_5_, int p_78789_6_) {
        this.cubeList.add(new ModelBox(this, this.textureOffsetX, this.textureOffsetY, p_78789_1_, p_78789_2_, p_78789_3_, p_78789_4_, p_78789_5_, p_78789_6_, 0.0F));
        return this;
    }

    /**
     * Creates a textured box. Args: originX, originY, originZ, width, height, depth, scaleFactor.
     */
    public void addBox(float originX, float originY, float originZ, int width, int height, int depth, float p_78790_7_) {
        this.cubeList.add(new ModelBox(this, this.textureOffsetX, this.textureOffsetY, originX, originY, originZ, width, height, depth, p_78790_7_));
    }

    public void setRotationPoint(float p_78793_1_, float p_78793_2_, float p_78793_3_) {
        this.rotationPointX = p_78793_1_;
        this.rotationPointY = p_78793_2_;
        this.rotationPointZ = p_78793_3_;
    }

    @SideOnly(Side.CLIENT)
    public void render(float p_78785_1_) {
        if (!this.isHidden) {
            if (this.showModel) {
                if (!this.compiled) {
                    this.compileDisplayList(p_78785_1_);
                    //this.needsReCompile = false;
                }
                /*if(this.needsReCompile) {
                    this.reCompileDisplayList(p_78785_1_);
                }*/
                GL11.glTranslatef(this.offsetX, this.offsetY, this.offsetZ);
                int i;

                if (this.rotateAngleX == 0.0F && this.rotateAngleY == 0.0F && this.rotateAngleZ == 0.0F) {
                    if (this.rotationPointX == 0.0F && this.rotationPointY == 0.0F && this.rotationPointZ == 0.0F) {
                        GL11.glCallList(this.displayList);

                        if (this.childModels != null) {
                            for (i = 0; i < this.childModels.size(); ++i) {
                                ((ModelRenderer) this.childModels.get(i)).render(p_78785_1_);
                            }
                        }

                        for (ModelBox box:
                                this.unbakedList) {
                            Tessellator tessellator = Tessellator.instance;
                            box.render(tessellator, p_78785_1_);
                        }
                    } else {
                        GL11.glTranslatef(this.rotationPointX * p_78785_1_, this.rotationPointY * p_78785_1_, this.rotationPointZ * p_78785_1_);
                        GL11.glCallList(this.displayList);

                        if (this.childModels != null) {
                            for (i = 0; i < this.childModels.size(); ++i) {
                                ((ModelRenderer) this.childModels.get(i)).render(p_78785_1_);
                            }
                        }


                        for (ModelBox box:
                                this.unbakedList) {
                            Tessellator tessellator = Tessellator.instance;
                            box.render(tessellator, p_78785_1_);
                        }

                        GL11.glTranslatef(-this.rotationPointX * p_78785_1_, -this.rotationPointY * p_78785_1_, -this.rotationPointZ * p_78785_1_);
                    }
                } else {
                    GL11.glPushMatrix();
                    GL11.glTranslatef(this.rotationPointX * p_78785_1_, this.rotationPointY * p_78785_1_, this.rotationPointZ * p_78785_1_);

                    if (this.rotateAngleZ != 0.0F) {
                        GL11.glRotatef(this.rotateAngleZ * (180F / (float) Math.PI), 0.0F, 0.0F, 1.0F);
                    }

                    if (this.rotateAngleY != 0.0F) {
                        GL11.glRotatef(this.rotateAngleY * (180F / (float) Math.PI), 0.0F, 1.0F, 0.0F);
                    }

                    if (this.rotateAngleX != 0.0F) {
                        GL11.glRotatef(this.rotateAngleX * (180F / (float) Math.PI), 1.0F, 0.0F, 0.0F);
                    }

                    GL11.glCallList(this.displayList);

                    if (this.childModels != null) {
                        for (i = 0; i < this.childModels.size(); ++i) {
                            ((ModelRenderer) this.childModels.get(i)).render(p_78785_1_);
                        }
                    }

                    for (ModelBox box:
                            this.unbakedList) {
                        Tessellator tessellator = Tessellator.instance;
                        box.render(tessellator, p_78785_1_);
                    }

                    GL11.glPopMatrix();
                }

                GL11.glTranslatef(-this.offsetX, -this.offsetY, -this.offsetZ);
            }
        }
    }

    @SideOnly(Side.CLIENT)
    public void renderWithRotation(float p_78791_1_) {
        if (!this.isHidden) {
            if (this.showModel) {
                if (!this.compiled) {
                    this.compileDisplayList(p_78791_1_);
                }

                GL11.glPushMatrix();
                GL11.glTranslatef(this.rotationPointX * p_78791_1_, this.rotationPointY * p_78791_1_, this.rotationPointZ * p_78791_1_);

                if (this.rotateAngleY != 0.0F) {
                    GL11.glRotatef(this.rotateAngleY * (180F / (float) Math.PI), 0.0F, 1.0F, 0.0F);
                }

                if (this.rotateAngleX != 0.0F) {
                    GL11.glRotatef(this.rotateAngleX * (180F / (float) Math.PI), 1.0F, 0.0F, 0.0F);
                }

                if (this.rotateAngleZ != 0.0F) {
                    GL11.glRotatef(this.rotateAngleZ * (180F / (float) Math.PI), 0.0F, 0.0F, 1.0F);
                }

                GL11.glCallList(this.displayList);
                GL11.glPopMatrix();
            }
        }
    }

    /**
     * Allows the changing of Angles after a box has been rendered
     */
    @SideOnly(Side.CLIENT)
    public void postRender(float p_78794_1_) {
        if (!this.isHidden) {
            if (this.showModel) {
                if (!this.compiled) {
                    this.compileDisplayList(p_78794_1_);
                }

                if (this.rotateAngleX == 0.0F && this.rotateAngleY == 0.0F && this.rotateAngleZ == 0.0F) {
                    if (this.rotationPointX != 0.0F || this.rotationPointY != 0.0F || this.rotationPointZ != 0.0F) {
                        GL11.glTranslatef(this.rotationPointX * p_78794_1_, this.rotationPointY * p_78794_1_, this.rotationPointZ * p_78794_1_);
                    }
                } else {
                    GL11.glTranslatef(this.rotationPointX * p_78794_1_, this.rotationPointY * p_78794_1_, this.rotationPointZ * p_78794_1_);

                    if (this.rotateAngleZ != 0.0F) {
                        GL11.glRotatef(this.rotateAngleZ * (180F / (float) Math.PI), 0.0F, 0.0F, 1.0F);
                    }

                    if (this.rotateAngleY != 0.0F) {
                        GL11.glRotatef(this.rotateAngleY * (180F / (float) Math.PI), 0.0F, 1.0F, 0.0F);
                    }

                    if (this.rotateAngleX != 0.0F) {
                        GL11.glRotatef(this.rotateAngleX * (180F / (float) Math.PI), 1.0F, 0.0F, 0.0F);
                    }
                }
            }
        }
    }

    /*@SideOnly(Side.CLIENT)
    private void reCompileDisplayList(float size)
    {
        GL11.glDeleteLists(this.displayList, 1);
        this.genDisplayList(size);
        this.needsReCompile = false;
    }*/

    /**
     * Compiles a GL display list for this model
     */
    @SideOnly(Side.CLIENT)
    private void compileDisplayList(float size) {
        this.displayList = GLAllocation.generateDisplayLists(1);
        genDisplayList(size);
        this.compiled = true;
    }

    private void genDisplayList(float size) {
        GL11.glNewList(this.displayList, GL11.GL_COMPILE);
        Tessellator tessellator = Tessellator.instance;

        for (int i = 0; i < this.cubeList.size(); ++i) {
            ModelBox box = (ModelBox) this.cubeList.get(i);
            if(!(box instanceof IShouldBake) || (box instanceof IShouldBake && ((IShouldBake) box).shouldBake())) {
                box.render(tessellator, size);
            }
        }

        GL11.glEndList();
    }

    /*public void markReCompile() {
        this.needsReCompile = true;
    }*/

    /**
     * Returns the model renderer with the new texture parameters.
     */
    public ModelRenderer setTextureSize(int p_78787_1_, int p_78787_2_) {
        this.textureWidth = (float) p_78787_1_;
        this.textureHeight = (float) p_78787_2_;
        return this;
    }

    public void addUnbaked(ModelRetexturedBoxSharpBend box) {
        this.cubeList.add(box);
        this.unbakedList.add(box);
    }
}