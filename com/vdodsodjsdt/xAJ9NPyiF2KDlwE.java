package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class xAJ9NPyiF2KDlwE extends CheckedTextView {
    public final lVmDeTGg7MOWpV LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final ALnH3AptNOGA7UbXGxOl2SnVeZ V57tEvNfxZVVcOCAOih5PKr;
    public final bLyH8EmzTL4BGbNNd4 ZfQNn8hdWlEQ5cR94249PDsLR;
    public USwgo3krqZKNXDmWWRV5qY4h zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xAJ9NPyiF2KDlwE(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        Avr7DhLd4ui9.VxUQ9tBhpHJ2AAEDNW8sghc4m(context);
        Pb2A9Zlv8rKgCsB4IXiB6Sd8AhCw.VxUQ9tBhpHJ2AAEDNW8sghc4m(this, getContext());
        lVmDeTGg7MOWpV lvmdetgg7mowpv = new lVmDeTGg7MOWpV(this);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = lvmdetgg7mowpv;
        lvmdetgg7mowpv.zIvmSL0wzmmKGc3X39b2Gw2mUGE(attributeSet, R.attr.checkedTextViewStyle);
        lvmdetgg7mowpv.zzpBGItXfub0yWj();
        bLyH8EmzTL4BGbNNd4 blyh8emztl4bgbnnd4 = new bLyH8EmzTL4BGbNNd4(this);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = blyh8emztl4bgbnnd4;
        blyh8emztl4bgbnnd4.ZfQNn8hdWlEQ5cR94249PDsLR(attributeSet, R.attr.checkedTextViewStyle);
        this.V57tEvNfxZVVcOCAOih5PKr = new ALnH3AptNOGA7UbXGxOl2SnVeZ(this);
        Context context2 = getContext();
        int[] iArr = AuEvIFo0QoYm1PHNG.KUYypEB4eNWOZWVDpH;
        NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7 = NrjuzzioPqfttNRptBDpZDzSYUrcM.qNPQb1obP7(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.V57tEvNfxZVVcOCAOih5PKr;
        xb0r6yEzq0tw9m7nTWG5BFR8.KUYypEB4eNWOZWVDpH(this, getContext(), iArr, attributeSet, (TypedArray) nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.V57tEvNfxZVVcOCAOih5PKr, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(VGwRvGhOWf9duTP8Dxb9PtsLAe1z.zzpBGItXfub0yWj(typedArray.getInt(3, -1), null));
            }
            nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.aXO0LSrt8bKV();
            getEmojiTextViewHelper().VxUQ9tBhpHJ2AAEDNW8sghc4m(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.aXO0LSrt8bKV();
            throw th;
        }
    }

    private USwgo3krqZKNXDmWWRV5qY4h getEmojiTextViewHelper() {
        if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE == null) {
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = new USwgo3krqZKNXDmWWRV5qY4h(this);
        }
        return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        lVmDeTGg7MOWpV lvmdetgg7mowpv = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (lvmdetgg7mowpv != null) {
            lvmdetgg7mowpv.zzpBGItXfub0yWj();
        }
        bLyH8EmzTL4BGbNNd4 blyh8emztl4bgbnnd4 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (blyh8emztl4bgbnnd4 != null) {
            blyh8emztl4bgbnnd4.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
        ALnH3AptNOGA7UbXGxOl2SnVeZ aLnH3AptNOGA7UbXGxOl2SnVeZ = this.V57tEvNfxZVVcOCAOih5PKr;
        if (aLnH3AptNOGA7UbXGxOl2SnVeZ != null) {
            aLnH3AptNOGA7UbXGxOl2SnVeZ.zzpBGItXfub0yWj();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return sGipz63rTUmSj3uFDvOtzihao.H2VFYNJEVGAX(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCheckMarkTintList() {
        ALnH3AptNOGA7UbXGxOl2SnVeZ aLnH3AptNOGA7UbXGxOl2SnVeZ = this.V57tEvNfxZVVcOCAOih5PKr;
        if (aLnH3AptNOGA7UbXGxOl2SnVeZ != null) {
            return (ColorStateList) aLnH3AptNOGA7UbXGxOl2SnVeZ.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        sGipz63rTUmSj3uFDvOtzihao.iKANjmyTSxO6v6UuLPdu7DxOjlS(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
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

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        ALnH3AptNOGA7UbXGxOl2SnVeZ aLnH3AptNOGA7UbXGxOl2SnVeZ = this.V57tEvNfxZVVcOCAOih5PKr;
        if (aLnH3AptNOGA7UbXGxOl2SnVeZ != null) {
            if (aLnH3AptNOGA7UbXGxOl2SnVeZ.LaeGQIruHQu81hfJldjMOQSVblH3x) {
                aLnH3AptNOGA7UbXGxOl2SnVeZ.LaeGQIruHQu81hfJldjMOQSVblH3x = false;
            } else {
                aLnH3AptNOGA7UbXGxOl2SnVeZ.LaeGQIruHQu81hfJldjMOQSVblH3x = true;
                aLnH3AptNOGA7UbXGxOl2SnVeZ.zzpBGItXfub0yWj();
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(sGipz63rTUmSj3uFDvOtzihao.tFRdVJAePmTx77bP7FAN0uI(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().V57tEvNfxZVVcOCAOih5PKr(z);
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

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        ALnH3AptNOGA7UbXGxOl2SnVeZ aLnH3AptNOGA7UbXGxOl2SnVeZ = this.V57tEvNfxZVVcOCAOih5PKr;
        if (aLnH3AptNOGA7UbXGxOl2SnVeZ != null) {
            aLnH3AptNOGA7UbXGxOl2SnVeZ.VxUQ9tBhpHJ2AAEDNW8sghc4m = colorStateList;
            aLnH3AptNOGA7UbXGxOl2SnVeZ.V57tEvNfxZVVcOCAOih5PKr = true;
            aLnH3AptNOGA7UbXGxOl2SnVeZ.zzpBGItXfub0yWj();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        ALnH3AptNOGA7UbXGxOl2SnVeZ aLnH3AptNOGA7UbXGxOl2SnVeZ = this.V57tEvNfxZVVcOCAOih5PKr;
        if (aLnH3AptNOGA7UbXGxOl2SnVeZ != null) {
            aLnH3AptNOGA7UbXGxOl2SnVeZ.zzpBGItXfub0yWj = mode;
            aLnH3AptNOGA7UbXGxOl2SnVeZ.ZfQNn8hdWlEQ5cR94249PDsLR = true;
            aLnH3AptNOGA7UbXGxOl2SnVeZ.zzpBGItXfub0yWj();
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        lVmDeTGg7MOWpV lvmdetgg7mowpv = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (lvmdetgg7mowpv != null) {
            lvmdetgg7mowpv.ZLZeBXTMq0zDztBxtRTuCHrapQ(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(getContext(), i));
    }
}
