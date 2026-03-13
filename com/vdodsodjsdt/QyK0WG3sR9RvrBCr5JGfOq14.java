package com.vdodsodjsdt;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class QyK0WG3sR9RvrBCr5JGfOq14 extends eAZzwKf05brkM {
    public static final uo1VguaVsUUJ5AoQooXnMNgd V57tEvNfxZVVcOCAOih5PKr = new uo1VguaVsUUJ5AoQooXnMNgd(0, new QyK0WG3sR9RvrBCr5JGfOq14(2, IDoeXZSl9E3.ZfQNn8hdWlEQ5cR94249PDsLR));
    public final /* synthetic */ int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final Object zzpBGItXfub0yWj;

    public /* synthetic */ QyK0WG3sR9RvrBCr5JGfOq14(int i, Object obj) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        this.zzpBGItXfub0yWj = obj;
    }

    @Override // com.vdodsodjsdt.eAZzwKf05brkM
    public final void V57tEvNfxZVVcOCAOih5PKr(tVkLQdIevlOoRF1qYmTyvenTzI tvklqdievloorf1qymtyventzi, Object obj) throws IOException {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                ((eAZzwKf05brkM) this.zzpBGItXfub0yWj).V57tEvNfxZVVcOCAOih5PKr(tvklqdievloorf1qymtyventzi, Long.valueOf(((AtomicLong) obj).get()));
                break;
            case 1:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                tvklqdievloorf1qymtyventzi.V57tEvNfxZVVcOCAOih5PKr();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    ((eAZzwKf05brkM) this.zzpBGItXfub0yWj).V57tEvNfxZVVcOCAOih5PKr(tvklqdievloorf1qymtyventzi, Long.valueOf(atomicLongArray.get(i)));
                }
                tvklqdievloorf1qymtyventzi.KUYypEB4eNWOZWVDpH();
                break;
            default:
                tvklqdievloorf1qymtyventzi.iKANjmyTSxO6v6UuLPdu7DxOjlS((Number) obj);
                break;
        }
    }

    @Override // com.vdodsodjsdt.eAZzwKf05brkM
    public final Object zzpBGItXfub0yWj(Gzdlhdn1ss gzdlhdn1ss) throws IOException {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                return new AtomicLong(((Number) ((eAZzwKf05brkM) this.zzpBGItXfub0yWj).zzpBGItXfub0yWj(gzdlhdn1ss)).longValue());
            case 1:
                ArrayList arrayList = new ArrayList();
                gzdlhdn1ss.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                while (gzdlhdn1ss.pzqP2AqKW6J5PO8zCKnW()) {
                    arrayList.add(Long.valueOf(((Number) ((eAZzwKf05brkM) this.zzpBGItXfub0yWj).zzpBGItXfub0yWj(gzdlhdn1ss)).longValue()));
                }
                gzdlhdn1ss.KUYypEB4eNWOZWVDpH();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
                }
                return atomicLongArray;
            default:
                int iWRCD0SdqWCowdYU7bmzN = gzdlhdn1ss.wRCD0SdqWCowdYU7bmzN();
                int iH3jnZRsdwYJfY9UhQCkbvWciwvFHv = u9SlVAuoWhQUfJ.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(iWRCD0SdqWCowdYU7bmzN);
                if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv == 5 || iH3jnZRsdwYJfY9UhQCkbvWciwvFHv == 6) {
                    return ((IDoeXZSl9E3) this.zzpBGItXfub0yWj).VxUQ9tBhpHJ2AAEDNW8sghc4m(gzdlhdn1ss);
                }
                if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv == 8) {
                    gzdlhdn1ss.d9zDyyznnp3oaDT1Ug();
                    return null;
                }
                throw new RKQxRZwHjgpy5pOG0vmNeEAGIjPIP("Expecting number, got: " + u9SlVAuoWhQUfJ.pYmKDYlAmhudp(iWRCD0SdqWCowdYU7bmzN) + "; at path " + gzdlhdn1ss.SuB3hEmTmbbRGAhtvOOmfKEon(false));
        }
    }
}
