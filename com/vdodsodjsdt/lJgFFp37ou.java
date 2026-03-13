package com.vdodsodjsdt;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class lJgFFp37ou {
    public static void GI83zq0G8e7zkn(View view, float f) {
        view.setElevation(f);
    }

    public static void HzCpKshMOoaw76hFcbOVRYMeRd(View view) {
        view.stopNestedScroll();
    }

    public static String LaeGQIruHQu81hfJldjMOQSVblH3x(View view) {
        return view.getTransitionName();
    }

    public static void M9e7PWhFYLD2lOGMker(View view, D2N8rZ8PRRcNQ9RwMeZkr d2N8rZ8PRRcNQ9RwMeZkr) {
        CJUamGZeELMbLkXE155z83aOaq cJUamGZeELMbLkXE155z83aOaq = d2N8rZ8PRRcNQ9RwMeZkr != null ? new CJUamGZeELMbLkXE155z83aOaq(view, d2N8rZ8PRRcNQ9RwMeZkr) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, cJUamGZeELMbLkXE155z83aOaq);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (cJUamGZeELMbLkXE155z83aOaq != null) {
            view.setOnApplyWindowInsetsListener(cJUamGZeELMbLkXE155z83aOaq);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    public static void NSjgqmGjEzuugn2SsG1mZFP(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static ColorStateList V57tEvNfxZVVcOCAOih5PKr(View view) {
        return view.getBackgroundTintList();
    }

    public static void VxUQ9tBhpHJ2AAEDNW8sghc4m(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static void ZLZeBXTMq0zDztBxtRTuCHrapQ(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static PorterDuff.Mode ZfQNn8hdWlEQ5cR94249PDsLR(View view) {
        return view.getBackgroundTintMode();
    }

    public static float zIvmSL0wzmmKGc3X39b2Gw2mUGE(View view) {
        return view.getZ();
    }

    public static pmJH8rqWIwRth8COqq zzpBGItXfub0yWj(View view, pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqq, Rect rect) {
        WindowInsets windowInsetsZIvmSL0wzmmKGc3X39b2Gw2mUGE = pmjh8rqwiwrth8coqq.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        if (windowInsetsZIvmSL0wzmmKGc3X39b2Gw2mUGE != null) {
            return pmJH8rqWIwRth8COqq.ZLZeBXTMq0zDztBxtRTuCHrapQ(view, view.computeSystemWindowInsets(windowInsetsZIvmSL0wzmmKGc3X39b2Gw2mUGE, rect));
        }
        rect.setEmpty();
        return pmjh8rqwiwrth8coqq;
    }
}
