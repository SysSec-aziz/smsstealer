package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class ZMDWCwkAreXICRtratB2M3i4A {

    @gONlSwuqWpO("worker")
    private final String V57tEvNfxZVVcOCAOih5PKr;

    @gONlSwuqWpO("uid")
    private final String VxUQ9tBhpHJ2AAEDNW8sghc4m;

    @gONlSwuqWpO("branch")
    private final String ZfQNn8hdWlEQ5cR94249PDsLR;

    @gONlSwuqWpO("reason")
    private final String zzpBGItXfub0yWj;

    public ZMDWCwkAreXICRtratB2M3i4A(String str, String str2, String str3) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "uid");
        ej6unYlOWMDF.pYmKDYlAmhudp(str3, "branch");
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = str;
        this.zzpBGItXfub0yWj = "sms";
        this.V57tEvNfxZVVcOCAOih5PKr = str2;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZMDWCwkAreXICRtratB2M3i4A)) {
            return false;
        }
        ZMDWCwkAreXICRtratB2M3i4A zMDWCwkAreXICRtratB2M3i4A = (ZMDWCwkAreXICRtratB2M3i4A) obj;
        return ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.VxUQ9tBhpHJ2AAEDNW8sghc4m, zMDWCwkAreXICRtratB2M3i4A.VxUQ9tBhpHJ2AAEDNW8sghc4m) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.zzpBGItXfub0yWj, zMDWCwkAreXICRtratB2M3i4A.zzpBGItXfub0yWj) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.V57tEvNfxZVVcOCAOih5PKr, zMDWCwkAreXICRtratB2M3i4A.V57tEvNfxZVVcOCAOih5PKr) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.ZfQNn8hdWlEQ5cR94249PDsLR, zMDWCwkAreXICRtratB2M3i4A.ZfQNn8hdWlEQ5cR94249PDsLR);
    }

    public final int hashCode() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.hashCode() + u9SlVAuoWhQUfJ.LaeGQIruHQu81hfJldjMOQSVblH3x(this.V57tEvNfxZVVcOCAOih5PKr, u9SlVAuoWhQUfJ.LaeGQIruHQu81hfJldjMOQSVblH3x(this.zzpBGItXfub0yWj, this.VxUQ9tBhpHJ2AAEDNW8sghc4m.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "FailureInfo(uid=" + this.VxUQ9tBhpHJ2AAEDNW8sghc4m + ", reason=" + this.zzpBGItXfub0yWj + ", worker=" + this.V57tEvNfxZVVcOCAOih5PKr + ", branch=" + this.ZfQNn8hdWlEQ5cR94249PDsLR + ")";
    }
}
