package com.vdodsodjsdt;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class TuhwuczhmmFP extends F44whnLsbQ {
    public final WindowInsetsController HzCpKshMOoaw76hFcbOVRYMeRd;
    public final Window KUYypEB4eNWOZWVDpH;

    public TuhwuczhmmFP(Window window, VSncX8ksA0tswc2TMhzhOMdd vSncX8ksA0tswc2TMhzhOMdd) {
        this.HzCpKshMOoaw76hFcbOVRYMeRd = window.getInsetsController();
        this.KUYypEB4eNWOZWVDpH = window;
    }

    @Override // com.vdodsodjsdt.F44whnLsbQ
    public final void GE1sqSYiEYQO2ew7WEZwTtUeS5(boolean z) {
        Window window = this.KUYypEB4eNWOZWVDpH;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.HzCpKshMOoaw76hFcbOVRYMeRd.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.HzCpKshMOoaw76hFcbOVRYMeRd.setSystemBarsAppearance(0, 16);
    }

    @Override // com.vdodsodjsdt.F44whnLsbQ
    public final void rERAmyEtGV6ANGszuKcQI(boolean z) {
        Window window = this.KUYypEB4eNWOZWVDpH;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.HzCpKshMOoaw76hFcbOVRYMeRd.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.HzCpKshMOoaw76hFcbOVRYMeRd.setSystemBarsAppearance(0, 8);
    }
}
