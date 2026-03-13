package com.vdodsodjsdt;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fw6arzf1nhE87EaA extends D0vuyCrFBAWQbRciLh0X implements EbZPfT79guDT {
    public static final /* synthetic */ AtomicIntegerFieldUpdater ZfQNn8hdWlEQ5cR94249PDsLR = AtomicIntegerFieldUpdater.newUpdater(fw6arzf1nhE87EaA.class, "cleanedAndPointers$volatile");
    public final long V57tEvNfxZVVcOCAOih5PKr;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public fw6arzf1nhE87EaA(long j, fw6arzf1nhE87EaA fw6arzf1nhe87eaa, int i) {
        super(fw6arzf1nhe87eaa);
        this.V57tEvNfxZVVcOCAOih5PKr = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    public final boolean GI83zq0G8e7zkn() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = ZfQNn8hdWlEQ5cR94249PDsLR;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == zIvmSL0wzmmKGc3X39b2Gw2mUGE() && zzpBGItXfub0yWj() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }

    public final boolean LaeGQIruHQu81hfJldjMOQSVblH3x() {
        return ZfQNn8hdWlEQ5cR94249PDsLR.addAndGet(this, -65536) == zIvmSL0wzmmKGc3X39b2Gw2mUGE() && zzpBGItXfub0yWj() != null;
    }

    public final void NSjgqmGjEzuugn2SsG1mZFP() {
        if (ZfQNn8hdWlEQ5cR94249PDsLR.incrementAndGet(this) == zIvmSL0wzmmKGc3X39b2Gw2mUGE()) {
            ZfQNn8hdWlEQ5cR94249PDsLR();
        }
    }

    @Override // com.vdodsodjsdt.D0vuyCrFBAWQbRciLh0X
    public final boolean V57tEvNfxZVVcOCAOih5PKr() {
        return ZfQNn8hdWlEQ5cR94249PDsLR.get(this) == zIvmSL0wzmmKGc3X39b2Gw2mUGE() && zzpBGItXfub0yWj() != null;
    }

    public abstract void ZLZeBXTMq0zDztBxtRTuCHrapQ(int i, D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFW);

    public abstract int zIvmSL0wzmmKGc3X39b2Gw2mUGE();
}
