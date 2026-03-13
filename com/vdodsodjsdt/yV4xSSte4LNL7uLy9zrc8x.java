package com.vdodsodjsdt;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class yV4xSSte4LNL7uLy9zrc8x implements View.OnTouchListener {
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ Object ZfQNn8hdWlEQ5cR94249PDsLR;

    public /* synthetic */ yV4xSSte4LNL7uLy9zrc8x(int i, Object obj) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                uLXxmkdsO6wfrm ulxxmkdso6wfrm = (uLXxmkdsO6wfrm) this.ZfQNn8hdWlEQ5cR94249PDsLR;
                xXAKJ3PJCCrkt6iLyU xxakj3pjccrkt6ilyu = ulxxmkdso6wfrm.f6ZQsR6bPLvvCDNXOUc;
                Handler handler = ulxxmkdso6wfrm.q11o1hieEkZDhF1MGOZI26oZiDT;
                PoHNXL5T4Q0 poHNXL5T4Q0 = ulxxmkdso6wfrm.SuB3hEmTmbbRGAhtvOOmfKEon;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && poHNXL5T4Q0 != null && poHNXL5T4Q0.isShowing() && x >= 0 && x < poHNXL5T4Q0.getWidth() && y >= 0 && y < poHNXL5T4Q0.getHeight()) {
                    handler.postDelayed(xxakj3pjccrkt6ilyu, 250L);
                    return false;
                }
                if (action != 1) {
                    return false;
                }
                handler.removeCallbacks(xxakj3pjccrkt6ilyu);
                return false;
            default:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) this.ZfQNn8hdWlEQ5cR94249PDsLR).onTouchEvent(motionEvent);
                }
                return false;
        }
    }
}
