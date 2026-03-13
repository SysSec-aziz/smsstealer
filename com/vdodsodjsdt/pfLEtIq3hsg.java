package com.vdodsodjsdt;

import android.content.Context;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class pfLEtIq3hsg {
    public Object LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final Object V57tEvNfxZVVcOCAOih5PKr;
    public final nMRZPpfLCgJyuB VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final LinkedHashSet ZfQNn8hdWlEQ5cR94249PDsLR;
    public final Context zzpBGItXfub0yWj;

    public pfLEtIq3hsg(Context context, nMRZPpfLCgJyuB nmrzppflcgjyub) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = nmrzppflcgjyub;
        Context applicationContext = context.getApplicationContext();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(applicationContext, "context.applicationContext");
        this.zzpBGItXfub0yWj = applicationContext;
        this.V57tEvNfxZVVcOCAOih5PKr = new Object();
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new LinkedHashSet();
    }

    public abstract void V57tEvNfxZVVcOCAOih5PKr();

    public abstract Object VxUQ9tBhpHJ2AAEDNW8sghc4m();

    public abstract void ZfQNn8hdWlEQ5cR94249PDsLR();

    public final void zzpBGItXfub0yWj(Object obj) {
        synchronized (this.V57tEvNfxZVVcOCAOih5PKr) {
            Object obj2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            if (obj2 == null || !obj2.equals(obj)) {
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = obj;
                ((LNbLc7UMz3g5KbIBk) this.VxUQ9tBhpHJ2AAEDNW8sghc4m.zIvmSL0wzmmKGc3X39b2Gw2mUGE).execute(new KEiB9IZn8Hnusye5ELtMjAaq02l5M(2, gYXV3FZbh17i6ocMo1T.ByTQIhgl7ezGvHXEd(this.ZfQNn8hdWlEQ5cR94249PDsLR), this));
            }
        }
    }
}
