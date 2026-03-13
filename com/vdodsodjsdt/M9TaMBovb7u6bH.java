package com.vdodsodjsdt;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class M9TaMBovb7u6bH extends GEjyy5i3b4KJYgsmKOT {
    public static final PathInterpolator LaeGQIruHQu81hfJldjMOQSVblH3x = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final aAAXOJC11DloKmCeUHYKJBh zIvmSL0wzmmKGc3X39b2Gw2mUGE = new aAAXOJC11DloKmCeUHYKJBh();
    public static final DecelerateInterpolator ZLZeBXTMq0zDztBxtRTuCHrapQ = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator NSjgqmGjEzuugn2SsG1mZFP = new AccelerateInterpolator(1.5f);

    public static WindowInsets GI83zq0G8e7zkn(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static void LaeGQIruHQu81hfJldjMOQSVblH3x(View view) {
        hEzujSQMPyLOvX hezujsqmpylovxM9e7PWhFYLD2lOGMker = M9e7PWhFYLD2lOGMker(view);
        if (hezujsqmpylovxM9e7PWhFYLD2lOGMker != null) {
            ((View) hezujsqmpylovxM9e7PWhFYLD2lOGMker.ZLZeBXTMq0zDztBxtRTuCHrapQ).setTranslationY(0.0f);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                LaeGQIruHQu81hfJldjMOQSVblH3x(viewGroup.getChildAt(i));
            }
        }
    }

    public static hEzujSQMPyLOvX M9e7PWhFYLD2lOGMker(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof hYBX8vZiJlAsljhv3) {
            return ((hYBX8vZiJlAsljhv3) tag).VxUQ9tBhpHJ2AAEDNW8sghc4m;
        }
        return null;
    }

    public static void NSjgqmGjEzuugn2SsG1mZFP(View view, o0x3OWMw3He o0x3owmw3he) {
        hEzujSQMPyLOvX hezujsqmpylovxM9e7PWhFYLD2lOGMker = M9e7PWhFYLD2lOGMker(view);
        if (hezujsqmpylovxM9e7PWhFYLD2lOGMker != null) {
            View view2 = (View) hezujsqmpylovxM9e7PWhFYLD2lOGMker.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            int[] iArr = (int[]) hezujsqmpylovxM9e7PWhFYLD2lOGMker.NSjgqmGjEzuugn2SsG1mZFP;
            view2.getLocationOnScreen(iArr);
            int i = hezujsqmpylovxM9e7PWhFYLD2lOGMker.LaeGQIruHQu81hfJldjMOQSVblH3x - iArr[1];
            hezujsqmpylovxM9e7PWhFYLD2lOGMker.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i;
            view2.setTranslationY(i);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                NSjgqmGjEzuugn2SsG1mZFP(viewGroup.getChildAt(i2), o0x3owmw3he);
            }
        }
    }

    public static void ZLZeBXTMq0zDztBxtRTuCHrapQ(View view, pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqq, List list) {
        hEzujSQMPyLOvX hezujsqmpylovxM9e7PWhFYLD2lOGMker = M9e7PWhFYLD2lOGMker(view);
        if (hezujsqmpylovxM9e7PWhFYLD2lOGMker != null) {
            hezujsqmpylovxM9e7PWhFYLD2lOGMker.VxUQ9tBhpHJ2AAEDNW8sghc4m(pmjh8rqwiwrth8coqq, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                ZLZeBXTMq0zDztBxtRTuCHrapQ(viewGroup.getChildAt(i), pmjh8rqwiwrth8coqq, list);
            }
        }
    }

    public static void zIvmSL0wzmmKGc3X39b2Gw2mUGE(View view, pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqq, boolean z) {
        hEzujSQMPyLOvX hezujsqmpylovxM9e7PWhFYLD2lOGMker = M9e7PWhFYLD2lOGMker(view);
        if (hezujsqmpylovxM9e7PWhFYLD2lOGMker != null) {
            hezujsqmpylovxM9e7PWhFYLD2lOGMker.ZfQNn8hdWlEQ5cR94249PDsLR = pmjh8rqwiwrth8coqq;
            if (!z) {
                View view2 = (View) hezujsqmpylovxM9e7PWhFYLD2lOGMker.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                int[] iArr = (int[]) hezujsqmpylovxM9e7PWhFYLD2lOGMker.NSjgqmGjEzuugn2SsG1mZFP;
                view2.getLocationOnScreen(iArr);
                z = true;
                hezujsqmpylovxM9e7PWhFYLD2lOGMker.LaeGQIruHQu81hfJldjMOQSVblH3x = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                zIvmSL0wzmmKGc3X39b2Gw2mUGE(viewGroup.getChildAt(i), pmjh8rqwiwrth8coqq, z);
            }
        }
    }
}
