package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class e20NJ5kD0wqGO3 {
    public boolean GI83zq0G8e7zkn;
    public boolean HzCpKshMOoaw76hFcbOVRYMeRd;
    public int KUYypEB4eNWOZWVDpH;
    public int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public boolean M9e7PWhFYLD2lOGMker;
    public boolean NSjgqmGjEzuugn2SsG1mZFP;
    public int V57tEvNfxZVVcOCAOih5PKr;
    public int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public boolean ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public int ZfQNn8hdWlEQ5cR94249PDsLR;
    public int p59rPv72J9;
    public long q1wNbhk2O6;
    public boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public int zzpBGItXfub0yWj;

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(int i) {
        if ((this.ZfQNn8hdWlEQ5cR94249PDsLR & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.ZfQNn8hdWlEQ5cR94249PDsLR));
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.VxUQ9tBhpHJ2AAEDNW8sghc4m + ", mData=null, mItemCount=" + this.LaeGQIruHQu81hfJldjMOQSVblH3x + ", mIsMeasuring=" + this.GI83zq0G8e7zkn + ", mPreviousLayoutItemCount=" + this.zzpBGItXfub0yWj + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.V57tEvNfxZVVcOCAOih5PKr + ", mStructureChanged=" + this.zIvmSL0wzmmKGc3X39b2Gw2mUGE + ", mInPreLayout=" + this.ZLZeBXTMq0zDztBxtRTuCHrapQ + ", mRunSimpleAnimations=" + this.M9e7PWhFYLD2lOGMker + ", mRunPredictiveAnimations=" + this.HzCpKshMOoaw76hFcbOVRYMeRd + '}';
    }

    public final int zzpBGItXfub0yWj() {
        return this.ZLZeBXTMq0zDztBxtRTuCHrapQ ? this.zzpBGItXfub0yWj - this.V57tEvNfxZVVcOCAOih5PKr : this.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }
}
