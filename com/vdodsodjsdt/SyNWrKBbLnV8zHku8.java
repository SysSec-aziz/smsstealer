package com.vdodsodjsdt;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class SyNWrKBbLnV8zHku8 implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ uLXxmkdsO6wfrm V57tEvNfxZVVcOCAOih5PKr;

    public SyNWrKBbLnV8zHku8(uLXxmkdsO6wfrm ulxxmkdso6wfrm) {
        this.V57tEvNfxZVVcOCAOih5PKr = ulxxmkdso6wfrm;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        aVXgxTePUTvRAcd avxgxteputvracd;
        if (i == -1 || (avxgxteputvracd = this.V57tEvNfxZVVcOCAOih5PKr.LaeGQIruHQu81hfJldjMOQSVblH3x) == null) {
            return;
        }
        avxgxteputvracd.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
