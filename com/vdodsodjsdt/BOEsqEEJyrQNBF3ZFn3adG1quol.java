package com.vdodsodjsdt;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class BOEsqEEJyrQNBF3ZFn3adG1quol implements PopupWindow.OnDismissListener {
    public final /* synthetic */ oKfueTVJIz3 V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ RN4c7Imz7HP3UxSANZr ZfQNn8hdWlEQ5cR94249PDsLR;

    public BOEsqEEJyrQNBF3ZFn3adG1quol(RN4c7Imz7HP3UxSANZr rN4c7Imz7HP3UxSANZr, oKfueTVJIz3 okfuetvjiz3) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR = rN4c7Imz7HP3UxSANZr;
        this.V57tEvNfxZVVcOCAOih5PKr = okfuetvjiz3;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.ZfQNn8hdWlEQ5cR94249PDsLR.qygqjTppWwx992.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.V57tEvNfxZVVcOCAOih5PKr);
        }
    }
}
