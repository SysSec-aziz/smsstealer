package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xb0r6yEzq0tw9m7nTWG5BFR8 {
    public static boolean V57tEvNfxZVVcOCAOih5PKr = false;
    public static WeakHashMap VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public static Field zzpBGItXfub0yWj;
    public static final int[] ZfQNn8hdWlEQ5cR94249PDsLR = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final bvUsAjfAzqPhVZDI LaeGQIruHQu81hfJldjMOQSVblH3x = new bvUsAjfAzqPhVZDI();
    public static final Z2huc6vXu9f zIvmSL0wzmmKGc3X39b2Gw2mUGE = new Z2huc6vXu9f();

    /* JADX WARN: Multi-variable type inference failed */
    public static u4GJTAMGthCvBFOcZhx3psAaG8l GI83zq0G8e7zkn(View view, u4GJTAMGthCvBFOcZhx3psAaG8l u4gjtamgthcvbfoczhx3psaag8l) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + u4gjtamgthcvbfoczhx3psaag8l + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return vRz9B1tBN7p53rz4DxjkNzIt.zzpBGItXfub0yWj(view, u4gjtamgthcvbfoczhx3psaag8l);
        }
        hsI9793AT3Mcf111PBKEkFcs hsi9793at3mcf111pbkekfcs = (hsI9793AT3Mcf111PBKEkFcs) view.getTag(R.id.tag_on_receive_content_listener);
        cVUZ9g8sifbBlesZ0YuALdjSyKEN cvuz9g8sifbblesz0yualdjsyken = LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (hsi9793at3mcf111pbkekfcs == null) {
            if (view instanceof cVUZ9g8sifbBlesZ0YuALdjSyKEN) {
                cvuz9g8sifbblesz0yualdjsyken = (cVUZ9g8sifbBlesZ0YuALdjSyKEN) view;
            }
            return cvuz9g8sifbblesz0yualdjsyken.VxUQ9tBhpHJ2AAEDNW8sghc4m(u4gjtamgthcvbfoczhx3psaag8l);
        }
        u4GJTAMGthCvBFOcZhx3psAaG8l u4gjtamgthcvbfoczhx3psaag8lVxUQ9tBhpHJ2AAEDNW8sghc4m = hsI9793AT3Mcf111PBKEkFcs.VxUQ9tBhpHJ2AAEDNW8sghc4m(view, u4gjtamgthcvbfoczhx3psaag8l);
        if (u4gjtamgthcvbfoczhx3psaag8lVxUQ9tBhpHJ2AAEDNW8sghc4m == null) {
            return null;
        }
        if (view instanceof cVUZ9g8sifbBlesZ0YuALdjSyKEN) {
            cvuz9g8sifbblesz0yualdjsyken = (cVUZ9g8sifbBlesZ0YuALdjSyKEN) view;
        }
        return cvuz9g8sifbblesz0yualdjsyken.VxUQ9tBhpHJ2AAEDNW8sghc4m(u4gjtamgthcvbfoczhx3psaag8lVxUQ9tBhpHJ2AAEDNW8sghc4m);
    }

    public static void HzCpKshMOoaw76hFcbOVRYMeRd(View view, jj77w443kpEYEOqOOio jj77w443kpeyeoqooio, l84brpRrcI8X30BdJPQkPqvLG l84brprrci8x30bdjpqkpqvlg) {
        jj77w443kpEYEOqOOio jj77w443kpeyeoqooio2 = new jj77w443kpEYEOqOOio(null, jj77w443kpeyeoqooio.zzpBGItXfub0yWj, null, l84brprrci8x30bdjpqkpqvlg, jj77w443kpeyeoqooio.V57tEvNfxZVVcOCAOih5PKr);
        View.AccessibilityDelegate accessibilityDelegateZfQNn8hdWlEQ5cR94249PDsLR = ZfQNn8hdWlEQ5cR94249PDsLR(view);
        dOYOTnFcxbQY9kd8M4lnq doyotnfcxbqy9kd8m4lnq = accessibilityDelegateZfQNn8hdWlEQ5cR94249PDsLR == null ? null : accessibilityDelegateZfQNn8hdWlEQ5cR94249PDsLR instanceof BNoQqrcMvME0Kvh0ZlMVKK2 ? ((BNoQqrcMvME0Kvh0ZlMVKK2) accessibilityDelegateZfQNn8hdWlEQ5cR94249PDsLR).VxUQ9tBhpHJ2AAEDNW8sghc4m : new dOYOTnFcxbQY9kd8M4lnq(accessibilityDelegateZfQNn8hdWlEQ5cR94249PDsLR);
        if (doyotnfcxbqy9kd8m4lnq == null) {
            doyotnfcxbqy9kd8m4lnq = new dOYOTnFcxbQY9kd8M4lnq();
        }
        q1wNbhk2O6(view, doyotnfcxbqy9kd8m4lnq);
        M9e7PWhFYLD2lOGMker(view, jj77w443kpeyeoqooio2.VxUQ9tBhpHJ2AAEDNW8sghc4m());
        zIvmSL0wzmmKGc3X39b2Gw2mUGE(view).add(jj77w443kpeyeoqooio2);
        NSjgqmGjEzuugn2SsG1mZFP(view, 0);
    }

    public static void KUYypEB4eNWOZWVDpH(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            xVBDeJymxvKptildZyKvN.zzpBGItXfub0yWj(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static CharSequence LaeGQIruHQu81hfJldjMOQSVblH3x(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = Q55Zxcgh4evtHu7g7qq.VxUQ9tBhpHJ2AAEDNW8sghc4m(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static void M9e7PWhFYLD2lOGMker(View view, int i) {
        ArrayList arrayListZIvmSL0wzmmKGc3X39b2Gw2mUGE = zIvmSL0wzmmKGc3X39b2Gw2mUGE(view);
        for (int i2 = 0; i2 < arrayListZIvmSL0wzmmKGc3X39b2Gw2mUGE.size(); i2++) {
            if (((jj77w443kpEYEOqOOio) arrayListZIvmSL0wzmmKGc3X39b2Gw2mUGE.get(i2)).VxUQ9tBhpHJ2AAEDNW8sghc4m() == i) {
                arrayListZIvmSL0wzmmKGc3X39b2Gw2mUGE.remove(i2);
                return;
            }
        }
    }

    public static void NSjgqmGjEzuugn2SsG1mZFP(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = LaeGQIruHQu81hfJldjMOQSVblH3x(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(LaeGQIruHQu81hfJldjMOQSVblH3x(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(LaeGQIruHQu81hfJldjMOQSVblH3x(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static boolean V57tEvNfxZVVcOCAOih5PKr(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = GdqWnDxkSxbN8kinzSHUlryQn0WM.ZfQNn8hdWlEQ5cR94249PDsLR;
        GdqWnDxkSxbN8kinzSHUlryQn0WM gdqWnDxkSxbN8kinzSHUlryQn0WM = (GdqWnDxkSxbN8kinzSHUlryQn0WM) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (gdqWnDxkSxbN8kinzSHUlryQn0WM == null) {
            gdqWnDxkSxbN8kinzSHUlryQn0WM = new GdqWnDxkSxbN8kinzSHUlryQn0WM();
            gdqWnDxkSxbN8kinzSHUlryQn0WM.VxUQ9tBhpHJ2AAEDNW8sghc4m = null;
            gdqWnDxkSxbN8kinzSHUlryQn0WM.zzpBGItXfub0yWj = null;
            gdqWnDxkSxbN8kinzSHUlryQn0WM.V57tEvNfxZVVcOCAOih5PKr = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, gdqWnDxkSxbN8kinzSHUlryQn0WM);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = gdqWnDxkSxbN8kinzSHUlryQn0WM.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = GdqWnDxkSxbN8kinzSHUlryQn0WM.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (gdqWnDxkSxbN8kinzSHUlryQn0WM.VxUQ9tBhpHJ2AAEDNW8sghc4m == null) {
                            gdqWnDxkSxbN8kinzSHUlryQn0WM.VxUQ9tBhpHJ2AAEDNW8sghc4m = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = GdqWnDxkSxbN8kinzSHUlryQn0WM.ZfQNn8hdWlEQ5cR94249PDsLR;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                gdqWnDxkSxbN8kinzSHUlryQn0WM.VxUQ9tBhpHJ2AAEDNW8sghc4m.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    gdqWnDxkSxbN8kinzSHUlryQn0WM.VxUQ9tBhpHJ2AAEDNW8sghc4m.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View viewVxUQ9tBhpHJ2AAEDNW8sghc4m = gdqWnDxkSxbN8kinzSHUlryQn0WM.VxUQ9tBhpHJ2AAEDNW8sghc4m(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewVxUQ9tBhpHJ2AAEDNW8sghc4m != null && !KeyEvent.isModifierKey(keyCode)) {
                if (gdqWnDxkSxbN8kinzSHUlryQn0WM.zzpBGItXfub0yWj == null) {
                    gdqWnDxkSxbN8kinzSHUlryQn0WM.zzpBGItXfub0yWj = new SparseArray();
                }
                gdqWnDxkSxbN8kinzSHUlryQn0WM.zzpBGItXfub0yWj.put(keyCode, new WeakReference(viewVxUQ9tBhpHJ2AAEDNW8sghc4m));
            }
        }
        return viewVxUQ9tBhpHJ2AAEDNW8sghc4m != null;
    }

    public static d9uIUa0qhR0HmxFMet VxUQ9tBhpHJ2AAEDNW8sghc4m(View view) {
        if (VxUQ9tBhpHJ2AAEDNW8sghc4m == null) {
            VxUQ9tBhpHJ2AAEDNW8sghc4m = new WeakHashMap();
        }
        d9uIUa0qhR0HmxFMet d9uiua0qhr0hmxfmet = (d9uIUa0qhR0HmxFMet) VxUQ9tBhpHJ2AAEDNW8sghc4m.get(view);
        if (d9uiua0qhr0hmxfmet != null) {
            return d9uiua0qhr0hmxfmet;
        }
        d9uIUa0qhR0HmxFMet d9uiua0qhr0hmxfmet2 = new d9uIUa0qhR0HmxFMet(view);
        VxUQ9tBhpHJ2AAEDNW8sghc4m.put(view, d9uiua0qhr0hmxfmet2);
        return d9uiua0qhr0hmxfmet2;
    }

    public static String[] ZLZeBXTMq0zDztBxtRTuCHrapQ(LTYn6OpnC6Fo lTYn6OpnC6Fo) {
        return Build.VERSION.SDK_INT >= 31 ? vRz9B1tBN7p53rz4DxjkNzIt.VxUQ9tBhpHJ2AAEDNW8sghc4m(lTYn6OpnC6Fo) : (String[]) lTYn6OpnC6Fo.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static View.AccessibilityDelegate ZfQNn8hdWlEQ5cR94249PDsLR(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return xVBDeJymxvKptildZyKvN.VxUQ9tBhpHJ2AAEDNW8sghc4m(view);
        }
        if (V57tEvNfxZVVcOCAOih5PKr) {
            return null;
        }
        if (zzpBGItXfub0yWj == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                zzpBGItXfub0yWj = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                V57tEvNfxZVVcOCAOih5PKr = true;
                return null;
            }
        }
        try {
            Object obj = zzpBGItXfub0yWj.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            V57tEvNfxZVVcOCAOih5PKr = true;
            return null;
        }
    }

    public static void p59rPv72J9(View view, CharSequence charSequence) {
        new Ascu2Zs7kzyKFeFdmA(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).zIvmSL0wzmmKGc3X39b2Gw2mUGE(view, charSequence);
        Z2huc6vXu9f z2huc6vXu9f = zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (charSequence == null) {
            z2huc6vXu9f.V57tEvNfxZVVcOCAOih5PKr.remove(view);
            view.removeOnAttachStateChangeListener(z2huc6vXu9f);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(z2huc6vXu9f);
        } else {
            z2huc6vXu9f.V57tEvNfxZVVcOCAOih5PKr.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(z2huc6vXu9f);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(z2huc6vXu9f);
            }
        }
    }

    public static void q1wNbhk2O6(View view, dOYOTnFcxbQY9kd8M4lnq doyotnfcxbqy9kd8m4lnq) {
        if (doyotnfcxbqy9kd8m4lnq == null && (ZfQNn8hdWlEQ5cR94249PDsLR(view) instanceof BNoQqrcMvME0Kvh0ZlMVKK2)) {
            doyotnfcxbqy9kd8m4lnq = new dOYOTnFcxbQY9kd8M4lnq();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(doyotnfcxbqy9kd8m4lnq == null ? null : doyotnfcxbqy9kd8m4lnq.zzpBGItXfub0yWj);
    }

    public static ArrayList zIvmSL0wzmmKGc3X39b2Gw2mUGE(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static void zzpBGItXfub0yWj(View view, pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqq) {
        int i = Build.VERSION.SDK_INT;
        WindowInsets windowInsetsZIvmSL0wzmmKGc3X39b2Gw2mUGE = pmjh8rqwiwrth8coqq.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        if (windowInsetsZIvmSL0wzmmKGc3X39b2Gw2mUGE != null) {
            WindowInsets windowInsetsVxUQ9tBhpHJ2AAEDNW8sghc4m = i >= 30 ? pW4oXDbPFe7lyly7BStqQEdWZff.VxUQ9tBhpHJ2AAEDNW8sghc4m(view, windowInsetsZIvmSL0wzmmKGc3X39b2Gw2mUGE) : UFStPSj5DrcqcfR2RymfmG.VxUQ9tBhpHJ2AAEDNW8sghc4m(view, windowInsetsZIvmSL0wzmmKGc3X39b2Gw2mUGE);
            if (windowInsetsVxUQ9tBhpHJ2AAEDNW8sghc4m.equals(windowInsetsZIvmSL0wzmmKGc3X39b2Gw2mUGE)) {
                return;
            }
            pmJH8rqWIwRth8COqq.ZLZeBXTMq0zDztBxtRTuCHrapQ(view, windowInsetsVxUQ9tBhpHJ2AAEDNW8sghc4m);
        }
    }
}
