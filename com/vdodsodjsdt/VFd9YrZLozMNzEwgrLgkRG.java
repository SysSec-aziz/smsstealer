package com.vdodsodjsdt;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class VFd9YrZLozMNzEwgrLgkRG {
    public static final boolean LaeGQIruHQu81hfJldjMOQSVblH3x;
    public static final ZF2IolxlZL8xE V57tEvNfxZVVcOCAOih5PKr;
    public static final Unsafe VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public static final boolean ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public static final boolean ZfQNn8hdWlEQ5cR94249PDsLR;
    public static final long zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public static final Class zzpBGItXfub0yWj;

    static {
        Unsafe unsafeGI83zq0G8e7zkn = GI83zq0G8e7zkn();
        VxUQ9tBhpHJ2AAEDNW8sghc4m = unsafeGI83zq0G8e7zkn;
        zzpBGItXfub0yWj = veLfYgyb53a07Ze9LkDO.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        boolean zNSjgqmGjEzuugn2SsG1mZFP = NSjgqmGjEzuugn2SsG1mZFP(Long.TYPE);
        boolean zNSjgqmGjEzuugn2SsG1mZFP2 = NSjgqmGjEzuugn2SsG1mZFP(Integer.TYPE);
        ZF2IolxlZL8xE nsjgIiznj5ViwlWy = null;
        if (unsafeGI83zq0G8e7zkn != null) {
            if (!veLfYgyb53a07Ze9LkDO.VxUQ9tBhpHJ2AAEDNW8sghc4m()) {
                nsjgIiznj5ViwlWy = new NsjgIiznj5ViwlWy(unsafeGI83zq0G8e7zkn);
            } else if (zNSjgqmGjEzuugn2SsG1mZFP) {
                nsjgIiznj5ViwlWy = new JNlU7iC3737L(unsafeGI83zq0G8e7zkn, 1);
            } else if (zNSjgqmGjEzuugn2SsG1mZFP2) {
                nsjgIiznj5ViwlWy = new JNlU7iC3737L(unsafeGI83zq0G8e7zkn, 0);
            }
        }
        V57tEvNfxZVVcOCAOih5PKr = nsjgIiznj5ViwlWy;
        ZfQNn8hdWlEQ5cR94249PDsLR = nsjgIiznj5ViwlWy == null ? false : nsjgIiznj5ViwlWy.ko09zE6UAgwkV();
        LaeGQIruHQu81hfJldjMOQSVblH3x = nsjgIiznj5ViwlWy == null ? false : nsjgIiznj5ViwlWy.pYmKDYlAmhudp();
        zIvmSL0wzmmKGc3X39b2Gw2mUGE = LaeGQIruHQu81hfJldjMOQSVblH3x(byte[].class);
        LaeGQIruHQu81hfJldjMOQSVblH3x(boolean[].class);
        zIvmSL0wzmmKGc3X39b2Gw2mUGE(boolean[].class);
        LaeGQIruHQu81hfJldjMOQSVblH3x(int[].class);
        zIvmSL0wzmmKGc3X39b2Gw2mUGE(int[].class);
        LaeGQIruHQu81hfJldjMOQSVblH3x(long[].class);
        zIvmSL0wzmmKGc3X39b2Gw2mUGE(long[].class);
        LaeGQIruHQu81hfJldjMOQSVblH3x(float[].class);
        zIvmSL0wzmmKGc3X39b2Gw2mUGE(float[].class);
        LaeGQIruHQu81hfJldjMOQSVblH3x(double[].class);
        zIvmSL0wzmmKGc3X39b2Gw2mUGE(double[].class);
        LaeGQIruHQu81hfJldjMOQSVblH3x(Object[].class);
        zIvmSL0wzmmKGc3X39b2Gw2mUGE(Object[].class);
        Field fieldZLZeBXTMq0zDztBxtRTuCHrapQ = ZLZeBXTMq0zDztBxtRTuCHrapQ();
        if (fieldZLZeBXTMq0zDztBxtRTuCHrapQ != null && nsjgIiznj5ViwlWy != null) {
            nsjgIiznj5ViwlWy.GI83zq0G8e7zkn(fieldZLZeBXTMq0zDztBxtRTuCHrapQ);
        }
        ZLZeBXTMq0zDztBxtRTuCHrapQ = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void Ca81ebIan1u(Object obj, long j, Object obj2) {
        V57tEvNfxZVVcOCAOih5PKr.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(obj, j, obj2);
    }

    public static Unsafe GI83zq0G8e7zkn() {
        try {
            return (Unsafe) AccessController.doPrivileged(new el9Bplfm49v());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void HzCpKshMOoaw76hFcbOVRYMeRd(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int iZIvmSL0wzmmKGc3X39b2Gw2mUGE = V57tEvNfxZVVcOCAOih5PKr.zIvmSL0wzmmKGc3X39b2Gw2mUGE(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        q1wNbhk2O6(obj, j2, ((255 & b) << i) | (iZIvmSL0wzmmKGc3X39b2Gw2mUGE & (~(255 << i))));
    }

    public static void KUYypEB4eNWOZWVDpH(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        q1wNbhk2O6(obj, j2, ((255 & b) << i) | (V57tEvNfxZVVcOCAOih5PKr.zIvmSL0wzmmKGc3X39b2Gw2mUGE(j2, obj) & (~(255 << i))));
    }

    public static int LaeGQIruHQu81hfJldjMOQSVblH3x(Class cls) {
        if (LaeGQIruHQu81hfJldjMOQSVblH3x) {
            return V57tEvNfxZVVcOCAOih5PKr.VxUQ9tBhpHJ2AAEDNW8sghc4m(cls);
        }
        return -1;
    }

    public static void M9e7PWhFYLD2lOGMker(byte[] bArr, long j, byte b) {
        V57tEvNfxZVVcOCAOih5PKr.HzCpKshMOoaw76hFcbOVRYMeRd(bArr, zIvmSL0wzmmKGc3X39b2Gw2mUGE + j, b);
    }

    public static boolean NSjgqmGjEzuugn2SsG1mZFP(Class cls) {
        if (!veLfYgyb53a07Ze9LkDO.VxUQ9tBhpHJ2AAEDNW8sghc4m()) {
            return false;
        }
        try {
            Class cls2 = zzpBGItXfub0yWj;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean V57tEvNfxZVVcOCAOih5PKr(long j, Object obj) {
        return ((byte) ((V57tEvNfxZVVcOCAOih5PKr.zIvmSL0wzmmKGc3X39b2Gw2mUGE((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static void VxUQ9tBhpHJ2AAEDNW8sghc4m(Throwable th) {
        Logger.getLogger(VFd9YrZLozMNzEwgrLgkRG.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static Field ZLZeBXTMq0zDztBxtRTuCHrapQ() {
        Field declaredField;
        Field declaredField2;
        if (veLfYgyb53a07Ze9LkDO.VxUQ9tBhpHJ2AAEDNW8sghc4m()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static Object ZfQNn8hdWlEQ5cR94249PDsLR(Class cls) {
        try {
            return VxUQ9tBhpHJ2AAEDNW8sghc4m.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static void p59rPv72J9(Object obj, long j, long j2) {
        V57tEvNfxZVVcOCAOih5PKr.Ca81ebIan1u(obj, j, j2);
    }

    public static void q1wNbhk2O6(Object obj, long j, int i) {
        V57tEvNfxZVVcOCAOih5PKr.p59rPv72J9(obj, j, i);
    }

    public static void zIvmSL0wzmmKGc3X39b2Gw2mUGE(Class cls) {
        if (LaeGQIruHQu81hfJldjMOQSVblH3x) {
            V57tEvNfxZVVcOCAOih5PKr.zzpBGItXfub0yWj(cls);
        }
    }

    public static boolean zzpBGItXfub0yWj(long j, Object obj) {
        return ((byte) ((V57tEvNfxZVVcOCAOih5PKr.zIvmSL0wzmmKGc3X39b2Gw2mUGE((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }
}
