package com.vdodsodjsdt;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class Os0YjjlP0Nm8TZXIoEcgDYfM extends ContentFrameLayout {
    public final /* synthetic */ BbqUXujjobWQwx4SY HzCpKshMOoaw76hFcbOVRYMeRd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Os0YjjlP0Nm8TZXIoEcgDYfM(BbqUXujjobWQwx4SY bbqUXujjobWQwx4SY, KCzdBImvv2 kCzdBImvv2) {
        super(kCzdBImvv2, null);
        this.HzCpKshMOoaw76hFcbOVRYMeRd = bbqUXujjobWQwx4SY;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.HzCpKshMOoaw76hFcbOVRYMeRd.f6ZQsR6bPLvvCDNXOUc(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                BbqUXujjobWQwx4SY bbqUXujjobWQwx4SY = this.HzCpKshMOoaw76hFcbOVRYMeRd;
                bbqUXujjobWQwx4SY.ko09zE6UAgwkV(bbqUXujjobWQwx4SY.w0Wu95l8dVNw5rZMRu(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(getContext(), i));
    }
}
