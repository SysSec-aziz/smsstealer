package com.vdodsodjsdt;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class rVTyqtWb24L extends Avg9jswKZ9h8Wncg2f7 {
    public static final String V57tEvNfxZVVcOCAOih5PKr;
    public final int zzpBGItXfub0yWj;

    static {
        String strZLZeBXTMq0zDztBxtRTuCHrapQ = psATg3LCCdmDIiRgW.ZLZeBXTMq0zDztBxtRTuCHrapQ("NetworkMeteredCtrlr");
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strZLZeBXTMq0zDztBxtRTuCHrapQ, "tagWithPrefix(\"NetworkMeteredCtrlr\")");
        V57tEvNfxZVVcOCAOih5PKr = strZLZeBXTMq0zDztBxtRTuCHrapQ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rVTyqtWb24L(pfLEtIq3hsg pfletiq3hsg) {
        super(pfletiq3hsg);
        ej6unYlOWMDF.pYmKDYlAmhudp(pfletiq3hsg, "tracker");
        this.zzpBGItXfub0yWj = 7;
    }

    @Override // com.vdodsodjsdt.Avg9jswKZ9h8Wncg2f7
    public final boolean LaeGQIruHQu81hfJldjMOQSVblH3x(Object obj) {
        WdQbr7hqaGci2Lq wdQbr7hqaGci2Lq = (WdQbr7hqaGci2Lq) obj;
        ej6unYlOWMDF.pYmKDYlAmhudp(wdQbr7hqaGci2Lq, "value");
        boolean z = wdQbr7hqaGci2Lq.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (Build.VERSION.SDK_INT >= 26) {
            return (z && wdQbr7hqaGci2Lq.V57tEvNfxZVVcOCAOih5PKr) ? false : true;
        }
        psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(V57tEvNfxZVVcOCAOih5PKr, "Metered network constraint is not supported before API 26, only checking for connected state.");
        return !z;
    }

    @Override // com.vdodsodjsdt.Avg9jswKZ9h8Wncg2f7
    public final int ZfQNn8hdWlEQ5cR94249PDsLR() {
        return this.zzpBGItXfub0yWj;
    }

    @Override // com.vdodsodjsdt.bipD1yHZW4C
    public final boolean zzpBGItXfub0yWj(vIPEe55rgLxLcs vipee55rglxlcs) {
        ej6unYlOWMDF.pYmKDYlAmhudp(vipee55rglxlcs, "workSpec");
        return vipee55rglxlcs.M9e7PWhFYLD2lOGMker.VxUQ9tBhpHJ2AAEDNW8sghc4m == 5;
    }
}
