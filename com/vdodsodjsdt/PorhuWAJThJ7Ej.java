package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class PorhuWAJThJ7Ej {
    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final Object zzpBGItXfub0yWj;

    public PorhuWAJThJ7Ej(int i, Object obj) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        this.zzpBGItXfub0yWj = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PorhuWAJThJ7Ej)) {
            return false;
        }
        PorhuWAJThJ7Ej porhuWAJThJ7Ej = (PorhuWAJThJ7Ej) obj;
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m == porhuWAJThJ7Ej.VxUQ9tBhpHJ2AAEDNW8sghc4m && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.zzpBGItXfub0yWj, porhuWAJThJ7Ej.zzpBGItXfub0yWj);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.VxUQ9tBhpHJ2AAEDNW8sghc4m) * 31;
        Object obj = this.zzpBGItXfub0yWj;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.VxUQ9tBhpHJ2AAEDNW8sghc4m + ", value=" + this.zzpBGItXfub0yWj + ')';
    }
}
