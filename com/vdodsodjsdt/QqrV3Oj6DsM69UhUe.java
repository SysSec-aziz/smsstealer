package com.vdodsodjsdt;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class QqrV3Oj6DsM69UhUe {
    public static final Method LaeGQIruHQu81hfJldjMOQSVblH3x;
    public static final Field V57tEvNfxZVVcOCAOih5PKr;
    public static final Class VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public static final Handler ZLZeBXTMq0zDztBxtRTuCHrapQ = new Handler(Looper.getMainLooper());
    public static final Method ZfQNn8hdWlEQ5cR94249PDsLR;
    public static final Method zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public static final Field zzpBGItXfub0yWj;

    static {
        Class<?> cls;
        Field declaredField;
        Field declaredField2;
        Method declaredMethod;
        Method declaredMethod2;
        Method method = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        VxUQ9tBhpHJ2AAEDNW8sghc4m = cls;
        try {
            declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
        } catch (Throwable unused2) {
            declaredField = null;
        }
        zzpBGItXfub0yWj = declaredField;
        try {
            declaredField2 = Activity.class.getDeclaredField("mToken");
            declaredField2.setAccessible(true);
        } catch (Throwable unused3) {
            declaredField2 = null;
        }
        V57tEvNfxZVVcOCAOih5PKr = declaredField2;
        Class cls2 = VxUQ9tBhpHJ2AAEDNW8sghc4m;
        Class cls3 = Boolean.TYPE;
        if (cls2 == null) {
            declaredMethod = null;
        } else {
            try {
                declaredMethod = cls2.getDeclaredMethod("performStopActivity", IBinder.class, cls3, String.class);
                declaredMethod.setAccessible(true);
            } catch (Throwable unused4) {
                declaredMethod = null;
            }
        }
        ZfQNn8hdWlEQ5cR94249PDsLR = declaredMethod;
        Class cls4 = VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (cls4 == null) {
            declaredMethod2 = null;
        } else {
            try {
                declaredMethod2 = cls4.getDeclaredMethod("performStopActivity", IBinder.class, cls3);
                declaredMethod2.setAccessible(true);
            } catch (Throwable unused5) {
                declaredMethod2 = null;
            }
        }
        LaeGQIruHQu81hfJldjMOQSVblH3x = declaredMethod2;
        Class cls5 = VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int i = Build.VERSION.SDK_INT;
        if ((i == 26 || i == 27) && cls5 != null) {
            try {
                Class cls6 = Integer.TYPE;
                Class cls7 = Boolean.TYPE;
                Method declaredMethod3 = cls5.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls6, cls7, Configuration.class, Configuration.class, cls7, cls7);
                declaredMethod3.setAccessible(true);
                method = declaredMethod3;
            } catch (Throwable unused6) {
            }
        }
        zIvmSL0wzmmKGc3X39b2Gw2mUGE = method;
    }
}
