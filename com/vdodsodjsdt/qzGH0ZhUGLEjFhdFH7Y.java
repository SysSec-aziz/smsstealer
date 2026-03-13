package com.vdodsodjsdt;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class qzGH0ZhUGLEjFhdFH7Y extends Stuu2Qyz6BSCKFEomt5b51vUnV1HQ implements SubMenu {
    public final Stuu2Qyz6BSCKFEomt5b51vUnV1HQ RhfGHxtXxy0M0grmp2jkRjQg;
    public final rkuo6pAmWq0N qNPQb1obP7;

    public qzGH0ZhUGLEjFhdFH7Y(Context context, Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ, rkuo6pAmWq0N rkuo6pamwq0n) {
        super(context);
        this.RhfGHxtXxy0M0grmp2jkRjQg = stuu2Qyz6BSCKFEomt5b51vUnV1HQ;
        this.qNPQb1obP7 = rkuo6pamwq0n;
    }

    @Override // com.vdodsodjsdt.Stuu2Qyz6BSCKFEomt5b51vUnV1HQ
    public final boolean Ca81ebIan1u() {
        return this.RhfGHxtXxy0M0grmp2jkRjQg.Ca81ebIan1u();
    }

    @Override // com.vdodsodjsdt.Stuu2Qyz6BSCKFEomt5b51vUnV1HQ
    public final Stuu2Qyz6BSCKFEomt5b51vUnV1HQ HzCpKshMOoaw76hFcbOVRYMeRd() {
        return this.RhfGHxtXxy0M0grmp2jkRjQg.HzCpKshMOoaw76hFcbOVRYMeRd();
    }

    @Override // com.vdodsodjsdt.Stuu2Qyz6BSCKFEomt5b51vUnV1HQ
    public final boolean LaeGQIruHQu81hfJldjMOQSVblH3x(Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ, MenuItem menuItem) {
        return super.LaeGQIruHQu81hfJldjMOQSVblH3x(stuu2Qyz6BSCKFEomt5b51vUnV1HQ, menuItem) || this.RhfGHxtXxy0M0grmp2jkRjQg.LaeGQIruHQu81hfJldjMOQSVblH3x(stuu2Qyz6BSCKFEomt5b51vUnV1HQ, menuItem);
    }

    @Override // com.vdodsodjsdt.Stuu2Qyz6BSCKFEomt5b51vUnV1HQ
    public final String M9e7PWhFYLD2lOGMker() {
        rkuo6pAmWq0N rkuo6pamwq0n = this.qNPQb1obP7;
        int i = rkuo6pamwq0n != null ? rkuo6pamwq0n.VxUQ9tBhpHJ2AAEDNW8sghc4m : 0;
        if (i == 0) {
            return null;
        }
        return u9SlVAuoWhQUfJ.NSjgqmGjEzuugn2SsG1mZFP("android:menu:actionviewstates:", i);
    }

    @Override // com.vdodsodjsdt.Stuu2Qyz6BSCKFEomt5b51vUnV1HQ
    public final boolean ZfQNn8hdWlEQ5cR94249PDsLR(rkuo6pAmWq0N rkuo6pamwq0n) {
        return this.RhfGHxtXxy0M0grmp2jkRjQg.ZfQNn8hdWlEQ5cR94249PDsLR(rkuo6pamwq0n);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.qNPQb1obP7;
    }

    @Override // com.vdodsodjsdt.Stuu2Qyz6BSCKFEomt5b51vUnV1HQ
    public final boolean p59rPv72J9() {
        return this.RhfGHxtXxy0M0grmp2jkRjQg.p59rPv72J9();
    }

    @Override // com.vdodsodjsdt.Stuu2Qyz6BSCKFEomt5b51vUnV1HQ
    public final boolean q1wNbhk2O6() {
        return this.RhfGHxtXxy0M0grmp2jkRjQg.q1wNbhk2O6();
    }

    @Override // com.vdodsodjsdt.Stuu2Qyz6BSCKFEomt5b51vUnV1HQ, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.RhfGHxtXxy0M0grmp2jkRjQg.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        vBGA6pPLqSMuYGvprl270j7(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        vBGA6pPLqSMuYGvprl270j7(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        vBGA6pPLqSMuYGvprl270j7(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.qNPQb1obP7.setIcon(drawable);
        return this;
    }

    @Override // com.vdodsodjsdt.Stuu2Qyz6BSCKFEomt5b51vUnV1HQ, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.RhfGHxtXxy0M0grmp2jkRjQg.setQwertyMode(z);
    }

    @Override // com.vdodsodjsdt.Stuu2Qyz6BSCKFEomt5b51vUnV1HQ
    public final boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE(rkuo6pAmWq0N rkuo6pamwq0n) {
        return this.RhfGHxtXxy0M0grmp2jkRjQg.zIvmSL0wzmmKGc3X39b2Gw2mUGE(rkuo6pamwq0n);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        vBGA6pPLqSMuYGvprl270j7(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        vBGA6pPLqSMuYGvprl270j7(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.qNPQb1obP7.setIcon(i);
        return this;
    }
}
