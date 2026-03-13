package com.vdodsodjsdt;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class hEYFkY0Pa5rIEBwb4kWhO0E74Dn extends D12Nz0tOxlAcDuwq4Ka8reia {
    public final Rect GI83zq0G8e7zkn;
    public final float HzCpKshMOoaw76hFcbOVRYMeRd;
    public ColorStateList KUYypEB4eNWOZWVDpH;
    public final int M9e7PWhFYLD2lOGMker;
    public final AccessibilityManager NSjgqmGjEzuugn2SsG1mZFP;
    public final uLXxmkdsO6wfrm ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public ColorStateList p59rPv72J9;
    public int q1wNbhk2O6;

    public hEYFkY0Pa5rIEBwb4kWhO0E74Dn(Context context, AttributeSet attributeSet) {
        super(sGipz63rTUmSj3uFDvOtzihao.bjhcQ0u7VT2OYYrwk96HrWoN(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.GI83zq0G8e7zkn = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayVE4yDIjexsP2lGjLaTcB = FLWIoSaHb1q8TqFvEBgPyRGrzvi6.vE4yDIjexsP2lGjLaTcB(context2, attributeSet, PGobtLpyfPC4TCnlq740.GI83zq0G8e7zkn, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayVE4yDIjexsP2lGjLaTcB.hasValue(0) && typedArrayVE4yDIjexsP2lGjLaTcB.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.M9e7PWhFYLD2lOGMker = typedArrayVE4yDIjexsP2lGjLaTcB.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.HzCpKshMOoaw76hFcbOVRYMeRd = typedArrayVE4yDIjexsP2lGjLaTcB.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayVE4yDIjexsP2lGjLaTcB.hasValue(2)) {
            this.KUYypEB4eNWOZWVDpH = ColorStateList.valueOf(typedArrayVE4yDIjexsP2lGjLaTcB.getColor(2, 0));
        }
        this.q1wNbhk2O6 = typedArrayVE4yDIjexsP2lGjLaTcB.getColor(4, 0);
        this.p59rPv72J9 = F44whnLsbQ.vBGA6pPLqSMuYGvprl270j7(context2, typedArrayVE4yDIjexsP2lGjLaTcB, 5);
        this.NSjgqmGjEzuugn2SsG1mZFP = (AccessibilityManager) context2.getSystemService("accessibility");
        uLXxmkdsO6wfrm ulxxmkdso6wfrm = new uLXxmkdsO6wfrm(context2, null, R.attr.listPopupWindowStyle, 0);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = ulxxmkdso6wfrm;
        ulxxmkdso6wfrm.qNPQb1obP7 = true;
        ulxxmkdso6wfrm.SuB3hEmTmbbRGAhtvOOmfKEon.setFocusable(true);
        ulxxmkdso6wfrm.pYmKDYlAmhudp = this;
        ulxxmkdso6wfrm.SuB3hEmTmbbRGAhtvOOmfKEon.setInputMethodMode(2);
        ulxxmkdso6wfrm.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(getAdapter());
        ulxxmkdso6wfrm.ko09zE6UAgwkV = new j3XuDMUgohiP2k5VzrxCbvGQR(1, this);
        if (typedArrayVE4yDIjexsP2lGjLaTcB.hasValue(6)) {
            setSimpleItems(typedArrayVE4yDIjexsP2lGjLaTcB.getResourceId(6, 0));
        }
        typedArrayVE4yDIjexsP2lGjLaTcB.recycle();
    }

    public final boolean V57tEvNfxZVVcOCAOih5PKr() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null) {
            return false;
        }
        for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
            if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (V57tEvNfxZVVcOCAOih5PKr()) {
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.KUYypEB4eNWOZWVDpH;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutZzpBGItXfub0yWj = zzpBGItXfub0yWj();
        return (textInputLayoutZzpBGItXfub0yWj == null || !textInputLayoutZzpBGItXfub0yWj.y1NaPKTl7R18DOr6e8i5) ? super.getHint() : textInputLayoutZzpBGItXfub0yWj.getHint();
    }

    public float getPopupElevation() {
        return this.HzCpKshMOoaw76hFcbOVRYMeRd;
    }

    public int getSimpleItemSelectedColor() {
        return this.q1wNbhk2O6;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.p59rPv72J9;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutZzpBGItXfub0yWj = zzpBGItXfub0yWj();
        if (textInputLayoutZzpBGItXfub0yWj != null && textInputLayoutZzpBGItXfub0yWj.y1NaPKTl7R18DOr6e8i5 && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutZzpBGItXfub0yWj = zzpBGItXfub0yWj();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutZzpBGItXfub0yWj != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                uLXxmkdsO6wfrm ulxxmkdso6wfrm = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !ulxxmkdso6wfrm.SuB3hEmTmbbRGAhtvOOmfKEon.isShowing() ? -1 : ulxxmkdso6wfrm.LaeGQIruHQu81hfJldjMOQSVblH3x.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutZzpBGItXfub0yWj);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = ulxxmkdso6wfrm.SuB3hEmTmbbRGAhtvOOmfKEon.getBackground();
                if (background != null) {
                    Rect rect = this.GI83zq0G8e7zkn;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutZzpBGItXfub0yWj.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        if (V57tEvNfxZVVcOCAOih5PKr()) {
            return;
        }
        super.onWindowFocusChanged(z);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        uLXxmkdsO6wfrm ulxxmkdso6wfrm = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (ulxxmkdso6wfrm != null) {
            ulxxmkdso6wfrm.GI83zq0G8e7zkn(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.KUYypEB4eNWOZWVDpH = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof EQz8nVyVxmIrHN6fNCQWutFG0b30O) {
            ((EQz8nVyVxmIrHN6fNCQWutFG0b30O) dropDownBackground).p59rPv72J9(this.KUYypEB4eNWOZWVDpH);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ.jW7EiD0YL6xkbB158jMUzhWNWb1y = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout textInputLayoutZzpBGItXfub0yWj = zzpBGItXfub0yWj();
        if (textInputLayoutZzpBGItXfub0yWj != null) {
            textInputLayoutZzpBGItXfub0yWj.vBGA6pPLqSMuYGvprl270j7();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.q1wNbhk2O6 = i;
        if (getAdapter() instanceof R6BDn45IG0t) {
            ((R6BDn45IG0t) getAdapter()).VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.p59rPv72J9 = colorStateList;
        if (getAdapter() instanceof R6BDn45IG0t) {
            ((R6BDn45IG0t) getAdapter()).VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (V57tEvNfxZVVcOCAOih5PKr()) {
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ.ZfQNn8hdWlEQ5cR94249PDsLR();
        } else {
            super.showDropDown();
        }
    }

    public final TextInputLayout zzpBGItXfub0yWj() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new R6BDn45IG0t(this, getContext(), this.M9e7PWhFYLD2lOGMker, strArr));
    }
}
