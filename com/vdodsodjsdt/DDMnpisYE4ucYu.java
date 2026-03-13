package com.vdodsodjsdt;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class DDMnpisYE4ucYu implements BN234nA3pR0dtOqNWK2kPHgScutH {
    public boolean Ca81ebIan1u;
    public Context GI83zq0G8e7zkn;
    public CharSequence HzCpKshMOoaw76hFcbOVRYMeRd;
    public ColorStateList KUYypEB4eNWOZWVDpH;
    public int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public CharSequence M9e7PWhFYLD2lOGMker;
    public Drawable NSjgqmGjEzuugn2SsG1mZFP;
    public Intent V57tEvNfxZVVcOCAOih5PKr;
    public CharSequence VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public int ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public char ZfQNn8hdWlEQ5cR94249PDsLR;
    public int h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public boolean p59rPv72J9;
    public PorterDuff.Mode q1wNbhk2O6;
    public char zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public CharSequence zzpBGItXfub0yWj;

    public final void V57tEvNfxZVVcOCAOih5PKr() {
        Drawable drawable = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (drawable != null) {
            if (this.p59rPv72J9 || this.Ca81ebIan1u) {
                this.NSjgqmGjEzuugn2SsG1mZFP = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.NSjgqmGjEzuugn2SsG1mZFP = drawableMutate;
                if (this.p59rPv72J9) {
                    drawableMutate.setTintList(this.KUYypEB4eNWOZWVDpH);
                }
                if (this.Ca81ebIan1u) {
                    this.NSjgqmGjEzuugn2SsG1mZFP.setTintMode(this.q1wNbhk2O6);
                }
            }
        }
    }

    @Override // com.vdodsodjsdt.BN234nA3pR0dtOqNWK2kPHgScutH
    public final BN234nA3pR0dtOqNWK2kPHgScutH VxUQ9tBhpHJ2AAEDNW8sghc4m(J97y3vhwLiUYt j97y3vhwLiUYt) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // com.vdodsodjsdt.BN234nA3pR0dtOqNWK2kPHgScutH, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    }

    @Override // com.vdodsodjsdt.BN234nA3pR0dtOqNWK2kPHgScutH, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.M9e7PWhFYLD2lOGMker;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.NSjgqmGjEzuugn2SsG1mZFP;
    }

    @Override // com.vdodsodjsdt.BN234nA3pR0dtOqNWK2kPHgScutH, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.KUYypEB4eNWOZWVDpH;
    }

    @Override // com.vdodsodjsdt.BN234nA3pR0dtOqNWK2kPHgScutH, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.q1wNbhk2O6;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.V57tEvNfxZVVcOCAOih5PKr;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return android.R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // com.vdodsodjsdt.BN234nA3pR0dtOqNWK2kPHgScutH, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.zzpBGItXfub0yWj;
        return charSequence != null ? charSequence : this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
    }

    @Override // com.vdodsodjsdt.BN234nA3pR0dtOqNWK2kPHgScutH, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.HzCpKshMOoaw76hFcbOVRYMeRd;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = (z ? 1 : 0) | (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = (z ? 2 : 0) | (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.M9e7PWhFYLD2lOGMker = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = (z ? 16 : 0) | (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.NSjgqmGjEzuugn2SsG1mZFP = drawable;
        V57tEvNfxZVVcOCAOih5PKr();
        return this;
    }

    @Override // com.vdodsodjsdt.BN234nA3pR0dtOqNWK2kPHgScutH, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.KUYypEB4eNWOZWVDpH = colorStateList;
        this.p59rPv72J9 = true;
        V57tEvNfxZVVcOCAOih5PKr();
        return this;
    }

    @Override // com.vdodsodjsdt.BN234nA3pR0dtOqNWK2kPHgScutH, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.q1wNbhk2O6 = mode;
        this.Ca81ebIan1u = true;
        V57tEvNfxZVVcOCAOih5PKr();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.V57tEvNfxZVVcOCAOih5PKr = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR = c;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR = c;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.zzpBGItXfub0yWj = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.HzCpKshMOoaw76hFcbOVRYMeRd = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // com.vdodsodjsdt.BN234nA3pR0dtOqNWK2kPHgScutH
    public final J97y3vhwLiUYt zzpBGItXfub0yWj() {
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.vdodsodjsdt.BN234nA3pR0dtOqNWK2kPHgScutH, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = Character.toLowerCase(c);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // com.vdodsodjsdt.BN234nA3pR0dtOqNWK2kPHgScutH, android.view.MenuItem
    public final BN234nA3pR0dtOqNWK2kPHgScutH setContentDescription(CharSequence charSequence) {
        this.M9e7PWhFYLD2lOGMker = charSequence;
        return this;
    }

    @Override // com.vdodsodjsdt.BN234nA3pR0dtOqNWK2kPHgScutH, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR = c;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = this.GI83zq0G8e7zkn.getResources().getString(i);
        return this;
    }

    @Override // com.vdodsodjsdt.BN234nA3pR0dtOqNWK2kPHgScutH, android.view.MenuItem
    public final BN234nA3pR0dtOqNWK2kPHgScutH setTooltipText(CharSequence charSequence) {
        this.HzCpKshMOoaw76hFcbOVRYMeRd = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.NSjgqmGjEzuugn2SsG1mZFP = this.GI83zq0G8e7zkn.getDrawable(i);
        V57tEvNfxZVVcOCAOih5PKr();
        return this;
    }

    @Override // com.vdodsodjsdt.BN234nA3pR0dtOqNWK2kPHgScutH, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR = c;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = KeyEvent.normalizeMetaState(i);
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = Character.toLowerCase(c2);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }
}
