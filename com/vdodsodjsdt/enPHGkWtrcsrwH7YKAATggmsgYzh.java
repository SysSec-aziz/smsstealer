package com.vdodsodjsdt;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class enPHGkWtrcsrwH7YKAATggmsgYzh implements TransformationMethod {
    public final TransformationMethod V57tEvNfxZVVcOCAOih5PKr;

    public enPHGkWtrcsrwH7YKAATggmsgYzh(TransformationMethod transformationMethod) {
        this.V57tEvNfxZVVcOCAOih5PKr = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.V57tEvNfxZVVcOCAOih5PKr;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || ZxVLD9H77Z62NUllXp.VxUQ9tBhpHJ2AAEDNW8sghc4m().zzpBGItXfub0yWj() != 1) {
            return charSequence;
        }
        ZxVLD9H77Z62NUllXp zxVLD9H77Z62NUllXpVxUQ9tBhpHJ2AAEDNW8sghc4m = ZxVLD9H77Z62NUllXp.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        zxVLD9H77Z62NUllXpVxUQ9tBhpHJ2AAEDNW8sghc4m.getClass();
        return zxVLD9H77Z62NUllXpVxUQ9tBhpHJ2AAEDNW8sghc4m.LaeGQIruHQu81hfJldjMOQSVblH3x(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.V57tEvNfxZVVcOCAOih5PKr;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
