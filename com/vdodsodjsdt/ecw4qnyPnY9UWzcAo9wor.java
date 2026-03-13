package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class ecw4qnyPnY9UWzcAo9wor {
    public final Object[] VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public int zzpBGItXfub0yWj;

    public ecw4qnyPnY9UWzcAo9wor(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new Object[i];
    }

    public boolean V57tEvNfxZVVcOCAOih5PKr(Object obj) {
        Object[] objArr;
        boolean z;
        ej6unYlOWMDF.pYmKDYlAmhudp(obj, "instance");
        int i = this.zzpBGItXfub0yWj;
        int i2 = 0;
        while (true) {
            objArr = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (i2 >= i) {
                z = false;
                break;
            }
            if (objArr[i2] == obj) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i3 = this.zzpBGItXfub0yWj;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = obj;
        this.zzpBGItXfub0yWj = i3 + 1;
        return true;
    }

    public Object VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        int i = this.zzpBGItXfub0yWj;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        Object obj = objArr[i2];
        ej6unYlOWMDF.Ca81ebIan1u(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        objArr[i2] = null;
        this.zzpBGItXfub0yWj--;
        return obj;
    }

    public void zzpBGItXfub0yWj(Ho5xN6K0JbsdCx5JGD ho5xN6K0JbsdCx5JGD) {
        int i = this.zzpBGItXfub0yWj;
        Object[] objArr = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (i < objArr.length) {
            objArr[i] = ho5xN6K0JbsdCx5JGD;
            this.zzpBGItXfub0yWj = i + 1;
        }
    }

    public ecw4qnyPnY9UWzcAo9wor() {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new Object[256];
    }
}
