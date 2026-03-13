package com.vdodsodjsdt;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class xhZAU2F7Zp5 extends LinearLayout {
    public int GI83zq0G8e7zkn;
    public View.OnLongClickListener HzCpKshMOoaw76hFcbOVRYMeRd;
    public boolean KUYypEB4eNWOZWVDpH;
    public CharSequence LaeGQIruHQu81hfJldjMOQSVblH3x;
    public ImageView.ScaleType M9e7PWhFYLD2lOGMker;
    public PorterDuff.Mode NSjgqmGjEzuugn2SsG1mZFP;
    public final TextInputLayout V57tEvNfxZVVcOCAOih5PKr;
    public ColorStateList ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final lzuj2xiOHpZAdsoZ1vJvxA ZfQNn8hdWlEQ5cR94249PDsLR;
    public final CheckableImageButton zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public xhZAU2F7Zp5(TextInputLayout textInputLayout, NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcM) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.V57tEvNfxZVVcOCAOih5PKr = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = checkableImageButton;
        lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa = new lzuj2xiOHpZAdsoZ1vJvxA(getContext(), null);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = lzuj2xiohpzadsoz1vjvxa;
        if (F44whnLsbQ.qygqjTppWwx992(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        checkableImageButton.setOnClickListener(null);
        ej6unYlOWMDF.rERAmyEtGV6ANGszuKcQI(checkableImageButton, onLongClickListener);
        this.HzCpKshMOoaw76hFcbOVRYMeRd = null;
        checkableImageButton.setOnLongClickListener(null);
        ej6unYlOWMDF.rERAmyEtGV6ANGszuKcQI(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) nrjuzzioPqfttNRptBDpZDzSYUrcM.V57tEvNfxZVVcOCAOih5PKr;
        if (typedArray.hasValue(70)) {
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = F44whnLsbQ.TaDO7ogis3aEiWEtq(getContext(), nrjuzzioPqfttNRptBDpZDzSYUrcM, 70);
        }
        if (typedArray.hasValue(71)) {
            this.NSjgqmGjEzuugn2SsG1mZFP = KfeOQNOupsCg6878zi4e.d9zDyyznnp3oaDT1Ug(typedArray.getInt(71, -1), null);
        }
        if (typedArray.hasValue(67)) {
            zzpBGItXfub0yWj(nrjuzzioPqfttNRptBDpZDzSYUrcM.pYmKDYlAmhudp(67));
            if (typedArray.hasValue(66) && checkableImageButton.getContentDescription() != (text = typedArray.getText(66))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(65, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(68, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.GI83zq0G8e7zkn) {
            this.GI83zq0G8e7zkn = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(69)) {
            ImageView.ScaleType scaleTypeJW7EiD0YL6xkbB158jMUzhWNWb1y = ej6unYlOWMDF.jW7EiD0YL6xkbB158jMUzhWNWb1y(typedArray.getInt(69, -1));
            this.M9e7PWhFYLD2lOGMker = scaleTypeJW7EiD0YL6xkbB158jMUzhWNWb1y;
            checkableImageButton.setScaleType(scaleTypeJW7EiD0YL6xkbB158jMUzhWNWb1y);
        }
        lzuj2xiohpzadsoz1vjvxa.setVisibility(8);
        lzuj2xiohpzadsoz1vjvxa.setId(R.id.textinput_prefix_text);
        lzuj2xiohpzadsoz1vjvxa.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        lzuj2xiohpzadsoz1vjvxa.setAccessibilityLiveRegion(1);
        lzuj2xiohpzadsoz1vjvxa.setTextAppearance(typedArray.getResourceId(61, 0));
        if (typedArray.hasValue(62)) {
            lzuj2xiohpzadsoz1vjvxa.setTextColor(nrjuzzioPqfttNRptBDpZDzSYUrcM.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(62));
        }
        CharSequence text2 = typedArray.getText(60);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = TextUtils.isEmpty(text2) ? null : text2;
        lzuj2xiohpzadsoz1vjvxa.setText(text2);
        LaeGQIruHQu81hfJldjMOQSVblH3x();
        addView(checkableImageButton);
        addView(lzuj2xiohpzadsoz1vjvxa);
    }

    public final void LaeGQIruHQu81hfJldjMOQSVblH3x() {
        int i = (this.LaeGQIruHQu81hfJldjMOQSVblH3x == null || this.KUYypEB4eNWOZWVDpH) ? 8 : 0;
        setVisibility((this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.ZfQNn8hdWlEQ5cR94249PDsLR.setVisibility(i);
        this.V57tEvNfxZVVcOCAOih5PKr.jW7EiD0YL6xkbB158jMUzhWNWb1y();
    }

    public final void V57tEvNfxZVVcOCAOih5PKr(boolean z) {
        CheckableImageButton checkableImageButton = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if ((checkableImageButton.getVisibility() == 0) != z) {
            checkableImageButton.setVisibility(z ? 0 : 8);
            ZfQNn8hdWlEQ5cR94249PDsLR();
            LaeGQIruHQu81hfJldjMOQSVblH3x();
        }
    }

    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        int marginEnd;
        CheckableImageButton checkableImageButton = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (checkableImageButton.getVisibility() == 0) {
            marginEnd = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            marginEnd = 0;
        }
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.getPaddingStart() + getPaddingStart() + marginEnd;
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR() {
        EditText editText = this.V57tEvNfxZVVcOCAOih5PKr.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (editText == null) {
            return;
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR.setPaddingRelative(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getVisibility() == 0 ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        ZfQNn8hdWlEQ5cR94249PDsLR();
    }

    public final void zzpBGItXfub0yWj(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            PorterDuff.Mode mode = this.NSjgqmGjEzuugn2SsG1mZFP;
            TextInputLayout textInputLayout = this.V57tEvNfxZVVcOCAOih5PKr;
            ej6unYlOWMDF.ZLZeBXTMq0zDztBxtRTuCHrapQ(textInputLayout, checkableImageButton, colorStateList, mode);
            V57tEvNfxZVVcOCAOih5PKr(true);
            ej6unYlOWMDF.lQ0rO9lhQIyVe7Rp6(textInputLayout, checkableImageButton, this.ZLZeBXTMq0zDztBxtRTuCHrapQ);
            return;
        }
        V57tEvNfxZVVcOCAOih5PKr(false);
        View.OnLongClickListener onLongClickListener = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        checkableImageButton.setOnClickListener(null);
        ej6unYlOWMDF.rERAmyEtGV6ANGszuKcQI(checkableImageButton, onLongClickListener);
        this.HzCpKshMOoaw76hFcbOVRYMeRd = null;
        checkableImageButton.setOnLongClickListener(null);
        ej6unYlOWMDF.rERAmyEtGV6ANGszuKcQI(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }
}
