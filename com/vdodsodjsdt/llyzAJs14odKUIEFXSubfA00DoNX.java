package com.vdodsodjsdt;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class llyzAJs14odKUIEFXSubfA00DoNX implements Callable {
    public final /* synthetic */ xgjEDGKy9VX5 VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final /* synthetic */ SX5PHeJQdzT24G3iHfmAKRZsddf zzpBGItXfub0yWj;

    public llyzAJs14odKUIEFXSubfA00DoNX(SX5PHeJQdzT24G3iHfmAKRZsddf sX5PHeJQdzT24G3iHfmAKRZsddf, xgjEDGKy9VX5 xgjedgky9vx5) {
        this.zzpBGItXfub0yWj = sX5PHeJQdzT24G3iHfmAKRZsddf;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = xgjedgky9vx5;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Boolean boolValueOf;
        Cursor cursorQ1wNbhk2O6 = this.zzpBGItXfub0yWj.VxUQ9tBhpHJ2AAEDNW8sghc4m.q1wNbhk2O6(this.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        try {
            if (cursorQ1wNbhk2O6.moveToFirst()) {
                boolValueOf = Boolean.valueOf(cursorQ1wNbhk2O6.getInt(0) != 0);
            } else {
                boolValueOf = Boolean.FALSE;
            }
            cursorQ1wNbhk2O6.close();
            return boolValueOf;
        } catch (Throwable th) {
            cursorQ1wNbhk2O6.close();
            throw th;
        }
    }

    public final void finalize() {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.M9e7PWhFYLD2lOGMker();
    }
}
