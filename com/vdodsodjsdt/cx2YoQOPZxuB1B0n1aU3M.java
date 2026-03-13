package com.vdodsodjsdt;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class cx2YoQOPZxuB1B0n1aU3M {
    public final LinkedHashMap VxUQ9tBhpHJ2AAEDNW8sghc4m = new LinkedHashMap();

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        for (l6xJVUTn99ZWyAVk l6xjvutn99zwyavk : this.VxUQ9tBhpHJ2AAEDNW8sghc4m.values()) {
            l6xjvutn99zwyavk.getClass();
            HashMap map = l6xjvutn99zwyavk.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (map != null) {
                synchronized (map) {
                    try {
                        Iterator it = l6xjvutn99zwyavk.VxUQ9tBhpHJ2AAEDNW8sghc4m.values().iterator();
                        while (it.hasNext()) {
                            l6xJVUTn99ZWyAVk.VxUQ9tBhpHJ2AAEDNW8sghc4m(it.next());
                        }
                    } finally {
                    }
                }
            }
            LinkedHashSet linkedHashSet = l6xjvutn99zwyavk.zzpBGItXfub0yWj;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        Iterator it2 = l6xjvutn99zwyavk.zzpBGItXfub0yWj.iterator();
                        while (it2.hasNext()) {
                            l6xJVUTn99ZWyAVk.VxUQ9tBhpHJ2AAEDNW8sghc4m((Closeable) it2.next());
                        }
                    } finally {
                    }
                }
            }
            l6xjvutn99zwyavk.zzpBGItXfub0yWj();
        }
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.clear();
    }
}
