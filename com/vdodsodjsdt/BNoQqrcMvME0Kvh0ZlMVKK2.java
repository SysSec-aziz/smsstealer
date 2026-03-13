package com.vdodsodjsdt;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class BNoQqrcMvME0Kvh0ZlMVKK2 extends View.AccessibilityDelegate {
    public final dOYOTnFcxbQY9kd8M4lnq VxUQ9tBhpHJ2AAEDNW8sghc4m;

    public BNoQqrcMvME0Kvh0ZlMVKK2(dOYOTnFcxbQY9kd8M4lnq doyotnfcxbqy9kd8m4lnq) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = doyotnfcxbqy9kd8m4lnq;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQZzpBGItXfub0yWj = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.zzpBGItXfub0yWj(view);
        if (skgk8FYn8b4TvRiBOsElZw4XkNLhQZzpBGItXfub0yWj != null) {
            return (AccessibilityNodeProvider) skgk8FYn8b4TvRiBOsElZw4XkNLhQZzpBGItXfub0yWj.ZfQNn8hdWlEQ5cR94249PDsLR;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.V57tEvNfxZVVcOCAOih5PKr(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        Object tag2;
        Object tag3;
        int iKeyAt;
        wzEak8ZKpNWHd4RKPYQ wzeak8zkpnwhd4rkpyq = new wzEak8ZKpNWHd4RKPYQ(accessibilityNodeInfo);
        WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = Boolean.valueOf(Q55Zxcgh4evtHu7g7qq.V57tEvNfxZVVcOCAOih5PKr(view));
        } else {
            tag = view.getTag(R.id.tag_screen_reader_focusable);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        int i = 0;
        boolean z = bool != null && bool.booleanValue();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z);
        } else {
            wzeak8zkpnwhd4rkpyq.NSjgqmGjEzuugn2SsG1mZFP(1, z);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            tag2 = Boolean.valueOf(Q55Zxcgh4evtHu7g7qq.zzpBGItXfub0yWj(view));
        } else {
            tag2 = view.getTag(R.id.tag_accessibility_heading);
            if (!Boolean.class.isInstance(tag2)) {
                tag2 = null;
            }
        }
        Boolean bool2 = (Boolean) tag2;
        boolean z2 = bool2 != null && bool2.booleanValue();
        if (i2 >= 28) {
            accessibilityNodeInfo.setHeading(z2);
        } else {
            wzeak8zkpnwhd4rkpyq.NSjgqmGjEzuugn2SsG1mZFP(2, z2);
        }
        CharSequence charSequenceLaeGQIruHQu81hfJldjMOQSVblH3x = xb0r6yEzq0tw9m7nTWG5BFR8.LaeGQIruHQu81hfJldjMOQSVblH3x(view);
        if (i2 >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequenceLaeGQIruHQu81hfJldjMOQSVblH3x);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequenceLaeGQIruHQu81hfJldjMOQSVblH3x);
        }
        if (i2 >= 30) {
            tag3 = pW4oXDbPFe7lyly7BStqQEdWZff.zzpBGItXfub0yWj(view);
        } else {
            tag3 = view.getTag(R.id.tag_state_description);
            if (!CharSequence.class.isInstance(tag3)) {
                tag3 = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag3;
        if (i2 >= 30) {
            AuWCPdlLhOuIvGOGYC9mCLNVz.LaeGQIruHQu81hfJldjMOQSVblH3x(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.ZfQNn8hdWlEQ5cR94249PDsLR(view, wzeak8zkpnwhd4rkpyq);
        CharSequence text = accessibilityNodeInfo.getText();
        if (i2 < 26) {
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                    if (((WeakReference) sparseArray.valueAt(i3)).get() == null) {
                        arrayList.add(Integer.valueOf(i3));
                    }
                }
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    sparseArray.remove(((Integer) arrayList.get(i4)).intValue());
                }
            }
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                }
                int i5 = 0;
                while (i5 < clickableSpanArr.length) {
                    ClickableSpan clickableSpan = clickableSpanArr[i5];
                    int i6 = i;
                    while (true) {
                        if (i6 >= sparseArray2.size()) {
                            iKeyAt = wzEak8ZKpNWHd4RKPYQ.V57tEvNfxZVVcOCAOih5PKr;
                            wzEak8ZKpNWHd4RKPYQ.V57tEvNfxZVVcOCAOih5PKr = iKeyAt + 1;
                            break;
                        } else {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i6)).get())) {
                                iKeyAt = sparseArray2.keyAt(i6);
                                break;
                            }
                            i6++;
                        }
                    }
                    sparseArray2.put(iKeyAt, new WeakReference(clickableSpanArr[i5]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[i5];
                    Spanned spanned = (Spanned) text;
                    wzeak8zkpnwhd4rkpyq.V57tEvNfxZVVcOCAOih5PKr("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    wzeak8zkpnwhd4rkpyq.V57tEvNfxZVVcOCAOih5PKr("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    wzeak8zkpnwhd4rkpyq.V57tEvNfxZVVcOCAOih5PKr("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    wzeak8zkpnwhd4rkpyq.V57tEvNfxZVVcOCAOih5PKr("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(iKeyAt));
                    i5++;
                    i = 0;
                }
            }
        }
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            wzeak8zkpnwhd4rkpyq.zzpBGItXfub0yWj((jj77w443kpEYEOqOOio) list.get(i7));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.LaeGQIruHQu81hfJldjMOQSVblH3x(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.zIvmSL0wzmmKGc3X39b2Gw2mUGE(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.ZLZeBXTMq0zDztBxtRTuCHrapQ(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.NSjgqmGjEzuugn2SsG1mZFP(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.GI83zq0G8e7zkn(view, accessibilityEvent);
    }
}
