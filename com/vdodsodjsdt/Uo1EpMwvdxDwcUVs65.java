package com.vdodsodjsdt;

import java.io.IOException;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class Uo1EpMwvdxDwcUVs65 extends eAZzwKf05brkM {
    @Override // com.vdodsodjsdt.eAZzwKf05brkM
    public final void V57tEvNfxZVVcOCAOih5PKr(tVkLQdIevlOoRF1qYmTyvenTzI tvklqdievloorf1qymtyventzi, Object obj) throws IOException {
        BitSet bitSet = (BitSet) obj;
        tvklqdievloorf1qymtyventzi.V57tEvNfxZVVcOCAOih5PKr();
        int length = bitSet.length();
        for (int i = 0; i < length; i++) {
            tvklqdievloorf1qymtyventzi.qygqjTppWwx992(bitSet.get(i) ? 1L : 0L);
        }
        tvklqdievloorf1qymtyventzi.KUYypEB4eNWOZWVDpH();
    }

    @Override // com.vdodsodjsdt.eAZzwKf05brkM
    public final Object zzpBGItXfub0yWj(Gzdlhdn1ss gzdlhdn1ss) throws IOException {
        boolean zO1xDAlBZZlZdoEf747lCFHld;
        BitSet bitSet = new BitSet();
        gzdlhdn1ss.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        int iWRCD0SdqWCowdYU7bmzN = gzdlhdn1ss.wRCD0SdqWCowdYU7bmzN();
        int i = 0;
        while (iWRCD0SdqWCowdYU7bmzN != 2) {
            int iH3jnZRsdwYJfY9UhQCkbvWciwvFHv = u9SlVAuoWhQUfJ.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(iWRCD0SdqWCowdYU7bmzN);
            if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv == 5 || iH3jnZRsdwYJfY9UhQCkbvWciwvFHv == 6) {
                int iY1NaPKTl7R18DOr6e8i5 = gzdlhdn1ss.y1NaPKTl7R18DOr6e8i5();
                if (iY1NaPKTl7R18DOr6e8i5 == 0) {
                    zO1xDAlBZZlZdoEf747lCFHld = false;
                } else {
                    if (iY1NaPKTl7R18DOr6e8i5 != 1) {
                        throw new RKQxRZwHjgpy5pOG0vmNeEAGIjPIP("Invalid bitset value " + iY1NaPKTl7R18DOr6e8i5 + ", expected 0 or 1; at path " + gzdlhdn1ss.SuB3hEmTmbbRGAhtvOOmfKEon(true));
                    }
                    zO1xDAlBZZlZdoEf747lCFHld = true;
                }
            } else {
                if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv != 7) {
                    throw new RKQxRZwHjgpy5pOG0vmNeEAGIjPIP("Invalid bitset value type: " + u9SlVAuoWhQUfJ.pYmKDYlAmhudp(iWRCD0SdqWCowdYU7bmzN) + "; at path " + gzdlhdn1ss.SuB3hEmTmbbRGAhtvOOmfKEon(false));
                }
                zO1xDAlBZZlZdoEf747lCFHld = gzdlhdn1ss.O1xDAlBZZlZdoEf747lCFHld();
            }
            if (zO1xDAlBZZlZdoEf747lCFHld) {
                bitSet.set(i);
            }
            i++;
            iWRCD0SdqWCowdYU7bmzN = gzdlhdn1ss.wRCD0SdqWCowdYU7bmzN();
        }
        gzdlhdn1ss.KUYypEB4eNWOZWVDpH();
        return bitSet;
    }
}
