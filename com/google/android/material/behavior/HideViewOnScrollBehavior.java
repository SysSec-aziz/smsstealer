package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.vdodsodjsdt.KugVp8vzDXzRFw;
import com.vdodsodjsdt.LJ0avg2f37zqC;
import com.vdodsodjsdt.QlGb8EPtaoCCLt3z12;
import com.vdodsodjsdt.R;
import com.vdodsodjsdt.TQMQBENV49PLMwKLaeaEMWAtYlx;
import com.vdodsodjsdt.ej6unYlOWMDF;
import com.vdodsodjsdt.g2dDK1VfurxVK3felJkB4G;
import com.vdodsodjsdt.m8WKJH6JbFg;
import com.vdodsodjsdt.mlFPz0SY9o7oN;
import com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao;
import com.vdodsodjsdt.u9SlVAuoWhQUfJ;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class HideViewOnScrollBehavior<V extends View> extends m8WKJH6JbFg {
    public ViewPropertyAnimator HzCpKshMOoaw76hFcbOVRYMeRd;
    public int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public TimeInterpolator NSjgqmGjEzuugn2SsG1mZFP;
    public KugVp8vzDXzRFw V57tEvNfxZVVcOCAOih5PKr;
    public sGipz63rTUmSj3uFDvOtzihao VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public TimeInterpolator ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public int zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public AccessibilityManager zzpBGItXfub0yWj;
    public final LinkedHashSet ZfQNn8hdWlEQ5cR94249PDsLR = new LinkedHashSet();
    public int GI83zq0G8e7zkn = 0;
    public int M9e7PWhFYLD2lOGMker = 2;

    public HideViewOnScrollBehavior() {
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final boolean Ca81ebIan1u(View view, int i, int i2) {
        return i == 2;
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final void HzCpKshMOoaw76hFcbOVRYMeRd(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        if (i <= 0) {
            if (i < 0) {
                jW7EiD0YL6xkbB158jMUzhWNWb1y(view);
                return;
            }
            return;
        }
        if (this.M9e7PWhFYLD2lOGMker == 1) {
            return;
        }
        AccessibilityManager accessibilityManager = this.zzpBGItXfub0yWj;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            ViewPropertyAnimator viewPropertyAnimator = this.HzCpKshMOoaw76hFcbOVRYMeRd;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.M9e7PWhFYLD2lOGMker = 1;
            Iterator it = this.ZfQNn8hdWlEQ5cR94249PDsLR.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.HzCpKshMOoaw76hFcbOVRYMeRd = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.RhfGHxtXxy0M0grmp2jkRjQg(view, this.GI83zq0G8e7zkn).setInterpolator(this.NSjgqmGjEzuugn2SsG1mZFP).setDuration(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE).setListener(new LJ0avg2f37zqC(4, this));
        }
    }

    @Override // com.vdodsodjsdt.m8WKJH6JbFg
    public final boolean ZLZeBXTMq0zDztBxtRTuCHrapQ(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (this.zzpBGItXfub0yWj == null) {
            this.zzpBGItXfub0yWj = (AccessibilityManager) view.getContext().getSystemService(AccessibilityManager.class);
        }
        AccessibilityManager accessibilityManager = this.zzpBGItXfub0yWj;
        if (accessibilityManager != null && this.V57tEvNfxZVVcOCAOih5PKr == null) {
            KugVp8vzDXzRFw kugVp8vzDXzRFw = new KugVp8vzDXzRFw(this, view, 1);
            this.V57tEvNfxZVVcOCAOih5PKr = kugVp8vzDXzRFw;
            accessibilityManager.addTouchExplorationStateChangeListener(kugVp8vzDXzRFw);
            view.addOnAttachStateChangeListener(new QlGb8EPtaoCCLt3z12(4, this));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i2 = ((TQMQBENV49PLMwKLaeaEMWAtYlx) view.getLayoutParams()).V57tEvNfxZVVcOCAOih5PKr;
        if (i2 == 80 || i2 == 81) {
            ko09zE6UAgwkV(1);
        } else {
            int absoluteGravity = Gravity.getAbsoluteGravity(i2, i);
            ko09zE6UAgwkV((absoluteGravity == 3 || absoluteGravity == 19) ? 2 : 0);
        }
        this.GI83zq0G8e7zkn = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.Irh5auREsoeV1C1RaBamlmy(view, marginLayoutParams);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = ej6unYlOWMDF.hKs1wlZyvtUNaW1f5ABIGacfPcvX(view.getContext(), R.attr.motionDurationLong2, 225);
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = ej6unYlOWMDF.hKs1wlZyvtUNaW1f5ABIGacfPcvX(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = ej6unYlOWMDF.vXWl0o6I4U59CgHs9(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, mlFPz0SY9o7oN.ZfQNn8hdWlEQ5cR94249PDsLR);
        this.NSjgqmGjEzuugn2SsG1mZFP = ej6unYlOWMDF.vXWl0o6I4U59CgHs9(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, mlFPz0SY9o7oN.V57tEvNfxZVVcOCAOih5PKr);
        return false;
    }

    public final void jW7EiD0YL6xkbB158jMUzhWNWb1y(View view) {
        if (this.M9e7PWhFYLD2lOGMker == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.M9e7PWhFYLD2lOGMker = 2;
        Iterator it = this.ZfQNn8hdWlEQ5cR94249PDsLR.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.getClass();
        this.HzCpKshMOoaw76hFcbOVRYMeRd = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.RhfGHxtXxy0M0grmp2jkRjQg(view, 0).setInterpolator(this.ZLZeBXTMq0zDztBxtRTuCHrapQ).setDuration(this.LaeGQIruHQu81hfJldjMOQSVblH3x).setListener(new LJ0avg2f37zqC(4, this));
    }

    public final void ko09zE6UAgwkV(int i) {
        sGipz63rTUmSj3uFDvOtzihao sgipz63rtumsj3ufdvotzihao = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (sgipz63rtumsj3ufdvotzihao == null || sgipz63rtumsj3ufdvotzihao.w0Wu95l8dVNw5rZMRu() != i) {
            if (i == 0) {
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new g2dDK1VfurxVK3felJkB4G(2);
            } else if (i == 1) {
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new g2dDK1VfurxVK3felJkB4G(0);
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException(u9SlVAuoWhQUfJ.ZLZeBXTMq0zDztBxtRTuCHrapQ(i, "Invalid view edge position value: ", ". Must be 0, 1 or 2."));
                }
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new g2dDK1VfurxVK3felJkB4G(1);
            }
        }
    }

    public HideViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}
