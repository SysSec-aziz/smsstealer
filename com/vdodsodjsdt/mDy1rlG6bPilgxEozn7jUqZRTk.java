package com.vdodsodjsdt;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class mDy1rlG6bPilgxEozn7jUqZRTk implements ActionMode.Callback {
    public boolean LaeGQIruHQu81hfJldjMOQSVblH3x;
    public Class V57tEvNfxZVVcOCAOih5PKr;
    public final ActionMode.Callback VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public Method ZfQNn8hdWlEQ5cR94249PDsLR;
    public boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE = false;
    public final TextView zzpBGItXfub0yWj;

    public mDy1rlG6bPilgxEozn7jUqZRTk(ActionMode.Callback callback, TextView textView) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = callback;
        this.zzpBGItXfub0yWj = textView;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.onDestroyActionMode(actionMode);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        String str;
        TextView textView = this.zzpBGItXfub0yWj;
        Context context = textView.getContext();
        PackageManager packageManager = context.getPackageManager();
        boolean z = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        Class cls = Integer.TYPE;
        if (!z) {
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = true;
            try {
                Class<?> cls2 = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.V57tEvNfxZVVcOCAOih5PKr = cls2;
                this.ZfQNn8hdWlEQ5cR94249PDsLR = cls2.getDeclaredMethod("removeItemAt", cls);
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = true;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                this.V57tEvNfxZVVcOCAOih5PKr = null;
                this.ZfQNn8hdWlEQ5cR94249PDsLR = null;
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = false;
            }
        }
        try {
            Method declaredMethod = (this.LaeGQIruHQu81hfJldjMOQSVblH3x && this.V57tEvNfxZVVcOCAOih5PKr.isInstance(menu)) ? this.ZfQNn8hdWlEQ5cR94249PDsLR : menu.getClass().getDeclaredMethod("removeItemAt", cls);
            for (int size = menu.size() - 1; size >= 0; size--) {
                MenuItem item = menu.getItem(size);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    declaredMethod.invoke(menu, Integer.valueOf(size));
                }
            }
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                    if (!context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                        }
                    }
                    arrayList.add(resolveInfo);
                }
            }
            for (int i = 0; i < arrayList.size(); i++) {
                ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i);
                MenuItem menuItemAdd = menu.add(0, 0, i + 100, resolveInfo2.loadLabel(packageManager));
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()));
                ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                menuItemAdd.setIntent(intentPutExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.onPrepareActionMode(actionMode, menu);
    }
}
