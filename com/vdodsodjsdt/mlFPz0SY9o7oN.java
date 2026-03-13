package com.vdodsodjsdt;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mlFPz0SY9o7oN {
    public static final LinearInterpolator VxUQ9tBhpHJ2AAEDNW8sghc4m = new LinearInterpolator();
    public static final aAAXOJC11DloKmCeUHYKJBh zzpBGItXfub0yWj = new aAAXOJC11DloKmCeUHYKJBh(aAAXOJC11DloKmCeUHYKJBh.ZfQNn8hdWlEQ5cR94249PDsLR);
    public static final aAAXOJC11DloKmCeUHYKJBh V57tEvNfxZVVcOCAOih5PKr = new aAAXOJC11DloKmCeUHYKJBh();
    public static final aAAXOJC11DloKmCeUHYKJBh ZfQNn8hdWlEQ5cR94249PDsLR = new aAAXOJC11DloKmCeUHYKJBh(aAAXOJC11DloKmCeUHYKJBh.LaeGQIruHQu81hfJldjMOQSVblH3x);

    static {
        new DecelerateInterpolator();
    }

    public static int V57tEvNfxZVVcOCAOih5PKr(int i, int i2, float f) {
        return Math.round(f * (i2 - i)) + i;
    }

    public static float VxUQ9tBhpHJ2AAEDNW8sghc4m(float f, float f2, float f3) {
        return ((f2 - f) * f3) + f;
    }

    public static float zzpBGItXfub0yWj(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : VxUQ9tBhpHJ2AAEDNW8sghc4m(f, f2, (f5 - f3) / (f4 - f3));
    }
}
