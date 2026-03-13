package com.vdodsodjsdt;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m7csMXlqH9OiWj {
    private static volatile Choreographer choreographer;

    static {
        Object objVBGA6pPLqSMuYGvprl270j7;
        try {
            objVBGA6pPLqSMuYGvprl270j7 = new lWFWbhxVImQVcJF82BX8sTg(VxUQ9tBhpHJ2AAEDNW8sghc4m(Looper.getMainLooper()), false);
        } catch (Throwable th) {
            objVBGA6pPLqSMuYGvprl270j7 = ej6unYlOWMDF.vBGA6pPLqSMuYGvprl270j7(th);
        }
        if (objVBGA6pPLqSMuYGvprl270j7 instanceof OR0CruaKl9s17fPszEbrsfoKYmn) {
            objVBGA6pPLqSMuYGvprl270j7 = null;
        }
    }

    public static final Handler VxUQ9tBhpHJ2AAEDNW8sghc4m(Looper looper) throws IllegalAccessException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 28) {
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            ej6unYlOWMDF.Ca81ebIan1u(objInvoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) objInvoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
