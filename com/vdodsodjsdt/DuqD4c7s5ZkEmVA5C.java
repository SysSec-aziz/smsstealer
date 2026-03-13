package com.vdodsodjsdt;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class DuqD4c7s5ZkEmVA5C extends Avg9jswKZ9h8Wncg2f7 {
    public final int V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ int zzpBGItXfub0yWj;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DuqD4c7s5ZkEmVA5C(pfLEtIq3hsg pfletiq3hsg, int i) {
        super(pfletiq3hsg);
        this.zzpBGItXfub0yWj = i;
        switch (i) {
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                ej6unYlOWMDF.pYmKDYlAmhudp(pfletiq3hsg, "tracker");
                super(pfletiq3hsg);
                this.V57tEvNfxZVVcOCAOih5PKr = 7;
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                ej6unYlOWMDF.pYmKDYlAmhudp(pfletiq3hsg, "tracker");
                super(pfletiq3hsg);
                this.V57tEvNfxZVVcOCAOih5PKr = 7;
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                ej6unYlOWMDF.pYmKDYlAmhudp(pfletiq3hsg, "tracker");
                super(pfletiq3hsg);
                this.V57tEvNfxZVVcOCAOih5PKr = 9;
                break;
            default:
                ej6unYlOWMDF.pYmKDYlAmhudp(pfletiq3hsg, "tracker");
                this.V57tEvNfxZVVcOCAOih5PKr = 6;
                break;
        }
    }

    @Override // com.vdodsodjsdt.Avg9jswKZ9h8Wncg2f7
    public final boolean LaeGQIruHQu81hfJldjMOQSVblH3x(Object obj) {
        boolean zBooleanValue;
        switch (this.zzpBGItXfub0yWj) {
            case 0:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                WdQbr7hqaGci2Lq wdQbr7hqaGci2Lq = (WdQbr7hqaGci2Lq) obj;
                ej6unYlOWMDF.pYmKDYlAmhudp(wdQbr7hqaGci2Lq, "value");
                boolean z = wdQbr7hqaGci2Lq.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                return Build.VERSION.SDK_INT < 26 ? !z : !(z && wdQbr7hqaGci2Lq.zzpBGItXfub0yWj);
            case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                WdQbr7hqaGci2Lq wdQbr7hqaGci2Lq2 = (WdQbr7hqaGci2Lq) obj;
                ej6unYlOWMDF.pYmKDYlAmhudp(wdQbr7hqaGci2Lq2, "value");
                return !wdQbr7hqaGci2Lq2.VxUQ9tBhpHJ2AAEDNW8sghc4m || wdQbr7hqaGci2Lq2.V57tEvNfxZVVcOCAOih5PKr;
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }

    @Override // com.vdodsodjsdt.Avg9jswKZ9h8Wncg2f7
    public final int ZfQNn8hdWlEQ5cR94249PDsLR() {
        switch (this.zzpBGItXfub0yWj) {
        }
        return this.V57tEvNfxZVVcOCAOih5PKr;
    }

    @Override // com.vdodsodjsdt.bipD1yHZW4C
    public final boolean zzpBGItXfub0yWj(vIPEe55rgLxLcs vipee55rglxlcs) {
        switch (this.zzpBGItXfub0yWj) {
            case 0:
                ej6unYlOWMDF.pYmKDYlAmhudp(vipee55rglxlcs, "workSpec");
                return vipee55rglxlcs.M9e7PWhFYLD2lOGMker.V57tEvNfxZVVcOCAOih5PKr;
            case 1:
                ej6unYlOWMDF.pYmKDYlAmhudp(vipee55rglxlcs, "workSpec");
                return vipee55rglxlcs.M9e7PWhFYLD2lOGMker.LaeGQIruHQu81hfJldjMOQSVblH3x;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                ej6unYlOWMDF.pYmKDYlAmhudp(vipee55rglxlcs, "workSpec");
                return vipee55rglxlcs.M9e7PWhFYLD2lOGMker.VxUQ9tBhpHJ2AAEDNW8sghc4m == 2;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                ej6unYlOWMDF.pYmKDYlAmhudp(vipee55rglxlcs, "workSpec");
                int i = vipee55rglxlcs.M9e7PWhFYLD2lOGMker.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                return i == 3 || (Build.VERSION.SDK_INT >= 30 && i == 6);
            default:
                ej6unYlOWMDF.pYmKDYlAmhudp(vipee55rglxlcs, "workSpec");
                return vipee55rglxlcs.M9e7PWhFYLD2lOGMker.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DuqD4c7s5ZkEmVA5C(NXYyCFwrJiQhpxSwJB6lJD37IZ nXYyCFwrJiQhpxSwJB6lJD37IZ) {
        super(nXYyCFwrJiQhpxSwJB6lJD37IZ);
        this.zzpBGItXfub0yWj = 1;
        ej6unYlOWMDF.pYmKDYlAmhudp(nXYyCFwrJiQhpxSwJB6lJD37IZ, "tracker");
        this.V57tEvNfxZVVcOCAOih5PKr = 5;
    }
}
