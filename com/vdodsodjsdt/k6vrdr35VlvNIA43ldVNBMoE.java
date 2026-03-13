package com.vdodsodjsdt;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class k6vrdr35VlvNIA43ldVNBMoE extends CluohSX0eAQHylXJOFOnCXEf0C {
    public final Paint VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final List zzpBGItXfub0yWj;

    public k6vrdr35VlvNIA43ldVNBMoE() {
        Paint paint = new Paint();
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = paint;
        this.zzpBGItXfub0yWj = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // com.vdodsodjsdt.CluohSX0eAQHylXJOFOnCXEf0C
    public final void zzpBGItXfub0yWj(Canvas canvas, RecyclerView recyclerView) {
        Canvas canvas2;
        int iO1xDAlBZZlZdoEf747lCFHld;
        int iAXO0LSrt8bKV;
        float dimension = recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width);
        Paint paint = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        paint.setStrokeWidth(dimension);
        Iterator it = this.zzpBGItXfub0yWj.iterator();
        while (it.hasNext()) {
            ((NhPDS4BiLnyIV6x5MwuV8ci9) it.next()).getClass();
            ThreadLocal threadLocal = PyYsF2FE67iANgZ0fDkVtNG5uhA.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            float f = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f))));
            int iVE4yDIjexsP2lGjLaTcB = 0;
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).PfK8qHOJoCLG()) {
                YAgT80hsfLW9PF5 yAgT80hsfLW9PF5 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).pYmKDYlAmhudp;
                switch (yAgT80hsfLW9PF5.zzpBGItXfub0yWj) {
                    case 0:
                        break;
                    default:
                        iVE4yDIjexsP2lGjLaTcB = yAgT80hsfLW9PF5.V57tEvNfxZVVcOCAOih5PKr.HVEwbdULInpTNa0IG();
                        break;
                }
                float f2 = iVE4yDIjexsP2lGjLaTcB;
                YAgT80hsfLW9PF5 yAgT80hsfLW9PF52 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).pYmKDYlAmhudp;
                switch (yAgT80hsfLW9PF52.zzpBGItXfub0yWj) {
                    case 0:
                        iAXO0LSrt8bKV = yAgT80hsfLW9PF52.V57tEvNfxZVVcOCAOih5PKr.Ca81ebIan1u;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = yAgT80hsfLW9PF52.V57tEvNfxZVVcOCAOih5PKr;
                        iAXO0LSrt8bKV = carouselLayoutManager.Ca81ebIan1u - carouselLayoutManager.aXO0LSrt8bKV();
                        break;
                }
                canvas2 = canvas;
                canvas2.drawLine(0.0f, f2, 0.0f, iAXO0LSrt8bKV, paint);
            } else {
                canvas2 = canvas;
                YAgT80hsfLW9PF5 yAgT80hsfLW9PF53 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).pYmKDYlAmhudp;
                switch (yAgT80hsfLW9PF53.zzpBGItXfub0yWj) {
                    case 0:
                        iVE4yDIjexsP2lGjLaTcB = yAgT80hsfLW9PF53.V57tEvNfxZVVcOCAOih5PKr.vE4yDIjexsP2lGjLaTcB();
                        break;
                }
                float f3 = iVE4yDIjexsP2lGjLaTcB;
                YAgT80hsfLW9PF5 yAgT80hsfLW9PF54 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).pYmKDYlAmhudp;
                switch (yAgT80hsfLW9PF54.zzpBGItXfub0yWj) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = yAgT80hsfLW9PF54.V57tEvNfxZVVcOCAOih5PKr;
                        iO1xDAlBZZlZdoEf747lCFHld = carouselLayoutManager2.p59rPv72J9 - carouselLayoutManager2.O1xDAlBZZlZdoEf747lCFHld();
                        break;
                    default:
                        iO1xDAlBZZlZdoEf747lCFHld = yAgT80hsfLW9PF54.V57tEvNfxZVVcOCAOih5PKr.p59rPv72J9;
                        break;
                }
                canvas2.drawLine(f3, 0.0f, iO1xDAlBZZlZdoEf747lCFHld, 0.0f, paint);
            }
            canvas = canvas2;
        }
    }
}
