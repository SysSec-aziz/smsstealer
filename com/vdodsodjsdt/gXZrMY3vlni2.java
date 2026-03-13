package com.vdodsodjsdt;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class gXZrMY3vlni2 {
    public boolean LaeGQIruHQu81hfJldjMOQSVblH3x;
    public Interpolator V57tEvNfxZVVcOCAOih5PKr;
    public u2BfIH7vVsa ZfQNn8hdWlEQ5cR94249PDsLR;
    public long zzpBGItXfub0yWj = -1;
    public final NapHG3z2CAjypFxeHgjJECwe3 zIvmSL0wzmmKGc3X39b2Gw2mUGE = new NapHG3z2CAjypFxeHgjJECwe3(this);
    public final ArrayList VxUQ9tBhpHJ2AAEDNW8sghc4m = new ArrayList();

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            ArrayList arrayList = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((d9uIUa0qhR0HmxFMet) obj).zzpBGItXfub0yWj();
            }
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = false;
        }
    }

    public final void zzpBGItXfub0yWj() {
        View view;
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            return;
        }
        ArrayList arrayList = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            d9uIUa0qhR0HmxFMet d9uiua0qhr0hmxfmet = (d9uIUa0qhR0HmxFMet) obj;
            long j = this.zzpBGItXfub0yWj;
            if (j >= 0) {
                d9uiua0qhr0hmxfmet.V57tEvNfxZVVcOCAOih5PKr(j);
            }
            Interpolator interpolator = this.V57tEvNfxZVVcOCAOih5PKr;
            if (interpolator != null && (view = (View) d9uiua0qhr0hmxfmet.VxUQ9tBhpHJ2AAEDNW8sghc4m.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.ZfQNn8hdWlEQ5cR94249PDsLR != null) {
                d9uiua0qhr0hmxfmet.ZfQNn8hdWlEQ5cR94249PDsLR(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
            }
            View view2 = (View) d9uiua0qhr0hmxfmet.VxUQ9tBhpHJ2AAEDNW8sghc4m.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = true;
    }
}
