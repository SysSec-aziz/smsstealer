package com.vdodsodjsdt;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class KCzdBImvv2 extends ContextWrapper {
    public static Configuration zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public Resources LaeGQIruHQu81hfJldjMOQSVblH3x;
    public LayoutInflater V57tEvNfxZVVcOCAOih5PKr;
    public int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public Configuration ZfQNn8hdWlEQ5cR94249PDsLR;
    public Resources.Theme zzpBGItXfub0yWj;

    public KCzdBImvv2(Context context, int i) {
        super(context);
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(Configuration configuration) {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.LaeGQIruHQu81hfJldjMOQSVblH3x
            if (r0 != 0) goto L38
            android.content.res.Configuration r0 = r3.ZfQNn8hdWlEQ5cR94249PDsLR
            if (r0 == 0) goto L32
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L25
            android.content.res.Configuration r1 = com.vdodsodjsdt.KCzdBImvv2.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            if (r1 != 0) goto L1c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            com.vdodsodjsdt.KCzdBImvv2.zIvmSL0wzmmKGc3X39b2Gw2mUGE = r1
        L1c:
            android.content.res.Configuration r1 = com.vdodsodjsdt.KCzdBImvv2.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            goto L32
        L25:
            android.content.res.Configuration r0 = r3.ZfQNn8hdWlEQ5cR94249PDsLR
            android.content.Context r0 = r3.createConfigurationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.LaeGQIruHQu81hfJldjMOQSVblH3x = r0
            goto L38
        L32:
            android.content.res.Resources r0 = super.getResources()
            r3.LaeGQIruHQu81hfJldjMOQSVblH3x = r0
        L38:
            android.content.res.Resources r0 = r3.LaeGQIruHQu81hfJldjMOQSVblH3x
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.KCzdBImvv2.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.V57tEvNfxZVVcOCAOih5PKr == null) {
            this.V57tEvNfxZVVcOCAOih5PKr = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.V57tEvNfxZVVcOCAOih5PKr;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.zzpBGItXfub0yWj;
        if (theme != null) {
            return theme;
        }
        if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m == 0) {
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m = R.style.Theme_AppCompat_Light;
        }
        zzpBGItXfub0yWj();
        return this.zzpBGItXfub0yWj;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m != i) {
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
            zzpBGItXfub0yWj();
        }
    }

    public final void zzpBGItXfub0yWj() {
        if (this.zzpBGItXfub0yWj == null) {
            this.zzpBGItXfub0yWj = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.zzpBGItXfub0yWj.setTo(theme);
            }
        }
        this.zzpBGItXfub0yWj.applyStyle(this.VxUQ9tBhpHJ2AAEDNW8sghc4m, true);
    }
}
