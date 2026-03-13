package com.vdodsodjsdt;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class clmXQElKQErsWmPESUUTvu {
    public static final bZonrKCuJyDEES VxUQ9tBhpHJ2AAEDNW8sghc4m = new bZonrKCuJyDEES();
    public static final Object zzpBGItXfub0yWj = new Object();
    public static FG8LIxsgYiLSfhN0jYKIKr V57tEvNfxZVVcOCAOih5PKr = null;

    /* JADX WARN: Removed duplicated region for block: B:101:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void V57tEvNfxZVVcOCAOih5PKr(android.content.Context r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.clmXQElKQErsWmPESUUTvu.V57tEvNfxZVVcOCAOih5PKr(android.content.Context, boolean):void");
    }

    public static long VxUQ9tBhpHJ2AAEDNW8sghc4m(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? OHRoAMjK5gn3.zzpBGItXfub0yWj(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static FG8LIxsgYiLSfhN0jYKIKr zzpBGItXfub0yWj() {
        FG8LIxsgYiLSfhN0jYKIKr fG8LIxsgYiLSfhN0jYKIKr = new FG8LIxsgYiLSfhN0jYKIKr(24);
        V57tEvNfxZVVcOCAOih5PKr = fG8LIxsgYiLSfhN0jYKIKr;
        VxUQ9tBhpHJ2AAEDNW8sghc4m.M9e7PWhFYLD2lOGMker(fG8LIxsgYiLSfhN0jYKIKr);
        return V57tEvNfxZVVcOCAOih5PKr;
    }
}
