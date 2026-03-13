package com.vdodsodjsdt;

import android.graphics.Color;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class xvpc0DamR2d1fvcwxYAGgPQfJGJN {
    public final float LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final float V57tEvNfxZVVcOCAOih5PKr;
    public final float VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final float ZfQNn8hdWlEQ5cR94249PDsLR;
    public final float zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final float zzpBGItXfub0yWj;

    public xvpc0DamR2d1fvcwxYAGgPQfJGJN(float f, float f2, float f3, float f4, float f5, float f6) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = f;
        this.zzpBGItXfub0yWj = f2;
        this.V57tEvNfxZVVcOCAOih5PKr = f3;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = f4;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = f5;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = f6;
    }

    public static xvpc0DamR2d1fvcwxYAGgPQfJGJN VxUQ9tBhpHJ2AAEDNW8sghc4m(int i) {
        yMZ6N1hECCX ymz6n1heccx = yMZ6N1hECCX.HzCpKshMOoaw76hFcbOVRYMeRd;
        float fD9zDyyznnp3oaDT1Ug = F44whnLsbQ.d9zDyyznnp3oaDT1Ug(Color.red(i));
        float fD9zDyyznnp3oaDT1Ug2 = F44whnLsbQ.d9zDyyznnp3oaDT1Ug(Color.green(i));
        float fD9zDyyznnp3oaDT1Ug3 = F44whnLsbQ.d9zDyyznnp3oaDT1Ug(Color.blue(i));
        float[][] fArr = F44whnLsbQ.ZfQNn8hdWlEQ5cR94249PDsLR;
        float[] fArr2 = fArr[0];
        float f = (fArr2[2] * fD9zDyyznnp3oaDT1Ug3) + (fArr2[1] * fD9zDyyznnp3oaDT1Ug2) + (fArr2[0] * fD9zDyyznnp3oaDT1Ug);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[2] * fD9zDyyznnp3oaDT1Ug3) + (fArr3[1] * fD9zDyyznnp3oaDT1Ug2) + (fArr3[0] * fD9zDyyznnp3oaDT1Ug);
        float[] fArr4 = fArr[2];
        float f3 = (fD9zDyyznnp3oaDT1Ug3 * fArr4[2]) + (fD9zDyyznnp3oaDT1Ug2 * fArr4[1]) + (fD9zDyyznnp3oaDT1Ug * fArr4[0]);
        float[][] fArr5 = F44whnLsbQ.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        float[] fArr6 = fArr5[0];
        float f4 = (fArr6[2] * f3) + (fArr6[1] * f2) + (fArr6[0] * f);
        float[] fArr7 = fArr5[1];
        float f5 = (fArr7[2] * f3) + (fArr7[1] * f2) + (fArr7[0] * f);
        float[] fArr8 = fArr5[2];
        float f6 = (f3 * fArr8[2]) + (f2 * fArr8[1]) + (f * fArr8[0]);
        float[] fArr9 = ymz6n1heccx.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        float f7 = ymz6n1heccx.GI83zq0G8e7zkn;
        float f8 = ymz6n1heccx.ZfQNn8hdWlEQ5cR94249PDsLR;
        float f9 = ymz6n1heccx.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        float f10 = fArr9[0] * f4;
        float f11 = fArr9[1] * f5;
        float f12 = fArr9[2] * f6;
        float f13 = ymz6n1heccx.NSjgqmGjEzuugn2SsG1mZFP;
        float fPow = (float) Math.pow(((double) (Math.abs(f10) * f13)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f11) * f13)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f12) * f13)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f10) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f11) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f12) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float f14 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d)) / 11.0f;
        float f15 = ((float) (((double) (fSignum + fSignum2)) - (d * 2.0d))) / 9.0f;
        float f16 = fSignum2 * 20.0f;
        float f17 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f16)) / 20.0f;
        float f18 = (((fSignum * 40.0f) + f16) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f15, f14)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f19 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f18 * ymz6n1heccx.zzpBGItXfub0yWj) / f9, ymz6n1heccx.M9e7PWhFYLD2lOGMker * f8)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f20 = f9 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, ymz6n1heccx.zIvmSL0wzmmKGc3X39b2Gw2mUGE), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * ymz6n1heccx.LaeGQIruHQu81hfJldjMOQSVblH3x) * ymz6n1heccx.V57tEvNfxZVVcOCAOih5PKr) * ((float) Math.sqrt((f15 * f15) + (f14 * f14)))) / (f17 + 0.305f), 0.9d)) * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        Math.sqrt((r0 * f8) / f20);
        float f21 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f7 * fPow5 * 0.0228f) + 1.0f)) * 43.85965f;
        double d2 = f19;
        return new xvpc0DamR2d1fvcwxYAGgPQfJGJN(fAtan2, fPow5, fPow4, f21, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    public static xvpc0DamR2d1fvcwxYAGgPQfJGJN zzpBGItXfub0yWj(float f, float f2, float f3) {
        yMZ6N1hECCX ymz6n1heccx = yMZ6N1hECCX.HzCpKshMOoaw76hFcbOVRYMeRd;
        float f4 = ymz6n1heccx.ZfQNn8hdWlEQ5cR94249PDsLR;
        Math.sqrt(((double) f) / 100.0d);
        float f5 = ymz6n1heccx.VxUQ9tBhpHJ2AAEDNW8sghc4m + 4.0f;
        float f6 = ymz6n1heccx.GI83zq0G8e7zkn * f2;
        Math.sqrt(((f2 / ((float) Math.sqrt(r1))) * ymz6n1heccx.ZfQNn8hdWlEQ5cR94249PDsLR) / f5);
        float f7 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((((double) f6) * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f3) / 180.0f;
        return new xvpc0DamR2d1fvcwxYAGgPQfJGJN(f3, f2, f, f7, fLog * ((float) Math.cos(d)), fLog * ((float) Math.sin(d)));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int V57tEvNfxZVVcOCAOih5PKr(com.vdodsodjsdt.yMZ6N1hECCX r20) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.xvpc0DamR2d1fvcwxYAGgPQfJGJN.V57tEvNfxZVVcOCAOih5PKr(com.vdodsodjsdt.yMZ6N1hECCX):int");
    }
}
