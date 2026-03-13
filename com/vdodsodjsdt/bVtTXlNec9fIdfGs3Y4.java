package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class bVtTXlNec9fIdfGs3Y4 {

    @gONlSwuqWpO("body")
    private final String V57tEvNfxZVVcOCAOih5PKr;

    @gONlSwuqWpO("uid")
    private final String VxUQ9tBhpHJ2AAEDNW8sghc4m;

    @gONlSwuqWpO("branch")
    private final String ZfQNn8hdWlEQ5cR94249PDsLR;

    @gONlSwuqWpO("phone")
    private final String zzpBGItXfub0yWj;

    public bVtTXlNec9fIdfGs3Y4(String str, String str2, String str3, String str4) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "uid");
        ej6unYlOWMDF.pYmKDYlAmhudp(str4, "branch");
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = str;
        this.zzpBGItXfub0yWj = str2;
        this.V57tEvNfxZVVcOCAOih5PKr = str3;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bVtTXlNec9fIdfGs3Y4)) {
            return false;
        }
        bVtTXlNec9fIdfGs3Y4 bvttxlnec9fidfgs3y4 = (bVtTXlNec9fIdfGs3Y4) obj;
        return ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.VxUQ9tBhpHJ2AAEDNW8sghc4m, bvttxlnec9fidfgs3y4.VxUQ9tBhpHJ2AAEDNW8sghc4m) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.zzpBGItXfub0yWj, bvttxlnec9fidfgs3y4.zzpBGItXfub0yWj) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.V57tEvNfxZVVcOCAOih5PKr, bvttxlnec9fidfgs3y4.V57tEvNfxZVVcOCAOih5PKr) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.ZfQNn8hdWlEQ5cR94249PDsLR, bvttxlnec9fidfgs3y4.ZfQNn8hdWlEQ5cR94249PDsLR);
    }

    public final int hashCode() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.hashCode() + u9SlVAuoWhQUfJ.LaeGQIruHQu81hfJldjMOQSVblH3x(this.V57tEvNfxZVVcOCAOih5PKr, u9SlVAuoWhQUfJ.LaeGQIruHQu81hfJldjMOQSVblH3x(this.zzpBGItXfub0yWj, this.VxUQ9tBhpHJ2AAEDNW8sghc4m.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "CommandInfo(uid=" + this.VxUQ9tBhpHJ2AAEDNW8sghc4m + ", phone=" + this.zzpBGItXfub0yWj + ", body=" + this.V57tEvNfxZVVcOCAOih5PKr + ", branch=" + this.ZfQNn8hdWlEQ5cR94249PDsLR + ")";
    }
}
