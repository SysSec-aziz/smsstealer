package com.vdodsodjsdt;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class sLGv12xZEa {
    public final Throwable LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final vP57smEEh3YGCxzJ V57tEvNfxZVVcOCAOih5PKr;
    public final Object VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final Object ZfQNn8hdWlEQ5cR94249PDsLR;
    public final xPJD6zCXsU5TwlX zzpBGItXfub0yWj;

    public sLGv12xZEa(Object obj, xPJD6zCXsU5TwlX xpjd6zcxsu5twlx, vP57smEEh3YGCxzJ vp57smeeh3ygcxzj, Object obj2, Throwable th) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = obj;
        this.zzpBGItXfub0yWj = xpjd6zcxsu5twlx;
        this.V57tEvNfxZVVcOCAOih5PKr = vp57smeeh3ygcxzj;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = obj2;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = th;
    }

    public static sLGv12xZEa VxUQ9tBhpHJ2AAEDNW8sghc4m(sLGv12xZEa slgv12xzea, xPJD6zCXsU5TwlX xpjd6zcxsu5twlx, CancellationException cancellationException, int i) {
        Object obj = slgv12xzea.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if ((i & 2) != 0) {
            xpjd6zcxsu5twlx = slgv12xzea.zzpBGItXfub0yWj;
        }
        xPJD6zCXsU5TwlX xpjd6zcxsu5twlx2 = xpjd6zcxsu5twlx;
        vP57smEEh3YGCxzJ vp57smeeh3ygcxzj = slgv12xzea.V57tEvNfxZVVcOCAOih5PKr;
        Object obj2 = slgv12xzea.ZfQNn8hdWlEQ5cR94249PDsLR;
        Throwable th = cancellationException;
        if ((i & 16) != 0) {
            th = slgv12xzea.LaeGQIruHQu81hfJldjMOQSVblH3x;
        }
        return new sLGv12xZEa(obj, xpjd6zcxsu5twlx2, vp57smeeh3ygcxzj, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sLGv12xZEa)) {
            return false;
        }
        sLGv12xZEa slgv12xzea = (sLGv12xZEa) obj;
        return ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.VxUQ9tBhpHJ2AAEDNW8sghc4m, slgv12xzea.VxUQ9tBhpHJ2AAEDNW8sghc4m) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.zzpBGItXfub0yWj, slgv12xzea.zzpBGItXfub0yWj) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.V57tEvNfxZVVcOCAOih5PKr, slgv12xzea.V57tEvNfxZVVcOCAOih5PKr) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.ZfQNn8hdWlEQ5cR94249PDsLR, slgv12xzea.ZfQNn8hdWlEQ5cR94249PDsLR) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.LaeGQIruHQu81hfJldjMOQSVblH3x, slgv12xzea.LaeGQIruHQu81hfJldjMOQSVblH3x);
    }

    public final int hashCode() {
        Object obj = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        xPJD6zCXsU5TwlX xpjd6zcxsu5twlx = this.zzpBGItXfub0yWj;
        int iHashCode2 = (iHashCode + (xpjd6zcxsu5twlx == null ? 0 : xpjd6zcxsu5twlx.hashCode())) * 31;
        vP57smEEh3YGCxzJ vp57smeeh3ygcxzj = this.V57tEvNfxZVVcOCAOih5PKr;
        int iHashCode3 = (iHashCode2 + (vp57smeeh3ygcxzj == null ? 0 : vp57smeeh3ygcxzj.hashCode())) * 31;
        Object obj2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.VxUQ9tBhpHJ2AAEDNW8sghc4m + ", cancelHandler=" + this.zzpBGItXfub0yWj + ", onCancellation=" + this.V57tEvNfxZVVcOCAOih5PKr + ", idempotentResume=" + this.ZfQNn8hdWlEQ5cR94249PDsLR + ", cancelCause=" + this.LaeGQIruHQu81hfJldjMOQSVblH3x + ')';
    }

    public /* synthetic */ sLGv12xZEa(Object obj, xPJD6zCXsU5TwlX xpjd6zcxsu5twlx, vP57smEEh3YGCxzJ vp57smeeh3ygcxzj, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : xpjd6zcxsu5twlx, (i & 4) != 0 ? null : vp57smeeh3ygcxzj, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}
