package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ABqn6mjor9ZOTvWaSXrN extends FrameLayout {
    public static final kvMrspKo0RKu3yJ9iso15r3eO9i5L HzCpKshMOoaw76hFcbOVRYMeRd = new kvMrspKo0RKu3yJ9iso15r3eO9i5L();
    public ColorStateList GI83zq0G8e7zkn;
    public final float LaeGQIruHQu81hfJldjMOQSVblH3x;
    public PorterDuff.Mode M9e7PWhFYLD2lOGMker;
    public final int NSjgqmGjEzuugn2SsG1mZFP;
    public final XdVIZOnOVHGi6uYUaae4zAI94b V57tEvNfxZVVcOCAOih5PKr;
    public final int ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public int ZfQNn8hdWlEQ5cR94249PDsLR;
    public final float zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public ABqn6mjor9ZOTvWaSXrN(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(sGipz63rTUmSj3uFDvOtzihao.bjhcQ0u7VT2OYYrwk96HrWoN(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, PGobtLpyfPC4TCnlq740.qNPQb1obP7);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.V57tEvNfxZVVcOCAOih5PKr = XdVIZOnOVHGi6uYUaae4zAI94b.zzpBGItXfub0yWj(context2, attributeSet, 0, 0).VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(F44whnLsbQ.vBGA6pPLqSMuYGvprl270j7(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(KfeOQNOupsCg6878zi4e.d9zDyyznnp3oaDT1Ug(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.NSjgqmGjEzuugn2SsG1mZFP = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(HzCpKshMOoaw76hFcbOVRYMeRd);
        setFocusable(true);
        if (getBackground() == null) {
            int iIKANjmyTSxO6v6UuLPdu7DxOjlS = zonOxHotd3BwAPJcwqr6I6uQNngg4.iKANjmyTSxO6v6UuLPdu7DxOjlS(zonOxHotd3BwAPJcwqr6I6uQNngg4.vBGA6pPLqSMuYGvprl270j7(this, R.attr.colorSurface), zonOxHotd3BwAPJcwqr6I6uQNngg4.vBGA6pPLqSMuYGvprl270j7(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha());
            XdVIZOnOVHGi6uYUaae4zAI94b xdVIZOnOVHGi6uYUaae4zAI94b = this.V57tEvNfxZVVcOCAOih5PKr;
            if (xdVIZOnOVHGi6uYUaae4zAI94b != null) {
                int i = XS1Hazr6pC.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                EQz8nVyVxmIrHN6fNCQWutFG0b30O eQz8nVyVxmIrHN6fNCQWutFG0b30O = new EQz8nVyVxmIrHN6fNCQWutFG0b30O(xdVIZOnOVHGi6uYUaae4zAI94b);
                eQz8nVyVxmIrHN6fNCQWutFG0b30O.p59rPv72J9(ColorStateList.valueOf(iIKANjmyTSxO6v6UuLPdu7DxOjlS));
                drawable = eQz8nVyVxmIrHN6fNCQWutFG0b30O;
            } else {
                Resources resources = getResources();
                int i2 = XS1Hazr6pC.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(iIKANjmyTSxO6v6UuLPdu7DxOjlS);
                drawable = gradientDrawable;
            }
            ColorStateList colorStateList = this.GI83zq0G8e7zkn;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
            setBackground(drawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    }

    public int getAnimationMode() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    public int getMaxInlineActionWidth() {
        return this.NSjgqmGjEzuugn2SsG1mZFP;
    }

    public int getMaxWidth() {
        return this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public void setAnimationMode(int i) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.GI83zq0G8e7zkn != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.GI83zq0G8e7zkn);
            drawable.setTintMode(this.M9e7PWhFYLD2lOGMker);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.GI83zq0G8e7zkn = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.M9e7PWhFYLD2lOGMker);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.M9e7PWhFYLD2lOGMker = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintMode(mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : HzCpKshMOoaw76hFcbOVRYMeRd);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(XS1Hazr6pC xS1Hazr6pC) {
    }
}
