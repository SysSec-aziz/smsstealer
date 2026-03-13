package com.vdodsodjsdt;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class eswEmxJomeZU extends LinearLayout {
    public int Ca81ebIan1u;
    public final CheckableImageButton GI83zq0G8e7zkn;
    public int HzCpKshMOoaw76hFcbOVRYMeRd;
    public AccessibilityManager.TouchExplorationStateChangeListener Irh5auREsoeV1C1RaBamlmy;
    public final LinkedHashSet KUYypEB4eNWOZWVDpH;
    public final CheckableImageButton LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final ghCbSsFM2DNLJywWh M9e7PWhFYLD2lOGMker;
    public View.OnLongClickListener NSjgqmGjEzuugn2SsG1mZFP;
    public final AccessibilityManager TaDO7ogis3aEiWEtq;
    public final TextInputLayout V57tEvNfxZVVcOCAOih5PKr;
    public PorterDuff.Mode ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final FrameLayout ZfQNn8hdWlEQ5cR94249PDsLR;
    public boolean f6ZQsR6bPLvvCDNXOUc;
    public ImageView.ScaleType h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public final lzuj2xiOHpZAdsoZ1vJvxA jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public CharSequence ko09zE6UAgwkV;
    public PorterDuff.Mode p59rPv72J9;
    public View.OnLongClickListener pYmKDYlAmhudp;
    public final OJU6RB3pv2nOUirXxioh6 q11o1hieEkZDhF1MGOZI26oZiDT;
    public ColorStateList q1wNbhk2O6;
    public EditText vBGA6pPLqSMuYGvprl270j7;
    public ColorStateList zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public eswEmxJomeZU(TextInputLayout textInputLayout, NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcM) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.HzCpKshMOoaw76hFcbOVRYMeRd = 0;
        this.KUYypEB4eNWOZWVDpH = new LinkedHashSet();
        this.q11o1hieEkZDhF1MGOZI26oZiDT = new OJU6RB3pv2nOUirXxioh6(this);
        uLKh0h5Zrkfub ulkh0h5zrkfub = new uLKh0h5Zrkfub(this);
        this.TaDO7ogis3aEiWEtq = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.V57tEvNfxZVVcOCAOih5PKr = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.ZfQNn8hdWlEQ5cR94249PDsLR = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonVxUQ9tBhpHJ2AAEDNW8sghc4m = VxUQ9tBhpHJ2AAEDNW8sghc4m(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = checkableImageButtonVxUQ9tBhpHJ2AAEDNW8sghc4m;
        CheckableImageButton checkableImageButtonVxUQ9tBhpHJ2AAEDNW8sghc4m2 = VxUQ9tBhpHJ2AAEDNW8sghc4m(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.GI83zq0G8e7zkn = checkableImageButtonVxUQ9tBhpHJ2AAEDNW8sghc4m2;
        this.M9e7PWhFYLD2lOGMker = new ghCbSsFM2DNLJywWh(this, nrjuzzioPqfttNRptBDpZDzSYUrcM);
        lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa = new lzuj2xiOHpZAdsoZ1vJvxA(getContext(), null);
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = lzuj2xiohpzadsoz1vjvxa;
        TypedArray typedArray = (TypedArray) nrjuzzioPqfttNRptBDpZDzSYUrcM.V57tEvNfxZVVcOCAOih5PKr;
        if (typedArray.hasValue(38)) {
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = F44whnLsbQ.TaDO7ogis3aEiWEtq(getContext(), nrjuzzioPqfttNRptBDpZDzSYUrcM, 38);
        }
        if (typedArray.hasValue(39)) {
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = KfeOQNOupsCg6878zi4e.d9zDyyznnp3oaDT1Ug(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            GI83zq0G8e7zkn(nrjuzzioPqfttNRptBDpZDzSYUrcM.pYmKDYlAmhudp(37));
        }
        checkableImageButtonVxUQ9tBhpHJ2AAEDNW8sghc4m.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        checkableImageButtonVxUQ9tBhpHJ2AAEDNW8sghc4m.setImportantForAccessibility(2);
        checkableImageButtonVxUQ9tBhpHJ2AAEDNW8sghc4m.setClickable(false);
        checkableImageButtonVxUQ9tBhpHJ2AAEDNW8sghc4m.setPressable(false);
        checkableImageButtonVxUQ9tBhpHJ2AAEDNW8sghc4m.setCheckable(false);
        checkableImageButtonVxUQ9tBhpHJ2AAEDNW8sghc4m.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.q1wNbhk2O6 = F44whnLsbQ.TaDO7ogis3aEiWEtq(getContext(), nrjuzzioPqfttNRptBDpZDzSYUrcM, 32);
            }
            if (typedArray.hasValue(33)) {
                this.p59rPv72J9 = KfeOQNOupsCg6878zi4e.d9zDyyznnp3oaDT1Ug(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            ZLZeBXTMq0zDztBxtRTuCHrapQ(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && checkableImageButtonVxUQ9tBhpHJ2AAEDNW8sghc4m2.getContentDescription() != (text = typedArray.getText(27))) {
                checkableImageButtonVxUQ9tBhpHJ2AAEDNW8sghc4m2.setContentDescription(text);
            }
            checkableImageButtonVxUQ9tBhpHJ2AAEDNW8sghc4m2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.q1wNbhk2O6 = F44whnLsbQ.TaDO7ogis3aEiWEtq(getContext(), nrjuzzioPqfttNRptBDpZDzSYUrcM, 55);
            }
            if (typedArray.hasValue(56)) {
                this.p59rPv72J9 = KfeOQNOupsCg6878zi4e.d9zDyyznnp3oaDT1Ug(typedArray.getInt(56, -1), null);
            }
            ZLZeBXTMq0zDztBxtRTuCHrapQ(typedArray.getBoolean(54, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(52);
            if (checkableImageButtonVxUQ9tBhpHJ2AAEDNW8sghc4m2.getContentDescription() != text2) {
                checkableImageButtonVxUQ9tBhpHJ2AAEDNW8sghc4m2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.Ca81ebIan1u) {
            this.Ca81ebIan1u = dimensionPixelSize;
            checkableImageButtonVxUQ9tBhpHJ2AAEDNW8sghc4m2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonVxUQ9tBhpHJ2AAEDNW8sghc4m2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonVxUQ9tBhpHJ2AAEDNW8sghc4m.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonVxUQ9tBhpHJ2AAEDNW8sghc4m.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeJW7EiD0YL6xkbB158jMUzhWNWb1y = ej6unYlOWMDF.jW7EiD0YL6xkbB158jMUzhWNWb1y(typedArray.getInt(31, -1));
            this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = scaleTypeJW7EiD0YL6xkbB158jMUzhWNWb1y;
            checkableImageButtonVxUQ9tBhpHJ2AAEDNW8sghc4m2.setScaleType(scaleTypeJW7EiD0YL6xkbB158jMUzhWNWb1y);
            checkableImageButtonVxUQ9tBhpHJ2AAEDNW8sghc4m.setScaleType(scaleTypeJW7EiD0YL6xkbB158jMUzhWNWb1y);
        }
        lzuj2xiohpzadsoz1vjvxa.setVisibility(8);
        lzuj2xiohpzadsoz1vjvxa.setId(R.id.textinput_suffix_text);
        lzuj2xiohpzadsoz1vjvxa.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        lzuj2xiohpzadsoz1vjvxa.setAccessibilityLiveRegion(1);
        lzuj2xiohpzadsoz1vjvxa.setTextAppearance(typedArray.getResourceId(73, 0));
        if (typedArray.hasValue(74)) {
            lzuj2xiohpzadsoz1vjvxa.setTextColor(nrjuzzioPqfttNRptBDpZDzSYUrcM.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(74));
        }
        CharSequence text3 = typedArray.getText(72);
        this.ko09zE6UAgwkV = TextUtils.isEmpty(text3) ? null : text3;
        lzuj2xiohpzadsoz1vjvxa.setText(text3);
        p59rPv72J9();
        frameLayout.addView(checkableImageButtonVxUQ9tBhpHJ2AAEDNW8sghc4m2);
        addView(lzuj2xiohpzadsoz1vjvxa);
        addView(frameLayout);
        addView(checkableImageButtonVxUQ9tBhpHJ2AAEDNW8sghc4m);
        textInputLayout.bjhcQ0u7VT2OYYrwk96HrWoN.add(ulkh0h5zrkfub);
        if (textInputLayout.ZLZeBXTMq0zDztBxtRTuCHrapQ != null) {
            ulkh0h5zrkfub.VxUQ9tBhpHJ2AAEDNW8sghc4m(textInputLayout);
        }
        addOnAttachStateChangeListener(new QlGb8EPtaoCCLt3z12(1, this));
    }

    public final void GI83zq0G8e7zkn(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        checkableImageButton.setImageDrawable(drawable);
        KUYypEB4eNWOZWVDpH();
        ej6unYlOWMDF.ZLZeBXTMq0zDztBxtRTuCHrapQ(this.V57tEvNfxZVVcOCAOih5PKr, checkableImageButton, this.zIvmSL0wzmmKGc3X39b2Gw2mUGE, this.ZLZeBXTMq0zDztBxtRTuCHrapQ);
    }

    public final void HzCpKshMOoaw76hFcbOVRYMeRd() {
        this.ZfQNn8hdWlEQ5cR94249PDsLR.setVisibility((this.GI83zq0G8e7zkn.getVisibility() != 0 || LaeGQIruHQu81hfJldjMOQSVblH3x()) ? 8 : 0);
        setVisibility((ZfQNn8hdWlEQ5cR94249PDsLR() || LaeGQIruHQu81hfJldjMOQSVblH3x() || ((this.ko09zE6UAgwkV == null || this.f6ZQsR6bPLvvCDNXOUc) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public final void KUYypEB4eNWOZWVDpH() {
        CheckableImageButton checkableImageButton = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.V57tEvNfxZVVcOCAOih5PKr;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.q1wNbhk2O6.pYmKDYlAmhudp && textInputLayout.Ca81ebIan1u()) ? 0 : 8);
        HzCpKshMOoaw76hFcbOVRYMeRd();
        q1wNbhk2O6();
        if (this.HzCpKshMOoaw76hFcbOVRYMeRd != 0) {
            return;
        }
        textInputLayout.jW7EiD0YL6xkbB158jMUzhWNWb1y();
    }

    public final boolean LaeGQIruHQu81hfJldjMOQSVblH3x() {
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x.getVisibility() == 0;
    }

    public final void M9e7PWhFYLD2lOGMker(OzHnlNexFQgT2W4 ozHnlNexFQgT2W4) {
        if (this.vBGA6pPLqSMuYGvprl270j7 == null) {
            return;
        }
        if (ozHnlNexFQgT2W4.LaeGQIruHQu81hfJldjMOQSVblH3x() != null) {
            this.vBGA6pPLqSMuYGvprl270j7.setOnFocusChangeListener(ozHnlNexFQgT2W4.LaeGQIruHQu81hfJldjMOQSVblH3x());
        }
        if (ozHnlNexFQgT2W4.ZLZeBXTMq0zDztBxtRTuCHrapQ() != null) {
            this.GI83zq0G8e7zkn.setOnFocusChangeListener(ozHnlNexFQgT2W4.ZLZeBXTMq0zDztBxtRTuCHrapQ());
        }
    }

    public final void NSjgqmGjEzuugn2SsG1mZFP(boolean z) {
        if (ZfQNn8hdWlEQ5cR94249PDsLR() != z) {
            this.GI83zq0G8e7zkn.setVisibility(z ? 0 : 8);
            HzCpKshMOoaw76hFcbOVRYMeRd();
            q1wNbhk2O6();
            this.V57tEvNfxZVVcOCAOih5PKr.jW7EiD0YL6xkbB158jMUzhWNWb1y();
        }
    }

    public final int V57tEvNfxZVVcOCAOih5PKr() {
        int marginStart;
        if (ZfQNn8hdWlEQ5cR94249PDsLR() || LaeGQIruHQu81hfJldjMOQSVblH3x()) {
            CheckableImageButton checkableImageButton = this.GI83zq0G8e7zkn;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.jW7EiD0YL6xkbB158jMUzhWNWb1y.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final CheckableImageButton VxUQ9tBhpHJ2AAEDNW8sghc4m(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (F44whnLsbQ.qygqjTppWwx992(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ(int i) {
        if (this.HzCpKshMOoaw76hFcbOVRYMeRd == i) {
            return;
        }
        OzHnlNexFQgT2W4 ozHnlNexFQgT2W4ZzpBGItXfub0yWj = zzpBGItXfub0yWj();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.Irh5auREsoeV1C1RaBamlmy;
        AccessibilityManager accessibilityManager = this.TaDO7ogis3aEiWEtq;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.Irh5auREsoeV1C1RaBamlmy = null;
        ozHnlNexFQgT2W4ZzpBGItXfub0yWj.ko09zE6UAgwkV();
        this.HzCpKshMOoaw76hFcbOVRYMeRd = i;
        Iterator it = this.KUYypEB4eNWOZWVDpH.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        NSjgqmGjEzuugn2SsG1mZFP(i != 0);
        OzHnlNexFQgT2W4 ozHnlNexFQgT2W4ZzpBGItXfub0yWj2 = zzpBGItXfub0yWj();
        int iZfQNn8hdWlEQ5cR94249PDsLR = this.M9e7PWhFYLD2lOGMker.V57tEvNfxZVVcOCAOih5PKr;
        if (iZfQNn8hdWlEQ5cR94249PDsLR == 0) {
            iZfQNn8hdWlEQ5cR94249PDsLR = ozHnlNexFQgT2W4ZzpBGItXfub0yWj2.ZfQNn8hdWlEQ5cR94249PDsLR();
        }
        Drawable drawableJW7EiD0YL6xkbB158jMUzhWNWb1y = iZfQNn8hdWlEQ5cR94249PDsLR != 0 ? KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(getContext(), iZfQNn8hdWlEQ5cR94249PDsLR) : null;
        CheckableImageButton checkableImageButton = this.GI83zq0G8e7zkn;
        checkableImageButton.setImageDrawable(drawableJW7EiD0YL6xkbB158jMUzhWNWb1y);
        TextInputLayout textInputLayout = this.V57tEvNfxZVVcOCAOih5PKr;
        if (drawableJW7EiD0YL6xkbB158jMUzhWNWb1y != null) {
            ej6unYlOWMDF.ZLZeBXTMq0zDztBxtRTuCHrapQ(textInputLayout, checkableImageButton, this.q1wNbhk2O6, this.p59rPv72J9);
            ej6unYlOWMDF.lQ0rO9lhQIyVe7Rp6(textInputLayout, checkableImageButton, this.q1wNbhk2O6);
        }
        int iV57tEvNfxZVVcOCAOih5PKr = ozHnlNexFQgT2W4ZzpBGItXfub0yWj2.V57tEvNfxZVVcOCAOih5PKr();
        CharSequence text = iV57tEvNfxZVVcOCAOih5PKr != 0 ? getResources().getText(iV57tEvNfxZVVcOCAOih5PKr) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(ozHnlNexFQgT2W4ZzpBGItXfub0yWj2.M9e7PWhFYLD2lOGMker());
        if (!ozHnlNexFQgT2W4ZzpBGItXfub0yWj2.GI83zq0G8e7zkn(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        ozHnlNexFQgT2W4ZzpBGItXfub0yWj2.pYmKDYlAmhudp();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListenerNSjgqmGjEzuugn2SsG1mZFP = ozHnlNexFQgT2W4ZzpBGItXfub0yWj2.NSjgqmGjEzuugn2SsG1mZFP();
        this.Irh5auREsoeV1C1RaBamlmy = touchExplorationStateChangeListenerNSjgqmGjEzuugn2SsG1mZFP;
        if (touchExplorationStateChangeListenerNSjgqmGjEzuugn2SsG1mZFP != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.Irh5auREsoeV1C1RaBamlmy);
        }
        View.OnClickListener onClickListenerZIvmSL0wzmmKGc3X39b2Gw2mUGE = ozHnlNexFQgT2W4ZzpBGItXfub0yWj2.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        View.OnLongClickListener onLongClickListener = this.pYmKDYlAmhudp;
        checkableImageButton.setOnClickListener(onClickListenerZIvmSL0wzmmKGc3X39b2Gw2mUGE);
        ej6unYlOWMDF.rERAmyEtGV6ANGszuKcQI(checkableImageButton, onLongClickListener);
        EditText editText = this.vBGA6pPLqSMuYGvprl270j7;
        if (editText != null) {
            ozHnlNexFQgT2W4ZzpBGItXfub0yWj2.KUYypEB4eNWOZWVDpH(editText);
            M9e7PWhFYLD2lOGMker(ozHnlNexFQgT2W4ZzpBGItXfub0yWj2);
        }
        ej6unYlOWMDF.ZLZeBXTMq0zDztBxtRTuCHrapQ(textInputLayout, checkableImageButton, this.q1wNbhk2O6, this.p59rPv72J9);
        zIvmSL0wzmmKGc3X39b2Gw2mUGE(true);
    }

    public final boolean ZfQNn8hdWlEQ5cR94249PDsLR() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.getVisibility() == 0 && this.GI83zq0G8e7zkn.getVisibility() == 0;
    }

    public final void p59rPv72J9() {
        lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa = this.jW7EiD0YL6xkbB158jMUzhWNWb1y;
        int visibility = lzuj2xiohpzadsoz1vjvxa.getVisibility();
        int i = (this.ko09zE6UAgwkV == null || this.f6ZQsR6bPLvvCDNXOUc) ? 8 : 0;
        if (visibility != i) {
            zzpBGItXfub0yWj().Ca81ebIan1u(i == 0);
        }
        HzCpKshMOoaw76hFcbOVRYMeRd();
        lzuj2xiohpzadsoz1vjvxa.setVisibility(i);
        this.V57tEvNfxZVVcOCAOih5PKr.jW7EiD0YL6xkbB158jMUzhWNWb1y();
    }

    public final void q1wNbhk2O6() {
        TextInputLayout textInputLayout = this.V57tEvNfxZVVcOCAOih5PKr;
        if (textInputLayout.ZLZeBXTMq0zDztBxtRTuCHrapQ == null) {
            return;
        }
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.ZLZeBXTMq0zDztBxtRTuCHrapQ.getPaddingTop(), (ZfQNn8hdWlEQ5cR94249PDsLR() || LaeGQIruHQu81hfJldjMOQSVblH3x()) ? 0 : textInputLayout.ZLZeBXTMq0zDztBxtRTuCHrapQ.getPaddingEnd(), textInputLayout.ZLZeBXTMq0zDztBxtRTuCHrapQ.getPaddingBottom());
    }

    public final void zIvmSL0wzmmKGc3X39b2Gw2mUGE(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        OzHnlNexFQgT2W4 ozHnlNexFQgT2W4ZzpBGItXfub0yWj = zzpBGItXfub0yWj();
        boolean zM9e7PWhFYLD2lOGMker = ozHnlNexFQgT2W4ZzpBGItXfub0yWj.M9e7PWhFYLD2lOGMker();
        CheckableImageButton checkableImageButton = this.GI83zq0G8e7zkn;
        boolean z4 = true;
        if (!zM9e7PWhFYLD2lOGMker || (z3 = checkableImageButton.zIvmSL0wzmmKGc3X39b2Gw2mUGE) == ozHnlNexFQgT2W4ZzpBGItXfub0yWj.HzCpKshMOoaw76hFcbOVRYMeRd()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(ozHnlNexFQgT2W4ZzpBGItXfub0yWj instanceof hbsUcFELqptC4ZZnom4xRs0eGoz) || (zIsActivated = checkableImageButton.isActivated()) == ((hbsUcFELqptC4ZZnom4xRs0eGoz) ozHnlNexFQgT2W4ZzpBGItXfub0yWj).KUYypEB4eNWOZWVDpH) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            ej6unYlOWMDF.lQ0rO9lhQIyVe7Rp6(this.V57tEvNfxZVVcOCAOih5PKr, checkableImageButton, this.q1wNbhk2O6);
        }
    }

    public final OzHnlNexFQgT2W4 zzpBGItXfub0yWj() {
        OzHnlNexFQgT2W4 s13pf28ywWZ;
        int i = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        ghCbSsFM2DNLJywWh ghcbssfm2dnljywwh = this.M9e7PWhFYLD2lOGMker;
        SparseArray sparseArray = ghcbssfm2dnljywwh.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        OzHnlNexFQgT2W4 ozHnlNexFQgT2W4 = (OzHnlNexFQgT2W4) sparseArray.get(i);
        if (ozHnlNexFQgT2W4 != null) {
            return ozHnlNexFQgT2W4;
        }
        eswEmxJomeZU eswemxjomezu = ghcbssfm2dnljywwh.zzpBGItXfub0yWj;
        if (i == -1) {
            s13pf28ywWZ = new S13pf28ywWZ(eswemxjomezu, 0);
        } else if (i == 0) {
            s13pf28ywWZ = new S13pf28ywWZ(eswemxjomezu, 1);
        } else if (i == 1) {
            s13pf28ywWZ = new ENPstRE1SQN0tJz7UtXAM(eswemxjomezu, ghcbssfm2dnljywwh.ZfQNn8hdWlEQ5cR94249PDsLR);
        } else if (i == 2) {
            s13pf28ywWZ = new dyLlvOXBIY6(eswemxjomezu);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(u9SlVAuoWhQUfJ.NSjgqmGjEzuugn2SsG1mZFP("Invalid end icon mode: ", i));
            }
            s13pf28ywWZ = new hbsUcFELqptC4ZZnom4xRs0eGoz(eswemxjomezu);
        }
        sparseArray.append(i, s13pf28ywWZ);
        return s13pf28ywWZ;
    }
}
