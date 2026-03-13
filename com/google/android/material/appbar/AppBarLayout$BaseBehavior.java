package com.google.android.material.appbar;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.vdodsodjsdt.kgsQdhwZIxWHf0DwYluy7Jojhg9m;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class AppBarLayout$BaseBehavior<T> extends kgsQdhwZIxWHf0DwYluy7Jojhg9m {
    public int ZfQNn8hdWlEQ5cR94249PDsLR;
    public VelocityTracker zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public boolean zzpBGItXfub0yWj;
    public int V57tEvNfxZVVcOCAOih5PKr = -1;
    public int LaeGQIruHQu81hfJldjMOQSVblH3x = -1;

    public AppBarLayout$BaseBehavior() {
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final boolean Ca81ebIan1u(View view, int i, int i2) {
        throw new ClassCastException();
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final void HzCpKshMOoaw76hFcbOVRYMeRd(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        throw new ClassCastException();
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final /* synthetic */ void M9e7PWhFYLD2lOGMker(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        throw new ClassCastException();
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final boolean NSjgqmGjEzuugn2SsG1mZFP(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        throw new ClassCastException();
    }

    @Override // com.vdodsodjsdt.kgsQdhwZIxWHf0DwYluy7Jojhg9m, com.vdodsodjsdt.m8WKJH6JbFg
    public final boolean ZLZeBXTMq0zDztBxtRTuCHrapQ(CoordinatorLayout coordinatorLayout, View view, int i) {
        throw new ClassCastException();
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final void h3jnZRsdwYJfY9UhQCkbvWciwvFHv(View view, View view2, int i) {
        throw new ClassCastException();
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final Parcelable p59rPv72J9(View view) {
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0064 A[RETURN] */
    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean pYmKDYlAmhudp(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            int r0 = r7.getActionMasked()
            r1 = -1
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L46
            r4 = 2
            if (r0 == r4) goto L2d
            r6 = 3
            if (r0 == r6) goto L4a
            r6 = 6
            if (r0 == r6) goto L13
            goto L58
        L13:
            int r6 = r7.getActionIndex()
            if (r6 != 0) goto L1b
            r6 = r3
            goto L1c
        L1b:
            r6 = r2
        L1c:
            int r0 = r7.getPointerId(r6)
            r5.V57tEvNfxZVVcOCAOih5PKr = r0
            float r6 = r7.getY(r6)
            r0 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 + r0
            int r6 = (int) r6
            r5.ZfQNn8hdWlEQ5cR94249PDsLR = r6
            goto L58
        L2d:
            int r0 = r5.V57tEvNfxZVVcOCAOih5PKr
            int r0 = r7.findPointerIndex(r0)
            if (r0 != r1) goto L36
            goto L63
        L36:
            float r7 = r7.getY(r0)
            int r7 = (int) r7
            r5.ZfQNn8hdWlEQ5cR94249PDsLR = r7
            r6.getClass()
            java.lang.ClassCastException r6 = new java.lang.ClassCastException
            r6.<init>()
            throw r6
        L46:
            android.view.VelocityTracker r0 = r5.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            if (r0 != 0) goto L65
        L4a:
            r5.zzpBGItXfub0yWj = r2
            r5.V57tEvNfxZVVcOCAOih5PKr = r1
            android.view.VelocityTracker r6 = r5.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            if (r6 == 0) goto L58
            r6.recycle()
            r6 = 0
            r5.zIvmSL0wzmmKGc3X39b2Gw2mUGE = r6
        L58:
            android.view.VelocityTracker r6 = r5.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            if (r6 == 0) goto L5f
            r6.addMovement(r7)
        L5f:
            boolean r6 = r5.zzpBGItXfub0yWj
            if (r6 != 0) goto L64
        L63:
            return r2
        L64:
            return r3
        L65:
            r0.addMovement(r7)
            android.view.VelocityTracker r7 = r5.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            r0 = 1000(0x3e8, float:1.401E-42)
            r7.computeCurrentVelocity(r0)
            android.view.VelocityTracker r7 = r5.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            int r0 = r5.V57tEvNfxZVVcOCAOih5PKr
            r7.getYVelocity(r0)
            r6.getClass()
            java.lang.ClassCastException r6 = new java.lang.ClassCastException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout$BaseBehavior.pYmKDYlAmhudp(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final void q1wNbhk2O6(View view, Parcelable parcelable) {
        throw new ClassCastException();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004e  */
    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE(androidx.coordinatorlayout.widget.CoordinatorLayout r4, android.view.View r5, android.view.MotionEvent r6) {
        /*
            r3 = this;
            int r5 = r3.LaeGQIruHQu81hfJldjMOQSVblH3x
            if (r5 >= 0) goto L12
            android.content.Context r4 = r4.getContext()
            android.view.ViewConfiguration r4 = android.view.ViewConfiguration.get(r4)
            int r4 = r4.getScaledTouchSlop()
            r3.LaeGQIruHQu81hfJldjMOQSVblH3x = r4
        L12:
            int r4 = r6.getActionMasked()
            r5 = 2
            r0 = -1
            r1 = 0
            if (r4 != r5) goto L40
            boolean r4 = r3.zzpBGItXfub0yWj
            if (r4 == 0) goto L40
            int r4 = r3.V57tEvNfxZVVcOCAOih5PKr
            if (r4 != r0) goto L24
            goto L4d
        L24:
            int r4 = r6.findPointerIndex(r4)
            if (r4 != r0) goto L2b
            goto L4d
        L2b:
            float r4 = r6.getY(r4)
            int r4 = (int) r4
            int r5 = r3.ZfQNn8hdWlEQ5cR94249PDsLR
            int r5 = r4 - r5
            int r5 = java.lang.Math.abs(r5)
            int r2 = r3.LaeGQIruHQu81hfJldjMOQSVblH3x
            if (r5 <= r2) goto L40
            r3.ZfQNn8hdWlEQ5cR94249PDsLR = r4
            r4 = 1
            return r4
        L40:
            int r4 = r6.getActionMasked()
            if (r4 == 0) goto L4e
            android.view.VelocityTracker r4 = r3.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            if (r4 == 0) goto L4d
            r4.addMovement(r6)
        L4d:
            return r1
        L4e:
            r3.V57tEvNfxZVVcOCAOih5PKr = r0
            r6.getX()
            r6.getY()
            java.lang.ClassCastException r4 = new java.lang.ClassCastException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout$BaseBehavior.zIvmSL0wzmmKGc3X39b2Gw2mUGE(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public AppBarLayout$BaseBehavior(Context context, AttributeSet attributeSet) {
    }
}
