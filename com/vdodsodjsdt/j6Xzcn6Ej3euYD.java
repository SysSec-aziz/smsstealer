package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j6Xzcn6Ej3euYD extends ViewGroup {
    public int Ca81ebIan1u;
    public float GI83zq0G8e7zkn;
    public int[] HzCpKshMOoaw76hFcbOVRYMeRd;
    public int[] KUYypEB4eNWOZWVDpH;
    public int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public boolean M9e7PWhFYLD2lOGMker;
    public int NSjgqmGjEzuugn2SsG1mZFP;
    public boolean V57tEvNfxZVVcOCAOih5PKr;
    public int ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public int ZfQNn8hdWlEQ5cR94249PDsLR;
    public int h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public int p59rPv72J9;
    public int pYmKDYlAmhudp;
    public Drawable q1wNbhk2O6;
    public int zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public j6Xzcn6Ej3euYD(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.V57tEvNfxZVVcOCAOih5PKr = true;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = -1;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = 0;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = 8388659;
        int[] iArr = AuEvIFo0QoYm1PHNG.p59rPv72J9;
        NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7 = NrjuzzioPqfttNRptBDpZDzSYUrcM.qNPQb1obP7(context, attributeSet, iArr, 0);
        xb0r6yEzq0tw9m7nTWG5BFR8.KUYypEB4eNWOZWVDpH(this, context, iArr, attributeSet, (TypedArray) nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.V57tEvNfxZVVcOCAOih5PKr, 0);
        TypedArray typedArray = (TypedArray) nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.V57tEvNfxZVVcOCAOih5PKr;
        int i2 = typedArray.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = typedArray.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = typedArray.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.GI83zq0G8e7zkn = typedArray.getFloat(4, -1.0f);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = typedArray.getInt(3, -1);
        this.M9e7PWhFYLD2lOGMker = typedArray.getBoolean(7, false);
        setDividerDrawable(nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.pYmKDYlAmhudp(5));
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = typedArray.getInt(8, 0);
        this.pYmKDYlAmhudp = typedArray.getDimensionPixelSize(6, 0);
        nrjuzzioPqfttNRptBDpZDzSYUrcMQNPQb1obP7.aXO0LSrt8bKV();
    }

    public final boolean GI83zq0G8e7zkn(int i) {
        if (i == 0) {
            return (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv & 4) != 0;
        }
        if ((this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv & 2) != 0) {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void LaeGQIruHQu81hfJldjMOQSVblH3x(Canvas canvas, int i) {
        this.q1wNbhk2O6.setBounds(i, getPaddingTop() + this.pYmKDYlAmhudp, this.p59rPv72J9 + i, (getHeight() - getPaddingBottom()) - this.pYmKDYlAmhudp);
        this.q1wNbhk2O6.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: NSjgqmGjEzuugn2SsG1mZFP, reason: merged with bridge method [inline-methods] */
    public XbRgnR5SqPXup9z60vLrMOg generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof XbRgnR5SqPXup9z60vLrMOg ? new XbRgnR5SqPXup9z60vLrMOg((XbRgnR5SqPXup9z60vLrMOg) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new XbRgnR5SqPXup9z60vLrMOg((ViewGroup.MarginLayoutParams) layoutParams) : new XbRgnR5SqPXup9z60vLrMOg(layoutParams);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: ZLZeBXTMq0zDztBxtRTuCHrapQ, reason: merged with bridge method [inline-methods] */
    public XbRgnR5SqPXup9z60vLrMOg generateLayoutParams(AttributeSet attributeSet) {
        return new XbRgnR5SqPXup9z60vLrMOg(getContext(), attributeSet);
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR(Canvas canvas, int i) {
        this.q1wNbhk2O6.setBounds(getPaddingLeft() + this.pYmKDYlAmhudp, i, (getWidth() - getPaddingRight()) - this.pYmKDYlAmhudp, this.Ca81ebIan1u + i);
        this.q1wNbhk2O6.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof XbRgnR5SqPXup9z60vLrMOg;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.ZfQNn8hdWlEQ5cR94249PDsLR == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE == 1 && (i = this.ZLZeBXTMq0zDztBxtRTuCHrapQ & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.NSjgqmGjEzuugn2SsG1mZFP) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.NSjgqmGjEzuugn2SsG1mZFP;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((XbRgnR5SqPXup9z60vLrMOg) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    public Drawable getDividerDrawable() {
        return this.q1wNbhk2O6;
    }

    public int getDividerPadding() {
        return this.pYmKDYlAmhudp;
    }

    public int getDividerWidth() {
        return this.p59rPv72J9;
    }

    public int getGravity() {
        return this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
    }

    public int getOrientation() {
        return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    }

    public int getShowDividers() {
        return this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.GI83zq0G8e7zkn;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        if (this.q1wNbhk2O6 == null) {
            return;
        }
        int i2 = 0;
        if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && GI83zq0G8e7zkn(i2)) {
                    ZfQNn8hdWlEQ5cR94249PDsLR(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((XbRgnR5SqPXup9z60vLrMOg) childAt.getLayoutParams())).topMargin) - this.Ca81ebIan1u);
                }
                i2++;
            }
            if (GI83zq0G8e7zkn(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                ZfQNn8hdWlEQ5cR94249PDsLR(canvas, childAt2 == null ? (getHeight() - getPaddingBottom()) - this.Ca81ebIan1u : childAt2.getBottom() + ((LinearLayout.LayoutParams) ((XbRgnR5SqPXup9z60vLrMOg) childAt2.getLayoutParams())).bottomMargin);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean z = TbV4rkOPds9wwfLx.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        boolean z2 = getLayoutDirection() == 1;
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && GI83zq0G8e7zkn(i2)) {
                XbRgnR5SqPXup9z60vLrMOg xbRgnR5SqPXup9z60vLrMOg = (XbRgnR5SqPXup9z60vLrMOg) childAt3.getLayoutParams();
                LaeGQIruHQu81hfJldjMOQSVblH3x(canvas, z2 ? childAt3.getRight() + ((LinearLayout.LayoutParams) xbRgnR5SqPXup9z60vLrMOg).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) xbRgnR5SqPXup9z60vLrMOg).leftMargin) - this.p59rPv72J9);
            }
            i2++;
        }
        if (GI83zq0G8e7zkn(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                XbRgnR5SqPXup9z60vLrMOg xbRgnR5SqPXup9z60vLrMOg2 = (XbRgnR5SqPXup9z60vLrMOg) childAt4.getLayoutParams();
                if (z2) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) xbRgnR5SqPXup9z60vLrMOg2).leftMargin;
                    i = this.p59rPv72J9;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) xbRgnR5SqPXup9z60vLrMOg2).rightMargin;
                }
            } else if (z2) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.p59rPv72J9;
                right = left - i;
            }
            LaeGQIruHQu81hfJldjMOQSVblH3x(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a9  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r23, int r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.j6Xzcn6Ej3euYD.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0148  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instruction units count: 2150
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.j6Xzcn6Ej3euYD.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.V57tEvNfxZVVcOCAOih5PKr = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.ZfQNn8hdWlEQ5cR94249PDsLR = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.q1wNbhk2O6) {
            return;
        }
        this.q1wNbhk2O6 = drawable;
        if (drawable != null) {
            this.p59rPv72J9 = drawable.getIntrinsicWidth();
            this.Ca81ebIan1u = drawable.getIntrinsicHeight();
        } else {
            this.p59rPv72J9 = 0;
            this.Ca81ebIan1u = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.pYmKDYlAmhudp = i;
    }

    public void setGravity(int i) {
        if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if ((8388615 & i3) != i2) {
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.M9e7PWhFYLD2lOGMker = z;
    }

    public void setOrientation(int i) {
        if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE != i) {
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv) {
            requestLayout();
        }
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if ((i3 & 112) != i2) {
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.GI83zq0G8e7zkn = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: zIvmSL0wzmmKGc3X39b2Gw2mUGE, reason: merged with bridge method [inline-methods] */
    public XbRgnR5SqPXup9z60vLrMOg generateDefaultLayoutParams() {
        int i = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (i == 0) {
            return new XbRgnR5SqPXup9z60vLrMOg(-2, -2);
        }
        if (i == 1) {
            return new XbRgnR5SqPXup9z60vLrMOg(-1, -2);
        }
        return null;
    }
}
