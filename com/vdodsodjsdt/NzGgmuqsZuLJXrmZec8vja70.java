package com.vdodsodjsdt;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class NzGgmuqsZuLJXrmZec8vja70 implements Interpolator {
    public final float[] VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final float zzpBGItXfub0yWj;

    public NzGgmuqsZuLJXrmZec8vja70(float[] fArr) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = fArr;
        this.zzpBGItXfub0yWj = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int iMin = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.zzpBGItXfub0yWj;
        float f3 = (f - (iMin * f2)) / f2;
        float f4 = fArr[iMin];
        return ((fArr[iMin + 1] - f4) * f3) + f4;
    }
}
