package com.vdodsodjsdt;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class nsJ9ALrZ6TWaNF8zof1 extends JkUsygN4dyg6Qg9dzqNc {
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ Method zzpBGItXfub0yWj;

    public nsJ9ALrZ6TWaNF8zof1(int i, Method method) {
        this.zzpBGItXfub0yWj = method;
        this.V57tEvNfxZVVcOCAOih5PKr = i;
    }

    @Override // com.vdodsodjsdt.JkUsygN4dyg6Qg9dzqNc
    public final Object VxUQ9tBhpHJ2AAEDNW8sghc4m(Class cls) {
        String strVxUQ9tBhpHJ2AAEDNW8sghc4m = o0x3OWMw3He.VxUQ9tBhpHJ2AAEDNW8sghc4m(cls);
        if (strVxUQ9tBhpHJ2AAEDNW8sghc4m != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strVxUQ9tBhpHJ2AAEDNW8sghc4m));
        }
        return this.zzpBGItXfub0yWj.invoke(null, cls, Integer.valueOf(this.V57tEvNfxZVVcOCAOih5PKr));
    }
}
