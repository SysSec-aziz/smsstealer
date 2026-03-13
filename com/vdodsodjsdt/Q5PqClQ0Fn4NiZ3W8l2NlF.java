package com.vdodsodjsdt;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class Q5PqClQ0Fn4NiZ3W8l2NlF implements Runnable {
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ iDvot0yk9ShdKjk0CN ZfQNn8hdWlEQ5cR94249PDsLR;

    public /* synthetic */ Q5PqClQ0Fn4NiZ3W8l2NlF(iDvot0yk9ShdKjk0CN idvot0yk9shdkjk0cn, int i) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = idvot0yk9shdkjk0cn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                ViewParent parent = this.ZfQNn8hdWlEQ5cR94249PDsLR.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                iDvot0yk9ShdKjk0CN idvot0yk9shdkjk0cn = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                idvot0yk9shdkjk0cn.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                View view = idvot0yk9shdkjk0cn.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                if (view.isEnabled() && !view.isLongClickable() && idvot0yk9shdkjk0cn.V57tEvNfxZVVcOCAOih5PKr()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    idvot0yk9shdkjk0cn.GI83zq0G8e7zkn = true;
                    break;
                }
                break;
        }
    }
}
