package com.vdodsodjsdt;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class d9uIUa0qhR0HmxFMet {
    public final WeakReference VxUQ9tBhpHJ2AAEDNW8sghc4m;

    public d9uIUa0qhR0HmxFMet(View view) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new WeakReference(view);
    }

    public final void LaeGQIruHQu81hfJldjMOQSVblH3x(float f) {
        View view = (View) this.VxUQ9tBhpHJ2AAEDNW8sghc4m.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    public final void V57tEvNfxZVVcOCAOih5PKr(long j) {
        View view = (View) this.VxUQ9tBhpHJ2AAEDNW8sghc4m.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(float f) {
        View view = (View) this.VxUQ9tBhpHJ2AAEDNW8sghc4m.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR(u2BfIH7vVsa u2bfih7vvsa) {
        View view = (View) this.VxUQ9tBhpHJ2AAEDNW8sghc4m.get();
        if (view != null) {
            if (u2bfih7vvsa != null) {
                view.animate().setListener(new LJ0avg2f37zqC(u2bfih7vvsa, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void zzpBGItXfub0yWj() {
        View view = (View) this.VxUQ9tBhpHJ2AAEDNW8sghc4m.get();
        if (view != null) {
            view.animate().cancel();
        }
    }
}
