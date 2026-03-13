package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.lang.reflect.Constructor;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class j73LL8QOMOPukrggAKAWxXkyyKn7G {
    public int Ca81ebIan1u;
    public int GI83zq0G8e7zkn;
    public CharSequence HzCpKshMOoaw76hFcbOVRYMeRd;
    public int Irh5auREsoeV1C1RaBamlmy;
    public CharSequence KUYypEB4eNWOZWVDpH;
    public int M9e7PWhFYLD2lOGMker;
    public boolean NSjgqmGjEzuugn2SsG1mZFP;
    public J97y3vhwLiUYt RhfGHxtXxy0M0grmp2jkRjQg;
    public CharSequence SuB3hEmTmbbRGAhtvOOmfKEon;
    public int TaDO7ogis3aEiWEtq;
    public final Menu VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public boolean f6ZQsR6bPLvvCDNXOUc;
    public char h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public boolean jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public int ko09zE6UAgwkV;
    public char p59rPv72J9;
    public int pYmKDYlAmhudp;
    public String q11o1hieEkZDhF1MGOZI26oZiDT;
    public int q1wNbhk2O6;
    public CharSequence qNPQb1obP7;
    public boolean vBGA6pPLqSMuYGvprl270j7;
    public final /* synthetic */ uQVzckisSl8 vE4yDIjexsP2lGjLaTcB;
    public String w0Wu95l8dVNw5rZMRu;
    public ColorStateList pzqP2AqKW6J5PO8zCKnW = null;
    public PorterDuff.Mode aXO0LSrt8bKV = null;
    public int zzpBGItXfub0yWj = 0;
    public int V57tEvNfxZVVcOCAOih5PKr = 0;
    public int ZfQNn8hdWlEQ5cR94249PDsLR = 0;
    public int LaeGQIruHQu81hfJldjMOQSVblH3x = 0;
    public boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE = true;
    public boolean ZLZeBXTMq0zDztBxtRTuCHrapQ = true;

    public j73LL8QOMOPukrggAKAWxXkyyKn7G(uQVzckisSl8 uqvzckissl8, Menu menu) {
        this.vE4yDIjexsP2lGjLaTcB = uqvzckissl8;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = menu;
    }

    public final Object VxUQ9tBhpHJ2AAEDNW8sghc4m(String str, Class[] clsArr, Object[] objArr) {
        try {
            Constructor<?> constructor = Class.forName(str, false, this.vE4yDIjexsP2lGjLaTcB.V57tEvNfxZVVcOCAOih5PKr.getClassLoader()).getConstructor(clsArr);
            constructor.setAccessible(true);
            return constructor.newInstance(objArr);
        } catch (Exception e) {
            Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
            return null;
        }
    }

    public final void zzpBGItXfub0yWj(MenuItem menuItem) {
        uQVzckisSl8 uqvzckissl8 = this.vE4yDIjexsP2lGjLaTcB;
        Context context = uqvzckissl8.V57tEvNfxZVVcOCAOih5PKr;
        boolean z = false;
        menuItem.setChecked(this.jW7EiD0YL6xkbB158jMUzhWNWb1y).setVisible(this.f6ZQsR6bPLvvCDNXOUc).setEnabled(this.vBGA6pPLqSMuYGvprl270j7).setCheckable(this.ko09zE6UAgwkV >= 1).setTitleCondensed(this.KUYypEB4eNWOZWVDpH).setIcon(this.q1wNbhk2O6);
        int i = this.TaDO7ogis3aEiWEtq;
        if (i >= 0) {
            menuItem.setShowAsAction(i);
        }
        if (this.w0Wu95l8dVNw5rZMRu != null) {
            if (context.isRestricted()) {
                throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
            }
            if (uqvzckissl8.ZfQNn8hdWlEQ5cR94249PDsLR == null) {
                uqvzckissl8.ZfQNn8hdWlEQ5cR94249PDsLR = uQVzckisSl8.VxUQ9tBhpHJ2AAEDNW8sghc4m(context);
            }
            Object obj = uqvzckissl8.ZfQNn8hdWlEQ5cR94249PDsLR;
            String str = this.w0Wu95l8dVNw5rZMRu;
            JQplQagTica6o7hi9vz2V jQplQagTica6o7hi9vz2V = new JQplQagTica6o7hi9vz2V();
            jQplQagTica6o7hi9vz2V.zzpBGItXfub0yWj = obj;
            Class<?> cls = obj.getClass();
            try {
                jQplQagTica6o7hi9vz2V.V57tEvNfxZVVcOCAOih5PKr = cls.getMethod(str, JQplQagTica6o7hi9vz2V.ZfQNn8hdWlEQ5cR94249PDsLR);
                menuItem.setOnMenuItemClickListener(jQplQagTica6o7hi9vz2V);
            } catch (Exception e) {
                StringBuilder sbKUYypEB4eNWOZWVDpH = u9SlVAuoWhQUfJ.KUYypEB4eNWOZWVDpH("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbKUYypEB4eNWOZWVDpH.append(cls.getName());
                InflateException inflateException = new InflateException(sbKUYypEB4eNWOZWVDpH.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }
        if (this.ko09zE6UAgwkV >= 2) {
            if (menuItem instanceof rkuo6pAmWq0N) {
                rkuo6pAmWq0N rkuo6pamwq0n = (rkuo6pAmWq0N) menuItem;
                rkuo6pamwq0n.q11o1hieEkZDhF1MGOZI26oZiDT = (rkuo6pamwq0n.q11o1hieEkZDhF1MGOZI26oZiDT & (-5)) | 4;
            } else if (menuItem instanceof Lq27qyxyRGIx3x) {
                Lq27qyxyRGIx3x lq27qyxyRGIx3x = (Lq27qyxyRGIx3x) menuItem;
                BN234nA3pR0dtOqNWK2kPHgScutH bN234nA3pR0dtOqNWK2kPHgScutH = lq27qyxyRGIx3x.V57tEvNfxZVVcOCAOih5PKr;
                try {
                    if (lq27qyxyRGIx3x.ZfQNn8hdWlEQ5cR94249PDsLR == null) {
                        lq27qyxyRGIx3x.ZfQNn8hdWlEQ5cR94249PDsLR = bN234nA3pR0dtOqNWK2kPHgScutH.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                    }
                    lq27qyxyRGIx3x.ZfQNn8hdWlEQ5cR94249PDsLR.invoke(bN234nA3pR0dtOqNWK2kPHgScutH, Boolean.TRUE);
                } catch (Exception e2) {
                    Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                }
            }
        }
        String str2 = this.q11o1hieEkZDhF1MGOZI26oZiDT;
        if (str2 != null) {
            menuItem.setActionView((View) VxUQ9tBhpHJ2AAEDNW8sghc4m(str2, uQVzckisSl8.LaeGQIruHQu81hfJldjMOQSVblH3x, uqvzckissl8.VxUQ9tBhpHJ2AAEDNW8sghc4m));
            z = true;
        }
        int i2 = this.Irh5auREsoeV1C1RaBamlmy;
        if (i2 > 0) {
            if (z) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
            } else {
                menuItem.setActionView(i2);
            }
        }
        J97y3vhwLiUYt j97y3vhwLiUYt = this.RhfGHxtXxy0M0grmp2jkRjQg;
        if (j97y3vhwLiUYt != null) {
            if (menuItem instanceof BN234nA3pR0dtOqNWK2kPHgScutH) {
                ((BN234nA3pR0dtOqNWK2kPHgScutH) menuItem).VxUQ9tBhpHJ2AAEDNW8sghc4m(j97y3vhwLiUYt);
            } else {
                Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
            }
        }
        CharSequence charSequence = this.qNPQb1obP7;
        boolean z2 = menuItem instanceof BN234nA3pR0dtOqNWK2kPHgScutH;
        if (z2) {
            ((BN234nA3pR0dtOqNWK2kPHgScutH) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            r7fKZGfezTdpRAhj.LaeGQIruHQu81hfJldjMOQSVblH3x(menuItem, charSequence);
        }
        CharSequence charSequence2 = this.SuB3hEmTmbbRGAhtvOOmfKEon;
        if (z2) {
            ((BN234nA3pR0dtOqNWK2kPHgScutH) menuItem).setTooltipText(charSequence2);
        } else if (Build.VERSION.SDK_INT >= 26) {
            r7fKZGfezTdpRAhj.GI83zq0G8e7zkn(menuItem, charSequence2);
        }
        char c = this.p59rPv72J9;
        int i3 = this.Ca81ebIan1u;
        if (z2) {
            ((BN234nA3pR0dtOqNWK2kPHgScutH) menuItem).setAlphabeticShortcut(c, i3);
        } else if (Build.VERSION.SDK_INT >= 26) {
            r7fKZGfezTdpRAhj.ZfQNn8hdWlEQ5cR94249PDsLR(menuItem, c, i3);
        }
        char c2 = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        int i4 = this.pYmKDYlAmhudp;
        if (z2) {
            ((BN234nA3pR0dtOqNWK2kPHgScutH) menuItem).setNumericShortcut(c2, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            r7fKZGfezTdpRAhj.NSjgqmGjEzuugn2SsG1mZFP(menuItem, c2, i4);
        }
        PorterDuff.Mode mode = this.aXO0LSrt8bKV;
        if (mode != null) {
            if (z2) {
                ((BN234nA3pR0dtOqNWK2kPHgScutH) menuItem).setIconTintMode(mode);
            } else if (Build.VERSION.SDK_INT >= 26) {
                r7fKZGfezTdpRAhj.ZLZeBXTMq0zDztBxtRTuCHrapQ(menuItem, mode);
            }
        }
        ColorStateList colorStateList = this.pzqP2AqKW6J5PO8zCKnW;
        if (colorStateList != null) {
            if (z2) {
                ((BN234nA3pR0dtOqNWK2kPHgScutH) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                r7fKZGfezTdpRAhj.zIvmSL0wzmmKGc3X39b2Gw2mUGE(menuItem, colorStateList);
            }
        }
    }
}
