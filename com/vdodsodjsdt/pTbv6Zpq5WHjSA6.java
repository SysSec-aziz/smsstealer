package com.vdodsodjsdt;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class pTbv6Zpq5WHjSA6 extends XqqYva3VHpagizhXXDcLyCeRiI {
    final /* synthetic */ L5b7xJ7pyIi2fN6Tbs this$0;

    /* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
    public static final class iVKrTMqOw0TqCeNN extends XqqYva3VHpagizhXXDcLyCeRiI {
        final /* synthetic */ L5b7xJ7pyIi2fN6Tbs this$0;

        public iVKrTMqOw0TqCeNN(L5b7xJ7pyIi2fN6Tbs l5b7xJ7pyIi2fN6Tbs) {
            this.this$0 = l5b7xJ7pyIi2fN6Tbs;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            ej6unYlOWMDF.pYmKDYlAmhudp(activity, "activity");
            this.this$0.zzpBGItXfub0yWj();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            ej6unYlOWMDF.pYmKDYlAmhudp(activity, "activity");
            L5b7xJ7pyIi2fN6Tbs l5b7xJ7pyIi2fN6Tbs = this.this$0;
            int i = l5b7xJ7pyIi2fN6Tbs.V57tEvNfxZVVcOCAOih5PKr + 1;
            l5b7xJ7pyIi2fN6Tbs.V57tEvNfxZVVcOCAOih5PKr = i;
            if (i == 1 && l5b7xJ7pyIi2fN6Tbs.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
                l5b7xJ7pyIi2fN6Tbs.NSjgqmGjEzuugn2SsG1mZFP.ZfQNn8hdWlEQ5cR94249PDsLR(XOTOHmUA5NYhlyOBh7.ON_START);
                l5b7xJ7pyIi2fN6Tbs.zIvmSL0wzmmKGc3X39b2Gw2mUGE = false;
            }
        }
    }

    public pTbv6Zpq5WHjSA6(L5b7xJ7pyIi2fN6Tbs l5b7xJ7pyIi2fN6Tbs) {
        this.this$0 = l5b7xJ7pyIi2fN6Tbs;
    }

    @Override // com.vdodsodjsdt.XqqYva3VHpagizhXXDcLyCeRiI, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        ej6unYlOWMDF.pYmKDYlAmhudp(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = ysGuvTMkajUqBsV.ZfQNn8hdWlEQ5cR94249PDsLR;
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            ej6unYlOWMDF.Ca81ebIan1u(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((ysGuvTMkajUqBsV) fragmentFindFragmentByTag).V57tEvNfxZVVcOCAOih5PKr = this.this$0.M9e7PWhFYLD2lOGMker;
        }
    }

    @Override // com.vdodsodjsdt.XqqYva3VHpagizhXXDcLyCeRiI, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        ej6unYlOWMDF.pYmKDYlAmhudp(activity, "activity");
        L5b7xJ7pyIi2fN6Tbs l5b7xJ7pyIi2fN6Tbs = this.this$0;
        int i = l5b7xJ7pyIi2fN6Tbs.ZfQNn8hdWlEQ5cR94249PDsLR - 1;
        l5b7xJ7pyIi2fN6Tbs.ZfQNn8hdWlEQ5cR94249PDsLR = i;
        if (i == 0) {
            Handler handler = l5b7xJ7pyIi2fN6Tbs.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            ej6unYlOWMDF.p59rPv72J9(handler);
            handler.postDelayed(l5b7xJ7pyIi2fN6Tbs.GI83zq0G8e7zkn, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        ej6unYlOWMDF.pYmKDYlAmhudp(activity, "activity");
        svUK0P12EClswQZqUNy.VxUQ9tBhpHJ2AAEDNW8sghc4m(activity, new iVKrTMqOw0TqCeNN(this.this$0));
    }

    @Override // com.vdodsodjsdt.XqqYva3VHpagizhXXDcLyCeRiI, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        ej6unYlOWMDF.pYmKDYlAmhudp(activity, "activity");
        L5b7xJ7pyIi2fN6Tbs l5b7xJ7pyIi2fN6Tbs = this.this$0;
        int i = l5b7xJ7pyIi2fN6Tbs.V57tEvNfxZVVcOCAOih5PKr - 1;
        l5b7xJ7pyIi2fN6Tbs.V57tEvNfxZVVcOCAOih5PKr = i;
        if (i == 0 && l5b7xJ7pyIi2fN6Tbs.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            l5b7xJ7pyIi2fN6Tbs.NSjgqmGjEzuugn2SsG1mZFP.ZfQNn8hdWlEQ5cR94249PDsLR(XOTOHmUA5NYhlyOBh7.ON_STOP);
            l5b7xJ7pyIi2fN6Tbs.zIvmSL0wzmmKGc3X39b2Gw2mUGE = true;
        }
    }
}
