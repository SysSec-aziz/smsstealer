package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class H73tKnp5B8 {
    public int V57tEvNfxZVVcOCAOih5PKr;
    public int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public int zzpBGItXfub0yWj;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof H73tKnp5B8)) {
                return false;
            }
            H73tKnp5B8 h73tKnp5B8 = (H73tKnp5B8) obj;
            int i = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (i != h73tKnp5B8.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
                return false;
            }
            if (i != 8 || Math.abs(this.V57tEvNfxZVVcOCAOih5PKr - this.zzpBGItXfub0yWj) != 1 || this.V57tEvNfxZVVcOCAOih5PKr != h73tKnp5B8.zzpBGItXfub0yWj || this.zzpBGItXfub0yWj != h73tKnp5B8.V57tEvNfxZVVcOCAOih5PKr) {
                return this.V57tEvNfxZVVcOCAOih5PKr == h73tKnp5B8.V57tEvNfxZVVcOCAOih5PKr && this.zzpBGItXfub0yWj == h73tKnp5B8.zzpBGItXfub0yWj;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.VxUQ9tBhpHJ2AAEDNW8sghc4m * 31) + this.zzpBGItXfub0yWj) * 31) + this.V57tEvNfxZVVcOCAOih5PKr;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.zzpBGItXfub0yWj);
        sb.append("c:");
        sb.append(this.V57tEvNfxZVVcOCAOih5PKr);
        sb.append(",p:null]");
        return sb.toString();
    }
}
