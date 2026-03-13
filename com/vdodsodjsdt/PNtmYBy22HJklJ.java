package com.vdodsodjsdt;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class PNtmYBy22HJklJ implements OnBackAnimationCallback {
    public final /* synthetic */ zCTjlTvX7kUnDg4oo78 V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ TYHMBipJh2 VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final /* synthetic */ zCTjlTvX7kUnDg4oo78 ZfQNn8hdWlEQ5cR94249PDsLR;
    public final /* synthetic */ TYHMBipJh2 zzpBGItXfub0yWj;

    public PNtmYBy22HJklJ(TYHMBipJh2 tYHMBipJh2, TYHMBipJh2 tYHMBipJh22, zCTjlTvX7kUnDg4oo78 zctjltvx7kundg4oo78, zCTjlTvX7kUnDg4oo78 zctjltvx7kundg4oo782) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = tYHMBipJh2;
        this.zzpBGItXfub0yWj = tYHMBipJh22;
        this.V57tEvNfxZVVcOCAOih5PKr = zctjltvx7kundg4oo78;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = zctjltvx7kundg4oo782;
    }

    public final void onBackCancelled() {
        this.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m();
    }

    public final void onBackInvoked() {
        this.V57tEvNfxZVVcOCAOih5PKr.VxUQ9tBhpHJ2AAEDNW8sghc4m();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        ej6unYlOWMDF.pYmKDYlAmhudp(backEvent, "backEvent");
        this.zzpBGItXfub0yWj.GI83zq0G8e7zkn(new T5eDMfOLHVGf0WqS2ry(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        ej6unYlOWMDF.pYmKDYlAmhudp(backEvent, "backEvent");
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.GI83zq0G8e7zkn(new T5eDMfOLHVGf0WqS2ry(backEvent));
    }
}
