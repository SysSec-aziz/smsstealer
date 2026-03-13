package com.vdodsodjsdt;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class y4cYNyrJZVDngci implements Application.ActivityLifecycleCallbacks {
    public final int V57tEvNfxZVVcOCAOih5PKr;
    public Object VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public Activity zzpBGItXfub0yWj;
    public boolean ZfQNn8hdWlEQ5cR94249PDsLR = false;
    public boolean LaeGQIruHQu81hfJldjMOQSVblH3x = false;
    public boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE = false;

    public y4cYNyrJZVDngci(Activity activity) {
        this.zzpBGItXfub0yWj = activity;
        this.V57tEvNfxZVVcOCAOih5PKr = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.zzpBGItXfub0yWj == activity) {
            this.zzpBGItXfub0yWj = null;
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.LaeGQIruHQu81hfJldjMOQSVblH3x || this.zIvmSL0wzmmKGc3X39b2Gw2mUGE || this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            return;
        }
        Object obj = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        try {
            Object obj2 = QqrV3Oj6DsM69UhUe.V57tEvNfxZVVcOCAOih5PKr.get(activity);
            if (obj2 == obj && activity.hashCode() == this.V57tEvNfxZVVcOCAOih5PKr) {
                QqrV3Oj6DsM69UhUe.ZLZeBXTMq0zDztBxtRTuCHrapQ.postAtFrontOfQueue(new gZVesoHrfMaGvAvfBsRIr(QqrV3Oj6DsM69UhUe.zzpBGItXfub0yWj.get(activity), obj2, 3, false));
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = true;
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.zzpBGItXfub0yWj == activity) {
            this.ZfQNn8hdWlEQ5cR94249PDsLR = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
