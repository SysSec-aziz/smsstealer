package com.vdodsodjsdt;

import java.io.IOException;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class aHgLFynKDPhXyODSTposJxI1B extends eAZzwKf05brkM {
    @Override // com.vdodsodjsdt.eAZzwKf05brkM
    public final void V57tEvNfxZVVcOCAOih5PKr(tVkLQdIevlOoRF1qYmTyvenTzI tvklqdievloorf1qymtyventzi, Object obj) throws IOException {
        UUID uuid = (UUID) obj;
        tvklqdievloorf1qymtyventzi.TqcnImqkSWIKht(uuid == null ? null : uuid.toString());
    }

    @Override // com.vdodsodjsdt.eAZzwKf05brkM
    public final Object zzpBGItXfub0yWj(Gzdlhdn1ss gzdlhdn1ss) throws IOException {
        if (gzdlhdn1ss.wRCD0SdqWCowdYU7bmzN() == 9) {
            gzdlhdn1ss.d9zDyyznnp3oaDT1Ug();
            return null;
        }
        String strYmT6yQrus3w = gzdlhdn1ss.ymT6yQrus3w();
        try {
            return UUID.fromString(strYmT6yQrus3w);
        } catch (IllegalArgumentException e) {
            StringBuilder sbKUYypEB4eNWOZWVDpH = u9SlVAuoWhQUfJ.KUYypEB4eNWOZWVDpH("Failed parsing '", strYmT6yQrus3w, "' as UUID; at path ");
            sbKUYypEB4eNWOZWVDpH.append(gzdlhdn1ss.SuB3hEmTmbbRGAhtvOOmfKEon(true));
            throw new RKQxRZwHjgpy5pOG0vmNeEAGIjPIP(sbKUYypEB4eNWOZWVDpH.toString(), e);
        }
    }
}
