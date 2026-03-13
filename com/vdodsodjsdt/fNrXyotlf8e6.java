package com.vdodsodjsdt;

import android.content.Context;
import android.net.ConnectivityManager;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class fNrXyotlf8e6 extends pfLEtIq3hsg {
    public final l6QZH9N2knc6fD ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final ConnectivityManager zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public fNrXyotlf8e6(Context context, nMRZPpfLCgJyuB nmrzppflcgjyub) {
        super(context, nmrzppflcgjyub);
        Object systemService = this.zzpBGItXfub0yWj.getSystemService("connectivity");
        ej6unYlOWMDF.Ca81ebIan1u(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = (ConnectivityManager) systemService;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = new l6QZH9N2knc6fD(this);
    }

    @Override // com.vdodsodjsdt.pfLEtIq3hsg
    public final void V57tEvNfxZVVcOCAOih5PKr() {
        try {
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(HEvwRDc2p73b2IOU2WQo18Rp.VxUQ9tBhpHJ2AAEDNW8sghc4m, "Registering network callback");
            ConnectivityManager connectivityManager = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            l6QZH9N2knc6fD l6qzh9n2knc6fd = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            ej6unYlOWMDF.pYmKDYlAmhudp(connectivityManager, "<this>");
            ej6unYlOWMDF.pYmKDYlAmhudp(l6qzh9n2knc6fd, "networkCallback");
            connectivityManager.registerDefaultNetworkCallback(l6qzh9n2knc6fd);
        } catch (IllegalArgumentException e) {
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().ZfQNn8hdWlEQ5cR94249PDsLR(HEvwRDc2p73b2IOU2WQo18Rp.VxUQ9tBhpHJ2AAEDNW8sghc4m, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().ZfQNn8hdWlEQ5cR94249PDsLR(HEvwRDc2p73b2IOU2WQo18Rp.VxUQ9tBhpHJ2AAEDNW8sghc4m, "Received exception while registering network callback", e2);
        }
    }

    @Override // com.vdodsodjsdt.pfLEtIq3hsg
    public final Object VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return HEvwRDc2p73b2IOU2WQo18Rp.VxUQ9tBhpHJ2AAEDNW8sghc4m(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
    }

    @Override // com.vdodsodjsdt.pfLEtIq3hsg
    public final void ZfQNn8hdWlEQ5cR94249PDsLR() {
        try {
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(HEvwRDc2p73b2IOU2WQo18Rp.VxUQ9tBhpHJ2AAEDNW8sghc4m, "Unregistering network callback");
            ConnectivityManager connectivityManager = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            l6QZH9N2knc6fD l6qzh9n2knc6fd = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            ej6unYlOWMDF.pYmKDYlAmhudp(connectivityManager, "<this>");
            ej6unYlOWMDF.pYmKDYlAmhudp(l6qzh9n2knc6fd, "networkCallback");
            connectivityManager.unregisterNetworkCallback(l6qzh9n2knc6fd);
        } catch (IllegalArgumentException e) {
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().ZfQNn8hdWlEQ5cR94249PDsLR(HEvwRDc2p73b2IOU2WQo18Rp.VxUQ9tBhpHJ2AAEDNW8sghc4m, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().ZfQNn8hdWlEQ5cR94249PDsLR(HEvwRDc2p73b2IOU2WQo18Rp.VxUQ9tBhpHJ2AAEDNW8sghc4m, "Received exception while unregistering network callback", e2);
        }
    }
}
