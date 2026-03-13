package com.vdodsodjsdt;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class oD78NtkeSuRtaWUfMs1KgLg1WoWNL implements hMSqZXAdAtwr9Ih2G {
    public Drawable Ca81ebIan1u;
    public CharSequence GI83zq0G8e7zkn;
    public Window.Callback HzCpKshMOoaw76hFcbOVRYMeRd;
    public boolean KUYypEB4eNWOZWVDpH;
    public Drawable LaeGQIruHQu81hfJldjMOQSVblH3x;
    public CharSequence M9e7PWhFYLD2lOGMker;
    public CharSequence NSjgqmGjEzuugn2SsG1mZFP;
    public View V57tEvNfxZVVcOCAOih5PKr;
    public Toolbar VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public boolean ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public Drawable ZfQNn8hdWlEQ5cR94249PDsLR;
    public int p59rPv72J9;
    public JaGiaIfgE4oZFS8GScUJb q1wNbhk2O6;
    public Drawable zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public int zzpBGItXfub0yWj;

    public final void V57tEvNfxZVVcOCAOih5PKr() {
        Drawable drawable;
        int i = this.zzpBGItXfub0yWj;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.LaeGQIruHQu81hfJldjMOQSVblH3x) == null) {
            drawable = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        }
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.setLogo(drawable);
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(int i) {
        View view;
        Toolbar toolbar = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int i2 = this.zzpBGItXfub0yWj ^ i;
        this.zzpBGItXfub0yWj = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    zzpBGItXfub0yWj();
                }
                if ((this.zzpBGItXfub0yWj & 4) != 0) {
                    Drawable drawable = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                    if (drawable == null) {
                        drawable = this.Ca81ebIan1u;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                V57tEvNfxZVVcOCAOih5PKr();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.NSjgqmGjEzuugn2SsG1mZFP);
                    toolbar.setSubtitle(this.GI83zq0G8e7zkn);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.V57tEvNfxZVVcOCAOih5PKr) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void zzpBGItXfub0yWj() {
        Toolbar toolbar = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if ((this.zzpBGItXfub0yWj & 4) != 0) {
            if (TextUtils.isEmpty(this.M9e7PWhFYLD2lOGMker)) {
                toolbar.setNavigationContentDescription(this.p59rPv72J9);
            } else {
                toolbar.setNavigationContentDescription(this.M9e7PWhFYLD2lOGMker);
            }
        }
    }
}
