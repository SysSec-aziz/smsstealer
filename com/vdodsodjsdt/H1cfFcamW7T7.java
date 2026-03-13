package com.vdodsodjsdt;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class H1cfFcamW7T7 extends dOYOTnFcxbQY9kd8M4lnq {
    public final /* synthetic */ int ZfQNn8hdWlEQ5cR94249PDsLR;

    public /* synthetic */ H1cfFcamW7T7(int i) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i;
    }

    @Override // com.vdodsodjsdt.dOYOTnFcxbQY9kd8M4lnq
    public void V57tEvNfxZVVcOCAOih5PKr(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                super.V57tEvNfxZVVcOCAOih5PKr(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                break;
            default:
                super.V57tEvNfxZVVcOCAOih5PKr(view, accessibilityEvent);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    @Override // com.vdodsodjsdt.dOYOTnFcxbQY9kd8M4lnq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean ZLZeBXTMq0zDztBxtRTuCHrapQ(android.view.View r5, int r6, android.os.Bundle r7) {
        /*
            r4 = this;
            int r0 = r4.ZfQNn8hdWlEQ5cR94249PDsLR
            switch(r0) {
                case 3: goto La;
                default: goto L5;
            }
        L5:
            boolean r5 = super.ZLZeBXTMq0zDztBxtRTuCHrapQ(r5, r6, r7)
            return r5
        La:
            boolean r7 = super.ZLZeBXTMq0zDztBxtRTuCHrapQ(r5, r6, r7)
            r0 = 1
            if (r7 == 0) goto L13
            goto La1
        L13:
            androidx.core.widget.NestedScrollView r5 = (androidx.core.widget.NestedScrollView) r5
            boolean r7 = r5.isEnabled()
            r1 = 0
            if (r7 != 0) goto L1e
            goto La0
        L1e:
            int r7 = r5.getHeight()
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.Matrix r3 = r5.getMatrix()
            boolean r3 = r3.isIdentity()
            if (r3 == 0) goto L3b
            boolean r3 = r5.getGlobalVisibleRect(r2)
            if (r3 == 0) goto L3b
            int r7 = r2.height()
        L3b:
            r2 = 4096(0x1000, float:5.74E-42)
            if (r6 == r2) goto L75
            r2 = 8192(0x2000, float:1.148E-41)
            if (r6 == r2) goto L4e
            r2 = 16908344(0x1020038, float:2.3877386E-38)
            if (r6 == r2) goto L4e
            r2 = 16908346(0x102003a, float:2.3877392E-38)
            if (r6 == r2) goto L75
            goto La0
        L4e:
            int r6 = r5.getPaddingBottom()
            int r7 = r7 - r6
            int r6 = r5.getPaddingTop()
            int r7 = r7 - r6
            int r6 = r5.getScrollY()
            int r6 = r6 - r7
            int r6 = java.lang.Math.max(r6, r1)
            int r7 = r5.getScrollY()
            if (r6 == r7) goto La0
            int r7 = r5.getScrollX()
            int r1 = r1 - r7
            int r7 = r5.getScrollY()
            int r6 = r6 - r7
            r5.vBGA6pPLqSMuYGvprl270j7(r1, r6, r0)
            goto La1
        L75:
            int r6 = r5.getPaddingBottom()
            int r7 = r7 - r6
            int r6 = r5.getPaddingTop()
            int r7 = r7 - r6
            int r6 = r5.getScrollY()
            int r6 = r6 + r7
            int r7 = r5.getScrollRange()
            int r6 = java.lang.Math.min(r6, r7)
            int r7 = r5.getScrollY()
            if (r6 == r7) goto La0
            int r7 = r5.getScrollX()
            int r1 = r1 - r7
            int r7 = r5.getScrollY()
            int r6 = r6 - r7
            r5.vBGA6pPLqSMuYGvprl270j7(r1, r6, r0)
            goto La1
        La0:
            r0 = r1
        La1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.H1cfFcamW7T7.ZLZeBXTMq0zDztBxtRTuCHrapQ(android.view.View, int, android.os.Bundle):boolean");
    }

    @Override // com.vdodsodjsdt.dOYOTnFcxbQY9kd8M4lnq
    public final void ZfQNn8hdWlEQ5cR94249PDsLR(View view, wzEak8ZKpNWHd4RKPYQ wzeak8zkpnwhd4rkpyq) {
        int scrollRange;
        switch (this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = wzeak8zkpnwhd4rkpyq.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCollectionInfo(null);
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo2 = wzeak8zkpnwhd4rkpyq.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setScrollable(false);
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                AccessibilityNodeInfo accessibilityNodeInfo3 = wzeak8zkpnwhd4rkpyq.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCollectionInfo(null);
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                AccessibilityNodeInfo accessibilityNodeInfo4 = wzeak8zkpnwhd4rkpyq.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                wzeak8zkpnwhd4rkpyq.GI83zq0G8e7zkn(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    accessibilityNodeInfo4.setScrollable(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        wzeak8zkpnwhd4rkpyq.zzpBGItXfub0yWj(jj77w443kpEYEOqOOio.ZLZeBXTMq0zDztBxtRTuCHrapQ);
                        wzeak8zkpnwhd4rkpyq.zzpBGItXfub0yWj(jj77w443kpEYEOqOOio.HzCpKshMOoaw76hFcbOVRYMeRd);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        wzeak8zkpnwhd4rkpyq.zzpBGItXfub0yWj(jj77w443kpEYEOqOOio.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
                        wzeak8zkpnwhd4rkpyq.zzpBGItXfub0yWj(jj77w443kpEYEOqOOio.KUYypEB4eNWOZWVDpH);
                    }
                    break;
                }
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo5 = wzeak8zkpnwhd4rkpyq.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo5);
                accessibilityNodeInfo5.setVisibleToUser(false);
                break;
        }
    }
}
