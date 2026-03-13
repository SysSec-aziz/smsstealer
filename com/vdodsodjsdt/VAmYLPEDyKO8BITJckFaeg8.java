package com.vdodsodjsdt;

import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class VAmYLPEDyKO8BITJckFaeg8 extends Thread {
    public final int V57tEvNfxZVVcOCAOih5PKr;

    public VAmYLPEDyKO8BITJckFaeg8(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.V57tEvNfxZVVcOCAOih5PKr = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.V57tEvNfxZVVcOCAOih5PKr);
        super.run();
    }
}
