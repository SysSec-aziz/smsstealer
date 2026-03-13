package com.vdodsodjsdt;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class hl6rWWjmp9L extends ThreadLocal {
    public final /* synthetic */ int VxUQ9tBhpHJ2AAEDNW8sghc4m;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(U7JVXX1Kyh43VgUF.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                return simpleDateFormat;
            default:
                return new Random();
        }
    }
}
