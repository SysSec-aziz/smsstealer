package com.vdodsodjsdt;

import java.io.IOException;
import java.util.Currency;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class rbhV2vnly36uMo7Ap extends eAZzwKf05brkM {
    @Override // com.vdodsodjsdt.eAZzwKf05brkM
    public final void V57tEvNfxZVVcOCAOih5PKr(tVkLQdIevlOoRF1qYmTyvenTzI tvklqdievloorf1qymtyventzi, Object obj) throws IOException {
        tvklqdievloorf1qymtyventzi.TqcnImqkSWIKht(((Currency) obj).getCurrencyCode());
    }

    @Override // com.vdodsodjsdt.eAZzwKf05brkM
    public final Object zzpBGItXfub0yWj(Gzdlhdn1ss gzdlhdn1ss) throws IOException {
        String strYmT6yQrus3w = gzdlhdn1ss.ymT6yQrus3w();
        try {
            return Currency.getInstance(strYmT6yQrus3w);
        } catch (IllegalArgumentException e) {
            StringBuilder sbKUYypEB4eNWOZWVDpH = u9SlVAuoWhQUfJ.KUYypEB4eNWOZWVDpH("Failed parsing '", strYmT6yQrus3w, "' as Currency; at path ");
            sbKUYypEB4eNWOZWVDpH.append(gzdlhdn1ss.SuB3hEmTmbbRGAhtvOOmfKEon(true));
            throw new RKQxRZwHjgpy5pOG0vmNeEAGIjPIP(sbKUYypEB4eNWOZWVDpH.toString(), e);
        }
    }
}
