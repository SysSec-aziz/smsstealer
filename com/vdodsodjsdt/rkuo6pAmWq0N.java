package com.vdodsodjsdt;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class rkuo6pAmWq0N implements BN234nA3pR0dtOqNWK2kPHgScutH {
    public qzGH0ZhUGLEjFhdFH7Y Ca81ebIan1u;
    public Drawable KUYypEB4eNWOZWVDpH;
    public CharSequence LaeGQIruHQu81hfJldjMOQSVblH3x;
    public char M9e7PWhFYLD2lOGMker;
    public char NSjgqmGjEzuugn2SsG1mZFP;
    public View RhfGHxtXxy0M0grmp2jkRjQg;
    public MenuItem.OnActionExpandListener SuB3hEmTmbbRGAhtvOOmfKEon;
    public final int V57tEvNfxZVVcOCAOih5PKr;
    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public Intent ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final int ZfQNn8hdWlEQ5cR94249PDsLR;
    public MenuItem.OnMenuItemClickListener h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public CharSequence ko09zE6UAgwkV;
    public final Stuu2Qyz6BSCKFEomt5b51vUnV1HQ p59rPv72J9;
    public CharSequence pYmKDYlAmhudp;
    public J97y3vhwLiUYt qNPQb1obP7;
    public int w0Wu95l8dVNw5rZMRu;
    public CharSequence zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final int zzpBGItXfub0yWj;
    public int GI83zq0G8e7zkn = 4096;
    public int HzCpKshMOoaw76hFcbOVRYMeRd = 4096;
    public int q1wNbhk2O6 = 0;
    public ColorStateList jW7EiD0YL6xkbB158jMUzhWNWb1y = null;
    public PorterDuff.Mode f6ZQsR6bPLvvCDNXOUc = null;
    public boolean vBGA6pPLqSMuYGvprl270j7 = false;
    public boolean TaDO7ogis3aEiWEtq = false;
    public boolean Irh5auREsoeV1C1RaBamlmy = false;
    public int q11o1hieEkZDhF1MGOZI26oZiDT = 16;
    public boolean pzqP2AqKW6J5PO8zCKnW = false;

    public rkuo6pAmWq0N(Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.p59rPv72J9 = stuu2Qyz6BSCKFEomt5b51vUnV1HQ;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i2;
        this.zzpBGItXfub0yWj = i;
        this.V57tEvNfxZVVcOCAOih5PKr = i3;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i4;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = charSequence;
        this.w0Wu95l8dVNw5rZMRu = i5;
    }

    public static void V57tEvNfxZVVcOCAOih5PKr(int i, int i2, String str, StringBuilder sb) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    public final boolean LaeGQIruHQu81hfJldjMOQSVblH3x() {
        J97y3vhwLiUYt j97y3vhwLiUYt;
        if ((this.w0Wu95l8dVNw5rZMRu & 8) != 0) {
            if (this.RhfGHxtXxy0M0grmp2jkRjQg == null && (j97y3vhwLiUYt = this.qNPQb1obP7) != null) {
                this.RhfGHxtXxy0M0grmp2jkRjQg = j97y3vhwLiUYt.zzpBGItXfub0yWj.onCreateActionView(this);
            }
            if (this.RhfGHxtXxy0M0grmp2jkRjQg != null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.vdodsodjsdt.BN234nA3pR0dtOqNWK2kPHgScutH
    public final BN234nA3pR0dtOqNWK2kPHgScutH VxUQ9tBhpHJ2AAEDNW8sghc4m(J97y3vhwLiUYt j97y3vhwLiUYt) {
        this.RhfGHxtXxy0M0grmp2jkRjQg = null;
        this.qNPQb1obP7 = j97y3vhwLiUYt;
        this.p59rPv72J9.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(true);
        J97y3vhwLiUYt j97y3vhwLiUYt2 = this.qNPQb1obP7;
        if (j97y3vhwLiUYt2 != null) {
            j97y3vhwLiUYt2.VxUQ9tBhpHJ2AAEDNW8sghc4m = new Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(27, this);
            j97y3vhwLiUYt2.zzpBGItXfub0yWj.setVisibilityListener(j97y3vhwLiUYt2);
        }
        return this;
    }

    public final Drawable ZfQNn8hdWlEQ5cR94249PDsLR(Drawable drawable) {
        if (drawable != null && this.Irh5auREsoeV1C1RaBamlmy && (this.vBGA6pPLqSMuYGvprl270j7 || this.TaDO7ogis3aEiWEtq)) {
            drawable = drawable.mutate();
            if (this.vBGA6pPLqSMuYGvprl270j7) {
                drawable.setTintList(this.jW7EiD0YL6xkbB158jMUzhWNWb1y);
            }
            if (this.TaDO7ogis3aEiWEtq) {
                drawable.setTintMode(this.f6ZQsR6bPLvvCDNXOUc);
            }
            this.Irh5auREsoeV1C1RaBamlmy = false;
        }
        return drawable;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.w0Wu95l8dVNw5rZMRu & 8) == 0) {
            return false;
        }
        if (this.RhfGHxtXxy0M0grmp2jkRjQg == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.SuB3hEmTmbbRGAhtvOOmfKEon;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.p59rPv72J9.ZfQNn8hdWlEQ5cR94249PDsLR(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!LaeGQIruHQu81hfJldjMOQSVblH3x()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.SuB3hEmTmbbRGAhtvOOmfKEon;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.p59rPv72J9.zIvmSL0wzmmKGc3X39b2Gw2mUGE(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.RhfGHxtXxy0M0grmp2jkRjQg;
        if (view != null) {
            return view;
        }
        J97y3vhwLiUYt j97y3vhwLiUYt = this.qNPQb1obP7;
        if (j97y3vhwLiUYt == null) {
            return null;
        }
        View viewOnCreateActionView = j97y3vhwLiUYt.zzpBGItXfub0yWj.onCreateActionView(this);
        this.RhfGHxtXxy0M0grmp2jkRjQg = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // com.vdodsodjsdt.BN234nA3pR0dtOqNWK2kPHgScutH, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.HzCpKshMOoaw76hFcbOVRYMeRd;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.M9e7PWhFYLD2lOGMker;
    }

    @Override // com.vdodsodjsdt.BN234nA3pR0dtOqNWK2kPHgScutH, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.pYmKDYlAmhudp;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.zzpBGItXfub0yWj;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.KUYypEB4eNWOZWVDpH;
        if (drawable != null) {
            return ZfQNn8hdWlEQ5cR94249PDsLR(drawable);
        }
        int i = this.q1wNbhk2O6;
        if (i == 0) {
            return null;
        }
        Drawable drawableJW7EiD0YL6xkbB158jMUzhWNWb1y = KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(this.p59rPv72J9.VxUQ9tBhpHJ2AAEDNW8sghc4m, i);
        this.q1wNbhk2O6 = 0;
        this.KUYypEB4eNWOZWVDpH = drawableJW7EiD0YL6xkbB158jMUzhWNWb1y;
        return ZfQNn8hdWlEQ5cR94249PDsLR(drawableJW7EiD0YL6xkbB158jMUzhWNWb1y);
    }

    @Override // com.vdodsodjsdt.BN234nA3pR0dtOqNWK2kPHgScutH, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.jW7EiD0YL6xkbB158jMUzhWNWb1y;
    }

    @Override // com.vdodsodjsdt.BN234nA3pR0dtOqNWK2kPHgScutH, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f6ZQsR6bPLvvCDNXOUc;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // com.vdodsodjsdt.BN234nA3pR0dtOqNWK2kPHgScutH, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.GI83zq0G8e7zkn;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.NSjgqmGjEzuugn2SsG1mZFP;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.V57tEvNfxZVVcOCAOih5PKr;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.Ca81ebIan1u;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        return charSequence != null ? charSequence : this.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    @Override // com.vdodsodjsdt.BN234nA3pR0dtOqNWK2kPHgScutH, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.ko09zE6UAgwkV;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.Ca81ebIan1u != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.pzqP2AqKW6J5PO8zCKnW;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.q11o1hieEkZDhF1MGOZI26oZiDT & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.q11o1hieEkZDhF1MGOZI26oZiDT & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.q11o1hieEkZDhF1MGOZI26oZiDT & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        J97y3vhwLiUYt j97y3vhwLiUYt = this.qNPQb1obP7;
        return (j97y3vhwLiUYt == null || !j97y3vhwLiUYt.zzpBGItXfub0yWj.overridesItemVisibility()) ? (this.q11o1hieEkZDhF1MGOZI26oZiDT & 8) == 0 : (this.q11o1hieEkZDhF1MGOZI26oZiDT & 8) == 0 && this.qNPQb1obP7.zzpBGItXfub0yWj.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.RhfGHxtXxy0M0grmp2jkRjQg = view;
        this.qNPQb1obP7 = null;
        if (view != null && view.getId() == -1 && (i = this.VxUQ9tBhpHJ2AAEDNW8sghc4m) > 0) {
            view.setId(i);
        }
        Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ = this.p59rPv72J9;
        stuu2Qyz6BSCKFEomt5b51vUnV1HQ.HzCpKshMOoaw76hFcbOVRYMeRd = true;
        stuu2Qyz6BSCKFEomt5b51vUnV1HQ.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.M9e7PWhFYLD2lOGMker == c) {
            return this;
        }
        this.M9e7PWhFYLD2lOGMker = Character.toLowerCase(c);
        this.p59rPv72J9.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        int i = this.q11o1hieEkZDhF1MGOZI26oZiDT;
        int i2 = (z ? 1 : 0) | (i & (-2));
        this.q11o1hieEkZDhF1MGOZI26oZiDT = i2;
        if (i != i2) {
            this.p59rPv72J9.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        int i = this.q11o1hieEkZDhF1MGOZI26oZiDT;
        int i2 = i & 4;
        Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ = this.p59rPv72J9;
        if (i2 == 0) {
            int i3 = (i & (-3)) | (z ? 2 : 0);
            this.q11o1hieEkZDhF1MGOZI26oZiDT = i3;
            if (i != i3) {
                stuu2Qyz6BSCKFEomt5b51vUnV1HQ.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(false);
            }
            return this;
        }
        ArrayList arrayList = stuu2Qyz6BSCKFEomt5b51vUnV1HQ.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        int size = arrayList.size();
        stuu2Qyz6BSCKFEomt5b51vUnV1HQ.Irh5auREsoeV1C1RaBamlmy();
        for (int i4 = 0; i4 < size; i4++) {
            rkuo6pAmWq0N rkuo6pamwq0n = (rkuo6pAmWq0N) arrayList.get(i4);
            if (rkuo6pamwq0n.zzpBGItXfub0yWj == this.zzpBGItXfub0yWj && (rkuo6pamwq0n.q11o1hieEkZDhF1MGOZI26oZiDT & 4) != 0 && rkuo6pamwq0n.isCheckable()) {
                boolean z2 = rkuo6pamwq0n == this;
                int i5 = rkuo6pamwq0n.q11o1hieEkZDhF1MGOZI26oZiDT;
                int i6 = (z2 ? 2 : 0) | (i5 & (-3));
                rkuo6pamwq0n.q11o1hieEkZDhF1MGOZI26oZiDT = i6;
                if (i5 != i6) {
                    rkuo6pamwq0n.p59rPv72J9.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(false);
                }
            }
        }
        stuu2Qyz6BSCKFEomt5b51vUnV1HQ.TaDO7ogis3aEiWEtq();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        if (z) {
            this.q11o1hieEkZDhF1MGOZI26oZiDT |= 16;
        } else {
            this.q11o1hieEkZDhF1MGOZI26oZiDT &= -17;
        }
        this.p59rPv72J9.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.q1wNbhk2O6 = 0;
        this.KUYypEB4eNWOZWVDpH = drawable;
        this.Irh5auREsoeV1C1RaBamlmy = true;
        this.p59rPv72J9.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(false);
        return this;
    }

    @Override // com.vdodsodjsdt.BN234nA3pR0dtOqNWK2kPHgScutH, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = colorStateList;
        this.vBGA6pPLqSMuYGvprl270j7 = true;
        this.Irh5auREsoeV1C1RaBamlmy = true;
        this.p59rPv72J9.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(false);
        return this;
    }

    @Override // com.vdodsodjsdt.BN234nA3pR0dtOqNWK2kPHgScutH, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f6ZQsR6bPLvvCDNXOUc = mode;
        this.TaDO7ogis3aEiWEtq = true;
        this.Irh5auREsoeV1C1RaBamlmy = true;
        this.p59rPv72J9.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        if (this.NSjgqmGjEzuugn2SsG1mZFP == c) {
            return this;
        }
        this.NSjgqmGjEzuugn2SsG1mZFP = c;
        this.p59rPv72J9.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.SuB3hEmTmbbRGAhtvOOmfKEon = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.NSjgqmGjEzuugn2SsG1mZFP = c;
        this.M9e7PWhFYLD2lOGMker = Character.toLowerCase(c2);
        this.p59rPv72J9.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 != 0 && i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.w0Wu95l8dVNw5rZMRu = i;
        Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ = this.p59rPv72J9;
        stuu2Qyz6BSCKFEomt5b51vUnV1HQ.HzCpKshMOoaw76hFcbOVRYMeRd = true;
        stuu2Qyz6BSCKFEomt5b51vUnV1HQ.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = charSequence;
        this.p59rPv72J9.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(false);
        qzGH0ZhUGLEjFhdFH7Y qzgh0zhuglejfhdfh7y = this.Ca81ebIan1u;
        if (qzgh0zhuglejfhdfh7y != null) {
            qzgh0zhuglejfhdfh7y.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = charSequence;
        this.p59rPv72J9.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        int i = this.q11o1hieEkZDhF1MGOZI26oZiDT;
        int i2 = (z ? 0 : 8) | (i & (-9));
        this.q11o1hieEkZDhF1MGOZI26oZiDT = i2;
        if (i != i2) {
            Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ = this.p59rPv72J9;
            stuu2Qyz6BSCKFEomt5b51vUnV1HQ.NSjgqmGjEzuugn2SsG1mZFP = true;
            stuu2Qyz6BSCKFEomt5b51vUnV1HQ.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public final void zIvmSL0wzmmKGc3X39b2Gw2mUGE(boolean z) {
        if (z) {
            this.q11o1hieEkZDhF1MGOZI26oZiDT |= 32;
        } else {
            this.q11o1hieEkZDhF1MGOZI26oZiDT &= -33;
        }
    }

    @Override // com.vdodsodjsdt.BN234nA3pR0dtOqNWK2kPHgScutH
    public final J97y3vhwLiUYt zzpBGItXfub0yWj() {
        return this.qNPQb1obP7;
    }

    @Override // com.vdodsodjsdt.BN234nA3pR0dtOqNWK2kPHgScutH, android.view.MenuItem
    public final BN234nA3pR0dtOqNWK2kPHgScutH setContentDescription(CharSequence charSequence) {
        this.pYmKDYlAmhudp = charSequence;
        this.p59rPv72J9.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(false);
        return this;
    }

    @Override // com.vdodsodjsdt.BN234nA3pR0dtOqNWK2kPHgScutH, android.view.MenuItem
    public final BN234nA3pR0dtOqNWK2kPHgScutH setTooltipText(CharSequence charSequence) {
        this.ko09zE6UAgwkV = charSequence;
        this.p59rPv72J9.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(false);
        return this;
    }

    @Override // com.vdodsodjsdt.BN234nA3pR0dtOqNWK2kPHgScutH, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.M9e7PWhFYLD2lOGMker == c && this.HzCpKshMOoaw76hFcbOVRYMeRd == i) {
            return this;
        }
        this.M9e7PWhFYLD2lOGMker = Character.toLowerCase(c);
        this.HzCpKshMOoaw76hFcbOVRYMeRd = KeyEvent.normalizeMetaState(i);
        this.p59rPv72J9.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(false);
        return this;
    }

    @Override // com.vdodsodjsdt.BN234nA3pR0dtOqNWK2kPHgScutH, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.NSjgqmGjEzuugn2SsG1mZFP == c && this.GI83zq0G8e7zkn == i) {
            return this;
        }
        this.NSjgqmGjEzuugn2SsG1mZFP = c;
        this.GI83zq0G8e7zkn = KeyEvent.normalizeMetaState(i);
        this.p59rPv72J9.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(false);
        return this;
    }

    @Override // com.vdodsodjsdt.BN234nA3pR0dtOqNWK2kPHgScutH, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.NSjgqmGjEzuugn2SsG1mZFP = c;
        this.GI83zq0G8e7zkn = KeyEvent.normalizeMetaState(i);
        this.M9e7PWhFYLD2lOGMker = Character.toLowerCase(c2);
        this.HzCpKshMOoaw76hFcbOVRYMeRd = KeyEvent.normalizeMetaState(i2);
        this.p59rPv72J9.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.KUYypEB4eNWOZWVDpH = null;
        this.q1wNbhk2O6 = i;
        this.Irh5auREsoeV1C1RaBamlmy = true;
        this.p59rPv72J9.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.p59rPv72J9.VxUQ9tBhpHJ2AAEDNW8sghc4m.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i2;
        Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ = this.p59rPv72J9;
        Context context = stuu2Qyz6BSCKFEomt5b51vUnV1HQ.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        View viewInflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.RhfGHxtXxy0M0grmp2jkRjQg = viewInflate;
        this.qNPQb1obP7 = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i2 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m) > 0) {
            viewInflate.setId(i2);
        }
        stuu2Qyz6BSCKFEomt5b51vUnV1HQ.HzCpKshMOoaw76hFcbOVRYMeRd = true;
        stuu2Qyz6BSCKFEomt5b51vUnV1HQ.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(true);
        return this;
    }
}
