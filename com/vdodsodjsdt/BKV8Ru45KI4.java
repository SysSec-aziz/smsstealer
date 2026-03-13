package com.vdodsodjsdt;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class BKV8Ru45KI4 extends LL6zXCXfmDYzdHCRTT implements w1TUuqPealEllpif2 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater M9e7PWhFYLD2lOGMker = AtomicIntegerFieldUpdater.newUpdater(BKV8Ru45KI4.class, "runningWorkers$volatile");
    public final Object GI83zq0G8e7zkn;
    public final LL6zXCXfmDYzdHCRTT LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final IH3WvI2UETwb5vlZXff5 NSjgqmGjEzuugn2SsG1mZFP;
    public final /* synthetic */ w1TUuqPealEllpif2 ZLZeBXTMq0zDztBxtRTuCHrapQ;
    private volatile /* synthetic */ int runningWorkers$volatile;
    public final int zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    /* JADX WARN: Multi-variable type inference failed */
    public BKV8Ru45KI4(LL6zXCXfmDYzdHCRTT lL6zXCXfmDYzdHCRTT, int i) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = lL6zXCXfmDYzdHCRTT;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i;
        w1TUuqPealEllpif2 w1tuuqpealellpif2 = lL6zXCXfmDYzdHCRTT instanceof w1TUuqPealEllpif2 ? (w1TUuqPealEllpif2) lL6zXCXfmDYzdHCRTT : null;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = w1tuuqpealellpif2 == null ? ZvAHVaT4O4c.VxUQ9tBhpHJ2AAEDNW8sghc4m : w1tuuqpealellpif2;
        this.NSjgqmGjEzuugn2SsG1mZFP = new IH3WvI2UETwb5vlZXff5();
        this.GI83zq0G8e7zkn = new Object();
    }

    @Override // com.vdodsodjsdt.w1TUuqPealEllpif2
    public final void LaeGQIruHQu81hfJldjMOQSVblH3x(long j, YAf4BMDpiCAb4hYaN6VqW yAf4BMDpiCAb4hYaN6VqW) {
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ.LaeGQIruHQu81hfJldjMOQSVblH3x(j, yAf4BMDpiCAb4hYaN6VqW);
    }

    public final boolean O1xDAlBZZlZdoEf747lCFHld() {
        synchronized (this.GI83zq0G8e7zkn) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = M9e7PWhFYLD2lOGMker;
            if (atomicIntegerFieldUpdater.get(this) >= this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // com.vdodsodjsdt.LL6zXCXfmDYzdHCRTT
    public final void SuB3hEmTmbbRGAhtvOOmfKEon(D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFW, Runnable runnable) {
        Runnable runnableVE4yDIjexsP2lGjLaTcB;
        this.NSjgqmGjEzuugn2SsG1mZFP.VxUQ9tBhpHJ2AAEDNW8sghc4m(runnable);
        if (M9e7PWhFYLD2lOGMker.get(this) >= this.zIvmSL0wzmmKGc3X39b2Gw2mUGE || !O1xDAlBZZlZdoEf747lCFHld() || (runnableVE4yDIjexsP2lGjLaTcB = vE4yDIjexsP2lGjLaTcB()) == null) {
            return;
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x.SuB3hEmTmbbRGAhtvOOmfKEon(this, new gZVesoHrfMaGvAvfBsRIr(8, this, runnableVE4yDIjexsP2lGjLaTcB));
    }

    @Override // com.vdodsodjsdt.LL6zXCXfmDYzdHCRTT
    public final void pzqP2AqKW6J5PO8zCKnW(D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFW, Runnable runnable) {
        Runnable runnableVE4yDIjexsP2lGjLaTcB;
        this.NSjgqmGjEzuugn2SsG1mZFP.VxUQ9tBhpHJ2AAEDNW8sghc4m(runnable);
        if (M9e7PWhFYLD2lOGMker.get(this) >= this.zIvmSL0wzmmKGc3X39b2Gw2mUGE || !O1xDAlBZZlZdoEf747lCFHld() || (runnableVE4yDIjexsP2lGjLaTcB = vE4yDIjexsP2lGjLaTcB()) == null) {
            return;
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x.pzqP2AqKW6J5PO8zCKnW(this, new gZVesoHrfMaGvAvfBsRIr(8, this, runnableVE4yDIjexsP2lGjLaTcB));
    }

    public final Runnable vE4yDIjexsP2lGjLaTcB() {
        while (true) {
            Runnable runnable = (Runnable) this.NSjgqmGjEzuugn2SsG1mZFP.ZfQNn8hdWlEQ5cR94249PDsLR();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.GI83zq0G8e7zkn) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = M9e7PWhFYLD2lOGMker;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.NSjgqmGjEzuugn2SsG1mZFP.V57tEvNfxZVVcOCAOih5PKr() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
