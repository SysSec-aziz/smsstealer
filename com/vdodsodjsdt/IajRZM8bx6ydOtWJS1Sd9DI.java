package com.vdodsodjsdt;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class IajRZM8bx6ydOtWJS1Sd9DI {
    public static final String VxUQ9tBhpHJ2AAEDNW8sghc4m = psATg3LCCdmDIiRgW.ZLZeBXTMq0zDztBxtRTuCHrapQ("Schedulers");

    public static void VxUQ9tBhpHJ2AAEDNW8sghc4m(SX5PHeJQdzT24G3iHfmAKRZsddf sX5PHeJQdzT24G3iHfmAKRZsddf, VSncX8ksA0tswc2TMhzhOMdd vSncX8ksA0tswc2TMhzhOMdd, ArrayList arrayList) {
        if (arrayList.size() > 0) {
            vSncX8ksA0tswc2TMhzhOMdd.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                sX5PHeJQdzT24G3iHfmAKRZsddf.NSjgqmGjEzuugn2SsG1mZFP(((vIPEe55rgLxLcs) obj).VxUQ9tBhpHJ2AAEDNW8sghc4m, jCurrentTimeMillis);
            }
        }
    }

    public static void zzpBGItXfub0yWj(Eh21X7fdrXs eh21X7fdrXs, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        SX5PHeJQdzT24G3iHfmAKRZsddf sX5PHeJQdzT24G3iHfmAKRZsddfF6ZQsR6bPLvvCDNXOUc = workDatabase.f6ZQsR6bPLvvCDNXOUc();
        workDatabase.V57tEvNfxZVVcOCAOih5PKr();
        try {
            ArrayList arrayListV57tEvNfxZVVcOCAOih5PKr = sX5PHeJQdzT24G3iHfmAKRZsddfF6ZQsR6bPLvvCDNXOUc.V57tEvNfxZVVcOCAOih5PKr();
            VxUQ9tBhpHJ2AAEDNW8sghc4m(sX5PHeJQdzT24G3iHfmAKRZsddfF6ZQsR6bPLvvCDNXOUc, eh21X7fdrXs.ZfQNn8hdWlEQ5cR94249PDsLR, arrayListV57tEvNfxZVVcOCAOih5PKr);
            ArrayList arrayListZzpBGItXfub0yWj = sX5PHeJQdzT24G3iHfmAKRZsddfF6ZQsR6bPLvvCDNXOUc.zzpBGItXfub0yWj(eh21X7fdrXs.HzCpKshMOoaw76hFcbOVRYMeRd);
            VxUQ9tBhpHJ2AAEDNW8sghc4m(sX5PHeJQdzT24G3iHfmAKRZsddfF6ZQsR6bPLvvCDNXOUc, eh21X7fdrXs.ZfQNn8hdWlEQ5cR94249PDsLR, arrayListZzpBGItXfub0yWj);
            arrayListZzpBGItXfub0yWj.addAll(arrayListV57tEvNfxZVVcOCAOih5PKr);
            ArrayList arrayListVxUQ9tBhpHJ2AAEDNW8sghc4m = sX5PHeJQdzT24G3iHfmAKRZsddfF6ZQsR6bPLvvCDNXOUc.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            workDatabase.Ca81ebIan1u();
            workDatabase.HzCpKshMOoaw76hFcbOVRYMeRd();
            if (arrayListZzpBGItXfub0yWj.size() > 0) {
                vIPEe55rgLxLcs[] vipee55rglxlcsArr = (vIPEe55rgLxLcs[]) arrayListZzpBGItXfub0yWj.toArray(new vIPEe55rgLxLcs[arrayListZzpBGItXfub0yWj.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    SBDculXSmt sBDculXSmt = (SBDculXSmt) it.next();
                    if (sBDculXSmt.zzpBGItXfub0yWj()) {
                        sBDculXSmt.ZfQNn8hdWlEQ5cR94249PDsLR(vipee55rglxlcsArr);
                    }
                }
            }
            if (arrayListVxUQ9tBhpHJ2AAEDNW8sghc4m.size() > 0) {
                vIPEe55rgLxLcs[] vipee55rglxlcsArr2 = (vIPEe55rgLxLcs[]) arrayListVxUQ9tBhpHJ2AAEDNW8sghc4m.toArray(new vIPEe55rgLxLcs[arrayListVxUQ9tBhpHJ2AAEDNW8sghc4m.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    SBDculXSmt sBDculXSmt2 = (SBDculXSmt) it2.next();
                    if (!sBDculXSmt2.zzpBGItXfub0yWj()) {
                        sBDculXSmt2.ZfQNn8hdWlEQ5cR94249PDsLR(vipee55rglxlcsArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.HzCpKshMOoaw76hFcbOVRYMeRd();
            throw th;
        }
    }
}
