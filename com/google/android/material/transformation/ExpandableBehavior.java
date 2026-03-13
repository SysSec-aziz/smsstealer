package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.vdodsodjsdt.m8WKJH6JbFg;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableBehavior extends m8WKJH6JbFg {
    public ExpandableBehavior() {
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final boolean ZLZeBXTMq0zDztBxtRTuCHrapQ(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (!view.isLaidOut()) {
            ArrayList arrayListM9e7PWhFYLD2lOGMker = coordinatorLayout.M9e7PWhFYLD2lOGMker(view);
            int size = arrayListM9e7PWhFYLD2lOGMker.size();
            for (int i2 = 0; i2 < size; i2++) {
                zzpBGItXfub0yWj(view);
            }
        }
        return false;
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final boolean ZfQNn8hdWlEQ5cR94249PDsLR(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public abstract void zzpBGItXfub0yWj(View view);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
