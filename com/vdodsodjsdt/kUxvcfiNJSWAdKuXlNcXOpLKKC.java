package com.vdodsodjsdt;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kUxvcfiNJSWAdKuXlNcXOpLKKC {
    public static final String VxUQ9tBhpHJ2AAEDNW8sghc4m;

    static {
        String strZLZeBXTMq0zDztBxtRTuCHrapQ = psATg3LCCdmDIiRgW.ZLZeBXTMq0zDztBxtRTuCHrapQ("ProcessUtils");
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strZLZeBXTMq0zDztBxtRTuCHrapQ, "tagWithPrefix(\"ProcessUtils\")");
        VxUQ9tBhpHJ2AAEDNW8sghc4m = strZLZeBXTMq0zDztBxtRTuCHrapQ;
    }

    public static final boolean VxUQ9tBhpHJ2AAEDNW8sghc4m(Context context, Eh21X7fdrXs eh21X7fdrXs) {
        String strLaeGQIruHQu81hfJldjMOQSVblH3x;
        Object next;
        Object objInvoke;
        ej6unYlOWMDF.pYmKDYlAmhudp(context, "context");
        ej6unYlOWMDF.pYmKDYlAmhudp(eh21X7fdrXs, "configuration");
        if (Build.VERSION.SDK_INT >= 28) {
            strLaeGQIruHQu81hfJldjMOQSVblH3x = kHXwlw9VpxBho.LaeGQIruHQu81hfJldjMOQSVblH3x();
        } else {
            strLaeGQIruHQu81hfJldjMOQSVblH3x = null;
            try {
                Method declaredMethod = Class.forName("android.app.ActivityThread", false, FLWIoSaHb1q8TqFvEBgPyRGrzvi6.class.getClassLoader()).getDeclaredMethod("currentProcessName", null);
                declaredMethod.setAccessible(true);
                objInvoke = declaredMethod.invoke(null, null);
                ej6unYlOWMDF.p59rPv72J9(objInvoke);
            } catch (Throwable th) {
                psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().zzpBGItXfub0yWj(VxUQ9tBhpHJ2AAEDNW8sghc4m, "Unable to check ActivityThread for processName", th);
            }
            if (objInvoke instanceof String) {
                strLaeGQIruHQu81hfJldjMOQSVblH3x = (String) objInvoke;
            } else {
                int iMyPid = Process.myPid();
                Object systemService = context.getSystemService("activity");
                ej6unYlOWMDF.Ca81ebIan1u(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    Iterator<T> it = runningAppProcesses.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((ActivityManager.RunningAppProcessInfo) next).pid == iMyPid) {
                            break;
                        }
                    }
                    ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                    if (runningAppProcessInfo != null) {
                        strLaeGQIruHQu81hfJldjMOQSVblH3x = runningAppProcessInfo.processName;
                    }
                }
            }
        }
        return ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(strLaeGQIruHQu81hfJldjMOQSVblH3x, context.getApplicationInfo().processName);
    }
}
