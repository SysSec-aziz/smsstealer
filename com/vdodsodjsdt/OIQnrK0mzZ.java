package com.vdodsodjsdt;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class OIQnrK0mzZ extends RAU9GtBZd7wl {
    public static TimeInterpolator jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public ArrayList Ca81ebIan1u;
    public ArrayList GI83zq0G8e7zkn;
    public ArrayList HzCpKshMOoaw76hFcbOVRYMeRd;
    public ArrayList KUYypEB4eNWOZWVDpH;
    public ArrayList M9e7PWhFYLD2lOGMker;
    public ArrayList NSjgqmGjEzuugn2SsG1mZFP;
    public boolean ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public ArrayList h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public ArrayList ko09zE6UAgwkV;
    public ArrayList p59rPv72J9;
    public ArrayList pYmKDYlAmhudp;
    public ArrayList q1wNbhk2O6;

    public static void NSjgqmGjEzuugn2SsG1mZFP(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((WFEUpQgjHl) arrayList.get(size)).VxUQ9tBhpHJ2AAEDNW8sghc4m.animate().cancel();
        }
    }

    public final void GI83zq0G8e7zkn() {
        if (zIvmSL0wzmmKGc3X39b2Gw2mUGE()) {
            return;
        }
        ArrayList arrayList = this.zzpBGItXfub0yWj;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final boolean HzCpKshMOoaw76hFcbOVRYMeRd(Vczceu2rJSZiaaey04LCv vczceu2rJSZiaaey04LCv, WFEUpQgjHl wFEUpQgjHl) {
        if (vczceu2rJSZiaaey04LCv.zzpBGItXfub0yWj == wFEUpQgjHl) {
            vczceu2rJSZiaaey04LCv.zzpBGItXfub0yWj = null;
        } else {
            if (vczceu2rJSZiaaey04LCv.VxUQ9tBhpHJ2AAEDNW8sghc4m != wFEUpQgjHl) {
                return false;
            }
            vczceu2rJSZiaaey04LCv.VxUQ9tBhpHJ2AAEDNW8sghc4m = null;
        }
        View view = wFEUpQgjHl.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        View view2 = wFEUpQgjHl.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        V57tEvNfxZVVcOCAOih5PKr(wFEUpQgjHl);
        return true;
    }

    public final void KUYypEB4eNWOZWVDpH(WFEUpQgjHl wFEUpQgjHl) {
        if (jW7EiD0YL6xkbB158jMUzhWNWb1y == null) {
            jW7EiD0YL6xkbB158jMUzhWNWb1y = new ValueAnimator().getInterpolator();
        }
        wFEUpQgjHl.VxUQ9tBhpHJ2AAEDNW8sghc4m.animate().setInterpolator(jW7EiD0YL6xkbB158jMUzhWNWb1y);
        ZfQNn8hdWlEQ5cR94249PDsLR(wFEUpQgjHl);
    }

    @Override // com.vdodsodjsdt.RAU9GtBZd7wl
    public final void LaeGQIruHQu81hfJldjMOQSVblH3x() {
        ArrayList arrayList = this.p59rPv72J9;
        ArrayList arrayList2 = this.KUYypEB4eNWOZWVDpH;
        ArrayList arrayList3 = this.q1wNbhk2O6;
        ArrayList arrayList4 = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        ArrayList arrayList5 = this.GI83zq0G8e7zkn;
        ArrayList arrayList6 = this.NSjgqmGjEzuugn2SsG1mZFP;
        ArrayList arrayList7 = this.M9e7PWhFYLD2lOGMker;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            vGdgtM2sXq3 vgdgtm2sxq3 = (vGdgtM2sXq3) arrayList7.get(size);
            View view = vgdgtm2sxq3.VxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            V57tEvNfxZVVcOCAOih5PKr(vgdgtm2sxq3.VxUQ9tBhpHJ2AAEDNW8sghc4m);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            V57tEvNfxZVVcOCAOih5PKr((WFEUpQgjHl) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            WFEUpQgjHl wFEUpQgjHl = (WFEUpQgjHl) arrayList5.get(size3);
            wFEUpQgjHl.VxUQ9tBhpHJ2AAEDNW8sghc4m.setAlpha(1.0f);
            V57tEvNfxZVVcOCAOih5PKr(wFEUpQgjHl);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            Vczceu2rJSZiaaey04LCv vczceu2rJSZiaaey04LCv = (Vczceu2rJSZiaaey04LCv) arrayList4.get(size4);
            WFEUpQgjHl wFEUpQgjHl2 = vczceu2rJSZiaaey04LCv.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (wFEUpQgjHl2 != null) {
                HzCpKshMOoaw76hFcbOVRYMeRd(vczceu2rJSZiaaey04LCv, wFEUpQgjHl2);
            }
            WFEUpQgjHl wFEUpQgjHl3 = vczceu2rJSZiaaey04LCv.zzpBGItXfub0yWj;
            if (wFEUpQgjHl3 != null) {
                HzCpKshMOoaw76hFcbOVRYMeRd(vczceu2rJSZiaaey04LCv, wFEUpQgjHl3);
            }
        }
        arrayList4.clear();
        if (zIvmSL0wzmmKGc3X39b2Gw2mUGE()) {
            for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList3.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    vGdgtM2sXq3 vgdgtm2sxq32 = (vGdgtM2sXq3) arrayList8.get(size6);
                    View view2 = vgdgtm2sxq32.VxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    V57tEvNfxZVVcOCAOih5PKr(vgdgtm2sxq32.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList3.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList2.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    WFEUpQgjHl wFEUpQgjHl4 = (WFEUpQgjHl) arrayList9.get(size8);
                    wFEUpQgjHl4.VxUQ9tBhpHJ2AAEDNW8sghc4m.setAlpha(1.0f);
                    V57tEvNfxZVVcOCAOih5PKr(wFEUpQgjHl4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList2.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    Vczceu2rJSZiaaey04LCv vczceu2rJSZiaaey04LCv2 = (Vczceu2rJSZiaaey04LCv) arrayList10.get(size10);
                    WFEUpQgjHl wFEUpQgjHl5 = vczceu2rJSZiaaey04LCv2.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    if (wFEUpQgjHl5 != null) {
                        HzCpKshMOoaw76hFcbOVRYMeRd(vczceu2rJSZiaaey04LCv2, wFEUpQgjHl5);
                    }
                    WFEUpQgjHl wFEUpQgjHl6 = vczceu2rJSZiaaey04LCv2.zzpBGItXfub0yWj;
                    if (wFEUpQgjHl6 != null) {
                        HzCpKshMOoaw76hFcbOVRYMeRd(vczceu2rJSZiaaey04LCv2, wFEUpQgjHl6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList.remove(arrayList10);
                    }
                }
            }
            NSjgqmGjEzuugn2SsG1mZFP(this.pYmKDYlAmhudp);
            NSjgqmGjEzuugn2SsG1mZFP(this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv);
            NSjgqmGjEzuugn2SsG1mZFP(this.Ca81ebIan1u);
            NSjgqmGjEzuugn2SsG1mZFP(this.ko09zE6UAgwkV);
            ArrayList arrayList11 = this.zzpBGItXfub0yWj;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    public final void M9e7PWhFYLD2lOGMker(ArrayList arrayList, WFEUpQgjHl wFEUpQgjHl) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Vczceu2rJSZiaaey04LCv vczceu2rJSZiaaey04LCv = (Vczceu2rJSZiaaey04LCv) arrayList.get(size);
            if (HzCpKshMOoaw76hFcbOVRYMeRd(vczceu2rJSZiaaey04LCv, wFEUpQgjHl) && vczceu2rJSZiaaey04LCv.VxUQ9tBhpHJ2AAEDNW8sghc4m == null && vczceu2rJSZiaaey04LCv.zzpBGItXfub0yWj == null) {
                arrayList.remove(vczceu2rJSZiaaey04LCv);
            }
        }
    }

    @Override // com.vdodsodjsdt.RAU9GtBZd7wl
    public final boolean VxUQ9tBhpHJ2AAEDNW8sghc4m(WFEUpQgjHl wFEUpQgjHl, WFEUpQgjHl wFEUpQgjHl2, mYybSD3X3KfsAbnorz7K myybsd3x3kfsabnorz7k, mYybSD3X3KfsAbnorz7K myybsd3x3kfsabnorz7k2) {
        int i;
        int i2;
        int i3 = myybsd3x3kfsabnorz7k.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int i4 = myybsd3x3kfsabnorz7k.zzpBGItXfub0yWj;
        if (wFEUpQgjHl2.Ca81ebIan1u()) {
            int i5 = myybsd3x3kfsabnorz7k.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            i2 = myybsd3x3kfsabnorz7k.zzpBGItXfub0yWj;
            i = i5;
        } else {
            i = myybsd3x3kfsabnorz7k2.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            i2 = myybsd3x3kfsabnorz7k2.zzpBGItXfub0yWj;
        }
        if (wFEUpQgjHl == wFEUpQgjHl2) {
            return ZLZeBXTMq0zDztBxtRTuCHrapQ(wFEUpQgjHl, i3, i4, i, i2);
        }
        View view = wFEUpQgjHl.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        KUYypEB4eNWOZWVDpH(wFEUpQgjHl);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = wFEUpQgjHl2.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        KUYypEB4eNWOZWVDpH(wFEUpQgjHl2);
        view2.setTranslationX(-((int) ((i - i3) - translationX)));
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        Vczceu2rJSZiaaey04LCv vczceu2rJSZiaaey04LCv = new Vczceu2rJSZiaaey04LCv();
        vczceu2rJSZiaaey04LCv.VxUQ9tBhpHJ2AAEDNW8sghc4m = wFEUpQgjHl;
        vczceu2rJSZiaaey04LCv.zzpBGItXfub0yWj = wFEUpQgjHl2;
        vczceu2rJSZiaaey04LCv.V57tEvNfxZVVcOCAOih5PKr = i3;
        vczceu2rJSZiaaey04LCv.ZfQNn8hdWlEQ5cR94249PDsLR = i4;
        vczceu2rJSZiaaey04LCv.LaeGQIruHQu81hfJldjMOQSVblH3x = i;
        vczceu2rJSZiaaey04LCv.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i2;
        arrayList.add(vczceu2rJSZiaaey04LCv);
        return true;
    }

    public final boolean ZLZeBXTMq0zDztBxtRTuCHrapQ(WFEUpQgjHl wFEUpQgjHl, int i, int i2, int i3, int i4) {
        View view = wFEUpQgjHl.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) wFEUpQgjHl.VxUQ9tBhpHJ2AAEDNW8sghc4m.getTranslationY());
        KUYypEB4eNWOZWVDpH(wFEUpQgjHl);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            V57tEvNfxZVVcOCAOih5PKr(wFEUpQgjHl);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        ArrayList arrayList = this.M9e7PWhFYLD2lOGMker;
        vGdgtM2sXq3 vgdgtm2sxq3 = new vGdgtM2sXq3();
        vgdgtm2sxq3.VxUQ9tBhpHJ2AAEDNW8sghc4m = wFEUpQgjHl;
        vgdgtm2sxq3.zzpBGItXfub0yWj = translationX;
        vgdgtm2sxq3.V57tEvNfxZVVcOCAOih5PKr = translationY;
        vgdgtm2sxq3.ZfQNn8hdWlEQ5cR94249PDsLR = i3;
        vgdgtm2sxq3.LaeGQIruHQu81hfJldjMOQSVblH3x = i4;
        arrayList.add(vgdgtm2sxq3);
        return true;
    }

    @Override // com.vdodsodjsdt.RAU9GtBZd7wl
    public final void ZfQNn8hdWlEQ5cR94249PDsLR(WFEUpQgjHl wFEUpQgjHl) {
        ArrayList arrayList = this.KUYypEB4eNWOZWVDpH;
        ArrayList arrayList2 = this.q1wNbhk2O6;
        ArrayList arrayList3 = this.p59rPv72J9;
        View view = wFEUpQgjHl.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        view.animate().cancel();
        ArrayList arrayList4 = this.M9e7PWhFYLD2lOGMker;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((vGdgtM2sXq3) arrayList4.get(size)).VxUQ9tBhpHJ2AAEDNW8sghc4m == wFEUpQgjHl) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                V57tEvNfxZVVcOCAOih5PKr(wFEUpQgjHl);
                arrayList4.remove(size);
            }
        }
        M9e7PWhFYLD2lOGMker(this.HzCpKshMOoaw76hFcbOVRYMeRd, wFEUpQgjHl);
        if (this.NSjgqmGjEzuugn2SsG1mZFP.remove(wFEUpQgjHl)) {
            view.setAlpha(1.0f);
            V57tEvNfxZVVcOCAOih5PKr(wFEUpQgjHl);
        }
        if (this.GI83zq0G8e7zkn.remove(wFEUpQgjHl)) {
            view.setAlpha(1.0f);
            V57tEvNfxZVVcOCAOih5PKr(wFEUpQgjHl);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            M9e7PWhFYLD2lOGMker(arrayList5, wFEUpQgjHl);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            int size4 = arrayList6.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((vGdgtM2sXq3) arrayList6.get(size4)).VxUQ9tBhpHJ2AAEDNW8sghc4m == wFEUpQgjHl) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    V57tEvNfxZVVcOCAOih5PKr(wFEUpQgjHl);
                    arrayList6.remove(size4);
                    if (arrayList6.isEmpty()) {
                        arrayList2.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(wFEUpQgjHl)) {
                view.setAlpha(1.0f);
                V57tEvNfxZVVcOCAOih5PKr(wFEUpQgjHl);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.pYmKDYlAmhudp.remove(wFEUpQgjHl);
        this.Ca81ebIan1u.remove(wFEUpQgjHl);
        this.ko09zE6UAgwkV.remove(wFEUpQgjHl);
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.remove(wFEUpQgjHl);
        GI83zq0G8e7zkn();
    }

    @Override // com.vdodsodjsdt.RAU9GtBZd7wl
    public final boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE() {
        return (this.GI83zq0G8e7zkn.isEmpty() && this.HzCpKshMOoaw76hFcbOVRYMeRd.isEmpty() && this.M9e7PWhFYLD2lOGMker.isEmpty() && this.NSjgqmGjEzuugn2SsG1mZFP.isEmpty() && this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv.isEmpty() && this.pYmKDYlAmhudp.isEmpty() && this.Ca81ebIan1u.isEmpty() && this.ko09zE6UAgwkV.isEmpty() && this.q1wNbhk2O6.isEmpty() && this.KUYypEB4eNWOZWVDpH.isEmpty() && this.p59rPv72J9.isEmpty()) ? false : true;
    }
}
