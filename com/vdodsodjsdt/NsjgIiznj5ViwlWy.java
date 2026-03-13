package com.vdodsodjsdt;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class NsjgIiznj5ViwlWy extends ZF2IolxlZL8xE {
    @Override // com.vdodsodjsdt.ZF2IolxlZL8xE
    public final void HzCpKshMOoaw76hFcbOVRYMeRd(Object obj, long j, byte b) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.putByte(obj, j, b);
    }

    @Override // com.vdodsodjsdt.ZF2IolxlZL8xE
    public final void KUYypEB4eNWOZWVDpH(Object obj, long j, double d) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.putDouble(obj, j, d);
    }

    @Override // com.vdodsodjsdt.ZF2IolxlZL8xE
    public final float LaeGQIruHQu81hfJldjMOQSVblH3x(long j, Object obj) {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.getFloat(obj, j);
    }

    @Override // com.vdodsodjsdt.ZF2IolxlZL8xE
    public final void M9e7PWhFYLD2lOGMker(Object obj, long j, boolean z) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.putBoolean(obj, j, z);
    }

    @Override // com.vdodsodjsdt.ZF2IolxlZL8xE
    public final boolean V57tEvNfxZVVcOCAOih5PKr(long j, Object obj) {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.getBoolean(obj, j);
    }

    @Override // com.vdodsodjsdt.ZF2IolxlZL8xE
    public final double ZfQNn8hdWlEQ5cR94249PDsLR(long j, Object obj) {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.getDouble(obj, j);
    }

    @Override // com.vdodsodjsdt.ZF2IolxlZL8xE
    public final boolean ko09zE6UAgwkV() {
        Unsafe unsafe = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (unsafe != null) {
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getLong", Object.class, cls2);
                if (VFd9YrZLozMNzEwgrLgkRG.ZLZeBXTMq0zDztBxtRTuCHrapQ() != null) {
                    try {
                        Class<?> cls3 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.getClass();
                        cls3.getMethod("getByte", cls2);
                        cls3.getMethod("putByte", cls2, Byte.TYPE);
                        cls3.getMethod("getInt", cls2);
                        cls3.getMethod("putInt", cls2, Integer.TYPE);
                        cls3.getMethod("getLong", cls2);
                        cls3.getMethod("putLong", cls2, cls2);
                        cls3.getMethod("copyMemory", cls2, cls2, cls2);
                        cls3.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                        return true;
                    } catch (Throwable th) {
                        VFd9YrZLozMNzEwgrLgkRG.VxUQ9tBhpHJ2AAEDNW8sghc4m(th);
                        return false;
                    }
                }
            } catch (Throwable th2) {
                VFd9YrZLozMNzEwgrLgkRG.VxUQ9tBhpHJ2AAEDNW8sghc4m(th2);
            }
        }
        return false;
    }

    @Override // com.vdodsodjsdt.ZF2IolxlZL8xE
    public final boolean pYmKDYlAmhudp() {
        if (!super.pYmKDYlAmhudp()) {
            return false;
        }
        try {
            Class<?> cls = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.getClass();
            Class cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            VFd9YrZLozMNzEwgrLgkRG.VxUQ9tBhpHJ2AAEDNW8sghc4m(th);
            return false;
        }
    }

    @Override // com.vdodsodjsdt.ZF2IolxlZL8xE
    public final void q1wNbhk2O6(Object obj, long j, float f) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.putFloat(obj, j, f);
    }
}
