package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.vdodsodjsdt.BgrqKIfnM5xgG;
import com.vdodsodjsdt.KfeOQNOupsCg6878zi4e;
import com.vdodsodjsdt.XbRgnR5SqPXup9z60vLrMOg;
import com.vdodsodjsdt.YybP2G5tPcuz9Zghx;
import com.vdodsodjsdt.h88a6weV7Lqlrc7J4ND8e7Rcl;
import com.vdodsodjsdt.powVRICeb3L1;
import com.vdodsodjsdt.rkuo6pAmWq0N;
import com.vdodsodjsdt.xb0r6yEzq0tw9m7nTWG5BFR8;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends BgrqKIfnM5xgG implements YybP2G5tPcuz9Zghx {
    public static final int[] qygqjTppWwx992 = {R.attr.state_checked};
    public Drawable HVEwbdULInpTNa0IG;
    public boolean O1xDAlBZZlZdoEf747lCFHld;
    public boolean RhfGHxtXxy0M0grmp2jkRjQg;
    public final CheckedTextView SuB3hEmTmbbRGAhtvOOmfKEon;
    public rkuo6pAmWq0N aXO0LSrt8bKV;
    public FrameLayout pzqP2AqKW6J5PO8zCKnW;
    public int q11o1hieEkZDhF1MGOZI26oZiDT;
    public final boolean qNPQb1obP7;
    public ColorStateList vE4yDIjexsP2lGjLaTcB;
    public boolean w0Wu95l8dVNw5rZMRu;
    public final powVRICeb3L1 y1NaPKTl7R18DOr6e8i5;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.qNPQb1obP7 = true;
        powVRICeb3L1 powvriceb3l1 = new powVRICeb3L1(3, this);
        this.y1NaPKTl7R18DOr6e8i5 = powvriceb3l1;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.vdodsodjsdt.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.vdodsodjsdt.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.vdodsodjsdt.R.id.design_menu_item_text);
        this.SuB3hEmTmbbRGAhtvOOmfKEon = checkedTextView;
        xb0r6yEzq0tw9m7nTWG5BFR8.q1wNbhk2O6(checkedTextView, powvriceb3l1);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.pzqP2AqKW6J5PO8zCKnW == null) {
                this.pzqP2AqKW6J5PO8zCKnW = (FrameLayout) ((ViewStub) findViewById(com.vdodsodjsdt.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.pzqP2AqKW6J5PO8zCKnW.removeAllViews();
            this.pzqP2AqKW6J5PO8zCKnW.addView(view);
        }
    }

    @Override // com.vdodsodjsdt.YybP2G5tPcuz9Zghx
    public final void V57tEvNfxZVVcOCAOih5PKr(rkuo6pAmWq0N rkuo6pamwq0n) {
        StateListDrawable stateListDrawable;
        this.aXO0LSrt8bKV = rkuo6pamwq0n;
        int i = rkuo6pamwq0n.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (i > 0) {
            setId(i);
        }
        setVisibility(rkuo6pamwq0n.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.vdodsodjsdt.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(qygqjTppWwx992, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            setBackground(stateListDrawable);
        }
        setCheckable(rkuo6pamwq0n.isCheckable());
        setChecked(rkuo6pamwq0n.isChecked());
        setEnabled(rkuo6pamwq0n.isEnabled());
        setTitle(rkuo6pamwq0n.LaeGQIruHQu81hfJldjMOQSVblH3x);
        setIcon(rkuo6pamwq0n.getIcon());
        setActionView(rkuo6pamwq0n.getActionView());
        setContentDescription(rkuo6pamwq0n.pYmKDYlAmhudp);
        KfeOQNOupsCg6878zi4e.lQ0rO9lhQIyVe7Rp6(this, rkuo6pamwq0n.ko09zE6UAgwkV);
        rkuo6pAmWq0N rkuo6pamwq0n2 = this.aXO0LSrt8bKV;
        CharSequence charSequence = rkuo6pamwq0n2.LaeGQIruHQu81hfJldjMOQSVblH3x;
        CheckedTextView checkedTextView = this.SuB3hEmTmbbRGAhtvOOmfKEon;
        if (charSequence == null && rkuo6pamwq0n2.getIcon() == null && this.aXO0LSrt8bKV.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.pzqP2AqKW6J5PO8zCKnW;
            if (frameLayout != null) {
                XbRgnR5SqPXup9z60vLrMOg xbRgnR5SqPXup9z60vLrMOg = (XbRgnR5SqPXup9z60vLrMOg) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) xbRgnR5SqPXup9z60vLrMOg).width = -1;
                this.pzqP2AqKW6J5PO8zCKnW.setLayoutParams(xbRgnR5SqPXup9z60vLrMOg);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.pzqP2AqKW6J5PO8zCKnW;
        if (frameLayout2 != null) {
            XbRgnR5SqPXup9z60vLrMOg xbRgnR5SqPXup9z60vLrMOg2 = (XbRgnR5SqPXup9z60vLrMOg) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) xbRgnR5SqPXup9z60vLrMOg2).width = -2;
            this.pzqP2AqKW6J5PO8zCKnW.setLayoutParams(xbRgnR5SqPXup9z60vLrMOg2);
        }
    }

    @Override // com.vdodsodjsdt.YybP2G5tPcuz9Zghx
    public rkuo6pAmWq0N getItemData() {
        return this.aXO0LSrt8bKV;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        rkuo6pAmWq0N rkuo6pamwq0n = this.aXO0LSrt8bKV;
        if (rkuo6pamwq0n != null && rkuo6pamwq0n.isCheckable() && this.aXO0LSrt8bKV.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, qygqjTppWwx992);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.RhfGHxtXxy0M0grmp2jkRjQg != z) {
            this.RhfGHxtXxy0M0grmp2jkRjQg = z;
            this.y1NaPKTl7R18DOr6e8i5.NSjgqmGjEzuugn2SsG1mZFP(this.SuB3hEmTmbbRGAhtvOOmfKEon, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.SuB3hEmTmbbRGAhtvOOmfKEon;
        checkedTextView.setChecked(z);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z && this.qNPQb1obP7) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.O1xDAlBZZlZdoEf747lCFHld) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                drawable.setTintList(this.vE4yDIjexsP2lGjLaTcB);
            }
            int i = this.q11o1hieEkZDhF1MGOZI26oZiDT;
            drawable.setBounds(0, 0, i, i);
        } else if (this.w0Wu95l8dVNw5rZMRu) {
            if (this.HVEwbdULInpTNa0IG == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = h88a6weV7Lqlrc7J4ND8e7Rcl.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                Drawable drawable2 = resources.getDrawable(com.vdodsodjsdt.R.drawable.navigation_empty_icon, theme);
                this.HVEwbdULInpTNa0IG = drawable2;
                if (drawable2 != null) {
                    int i2 = this.q11o1hieEkZDhF1MGOZI26oZiDT;
                    drawable2.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.HVEwbdULInpTNa0IG;
        }
        this.SuB3hEmTmbbRGAhtvOOmfKEon.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.SuB3hEmTmbbRGAhtvOOmfKEon.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.q11o1hieEkZDhF1MGOZI26oZiDT = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.vE4yDIjexsP2lGjLaTcB = colorStateList;
        this.O1xDAlBZZlZdoEf747lCFHld = colorStateList != null;
        rkuo6pAmWq0N rkuo6pamwq0n = this.aXO0LSrt8bKV;
        if (rkuo6pamwq0n != null) {
            setIcon(rkuo6pamwq0n.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.SuB3hEmTmbbRGAhtvOOmfKEon.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.w0Wu95l8dVNw5rZMRu = z;
    }

    public void setTextAppearance(int i) {
        this.SuB3hEmTmbbRGAhtvOOmfKEon.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.SuB3hEmTmbbRGAhtvOOmfKEon.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.SuB3hEmTmbbRGAhtvOOmfKEon.setText(charSequence);
    }
}
