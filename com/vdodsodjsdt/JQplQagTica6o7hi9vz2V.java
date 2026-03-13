package com.vdodsodjsdt;

import android.view.MenuItem;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class JQplQagTica6o7hi9vz2V implements MenuItem.OnMenuItemClickListener {
    public static final Class[] ZfQNn8hdWlEQ5cR94249PDsLR = {MenuItem.class};
    public Object V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ int VxUQ9tBhpHJ2AAEDNW8sghc4m = 0;
    public Object zzpBGItXfub0yWj;

    public /* synthetic */ JQplQagTica6o7hi9vz2V() {
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                Object obj = this.zzpBGItXfub0yWj;
                Method method = (Method) this.V57tEvNfxZVVcOCAOih5PKr;
                try {
                    if (method.getReturnType() == Boolean.TYPE) {
                        return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                    }
                    method.invoke(obj, menuItem);
                    return true;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            default:
                return ((MenuItem.OnMenuItemClickListener) this.zzpBGItXfub0yWj).onMenuItemClick(((Lq27qyxyRGIx3x) this.V57tEvNfxZVVcOCAOih5PKr).ZLZeBXTMq0zDztBxtRTuCHrapQ(menuItem));
        }
    }

    public JQplQagTica6o7hi9vz2V(Lq27qyxyRGIx3x lq27qyxyRGIx3x, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.V57tEvNfxZVVcOCAOih5PKr = lq27qyxyRGIx3x;
        this.zzpBGItXfub0yWj = onMenuItemClickListener;
    }
}
