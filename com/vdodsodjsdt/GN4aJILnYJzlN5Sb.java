package com.vdodsodjsdt;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class GN4aJILnYJzlN5Sb {
    public float HzCpKshMOoaw76hFcbOVRYMeRd;
    public boolean KUYypEB4eNWOZWVDpH;
    public oWK0Apo0Nirk5BGlanOPFjcPKV7Bt M9e7PWhFYLD2lOGMker;
    public final dqrRplqyPGe V57tEvNfxZVVcOCAOih5PKr;
    public final float ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final ej6unYlOWMDF ZfQNn8hdWlEQ5cR94249PDsLR;
    public static final XrxS7UXDddQ4lx q1wNbhk2O6 = new XrxS7UXDddQ4lx(1);
    public static final XrxS7UXDddQ4lx p59rPv72J9 = new XrxS7UXDddQ4lx(2);
    public static final XrxS7UXDddQ4lx Ca81ebIan1u = new XrxS7UXDddQ4lx(3);
    public static final XrxS7UXDddQ4lx h3jnZRsdwYJfY9UhQCkbvWciwvFHv = new XrxS7UXDddQ4lx(4);
    public static final XrxS7UXDddQ4lx pYmKDYlAmhudp = new XrxS7UXDddQ4lx(5);
    public static final XrxS7UXDddQ4lx ko09zE6UAgwkV = new XrxS7UXDddQ4lx(0);
    public float VxUQ9tBhpHJ2AAEDNW8sghc4m = 0.0f;
    public float zzpBGItXfub0yWj = Float.MAX_VALUE;
    public boolean LaeGQIruHQu81hfJldjMOQSVblH3x = false;
    public long zIvmSL0wzmmKGc3X39b2Gw2mUGE = 0;
    public final ArrayList NSjgqmGjEzuugn2SsG1mZFP = new ArrayList();
    public final ArrayList GI83zq0G8e7zkn = new ArrayList();

    public GN4aJILnYJzlN5Sb(dqrRplqyPGe dqrrplqypge, ej6unYlOWMDF ej6unylowmdf) {
        this.V57tEvNfxZVVcOCAOih5PKr = dqrrplqypge;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = ej6unylowmdf;
        if (ej6unylowmdf == Ca81ebIan1u || ej6unylowmdf == h3jnZRsdwYJfY9UhQCkbvWciwvFHv || ej6unylowmdf == pYmKDYlAmhudp) {
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = 0.1f;
        } else if (ej6unylowmdf == ko09zE6UAgwkV) {
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = 0.00390625f;
        } else if (ej6unylowmdf == q1wNbhk2O6 || ej6unylowmdf == p59rPv72J9) {
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = 0.002f;
        } else {
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = 1.0f;
        }
        this.M9e7PWhFYLD2lOGMker = null;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = Float.MAX_VALUE;
        this.KUYypEB4eNWOZWVDpH = false;
    }

    public static dLR3tayHKGlC6 zzpBGItXfub0yWj() {
        ThreadLocal threadLocal = dLR3tayHKGlC6.GI83zq0G8e7zkn;
        if (threadLocal.get() == null) {
            threadLocal.set(new dLR3tayHKGlC6(new o6OxmOsCD9HJ6LF8UTncnTX9Cf21(1)));
        }
        return (dLR3tayHKGlC6) threadLocal.get();
    }

    public final void V57tEvNfxZVVcOCAOih5PKr(float f) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR.H2VFYNJEVGAX(this.V57tEvNfxZVVcOCAOih5PKr, f);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.GI83zq0G8e7zkn;
            if (i >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i) != null) {
                arrayList.get(i).getClass();
                throw new ClassCastException();
            }
            i++;
        }
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [com.vdodsodjsdt.OHIbrdRqxtIjkNZvCVwc, java.lang.Object] */
    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(float f) {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            this.HzCpKshMOoaw76hFcbOVRYMeRd = f;
            return;
        }
        if (this.M9e7PWhFYLD2lOGMker == null) {
            this.M9e7PWhFYLD2lOGMker = new oWK0Apo0Nirk5BGlanOPFjcPKV7Bt(f);
        }
        oWK0Apo0Nirk5BGlanOPFjcPKV7Bt owk0apo0nirk5bglanopfjcpkv7bt = this.M9e7PWhFYLD2lOGMker;
        double d = f;
        owk0apo0nirk5bglanopfjcpkv7bt.GI83zq0G8e7zkn = d;
        double d2 = (float) d;
        if (d2 > Float.MAX_VALUE) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d2 < -3.4028235E38f) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.ZLZeBXTMq0zDztBxtRTuCHrapQ * 0.75f);
        owk0apo0nirk5bglanopfjcpkv7bt.ZfQNn8hdWlEQ5cR94249PDsLR = dAbs;
        owk0apo0nirk5bglanopfjcpkv7bt.LaeGQIruHQu81hfJldjMOQSVblH3x = dAbs * 62.5d;
        o6OxmOsCD9HJ6LF8UTncnTX9Cf21 o6oxmoscd9hj6lf8utncntx9cf21 = zzpBGItXfub0yWj().LaeGQIruHQu81hfJldjMOQSVblH3x;
        o6oxmoscd9hj6lf8utncntx9cf21.getClass();
        if (Thread.currentThread() != ((Looper) o6oxmoscd9hj6lf8utncntx9cf21.ZfQNn8hdWlEQ5cR94249PDsLR).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (z || z) {
            return;
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = true;
        float fVE4yDIjexsP2lGjLaTcB = this.ZfQNn8hdWlEQ5cR94249PDsLR.vE4yDIjexsP2lGjLaTcB(this.V57tEvNfxZVVcOCAOih5PKr);
        this.zzpBGItXfub0yWj = fVE4yDIjexsP2lGjLaTcB;
        if (fVE4yDIjexsP2lGjLaTcB > Float.MAX_VALUE || fVE4yDIjexsP2lGjLaTcB < -3.4028235E38f) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        dLR3tayHKGlC6 dlr3tayhkglc6ZzpBGItXfub0yWj = zzpBGItXfub0yWj();
        ArrayList arrayList = dlr3tayhkglc6ZzpBGItXfub0yWj.zzpBGItXfub0yWj;
        if (arrayList.size() == 0) {
            ((Choreographer) dlr3tayhkglc6ZzpBGItXfub0yWj.LaeGQIruHQu81hfJldjMOQSVblH3x.V57tEvNfxZVVcOCAOih5PKr).postFrameCallback(new afI5VlNN6JmVP6m(dlr3tayhkglc6ZzpBGItXfub0yWj.ZfQNn8hdWlEQ5cR94249PDsLR));
            if (Build.VERSION.SDK_INT >= 33) {
                dlr3tayhkglc6ZzpBGItXfub0yWj.ZLZeBXTMq0zDztBxtRTuCHrapQ = ValueAnimator.getDurationScale();
                if (dlr3tayhkglc6ZzpBGItXfub0yWj.NSjgqmGjEzuugn2SsG1mZFP == null) {
                    dlr3tayhkglc6ZzpBGItXfub0yWj.NSjgqmGjEzuugn2SsG1mZFP = new o0x3OWMw3He(1, dlr3tayhkglc6ZzpBGItXfub0yWj);
                }
                final o0x3OWMw3He o0x3owmw3he = dlr3tayhkglc6ZzpBGItXfub0yWj.NSjgqmGjEzuugn2SsG1mZFP;
                if (((OHIbrdRqxtIjkNZvCVwc) o0x3owmw3he.zzpBGItXfub0yWj) == null) {
                    ?? r1 = new ValueAnimator.DurationScaleChangeListener() { // from class: com.vdodsodjsdt.OHIbrdRqxtIjkNZvCVwc
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f2) {
                            ((dLR3tayHKGlC6) o0x3owmw3he.V57tEvNfxZVVcOCAOih5PKr).ZLZeBXTMq0zDztBxtRTuCHrapQ = f2;
                        }
                    };
                    o0x3owmw3he.zzpBGItXfub0yWj = r1;
                    ValueAnimator.registerDurationScaleChangeListener(r1);
                }
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR() {
        if (this.M9e7PWhFYLD2lOGMker.zzpBGItXfub0yWj <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        o6OxmOsCD9HJ6LF8UTncnTX9Cf21 o6oxmoscd9hj6lf8utncntx9cf21 = zzpBGItXfub0yWj().LaeGQIruHQu81hfJldjMOQSVblH3x;
        o6oxmoscd9hj6lf8utncntx9cf21.getClass();
        if (Thread.currentThread() != ((Looper) o6oxmoscd9hj6lf8utncntx9cf21.ZfQNn8hdWlEQ5cR94249PDsLR).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            this.KUYypEB4eNWOZWVDpH = true;
        }
    }
}
