package com.vdodsodjsdt;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class Mw5vHRo4LaQY00jiXFZzZGjJzcG {
    private volatile AtomicReferenceArray<Object> array;

    public Mw5vHRo4LaQY00jiXFZzZGjJzcG(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    public final void V57tEvNfxZVVcOCAOih5PKr(int i, sTzYPOTbUD8EG1LT3B stzypotbud8eg1lt3b) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, stzypotbud8eg1lt3b);
            return;
        }
        int i2 = i + 1;
        int i3 = length * 2;
        if (i2 < i3) {
            i2 = i3;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i2);
        for (int i4 = 0; i4 < length; i4++) {
            atomicReferenceArray2.set(i4, atomicReferenceArray.get(i4));
        }
        atomicReferenceArray2.set(i, stzypotbud8eg1lt3b);
        this.array = atomicReferenceArray2;
    }

    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return this.array.length();
    }

    public final Object zzpBGItXfub0yWj(int i) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }
}
