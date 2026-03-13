package com.google.android.material.button;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.vdodsodjsdt.EQz8nVyVxmIrHN6fNCQWutFG0b30O;
import com.vdodsodjsdt.F44whnLsbQ;
import com.vdodsodjsdt.FLWIoSaHb1q8TqFvEBgPyRGrzvi6;
import com.vdodsodjsdt.GN4aJILnYJzlN5Sb;
import com.vdodsodjsdt.J3HRkfL9jUEUuIxNO2AzRqM7;
import com.vdodsodjsdt.JOx6bG7C3UqtU5xE9gpYRyQ3;
import com.vdodsodjsdt.Jc01di1Hsv;
import com.vdodsodjsdt.KfeOQNOupsCg6878zi4e;
import com.vdodsodjsdt.PGobtLpyfPC4TCnlq740;
import com.vdodsodjsdt.Skgk8FYn8b4TvRiBOsElZw4XkNLhQ;
import com.vdodsodjsdt.XdVIZOnOVHGi6uYUaae4zAI94b;
import com.vdodsodjsdt.XzG3TQCrw9CYO6IfOT7jYKxnGPWU;
import com.vdodsodjsdt.ZOzTbMJxsw;
import com.vdodsodjsdt.dqrRplqyPGe;
import com.vdodsodjsdt.ej6unYlOWMDF;
import com.vdodsodjsdt.jFJXX88X4vgYX5CG85l5EyqW8AAH;
import com.vdodsodjsdt.kuNd5HLEtGyow6v2XZnS;
import com.vdodsodjsdt.lUqBmUbL53IL3VMM8GT8;
import com.vdodsodjsdt.oWK0Apo0Nirk5BGlanOPFjcPKV7Bt;
import com.vdodsodjsdt.pOkR1d0eMyRVtgCj;
import com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao;
import com.vdodsodjsdt.u6wcQ2BsAnoRsKA9W8eoE;
import com.vdodsodjsdt.vYf7o92FnfpRxGBt1Szs;
import com.vdodsodjsdt.wD5hsovXMBOyLQTFAC8;
import com.vdodsodjsdt.wL6lQKsoxy;
import com.vdodsodjsdt.zonOxHotd3BwAPJcwqr6I6uQNngg4;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends wD5hsovXMBOyLQTFAC8 implements Checkable, dqrRplqyPGe {
    public int Ca81ebIan1u;
    public PorterDuff.Mode GI83zq0G8e7zkn;
    public GN4aJILnYJzlN5Sb HVEwbdULInpTNa0IG;
    public Drawable HzCpKshMOoaw76hFcbOVRYMeRd;
    public int Irh5auREsoeV1C1RaBamlmy;
    public String KUYypEB4eNWOZWVDpH;
    public ColorStateList M9e7PWhFYLD2lOGMker;
    public vYf7o92FnfpRxGBt1Szs NSjgqmGjEzuugn2SsG1mZFP;
    public float O1xDAlBZZlZdoEf747lCFHld;
    public int RhfGHxtXxy0M0grmp2jkRjQg;
    public int SuB3hEmTmbbRGAhtvOOmfKEon;
    public int TaDO7ogis3aEiWEtq;
    public final LinkedHashSet ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public int aXO0LSrt8bKV;
    public int f6ZQsR6bPLvvCDNXOUc;
    public int h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public int jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public boolean ko09zE6UAgwkV;
    public int p59rPv72J9;
    public boolean pYmKDYlAmhudp;
    public XzG3TQCrw9CYO6IfOT7jYKxnGPWU pzqP2AqKW6J5PO8zCKnW;
    public LinearLayout.LayoutParams q11o1hieEkZDhF1MGOZI26oZiDT;
    public int q1wNbhk2O6;
    public boolean qNPQb1obP7;
    public float vBGA6pPLqSMuYGvprl270j7;
    public float vE4yDIjexsP2lGjLaTcB;
    public boolean w0Wu95l8dVNw5rZMRu;
    public final pOkR1d0eMyRVtgCj zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public static final int[] y1NaPKTl7R18DOr6e8i5 = {R.attr.state_checkable};
    public static final int[] qygqjTppWwx992 = {R.attr.state_checked};
    public static final u6wcQ2BsAnoRsKA9W8eoE iKANjmyTSxO6v6UuLPdu7DxOjlS = new u6wcQ2BsAnoRsKA9W8eoE();

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(sGipz63rTUmSj3uFDvOtzihao.BJQHddi0Plr5ElWetCyaixWOg9(context, attributeSet, com.vdodsodjsdt.R.attr.materialButtonStyle, com.vdodsodjsdt.R.style.Widget_MaterialComponents_Button, new int[]{com.vdodsodjsdt.R.attr.materialSizeOverlay}), attributeSet, com.vdodsodjsdt.R.attr.materialButtonStyle);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = new LinkedHashSet();
        this.pYmKDYlAmhudp = false;
        this.ko09zE6UAgwkV = false;
        this.f6ZQsR6bPLvvCDNXOUc = -1;
        this.vBGA6pPLqSMuYGvprl270j7 = -1.0f;
        this.TaDO7ogis3aEiWEtq = -1;
        this.Irh5auREsoeV1C1RaBamlmy = -1;
        this.SuB3hEmTmbbRGAhtvOOmfKEon = -1;
        Context context2 = getContext();
        TypedArray typedArrayVE4yDIjexsP2lGjLaTcB = FLWIoSaHb1q8TqFvEBgPyRGrzvi6.vE4yDIjexsP2lGjLaTcB(context2, attributeSet, PGobtLpyfPC4TCnlq740.M9e7PWhFYLD2lOGMker, com.vdodsodjsdt.R.attr.materialButtonStyle, com.vdodsodjsdt.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = typedArrayVE4yDIjexsP2lGjLaTcB.getDimensionPixelSize(13, 0);
        int i = typedArrayVE4yDIjexsP2lGjLaTcB.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.GI83zq0G8e7zkn = KfeOQNOupsCg6878zi4e.d9zDyyznnp3oaDT1Ug(i, mode);
        this.M9e7PWhFYLD2lOGMker = F44whnLsbQ.vBGA6pPLqSMuYGvprl270j7(getContext(), typedArrayVE4yDIjexsP2lGjLaTcB, 15);
        this.HzCpKshMOoaw76hFcbOVRYMeRd = F44whnLsbQ.w0Wu95l8dVNw5rZMRu(getContext(), typedArrayVE4yDIjexsP2lGjLaTcB, 11);
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = typedArrayVE4yDIjexsP2lGjLaTcB.getInteger(12, 1);
        this.q1wNbhk2O6 = typedArrayVE4yDIjexsP2lGjLaTcB.getDimensionPixelSize(14, 0);
        wL6lQKsoxy wl6lqksoxyZzpBGItXfub0yWj = wL6lQKsoxy.zzpBGItXfub0yWj(context2, typedArrayVE4yDIjexsP2lGjLaTcB, 19);
        XdVIZOnOVHGi6uYUaae4zAI94b xdVIZOnOVHGi6uYUaae4zAI94bV57tEvNfxZVVcOCAOih5PKr = wl6lqksoxyZzpBGItXfub0yWj != null ? wl6lqksoxyZzpBGItXfub0yWj.V57tEvNfxZVVcOCAOih5PKr() : XdVIZOnOVHGi6uYUaae4zAI94b.zzpBGItXfub0yWj(context2, attributeSet, com.vdodsodjsdt.R.attr.materialButtonStyle, com.vdodsodjsdt.R.style.Widget_MaterialComponents_Button).VxUQ9tBhpHJ2AAEDNW8sghc4m();
        boolean z = typedArrayVE4yDIjexsP2lGjLaTcB.getBoolean(17, false);
        pOkR1d0eMyRVtgCj pokr1d0emyrvtgcj = new pOkR1d0eMyRVtgCj(this, xdVIZOnOVHGi6uYUaae4zAI94bV57tEvNfxZVVcOCAOih5PKr);
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = pokr1d0emyrvtgcj;
        pokr1d0emyrvtgcj.zIvmSL0wzmmKGc3X39b2Gw2mUGE = typedArrayVE4yDIjexsP2lGjLaTcB.getDimensionPixelOffset(2, 0);
        pokr1d0emyrvtgcj.ZLZeBXTMq0zDztBxtRTuCHrapQ = typedArrayVE4yDIjexsP2lGjLaTcB.getDimensionPixelOffset(3, 0);
        pokr1d0emyrvtgcj.NSjgqmGjEzuugn2SsG1mZFP = typedArrayVE4yDIjexsP2lGjLaTcB.getDimensionPixelOffset(4, 0);
        pokr1d0emyrvtgcj.GI83zq0G8e7zkn = typedArrayVE4yDIjexsP2lGjLaTcB.getDimensionPixelOffset(5, 0);
        if (typedArrayVE4yDIjexsP2lGjLaTcB.hasValue(9)) {
            int dimensionPixelSize = typedArrayVE4yDIjexsP2lGjLaTcB.getDimensionPixelSize(9, -1);
            pokr1d0emyrvtgcj.M9e7PWhFYLD2lOGMker = dimensionPixelSize;
            float f = dimensionPixelSize;
            jFJXX88X4vgYX5CG85l5EyqW8AAH jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE = pokr1d0emyrvtgcj.zzpBGItXfub0yWj.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
            jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.LaeGQIruHQu81hfJldjMOQSVblH3x = new ZOzTbMJxsw(f);
            jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.zIvmSL0wzmmKGc3X39b2Gw2mUGE = new ZOzTbMJxsw(f);
            jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.ZLZeBXTMq0zDztBxtRTuCHrapQ = new ZOzTbMJxsw(f);
            jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.NSjgqmGjEzuugn2SsG1mZFP = new ZOzTbMJxsw(f);
            pokr1d0emyrvtgcj.zzpBGItXfub0yWj = jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            pokr1d0emyrvtgcj.V57tEvNfxZVVcOCAOih5PKr = null;
            pokr1d0emyrvtgcj.ZfQNn8hdWlEQ5cR94249PDsLR();
            pokr1d0emyrvtgcj.jW7EiD0YL6xkbB158jMUzhWNWb1y = true;
        }
        pokr1d0emyrvtgcj.HzCpKshMOoaw76hFcbOVRYMeRd = typedArrayVE4yDIjexsP2lGjLaTcB.getDimensionPixelSize(22, 0);
        pokr1d0emyrvtgcj.KUYypEB4eNWOZWVDpH = KfeOQNOupsCg6878zi4e.d9zDyyznnp3oaDT1Ug(typedArrayVE4yDIjexsP2lGjLaTcB.getInt(8, -1), mode);
        pokr1d0emyrvtgcj.q1wNbhk2O6 = F44whnLsbQ.vBGA6pPLqSMuYGvprl270j7(getContext(), typedArrayVE4yDIjexsP2lGjLaTcB, 7);
        pokr1d0emyrvtgcj.p59rPv72J9 = F44whnLsbQ.vBGA6pPLqSMuYGvprl270j7(getContext(), typedArrayVE4yDIjexsP2lGjLaTcB, 21);
        pokr1d0emyrvtgcj.Ca81ebIan1u = F44whnLsbQ.vBGA6pPLqSMuYGvprl270j7(getContext(), typedArrayVE4yDIjexsP2lGjLaTcB, 18);
        pokr1d0emyrvtgcj.f6ZQsR6bPLvvCDNXOUc = typedArrayVE4yDIjexsP2lGjLaTcB.getBoolean(6, false);
        pokr1d0emyrvtgcj.Irh5auREsoeV1C1RaBamlmy = typedArrayVE4yDIjexsP2lGjLaTcB.getDimensionPixelSize(10, 0);
        pokr1d0emyrvtgcj.vBGA6pPLqSMuYGvprl270j7 = typedArrayVE4yDIjexsP2lGjLaTcB.getBoolean(23, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (typedArrayVE4yDIjexsP2lGjLaTcB.hasValue(0)) {
            pokr1d0emyrvtgcj.ko09zE6UAgwkV = true;
            setSupportBackgroundTintList(pokr1d0emyrvtgcj.q1wNbhk2O6);
            setSupportBackgroundTintMode(pokr1d0emyrvtgcj.KUYypEB4eNWOZWVDpH);
        } else {
            pokr1d0emyrvtgcj.V57tEvNfxZVVcOCAOih5PKr();
        }
        setPaddingRelative(paddingStart + pokr1d0emyrvtgcj.zIvmSL0wzmmKGc3X39b2Gw2mUGE, paddingTop + pokr1d0emyrvtgcj.NSjgqmGjEzuugn2SsG1mZFP, paddingEnd + pokr1d0emyrvtgcj.ZLZeBXTMq0zDztBxtRTuCHrapQ, paddingBottom + pokr1d0emyrvtgcj.GI83zq0G8e7zkn);
        setCheckedInternal(typedArrayVE4yDIjexsP2lGjLaTcB.getBoolean(1, false));
        if (wl6lqksoxyZzpBGItXfub0yWj != null) {
            pokr1d0emyrvtgcj.ZfQNn8hdWlEQ5cR94249PDsLR = ZfQNn8hdWlEQ5cR94249PDsLR();
            if (pokr1d0emyrvtgcj.V57tEvNfxZVVcOCAOih5PKr != null) {
                pokr1d0emyrvtgcj.ZfQNn8hdWlEQ5cR94249PDsLR();
            }
            pokr1d0emyrvtgcj.V57tEvNfxZVVcOCAOih5PKr = wl6lqksoxyZzpBGItXfub0yWj;
            pokr1d0emyrvtgcj.ZfQNn8hdWlEQ5cR94249PDsLR();
        }
        setOpticalCenterEnabled(z);
        typedArrayVE4yDIjexsP2lGjLaTcB.recycle();
        setCompoundDrawablePadding(this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv);
        NSjgqmGjEzuugn2SsG1mZFP(this.HzCpKshMOoaw76hFcbOVRYMeRd != null);
    }

    public static /* synthetic */ void VxUQ9tBhpHJ2AAEDNW8sghc4m(MaterialButton materialButton) {
        materialButton.RhfGHxtXxy0M0grmp2jkRjQg = materialButton.getOpticalCenterShift();
        materialButton.M9e7PWhFYLD2lOGMker();
        materialButton.invalidate();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.vE4yDIjexsP2lGjLaTcB;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        EQz8nVyVxmIrHN6fNCQWutFG0b30O eQz8nVyVxmIrHN6fNCQWutFG0b30OVxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (this.w0Wu95l8dVNw5rZMRu && this.qNPQb1obP7 && (eQz8nVyVxmIrHN6fNCQWutFG0b30OVxUQ9tBhpHJ2AAEDNW8sghc4m = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.VxUQ9tBhpHJ2AAEDNW8sghc4m(false)) != null) {
            return (int) (eQz8nVyVxmIrHN6fNCQWutFG0b30OVxUQ9tBhpHJ2AAEDNW8sghc4m.NSjgqmGjEzuugn2SsG1mZFP() * 0.11f);
        }
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    private void setCheckedInternal(boolean z) {
        pOkR1d0eMyRVtgCj pokr1d0emyrvtgcj = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (pokr1d0emyrvtgcj == null || !pokr1d0emyrvtgcj.f6ZQsR6bPLvvCDNXOUc || this.pYmKDYlAmhudp == z) {
            return;
        }
        this.pYmKDYlAmhudp = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z2 = this.pYmKDYlAmhudp;
            if (!materialButtonToggleGroup.p59rPv72J9) {
                materialButtonToggleGroup.zIvmSL0wzmmKGc3X39b2Gw2mUGE(getId(), z2);
            }
        }
        if (this.ko09zE6UAgwkV) {
            return;
        }
        this.ko09zE6UAgwkV = true;
        Iterator it = this.ZLZeBXTMq0zDztBxtRTuCHrapQ.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.ko09zE6UAgwkV = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f) {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        if (this.vE4yDIjexsP2lGjLaTcB != f) {
            this.vE4yDIjexsP2lGjLaTcB = f;
            M9e7PWhFYLD2lOGMker();
            invalidate();
            if (getParent() instanceof J3HRkfL9jUEUuIxNO2AzRqM7) {
                J3HRkfL9jUEUuIxNO2AzRqM7 j3HRkfL9jUEUuIxNO2AzRqM7 = (J3HRkfL9jUEUuIxNO2AzRqM7) getParent();
                int i = (int) this.vE4yDIjexsP2lGjLaTcB;
                int iIndexOfChild = j3HRkfL9jUEUuIxNO2AzRqM7.indexOfChild(this);
                if (iIndexOfChild < 0) {
                    return;
                }
                int i2 = iIndexOfChild - 1;
                while (true) {
                    materialButton = null;
                    if (i2 < 0) {
                        materialButton2 = null;
                        break;
                    } else {
                        if (j3HRkfL9jUEUuIxNO2AzRqM7.V57tEvNfxZVVcOCAOih5PKr(i2)) {
                            materialButton2 = (MaterialButton) j3HRkfL9jUEUuIxNO2AzRqM7.getChildAt(i2);
                            break;
                        }
                        i2--;
                    }
                }
                int childCount = j3HRkfL9jUEUuIxNO2AzRqM7.getChildCount();
                while (true) {
                    iIndexOfChild++;
                    if (iIndexOfChild >= childCount) {
                        break;
                    } else if (j3HRkfL9jUEUuIxNO2AzRqM7.V57tEvNfxZVVcOCAOih5PKr(iIndexOfChild)) {
                        materialButton = (MaterialButton) j3HRkfL9jUEUuIxNO2AzRqM7.getChildAt(iIndexOfChild);
                        break;
                    }
                }
                if (materialButton2 == null && materialButton == null) {
                    return;
                }
                if (materialButton2 == null) {
                    materialButton.setDisplayedWidthDecrease(i);
                }
                if (materialButton == null) {
                    materialButton2.setDisplayedWidthDecrease(i);
                }
                if (materialButton2 == null || materialButton == null) {
                    return;
                }
                materialButton2.setDisplayedWidthDecrease(i / 2);
                materialButton.setDisplayedWidthDecrease((i + 1) / 2);
            }
        }
    }

    public final void GI83zq0G8e7zkn(int i, int i2) {
        if (this.HzCpKshMOoaw76hFcbOVRYMeRd == null || getLayout() == null) {
            return;
        }
        int i3 = this.jW7EiD0YL6xkbB158jMUzhWNWb1y;
        if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.p59rPv72J9 = 0;
                if (i3 == 16) {
                    this.Ca81ebIan1u = 0;
                    NSjgqmGjEzuugn2SsG1mZFP(false);
                    return;
                }
                int intrinsicHeight = this.q1wNbhk2O6;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.HzCpKshMOoaw76hFcbOVRYMeRd.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv) - getPaddingBottom()) / 2);
                if (this.Ca81ebIan1u != iMax) {
                    this.Ca81ebIan1u = iMax;
                    NSjgqmGjEzuugn2SsG1mZFP(false);
                    return;
                }
                return;
            }
            return;
        }
        this.Ca81ebIan1u = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i4 = this.jW7EiD0YL6xkbB158jMUzhWNWb1y;
        if (i4 == 1 || i4 == 3 || ((i4 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i4 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.p59rPv72J9 = 0;
            NSjgqmGjEzuugn2SsG1mZFP(false);
            return;
        }
        int intrinsicWidth = this.q1wNbhk2O6;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.HzCpKshMOoaw76hFcbOVRYMeRd.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.jW7EiD0YL6xkbB158jMUzhWNWb1y == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.p59rPv72J9 != textLayoutWidth) {
            this.p59rPv72J9 = textLayoutWidth;
            NSjgqmGjEzuugn2SsG1mZFP(false);
        }
    }

    public final boolean LaeGQIruHQu81hfJldjMOQSVblH3x() {
        pOkR1d0eMyRVtgCj pokr1d0emyrvtgcj = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        return (pokr1d0emyrvtgcj == null || pokr1d0emyrvtgcj.ko09zE6UAgwkV) ? false : true;
    }

    public final void M9e7PWhFYLD2lOGMker() {
        int i = (int) (this.vE4yDIjexsP2lGjLaTcB - this.O1xDAlBZZlZdoEf747lCFHld);
        int i2 = (i / 2) + this.RhfGHxtXxy0M0grmp2jkRjQg;
        getLayoutParams().width = (int) (this.vBGA6pPLqSMuYGvprl270j7 + i);
        setPaddingRelative(this.TaDO7ogis3aEiWEtq + i2, getPaddingTop(), (this.Irh5auREsoeV1C1RaBamlmy + i) - i2, getPaddingBottom());
    }

    public final void NSjgqmGjEzuugn2SsG1mZFP(boolean z) {
        Drawable drawable = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.HzCpKshMOoaw76hFcbOVRYMeRd = drawableMutate;
            drawableMutate.setTintList(this.M9e7PWhFYLD2lOGMker);
            PorterDuff.Mode mode = this.GI83zq0G8e7zkn;
            if (mode != null) {
                this.HzCpKshMOoaw76hFcbOVRYMeRd.setTintMode(mode);
            }
            int intrinsicWidth = this.q1wNbhk2O6;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.HzCpKshMOoaw76hFcbOVRYMeRd.getIntrinsicWidth();
            }
            int intrinsicHeight = this.q1wNbhk2O6;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.HzCpKshMOoaw76hFcbOVRYMeRd.getIntrinsicHeight();
            }
            Drawable drawable2 = this.HzCpKshMOoaw76hFcbOVRYMeRd;
            int i = this.p59rPv72J9;
            int i2 = this.Ca81ebIan1u;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.HzCpKshMOoaw76hFcbOVRYMeRd.setVisible(true, z);
        }
        if (z) {
            ZLZeBXTMq0zDztBxtRTuCHrapQ();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i3 = this.jW7EiD0YL6xkbB158jMUzhWNWb1y;
        if (((i3 == 1 || i3 == 2) && drawable3 != this.HzCpKshMOoaw76hFcbOVRYMeRd) || (((i3 == 3 || i3 == 4) && drawable5 != this.HzCpKshMOoaw76hFcbOVRYMeRd) || ((i3 == 16 || i3 == 32) && drawable4 != this.HzCpKshMOoaw76hFcbOVRYMeRd))) {
            ZLZeBXTMq0zDztBxtRTuCHrapQ();
        }
    }

    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ() {
        int i = this.jW7EiD0YL6xkbB158jMUzhWNWb1y;
        if (i == 1 || i == 2) {
            setCompoundDrawablesRelative(this.HzCpKshMOoaw76hFcbOVRYMeRd, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.HzCpKshMOoaw76hFcbOVRYMeRd, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.HzCpKshMOoaw76hFcbOVRYMeRd, null, null);
        }
    }

    public final oWK0Apo0Nirk5BGlanOPFjcPKV7Bt ZfQNn8hdWlEQ5cR94249PDsLR() {
        Context context = getContext();
        TypedValue typedValueJUdwvN8LfOMa = ej6unYlOWMDF.JUdwvN8LfOMa(context, com.vdodsodjsdt.R.attr.motionSpringFastSpatial);
        int[] iArr = PGobtLpyfPC4TCnlq740.jW7EiD0YL6xkbB158jMUzhWNWb1y;
        TypedArray typedArrayObtainStyledAttributes = typedValueJUdwvN8LfOMa == null ? context.obtainStyledAttributes(null, iArr, 0, com.vdodsodjsdt.R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(typedValueJUdwvN8LfOMa.resourceId, iArr);
        oWK0Apo0Nirk5BGlanOPFjcPKV7Bt owk0apo0nirk5bglanopfjcpkv7bt = new oWK0Apo0Nirk5BGlanOPFjcPKV7Bt();
        try {
            float f = typedArrayObtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f2 = typedArrayObtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            if (f <= 0.0f) {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
            owk0apo0nirk5bglanopfjcpkv7bt.VxUQ9tBhpHJ2AAEDNW8sghc4m = Math.sqrt(f);
            owk0apo0nirk5bglanopfjcpkv7bt.V57tEvNfxZVVcOCAOih5PKr = false;
            if (f2 < 0.0f) {
                throw new IllegalArgumentException("Damping ratio must be non-negative");
            }
            owk0apo0nirk5bglanopfjcpkv7bt.zzpBGItXfub0yWj = f2;
            owk0apo0nirk5bglanopfjcpkv7bt.V57tEvNfxZVVcOCAOih5PKr = false;
            typedArrayObtainStyledAttributes.recycle();
            return owk0apo0nirk5bglanopfjcpkv7bt;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.KUYypEB4eNWOZWVDpH)) {
            return this.KUYypEB4eNWOZWVDpH;
        }
        pOkR1d0eMyRVtgCj pokr1d0emyrvtgcj = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        return ((pokr1d0emyrvtgcj == null || !pokr1d0emyrvtgcj.f6ZQsR6bPLvvCDNXOUc) ? Button.class : CompoundButton.class).getName();
    }

    public int getAllowedWidthDecrease() {
        return this.SuB3hEmTmbbRGAhtvOOmfKEon;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (LaeGQIruHQu81hfJldjMOQSVblH3x()) {
            return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.M9e7PWhFYLD2lOGMker;
        }
        return 0;
    }

    public oWK0Apo0Nirk5BGlanOPFjcPKV7Bt getCornerSpringForce() {
        return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    public Drawable getIcon() {
        return this.HzCpKshMOoaw76hFcbOVRYMeRd;
    }

    public int getIconGravity() {
        return this.jW7EiD0YL6xkbB158jMUzhWNWb1y;
    }

    public int getIconPadding() {
        return this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    }

    public int getIconSize() {
        return this.q1wNbhk2O6;
    }

    public ColorStateList getIconTint() {
        return this.M9e7PWhFYLD2lOGMker;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.GI83zq0G8e7zkn;
    }

    public int getInsetBottom() {
        return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.GI83zq0G8e7zkn;
    }

    public int getInsetTop() {
        return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.NSjgqmGjEzuugn2SsG1mZFP;
    }

    public ColorStateList getRippleColor() {
        if (LaeGQIruHQu81hfJldjMOQSVblH3x()) {
            return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.Ca81ebIan1u;
        }
        return null;
    }

    public XdVIZOnOVHGi6uYUaae4zAI94b getShapeAppearanceModel() {
        if (LaeGQIruHQu81hfJldjMOQSVblH3x()) {
            return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.zzpBGItXfub0yWj;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public wL6lQKsoxy getStateListShapeAppearanceModel() {
        if (LaeGQIruHQu81hfJldjMOQSVblH3x()) {
            return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.V57tEvNfxZVVcOCAOih5PKr;
        }
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (LaeGQIruHQu81hfJldjMOQSVblH3x()) {
            return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.p59rPv72J9;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (LaeGQIruHQu81hfJldjMOQSVblH3x()) {
            return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.HzCpKshMOoaw76hFcbOVRYMeRd;
        }
        return 0;
    }

    @Override // com.vdodsodjsdt.wD5hsovXMBOyLQTFAC8
    public ColorStateList getSupportBackgroundTintList() {
        return LaeGQIruHQu81hfJldjMOQSVblH3x() ? this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.q1wNbhk2O6 : super.getSupportBackgroundTintList();
    }

    @Override // com.vdodsodjsdt.wD5hsovXMBOyLQTFAC8
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return LaeGQIruHQu81hfJldjMOQSVblH3x() ? this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.KUYypEB4eNWOZWVDpH : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.pYmKDYlAmhudp;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (LaeGQIruHQu81hfJldjMOQSVblH3x()) {
            FLWIoSaHb1q8TqFvEBgPyRGrzvi6.y1NaPKTl7R18DOr6e8i5(this, this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.VxUQ9tBhpHJ2AAEDNW8sghc4m(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        pOkR1d0eMyRVtgCj pokr1d0emyrvtgcj = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (pokr1d0emyrvtgcj != null && pokr1d0emyrvtgcj.f6ZQsR6bPLvvCDNXOUc) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, y1NaPKTl7R18DOr6e8i5);
        }
        if (this.pYmKDYlAmhudp) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, qygqjTppWwx992);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // com.vdodsodjsdt.wD5hsovXMBOyLQTFAC8, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.pYmKDYlAmhudp);
    }

    @Override // com.vdodsodjsdt.wD5hsovXMBOyLQTFAC8, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        pOkR1d0eMyRVtgCj pokr1d0emyrvtgcj = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        accessibilityNodeInfo.setCheckable(pokr1d0emyrvtgcj != null && pokr1d0emyrvtgcj.f6ZQsR6bPLvvCDNXOUc);
        accessibilityNodeInfo.setChecked(this.pYmKDYlAmhudp);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // com.vdodsodjsdt.wD5hsovXMBOyLQTFAC8, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        GI83zq0G8e7zkn(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.f6ZQsR6bPLvvCDNXOUc != i6) {
            this.f6ZQsR6bPLvvCDNXOUc = i6;
            this.vBGA6pPLqSMuYGvprl270j7 = -1.0f;
        }
        if (this.vBGA6pPLqSMuYGvprl270j7 == -1.0f) {
            this.vBGA6pPLqSMuYGvprl270j7 = getMeasuredWidth();
            if (this.q11o1hieEkZDhF1MGOZI26oZiDT == null && (getParent() instanceof J3HRkfL9jUEUuIxNO2AzRqM7) && ((J3HRkfL9jUEUuIxNO2AzRqM7) getParent()).getButtonSizeChange() != null) {
                this.q11o1hieEkZDhF1MGOZI26oZiDT = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.q11o1hieEkZDhF1MGOZI26oZiDT);
                layoutParams.width = (int) this.vBGA6pPLqSMuYGvprl270j7;
                setLayoutParams(layoutParams);
            }
        }
        boolean z2 = false;
        if (this.SuB3hEmTmbbRGAhtvOOmfKEon == -1) {
            if (this.HzCpKshMOoaw76hFcbOVRYMeRd == null) {
                i5 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.q1wNbhk2O6;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.HzCpKshMOoaw76hFcbOVRYMeRd.getIntrinsicWidth();
                }
                i5 = iconPadding + intrinsicWidth;
            }
            this.SuB3hEmTmbbRGAhtvOOmfKEon = (getMeasuredWidth() - getTextLayoutWidth()) - i5;
        }
        if (this.TaDO7ogis3aEiWEtq == -1) {
            this.TaDO7ogis3aEiWEtq = getPaddingStart();
        }
        if (this.Irh5auREsoeV1C1RaBamlmy == -1) {
            this.Irh5auREsoeV1C1RaBamlmy = getPaddingEnd();
        }
        if ((getParent() instanceof J3HRkfL9jUEUuIxNO2AzRqM7) && ((J3HRkfL9jUEUuIxNO2AzRqM7) getParent()).getOrientation() == 0) {
            z2 = true;
        }
        this.qNPQb1obP7 = z2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof JOx6bG7C3UqtU5xE9gpYRyQ3)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        JOx6bG7C3UqtU5xE9gpYRyQ3 jOx6bG7C3UqtU5xE9gpYRyQ3 = (JOx6bG7C3UqtU5xE9gpYRyQ3) parcelable;
        super.onRestoreInstanceState(jOx6bG7C3UqtU5xE9gpYRyQ3.V57tEvNfxZVVcOCAOih5PKr);
        setChecked(jOx6bG7C3UqtU5xE9gpYRyQ3.LaeGQIruHQu81hfJldjMOQSVblH3x);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        JOx6bG7C3UqtU5xE9gpYRyQ3 jOx6bG7C3UqtU5xE9gpYRyQ3 = new JOx6bG7C3UqtU5xE9gpYRyQ3(super.onSaveInstanceState());
        jOx6bG7C3UqtU5xE9gpYRyQ3.LaeGQIruHQu81hfJldjMOQSVblH3x = this.pYmKDYlAmhudp;
        return jOx6bG7C3UqtU5xE9gpYRyQ3;
    }

    @Override // com.vdodsodjsdt.wD5hsovXMBOyLQTFAC8, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        GI83zq0G8e7zkn(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isEnabled() && this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.vBGA6pPLqSMuYGvprl270j7) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.HzCpKshMOoaw76hFcbOVRYMeRd != null) {
            if (this.HzCpKshMOoaw76hFcbOVRYMeRd.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.KUYypEB4eNWOZWVDpH = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!LaeGQIruHQu81hfJldjMOQSVblH3x()) {
            super.setBackgroundColor(i);
            return;
        }
        pOkR1d0eMyRVtgCj pokr1d0emyrvtgcj = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (pokr1d0emyrvtgcj.VxUQ9tBhpHJ2AAEDNW8sghc4m(false) != null) {
            pokr1d0emyrvtgcj.VxUQ9tBhpHJ2AAEDNW8sghc4m(false).setTint(i);
        }
    }

    @Override // com.vdodsodjsdt.wD5hsovXMBOyLQTFAC8, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!LaeGQIruHQu81hfJldjMOQSVblH3x()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        pOkR1d0eMyRVtgCj pokr1d0emyrvtgcj = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        pokr1d0emyrvtgcj.ko09zE6UAgwkV = true;
        MaterialButton materialButton = pokr1d0emyrvtgcj.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        materialButton.setSupportBackgroundTintList(pokr1d0emyrvtgcj.q1wNbhk2O6);
        materialButton.setSupportBackgroundTintMode(pokr1d0emyrvtgcj.KUYypEB4eNWOZWVDpH);
        super.setBackgroundDrawable(drawable);
    }

    @Override // com.vdodsodjsdt.wD5hsovXMBOyLQTFAC8, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (LaeGQIruHQu81hfJldjMOQSVblH3x()) {
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.f6ZQsR6bPLvvCDNXOUc = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedInternal(z);
    }

    public void setCornerRadius(int i) {
        if (LaeGQIruHQu81hfJldjMOQSVblH3x()) {
            pOkR1d0eMyRVtgCj pokr1d0emyrvtgcj = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            if (pokr1d0emyrvtgcj.jW7EiD0YL6xkbB158jMUzhWNWb1y && pokr1d0emyrvtgcj.M9e7PWhFYLD2lOGMker == i) {
                return;
            }
            pokr1d0emyrvtgcj.M9e7PWhFYLD2lOGMker = i;
            pokr1d0emyrvtgcj.jW7EiD0YL6xkbB158jMUzhWNWb1y = true;
            float f = i;
            jFJXX88X4vgYX5CG85l5EyqW8AAH jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE = pokr1d0emyrvtgcj.zzpBGItXfub0yWj.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
            jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.LaeGQIruHQu81hfJldjMOQSVblH3x = new ZOzTbMJxsw(f);
            jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.zIvmSL0wzmmKGc3X39b2Gw2mUGE = new ZOzTbMJxsw(f);
            jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.ZLZeBXTMq0zDztBxtRTuCHrapQ = new ZOzTbMJxsw(f);
            jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.NSjgqmGjEzuugn2SsG1mZFP = new ZOzTbMJxsw(f);
            pokr1d0emyrvtgcj.zzpBGItXfub0yWj = jfjxx88x4vgyx5cg85l5eyqw8aahZIvmSL0wzmmKGc3X39b2Gw2mUGE.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            pokr1d0emyrvtgcj.V57tEvNfxZVVcOCAOih5PKr = null;
            pokr1d0emyrvtgcj.ZfQNn8hdWlEQ5cR94249PDsLR();
        }
    }

    public void setCornerRadiusResource(int i) {
        if (LaeGQIruHQu81hfJldjMOQSVblH3x()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(oWK0Apo0Nirk5BGlanOPFjcPKV7Bt owk0apo0nirk5bglanopfjcpkv7bt) {
        pOkR1d0eMyRVtgCj pokr1d0emyrvtgcj = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        pokr1d0emyrvtgcj.ZfQNn8hdWlEQ5cR94249PDsLR = owk0apo0nirk5bglanopfjcpkv7bt;
        if (pokr1d0emyrvtgcj.V57tEvNfxZVVcOCAOih5PKr != null) {
            pokr1d0emyrvtgcj.ZfQNn8hdWlEQ5cR94249PDsLR();
        }
    }

    public void setDisplayedWidthDecrease(int i) {
        this.O1xDAlBZZlZdoEf747lCFHld = Math.min(i, this.SuB3hEmTmbbRGAhtvOOmfKEon);
        M9e7PWhFYLD2lOGMker();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (LaeGQIruHQu81hfJldjMOQSVblH3x()) {
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.VxUQ9tBhpHJ2AAEDNW8sghc4m(false).q1wNbhk2O6(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.HzCpKshMOoaw76hFcbOVRYMeRd != drawable) {
            this.HzCpKshMOoaw76hFcbOVRYMeRd = drawable;
            NSjgqmGjEzuugn2SsG1mZFP(true);
            GI83zq0G8e7zkn(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.jW7EiD0YL6xkbB158jMUzhWNWb1y != i) {
            this.jW7EiD0YL6xkbB158jMUzhWNWb1y = i;
            GI83zq0G8e7zkn(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv != i) {
            this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.q1wNbhk2O6 != i) {
            this.q1wNbhk2O6 = i;
            NSjgqmGjEzuugn2SsG1mZFP(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.M9e7PWhFYLD2lOGMker != colorStateList) {
            this.M9e7PWhFYLD2lOGMker = colorStateList;
            NSjgqmGjEzuugn2SsG1mZFP(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.GI83zq0G8e7zkn != mode) {
            this.GI83zq0G8e7zkn = mode;
            NSjgqmGjEzuugn2SsG1mZFP(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(zonOxHotd3BwAPJcwqr6I6uQNngg4.TaDO7ogis3aEiWEtq(getContext(), i));
    }

    public void setInsetBottom(int i) {
        pOkR1d0eMyRVtgCj pokr1d0emyrvtgcj = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        pokr1d0emyrvtgcj.zzpBGItXfub0yWj(pokr1d0emyrvtgcj.NSjgqmGjEzuugn2SsG1mZFP, i);
    }

    public void setInsetTop(int i) {
        pOkR1d0eMyRVtgCj pokr1d0emyrvtgcj = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        pokr1d0emyrvtgcj.zzpBGItXfub0yWj(i, pokr1d0emyrvtgcj.GI83zq0G8e7zkn);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(vYf7o92FnfpRxGBt1Szs vyf7o92fnfprxgbt1szs) {
        this.NSjgqmGjEzuugn2SsG1mZFP = vyf7o92fnfprxgbt1szs;
    }

    public void setOpticalCenterEnabled(boolean z) {
        if (this.w0Wu95l8dVNw5rZMRu != z) {
            this.w0Wu95l8dVNw5rZMRu = z;
            pOkR1d0eMyRVtgCj pokr1d0emyrvtgcj = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            if (z) {
                Jc01di1Hsv jc01di1Hsv = new Jc01di1Hsv(4, this);
                pokr1d0emyrvtgcj.LaeGQIruHQu81hfJldjMOQSVblH3x = jc01di1Hsv;
                EQz8nVyVxmIrHN6fNCQWutFG0b30O eQz8nVyVxmIrHN6fNCQWutFG0b30OVxUQ9tBhpHJ2AAEDNW8sghc4m = pokr1d0emyrvtgcj.VxUQ9tBhpHJ2AAEDNW8sghc4m(false);
                if (eQz8nVyVxmIrHN6fNCQWutFG0b30OVxUQ9tBhpHJ2AAEDNW8sghc4m != null) {
                    eQz8nVyVxmIrHN6fNCQWutFG0b30OVxUQ9tBhpHJ2AAEDNW8sghc4m.O1xDAlBZZlZdoEf747lCFHld = jc01di1Hsv;
                }
            } else {
                pokr1d0emyrvtgcj.LaeGQIruHQu81hfJldjMOQSVblH3x = null;
                EQz8nVyVxmIrHN6fNCQWutFG0b30O eQz8nVyVxmIrHN6fNCQWutFG0b30OVxUQ9tBhpHJ2AAEDNW8sghc4m2 = pokr1d0emyrvtgcj.VxUQ9tBhpHJ2AAEDNW8sghc4m(false);
                if (eQz8nVyVxmIrHN6fNCQWutFG0b30OVxUQ9tBhpHJ2AAEDNW8sghc4m2 != null) {
                    eQz8nVyVxmIrHN6fNCQWutFG0b30OVxUQ9tBhpHJ2AAEDNW8sghc4m2.O1xDAlBZZlZdoEf747lCFHld = null;
                }
            }
            post(new lUqBmUbL53IL3VMM8GT8(9, this));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        vYf7o92FnfpRxGBt1Szs vyf7o92fnfprxgbt1szs = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (vyf7o92fnfprxgbt1szs != null) {
            ((MaterialButtonToggleGroup) ((Skgk8FYn8b4TvRiBOsElZw4XkNLhQ) vyf7o92fnfprxgbt1szs).ZfQNn8hdWlEQ5cR94249PDsLR).invalidate();
        }
        super.setPressed(z);
        zIvmSL0wzmmKGc3X39b2Gw2mUGE(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (LaeGQIruHQu81hfJldjMOQSVblH3x()) {
            pOkR1d0eMyRVtgCj pokr1d0emyrvtgcj = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            MaterialButton materialButton = pokr1d0emyrvtgcj.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (pokr1d0emyrvtgcj.Ca81ebIan1u != colorStateList) {
                pokr1d0emyrvtgcj.Ca81ebIan1u = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(kuNd5HLEtGyow6v2XZnS.VxUQ9tBhpHJ2AAEDNW8sghc4m(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (LaeGQIruHQu81hfJldjMOQSVblH3x()) {
            setRippleColor(zonOxHotd3BwAPJcwqr6I6uQNngg4.TaDO7ogis3aEiWEtq(getContext(), i));
        }
    }

    @Override // com.vdodsodjsdt.dqrRplqyPGe
    public void setShapeAppearanceModel(XdVIZOnOVHGi6uYUaae4zAI94b xdVIZOnOVHGi6uYUaae4zAI94b) {
        if (!LaeGQIruHQu81hfJldjMOQSVblH3x()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        pOkR1d0eMyRVtgCj pokr1d0emyrvtgcj = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        pokr1d0emyrvtgcj.zzpBGItXfub0yWj = xdVIZOnOVHGi6uYUaae4zAI94b;
        pokr1d0emyrvtgcj.V57tEvNfxZVVcOCAOih5PKr = null;
        pokr1d0emyrvtgcj.ZfQNn8hdWlEQ5cR94249PDsLR();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (LaeGQIruHQu81hfJldjMOQSVblH3x()) {
            pOkR1d0eMyRVtgCj pokr1d0emyrvtgcj = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            pokr1d0emyrvtgcj.pYmKDYlAmhudp = z;
            pokr1d0emyrvtgcj.LaeGQIruHQu81hfJldjMOQSVblH3x();
        }
    }

    public void setSizeChange(XzG3TQCrw9CYO6IfOT7jYKxnGPWU xzG3TQCrw9CYO6IfOT7jYKxnGPWU) {
        if (this.pzqP2AqKW6J5PO8zCKnW != xzG3TQCrw9CYO6IfOT7jYKxnGPWU) {
            this.pzqP2AqKW6J5PO8zCKnW = xzG3TQCrw9CYO6IfOT7jYKxnGPWU;
            zIvmSL0wzmmKGc3X39b2Gw2mUGE(true);
        }
    }

    public void setStateListShapeAppearanceModel(wL6lQKsoxy wl6lqksoxy) {
        if (!LaeGQIruHQu81hfJldjMOQSVblH3x()) {
            throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        pOkR1d0eMyRVtgCj pokr1d0emyrvtgcj = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (pokr1d0emyrvtgcj.ZfQNn8hdWlEQ5cR94249PDsLR == null && wl6lqksoxy.ZfQNn8hdWlEQ5cR94249PDsLR()) {
            pokr1d0emyrvtgcj.ZfQNn8hdWlEQ5cR94249PDsLR = ZfQNn8hdWlEQ5cR94249PDsLR();
            if (pokr1d0emyrvtgcj.V57tEvNfxZVVcOCAOih5PKr != null) {
                pokr1d0emyrvtgcj.ZfQNn8hdWlEQ5cR94249PDsLR();
            }
        }
        pokr1d0emyrvtgcj.V57tEvNfxZVVcOCAOih5PKr = wl6lqksoxy;
        pokr1d0emyrvtgcj.ZfQNn8hdWlEQ5cR94249PDsLR();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (LaeGQIruHQu81hfJldjMOQSVblH3x()) {
            pOkR1d0eMyRVtgCj pokr1d0emyrvtgcj = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            if (pokr1d0emyrvtgcj.p59rPv72J9 != colorStateList) {
                pokr1d0emyrvtgcj.p59rPv72J9 = colorStateList;
                pokr1d0emyrvtgcj.LaeGQIruHQu81hfJldjMOQSVblH3x();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (LaeGQIruHQu81hfJldjMOQSVblH3x()) {
            setStrokeColor(zonOxHotd3BwAPJcwqr6I6uQNngg4.TaDO7ogis3aEiWEtq(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (LaeGQIruHQu81hfJldjMOQSVblH3x()) {
            pOkR1d0eMyRVtgCj pokr1d0emyrvtgcj = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            if (pokr1d0emyrvtgcj.HzCpKshMOoaw76hFcbOVRYMeRd != i) {
                pokr1d0emyrvtgcj.HzCpKshMOoaw76hFcbOVRYMeRd = i;
                pokr1d0emyrvtgcj.LaeGQIruHQu81hfJldjMOQSVblH3x();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (LaeGQIruHQu81hfJldjMOQSVblH3x()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // com.vdodsodjsdt.wD5hsovXMBOyLQTFAC8
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!LaeGQIruHQu81hfJldjMOQSVblH3x()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        pOkR1d0eMyRVtgCj pokr1d0emyrvtgcj = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (pokr1d0emyrvtgcj.q1wNbhk2O6 != colorStateList) {
            pokr1d0emyrvtgcj.q1wNbhk2O6 = colorStateList;
            if (pokr1d0emyrvtgcj.VxUQ9tBhpHJ2AAEDNW8sghc4m(false) != null) {
                pokr1d0emyrvtgcj.VxUQ9tBhpHJ2AAEDNW8sghc4m(false).setTintList(pokr1d0emyrvtgcj.q1wNbhk2O6);
            }
        }
    }

    @Override // com.vdodsodjsdt.wD5hsovXMBOyLQTFAC8
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!LaeGQIruHQu81hfJldjMOQSVblH3x()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        pOkR1d0eMyRVtgCj pokr1d0emyrvtgcj = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (pokr1d0emyrvtgcj.KUYypEB4eNWOZWVDpH != mode) {
            pokr1d0emyrvtgcj.KUYypEB4eNWOZWVDpH = mode;
            if (pokr1d0emyrvtgcj.VxUQ9tBhpHJ2AAEDNW8sghc4m(false) == null || pokr1d0emyrvtgcj.KUYypEB4eNWOZWVDpH == null) {
                return;
            }
            pokr1d0emyrvtgcj.VxUQ9tBhpHJ2AAEDNW8sghc4m(false).setTintMode(pokr1d0emyrvtgcj.KUYypEB4eNWOZWVDpH);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        GI83zq0G8e7zkn(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.vBGA6pPLqSMuYGvprl270j7 = z;
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.vBGA6pPLqSMuYGvprl270j7 = -1.0f;
        super.setWidth(i);
    }

    public void setWidthChangeMax(int i) {
        if (this.aXO0LSrt8bKV != i) {
            this.aXO0LSrt8bKV = i;
            zIvmSL0wzmmKGc3X39b2Gw2mUGE(true);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.pYmKDYlAmhudp);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zIvmSL0wzmmKGc3X39b2Gw2mUGE(boolean r9) {
        /*
            r8 = this;
            com.vdodsodjsdt.XzG3TQCrw9CYO6IfOT7jYKxnGPWU r0 = r8.pzqP2AqKW6J5PO8zCKnW
            if (r0 != 0) goto L6
            goto L85
        L6:
            com.vdodsodjsdt.GN4aJILnYJzlN5Sb r0 = r8.HVEwbdULInpTNa0IG
            if (r0 != 0) goto L19
            com.vdodsodjsdt.GN4aJILnYJzlN5Sb r0 = new com.vdodsodjsdt.GN4aJILnYJzlN5Sb
            com.vdodsodjsdt.u6wcQ2BsAnoRsKA9W8eoE r1 = com.google.android.material.button.MaterialButton.iKANjmyTSxO6v6UuLPdu7DxOjlS
            r0.<init>(r8, r1)
            r8.HVEwbdULInpTNa0IG = r0
            com.vdodsodjsdt.oWK0Apo0Nirk5BGlanOPFjcPKV7Bt r1 = r8.ZfQNn8hdWlEQ5cR94249PDsLR()
            r0.M9e7PWhFYLD2lOGMker = r1
        L19:
            boolean r0 = r8.qNPQb1obP7
            if (r0 == 0) goto L85
            int r0 = r8.aXO0LSrt8bKV
            com.vdodsodjsdt.XzG3TQCrw9CYO6IfOT7jYKxnGPWU r1 = r8.pzqP2AqKW6J5PO8zCKnW
            int[] r2 = r8.getDrawableState()
            int[][] r3 = r1.V57tEvNfxZVVcOCAOih5PKr
            r4 = 0
            r5 = r4
        L29:
            int r6 = r1.VxUQ9tBhpHJ2AAEDNW8sghc4m
            r7 = -1
            if (r5 >= r6) goto L3a
            r6 = r3[r5]
            boolean r6 = android.util.StateSet.stateSetMatches(r6, r2)
            if (r6 == 0) goto L37
            goto L3b
        L37:
            int r5 = r5 + 1
            goto L29
        L3a:
            r5 = r7
        L3b:
            if (r5 >= 0) goto L54
            int[] r2 = android.util.StateSet.WILD_CARD
            int[][] r3 = r1.V57tEvNfxZVVcOCAOih5PKr
            r5 = r4
        L42:
            int r6 = r1.VxUQ9tBhpHJ2AAEDNW8sghc4m
            if (r5 >= r6) goto L53
            r6 = r3[r5]
            boolean r6 = android.util.StateSet.stateSetMatches(r6, r2)
            if (r6 == 0) goto L50
            r7 = r5
            goto L53
        L50:
            int r5 = r5 + 1
            goto L42
        L53:
            r5 = r7
        L54:
            if (r5 >= 0) goto L59
            com.vdodsodjsdt.qF22Y620JkFyombtDYw0h0h8Rxpja r1 = r1.zzpBGItXfub0yWj
            goto L5d
        L59:
            com.vdodsodjsdt.qF22Y620JkFyombtDYw0h0h8Rxpja[] r1 = r1.ZfQNn8hdWlEQ5cR94249PDsLR
            r1 = r1[r5]
        L5d:
            java.lang.Object r1 = r1.V57tEvNfxZVVcOCAOih5PKr
            com.vdodsodjsdt.YA9VQr52hzmd r1 = (com.vdodsodjsdt.YA9VQr52hzmd) r1
            int r2 = r8.getWidth()
            float r3 = r1.zzpBGItXfub0yWj
            int r1 = r1.VxUQ9tBhpHJ2AAEDNW8sghc4m
            r5 = 1
            if (r1 != r5) goto L70
            float r1 = (float) r2
            float r3 = r3 * r1
        L6e:
            int r4 = (int) r3
            goto L74
        L70:
            r2 = 2
            if (r1 != r2) goto L74
            goto L6e
        L74:
            int r0 = java.lang.Math.min(r0, r4)
            com.vdodsodjsdt.GN4aJILnYJzlN5Sb r1 = r8.HVEwbdULInpTNa0IG
            float r0 = (float) r0
            r1.VxUQ9tBhpHJ2AAEDNW8sghc4m(r0)
            if (r9 == 0) goto L85
            com.vdodsodjsdt.GN4aJILnYJzlN5Sb r9 = r8.HVEwbdULInpTNa0IG
            r9.ZfQNn8hdWlEQ5cR94249PDsLR()
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.zIvmSL0wzmmKGc3X39b2Gw2mUGE(boolean):void");
    }
}
