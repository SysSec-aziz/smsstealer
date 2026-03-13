package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.vdodsodjsdt.TQMQBENV49PLMwKLaeaEMWAtYlx;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public FabTransformationBehavior() {
        new Rect();
        new RectF();
        new RectF();
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final void V57tEvNfxZVVcOCAOih5PKr(TQMQBENV49PLMwKLaeaEMWAtYlx tQMQBENV49PLMwKLaeaEMWAtYlx) {
        if (tQMQBENV49PLMwKLaeaEMWAtYlx.NSjgqmGjEzuugn2SsG1mZFP == 0) {
            tQMQBENV49PLMwKLaeaEMWAtYlx.NSjgqmGjEzuugn2SsG1mZFP = 80;
        }
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, com.vdodsodjsdt.m8WKJH6JbFg
    public final void zzpBGItXfub0yWj(View view) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new RectF();
        new RectF();
    }
}
