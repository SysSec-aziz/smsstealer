package com.vdodsodjsdt;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class FW3x5e9T3dYt {
    public final AtomicReferenceArray VxUQ9tBhpHJ2AAEDNW8sghc4m = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;
    public static final /* synthetic */ AtomicReferenceFieldUpdater zzpBGItXfub0yWj = AtomicReferenceFieldUpdater.newUpdater(FW3x5e9T3dYt.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater V57tEvNfxZVVcOCAOih5PKr = AtomicIntegerFieldUpdater.newUpdater(FW3x5e9T3dYt.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater ZfQNn8hdWlEQ5cR94249PDsLR = AtomicIntegerFieldUpdater.newUpdater(FW3x5e9T3dYt.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater LaeGQIruHQu81hfJldjMOQSVblH3x = AtomicIntegerFieldUpdater.newUpdater(FW3x5e9T3dYt.class, "blockingTasksInBuffer$volatile");

    public final t8wLTr4ubNX0huCA8 V57tEvNfxZVVcOCAOih5PKr(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        t8wLTr4ubNX0huCA8 t8wltr4ubnx0huca8 = (t8wLTr4ubNX0huCA8) atomicReferenceArray.get(i2);
        if (t8wltr4ubnx0huca8 != null) {
            if ((t8wltr4ubnx0huca8.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m == 1) == z) {
                while (!atomicReferenceArray.compareAndSet(i2, t8wltr4ubnx0huca8, null)) {
                    if (atomicReferenceArray.get(i2) != t8wltr4ubnx0huca8) {
                    }
                }
                if (z) {
                    LaeGQIruHQu81hfJldjMOQSVblH3x.decrementAndGet(this);
                }
                return t8wltr4ubnx0huca8;
            }
        }
        return null;
    }

    public final t8wLTr4ubNX0huCA8 VxUQ9tBhpHJ2AAEDNW8sghc4m(t8wLTr4ubNX0huCA8 t8wltr4ubnx0huca8) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = V57tEvNfxZVVcOCAOih5PKr;
        if (atomicIntegerFieldUpdater.get(this) - ZfQNn8hdWlEQ5cR94249PDsLR.get(this) == 127) {
            return t8wltr4ubnx0huca8;
        }
        if (t8wltr4ubnx0huca8.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m == 1) {
            LaeGQIruHQu81hfJldjMOQSVblH3x.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, t8wltr4ubnx0huca8);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final t8wLTr4ubNX0huCA8 zzpBGItXfub0yWj() {
        t8wLTr4ubNX0huCA8 t8wltr4ubnx0huca8;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ZfQNn8hdWlEQ5cR94249PDsLR;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - V57tEvNfxZVVcOCAOih5PKr.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (t8wltr4ubnx0huca8 = (t8wLTr4ubNX0huCA8) this.VxUQ9tBhpHJ2AAEDNW8sghc4m.getAndSet(i2, null)) != null) {
                if (t8wltr4ubnx0huca8.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m == 1) {
                    LaeGQIruHQu81hfJldjMOQSVblH3x.decrementAndGet(this);
                }
                return t8wltr4ubnx0huca8;
            }
        }
    }
}
