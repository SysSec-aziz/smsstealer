package com.vdodsodjsdt;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class TtcSu7NdvSAZTEeHznS9 {
    public static final Method VxUQ9tBhpHJ2AAEDNW8sghc4m;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        ej6unYlOWMDF.p59rPv72J9(methods);
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(parameterTypes, "getParameterTypes(...)");
                if (ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        VxUQ9tBhpHJ2AAEDNW8sghc4m = method;
        int length2 = methods.length;
        for (int i2 = 0; i2 < length2 && !ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(methods[i2].getName(), "getSuppressed"); i2++) {
        }
    }
}
