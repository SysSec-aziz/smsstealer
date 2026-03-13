package com.vdodsodjsdt;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class FebcEr6HDzMxO4Tzw7bCSO57 extends Service implements hCgEybj69le8 {
    public final NrjuzzioPqfttNRptBDpZDzSYUrcM V57tEvNfxZVVcOCAOih5PKr = new NrjuzzioPqfttNRptBDpZDzSYUrcM(this);

    @Override // com.vdodsodjsdt.hCgEybj69le8
    public final androidx.lifecycle.iVKrTMqOw0TqCeNN LaeGQIruHQu81hfJldjMOQSVblH3x() {
        return (androidx.lifecycle.iVKrTMqOw0TqCeNN) this.V57tEvNfxZVVcOCAOih5PKr.zzpBGItXfub0yWj;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        ej6unYlOWMDF.pYmKDYlAmhudp(intent, "intent");
        this.V57tEvNfxZVVcOCAOih5PKr.SuB3hEmTmbbRGAhtvOOmfKEon(XOTOHmUA5NYhlyOBh7.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.V57tEvNfxZVVcOCAOih5PKr.SuB3hEmTmbbRGAhtvOOmfKEon(XOTOHmUA5NYhlyOBh7.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        XOTOHmUA5NYhlyOBh7 xOTOHmUA5NYhlyOBh7 = XOTOHmUA5NYhlyOBh7.ON_STOP;
        NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcM = this.V57tEvNfxZVVcOCAOih5PKr;
        nrjuzzioPqfttNRptBDpZDzSYUrcM.SuB3hEmTmbbRGAhtvOOmfKEon(xOTOHmUA5NYhlyOBh7);
        nrjuzzioPqfttNRptBDpZDzSYUrcM.SuB3hEmTmbbRGAhtvOOmfKEon(XOTOHmUA5NYhlyOBh7.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.V57tEvNfxZVVcOCAOih5PKr.SuB3hEmTmbbRGAhtvOOmfKEon(XOTOHmUA5NYhlyOBh7.ON_START);
        super.onStart(intent, i);
    }
}
