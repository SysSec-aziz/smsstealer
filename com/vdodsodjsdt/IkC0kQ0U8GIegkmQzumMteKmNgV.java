package com.vdodsodjsdt;

import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class IkC0kQ0U8GIegkmQzumMteKmNgV extends ALJgALwYYFtLBM6dfUwef {
    public final /* synthetic */ NrjuzzioPqfttNRptBDpZDzSYUrcM V57tEvNfxZVVcOCAOih5PKr;

    public IkC0kQ0U8GIegkmQzumMteKmNgV(NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcM) {
        this.V57tEvNfxZVVcOCAOih5PKr = nrjuzzioPqfttNRptBDpZDzSYUrcM;
    }

    @Override // com.vdodsodjsdt.I7XxpUEW0N
    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return ((Matcher) this.V57tEvNfxZVVcOCAOih5PKr.zzpBGItXfub0yWj).groupCount() + 1;
    }

    @Override // com.vdodsodjsdt.I7XxpUEW0N, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        String strGroup = ((Matcher) this.V57tEvNfxZVVcOCAOih5PKr.zzpBGItXfub0yWj).group(i);
        return strGroup == null ? "" : strGroup;
    }

    @Override // com.vdodsodjsdt.ALJgALwYYFtLBM6dfUwef, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // com.vdodsodjsdt.ALJgALwYYFtLBM6dfUwef, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
