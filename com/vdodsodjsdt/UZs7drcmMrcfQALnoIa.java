package com.vdodsodjsdt;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class UZs7drcmMrcfQALnoIa extends View.AccessibilityDelegate {
    public final /* synthetic */ uGIIbcq05l2iYyEa2AaeeYA VxUQ9tBhpHJ2AAEDNW8sghc4m;

    public UZs7drcmMrcfQALnoIa(uGIIbcq05l2iYyEa2AaeeYA ugiibcq05l2iyyea2aaeeya) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = ugiibcq05l2iyyea2aaeeya;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        EditText editText = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.NSjgqmGjEzuugn2SsG1mZFP.getEditText();
        if (editText != null) {
            accessibilityNodeInfo.setLabeledBy(editText);
        }
    }
}
