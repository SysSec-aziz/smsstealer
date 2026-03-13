package com.vdodsodjsdt;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class JbkwNtAVpvKC1OOTs {
    public static final lWFWbhxVImQVcJF82BX8sTg VxUQ9tBhpHJ2AAEDNW8sghc4m;

    static {
        String property;
        int i = ursTu5yfUDTCBVzqCa.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        Object next = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        try {
            Iterator it = Arrays.asList(new ZEY4EcFlSksffEsNvpKOPPoo4oK()).iterator();
            ej6unYlOWMDF.pYmKDYlAmhudp(it, "<this>");
            Iterator it2 = AJ4xefI8l4.L8DMw02rUTs2w(new C2qPpHyRqIplzG6ph0YFOs3(new YGu77UzqV7U(1, it))).iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    ((ZEY4EcFlSksffEsNvpKOPPoo4oK) next).getClass();
                    do {
                        ((ZEY4EcFlSksffEsNvpKOPPoo4oK) it2.next()).getClass();
                    } while (it2.hasNext());
                }
            }
            if (((ZEY4EcFlSksffEsNvpKOPPoo4oK) next) == null) {
                throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
            }
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == null) {
                throw new IllegalStateException("The main looper is not available");
            }
            VxUQ9tBhpHJ2AAEDNW8sghc4m = new lWFWbhxVImQVcJF82BX8sTg(m7csMXlqH9OiWj.VxUQ9tBhpHJ2AAEDNW8sghc4m(mainLooper), false);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
