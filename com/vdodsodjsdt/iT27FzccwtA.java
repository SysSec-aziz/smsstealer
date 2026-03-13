package com.vdodsodjsdt;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class iT27FzccwtA extends ej6unYlOWMDF {
    public final /* synthetic */ uh2oy4CFwMxi4Tr3MBYYO0E KUYypEB4eNWOZWVDpH;
    public final /* synthetic */ NbdCSfBzv70H3 q1wNbhk2O6;

    public iT27FzccwtA(NbdCSfBzv70H3 nbdCSfBzv70H3, uh2oy4CFwMxi4Tr3MBYYO0E uh2oy4cfwmxi4tr3mbyyo0e) {
        this.q1wNbhk2O6 = nbdCSfBzv70H3;
        this.KUYypEB4eNWOZWVDpH = uh2oy4cfwmxi4tr3mbyyo0e;
    }

    @Override // com.vdodsodjsdt.ej6unYlOWMDF
    public final boolean YdNRGRc4rly() {
        return this.KUYypEB4eNWOZWVDpH.YdNRGRc4rly() || this.q1wNbhk2O6.mhUCRR8ceqc7mAozW;
    }

    @Override // com.vdodsodjsdt.ej6unYlOWMDF
    public final View ymT6yQrus3w(int i) {
        uh2oy4CFwMxi4Tr3MBYYO0E uh2oy4cfwmxi4tr3mbyyo0e = this.KUYypEB4eNWOZWVDpH;
        if (uh2oy4cfwmxi4tr3mbyyo0e.YdNRGRc4rly()) {
            return uh2oy4cfwmxi4tr3mbyyo0e.ymT6yQrus3w(i);
        }
        Dialog dialog = this.q1wNbhk2O6.bjhcQ0u7VT2OYYrwk96HrWoN;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }
}
