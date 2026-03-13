package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.vdodsodjsdt.KugVp8vzDXzRFw;
import com.vdodsodjsdt.LJ0avg2f37zqC;
import com.vdodsodjsdt.QlGb8EPtaoCCLt3z12;
import com.vdodsodjsdt.R;
import com.vdodsodjsdt.ej6unYlOWMDF;
import com.vdodsodjsdt.m8WKJH6JbFg;
import com.vdodsodjsdt.mlFPz0SY9o7oN;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class HideBottomViewOnScrollBehavior<V extends View> extends m8WKJH6JbFg {
    public ViewPropertyAnimator HzCpKshMOoaw76hFcbOVRYMeRd;
    public TimeInterpolator LaeGQIruHQu81hfJldjMOQSVblH3x;
    public KugVp8vzDXzRFw NSjgqmGjEzuugn2SsG1mZFP;
    public int V57tEvNfxZVVcOCAOih5PKr;
    public AccessibilityManager ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public TimeInterpolator ZfQNn8hdWlEQ5cR94249PDsLR;
    public int zzpBGItXfub0yWj;
    public final LinkedHashSet VxUQ9tBhpHJ2AAEDNW8sghc4m = new LinkedHashSet();
    public int zIvmSL0wzmmKGc3X39b2Gw2mUGE = 0;
    public final boolean GI83zq0G8e7zkn = true;
    public int M9e7PWhFYLD2lOGMker = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public boolean Ca81ebIan1u(View view, int i, int i2) {
        return i == 2;
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final void HzCpKshMOoaw76hFcbOVRYMeRd(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        AccessibilityManager accessibilityManager;
        if (i <= 0) {
            if (i < 0) {
                ko09zE6UAgwkV(view);
                return;
            }
            return;
        }
        if (this.M9e7PWhFYLD2lOGMker == 1) {
            return;
        }
        if (this.GI83zq0G8e7zkn && (accessibilityManager = this.ZLZeBXTMq0zDztBxtRTuCHrapQ) != null && accessibilityManager.isTouchExplorationEnabled()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.M9e7PWhFYLD2lOGMker = 1;
        Iterator it = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.HzCpKshMOoaw76hFcbOVRYMeRd = view.animate().translationY(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE).setInterpolator(this.LaeGQIruHQu81hfJldjMOQSVblH3x).setDuration(this.V57tEvNfxZVVcOCAOih5PKr).setListener(new LJ0avg2f37zqC(3, this));
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public boolean ZLZeBXTMq0zDztBxtRTuCHrapQ(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.zzpBGItXfub0yWj = ej6unYlOWMDF.hKs1wlZyvtUNaW1f5ABIGacfPcvX(view.getContext(), R.attr.motionDurationLong2, 225);
        this.V57tEvNfxZVVcOCAOih5PKr = ej6unYlOWMDF.hKs1wlZyvtUNaW1f5ABIGacfPcvX(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = ej6unYlOWMDF.vXWl0o6I4U59CgHs9(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, mlFPz0SY9o7oN.ZfQNn8hdWlEQ5cR94249PDsLR);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = ej6unYlOWMDF.vXWl0o6I4U59CgHs9(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, mlFPz0SY9o7oN.V57tEvNfxZVVcOCAOih5PKr);
        if (this.ZLZeBXTMq0zDztBxtRTuCHrapQ == null) {
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (accessibilityManager == null || this.NSjgqmGjEzuugn2SsG1mZFP != null) {
            return false;
        }
        KugVp8vzDXzRFw kugVp8vzDXzRFw = new KugVp8vzDXzRFw(this, view, 0);
        this.NSjgqmGjEzuugn2SsG1mZFP = kugVp8vzDXzRFw;
        accessibilityManager.addTouchExplorationStateChangeListener(kugVp8vzDXzRFw);
        view.addOnAttachStateChangeListener(new QlGb8EPtaoCCLt3z12(3, this));
        return false;
    }

    public final void ko09zE6UAgwkV(View view) {
        if (this.M9e7PWhFYLD2lOGMker == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.M9e7PWhFYLD2lOGMker = 2;
        Iterator it = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.HzCpKshMOoaw76hFcbOVRYMeRd = view.animate().translationY(0).setInterpolator(this.ZfQNn8hdWlEQ5cR94249PDsLR).setDuration(this.zzpBGItXfub0yWj).setListener(new LJ0avg2f37zqC(3, this));
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
