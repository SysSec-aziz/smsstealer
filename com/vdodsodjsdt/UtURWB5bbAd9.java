package com.vdodsodjsdt;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class UtURWB5bbAd9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final /* synthetic */ Object zzpBGItXfub0yWj;

    public /* synthetic */ UtURWB5bbAd9(int i, Object obj) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        this.zzpBGItXfub0yWj = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                EQz8nVyVxmIrHN6fNCQWutFG0b30O eQz8nVyVxmIrHN6fNCQWutFG0b30O = ((BottomSheetBehavior) this.zzpBGItXfub0yWj).GI83zq0G8e7zkn;
                if (eQz8nVyVxmIrHN6fNCQWutFG0b30O != null) {
                    UBOeuWsbhSgSQGqnIbdJ9ZBGKUI3 uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3 = eQz8nVyVxmIrHN6fNCQWutFG0b30O.ZfQNn8hdWlEQ5cR94249PDsLR;
                    if (uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3.M9e7PWhFYLD2lOGMker != fFloatValue) {
                        uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3.M9e7PWhFYLD2lOGMker = fFloatValue;
                        eQz8nVyVxmIrHN6fNCQWutFG0b30O.NSjgqmGjEzuugn2SsG1mZFP = true;
                        eQz8nVyVxmIrHN6fNCQWutFG0b30O.GI83zq0G8e7zkn = true;
                        eQz8nVyVxmIrHN6fNCQWutFG0b30O.invalidateSelf();
                    }
                }
                break;
            case 1:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                O23cBAsx5mVwcI o23cBAsx5mVwcI = (O23cBAsx5mVwcI) this.zzpBGItXfub0yWj;
                o23cBAsx5mVwcI.V57tEvNfxZVVcOCAOih5PKr.setAlpha(iFloatValue);
                o23cBAsx5mVwcI.ZfQNn8hdWlEQ5cR94249PDsLR.setAlpha(iFloatValue);
                o23cBAsx5mVwcI.jW7EiD0YL6xkbB158jMUzhWNWb1y.invalidate();
                break;
            default:
                ((TextInputLayout) this.zzpBGItXfub0yWj).r0dB0ojIy6g8mnk1.q1wNbhk2O6(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
