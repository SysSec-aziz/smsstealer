package com.vdodsodjsdt;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class nWGIBkCEK796AQ8GzQmTQVnC extends tUXokta1kz8LOMVlvrJggS9nWYr3z {
    public final /* synthetic */ ArrayList V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ Matrix ZfQNn8hdWlEQ5cR94249PDsLR;

    public nWGIBkCEK796AQ8GzQmTQVnC(ArrayList arrayList, Matrix matrix) {
        this.V57tEvNfxZVVcOCAOih5PKr = arrayList;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = matrix;
    }

    @Override // com.vdodsodjsdt.tUXokta1kz8LOMVlvrJggS9nWYr3z
    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(Matrix matrix, RZFzCZImjJp0J rZFzCZImjJp0J, int i, Canvas canvas) {
        ArrayList arrayList = this.V57tEvNfxZVVcOCAOih5PKr;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((tUXokta1kz8LOMVlvrJggS9nWYr3z) obj).VxUQ9tBhpHJ2AAEDNW8sghc4m(this.ZfQNn8hdWlEQ5cR94249PDsLR, rZFzCZImjJp0J, i, canvas);
        }
    }
}
