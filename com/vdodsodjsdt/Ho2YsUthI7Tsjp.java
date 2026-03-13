package com.vdodsodjsdt;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class Ho2YsUthI7Tsjp implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public boolean LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final long V57tEvNfxZVVcOCAOih5PKr = SystemClock.uptimeMillis() + ((long) 10000);
    public Runnable ZfQNn8hdWlEQ5cR94249PDsLR;
    public final /* synthetic */ zf8a67a5ZO524dLUgOFxsfO zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public Ho2YsUthI7Tsjp(zf8a67a5ZO524dLUgOFxsfO zf8a67a5zo524dlugofxsfo) {
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = zf8a67a5zo524dlugofxsfo;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ej6unYlOWMDF.pYmKDYlAmhudp(runnable, "runnable");
        this.ZfQNn8hdWlEQ5cR94249PDsLR = runnable;
        View decorView = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getWindow().getDecorView();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(decorView, "getDecorView(...)");
        if (!this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            decorView.postOnAnimation(new lUqBmUbL53IL3VMM8GT8(4, this));
        } else if (ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.V57tEvNfxZVVcOCAOih5PKr) {
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = false;
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.ZfQNn8hdWlEQ5cR94249PDsLR = null;
        YfKjQAEakPJuedd66wUsn yfKjQAEakPJuedd66wUsn = (YfKjQAEakPJuedd66wUsn) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.GI83zq0G8e7zkn.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        synchronized (yfKjQAEakPJuedd66wUsn.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            z = yfKjQAEakPJuedd66wUsn.zzpBGItXfub0yWj;
        }
        if (z) {
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = false;
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
