package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class CwickyU0ZjEG0JwJwvvsOp0vRH0PB extends LL6zXCXfmDYzdHCRTT {
    public static final /* synthetic */ int NSjgqmGjEzuugn2SsG1mZFP = 0;
    public long LaeGQIruHQu81hfJldjMOQSVblH3x;
    public rOiKJVDHPqqeCfn ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public abstract Thread HVEwbdULInpTNa0IG();

    public final void O1xDAlBZZlZdoEf747lCFHld(jVaNsOYs2UVt jvansoys2uvt) {
        rOiKJVDHPqqeCfn roikjvdhpqqecfn = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (roikjvdhpqqecfn == null) {
            roikjvdhpqqecfn = new rOiKJVDHPqqeCfn();
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = roikjvdhpqqecfn;
        }
        roikjvdhpqqecfn.addLast(jvansoys2uvt);
    }

    public void TqcnImqkSWIKht(long j, ErBfq9NXKMau0dmIu8LfNce2kOtT erBfq9NXKMau0dmIu8LfNce2kOtT) {
        DBe0sYt4niFwXhYZX4.KUYypEB4eNWOZWVDpH.YdNRGRc4rly(j, erBfq9NXKMau0dmIu8LfNce2kOtT);
    }

    public final boolean iKANjmyTSxO6v6UuLPdu7DxOjlS() {
        rOiKJVDHPqqeCfn roikjvdhpqqecfn = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (roikjvdhpqqecfn == null) {
            return false;
        }
        jVaNsOYs2UVt jvansoys2uvt = (jVaNsOYs2UVt) (roikjvdhpqqecfn.isEmpty() ? null : roikjvdhpqqecfn.removeFirst());
        if (jvansoys2uvt == null) {
            return false;
        }
        jvansoys2uvt.run();
        return true;
    }

    public abstract long qygqjTppWwx992();

    public abstract void shutdown();

    public final void vE4yDIjexsP2lGjLaTcB(boolean z) {
        long j = this.LaeGQIruHQu81hfJldjMOQSVblH3x - (z ? 4294967296L : 1L);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = j;
        if (j <= 0 && this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
            shutdown();
        }
    }

    public final void y1NaPKTl7R18DOr6e8i5(boolean z) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = (z ? 4294967296L : 1L) + this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (z) {
            return;
        }
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = true;
    }
}
