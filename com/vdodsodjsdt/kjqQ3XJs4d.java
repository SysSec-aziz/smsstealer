package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class kjqQ3XJs4d {
    public final int V57tEvNfxZVVcOCAOih5PKr;
    public final String VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final int zzpBGItXfub0yWj;

    public kjqQ3XJs4d(String str, int i, int i2) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "workSpecId");
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = str;
        this.zzpBGItXfub0yWj = i;
        this.V57tEvNfxZVVcOCAOih5PKr = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kjqQ3XJs4d)) {
            return false;
        }
        kjqQ3XJs4d kjqq3xjs4d = (kjqQ3XJs4d) obj;
        return ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.VxUQ9tBhpHJ2AAEDNW8sghc4m, kjqq3xjs4d.VxUQ9tBhpHJ2AAEDNW8sghc4m) && this.zzpBGItXfub0yWj == kjqq3xjs4d.zzpBGItXfub0yWj && this.V57tEvNfxZVVcOCAOih5PKr == kjqq3xjs4d.V57tEvNfxZVVcOCAOih5PKr;
    }

    public final int hashCode() {
        return Integer.hashCode(this.V57tEvNfxZVVcOCAOih5PKr) + ((Integer.hashCode(this.zzpBGItXfub0yWj) + (this.VxUQ9tBhpHJ2AAEDNW8sghc4m.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SystemIdInfo(workSpecId=" + this.VxUQ9tBhpHJ2AAEDNW8sghc4m + ", generation=" + this.zzpBGItXfub0yWj + ", systemId=" + this.V57tEvNfxZVVcOCAOih5PKr + ')';
    }
}
