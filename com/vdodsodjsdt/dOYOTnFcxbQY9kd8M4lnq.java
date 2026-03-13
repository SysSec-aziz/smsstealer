package com.vdodsodjsdt;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class dOYOTnFcxbQY9kd8M4lnq {
    public static final View.AccessibilityDelegate V57tEvNfxZVVcOCAOih5PKr = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final BNoQqrcMvME0Kvh0ZlMVKK2 zzpBGItXfub0yWj;

    public dOYOTnFcxbQY9kd8M4lnq() {
        this(V57tEvNfxZVVcOCAOih5PKr);
    }

    public void GI83zq0G8e7zkn(View view, AccessibilityEvent accessibilityEvent) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public void LaeGQIruHQu81hfJldjMOQSVblH3x(View view, AccessibilityEvent accessibilityEvent) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void NSjgqmGjEzuugn2SsG1mZFP(View view, int i) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.sendAccessibilityEvent(view, i);
    }

    public void V57tEvNfxZVVcOCAOih5PKr(View view, AccessibilityEvent accessibilityEvent) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean VxUQ9tBhpHJ2AAEDNW8sghc4m(View view, AccessibilityEvent accessibilityEvent) {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean ZLZeBXTMq0zDztBxtRTuCHrapQ(View view, int i, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= list.size()) {
                break;
            }
            jj77w443kpEYEOqOOio jj77w443kpeyeoqooio = (jj77w443kpEYEOqOOio) list.get(i2);
            if (jj77w443kpeyeoqooio.VxUQ9tBhpHJ2AAEDNW8sghc4m() == i) {
                Class cls = jj77w443kpeyeoqooio.V57tEvNfxZVVcOCAOih5PKr;
                l84brpRrcI8X30BdJPQkPqvLG l84brprrci8x30bdjpqkpqvlg = jj77w443kpeyeoqooio.ZfQNn8hdWlEQ5cR94249PDsLR;
                if (l84brprrci8x30bdjpqkpqvlg != null) {
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e);
                        }
                    }
                    zPerformAccessibilityAction = l84brprrci8x30bdjpqkpqvlg.VxUQ9tBhpHJ2AAEDNW8sghc4m(view);
                }
            } else {
                i2++;
            }
        }
        zPerformAccessibilityAction = false;
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.performAccessibilityAction(view, i, bundle);
        }
        if (zPerformAccessibilityAction || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i4 = 0;
            while (true) {
                if (clickableSpanArr == null || i4 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i4])) {
                    clickableSpan.onClick(view);
                    z = true;
                    break;
                }
                i4++;
            }
        }
        return z;
    }

    public void ZfQNn8hdWlEQ5cR94249PDsLR(View view, wzEak8ZKpNWHd4RKPYQ wzeak8zkpnwhd4rkpyq) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.onInitializeAccessibilityNodeInfo(view, wzeak8zkpnwhd4rkpyq.VxUQ9tBhpHJ2AAEDNW8sghc4m);
    }

    public boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public Skgk8FYn8b4TvRiBOsElZw4XkNLhQ zzpBGItXfub0yWj(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(1, accessibilityNodeProvider);
        }
        return null;
    }

    public dOYOTnFcxbQY9kd8M4lnq(View.AccessibilityDelegate accessibilityDelegate) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = accessibilityDelegate;
        this.zzpBGItXfub0yWj = new BNoQqrcMvME0Kvh0ZlMVKK2(this);
    }
}
