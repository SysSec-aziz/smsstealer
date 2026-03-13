package com.vdodsodjsdt;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import com.vdodsodjsdt.ysGuvTMkajUqBsV;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kSBtmjC64B6O {
    /* JADX WARN: Multi-variable type inference failed */
    public static void VxUQ9tBhpHJ2AAEDNW8sghc4m(Activity activity, XOTOHmUA5NYhlyOBh7 xOTOHmUA5NYhlyOBh7) {
        androidx.lifecycle.iVKrTMqOw0TqCeNN ivkrtmqow0tqcennLaeGQIruHQu81hfJldjMOQSVblH3x;
        ej6unYlOWMDF.pYmKDYlAmhudp(xOTOHmUA5NYhlyOBh7, "event");
        if (!(activity instanceof hCgEybj69le8) || (ivkrtmqow0tqcennLaeGQIruHQu81hfJldjMOQSVblH3x = ((hCgEybj69le8) activity).LaeGQIruHQu81hfJldjMOQSVblH3x()) == null) {
            return;
        }
        ivkrtmqow0tqcennLaeGQIruHQu81hfJldjMOQSVblH3x.ZfQNn8hdWlEQ5cR94249PDsLR(xOTOHmUA5NYhlyOBh7);
    }

    public static void zzpBGItXfub0yWj(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            ysGuvTMkajUqBsV.iVKrTMqOw0TqCeNN.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new ysGuvTMkajUqBsV.iVKrTMqOw0TqCeNN());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new ysGuvTMkajUqBsV(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
