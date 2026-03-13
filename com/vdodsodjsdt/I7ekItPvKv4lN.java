package com.vdodsodjsdt;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class I7ekItPvKv4lN extends dOYOTnFcxbQY9kd8M4lnq {
    public final TextInputLayout ZfQNn8hdWlEQ5cR94249PDsLR;

    public I7ekItPvKv4lN(TextInputLayout textInputLayout) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR = textInputLayout;
    }

    @Override // com.vdodsodjsdt.dOYOTnFcxbQY9kd8M4lnq
    public final void LaeGQIruHQu81hfJldjMOQSVblH3x(View view, AccessibilityEvent accessibilityEvent) {
        super.LaeGQIruHQu81hfJldjMOQSVblH3x(view, accessibilityEvent);
        this.ZfQNn8hdWlEQ5cR94249PDsLR.LaeGQIruHQu81hfJldjMOQSVblH3x.zzpBGItXfub0yWj().p59rPv72J9(accessibilityEvent);
    }

    @Override // com.vdodsodjsdt.dOYOTnFcxbQY9kd8M4lnq
    public final void ZfQNn8hdWlEQ5cR94249PDsLR(View view, wzEak8ZKpNWHd4RKPYQ wzeak8zkpnwhd4rkpyq) {
        AccessibilityNodeInfo accessibilityNodeInfo = wzeak8zkpnwhd4rkpyq.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        TextInputLayout textInputLayout = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        EditText editText = textInputLayout.getEditText();
        CharSequence text = editText != null ? editText.getText() : null;
        CharSequence hint = textInputLayout.getHint();
        CharSequence error = textInputLayout.getError();
        CharSequence placeholderText = textInputLayout.getPlaceholderText();
        int counterMaxLength = textInputLayout.getCounterMaxLength();
        CharSequence counterOverflowDescription = textInputLayout.getCounterOverflowDescription();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        boolean zIsEmpty2 = TextUtils.isEmpty(hint);
        boolean z = textInputLayout.h2b7InwIaORKN91X7whfQh4;
        boolean zIsEmpty3 = TextUtils.isEmpty(error);
        boolean z2 = (zIsEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
        String string = !zIsEmpty2 ? hint.toString() : "";
        xhZAU2F7Zp5 xhzau2f7zp5 = textInputLayout.ZfQNn8hdWlEQ5cR94249PDsLR;
        lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa = xhzau2f7zp5.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (lzuj2xiohpzadsoz1vjvxa.getVisibility() == 0) {
            accessibilityNodeInfo.setLabelFor(lzuj2xiohpzadsoz1vjvxa);
            accessibilityNodeInfo.setTraversalAfter(lzuj2xiohpzadsoz1vjvxa);
        } else {
            accessibilityNodeInfo.setTraversalAfter(xhzau2f7zp5.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
        }
        if (!zIsEmpty) {
            wzeak8zkpnwhd4rkpyq.M9e7PWhFYLD2lOGMker(text);
        } else if (!TextUtils.isEmpty(string)) {
            wzeak8zkpnwhd4rkpyq.M9e7PWhFYLD2lOGMker(string);
            if (!z && placeholderText != null) {
                wzeak8zkpnwhd4rkpyq.M9e7PWhFYLD2lOGMker(string + ", " + ((Object) placeholderText));
            }
        } else if (placeholderText != null) {
            wzeak8zkpnwhd4rkpyq.M9e7PWhFYLD2lOGMker(placeholderText);
        }
        if (!TextUtils.isEmpty(string)) {
            int i = Build.VERSION.SDK_INT;
            if (i < 26) {
                if (!zIsEmpty) {
                    string = ((Object) text) + ", " + string;
                }
                wzeak8zkpnwhd4rkpyq.M9e7PWhFYLD2lOGMker(string);
            } else if (i >= 26) {
                accessibilityNodeInfo.setHintText(string);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", string);
            }
            if (i >= 26) {
                accessibilityNodeInfo.setShowingHintText(zIsEmpty);
            } else {
                wzeak8zkpnwhd4rkpyq.NSjgqmGjEzuugn2SsG1mZFP(4, zIsEmpty);
            }
        }
        if (text == null || text.length() != counterMaxLength) {
            counterMaxLength = -1;
        }
        accessibilityNodeInfo.setMaxTextLength(counterMaxLength);
        if (z2) {
            if (zIsEmpty3) {
                error = counterOverflowDescription;
            }
            accessibilityNodeInfo.setError(error);
        }
        lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa2 = textInputLayout.q1wNbhk2O6.w0Wu95l8dVNw5rZMRu;
        if (lzuj2xiohpzadsoz1vjvxa2 != null) {
            accessibilityNodeInfo.setLabelFor(lzuj2xiohpzadsoz1vjvxa2);
        }
        textInputLayout.LaeGQIruHQu81hfJldjMOQSVblH3x.zzpBGItXfub0yWj().q1wNbhk2O6(wzeak8zkpnwhd4rkpyq);
    }
}
