package com.vdodsodjsdt;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class x4ZznCT5cs0ehmX6AZBN implements DialogInterface.OnCancelListener {
    public final /* synthetic */ NbdCSfBzv70H3 V57tEvNfxZVVcOCAOih5PKr;

    public x4ZznCT5cs0ehmX6AZBN(NbdCSfBzv70H3 nbdCSfBzv70H3) {
        this.V57tEvNfxZVVcOCAOih5PKr = nbdCSfBzv70H3;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        NbdCSfBzv70H3 nbdCSfBzv70H3 = this.V57tEvNfxZVVcOCAOih5PKr;
        Dialog dialog = nbdCSfBzv70H3.bjhcQ0u7VT2OYYrwk96HrWoN;
        if (dialog != null) {
            nbdCSfBzv70H3.onCancel(dialog);
        }
    }
}
