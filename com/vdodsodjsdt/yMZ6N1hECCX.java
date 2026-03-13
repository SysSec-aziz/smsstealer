package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class yMZ6N1hECCX {
    public static final yMZ6N1hECCX HzCpKshMOoaw76hFcbOVRYMeRd;
    public final float GI83zq0G8e7zkn;
    public final float LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final float M9e7PWhFYLD2lOGMker;
    public final float NSjgqmGjEzuugn2SsG1mZFP;
    public final float V57tEvNfxZVVcOCAOih5PKr;
    public final float VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final float[] ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final float ZfQNn8hdWlEQ5cR94249PDsLR;
    public final float zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final float zzpBGItXfub0yWj;

    static {
        float[] fArr = F44whnLsbQ.V57tEvNfxZVVcOCAOih5PKr;
        float fUbNpdCC1pl7L = (float) ((((double) F44whnLsbQ.ubNpdCC1pl7L()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = F44whnLsbQ.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        float f = fArr[0];
        float[] fArr3 = fArr2[0];
        float f2 = fArr3[0] * f;
        float f3 = fArr[1];
        float f4 = (fArr3[1] * f3) + f2;
        float f5 = fArr[2];
        float f6 = (fArr3[2] * f5) + f4;
        float[] fArr4 = fArr2[1];
        float f7 = (fArr4[2] * f5) + (fArr4[1] * f3) + (fArr4[0] * f);
        float[] fArr5 = fArr2[2];
        float f8 = (f5 * fArr5[2]) + (f3 * fArr5[1]) + (f * fArr5[0]);
        float f9 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fUbNpdCC1pl7L) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = fExp;
        if (d > 1.0d) {
            fExp = 1.0f;
        } else if (d < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f6) * fExp) + 1.0f) - fExp, (((100.0f / f7) * fExp) + 1.0f) - fExp, (((100.0f / f8) * fExp) + 1.0f) - fExp};
        float f10 = 1.0f / ((5.0f * fUbNpdCC1pl7L) + 1.0f);
        float f11 = f10 * f10 * f10 * f10;
        float f12 = 1.0f - f11;
        float fCbrt = (0.1f * f12 * f12 * ((float) Math.cbrt(((double) fUbNpdCC1pl7L) * 5.0d))) + (f11 * fUbNpdCC1pl7L);
        float fUbNpdCC1pl7L2 = F44whnLsbQ.ubNpdCC1pl7L() / fArr[1];
        double d2 = fUbNpdCC1pl7L2;
        float fSqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f6)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f7)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f8)) / 100.0d, 0.42d)};
        float f13 = fArr7[0];
        float f14 = (f13 * 400.0f) / (f13 + 27.13f);
        float f15 = fArr7[1];
        float f16 = (f15 * 400.0f) / (f15 + 27.13f);
        float f17 = fArr7[2];
        float[] fArr8 = {f14, f16, (400.0f * f17) / (f17 + 27.13f)};
        HzCpKshMOoaw76hFcbOVRYMeRd = new yMZ6N1hECCX(fUbNpdCC1pl7L2, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * fPow, fPow, fPow, f9, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public yMZ6N1hECCX(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = f;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = f2;
        this.zzpBGItXfub0yWj = f3;
        this.V57tEvNfxZVVcOCAOih5PKr = f4;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = f5;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = f6;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = fArr;
        this.NSjgqmGjEzuugn2SsG1mZFP = f7;
        this.GI83zq0G8e7zkn = f8;
        this.M9e7PWhFYLD2lOGMker = f9;
    }
}
