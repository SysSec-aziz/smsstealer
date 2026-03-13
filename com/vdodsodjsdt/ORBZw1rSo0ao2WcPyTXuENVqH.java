package com.vdodsodjsdt;

import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ORBZw1rSo0ao2WcPyTXuENVqH {
    public static final ArrayList V57tEvNfxZVVcOCAOih5PKr;
    public static final PMv5YQHwCTM2nIIj7M3yptU VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public static final ThreadLocal zzpBGItXfub0yWj;

    static {
        PMv5YQHwCTM2nIIj7M3yptU pMv5YQHwCTM2nIIj7M3yptU = new PMv5YQHwCTM2nIIj7M3yptU();
        pMv5YQHwCTM2nIIj7M3yptU.pzqP2AqKW6J5PO8zCKnW = new ArrayList();
        pMv5YQHwCTM2nIIj7M3yptU.O1xDAlBZZlZdoEf747lCFHld = false;
        pMv5YQHwCTM2nIIj7M3yptU.HVEwbdULInpTNa0IG = 0;
        pMv5YQHwCTM2nIIj7M3yptU.aXO0LSrt8bKV = false;
        pMv5YQHwCTM2nIIj7M3yptU.qygqjTppWwx992(new Zx36ytjSPbRH1S3UCiHxPrB8TD(2));
        pMv5YQHwCTM2nIIj7M3yptU.qygqjTppWwx992(new p4cHT74AOdMuKCh0msPuwJy8E());
        pMv5YQHwCTM2nIIj7M3yptU.qygqjTppWwx992(new Zx36ytjSPbRH1S3UCiHxPrB8TD(1));
        VxUQ9tBhpHJ2AAEDNW8sghc4m = pMv5YQHwCTM2nIIj7M3yptU;
        zzpBGItXfub0yWj = new ThreadLocal();
        V57tEvNfxZVVcOCAOih5PKr = new ArrayList();
    }

    public static void VxUQ9tBhpHJ2AAEDNW8sghc4m(FrameLayout frameLayout, DyKKpKofUua1vK dyKKpKofUua1vK) {
        ArrayList arrayList = V57tEvNfxZVVcOCAOih5PKr;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (dyKKpKofUua1vK == null) {
            dyKKpKofUua1vK = VxUQ9tBhpHJ2AAEDNW8sghc4m;
        }
        DyKKpKofUua1vK dyKKpKofUua1vKClone = dyKKpKofUua1vK.clone();
        ArrayList arrayList2 = (ArrayList) zzpBGItXfub0yWj().get(frameLayout);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ((DyKKpKofUua1vK) obj).Irh5auREsoeV1C1RaBamlmy(frameLayout);
            }
        }
        dyKKpKofUua1vKClone.NSjgqmGjEzuugn2SsG1mZFP(frameLayout, true);
        if (frameLayout.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        frameLayout.setTag(R.id.transition_current_scene, null);
        SMfgCJlXPgsUjNi4YKuQZw sMfgCJlXPgsUjNi4YKuQZw = new SMfgCJlXPgsUjNi4YKuQZw();
        sMfgCJlXPgsUjNi4YKuQZw.V57tEvNfxZVVcOCAOih5PKr = dyKKpKofUua1vKClone;
        sMfgCJlXPgsUjNi4YKuQZw.ZfQNn8hdWlEQ5cR94249PDsLR = frameLayout;
        frameLayout.addOnAttachStateChangeListener(sMfgCJlXPgsUjNi4YKuQZw);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(sMfgCJlXPgsUjNi4YKuQZw);
    }

    public static qKXCIJM1cKNm0a1RAvamOBOVLgp zzpBGItXfub0yWj() {
        qKXCIJM1cKNm0a1RAvamOBOVLgp qkxcijm1cknm0a1ravamobovlgp;
        ThreadLocal threadLocal = zzpBGItXfub0yWj;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (qkxcijm1cknm0a1ravamobovlgp = (qKXCIJM1cKNm0a1RAvamOBOVLgp) weakReference.get()) != null) {
            return qkxcijm1cknm0a1ravamobovlgp;
        }
        qKXCIJM1cKNm0a1RAvamOBOVLgp qkxcijm1cknm0a1ravamobovlgp2 = new qKXCIJM1cKNm0a1RAvamOBOVLgp(0);
        threadLocal.set(new WeakReference(qkxcijm1cknm0a1ravamobovlgp2));
        return qkxcijm1cknm0a1ravamobovlgp2;
    }
}
