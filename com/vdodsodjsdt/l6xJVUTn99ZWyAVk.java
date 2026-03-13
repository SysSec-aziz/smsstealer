package com.vdodsodjsdt;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l6xJVUTn99ZWyAVk {
    public final HashMap VxUQ9tBhpHJ2AAEDNW8sghc4m = new HashMap();
    public final LinkedHashSet zzpBGItXfub0yWj = new LinkedHashSet();

    public static void VxUQ9tBhpHJ2AAEDNW8sghc4m(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void zzpBGItXfub0yWj() {
    }
}
