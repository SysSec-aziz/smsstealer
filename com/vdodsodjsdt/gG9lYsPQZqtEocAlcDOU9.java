package com.vdodsodjsdt;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class gG9lYsPQZqtEocAlcDOU9 extends UdNpBSaUQhOqU implements Menu {
    public final Stuu2Qyz6BSCKFEomt5b51vUnV1HQ V57tEvNfxZVVcOCAOih5PKr;

    public gG9lYsPQZqtEocAlcDOU9(Context context, Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ) {
        super(context);
        if (stuu2Qyz6BSCKFEomt5b51vUnV1HQ == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.V57tEvNfxZVVcOCAOih5PKr = stuu2Qyz6BSCKFEomt5b51vUnV1HQ;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return ZLZeBXTMq0zDztBxtRTuCHrapQ(this.V57tEvNfxZVVcOCAOih5PKr.VxUQ9tBhpHJ2AAEDNW8sghc4m(0, 0, 0, charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.V57tEvNfxZVVcOCAOih5PKr.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = ZLZeBXTMq0zDztBxtRTuCHrapQ(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.V57tEvNfxZVVcOCAOih5PKr.addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        sSTjsLE9Ugp7iXfnwi18Akn1Jt sstjsle9ugp7ixfnwi18akn1jt = (sSTjsLE9Ugp7iXfnwi18Akn1Jt) this.zzpBGItXfub0yWj;
        if (sstjsle9ugp7ixfnwi18akn1jt != null) {
            sstjsle9ugp7ixfnwi18akn1jt.clear();
        }
        this.V57tEvNfxZVVcOCAOih5PKr.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.V57tEvNfxZVVcOCAOih5PKr.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return ZLZeBXTMq0zDztBxtRTuCHrapQ(this.V57tEvNfxZVVcOCAOih5PKr.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return ZLZeBXTMq0zDztBxtRTuCHrapQ(this.V57tEvNfxZVVcOCAOih5PKr.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.V57tEvNfxZVVcOCAOih5PKr.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.V57tEvNfxZVVcOCAOih5PKr.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.V57tEvNfxZVVcOCAOih5PKr.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.V57tEvNfxZVVcOCAOih5PKr.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (((sSTjsLE9Ugp7iXfnwi18Akn1Jt) this.zzpBGItXfub0yWj) != null) {
            int i2 = 0;
            while (true) {
                sSTjsLE9Ugp7iXfnwi18Akn1Jt sstjsle9ugp7ixfnwi18akn1jt = (sSTjsLE9Ugp7iXfnwi18Akn1Jt) this.zzpBGItXfub0yWj;
                if (i2 >= sstjsle9ugp7ixfnwi18akn1jt.LaeGQIruHQu81hfJldjMOQSVblH3x) {
                    break;
                }
                if (((BN234nA3pR0dtOqNWK2kPHgScutH) sstjsle9ugp7ixfnwi18akn1jt.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i2)).getGroupId() == i) {
                    ((sSTjsLE9Ugp7iXfnwi18Akn1Jt) this.zzpBGItXfub0yWj).ZLZeBXTMq0zDztBxtRTuCHrapQ(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.V57tEvNfxZVVcOCAOih5PKr.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (((sSTjsLE9Ugp7iXfnwi18Akn1Jt) this.zzpBGItXfub0yWj) != null) {
            int i2 = 0;
            while (true) {
                sSTjsLE9Ugp7iXfnwi18Akn1Jt sstjsle9ugp7ixfnwi18akn1jt = (sSTjsLE9Ugp7iXfnwi18Akn1Jt) this.zzpBGItXfub0yWj;
                if (i2 >= sstjsle9ugp7ixfnwi18akn1jt.LaeGQIruHQu81hfJldjMOQSVblH3x) {
                    break;
                }
                if (((BN234nA3pR0dtOqNWK2kPHgScutH) sstjsle9ugp7ixfnwi18akn1jt.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i2)).getItemId() == i) {
                    ((sSTjsLE9Ugp7iXfnwi18Akn1Jt) this.zzpBGItXfub0yWj).ZLZeBXTMq0zDztBxtRTuCHrapQ(i2);
                    break;
                }
                i2++;
            }
        }
        this.V57tEvNfxZVVcOCAOih5PKr.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.V57tEvNfxZVVcOCAOih5PKr.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        this.V57tEvNfxZVVcOCAOih5PKr.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        this.V57tEvNfxZVVcOCAOih5PKr.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.V57tEvNfxZVVcOCAOih5PKr.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.V57tEvNfxZVVcOCAOih5PKr.size();
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return this.V57tEvNfxZVVcOCAOih5PKr.addSubMenu(i);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return ZLZeBXTMq0zDztBxtRTuCHrapQ(this.V57tEvNfxZVVcOCAOih5PKr.add(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return this.V57tEvNfxZVVcOCAOih5PKr.addSubMenu(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return ZLZeBXTMq0zDztBxtRTuCHrapQ(this.V57tEvNfxZVVcOCAOih5PKr.VxUQ9tBhpHJ2AAEDNW8sghc4m(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return this.V57tEvNfxZVVcOCAOih5PKr.addSubMenu(i, i2, i3, i4);
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return ZLZeBXTMq0zDztBxtRTuCHrapQ(this.V57tEvNfxZVVcOCAOih5PKr.add(i, i2, i3, i4));
    }
}
