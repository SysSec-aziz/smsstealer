package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.vdodsodjsdt.ABqn6mjor9ZOTvWaSXrN;
import com.vdodsodjsdt.IN79WcIk5xB4t0GjRT43qPLs5;
import com.vdodsodjsdt.ZIqdBIWI9mxq4Xsi8;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final IN79WcIk5xB4t0GjRT43qPLs5 NSjgqmGjEzuugn2SsG1mZFP;

    public BaseTransientBottomBar$Behavior() {
        IN79WcIk5xB4t0GjRT43qPLs5 iN79WcIk5xB4t0GjRT43qPLs5 = new IN79WcIk5xB4t0GjRT43qPLs5(23);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = 0;
        this.NSjgqmGjEzuugn2SsG1mZFP = iN79WcIk5xB4t0GjRT43qPLs5;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean ko09zE6UAgwkV(View view) {
        this.NSjgqmGjEzuugn2SsG1mZFP.getClass();
        return view instanceof ABqn6mjor9ZOTvWaSXrN;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, com.vdodsodjsdt.m8WKJH6JbFg
    public final boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.NSjgqmGjEzuugn2SsG1mZFP.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (ZIqdBIWI9mxq4Xsi8.zzpBGItXfub0yWj == null) {
                    ZIqdBIWI9mxq4Xsi8.zzpBGItXfub0yWj = new ZIqdBIWI9mxq4Xsi8();
                }
                synchronized (ZIqdBIWI9mxq4Xsi8.zzpBGItXfub0yWj.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
                }
            }
        } else if (coordinatorLayout.Ca81ebIan1u(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (ZIqdBIWI9mxq4Xsi8.zzpBGItXfub0yWj == null) {
                ZIqdBIWI9mxq4Xsi8.zzpBGItXfub0yWj = new ZIqdBIWI9mxq4Xsi8();
            }
            synchronized (ZIqdBIWI9mxq4Xsi8.zzpBGItXfub0yWj.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            }
        }
        return super.zIvmSL0wzmmKGc3X39b2Gw2mUGE(coordinatorLayout, view, motionEvent);
    }
}
