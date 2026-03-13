package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class lCBidOHn4p7NistDjascxY8c4D0m extends iR5xCBIVvX5dAZmnw05F0Cv implements MGk7KfXeUv8YAfWiUw5LfOd {
    public final /* synthetic */ xqKFiLvQB7uYuT2 ZfQNn8hdWlEQ5cR94249PDsLR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lCBidOHn4p7NistDjascxY8c4D0m(xqKFiLvQB7uYuT2 xqkfilvqb7uyut2) {
        super(2);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = xqkfilvqb7uyut2;
    }

    @Override // com.vdodsodjsdt.MGk7KfXeUv8YAfWiUw5LfOd
    public final Object NSjgqmGjEzuugn2SsG1mZFP(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        RKQqw795jswHmdL5AnfuvmeBZD rKQqw795jswHmdL5AnfuvmeBZD = (RKQqw795jswHmdL5AnfuvmeBZD) obj2;
        DenmIypSdw0qfxt key = rKQqw795jswHmdL5AnfuvmeBZD.getKey();
        RKQqw795jswHmdL5AnfuvmeBZD rKQqw795jswHmdL5AnfuvmeBZDQ11o1hieEkZDhF1MGOZI26oZiDT = this.ZfQNn8hdWlEQ5cR94249PDsLR.ZLZeBXTMq0zDztBxtRTuCHrapQ.q11o1hieEkZDhF1MGOZI26oZiDT(key);
        if (key != IN79WcIk5xB4t0GjRT43qPLs5.HzCpKshMOoaw76hFcbOVRYMeRd) {
            return Integer.valueOf(rKQqw795jswHmdL5AnfuvmeBZD != rKQqw795jswHmdL5AnfuvmeBZDQ11o1hieEkZDhF1MGOZI26oZiDT ? Integer.MIN_VALUE : iIntValue + 1);
        }
        sJ612dvaOBrP4lDkAwxzLpcxONSSp sj612dvaobrp4ldkawxzlpcxonssp = (sJ612dvaOBrP4lDkAwxzLpcxONSSp) rKQqw795jswHmdL5AnfuvmeBZDQ11o1hieEkZDhF1MGOZI26oZiDT;
        sJ612dvaOBrP4lDkAwxzLpcxONSSp parent = (sJ612dvaOBrP4lDkAwxzLpcxONSSp) rKQqw795jswHmdL5AnfuvmeBZD;
        while (true) {
            if (parent != null) {
                if (parent == sj612dvaobrp4ldkawxzlpcxonssp || !(parent instanceof yB0MgkQF0w4aWkiL0rHiqFb54ZHEs)) {
                    break;
                }
                gHWGGkKBgoYQ6 ghwggkkbgoyq6 = (gHWGGkKBgoYQ6) fXGTDnUxIdCVHFvA63E.ZfQNn8hdWlEQ5cR94249PDsLR.get((fXGTDnUxIdCVHFvA63E) parent);
                parent = ghwggkkbgoyq6 != null ? ghwggkkbgoyq6.getParent() : null;
            } else {
                parent = null;
                break;
            }
        }
        if (parent == sj612dvaobrp4ldkawxzlpcxonssp) {
            if (sj612dvaobrp4ldkawxzlpcxonssp != null) {
                iIntValue++;
            }
            return Integer.valueOf(iIntValue);
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + sj612dvaobrp4ldkawxzlpcxonssp + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
    }
}
