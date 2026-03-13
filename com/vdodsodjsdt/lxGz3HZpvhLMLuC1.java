package com.vdodsodjsdt;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class lxGz3HZpvhLMLuC1 {
    public final Uri VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final boolean zzpBGItXfub0yWj;

    public lxGz3HZpvhLMLuC1(Uri uri, boolean z) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = uri;
        this.zzpBGItXfub0yWj = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!lxGz3HZpvhLMLuC1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ej6unYlOWMDF.Ca81ebIan1u(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
        lxGz3HZpvhLMLuC1 lxgz3hzpvhlmluc1 = (lxGz3HZpvhLMLuC1) obj;
        return ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.VxUQ9tBhpHJ2AAEDNW8sghc4m, lxgz3hzpvhlmluc1.VxUQ9tBhpHJ2AAEDNW8sghc4m) && this.zzpBGItXfub0yWj == lxgz3hzpvhlmluc1.zzpBGItXfub0yWj;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.zzpBGItXfub0yWj) + (this.VxUQ9tBhpHJ2AAEDNW8sghc4m.hashCode() * 31);
    }
}
