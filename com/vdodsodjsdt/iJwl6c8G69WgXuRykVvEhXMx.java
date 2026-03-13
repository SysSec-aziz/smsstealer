package com.vdodsodjsdt;

import android.animation.TimeInterpolator;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class iJwl6c8G69WgXuRykVvEhXMx {
    public int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public TimeInterpolator V57tEvNfxZVVcOCAOih5PKr;
    public long VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public int ZfQNn8hdWlEQ5cR94249PDsLR;
    public long zzpBGItXfub0yWj;

    public final TimeInterpolator VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        TimeInterpolator timeInterpolator = this.V57tEvNfxZVVcOCAOih5PKr;
        return timeInterpolator != null ? timeInterpolator : mlFPz0SY9o7oN.zzpBGItXfub0yWj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iJwl6c8G69WgXuRykVvEhXMx)) {
            return false;
        }
        iJwl6c8G69WgXuRykVvEhXMx ijwl6c8g69wgxurykvvehxmx = (iJwl6c8G69WgXuRykVvEhXMx) obj;
        if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m == ijwl6c8g69wgxurykvvehxmx.VxUQ9tBhpHJ2AAEDNW8sghc4m && this.zzpBGItXfub0yWj == ijwl6c8g69wgxurykvvehxmx.zzpBGItXfub0yWj && this.ZfQNn8hdWlEQ5cR94249PDsLR == ijwl6c8g69wgxurykvvehxmx.ZfQNn8hdWlEQ5cR94249PDsLR && this.LaeGQIruHQu81hfJldjMOQSVblH3x == ijwl6c8g69wgxurykvvehxmx.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            return VxUQ9tBhpHJ2AAEDNW8sghc4m().getClass().equals(ijwl6c8g69wgxurykvvehxmx.VxUQ9tBhpHJ2AAEDNW8sghc4m().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        long j2 = this.zzpBGItXfub0yWj;
        return ((((VxUQ9tBhpHJ2AAEDNW8sghc4m().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.ZfQNn8hdWlEQ5cR94249PDsLR) * 31) + this.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    public final String toString() {
        return "\n" + iJwl6c8G69WgXuRykVvEhXMx.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.VxUQ9tBhpHJ2AAEDNW8sghc4m + " duration: " + this.zzpBGItXfub0yWj + " interpolator: " + VxUQ9tBhpHJ2AAEDNW8sghc4m().getClass() + " repeatCount: " + this.ZfQNn8hdWlEQ5cR94249PDsLR + " repeatMode: " + this.LaeGQIruHQu81hfJldjMOQSVblH3x + "}\n";
    }
}
