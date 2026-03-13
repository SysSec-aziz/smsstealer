package com.vdodsodjsdt;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class dcAI4zKX9NS5PBMe implements Runnable {
    public final /* synthetic */ iFKXVhXhX8FyZGUEP1rAer7 LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ RD86Fssz0iKbf0t61L ZfQNn8hdWlEQ5cR94249PDsLR;

    public /* synthetic */ dcAI4zKX9NS5PBMe(iFKXVhXhX8FyZGUEP1rAer7 ifkxvhxhx8fyzguep1raer7, RD86Fssz0iKbf0t61L rD86Fssz0iKbf0t61L, int i) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = ifkxvhxhx8fyzguep1raer7;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = rD86Fssz0iKbf0t61L;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                ArrayList arrayList = this.LaeGQIruHQu81hfJldjMOQSVblH3x.zzpBGItXfub0yWj;
                RD86Fssz0iKbf0t61L rD86Fssz0iKbf0t61L = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                if (arrayList.contains(rD86Fssz0iKbf0t61L)) {
                    u9SlVAuoWhQUfJ.VxUQ9tBhpHJ2AAEDNW8sghc4m(rD86Fssz0iKbf0t61L.V57tEvNfxZVVcOCAOih5PKr.HVEwbdULInpTNa0IG, rD86Fssz0iKbf0t61L.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                }
                break;
            default:
                iFKXVhXhX8FyZGUEP1rAer7 ifkxvhxhx8fyzguep1raer7 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                ArrayList arrayList2 = ifkxvhxhx8fyzguep1raer7.zzpBGItXfub0yWj;
                RD86Fssz0iKbf0t61L rD86Fssz0iKbf0t61L2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                arrayList2.remove(rD86Fssz0iKbf0t61L2);
                ifkxvhxhx8fyzguep1raer7.V57tEvNfxZVVcOCAOih5PKr.remove(rD86Fssz0iKbf0t61L2);
                break;
        }
    }
}
