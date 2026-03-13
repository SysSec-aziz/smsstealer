package com.vdodsodjsdt;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class M9AfnW77U9oYxs extends eAZzwKf05brkM {
    @Override // com.vdodsodjsdt.eAZzwKf05brkM
    public final void V57tEvNfxZVVcOCAOih5PKr(tVkLQdIevlOoRF1qYmTyvenTzI tvklqdievloorf1qymtyventzi, Object obj) throws IOException {
        Character ch = (Character) obj;
        tvklqdievloorf1qymtyventzi.TqcnImqkSWIKht(ch == null ? null : String.valueOf(ch));
    }

    @Override // com.vdodsodjsdt.eAZzwKf05brkM
    public final Object zzpBGItXfub0yWj(Gzdlhdn1ss gzdlhdn1ss) throws IOException {
        if (gzdlhdn1ss.wRCD0SdqWCowdYU7bmzN() == 9) {
            gzdlhdn1ss.d9zDyyznnp3oaDT1Ug();
            return null;
        }
        String strYmT6yQrus3w = gzdlhdn1ss.ymT6yQrus3w();
        if (strYmT6yQrus3w.length() == 1) {
            return Character.valueOf(strYmT6yQrus3w.charAt(0));
        }
        StringBuilder sbKUYypEB4eNWOZWVDpH = u9SlVAuoWhQUfJ.KUYypEB4eNWOZWVDpH("Expecting character, got: ", strYmT6yQrus3w, "; at ");
        sbKUYypEB4eNWOZWVDpH.append(gzdlhdn1ss.SuB3hEmTmbbRGAhtvOOmfKEon(true));
        throw new RKQxRZwHjgpy5pOG0vmNeEAGIjPIP(sbKUYypEB4eNWOZWVDpH.toString());
    }
}
