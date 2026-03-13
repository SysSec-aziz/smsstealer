package com.vdodsodjsdt;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class OHRoAMjK5gn3 {
    public static boolean LaeGQIruHQu81hfJldjMOQSVblH3x(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static Object V57tEvNfxZVVcOCAOih5PKr(String str, Bundle bundle) {
        return bundle.getParcelable(str, zHpcvbo7P2.class);
    }

    public static OnBackInvokedDispatcher VxUQ9tBhpHJ2AAEDNW8sghc4m(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
        return onBackInvokedDispatcher;
    }

    public static void ZLZeBXTMq0zDztBxtRTuCHrapQ(Object obj, Object obj2) {
        ej6unYlOWMDF.pYmKDYlAmhudp(obj, "dispatcher");
        ej6unYlOWMDF.pYmKDYlAmhudp(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }

    public static String ZfQNn8hdWlEQ5cR94249PDsLR(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static void zIvmSL0wzmmKGc3X39b2Gw2mUGE(Object obj, Object obj2) {
        ej6unYlOWMDF.pYmKDYlAmhudp(obj, "dispatcher");
        ej6unYlOWMDF.pYmKDYlAmhudp(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(0, (OnBackInvokedCallback) obj2);
    }

    public static PackageInfo zzpBGItXfub0yWj(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }
}
