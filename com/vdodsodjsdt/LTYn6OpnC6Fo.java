package com.vdodsodjsdt;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class LTYn6OpnC6Fo extends EditText implements cVUZ9g8sifbBlesZ0YuALdjSyKEN {
    public final o6OxmOsCD9HJ6LF8UTncnTX9Cf21 LaeGQIruHQu81hfJldjMOQSVblH3x;
    public WgLdSISG6RiYe NSjgqmGjEzuugn2SsG1mZFP;
    public final bLyH8EmzTL4BGbNNd4 V57tEvNfxZVVcOCAOih5PKr;
    public final o0x3OWMw3He ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final lVmDeTGg7MOWpV ZfQNn8hdWlEQ5cR94249PDsLR;
    public final hsI9793AT3Mcf111PBKEkFcs zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LTYn6OpnC6Fo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        Avr7DhLd4ui9.VxUQ9tBhpHJ2AAEDNW8sghc4m(context);
        Pb2A9Zlv8rKgCsB4IXiB6Sd8AhCw.VxUQ9tBhpHJ2AAEDNW8sghc4m(this, getContext());
        bLyH8EmzTL4BGbNNd4 blyh8emztl4bgbnnd4 = new bLyH8EmzTL4BGbNNd4(this);
        this.V57tEvNfxZVVcOCAOih5PKr = blyh8emztl4bgbnnd4;
        blyh8emztl4bgbnnd4.ZfQNn8hdWlEQ5cR94249PDsLR(attributeSet, R.attr.editTextStyle);
        lVmDeTGg7MOWpV lvmdetgg7mowpv = new lVmDeTGg7MOWpV(this);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = lvmdetgg7mowpv;
        lvmdetgg7mowpv.zIvmSL0wzmmKGc3X39b2Gw2mUGE(attributeSet, R.attr.editTextStyle);
        lvmdetgg7mowpv.zzpBGItXfub0yWj();
        o6OxmOsCD9HJ6LF8UTncnTX9Cf21 o6oxmoscd9hj6lf8utncntx9cf21 = new o6OxmOsCD9HJ6LF8UTncnTX9Cf21();
        o6oxmoscd9hj6lf8utncntx9cf21.V57tEvNfxZVVcOCAOih5PKr = this;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = o6oxmoscd9hj6lf8utncntx9cf21;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = new hsI9793AT3Mcf111PBKEkFcs();
        o0x3OWMw3He o0x3owmw3he = new o0x3OWMw3He(this, 2);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = o0x3owmw3he;
        o0x3owmw3he.TaDO7ogis3aEiWEtq(attributeSet, R.attr.editTextStyle);
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

    private WgLdSISG6RiYe getSuperCaller() {
        if (this.NSjgqmGjEzuugn2SsG1mZFP == null) {
            this.NSjgqmGjEzuugn2SsG1mZFP = new WgLdSISG6RiYe(this);
        }
        return this.NSjgqmGjEzuugn2SsG1mZFP;
    }

    @Override // com.vdodsodjsdt.cVUZ9g8sifbBlesZ0YuALdjSyKEN
    public final u4GJTAMGthCvBFOcZhx3psAaG8l VxUQ9tBhpHJ2AAEDNW8sghc4m(u4GJTAMGthCvBFOcZhx3psAaG8l u4gjtamgthcvbfoczhx3psaag8l) {
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getClass();
        return hsI9793AT3Mcf111PBKEkFcs.VxUQ9tBhpHJ2AAEDNW8sghc4m(this, u4gjtamgthcvbfoczhx3psaag8l);
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

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        o6OxmOsCD9HJ6LF8UTncnTX9Cf21 o6oxmoscd9hj6lf8utncntx9cf21;
        if (Build.VERSION.SDK_INT >= 28 || (o6oxmoscd9hj6lf8utncntx9cf21 = this.LaeGQIruHQu81hfJldjMOQSVblH3x) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) o6oxmoscd9hj6lf8utncntx9cf21.ZfQNn8hdWlEQ5cR94249PDsLR;
        return textClassifier == null ? LbqdXnQS31.VxUQ9tBhpHJ2AAEDNW8sghc4m((TextView) o6oxmoscd9hj6lf8utncntx9cf21.V57tEvNfxZVVcOCAOih5PKr) : textClassifier;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0057 A[PHI: r1
      0x0057: PHI (r1v10 java.lang.String[]) = (r1v5 java.lang.String[]), (r1v11 java.lang.String[]) binds: [B:30:0x006a, B:22:0x0055] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r8) {
        /*
            r7 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r8)
            com.vdodsodjsdt.lVmDeTGg7MOWpV r1 = r7.ZfQNn8hdWlEQ5cR94249PDsLR
            r1.getClass()
            com.vdodsodjsdt.lVmDeTGg7MOWpV.NSjgqmGjEzuugn2SsG1mZFP(r8, r0, r7)
            com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao.iKANjmyTSxO6v6UuLPdu7DxOjlS(r8, r0, r7)
            if (r0 == 0) goto L77
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L77
            java.lang.String[] r2 = com.vdodsodjsdt.xb0r6yEzq0tw9m7nTWG5BFR8.ZLZeBXTMq0zDztBxtRTuCHrapQ(r7)
            if (r2 == 0) goto L77
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r1 < r5) goto L29
            com.vdodsodjsdt.KFXtsIvhhC.VxUQ9tBhpHJ2AAEDNW8sghc4m(r8, r2)
            goto L3e
        L29:
            android.os.Bundle r6 = r8.extras
            if (r6 != 0) goto L34
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r8.extras = r6
        L34:
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r4, r2)
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r3, r2)
        L3e:
            com.vdodsodjsdt.Jc01di1Hsv r2 = new com.vdodsodjsdt.Jc01di1Hsv
            r6 = 2
            r2.<init>(r6, r7)
            if (r1 < r5) goto L4d
            com.vdodsodjsdt.somQ209urmAOekgMbC9Jtm1mxH r1 = new com.vdodsodjsdt.somQ209urmAOekgMbC9Jtm1mxH
            r1.<init>(r0, r2)
        L4b:
            r0 = r1
            goto L77
        L4d:
            java.lang.String[] r6 = com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao.zzpBGItXfub0yWj
            if (r1 < r5) goto L59
            java.lang.String[] r1 = com.vdodsodjsdt.KFXtsIvhhC.zzpBGItXfub0yWj(r8)
            if (r1 == 0) goto L6d
        L57:
            r6 = r1
            goto L6d
        L59:
            android.os.Bundle r1 = r8.extras
            if (r1 != 0) goto L5e
            goto L6d
        L5e:
            java.lang.String[] r1 = r1.getStringArray(r4)
            if (r1 != 0) goto L6a
            android.os.Bundle r1 = r8.extras
            java.lang.String[] r1 = r1.getStringArray(r3)
        L6a:
            if (r1 == 0) goto L6d
            goto L57
        L6d:
            int r1 = r6.length
            if (r1 != 0) goto L71
            goto L77
        L71:
            com.vdodsodjsdt.uTu3N9wH2oL r1 = new com.vdodsodjsdt.uTu3N9wH2oL
            r1.<init>(r0, r2)
            goto L4b
        L77:
            com.vdodsodjsdt.o0x3OWMw3He r1 = r7.ZLZeBXTMq0zDztBxtRTuCHrapQ
            com.vdodsodjsdt.euYTwHHkzT79KP8ssihrzwr r8 = r1.Irh5auREsoeV1C1RaBamlmy(r0, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.LTYn6OpnC6Fo.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zVxUQ9tBhpHJ2AAEDNW8sghc4m = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && xb0r6yEzq0tw9m7nTWG5BFR8.ZLZeBXTMq0zDztBxtRTuCHrapQ(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zVxUQ9tBhpHJ2AAEDNW8sghc4m = LfjFA1SANa.VxUQ9tBhpHJ2AAEDNW8sghc4m(dragEvent, this, activity);
            }
        }
        if (zVxUQ9tBhpHJ2AAEDNW8sghc4m) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        hF6Qoen11a skgk8FYn8b4TvRiBOsElZw4XkNLhQ;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || xb0r6yEzq0tw9m7nTWG5BFR8.ZLZeBXTMq0zDztBxtRTuCHrapQ(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                skgk8FYn8b4TvRiBOsElZw4XkNLhQ = new Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(primaryClip, 1);
            } else {
                hEzujSQMPyLOvX hezujsqmpylovx = new hEzujSQMPyLOvX();
                hezujsqmpylovx.ZfQNn8hdWlEQ5cR94249PDsLR = primaryClip;
                hezujsqmpylovx.LaeGQIruHQu81hfJldjMOQSVblH3x = 1;
                skgk8FYn8b4TvRiBOsElZw4XkNLhQ = hezujsqmpylovx;
            }
            skgk8FYn8b4TvRiBOsElZw4XkNLhQ.ko09zE6UAgwkV(i == 16908322 ? 0 : 1);
            xb0r6yEzq0tw9m7nTWG5BFR8.GI83zq0G8e7zkn(this, skgk8FYn8b4TvRiBOsElZw4XkNLhQ.build());
        }
        return true;
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

    public void setEmojiCompatEnabled(boolean z) {
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ.q11o1hieEkZDhF1MGOZI26oZiDT(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.ZLZeBXTMq0zDztBxtRTuCHrapQ.ko09zE6UAgwkV(keyListener));
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
    public void setTextClassifier(TextClassifier textClassifier) {
        o6OxmOsCD9HJ6LF8UTncnTX9Cf21 o6oxmoscd9hj6lf8utncntx9cf21;
        if (Build.VERSION.SDK_INT >= 28 || (o6oxmoscd9hj6lf8utncntx9cf21 = this.LaeGQIruHQu81hfJldjMOQSVblH3x) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            o6oxmoscd9hj6lf8utncntx9cf21.ZfQNn8hdWlEQ5cR94249PDsLR = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
