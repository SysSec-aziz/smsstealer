package com.vdodsodjsdt;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class uGIIbcq05l2iYyEa2AaeeYA {
    public int Ca81ebIan1u;
    public LinearLayout GI83zq0G8e7zkn;
    public FrameLayout HzCpKshMOoaw76hFcbOVRYMeRd;
    public CharSequence Irh5auREsoeV1C1RaBamlmy;
    public AnimatorSet KUYypEB4eNWOZWVDpH;
    public final TimeInterpolator LaeGQIruHQu81hfJldjMOQSVblH3x;
    public int M9e7PWhFYLD2lOGMker;
    public final TextInputLayout NSjgqmGjEzuugn2SsG1mZFP;
    public int RhfGHxtXxy0M0grmp2jkRjQg;
    public Typeface SuB3hEmTmbbRGAhtvOOmfKEon;
    public ColorStateList TaDO7ogis3aEiWEtq;
    public final int V57tEvNfxZVVcOCAOih5PKr;
    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final Context ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final TimeInterpolator ZfQNn8hdWlEQ5cR94249PDsLR;
    public int f6ZQsR6bPLvvCDNXOUc;
    public CharSequence h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public CharSequence jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public lzuj2xiOHpZAdsoZ1vJvxA ko09zE6UAgwkV;
    public int p59rPv72J9;
    public boolean pYmKDYlAmhudp;
    public boolean q11o1hieEkZDhF1MGOZI26oZiDT;
    public final float q1wNbhk2O6;
    public ColorStateList qNPQb1obP7;
    public int vBGA6pPLqSMuYGvprl270j7;
    public lzuj2xiOHpZAdsoZ1vJvxA w0Wu95l8dVNw5rZMRu;
    public final TimeInterpolator zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final int zzpBGItXfub0yWj;

    public uGIIbcq05l2iYyEa2AaeeYA(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = context;
        this.NSjgqmGjEzuugn2SsG1mZFP = textInputLayout;
        this.q1wNbhk2O6 = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = ej6unYlOWMDF.hKs1wlZyvtUNaW1f5ABIGacfPcvX(context, R.attr.motionDurationShort4, 217);
        this.zzpBGItXfub0yWj = ej6unYlOWMDF.hKs1wlZyvtUNaW1f5ABIGacfPcvX(context, R.attr.motionDurationMedium4, 167);
        this.V57tEvNfxZVVcOCAOih5PKr = ej6unYlOWMDF.hKs1wlZyvtUNaW1f5ABIGacfPcvX(context, R.attr.motionDurationShort4, 167);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = ej6unYlOWMDF.vXWl0o6I4U59CgHs9(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, mlFPz0SY9o7oN.ZfQNn8hdWlEQ5cR94249PDsLR);
        LinearInterpolator linearInterpolator = mlFPz0SY9o7oN.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = ej6unYlOWMDF.vXWl0o6I4U59CgHs9(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = ej6unYlOWMDF.vXWl0o6I4U59CgHs9(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void GI83zq0G8e7zkn(int i, int i2, boolean z) {
        TextView textViewLaeGQIruHQu81hfJldjMOQSVblH3x;
        TextView textViewLaeGQIruHQu81hfJldjMOQSVblH3x2;
        uGIIbcq05l2iYyEa2AaeeYA ugiibcq05l2iyyea2aaeeya = this;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            ugiibcq05l2iyyea2aaeeya.KUYypEB4eNWOZWVDpH = animatorSet;
            ArrayList arrayList = new ArrayList();
            ugiibcq05l2iyyea2aaeeya.ZfQNn8hdWlEQ5cR94249PDsLR(arrayList, ugiibcq05l2iyyea2aaeeya.q11o1hieEkZDhF1MGOZI26oZiDT, ugiibcq05l2iyyea2aaeeya.w0Wu95l8dVNw5rZMRu, 2, i, i2);
            ugiibcq05l2iyyea2aaeeya.ZfQNn8hdWlEQ5cR94249PDsLR(arrayList, ugiibcq05l2iyyea2aaeeya.pYmKDYlAmhudp, ugiibcq05l2iyyea2aaeeya.ko09zE6UAgwkV, 1, i, i2);
            int size = arrayList.size();
            long jMax = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Animator animator = (Animator) arrayList.get(i3);
                jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
            valueAnimatorOfInt.setDuration(jMax);
            arrayList.add(0, valueAnimatorOfInt);
            animatorSet.playTogether(arrayList);
            JK8x1CtpctMwmBhP8R9 jK8x1CtpctMwmBhP8R9 = new JK8x1CtpctMwmBhP8R9(this, i2, LaeGQIruHQu81hfJldjMOQSVblH3x(i), i, ugiibcq05l2iyyea2aaeeya.LaeGQIruHQu81hfJldjMOQSVblH3x(i2));
            ugiibcq05l2iyyea2aaeeya = this;
            animatorSet.addListener(jK8x1CtpctMwmBhP8R9);
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (textViewLaeGQIruHQu81hfJldjMOQSVblH3x2 = ugiibcq05l2iyyea2aaeeya.LaeGQIruHQu81hfJldjMOQSVblH3x(i2)) != null) {
                textViewLaeGQIruHQu81hfJldjMOQSVblH3x2.setVisibility(0);
                textViewLaeGQIruHQu81hfJldjMOQSVblH3x2.setAlpha(1.0f);
            }
            if (i != 0 && (textViewLaeGQIruHQu81hfJldjMOQSVblH3x = LaeGQIruHQu81hfJldjMOQSVblH3x(i)) != null) {
                textViewLaeGQIruHQu81hfJldjMOQSVblH3x.setVisibility(4);
                if (i == 1) {
                    textViewLaeGQIruHQu81hfJldjMOQSVblH3x.setText((CharSequence) null);
                }
            }
            ugiibcq05l2iyyea2aaeeya.p59rPv72J9 = i2;
        }
        TextInputLayout textInputLayout = ugiibcq05l2iyyea2aaeeya.NSjgqmGjEzuugn2SsG1mZFP;
        textInputLayout.f6ZQsR6bPLvvCDNXOUc();
        textInputLayout.Irh5auREsoeV1C1RaBamlmy(z, false);
        textInputLayout.RhfGHxtXxy0M0grmp2jkRjQg();
    }

    public final TextView LaeGQIruHQu81hfJldjMOQSVblH3x(int i) {
        if (i == 1) {
            return this.ko09zE6UAgwkV;
        }
        if (i != 2) {
            return null;
        }
        return this.w0Wu95l8dVNw5rZMRu;
    }

    public final boolean NSjgqmGjEzuugn2SsG1mZFP(lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (textInputLayout.isLaidOut() && textInputLayout.isEnabled()) {
            return (this.Ca81ebIan1u == this.p59rPv72J9 && lzuj2xiohpzadsoz1vjvxa != null && TextUtils.equals(lzuj2xiohpzadsoz1vjvxa.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void V57tEvNfxZVVcOCAOih5PKr() {
        AnimatorSet animatorSet = this.KUYypEB4eNWOZWVDpH;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa, int i) {
        if (this.GI83zq0G8e7zkn == null && this.HzCpKshMOoaw76hFcbOVRYMeRd == null) {
            Context context = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            LinearLayout linearLayout = new LinearLayout(context);
            this.GI83zq0G8e7zkn = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.GI83zq0G8e7zkn;
            TextInputLayout textInputLayout = this.NSjgqmGjEzuugn2SsG1mZFP;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.HzCpKshMOoaw76hFcbOVRYMeRd = new FrameLayout(context);
            this.GI83zq0G8e7zkn.addView(this.HzCpKshMOoaw76hFcbOVRYMeRd, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                zzpBGItXfub0yWj();
            }
        }
        if (i == 0 || i == 1) {
            this.HzCpKshMOoaw76hFcbOVRYMeRd.setVisibility(0);
            this.HzCpKshMOoaw76hFcbOVRYMeRd.addView(lzuj2xiohpzadsoz1vjvxa);
        } else {
            this.GI83zq0G8e7zkn.addView(lzuj2xiohpzadsoz1vjvxa, new LinearLayout.LayoutParams(-2, -2));
        }
        this.GI83zq0G8e7zkn.setVisibility(0);
        this.M9e7PWhFYLD2lOGMker++;
    }

    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ(lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.GI83zq0G8e7zkn;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.HzCpKshMOoaw76hFcbOVRYMeRd) != null) {
            frameLayout.removeView(lzuj2xiohpzadsoz1vjvxa);
        } else {
            linearLayout.removeView(lzuj2xiohpzadsoz1vjvxa);
        }
        int i2 = this.M9e7PWhFYLD2lOGMker - 1;
        this.M9e7PWhFYLD2lOGMker = i2;
        LinearLayout linearLayout2 = this.GI83zq0G8e7zkn;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR(ArrayList arrayList, boolean z, lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa, int i, int i2, int i3) {
        if (lzuj2xiohpzadsoz1vjvxa == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z2 = i3 == i;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(lzuj2xiohpzadsoz1vjvxa, (Property<lzuj2xiOHpZAdsoZ1vJvxA, Float>) View.ALPHA, z2 ? 1.0f : 0.0f);
            int i4 = this.V57tEvNfxZVVcOCAOih5PKr;
            objectAnimatorOfFloat.setDuration(z2 ? this.zzpBGItXfub0yWj : i4);
            objectAnimatorOfFloat.setInterpolator(z2 ? this.LaeGQIruHQu81hfJldjMOQSVblH3x : this.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
            if (i == i3 && i2 != 0) {
                objectAnimatorOfFloat.setStartDelay(i4);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(lzuj2xiohpzadsoz1vjvxa, (Property<lzuj2xiOHpZAdsoZ1vJvxA, Float>) View.TRANSLATION_Y, -this.q1wNbhk2O6, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.VxUQ9tBhpHJ2AAEDNW8sghc4m);
            objectAnimatorOfFloat2.setInterpolator(this.ZfQNn8hdWlEQ5cR94249PDsLR);
            objectAnimatorOfFloat2.setStartDelay(i4);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    public final void zIvmSL0wzmmKGc3X39b2Gw2mUGE() {
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = null;
        V57tEvNfxZVVcOCAOih5PKr();
        if (this.p59rPv72J9 == 1) {
            if (!this.q11o1hieEkZDhF1MGOZI26oZiDT || TextUtils.isEmpty(this.Irh5auREsoeV1C1RaBamlmy)) {
                this.Ca81ebIan1u = 0;
            } else {
                this.Ca81ebIan1u = 2;
            }
        }
        GI83zq0G8e7zkn(this.p59rPv72J9, this.Ca81ebIan1u, NSjgqmGjEzuugn2SsG1mZFP(this.ko09zE6UAgwkV, ""));
    }

    public final void zzpBGItXfub0yWj() {
        if (this.GI83zq0G8e7zkn != null) {
            TextInputLayout textInputLayout = this.NSjgqmGjEzuugn2SsG1mZFP;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                boolean zQygqjTppWwx992 = F44whnLsbQ.qygqjTppWwx992(context);
                LinearLayout linearLayout = this.GI83zq0G8e7zkn;
                int paddingStart = editText.getPaddingStart();
                if (zQygqjTppWwx992) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zQygqjTppWwx992) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (zQygqjTppWwx992) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }
}
