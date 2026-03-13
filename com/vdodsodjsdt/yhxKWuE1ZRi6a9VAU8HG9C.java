package com.vdodsodjsdt;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class yhxKWuE1ZRi6a9VAU8HG9C {
    public int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ RecyclerView NSjgqmGjEzuugn2SsG1mZFP;
    public final ArrayList V57tEvNfxZVVcOCAOih5PKr;
    public final ArrayList VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public S2nN0Z2yP6NYzcJu8Sd ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final List ZfQNn8hdWlEQ5cR94249PDsLR;
    public int zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public ArrayList zzpBGItXfub0yWj;

    public yhxKWuE1ZRi6a9VAU8HG9C(RecyclerView recyclerView) {
        this.NSjgqmGjEzuugn2SsG1mZFP = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = arrayList;
        this.zzpBGItXfub0yWj = null;
        this.V57tEvNfxZVVcOCAOih5PKr = new ArrayList();
        this.ZfQNn8hdWlEQ5cR94249PDsLR = Collections.unmodifiableList(arrayList);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = 2;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = 2;
    }

    public final void GI83zq0G8e7zkn(View view) {
        RAU9GtBZd7wl rAU9GtBZd7wl;
        WFEUpQgjHl wFEUpQgjHlQygqjTppWwx992 = RecyclerView.qygqjTppWwx992(view);
        int i = wFEUpQgjHlQygqjTppWwx992.M9e7PWhFYLD2lOGMker & 12;
        RecyclerView recyclerView = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (i == 0 && wFEUpQgjHlQygqjTppWwx992.HzCpKshMOoaw76hFcbOVRYMeRd() && (rAU9GtBZd7wl = recyclerView.TqcnImqkSWIKht) != null) {
            OIQnrK0mzZ oIQnrK0mzZ = (OIQnrK0mzZ) rAU9GtBZd7wl;
            if (wFEUpQgjHlQygqjTppWwx992.V57tEvNfxZVVcOCAOih5PKr().isEmpty() && oIQnrK0mzZ.ZLZeBXTMq0zDztBxtRTuCHrapQ && !wFEUpQgjHlQygqjTppWwx992.zIvmSL0wzmmKGc3X39b2Gw2mUGE()) {
                if (this.zzpBGItXfub0yWj == null) {
                    this.zzpBGItXfub0yWj = new ArrayList();
                }
                wFEUpQgjHlQygqjTppWwx992.p59rPv72J9 = this;
                wFEUpQgjHlQygqjTppWwx992.Ca81ebIan1u = true;
                this.zzpBGItXfub0yWj.add(wFEUpQgjHlQygqjTppWwx992);
                return;
            }
        }
        if (wFEUpQgjHlQygqjTppWwx992.zIvmSL0wzmmKGc3X39b2Gw2mUGE() && !wFEUpQgjHlQygqjTppWwx992.NSjgqmGjEzuugn2SsG1mZFP() && !recyclerView.q1wNbhk2O6.zzpBGItXfub0yWj) {
            throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + recyclerView.w0Wu95l8dVNw5rZMRu());
        }
        wFEUpQgjHlQygqjTppWwx992.p59rPv72J9 = this;
        wFEUpQgjHlQygqjTppWwx992.Ca81ebIan1u = false;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.add(wFEUpQgjHlQygqjTppWwx992);
    }

    public final void HzCpKshMOoaw76hFcbOVRYMeRd(WFEUpQgjHl wFEUpQgjHl) {
        if (wFEUpQgjHl.Ca81ebIan1u) {
            this.zzpBGItXfub0yWj.remove(wFEUpQgjHl);
        } else {
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m.remove(wFEUpQgjHl);
        }
        wFEUpQgjHl.p59rPv72J9 = null;
        wFEUpQgjHl.Ca81ebIan1u = false;
        wFEUpQgjHl.M9e7PWhFYLD2lOGMker &= -33;
    }

    public final void KUYypEB4eNWOZWVDpH() {
        wbBBe1vAdVO1DmSg1odNaySAYTu wbbbe1vadvo1dmsg1odnaysaytu = this.NSjgqmGjEzuugn2SsG1mZFP.p59rPv72J9;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = this.LaeGQIruHQu81hfJldjMOQSVblH3x + (wbbbe1vadvo1dmsg1odnaysaytu != null ? wbbbe1vadvo1dmsg1odnaysaytu.M9e7PWhFYLD2lOGMker : 0);
        ArrayList arrayList = this.V57tEvNfxZVVcOCAOih5PKr;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.zIvmSL0wzmmKGc3X39b2Gw2mUGE; size--) {
            zIvmSL0wzmmKGc3X39b2Gw2mUGE(size);
        }
    }

    public final void LaeGQIruHQu81hfJldjMOQSVblH3x() {
        ArrayList arrayList = this.V57tEvNfxZVVcOCAOih5PKr;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            zIvmSL0wzmmKGc3X39b2Gw2mUGE(size);
        }
        arrayList.clear();
        int[] iArr = RecyclerView.r0dB0ojIy6g8mnk1;
        MSl7hPM6XqjxyBV5m mSl7hPM6XqjxyBV5m = this.NSjgqmGjEzuugn2SsG1mZFP.rERAmyEtGV6ANGszuKcQI;
        int[] iArr2 = (int[]) mSl7hPM6XqjxyBV5m.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (iArr2 != null) {
            Arrays.fill(iArr2, -1);
        }
        mSl7hPM6XqjxyBV5m.V57tEvNfxZVVcOCAOih5PKr = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.vdodsodjsdt.WFEUpQgjHl M9e7PWhFYLD2lOGMker(int r27, long r28) {
        /*
            Method dump skipped, instruction units count: 1409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.yhxKWuE1ZRi6a9VAU8HG9C.M9e7PWhFYLD2lOGMker(int, long):com.vdodsodjsdt.WFEUpQgjHl");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0095, code lost:
    
        r6 = r6 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void NSjgqmGjEzuugn2SsG1mZFP(com.vdodsodjsdt.WFEUpQgjHl r12) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.yhxKWuE1ZRi6a9VAU8HG9C.NSjgqmGjEzuugn2SsG1mZFP(com.vdodsodjsdt.WFEUpQgjHl):void");
    }

    public final S2nN0Z2yP6NYzcJu8Sd V57tEvNfxZVVcOCAOih5PKr() {
        if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ == null) {
            S2nN0Z2yP6NYzcJu8Sd s2nN0Z2yP6NYzcJu8Sd = new S2nN0Z2yP6NYzcJu8Sd();
            s2nN0Z2yP6NYzcJu8Sd.VxUQ9tBhpHJ2AAEDNW8sghc4m = new SparseArray();
            s2nN0Z2yP6NYzcJu8Sd.zzpBGItXfub0yWj = 0;
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = s2nN0Z2yP6NYzcJu8Sd;
        }
        return this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(WFEUpQgjHl wFEUpQgjHl, boolean z) {
        RecyclerView.M9e7PWhFYLD2lOGMker(wFEUpQgjHl);
        View view = wFEUpQgjHl.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        RecyclerView recyclerView = this.NSjgqmGjEzuugn2SsG1mZFP;
        cCsw66b243HzgVzE4uRxrAcogfXx6 ccsw66b243hzgvze4urxracogfxx6 = recyclerView.p6bBrs4p3Ly;
        if (ccsw66b243hzgvze4urxracogfxx6 != null) {
            umQT2h0DNiZFAiY umqt2h0dnizfaiy = ccsw66b243hzgvze4urxracogfxx6.LaeGQIruHQu81hfJldjMOQSVblH3x;
            xb0r6yEzq0tw9m7nTWG5BFR8.q1wNbhk2O6(view, umqt2h0dnizfaiy != null ? (dOYOTnFcxbQY9kd8M4lnq) umqt2h0dnizfaiy.LaeGQIruHQu81hfJldjMOQSVblH3x.remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.Ca81ebIan1u;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
            if (recyclerView.H2VFYNJEVGAX != null) {
                recyclerView.NSjgqmGjEzuugn2SsG1mZFP.KUYypEB4eNWOZWVDpH(wFEUpQgjHl);
            }
        }
        wFEUpQgjHl.jW7EiD0YL6xkbB158jMUzhWNWb1y = null;
        wFEUpQgjHl.ko09zE6UAgwkV = null;
        S2nN0Z2yP6NYzcJu8Sd s2nN0Z2yP6NYzcJu8SdV57tEvNfxZVVcOCAOih5PKr = V57tEvNfxZVVcOCAOih5PKr();
        s2nN0Z2yP6NYzcJu8SdV57tEvNfxZVVcOCAOih5PKr.getClass();
        int i = wFEUpQgjHl.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        ArrayList arrayList2 = s2nN0Z2yP6NYzcJu8SdV57tEvNfxZVVcOCAOih5PKr.VxUQ9tBhpHJ2AAEDNW8sghc4m(i).VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (((oHePsoiIXTc4hB) s2nN0Z2yP6NYzcJu8SdV57tEvNfxZVVcOCAOih5PKr.VxUQ9tBhpHJ2AAEDNW8sghc4m.get(i)).zzpBGItXfub0yWj <= arrayList2.size()) {
            return;
        }
        wFEUpQgjHl.q1wNbhk2O6();
        arrayList2.add(wFEUpQgjHl);
    }

    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ(View view) {
        WFEUpQgjHl wFEUpQgjHlQygqjTppWwx992 = RecyclerView.qygqjTppWwx992(view);
        boolean zM9e7PWhFYLD2lOGMker = wFEUpQgjHlQygqjTppWwx992.M9e7PWhFYLD2lOGMker();
        RecyclerView recyclerView = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (zM9e7PWhFYLD2lOGMker) {
            recyclerView.removeDetachedView(view, false);
        }
        if (wFEUpQgjHlQygqjTppWwx992.GI83zq0G8e7zkn()) {
            wFEUpQgjHlQygqjTppWwx992.p59rPv72J9.HzCpKshMOoaw76hFcbOVRYMeRd(wFEUpQgjHlQygqjTppWwx992);
        } else if (wFEUpQgjHlQygqjTppWwx992.h3jnZRsdwYJfY9UhQCkbvWciwvFHv()) {
            wFEUpQgjHlQygqjTppWwx992.M9e7PWhFYLD2lOGMker &= -33;
        }
        NSjgqmGjEzuugn2SsG1mZFP(wFEUpQgjHlQygqjTppWwx992);
        if (recyclerView.TqcnImqkSWIKht == null || wFEUpQgjHlQygqjTppWwx992.ZLZeBXTMq0zDztBxtRTuCHrapQ()) {
            return;
        }
        recyclerView.TqcnImqkSWIKht.ZfQNn8hdWlEQ5cR94249PDsLR(wFEUpQgjHlQygqjTppWwx992);
    }

    public final View ZfQNn8hdWlEQ5cR94249PDsLR(int i) {
        return M9e7PWhFYLD2lOGMker(i, Long.MAX_VALUE).VxUQ9tBhpHJ2AAEDNW8sghc4m;
    }

    public final void zIvmSL0wzmmKGc3X39b2Gw2mUGE(int i) {
        ArrayList arrayList = this.V57tEvNfxZVVcOCAOih5PKr;
        VxUQ9tBhpHJ2AAEDNW8sghc4m((WFEUpQgjHl) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public final int zzpBGItXfub0yWj(int i) {
        RecyclerView recyclerView = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (i >= 0 && i < recyclerView.H2VFYNJEVGAX.zzpBGItXfub0yWj()) {
            return !recyclerView.H2VFYNJEVGAX.ZLZeBXTMq0zDztBxtRTuCHrapQ ? i : recyclerView.zIvmSL0wzmmKGc3X39b2Gw2mUGE.LaeGQIruHQu81hfJldjMOQSVblH3x(i, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + recyclerView.H2VFYNJEVGAX.zzpBGItXfub0yWj() + recyclerView.w0Wu95l8dVNw5rZMRu());
    }
}
