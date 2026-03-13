package com.vdodsodjsdt;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class g2dDK1VfurxVK3felJkB4G extends sGipz63rTUmSj3uFDvOtzihao {
    public final /* synthetic */ int NSjgqmGjEzuugn2SsG1mZFP;

    @Override // com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao
    public final int Irh5auREsoeV1C1RaBamlmy(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        int measuredHeight;
        int i;
        switch (this.NSjgqmGjEzuugn2SsG1mZFP) {
            case 0:
                measuredHeight = view.getMeasuredHeight();
                i = marginLayoutParams.bottomMargin;
                break;
            case 1:
                measuredHeight = view.getMeasuredWidth();
                i = marginLayoutParams.leftMargin;
                break;
            default:
                measuredHeight = view.getMeasuredWidth();
                i = marginLayoutParams.rightMargin;
                break;
        }
        return measuredHeight + i;
    }

    @Override // com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao
    public final ViewPropertyAnimator RhfGHxtXxy0M0grmp2jkRjQg(View view, int i) {
        switch (this.NSjgqmGjEzuugn2SsG1mZFP) {
            case 0:
                return view.animate().translationY(i);
            case 1:
                return view.animate().translationX(-i);
            default:
                return view.animate().translationX(i);
        }
    }

    @Override // com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao
    public final int w0Wu95l8dVNw5rZMRu() {
        switch (this.NSjgqmGjEzuugn2SsG1mZFP) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                return 0;
        }
    }
}
