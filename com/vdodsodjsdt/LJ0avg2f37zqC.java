package com.vdodsodjsdt;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class LJ0avg2f37zqC extends AnimatorListenerAdapter {
    public final /* synthetic */ int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final /* synthetic */ Object zzpBGItXfub0yWj;

    public /* synthetic */ LJ0avg2f37zqC(int i, Object obj) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        this.zzpBGItXfub0yWj = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.zzpBGItXfub0yWj;
                actionBarOverlayLayout.w0Wu95l8dVNw5rZMRu = null;
                actionBarOverlayLayout.KUYypEB4eNWOZWVDpH = false;
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_SET_FIELD_NUMBER /* 6 */:
                ((u2BfIH7vVsa) this.zzpBGItXfub0yWj).zzpBGItXfub0yWj();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.zzpBGItXfub0yWj;
                actionBarOverlayLayout.w0Wu95l8dVNw5rZMRu = null;
                actionBarOverlayLayout.KUYypEB4eNWOZWVDpH = false;
                break;
            case 1:
                q0pWTaFdtfarfiKiJ0i30WR q0pwtafdtfarfikij0i30wr = (q0pWTaFdtfarfiKiJ0i30WR) this.zzpBGItXfub0yWj;
                ArrayList arrayList = new ArrayList(q0pwtafdtfarfikij0i30wr.ZLZeBXTMq0zDztBxtRTuCHrapQ);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((gRx9aVOIySZIg2M5dXBALHfl) arrayList.get(i)).zzpBGItXfub0yWj.pYmKDYlAmhudp;
                    if (colorStateList != null) {
                        q0pwtafdtfarfikij0i30wr.setTintList(colorStateList);
                    }
                }
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                hbsUcFELqptC4ZZnom4xRs0eGoz hbsucfelqptc4zznom4xrs0egoz = (hbsUcFELqptC4ZZnom4xRs0eGoz) this.zzpBGItXfub0yWj;
                hbsucfelqptc4zznom4xrs0egoz.h3jnZRsdwYJfY9UhQCkbvWciwvFHv();
                hbsucfelqptc4zznom4xrs0egoz.ko09zE6UAgwkV.start();
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                ((HideBottomViewOnScrollBehavior) this.zzpBGItXfub0yWj).HzCpKshMOoaw76hFcbOVRYMeRd = null;
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                ((HideViewOnScrollBehavior) this.zzpBGItXfub0yWj).HzCpKshMOoaw76hFcbOVRYMeRd = null;
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_FIELD_NUMBER /* 5 */:
                ((DyKKpKofUua1vK) this.zzpBGItXfub0yWj).q1wNbhk2O6();
                animator.removeListener(this);
                break;
            default:
                ((u2BfIH7vVsa) this.zzpBGItXfub0yWj).VxUQ9tBhpHJ2AAEDNW8sghc4m();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 1:
                q0pWTaFdtfarfiKiJ0i30WR q0pwtafdtfarfikij0i30wr = (q0pWTaFdtfarfiKiJ0i30WR) this.zzpBGItXfub0yWj;
                ArrayList arrayList = new ArrayList(q0pwtafdtfarfikij0i30wr.ZLZeBXTMq0zDztBxtRTuCHrapQ);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    UdolbJMuTFGlV udolbJMuTFGlV = ((gRx9aVOIySZIg2M5dXBALHfl) arrayList.get(i)).zzpBGItXfub0yWj;
                    ColorStateList colorStateList = udolbJMuTFGlV.pYmKDYlAmhudp;
                    if (colorStateList != null) {
                        q0pwtafdtfarfikij0i30wr.setTint(colorStateList.getColorForState(udolbJMuTFGlV.vBGA6pPLqSMuYGvprl270j7, colorStateList.getDefaultColor()));
                    }
                }
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_SET_FIELD_NUMBER /* 6 */:
                ((u2BfIH7vVsa) this.zzpBGItXfub0yWj).V57tEvNfxZVVcOCAOih5PKr();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public LJ0avg2f37zqC(u2BfIH7vVsa u2bfih7vvsa, View view) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 6;
        this.zzpBGItXfub0yWj = u2bfih7vvsa;
    }
}
