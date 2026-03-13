package com.vdodsodjsdt;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jOCHSDr891Bpw8RplQXPUZuF07s extends Activity implements hCgEybj69le8, aXYnt93gqDsRGaAelKXtu81xI1QR {
    public final androidx.lifecycle.iVKrTMqOw0TqCeNN V57tEvNfxZVVcOCAOih5PKr = new androidx.lifecycle.iVKrTMqOw0TqCeNN(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        ej6unYlOWMDF.pYmKDYlAmhudp(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(decorView, "getDecorView(...)");
        if (zonOxHotd3BwAPJcwqr6I6uQNngg4.Ca81ebIan1u(decorView, keyEvent)) {
            return true;
        }
        return zonOxHotd3BwAPJcwqr6I6uQNngg4.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        ej6unYlOWMDF.pYmKDYlAmhudp(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(decorView, "getDecorView(...)");
        if (zonOxHotd3BwAPJcwqr6I6uQNngg4.Ca81ebIan1u(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = ysGuvTMkajUqBsV.ZfQNn8hdWlEQ5cR94249PDsLR;
        kSBtmjC64B6O.zzpBGItXfub0yWj(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        ej6unYlOWMDF.pYmKDYlAmhudp(bundle, "outState");
        this.V57tEvNfxZVVcOCAOih5PKr.ZLZeBXTMq0zDztBxtRTuCHrapQ();
        super.onSaveInstanceState(bundle);
    }

    @Override // com.vdodsodjsdt.aXYnt93gqDsRGaAelKXtu81xI1QR
    public final boolean zzpBGItXfub0yWj(KeyEvent keyEvent) {
        ej6unYlOWMDF.pYmKDYlAmhudp(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }
}
