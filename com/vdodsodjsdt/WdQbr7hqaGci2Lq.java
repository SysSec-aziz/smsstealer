package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class WdQbr7hqaGci2Lq {
    public final boolean V57tEvNfxZVVcOCAOih5PKr;
    public final boolean VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final boolean ZfQNn8hdWlEQ5cR94249PDsLR;
    public final boolean zzpBGItXfub0yWj;

    public WdQbr7hqaGci2Lq(boolean z, boolean z2, boolean z3, boolean z4) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = z;
        this.zzpBGItXfub0yWj = z2;
        this.V57tEvNfxZVVcOCAOih5PKr = z3;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WdQbr7hqaGci2Lq)) {
            return false;
        }
        WdQbr7hqaGci2Lq wdQbr7hqaGci2Lq = (WdQbr7hqaGci2Lq) obj;
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m == wdQbr7hqaGci2Lq.VxUQ9tBhpHJ2AAEDNW8sghc4m && this.zzpBGItXfub0yWj == wdQbr7hqaGci2Lq.zzpBGItXfub0yWj && this.V57tEvNfxZVVcOCAOih5PKr == wdQbr7hqaGci2Lq.V57tEvNfxZVVcOCAOih5PKr && this.ZfQNn8hdWlEQ5cR94249PDsLR == wdQbr7hqaGci2Lq.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.ZfQNn8hdWlEQ5cR94249PDsLR) + ((Boolean.hashCode(this.V57tEvNfxZVVcOCAOih5PKr) + ((Boolean.hashCode(this.zzpBGItXfub0yWj) + (Boolean.hashCode(this.VxUQ9tBhpHJ2AAEDNW8sghc4m) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.VxUQ9tBhpHJ2AAEDNW8sghc4m + ", isValidated=" + this.zzpBGItXfub0yWj + ", isMetered=" + this.V57tEvNfxZVVcOCAOih5PKr + ", isNotRoaming=" + this.ZfQNn8hdWlEQ5cR94249PDsLR + ')';
    }
}
