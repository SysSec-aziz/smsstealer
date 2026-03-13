package com.vdodsodjsdt;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class gHXBIIhsUHosFRVh36G1cLOZ9o extends yB0MgkQF0w4aWkiL0rHiqFb54ZHEs {
    public static final /* synthetic */ AtomicIntegerFieldUpdater ZLZeBXTMq0zDztBxtRTuCHrapQ = AtomicIntegerFieldUpdater.newUpdater(gHXBIIhsUHosFRVh36G1cLOZ9o.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // com.vdodsodjsdt.yB0MgkQF0w4aWkiL0rHiqFb54ZHEs, com.vdodsodjsdt.fXGTDnUxIdCVHFvA63E
    public final void h3jnZRsdwYJfY9UhQCkbvWciwvFHv(Object obj) {
        pYmKDYlAmhudp(obj);
    }

    @Override // com.vdodsodjsdt.yB0MgkQF0w4aWkiL0rHiqFb54ZHEs, com.vdodsodjsdt.fXGTDnUxIdCVHFvA63E
    public final void pYmKDYlAmhudp(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = ZLZeBXTMq0zDztBxtRTuCHrapQ;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                F44whnLsbQ.vXWl0o6I4U59CgHs9(sGipz63rTUmSj3uFDvOtzihao.qNPQb1obP7(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE), hRrPPME7ytOB7ba.RhfGHxtXxy0M0grmp2jkRjQg(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
