package com.vdodsodjsdt;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class yVuHRiUaJhQPY extends View {
    public boolean V57tEvNfxZVVcOCAOih5PKr;

    public yVuHRiUaJhQPY(Context context) {
        super(context);
        this.V57tEvNfxZVVcOCAOih5PKr = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.V57tEvNfxZVVcOCAOih5PKr = z;
    }

    public void setGuidelineBegin(int i) {
        ZtjVvctVhW3SMibpO0L8oqBK ztjVvctVhW3SMibpO0L8oqBK = (ZtjVvctVhW3SMibpO0L8oqBK) getLayoutParams();
        if (this.V57tEvNfxZVVcOCAOih5PKr && ztjVvctVhW3SMibpO0L8oqBK.VxUQ9tBhpHJ2AAEDNW8sghc4m == i) {
            return;
        }
        ztjVvctVhW3SMibpO0L8oqBK.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        setLayoutParams(ztjVvctVhW3SMibpO0L8oqBK);
    }

    public void setGuidelineEnd(int i) {
        ZtjVvctVhW3SMibpO0L8oqBK ztjVvctVhW3SMibpO0L8oqBK = (ZtjVvctVhW3SMibpO0L8oqBK) getLayoutParams();
        if (this.V57tEvNfxZVVcOCAOih5PKr && ztjVvctVhW3SMibpO0L8oqBK.zzpBGItXfub0yWj == i) {
            return;
        }
        ztjVvctVhW3SMibpO0L8oqBK.zzpBGItXfub0yWj = i;
        setLayoutParams(ztjVvctVhW3SMibpO0L8oqBK);
    }

    public void setGuidelinePercent(float f) {
        ZtjVvctVhW3SMibpO0L8oqBK ztjVvctVhW3SMibpO0L8oqBK = (ZtjVvctVhW3SMibpO0L8oqBK) getLayoutParams();
        if (this.V57tEvNfxZVVcOCAOih5PKr && ztjVvctVhW3SMibpO0L8oqBK.V57tEvNfxZVVcOCAOih5PKr == f) {
            return;
        }
        ztjVvctVhW3SMibpO0L8oqBK.V57tEvNfxZVVcOCAOih5PKr = f;
        setLayoutParams(ztjVvctVhW3SMibpO0L8oqBK);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }
}
