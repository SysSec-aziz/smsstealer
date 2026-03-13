package com.vdodsodjsdt;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class zbZ1zJdkjn6PYiYfQHZRcvjvjCFhU {
    public static final zbZ1zJdkjn6PYiYfQHZRcvjvjCFhU V57tEvNfxZVVcOCAOih5PKr = new zbZ1zJdkjn6PYiYfQHZRcvjvjCFhU();
    public final HashMap VxUQ9tBhpHJ2AAEDNW8sghc4m = new HashMap();
    public final HashMap zzpBGItXfub0yWj = new HashMap();

    public static void zzpBGItXfub0yWj(HashMap map, EUA9XibSHCTfMcY6HvaoZW eUA9XibSHCTfMcY6HvaoZW, XOTOHmUA5NYhlyOBh7 xOTOHmUA5NYhlyOBh7, Class cls) {
        XOTOHmUA5NYhlyOBh7 xOTOHmUA5NYhlyOBh72 = (XOTOHmUA5NYhlyOBh7) map.get(eUA9XibSHCTfMcY6HvaoZW);
        if (xOTOHmUA5NYhlyOBh72 == null || xOTOHmUA5NYhlyOBh7 == xOTOHmUA5NYhlyOBh72) {
            if (xOTOHmUA5NYhlyOBh72 == null) {
                map.put(eUA9XibSHCTfMcY6HvaoZW, xOTOHmUA5NYhlyOBh7);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + eUA9XibSHCTfMcY6HvaoZW.zzpBGItXfub0yWj.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + xOTOHmUA5NYhlyOBh72 + ", new value " + xOTOHmUA5NYhlyOBh7);
    }

    public final gDY2Y75we8ufAoe VxUQ9tBhpHJ2AAEDNW8sghc4m(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (superclass != null) {
            gDY2Y75we8ufAoe gdy2y75we8ufaoeVxUQ9tBhpHJ2AAEDNW8sghc4m = (gDY2Y75we8ufAoe) map2.get(superclass);
            if (gdy2y75we8ufaoeVxUQ9tBhpHJ2AAEDNW8sghc4m == null) {
                gdy2y75we8ufaoeVxUQ9tBhpHJ2AAEDNW8sghc4m = VxUQ9tBhpHJ2AAEDNW8sghc4m(superclass, null);
            }
            map.putAll(gdy2y75we8ufaoeVxUQ9tBhpHJ2AAEDNW8sghc4m.zzpBGItXfub0yWj);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            gDY2Y75we8ufAoe gdy2y75we8ufaoeVxUQ9tBhpHJ2AAEDNW8sghc4m2 = (gDY2Y75we8ufAoe) map2.get(cls2);
            if (gdy2y75we8ufaoeVxUQ9tBhpHJ2AAEDNW8sghc4m2 == null) {
                gdy2y75we8ufaoeVxUQ9tBhpHJ2AAEDNW8sghc4m2 = VxUQ9tBhpHJ2AAEDNW8sghc4m(cls2, null);
            }
            for (Map.Entry entry : gdy2y75we8ufaoeVxUQ9tBhpHJ2AAEDNW8sghc4m2.zzpBGItXfub0yWj.entrySet()) {
                zzpBGItXfub0yWj(map, (EUA9XibSHCTfMcY6HvaoZW) entry.getKey(), (XOTOHmUA5NYhlyOBh7) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            QV6gHlM4XkzX4QwejZQx qV6gHlM4XkzX4QwejZQx = (QV6gHlM4XkzX4QwejZQx) method.getAnnotation(QV6gHlM4XkzX4QwejZQx.class);
            if (qV6gHlM4XkzX4QwejZQx != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!hCgEybj69le8.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                XOTOHmUA5NYhlyOBh7 xOTOHmUA5NYhlyOBh7Value = qV6gHlM4XkzX4QwejZQx.value();
                if (parameterTypes.length > 1) {
                    if (!XOTOHmUA5NYhlyOBh7.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (xOTOHmUA5NYhlyOBh7Value != XOTOHmUA5NYhlyOBh7.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                zzpBGItXfub0yWj(map, new EUA9XibSHCTfMcY6HvaoZW(i, method), xOTOHmUA5NYhlyOBh7Value, cls);
                z = true;
            }
        }
        gDY2Y75we8ufAoe gdy2y75we8ufaoe = new gDY2Y75we8ufAoe(map);
        map2.put(cls, gdy2y75we8ufaoe);
        this.zzpBGItXfub0yWj.put(cls, Boolean.valueOf(z));
        return gdy2y75we8ufaoe;
    }
}
