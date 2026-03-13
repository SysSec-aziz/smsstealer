package com.vdodsodjsdt;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class BjZzXy9Nb43966btmHEPbMFcR extends hRrPPME7ytOB7ba {
    public volatile Handler vE4yDIjexsP2lGjLaTcB;
    public final Object pzqP2AqKW6J5PO8zCKnW = new Object();
    public final ExecutorService aXO0LSrt8bKV = Executors.newFixedThreadPool(4, new lJlNvDyl5huSZi3());

    public static Handler d9zDyyznnp3oaDT1Ug(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return kHXwlw9VpxBho.VxUQ9tBhpHJ2AAEDNW8sghc4m(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
