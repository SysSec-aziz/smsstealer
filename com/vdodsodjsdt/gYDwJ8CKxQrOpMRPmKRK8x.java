package com.vdodsodjsdt;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class gYDwJ8CKxQrOpMRPmKRK8x extends LinearLayoutManager {
    public final /* synthetic */ ddDbMgQuo9affXXIMNMhQZaG3 O1xDAlBZZlZdoEf747lCFHld;
    public final /* synthetic */ int vE4yDIjexsP2lGjLaTcB;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gYDwJ8CKxQrOpMRPmKRK8x(ddDbMgQuo9affXXIMNMhQZaG3 dddbmgquo9affxximnmhqzag3, int i, int i2) {
        super(i);
        this.O1xDAlBZZlZdoEf747lCFHld = dddbmgquo9affxximnmhqzag3;
        this.vE4yDIjexsP2lGjLaTcB = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void nNOZCSz1a7S(e20NJ5kD0wqGO3 e20nj5kd0wqgo3, int[] iArr) {
        int i = this.vE4yDIjexsP2lGjLaTcB;
        ddDbMgQuo9affXXIMNMhQZaG3 dddbmgquo9affxximnmhqzag3 = this.O1xDAlBZZlZdoEf747lCFHld;
        if (i == 0) {
            iArr[0] = dddbmgquo9affxximnmhqzag3.H2VFYNJEVGAX.getWidth();
            iArr[1] = dddbmgquo9affxximnmhqzag3.H2VFYNJEVGAX.getWidth();
        } else {
            iArr[0] = dddbmgquo9affxximnmhqzag3.H2VFYNJEVGAX.getHeight();
            iArr[1] = dddbmgquo9affxximnmhqzag3.H2VFYNJEVGAX.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, com.vdodsodjsdt.wbBBe1vAdVO1DmSg1odNaySAYTu
    public final void zyiF0wv9HozxGOIDt8PvVp(RecyclerView recyclerView, int i) {
        bjZMVGssGHXYjIUZR bjzmvgssghxyjiuzr = new bjZMVGssGHXYjIUZR(recyclerView.getContext());
        bjzmvgssghxyjiuzr.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        KMiA9Sqk243eQkFNNoS(bjzmvgssghxyjiuzr);
    }
}
