package com.vdodsodjsdt;

import android.database.DataSetObserver;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class dhdHXTcVuVTGGrO4Qnb1Pk16PmuF extends DataSetObserver {
    public final /* synthetic */ uLXxmkdsO6wfrm VxUQ9tBhpHJ2AAEDNW8sghc4m;

    public dhdHXTcVuVTGGrO4Qnb1Pk16PmuF(uLXxmkdsO6wfrm ulxxmkdso6wfrm) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = ulxxmkdso6wfrm;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        uLXxmkdsO6wfrm ulxxmkdso6wfrm = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (ulxxmkdso6wfrm.SuB3hEmTmbbRGAhtvOOmfKEon.isShowing()) {
            ulxxmkdso6wfrm.ZfQNn8hdWlEQ5cR94249PDsLR();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.dismiss();
    }
}
