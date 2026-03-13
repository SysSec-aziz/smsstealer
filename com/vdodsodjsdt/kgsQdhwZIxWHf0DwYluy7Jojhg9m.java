package com.vdodsodjsdt;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kgsQdhwZIxWHf0DwYluy7Jojhg9m extends m8WKJH6JbFg {
    public RRGaoI3KRDaK8aVeyxQAcc VxUQ9tBhpHJ2AAEDNW8sghc4m;

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public boolean ZLZeBXTMq0zDztBxtRTuCHrapQ(CoordinatorLayout coordinatorLayout, View view, int i) {
        ko09zE6UAgwkV(coordinatorLayout, view, i);
        if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m == null) {
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new RRGaoI3KRDaK8aVeyxQAcc(view);
        }
        RRGaoI3KRDaK8aVeyxQAcc rRGaoI3KRDaK8aVeyxQAcc = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        View view2 = (View) rRGaoI3KRDaK8aVeyxQAcc.V57tEvNfxZVVcOCAOih5PKr;
        rRGaoI3KRDaK8aVeyxQAcc.VxUQ9tBhpHJ2AAEDNW8sghc4m = view2.getTop();
        rRGaoI3KRDaK8aVeyxQAcc.zzpBGItXfub0yWj = view2.getLeft();
        RRGaoI3KRDaK8aVeyxQAcc rRGaoI3KRDaK8aVeyxQAcc2 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        View view3 = (View) rRGaoI3KRDaK8aVeyxQAcc2.V57tEvNfxZVVcOCAOih5PKr;
        int top = 0 - (view3.getTop() - rRGaoI3KRDaK8aVeyxQAcc2.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - rRGaoI3KRDaK8aVeyxQAcc2.zzpBGItXfub0yWj));
        return true;
    }

    public void ko09zE6UAgwkV(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.pYmKDYlAmhudp(view, i);
    }
}
