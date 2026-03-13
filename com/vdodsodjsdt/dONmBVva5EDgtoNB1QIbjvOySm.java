package com.vdodsodjsdt;

import android.net.ConnectivityManager;
import java.io.Serializable;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class dONmBVva5EDgtoNB1QIbjvOySm extends iR5xCBIVvX5dAZmnw05F0Cv implements EfIvTei3Q8wBNpyLTZJevpFxej {
    public final /* synthetic */ ConnectivityManager LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ ConnectivityManager.NetworkCallback ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final /* synthetic */ int ZfQNn8hdWlEQ5cR94249PDsLR;
    public final /* synthetic */ Serializable zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dONmBVva5EDgtoNB1QIbjvOySm(Serializable serializable, ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback, int i) {
        super(0);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = serializable;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = connectivityManager;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = networkCallback;
    }

    @Override // com.vdodsodjsdt.EfIvTei3Q8wBNpyLTZJevpFxej
    public final Object VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        switch (this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            case 0:
                if (((SCROT5ML4rhhav7V3rKX2XTcsoky) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE).V57tEvNfxZVVcOCAOih5PKr) {
                    psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(muOaMHIFqe96qo7.VxUQ9tBhpHJ2AAEDNW8sghc4m, "NetworkRequestConstraintController unregister callback");
                    this.LaeGQIruHQu81hfJldjMOQSVblH3x.unregisterNetworkCallback((l6QZH9N2knc6fD) this.ZLZeBXTMq0zDztBxtRTuCHrapQ);
                }
                return hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            default:
                Object obj = C8sxRF9sBeXRCgiSQKaVf4Tx2crU.zzpBGItXfub0yWj;
                kBXIB8LLE5cCVkJ kbxib8lle5ccvkj = (kBXIB8LLE5cCVkJ) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                ConnectivityManager connectivityManager = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                C8sxRF9sBeXRCgiSQKaVf4Tx2crU c8sxRF9sBeXRCgiSQKaVf4Tx2crU = (C8sxRF9sBeXRCgiSQKaVf4Tx2crU) this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                synchronized (obj) {
                    LinkedHashMap linkedHashMap = C8sxRF9sBeXRCgiSQKaVf4Tx2crU.V57tEvNfxZVVcOCAOih5PKr;
                    linkedHashMap.remove(kbxib8lle5ccvkj);
                    if (linkedHashMap.isEmpty()) {
                        psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(muOaMHIFqe96qo7.VxUQ9tBhpHJ2AAEDNW8sghc4m, "NetworkRequestConstraintController unregister shared callback");
                        connectivityManager.unregisterNetworkCallback(c8sxRF9sBeXRCgiSQKaVf4Tx2crU);
                        C8sxRF9sBeXRCgiSQKaVf4Tx2crU.VxUQ9tBhpHJ2AAEDNW8sghc4m.getClass();
                        C8sxRF9sBeXRCgiSQKaVf4Tx2crU.ZfQNn8hdWlEQ5cR94249PDsLR = null;
                        C8sxRF9sBeXRCgiSQKaVf4Tx2crU.LaeGQIruHQu81hfJldjMOQSVblH3x = false;
                    }
                    break;
                }
                return hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        }
    }
}
