package com.vdodsodjsdt;

import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ZLj2ZJlGf9PXaB {
    public static final String VxUQ9tBhpHJ2AAEDNW8sghc4m;

    static {
        String strZLZeBXTMq0zDztBxtRTuCHrapQ = psATg3LCCdmDIiRgW.ZLZeBXTMq0zDztBxtRTuCHrapQ("WakeLocks");
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strZLZeBXTMq0zDztBxtRTuCHrapQ, "tagWithPrefix(\"WakeLocks\")");
        VxUQ9tBhpHJ2AAEDNW8sghc4m = strZLZeBXTMq0zDztBxtRTuCHrapQ;
    }

    public static final PowerManager.WakeLock VxUQ9tBhpHJ2AAEDNW8sghc4m(Context context, String str) {
        ej6unYlOWMDF.pYmKDYlAmhudp(context, "context");
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        ej6unYlOWMDF.Ca81ebIan1u(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String strConcat = "WorkManager: ".concat(str);
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, strConcat);
        synchronized (mSLWNe1VDLcB1VYI.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
        }
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(wakeLockNewWakeLock, "wakeLock");
        return wakeLockNewWakeLock;
    }
}
