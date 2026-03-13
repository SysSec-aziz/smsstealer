package com.vdodsodjsdt;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class skGrJUpGDGTSq1YORq extends AX2t0nklNro2XY8nBuz {
    public float V57tEvNfxZVVcOCAOih5PKr;
    public float zzpBGItXfub0yWj;

    @Override // com.vdodsodjsdt.AX2t0nklNro2XY8nBuz
    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(Matrix matrix, Path path) {
        Matrix matrix2 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.zzpBGItXfub0yWj, this.V57tEvNfxZVVcOCAOih5PKr);
        path.transform(matrix);
    }
}
