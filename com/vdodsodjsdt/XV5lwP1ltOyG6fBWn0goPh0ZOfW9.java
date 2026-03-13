package com.vdodsodjsdt;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class XV5lwP1ltOyG6fBWn0goPh0ZOfW9 {
    public static final AtomicReference[] V57tEvNfxZVVcOCAOih5PKr;
    public static final tpWzSW479hfzvFH5 VxUQ9tBhpHJ2AAEDNW8sghc4m = new tpWzSW479hfzvFH5(new byte[0], 0, 0, false);
    public static final int zzpBGItXfub0yWj;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        zzpBGItXfub0yWj = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        V57tEvNfxZVVcOCAOih5PKr = atomicReferenceArr;
    }

    public static final void VxUQ9tBhpHJ2AAEDNW8sghc4m(tpWzSW479hfzvFH5 tpwzsw479hfzvfh5) {
        ej6unYlOWMDF.pYmKDYlAmhudp(tpwzsw479hfzvfh5, "segment");
        if (tpwzsw479hfzvfh5.zIvmSL0wzmmKGc3X39b2Gw2mUGE != null || tpwzsw479hfzvfh5.ZLZeBXTMq0zDztBxtRTuCHrapQ != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (tpwzsw479hfzvfh5.ZfQNn8hdWlEQ5cR94249PDsLR) {
            return;
        }
        AtomicReference atomicReference = V57tEvNfxZVVcOCAOih5PKr[(int) (Thread.currentThread().getId() & (((long) zzpBGItXfub0yWj) - 1))];
        tpWzSW479hfzvFH5 tpwzsw479hfzvfh52 = VxUQ9tBhpHJ2AAEDNW8sghc4m;
        tpWzSW479hfzvFH5 tpwzsw479hfzvfh53 = (tpWzSW479hfzvFH5) atomicReference.getAndSet(tpwzsw479hfzvfh52);
        if (tpwzsw479hfzvfh53 == tpwzsw479hfzvfh52) {
            return;
        }
        int i = tpwzsw479hfzvfh53 != null ? tpwzsw479hfzvfh53.V57tEvNfxZVVcOCAOih5PKr : 0;
        if (i >= 65536) {
            atomicReference.set(tpwzsw479hfzvfh53);
            return;
        }
        tpwzsw479hfzvfh5.zIvmSL0wzmmKGc3X39b2Gw2mUGE = tpwzsw479hfzvfh53;
        tpwzsw479hfzvfh5.zzpBGItXfub0yWj = 0;
        tpwzsw479hfzvfh5.V57tEvNfxZVVcOCAOih5PKr = i + 8192;
        atomicReference.set(tpwzsw479hfzvfh5);
    }

    public static final tpWzSW479hfzvFH5 zzpBGItXfub0yWj() {
        AtomicReference atomicReference = V57tEvNfxZVVcOCAOih5PKr[(int) (Thread.currentThread().getId() & (((long) zzpBGItXfub0yWj) - 1))];
        tpWzSW479hfzvFH5 tpwzsw479hfzvfh5 = VxUQ9tBhpHJ2AAEDNW8sghc4m;
        tpWzSW479hfzvFH5 tpwzsw479hfzvfh52 = (tpWzSW479hfzvFH5) atomicReference.getAndSet(tpwzsw479hfzvfh5);
        if (tpwzsw479hfzvfh52 == tpwzsw479hfzvfh5) {
            return new tpWzSW479hfzvFH5();
        }
        if (tpwzsw479hfzvfh52 == null) {
            atomicReference.set(null);
            return new tpWzSW479hfzvFH5();
        }
        atomicReference.set(tpwzsw479hfzvfh52.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
        tpwzsw479hfzvfh52.zIvmSL0wzmmKGc3X39b2Gw2mUGE = null;
        tpwzsw479hfzvfh52.V57tEvNfxZVVcOCAOih5PKr = 0;
        return tpwzsw479hfzvfh52;
    }
}
