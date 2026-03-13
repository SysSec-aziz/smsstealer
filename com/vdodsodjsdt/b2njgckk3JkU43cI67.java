package com.vdodsodjsdt;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class b2njgckk3JkU43cI67 {
    public Interpolator LaeGQIruHQu81hfJldjMOQSVblH3x;
    public int V57tEvNfxZVVcOCAOih5PKr;
    public int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public int ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public int ZfQNn8hdWlEQ5cR94249PDsLR;
    public boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public int zzpBGItXfub0yWj;

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(RecyclerView recyclerView) {
        int i = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (i >= 0) {
            this.ZfQNn8hdWlEQ5cR94249PDsLR = -1;
            recyclerView.CixTK5ZX8oWXHz34qHYV(i);
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = false;
            return;
        }
        if (!this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = 0;
            return;
        }
        Interpolator interpolator = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (interpolator != null && this.V57tEvNfxZVVcOCAOih5PKr < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i2 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (i2 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.zOk739gUM7zIZC25HHUxoiyixWFjn.zzpBGItXfub0yWj(this.VxUQ9tBhpHJ2AAEDNW8sghc4m, this.zzpBGItXfub0yWj, i2, interpolator);
        int i3 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ + 1;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = i3;
        if (i3 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = false;
    }
}
