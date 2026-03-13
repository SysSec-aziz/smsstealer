package com.vdodsodjsdt;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class vVGwU02mY8hnRs7md implements Runnable {
    public final /* synthetic */ OIQnrK0mzZ LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ ArrayList ZfQNn8hdWlEQ5cR94249PDsLR;

    public /* synthetic */ vVGwU02mY8hnRs7md(OIQnrK0mzZ oIQnrK0mzZ, ArrayList arrayList, int i) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = oIQnrK0mzZ;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                ArrayList arrayList = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    OIQnrK0mzZ oIQnrK0mzZ = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                    if (i >= size) {
                        arrayList.clear();
                        oIQnrK0mzZ.q1wNbhk2O6.remove(arrayList);
                    } else {
                        Object obj = arrayList.get(i);
                        i++;
                        vGdgtM2sXq3 vgdgtm2sxq3 = (vGdgtM2sXq3) obj;
                        WFEUpQgjHl wFEUpQgjHl = vgdgtm2sxq3.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                        int i2 = vgdgtm2sxq3.zzpBGItXfub0yWj;
                        int i3 = vgdgtm2sxq3.V57tEvNfxZVVcOCAOih5PKr;
                        int i4 = vgdgtm2sxq3.ZfQNn8hdWlEQ5cR94249PDsLR;
                        int i5 = vgdgtm2sxq3.LaeGQIruHQu81hfJldjMOQSVblH3x;
                        oIQnrK0mzZ.getClass();
                        View view = wFEUpQgjHl.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                        int i6 = i4 - i2;
                        int i7 = i5 - i3;
                        if (i6 != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i7 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        oIQnrK0mzZ.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.add(wFEUpQgjHl);
                        viewPropertyAnimatorAnimate.setDuration(oIQnrK0mzZ.LaeGQIruHQu81hfJldjMOQSVblH3x).setListener(new xLT3F6QzeEg0g6xgRz3VW5gD(oIQnrK0mzZ, wFEUpQgjHl, i6, view, i7, viewPropertyAnimatorAnimate)).start();
                    }
                    break;
                }
                break;
            case 1:
                ArrayList arrayList2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                int size2 = arrayList2.size();
                int i8 = 0;
                while (true) {
                    OIQnrK0mzZ oIQnrK0mzZ2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                    if (i8 >= size2) {
                        arrayList2.clear();
                        oIQnrK0mzZ2.p59rPv72J9.remove(arrayList2);
                        break;
                    } else {
                        Object obj2 = arrayList2.get(i8);
                        i8++;
                        Vczceu2rJSZiaaey04LCv vczceu2rJSZiaaey04LCv = (Vczceu2rJSZiaaey04LCv) obj2;
                        ArrayList arrayList3 = oIQnrK0mzZ2.ko09zE6UAgwkV;
                        long j = oIQnrK0mzZ2.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                        WFEUpQgjHl wFEUpQgjHl2 = vczceu2rJSZiaaey04LCv.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                        View view2 = wFEUpQgjHl2 == null ? null : wFEUpQgjHl2.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                        WFEUpQgjHl wFEUpQgjHl3 = vczceu2rJSZiaaey04LCv.zzpBGItXfub0yWj;
                        View view3 = wFEUpQgjHl3 != null ? wFEUpQgjHl3.VxUQ9tBhpHJ2AAEDNW8sghc4m : null;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList3.add(vczceu2rJSZiaaey04LCv.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                            duration.translationX(vczceu2rJSZiaaey04LCv.LaeGQIruHQu81hfJldjMOQSVblH3x - vczceu2rJSZiaaey04LCv.V57tEvNfxZVVcOCAOih5PKr);
                            duration.translationY(vczceu2rJSZiaaey04LCv.zIvmSL0wzmmKGc3X39b2Gw2mUGE - vczceu2rJSZiaaey04LCv.ZfQNn8hdWlEQ5cR94249PDsLR);
                            duration.alpha(0.0f).setListener(new YF4uo84BQfmdlM4G30n79CFUVt(oIQnrK0mzZ2, vczceu2rJSZiaaey04LCv, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList3.add(vczceu2rJSZiaaey04LCv.zzpBGItXfub0yWj);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new YF4uo84BQfmdlM4G30n79CFUVt(oIQnrK0mzZ2, vczceu2rJSZiaaey04LCv, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                    }
                }
                break;
            default:
                ArrayList arrayList4 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                int size3 = arrayList4.size();
                int i9 = 0;
                while (true) {
                    OIQnrK0mzZ oIQnrK0mzZ3 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                    if (i9 >= size3) {
                        arrayList4.clear();
                        oIQnrK0mzZ3.KUYypEB4eNWOZWVDpH.remove(arrayList4);
                    } else {
                        Object obj3 = arrayList4.get(i9);
                        i9++;
                        WFEUpQgjHl wFEUpQgjHl4 = (WFEUpQgjHl) obj3;
                        oIQnrK0mzZ3.getClass();
                        View view4 = wFEUpQgjHl4.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        oIQnrK0mzZ3.Ca81ebIan1u.add(wFEUpQgjHl4);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(oIQnrK0mzZ3.V57tEvNfxZVVcOCAOih5PKr).setListener(new eViaIsihfc0LZLsw7MU(oIQnrK0mzZ3, wFEUpQgjHl4, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                    break;
                }
                break;
        }
    }
}
