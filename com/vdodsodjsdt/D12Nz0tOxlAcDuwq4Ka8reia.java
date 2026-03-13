package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class D12Nz0tOxlAcDuwq4Ka8reia extends AutoCompleteTextView {
    public static final int[] zIvmSL0wzmmKGc3X39b2Gw2mUGE = {android.R.attr.popupBackground};
    public final o0x3OWMw3He LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final bLyH8EmzTL4BGbNNd4 V57tEvNfxZVVcOCAOih5PKr;
    public final lVmDeTGg7MOWpV ZfQNn8hdWlEQ5cR94249PDsLR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D12Nz0tOxlAcDuwq4Ka8reia(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        Avr7DhLd4ui9.VxUQ9tBhpHJ2AAEDNW8sghc4m(context);
        Pb2A9Zlv8rKgCsB4IXiB6Sd8AhCw.VxUQ9tBhpHJ2AAEDNW8sghc4m(this, getContext());
        NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7 = NrjuzzioPqfttNRptBDpZDzSYUrcM.qNPQb1obP7(getContext(), attributeSet, zIvmSL0wzmmKGc3X39b2Gw2mUGE, R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.V57tEvNfxZVVcOCAOih5PKr).hasValue(0)) {
            setDropDownBackgroundDrawable(nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.pYmKDYlAmhudp(0));
        }
        nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.aXO0LSrt8bKV();
        bLyH8EmzTL4BGbNNd4 blyh8emztl4bgbnnd4 = new bLyH8EmzTL4BGbNNd4(this);
        this.V57tEvNfxZVVcOCAOih5PKr = blyh8emztl4bgbnnd4;
        blyh8emztl4bgbnnd4.ZfQNn8hdWlEQ5cR94249PDsLR(attributeSet, R.attr.autoCompleteTextViewStyle);
        lVmDeTGg7MOWpV lvmdetgg7mowpv = new lVmDeTGg7MOWpV(this);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = lvmdetgg7mowpv;
        lvmdetgg7mowpv.zIvmSL0wzmmKGc3X39b2Gw2mUGE(attributeSet, R.attr.autoCompleteTextViewStyle);
        lvmdetgg7mowpv.zzpBGItXfub0yWj();
        o0x3OWMw3He o0x3owmw3he = new o0x3OWMw3He(this, 2);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = o0x3owmw3he;
        o0x3owmw3he.TaDO7ogis3aEiWEtq(attributeSet, R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerKo09zE6UAgwkV = o0x3owmw3he.ko09zE6UAgwkV(keyListener);
        if (keyListenerKo09zE6UAgwkV == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerKo09zE6UAgwkV);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
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

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        sGipz63rTUmSj3uFDvOtzihao.iKANjmyTSxO6v6UuLPdu7DxOjlS(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x.Irh5auREsoeV1C1RaBamlmy(inputConnectionOnCreateInputConnection, editorInfo);
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(sGipz63rTUmSj3uFDvOtzihao.tFRdVJAePmTx77bP7FAN0uI(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x.q11o1hieEkZDhF1MGOZI26oZiDT(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.LaeGQIruHQu81hfJldjMOQSVblH3x.ko09zE6UAgwkV(keyListener));
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
}
