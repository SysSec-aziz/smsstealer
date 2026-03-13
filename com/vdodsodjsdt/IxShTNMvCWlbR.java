package com.vdodsodjsdt;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class IxShTNMvCWlbR {
    public final /* synthetic */ RecyclerView VxUQ9tBhpHJ2AAEDNW8sghc4m;

    public /* synthetic */ IxShTNMvCWlbR(RecyclerView recyclerView) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = recyclerView;
    }

    public void LaeGQIruHQu81hfJldjMOQSVblH3x(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int iIrh5auREsoeV1C1RaBamlmy = recyclerView.ZLZeBXTMq0zDztBxtRTuCHrapQ.Irh5auREsoeV1C1RaBamlmy();
        int i10 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i11 = 0; i11 < iIrh5auREsoeV1C1RaBamlmy; i11++) {
            WFEUpQgjHl wFEUpQgjHlQygqjTppWwx992 = RecyclerView.qygqjTppWwx992(recyclerView.ZLZeBXTMq0zDztBxtRTuCHrapQ.TaDO7ogis3aEiWEtq(i11));
            if (wFEUpQgjHlQygqjTppWwx992 != null && (i9 = wFEUpQgjHlQygqjTppWwx992.V57tEvNfxZVVcOCAOih5PKr) >= i4 && i9 <= i3) {
                if (i9 == i) {
                    wFEUpQgjHlQygqjTppWwx992.KUYypEB4eNWOZWVDpH(i2 - i, false);
                } else {
                    wFEUpQgjHlQygqjTppWwx992.KUYypEB4eNWOZWVDpH(i5, false);
                }
                recyclerView.H2VFYNJEVGAX.zIvmSL0wzmmKGc3X39b2Gw2mUGE = true;
            }
        }
        ArrayList arrayList = recyclerView.ZfQNn8hdWlEQ5cR94249PDsLR.V57tEvNfxZVVcOCAOih5PKr;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i10 = 1;
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            WFEUpQgjHl wFEUpQgjHl = (WFEUpQgjHl) arrayList.get(i12);
            if (wFEUpQgjHl != null && (i8 = wFEUpQgjHl.V57tEvNfxZVVcOCAOih5PKr) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    wFEUpQgjHl.KUYypEB4eNWOZWVDpH(i2 - i, false);
                } else {
                    wFEUpQgjHl.KUYypEB4eNWOZWVDpH(i10, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.BJQHddi0Plr5ElWetCyaixWOg9 = true;
    }

    public void NSjgqmGjEzuugn2SsG1mZFP(int i) {
        RecyclerView recyclerView = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            RecyclerView.qygqjTppWwx992(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    public void V57tEvNfxZVVcOCAOih5PKr(int i, int i2) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int iIrh5auREsoeV1C1RaBamlmy = recyclerView.ZLZeBXTMq0zDztBxtRTuCHrapQ.Irh5auREsoeV1C1RaBamlmy();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < iIrh5auREsoeV1C1RaBamlmy; i6++) {
            View viewTaDO7ogis3aEiWEtq = recyclerView.ZLZeBXTMq0zDztBxtRTuCHrapQ.TaDO7ogis3aEiWEtq(i6);
            WFEUpQgjHl wFEUpQgjHlQygqjTppWwx992 = RecyclerView.qygqjTppWwx992(viewTaDO7ogis3aEiWEtq);
            if (wFEUpQgjHlQygqjTppWwx992 != null && !wFEUpQgjHlQygqjTppWwx992.Ca81ebIan1u() && (i4 = wFEUpQgjHlQygqjTppWwx992.V57tEvNfxZVVcOCAOih5PKr) >= i && i4 < i5) {
                wFEUpQgjHlQygqjTppWwx992.VxUQ9tBhpHJ2AAEDNW8sghc4m(2);
                wFEUpQgjHlQygqjTppWwx992.VxUQ9tBhpHJ2AAEDNW8sghc4m(1024);
                ((YoYMmBKQmkacZj7lMi9c) viewTaDO7ogis3aEiWEtq.getLayoutParams()).V57tEvNfxZVVcOCAOih5PKr = true;
            }
        }
        yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c = recyclerView.ZfQNn8hdWlEQ5cR94249PDsLR;
        ArrayList arrayList = yhxkwue1zri6a9vau8hg9c.V57tEvNfxZVVcOCAOih5PKr;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            WFEUpQgjHl wFEUpQgjHl = (WFEUpQgjHl) arrayList.get(size);
            if (wFEUpQgjHl != null && (i3 = wFEUpQgjHl.V57tEvNfxZVVcOCAOih5PKr) >= i && i3 < i5) {
                wFEUpQgjHl.VxUQ9tBhpHJ2AAEDNW8sghc4m(2);
                yhxkwue1zri6a9vau8hg9c.zIvmSL0wzmmKGc3X39b2Gw2mUGE(size);
            }
        }
        recyclerView.tFRdVJAePmTx77bP7FAN0uI = true;
    }

    public void VxUQ9tBhpHJ2AAEDNW8sghc4m(H73tKnp5B8 h73tKnp5B8) {
        int i = h73tKnp5B8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        RecyclerView recyclerView = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (i == 1) {
            recyclerView.p59rPv72J9.wdI7vzA3Qmcwd(h73tKnp5B8.zzpBGItXfub0yWj, h73tKnp5B8.V57tEvNfxZVVcOCAOih5PKr);
            return;
        }
        if (i == 2) {
            recyclerView.p59rPv72J9.GE1sqSYiEYQO2ew7WEZwTtUeS5(h73tKnp5B8.zzpBGItXfub0yWj, h73tKnp5B8.V57tEvNfxZVVcOCAOih5PKr);
        } else if (i == 4) {
            recyclerView.p59rPv72J9.rERAmyEtGV6ANGszuKcQI(h73tKnp5B8.zzpBGItXfub0yWj, h73tKnp5B8.V57tEvNfxZVVcOCAOih5PKr);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.p59rPv72J9.zOk739gUM7zIZC25HHUxoiyixWFjn(h73tKnp5B8.zzpBGItXfub0yWj, h73tKnp5B8.V57tEvNfxZVVcOCAOih5PKr);
        }
    }

    public void ZLZeBXTMq0zDztBxtRTuCHrapQ(WFEUpQgjHl wFEUpQgjHl, mYybSD3X3KfsAbnorz7K myybsd3x3kfsabnorz7k, mYybSD3X3KfsAbnorz7K myybsd3x3kfsabnorz7k2) {
        boolean zZLZeBXTMq0zDztBxtRTuCHrapQ;
        RecyclerView recyclerView = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        recyclerView.ZfQNn8hdWlEQ5cR94249PDsLR.HzCpKshMOoaw76hFcbOVRYMeRd(wFEUpQgjHl);
        recyclerView.zIvmSL0wzmmKGc3X39b2Gw2mUGE(wFEUpQgjHl);
        wFEUpQgjHl.p59rPv72J9(false);
        OIQnrK0mzZ oIQnrK0mzZ = (OIQnrK0mzZ) recyclerView.TqcnImqkSWIKht;
        oIQnrK0mzZ.getClass();
        int i = myybsd3x3kfsabnorz7k.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int i2 = myybsd3x3kfsabnorz7k.zzpBGItXfub0yWj;
        View view = wFEUpQgjHl.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int left = myybsd3x3kfsabnorz7k2 == null ? view.getLeft() : myybsd3x3kfsabnorz7k2.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int top = myybsd3x3kfsabnorz7k2 == null ? view.getTop() : myybsd3x3kfsabnorz7k2.zzpBGItXfub0yWj;
        if (wFEUpQgjHl.NSjgqmGjEzuugn2SsG1mZFP() || (i == left && i2 == top)) {
            oIQnrK0mzZ.KUYypEB4eNWOZWVDpH(wFEUpQgjHl);
            oIQnrK0mzZ.NSjgqmGjEzuugn2SsG1mZFP.add(wFEUpQgjHl);
            zZLZeBXTMq0zDztBxtRTuCHrapQ = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zZLZeBXTMq0zDztBxtRTuCHrapQ = oIQnrK0mzZ.ZLZeBXTMq0zDztBxtRTuCHrapQ(wFEUpQgjHl, i, i2, left, top);
        }
        if (zZLZeBXTMq0zDztBxtRTuCHrapQ) {
            recyclerView.lQ0rO9lhQIyVe7Rp6();
        }
    }

    public void ZfQNn8hdWlEQ5cR94249PDsLR(int i, int i2) {
        RecyclerView recyclerView = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int iIrh5auREsoeV1C1RaBamlmy = recyclerView.ZLZeBXTMq0zDztBxtRTuCHrapQ.Irh5auREsoeV1C1RaBamlmy();
        for (int i3 = 0; i3 < iIrh5auREsoeV1C1RaBamlmy; i3++) {
            WFEUpQgjHl wFEUpQgjHlQygqjTppWwx992 = RecyclerView.qygqjTppWwx992(recyclerView.ZLZeBXTMq0zDztBxtRTuCHrapQ.TaDO7ogis3aEiWEtq(i3));
            if (wFEUpQgjHlQygqjTppWwx992 != null && !wFEUpQgjHlQygqjTppWwx992.Ca81ebIan1u() && wFEUpQgjHlQygqjTppWwx992.V57tEvNfxZVVcOCAOih5PKr >= i) {
                wFEUpQgjHlQygqjTppWwx992.KUYypEB4eNWOZWVDpH(i2, false);
                recyclerView.H2VFYNJEVGAX.zIvmSL0wzmmKGc3X39b2Gw2mUGE = true;
            }
        }
        ArrayList arrayList = recyclerView.ZfQNn8hdWlEQ5cR94249PDsLR.V57tEvNfxZVVcOCAOih5PKr;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            WFEUpQgjHl wFEUpQgjHl = (WFEUpQgjHl) arrayList.get(i4);
            if (wFEUpQgjHl != null && wFEUpQgjHl.V57tEvNfxZVVcOCAOih5PKr >= i) {
                wFEUpQgjHl.KUYypEB4eNWOZWVDpH(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.BJQHddi0Plr5ElWetCyaixWOg9 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void zIvmSL0wzmmKGc3X39b2Gw2mUGE(com.vdodsodjsdt.WFEUpQgjHl r9, com.vdodsodjsdt.mYybSD3X3KfsAbnorz7K r10, com.vdodsodjsdt.mYybSD3X3KfsAbnorz7K r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r8.VxUQ9tBhpHJ2AAEDNW8sghc4m
            r0.getClass()
            r1 = 0
            r9.p59rPv72J9(r1)
            com.vdodsodjsdt.RAU9GtBZd7wl r1 = r0.TqcnImqkSWIKht
            r2 = r1
            com.vdodsodjsdt.OIQnrK0mzZ r2 = (com.vdodsodjsdt.OIQnrK0mzZ) r2
            if (r10 == 0) goto L20
            r2.getClass()
            int r4 = r10.VxUQ9tBhpHJ2AAEDNW8sghc4m
            int r6 = r11.VxUQ9tBhpHJ2AAEDNW8sghc4m
            if (r4 != r6) goto L22
            int r1 = r10.zzpBGItXfub0yWj
            int r3 = r11.zzpBGItXfub0yWj
            if (r1 == r3) goto L20
            goto L22
        L20:
            r3 = r9
            goto L2c
        L22:
            int r5 = r10.zzpBGItXfub0yWj
            int r7 = r11.zzpBGItXfub0yWj
            r3 = r9
            boolean r9 = r2.ZLZeBXTMq0zDztBxtRTuCHrapQ(r3, r4, r5, r6, r7)
            goto L3b
        L2c:
            r2.KUYypEB4eNWOZWVDpH(r3)
            android.view.View r9 = r3.VxUQ9tBhpHJ2AAEDNW8sghc4m
            r10 = 0
            r9.setAlpha(r10)
            java.util.ArrayList r9 = r2.GI83zq0G8e7zkn
            r9.add(r3)
            r9 = 1
        L3b:
            if (r9 == 0) goto L40
            r0.lQ0rO9lhQIyVe7Rp6()
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.IxShTNMvCWlbR.zIvmSL0wzmmKGc3X39b2Gw2mUGE(com.vdodsodjsdt.WFEUpQgjHl, com.vdodsodjsdt.mYybSD3X3KfsAbnorz7K, com.vdodsodjsdt.mYybSD3X3KfsAbnorz7K):void");
    }

    public WFEUpQgjHl zzpBGItXfub0yWj(int i) {
        RecyclerView recyclerView = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int iIrh5auREsoeV1C1RaBamlmy = recyclerView.ZLZeBXTMq0zDztBxtRTuCHrapQ.Irh5auREsoeV1C1RaBamlmy();
        int i2 = 0;
        WFEUpQgjHl wFEUpQgjHl = null;
        while (true) {
            if (i2 >= iIrh5auREsoeV1C1RaBamlmy) {
                break;
            }
            WFEUpQgjHl wFEUpQgjHlQygqjTppWwx992 = RecyclerView.qygqjTppWwx992(recyclerView.ZLZeBXTMq0zDztBxtRTuCHrapQ.TaDO7ogis3aEiWEtq(i2));
            if (wFEUpQgjHlQygqjTppWwx992 != null && !wFEUpQgjHlQygqjTppWwx992.NSjgqmGjEzuugn2SsG1mZFP() && wFEUpQgjHlQygqjTppWwx992.V57tEvNfxZVVcOCAOih5PKr == i) {
                if (!((ArrayList) recyclerView.ZLZeBXTMq0zDztBxtRTuCHrapQ.ZfQNn8hdWlEQ5cR94249PDsLR).contains(wFEUpQgjHlQygqjTppWwx992.VxUQ9tBhpHJ2AAEDNW8sghc4m)) {
                    wFEUpQgjHl = wFEUpQgjHlQygqjTppWwx992;
                    break;
                }
                wFEUpQgjHl = wFEUpQgjHlQygqjTppWwx992;
            }
            i2++;
        }
        if (wFEUpQgjHl != null) {
            if (!((ArrayList) recyclerView.ZLZeBXTMq0zDztBxtRTuCHrapQ.ZfQNn8hdWlEQ5cR94249PDsLR).contains(wFEUpQgjHl.VxUQ9tBhpHJ2AAEDNW8sghc4m)) {
                return wFEUpQgjHl;
            }
        }
        return null;
    }
}
