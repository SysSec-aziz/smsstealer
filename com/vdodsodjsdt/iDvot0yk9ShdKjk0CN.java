package com.vdodsodjsdt;

import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class iDvot0yk9ShdKjk0CN implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public boolean GI83zq0G8e7zkn;
    public final int[] HzCpKshMOoaw76hFcbOVRYMeRd = new int[2];
    public final int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public int M9e7PWhFYLD2lOGMker;
    public Q5PqClQ0Fn4NiZ3W8l2NlF NSjgqmGjEzuugn2SsG1mZFP;
    public final float V57tEvNfxZVVcOCAOih5PKr;
    public Q5PqClQ0Fn4NiZ3W8l2NlF ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final int ZfQNn8hdWlEQ5cR94249PDsLR;
    public final View zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public iDvot0yk9ShdKjk0CN(View view) {
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.V57tEvNfxZVVcOCAOih5PKr = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.ZfQNn8hdWlEQ5cR94249PDsLR = tapTimeout;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public abstract boolean V57tEvNfxZVVcOCAOih5PKr();

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        Q5PqClQ0Fn4NiZ3W8l2NlF q5PqClQ0Fn4NiZ3W8l2NlF = this.NSjgqmGjEzuugn2SsG1mZFP;
        View view = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (q5PqClQ0Fn4NiZ3W8l2NlF != null) {
            view.removeCallbacks(q5PqClQ0Fn4NiZ3W8l2NlF);
        }
        Q5PqClQ0Fn4NiZ3W8l2NlF q5PqClQ0Fn4NiZ3W8l2NlF2 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (q5PqClQ0Fn4NiZ3W8l2NlF2 != null) {
            view.removeCallbacks(q5PqClQ0Fn4NiZ3W8l2NlF2);
        }
    }

    public boolean ZfQNn8hdWlEQ5cR94249PDsLR() {
        pHKSskKTBV phksskktbvZzpBGItXfub0yWj = zzpBGItXfub0yWj();
        if (phksskktbvZzpBGItXfub0yWj == null || !phksskktbvZzpBGItXfub0yWj.VxUQ9tBhpHJ2AAEDNW8sghc4m()) {
            return true;
        }
        phksskktbvZzpBGItXfub0yWj.dismiss();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.iDvot0yk9ShdKjk0CN.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.GI83zq0G8e7zkn = false;
        this.M9e7PWhFYLD2lOGMker = -1;
        Q5PqClQ0Fn4NiZ3W8l2NlF q5PqClQ0Fn4NiZ3W8l2NlF = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (q5PqClQ0Fn4NiZ3W8l2NlF != null) {
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.removeCallbacks(q5PqClQ0Fn4NiZ3W8l2NlF);
        }
    }

    public abstract pHKSskKTBV zzpBGItXfub0yWj();

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
