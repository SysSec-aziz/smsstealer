package com.vdodsodjsdt;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class Lq27qyxyRGIx3x extends UdNpBSaUQhOqU implements MenuItem {
    public final BN234nA3pR0dtOqNWK2kPHgScutH V57tEvNfxZVVcOCAOih5PKr;
    public Method ZfQNn8hdWlEQ5cR94249PDsLR;

    public Lq27qyxyRGIx3x(Context context, BN234nA3pR0dtOqNWK2kPHgScutH bN234nA3pR0dtOqNWK2kPHgScutH) {
        super(context);
        if (bN234nA3pR0dtOqNWK2kPHgScutH == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.V57tEvNfxZVVcOCAOih5PKr = bN234nA3pR0dtOqNWK2kPHgScutH;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.V57tEvNfxZVVcOCAOih5PKr.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.V57tEvNfxZVVcOCAOih5PKr.expandActionView();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        J97y3vhwLiUYt j97y3vhwLiUYtZzpBGItXfub0yWj = this.V57tEvNfxZVVcOCAOih5PKr.zzpBGItXfub0yWj();
        if (j97y3vhwLiUYtZzpBGItXfub0yWj != null) {
            return j97y3vhwLiUYtZzpBGItXfub0yWj.zzpBGItXfub0yWj;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.V57tEvNfxZVVcOCAOih5PKr.getActionView();
        return actionView instanceof DcJZqsgwGYm3JXqta ? (View) ((DcJZqsgwGYm3JXqta) actionView).V57tEvNfxZVVcOCAOih5PKr : actionView;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.V57tEvNfxZVVcOCAOih5PKr.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.V57tEvNfxZVVcOCAOih5PKr.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.V57tEvNfxZVVcOCAOih5PKr.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.V57tEvNfxZVVcOCAOih5PKr.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.V57tEvNfxZVVcOCAOih5PKr.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.V57tEvNfxZVVcOCAOih5PKr.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.V57tEvNfxZVVcOCAOih5PKr.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.V57tEvNfxZVVcOCAOih5PKr.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.V57tEvNfxZVVcOCAOih5PKr.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.V57tEvNfxZVVcOCAOih5PKr.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.V57tEvNfxZVVcOCAOih5PKr.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.V57tEvNfxZVVcOCAOih5PKr.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.V57tEvNfxZVVcOCAOih5PKr.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.V57tEvNfxZVVcOCAOih5PKr.getSubMenu();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.V57tEvNfxZVVcOCAOih5PKr.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.V57tEvNfxZVVcOCAOih5PKr.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.V57tEvNfxZVVcOCAOih5PKr.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.V57tEvNfxZVVcOCAOih5PKr.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.V57tEvNfxZVVcOCAOih5PKr.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.V57tEvNfxZVVcOCAOih5PKr.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.V57tEvNfxZVVcOCAOih5PKr.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.V57tEvNfxZVVcOCAOih5PKr.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.V57tEvNfxZVVcOCAOih5PKr.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        J97y3vhwLiUYt j97y3vhwLiUYt = new J97y3vhwLiUYt(this, actionProvider);
        if (actionProvider == null) {
            j97y3vhwLiUYt = null;
        }
        this.V57tEvNfxZVVcOCAOih5PKr.VxUQ9tBhpHJ2AAEDNW8sghc4m(j97y3vhwLiUYt);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new DcJZqsgwGYm3JXqta(view);
        }
        this.V57tEvNfxZVVcOCAOih5PKr.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.V57tEvNfxZVVcOCAOih5PKr.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.V57tEvNfxZVVcOCAOih5PKr.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.V57tEvNfxZVVcOCAOih5PKr.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.V57tEvNfxZVVcOCAOih5PKr.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.V57tEvNfxZVVcOCAOih5PKr.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.V57tEvNfxZVVcOCAOih5PKr.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.V57tEvNfxZVVcOCAOih5PKr.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.V57tEvNfxZVVcOCAOih5PKr.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.V57tEvNfxZVVcOCAOih5PKr.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.V57tEvNfxZVVcOCAOih5PKr.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.V57tEvNfxZVVcOCAOih5PKr.setOnActionExpandListener(onActionExpandListener != null ? new clipW1nDYE(this, onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.V57tEvNfxZVVcOCAOih5PKr.setOnMenuItemClickListener(onMenuItemClickListener != null ? new JQplQagTica6o7hi9vz2V(this, onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.V57tEvNfxZVVcOCAOih5PKr.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        this.V57tEvNfxZVVcOCAOih5PKr.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        this.V57tEvNfxZVVcOCAOih5PKr.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.V57tEvNfxZVVcOCAOih5PKr.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.V57tEvNfxZVVcOCAOih5PKr.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.V57tEvNfxZVVcOCAOih5PKr.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        return this.V57tEvNfxZVVcOCAOih5PKr.setVisible(z);
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.V57tEvNfxZVVcOCAOih5PKr.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.V57tEvNfxZVVcOCAOih5PKr.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.V57tEvNfxZVVcOCAOih5PKr.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.V57tEvNfxZVVcOCAOih5PKr.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.V57tEvNfxZVVcOCAOih5PKr.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        BN234nA3pR0dtOqNWK2kPHgScutH bN234nA3pR0dtOqNWK2kPHgScutH = this.V57tEvNfxZVVcOCAOih5PKr;
        bN234nA3pR0dtOqNWK2kPHgScutH.setActionView(i);
        View actionView = bN234nA3pR0dtOqNWK2kPHgScutH.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            bN234nA3pR0dtOqNWK2kPHgScutH.setActionView(new DcJZqsgwGYm3JXqta(actionView));
        }
        return this;
    }
}
