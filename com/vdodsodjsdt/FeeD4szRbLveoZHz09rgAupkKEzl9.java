package com.vdodsodjsdt;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class FeeD4szRbLveoZHz09rgAupkKEzl9 extends eAZzwKf05brkM {
    @Override // com.vdodsodjsdt.eAZzwKf05brkM
    public final void V57tEvNfxZVVcOCAOih5PKr(tVkLQdIevlOoRF1qYmTyvenTzI tvklqdievloorf1qymtyventzi, Object obj) throws IOException {
        if (((Number) obj) == null) {
            tvklqdievloorf1qymtyventzi.pzqP2AqKW6J5PO8zCKnW();
        } else {
            tvklqdievloorf1qymtyventzi.qygqjTppWwx992(r4.shortValue());
        }
    }

    @Override // com.vdodsodjsdt.eAZzwKf05brkM
    public final Object zzpBGItXfub0yWj(Gzdlhdn1ss gzdlhdn1ss) throws IOException {
        if (gzdlhdn1ss.wRCD0SdqWCowdYU7bmzN() == 9) {
            gzdlhdn1ss.d9zDyyznnp3oaDT1Ug();
            return null;
        }
        try {
            int iY1NaPKTl7R18DOr6e8i5 = gzdlhdn1ss.y1NaPKTl7R18DOr6e8i5();
            if (iY1NaPKTl7R18DOr6e8i5 <= 65535 && iY1NaPKTl7R18DOr6e8i5 >= -32768) {
                return Short.valueOf((short) iY1NaPKTl7R18DOr6e8i5);
            }
            throw new RKQxRZwHjgpy5pOG0vmNeEAGIjPIP("Lossy conversion from " + iY1NaPKTl7R18DOr6e8i5 + " to short; at path " + gzdlhdn1ss.SuB3hEmTmbbRGAhtvOOmfKEon(true));
        } catch (NumberFormatException e) {
            throw new RKQxRZwHjgpy5pOG0vmNeEAGIjPIP(e);
        }
    }
}
