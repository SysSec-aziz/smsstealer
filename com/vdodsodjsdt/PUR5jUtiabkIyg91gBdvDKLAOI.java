package com.vdodsodjsdt;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class PUR5jUtiabkIyg91gBdvDKLAOI extends vBbBrJPQxVfAKJPVGhF3v {
    public final /* synthetic */ O23cBAsx5mVwcI VxUQ9tBhpHJ2AAEDNW8sghc4m;

    public PUR5jUtiabkIyg91gBdvDKLAOI(O23cBAsx5mVwcI o23cBAsx5mVwcI) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = o23cBAsx5mVwcI;
    }

    @Override // com.vdodsodjsdt.vBbBrJPQxVfAKJPVGhF3v
    public final void zzpBGItXfub0yWj(RecyclerView recyclerView, int i, int i2) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        O23cBAsx5mVwcI o23cBAsx5mVwcI = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int i3 = o23cBAsx5mVwcI.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int iComputeVerticalScrollRange = o23cBAsx5mVwcI.jW7EiD0YL6xkbB158jMUzhWNWb1y.computeVerticalScrollRange();
        int i4 = o23cBAsx5mVwcI.ko09zE6UAgwkV;
        o23cBAsx5mVwcI.f6ZQsR6bPLvvCDNXOUc = iComputeVerticalScrollRange - i4 > 0 && i4 >= i3;
        int iComputeHorizontalScrollRange = o23cBAsx5mVwcI.jW7EiD0YL6xkbB158jMUzhWNWb1y.computeHorizontalScrollRange();
        int i5 = o23cBAsx5mVwcI.pYmKDYlAmhudp;
        boolean z = iComputeHorizontalScrollRange - i5 > 0 && i5 >= i3;
        o23cBAsx5mVwcI.vBGA6pPLqSMuYGvprl270j7 = z;
        boolean z2 = o23cBAsx5mVwcI.f6ZQsR6bPLvvCDNXOUc;
        if (!z2 && !z) {
            if (o23cBAsx5mVwcI.TaDO7ogis3aEiWEtq != 0) {
                o23cBAsx5mVwcI.zIvmSL0wzmmKGc3X39b2Gw2mUGE(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i4;
            o23cBAsx5mVwcI.KUYypEB4eNWOZWVDpH = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
            o23cBAsx5mVwcI.HzCpKshMOoaw76hFcbOVRYMeRd = Math.min(i4, (i4 * i4) / iComputeVerticalScrollRange);
        }
        if (o23cBAsx5mVwcI.vBGA6pPLqSMuYGvprl270j7) {
            float f2 = iComputeHorizontalScrollOffset;
            float f3 = i5;
            o23cBAsx5mVwcI.Ca81ebIan1u = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
            o23cBAsx5mVwcI.p59rPv72J9 = Math.min(i5, (i5 * i5) / iComputeHorizontalScrollRange);
        }
        int i6 = o23cBAsx5mVwcI.TaDO7ogis3aEiWEtq;
        if (i6 == 0 || i6 == 1) {
            o23cBAsx5mVwcI.zIvmSL0wzmmKGc3X39b2Gw2mUGE(1);
        }
    }
}
