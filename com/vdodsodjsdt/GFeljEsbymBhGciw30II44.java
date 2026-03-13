package com.vdodsodjsdt;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class GFeljEsbymBhGciw30II44 extends HnVNsdy3Lwin5xfqq {
    public boolean HzCpKshMOoaw76hFcbOVRYMeRd;
    public boolean M9e7PWhFYLD2lOGMker;

    @Override // com.vdodsodjsdt.HnVNsdy3Lwin5xfqq
    public final void LaeGQIruHQu81hfJldjMOQSVblH3x(ConstraintLayout constraintLayout) {
        ZfQNn8hdWlEQ5cR94249PDsLR(constraintLayout);
    }

    public abstract void M9e7PWhFYLD2lOGMker(ETGFvpcKttQxmnhLAuvWanREdFHb eTGFvpcKttQxmnhLAuvWanREdFHb, int i, int i2);

    @Override // com.vdodsodjsdt.HnVNsdy3Lwin5xfqq
    public void ZLZeBXTMq0zDztBxtRTuCHrapQ(AttributeSet attributeSet) {
        super.ZLZeBXTMq0zDztBxtRTuCHrapQ(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ehtgKpBkv4pNXGKK0RL6dwwx7f.zzpBGItXfub0yWj);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.M9e7PWhFYLD2lOGMker = true;
                } else if (index == 22) {
                    this.HzCpKshMOoaw76hFcbOVRYMeRd = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // com.vdodsodjsdt.HnVNsdy3Lwin5xfqq, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.M9e7PWhFYLD2lOGMker || this.HzCpKshMOoaw76hFcbOVRYMeRd) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.ZfQNn8hdWlEQ5cR94249PDsLR; i++) {
                    View view = (View) constraintLayout.V57tEvNfxZVVcOCAOih5PKr.get(this.V57tEvNfxZVVcOCAOih5PKr[i]);
                    if (view != null) {
                        if (this.M9e7PWhFYLD2lOGMker) {
                            view.setVisibility(visibility);
                        }
                        if (this.HzCpKshMOoaw76hFcbOVRYMeRd && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        ZfQNn8hdWlEQ5cR94249PDsLR((ConstraintLayout) parent);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        ZfQNn8hdWlEQ5cR94249PDsLR((ConstraintLayout) parent);
    }
}
