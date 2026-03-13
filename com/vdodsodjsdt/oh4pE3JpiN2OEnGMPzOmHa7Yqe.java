package com.vdodsodjsdt;

import android.os.Build;
import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class oh4pE3JpiN2OEnGMPzOmHa7Yqe {
    public GEjyy5i3b4KJYgsmKOT VxUQ9tBhpHJ2AAEDNW8sghc4m;

    public oh4pE3JpiN2OEnGMPzOmHa7Yqe(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new SvzIeHhj05NbHzUgFakHP(X0A7raLNhpDiM5P5rp83bU.p59rPv72J9(i, interpolator, j));
        } else {
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new M9TaMBovb7u6bH(i, interpolator, j);
        }
    }
}
