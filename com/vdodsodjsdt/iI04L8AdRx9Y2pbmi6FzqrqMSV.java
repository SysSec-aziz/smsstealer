package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class iI04L8AdRx9Y2pbmi6FzqrqMSV {
    public final String VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final Long zzpBGItXfub0yWj;

    public iI04L8AdRx9Y2pbmi6FzqrqMSV(String str, Long l) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = str;
        this.zzpBGItXfub0yWj = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iI04L8AdRx9Y2pbmi6FzqrqMSV)) {
            return false;
        }
        iI04L8AdRx9Y2pbmi6FzqrqMSV ii04l8adrx9y2pbmi6fzqrqmsv = (iI04L8AdRx9Y2pbmi6FzqrqMSV) obj;
        return ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.VxUQ9tBhpHJ2AAEDNW8sghc4m, ii04l8adrx9y2pbmi6fzqrqmsv.VxUQ9tBhpHJ2AAEDNW8sghc4m) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.zzpBGItXfub0yWj, ii04l8adrx9y2pbmi6fzqrqmsv.zzpBGItXfub0yWj);
    }

    public final int hashCode() {
        int iHashCode = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.hashCode() * 31;
        Long l = this.zzpBGItXfub0yWj;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.VxUQ9tBhpHJ2AAEDNW8sghc4m + ", value=" + this.zzpBGItXfub0yWj + ')';
    }
}
