package com.vdodsodjsdt;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class uh2oy4CFwMxi4Tr3MBYYO0E extends ej6unYlOWMDF {
    public final /* synthetic */ dip85SLOWSmNG3 KUYypEB4eNWOZWVDpH;

    public uh2oy4CFwMxi4Tr3MBYYO0E(dip85SLOWSmNG3 dip85slowsmng3) {
        this.KUYypEB4eNWOZWVDpH = dip85slowsmng3;
    }

    @Override // com.vdodsodjsdt.ej6unYlOWMDF
    public final boolean YdNRGRc4rly() {
        return this.KUYypEB4eNWOZWVDpH.HVEwbdULInpTNa0IG != null;
    }

    @Override // com.vdodsodjsdt.ej6unYlOWMDF
    public final View ymT6yQrus3w(int i) {
        dip85SLOWSmNG3 dip85slowsmng3 = this.KUYypEB4eNWOZWVDpH;
        View view = dip85slowsmng3.HVEwbdULInpTNa0IG;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + dip85slowsmng3 + " does not have a view");
    }
}
