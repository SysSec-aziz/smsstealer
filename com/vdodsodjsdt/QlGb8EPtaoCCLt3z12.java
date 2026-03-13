package com.vdodsodjsdt;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class QlGb8EPtaoCCLt3z12 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ Object ZfQNn8hdWlEQ5cR94249PDsLR;

    public /* synthetic */ QlGb8EPtaoCCLt3z12(int i, Object obj) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.V57tEvNfxZVVcOCAOih5PKr;
        Object obj = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        switch (i) {
            case 1:
                eswEmxJomeZU eswemxjomezu = (eswEmxJomeZU) obj;
                AccessibilityManager accessibilityManager = eswemxjomezu.TaDO7ogis3aEiWEtq;
                if (eswemxjomezu.Irh5auREsoeV1C1RaBamlmy != null && accessibilityManager != null && eswemxjomezu.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(eswemxjomezu.Irh5auREsoeV1C1RaBamlmy);
                    break;
                }
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                UFStPSj5DrcqcfR2RymfmG.V57tEvNfxZVVcOCAOih5PKr(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                lHLqDPOuDPv9Tah5rl1MDkuq12 lhlqdpoudpv9tah5rl1mdkuq12 = (lHLqDPOuDPv9Tah5rl1MDkuq12) this.ZfQNn8hdWlEQ5cR94249PDsLR;
                ViewTreeObserver viewTreeObserver = lhlqdpoudpv9tah5rl1mdkuq12.RhfGHxtXxy0M0grmp2jkRjQg;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        lhlqdpoudpv9tah5rl1mdkuq12.RhfGHxtXxy0M0grmp2jkRjQg = view.getViewTreeObserver();
                    }
                    lhlqdpoudpv9tah5rl1mdkuq12.RhfGHxtXxy0M0grmp2jkRjQg.removeGlobalOnLayoutListener(lhlqdpoudpv9tah5rl1mdkuq12.HzCpKshMOoaw76hFcbOVRYMeRd);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                eswEmxJomeZU eswemxjomezu = (eswEmxJomeZU) this.ZfQNn8hdWlEQ5cR94249PDsLR;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = eswemxjomezu.Irh5auREsoeV1C1RaBamlmy;
                if (touchExplorationStateChangeListener != null && (accessibilityManager = eswemxjomezu.TaDO7ogis3aEiWEtq) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    break;
                }
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.ZfQNn8hdWlEQ5cR94249PDsLR;
                KugVp8vzDXzRFw kugVp8vzDXzRFw = hideBottomViewOnScrollBehavior.NSjgqmGjEzuugn2SsG1mZFP;
                if (kugVp8vzDXzRFw != null && (accessibilityManager2 = hideBottomViewOnScrollBehavior.ZLZeBXTMq0zDztBxtRTuCHrapQ) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(kugVp8vzDXzRFw);
                    hideBottomViewOnScrollBehavior.NSjgqmGjEzuugn2SsG1mZFP = null;
                    break;
                }
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.ZfQNn8hdWlEQ5cR94249PDsLR;
                KugVp8vzDXzRFw kugVp8vzDXzRFw2 = hideViewOnScrollBehavior.V57tEvNfxZVVcOCAOih5PKr;
                if (kugVp8vzDXzRFw2 != null && (accessibilityManager3 = hideViewOnScrollBehavior.zzpBGItXfub0yWj) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(kugVp8vzDXzRFw2);
                    hideViewOnScrollBehavior.V57tEvNfxZVVcOCAOih5PKr = null;
                    break;
                }
                break;
            default:
                P7F708JA9fT7wZdjaAX8x p7F708JA9fT7wZdjaAX8x = (P7F708JA9fT7wZdjaAX8x) this.ZfQNn8hdWlEQ5cR94249PDsLR;
                ViewTreeObserver viewTreeObserver2 = p7F708JA9fT7wZdjaAX8x.pYmKDYlAmhudp;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        p7F708JA9fT7wZdjaAX8x.pYmKDYlAmhudp = view.getViewTreeObserver();
                    }
                    p7F708JA9fT7wZdjaAX8x.pYmKDYlAmhudp.removeGlobalOnLayoutListener(p7F708JA9fT7wZdjaAX8x.HzCpKshMOoaw76hFcbOVRYMeRd);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    private final void LaeGQIruHQu81hfJldjMOQSVblH3x(View view) {
    }

    private final void V57tEvNfxZVVcOCAOih5PKr(View view) {
    }

    private final void VxUQ9tBhpHJ2AAEDNW8sghc4m(View view) {
    }

    private final void ZfQNn8hdWlEQ5cR94249PDsLR(View view) {
    }

    private final void zzpBGItXfub0yWj(View view) {
    }
}
