package com.vdodsodjsdt;

import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class bgaCCJBki10uB8 extends F44whnLsbQ {
    public final Window HzCpKshMOoaw76hFcbOVRYMeRd;

    public bgaCCJBki10uB8(Window window, VSncX8ksA0tswc2TMhzhOMdd vSncX8ksA0tswc2TMhzhOMdd) {
        this.HzCpKshMOoaw76hFcbOVRYMeRd = window;
    }

    @Override // com.vdodsodjsdt.F44whnLsbQ
    public final void rERAmyEtGV6ANGszuKcQI(boolean z) {
        if (!z) {
            wR7sbzHKf9hYV1lxoS6nqyszepWvN(8192);
            return;
        }
        Window window = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
    }

    public final void wR7sbzHKf9hYV1lxoS6nqyszepWvN(int i) {
        View decorView = this.HzCpKshMOoaw76hFcbOVRYMeRd.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
