package com.vdodsodjsdt;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class cCsw66b243HzgVzE4uRxrAcogfXx6 extends dOYOTnFcxbQY9kd8M4lnq {
    public final umQT2h0DNiZFAiY LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final RecyclerView ZfQNn8hdWlEQ5cR94249PDsLR;

    public cCsw66b243HzgVzE4uRxrAcogfXx6(RecyclerView recyclerView) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR = recyclerView;
        umQT2h0DNiZFAiY umqt2h0dnizfaiy = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (umqt2h0dnizfaiy != null) {
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = umqt2h0dnizfaiy;
        } else {
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = new umQT2h0DNiZFAiY(this);
        }
    }

    @Override // com.vdodsodjsdt.dOYOTnFcxbQY9kd8M4lnq
    public final void V57tEvNfxZVVcOCAOih5PKr(View view, AccessibilityEvent accessibilityEvent) {
        super.V57tEvNfxZVVcOCAOih5PKr(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.ZfQNn8hdWlEQ5cR94249PDsLR.TqcnImqkSWIKht()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().ItrQwCXbty5PZtje5JS(accessibilityEvent);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056 A[PHI: r0
      0x0056: PHI (r0v8 int) = (r0v4 int), (r0v12 int) binds: [B:27:0x0073, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.vdodsodjsdt.dOYOTnFcxbQY9kd8M4lnq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean ZLZeBXTMq0zDztBxtRTuCHrapQ(android.view.View r4, int r5, android.os.Bundle r6) {
        /*
            r3 = this;
            boolean r4 = super.ZLZeBXTMq0zDztBxtRTuCHrapQ(r4, r5, r6)
            r6 = 1
            if (r4 == 0) goto L8
            return r6
        L8:
            androidx.recyclerview.widget.RecyclerView r4 = r3.ZfQNn8hdWlEQ5cR94249PDsLR
            boolean r0 = r4.TqcnImqkSWIKht()
            r1 = 0
            if (r0 != 0) goto L8c
            com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu r0 = r4.getLayoutManager()
            if (r0 == 0) goto L8c
            com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu r4 = r4.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r0 = r4.zzpBGItXfub0yWj
            com.vdodsodjsdt.yhxKWuE1ZRi6a9VAU8HG9C r2 = r0.ZfQNn8hdWlEQ5cR94249PDsLR
            r2 = 4096(0x1000, float:5.74E-42)
            if (r5 == r2) goto L58
            r2 = 8192(0x2000, float:1.148E-41)
            if (r5 == r2) goto L2a
            r5 = r1
            r0 = r5
            goto L81
        L2a:
            r5 = -1
            boolean r0 = r0.canScrollVertically(r5)
            if (r0 == 0) goto L3f
            int r0 = r4.Ca81ebIan1u
            int r2 = r4.HVEwbdULInpTNa0IG()
            int r0 = r0 - r2
            int r2 = r4.aXO0LSrt8bKV()
            int r0 = r0 - r2
            int r0 = -r0
            goto L40
        L3f:
            r0 = r1
        L40:
            androidx.recyclerview.widget.RecyclerView r2 = r4.zzpBGItXfub0yWj
            boolean r5 = r2.canScrollHorizontally(r5)
            if (r5 == 0) goto L56
            int r5 = r4.p59rPv72J9
            int r2 = r4.vE4yDIjexsP2lGjLaTcB()
            int r5 = r5 - r2
            int r2 = r4.O1xDAlBZZlZdoEf747lCFHld()
            int r5 = r5 - r2
            int r5 = -r5
            goto L81
        L56:
            r5 = r1
            goto L81
        L58:
            boolean r5 = r0.canScrollVertically(r6)
            if (r5 == 0) goto L6c
            int r5 = r4.Ca81ebIan1u
            int r0 = r4.HVEwbdULInpTNa0IG()
            int r5 = r5 - r0
            int r0 = r4.aXO0LSrt8bKV()
            int r5 = r5 - r0
            r0 = r5
            goto L6d
        L6c:
            r0 = r1
        L6d:
            androidx.recyclerview.widget.RecyclerView r5 = r4.zzpBGItXfub0yWj
            boolean r5 = r5.canScrollHorizontally(r6)
            if (r5 == 0) goto L56
            int r5 = r4.p59rPv72J9
            int r2 = r4.vE4yDIjexsP2lGjLaTcB()
            int r5 = r5 - r2
            int r2 = r4.O1xDAlBZZlZdoEf747lCFHld()
            int r5 = r5 - r2
        L81:
            if (r0 != 0) goto L86
            if (r5 != 0) goto L86
            goto L8c
        L86:
            androidx.recyclerview.widget.RecyclerView r4 = r4.zzpBGItXfub0yWj
            r4.zOk739gUM7zIZC25HHUxoiyixWFjn(r5, r0, r6)
            return r6
        L8c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.cCsw66b243HzgVzE4uRxrAcogfXx6.ZLZeBXTMq0zDztBxtRTuCHrapQ(android.view.View, int, android.os.Bundle):boolean");
    }

    @Override // com.vdodsodjsdt.dOYOTnFcxbQY9kd8M4lnq
    public final void ZfQNn8hdWlEQ5cR94249PDsLR(View view, wzEak8ZKpNWHd4RKPYQ wzeak8zkpnwhd4rkpyq) {
        AccessibilityNodeInfo accessibilityNodeInfo = wzeak8zkpnwhd4rkpyq.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (recyclerView.TqcnImqkSWIKht() || recyclerView.getLayoutManager() == null) {
            return;
        }
        wbBBe1vAdVO1DmSg1odNaySAYTu layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.zzpBGItXfub0yWj;
        yhxKWuE1ZRi6a9VAU8HG9C yhxkwue1zri6a9vau8hg9c = recyclerView2.ZfQNn8hdWlEQ5cR94249PDsLR;
        e20NJ5kD0wqGO3 e20nj5kd0wqgo3 = recyclerView2.H2VFYNJEVGAX;
        if (recyclerView2.canScrollVertically(-1) || layoutManager.zzpBGItXfub0yWj.canScrollHorizontally(-1)) {
            wzeak8zkpnwhd4rkpyq.VxUQ9tBhpHJ2AAEDNW8sghc4m(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (layoutManager.zzpBGItXfub0yWj.canScrollVertically(1) || layoutManager.zzpBGItXfub0yWj.canScrollHorizontally(1)) {
            wzeak8zkpnwhd4rkpyq.VxUQ9tBhpHJ2AAEDNW8sghc4m(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.iKANjmyTSxO6v6UuLPdu7DxOjlS(yhxkwue1zri6a9vau8hg9c, e20nj5kd0wqgo3), layoutManager.q11o1hieEkZDhF1MGOZI26oZiDT(yhxkwue1zri6a9vau8hg9c, e20nj5kd0wqgo3), false, 0));
    }
}
