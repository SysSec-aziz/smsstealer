package com.vdodsodjsdt;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class Y64anY0MWbS implements Runnable {
    public final boolean LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final IVPB9DLMIoeA0Qp8AgwLlJ V57tEvNfxZVVcOCAOih5PKr;
    public final ztNFMw5IuWLfuP ZfQNn8hdWlEQ5cR94249PDsLR;
    public final int zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public Y64anY0MWbS(IVPB9DLMIoeA0Qp8AgwLlJ iVPB9DLMIoeA0Qp8AgwLlJ, ztNFMw5IuWLfuP ztnfmw5iuwlfup, boolean z, int i) {
        ej6unYlOWMDF.pYmKDYlAmhudp(iVPB9DLMIoeA0Qp8AgwLlJ, "processor");
        ej6unYlOWMDF.pYmKDYlAmhudp(ztnfmw5iuwlfup, "token");
        this.V57tEvNfxZVVcOCAOih5PKr = iVPB9DLMIoeA0Qp8AgwLlJ;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = ztnfmw5iuwlfup;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = z;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zZfQNn8hdWlEQ5cR94249PDsLR;
        miZQAIwqUtukbpjcHsFxaDq57gE mizqaiwqutukbpjchsfxadq57geZzpBGItXfub0yWj;
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            IVPB9DLMIoeA0Qp8AgwLlJ iVPB9DLMIoeA0Qp8AgwLlJ = this.V57tEvNfxZVVcOCAOih5PKr;
            ztNFMw5IuWLfuP ztnfmw5iuwlfup = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            int i = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            iVPB9DLMIoeA0Qp8AgwLlJ.getClass();
            String str = ztnfmw5iuwlfup.VxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            synchronized (iVPB9DLMIoeA0Qp8AgwLlJ.HzCpKshMOoaw76hFcbOVRYMeRd) {
                mizqaiwqutukbpjchsfxadq57geZzpBGItXfub0yWj = iVPB9DLMIoeA0Qp8AgwLlJ.zzpBGItXfub0yWj(str);
            }
            zZfQNn8hdWlEQ5cR94249PDsLR = IVPB9DLMIoeA0Qp8AgwLlJ.ZfQNn8hdWlEQ5cR94249PDsLR(str, mizqaiwqutukbpjchsfxadq57geZzpBGItXfub0yWj, i);
        } else {
            IVPB9DLMIoeA0Qp8AgwLlJ iVPB9DLMIoeA0Qp8AgwLlJ2 = this.V57tEvNfxZVVcOCAOih5PKr;
            ztNFMw5IuWLfuP ztnfmw5iuwlfup2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            int i2 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            iVPB9DLMIoeA0Qp8AgwLlJ2.getClass();
            String str2 = ztnfmw5iuwlfup2.VxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            synchronized (iVPB9DLMIoeA0Qp8AgwLlJ2.HzCpKshMOoaw76hFcbOVRYMeRd) {
                try {
                    if (iVPB9DLMIoeA0Qp8AgwLlJ2.zIvmSL0wzmmKGc3X39b2Gw2mUGE.get(str2) != null) {
                        psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(IVPB9DLMIoeA0Qp8AgwLlJ.KUYypEB4eNWOZWVDpH, "Ignored stopWork. WorkerWrapper " + str2 + " is in foreground");
                    } else {
                        Set set = (Set) iVPB9DLMIoeA0Qp8AgwLlJ2.NSjgqmGjEzuugn2SsG1mZFP.get(str2);
                        if (set != null && set.contains(ztnfmw5iuwlfup2)) {
                            zZfQNn8hdWlEQ5cR94249PDsLR = IVPB9DLMIoeA0Qp8AgwLlJ.ZfQNn8hdWlEQ5cR94249PDsLR(str2, iVPB9DLMIoeA0Qp8AgwLlJ2.zzpBGItXfub0yWj(str2), i2);
                        }
                    }
                    zZfQNn8hdWlEQ5cR94249PDsLR = false;
                } finally {
                }
            }
        }
        psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(psATg3LCCdmDIiRgW.ZLZeBXTMq0zDztBxtRTuCHrapQ("StopWorkRunnable"), "StopWorkRunnable for " + this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m + "; Processor.stopWork = " + zZfQNn8hdWlEQ5cR94249PDsLR);
    }
}
