package com.vdodsodjsdt;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ZF2IolxlZL8xE {
    public final Unsafe VxUQ9tBhpHJ2AAEDNW8sghc4m;

    public ZF2IolxlZL8xE(Unsafe unsafe) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = unsafe;
    }

    public final void Ca81ebIan1u(Object obj, long j, long j2) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.putLong(obj, j, j2);
    }

    public final long GI83zq0G8e7zkn(Field field) {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.objectFieldOffset(field);
    }

    public abstract void HzCpKshMOoaw76hFcbOVRYMeRd(Object obj, long j, byte b);

    public abstract void KUYypEB4eNWOZWVDpH(Object obj, long j, double d);

    public abstract float LaeGQIruHQu81hfJldjMOQSVblH3x(long j, Object obj);

    public abstract void M9e7PWhFYLD2lOGMker(Object obj, long j, boolean z);

    public final Object NSjgqmGjEzuugn2SsG1mZFP(long j, Object obj) {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.getObject(obj, j);
    }

    public abstract boolean V57tEvNfxZVVcOCAOih5PKr(long j, Object obj);

    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m(Class cls) {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.arrayBaseOffset(cls);
    }

    public final long ZLZeBXTMq0zDztBxtRTuCHrapQ(long j, Object obj) {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.getLong(obj, j);
    }

    public abstract double ZfQNn8hdWlEQ5cR94249PDsLR(long j, Object obj);

    public final void h3jnZRsdwYJfY9UhQCkbvWciwvFHv(Object obj, long j, Object obj2) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.putObject(obj, j, obj2);
    }

    public abstract boolean ko09zE6UAgwkV();

    public final void p59rPv72J9(Object obj, long j, int i) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.putInt(obj, j, i);
    }

    public boolean pYmKDYlAmhudp() {
        Unsafe unsafe = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            VFd9YrZLozMNzEwgrLgkRG.VxUQ9tBhpHJ2AAEDNW8sghc4m(th);
            return false;
        }
    }

    public abstract void q1wNbhk2O6(Object obj, long j, float f);

    public final int zIvmSL0wzmmKGc3X39b2Gw2mUGE(long j, Object obj) {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.getInt(obj, j);
    }

    public final int zzpBGItXfub0yWj(Class cls) {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.arrayIndexScale(cls);
    }
}
