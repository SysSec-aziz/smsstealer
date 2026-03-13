package com.vdodsodjsdt;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class pgkpBTPJiWlpOU implements Animation.AnimationListener {
    public final /* synthetic */ View V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ RD86Fssz0iKbf0t61L VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final /* synthetic */ dlHQnQrSu4 ZfQNn8hdWlEQ5cR94249PDsLR;
    public final /* synthetic */ ViewGroup zzpBGItXfub0yWj;

    public pgkpBTPJiWlpOU(View view, ViewGroup viewGroup, dlHQnQrSu4 dlhqnqrsu4, RD86Fssz0iKbf0t61L rD86Fssz0iKbf0t61L) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = rD86Fssz0iKbf0t61L;
        this.zzpBGItXfub0yWj = viewGroup;
        this.V57tEvNfxZVVcOCAOih5PKr = view;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = dlhqnqrsu4;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.zzpBGItXfub0yWj.post(new RfOSIaL6qUBGKJY9MSCBP5ba(2, this));
        if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.VxUQ9tBhpHJ2AAEDNW8sghc4m + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.VxUQ9tBhpHJ2AAEDNW8sghc4m + " has reached onAnimationStart.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }
}
