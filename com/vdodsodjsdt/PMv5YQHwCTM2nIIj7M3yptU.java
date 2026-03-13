package com.vdodsodjsdt;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class PMv5YQHwCTM2nIIj7M3yptU extends DyKKpKofUua1vK {
    public int HVEwbdULInpTNa0IG;
    public boolean O1xDAlBZZlZdoEf747lCFHld;
    public boolean aXO0LSrt8bKV;
    public ArrayList pzqP2AqKW6J5PO8zCKnW;
    public int vE4yDIjexsP2lGjLaTcB;

    @Override // com.vdodsodjsdt.DyKKpKofUua1vK
    public final void Irh5auREsoeV1C1RaBamlmy(View view) {
        super.Irh5auREsoeV1C1RaBamlmy(view);
        int size = this.pzqP2AqKW6J5PO8zCKnW.size();
        for (int i = 0; i < size; i++) {
            ((DyKKpKofUua1vK) this.pzqP2AqKW6J5PO8zCKnW.get(i)).Irh5auREsoeV1C1RaBamlmy(view);
        }
    }

    @Override // com.vdodsodjsdt.DyKKpKofUua1vK
    public final void KUYypEB4eNWOZWVDpH(ViewGroup viewGroup, nMRZPpfLCgJyuB nmrzppflcgjyub, nMRZPpfLCgJyuB nmrzppflcgjyub2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        int size = this.pzqP2AqKW6J5PO8zCKnW.size();
        for (int i = 0; i < size; i++) {
            DyKKpKofUua1vK dyKKpKofUua1vK = (DyKKpKofUua1vK) this.pzqP2AqKW6J5PO8zCKnW.get(i);
            if (j > 0 && (this.aXO0LSrt8bKV || i == 0)) {
                long j2 = dyKKpKofUua1vK.ZfQNn8hdWlEQ5cR94249PDsLR;
                if (j2 > 0) {
                    dyKKpKofUua1vK.O1xDAlBZZlZdoEf747lCFHld(j2 + j);
                } else {
                    dyKKpKofUua1vK.O1xDAlBZZlZdoEf747lCFHld(j);
                }
            }
            dyKKpKofUua1vK.KUYypEB4eNWOZWVDpH(viewGroup, nmrzppflcgjyub, nmrzppflcgjyub2, arrayList, arrayList2);
        }
    }

    @Override // com.vdodsodjsdt.DyKKpKofUua1vK
    /* JADX INFO: renamed from: M9e7PWhFYLD2lOGMker, reason: merged with bridge method [inline-methods] */
    public final DyKKpKofUua1vK clone() {
        PMv5YQHwCTM2nIIj7M3yptU pMv5YQHwCTM2nIIj7M3yptU = (PMv5YQHwCTM2nIIj7M3yptU) super.clone();
        pMv5YQHwCTM2nIIj7M3yptU.pzqP2AqKW6J5PO8zCKnW = new ArrayList();
        int size = this.pzqP2AqKW6J5PO8zCKnW.size();
        for (int i = 0; i < size; i++) {
            DyKKpKofUua1vK dyKKpKofUua1vKClone = ((DyKKpKofUua1vK) this.pzqP2AqKW6J5PO8zCKnW.get(i)).clone();
            pMv5YQHwCTM2nIIj7M3yptU.pzqP2AqKW6J5PO8zCKnW.add(dyKKpKofUua1vKClone);
            dyKKpKofUua1vKClone.HzCpKshMOoaw76hFcbOVRYMeRd = pMv5YQHwCTM2nIIj7M3yptU;
        }
        return pMv5YQHwCTM2nIIj7M3yptU;
    }

    @Override // com.vdodsodjsdt.DyKKpKofUua1vK
    public final void O1xDAlBZZlZdoEf747lCFHld(long j) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR = j;
    }

    @Override // com.vdodsodjsdt.DyKKpKofUua1vK
    public final void RhfGHxtXxy0M0grmp2jkRjQg() {
        if (this.pzqP2AqKW6J5PO8zCKnW.isEmpty()) {
            HVEwbdULInpTNa0IG();
            q1wNbhk2O6();
            return;
        }
        wNawLZjRLe1kM0q wnawlzjrle1km0q = new wNawLZjRLe1kM0q();
        wnawlzjrle1km0q.zzpBGItXfub0yWj = this;
        ArrayList arrayList = this.pzqP2AqKW6J5PO8zCKnW;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((DyKKpKofUua1vK) obj).VxUQ9tBhpHJ2AAEDNW8sghc4m(wnawlzjrle1km0q);
        }
        this.vE4yDIjexsP2lGjLaTcB = this.pzqP2AqKW6J5PO8zCKnW.size();
        if (this.aXO0LSrt8bKV) {
            ArrayList arrayList2 = this.pzqP2AqKW6J5PO8zCKnW;
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                ((DyKKpKofUua1vK) obj2).RhfGHxtXxy0M0grmp2jkRjQg();
            }
            return;
        }
        for (int i3 = 1; i3 < this.pzqP2AqKW6J5PO8zCKnW.size(); i3++) {
            ((DyKKpKofUua1vK) this.pzqP2AqKW6J5PO8zCKnW.get(i3 - 1)).VxUQ9tBhpHJ2AAEDNW8sghc4m(new wNawLZjRLe1kM0q((DyKKpKofUua1vK) this.pzqP2AqKW6J5PO8zCKnW.get(i3)));
        }
        DyKKpKofUua1vK dyKKpKofUua1vK = (DyKKpKofUua1vK) this.pzqP2AqKW6J5PO8zCKnW.get(0);
        if (dyKKpKofUua1vK != null) {
            dyKKpKofUua1vK.RhfGHxtXxy0M0grmp2jkRjQg();
        }
    }

    @Override // com.vdodsodjsdt.DyKKpKofUua1vK
    public final void SuB3hEmTmbbRGAhtvOOmfKEon(ej6unYlOWMDF ej6unylowmdf) {
        this.HVEwbdULInpTNa0IG |= 8;
        int size = this.pzqP2AqKW6J5PO8zCKnW.size();
        for (int i = 0; i < size; i++) {
            ((DyKKpKofUua1vK) this.pzqP2AqKW6J5PO8zCKnW.get(i)).SuB3hEmTmbbRGAhtvOOmfKEon(ej6unylowmdf);
        }
    }

    @Override // com.vdodsodjsdt.DyKKpKofUua1vK
    public final void V57tEvNfxZVVcOCAOih5PKr() {
        super.V57tEvNfxZVVcOCAOih5PKr();
        int size = this.pzqP2AqKW6J5PO8zCKnW.size();
        for (int i = 0; i < size; i++) {
            ((DyKKpKofUua1vK) this.pzqP2AqKW6J5PO8zCKnW.get(i)).V57tEvNfxZVVcOCAOih5PKr();
        }
    }

    @Override // com.vdodsodjsdt.DyKKpKofUua1vK
    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ(wfAv4Z4xkzEqsmKhnROCM57sUkreZ wfav4z4xkzeqsmkhnrocm57sukrez) {
        View view = wfav4z4xkzeqsmkhnrocm57sukrez.zzpBGItXfub0yWj;
        if (f6ZQsR6bPLvvCDNXOUc(view)) {
            ArrayList arrayList = this.pzqP2AqKW6J5PO8zCKnW;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                DyKKpKofUua1vK dyKKpKofUua1vK = (DyKKpKofUua1vK) obj;
                if (dyKKpKofUua1vK.f6ZQsR6bPLvvCDNXOUc(view)) {
                    dyKKpKofUua1vK.ZLZeBXTMq0zDztBxtRTuCHrapQ(wfav4z4xkzeqsmkhnrocm57sukrez);
                    wfav4z4xkzeqsmkhnrocm57sukrez.V57tEvNfxZVVcOCAOih5PKr.add(dyKKpKofUua1vK);
                }
            }
        }
    }

    @Override // com.vdodsodjsdt.DyKKpKofUua1vK
    public final void ZfQNn8hdWlEQ5cR94249PDsLR(wfAv4Z4xkzEqsmKhnROCM57sUkreZ wfav4z4xkzeqsmkhnrocm57sukrez) {
        View view = wfav4z4xkzeqsmkhnrocm57sukrez.zzpBGItXfub0yWj;
        if (f6ZQsR6bPLvvCDNXOUc(view)) {
            ArrayList arrayList = this.pzqP2AqKW6J5PO8zCKnW;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                DyKKpKofUua1vK dyKKpKofUua1vK = (DyKKpKofUua1vK) obj;
                if (dyKKpKofUua1vK.f6ZQsR6bPLvvCDNXOUc(view)) {
                    dyKKpKofUua1vK.ZfQNn8hdWlEQ5cR94249PDsLR(wfav4z4xkzeqsmkhnrocm57sukrez);
                    wfav4z4xkzeqsmkhnrocm57sukrez.V57tEvNfxZVVcOCAOih5PKr.add(dyKKpKofUua1vK);
                }
            }
        }
    }

    @Override // com.vdodsodjsdt.DyKKpKofUua1vK
    public final void aXO0LSrt8bKV(VSncX8ksA0tswc2TMhzhOMdd vSncX8ksA0tswc2TMhzhOMdd) {
        super.aXO0LSrt8bKV(vSncX8ksA0tswc2TMhzhOMdd);
        this.HVEwbdULInpTNa0IG |= 4;
        if (this.pzqP2AqKW6J5PO8zCKnW != null) {
            for (int i = 0; i < this.pzqP2AqKW6J5PO8zCKnW.size(); i++) {
                ((DyKKpKofUua1vK) this.pzqP2AqKW6J5PO8zCKnW.get(i)).aXO0LSrt8bKV(vSncX8ksA0tswc2TMhzhOMdd);
            }
        }
    }

    @Override // com.vdodsodjsdt.DyKKpKofUua1vK
    public final void pzqP2AqKW6J5PO8zCKnW(TimeInterpolator timeInterpolator) {
        this.HVEwbdULInpTNa0IG |= 1;
        ArrayList arrayList = this.pzqP2AqKW6J5PO8zCKnW;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((DyKKpKofUua1vK) this.pzqP2AqKW6J5PO8zCKnW.get(i)).pzqP2AqKW6J5PO8zCKnW(timeInterpolator);
            }
        }
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = timeInterpolator;
    }

    @Override // com.vdodsodjsdt.DyKKpKofUua1vK
    public final DyKKpKofUua1vK q11o1hieEkZDhF1MGOZI26oZiDT(XYOHiAJNNnPEqr xYOHiAJNNnPEqr) {
        super.q11o1hieEkZDhF1MGOZI26oZiDT(xYOHiAJNNnPEqr);
        return this;
    }

    @Override // com.vdodsodjsdt.DyKKpKofUua1vK
    public final void qNPQb1obP7(long j) {
        ArrayList arrayList;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = j;
        if (j < 0 || (arrayList = this.pzqP2AqKW6J5PO8zCKnW) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((DyKKpKofUua1vK) this.pzqP2AqKW6J5PO8zCKnW.get(i)).qNPQb1obP7(j);
        }
    }

    public final void qygqjTppWwx992(DyKKpKofUua1vK dyKKpKofUua1vK) {
        this.pzqP2AqKW6J5PO8zCKnW.add(dyKKpKofUua1vK);
        dyKKpKofUua1vK.HzCpKshMOoaw76hFcbOVRYMeRd = this;
        long j = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (j >= 0) {
            dyKKpKofUua1vK.qNPQb1obP7(j);
        }
        if ((this.HVEwbdULInpTNa0IG & 1) != 0) {
            dyKKpKofUua1vK.pzqP2AqKW6J5PO8zCKnW(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
        }
        if ((this.HVEwbdULInpTNa0IG & 2) != 0) {
            dyKKpKofUua1vK.vE4yDIjexsP2lGjLaTcB();
        }
        if ((this.HVEwbdULInpTNa0IG & 4) != 0) {
            dyKKpKofUua1vK.aXO0LSrt8bKV(this.q11o1hieEkZDhF1MGOZI26oZiDT);
        }
        if ((this.HVEwbdULInpTNa0IG & 8) != 0) {
            dyKKpKofUua1vK.SuB3hEmTmbbRGAhtvOOmfKEon(null);
        }
    }

    @Override // com.vdodsodjsdt.DyKKpKofUua1vK
    public final void vE4yDIjexsP2lGjLaTcB() {
        this.HVEwbdULInpTNa0IG |= 2;
        int size = this.pzqP2AqKW6J5PO8zCKnW.size();
        for (int i = 0; i < size; i++) {
            ((DyKKpKofUua1vK) this.pzqP2AqKW6J5PO8zCKnW.get(i)).vE4yDIjexsP2lGjLaTcB();
        }
    }

    @Override // com.vdodsodjsdt.DyKKpKofUua1vK
    public final void w0Wu95l8dVNw5rZMRu(View view) {
        super.w0Wu95l8dVNw5rZMRu(view);
        int size = this.pzqP2AqKW6J5PO8zCKnW.size();
        for (int i = 0; i < size; i++) {
            ((DyKKpKofUua1vK) this.pzqP2AqKW6J5PO8zCKnW.get(i)).w0Wu95l8dVNw5rZMRu(view);
        }
    }

    @Override // com.vdodsodjsdt.DyKKpKofUua1vK
    public final String y1NaPKTl7R18DOr6e8i5(String str) {
        String strY1NaPKTl7R18DOr6e8i5 = super.y1NaPKTl7R18DOr6e8i5(str);
        for (int i = 0; i < this.pzqP2AqKW6J5PO8zCKnW.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strY1NaPKTl7R18DOr6e8i5);
            sb.append("\n");
            sb.append(((DyKKpKofUua1vK) this.pzqP2AqKW6J5PO8zCKnW.get(i)).y1NaPKTl7R18DOr6e8i5(str + "  "));
            strY1NaPKTl7R18DOr6e8i5 = sb.toString();
        }
        return strY1NaPKTl7R18DOr6e8i5;
    }

    @Override // com.vdodsodjsdt.DyKKpKofUua1vK
    public final void zIvmSL0wzmmKGc3X39b2Gw2mUGE(wfAv4Z4xkzEqsmKhnROCM57sUkreZ wfav4z4xkzeqsmkhnrocm57sukrez) {
        int size = this.pzqP2AqKW6J5PO8zCKnW.size();
        for (int i = 0; i < size; i++) {
            ((DyKKpKofUua1vK) this.pzqP2AqKW6J5PO8zCKnW.get(i)).zIvmSL0wzmmKGc3X39b2Gw2mUGE(wfav4z4xkzeqsmkhnrocm57sukrez);
        }
    }
}
