package com.vdodsodjsdt;

import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class lpiLuUvtGbMB3plSx8b {
    public final Set V57tEvNfxZVVcOCAOih5PKr;
    public final String VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final Set ZfQNn8hdWlEQ5cR94249PDsLR;
    public final Object zzpBGItXfub0yWj;

    public lpiLuUvtGbMB3plSx8b(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        ej6unYlOWMDF.pYmKDYlAmhudp(abstractSet, "foreignKeys");
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = str;
        this.zzpBGItXfub0yWj = map;
        this.V57tEvNfxZVVcOCAOih5PKr = abstractSet;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = abstractSet2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x01dd, code lost:
    
        r9 = com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao.NSjgqmGjEzuugn2SsG1mZFP(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01e1, code lost:
    
        r3.close();
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.vdodsodjsdt.lpiLuUvtGbMB3plSx8b VxUQ9tBhpHJ2AAEDNW8sghc4m(com.vdodsodjsdt.Um0z2cMcEZpu6blUyqa58pl r26, java.lang.String r27) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.lpiLuUvtGbMB3plSx8b.VxUQ9tBhpHJ2AAEDNW8sghc4m(com.vdodsodjsdt.Um0z2cMcEZpu6blUyqa58pl, java.lang.String):com.vdodsodjsdt.lpiLuUvtGbMB3plSx8b");
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lpiLuUvtGbMB3plSx8b)) {
            return false;
        }
        lpiLuUvtGbMB3plSx8b lpiluuvtgbmb3plsx8b = (lpiLuUvtGbMB3plSx8b) obj;
        if (!this.VxUQ9tBhpHJ2AAEDNW8sghc4m.equals(lpiluuvtgbmb3plsx8b.VxUQ9tBhpHJ2AAEDNW8sghc4m) || !this.zzpBGItXfub0yWj.equals(lpiluuvtgbmb3plsx8b.zzpBGItXfub0yWj) || !ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.V57tEvNfxZVVcOCAOih5PKr, lpiluuvtgbmb3plsx8b.V57tEvNfxZVVcOCAOih5PKr)) {
            return false;
        }
        Set set2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (set2 == null || (set = lpiluuvtgbmb3plsx8b.ZfQNn8hdWlEQ5cR94249PDsLR) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.V57tEvNfxZVVcOCAOih5PKr.hashCode() + ((this.zzpBGItXfub0yWj.hashCode() + (this.VxUQ9tBhpHJ2AAEDNW8sghc4m.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.VxUQ9tBhpHJ2AAEDNW8sghc4m + "', columns=" + this.zzpBGItXfub0yWj + ", foreignKeys=" + this.V57tEvNfxZVVcOCAOih5PKr + ", indices=" + this.ZfQNn8hdWlEQ5cR94249PDsLR + '}';
    }
}
