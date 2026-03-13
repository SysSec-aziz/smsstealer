package com.vdodsodjsdt;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class aPogYroGu1k9XrZUXSp extends eAZzwKf05brkM {
    @Override // com.vdodsodjsdt.eAZzwKf05brkM
    public final void V57tEvNfxZVVcOCAOih5PKr(tVkLQdIevlOoRF1qYmTyvenTzI tvklqdievloorf1qymtyventzi, Object obj) throws IOException {
        URI uri = (URI) obj;
        tvklqdievloorf1qymtyventzi.TqcnImqkSWIKht(uri == null ? null : uri.toASCIIString());
    }

    @Override // com.vdodsodjsdt.eAZzwKf05brkM
    public final Object zzpBGItXfub0yWj(Gzdlhdn1ss gzdlhdn1ss) throws IOException {
        if (gzdlhdn1ss.wRCD0SdqWCowdYU7bmzN() == 9) {
            gzdlhdn1ss.d9zDyyznnp3oaDT1Ug();
            return null;
        }
        try {
            String strYmT6yQrus3w = gzdlhdn1ss.ymT6yQrus3w();
            if (strYmT6yQrus3w.equals("null")) {
                return null;
            }
            return new URI(strYmT6yQrus3w);
        } catch (URISyntaxException e) {
            throw new RKQxRZwHjgpy5pOG0vmNeEAGIjPIP(e);
        }
    }
}
