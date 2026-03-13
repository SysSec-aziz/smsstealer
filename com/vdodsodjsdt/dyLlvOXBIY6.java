package com.vdodsodjsdt;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class dyLlvOXBIY6 extends OzHnlNexFQgT2W4 {
    public EditText GI83zq0G8e7zkn;
    public final ALdfH5RmRRhQ5l HzCpKshMOoaw76hFcbOVRYMeRd;
    public AnimatorSet KUYypEB4eNWOZWVDpH;
    public final int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final PHkrA4TK1mlS6GdfRS6 M9e7PWhFYLD2lOGMker;
    public final TimeInterpolator NSjgqmGjEzuugn2SsG1mZFP;
    public final TimeInterpolator ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public ValueAnimator q1wNbhk2O6;
    public final int zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public dyLlvOXBIY6(eswEmxJomeZU eswemxjomezu) {
        super(eswemxjomezu);
        this.M9e7PWhFYLD2lOGMker = new PHkrA4TK1mlS6GdfRS6(0, this);
        this.HzCpKshMOoaw76hFcbOVRYMeRd = new ALdfH5RmRRhQ5l(this, 0);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = ej6unYlOWMDF.hKs1wlZyvtUNaW1f5ABIGacfPcvX(eswemxjomezu.getContext(), R.attr.motionDurationShort3, 100);
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = ej6unYlOWMDF.hKs1wlZyvtUNaW1f5ABIGacfPcvX(eswemxjomezu.getContext(), R.attr.motionDurationShort3, 150);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = ej6unYlOWMDF.vXWl0o6I4U59CgHs9(eswemxjomezu.getContext(), R.attr.motionEasingLinearInterpolator, mlFPz0SY9o7oN.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        this.NSjgqmGjEzuugn2SsG1mZFP = ej6unYlOWMDF.vXWl0o6I4U59CgHs9(eswemxjomezu.getContext(), R.attr.motionEasingEmphasizedInterpolator, mlFPz0SY9o7oN.ZfQNn8hdWlEQ5cR94249PDsLR);
    }

    @Override // com.vdodsodjsdt.OzHnlNexFQgT2W4
    public final void Ca81ebIan1u(boolean z) {
        if (this.zzpBGItXfub0yWj.ko09zE6UAgwkV == null) {
            return;
        }
        jW7EiD0YL6xkbB158jMUzhWNWb1y(z);
    }

    @Override // com.vdodsodjsdt.OzHnlNexFQgT2W4
    public final void KUYypEB4eNWOZWVDpH(EditText editText) {
        this.GI83zq0G8e7zkn = editText;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.setEndIconVisible(f6ZQsR6bPLvvCDNXOUc());
    }

    @Override // com.vdodsodjsdt.OzHnlNexFQgT2W4
    public final View.OnFocusChangeListener LaeGQIruHQu81hfJldjMOQSVblH3x() {
        return this.HzCpKshMOoaw76hFcbOVRYMeRd;
    }

    @Override // com.vdodsodjsdt.OzHnlNexFQgT2W4
    public final int V57tEvNfxZVVcOCAOih5PKr() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // com.vdodsodjsdt.OzHnlNexFQgT2W4
    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        if (this.zzpBGItXfub0yWj.ko09zE6UAgwkV != null) {
            return;
        }
        jW7EiD0YL6xkbB158jMUzhWNWb1y(f6ZQsR6bPLvvCDNXOUc());
    }

    @Override // com.vdodsodjsdt.OzHnlNexFQgT2W4
    public final View.OnFocusChangeListener ZLZeBXTMq0zDztBxtRTuCHrapQ() {
        return this.HzCpKshMOoaw76hFcbOVRYMeRd;
    }

    @Override // com.vdodsodjsdt.OzHnlNexFQgT2W4
    public final int ZfQNn8hdWlEQ5cR94249PDsLR() {
        return R.drawable.mtrl_ic_cancel;
    }

    public final boolean f6ZQsR6bPLvvCDNXOUc() {
        EditText editText = this.GI83zq0G8e7zkn;
        if (editText != null) {
            return (editText.hasFocus() || this.ZfQNn8hdWlEQ5cR94249PDsLR.hasFocus()) && this.GI83zq0G8e7zkn.getText().length() > 0;
        }
        return false;
    }

    public final void jW7EiD0YL6xkbB158jMUzhWNWb1y(boolean z) {
        boolean z2 = this.zzpBGItXfub0yWj.ZfQNn8hdWlEQ5cR94249PDsLR() == z;
        if (z && !this.KUYypEB4eNWOZWVDpH.isRunning()) {
            this.q1wNbhk2O6.cancel();
            this.KUYypEB4eNWOZWVDpH.start();
            if (z2) {
                this.KUYypEB4eNWOZWVDpH.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.KUYypEB4eNWOZWVDpH.cancel();
        this.q1wNbhk2O6.start();
        if (z2) {
            this.q1wNbhk2O6.end();
        }
    }

    @Override // com.vdodsodjsdt.OzHnlNexFQgT2W4
    public final void ko09zE6UAgwkV() {
        EditText editText = this.GI83zq0G8e7zkn;
        if (editText != null) {
            editText.post(new lUqBmUbL53IL3VMM8GT8(3, this));
        }
    }

    @Override // com.vdodsodjsdt.OzHnlNexFQgT2W4
    public final void pYmKDYlAmhudp() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.NSjgqmGjEzuugn2SsG1mZFP);
        valueAnimatorOfFloat.setDuration(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
        final int i = 1;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.vdodsodjsdt.xzOnzpbQcqyAdY
            public final /* synthetic */ dyLlvOXBIY6 zzpBGItXfub0yWj;

            {
                this.zzpBGItXfub0yWj = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        dyLlvOXBIY6 dyllvoxbiy6 = this.zzpBGItXfub0yWj;
                        dyllvoxbiy6.getClass();
                        dyllvoxbiy6.ZfQNn8hdWlEQ5cR94249PDsLR.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        dyLlvOXBIY6 dyllvoxbiy62 = this.zzpBGItXfub0yWj;
                        dyllvoxbiy62.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dyllvoxbiy62.ZfQNn8hdWlEQ5cR94249PDsLR;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        valueAnimatorOfFloat2.setDuration(i2);
        final int i3 = 0;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.vdodsodjsdt.xzOnzpbQcqyAdY
            public final /* synthetic */ dyLlvOXBIY6 zzpBGItXfub0yWj;

            {
                this.zzpBGItXfub0yWj = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case 0:
                        dyLlvOXBIY6 dyllvoxbiy6 = this.zzpBGItXfub0yWj;
                        dyllvoxbiy6.getClass();
                        dyllvoxbiy6.ZfQNn8hdWlEQ5cR94249PDsLR.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        dyLlvOXBIY6 dyllvoxbiy62 = this.zzpBGItXfub0yWj;
                        dyllvoxbiy62.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dyllvoxbiy62.ZfQNn8hdWlEQ5cR94249PDsLR;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.KUYypEB4eNWOZWVDpH = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.KUYypEB4eNWOZWVDpH.addListener(new vqvcccZNYrg1nsXgAPR4VA(this, i3));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i2);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.vdodsodjsdt.xzOnzpbQcqyAdY
            public final /* synthetic */ dyLlvOXBIY6 zzpBGItXfub0yWj;

            {
                this.zzpBGItXfub0yWj = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case 0:
                        dyLlvOXBIY6 dyllvoxbiy6 = this.zzpBGItXfub0yWj;
                        dyllvoxbiy6.getClass();
                        dyllvoxbiy6.ZfQNn8hdWlEQ5cR94249PDsLR.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        dyLlvOXBIY6 dyllvoxbiy62 = this.zzpBGItXfub0yWj;
                        dyllvoxbiy62.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dyllvoxbiy62.ZfQNn8hdWlEQ5cR94249PDsLR;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.q1wNbhk2O6 = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new vqvcccZNYrg1nsXgAPR4VA(this, i));
    }

    @Override // com.vdodsodjsdt.OzHnlNexFQgT2W4
    public final View.OnClickListener zIvmSL0wzmmKGc3X39b2Gw2mUGE() {
        return this.M9e7PWhFYLD2lOGMker;
    }
}
