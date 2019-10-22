package com.bewitchment.client.model.block;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

/**
 * statueLeonard - cybercat5555
 * Created using Tabula 7.0.1
 */
public class ModelLeonardStatue extends ModelBase {
	public ModelRenderer plith01;
	public ModelRenderer bipedBody;
	public ModelRenderer wandShaft;
	public ModelRenderer plith02;
	public ModelRenderer chestFur01;
	public ModelRenderer chestFur02;
	public ModelRenderer beltBuckle01;
	public ModelRenderer beltBuckle02;
	public ModelRenderer beltBuckle03;
	public ModelRenderer bipedHead;
	public ModelRenderer bipedLeftArm;
	public ModelRenderer bipedRightArm;
	public ModelRenderer bipedLeftLeg;
	public ModelRenderer bipedRightLeg;
	public ModelRenderer muzzleUpper;
	public ModelRenderer muzzleLower;
	public ModelRenderer snout;
	public ModelRenderer lEar;
	public ModelRenderer rEar;
	public ModelRenderer lHorn01;
	public ModelRenderer rHorn01;
	public ModelRenderer mHorn01;
	public ModelRenderer muzzleUpper02;
	public ModelRenderer beard;
	public ModelRenderer lHorn02;
	public ModelRenderer lHorn03a;
	public ModelRenderer lHorn03b;
	public ModelRenderer lHorn03c;
	public ModelRenderer lHorn03d;
	public ModelRenderer lHorn04;
	public ModelRenderer rHorn02;
	public ModelRenderer rHorn03a;
	public ModelRenderer rHorn03b;
	public ModelRenderer rHorn03c;
	public ModelRenderer rHorn03d;
	public ModelRenderer rHorn04;
	public ModelRenderer mHorn02;
	public ModelRenderer mHorn03a;
	public ModelRenderer mHorn03b;
	public ModelRenderer mHorn03c;
	public ModelRenderer mHorn03d;
	public ModelRenderer mHorn04;
	public ModelRenderer bipedLeftArm2;
	public ModelRenderer bipedRightArm2;
	public ModelRenderer lLeg02;
	public ModelRenderer lFoot;
	public ModelRenderer lToes;
	public ModelRenderer rLeg02;
	public ModelRenderer rFoot;
	public ModelRenderer rToes;
	public ModelRenderer spikesBase;
	public ModelRenderer bottomSpikeBase;
	public ModelRenderer spikesPlate;
	public ModelRenderer bottomSpikeTip;
	public ModelRenderer rightSpike;
	public ModelRenderer middleSpike;
	public ModelRenderer leftSpike;
	public ModelRenderer spikesPlateLeftMain;
	public ModelRenderer spikesPlateRightMain;
	public ModelRenderer spikesPlateLeftLower;
	public ModelRenderer spikesPlateRightLower;
	
	public ModelLeonardStatue() {
		this.textureWidth = 128;
		this.textureHeight = 64;
		this.bottomSpikeTip = new ModelRenderer(this, 71, 45);
		this.bottomSpikeTip.setRotationPoint(0.0F, 3.0F, 0.0F);
		this.bottomSpikeTip.addBox(-0.5F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
		this.leftSpike = new ModelRenderer(this, 80, 46);
		this.leftSpike.setRotationPoint(1.3F, -1.0F, 0.0F);
		this.leftSpike.addBox(-0.5F, -4.0F, -0.5F, 1, 4, 1, 0.0F);
		this.beltBuckle03 = new ModelRenderer(this, 58, 58);
		this.beltBuckle03.setRotationPoint(0.5F, 10.5F, -1.3F);
		this.beltBuckle03.addBox(-0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F);
		this.bipedRightLeg = new ModelRenderer(this, 0, 14);
		this.bipedRightLeg.mirror = true;
		this.bipedRightLeg.setRotationPoint(-1.9F, 11.9F, 0.1F);
		this.bipedRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 10, 4, 0.0F);
		this.setRotateAngle(bipedRightLeg, -0.10471975511965977F, 0.2792526803190927F, 0.22689280275926282F);
		this.rHorn03b = new ModelRenderer(this, 25, 6);
		this.rHorn03b.mirror = true;
		this.rHorn03b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn03b.addBox(-0.2F, -2.8F, -0.8F, 1, 3, 1, 0.0F);
		this.rHorn03a = new ModelRenderer(this, 25, 6);
		this.rHorn03a.mirror = true;
		this.rHorn03a.setRotationPoint(0.0F, -1.9F, 0.0F);
		this.rHorn03a.addBox(-0.8F, -2.8F, -0.8F, 1, 3, 1, 0.0F);
		this.setRotateAngle(rHorn03a, -0.3141592653589793F, 0.0F, 0.0F);
		this.spikesPlate = new ModelRenderer(this, 78, 52);
		this.spikesPlate.setRotationPoint(0.0F, -1.2F, 0.0F);
		this.spikesPlate.addBox(-2.0F, -1.0F, -1.0F, 4, 1, 2, 0.0F);
		this.rHorn02 = new ModelRenderer(this, 25, 0);
		this.rHorn02.mirror = true;
		this.rHorn02.setRotationPoint(0.0F, -2.7F, 0.0F);
		this.rHorn02.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(rHorn02, -0.13962634015954636F, 0.0F, -0.20943951023931953F);
		this.mHorn02 = new ModelRenderer(this, 40, 11);
		this.mHorn02.setRotationPoint(0.0F, -2.7F, 0.0F);
		this.mHorn02.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
		this.setRotateAngle(mHorn02, -0.13962634015954636F, 0.0F, 0.0F);
		this.beltBuckle02 = new ModelRenderer(this, 51, 60);
		this.beltBuckle02.setRotationPoint(0.0F, 11.5F, -1.3F);
		this.beltBuckle02.addBox(-1.0F, -0.5F, -1.0F, 2, 1, 1, 0.0F);
		this.rHorn03c = new ModelRenderer(this, 25, 6);
		this.rHorn03c.mirror = true;
		this.rHorn03c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn03c.addBox(-0.8F, -2.8F, -0.2F, 1, 3, 1, 0.0F);
		this.lHorn03d = new ModelRenderer(this, 25, 6);
		this.lHorn03d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn03d.addBox(-0.2F, -2.8F, -0.2F, 1, 3, 1, 0.0F);
		this.beard = new ModelRenderer(this, 53, 0);
		this.beard.setRotationPoint(0.0F, 0.3F, -2.0F);
		this.beard.addBox(-1.5F, 0.0F, -1.0F, 3, 3, 2, 0.0F);
		this.setRotateAngle(beard, -0.10471975511965977F, 0.0F, 0.0F);
		this.lHorn02 = new ModelRenderer(this, 25, 0);
		this.lHorn02.setRotationPoint(0.0F, -2.7F, 0.0F);
		this.lHorn02.addBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
		this.setRotateAngle(lHorn02, -0.13962634015954636F, 0.0F, 0.20943951023931953F);
		this.lLeg02 = new ModelRenderer(this, 0, 29);
		this.lLeg02.setRotationPoint(0.0F, 9.5F, 0.0F);
		this.lLeg02.addBox(-1.5F, -0.1F, -1.5F, 3, 7, 3, 0.0F);
		this.setRotateAngle(lLeg02, 0.3141592653589793F, 0.0F, 0.06981317007977318F);
		this.bipedLeftArm2 = new ModelRenderer(this, 60, 23);
		this.bipedLeftArm2.setRotationPoint(0.6F, 4.4F, 0.0F);
		this.bipedLeftArm2.addBox(-1.0F, 0.0F, -2.01F, 3, 8, 4, 0.0F);
		this.setRotateAngle(bipedLeftArm2, 0.0F, 0.0F, 0.9599310885968813F);
		this.mHorn03b = new ModelRenderer(this, 25, 6);
		this.mHorn03b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.mHorn03b.addBox(-0.2F, -2.8F, -0.8F, 1, 3, 1, 0.0F);
		this.bipedRightArm = new ModelRenderer(this, 44, 16);
		this.bipedRightArm.mirror = true;
		this.bipedRightArm.setRotationPoint(-5.0F, 1.9F, 0.0F);
		this.bipedRightArm.addBox(-2.0F, -2.0F, -2.0F, 3, 8, 4, 0.0F);
		this.setRotateAngle(bipedRightArm, 0.0F, 0.0F, 0.5235987755982988F);
		this.mHorn03c = new ModelRenderer(this, 25, 6);
		this.mHorn03c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.mHorn03c.addBox(-0.8F, -2.8F, -0.2F, 1, 3, 1, 0.0F);
		this.plith02 = new ModelRenderer(this, 68, 25);
		this.plith02.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.plith02.addBox(-7.5F, -2.7F, -7.5F, 15, 3, 15, 0.0F);
		this.spikesPlateLeftLower = new ModelRenderer(this, 83, 52);
		this.spikesPlateLeftLower.setRotationPoint(1.7F, -0.5F, 0.0F);
		this.spikesPlateLeftLower.addBox(0.0F, -0.2F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(spikesPlateLeftLower, 0.0F, 0.0F, -0.7853981633974483F);
		this.rHorn04 = new ModelRenderer(this, 31, 6);
		this.rHorn04.mirror = true;
		this.rHorn04.setRotationPoint(0.0F, -2.7F, 0.0F);
		this.rHorn04.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(rHorn04, 0.2617993877991494F, 0.0F, 0.0F);
		this.lHorn04 = new ModelRenderer(this, 31, 6);
		this.lHorn04.setRotationPoint(0.0F, -2.7F, 0.0F);
		this.lHorn04.addBox(-0.5F, -3.0F, -0.5F, 1, 3, 1, 0.0F);
		this.setRotateAngle(lHorn04, 0.2617993877991494F, 0.0F, 0.0F);
		this.chestFur02 = new ModelRenderer(this, 43, 47);
		this.chestFur02.setRotationPoint(0.0F, 0.7F, -1.1F);
		this.chestFur02.addBox(-2.5F, 0.0F, -1.0F, 5, 5, 2, 0.0F);
		this.setRotateAngle(chestFur02, -0.3490658503988659F, 0.0F, 0.0F);
		this.spikesPlateLeftMain = new ModelRenderer(this, 81, 52);
		this.spikesPlateLeftMain.setRotationPoint(1.8F, 0.0F, 0.0F);
		this.spikesPlateLeftMain.addBox(0.0F, -1.0F, -1.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(spikesPlateLeftMain, 0.0F, 0.0F, -0.39269908169872414F);
		this.lEar = new ModelRenderer(this, 40, 0);
		this.lEar.setRotationPoint(2.6F, -4.3F, 0.0F);
		this.lEar.addBox(0.0F, -0.5F, -1.0F, 4, 1, 2, 0.0F);
		this.setRotateAngle(lEar, -0.5235987755982988F, 0.0F, 0.3141592653589793F);
		this.lHorn03c = new ModelRenderer(this, 25, 6);
		this.lHorn03c.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn03c.addBox(-0.8F, -2.8F, -0.2F, 1, 3, 1, 0.0F);
		this.mHorn04 = new ModelRenderer(this, 50, 7);
		this.mHorn04.setRotationPoint(0.0F, -2.7F, 0.0F);
		this.mHorn04.addBox(-0.5F, -3.7F, -0.5F, 1, 4, 1, 0.0F);
		this.setRotateAngle(mHorn04, 0.2617993877991494F, 0.0F, 0.0F);
		this.bipedRightArm2 = new ModelRenderer(this, 60, 23);
		this.bipedRightArm2.mirror = true;
		this.bipedRightArm2.setRotationPoint(-0.4F, 4.6F, 0.0F);
		this.bipedRightArm2.addBox(-1.0F, 0.0F, -2.01F, 3, 8, 4, 0.0F);
		this.setRotateAngle(bipedRightArm2, 0.0F, 0.0F, 0.7330382858376184F);
		this.beltBuckle01 = new ModelRenderer(this, 51, 56);
		this.beltBuckle01.setRotationPoint(0.0F, 9.5F, -1.3F);
		this.beltBuckle01.addBox(-1.0F, -0.5F, -1.0F, 2, 1, 1, 0.0F);
		this.mHorn03a = new ModelRenderer(this, 25, 6);
		this.mHorn03a.setRotationPoint(0.0F, -2.8F, 0.0F);
		this.mHorn03a.addBox(-0.8F, -2.8F, -0.8F, 1, 3, 1, 0.0F);
		this.setRotateAngle(mHorn03a, -0.3141592653589793F, 0.0F, 0.0F);
		this.wandShaft = new ModelRenderer(this, 68, 44);
		this.wandShaft.setRotationPoint(-14.0F, -8.8F, 2.0F);
		this.wandShaft.addBox(-1.5F, 0.0F, -1.0F, 3, 17, 2, 0.0F);
		this.setRotateAngle(wandShaft, 0.0F, 0.0F, -0.3490658503988659F);
		this.rToes = new ModelRenderer(this, 0, 58);
		this.rToes.mirror = true;
		this.rToes.setRotationPoint(0.0F, 0.1F, -2.0F);
		this.rToes.addBox(-1.5F, -0.5F, -2.9F, 3, 1, 3, 0.0F);
		this.setRotateAngle(rToes, 0.13962634015954636F, 0.0F, 0.0F);
		this.muzzleUpper = new ModelRenderer(this, 24, 45);
		this.muzzleUpper.setRotationPoint(0.0F, -1.4F, -3.8F);
		this.muzzleUpper.addBox(-1.6F, -1.8F, -3.5F, 4, 2, 4, 0.0F);
		this.setRotateAngle(muzzleUpper, 0.06981317007977318F, 0.0F, 0.0F);
		this.bipedLeftLeg = new ModelRenderer(this, 0, 14);
		this.bipedLeftLeg.setRotationPoint(1.9F, 11.9F, 0.1F);
		this.bipedLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 10, 4, 0.0F);
		this.setRotateAngle(bipedLeftLeg, -0.3490658503988659F, 0.0F, -0.06981317007977318F);
		this.spikesPlateRightMain = new ModelRenderer(this, 81, 52);
		this.spikesPlateRightMain.setRotationPoint(-1.8F, 0.0F, 0.0F);
		this.spikesPlateRightMain.addBox(-1.0F, -1.0F, -1.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(spikesPlateRightMain, 0.0F, 0.0F, 0.39269908169872414F);
		this.spikesPlateRightLower = new ModelRenderer(this, 83, 52);
		this.spikesPlateRightLower.setRotationPoint(-1.6F, -0.5F, 0.0F);
		this.spikesPlateRightLower.addBox(-1.0F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
		this.setRotateAngle(spikesPlateRightLower, 0.0F, 0.0F, 0.7853981633974483F);
		this.lHorn03b = new ModelRenderer(this, 25, 6);
		this.lHorn03b.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.lHorn03b.addBox(-0.2F, -2.8F, -0.8F, 1, 3, 1, 0.0F);
		this.bipedLeftArm = new ModelRenderer(this, 44, 16);
		this.bipedLeftArm.setRotationPoint(5.0F, 1.9F, -0.0F);
		this.bipedLeftArm.addBox(-1.0F, -2.0F, -2.0F, 3, 8, 4, 0.0F);
		this.setRotateAngle(bipedLeftArm, 0.0F, 0.0F, -0.40980330836826856F);
		this.snout = new ModelRenderer(this, 24, 36);
		this.snout.setRotationPoint(0.0F, -4.1F, -3.3F);
		this.snout.addBox(-2.0F, -1.0F, -4.4F, 4, 2, 5, 0.0F);
		this.setRotateAngle(snout, 0.41887902047863906F, 0.0F, 0.0F);
		this.rHorn03d = new ModelRenderer(this, 25, 6);
		this.rHorn03d.mirror = true;
		this.rHorn03d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.rHorn03d.addBox(-0.2F, -2.8F, -0.2F, 1, 3, 1, 0.0F);
		this.spikesBase = new ModelRenderer(this, 70, 45);
		this.spikesBase.setRotationPoint(0.0F, 0.4F, 0.0F);
		this.spikesBase.addBox(-1.0F, -2.0F, -0.5F, 2, 2, 1, 0.0F);
		this.mHorn01 = new ModelRenderer(this, 41, 5);
		this.mHorn01.setRotationPoint(0.0F, -5.2F, -0.2F);
		this.mHorn01.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
		this.setRotateAngle(mHorn01, -0.9599310885968813F, 0.0F, 0.0F);
		this.bipedBody = new ModelRenderer(this, 17, 16);
		this.bipedBody.setRotationPoint(1.2F, -12.2F, 2.0F);
		this.bipedBody.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
		this.lHorn01 = new ModelRenderer(this, 25, 0);
		this.lHorn01.setRotationPoint(1.8F, -5.0F, -1.5F);
		this.lHorn01.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
		this.setRotateAngle(lHorn01, -0.5235987755982988F, 0.0F, 0.5235987755982988F);
		this.lToes = new ModelRenderer(this, 0, 58);
		this.lToes.setRotationPoint(0.0F, 0.1F, -2.0F);
		this.lToes.addBox(-1.5F, -0.5F, -2.9F, 3, 1, 3, 0.0F);
		this.setRotateAngle(lToes, 0.2617993877991494F, 0.0F, 0.0F);
		this.rEar = new ModelRenderer(this, 40, 0);
		this.rEar.mirror = true;
		this.rEar.setRotationPoint(-2.6F, -4.3F, 0.0F);
		this.rEar.addBox(-4.0F, -0.5F, -1.0F, 4, 1, 2, 0.0F);
		this.setRotateAngle(rEar, -0.5235987755982988F, 0.0F, -0.3141592653589793F);
		this.muzzleLower = new ModelRenderer(this, 23, 54);
		this.muzzleLower.setRotationPoint(0.0F, -0.8F, -3.6F);
		this.muzzleLower.addBox(-2.0F, -0.5F, -3.5F, 4, 1, 4, 0.0F);
		this.setRotateAngle(muzzleLower, 0.06981317007977318F, 0.0F, 0.0F);
		this.muzzleUpper02 = new ModelRenderer(this, 12, 45);
		this.muzzleUpper02.setRotationPoint(0.0F, -1.4F, -3.8F);
		this.muzzleUpper02.addBox(-2.3F, -1.8F, -3.5F, 1, 2, 4, 0.0F);
		this.setRotateAngle(muzzleUpper02, 0.06981317007977318F, 0.0F, 0.0F);
		this.lFoot = new ModelRenderer(this, 0, 40);
		this.lFoot.setRotationPoint(0.0F, 7.0F, 0.5F);
		this.lFoot.addBox(-1.5F, -0.5F, -2.4F, 3, 1, 3, 0.0F);
		this.setRotateAngle(lFoot, 0.0F, -0.05235987755982988F, 0.0F);
		this.mHorn03d = new ModelRenderer(this, 25, 6);
		this.mHorn03d.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.mHorn03d.addBox(-0.2F, -2.8F, -0.2F, 1, 3, 1, 0.0F);
		this.plith01 = new ModelRenderer(this, 60, 0);
		this.plith01.setRotationPoint(0.0F, 19.0F, 0.0F);
		this.plith01.addBox(-8.5F, 0.0F, -8.5F, 17, 5, 17, 0.0F);
		this.rLeg02 = new ModelRenderer(this, 0, 29);
		this.rLeg02.mirror = true;
		this.rLeg02.setRotationPoint(0.0F, 9.4F, 0.0F);
		this.rLeg02.addBox(-1.5F, -0.1F, -1.5F, 3, 7, 3, 0.0F);
		this.setRotateAngle(rLeg02, 0.17453292519943295F, 0.3665191429188092F, -0.19198621771937624F);
		this.bottomSpikeBase = new ModelRenderer(this, 70, 45);
		this.bottomSpikeBase.setRotationPoint(0.0F, 17.0F, 0.0F);
		this.bottomSpikeBase.addBox(-1.0F, 0.0F, -0.5F, 2, 3, 1, 0.0F);
		this.rHorn01 = new ModelRenderer(this, 25, 0);
		this.rHorn01.mirror = true;
		this.rHorn01.setRotationPoint(-1.8F, -5.0F, -1.5F);
		this.rHorn01.addBox(-1.0F, -3.0F, -1.0F, 2, 3, 2, 0.0F);
		this.setRotateAngle(rHorn01, -0.5235987755982988F, 0.0F, -0.5235987755982988F);
		this.chestFur01 = new ModelRenderer(this, 43, 38);
		this.chestFur01.setRotationPoint(0.0F, 1.4F, -1.1F);
		this.chestFur01.addBox(-3.0F, 0.0F, -1.0F, 6, 6, 2, 0.0F);
		this.setRotateAngle(chestFur01, -0.19198621771937624F, 0.0F, 0.0F);
		this.bipedHead = new ModelRenderer(this, 0, 0);
		this.bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.bipedHead.addBox(-3.0F, -6.0F, -3.4F, 6, 6, 6, 0.0F);
		this.setRotateAngle(bipedHead, 0.0F, 0.6981317007977318F, 0.0F);
		this.rFoot = new ModelRenderer(this, 0, 40);
		this.rFoot.mirror = true;
		this.rFoot.setRotationPoint(0.0F, 7.3F, 0.5F);
		this.rFoot.addBox(-1.5F, -0.5F, -2.4F, 3, 1, 3, 0.0F);
		this.setRotateAngle(rFoot, 0.0F, 0.05235987755982988F, 0.0F);
		this.lHorn03a = new ModelRenderer(this, 25, 6);
		this.lHorn03a.setRotationPoint(0.0F, -1.9F, 0.0F);
		this.lHorn03a.addBox(-0.8F, -2.8F, -0.8F, 1, 3, 1, 0.0F);
		this.setRotateAngle(lHorn03a, -0.3141592653589793F, 0.0F, 0.0F);
		this.rightSpike = new ModelRenderer(this, 80, 46);
		this.rightSpike.setRotationPoint(-1.3F, -1.0F, 0.0F);
		this.rightSpike.addBox(-0.5F, -4.0F, -0.5F, 1, 4, 1, 0.0F);
		this.middleSpike = new ModelRenderer(this, 80, 45);
		this.middleSpike.setRotationPoint(0.0F, -1.0F, 0.0F);
		this.middleSpike.addBox(-0.5F, -5.0F, -0.5F, 1, 5, 1, 0.0F);
		this.bottomSpikeBase.addChild(this.bottomSpikeTip);
		this.spikesPlate.addChild(this.leftSpike);
		this.bipedBody.addChild(this.beltBuckle03);
		this.bipedBody.addChild(this.bipedRightLeg);
		this.rHorn03a.addChild(this.rHorn03b);
		this.rHorn02.addChild(this.rHorn03a);
		this.wandShaft.addChild(this.spikesPlate);
		this.rHorn01.addChild(this.rHorn02);
		this.mHorn01.addChild(this.mHorn02);
		this.bipedBody.addChild(this.beltBuckle02);
		this.rHorn03a.addChild(this.rHorn03c);
		this.lHorn03a.addChild(this.lHorn03d);
		this.muzzleLower.addChild(this.beard);
		this.lHorn01.addChild(this.lHorn02);
		this.bipedLeftLeg.addChild(this.lLeg02);
		this.bipedLeftArm.addChild(this.bipedLeftArm2);
		this.mHorn03a.addChild(this.mHorn03b);
		this.bipedBody.addChild(this.bipedRightArm);
		this.mHorn03a.addChild(this.mHorn03c);
		this.plith01.addChild(this.plith02);
		this.spikesPlate.addChild(this.spikesPlateLeftLower);
		this.rHorn03a.addChild(this.rHorn04);
		this.lHorn03a.addChild(this.lHorn04);
		this.bipedBody.addChild(this.chestFur02);
		this.spikesPlate.addChild(this.spikesPlateLeftMain);
		this.bipedHead.addChild(this.lEar);
		this.lHorn03a.addChild(this.lHorn03c);
		this.mHorn03a.addChild(this.mHorn04);
		this.bipedRightArm.addChild(this.bipedRightArm2);
		this.bipedBody.addChild(this.beltBuckle01);
		this.mHorn02.addChild(this.mHorn03a);
		this.rFoot.addChild(this.rToes);
		this.bipedHead.addChild(this.muzzleUpper);
		this.bipedBody.addChild(this.bipedLeftLeg);
		this.spikesPlate.addChild(this.spikesPlateRightMain);
		this.spikesPlate.addChild(this.spikesPlateRightLower);
		this.lHorn03a.addChild(this.lHorn03b);
		this.bipedBody.addChild(this.bipedLeftArm);
		this.bipedHead.addChild(this.snout);
		this.rHorn03a.addChild(this.rHorn03d);
		this.wandShaft.addChild(this.spikesBase);
		this.bipedHead.addChild(this.mHorn01);
		this.bipedHead.addChild(this.lHorn01);
		this.lFoot.addChild(this.lToes);
		this.bipedHead.addChild(this.rEar);
		this.bipedHead.addChild(this.muzzleLower);
		this.bipedHead.addChild(this.muzzleUpper02);
		this.lLeg02.addChild(this.lFoot);
		this.mHorn03a.addChild(this.mHorn03d);
		this.bipedRightLeg.addChild(this.rLeg02);
		this.wandShaft.addChild(this.bottomSpikeBase);
		this.bipedHead.addChild(this.rHorn01);
		this.bipedBody.addChild(this.chestFur01);
		this.bipedBody.addChild(this.bipedHead);
		this.rLeg02.addChild(this.rFoot);
		this.lHorn02.addChild(this.lHorn03a);
		this.spikesPlate.addChild(this.rightSpike);
		this.spikesPlate.addChild(this.middleSpike);
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GlStateManager.pushMatrix();
		GlStateManager.translate(this.wandShaft.offsetX, this.wandShaft.offsetY, this.wandShaft.offsetZ);
		GlStateManager.translate(this.wandShaft.rotationPointX * f5, this.wandShaft.rotationPointY * f5, this.wandShaft.rotationPointZ * f5);
		GlStateManager.scale(0.6D, 0.6D, 0.6D);
		GlStateManager.translate(-this.wandShaft.offsetX, -this.wandShaft.offsetY, -this.wandShaft.offsetZ);
		GlStateManager.translate(-this.wandShaft.rotationPointX * f5, -this.wandShaft.rotationPointY * f5, -this.wandShaft.rotationPointZ * f5);
		this.wandShaft.render(f5);
		GlStateManager.popMatrix();
		this.bipedBody.render(f5);
		this.plith01.render(f5);
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
