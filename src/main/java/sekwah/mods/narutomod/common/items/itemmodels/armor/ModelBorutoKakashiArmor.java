package sekwah.mods.narutomod.common.items.itemmodels.armor;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import sekwah.mods.narutomod.client.player.models.ModelNinjaBiped;

/**
 * BorutoKakashiArmor - HeroGamezFTW
 * Created using Tabula 6.0.0
 */
public class ModelBorutoKakashiArmor extends ModelNinjaBiped {
    public ModelRenderer Head;
    public ModelRenderer UpperLeftArm;
    public ModelRenderer UpperBody;
    public ModelRenderer UpperRightLeg;
    public ModelRenderer UpperLeftLeg;
    public ModelRenderer UpperRightArm;
    public ModelRenderer Hair18;
    public ModelRenderer Mask1;
    public ModelRenderer Mask2;
    public ModelRenderer Mask3;
    public ModelRenderer EyeCut1;
    public ModelRenderer EyeCut2;
    public ModelRenderer KakashiHeadband1;
    public ModelRenderer KakashiHeadband2;
    public ModelRenderer KakashiHeadband3;
    public ModelRenderer KakashiHeadband4;
    public ModelRenderer KakashiHeadband5;
    public ModelRenderer KakashiHeadband6;
    public ModelRenderer KakashiHeadband7;
    public ModelRenderer KakashiHeadband8;
    public ModelRenderer KakashiHeadband9;
    public ModelRenderer Hair1;
    public ModelRenderer Hair2;
    public ModelRenderer Hair3;
    public ModelRenderer Hair4;
    public ModelRenderer Hair5;
    public ModelRenderer Hair6;
    public ModelRenderer Hair7;
    public ModelRenderer Hair8;
    public ModelRenderer Hair9;
    public ModelRenderer Hair10;
    public ModelRenderer Hair11;
    public ModelRenderer Hair12;
    public ModelRenderer Hair13;
    public ModelRenderer Hair14;
    public ModelRenderer Hair15;
    public ModelRenderer Hair16;
    public ModelRenderer Hair17;
    public ModelRenderer Hair18_1;
    public ModelRenderer Hair19;
    public ModelRenderer Hair20;
    public ModelRenderer Hair21;
    public ModelRenderer Hair22;
    public ModelRenderer Hair23;
    public ModelRenderer Hair24;
    public ModelRenderer Hair25;
    public ModelRenderer LowerLeftArm;
    public ModelRenderer ArmorLeft2;
    public ModelRenderer ArmorLeft1;
    public ModelRenderer RedArm1;
    public ModelRenderer RedArm2;
    public ModelRenderer RedArm3;
    public ModelRenderer RedArm4;
    public ModelRenderer LowerBody;
    public ModelRenderer HeadNeck2;
    public ModelRenderer HeadNeck3;
    public ModelRenderer HeadNeck1;
    public ModelRenderer HeadNeck4;
    public ModelRenderer Armor31;
    public ModelRenderer Armor1;
    public ModelRenderer Armor4;
    public ModelRenderer Armor10;
    public ModelRenderer Armor11;
    public ModelRenderer Armor13;
    public ModelRenderer Armor12;
    public ModelRenderer White4;
    public ModelRenderer White3;
    public ModelRenderer Armor14;
    public ModelRenderer Armor15;
    public ModelRenderer Armor17;
    public ModelRenderer Armor16;
    public ModelRenderer White1;
    public ModelRenderer White2;
    public ModelRenderer Armor30;
    public ModelRenderer Armor18;
    public ModelRenderer Armor29;
    public ModelRenderer ArmorBottom1;
    public ModelRenderer Armor2;
    public ModelRenderer Armor28;
    public ModelRenderer Armor19;
    public ModelRenderer Armor27;
    public ModelRenderer BlackLine1;
    public ModelRenderer Armor3;
    public ModelRenderer Armor32;
    public ModelRenderer Armor5;
    public ModelRenderer Armor7;
    public ModelRenderer Armor6;
    public ModelRenderer Armor8;
    public ModelRenderer Armor33;
    public ModelRenderer ArmorSide1;
    public ModelRenderer Armor18_1;
    public ModelRenderer Armor20;
    public ModelRenderer Armor21;
    public ModelRenderer Armor29_1;
    public ModelRenderer Armor24;
    public ModelRenderer Armor23;
    public ModelRenderer Armor22;
    public ModelRenderer Armor25;
    public ModelRenderer BackStorage;
    public ModelRenderer LowerRightLeg;
    public ModelRenderer WhiteStrap3;
    public ModelRenderer WhiteStrap1;
    public ModelRenderer WhiteStrap4;
    public ModelRenderer WhiteStrap2;
    public ModelRenderer KunaiBag;
    public ModelRenderer KunaiBagStrap1;
    public ModelRenderer KunaiBagStrap3;
    public ModelRenderer KunaiBagStrap4;
    public ModelRenderer KunaiBagStrap2;
    public ModelRenderer Shoe1;
    public ModelRenderer Shoe2;
    public ModelRenderer Shoe3;
    public ModelRenderer Leg1;
    public ModelRenderer Leg3;
    public ModelRenderer Leg2;
    public ModelRenderer Leg4;
    public ModelRenderer LowerLeftLeg;
    public ModelRenderer Shoe1_1;
    public ModelRenderer Shoe2_1;
    public ModelRenderer Shoe3_1;
    public ModelRenderer Leg1_1;
    public ModelRenderer Leg3_1;
    public ModelRenderer Leg2_1;
    public ModelRenderer Leg4_1;
    public ModelRenderer LowerRightArm;
    public ModelRenderer ArmorRight1;
    public ModelRenderer ArmorRight2;

    public ModelBorutoKakashiArmor() {
        this.textureWidth = 150;
        this.textureHeight = 100;

        float expandValue = 0.005f;

        this.Leg4_1 = new ModelRenderer(this, 60, 43);
        this.Leg4_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg4_1.addBox(-4.02F, -5.4F, -2.01F, 1, 1, 4, expandValue);
        this.ArmorSide1 = new ModelRenderer(this, 40, 68);
        this.ArmorSide1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ArmorSide1.addBox(3.03F, 0.0F, -2.0F, 1, 2, 4, expandValue);
        this.KunaiBagStrap3 = new ModelRenderer(this, 80, 60);
        this.KunaiBagStrap3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.KunaiBagStrap3.addBox(-5.9F, 1.8F, -2.1F, 4, 1, 1, expandValue);
        this.Hair19 = new ModelRenderer(this, 20, 91);
        this.Hair19.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair19.addBox(-2.5F, -11.3F, 1.4F, 1, 2, 1, expandValue);
        this.setRotateAngle(Hair19, 0.0F, 0.0F, 0.15707963267948966F);
        this.Armor29 = new ModelRenderer(this, 40, 68);
        this.Armor29.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Armor29.addBox(-4.03F, 1.0F, -2.0F, 1, 5, 4, expandValue);
        this.Armor23 = new ModelRenderer(this, 40, 50);
        this.Armor23.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Armor23.addBox(-4.49F, 3.2F, 1.21F, 1, 2, 1, expandValue);
        this.setRotateAngle(Armor23, 0.0F, 0.0F, -0.13962634015954636F);
        this.Hair1 = new ModelRenderer(this, 20, 91);
        this.Hair1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair1.addBox(-1.6F, -9.2F, -3.0F, 6, 2, 6, expandValue);
        this.setRotateAngle(Hair1, 0.0F, 0.0F, -0.17453292519943295F);
        this.Hair22 = new ModelRenderer(this, 20, 91);
        this.Hair22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair22.addBox(1.1F, -12.5F, -0.4F, 1, 1, 1, expandValue);
        this.setRotateAngle(Hair22, 0.0F, 0.0F, 0.17453292519943295F);
        this.Armor6 = new ModelRenderer(this, 40, 50);
        this.Armor6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Armor6.addBox(3.49F, 3.2F, -2.2F, 1, 2, 1, expandValue);
        this.setRotateAngle(Armor6, 0.0F, 0.0F, 0.13962634015954636F);
        this.Hair12 = new ModelRenderer(this, 20, 91);
        this.Hair12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair12.addBox(-1.4F, -10.0F, -2.7F, 1, 1, 1, expandValue);
        this.setRotateAngle(Hair12, 0.0F, 0.0F, 0.17453292519943295F);
        this.Armor3 = new ModelRenderer(this, 40, 50);
        this.Armor3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Armor3.addBox(-3.99F, 2.8F, -2.2F, 7, 1, 1, expandValue);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, expandValue);
        this.Hair6 = new ModelRenderer(this, 20, 91);
        this.Hair6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair6.addBox(-1.1F, -8.3F, -3.5F, 6, 1, 2, expandValue);
        this.setRotateAngle(Hair6, 0.0F, 0.0F, -0.12217304763960307F);
        this.Hair5 = new ModelRenderer(this, 20, 91);
        this.Hair5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair5.addBox(0.9F, -10.8F, -2.0F, 6, 3, 4, expandValue);
        this.setRotateAngle(Hair5, 0.0F, 0.0F, -0.17453292519943295F);
        this.WhiteStrap2 = new ModelRenderer(this, 0, 80);
        this.WhiteStrap2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WhiteStrap2.addBox(-2.98F, 1.4F, -1.98F, 1, 2, 4, expandValue);
        this.Hair20 = new ModelRenderer(this, 20, 91);
        this.Hair20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair20.addBox(3.3F, -11.5F, -1.6F, 3, 2, 3, expandValue);
        this.setRotateAngle(Hair20, 0.0F, 0.0F, -0.08726646259971647F);
        this.Armor24 = new ModelRenderer(this, 40, 50);
        this.Armor24.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Armor24.addBox(-3.0F, 3.8F, 1.2F, 6, 1, 1, expandValue);
        this.Shoe3 = new ModelRenderer(this, 60, 43);
        this.Shoe3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Shoe3.addBox(-5.01F, -1.1F, -2.9F, 1, 2, 1, expandValue);
        this.setRotateAngle(Shoe3, -0.5235987755982988F, 0.0F, 0.0F);
        this.KakashiHeadband2 = new ModelRenderer(this, 0, 65);
        this.KakashiHeadband2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.KakashiHeadband2.addBox(-4.2F, -6.5F, -4.0F, 1, 2, 8, expandValue);
        this.ArmorBottom1 = new ModelRenderer(this, 40, 52);
        this.ArmorBottom1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ArmorBottom1.addBox(-4.0F, 0.0F, -2.2F, 8, 2, 1, expandValue);
        this.LowerRightLeg = new ModelRenderer(this, 0, 28);
        this.LowerRightLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
        this.Shoe2 = new ModelRenderer(this, 60, 43);
        this.Shoe2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Shoe2.addBox(-7.99F, -1.1F, -2.9F, 1, 2, 1, expandValue);
        this.setRotateAngle(Shoe2, -0.5235987755982988F, 0.0F, 0.0F);
        this.KakashiHeadband3 = new ModelRenderer(this, 0, 65);
        this.KakashiHeadband3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.KakashiHeadband3.addBox(3.2F, -6.5F, -4.0F, 1, 2, 8, expandValue);
        this.Armor25 = new ModelRenderer(this, 40, 50);
        this.Armor25.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Armor25.addBox(-3.7F, 4.73F, 1.2F, 7, 1, 1, expandValue);
        this.Leg1_1 = new ModelRenderer(this, 60, 47);
        this.Leg1_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg1_1.addBox(-4.01F, -5.4F, -2.02F, 4, 1, 1, expandValue);
        this.Leg1 = new ModelRenderer(this, 60, 47);
        this.Leg1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg1.addBox(-8.01F, -5.4F, -2.02F, 4, 1, 1, expandValue);
        this.UpperLeftLeg = new ModelRenderer(this, 0, 16);
        this.UpperLeftLeg.mirror = true;
        this.UpperLeftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
        this.UpperLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, expandValue);
        this.White4 = new ModelRenderer(this, 13, 50);
        this.White4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.White4.addBox(-3.69F, 1.26F, -0.32F, 1, 1, 1, expandValue);
        this.setRotateAngle(White4, 0.8726646259971648F, -0.8726646259971648F, 0.0F);
        this.Hair21 = new ModelRenderer(this, 20, 91);
        this.Hair21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair21.addBox(2.6F, -12.2F, -0.5F, 1, 1, 1, expandValue);
        this.setRotateAngle(Hair21, 0.0F, 0.0F, 0.17453292519943295F);
        this.White3 = new ModelRenderer(this, 13, 50);
        this.White3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.White3.addBox(-2.97F, 0.62F, -0.92F, 1, 1, 1, expandValue);
        this.setRotateAngle(White3, 0.8726646259971648F, -0.8726646259971648F, 0.0F);
        this.Hair23 = new ModelRenderer(this, 20, 91);
        this.Hair23.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair23.addBox(-4.7F, -10.0F, -1.1F, 1, 1, 1, expandValue);
        this.setRotateAngle(Hair23, 0.0F, 0.0F, 0.2617993877991494F);
        this.Leg4 = new ModelRenderer(this, 60, 43);
        this.Leg4.mirror = true;
        this.Leg4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg4.addBox(-4.98F, -5.4F, -2.01F, 1, 1, 4, expandValue);
        this.KakashiHeadband9 = new ModelRenderer(this, 0, 65);
        this.KakashiHeadband9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.KakashiHeadband9.addBox(3.2F, -6.85F, -4.0F, 1, 1, 8, expandValue);
        this.HeadNeck4 = new ModelRenderer(this, 21, 55);
        this.HeadNeck4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HeadNeck4.addBox(-4.0F, -0.85F, 0.99F, 8, 1, 3, expandValue);
        this.Armor30 = new ModelRenderer(this, 40, 68);
        this.Armor30.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Armor30.addBox(3.03F, 1.0F, -2.0F, 1, 5, 4, expandValue);
        this.KakashiHeadband4 = new ModelRenderer(this, 0, 71);
        this.KakashiHeadband4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.KakashiHeadband4.addBox(-4.0F, -6.5F, 3.2F, 8, 2, 1, expandValue);
        this.BackStorage = new ModelRenderer(this, 0, 60);
        this.BackStorage.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BackStorage.addBox(0.8F, 1.0F, 1.8F, 2, 4, 1, expandValue);
        this.Hair17 = new ModelRenderer(this, 20, 91);
        this.Hair17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair17.addBox(-3.5F, -11.3F, -1.2F, 1, 1, 1, expandValue);
        this.setRotateAngle(Hair17, 0.0F, 0.0F, 0.2617993877991494F);
        this.KunaiBag = new ModelRenderer(this, 64, 53);
        this.KunaiBag.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.KunaiBag.addBox(-6.6F, 1.0F, -0.5F, 1, 3, 1, expandValue);
        this.Hair18_1 = new ModelRenderer(this, 20, 91);
        this.Hair18_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair18_1.addBox(-3.3F, -10.4F, -1.5F, 1, 2, 2, expandValue);
        this.setRotateAngle(Hair18_1, 0.0F, 0.0F, 0.08726646259971647F);
        this.KunaiBagStrap1 = new ModelRenderer(this, 80, 60);
        this.KunaiBagStrap1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.KunaiBagStrap1.addBox(-6.1F, 1.8F, -2.1F, 1, 1, 4, expandValue);
        this.UpperBody = new ModelRenderer(this, 16, 16);
        this.UpperBody.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.setRotateAngle(UpperBody, 0.0F, 0.0F, 5.813114163347719E-18F);
        this.Armor10 = new ModelRenderer(this, 24, 50);
        this.Armor10.mirror = true;
        this.Armor10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Armor10.addBox(-4.04F, 0.3F, -2.27F, 2, 1, 1, expandValue);
        this.Armor19 = new ModelRenderer(this, 40, 68);
        this.Armor19.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Armor19.addBox(-3.96F, 1.9F, 1.26F, 8, 1, 1, expandValue);
        this.Shoe1_1 = new ModelRenderer(this, 60, 43);
        this.Shoe1_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Shoe1_1.addBox(-4.0F, -1.0F, -3.0F, 4, 1, 1, expandValue);
        this.White2 = new ModelRenderer(this, 13, 50);
        this.White2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.White2.addBox(2.64F, -0.88F, 1.23F, 1, 1, 1, expandValue);
        this.setRotateAngle(White2, -0.8726646259971648F, 0.8726646259971648F, 0.0F);
        this.Mask1 = new ModelRenderer(this, 0, 40);
        this.Mask1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Mask1.addBox(-2.6F, -3.23F, -4.07F, 3, 1, 1, expandValue);
        this.setRotateAngle(Mask1, 0.0F, 0.0F, -0.41887902047863906F);
        this.Hair3 = new ModelRenderer(this, 20, 91);
        this.Hair3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair3.addBox(5.0F, -6.9F, -2.5F, 1, 2, 1, expandValue);
        this.setRotateAngle(Hair3, 0.0F, 0.0F, -0.2617993877991494F);
        this.ArmorRight1 = new ModelRenderer(this, 18, 55);
        this.ArmorRight1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ArmorRight1.addBox(-1.99F, -2.2F, -2.26F, 3, 1, 4, expandValue);
        this.Armor15 = new ModelRenderer(this, 24, 50);
        this.Armor15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Armor15.addBox(2.04F, -0.1F, -2.27F, 2, 1, 1, expandValue);
        this.Armor27 = new ModelRenderer(this, 24, 58);
        this.Armor27.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Armor27.addBox(3.04F, 1.9F, -2.24F, 1, 1, 4, expandValue);
        this.Hair7 = new ModelRenderer(this, 20, 91);
        this.Hair7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair7.addBox(-2.6F, -10.0F, -2.5F, 1, 2, 5, expandValue);
        this.setRotateAngle(Hair7, 0.0F, 0.0F, -0.17453292519943295F);
        this.RedArm3 = new ModelRenderer(this, 0, 52);
        this.RedArm3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RedArm3.addBox(-1.15F, 0.7F, -2.0F, 1, 2, 4, expandValue);
        this.Armor5 = new ModelRenderer(this, 40, 50);
        this.Armor5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Armor5.addBox(-4.49F, 3.2F, -2.2F, 1, 2, 1, expandValue);
        this.setRotateAngle(Armor5, 0.0F, 0.0F, -0.13962634015954636F);
        this.Armor7 = new ModelRenderer(this, 40, 50);
        this.Armor7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Armor7.addBox(-3.0F, 3.8F, -2.2F, 6, 1, 1, expandValue);
        this.UpperLeftArm = new ModelRenderer(this, 40, 16);
        this.UpperLeftArm.mirror = true;
        this.UpperLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.Armor32 = new ModelRenderer(this, 40, 50);
        this.Armor32.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Armor32.addBox(2.99F, 2.8F, -2.2F, 1, 1, 1, expandValue);
        this.ArmorRight2 = new ModelRenderer(this, 25, 56);
        this.ArmorRight2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ArmorRight2.addBox(-1.99F, -2.19F, 1.27F, 3, 1, 1, expandValue);
        this.Hair16 = new ModelRenderer(this, 20, 91);
        this.Hair16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair16.addBox(-0.1F, -12.1F, -1.4F, 1, 1, 1, expandValue);
        this.setRotateAngle(Hair16, 0.0F, 0.0F, 0.17453292519943295F);
        this.Hair14 = new ModelRenderer(this, 20, 91);
        this.Hair14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair14.addBox(5.0F, -6.9F, 2.2F, 1, 2, 1, expandValue);
        this.setRotateAngle(Hair14, 0.0F, 0.0F, -0.2617993877991494F);
        this.HeadNeck2 = new ModelRenderer(this, 24, 55);
        this.HeadNeck2.mirror = true;
        this.HeadNeck2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HeadNeck2.addBox(3.24F, -2.95F, -0.93F, 1, 3, 5, expandValue);
        this.KunaiBagStrap4 = new ModelRenderer(this, 80, 60);
        this.KunaiBagStrap4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.KunaiBagStrap4.addBox(-6.1F, 1.8F, 1.1F, 4, 1, 1, expandValue);
        this.Shoe3_1 = new ModelRenderer(this, 60, 43);
        this.Shoe3_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Shoe3_1.addBox(-1.01F, -1.1F, -2.9F, 1, 2, 1, expandValue);
        this.setRotateAngle(Shoe3_1, -0.5235987755982988F, 0.0F, 0.0F);
        this.Hair8 = new ModelRenderer(this, 20, 91);
        this.Hair8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair8.addBox(-3.6F, -9.9F, -1.9F, 1, 2, 3, expandValue);
        this.setRotateAngle(Hair8, 0.0F, 0.0F, 0.08726646259971647F);
        this.Armor33 = new ModelRenderer(this, 80, 24);
        this.Armor33.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Armor33.addBox(0.67F, 4.7F, -1.47F, 1, 1, 1, expandValue);
        this.setRotateAngle(Armor33, 0.0F, 0.8726646259971648F, 0.0F);
        this.Mask2 = new ModelRenderer(this, 0, 38);
        this.Mask2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Mask2.addBox(-1.0F, -3.15F, -4.1F, 2, 1, 1, expandValue);
        this.Armor21 = new ModelRenderer(this, 40, 50);
        this.Armor21.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Armor21.addBox(-3.99F, 2.8F, 1.2F, 7, 1, 1, expandValue);
        this.UpperRightArm = new ModelRenderer(this, 40, 16);
        this.UpperRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.Hair18 = new ModelRenderer(this, 20, 91);
        this.Hair18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair18.addBox(0.0F, 0.0F, 0.0F, 1, 2, 2, expandValue);
        this.LowerRightArm = new ModelRenderer(this, 40, 28);
        this.LowerRightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
        this.Mask3 = new ModelRenderer(this, 0, 40);
        this.Mask3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Mask3.addBox(-0.4F, -3.23F, -4.07F, 3, 1, 1, expandValue);
        this.setRotateAngle(Mask3, 0.0F, 0.0F, 0.41887902047863906F);
        this.Hair15 = new ModelRenderer(this, 20, 91);
        this.Hair15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair15.addBox(-2.4F, -8.7F, -3.1F, 1, 1, 1, expandValue);
        this.setRotateAngle(Hair15, 0.0F, 0.0F, 0.17453292519943295F);
        this.KakashiHeadband5 = new ModelRenderer(this, 20, 83);
        this.KakashiHeadband5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.KakashiHeadband5.addBox(-2.0F, -6.7F, -4.25F, 4, 2, 1, expandValue);
        this.Leg2_1 = new ModelRenderer(this, 60, 47);
        this.Leg2_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg2_1.addBox(-3.99F, -5.4F, 1.02F, 4, 1, 1, expandValue);
        this.KakashiHeadband7 = new ModelRenderer(this, 0, 65);
        this.KakashiHeadband7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.KakashiHeadband7.addBox(-4.2F, -6.85F, -4.0F, 1, 1, 8, expandValue);
        this.Armor14 = new ModelRenderer(this, 24, 50);
        this.Armor14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Armor14.addBox(2.04F, 0.3F, -2.27F, 2, 1, 1, expandValue);
        this.RedArm4 = new ModelRenderer(this, 0, 52);
        this.RedArm4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RedArm4.addBox(-1.0F, 0.7F, 1.15F, 4, 2, 1, expandValue);
        this.Armor16 = new ModelRenderer(this, 24, 50);
        this.Armor16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Armor16.addBox(1.44F, -0.1F, -2.27F, 1, 1, 1, expandValue);
        this.EyeCut2 = new ModelRenderer(this, 0, 46);
        this.EyeCut2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.EyeCut2.addBox(0.3F, -5.0F, -4.42F, 1, 1, 1, expandValue);
        this.setRotateAngle(EyeCut2, 0.0F, -0.3490658503988659F, 0.0F);
        this.Armor2 = new ModelRenderer(this, 41, 68);
        this.Armor2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Armor2.addBox(-4.06F, 1.9F, -2.25F, 8, 1, 1, expandValue);
        this.RedArm2 = new ModelRenderer(this, 100, 52);
        this.RedArm2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RedArm2.addBox(2.15F, 0.7F, -2.0F, 1, 2, 4, expandValue);
        this.Armor11 = new ModelRenderer(this, 24, 50);
        this.Armor11.mirror = true;
        this.Armor11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Armor11.addBox(-4.04F, -0.1F, -2.27F, 2, 1, 1, expandValue);
        this.Armor18 = new ModelRenderer(this, 40, 50);
        this.Armor18.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Armor18.addBox(-4.0F, 1.0F, 1.2F, 8, 5, 1, expandValue);
        this.HeadNeck3 = new ModelRenderer(this, 22, 55);
        this.HeadNeck3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HeadNeck3.addBox(-4.0F, -2.95F, 3.09F, 8, 3, 1, expandValue);
        this.Armor20 = new ModelRenderer(this, 40, 50);
        this.Armor20.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Armor20.addBox(2.99F, 2.8F, 1.2F, 1, 1, 1, expandValue);
        this.Armor18_1 = new ModelRenderer(this, 40, 50);
        this.Armor18_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Armor18_1.addBox(-4.0F, 0.0F, 1.2F, 8, 2, 1, expandValue);
        this.Armor8 = new ModelRenderer(this, 40, 50);
        this.Armor8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Armor8.addBox(-3.7F, 4.73F, -2.19F, 7, 1, 1, expandValue);
        this.LowerLeftLeg = new ModelRenderer(this, 0, 28);
        this.LowerLeftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
        this.LowerLeftLeg.addBox(-4.0F, -6.0F, -2.0F, 4, 6, 4, expandValue);
        this.Armor17 = new ModelRenderer(this, 24, 50);
        this.Armor17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Armor17.addBox(1.44F, 0.3F, -2.27F, 1, 1, 1, expandValue);
        this.WhiteStrap3 = new ModelRenderer(this, 0, 80);
        this.WhiteStrap3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WhiteStrap3.addBox(-5.98F, 1.4F, -2.02F, 4, 2, 1, expandValue);
        this.WhiteStrap4 = new ModelRenderer(this, 0, 80);
        this.WhiteStrap4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WhiteStrap4.addBox(-6.01F, 1.4F, 1.02F, 4, 2, 1, expandValue);
        this.Armor28 = new ModelRenderer(this, 23, 55);
        this.Armor28.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Armor28.addBox(-4.07F, 1.9F, -1.75F, 1, 1, 4, expandValue);
        this.Leg3 = new ModelRenderer(this, 60, 43);
        this.Leg3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg3.addBox(-8.02F, -5.4F, -1.99F, 1, 1, 4, expandValue);
        this.Armor31 = new ModelRenderer(this, 24, 64);
        this.Armor31.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Armor31.addBox(-4.0F, -0.1F, 1.28F, 8, 3, 1, expandValue);
        this.Shoe1 = new ModelRenderer(this, 60, 43);
        this.Shoe1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Shoe1.addBox(-8.0F, -1.0F, -3.0F, 4, 1, 1, expandValue);
        this.Hair4 = new ModelRenderer(this, 20, 91);
        this.Hair4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair4.addBox(5.3F, -7.2F, -0.8F, 1, 2, 2, expandValue);
        this.setRotateAngle(Hair4, 0.0F, 0.0F, -0.2617993877991494F);
        this.RedArm1 = new ModelRenderer(this, 0, 52);
        this.RedArm1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RedArm1.addBox(-1.0F, 0.7F, -2.15F, 4, 2, 1, expandValue);
        this.White1 = new ModelRenderer(this, 13, 50);
        this.White1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.White1.addBox(1.94F, -0.22F, 0.7F, 1, 1, 1, expandValue);
        this.setRotateAngle(White1, -0.8726646259971648F, 0.8726646259971648F, 0.0F);
        this.KakashiHeadband8 = new ModelRenderer(this, 0, 71);
        this.KakashiHeadband8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.KakashiHeadband8.addBox(-4.0F, -6.85F, 3.2F, 8, 1, 1, expandValue);
        this.Hair13 = new ModelRenderer(this, 20, 91);
        this.Hair13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair13.addBox(-2.5F, -10.9F, -1.9F, 1, 2, 3, expandValue);
        this.setRotateAngle(Hair13, 0.0F, 0.0F, -0.15707963267948966F);
        this.LowerBody = new ModelRenderer(this, 16, 28);
        this.LowerBody.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.BlackLine1 = new ModelRenderer(this, 80, 24);
        this.BlackLine1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.BlackLine1.addBox(0.67F, 0.0F, -1.47F, 1, 5, 1, expandValue);
        this.setRotateAngle(BlackLine1, 0.0F, 0.8726646259971648F, 0.0F);
        this.Leg3_1 = new ModelRenderer(this, 60, 43);
        this.Leg3_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg3_1.addBox(-0.98F, -5.4F, -1.99F, 1, 1, 4, expandValue);
        this.Hair11 = new ModelRenderer(this, 20, 91);
        this.Hair11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair11.addBox(-1.4F, -11.7F, -0.2F, 1, 1, 1, expandValue);
        this.setRotateAngle(Hair11, 0.0F, 0.0F, 0.17453292519943295F);
        this.ArmorLeft1 = new ModelRenderer(this, 25, 55);
        this.ArmorLeft1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ArmorLeft1.addBox(-0.99F, -2.2F, -2.26F, 3, 1, 4, expandValue);
        this.ArmorLeft2 = new ModelRenderer(this, 24, 57);
        this.ArmorLeft2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.ArmorLeft2.addBox(-0.99F, -2.19F, 1.27F, 3, 1, 1, expandValue);
        this.EyeCut1 = new ModelRenderer(this, 0, 46);
        this.EyeCut1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.EyeCut1.addBox(0.3F, -3.0F, -4.42F, 1, 1, 1, expandValue);
        this.setRotateAngle(EyeCut1, 0.0F, -0.3490658503988659F, 0.0F);
        this.KakashiHeadband6 = new ModelRenderer(this, 18, 78);
        this.KakashiHeadband6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.KakashiHeadband6.addBox(-4.0F, -6.85F, -4.2F, 8, 1, 1, expandValue);
        this.UpperRightLeg = new ModelRenderer(this, 0, 16);
        this.UpperRightLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
        this.Hair25 = new ModelRenderer(this, 20, 91);
        this.Hair25.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair25.addBox(-2.4F, -8.7F, 2.1F, 1, 1, 1, expandValue);
        this.setRotateAngle(Hair25, 0.0F, 0.0F, 0.17453292519943295F);
        this.Armor13 = new ModelRenderer(this, 24, 50);
        this.Armor13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Armor13.addBox(-2.44F, -0.1F, -2.27F, 1, 1, 1, expandValue);
        this.HeadNeck1 = new ModelRenderer(this, 24, 55);
        this.HeadNeck1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.HeadNeck1.addBox(-4.24F, -2.95F, -0.93F, 1, 3, 5, expandValue);
        this.Armor29_1 = new ModelRenderer(this, 40, 68);
        this.Armor29_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Armor29_1.addBox(-4.03F, 0.0F, -2.0F, 1, 2, 4, expandValue);
        this.Armor22 = new ModelRenderer(this, 40, 50);
        this.Armor22.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Armor22.addBox(3.49F, 3.2F, 1.21F, 1, 2, 1, expandValue);
        this.setRotateAngle(Armor22, 0.0F, 0.0F, 0.13962634015954636F);
        this.Shoe2_1 = new ModelRenderer(this, 60, 43);
        this.Shoe2_1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Shoe2_1.addBox(-3.99F, -1.1F, -2.9F, 1, 2, 1, expandValue);
        this.setRotateAngle(Shoe2_1, -0.5235987755982988F, 0.0F, 0.0F);
        this.Armor12 = new ModelRenderer(this, 24, 50);
        this.Armor12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Armor12.addBox(-2.44F, 0.3F, -2.27F, 1, 1, 1, expandValue);
        this.KunaiBagStrap2 = new ModelRenderer(this, 80, 60);
        this.KunaiBagStrap2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.KunaiBagStrap2.addBox(-2.9F, 1.8F, -1.9F, 1, 1, 4, expandValue);
        this.WhiteStrap1 = new ModelRenderer(this, 0, 80);
        this.WhiteStrap1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.WhiteStrap1.addBox(-6.02F, 1.4F, -2.01F, 1, 2, 4, expandValue);
        this.KakashiHeadband1 = new ModelRenderer(this, 18, 78);
        this.KakashiHeadband1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.KakashiHeadband1.addBox(-4.0F, -6.5F, -4.2F, 8, 2, 1, expandValue);
        this.Hair2 = new ModelRenderer(this, 20, 91);
        this.Hair2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair2.addBox(0.4F, -9.8F, -2.5F, 6, 3, 5, expandValue);
        this.setRotateAngle(Hair2, 0.0F, 0.0F, -0.2617993877991494F);
        this.LowerLeftArm = new ModelRenderer(this, 40, 28);
        this.LowerLeftArm.mirror = true;
        this.LowerLeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
        this.Armor4 = new ModelRenderer(this, 80, 24);
        this.Armor4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Armor4.addBox(0.67F, 1.01F, -1.47F, 1, 5, 1, expandValue);
        this.setRotateAngle(Armor4, 0.0F, 0.8726646259971648F, 0.0F);
        this.Armor1 = new ModelRenderer(this, 40, 50);
        this.Armor1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Armor1.addBox(-4.0F, 1.0F, -2.2F, 8, 5, 1, expandValue);
        this.Hair9 = new ModelRenderer(this, 20, 91);
        this.Hair9.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair9.addBox(-3.0F, -11.0F, -1.6F, 1, 3, 2, expandValue);
        this.setRotateAngle(Hair9, 0.0F, 0.0F, 0.17453292519943295F);
        this.Hair10 = new ModelRenderer(this, 20, 91);
        this.Hair10.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair10.addBox(-1.1F, -8.3F, 1.7F, 6, 1, 2, expandValue);
        this.setRotateAngle(Hair10, 0.0F, 0.0F, -0.12217304763960307F);
        this.Hair24 = new ModelRenderer(this, 20, 91);
        this.Hair24.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Hair24.addBox(-1.4F, -10.0F, 1.7F, 1, 1, 1, expandValue);
        this.setRotateAngle(Hair24, 0.0F, 0.0F, 0.17453292519943295F);
        this.Leg2 = new ModelRenderer(this, 60, 47);
        this.Leg2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leg2.addBox(-7.98F, -5.4F, 1.02F, 4, 1, 1, expandValue);

        this.LowerLeftLeg.addChild(this.Leg4_1);
        this.LowerBody.addChild(this.ArmorSide1);
        this.UpperRightLeg.addChild(this.KunaiBagStrap3);
        this.Head.addChild(this.Hair19);
        this.UpperBody.addChild(this.Armor29);
        this.LowerBody.addChild(this.Armor23);
        this.Head.addChild(this.Hair1);
        this.Head.addChild(this.Hair22);
        this.LowerBody.addChild(this.Armor6);
        this.Head.addChild(this.Hair12);
        this.LowerBody.addChild(this.Armor3);
        this.Head.addChild(this.Hair6);
        this.Head.addChild(this.Hair5);
        this.UpperRightLeg.addChild(this.WhiteStrap2);
        this.Head.addChild(this.Hair20);
        this.LowerBody.addChild(this.Armor24);
        this.LowerRightLeg.addChild(this.Shoe3);
        this.Head.addChild(this.KakashiHeadband2);
        this.LowerBody.addChild(this.ArmorBottom1);
        this.LowerRightLeg.addChild(this.Shoe2);
        this.Head.addChild(this.KakashiHeadband3);
        this.LowerBody.addChild(this.Armor25);
        this.LowerLeftLeg.addChild(this.Leg1_1);
        this.LowerRightLeg.addChild(this.Leg1);
        this.UpperBody.addChild(this.White4);
        this.Head.addChild(this.Hair21);
        this.UpperBody.addChild(this.White3);
        this.Head.addChild(this.Hair23);
        this.LowerRightLeg.addChild(this.Leg4);
        this.Head.addChild(this.KakashiHeadband9);
        this.UpperBody.addChild(this.HeadNeck4);
        this.UpperBody.addChild(this.Armor30);
        this.Head.addChild(this.KakashiHeadband4);
        this.LowerBody.addChild(this.BackStorage);
        this.Head.addChild(this.Hair17);
        this.UpperRightLeg.addChild(this.KunaiBag);
        this.Head.addChild(this.Hair18_1);
        this.UpperRightLeg.addChild(this.KunaiBagStrap1);
        this.UpperBody.addChild(this.Armor10);
        this.LowerBody.addChild(this.Armor19);
        this.LowerLeftLeg.addChild(this.Shoe1_1);
        this.UpperBody.addChild(this.White2);
        this.Head.addChild(this.Mask1);
        this.Head.addChild(this.Hair3);
        this.UpperRightArm.addChild(this.ArmorRight1);
        this.UpperBody.addChild(this.Armor15);
        this.LowerBody.addChild(this.Armor27);
        this.Head.addChild(this.Hair7);
        this.UpperLeftArm.addChild(this.RedArm3);
        this.LowerBody.addChild(this.Armor5);
        this.LowerBody.addChild(this.Armor7);
        this.LowerBody.addChild(this.Armor32);
        this.UpperRightArm.addChild(this.ArmorRight2);
        this.Head.addChild(this.Hair16);
        this.Head.addChild(this.Hair14);
        this.UpperBody.addChild(this.HeadNeck2);
        this.UpperRightLeg.addChild(this.KunaiBagStrap4);
        this.LowerLeftLeg.addChild(this.Shoe3_1);
        this.Head.addChild(this.Hair8);
        this.LowerBody.addChild(this.Armor33);
        this.Head.addChild(this.Mask2);
        this.LowerBody.addChild(this.Armor21);
        this.Head.addChild(this.Mask3);
        this.Head.addChild(this.Hair15);
        this.Head.addChild(this.KakashiHeadband5);
        this.LowerLeftLeg.addChild(this.Leg2_1);
        this.Head.addChild(this.KakashiHeadband7);
        this.UpperBody.addChild(this.Armor14);
        this.UpperLeftArm.addChild(this.RedArm4);
        this.UpperBody.addChild(this.Armor16);
        this.Head.addChild(this.EyeCut2);
        this.LowerBody.addChild(this.Armor2);
        this.UpperLeftArm.addChild(this.RedArm2);
        this.UpperBody.addChild(this.Armor11);
        this.UpperBody.addChild(this.Armor18);
        this.UpperBody.addChild(this.HeadNeck3);
        this.LowerBody.addChild(this.Armor20);
        this.LowerBody.addChild(this.Armor18_1);
        this.LowerBody.addChild(this.Armor8);
        this.UpperBody.addChild(this.Armor17);
        this.UpperRightLeg.addChild(this.WhiteStrap3);
        this.UpperRightLeg.addChild(this.WhiteStrap4);
        this.LowerBody.addChild(this.Armor28);
        this.LowerRightLeg.addChild(this.Leg3);
        this.UpperBody.addChild(this.Armor31);
        this.LowerRightLeg.addChild(this.Shoe1);
        this.Head.addChild(this.Hair4);
        this.UpperLeftArm.addChild(this.RedArm1);
        this.UpperBody.addChild(this.White1);
        this.Head.addChild(this.KakashiHeadband8);
        this.Head.addChild(this.Hair13);
        this.LowerBody.addChild(this.BlackLine1);
        this.LowerLeftLeg.addChild(this.Leg3_1);
        this.Head.addChild(this.Hair11);
        this.UpperLeftArm.addChild(this.ArmorLeft1);
        this.UpperLeftArm.addChild(this.ArmorLeft2);
        this.Head.addChild(this.EyeCut1);
        this.Head.addChild(this.KakashiHeadband6);
        this.Head.addChild(this.Hair25);
        this.UpperBody.addChild(this.Armor13);
        this.UpperBody.addChild(this.HeadNeck1);
        this.LowerBody.addChild(this.Armor29_1);
        this.LowerBody.addChild(this.Armor22);
        this.LowerLeftLeg.addChild(this.Shoe2_1);
        this.UpperBody.addChild(this.Armor12);
        this.UpperRightLeg.addChild(this.KunaiBagStrap2);
        this.UpperRightLeg.addChild(this.WhiteStrap1);
        this.Head.addChild(this.KakashiHeadband1);
        this.Head.addChild(this.Hair2);
        this.UpperBody.addChild(this.Armor4);
        this.UpperBody.addChild(this.Armor1);
        this.Head.addChild(this.Hair9);
        this.Head.addChild(this.Hair10);
        this.Head.addChild(this.Hair24);
        this.LowerRightLeg.addChild(this.Leg2);

        this.LowerBody.setRotationPoint(0.0F, 0F, 0.0F);
        this.UpperLeftArm.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LowerLeftArm.setRotationPoint(4.0F, -2.0F, 0.0F);
        this.UpperRightArm.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LowerRightArm.setRotationPoint(-4.0F, -2.0F, 0.0F);

        this.UpperLeftLeg.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LowerLeftLeg.setRotationPoint(2.0F, 6.0F, 0.0F);
        this.UpperRightLeg.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.LowerRightLeg.setRotationPoint(6.0F, 6.0F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

        setRotationAngles(f, f1, f2, f3, f4, f5, entity);

        this.LowerBody.setRotationPoint(0.0F, 0F, 0.0F);
        this.UpperLeftArm.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LowerLeftArm.setRotationPoint(4.0F, -2.0F, 0.0F);
        this.UpperRightArm.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LowerRightArm.setRotationPoint(-4.0F, -2.0F, 0.0F);

        this.UpperLeftLeg.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LowerLeftLeg.setRotationPoint(2.0F, 6.0F, 0.0F);
        this.UpperRightLeg.setRotationPoint(4.0F, 0.0F, 0.0F);
        this.LowerRightLeg.setRotationPoint(6.0F, 6.0F, 0.0F);

        this.renderTracked(this.Head, f5, this.bipedHead);
        this.renderTracked(this.UpperLeftArm, f5, this.bipedLeftArmUpper);
        this.renderTracked(this.LowerLeftArm, f5, this.bipedLeftArmUpper, this.bipedLeftArmLower);
        this.renderTracked(this.UpperRightArm, f5, this.bipedRightArmUpper);
        this.renderTracked(this.LowerRightArm, f5, this.bipedRightArmUpper, this.bipedRightArmLower);
        this.renderTracked(this.UpperLeftLeg, f5, this.bipedLeftLegUpper);
        this.renderTracked(this.LowerLeftLeg, f5, this.bipedLeftLegUpper, this.bipedLeftLegLower);
        this.renderTracked(this.UpperRightLeg, f5, this.bipedRightLegUpper);
        this.renderTracked(this.LowerRightLeg, f5, this.bipedRightLegUpper, this.bipedRightLegLower);
        this.renderTracked(this.UpperBody, f5, this.bipedBody);
        this.renderTracked(this.LowerBody, f5, this.bipedLowerBody);

    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
