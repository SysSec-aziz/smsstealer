package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class teIC7JqRzpd extends ToggleButton {
    public USwgo3krqZKNXDmWWRV5qY4h LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final bLyH8EmzTL4BGbNNd4 V57tEvNfxZVVcOCAOih5PKr;
    public final lVmDeTGg7MOWpV ZfQNn8hdWlEQ5cR94249PDsLR;

    public teIC7JqRzpd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, android.R.attr.buttonStyleToggle);
        Pb2A9Zlv8rKgCsB4IXiB6Sd8AhCw.VxUQ9tBhpHJ2AAEDNW8sghc4m(this, getContext());
        bLyH8EmzTL4BGbNNd4 blyh8emztl4bgbnnd4 = new bLyH8EmzTL4BGbNNd4(this);
        this.V57tEvNfxZVVcOCAOih5PKr = blyh8emztl4bgbnnd4;
        blyh8emztl4bgbnnd4.ZfQNn8hdWlEQ5cR94249PDsLR(attributeSet, android.R.attr.buttonStyleToggle);
        lVmDeTGg7MOWpV lvmdetgg7mowpv = new lVmDeTGg7MOWpV(this);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = lvmdetgg7mowpv;
        lvmdetgg7mowpv.zIvmSL0wzmmKGc3X39b2Gw2mUGE(attributeSet, android.R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().VxUQ9tBhpHJ2AAEDNW8sghc4m(attributeSet, android.R.attr.buttonStyleToggle);
    }

    private USwgo3krqZKNXDmWWRV5qY4h getEmojiTextViewHelper() {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x == null) {
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = new USwgo3krqZKNXDmWWRV5qY4h(this);
        }
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
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
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().zzpBGItXfub0yWj(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
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

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().V57tEvNfxZVVcOCAOih5PKr(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((zonOxHotd3BwAPJcwqr6I6uQNngg4) getEmojiTextViewHelper().zzpBGItXfub0yWj.ZfQNn8hdWlEQ5cR94249PDsLR).Irh5auREsoeV1C1RaBamlmy(inputFilterArr));
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
}
