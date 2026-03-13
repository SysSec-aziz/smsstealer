package com.vdodsodjsdt;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class PkBeXXwxWaGrzNHNG1JbWG5uMRK extends dOYOTnFcxbQY9kd8M4lnq {
    public static final Rect Ca81ebIan1u = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final FG8LIxsgYiLSfhN0jYKIKr h3jnZRsdwYJfY9UhQCkbvWciwvFHv = new FG8LIxsgYiLSfhN0jYKIKr(7);
    public static final FG8LIxsgYiLSfhN0jYKIKr pYmKDYlAmhudp = new FG8LIxsgYiLSfhN0jYKIKr(8);
    public final Chip GI83zq0G8e7zkn;
    public aCT3GbmnbjSR1WIJ91ZdreaMG M9e7PWhFYLD2lOGMker;
    public final AccessibilityManager NSjgqmGjEzuugn2SsG1mZFP;
    public final /* synthetic */ Chip p59rPv72J9;
    public final Rect ZfQNn8hdWlEQ5cR94249PDsLR = new Rect();
    public final Rect LaeGQIruHQu81hfJldjMOQSVblH3x = new Rect();
    public final Rect zIvmSL0wzmmKGc3X39b2Gw2mUGE = new Rect();
    public final int[] ZLZeBXTMq0zDztBxtRTuCHrapQ = new int[2];
    public int HzCpKshMOoaw76hFcbOVRYMeRd = Integer.MIN_VALUE;
    public int KUYypEB4eNWOZWVDpH = Integer.MIN_VALUE;
    public int q1wNbhk2O6 = Integer.MIN_VALUE;

    public PkBeXXwxWaGrzNHNG1JbWG5uMRK(Chip chip, Chip chip2) {
        this.p59rPv72J9 = chip;
        this.GI83zq0G8e7zkn = chip2;
        this.NSjgqmGjEzuugn2SsG1mZFP = (AccessibilityManager) chip2.getContext().getSystemService("accessibility");
        chip2.setFocusable(true);
        WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (chip2.getImportantForAccessibility() == 0) {
            chip2.setImportantForAccessibility(1);
        }
    }

    public final void Ca81ebIan1u(int i, boolean z) {
        Chip chip = this.p59rPv72J9;
        if (i == 1) {
            chip.Ca81ebIan1u = z;
        }
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = chip.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        boolean z2 = chip.Ca81ebIan1u;
        boolean zL8DMw02rUTs2w = false;
        if (avpaxxgaxsbfwfxxj.vXWl0o6I4U59CgHs9 != null) {
            zL8DMw02rUTs2w = avpaxxgaxsbfwfxxj.L8DMw02rUTs2w(z2 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : avPAxXGaxsbfwFXxj.dWgUTvLDR2aOE7pFLrMrHP);
        }
        if (zL8DMw02rUTs2w) {
            chip.refreshDrawableState();
        }
    }

    public final wzEak8ZKpNWHd4RKPYQ HzCpKshMOoaw76hFcbOVRYMeRd(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        wzEak8ZKpNWHd4RKPYQ wzeak8zkpnwhd4rkpyq = new wzEak8ZKpNWHd4RKPYQ(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        wzeak8zkpnwhd4rkpyq.GI83zq0G8e7zkn("android.view.View");
        Rect rect = Ca81ebIan1u;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        Chip chip = this.GI83zq0G8e7zkn;
        accessibilityNodeInfoObtain.setParent(chip);
        AccessibilityNodeInfo accessibilityNodeInfo = wzeak8zkpnwhd4rkpyq.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (i == 1) {
            Chip chip2 = this.p59rPv72J9;
            CharSequence closeIconContentDescription = chip2.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip2.getText();
                accessibilityNodeInfo.setContentDescription(chip2.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            accessibilityNodeInfo.setBoundsInParent(chip2.getCloseIconTouchBoundsInt());
            wzeak8zkpnwhd4rkpyq.zzpBGItXfub0yWj(jj77w443kpEYEOqOOio.LaeGQIruHQu81hfJldjMOQSVblH3x);
            accessibilityNodeInfo.setEnabled(chip2.isEnabled());
            wzeak8zkpnwhd4rkpyq.GI83zq0G8e7zkn(Button.class.getName());
        } else {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.w0Wu95l8dVNw5rZMRu);
        }
        if (wzeak8zkpnwhd4rkpyq.ZLZeBXTMq0zDztBxtRTuCHrapQ() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        wzeak8zkpnwhd4rkpyq.zIvmSL0wzmmKGc3X39b2Gw2mUGE(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(chip.getContext().getPackageName());
        wzeak8zkpnwhd4rkpyq.zzpBGItXfub0yWj = i;
        accessibilityNodeInfoObtain.setSource(chip, i);
        if (this.HzCpKshMOoaw76hFcbOVRYMeRd == i) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            wzeak8zkpnwhd4rkpyq.VxUQ9tBhpHJ2AAEDNW8sghc4m(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            wzeak8zkpnwhd4rkpyq.VxUQ9tBhpHJ2AAEDNW8sghc4m(64);
        }
        boolean z = this.KUYypEB4eNWOZWVDpH == i;
        if (z) {
            wzeak8zkpnwhd4rkpyq.VxUQ9tBhpHJ2AAEDNW8sghc4m(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            wzeak8zkpnwhd4rkpyq.VxUQ9tBhpHJ2AAEDNW8sghc4m(1);
        }
        accessibilityNodeInfoObtain.setFocused(z);
        int[] iArr = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            wzeak8zkpnwhd4rkpyq.zIvmSL0wzmmKGc3X39b2Gw2mUGE(rect3);
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                accessibilityNodeInfoObtain.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view = (View) parent;
                            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                break;
                            }
                            parent = view.getParent();
                        } else if (parent != null) {
                            wzeak8zkpnwhd4rkpyq.VxUQ9tBhpHJ2AAEDNW8sghc4m.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return wzeak8zkpnwhd4rkpyq;
    }

    public final void KUYypEB4eNWOZWVDpH(ArrayList arrayList) {
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj;
        arrayList.add(0);
        Rect rect = Chip.w0Wu95l8dVNw5rZMRu;
        Chip chip = this.p59rPv72J9;
        if (!chip.V57tEvNfxZVVcOCAOih5PKr() || (avpaxxgaxsbfwfxxj = chip.ZLZeBXTMq0zDztBxtRTuCHrapQ) == null || !avpaxxgaxsbfwfxxj.hKs1wlZyvtUNaW1f5ABIGacfPcvX || chip.M9e7PWhFYLD2lOGMker == null) {
            return;
        }
        arrayList.add(1);
    }

    public final boolean M9e7PWhFYLD2lOGMker(int i) {
        if (this.KUYypEB4eNWOZWVDpH != i) {
            return false;
        }
        this.KUYypEB4eNWOZWVDpH = Integer.MIN_VALUE;
        Ca81ebIan1u(i, false);
        pYmKDYlAmhudp(i, 8);
        return true;
    }

    @Override // com.vdodsodjsdt.dOYOTnFcxbQY9kd8M4lnq
    public final void ZfQNn8hdWlEQ5cR94249PDsLR(View view, wzEak8ZKpNWHd4RKPYQ wzeak8zkpnwhd4rkpyq) {
        AccessibilityNodeInfo accessibilityNodeInfo = wzeak8zkpnwhd4rkpyq.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = this.p59rPv72J9;
        avPAxXGaxsbfwFXxj avpaxxgaxsbfwfxxj = chip.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        accessibilityNodeInfo.setCheckable(avpaxxgaxsbfwfxxj != null && avpaxxgaxsbfwfxxj.rERAmyEtGV6ANGszuKcQI);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        wzeak8zkpnwhd4rkpyq.GI83zq0G8e7zkn(chip.getAccessibilityClassName());
        wzeak8zkpnwhd4rkpyq.M9e7PWhFYLD2lOGMker(chip.getText());
    }

    public final boolean h3jnZRsdwYJfY9UhQCkbvWciwvFHv(int i) {
        int i2;
        Chip chip = this.GI83zq0G8e7zkn;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i2 = this.KUYypEB4eNWOZWVDpH) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            M9e7PWhFYLD2lOGMker(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.KUYypEB4eNWOZWVDpH = i;
        Ca81ebIan1u(i, true);
        pYmKDYlAmhudp(i, 8);
        return true;
    }

    public final wzEak8ZKpNWHd4RKPYQ p59rPv72J9(int i) {
        if (i != -1) {
            return HzCpKshMOoaw76hFcbOVRYMeRd(i);
        }
        Chip chip = this.GI83zq0G8e7zkn;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(chip);
        wzEak8ZKpNWHd4RKPYQ wzeak8zkpnwhd4rkpyq = new wzEak8ZKpNWHd4RKPYQ(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        chip.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        KUYypEB4eNWOZWVDpH(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            wzeak8zkpnwhd4rkpyq.VxUQ9tBhpHJ2AAEDNW8sghc4m.addChild(chip, ((Integer) arrayList.get(i2)).intValue());
        }
        return wzeak8zkpnwhd4rkpyq;
    }

    public final void pYmKDYlAmhudp(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i == Integer.MIN_VALUE || !this.NSjgqmGjEzuugn2SsG1mZFP.isEnabled() || (parent = (view = this.GI83zq0G8e7zkn).getParent()) == null) {
            return;
        }
        if (i != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            wzEak8ZKpNWHd4RKPYQ wzeak8zkpnwhd4rkpyqP59rPv72J9 = p59rPv72J9(i);
            accessibilityEventObtain.getText().add(wzeak8zkpnwhd4rkpyqP59rPv72J9.ZLZeBXTMq0zDztBxtRTuCHrapQ());
            AccessibilityNodeInfo accessibilityNodeInfo = wzeak8zkpnwhd4rkpyqP59rPv72J9.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
            accessibilityEventObtain.setSource(view, i);
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q1wNbhk2O6(int r19, android.graphics.Rect r20) {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.PkBeXXwxWaGrzNHNG1JbWG5uMRK.q1wNbhk2O6(int, android.graphics.Rect):boolean");
    }

    @Override // com.vdodsodjsdt.dOYOTnFcxbQY9kd8M4lnq
    public final Skgk8FYn8b4TvRiBOsElZw4XkNLhQ zzpBGItXfub0yWj(View view) {
        if (this.M9e7PWhFYLD2lOGMker == null) {
            this.M9e7PWhFYLD2lOGMker = new aCT3GbmnbjSR1WIJ91ZdreaMG(this);
        }
        return this.M9e7PWhFYLD2lOGMker;
    }
}
