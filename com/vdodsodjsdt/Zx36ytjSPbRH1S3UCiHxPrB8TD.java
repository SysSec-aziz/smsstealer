package com.vdodsodjsdt;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class Zx36ytjSPbRH1S3UCiHxPrB8TD extends DyKKpKofUua1vK {
    public static final String[] aXO0LSrt8bKV = {"android:visibility:visibility", "android:visibility:parent"};
    public final int pzqP2AqKW6J5PO8zCKnW;

    public Zx36ytjSPbRH1S3UCiHxPrB8TD(int i) {
        this();
        this.pzqP2AqKW6J5PO8zCKnW = i;
    }

    public static float TqcnImqkSWIKht(wfAv4Z4xkzEqsmKhnROCM57sUkreZ wfav4z4xkzeqsmkhnrocm57sukrez, float f) {
        Float f2;
        return (wfav4z4xkzeqsmkhnrocm57sukrez == null || (f2 = (Float) wfav4z4xkzeqsmkhnrocm57sukrez.VxUQ9tBhpHJ2AAEDNW8sghc4m.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.vdodsodjsdt.AvFTorv27KO0k0c d9zDyyznnp3oaDT1Ug(com.vdodsodjsdt.wfAv4Z4xkzEqsmKhnROCM57sUkreZ r8, com.vdodsodjsdt.wfAv4Z4xkzEqsmKhnROCM57sUkreZ r9) {
        /*
            com.vdodsodjsdt.AvFTorv27KO0k0c r0 = new com.vdodsodjsdt.AvFTorv27KO0k0c
            r0.<init>()
            r1 = 0
            r0.VxUQ9tBhpHJ2AAEDNW8sghc4m = r1
            r0.zzpBGItXfub0yWj = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.VxUQ9tBhpHJ2AAEDNW8sghc4m
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.V57tEvNfxZVVcOCAOih5PKr = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.LaeGQIruHQu81hfJldjMOQSVblH3x = r6
            goto L33
        L2f:
            r0.V57tEvNfxZVVcOCAOih5PKr = r3
            r0.LaeGQIruHQu81hfJldjMOQSVblH3x = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.VxUQ9tBhpHJ2AAEDNW8sghc4m
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.ZfQNn8hdWlEQ5cR94249PDsLR = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.zIvmSL0wzmmKGc3X39b2Gw2mUGE = r2
            goto L56
        L52:
            r0.ZfQNn8hdWlEQ5cR94249PDsLR = r3
            r0.zIvmSL0wzmmKGc3X39b2Gw2mUGE = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.V57tEvNfxZVVcOCAOih5PKr
            int r9 = r0.ZfQNn8hdWlEQ5cR94249PDsLR
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.LaeGQIruHQu81hfJldjMOQSVblH3x
            android.view.ViewGroup r4 = r0.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            if (r3 != r4) goto L68
            goto L9f
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.zzpBGItXfub0yWj = r1
            r0.VxUQ9tBhpHJ2AAEDNW8sghc4m = r2
            return r0
        L71:
            if (r9 != 0) goto L9f
            r0.zzpBGItXfub0yWj = r2
            r0.VxUQ9tBhpHJ2AAEDNW8sghc4m = r2
            return r0
        L78:
            android.view.ViewGroup r8 = r0.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            if (r8 != 0) goto L81
            r0.zzpBGItXfub0yWj = r1
            r0.VxUQ9tBhpHJ2AAEDNW8sghc4m = r2
            return r0
        L81:
            android.view.ViewGroup r8 = r0.LaeGQIruHQu81hfJldjMOQSVblH3x
            if (r8 != 0) goto L9f
            r0.zzpBGItXfub0yWj = r2
            r0.VxUQ9tBhpHJ2AAEDNW8sghc4m = r2
            return r0
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.ZfQNn8hdWlEQ5cR94249PDsLR
            if (r8 != 0) goto L95
            r0.zzpBGItXfub0yWj = r2
            r0.VxUQ9tBhpHJ2AAEDNW8sghc4m = r2
            return r0
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.V57tEvNfxZVVcOCAOih5PKr
            if (r8 != 0) goto L9f
            r0.zzpBGItXfub0yWj = r1
            r0.VxUQ9tBhpHJ2AAEDNW8sghc4m = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.Zx36ytjSPbRH1S3UCiHxPrB8TD.d9zDyyznnp3oaDT1Ug(com.vdodsodjsdt.wfAv4Z4xkzEqsmKhnROCM57sUkreZ, com.vdodsodjsdt.wfAv4Z4xkzEqsmKhnROCM57sUkreZ):com.vdodsodjsdt.AvFTorv27KO0k0c");
    }

    public static void qygqjTppWwx992(wfAv4Z4xkzEqsmKhnROCM57sUkreZ wfav4z4xkzeqsmkhnrocm57sukrez) {
        View view = wfav4z4xkzeqsmkhnrocm57sukrez.zzpBGItXfub0yWj;
        int visibility = view.getVisibility();
        HashMap map = wfav4z4xkzeqsmkhnrocm57sukrez.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (d9zDyyznnp3oaDT1Ug(p59rPv72J9(r3, false), ko09zE6UAgwkV(r3, false)).VxUQ9tBhpHJ2AAEDNW8sghc4m != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0214  */
    @Override // com.vdodsodjsdt.DyKKpKofUua1vK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator HzCpKshMOoaw76hFcbOVRYMeRd(android.view.ViewGroup r24, com.vdodsodjsdt.wfAv4Z4xkzEqsmKhnROCM57sUkreZ r25, com.vdodsodjsdt.wfAv4Z4xkzEqsmKhnROCM57sUkreZ r26) {
        /*
            Method dump skipped, instruction units count: 728
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.Zx36ytjSPbRH1S3UCiHxPrB8TD.HzCpKshMOoaw76hFcbOVRYMeRd(android.view.ViewGroup, com.vdodsodjsdt.wfAv4Z4xkzEqsmKhnROCM57sUkreZ, com.vdodsodjsdt.wfAv4Z4xkzEqsmKhnROCM57sUkreZ):android.animation.Animator");
    }

    @Override // com.vdodsodjsdt.DyKKpKofUua1vK
    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ(wfAv4Z4xkzEqsmKhnROCM57sUkreZ wfav4z4xkzeqsmkhnrocm57sukrez) {
        qygqjTppWwx992(wfav4z4xkzeqsmkhnrocm57sukrez);
        View view = wfav4z4xkzeqsmkhnrocm57sukrez.zzpBGItXfub0yWj;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(SHiEHYU4a1Haij.VxUQ9tBhpHJ2AAEDNW8sghc4m.Ca81ebIan1u(view)) : Float.valueOf(0.0f);
        }
        wfav4z4xkzeqsmkhnrocm57sukrez.VxUQ9tBhpHJ2AAEDNW8sghc4m.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // com.vdodsodjsdt.DyKKpKofUua1vK
    public final void ZfQNn8hdWlEQ5cR94249PDsLR(wfAv4Z4xkzEqsmKhnROCM57sUkreZ wfav4z4xkzeqsmkhnrocm57sukrez) {
        qygqjTppWwx992(wfav4z4xkzeqsmkhnrocm57sukrez);
    }

    public final ObjectAnimator iKANjmyTSxO6v6UuLPdu7DxOjlS(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        SHiEHYU4a1Haij.VxUQ9tBhpHJ2AAEDNW8sghc4m.SuB3hEmTmbbRGAhtvOOmfKEon(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, SHiEHYU4a1Haij.zzpBGItXfub0yWj, f2);
        UzLWEazic08assYkBUWYIwjy6FNtz uzLWEazic08assYkBUWYIwjy6FNtz = new UzLWEazic08assYkBUWYIwjy6FNtz(view);
        objectAnimatorOfFloat.addListener(uzLWEazic08assYkBUWYIwjy6FNtz);
        Ca81ebIan1u().VxUQ9tBhpHJ2AAEDNW8sghc4m(uzLWEazic08assYkBUWYIwjy6FNtz);
        return objectAnimatorOfFloat;
    }

    @Override // com.vdodsodjsdt.DyKKpKofUua1vK
    public final boolean jW7EiD0YL6xkbB158jMUzhWNWb1y(wfAv4Z4xkzEqsmKhnROCM57sUkreZ wfav4z4xkzeqsmkhnrocm57sukrez, wfAv4Z4xkzEqsmKhnROCM57sUkreZ wfav4z4xkzeqsmkhnrocm57sukrez2) {
        if (wfav4z4xkzeqsmkhnrocm57sukrez == null && wfav4z4xkzeqsmkhnrocm57sukrez2 == null) {
            return false;
        }
        if (wfav4z4xkzeqsmkhnrocm57sukrez != null && wfav4z4xkzeqsmkhnrocm57sukrez2 != null && wfav4z4xkzeqsmkhnrocm57sukrez2.VxUQ9tBhpHJ2AAEDNW8sghc4m.containsKey("android:visibility:visibility") != wfav4z4xkzeqsmkhnrocm57sukrez.VxUQ9tBhpHJ2AAEDNW8sghc4m.containsKey("android:visibility:visibility")) {
            return false;
        }
        AvFTorv27KO0k0c avFTorv27KO0k0cD9zDyyznnp3oaDT1Ug = d9zDyyznnp3oaDT1Ug(wfav4z4xkzeqsmkhnrocm57sukrez, wfav4z4xkzeqsmkhnrocm57sukrez2);
        if (avFTorv27KO0k0cD9zDyyznnp3oaDT1Ug.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            return avFTorv27KO0k0cD9zDyyznnp3oaDT1Ug.V57tEvNfxZVVcOCAOih5PKr == 0 || avFTorv27KO0k0cD9zDyyznnp3oaDT1Ug.ZfQNn8hdWlEQ5cR94249PDsLR == 0;
        }
        return false;
    }

    @Override // com.vdodsodjsdt.DyKKpKofUua1vK
    public final String[] pYmKDYlAmhudp() {
        return aXO0LSrt8bKV;
    }

    public Zx36ytjSPbRH1S3UCiHxPrB8TD() {
        this.pzqP2AqKW6J5PO8zCKnW = 3;
    }
}
