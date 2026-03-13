package com.vdodsodjsdt;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class HEvwRDc2p73b2IOU2WQo18Rp {
    public static final String VxUQ9tBhpHJ2AAEDNW8sghc4m;

    static {
        String strZLZeBXTMq0zDztBxtRTuCHrapQ = psATg3LCCdmDIiRgW.ZLZeBXTMq0zDztBxtRTuCHrapQ("NetworkStateTracker");
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strZLZeBXTMq0zDztBxtRTuCHrapQ, "tagWithPrefix(\"NetworkStateTracker\")");
        VxUQ9tBhpHJ2AAEDNW8sghc4m = strZLZeBXTMq0zDztBxtRTuCHrapQ;
    }

    public static final WdQbr7hqaGci2Lq VxUQ9tBhpHJ2AAEDNW8sghc4m(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities;
        ej6unYlOWMDF.pYmKDYlAmhudp(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        } catch (SecurityException e) {
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().ZfQNn8hdWlEQ5cR94249PDsLR(VxUQ9tBhpHJ2AAEDNW8sghc4m, "Unable to validate active network", e);
        }
        boolean zHasCapability = networkCapabilities != null ? networkCapabilities.hasCapability(16) : false;
        return new WdQbr7hqaGci2Lq(z, zHasCapability, connectivityManager.isActiveNetworkMetered(), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }
}
