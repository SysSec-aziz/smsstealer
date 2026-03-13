package com.vdodsodjsdt;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class SDmkUyfx1vuePbUbc0umzhpT7GiW extends ActionMode {
    public final Context VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final KoccBHOLe4XJgL zzpBGItXfub0yWj;

    public SDmkUyfx1vuePbUbc0umzhpT7GiW(Context context, KoccBHOLe4XJgL koccBHOLe4XJgL) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = context;
        this.zzpBGItXfub0yWj = koccBHOLe4XJgL;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.zzpBGItXfub0yWj.VxUQ9tBhpHJ2AAEDNW8sghc4m();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.zzpBGItXfub0yWj.zzpBGItXfub0yWj();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new gG9lYsPQZqtEocAlcDOU9(this.VxUQ9tBhpHJ2AAEDNW8sghc4m, this.zzpBGItXfub0yWj.V57tEvNfxZVVcOCAOih5PKr());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.zzpBGItXfub0yWj.ZfQNn8hdWlEQ5cR94249PDsLR();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.zzpBGItXfub0yWj.LaeGQIruHQu81hfJldjMOQSVblH3x();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.zzpBGItXfub0yWj.V57tEvNfxZVVcOCAOih5PKr;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.zzpBGItXfub0yWj.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.zzpBGItXfub0yWj.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.zzpBGItXfub0yWj.ZLZeBXTMq0zDztBxtRTuCHrapQ();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.zzpBGItXfub0yWj.M9e7PWhFYLD2lOGMker();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.zzpBGItXfub0yWj.HzCpKshMOoaw76hFcbOVRYMeRd(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.zzpBGItXfub0yWj.q1wNbhk2O6(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.zzpBGItXfub0yWj.V57tEvNfxZVVcOCAOih5PKr = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.zzpBGItXfub0yWj.Ca81ebIan1u(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.zzpBGItXfub0yWj.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.zzpBGItXfub0yWj.KUYypEB4eNWOZWVDpH(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.zzpBGItXfub0yWj.p59rPv72J9(i);
    }
}
