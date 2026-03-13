package com.vdodsodjsdt;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class BOLnrr2jCIFL4gTrjk5BSGxFMgD9 implements Runnable {
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ BbqUXujjobWQwx4SY ZfQNn8hdWlEQ5cR94249PDsLR;

    public /* synthetic */ BOLnrr2jCIFL4gTrjk5BSGxFMgD9(BbqUXujjobWQwx4SY bbqUXujjobWQwx4SY, int i) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = bbqUXujjobWQwx4SY;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                BbqUXujjobWQwx4SY bbqUXujjobWQwx4SY = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                if ((bbqUXujjobWQwx4SY.H2VFYNJEVGAX & 1) != 0) {
                    bbqUXujjobWQwx4SY.vBGA6pPLqSMuYGvprl270j7(0);
                }
                if ((bbqUXujjobWQwx4SY.H2VFYNJEVGAX & 4096) != 0) {
                    bbqUXujjobWQwx4SY.vBGA6pPLqSMuYGvprl270j7(108);
                }
                bbqUXujjobWQwx4SY.rERAmyEtGV6ANGszuKcQI = false;
                bbqUXujjobWQwx4SY.H2VFYNJEVGAX = 0;
                break;
            default:
                BbqUXujjobWQwx4SY bbqUXujjobWQwx4SY2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                bbqUXujjobWQwx4SY2.w0Wu95l8dVNw5rZMRu.showAtLocation(bbqUXujjobWQwx4SY2.q11o1hieEkZDhF1MGOZI26oZiDT, 55, 0, 0);
                d9uIUa0qhR0HmxFMet d9uiua0qhr0hmxfmet = bbqUXujjobWQwx4SY2.qNPQb1obP7;
                if (d9uiua0qhr0hmxfmet != null) {
                    d9uiua0qhr0hmxfmet.zzpBGItXfub0yWj();
                }
                if (bbqUXujjobWQwx4SY2.pzqP2AqKW6J5PO8zCKnW && (viewGroup = bbqUXujjobWQwx4SY2.aXO0LSrt8bKV) != null && viewGroup.isLaidOut()) {
                    bbqUXujjobWQwx4SY2.q11o1hieEkZDhF1MGOZI26oZiDT.setAlpha(0.0f);
                    d9uIUa0qhR0HmxFMet d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m(bbqUXujjobWQwx4SY2.q11o1hieEkZDhF1MGOZI26oZiDT);
                    d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m(1.0f);
                    bbqUXujjobWQwx4SY2.qNPQb1obP7 = d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m;
                    d9uiua0qhr0hmxfmetVxUQ9tBhpHJ2AAEDNW8sghc4m.ZfQNn8hdWlEQ5cR94249PDsLR(new JUf5e0Z4Cc(0, this));
                } else {
                    bbqUXujjobWQwx4SY2.q11o1hieEkZDhF1MGOZI26oZiDT.setAlpha(1.0f);
                    bbqUXujjobWQwx4SY2.q11o1hieEkZDhF1MGOZI26oZiDT.setVisibility(0);
                }
                break;
        }
    }
}
