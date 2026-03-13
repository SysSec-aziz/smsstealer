package com.vdodsodjsdt;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ddmzHva1iv7LVcI8RRfsdy502 extends eAZzwKf05brkM {
    public final RLNy5s6htks8FE7 VxUQ9tBhpHJ2AAEDNW8sghc4m;

    public ddmzHva1iv7LVcI8RRfsdy502(RLNy5s6htks8FE7 rLNy5s6htks8FE7) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = rLNy5s6htks8FE7;
    }

    public abstract Object LaeGQIruHQu81hfJldjMOQSVblH3x(Object obj);

    @Override // com.vdodsodjsdt.eAZzwKf05brkM
    public final void V57tEvNfxZVVcOCAOih5PKr(tVkLQdIevlOoRF1qYmTyvenTzI tvklqdievloorf1qymtyventzi, Object obj) throws IOException {
        if (obj == null) {
            tvklqdievloorf1qymtyventzi.pzqP2AqKW6J5PO8zCKnW();
            return;
        }
        tvklqdievloorf1qymtyventzi.LaeGQIruHQu81hfJldjMOQSVblH3x();
        try {
            Iterator it = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.zzpBGItXfub0yWj.iterator();
            while (it.hasNext()) {
                ((tyZQa3HN4Bho91H) it.next()).VxUQ9tBhpHJ2AAEDNW8sghc4m(tvklqdievloorf1qymtyventzi, obj);
            }
            tvklqdievloorf1qymtyventzi.q11o1hieEkZDhF1MGOZI26oZiDT();
        } catch (IllegalAccessException e) {
            sGipz63rTUmSj3uFDvOtzihao sgipz63rtumsj3ufdvotzihao = vFOm9GRo9HOyt53449EwgsRLOaA1Y.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        }
    }

    public abstract Object ZfQNn8hdWlEQ5cR94249PDsLR();

    public abstract void zIvmSL0wzmmKGc3X39b2Gw2mUGE(Object obj, Gzdlhdn1ss gzdlhdn1ss, tyZQa3HN4Bho91H tyzqa3hn4bho91h);

    @Override // com.vdodsodjsdt.eAZzwKf05brkM
    public final Object zzpBGItXfub0yWj(Gzdlhdn1ss gzdlhdn1ss) throws IOException {
        if (gzdlhdn1ss.wRCD0SdqWCowdYU7bmzN() == 9) {
            gzdlhdn1ss.d9zDyyznnp3oaDT1Ug();
            return null;
        }
        Object objZfQNn8hdWlEQ5cR94249PDsLR = ZfQNn8hdWlEQ5cR94249PDsLR();
        Map map = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        try {
            gzdlhdn1ss.V57tEvNfxZVVcOCAOih5PKr();
            while (gzdlhdn1ss.pzqP2AqKW6J5PO8zCKnW()) {
                tyZQa3HN4Bho91H tyzqa3hn4bho91h = (tyZQa3HN4Bho91H) map.get(gzdlhdn1ss.iKANjmyTSxO6v6UuLPdu7DxOjlS());
                if (tyzqa3hn4bho91h == null) {
                    gzdlhdn1ss.hKs1wlZyvtUNaW1f5ABIGacfPcvX();
                } else {
                    zIvmSL0wzmmKGc3X39b2Gw2mUGE(objZfQNn8hdWlEQ5cR94249PDsLR, gzdlhdn1ss, tyzqa3hn4bho91h);
                }
            }
            gzdlhdn1ss.q11o1hieEkZDhF1MGOZI26oZiDT();
            return LaeGQIruHQu81hfJldjMOQSVblH3x(objZfQNn8hdWlEQ5cR94249PDsLR);
        } catch (IllegalAccessException e) {
            sGipz63rTUmSj3uFDvOtzihao sgipz63rtumsj3ufdvotzihao = vFOm9GRo9HOyt53449EwgsRLOaA1Y.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (IllegalStateException e2) {
            throw new RKQxRZwHjgpy5pOG0vmNeEAGIjPIP(e2);
        }
    }
}
