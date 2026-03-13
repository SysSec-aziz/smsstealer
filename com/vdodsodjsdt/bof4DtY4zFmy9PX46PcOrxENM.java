package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class bof4DtY4zFmy9PX46PcOrxENM {
    public int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final int[] zzpBGItXfub0yWj = new int[10];

    public final void V57tEvNfxZVVcOCAOih5PKr(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.zzpBGItXfub0yWj;
            if (i >= iArr.length) {
                return;
            }
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m = (1 << i) | this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            iArr[i] = i2;
        }
    }

    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        if ((this.VxUQ9tBhpHJ2AAEDNW8sghc4m & 16) != 0) {
            return this.zzpBGItXfub0yWj[4];
        }
        return 65535;
    }

    public final void zzpBGItXfub0yWj(bof4DtY4zFmy9PX46PcOrxENM bof4dty4zfmy9px46pcorxenm) {
        ej6unYlOWMDF.pYmKDYlAmhudp(bof4dty4zfmy9px46pcorxenm, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & bof4dty4zfmy9px46pcorxenm.VxUQ9tBhpHJ2AAEDNW8sghc4m) != 0) {
                V57tEvNfxZVVcOCAOih5PKr(i, bof4dty4zfmy9px46pcorxenm.zzpBGItXfub0yWj[i]);
            }
        }
    }
}
