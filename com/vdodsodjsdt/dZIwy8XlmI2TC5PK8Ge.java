package com.vdodsodjsdt;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class dZIwy8XlmI2TC5PK8Ge extends hWsX15LBWoRzT {
    public final /* synthetic */ cdk572h5yJaCskzyOrCOHZO pYmKDYlAmhudp;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dZIwy8XlmI2TC5PK8Ge(cdk572h5yJaCskzyOrCOHZO cdk572h5yjacskzyorcohzo, Context context) {
        super(context);
        this.pYmKDYlAmhudp = cdk572h5yjacskzyorcohzo;
    }

    @Override // com.vdodsodjsdt.hWsX15LBWoRzT
    public final int LaeGQIruHQu81hfJldjMOQSVblH3x(int i) {
        return Math.min(100, super.LaeGQIruHQu81hfJldjMOQSVblH3x(i));
    }

    @Override // com.vdodsodjsdt.hWsX15LBWoRzT
    public final void NSjgqmGjEzuugn2SsG1mZFP(View view, b2njgckk3JkU43cI67 b2njgckk3jku43ci67) {
        cdk572h5yJaCskzyOrCOHZO cdk572h5yjacskzyorcohzo = this.pYmKDYlAmhudp;
        int[] iArrVxUQ9tBhpHJ2AAEDNW8sghc4m = cdk572h5yjacskzyorcohzo.VxUQ9tBhpHJ2AAEDNW8sghc4m(cdk572h5yjacskzyorcohzo.VxUQ9tBhpHJ2AAEDNW8sghc4m.getLayoutManager(), view);
        int i = iArrVxUQ9tBhpHJ2AAEDNW8sghc4m[0];
        int i2 = iArrVxUQ9tBhpHJ2AAEDNW8sghc4m[1];
        int iCeil = (int) Math.ceil(((double) LaeGQIruHQu81hfJldjMOQSVblH3x(Math.max(Math.abs(i), Math.abs(i2)))) / 0.3356d);
        if (iCeil > 0) {
            b2njgckk3jku43ci67.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
            b2njgckk3jku43ci67.zzpBGItXfub0yWj = i2;
            b2njgckk3jku43ci67.V57tEvNfxZVVcOCAOih5PKr = iCeil;
            b2njgckk3jku43ci67.LaeGQIruHQu81hfJldjMOQSVblH3x = this.M9e7PWhFYLD2lOGMker;
            b2njgckk3jku43ci67.zIvmSL0wzmmKGc3X39b2Gw2mUGE = true;
        }
    }

    @Override // com.vdodsodjsdt.hWsX15LBWoRzT
    public final float ZfQNn8hdWlEQ5cR94249PDsLR(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
