package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class veLfYgyb53a07Ze9LkDO {
    public static final Class VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public static final boolean zzpBGItXfub0yWj;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        VxUQ9tBhpHJ2AAEDNW8sghc4m = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        zzpBGItXfub0yWj = cls2 != null;
    }

    public static boolean VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return (VxUQ9tBhpHJ2AAEDNW8sghc4m == null || zzpBGItXfub0yWj) ? false : true;
    }
}
