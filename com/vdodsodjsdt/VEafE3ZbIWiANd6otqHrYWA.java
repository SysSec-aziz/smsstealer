package com.vdodsodjsdt;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class VEafE3ZbIWiANd6otqHrYWA extends KfeOQNOupsCg6878zi4e {
    @Override // com.vdodsodjsdt.KfeOQNOupsCg6878zi4e
    public void JUdwvN8LfOMa(JtQzUw7TKDRZv8Cwx jtQzUw7TKDRZv8Cwx, JtQzUw7TKDRZv8Cwx jtQzUw7TKDRZv8Cwx2, Window window, View view, boolean z, boolean z2) {
        ej6unYlOWMDF.pYmKDYlAmhudp(jtQzUw7TKDRZv8Cwx, "statusBarStyle");
        ej6unYlOWMDF.pYmKDYlAmhudp(jtQzUw7TKDRZv8Cwx2, "navigationBarStyle");
        ej6unYlOWMDF.pYmKDYlAmhudp(window, "window");
        ej6unYlOWMDF.pYmKDYlAmhudp(view, "view");
        ej6unYlOWMDF.GE1sqSYiEYQO2ew7WEZwTtUeS5(window, false);
        window.setStatusBarColor(z ? jtQzUw7TKDRZv8Cwx.zzpBGItXfub0yWj : jtQzUw7TKDRZv8Cwx.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        window.setNavigationBarColor(z2 ? jtQzUw7TKDRZv8Cwx2.zzpBGItXfub0yWj : jtQzUw7TKDRZv8Cwx2.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        VSncX8ksA0tswc2TMhzhOMdd vSncX8ksA0tswc2TMhzhOMdd = new VSncX8ksA0tswc2TMhzhOMdd(view, 3);
        int i = Build.VERSION.SDK_INT;
        F44whnLsbQ nWuTAjXTaNfEJ2DQqx = i >= 35 ? new NWuTAjXTaNfEJ2DQqx(window, vSncX8ksA0tswc2TMhzhOMdd) : i >= 30 ? new TuhwuczhmmFP(window, vSncX8ksA0tswc2TMhzhOMdd) : i >= 26 ? new GsBQSl18H6pNk(window, vSncX8ksA0tswc2TMhzhOMdd) : new bgaCCJBki10uB8(window, vSncX8ksA0tswc2TMhzhOMdd);
        nWuTAjXTaNfEJ2DQqx.rERAmyEtGV6ANGszuKcQI(!z);
        nWuTAjXTaNfEJ2DQqx.GE1sqSYiEYQO2ew7WEZwTtUeS5(!z2);
    }
}
