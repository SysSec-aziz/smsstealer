package com.vdodsodjsdt;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class QPa3tfXsbwIaf7Ekerd41MUIoeE implements Callable {
    public final /* synthetic */ Object LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ Context V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final /* synthetic */ int ZfQNn8hdWlEQ5cR94249PDsLR;
    public final /* synthetic */ String zzpBGItXfub0yWj;

    public /* synthetic */ QPa3tfXsbwIaf7Ekerd41MUIoeE(String str, Context context, Object obj, int i, int i2) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i2;
        this.zzpBGItXfub0yWj = str;
        this.V57tEvNfxZVVcOCAOih5PKr = context;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = obj;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                Object[] objArr = {(zDPogDYnaf4Ok5KljFrcZIbCgM2B) this.LaeGQIruHQu81hfJldjMOQSVblH3x};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                Objects.requireNonNull(obj);
                arrayList.add(obj);
                return u2wfRDeKR5EzWXLEc3z.zzpBGItXfub0yWj(this.zzpBGItXfub0yWj, this.V57tEvNfxZVVcOCAOih5PKr, Collections.unmodifiableList(arrayList), this.ZfQNn8hdWlEQ5cR94249PDsLR);
            default:
                try {
                    return u2wfRDeKR5EzWXLEc3z.zzpBGItXfub0yWj(this.zzpBGItXfub0yWj, this.V57tEvNfxZVVcOCAOih5PKr, (ArrayList) this.LaeGQIruHQu81hfJldjMOQSVblH3x, this.ZfQNn8hdWlEQ5cR94249PDsLR);
                } catch (Throwable unused) {
                    return new CfP1VFxsaWESDSF2SWQq(-3);
                }
        }
    }
}
