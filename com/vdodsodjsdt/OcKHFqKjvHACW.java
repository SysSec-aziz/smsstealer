package com.vdodsodjsdt;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class OcKHFqKjvHACW extends RatingBar {
    public final dXZw8zZnRXsRIYJEIdZC V57tEvNfxZVVcOCAOih5PKr;

    public OcKHFqKjvHACW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        Pb2A9Zlv8rKgCsB4IXiB6Sd8AhCw.VxUQ9tBhpHJ2AAEDNW8sghc4m(this, getContext());
        dXZw8zZnRXsRIYJEIdZC dxzw8zznrxsriyjeidzc = new dXZw8zZnRXsRIYJEIdZC(this);
        this.V57tEvNfxZVVcOCAOih5PKr = dxzw8zznrxsriyjeidzc;
        dxzw8zznrxsriyjeidzc.LaeGQIruHQu81hfJldjMOQSVblH3x(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = (Bitmap) this.V57tEvNfxZVVcOCAOih5PKr.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
