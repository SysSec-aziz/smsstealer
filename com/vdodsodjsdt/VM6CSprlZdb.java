package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class VM6CSprlZdb extends RadioButton implements sQyv43UKS0GVq5 {
    public final lVmDeTGg7MOWpV LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final ALnH3AptNOGA7UbXGxOl2SnVeZ V57tEvNfxZVVcOCAOih5PKr;
    public final bLyH8EmzTL4BGbNNd4 ZfQNn8hdWlEQ5cR94249PDsLR;
    public USwgo3krqZKNXDmWWRV5qY4h zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VM6CSprlZdb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        Avr7DhLd4ui9.VxUQ9tBhpHJ2AAEDNW8sghc4m(context);
        Pb2A9Zlv8rKgCsB4IXiB6Sd8AhCw.VxUQ9tBhpHJ2AAEDNW8sghc4m(this, getContext());
        ALnH3AptNOGA7UbXGxOl2SnVeZ aLnH3AptNOGA7UbXGxOl2SnVeZ = new ALnH3AptNOGA7UbXGxOl2SnVeZ(this);
        this.V57tEvNfxZVVcOCAOih5PKr = aLnH3AptNOGA7UbXGxOl2SnVeZ;
        aLnH3AptNOGA7UbXGxOl2SnVeZ.ZfQNn8hdWlEQ5cR94249PDsLR(attributeSet, R.attr.radioButtonStyle);
        bLyH8EmzTL4BGbNNd4 blyh8emztl4bgbnnd4 = new bLyH8EmzTL4BGbNNd4(this);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = blyh8emztl4bgbnnd4;
        blyh8emztl4bgbnnd4.ZfQNn8hdWlEQ5cR94249PDsLR(attributeSet, R.attr.radioButtonStyle);
        lVmDeTGg7MOWpV lvmdetgg7mowpv = new lVmDeTGg7MOWpV(this);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = lvmdetgg7mowpv;
        lvmdetgg7mowpv.zIvmSL0wzmmKGc3X39b2Gw2mUGE(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().VxUQ9tBhpHJ2AAEDNW8sghc4m(attributeSet, R.attr.radioButtonStyle);
    }

    private USwgo3krqZKNXDmWWRV5qY4h getEmojiTextViewHelper() {
        if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE == null) {
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = new USwgo3krqZKNXDmWWRV5qY4h(this);
        }
        return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        bLyH8EmzTL4BGbNNd4 blyh8emztl4bgbnnd4 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (blyh8emztl4bgbnnd4 != null) {
            blyh8emztl4bgbnnd4.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
        lVmDeTGg7MOWpV lvmdetgg7mowpv = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (lvmdetgg7mowpv != null) {
            lvmdetgg7mowpv.zzpBGItXfub0yWj();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        bLyH8EmzTL4BGbNNd4 blyh8emztl4bgbnnd4 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (blyh8emztl4bgbnnd4 != null) {
            return blyh8emztl4bgbnnd4.zzpBGItXfub0yWj();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        bLyH8EmzTL4BGbNNd4 blyh8emztl4bgbnnd4 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (blyh8emztl4bgbnnd4 != null) {
            return blyh8emztl4bgbnnd4.V57tEvNfxZVVcOCAOih5PKr();
        }
        return null;
    }

    @Override // com.vdodsodjsdt.sQyv43UKS0GVq5
    public ColorStateList getSupportButtonTintList() {
        ALnH3AptNOGA7UbXGxOl2SnVeZ aLnH3AptNOGA7UbXGxOl2SnVeZ = this.V57tEvNfxZVVcOCAOih5PKr;
        if (aLnH3AptNOGA7UbXGxOl2SnVeZ != null) {
            return (ColorStateList) aLnH3AptNOGA7UbXGxOl2SnVeZ.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        ALnH3AptNOGA7UbXGxOl2SnVeZ aLnH3AptNOGA7UbXGxOl2SnVeZ = this.V57tEvNfxZVVcOCAOih5PKr;
        if (aLnH3AptNOGA7UbXGxOl2SnVeZ != null) {
            return (PorterDuff.Mode) aLnH3AptNOGA7UbXGxOl2SnVeZ.zzpBGItXfub0yWj;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x.ZfQNn8hdWlEQ5cR94249PDsLR();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x.LaeGQIruHQu81hfJldjMOQSVblH3x();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().zzpBGItXfub0yWj(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        bLyH8EmzTL4BGbNNd4 blyh8emztl4bgbnnd4 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (blyh8emztl4bgbnnd4 != null) {
            blyh8emztl4bgbnnd4.LaeGQIruHQu81hfJldjMOQSVblH3x();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        bLyH8EmzTL4BGbNNd4 blyh8emztl4bgbnnd4 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (blyh8emztl4bgbnnd4 != null) {
            blyh8emztl4bgbnnd4.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        ALnH3AptNOGA7UbXGxOl2SnVeZ aLnH3AptNOGA7UbXGxOl2SnVeZ = this.V57tEvNfxZVVcOCAOih5PKr;
        if (aLnH3AptNOGA7UbXGxOl2SnVeZ != null) {
            if (aLnH3AptNOGA7UbXGxOl2SnVeZ.LaeGQIruHQu81hfJldjMOQSVblH3x) {
                aLnH3AptNOGA7UbXGxOl2SnVeZ.LaeGQIruHQu81hfJldjMOQSVblH3x = false;
            } else {
                aLnH3AptNOGA7UbXGxOl2SnVeZ.LaeGQIruHQu81hfJldjMOQSVblH3x = true;
                aLnH3AptNOGA7UbXGxOl2SnVeZ.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        lVmDeTGg7MOWpV lvmdetgg7mowpv = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (lvmdetgg7mowpv != null) {
            lvmdetgg7mowpv.zzpBGItXfub0yWj();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        lVmDeTGg7MOWpV lvmdetgg7mowpv = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
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
        bLyH8EmzTL4BGbNNd4 blyh8emztl4bgbnnd4 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (blyh8emztl4bgbnnd4 != null) {
            blyh8emztl4bgbnnd4.NSjgqmGjEzuugn2SsG1mZFP(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        bLyH8EmzTL4BGbNNd4 blyh8emztl4bgbnnd4 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (blyh8emztl4bgbnnd4 != null) {
            blyh8emztl4bgbnnd4.GI83zq0G8e7zkn(mode);
        }
    }

    @Override // com.vdodsodjsdt.sQyv43UKS0GVq5
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        ALnH3AptNOGA7UbXGxOl2SnVeZ aLnH3AptNOGA7UbXGxOl2SnVeZ = this.V57tEvNfxZVVcOCAOih5PKr;
        if (aLnH3AptNOGA7UbXGxOl2SnVeZ != null) {
            aLnH3AptNOGA7UbXGxOl2SnVeZ.VxUQ9tBhpHJ2AAEDNW8sghc4m = colorStateList;
            aLnH3AptNOGA7UbXGxOl2SnVeZ.V57tEvNfxZVVcOCAOih5PKr = true;
            aLnH3AptNOGA7UbXGxOl2SnVeZ.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
    }

    @Override // com.vdodsodjsdt.sQyv43UKS0GVq5
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        ALnH3AptNOGA7UbXGxOl2SnVeZ aLnH3AptNOGA7UbXGxOl2SnVeZ = this.V57tEvNfxZVVcOCAOih5PKr;
        if (aLnH3AptNOGA7UbXGxOl2SnVeZ != null) {
            aLnH3AptNOGA7UbXGxOl2SnVeZ.zzpBGItXfub0yWj = mode;
            aLnH3AptNOGA7UbXGxOl2SnVeZ.ZfQNn8hdWlEQ5cR94249PDsLR = true;
            aLnH3AptNOGA7UbXGxOl2SnVeZ.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        lVmDeTGg7MOWpV lvmdetgg7mowpv = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        lvmdetgg7mowpv.KUYypEB4eNWOZWVDpH(colorStateList);
        lvmdetgg7mowpv.zzpBGItXfub0yWj();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        lVmDeTGg7MOWpV lvmdetgg7mowpv = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        lvmdetgg7mowpv.q1wNbhk2O6(mode);
        lvmdetgg7mowpv.zzpBGItXfub0yWj();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(getContext(), i));
    }
}
