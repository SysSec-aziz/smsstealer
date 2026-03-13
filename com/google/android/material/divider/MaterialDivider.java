package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.vdodsodjsdt.EQz8nVyVxmIrHN6fNCQWutFG0b30O;
import com.vdodsodjsdt.F44whnLsbQ;
import com.vdodsodjsdt.FLWIoSaHb1q8TqFvEBgPyRGrzvi6;
import com.vdodsodjsdt.PGobtLpyfPC4TCnlq740;
import com.vdodsodjsdt.R;
import com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialDivider extends View {
    public int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final EQz8nVyVxmIrHN6fNCQWutFG0b30O V57tEvNfxZVVcOCAOih5PKr;
    public int ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public int ZfQNn8hdWlEQ5cR94249PDsLR;
    public int zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        super(sGipz63rTUmSj3uFDvOtzihao.bjhcQ0u7VT2OYYrwk96HrWoN(context, attributeSet, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider), attributeSet, R.attr.materialDividerStyle);
        Context context2 = getContext();
        this.V57tEvNfxZVVcOCAOih5PKr = new EQz8nVyVxmIrHN6fNCQWutFG0b30O();
        TypedArray typedArrayVE4yDIjexsP2lGjLaTcB = FLWIoSaHb1q8TqFvEBgPyRGrzvi6.vE4yDIjexsP2lGjLaTcB(context2, attributeSet, PGobtLpyfPC4TCnlq740.h3jnZRsdwYJfY9UhQCkbvWciwvFHv, R.attr.materialDividerStyle, R.style.Widget_MaterialComponents_MaterialDivider, new int[0]);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = typedArrayVE4yDIjexsP2lGjLaTcB.getDimensionPixelSize(3, getResources().getDimensionPixelSize(R.dimen.material_divider_thickness));
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = typedArrayVE4yDIjexsP2lGjLaTcB.getDimensionPixelOffset(2, 0);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = typedArrayVE4yDIjexsP2lGjLaTcB.getDimensionPixelOffset(1, 0);
        setDividerColor(F44whnLsbQ.vBGA6pPLqSMuYGvprl270j7(context2, typedArrayVE4yDIjexsP2lGjLaTcB, 0).getDefaultColor());
        typedArrayVE4yDIjexsP2lGjLaTcB.recycle();
    }

    public int getDividerColor() {
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    public int getDividerInsetEnd() {
        return this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
    }

    public int getDividerInsetStart() {
        return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    }

    public int getDividerThickness() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        int i;
        super.onDraw(canvas);
        boolean z = getLayoutDirection() == 1;
        int i2 = z ? this.ZLZeBXTMq0zDztBxtRTuCHrapQ : this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (z) {
            width = getWidth();
            i = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        } else {
            width = getWidth();
            i = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        }
        int i3 = width - i;
        int bottom = getBottom() - getTop();
        EQz8nVyVxmIrHN6fNCQWutFG0b30O eQz8nVyVxmIrHN6fNCQWutFG0b30O = this.V57tEvNfxZVVcOCAOih5PKr;
        eQz8nVyVxmIrHN6fNCQWutFG0b30O.setBounds(i2, 0, i3, bottom);
        eQz8nVyVxmIrHN6fNCQWutFG0b30O.draw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i) {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x != i) {
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = i;
            this.V57tEvNfxZVVcOCAOih5PKr.p59rPv72J9(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(int i) {
        setDividerColor(getContext().getColor(i));
    }

    public void setDividerInsetEnd(int i) {
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = i;
    }

    public void setDividerInsetEndResource(int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetStart(int i) {
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i;
    }

    public void setDividerInsetStartResource(int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerThickness(int i) {
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR != i) {
            this.ZfQNn8hdWlEQ5cR94249PDsLR = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }
}
