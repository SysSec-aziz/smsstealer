package com.vdodsodjsdt;

import android.graphics.Insets;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class MCkc9XaOBWJ3kr1ZFUGL46e9N {
    public static final MCkc9XaOBWJ3kr1ZFUGL46e9N LaeGQIruHQu81hfJldjMOQSVblH3x = new MCkc9XaOBWJ3kr1ZFUGL46e9N(0, 0, 0, 0);
    public final int V57tEvNfxZVVcOCAOih5PKr;
    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final int ZfQNn8hdWlEQ5cR94249PDsLR;
    public final int zzpBGItXfub0yWj;

    public MCkc9XaOBWJ3kr1ZFUGL46e9N(int i, int i2, int i3, int i4) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        this.zzpBGItXfub0yWj = i2;
        this.V57tEvNfxZVVcOCAOih5PKr = i3;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i4;
    }

    public static MCkc9XaOBWJ3kr1ZFUGL46e9N V57tEvNfxZVVcOCAOih5PKr(Insets insets) {
        return zzpBGItXfub0yWj(insets.left, insets.top, insets.right, insets.bottom);
    }

    public static MCkc9XaOBWJ3kr1ZFUGL46e9N VxUQ9tBhpHJ2AAEDNW8sghc4m(MCkc9XaOBWJ3kr1ZFUGL46e9N mCkc9XaOBWJ3kr1ZFUGL46e9N, MCkc9XaOBWJ3kr1ZFUGL46e9N mCkc9XaOBWJ3kr1ZFUGL46e9N2) {
        return zzpBGItXfub0yWj(Math.max(mCkc9XaOBWJ3kr1ZFUGL46e9N.VxUQ9tBhpHJ2AAEDNW8sghc4m, mCkc9XaOBWJ3kr1ZFUGL46e9N2.VxUQ9tBhpHJ2AAEDNW8sghc4m), Math.max(mCkc9XaOBWJ3kr1ZFUGL46e9N.zzpBGItXfub0yWj, mCkc9XaOBWJ3kr1ZFUGL46e9N2.zzpBGItXfub0yWj), Math.max(mCkc9XaOBWJ3kr1ZFUGL46e9N.V57tEvNfxZVVcOCAOih5PKr, mCkc9XaOBWJ3kr1ZFUGL46e9N2.V57tEvNfxZVVcOCAOih5PKr), Math.max(mCkc9XaOBWJ3kr1ZFUGL46e9N.ZfQNn8hdWlEQ5cR94249PDsLR, mCkc9XaOBWJ3kr1ZFUGL46e9N2.ZfQNn8hdWlEQ5cR94249PDsLR));
    }

    public static MCkc9XaOBWJ3kr1ZFUGL46e9N zzpBGItXfub0yWj(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? LaeGQIruHQu81hfJldjMOQSVblH3x : new MCkc9XaOBWJ3kr1ZFUGL46e9N(i, i2, i3, i4);
    }

    public final Insets ZfQNn8hdWlEQ5cR94249PDsLR() {
        return BNx7YAOy6zSdxROhZx2.zzpBGItXfub0yWj(this.VxUQ9tBhpHJ2AAEDNW8sghc4m, this.zzpBGItXfub0yWj, this.V57tEvNfxZVVcOCAOih5PKr, this.ZfQNn8hdWlEQ5cR94249PDsLR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MCkc9XaOBWJ3kr1ZFUGL46e9N.class != obj.getClass()) {
            return false;
        }
        MCkc9XaOBWJ3kr1ZFUGL46e9N mCkc9XaOBWJ3kr1ZFUGL46e9N = (MCkc9XaOBWJ3kr1ZFUGL46e9N) obj;
        return this.ZfQNn8hdWlEQ5cR94249PDsLR == mCkc9XaOBWJ3kr1ZFUGL46e9N.ZfQNn8hdWlEQ5cR94249PDsLR && this.VxUQ9tBhpHJ2AAEDNW8sghc4m == mCkc9XaOBWJ3kr1ZFUGL46e9N.VxUQ9tBhpHJ2AAEDNW8sghc4m && this.V57tEvNfxZVVcOCAOih5PKr == mCkc9XaOBWJ3kr1ZFUGL46e9N.V57tEvNfxZVVcOCAOih5PKr && this.zzpBGItXfub0yWj == mCkc9XaOBWJ3kr1ZFUGL46e9N.zzpBGItXfub0yWj;
    }

    public final int hashCode() {
        return (((((this.VxUQ9tBhpHJ2AAEDNW8sghc4m * 31) + this.zzpBGItXfub0yWj) * 31) + this.V57tEvNfxZVVcOCAOih5PKr) * 31) + this.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    public final String toString() {
        return "Insets{left=" + this.VxUQ9tBhpHJ2AAEDNW8sghc4m + ", top=" + this.zzpBGItXfub0yWj + ", right=" + this.V57tEvNfxZVVcOCAOih5PKr + ", bottom=" + this.ZfQNn8hdWlEQ5cR94249PDsLR + '}';
    }
}
