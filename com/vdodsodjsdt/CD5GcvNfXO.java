package com.vdodsodjsdt;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CD5GcvNfXO implements Runnable {
    public final /* synthetic */ Object LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ int ZfQNn8hdWlEQ5cR94249PDsLR;

    public /* synthetic */ CD5GcvNfXO(Object obj, int i, int i2) {
        this.V57tEvNfxZVVcOCAOih5PKr = i2;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = obj;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                ((KfeOQNOupsCg6878zi4e) this.LaeGQIruHQu81hfJldjMOQSVblH3x).y1NaPKTl7R18DOr6e8i5(this.ZfQNn8hdWlEQ5cR94249PDsLR);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                View view = (View) sideSheetBehavior.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.get();
                if (view != null) {
                    sideSheetBehavior.f6ZQsR6bPLvvCDNXOUc(view, this.ZfQNn8hdWlEQ5cR94249PDsLR, false);
                }
                break;
        }
    }
}
