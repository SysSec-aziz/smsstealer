package com.vdodsodjsdt;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class lzuj2xiOHpZAdsoZ1vJvxA extends TextView {
    public Future GI83zq0G8e7zkn;
    public final o6OxmOsCD9HJ6LF8UTncnTX9Cf21 LaeGQIruHQu81hfJldjMOQSVblH3x;
    public Skgk8FYn8b4TvRiBOsElZw4XkNLhQ NSjgqmGjEzuugn2SsG1mZFP;
    public final bLyH8EmzTL4BGbNNd4 V57tEvNfxZVVcOCAOih5PKr;
    public boolean ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final lVmDeTGg7MOWpV ZfQNn8hdWlEQ5cR94249PDsLR;
    public USwgo3krqZKNXDmWWRV5qY4h zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public lzuj2xiOHpZAdsoZ1vJvxA(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    private USwgo3krqZKNXDmWWRV5qY4h getEmojiTextViewHelper() {
        if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE == null) {
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = new USwgo3krqZKNXDmWWRV5qY4h(this);
        }
        return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        bLyH8EmzTL4BGbNNd4 blyh8emztl4bgbnnd4 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (blyh8emztl4bgbnnd4 != null) {
            blyh8emztl4bgbnnd4.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
        lVmDeTGg7MOWpV lvmdetgg7mowpv = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (lvmdetgg7mowpv != null) {
            lvmdetgg7mowpv.zzpBGItXfub0yWj();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (TbV4rkOPds9wwfLx.V57tEvNfxZVVcOCAOih5PKr) {
            return super.getAutoSizeMaxTextSize();
        }
        lVmDeTGg7MOWpV lvmdetgg7mowpv = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (lvmdetgg7mowpv != null) {
            return Math.round(lvmdetgg7mowpv.GI83zq0G8e7zkn.LaeGQIruHQu81hfJldjMOQSVblH3x);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (TbV4rkOPds9wwfLx.V57tEvNfxZVVcOCAOih5PKr) {
            return super.getAutoSizeMinTextSize();
        }
        lVmDeTGg7MOWpV lvmdetgg7mowpv = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (lvmdetgg7mowpv != null) {
            return Math.round(lvmdetgg7mowpv.GI83zq0G8e7zkn.ZfQNn8hdWlEQ5cR94249PDsLR);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (TbV4rkOPds9wwfLx.V57tEvNfxZVVcOCAOih5PKr) {
            return super.getAutoSizeStepGranularity();
        }
        lVmDeTGg7MOWpV lvmdetgg7mowpv = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (lvmdetgg7mowpv != null) {
            return Math.round(lvmdetgg7mowpv.GI83zq0G8e7zkn.V57tEvNfxZVVcOCAOih5PKr);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (TbV4rkOPds9wwfLx.V57tEvNfxZVVcOCAOih5PKr) {
            return super.getAutoSizeTextAvailableSizes();
        }
        lVmDeTGg7MOWpV lvmdetgg7mowpv = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        return lvmdetgg7mowpv != null ? lvmdetgg7mowpv.GI83zq0G8e7zkn.zIvmSL0wzmmKGc3X39b2Gw2mUGE : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (TbV4rkOPds9wwfLx.V57tEvNfxZVVcOCAOih5PKr) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        lVmDeTGg7MOWpV lvmdetgg7mowpv = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (lvmdetgg7mowpv != null) {
            return lvmdetgg7mowpv.GI83zq0G8e7zkn.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return sGipz63rTUmSj3uFDvOtzihao.H2VFYNJEVGAX(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public zoGbsaB8ir89iocI2cl getSuperCaller() {
        if (this.NSjgqmGjEzuugn2SsG1mZFP == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.NSjgqmGjEzuugn2SsG1mZFP = new jSOJ0e2xelOmr89(this);
            } else if (i >= 28) {
                this.NSjgqmGjEzuugn2SsG1mZFP = new Ns1kRyMGXtoqPKCUGI2eoRY8(this);
            } else if (i >= 26) {
                this.NSjgqmGjEzuugn2SsG1mZFP = new Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(5, this);
            }
        }
        return this.NSjgqmGjEzuugn2SsG1mZFP;
    }

    public ColorStateList getSupportBackgroundTintList() {
        bLyH8EmzTL4BGbNNd4 blyh8emztl4bgbnnd4 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (blyh8emztl4bgbnnd4 != null) {
            return blyh8emztl4bgbnnd4.zzpBGItXfub0yWj();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        bLyH8EmzTL4BGbNNd4 blyh8emztl4bgbnnd4 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (blyh8emztl4bgbnnd4 != null) {
            return blyh8emztl4bgbnnd4.V57tEvNfxZVVcOCAOih5PKr();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.ZfQNn8hdWlEQ5cR94249PDsLR();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.LaeGQIruHQu81hfJldjMOQSVblH3x();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.GI83zq0G8e7zkn;
        if (future != null) {
            try {
                this.GI83zq0G8e7zkn = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                sGipz63rTUmSj3uFDvOtzihao.q11o1hieEkZDhF1MGOZI26oZiDT(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        o6OxmOsCD9HJ6LF8UTncnTX9Cf21 o6oxmoscd9hj6lf8utncntx9cf21;
        if (Build.VERSION.SDK_INT >= 28 || (o6oxmoscd9hj6lf8utncntx9cf21 = this.LaeGQIruHQu81hfJldjMOQSVblH3x) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) o6oxmoscd9hj6lf8utncntx9cf21.ZfQNn8hdWlEQ5cR94249PDsLR;
        return textClassifier == null ? LbqdXnQS31.VxUQ9tBhpHJ2AAEDNW8sghc4m((TextView) o6oxmoscd9hj6lf8utncntx9cf21.V57tEvNfxZVVcOCAOih5PKr) : textClassifier;
    }

    public aiTTrIAlPaeZYF getTextMetricsParamsCompat() {
        return sGipz63rTUmSj3uFDvOtzihao.q11o1hieEkZDhF1MGOZI26oZiDT(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.ZfQNn8hdWlEQ5cR94249PDsLR.getClass();
        lVmDeTGg7MOWpV.NSjgqmGjEzuugn2SsG1mZFP(editorInfo, inputConnectionOnCreateInputConnection, this);
        sGipz63rTUmSj3uFDvOtzihao.iKANjmyTSxO6v6UuLPdu7DxOjlS(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        lVmDeTGg7MOWpV lvmdetgg7mowpv = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (lvmdetgg7mowpv == null || TbV4rkOPds9wwfLx.V57tEvNfxZVVcOCAOih5PKr) {
            return;
        }
        lvmdetgg7mowpv.GI83zq0G8e7zkn.VxUQ9tBhpHJ2AAEDNW8sghc4m();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.GI83zq0G8e7zkn;
        if (future != null) {
            try {
                this.GI83zq0G8e7zkn = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                sGipz63rTUmSj3uFDvOtzihao.q11o1hieEkZDhF1MGOZI26oZiDT(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        lVmDeTGg7MOWpV lvmdetgg7mowpv = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (lvmdetgg7mowpv != null) {
            ip64iAOYuT7Wjhfuo5cbjxBm ip64iaoyut7wjhfuo5cbjxbm = lvmdetgg7mowpv.GI83zq0G8e7zkn;
            if (TbV4rkOPds9wwfLx.V57tEvNfxZVVcOCAOih5PKr || !ip64iaoyut7wjhfuo5cbjxbm.zIvmSL0wzmmKGc3X39b2Gw2mUGE()) {
                return;
            }
            ip64iaoyut7wjhfuo5cbjxbm.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().zzpBGItXfub0yWj(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (TbV4rkOPds9wwfLx.V57tEvNfxZVVcOCAOih5PKr) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        lVmDeTGg7MOWpV lvmdetgg7mowpv = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (lvmdetgg7mowpv != null) {
            lvmdetgg7mowpv.GI83zq0G8e7zkn(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (TbV4rkOPds9wwfLx.V57tEvNfxZVVcOCAOih5PKr) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        lVmDeTGg7MOWpV lvmdetgg7mowpv = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (lvmdetgg7mowpv != null) {
            lvmdetgg7mowpv.M9e7PWhFYLD2lOGMker(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (TbV4rkOPds9wwfLx.V57tEvNfxZVVcOCAOih5PKr) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        lVmDeTGg7MOWpV lvmdetgg7mowpv = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (lvmdetgg7mowpv != null) {
            lvmdetgg7mowpv.HzCpKshMOoaw76hFcbOVRYMeRd(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        bLyH8EmzTL4BGbNNd4 blyh8emztl4bgbnnd4 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (blyh8emztl4bgbnnd4 != null) {
            blyh8emztl4bgbnnd4.LaeGQIruHQu81hfJldjMOQSVblH3x();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        bLyH8EmzTL4BGbNNd4 blyh8emztl4bgbnnd4 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (blyh8emztl4bgbnnd4 != null) {
            blyh8emztl4bgbnnd4.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        lVmDeTGg7MOWpV lvmdetgg7mowpv = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (lvmdetgg7mowpv != null) {
            lvmdetgg7mowpv.zzpBGItXfub0yWj();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        lVmDeTGg7MOWpV lvmdetgg7mowpv = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (lvmdetgg7mowpv != null) {
            lvmdetgg7mowpv.zzpBGItXfub0yWj();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        lVmDeTGg7MOWpV lvmdetgg7mowpv = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (lvmdetgg7mowpv != null) {
            lvmdetgg7mowpv.zzpBGItXfub0yWj();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        lVmDeTGg7MOWpV lvmdetgg7mowpv = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (lvmdetgg7mowpv != null) {
            lvmdetgg7mowpv.zzpBGItXfub0yWj();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(sGipz63rTUmSj3uFDvOtzihao.tFRdVJAePmTx77bP7FAN0uI(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().V57tEvNfxZVVcOCAOih5PKr(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((zonOxHotd3BwAPJcwqr6I6uQNngg4) getEmojiTextViewHelper().zzpBGItXfub0yWj.ZfQNn8hdWlEQ5cR94249PDsLR).Irh5auREsoeV1C1RaBamlmy(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().q1wNbhk2O6(i);
        } else {
            sGipz63rTUmSj3uFDvOtzihao.ItrQwCXbty5PZtje5JS(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().zIvmSL0wzmmKGc3X39b2Gw2mUGE(i);
        } else {
            sGipz63rTUmSj3uFDvOtzihao.hKs1wlZyvtUNaW1f5ABIGacfPcvX(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        sGipz63rTUmSj3uFDvOtzihao.vXWl0o6I4U59CgHs9(this, i);
    }

    public void setPrecomputedText(sZQy3oyQI6g6 szqy3oyqi6g6) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        sGipz63rTUmSj3uFDvOtzihao.q11o1hieEkZDhF1MGOZI26oZiDT(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        bLyH8EmzTL4BGbNNd4 blyh8emztl4bgbnnd4 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (blyh8emztl4bgbnnd4 != null) {
            blyh8emztl4bgbnnd4.NSjgqmGjEzuugn2SsG1mZFP(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        bLyH8EmzTL4BGbNNd4 blyh8emztl4bgbnnd4 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (blyh8emztl4bgbnnd4 != null) {
            blyh8emztl4bgbnnd4.GI83zq0G8e7zkn(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        lVmDeTGg7MOWpV lvmdetgg7mowpv = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        lvmdetgg7mowpv.KUYypEB4eNWOZWVDpH(colorStateList);
        lvmdetgg7mowpv.zzpBGItXfub0yWj();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        lVmDeTGg7MOWpV lvmdetgg7mowpv = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        lvmdetgg7mowpv.q1wNbhk2O6(mode);
        lvmdetgg7mowpv.zzpBGItXfub0yWj();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        lVmDeTGg7MOWpV lvmdetgg7mowpv = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (lvmdetgg7mowpv != null) {
            lvmdetgg7mowpv.ZLZeBXTMq0zDztBxtRTuCHrapQ(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        o6OxmOsCD9HJ6LF8UTncnTX9Cf21 o6oxmoscd9hj6lf8utncntx9cf21;
        if (Build.VERSION.SDK_INT >= 28 || (o6oxmoscd9hj6lf8utncntx9cf21 = this.LaeGQIruHQu81hfJldjMOQSVblH3x) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            o6oxmoscd9hj6lf8utncntx9cf21.ZfQNn8hdWlEQ5cR94249PDsLR = textClassifier;
        }
    }

    public void setTextFuture(Future<sZQy3oyQI6g6> future) {
        this.GI83zq0G8e7zkn = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(aiTTrIAlPaeZYF aittrialpaezyf) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = aittrialpaezyf.zzpBGItXfub0yWj;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(aittrialpaezyf.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        setBreakStrategy(aittrialpaezyf.V57tEvNfxZVVcOCAOih5PKr);
        setHyphenationFrequency(aittrialpaezyf.ZfQNn8hdWlEQ5cR94249PDsLR);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = TbV4rkOPds9wwfLx.V57tEvNfxZVVcOCAOih5PKr;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        lVmDeTGg7MOWpV lvmdetgg7mowpv = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (lvmdetgg7mowpv != null) {
            ip64iAOYuT7Wjhfuo5cbjxBm ip64iaoyut7wjhfuo5cbjxbm = lvmdetgg7mowpv.GI83zq0G8e7zkn;
            if (z || ip64iaoyut7wjhfuo5cbjxbm.zIvmSL0wzmmKGc3X39b2Gw2mUGE()) {
                return;
            }
            ip64iaoyut7wjhfuo5cbjxbm.ZLZeBXTMq0zDztBxtRTuCHrapQ(i, f);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            F44whnLsbQ f44whnLsbQ = NHtvgmV6EG3jwD4PpLqRhQi.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lzuj2xiOHpZAdsoZ1vJvxA(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Avr7DhLd4ui9.VxUQ9tBhpHJ2AAEDNW8sghc4m(context);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = false;
        this.NSjgqmGjEzuugn2SsG1mZFP = null;
        Pb2A9Zlv8rKgCsB4IXiB6Sd8AhCw.VxUQ9tBhpHJ2AAEDNW8sghc4m(this, getContext());
        bLyH8EmzTL4BGbNNd4 blyh8emztl4bgbnnd4 = new bLyH8EmzTL4BGbNNd4(this);
        this.V57tEvNfxZVVcOCAOih5PKr = blyh8emztl4bgbnnd4;
        blyh8emztl4bgbnnd4.ZfQNn8hdWlEQ5cR94249PDsLR(attributeSet, i);
        lVmDeTGg7MOWpV lvmdetgg7mowpv = new lVmDeTGg7MOWpV(this);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = lvmdetgg7mowpv;
        lvmdetgg7mowpv.zIvmSL0wzmmKGc3X39b2Gw2mUGE(attributeSet, i);
        lvmdetgg7mowpv.zzpBGItXfub0yWj();
        o6OxmOsCD9HJ6LF8UTncnTX9Cf21 o6oxmoscd9hj6lf8utncntx9cf21 = new o6OxmOsCD9HJ6LF8UTncnTX9Cf21();
        o6oxmoscd9hj6lf8utncntx9cf21.V57tEvNfxZVVcOCAOih5PKr = this;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = o6oxmoscd9hj6lf8utncntx9cf21;
        getEmojiTextViewHelper().VxUQ9tBhpHJ2AAEDNW8sghc4m(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().pYmKDYlAmhudp(i, f);
        } else if (i2 >= 34) {
            lCRYuW4DMv8M.GI83zq0G8e7zkn(this, i, f);
        } else {
            sGipz63rTUmSj3uFDvOtzihao.vXWl0o6I4U59CgHs9(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(context, i) : null, i2 != 0 ? KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(context, i2) : null, i3 != 0 ? KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(context, i3) : null, i4 != 0 ? KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(context, i4) : null);
        lVmDeTGg7MOWpV lvmdetgg7mowpv = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (lvmdetgg7mowpv != null) {
            lvmdetgg7mowpv.zzpBGItXfub0yWj();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(context, i) : null, i2 != 0 ? KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(context, i2) : null, i3 != 0 ? KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(context, i3) : null, i4 != 0 ? KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(context, i4) : null);
        lVmDeTGg7MOWpV lvmdetgg7mowpv = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (lvmdetgg7mowpv != null) {
            lvmdetgg7mowpv.zzpBGItXfub0yWj();
        }
    }
}
