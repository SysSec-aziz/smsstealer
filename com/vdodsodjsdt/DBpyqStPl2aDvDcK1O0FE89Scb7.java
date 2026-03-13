package com.vdodsodjsdt;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class DBpyqStPl2aDvDcK1O0FE89Scb7 extends AnimationSet implements Runnable {
    public boolean LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final ViewGroup V57tEvNfxZVVcOCAOih5PKr;
    public boolean ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final View ZfQNn8hdWlEQ5cR94249PDsLR;
    public boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public DBpyqStPl2aDvDcK1O0FE89Scb7(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = true;
        this.V57tEvNfxZVVcOCAOih5PKr = viewGroup;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = true;
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            return !this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        }
        if (!super.getTransformation(j, transformation)) {
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = true;
            EI1vm2TsL95mT6ZYxvArdeslez.VxUQ9tBhpHJ2AAEDNW8sghc4m(this.V57tEvNfxZVVcOCAOih5PKr, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        ViewGroup viewGroup = this.V57tEvNfxZVVcOCAOih5PKr;
        if (z || !this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            viewGroup.endViewTransition(this.ZfQNn8hdWlEQ5cR94249PDsLR);
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = true;
        } else {
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = true;
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            return !this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = true;
            EI1vm2TsL95mT6ZYxvArdeslez.VxUQ9tBhpHJ2AAEDNW8sghc4m(this.V57tEvNfxZVVcOCAOih5PKr, this);
        }
        return true;
    }
}
