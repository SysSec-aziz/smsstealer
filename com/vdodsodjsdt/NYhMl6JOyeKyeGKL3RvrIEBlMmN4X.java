package com.vdodsodjsdt;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class NYhMl6JOyeKyeGKL3RvrIEBlMmN4X extends eAZzwKf05brkM {
    public static final w3bGiKJlQbIXyK V57tEvNfxZVVcOCAOih5PKr = new w3bGiKJlQbIXyK();
    public final Class VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final MoUwZm6CDldGf35 zzpBGItXfub0yWj;

    public NYhMl6JOyeKyeGKL3RvrIEBlMmN4X(Tt3445ZYXN tt3445ZYXN, eAZzwKf05brkM eazzwkf05brkm, Class cls) {
        this.zzpBGItXfub0yWj = new MoUwZm6CDldGf35(tt3445ZYXN, eazzwkf05brkm, cls);
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = cls;
    }

    @Override // com.vdodsodjsdt.eAZzwKf05brkM
    public final void V57tEvNfxZVVcOCAOih5PKr(tVkLQdIevlOoRF1qYmTyvenTzI tvklqdievloorf1qymtyventzi, Object obj) throws IOException {
        if (obj == null) {
            tvklqdievloorf1qymtyventzi.pzqP2AqKW6J5PO8zCKnW();
            return;
        }
        tvklqdievloorf1qymtyventzi.V57tEvNfxZVVcOCAOih5PKr();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.zzpBGItXfub0yWj.V57tEvNfxZVVcOCAOih5PKr(tvklqdievloorf1qymtyventzi, Array.get(obj, i));
        }
        tvklqdievloorf1qymtyventzi.KUYypEB4eNWOZWVDpH();
    }

    @Override // com.vdodsodjsdt.eAZzwKf05brkM
    public final Object zzpBGItXfub0yWj(Gzdlhdn1ss gzdlhdn1ss) throws IOException {
        if (gzdlhdn1ss.wRCD0SdqWCowdYU7bmzN() == 9) {
            gzdlhdn1ss.d9zDyyznnp3oaDT1Ug();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        gzdlhdn1ss.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        while (gzdlhdn1ss.pzqP2AqKW6J5PO8zCKnW()) {
            arrayList.add(this.zzpBGItXfub0yWj.V57tEvNfxZVVcOCAOih5PKr.zzpBGItXfub0yWj(gzdlhdn1ss));
        }
        gzdlhdn1ss.KUYypEB4eNWOZWVDpH();
        int size = arrayList.size();
        Class cls = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i = 0; i < size; i++) {
            Array.set(objNewInstance, i, arrayList.get(i));
        }
        return objNewInstance;
    }
}
