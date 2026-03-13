package com.vdodsodjsdt;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class Stuu2Qyz6BSCKFEomt5b51vUnV1HQ implements Menu {
    public static final int[] w0Wu95l8dVNw5rZMRu = {1, 4, 5, 3, 2, 0};
    public View Ca81ebIan1u;
    public final ArrayList GI83zq0G8e7zkn;
    public boolean HzCpKshMOoaw76hFcbOVRYMeRd;
    public n52qNbrWmzyJ3ZNP4nIEjnDJFclzk LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final ArrayList M9e7PWhFYLD2lOGMker;
    public boolean NSjgqmGjEzuugn2SsG1mZFP;
    public rkuo6pAmWq0N TaDO7ogis3aEiWEtq;
    public boolean V57tEvNfxZVVcOCAOih5PKr;
    public final Context VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final ArrayList ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final boolean ZfQNn8hdWlEQ5cR94249PDsLR;
    public Drawable p59rPv72J9;
    public boolean q11o1hieEkZDhF1MGOZI26oZiDT;
    public CharSequence q1wNbhk2O6;
    public final ArrayList zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final Resources zzpBGItXfub0yWj;
    public int KUYypEB4eNWOZWVDpH = 0;
    public boolean h3jnZRsdwYJfY9UhQCkbvWciwvFHv = false;
    public boolean pYmKDYlAmhudp = false;
    public boolean ko09zE6UAgwkV = false;
    public boolean jW7EiD0YL6xkbB158jMUzhWNWb1y = false;
    public final ArrayList f6ZQsR6bPLvvCDNXOUc = new ArrayList();
    public final CopyOnWriteArrayList vBGA6pPLqSMuYGvprl270j7 = new CopyOnWriteArrayList();
    public boolean Irh5auREsoeV1C1RaBamlmy = false;

    public Stuu2Qyz6BSCKFEomt5b51vUnV1HQ(Context context) {
        boolean zP59rPv72J9;
        boolean z = false;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = context;
        Resources resources = context.getResources();
        this.zzpBGItXfub0yWj = resources;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = new ArrayList();
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = new ArrayList();
        this.NSjgqmGjEzuugn2SsG1mZFP = true;
        this.GI83zq0G8e7zkn = new ArrayList();
        this.M9e7PWhFYLD2lOGMker = new ArrayList();
        this.HzCpKshMOoaw76hFcbOVRYMeRd = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = wQvZok2Lu79.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (Build.VERSION.SDK_INT >= 28) {
                zP59rPv72J9 = kHXwlw9VpxBho.p59rPv72J9(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zP59rPv72J9 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (zP59rPv72J9) {
                z = true;
            }
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR = z;
    }

    public boolean Ca81ebIan1u() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    public final void GI83zq0G8e7zkn() {
        ArrayList arrayListKUYypEB4eNWOZWVDpH = KUYypEB4eNWOZWVDpH();
        if (this.HzCpKshMOoaw76hFcbOVRYMeRd) {
            CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.vBGA6pPLqSMuYGvprl270j7;
            boolean zGI83zq0G8e7zkn = false;
            for (WeakReference weakReference : copyOnWriteArrayList) {
                xzFpmFD3R5K5fyU xzfpmfd3r5k5fyu = (xzFpmFD3R5K5fyU) weakReference.get();
                if (xzfpmfd3r5k5fyu == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    zGI83zq0G8e7zkn |= xzfpmfd3r5k5fyu.GI83zq0G8e7zkn();
                }
            }
            ArrayList arrayList = this.GI83zq0G8e7zkn;
            ArrayList arrayList2 = this.M9e7PWhFYLD2lOGMker;
            if (zGI83zq0G8e7zkn) {
                arrayList.clear();
                arrayList2.clear();
                int size = arrayListKUYypEB4eNWOZWVDpH.size();
                for (int i = 0; i < size; i++) {
                    rkuo6pAmWq0N rkuo6pamwq0n = (rkuo6pAmWq0N) arrayListKUYypEB4eNWOZWVDpH.get(i);
                    if ((rkuo6pamwq0n.q11o1hieEkZDhF1MGOZI26oZiDT & 32) == 32) {
                        arrayList.add(rkuo6pamwq0n);
                    } else {
                        arrayList2.add(rkuo6pamwq0n);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(KUYypEB4eNWOZWVDpH());
            }
            this.HzCpKshMOoaw76hFcbOVRYMeRd = false;
        }
    }

    public final void Irh5auREsoeV1C1RaBamlmy() {
        if (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv) {
            return;
        }
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = true;
        this.pYmKDYlAmhudp = false;
        this.ko09zE6UAgwkV = false;
    }

    public final ArrayList KUYypEB4eNWOZWVDpH() {
        boolean z = this.NSjgqmGjEzuugn2SsG1mZFP;
        ArrayList arrayList = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            rkuo6pAmWq0N rkuo6pamwq0n = (rkuo6pAmWq0N) arrayList2.get(i);
            if (rkuo6pamwq0n.isVisible()) {
                arrayList.add(rkuo6pamwq0n);
            }
        }
        this.NSjgqmGjEzuugn2SsG1mZFP = false;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = true;
        return arrayList;
    }

    public boolean LaeGQIruHQu81hfJldjMOQSVblH3x(Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ, MenuItem menuItem) {
        n52qNbrWmzyJ3ZNP4nIEjnDJFclzk n52qnbrwmzyj3znp4niejndjfclzk = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        return n52qnbrwmzyj3znp4niejndjfclzk != null && n52qnbrwmzyj3znp4niejndjfclzk.GI83zq0G8e7zkn(stuu2Qyz6BSCKFEomt5b51vUnV1HQ, menuItem);
    }

    public String M9e7PWhFYLD2lOGMker() {
        return "android:menu:actionviewstates";
    }

    public final void NSjgqmGjEzuugn2SsG1mZFP(List list, int i, KeyEvent keyEvent) {
        boolean zP59rPv72J9 = p59rPv72J9();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                rkuo6pAmWq0N rkuo6pamwq0n = (rkuo6pAmWq0N) arrayList.get(i2);
                if (rkuo6pamwq0n.hasSubMenu()) {
                    rkuo6pamwq0n.Ca81ebIan1u.NSjgqmGjEzuugn2SsG1mZFP(list, i, keyEvent);
                }
                char c = zP59rPv72J9 ? rkuo6pamwq0n.M9e7PWhFYLD2lOGMker : rkuo6pamwq0n.NSjgqmGjEzuugn2SsG1mZFP;
                if ((modifiers & 69647) == ((zP59rPv72J9 ? rkuo6pamwq0n.HzCpKshMOoaw76hFcbOVRYMeRd : rkuo6pamwq0n.GI83zq0G8e7zkn) & 69647) && c != 0) {
                    char[] cArr = keyData.meta;
                    if ((c == cArr[0] || c == cArr[2] || (zP59rPv72J9 && c == '\b' && i == 67)) && rkuo6pamwq0n.isEnabled()) {
                        list.add(rkuo6pamwq0n);
                    }
                }
            }
        }
    }

    public final void TaDO7ogis3aEiWEtq() {
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = false;
        if (this.pYmKDYlAmhudp) {
            this.pYmKDYlAmhudp = false;
            h3jnZRsdwYJfY9UhQCkbvWciwvFHv(this.ko09zE6UAgwkV);
        }
    }

    public final void V57tEvNfxZVVcOCAOih5PKr(boolean z) {
        if (this.jW7EiD0YL6xkbB158jMUzhWNWb1y) {
            return;
        }
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = true;
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.vBGA6pPLqSMuYGvprl270j7;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            xzFpmFD3R5K5fyU xzfpmfd3r5k5fyu = (xzFpmFD3R5K5fyU) weakReference.get();
            if (xzfpmfd3r5k5fyu == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xzfpmfd3r5k5fyu.zzpBGItXfub0yWj(this, z);
            }
        }
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = false;
    }

    public final rkuo6pAmWq0N VxUQ9tBhpHJ2AAEDNW8sghc4m(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 < 0 || i5 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (w0Wu95l8dVNw5rZMRu[i5] << 16) | (65535 & i3);
        rkuo6pAmWq0N rkuo6pamwq0n = new rkuo6pAmWq0N(this, i, i2, i3, i6, charSequence, this.KUYypEB4eNWOZWVDpH);
        ArrayList arrayList = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i4 = 0;
                break;
            }
            if (((rkuo6pAmWq0N) arrayList.get(size)).ZfQNn8hdWlEQ5cR94249PDsLR <= i6) {
                i4 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i4, rkuo6pamwq0n);
        h3jnZRsdwYJfY9UhQCkbvWciwvFHv(true);
        return rkuo6pamwq0n;
    }

    public final rkuo6pAmWq0N ZLZeBXTMq0zDztBxtRTuCHrapQ(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f6ZQsR6bPLvvCDNXOUc;
        arrayList.clear();
        NSjgqmGjEzuugn2SsG1mZFP(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (rkuo6pAmWq0N) arrayList.get(0);
        }
        boolean zP59rPv72J9 = p59rPv72J9();
        for (int i2 = 0; i2 < size; i2++) {
            rkuo6pAmWq0N rkuo6pamwq0n = (rkuo6pAmWq0N) arrayList.get(i2);
            char c = zP59rPv72J9 ? rkuo6pamwq0n.M9e7PWhFYLD2lOGMker : rkuo6pamwq0n.NSjgqmGjEzuugn2SsG1mZFP;
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (zP59rPv72J9 && c == '\b' && i == 67))) {
                return rkuo6pamwq0n;
            }
        }
        return null;
    }

    public boolean ZfQNn8hdWlEQ5cR94249PDsLR(rkuo6pAmWq0N rkuo6pamwq0n) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.vBGA6pPLqSMuYGvprl270j7;
        boolean zZIvmSL0wzmmKGc3X39b2Gw2mUGE = false;
        if (!copyOnWriteArrayList.isEmpty() && this.TaDO7ogis3aEiWEtq == rkuo6pamwq0n) {
            Irh5auREsoeV1C1RaBamlmy();
            for (WeakReference weakReference : copyOnWriteArrayList) {
                xzFpmFD3R5K5fyU xzfpmfd3r5k5fyu = (xzFpmFD3R5K5fyU) weakReference.get();
                if (xzfpmfd3r5k5fyu != null) {
                    zZIvmSL0wzmmKGc3X39b2Gw2mUGE = xzfpmfd3r5k5fyu.zIvmSL0wzmmKGc3X39b2Gw2mUGE(rkuo6pamwq0n);
                    if (zZIvmSL0wzmmKGc3X39b2Gw2mUGE) {
                        break;
                    }
                } else {
                    copyOnWriteArrayList.remove(weakReference);
                }
            }
            TaDO7ogis3aEiWEtq();
            if (zZIvmSL0wzmmKGc3X39b2Gw2mUGE) {
                this.TaDO7ogis3aEiWEtq = null;
            }
        }
        return zZIvmSL0wzmmKGc3X39b2Gw2mUGE;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return VxUQ9tBhpHJ2AAEDNW8sghc4m(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            rkuo6pAmWq0N rkuo6pamwq0nVxUQ9tBhpHJ2AAEDNW8sghc4m = VxUQ9tBhpHJ2AAEDNW8sghc4m(i, i2, i3, resolveInfo.loadLabel(packageManager));
            rkuo6pamwq0nVxUQ9tBhpHJ2AAEDNW8sghc4m.setIcon(resolveInfo.loadIcon(packageManager));
            rkuo6pamwq0nVxUQ9tBhpHJ2AAEDNW8sghc4m.ZLZeBXTMq0zDztBxtRTuCHrapQ = intent2;
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = rkuo6pamwq0nVxUQ9tBhpHJ2AAEDNW8sghc4m;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final void clear() {
        rkuo6pAmWq0N rkuo6pamwq0n = this.TaDO7ogis3aEiWEtq;
        if (rkuo6pamwq0n != null) {
            ZfQNn8hdWlEQ5cR94249PDsLR(rkuo6pamwq0n);
        }
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.clear();
        h3jnZRsdwYJfY9UhQCkbvWciwvFHv(true);
    }

    public final void clearHeader() {
        this.p59rPv72J9 = null;
        this.q1wNbhk2O6 = null;
        this.Ca81ebIan1u = null;
        h3jnZRsdwYJfY9UhQCkbvWciwvFHv(false);
    }

    @Override // android.view.Menu
    public final void close() {
        V57tEvNfxZVVcOCAOih5PKr(true);
    }

    public final void f6ZQsR6bPLvvCDNXOUc(Bundle bundle) {
        int size = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((qzGH0ZhUGLEjFhdFH7Y) item.getSubMenu()).f6ZQsR6bPLvvCDNXOUc(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(M9e7PWhFYLD2lOGMker(), sparseArray);
        }
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        ArrayList arrayList = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            rkuo6pAmWq0N rkuo6pamwq0n = (rkuo6pAmWq0N) arrayList.get(i2);
            if (rkuo6pamwq0n.VxUQ9tBhpHJ2AAEDNW8sghc4m == i) {
                return rkuo6pamwq0n;
            }
            if (rkuo6pamwq0n.hasSubMenu() && (menuItemFindItem = rkuo6pamwq0n.Ca81ebIan1u.findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.get(i);
    }

    public final void h3jnZRsdwYJfY9UhQCkbvWciwvFHv(boolean z) {
        if (this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv) {
            this.pYmKDYlAmhudp = true;
            if (z) {
                this.ko09zE6UAgwkV = true;
                return;
            }
            return;
        }
        if (z) {
            this.NSjgqmGjEzuugn2SsG1mZFP = true;
            this.HzCpKshMOoaw76hFcbOVRYMeRd = true;
        }
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.vBGA6pPLqSMuYGvprl270j7;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        Irh5auREsoeV1C1RaBamlmy();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            xzFpmFD3R5K5fyU xzfpmfd3r5k5fyu = (xzFpmFD3R5K5fyU) weakReference.get();
            if (xzfpmfd3r5k5fyu == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xzfpmfd3r5k5fyu.LaeGQIruHQu81hfJldjMOQSVblH3x();
            }
        }
        TaDO7ogis3aEiWEtq();
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.q11o1hieEkZDhF1MGOZI26oZiDT) {
            return true;
        }
        ArrayList arrayList = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((rkuo6pAmWq0N) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return ZLZeBXTMq0zDztBxtRTuCHrapQ(i, keyEvent) != null;
    }

    public final void jW7EiD0YL6xkbB158jMUzhWNWb1y(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(M9e7PWhFYLD2lOGMker());
        int size = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((qzGH0ZhUGLEjFhdFH7Y) item.getSubMenu()).jW7EiD0YL6xkbB158jMUzhWNWb1y(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (menuItemFindItem = findItem(i2)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public final void ko09zE6UAgwkV(xzFpmFD3R5K5fyU xzfpmfd3r5k5fyu) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.vBGA6pPLqSMuYGvprl270j7;
        for (WeakReference weakReference : copyOnWriteArrayList) {
            xzFpmFD3R5K5fyU xzfpmfd3r5k5fyu2 = (xzFpmFD3R5K5fyU) weakReference.get();
            if (xzfpmfd3r5k5fyu2 == null || xzfpmfd3r5k5fyu2 == xzfpmfd3r5k5fyu) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    public boolean p59rPv72J9() {
        return this.V57tEvNfxZVVcOCAOih5PKr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean pYmKDYlAmhudp(android.view.MenuItem r7, com.vdodsodjsdt.xzFpmFD3R5K5fyU r8, int r9) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.Stuu2Qyz6BSCKFEomt5b51vUnV1HQ.pYmKDYlAmhudp(android.view.MenuItem, com.vdodsodjsdt.xzFpmFD3R5K5fyU, int):boolean");
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return pYmKDYlAmhudp(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        rkuo6pAmWq0N rkuo6pamwq0nZLZeBXTMq0zDztBxtRTuCHrapQ = ZLZeBXTMq0zDztBxtRTuCHrapQ(i, keyEvent);
        boolean zPYmKDYlAmhudp = rkuo6pamwq0nZLZeBXTMq0zDztBxtRTuCHrapQ != null ? pYmKDYlAmhudp(rkuo6pamwq0nZLZeBXTMq0zDztBxtRTuCHrapQ, null, i2) : false;
        if ((i2 & 2) != 0) {
            V57tEvNfxZVVcOCAOih5PKr(true);
        }
        return zPYmKDYlAmhudp;
    }

    public boolean q1wNbhk2O6() {
        return this.Irh5auREsoeV1C1RaBamlmy;
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((rkuo6pAmWq0N) arrayList.get(i3)).zzpBGItXfub0yWj == i) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((rkuo6pAmWq0N) arrayList.get(i3)).zzpBGItXfub0yWj != i) {
                    break;
                }
                if (i3 >= 0 && i3 < arrayList.size()) {
                    arrayList.remove(i3);
                }
                i2 = i4;
            }
            h3jnZRsdwYJfY9UhQCkbvWciwvFHv(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((rkuo6pAmWq0N) arrayList.get(i2)).VxUQ9tBhpHJ2AAEDNW8sghc4m == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i2);
        h3jnZRsdwYJfY9UhQCkbvWciwvFHv(true);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            rkuo6pAmWq0N rkuo6pamwq0n = (rkuo6pAmWq0N) arrayList.get(i2);
            if (rkuo6pamwq0n.zzpBGItXfub0yWj == i) {
                rkuo6pamwq0n.q11o1hieEkZDhF1MGOZI26oZiDT = (rkuo6pamwq0n.q11o1hieEkZDhF1MGOZI26oZiDT & (-5)) | (z2 ? 4 : 0);
                rkuo6pamwq0n.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.Irh5auREsoeV1C1RaBamlmy = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            rkuo6pAmWq0N rkuo6pamwq0n = (rkuo6pAmWq0N) arrayList.get(i2);
            if (rkuo6pamwq0n.zzpBGItXfub0yWj == i) {
                rkuo6pamwq0n.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        ArrayList arrayList = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            rkuo6pAmWq0N rkuo6pamwq0n = (rkuo6pAmWq0N) arrayList.get(i2);
            if (rkuo6pamwq0n.zzpBGItXfub0yWj == i) {
                int i3 = rkuo6pamwq0n.q11o1hieEkZDhF1MGOZI26oZiDT;
                int i4 = (i3 & (-9)) | (z ? 0 : 8);
                rkuo6pamwq0n.q11o1hieEkZDhF1MGOZI26oZiDT = i4;
                if (i3 != i4) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            h3jnZRsdwYJfY9UhQCkbvWciwvFHv(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.V57tEvNfxZVVcOCAOih5PKr = z;
        h3jnZRsdwYJfY9UhQCkbvWciwvFHv(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.size();
    }

    public final void vBGA6pPLqSMuYGvprl270j7(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.Ca81ebIan1u = view;
            this.q1wNbhk2O6 = null;
            this.p59rPv72J9 = null;
        } else {
            if (i > 0) {
                this.q1wNbhk2O6 = this.zzpBGItXfub0yWj.getText(i);
            } else if (charSequence != null) {
                this.q1wNbhk2O6 = charSequence;
            }
            if (i2 > 0) {
                this.p59rPv72J9 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.getDrawable(i2);
            } else if (drawable != null) {
                this.p59rPv72J9 = drawable;
            }
            this.Ca81ebIan1u = null;
        }
        h3jnZRsdwYJfY9UhQCkbvWciwvFHv(false);
    }

    public boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE(rkuo6pAmWq0N rkuo6pamwq0n) {
        CopyOnWriteArrayList<WeakReference> copyOnWriteArrayList = this.vBGA6pPLqSMuYGvprl270j7;
        boolean zM9e7PWhFYLD2lOGMker = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Irh5auREsoeV1C1RaBamlmy();
        for (WeakReference weakReference : copyOnWriteArrayList) {
            xzFpmFD3R5K5fyU xzfpmfd3r5k5fyu = (xzFpmFD3R5K5fyU) weakReference.get();
            if (xzfpmfd3r5k5fyu != null) {
                zM9e7PWhFYLD2lOGMker = xzfpmfd3r5k5fyu.M9e7PWhFYLD2lOGMker(rkuo6pamwq0n);
                if (zM9e7PWhFYLD2lOGMker) {
                    break;
                }
            } else {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        TaDO7ogis3aEiWEtq();
        if (zM9e7PWhFYLD2lOGMker) {
            this.TaDO7ogis3aEiWEtq = rkuo6pamwq0n;
        }
        return zM9e7PWhFYLD2lOGMker;
    }

    public final void zzpBGItXfub0yWj(xzFpmFD3R5K5fyU xzfpmfd3r5k5fyu, Context context) {
        this.vBGA6pPLqSMuYGvprl270j7.add(new WeakReference(xzfpmfd3r5k5fyu));
        xzfpmfd3r5k5fyu.ZLZeBXTMq0zDztBxtRTuCHrapQ(context, this);
        this.HzCpKshMOoaw76hFcbOVRYMeRd = true;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return VxUQ9tBhpHJ2AAEDNW8sghc4m(0, 0, 0, this.zzpBGItXfub0yWj.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.zzpBGItXfub0yWj.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return VxUQ9tBhpHJ2AAEDNW8sghc4m(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        rkuo6pAmWq0N rkuo6pamwq0nVxUQ9tBhpHJ2AAEDNW8sghc4m = VxUQ9tBhpHJ2AAEDNW8sghc4m(i, i2, i3, charSequence);
        qzGH0ZhUGLEjFhdFH7Y qzgh0zhuglejfhdfh7y = new qzGH0ZhUGLEjFhdFH7Y(this.VxUQ9tBhpHJ2AAEDNW8sghc4m, this, rkuo6pamwq0nVxUQ9tBhpHJ2AAEDNW8sghc4m);
        rkuo6pamwq0nVxUQ9tBhpHJ2AAEDNW8sghc4m.Ca81ebIan1u = qzgh0zhuglejfhdfh7y;
        qzgh0zhuglejfhdfh7y.setHeaderTitle(rkuo6pamwq0nVxUQ9tBhpHJ2AAEDNW8sghc4m.LaeGQIruHQu81hfJldjMOQSVblH3x);
        return qzgh0zhuglejfhdfh7y;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return VxUQ9tBhpHJ2AAEDNW8sghc4m(i, i2, i3, this.zzpBGItXfub0yWj.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.zzpBGItXfub0yWj.getString(i4));
    }

    public Stuu2Qyz6BSCKFEomt5b51vUnV1HQ HzCpKshMOoaw76hFcbOVRYMeRd() {
        return this;
    }
}
