package com.vdodsodjsdt;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class STMtgT9EEB44eh4iSy30OYsZ extends QqFWwJ4NrJZKM5q3nnD {
    public STMtgT9EEB44eh4iSy30OYsZ(pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqq, WindowInsets windowInsets) {
        super(pmjh8rqwiwrth8coqq, windowInsets);
    }

    @Override // com.vdodsodjsdt.ueiyNUHTUsoj16g9F
    public QqSlARFYnjeu4iv9uWe LaeGQIruHQu81hfJldjMOQSVblH3x() {
        DisplayCutout displayCutout = this.V57tEvNfxZVVcOCAOih5PKr.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new QqSlARFYnjeu4iv9uWe(displayCutout);
    }

    @Override // com.vdodsodjsdt.ueiyNUHTUsoj16g9F
    public pmJH8rqWIwRth8COqq VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return pmJH8rqWIwRth8COqq.ZLZeBXTMq0zDztBxtRTuCHrapQ(null, this.V57tEvNfxZVVcOCAOih5PKr.consumeDisplayCutout());
    }

    @Override // com.vdodsodjsdt.ACHQH4O0M6xZgdzgI5gPCN435AVw, com.vdodsodjsdt.ueiyNUHTUsoj16g9F
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof STMtgT9EEB44eh4iSy30OYsZ)) {
            return false;
        }
        STMtgT9EEB44eh4iSy30OYsZ sTMtgT9EEB44eh4iSy30OYsZ = (STMtgT9EEB44eh4iSy30OYsZ) obj;
        return Objects.equals(this.V57tEvNfxZVVcOCAOih5PKr, sTMtgT9EEB44eh4iSy30OYsZ.V57tEvNfxZVVcOCAOih5PKr) && Objects.equals(this.ZLZeBXTMq0zDztBxtRTuCHrapQ, sTMtgT9EEB44eh4iSy30OYsZ.ZLZeBXTMq0zDztBxtRTuCHrapQ) && ACHQH4O0M6xZgdzgI5gPCN435AVw.w0Wu95l8dVNw5rZMRu(this.NSjgqmGjEzuugn2SsG1mZFP, sTMtgT9EEB44eh4iSy30OYsZ.NSjgqmGjEzuugn2SsG1mZFP);
    }

    @Override // com.vdodsodjsdt.ueiyNUHTUsoj16g9F
    public int hashCode() {
        return this.V57tEvNfxZVVcOCAOih5PKr.hashCode();
    }
}
