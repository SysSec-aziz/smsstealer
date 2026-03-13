package com.vdodsodjsdt;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class ultdrl04kLWs4va76zZ2lRjrhe implements Runnable {
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ ActionBarOverlayLayout ZfQNn8hdWlEQ5cR94249PDsLR;

    public /* synthetic */ ultdrl04kLWs4va76zZ2lRjrhe(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                actionBarOverlayLayout.NSjgqmGjEzuugn2SsG1mZFP();
                actionBarOverlayLayout.w0Wu95l8dVNw5rZMRu = actionBarOverlayLayout.zIvmSL0wzmmKGc3X39b2Gw2mUGE.animate().translationY(0.0f).setListener(actionBarOverlayLayout.RhfGHxtXxy0M0grmp2jkRjQg);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                actionBarOverlayLayout2.NSjgqmGjEzuugn2SsG1mZFP();
                actionBarOverlayLayout2.w0Wu95l8dVNw5rZMRu = actionBarOverlayLayout2.zIvmSL0wzmmKGc3X39b2Gw2mUGE.animate().translationY(-actionBarOverlayLayout2.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getHeight()).setListener(actionBarOverlayLayout2.RhfGHxtXxy0M0grmp2jkRjQg);
                break;
        }
    }
}
