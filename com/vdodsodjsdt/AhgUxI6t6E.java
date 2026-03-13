package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class AhgUxI6t6E {
    public final String VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final int zzpBGItXfub0yWj;

    public AhgUxI6t6E(String str, int i) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "workSpecId");
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = str;
        this.zzpBGItXfub0yWj = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AhgUxI6t6E)) {
            return false;
        }
        AhgUxI6t6E ahgUxI6t6E = (AhgUxI6t6E) obj;
        return ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.VxUQ9tBhpHJ2AAEDNW8sghc4m, ahgUxI6t6E.VxUQ9tBhpHJ2AAEDNW8sghc4m) && this.zzpBGItXfub0yWj == ahgUxI6t6E.zzpBGItXfub0yWj;
    }

    public final int hashCode() {
        return Integer.hashCode(this.zzpBGItXfub0yWj) + (this.VxUQ9tBhpHJ2AAEDNW8sghc4m.hashCode() * 31);
    }

    public final String toString() {
        return "WorkGenerationalId(workSpecId=" + this.VxUQ9tBhpHJ2AAEDNW8sghc4m + ", generation=" + this.zzpBGItXfub0yWj + ')';
    }
}
