package com.vdodsodjsdt;

import android.content.Intent;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class QXRsDWGmFmSzZT6WcvPRDxeKS8 implements Runnable {
    public final Object LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final int ZfQNn8hdWlEQ5cR94249PDsLR;
    public final Object zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public /* synthetic */ QXRsDWGmFmSzZT6WcvPRDxeKS8(int i, int i2, Object obj, Object obj2) {
        this.V57tEvNfxZVVcOCAOih5PKr = i2;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = obj;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = obj2;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                ((TextView) this.LaeGQIruHQu81hfJldjMOQSVblH3x).setTypeface((Typeface) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE, this.ZfQNn8hdWlEQ5cR94249PDsLR);
                break;
            case 1:
                ((BottomSheetBehavior) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE).vE4yDIjexsP2lGjLaTcB((View) this.LaeGQIruHQu81hfJldjMOQSVblH3x, this.ZfQNn8hdWlEQ5cR94249PDsLR, false);
                break;
            default:
                ((JCv1sAljLJlTL0U) this.LaeGQIruHQu81hfJldjMOQSVblH3x).VxUQ9tBhpHJ2AAEDNW8sghc4m((Intent) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE, this.ZfQNn8hdWlEQ5cR94249PDsLR);
                break;
        }
    }

    public QXRsDWGmFmSzZT6WcvPRDxeKS8(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.V57tEvNfxZVVcOCAOih5PKr = 1;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = bottomSheetBehavior;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = view;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i;
    }
}
