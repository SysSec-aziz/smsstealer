package com.vdodsodjsdt;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class JkUsygN4dyg6Qg9dzqNc {
    public static final JkUsygN4dyg6Qg9dzqNc VxUQ9tBhpHJ2AAEDNW8sghc4m;

    static {
        JkUsygN4dyg6Qg9dzqNc yTtfa1RaE6JanqYZT51I7HePrMT36;
        try {
            try {
                try {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    yTtfa1RaE6JanqYZT51I7HePrMT36 = new RES88xoZRphtGR3L(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
                } catch (Exception unused) {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    yTtfa1RaE6JanqYZT51I7HePrMT36 = new nsJ9ALrZ6TWaNF8zof1(iIntValue, declaredMethod2);
                }
            } catch (Exception unused2) {
                Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                yTtfa1RaE6JanqYZT51I7HePrMT36 = new QWhszRO7PSCAV(declaredMethod3);
            }
        } catch (Exception unused3) {
            yTtfa1RaE6JanqYZT51I7HePrMT36 = new YTtfa1RaE6JanqYZT51I7HePrMT36();
        }
        VxUQ9tBhpHJ2AAEDNW8sghc4m = yTtfa1RaE6JanqYZT51I7HePrMT36;
    }

    public abstract Object VxUQ9tBhpHJ2AAEDNW8sghc4m(Class cls);
}
