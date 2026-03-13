package com.vdodsodjsdt;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class JBVNBY1qVYqvFW4L5ffi extends eAZzwKf05brkM {
    public final Object V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ int VxUQ9tBhpHJ2AAEDNW8sghc4m = 0;
    public final Object zzpBGItXfub0yWj;

    public JBVNBY1qVYqvFW4L5ffi(MoUwZm6CDldGf35 moUwZm6CDldGf35, HOYh3odfAhsInxjoW2Lj8Uep hOYh3odfAhsInxjoW2Lj8Uep) {
        this.zzpBGItXfub0yWj = moUwZm6CDldGf35;
        this.V57tEvNfxZVVcOCAOih5PKr = hOYh3odfAhsInxjoW2Lj8Uep;
    }

    @Override // com.vdodsodjsdt.eAZzwKf05brkM
    public final void V57tEvNfxZVVcOCAOih5PKr(tVkLQdIevlOoRF1qYmTyvenTzI tvklqdievloorf1qymtyventzi, Object obj) throws IOException {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                Collection collection = (Collection) obj;
                if (collection != null) {
                    tvklqdievloorf1qymtyventzi.V57tEvNfxZVVcOCAOih5PKr();
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        ((MoUwZm6CDldGf35) this.zzpBGItXfub0yWj).V57tEvNfxZVVcOCAOih5PKr(tvklqdievloorf1qymtyventzi, it.next());
                    }
                    tvklqdievloorf1qymtyventzi.KUYypEB4eNWOZWVDpH();
                } else {
                    tvklqdievloorf1qymtyventzi.pzqP2AqKW6J5PO8zCKnW();
                }
                break;
            default:
                ((pprWOkBDEQ5eVufdLCrXUe1) this.V57tEvNfxZVVcOCAOih5PKr).LaeGQIruHQu81hfJldjMOQSVblH3x.V57tEvNfxZVVcOCAOih5PKr(tvklqdievloorf1qymtyventzi, obj);
                break;
        }
    }

    @Override // com.vdodsodjsdt.eAZzwKf05brkM
    public final Object zzpBGItXfub0yWj(Gzdlhdn1ss gzdlhdn1ss) throws IOException {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                if (gzdlhdn1ss.wRCD0SdqWCowdYU7bmzN() == 9) {
                    gzdlhdn1ss.d9zDyyznnp3oaDT1Ug();
                    return null;
                }
                Collection collection = (Collection) ((HOYh3odfAhsInxjoW2Lj8Uep) this.V57tEvNfxZVVcOCAOih5PKr).V57tEvNfxZVVcOCAOih5PKr();
                gzdlhdn1ss.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                while (gzdlhdn1ss.pzqP2AqKW6J5PO8zCKnW()) {
                    collection.add(((MoUwZm6CDldGf35) this.zzpBGItXfub0yWj).V57tEvNfxZVVcOCAOih5PKr.zzpBGItXfub0yWj(gzdlhdn1ss));
                }
                gzdlhdn1ss.KUYypEB4eNWOZWVDpH();
                return collection;
            default:
                Class cls = (Class) this.zzpBGItXfub0yWj;
                Object objZzpBGItXfub0yWj = ((pprWOkBDEQ5eVufdLCrXUe1) this.V57tEvNfxZVVcOCAOih5PKr).LaeGQIruHQu81hfJldjMOQSVblH3x.zzpBGItXfub0yWj(gzdlhdn1ss);
                if (objZzpBGItXfub0yWj == null || cls.isInstance(objZzpBGItXfub0yWj)) {
                    return objZzpBGItXfub0yWj;
                }
                throw new RKQxRZwHjgpy5pOG0vmNeEAGIjPIP("Expected a " + cls.getName() + " but was " + objZzpBGItXfub0yWj.getClass().getName() + "; at path " + gzdlhdn1ss.SuB3hEmTmbbRGAhtvOOmfKEon(true));
        }
    }

    public JBVNBY1qVYqvFW4L5ffi(pprWOkBDEQ5eVufdLCrXUe1 pprwokbdeq5evufdlcrxue1, Class cls) {
        this.V57tEvNfxZVVcOCAOih5PKr = pprwokbdeq5evufdlcrxue1;
        this.zzpBGItXfub0yWj = cls;
    }
}
