package com.vdodsodjsdt;

import android.widget.AbsListView;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class mHjO3Wy2eNesFRjVXo7uuDk implements AbsListView.OnScrollListener {
    public final /* synthetic */ uLXxmkdsO6wfrm VxUQ9tBhpHJ2AAEDNW8sghc4m;

    public mHjO3Wy2eNesFRjVXo7uuDk(uLXxmkdsO6wfrm ulxxmkdso6wfrm) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = ulxxmkdso6wfrm;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        uLXxmkdsO6wfrm ulxxmkdso6wfrm = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        xXAKJ3PJCCrkt6iLyU xxakj3pjccrkt6ilyu = ulxxmkdso6wfrm.f6ZQsR6bPLvvCDNXOUc;
        PoHNXL5T4Q0 poHNXL5T4Q0 = ulxxmkdso6wfrm.SuB3hEmTmbbRGAhtvOOmfKEon;
        if (i != 1 || poHNXL5T4Q0.getInputMethodMode() == 2 || poHNXL5T4Q0.getContentView() == null) {
            return;
        }
        ulxxmkdso6wfrm.q11o1hieEkZDhF1MGOZI26oZiDT.removeCallbacks(xxakj3pjccrkt6ilyu);
        xxakj3pjccrkt6ilyu.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
