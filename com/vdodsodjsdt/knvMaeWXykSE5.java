package com.vdodsodjsdt;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class knvMaeWXykSE5 {
    public final SparseArray VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public oSxBDDVoR8J7pe6iX1zsMApcaW zzpBGItXfub0yWj;

    public knvMaeWXykSE5(int i) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new SparseArray(i);
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(oSxBDDVoR8J7pe6iX1zsMApcaW osxbddvor8j7pe6ix1zsmapcaw, int i, int i2) {
        int iVxUQ9tBhpHJ2AAEDNW8sghc4m = osxbddvor8j7pe6ix1zsmapcaw.VxUQ9tBhpHJ2AAEDNW8sghc4m(i);
        SparseArray sparseArray = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        knvMaeWXykSE5 knvmaewxykse5 = sparseArray == null ? null : (knvMaeWXykSE5) sparseArray.get(iVxUQ9tBhpHJ2AAEDNW8sghc4m);
        if (knvmaewxykse5 == null) {
            knvmaewxykse5 = new knvMaeWXykSE5(1);
            sparseArray.put(osxbddvor8j7pe6ix1zsmapcaw.VxUQ9tBhpHJ2AAEDNW8sghc4m(i), knvmaewxykse5);
        }
        if (i2 > i) {
            knvmaewxykse5.VxUQ9tBhpHJ2AAEDNW8sghc4m(osxbddvor8j7pe6ix1zsmapcaw, i + 1, i2);
        } else {
            knvmaewxykse5.zzpBGItXfub0yWj = osxbddvor8j7pe6ix1zsmapcaw;
        }
    }
}
