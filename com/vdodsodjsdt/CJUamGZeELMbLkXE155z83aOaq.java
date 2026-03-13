package com.vdodsodjsdt;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class CJUamGZeELMbLkXE155z83aOaq implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ D2N8rZ8PRRcNQ9RwMeZkr V57tEvNfxZVVcOCAOih5PKr;
    public pmJH8rqWIwRth8COqq VxUQ9tBhpHJ2AAEDNW8sghc4m = null;
    public final /* synthetic */ View zzpBGItXfub0yWj;

    public CJUamGZeELMbLkXE155z83aOaq(View view, D2N8rZ8PRRcNQ9RwMeZkr d2N8rZ8PRRcNQ9RwMeZkr) {
        this.zzpBGItXfub0yWj = view;
        this.V57tEvNfxZVVcOCAOih5PKr = d2N8rZ8PRRcNQ9RwMeZkr;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ = pmJH8rqWIwRth8COqq.ZLZeBXTMq0zDztBxtRTuCHrapQ(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        D2N8rZ8PRRcNQ9RwMeZkr d2N8rZ8PRRcNQ9RwMeZkr = this.V57tEvNfxZVVcOCAOih5PKr;
        if (i < 30) {
            lJgFFp37ou.VxUQ9tBhpHJ2AAEDNW8sghc4m(windowInsets, this.zzpBGItXfub0yWj);
            if (pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ.equals(this.VxUQ9tBhpHJ2AAEDNW8sghc4m)) {
                return d2N8rZ8PRRcNQ9RwMeZkr.HzCpKshMOoaw76hFcbOVRYMeRd(view, pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ).zIvmSL0wzmmKGc3X39b2Gw2mUGE();
            }
        }
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ;
        pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqqHzCpKshMOoaw76hFcbOVRYMeRd = d2N8rZ8PRRcNQ9RwMeZkr.HzCpKshMOoaw76hFcbOVRYMeRd(view, pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ);
        if (i >= 30) {
            return pmjh8rqwiwrth8coqqHzCpKshMOoaw76hFcbOVRYMeRd.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        }
        WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        UFStPSj5DrcqcfR2RymfmG.V57tEvNfxZVVcOCAOih5PKr(view);
        return pmjh8rqwiwrth8coqqHzCpKshMOoaw76hFcbOVRYMeRd.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
    }
}
