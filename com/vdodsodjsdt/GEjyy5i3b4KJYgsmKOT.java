package com.vdodsodjsdt;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class GEjyy5i3b4KJYgsmKOT {
    public final Interpolator V57tEvNfxZVVcOCAOih5PKr;
    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final long ZfQNn8hdWlEQ5cR94249PDsLR;
    public float zzpBGItXfub0yWj;

    public GEjyy5i3b4KJYgsmKOT(int i, Interpolator interpolator, long j) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        this.V57tEvNfxZVVcOCAOih5PKr = interpolator;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = j;
    }

    public int V57tEvNfxZVVcOCAOih5PKr() {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
    }

    public long VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    public void ZfQNn8hdWlEQ5cR94249PDsLR(float f) {
        this.zzpBGItXfub0yWj = f;
    }

    public float zzpBGItXfub0yWj() {
        Interpolator interpolator = this.V57tEvNfxZVVcOCAOih5PKr;
        return interpolator != null ? interpolator.getInterpolation(this.zzpBGItXfub0yWj) : this.zzpBGItXfub0yWj;
    }
}
