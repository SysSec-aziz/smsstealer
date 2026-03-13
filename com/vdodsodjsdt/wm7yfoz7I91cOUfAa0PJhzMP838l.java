package com.vdodsodjsdt;

import java.lang.reflect.Method;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wm7yfoz7I91cOUfAa0PJhzMP838l {
    public static final Method VxUQ9tBhpHJ2AAEDNW8sghc4m;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        VxUQ9tBhpHJ2AAEDNW8sghc4m = method;
    }
}
