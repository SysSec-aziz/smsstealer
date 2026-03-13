package com.vdodsodjsdt;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class l6QZH9N2knc6fD extends ConnectivityManager.NetworkCallback {
    public static final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr = 0;
    public final /* synthetic */ int VxUQ9tBhpHJ2AAEDNW8sghc4m = 1;
    public final Object zzpBGItXfub0yWj;

    public l6QZH9N2knc6fD(fNrXyotlf8e6 fnrxyotlf8e6) {
        this.zzpBGItXfub0yWj = fnrxyotlf8e6;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                ej6unYlOWMDF.pYmKDYlAmhudp(network, "network");
                ej6unYlOWMDF.pYmKDYlAmhudp(networkCapabilities, "networkCapabilities");
                psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(muOaMHIFqe96qo7.VxUQ9tBhpHJ2AAEDNW8sghc4m, "NetworkRequestConstraintController onCapabilitiesChanged callback");
                ((kBXIB8LLE5cCVkJ) this.zzpBGItXfub0yWj).GI83zq0G8e7zkn(g6BKYStEEgT29c8vsK.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                break;
            default:
                ej6unYlOWMDF.pYmKDYlAmhudp(network, "network");
                ej6unYlOWMDF.pYmKDYlAmhudp(networkCapabilities, "capabilities");
                psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(HEvwRDc2p73b2IOU2WQo18Rp.VxUQ9tBhpHJ2AAEDNW8sghc4m, "Network capabilities changed: " + networkCapabilities);
                fNrXyotlf8e6 fnrxyotlf8e6 = (fNrXyotlf8e6) this.zzpBGItXfub0yWj;
                fnrxyotlf8e6.zzpBGItXfub0yWj(Build.VERSION.SDK_INT >= 28 ? new WdQbr7hqaGci2Lq(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11), networkCapabilities.hasCapability(18)) : HEvwRDc2p73b2IOU2WQo18Rp.VxUQ9tBhpHJ2AAEDNW8sghc4m(fnrxyotlf8e6.zIvmSL0wzmmKGc3X39b2Gw2mUGE));
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                ej6unYlOWMDF.pYmKDYlAmhudp(network, "network");
                psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(muOaMHIFqe96qo7.VxUQ9tBhpHJ2AAEDNW8sghc4m, "NetworkRequestConstraintController onLost callback");
                ((kBXIB8LLE5cCVkJ) this.zzpBGItXfub0yWj).GI83zq0G8e7zkn(new hfmuRhTy7aVTHJ4xausxesbcd5d(7));
                break;
            default:
                ej6unYlOWMDF.pYmKDYlAmhudp(network, "network");
                psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(HEvwRDc2p73b2IOU2WQo18Rp.VxUQ9tBhpHJ2AAEDNW8sghc4m, "Network connection lost");
                fNrXyotlf8e6 fnrxyotlf8e6 = (fNrXyotlf8e6) this.zzpBGItXfub0yWj;
                fnrxyotlf8e6.zzpBGItXfub0yWj(HEvwRDc2p73b2IOU2WQo18Rp.VxUQ9tBhpHJ2AAEDNW8sghc4m(fnrxyotlf8e6.zIvmSL0wzmmKGc3X39b2Gw2mUGE));
                break;
        }
    }

    public l6QZH9N2knc6fD(kBXIB8LLE5cCVkJ kbxib8lle5ccvkj) {
        this.zzpBGItXfub0yWj = kbxib8lle5ccvkj;
    }
}
