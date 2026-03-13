package com.vdodsodjsdt;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Pwz3nahkq67x68Efvag6R8hCKmh00 implements Callable {
    public final /* synthetic */ int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final /* synthetic */ Object zzpBGItXfub0yWj;

    public /* synthetic */ Pwz3nahkq67x68Efvag6R8hCKmh00(int i, Object obj) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        this.zzpBGItXfub0yWj = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                miZQAIwqUtukbpjcHsFxaDq57gE mizqaiwqutukbpjchsfxadq57ge = (miZQAIwqUtukbpjcHsFxaDq57gE) this.zzpBGItXfub0yWj;
                vIPEe55rgLxLcs vipee55rglxlcs = mizqaiwqutukbpjchsfxadq57ge.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                int i = vipee55rglxlcs.zzpBGItXfub0yWj;
                String str = vipee55rglxlcs.V57tEvNfxZVVcOCAOih5PKr;
                if (i != 1) {
                    String str2 = WymhoAQMxaR.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(str2, str + " is not in ENQUEUED state. Nothing more to do");
                    return Boolean.TRUE;
                }
                if (vipee55rglxlcs.ZfQNn8hdWlEQ5cR94249PDsLR() || (vipee55rglxlcs.zzpBGItXfub0yWj == 1 && vipee55rglxlcs.HzCpKshMOoaw76hFcbOVRYMeRd > 0)) {
                    mizqaiwqutukbpjchsfxadq57ge.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getClass();
                    if (System.currentTimeMillis() < vipee55rglxlcs.VxUQ9tBhpHJ2AAEDNW8sghc4m()) {
                        psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(WymhoAQMxaR.VxUQ9tBhpHJ2AAEDNW8sghc4m, "Delaying execution for " + str + " because it is being executed before schedule.");
                        return Boolean.TRUE;
                    }
                }
                return Boolean.FALSE;
            case 1:
                miZQAIwqUtukbpjcHsFxaDq57gE mizqaiwqutukbpjchsfxadq57ge2 = (miZQAIwqUtukbpjcHsFxaDq57gE) this.zzpBGItXfub0yWj;
                SX5PHeJQdzT24G3iHfmAKRZsddf sX5PHeJQdzT24G3iHfmAKRZsddf = mizqaiwqutukbpjchsfxadq57ge2.GI83zq0G8e7zkn;
                String str3 = mizqaiwqutukbpjchsfxadq57ge2.V57tEvNfxZVVcOCAOih5PKr;
                boolean z = true;
                if (sX5PHeJQdzT24G3iHfmAKRZsddf.zIvmSL0wzmmKGc3X39b2Gw2mUGE(str3) == 1) {
                    sX5PHeJQdzT24G3iHfmAKRZsddf.KUYypEB4eNWOZWVDpH(str3, 2);
                    WorkDatabase_Impl workDatabase_Impl = sX5PHeJQdzT24G3iHfmAKRZsddf.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    workDatabase_Impl.zzpBGItXfub0yWj();
                    FbuZzoqAiJLuQzTy fbuZzoqAiJLuQzTy = sX5PHeJQdzT24G3iHfmAKRZsddf.NSjgqmGjEzuugn2SsG1mZFP;
                    cGYUoKJ5QrSVTXdZE1f88VdPb3 cgyuokj5qrsvtxdze1f88vdpb3VxUQ9tBhpHJ2AAEDNW8sghc4m = fbuZzoqAiJLuQzTy.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                    cgyuokj5qrsvtxdze1f88vdpb3VxUQ9tBhpHJ2AAEDNW8sghc4m.f6ZQsR6bPLvvCDNXOUc(str3, 1);
                    try {
                        workDatabase_Impl.V57tEvNfxZVVcOCAOih5PKr();
                        try {
                            cgyuokj5qrsvtxdze1f88vdpb3VxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                            workDatabase_Impl.Ca81ebIan1u();
                            fbuZzoqAiJLuQzTy.ZfQNn8hdWlEQ5cR94249PDsLR(cgyuokj5qrsvtxdze1f88vdpb3VxUQ9tBhpHJ2AAEDNW8sghc4m);
                            sX5PHeJQdzT24G3iHfmAKRZsddf.q1wNbhk2O6(str3, -256);
                        } finally {
                            workDatabase_Impl.HzCpKshMOoaw76hFcbOVRYMeRd();
                        }
                    } catch (Throwable th) {
                        fbuZzoqAiJLuQzTy.ZfQNn8hdWlEQ5cR94249PDsLR(cgyuokj5qrsvtxdze1f88vdpb3VxUQ9tBhpHJ2AAEDNW8sghc4m);
                        throw th;
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                WorkDatabase workDatabase = ((Jw5Ce78MpXxfpSSBw33DWMfqt5tO) this.zzpBGItXfub0yWj).VxUQ9tBhpHJ2AAEDNW8sghc4m;
                Long lJW7EiD0YL6xkbB158jMUzhWNWb1y = workDatabase.KUYypEB4eNWOZWVDpH().jW7EiD0YL6xkbB158jMUzhWNWb1y("next_alarm_manager_id");
                int iLongValue = lJW7EiD0YL6xkbB158jMUzhWNWb1y != null ? (int) lJW7EiD0YL6xkbB158jMUzhWNWb1y.longValue() : 0;
                workDatabase.KUYypEB4eNWOZWVDpH().f6ZQsR6bPLvvCDNXOUc(new iI04L8AdRx9Y2pbmi6FzqrqMSV("next_alarm_manager_id", Long.valueOf(iLongValue != Integer.MAX_VALUE ? iLongValue + 1 : 0)));
                return Integer.valueOf(iLongValue);
        }
    }
}
