package com.vdodsodjsdt;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8sxRF9sBeXRCgiSQKaVf4Tx2crU extends ConnectivityManager.NetworkCallback {
    public static boolean LaeGQIruHQu81hfJldjMOQSVblH3x;
    public static NetworkCapabilities ZfQNn8hdWlEQ5cR94249PDsLR;
    public static final C8sxRF9sBeXRCgiSQKaVf4Tx2crU VxUQ9tBhpHJ2AAEDNW8sghc4m = new C8sxRF9sBeXRCgiSQKaVf4Tx2crU();
    public static final Object zzpBGItXfub0yWj = new Object();
    public static final LinkedHashMap V57tEvNfxZVVcOCAOih5PKr = new LinkedHashMap();

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        ej6unYlOWMDF.pYmKDYlAmhudp(network, "network");
        ej6unYlOWMDF.pYmKDYlAmhudp(networkCapabilities, "networkCapabilities");
        psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(muOaMHIFqe96qo7.VxUQ9tBhpHJ2AAEDNW8sghc4m, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (zzpBGItXfub0yWj) {
            try {
                ZfQNn8hdWlEQ5cR94249PDsLR = networkCapabilities;
                for (Map.Entry entry : V57tEvNfxZVVcOCAOih5PKr.entrySet()) {
                    ((vP57smEEh3YGCxzJ) entry.getKey()).GI83zq0G8e7zkn(((NetworkRequest) entry.getValue()).canBeSatisfiedBy(networkCapabilities) ? g6BKYStEEgT29c8vsK.VxUQ9tBhpHJ2AAEDNW8sghc4m : new hfmuRhTy7aVTHJ4xausxesbcd5d(7));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        ej6unYlOWMDF.pYmKDYlAmhudp(network, "network");
        psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(muOaMHIFqe96qo7.VxUQ9tBhpHJ2AAEDNW8sghc4m, "NetworkRequestConstraintController onLost callback");
        synchronized (zzpBGItXfub0yWj) {
            ZfQNn8hdWlEQ5cR94249PDsLR = null;
            Iterator it = V57tEvNfxZVVcOCAOih5PKr.keySet().iterator();
            while (it.hasNext()) {
                ((vP57smEEh3YGCxzJ) it.next()).GI83zq0G8e7zkn(new hfmuRhTy7aVTHJ4xausxesbcd5d(7));
            }
        }
    }
}
