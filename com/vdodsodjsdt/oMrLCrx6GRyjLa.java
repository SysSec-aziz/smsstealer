package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class oMrLCrx6GRyjLa extends Spinner {
    public static final int[] HzCpKshMOoaw76hFcbOVRYMeRd = {android.R.attr.spinnerMode};
    public int GI83zq0G8e7zkn;
    public final Lf9vE78XlhUO8JzN0DMmLNh9q3 LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final Rect M9e7PWhFYLD2lOGMker;
    public final ILENsxnuzPXnxt NSjgqmGjEzuugn2SsG1mZFP;
    public final bLyH8EmzTL4BGbNNd4 V57tEvNfxZVVcOCAOih5PKr;
    public final boolean ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final Context ZfQNn8hdWlEQ5cR94249PDsLR;
    public SpinnerAdapter zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public oMrLCrx6GRyjLa(android.content.Context r13, android.util.AttributeSet r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.oMrLCrx6GRyjLa.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.M9e7PWhFYLD2lOGMker;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        bLyH8EmzTL4BGbNNd4 blyh8emztl4bgbnnd4 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (blyh8emztl4bgbnnd4 != null) {
            blyh8emztl4bgbnnd4.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        ILENsxnuzPXnxt iLENsxnuzPXnxt = this.NSjgqmGjEzuugn2SsG1mZFP;
        return iLENsxnuzPXnxt != null ? iLENsxnuzPXnxt.zzpBGItXfub0yWj() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        ILENsxnuzPXnxt iLENsxnuzPXnxt = this.NSjgqmGjEzuugn2SsG1mZFP;
        return iLENsxnuzPXnxt != null ? iLENsxnuzPXnxt.p59rPv72J9() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.NSjgqmGjEzuugn2SsG1mZFP != null ? this.GI83zq0G8e7zkn : super.getDropDownWidth();
    }

    public final ILENsxnuzPXnxt getInternalPopup() {
        return this.NSjgqmGjEzuugn2SsG1mZFP;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        ILENsxnuzPXnxt iLENsxnuzPXnxt = this.NSjgqmGjEzuugn2SsG1mZFP;
        return iLENsxnuzPXnxt != null ? iLENsxnuzPXnxt.V57tEvNfxZVVcOCAOih5PKr() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        ILENsxnuzPXnxt iLENsxnuzPXnxt = this.NSjgqmGjEzuugn2SsG1mZFP;
        return iLENsxnuzPXnxt != null ? iLENsxnuzPXnxt.Ca81ebIan1u() : super.getPrompt();
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

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ILENsxnuzPXnxt iLENsxnuzPXnxt = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (iLENsxnuzPXnxt == null || !iLENsxnuzPXnxt.VxUQ9tBhpHJ2AAEDNW8sghc4m()) {
            return;
        }
        iLENsxnuzPXnxt.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.NSjgqmGjEzuugn2SsG1mZFP == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), VxUQ9tBhpHJ2AAEDNW8sghc4m(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        cywoFvgcZuf86cVAUP8GYUZAvlww cywofvgczuf86cvaup8gyuzavlww = (cywoFvgcZuf86cVAUP8GYUZAvlww) parcelable;
        super.onRestoreInstanceState(cywofvgczuf86cvaup8gyuzavlww.getSuperState());
        if (!cywofvgczuf86cvaup8gyuzavlww.V57tEvNfxZVVcOCAOih5PKr || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new oKfueTVJIz3(0, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        cywoFvgcZuf86cVAUP8GYUZAvlww cywofvgczuf86cvaup8gyuzavlww = new cywoFvgcZuf86cVAUP8GYUZAvlww(super.onSaveInstanceState());
        ILENsxnuzPXnxt iLENsxnuzPXnxt = this.NSjgqmGjEzuugn2SsG1mZFP;
        cywofvgczuf86cvaup8gyuzavlww.V57tEvNfxZVVcOCAOih5PKr = iLENsxnuzPXnxt != null && iLENsxnuzPXnxt.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        return cywofvgczuf86cvaup8gyuzavlww;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Lf9vE78XlhUO8JzN0DMmLNh9q3 lf9vE78XlhUO8JzN0DMmLNh9q3 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (lf9vE78XlhUO8JzN0DMmLNh9q3 == null || !lf9vE78XlhUO8JzN0DMmLNh9q3.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        ILENsxnuzPXnxt iLENsxnuzPXnxt = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (iLENsxnuzPXnxt == null) {
            return super.performClick();
        }
        if (iLENsxnuzPXnxt.VxUQ9tBhpHJ2AAEDNW8sghc4m()) {
            return true;
        }
        iLENsxnuzPXnxt.q1wNbhk2O6(getTextDirection(), getTextAlignment());
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

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        ILENsxnuzPXnxt iLENsxnuzPXnxt = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (iLENsxnuzPXnxt == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            iLENsxnuzPXnxt.HzCpKshMOoaw76hFcbOVRYMeRd(i);
            iLENsxnuzPXnxt.KUYypEB4eNWOZWVDpH(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        ILENsxnuzPXnxt iLENsxnuzPXnxt = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (iLENsxnuzPXnxt != null) {
            iLENsxnuzPXnxt.M9e7PWhFYLD2lOGMker(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.NSjgqmGjEzuugn2SsG1mZFP != null) {
            this.GI83zq0G8e7zkn = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        ILENsxnuzPXnxt iLENsxnuzPXnxt = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (iLENsxnuzPXnxt != null) {
            iLENsxnuzPXnxt.GI83zq0G8e7zkn(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        ILENsxnuzPXnxt iLENsxnuzPXnxt = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (iLENsxnuzPXnxt != null) {
            iLENsxnuzPXnxt.zIvmSL0wzmmKGc3X39b2Gw2mUGE(charSequence);
        } else {
            super.setPrompt(charSequence);
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

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        ILENsxnuzPXnxt iLENsxnuzPXnxt = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (iLENsxnuzPXnxt != null) {
            Context context = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            vIZaErdPxA2eRQPhj vizaerdpxa2erqphj = new vIZaErdPxA2eRQPhj();
            vizaerdpxa2erqphj.VxUQ9tBhpHJ2AAEDNW8sghc4m = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                vizaerdpxa2erqphj.zzpBGItXfub0yWj = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                cicLZEEuOIG.VxUQ9tBhpHJ2AAEDNW8sghc4m((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            iLENsxnuzPXnxt.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(vizaerdpxa2erqphj);
        }
    }
}
