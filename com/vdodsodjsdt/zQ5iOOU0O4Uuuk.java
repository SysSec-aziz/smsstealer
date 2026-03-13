package com.vdodsodjsdt;

import android.net.ConnectivityManager;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class zQ5iOOU0O4Uuuk implements bipD1yHZW4C {
    public final ConnectivityManager VxUQ9tBhpHJ2AAEDNW8sghc4m;

    public zQ5iOOU0O4Uuuk(ConnectivityManager connectivityManager) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = connectivityManager;
    }

    @Override // com.vdodsodjsdt.bipD1yHZW4C
    public final boolean V57tEvNfxZVVcOCAOih5PKr(vIPEe55rgLxLcs vipee55rglxlcs) {
        if (zzpBGItXfub0yWj(vipee55rglxlcs)) {
            throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        }
        return false;
    }

    @Override // com.vdodsodjsdt.bipD1yHZW4C
    public final xxiquLU2H8aAS VxUQ9tBhpHJ2AAEDNW8sghc4m(c0WB626RcDoa849JB c0wb626rcdoa849jb) {
        ej6unYlOWMDF.pYmKDYlAmhudp(c0wb626rcdoa849jb, "constraints");
        return new xxiquLU2H8aAS(new gAuZgsHe09zkBKSLqYXmZ(c0wb626rcdoa849jb, this, null, 5), hu3HDJRthjXEukAdCh3Tdc.V57tEvNfxZVVcOCAOih5PKr, -2, UVzEPm75LoPBkSIomQaI29asGliB.V57tEvNfxZVVcOCAOih5PKr);
    }

    @Override // com.vdodsodjsdt.bipD1yHZW4C
    public final boolean zzpBGItXfub0yWj(vIPEe55rgLxLcs vipee55rglxlcs) {
        ej6unYlOWMDF.pYmKDYlAmhudp(vipee55rglxlcs, "workSpec");
        return vipee55rglxlcs.M9e7PWhFYLD2lOGMker.VxUQ9tBhpHJ2AAEDNW8sghc4m() != null;
    }
}
