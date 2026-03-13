package com.vdodsodjsdt;

import android.os.Handler;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class aafyMrhodJgR9jbY {
    public final LinkedHashMap LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final long V57tEvNfxZVVcOCAOih5PKr;
    public final Skgk8FYn8b4TvRiBOsElZw4XkNLhQ VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final Object ZfQNn8hdWlEQ5cR94249PDsLR;
    public final o6OxmOsCD9HJ6LF8UTncnTX9Cf21 zzpBGItXfub0yWj;

    public aafyMrhodJgR9jbY(Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQ, o6OxmOsCD9HJ6LF8UTncnTX9Cf21 o6oxmoscd9hj6lf8utncntx9cf21) {
        ej6unYlOWMDF.pYmKDYlAmhudp(skgk8FYn8b4TvRiBOsElZw4XkNLhQ, "runnableScheduler");
        long millis = TimeUnit.MINUTES.toMillis(90L);
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = skgk8FYn8b4TvRiBOsElZw4XkNLhQ;
        this.zzpBGItXfub0yWj = o6oxmoscd9hj6lf8utncntx9cf21;
        this.V57tEvNfxZVVcOCAOih5PKr = millis;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new Object();
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = new LinkedHashMap();
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(ztNFMw5IuWLfuP ztnfmw5iuwlfup) {
        Runnable runnable;
        ej6unYlOWMDF.pYmKDYlAmhudp(ztnfmw5iuwlfup, "token");
        synchronized (this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            runnable = (Runnable) this.LaeGQIruHQu81hfJldjMOQSVblH3x.remove(ztnfmw5iuwlfup);
        }
        if (runnable != null) {
            ((Handler) this.VxUQ9tBhpHJ2AAEDNW8sghc4m.ZfQNn8hdWlEQ5cR94249PDsLR).removeCallbacks(runnable);
        }
    }

    public final void zzpBGItXfub0yWj(ztNFMw5IuWLfuP ztnfmw5iuwlfup) {
        ej6unYlOWMDF.pYmKDYlAmhudp(ztnfmw5iuwlfup, "token");
        KEiB9IZn8Hnusye5ELtMjAaq02l5M kEiB9IZn8Hnusye5ELtMjAaq02l5M = new KEiB9IZn8Hnusye5ELtMjAaq02l5M(5, this, ztnfmw5iuwlfup);
        synchronized (this.ZfQNn8hdWlEQ5cR94249PDsLR) {
        }
        Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQ = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        ((Handler) skgk8FYn8b4TvRiBOsElZw4XkNLhQ.ZfQNn8hdWlEQ5cR94249PDsLR).postDelayed(kEiB9IZn8Hnusye5ELtMjAaq02l5M, this.V57tEvNfxZVVcOCAOih5PKr);
    }
}
