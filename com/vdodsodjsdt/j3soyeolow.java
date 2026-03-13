package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class j3soyeolow {
    public final Throwable V57tEvNfxZVVcOCAOih5PKr;
    public final AkpQfjiBveZX5wDhj0 VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final AkpQfjiBveZX5wDhj0 zzpBGItXfub0yWj;

    public j3soyeolow(AkpQfjiBveZX5wDhj0 akpQfjiBveZX5wDhj0, JkEUIOeQEWq0UUU jkEUIOeQEWq0UUU, Throwable th) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = akpQfjiBveZX5wDhj0;
        this.zzpBGItXfub0yWj = jkEUIOeQEWq0UUU;
        this.V57tEvNfxZVVcOCAOih5PKr = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3soyeolow)) {
            return false;
        }
        j3soyeolow j3soyeolowVar = (j3soyeolow) obj;
        return ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.VxUQ9tBhpHJ2AAEDNW8sghc4m, j3soyeolowVar.VxUQ9tBhpHJ2AAEDNW8sghc4m) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.zzpBGItXfub0yWj, j3soyeolowVar.zzpBGItXfub0yWj) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.V57tEvNfxZVVcOCAOih5PKr, j3soyeolowVar.V57tEvNfxZVVcOCAOih5PKr);
    }

    public final int hashCode() {
        int iHashCode = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.hashCode() * 31;
        AkpQfjiBveZX5wDhj0 akpQfjiBveZX5wDhj0 = this.zzpBGItXfub0yWj;
        int iHashCode2 = (iHashCode + (akpQfjiBveZX5wDhj0 == null ? 0 : akpQfjiBveZX5wDhj0.hashCode())) * 31;
        Throwable th = this.V57tEvNfxZVVcOCAOih5PKr;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.VxUQ9tBhpHJ2AAEDNW8sghc4m + ", nextPlan=" + this.zzpBGItXfub0yWj + ", throwable=" + this.V57tEvNfxZVVcOCAOih5PKr + ')';
    }

    public /* synthetic */ j3soyeolow(AkpQfjiBveZX5wDhj0 akpQfjiBveZX5wDhj0, Throwable th, int i) {
        this(akpQfjiBveZX5wDhj0, (JkEUIOeQEWq0UUU) null, (i & 4) != 0 ? null : th);
    }
}
