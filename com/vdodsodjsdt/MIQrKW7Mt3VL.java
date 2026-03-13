package com.vdodsodjsdt;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class MIQrKW7Mt3VL extends zRWCc8pV2W3JYgpEdFthQqzn6Ek {
    @Override // com.vdodsodjsdt.hRrPPME7ytOB7ba
    public final float Ca81ebIan1u(View view) {
        return view.getTransitionAlpha();
    }

    @Override // com.vdodsodjsdt.zRWCc8pV2W3JYgpEdFthQqzn6Ek
    public final void CixTK5ZX8oWXHz34qHYV(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // com.vdodsodjsdt.hRrPPME7ytOB7ba
    public final void SuB3hEmTmbbRGAhtvOOmfKEon(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // com.vdodsodjsdt.zRWCc8pV2W3JYgpEdFthQqzn6Ek
    public final void d9zDyyznnp3oaDT1Ug(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // com.vdodsodjsdt.zRWCc8pV2W3JYgpEdFthQqzn6Ek, com.vdodsodjsdt.hRrPPME7ytOB7ba
    public final void pzqP2AqKW6J5PO8zCKnW(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // com.vdodsodjsdt.zRWCc8pV2W3JYgpEdFthQqzn6Ek
    public final void ymT6yQrus3w(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
