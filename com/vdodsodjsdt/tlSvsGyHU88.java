package com.vdodsodjsdt;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class tlSvsGyHU88 {
    public final List LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final String V57tEvNfxZVVcOCAOih5PKr;
    public final String VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final List ZfQNn8hdWlEQ5cR94249PDsLR;
    public final String zzpBGItXfub0yWj;

    public tlSvsGyHU88(String str, String str2, String str3, List list, List list2) {
        ej6unYlOWMDF.pYmKDYlAmhudp(list, "columnNames");
        ej6unYlOWMDF.pYmKDYlAmhudp(list2, "referenceColumnNames");
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = str;
        this.zzpBGItXfub0yWj = str2;
        this.V57tEvNfxZVVcOCAOih5PKr = str3;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = list;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tlSvsGyHU88)) {
            return false;
        }
        tlSvsGyHU88 tlsvsgyhu88 = (tlSvsGyHU88) obj;
        if (ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.VxUQ9tBhpHJ2AAEDNW8sghc4m, tlsvsgyhu88.VxUQ9tBhpHJ2AAEDNW8sghc4m) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.zzpBGItXfub0yWj, tlsvsgyhu88.zzpBGItXfub0yWj) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.V57tEvNfxZVVcOCAOih5PKr, tlsvsgyhu88.V57tEvNfxZVVcOCAOih5PKr) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.ZfQNn8hdWlEQ5cR94249PDsLR, tlsvsgyhu88.ZfQNn8hdWlEQ5cR94249PDsLR)) {
            return ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.LaeGQIruHQu81hfJldjMOQSVblH3x, tlsvsgyhu88.LaeGQIruHQu81hfJldjMOQSVblH3x);
        }
        return false;
    }

    public final int hashCode() {
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x.hashCode() + ((this.ZfQNn8hdWlEQ5cR94249PDsLR.hashCode() + u9SlVAuoWhQUfJ.LaeGQIruHQu81hfJldjMOQSVblH3x(this.V57tEvNfxZVVcOCAOih5PKr, u9SlVAuoWhQUfJ.LaeGQIruHQu81hfJldjMOQSVblH3x(this.zzpBGItXfub0yWj, this.VxUQ9tBhpHJ2AAEDNW8sghc4m.hashCode() * 31, 31), 31)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.VxUQ9tBhpHJ2AAEDNW8sghc4m + "', onDelete='" + this.zzpBGItXfub0yWj + " +', onUpdate='" + this.V57tEvNfxZVVcOCAOih5PKr + "', columnNames=" + this.ZfQNn8hdWlEQ5cR94249PDsLR + ", referenceColumnNames=" + this.LaeGQIruHQu81hfJldjMOQSVblH3x + '}';
    }
}
