package com.vdodsodjsdt;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class DyKKpKofUua1vK implements Cloneable {
    public XYOHiAJNNnPEqr[] Ca81ebIan1u;
    public ArrayList p59rPv72J9;
    public ArrayList q1wNbhk2O6;
    public static final Animator[] w0Wu95l8dVNw5rZMRu = new Animator[0];
    public static final int[] RhfGHxtXxy0M0grmp2jkRjQg = {2, 1, 3, 4};
    public static final VSncX8ksA0tswc2TMhzhOMdd qNPQb1obP7 = new VSncX8ksA0tswc2TMhzhOMdd();
    public static final ThreadLocal SuB3hEmTmbbRGAhtvOOmfKEon = new ThreadLocal();
    public final String V57tEvNfxZVVcOCAOih5PKr = getClass().getName();
    public long ZfQNn8hdWlEQ5cR94249PDsLR = -1;
    public long LaeGQIruHQu81hfJldjMOQSVblH3x = -1;
    public TimeInterpolator zIvmSL0wzmmKGc3X39b2Gw2mUGE = null;
    public final ArrayList ZLZeBXTMq0zDztBxtRTuCHrapQ = new ArrayList();
    public final ArrayList NSjgqmGjEzuugn2SsG1mZFP = new ArrayList();
    public nMRZPpfLCgJyuB GI83zq0G8e7zkn = new nMRZPpfLCgJyuB(9);
    public nMRZPpfLCgJyuB M9e7PWhFYLD2lOGMker = new nMRZPpfLCgJyuB(9);
    public PMv5YQHwCTM2nIIj7M3yptU HzCpKshMOoaw76hFcbOVRYMeRd = null;
    public final int[] KUYypEB4eNWOZWVDpH = RhfGHxtXxy0M0grmp2jkRjQg;
    public final ArrayList h3jnZRsdwYJfY9UhQCkbvWciwvFHv = new ArrayList();
    public Animator[] pYmKDYlAmhudp = w0Wu95l8dVNw5rZMRu;
    public int ko09zE6UAgwkV = 0;
    public boolean jW7EiD0YL6xkbB158jMUzhWNWb1y = false;
    public boolean f6ZQsR6bPLvvCDNXOUc = false;
    public DyKKpKofUua1vK vBGA6pPLqSMuYGvprl270j7 = null;
    public ArrayList TaDO7ogis3aEiWEtq = null;
    public ArrayList Irh5auREsoeV1C1RaBamlmy = new ArrayList();
    public VSncX8ksA0tswc2TMhzhOMdd q11o1hieEkZDhF1MGOZI26oZiDT = qNPQb1obP7;

    public static qKXCIJM1cKNm0a1RAvamOBOVLgp h3jnZRsdwYJfY9UhQCkbvWciwvFHv() {
        ThreadLocal threadLocal = SuB3hEmTmbbRGAhtvOOmfKEon;
        qKXCIJM1cKNm0a1RAvamOBOVLgp qkxcijm1cknm0a1ravamobovlgp = (qKXCIJM1cKNm0a1RAvamOBOVLgp) threadLocal.get();
        if (qkxcijm1cknm0a1ravamobovlgp != null) {
            return qkxcijm1cknm0a1ravamobovlgp;
        }
        qKXCIJM1cKNm0a1RAvamOBOVLgp qkxcijm1cknm0a1ravamobovlgp2 = new qKXCIJM1cKNm0a1RAvamOBOVLgp(0);
        threadLocal.set(qkxcijm1cknm0a1ravamobovlgp2);
        return qkxcijm1cknm0a1ravamobovlgp2;
    }

    public static boolean vBGA6pPLqSMuYGvprl270j7(wfAv4Z4xkzEqsmKhnROCM57sUkreZ wfav4z4xkzeqsmkhnrocm57sukrez, wfAv4Z4xkzEqsmKhnROCM57sUkreZ wfav4z4xkzeqsmkhnrocm57sukrez2, String str) {
        Object obj = wfav4z4xkzeqsmkhnrocm57sukrez.VxUQ9tBhpHJ2AAEDNW8sghc4m.get(str);
        Object obj2 = wfav4z4xkzeqsmkhnrocm57sukrez2.VxUQ9tBhpHJ2AAEDNW8sghc4m.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static void zzpBGItXfub0yWj(nMRZPpfLCgJyuB nmrzppflcgjyub, View view, wfAv4Z4xkzEqsmKhnROCM57sUkreZ wfav4z4xkzeqsmkhnrocm57sukrez) {
        qKXCIJM1cKNm0a1RAvamOBOVLgp qkxcijm1cknm0a1ravamobovlgp = (qKXCIJM1cKNm0a1RAvamOBOVLgp) nmrzppflcgjyub.V57tEvNfxZVVcOCAOih5PKr;
        qKXCIJM1cKNm0a1RAvamOBOVLgp qkxcijm1cknm0a1ravamobovlgp2 = (qKXCIJM1cKNm0a1RAvamOBOVLgp) nmrzppflcgjyub.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        SparseArray sparseArray = (SparseArray) nmrzppflcgjyub.ZfQNn8hdWlEQ5cR94249PDsLR;
        kxD7lnfhVByiEwFdNtrRslxulbe kxd7lnfhvbyiewfdntrrslxulbe = (kxD7lnfhVByiEwFdNtrRslxulbe) nmrzppflcgjyub.LaeGQIruHQu81hfJldjMOQSVblH3x;
        qkxcijm1cknm0a1ravamobovlgp.put(view, wfav4z4xkzeqsmkhnrocm57sukrez);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        String strLaeGQIruHQu81hfJldjMOQSVblH3x = lJgFFp37ou.LaeGQIruHQu81hfJldjMOQSVblH3x(view);
        if (strLaeGQIruHQu81hfJldjMOQSVblH3x != null) {
            if (qkxcijm1cknm0a1ravamobovlgp2.containsKey(strLaeGQIruHQu81hfJldjMOQSVblH3x)) {
                qkxcijm1cknm0a1ravamobovlgp2.put(strLaeGQIruHQu81hfJldjMOQSVblH3x, null);
            } else {
                qkxcijm1cknm0a1ravamobovlgp2.put(strLaeGQIruHQu81hfJldjMOQSVblH3x, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (kxd7lnfhvbyiewfdntrrslxulbe.V57tEvNfxZVVcOCAOih5PKr) {
                    int i = kxd7lnfhvbyiewfdntrrslxulbe.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                    long[] jArr = kxd7lnfhvbyiewfdntrrslxulbe.ZfQNn8hdWlEQ5cR94249PDsLR;
                    Object[] objArr = kxd7lnfhvbyiewfdntrrslxulbe.LaeGQIruHQu81hfJldjMOQSVblH3x;
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        Object obj = objArr[i3];
                        if (obj != FLWIoSaHb1q8TqFvEBgPyRGrzvi6.V57tEvNfxZVVcOCAOih5PKr) {
                            if (i3 != i2) {
                                jArr[i2] = jArr[i3];
                                objArr[i2] = obj;
                                objArr[i3] = null;
                            }
                            i2++;
                        }
                    }
                    kxd7lnfhvbyiewfdntrrslxulbe.V57tEvNfxZVVcOCAOih5PKr = false;
                    kxd7lnfhvbyiewfdntrrslxulbe.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i2;
                }
                if (ej6unYlOWMDF.HzCpKshMOoaw76hFcbOVRYMeRd(kxd7lnfhvbyiewfdntrrslxulbe.ZfQNn8hdWlEQ5cR94249PDsLR, kxd7lnfhvbyiewfdntrrslxulbe.zIvmSL0wzmmKGc3X39b2Gw2mUGE, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    kxd7lnfhvbyiewfdntrrslxulbe.ZfQNn8hdWlEQ5cR94249PDsLR(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) kxd7lnfhvbyiewfdntrrslxulbe.zzpBGItXfub0yWj(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    kxd7lnfhvbyiewfdntrrslxulbe.ZfQNn8hdWlEQ5cR94249PDsLR(itemIdAtPosition, null);
                }
            }
        }
    }

    public final DyKKpKofUua1vK Ca81ebIan1u() {
        PMv5YQHwCTM2nIIj7M3yptU pMv5YQHwCTM2nIIj7M3yptU = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        return pMv5YQHwCTM2nIIj7M3yptU != null ? pMv5YQHwCTM2nIIj7M3yptU.Ca81ebIan1u() : this;
    }

    public final void GI83zq0G8e7zkn(boolean z) {
        if (z) {
            ((qKXCIJM1cKNm0a1RAvamOBOVLgp) this.GI83zq0G8e7zkn.V57tEvNfxZVVcOCAOih5PKr).clear();
            ((SparseArray) this.GI83zq0G8e7zkn.ZfQNn8hdWlEQ5cR94249PDsLR).clear();
            ((kxD7lnfhVByiEwFdNtrRslxulbe) this.GI83zq0G8e7zkn.LaeGQIruHQu81hfJldjMOQSVblH3x).VxUQ9tBhpHJ2AAEDNW8sghc4m();
        } else {
            ((qKXCIJM1cKNm0a1RAvamOBOVLgp) this.M9e7PWhFYLD2lOGMker.V57tEvNfxZVVcOCAOih5PKr).clear();
            ((SparseArray) this.M9e7PWhFYLD2lOGMker.ZfQNn8hdWlEQ5cR94249PDsLR).clear();
            ((kxD7lnfhVByiEwFdNtrRslxulbe) this.M9e7PWhFYLD2lOGMker.LaeGQIruHQu81hfJldjMOQSVblH3x).VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
    }

    public final void HVEwbdULInpTNa0IG() {
        if (this.ko09zE6UAgwkV == 0) {
            TaDO7ogis3aEiWEtq(this, ojJdkROPjZ.ZfQNn8hdWlEQ5cR94249PDsLR);
            this.f6ZQsR6bPLvvCDNXOUc = false;
        }
        this.ko09zE6UAgwkV++;
    }

    public Animator HzCpKshMOoaw76hFcbOVRYMeRd(ViewGroup viewGroup, wfAv4Z4xkzEqsmKhnROCM57sUkreZ wfav4z4xkzeqsmkhnrocm57sukrez, wfAv4Z4xkzEqsmKhnROCM57sUkreZ wfav4z4xkzeqsmkhnrocm57sukrez2) {
        return null;
    }

    public void Irh5auREsoeV1C1RaBamlmy(View view) {
        if (this.f6ZQsR6bPLvvCDNXOUc) {
            return;
        }
        ArrayList arrayList = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.pYmKDYlAmhudp);
        this.pYmKDYlAmhudp = w0Wu95l8dVNw5rZMRu;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.pYmKDYlAmhudp = animatorArr;
        TaDO7ogis3aEiWEtq(this, ojJdkROPjZ.ZLZeBXTMq0zDztBxtRTuCHrapQ);
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = true;
    }

    public void KUYypEB4eNWOZWVDpH(ViewGroup viewGroup, nMRZPpfLCgJyuB nmrzppflcgjyub, nMRZPpfLCgJyuB nmrzppflcgjyub2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        int i2;
        View view;
        wfAv4Z4xkzEqsmKhnROCM57sUkreZ wfav4z4xkzeqsmkhnrocm57sukrez;
        Animator animator;
        wfAv4Z4xkzEqsmKhnROCM57sUkreZ wfav4z4xkzeqsmkhnrocm57sukrez2;
        qKXCIJM1cKNm0a1RAvamOBOVLgp qkxcijm1cknm0a1ravamobovlgpH3jnZRsdwYJfY9UhQCkbvWciwvFHv = h3jnZRsdwYJfY9UhQCkbvWciwvFHv();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        Ca81ebIan1u().getClass();
        int i3 = 0;
        while (i3 < size) {
            wfAv4Z4xkzEqsmKhnROCM57sUkreZ wfav4z4xkzeqsmkhnrocm57sukrez3 = (wfAv4Z4xkzEqsmKhnROCM57sUkreZ) arrayList.get(i3);
            wfAv4Z4xkzEqsmKhnROCM57sUkreZ wfav4z4xkzeqsmkhnrocm57sukrez4 = (wfAv4Z4xkzEqsmKhnROCM57sUkreZ) arrayList2.get(i3);
            if (wfav4z4xkzeqsmkhnrocm57sukrez3 != null && !wfav4z4xkzeqsmkhnrocm57sukrez3.V57tEvNfxZVVcOCAOih5PKr.contains(this)) {
                wfav4z4xkzeqsmkhnrocm57sukrez3 = null;
            }
            if (wfav4z4xkzeqsmkhnrocm57sukrez4 != null && !wfav4z4xkzeqsmkhnrocm57sukrez4.V57tEvNfxZVVcOCAOih5PKr.contains(this)) {
                wfav4z4xkzeqsmkhnrocm57sukrez4 = null;
            }
            if ((wfav4z4xkzeqsmkhnrocm57sukrez3 != null || wfav4z4xkzeqsmkhnrocm57sukrez4 != null) && (wfav4z4xkzeqsmkhnrocm57sukrez3 == null || wfav4z4xkzeqsmkhnrocm57sukrez4 == null || jW7EiD0YL6xkbB158jMUzhWNWb1y(wfav4z4xkzeqsmkhnrocm57sukrez3, wfav4z4xkzeqsmkhnrocm57sukrez4))) {
                Animator animatorHzCpKshMOoaw76hFcbOVRYMeRd = HzCpKshMOoaw76hFcbOVRYMeRd(viewGroup, wfav4z4xkzeqsmkhnrocm57sukrez3, wfav4z4xkzeqsmkhnrocm57sukrez4);
                if (animatorHzCpKshMOoaw76hFcbOVRYMeRd != null) {
                    String str = this.V57tEvNfxZVVcOCAOih5PKr;
                    if (wfav4z4xkzeqsmkhnrocm57sukrez4 != null) {
                        view = wfav4z4xkzeqsmkhnrocm57sukrez4.zzpBGItXfub0yWj;
                        String[] strArrPYmKDYlAmhudp = pYmKDYlAmhudp();
                        if (strArrPYmKDYlAmhudp != null && strArrPYmKDYlAmhudp.length > 0) {
                            wfav4z4xkzeqsmkhnrocm57sukrez2 = new wfAv4Z4xkzEqsmKhnROCM57sUkreZ(view);
                            wfAv4Z4xkzEqsmKhnROCM57sUkreZ wfav4z4xkzeqsmkhnrocm57sukrez5 = (wfAv4Z4xkzEqsmKhnROCM57sUkreZ) ((qKXCIJM1cKNm0a1RAvamOBOVLgp) nmrzppflcgjyub2.V57tEvNfxZVVcOCAOih5PKr).get(view);
                            i = size;
                            if (wfav4z4xkzeqsmkhnrocm57sukrez5 != null) {
                                int i4 = 0;
                                while (i4 < strArrPYmKDYlAmhudp.length) {
                                    String str2 = strArrPYmKDYlAmhudp[i4];
                                    int i5 = i3;
                                    wfav4z4xkzeqsmkhnrocm57sukrez2.VxUQ9tBhpHJ2AAEDNW8sghc4m.put(str2, wfav4z4xkzeqsmkhnrocm57sukrez5.VxUQ9tBhpHJ2AAEDNW8sghc4m.get(str2));
                                    i4++;
                                    i3 = i5;
                                    wfav4z4xkzeqsmkhnrocm57sukrez5 = wfav4z4xkzeqsmkhnrocm57sukrez5;
                                }
                            }
                            i2 = i3;
                            int i6 = qkxcijm1cknm0a1ravamobovlgpH3jnZRsdwYJfY9UhQCkbvWciwvFHv.LaeGQIruHQu81hfJldjMOQSVblH3x;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= i6) {
                                    animator = animatorHzCpKshMOoaw76hFcbOVRYMeRd;
                                    break;
                                }
                                z13yxMVl6TE8LBsSoxJX0sqD z13yxmvl6te8lbssoxjx0sqd = (z13yxMVl6TE8LBsSoxJX0sqD) qkxcijm1cknm0a1ravamobovlgpH3jnZRsdwYJfY9UhQCkbvWciwvFHv.get((Animator) qkxcijm1cknm0a1ravamobovlgpH3jnZRsdwYJfY9UhQCkbvWciwvFHv.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i7));
                                if (z13yxmvl6te8lbssoxjx0sqd.V57tEvNfxZVVcOCAOih5PKr != null && z13yxmvl6te8lbssoxjx0sqd.VxUQ9tBhpHJ2AAEDNW8sghc4m == view && z13yxmvl6te8lbssoxjx0sqd.zzpBGItXfub0yWj.equals(str) && z13yxmvl6te8lbssoxjx0sqd.V57tEvNfxZVVcOCAOih5PKr.equals(wfav4z4xkzeqsmkhnrocm57sukrez2)) {
                                    animator = null;
                                    break;
                                }
                                i7++;
                            }
                        } else {
                            i = size;
                            i2 = i3;
                            animator = animatorHzCpKshMOoaw76hFcbOVRYMeRd;
                            wfav4z4xkzeqsmkhnrocm57sukrez2 = null;
                        }
                        animatorHzCpKshMOoaw76hFcbOVRYMeRd = animator;
                        wfav4z4xkzeqsmkhnrocm57sukrez = wfav4z4xkzeqsmkhnrocm57sukrez2;
                    } else {
                        i = size;
                        i2 = i3;
                        view = wfav4z4xkzeqsmkhnrocm57sukrez3.zzpBGItXfub0yWj;
                        wfav4z4xkzeqsmkhnrocm57sukrez = null;
                    }
                    if (animatorHzCpKshMOoaw76hFcbOVRYMeRd != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        z13yxMVl6TE8LBsSoxJX0sqD z13yxmvl6te8lbssoxjx0sqd2 = new z13yxMVl6TE8LBsSoxJX0sqD();
                        z13yxmvl6te8lbssoxjx0sqd2.VxUQ9tBhpHJ2AAEDNW8sghc4m = view;
                        z13yxmvl6te8lbssoxjx0sqd2.zzpBGItXfub0yWj = str;
                        z13yxmvl6te8lbssoxjx0sqd2.V57tEvNfxZVVcOCAOih5PKr = wfav4z4xkzeqsmkhnrocm57sukrez;
                        z13yxmvl6te8lbssoxjx0sqd2.ZfQNn8hdWlEQ5cR94249PDsLR = windowId;
                        z13yxmvl6te8lbssoxjx0sqd2.LaeGQIruHQu81hfJldjMOQSVblH3x = this;
                        z13yxmvl6te8lbssoxjx0sqd2.zIvmSL0wzmmKGc3X39b2Gw2mUGE = animatorHzCpKshMOoaw76hFcbOVRYMeRd;
                        qkxcijm1cknm0a1ravamobovlgpH3jnZRsdwYJfY9UhQCkbvWciwvFHv.put(animatorHzCpKshMOoaw76hFcbOVRYMeRd, z13yxmvl6te8lbssoxjx0sqd2);
                        this.Irh5auREsoeV1C1RaBamlmy.add(animatorHzCpKshMOoaw76hFcbOVRYMeRd);
                    }
                }
                i3 = i2 + 1;
                size = i;
            }
            i = size;
            i2 = i3;
            i3 = i2 + 1;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i8 = 0; i8 < sparseIntArray.size(); i8++) {
                z13yxMVl6TE8LBsSoxJX0sqD z13yxmvl6te8lbssoxjx0sqd3 = (z13yxMVl6TE8LBsSoxJX0sqD) qkxcijm1cknm0a1ravamobovlgpH3jnZRsdwYJfY9UhQCkbvWciwvFHv.get((Animator) this.Irh5auREsoeV1C1RaBamlmy.get(sparseIntArray.keyAt(i8)));
                z13yxmvl6te8lbssoxjx0sqd3.zIvmSL0wzmmKGc3X39b2Gw2mUGE.setStartDelay(z13yxmvl6te8lbssoxjx0sqd3.zIvmSL0wzmmKGc3X39b2Gw2mUGE.getStartDelay() + (((long) sparseIntArray.valueAt(i8)) - Long.MAX_VALUE));
            }
        }
    }

    public final void LaeGQIruHQu81hfJldjMOQSVblH3x(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            wfAv4Z4xkzEqsmKhnROCM57sUkreZ wfav4z4xkzeqsmkhnrocm57sukrez = new wfAv4Z4xkzEqsmKhnROCM57sUkreZ(view);
            if (z) {
                ZLZeBXTMq0zDztBxtRTuCHrapQ(wfav4z4xkzeqsmkhnrocm57sukrez);
            } else {
                ZfQNn8hdWlEQ5cR94249PDsLR(wfav4z4xkzeqsmkhnrocm57sukrez);
            }
            wfav4z4xkzeqsmkhnrocm57sukrez.V57tEvNfxZVVcOCAOih5PKr.add(this);
            zIvmSL0wzmmKGc3X39b2Gw2mUGE(wfav4z4xkzeqsmkhnrocm57sukrez);
            if (z) {
                zzpBGItXfub0yWj(this.GI83zq0G8e7zkn, view, wfav4z4xkzeqsmkhnrocm57sukrez);
            } else {
                zzpBGItXfub0yWj(this.M9e7PWhFYLD2lOGMker, view, wfav4z4xkzeqsmkhnrocm57sukrez);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                LaeGQIruHQu81hfJldjMOQSVblH3x(viewGroup.getChildAt(i), z);
            }
        }
    }

    @Override // 
    /* JADX INFO: renamed from: M9e7PWhFYLD2lOGMker */
    public DyKKpKofUua1vK clone() {
        try {
            DyKKpKofUua1vK dyKKpKofUua1vK = (DyKKpKofUua1vK) super.clone();
            dyKKpKofUua1vK.Irh5auREsoeV1C1RaBamlmy = new ArrayList();
            dyKKpKofUua1vK.GI83zq0G8e7zkn = new nMRZPpfLCgJyuB(9);
            dyKKpKofUua1vK.M9e7PWhFYLD2lOGMker = new nMRZPpfLCgJyuB(9);
            dyKKpKofUua1vK.q1wNbhk2O6 = null;
            dyKKpKofUua1vK.p59rPv72J9 = null;
            dyKKpKofUua1vK.vBGA6pPLqSMuYGvprl270j7 = this;
            dyKKpKofUua1vK.TaDO7ogis3aEiWEtq = null;
            return dyKKpKofUua1vK;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final void NSjgqmGjEzuugn2SsG1mZFP(ViewGroup viewGroup, boolean z) {
        GI83zq0G8e7zkn(z);
        ArrayList arrayList = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        int size = arrayList.size();
        ArrayList arrayList2 = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (size <= 0 && arrayList2.size() <= 0) {
            LaeGQIruHQu81hfJldjMOQSVblH3x(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                wfAv4Z4xkzEqsmKhnROCM57sUkreZ wfav4z4xkzeqsmkhnrocm57sukrez = new wfAv4Z4xkzEqsmKhnROCM57sUkreZ(viewFindViewById);
                if (z) {
                    ZLZeBXTMq0zDztBxtRTuCHrapQ(wfav4z4xkzeqsmkhnrocm57sukrez);
                } else {
                    ZfQNn8hdWlEQ5cR94249PDsLR(wfav4z4xkzeqsmkhnrocm57sukrez);
                }
                wfav4z4xkzeqsmkhnrocm57sukrez.V57tEvNfxZVVcOCAOih5PKr.add(this);
                zIvmSL0wzmmKGc3X39b2Gw2mUGE(wfav4z4xkzeqsmkhnrocm57sukrez);
                if (z) {
                    zzpBGItXfub0yWj(this.GI83zq0G8e7zkn, viewFindViewById, wfav4z4xkzeqsmkhnrocm57sukrez);
                } else {
                    zzpBGItXfub0yWj(this.M9e7PWhFYLD2lOGMker, viewFindViewById, wfav4z4xkzeqsmkhnrocm57sukrez);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            wfAv4Z4xkzEqsmKhnROCM57sUkreZ wfav4z4xkzeqsmkhnrocm57sukrez2 = new wfAv4Z4xkzEqsmKhnROCM57sUkreZ(view);
            if (z) {
                ZLZeBXTMq0zDztBxtRTuCHrapQ(wfav4z4xkzeqsmkhnrocm57sukrez2);
            } else {
                ZfQNn8hdWlEQ5cR94249PDsLR(wfav4z4xkzeqsmkhnrocm57sukrez2);
            }
            wfav4z4xkzeqsmkhnrocm57sukrez2.V57tEvNfxZVVcOCAOih5PKr.add(this);
            zIvmSL0wzmmKGc3X39b2Gw2mUGE(wfav4z4xkzeqsmkhnrocm57sukrez2);
            if (z) {
                zzpBGItXfub0yWj(this.GI83zq0G8e7zkn, view, wfav4z4xkzeqsmkhnrocm57sukrez2);
            } else {
                zzpBGItXfub0yWj(this.M9e7PWhFYLD2lOGMker, view, wfav4z4xkzeqsmkhnrocm57sukrez2);
            }
        }
    }

    public void O1xDAlBZZlZdoEf747lCFHld(long j) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR = j;
    }

    public void RhfGHxtXxy0M0grmp2jkRjQg() {
        HVEwbdULInpTNa0IG();
        qKXCIJM1cKNm0a1RAvamOBOVLgp qkxcijm1cknm0a1ravamobovlgpH3jnZRsdwYJfY9UhQCkbvWciwvFHv = h3jnZRsdwYJfY9UhQCkbvWciwvFHv();
        ArrayList arrayList = this.Irh5auREsoeV1C1RaBamlmy;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Animator animator = (Animator) obj;
            if (qkxcijm1cknm0a1ravamobovlgpH3jnZRsdwYJfY9UhQCkbvWciwvFHv.containsKey(animator)) {
                HVEwbdULInpTNa0IG();
                if (animator != null) {
                    animator.addListener(new eogwdH6zMZ(this, qkxcijm1cknm0a1ravamobovlgpH3jnZRsdwYJfY9UhQCkbvWciwvFHv));
                    long j = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new LJ0avg2f37zqC(5, this));
                    animator.start();
                }
            }
        }
        this.Irh5auREsoeV1C1RaBamlmy.clear();
        q1wNbhk2O6();
    }

    public final void TaDO7ogis3aEiWEtq(DyKKpKofUua1vK dyKKpKofUua1vK, ojJdkROPjZ ojjdkropjz) {
        DyKKpKofUua1vK dyKKpKofUua1vK2 = this.vBGA6pPLqSMuYGvprl270j7;
        if (dyKKpKofUua1vK2 != null) {
            dyKKpKofUua1vK2.TaDO7ogis3aEiWEtq(dyKKpKofUua1vK, ojjdkropjz);
        }
        ArrayList arrayList = this.TaDO7ogis3aEiWEtq;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.TaDO7ogis3aEiWEtq.size();
        XYOHiAJNNnPEqr[] xYOHiAJNNnPEqrArr = this.Ca81ebIan1u;
        if (xYOHiAJNNnPEqrArr == null) {
            xYOHiAJNNnPEqrArr = new XYOHiAJNNnPEqr[size];
        }
        this.Ca81ebIan1u = null;
        XYOHiAJNNnPEqr[] xYOHiAJNNnPEqrArr2 = (XYOHiAJNNnPEqr[]) this.TaDO7ogis3aEiWEtq.toArray(xYOHiAJNNnPEqrArr);
        for (int i = 0; i < size; i++) {
            XYOHiAJNNnPEqr xYOHiAJNNnPEqr = xYOHiAJNNnPEqrArr2[i];
            switch (ojjdkropjz.V57tEvNfxZVVcOCAOih5PKr) {
                case 13:
                    xYOHiAJNNnPEqr.zIvmSL0wzmmKGc3X39b2Gw2mUGE(dyKKpKofUua1vK);
                    break;
                case 14:
                    xYOHiAJNNnPEqr.ZfQNn8hdWlEQ5cR94249PDsLR(dyKKpKofUua1vK);
                    break;
                case 15:
                    xYOHiAJNNnPEqr.VxUQ9tBhpHJ2AAEDNW8sghc4m(dyKKpKofUua1vK);
                    break;
                case 16:
                    xYOHiAJNNnPEqr.zzpBGItXfub0yWj();
                    break;
                default:
                    xYOHiAJNNnPEqr.V57tEvNfxZVVcOCAOih5PKr();
                    break;
            }
            xYOHiAJNNnPEqrArr2[i] = null;
        }
        this.Ca81ebIan1u = xYOHiAJNNnPEqrArr2;
    }

    public void V57tEvNfxZVVcOCAOih5PKr() {
        ArrayList arrayList = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.pYmKDYlAmhudp);
        this.pYmKDYlAmhudp = w0Wu95l8dVNw5rZMRu;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.pYmKDYlAmhudp = animatorArr;
        TaDO7ogis3aEiWEtq(this, ojJdkROPjZ.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
    }

    public void VxUQ9tBhpHJ2AAEDNW8sghc4m(XYOHiAJNNnPEqr xYOHiAJNNnPEqr) {
        if (this.TaDO7ogis3aEiWEtq == null) {
            this.TaDO7ogis3aEiWEtq = new ArrayList();
        }
        this.TaDO7ogis3aEiWEtq.add(xYOHiAJNNnPEqr);
    }

    public abstract void ZLZeBXTMq0zDztBxtRTuCHrapQ(wfAv4Z4xkzEqsmKhnROCM57sUkreZ wfav4z4xkzeqsmkhnrocm57sukrez);

    public abstract void ZfQNn8hdWlEQ5cR94249PDsLR(wfAv4Z4xkzEqsmKhnROCM57sUkreZ wfav4z4xkzeqsmkhnrocm57sukrez);

    public void aXO0LSrt8bKV(VSncX8ksA0tswc2TMhzhOMdd vSncX8ksA0tswc2TMhzhOMdd) {
        if (vSncX8ksA0tswc2TMhzhOMdd == null) {
            this.q11o1hieEkZDhF1MGOZI26oZiDT = qNPQb1obP7;
        } else {
            this.q11o1hieEkZDhF1MGOZI26oZiDT = vSncX8ksA0tswc2TMhzhOMdd;
        }
    }

    public final boolean f6ZQsR6bPLvvCDNXOUc(View view) {
        int id = view.getId();
        ArrayList arrayList = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        int size = arrayList.size();
        ArrayList arrayList2 = this.NSjgqmGjEzuugn2SsG1mZFP;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public boolean jW7EiD0YL6xkbB158jMUzhWNWb1y(wfAv4Z4xkzEqsmKhnROCM57sUkreZ wfav4z4xkzeqsmkhnrocm57sukrez, wfAv4Z4xkzEqsmKhnROCM57sUkreZ wfav4z4xkzeqsmkhnrocm57sukrez2) {
        if (wfav4z4xkzeqsmkhnrocm57sukrez != null && wfav4z4xkzeqsmkhnrocm57sukrez2 != null) {
            String[] strArrPYmKDYlAmhudp = pYmKDYlAmhudp();
            if (strArrPYmKDYlAmhudp != null) {
                for (String str : strArrPYmKDYlAmhudp) {
                    if (vBGA6pPLqSMuYGvprl270j7(wfav4z4xkzeqsmkhnrocm57sukrez, wfav4z4xkzeqsmkhnrocm57sukrez2, str)) {
                        return true;
                    }
                }
            } else {
                Iterator it = wfav4z4xkzeqsmkhnrocm57sukrez.VxUQ9tBhpHJ2AAEDNW8sghc4m.keySet().iterator();
                while (it.hasNext()) {
                    if (vBGA6pPLqSMuYGvprl270j7(wfav4z4xkzeqsmkhnrocm57sukrez, wfav4z4xkzeqsmkhnrocm57sukrez2, (String) it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final wfAv4Z4xkzEqsmKhnROCM57sUkreZ ko09zE6UAgwkV(View view, boolean z) {
        PMv5YQHwCTM2nIIj7M3yptU pMv5YQHwCTM2nIIj7M3yptU = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        if (pMv5YQHwCTM2nIIj7M3yptU != null) {
            return pMv5YQHwCTM2nIIj7M3yptU.ko09zE6UAgwkV(view, z);
        }
        return (wfAv4Z4xkzEqsmKhnROCM57sUkreZ) ((qKXCIJM1cKNm0a1RAvamOBOVLgp) (z ? this.GI83zq0G8e7zkn : this.M9e7PWhFYLD2lOGMker).V57tEvNfxZVVcOCAOih5PKr).get(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r2 < 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r6 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        r5 = r4.p59rPv72J9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
    
        r5 = r4.q1wNbhk2O6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        return (com.vdodsodjsdt.wfAv4Z4xkzEqsmKhnROCM57sUkreZ) r5.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.vdodsodjsdt.wfAv4Z4xkzEqsmKhnROCM57sUkreZ p59rPv72J9(android.view.View r5, boolean r6) {
        /*
            r4 = this;
            com.vdodsodjsdt.PMv5YQHwCTM2nIIj7M3yptU r0 = r4.HzCpKshMOoaw76hFcbOVRYMeRd
            if (r0 == 0) goto L9
            com.vdodsodjsdt.wfAv4Z4xkzEqsmKhnROCM57sUkreZ r5 = r0.p59rPv72J9(r5, r6)
            return r5
        L9:
            if (r6 == 0) goto Le
            java.util.ArrayList r0 = r4.q1wNbhk2O6
            goto L10
        Le:
            java.util.ArrayList r0 = r4.p59rPv72J9
        L10:
            if (r0 != 0) goto L13
            goto L3c
        L13:
            int r1 = r0.size()
            r2 = 0
        L18:
            if (r2 >= r1) goto L2b
            java.lang.Object r3 = r0.get(r2)
            com.vdodsodjsdt.wfAv4Z4xkzEqsmKhnROCM57sUkreZ r3 = (com.vdodsodjsdt.wfAv4Z4xkzEqsmKhnROCM57sUkreZ) r3
            if (r3 != 0) goto L23
            goto L3c
        L23:
            android.view.View r3 = r3.zzpBGItXfub0yWj
            if (r3 != r5) goto L28
            goto L2c
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            r2 = -1
        L2c:
            if (r2 < 0) goto L3c
            if (r6 == 0) goto L33
            java.util.ArrayList r5 = r4.p59rPv72J9
            goto L35
        L33:
            java.util.ArrayList r5 = r4.q1wNbhk2O6
        L35:
            java.lang.Object r5 = r5.get(r2)
            com.vdodsodjsdt.wfAv4Z4xkzEqsmKhnROCM57sUkreZ r5 = (com.vdodsodjsdt.wfAv4Z4xkzEqsmKhnROCM57sUkreZ) r5
            return r5
        L3c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.DyKKpKofUua1vK.p59rPv72J9(android.view.View, boolean):com.vdodsodjsdt.wfAv4Z4xkzEqsmKhnROCM57sUkreZ");
    }

    public String[] pYmKDYlAmhudp() {
        return null;
    }

    public void pzqP2AqKW6J5PO8zCKnW(TimeInterpolator timeInterpolator) {
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = timeInterpolator;
    }

    public DyKKpKofUua1vK q11o1hieEkZDhF1MGOZI26oZiDT(XYOHiAJNNnPEqr xYOHiAJNNnPEqr) {
        DyKKpKofUua1vK dyKKpKofUua1vK;
        ArrayList arrayList = this.TaDO7ogis3aEiWEtq;
        if (arrayList != null) {
            if (!arrayList.remove(xYOHiAJNNnPEqr) && (dyKKpKofUua1vK = this.vBGA6pPLqSMuYGvprl270j7) != null) {
                dyKKpKofUua1vK.q11o1hieEkZDhF1MGOZI26oZiDT(xYOHiAJNNnPEqr);
            }
            if (this.TaDO7ogis3aEiWEtq.size() == 0) {
                this.TaDO7ogis3aEiWEtq = null;
            }
        }
        return this;
    }

    public final void q1wNbhk2O6() {
        int i = this.ko09zE6UAgwkV - 1;
        this.ko09zE6UAgwkV = i;
        if (i == 0) {
            TaDO7ogis3aEiWEtq(this, ojJdkROPjZ.LaeGQIruHQu81hfJldjMOQSVblH3x);
            for (int i2 = 0; i2 < ((kxD7lnfhVByiEwFdNtrRslxulbe) this.GI83zq0G8e7zkn.LaeGQIruHQu81hfJldjMOQSVblH3x).LaeGQIruHQu81hfJldjMOQSVblH3x(); i2++) {
                View view = (View) ((kxD7lnfhVByiEwFdNtrRslxulbe) this.GI83zq0G8e7zkn.LaeGQIruHQu81hfJldjMOQSVblH3x).zIvmSL0wzmmKGc3X39b2Gw2mUGE(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((kxD7lnfhVByiEwFdNtrRslxulbe) this.M9e7PWhFYLD2lOGMker.LaeGQIruHQu81hfJldjMOQSVblH3x).LaeGQIruHQu81hfJldjMOQSVblH3x(); i3++) {
                View view2 = (View) ((kxD7lnfhVByiEwFdNtrRslxulbe) this.M9e7PWhFYLD2lOGMker.LaeGQIruHQu81hfJldjMOQSVblH3x).zIvmSL0wzmmKGc3X39b2Gw2mUGE(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f6ZQsR6bPLvvCDNXOUc = true;
        }
    }

    public void qNPQb1obP7(long j) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = j;
    }

    public final String toString() {
        return y1NaPKTl7R18DOr6e8i5("");
    }

    public void w0Wu95l8dVNw5rZMRu(View view) {
        if (this.jW7EiD0YL6xkbB158jMUzhWNWb1y) {
            if (!this.f6ZQsR6bPLvvCDNXOUc) {
                ArrayList arrayList = this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.pYmKDYlAmhudp);
                this.pYmKDYlAmhudp = w0Wu95l8dVNw5rZMRu;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.pYmKDYlAmhudp = animatorArr;
                TaDO7ogis3aEiWEtq(this, ojJdkROPjZ.NSjgqmGjEzuugn2SsG1mZFP);
            }
            this.jW7EiD0YL6xkbB158jMUzhWNWb1y = false;
        }
    }

    public String y1NaPKTl7R18DOr6e8i5(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x != -1) {
            sb.append("dur(");
            sb.append(this.LaeGQIruHQu81hfJldjMOQSVblH3x);
            sb.append(") ");
        }
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR != -1) {
            sb.append("dly(");
            sb.append(this.ZfQNn8hdWlEQ5cR94249PDsLR);
            sb.append(") ");
        }
        if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE != null) {
            sb.append("interp(");
            sb.append(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
            sb.append(") ");
        }
        ArrayList arrayList = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        int size = arrayList.size();
        ArrayList arrayList2 = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void vE4yDIjexsP2lGjLaTcB() {
    }

    public void SuB3hEmTmbbRGAhtvOOmfKEon(ej6unYlOWMDF ej6unylowmdf) {
    }

    public void zIvmSL0wzmmKGc3X39b2Gw2mUGE(wfAv4Z4xkzEqsmKhnROCM57sUkreZ wfav4z4xkzeqsmkhnrocm57sukrez) {
    }
}
