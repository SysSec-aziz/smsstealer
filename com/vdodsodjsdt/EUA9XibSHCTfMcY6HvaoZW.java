package com.vdodsodjsdt;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class EUA9XibSHCTfMcY6HvaoZW {
    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final Method zzpBGItXfub0yWj;

    public EUA9XibSHCTfMcY6HvaoZW(int i, Method method) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        this.zzpBGItXfub0yWj = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EUA9XibSHCTfMcY6HvaoZW)) {
            return false;
        }
        EUA9XibSHCTfMcY6HvaoZW eUA9XibSHCTfMcY6HvaoZW = (EUA9XibSHCTfMcY6HvaoZW) obj;
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m == eUA9XibSHCTfMcY6HvaoZW.VxUQ9tBhpHJ2AAEDNW8sghc4m && this.zzpBGItXfub0yWj.getName().equals(eUA9XibSHCTfMcY6HvaoZW.zzpBGItXfub0yWj.getName());
    }

    public final int hashCode() {
        return this.zzpBGItXfub0yWj.getName().hashCode() + (this.VxUQ9tBhpHJ2AAEDNW8sghc4m * 31);
    }
}
