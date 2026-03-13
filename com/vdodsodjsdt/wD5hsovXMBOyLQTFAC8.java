package com.vdodsodjsdt;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class wD5hsovXMBOyLQTFAC8 extends Button {
    public USwgo3krqZKNXDmWWRV5qY4h LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final bLyH8EmzTL4BGbNNd4 V57tEvNfxZVVcOCAOih5PKr;
    public final lVmDeTGg7MOWpV ZfQNn8hdWlEQ5cR94249PDsLR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wD5hsovXMBOyLQTFAC8(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Avr7DhLd4ui9.VxUQ9tBhpHJ2AAEDNW8sghc4m(context);
        Pb2A9Zlv8rKgCsB4IXiB6Sd8AhCw.VxUQ9tBhpHJ2AAEDNW8sghc4m(this, getContext());
        bLyH8EmzTL4BGbNNd4 blyh8emztl4bgbnnd4 = new bLyH8EmzTL4BGbNNd4(this);
        this.V57tEvNfxZVVcOCAOih5PKr = blyh8emztl4bgbnnd4;
        blyh8emztl4bgbnnd4.ZfQNn8hdWlEQ5cR94249PDsLR(attributeSet, i);
        lVmDeTGg7MOWpV lvmdetgg7mowpv = new lVmDeTGg7MOWpV(this);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = lvmdetgg7mowpv;
        lvmdetgg7mowpv.zIvmSL0wzmmKGc3X39b2Gw2mUGE(attributeSet, i);
        lvmdetgg7mowpv.zzpBGItXfub0yWj();
        getEmojiTextViewHelper().VxUQ9tBhpHJ2AAEDNW8sghc4m(attributeSet, i);
    }

    private USwgo3krqZKNXDmWWRV5qY4h getEmojiTextViewHelper() {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x == null) {
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = new USwgo3krqZKNXDmWWRV5qY4h(this);
        }
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x;
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

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        lVmDeTGg7MOWpV lvmdetgg7mowpv = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (lvmdetgg7mowpv == null || TbV4rkOPds9wwfLx.V57tEvNfxZVVcOCAOih5PKr) {
            return;
        }
        lvmdetgg7mowpv.GI83zq0G8e7zkn.VxUQ9tBhpHJ2AAEDNW8sghc4m();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
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

    public void setSupportAllCaps(boolean z) {
        lVmDeTGg7MOWpV lvmdetgg7mowpv = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (lvmdetgg7mowpv != null) {
            lvmdetgg7mowpv.VxUQ9tBhpHJ2AAEDNW8sghc4m.setAllCaps(z);
        }
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
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        lVmDeTGg7MOWpV lvmdetgg7mowpv = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (lvmdetgg7mowpv != null) {
            lvmdetgg7mowpv.ZLZeBXTMq0zDztBxtRTuCHrapQ(context, i);
        }
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
}
