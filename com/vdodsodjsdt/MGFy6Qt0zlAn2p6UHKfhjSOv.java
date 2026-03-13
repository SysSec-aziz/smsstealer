package com.vdodsodjsdt;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class MGFy6Qt0zlAn2p6UHKfhjSOv extends F44whnLsbQ {
    public int HzCpKshMOoaw76hFcbOVRYMeRd;
    public int KUYypEB4eNWOZWVDpH = -1;
    public final /* synthetic */ SwipeDismissBehavior q1wNbhk2O6;

    public MGFy6Qt0zlAn2p6UHKfhjSOv(SwipeDismissBehavior swipeDismissBehavior) {
        this.q1wNbhk2O6 = swipeDismissBehavior;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    @Override // com.vdodsodjsdt.F44whnLsbQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L8DMw02rUTs2w(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.KUYypEB4eNWOZWVDpH = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 0
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.q1wNbhk2O6
            r4 = 1
            if (r1 == 0) goto L37
            int r5 = r9.getLayoutDirection()
            if (r5 != r4) goto L18
            r5 = r4
            goto L19
        L18:
            r5 = r2
        L19:
            int r6 = r3.ZfQNn8hdWlEQ5cR94249PDsLR
            r7 = 2
            if (r6 != r7) goto L1f
            goto L50
        L1f:
            if (r6 != 0) goto L2b
            if (r5 == 0) goto L28
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L65
            goto L50
        L28:
            if (r1 <= 0) goto L65
            goto L50
        L2b:
            if (r6 != r4) goto L65
            if (r5 == 0) goto L32
            if (r1 <= 0) goto L65
            goto L50
        L32:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L65
            goto L50
        L37:
            int r1 = r9.getLeft()
            int r5 = r8.HzCpKshMOoaw76hFcbOVRYMeRd
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L65
        L50:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L5f
            int r10 = r9.getLeft()
            int r0 = r8.HzCpKshMOoaw76hFcbOVRYMeRd
            if (r10 >= r0) goto L5d
            goto L5f
        L5d:
            int r0 = r0 + r11
            goto L63
        L5f:
            int r10 = r8.HzCpKshMOoaw76hFcbOVRYMeRd
            int r0 = r10 - r11
        L63:
            r2 = r4
            goto L67
        L65:
            int r0 = r8.HzCpKshMOoaw76hFcbOVRYMeRd
        L67:
            com.vdodsodjsdt.TxXBRRtCrcR759WKDq8m6Xg r10 = r3.VxUQ9tBhpHJ2AAEDNW8sghc4m
            int r11 = r9.getTop()
            boolean r10 = r10.Ca81ebIan1u(r0, r11)
            if (r10 == 0) goto L7b
            com.vdodsodjsdt.gZVesoHrfMaGvAvfBsRIr r10 = new com.vdodsodjsdt.gZVesoHrfMaGvAvfBsRIr
            r10.<init>(r3, r9, r2)
            r9.postOnAnimation(r10)
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.MGFy6Qt0zlAn2p6UHKfhjSOv.L8DMw02rUTs2w(android.view.View, float, float):void");
    }

    @Override // com.vdodsodjsdt.F44whnLsbQ
    public final int NSjgqmGjEzuugn2SsG1mZFP(View view, int i) {
        return view.getTop();
    }

    @Override // com.vdodsodjsdt.F44whnLsbQ
    public final void YdNRGRc4rly(View view, int i) {
        this.KUYypEB4eNWOZWVDpH = i;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.q1wNbhk2O6;
            swipeDismissBehavior.V57tEvNfxZVVcOCAOih5PKr = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.V57tEvNfxZVVcOCAOih5PKr = false;
        }
    }

    @Override // com.vdodsodjsdt.F44whnLsbQ
    public final int ZLZeBXTMq0zDztBxtRTuCHrapQ(View view, int i) {
        int width;
        int width2;
        int width3;
        boolean z = view.getLayoutDirection() == 1;
        int i2 = this.q1wNbhk2O6.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (i2 == 0) {
            if (z) {
                width = this.HzCpKshMOoaw76hFcbOVRYMeRd - view.getWidth();
                width2 = this.HzCpKshMOoaw76hFcbOVRYMeRd;
            } else {
                width = this.HzCpKshMOoaw76hFcbOVRYMeRd;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 != 1) {
            width = this.HzCpKshMOoaw76hFcbOVRYMeRd - view.getWidth();
            width2 = view.getWidth() + this.HzCpKshMOoaw76hFcbOVRYMeRd;
        } else if (z) {
            width = this.HzCpKshMOoaw76hFcbOVRYMeRd;
            width3 = view.getWidth();
            width2 = width3 + width;
        } else {
            width = this.HzCpKshMOoaw76hFcbOVRYMeRd - view.getWidth();
            width2 = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // com.vdodsodjsdt.F44whnLsbQ
    public final boolean bjhcQ0u7VT2OYYrwk96HrWoN(View view, int i) {
        int i2 = this.KUYypEB4eNWOZWVDpH;
        return (i2 == -1 || i2 == i) && this.q1wNbhk2O6.ko09zE6UAgwkV(view);
    }

    @Override // com.vdodsodjsdt.F44whnLsbQ
    public final void gBaBUmihn5l4u(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.q1wNbhk2O6;
        float f = width * swipeDismissBehavior.LaeGQIruHQu81hfJldjMOQSVblH3x;
        float width2 = view.getWidth() * swipeDismissBehavior.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        float fAbs = Math.abs(i - this.HzCpKshMOoaw76hFcbOVRYMeRd);
        if (fAbs <= f) {
            view.setAlpha(1.0f);
        } else if (fAbs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((fAbs - f) / (width2 - f))), 1.0f));
        }
    }

    @Override // com.vdodsodjsdt.F44whnLsbQ
    public final int vE4yDIjexsP2lGjLaTcB(View view) {
        return view.getWidth();
    }

    @Override // com.vdodsodjsdt.F44whnLsbQ
    public final void wRCD0SdqWCowdYU7bmzN(int i) {
    }
}
