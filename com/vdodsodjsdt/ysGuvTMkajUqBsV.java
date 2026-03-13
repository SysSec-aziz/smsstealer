package com.vdodsodjsdt;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class ysGuvTMkajUqBsV extends Fragment {
    public static final /* synthetic */ int ZfQNn8hdWlEQ5cR94249PDsLR = 0;
    public qF22Y620JkFyombtDYw0h0h8Rxpja V57tEvNfxZVVcOCAOih5PKr;

    /* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
    public static final class iVKrTMqOw0TqCeNN implements Application.ActivityLifecycleCallbacks {
        public static final y80dnoYcoRgkwJymVT5ZK7OeVWFW Companion = new y80dnoYcoRgkwJymVT5ZK7OeVWFW();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            ej6unYlOWMDF.pYmKDYlAmhudp(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new iVKrTMqOw0TqCeNN());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            ej6unYlOWMDF.pYmKDYlAmhudp(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            ej6unYlOWMDF.pYmKDYlAmhudp(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            ej6unYlOWMDF.pYmKDYlAmhudp(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            ej6unYlOWMDF.pYmKDYlAmhudp(activity, "activity");
            int i = ysGuvTMkajUqBsV.ZfQNn8hdWlEQ5cR94249PDsLR;
            kSBtmjC64B6O.VxUQ9tBhpHJ2AAEDNW8sghc4m(activity, XOTOHmUA5NYhlyOBh7.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            ej6unYlOWMDF.pYmKDYlAmhudp(activity, "activity");
            int i = ysGuvTMkajUqBsV.ZfQNn8hdWlEQ5cR94249PDsLR;
            kSBtmjC64B6O.VxUQ9tBhpHJ2AAEDNW8sghc4m(activity, XOTOHmUA5NYhlyOBh7.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            ej6unYlOWMDF.pYmKDYlAmhudp(activity, "activity");
            int i = ysGuvTMkajUqBsV.ZfQNn8hdWlEQ5cR94249PDsLR;
            kSBtmjC64B6O.VxUQ9tBhpHJ2AAEDNW8sghc4m(activity, XOTOHmUA5NYhlyOBh7.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            ej6unYlOWMDF.pYmKDYlAmhudp(activity, "activity");
            int i = ysGuvTMkajUqBsV.ZfQNn8hdWlEQ5cR94249PDsLR;
            kSBtmjC64B6O.VxUQ9tBhpHJ2AAEDNW8sghc4m(activity, XOTOHmUA5NYhlyOBh7.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            ej6unYlOWMDF.pYmKDYlAmhudp(activity, "activity");
            int i = ysGuvTMkajUqBsV.ZfQNn8hdWlEQ5cR94249PDsLR;
            kSBtmjC64B6O.VxUQ9tBhpHJ2AAEDNW8sghc4m(activity, XOTOHmUA5NYhlyOBh7.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            ej6unYlOWMDF.pYmKDYlAmhudp(activity, "activity");
            int i = ysGuvTMkajUqBsV.ZfQNn8hdWlEQ5cR94249PDsLR;
            kSBtmjC64B6O.VxUQ9tBhpHJ2AAEDNW8sghc4m(activity, XOTOHmUA5NYhlyOBh7.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            ej6unYlOWMDF.pYmKDYlAmhudp(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            ej6unYlOWMDF.pYmKDYlAmhudp(activity, "activity");
            ej6unYlOWMDF.pYmKDYlAmhudp(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            ej6unYlOWMDF.pYmKDYlAmhudp(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            ej6unYlOWMDF.pYmKDYlAmhudp(activity, "activity");
        }
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(XOTOHmUA5NYhlyOBh7 xOTOHmUA5NYhlyOBh7) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(activity, "activity");
            kSBtmjC64B6O.VxUQ9tBhpHJ2AAEDNW8sghc4m(activity, xOTOHmUA5NYhlyOBh7);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        VxUQ9tBhpHJ2AAEDNW8sghc4m(XOTOHmUA5NYhlyOBh7.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        VxUQ9tBhpHJ2AAEDNW8sghc4m(XOTOHmUA5NYhlyOBh7.ON_DESTROY);
        this.V57tEvNfxZVVcOCAOih5PKr = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        VxUQ9tBhpHJ2AAEDNW8sghc4m(XOTOHmUA5NYhlyOBh7.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        qF22Y620JkFyombtDYw0h0h8Rxpja qf22y620jkfyombtdyw0h0h8rxpja = this.V57tEvNfxZVVcOCAOih5PKr;
        if (qf22y620jkfyombtdyw0h0h8rxpja != null) {
            ((L5b7xJ7pyIi2fN6Tbs) qf22y620jkfyombtdyw0h0h8rxpja.V57tEvNfxZVVcOCAOih5PKr).zzpBGItXfub0yWj();
        }
        VxUQ9tBhpHJ2AAEDNW8sghc4m(XOTOHmUA5NYhlyOBh7.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        qF22Y620JkFyombtDYw0h0h8Rxpja qf22y620jkfyombtdyw0h0h8rxpja = this.V57tEvNfxZVVcOCAOih5PKr;
        if (qf22y620jkfyombtdyw0h0h8rxpja != null) {
            L5b7xJ7pyIi2fN6Tbs l5b7xJ7pyIi2fN6Tbs = (L5b7xJ7pyIi2fN6Tbs) qf22y620jkfyombtdyw0h0h8rxpja.V57tEvNfxZVVcOCAOih5PKr;
            int i = l5b7xJ7pyIi2fN6Tbs.V57tEvNfxZVVcOCAOih5PKr + 1;
            l5b7xJ7pyIi2fN6Tbs.V57tEvNfxZVVcOCAOih5PKr = i;
            if (i == 1 && l5b7xJ7pyIi2fN6Tbs.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
                l5b7xJ7pyIi2fN6Tbs.NSjgqmGjEzuugn2SsG1mZFP.ZfQNn8hdWlEQ5cR94249PDsLR(XOTOHmUA5NYhlyOBh7.ON_START);
                l5b7xJ7pyIi2fN6Tbs.zIvmSL0wzmmKGc3X39b2Gw2mUGE = false;
            }
        }
        VxUQ9tBhpHJ2AAEDNW8sghc4m(XOTOHmUA5NYhlyOBh7.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        VxUQ9tBhpHJ2AAEDNW8sghc4m(XOTOHmUA5NYhlyOBh7.ON_STOP);
    }
}
