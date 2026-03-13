package com.vdodsodjsdt;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class afI5VlNN6JmVP6m implements Choreographer.FrameCallback {
    public final /* synthetic */ int VxUQ9tBhpHJ2AAEDNW8sghc4m = 1;
    public final /* synthetic */ Object zzpBGItXfub0yWj;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                ((Runnable) this.zzpBGItXfub0yWj).run();
                break;
            default:
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new d4eB8hsUAVoNY4((Context) this.zzpBGItXfub0yWj, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
        }
    }

    public /* synthetic */ afI5VlNN6JmVP6m(Runnable runnable) {
        this.zzpBGItXfub0yWj = runnable;
    }
}
