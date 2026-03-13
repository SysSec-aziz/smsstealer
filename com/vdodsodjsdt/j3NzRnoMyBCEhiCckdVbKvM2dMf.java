package com.vdodsodjsdt;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class j3NzRnoMyBCEhiCckdVbKvM2dMf implements Comparator {
    public final /* synthetic */ int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public static final j3NzRnoMyBCEhiCckdVbKvM2dMf zzpBGItXfub0yWj = new j3NzRnoMyBCEhiCckdVbKvM2dMf(0);
    public static final j3NzRnoMyBCEhiCckdVbKvM2dMf V57tEvNfxZVVcOCAOih5PKr = new j3NzRnoMyBCEhiCckdVbKvM2dMf(1);

    public /* synthetic */ j3NzRnoMyBCEhiCckdVbKvM2dMf(int i) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                ej6unYlOWMDF.pYmKDYlAmhudp(comparable, "a");
                ej6unYlOWMDF.pYmKDYlAmhudp(comparable2, "b");
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                ej6unYlOWMDF.pYmKDYlAmhudp(comparable3, "a");
                ej6unYlOWMDF.pYmKDYlAmhudp(comparable4, "b");
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                return V57tEvNfxZVVcOCAOih5PKr;
            default:
                return zzpBGItXfub0yWj;
        }
    }
}
