package com.vdodsodjsdt;

import android.net.NetworkRequest;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class VKeHn9sH669RutJ8aaqncC {
    public static final String zzpBGItXfub0yWj;
    public final Object VxUQ9tBhpHJ2AAEDNW8sghc4m;

    static {
        String strZLZeBXTMq0zDztBxtRTuCHrapQ = psATg3LCCdmDIiRgW.ZLZeBXTMq0zDztBxtRTuCHrapQ("NetworkRequestCompat");
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strZLZeBXTMq0zDztBxtRTuCHrapQ, "tagWithPrefix(\"NetworkRequestCompat\")");
        zzpBGItXfub0yWj = strZLZeBXTMq0zDztBxtRTuCHrapQ;
    }

    public VKeHn9sH669RutJ8aaqncC(NetworkRequest networkRequest) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = networkRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VKeHn9sH669RutJ8aaqncC) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.VxUQ9tBhpHJ2AAEDNW8sghc4m, ((VKeHn9sH669RutJ8aaqncC) obj).VxUQ9tBhpHJ2AAEDNW8sghc4m);
    }

    public final int hashCode() {
        Object obj = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.VxUQ9tBhpHJ2AAEDNW8sghc4m + ')';
    }
}
