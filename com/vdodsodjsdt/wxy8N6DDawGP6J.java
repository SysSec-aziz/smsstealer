package com.vdodsodjsdt;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class wxy8N6DDawGP6J {
    public final sSTjsLE9Ugp7iXfnwi18Akn1Jt VxUQ9tBhpHJ2AAEDNW8sghc4m = new sSTjsLE9Ugp7iXfnwi18Akn1Jt(0);
    public final sSTjsLE9Ugp7iXfnwi18Akn1Jt zzpBGItXfub0yWj = new sSTjsLE9Ugp7iXfnwi18Akn1Jt(0);

    public static wxy8N6DDawGP6J VxUQ9tBhpHJ2AAEDNW8sghc4m(Context context, int i) {
        try {
            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (animatorLoadAnimator instanceof AnimatorSet) {
                return zzpBGItXfub0yWj(((AnimatorSet) animatorLoadAnimator).getChildAnimations());
            }
            if (animatorLoadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(animatorLoadAnimator);
            return zzpBGItXfub0yWj(arrayList);
        } catch (Exception e) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e);
            return null;
        }
    }

    public static wxy8N6DDawGP6J zzpBGItXfub0yWj(ArrayList arrayList) {
        wxy8N6DDawGP6J wxy8n6ddawgp6j = new wxy8N6DDawGP6J();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            wxy8n6ddawgp6j.zzpBGItXfub0yWj.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            String propertyName = objectAnimator.getPropertyName();
            long startDelay = objectAnimator.getStartDelay();
            long duration = objectAnimator.getDuration();
            TimeInterpolator interpolator = objectAnimator.getInterpolator();
            iJwl6c8G69WgXuRykVvEhXMx ijwl6c8g69wgxurykvvehxmx = new iJwl6c8G69WgXuRykVvEhXMx();
            ijwl6c8g69wgxurykvvehxmx.ZfQNn8hdWlEQ5cR94249PDsLR = 0;
            ijwl6c8g69wgxurykvvehxmx.LaeGQIruHQu81hfJldjMOQSVblH3x = 1;
            ijwl6c8g69wgxurykvvehxmx.VxUQ9tBhpHJ2AAEDNW8sghc4m = startDelay;
            ijwl6c8g69wgxurykvvehxmx.zzpBGItXfub0yWj = duration;
            ijwl6c8g69wgxurykvvehxmx.V57tEvNfxZVVcOCAOih5PKr = interpolator;
            ijwl6c8g69wgxurykvvehxmx.ZfQNn8hdWlEQ5cR94249PDsLR = objectAnimator.getRepeatCount();
            ijwl6c8g69wgxurykvvehxmx.LaeGQIruHQu81hfJldjMOQSVblH3x = objectAnimator.getRepeatMode();
            wxy8n6ddawgp6j.VxUQ9tBhpHJ2AAEDNW8sghc4m.put(propertyName, ijwl6c8g69wgxurykvvehxmx);
        }
        return wxy8n6ddawgp6j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wxy8N6DDawGP6J) {
            return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.equals(((wxy8N6DDawGP6J) obj).VxUQ9tBhpHJ2AAEDNW8sghc4m);
        }
        return false;
    }

    public final int hashCode() {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.hashCode();
    }

    public final String toString() {
        return "\n" + wxy8N6DDawGP6J.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.VxUQ9tBhpHJ2AAEDNW8sghc4m + "}\n";
    }
}
