package com.vdodsodjsdt;

import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class iFKXVhXhX8FyZGUEP1rAer7 {
    public final ViewGroup VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final ArrayList zzpBGItXfub0yWj = new ArrayList();
    public final ArrayList V57tEvNfxZVVcOCAOih5PKr = new ArrayList();
    public boolean ZfQNn8hdWlEQ5cR94249PDsLR = false;
    public boolean LaeGQIruHQu81hfJldjMOQSVblH3x = false;

    public iFKXVhXhX8FyZGUEP1rAer7(ViewGroup viewGroup) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = viewGroup;
    }

    public static iFKXVhXhX8FyZGUEP1rAer7 zIvmSL0wzmmKGc3X39b2Gw2mUGE(ViewGroup viewGroup, FG8LIxsgYiLSfhN0jYKIKr fG8LIxsgYiLSfhN0jYKIKr) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof iFKXVhXhX8FyZGUEP1rAer7) {
            return (iFKXVhXhX8FyZGUEP1rAer7) tag;
        }
        fG8LIxsgYiLSfhN0jYKIKr.getClass();
        iFKXVhXhX8FyZGUEP1rAer7 ifkxvhxhx8fyzguep1raer7 = new iFKXVhXhX8FyZGUEP1rAer7(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, ifkxvhxhx8fyzguep1raer7);
        return ifkxvhxhx8fyzguep1raer7;
    }

    public final void LaeGQIruHQu81hfJldjMOQSVblH3x() {
        String str;
        String str2;
        if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.zzpBGItXfub0yWj) {
            try {
                ZLZeBXTMq0zDztBxtRTuCHrapQ();
                ArrayList arrayList = this.zzpBGItXfub0yWj;
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((RD86Fssz0iKbf0t61L) obj).ZfQNn8hdWlEQ5cR94249PDsLR();
                }
                ArrayList arrayList2 = new ArrayList(this.V57tEvNfxZVVcOCAOih5PKr);
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    RD86Fssz0iKbf0t61L rD86Fssz0iKbf0t61L = (RD86Fssz0iKbf0t61L) obj2;
                    if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (zIsAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.VxUQ9tBhpHJ2AAEDNW8sghc4m + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(rD86Fssz0iKbf0t61L);
                        Log.v("FragmentManager", sb.toString());
                    }
                    rD86Fssz0iKbf0t61L.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                }
                ArrayList arrayList3 = new ArrayList(this.zzpBGItXfub0yWj);
                int size3 = arrayList3.size();
                while (i < size3) {
                    Object obj3 = arrayList3.get(i);
                    i++;
                    RD86Fssz0iKbf0t61L rD86Fssz0iKbf0t61L2 = (RD86Fssz0iKbf0t61L) obj3;
                    if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (zIsAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.VxUQ9tBhpHJ2AAEDNW8sghc4m + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(rD86Fssz0iKbf0t61L2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    rD86Fssz0iKbf0t61L2.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void V57tEvNfxZVVcOCAOih5PKr() {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            return;
        }
        ViewGroup viewGroup = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (!viewGroup.isAttachedToWindow()) {
            LaeGQIruHQu81hfJldjMOQSVblH3x();
            this.ZfQNn8hdWlEQ5cR94249PDsLR = false;
            return;
        }
        synchronized (this.zzpBGItXfub0yWj) {
            try {
                if (!this.zzpBGItXfub0yWj.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.V57tEvNfxZVVcOCAOih5PKr);
                    this.V57tEvNfxZVVcOCAOih5PKr.clear();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        RD86Fssz0iKbf0t61L rD86Fssz0iKbf0t61L = (RD86Fssz0iKbf0t61L) obj;
                        if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + rD86Fssz0iKbf0t61L);
                        }
                        rD86Fssz0iKbf0t61L.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                        if (!rD86Fssz0iKbf0t61L.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
                            this.V57tEvNfxZVVcOCAOih5PKr.add(rD86Fssz0iKbf0t61L);
                        }
                    }
                    ZLZeBXTMq0zDztBxtRTuCHrapQ();
                    ArrayList arrayList2 = new ArrayList(this.zzpBGItXfub0yWj);
                    this.zzpBGItXfub0yWj.clear();
                    this.V57tEvNfxZVVcOCAOih5PKr.addAll(arrayList2);
                    if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayList2.get(i2);
                        i2++;
                        ((RD86Fssz0iKbf0t61L) obj2).ZfQNn8hdWlEQ5cR94249PDsLR();
                    }
                    zzpBGItXfub0yWj(arrayList2, this.ZfQNn8hdWlEQ5cR94249PDsLR);
                    this.ZfQNn8hdWlEQ5cR94249PDsLR = false;
                    if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(int i, int i2, androidx.fragment.app.iVKrTMqOw0TqCeNN ivkrtmqow0tqcenn) {
        synchronized (this.zzpBGItXfub0yWj) {
            try {
                KO5iX6ddrwZmAa4iLnc7 kO5iX6ddrwZmAa4iLnc7 = new KO5iX6ddrwZmAa4iLnc7();
                RD86Fssz0iKbf0t61L rD86Fssz0iKbf0t61LZfQNn8hdWlEQ5cR94249PDsLR = ZfQNn8hdWlEQ5cR94249PDsLR(ivkrtmqow0tqcenn.V57tEvNfxZVVcOCAOih5PKr);
                if (rD86Fssz0iKbf0t61LZfQNn8hdWlEQ5cR94249PDsLR != null) {
                    rD86Fssz0iKbf0t61LZfQNn8hdWlEQ5cR94249PDsLR.V57tEvNfxZVVcOCAOih5PKr(i, i2);
                    return;
                }
                RD86Fssz0iKbf0t61L rD86Fssz0iKbf0t61L = new RD86Fssz0iKbf0t61L(i, i2, ivkrtmqow0tqcenn, kO5iX6ddrwZmAa4iLnc7);
                this.zzpBGItXfub0yWj.add(rD86Fssz0iKbf0t61L);
                rD86Fssz0iKbf0t61L.ZfQNn8hdWlEQ5cR94249PDsLR.add(new dcAI4zKX9NS5PBMe(this, rD86Fssz0iKbf0t61L, 0));
                rD86Fssz0iKbf0t61L.ZfQNn8hdWlEQ5cR94249PDsLR.add(new dcAI4zKX9NS5PBMe(this, rD86Fssz0iKbf0t61L, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ() {
        ArrayList arrayList = this.zzpBGItXfub0yWj;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            RD86Fssz0iKbf0t61L rD86Fssz0iKbf0t61L = (RD86Fssz0iKbf0t61L) obj;
            if (rD86Fssz0iKbf0t61L.zzpBGItXfub0yWj == 2) {
                rD86Fssz0iKbf0t61L.V57tEvNfxZVVcOCAOih5PKr(u9SlVAuoWhQUfJ.zzpBGItXfub0yWj(rD86Fssz0iKbf0t61L.V57tEvNfxZVVcOCAOih5PKr.pzqP2AqKW6J5PO8zCKnW().getVisibility()), 1);
            }
        }
    }

    public final RD86Fssz0iKbf0t61L ZfQNn8hdWlEQ5cR94249PDsLR(dip85SLOWSmNG3 dip85slowsmng3) {
        ArrayList arrayList = this.zzpBGItXfub0yWj;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            RD86Fssz0iKbf0t61L rD86Fssz0iKbf0t61L = (RD86Fssz0iKbf0t61L) obj;
            if (rD86Fssz0iKbf0t61L.V57tEvNfxZVVcOCAOih5PKr.equals(dip85slowsmng3) && !rD86Fssz0iKbf0t61L.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
                return rD86Fssz0iKbf0t61L;
            }
        }
        return null;
    }

    public final void zzpBGItXfub0yWj(ArrayList arrayList, boolean z) {
        boolean z2;
        ViewGroup viewGroup;
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        RD86Fssz0iKbf0t61L rD86Fssz0iKbf0t61L = null;
        RD86Fssz0iKbf0t61L rD86Fssz0iKbf0t61L2 = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            RD86Fssz0iKbf0t61L rD86Fssz0iKbf0t61L3 = (RD86Fssz0iKbf0t61L) obj;
            int iV57tEvNfxZVVcOCAOih5PKr = u9SlVAuoWhQUfJ.V57tEvNfxZVVcOCAOih5PKr(rD86Fssz0iKbf0t61L3.V57tEvNfxZVVcOCAOih5PKr.HVEwbdULInpTNa0IG);
            int iH3jnZRsdwYJfY9UhQCkbvWciwvFHv = u9SlVAuoWhQUfJ.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(rD86Fssz0iKbf0t61L3.VxUQ9tBhpHJ2AAEDNW8sghc4m);
            if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv != 0) {
                if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv != 1) {
                    if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv == 2 || iH3jnZRsdwYJfY9UhQCkbvWciwvFHv == 3) {
                    }
                } else if (iV57tEvNfxZVVcOCAOih5PKr != 2) {
                    rD86Fssz0iKbf0t61L2 = rD86Fssz0iKbf0t61L3;
                }
            }
            if (iV57tEvNfxZVVcOCAOih5PKr == 2 && rD86Fssz0iKbf0t61L == null) {
                rD86Fssz0iKbf0t61L = rD86Fssz0iKbf0t61L3;
            }
        }
        if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
            Log.v("FragmentManager", "Executing operations from " + rD86Fssz0iKbf0t61L + " to " + rD86Fssz0iKbf0t61L2);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList(arrayList2);
        dip85SLOWSmNG3 dip85slowsmng3 = ((RD86Fssz0iKbf0t61L) arrayList2.get(arrayList2.size() - 1)).V57tEvNfxZVVcOCAOih5PKr;
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            Fxt4Rl0PdDlupwtv fxt4Rl0PdDlupwtv = ((RD86Fssz0iKbf0t61L) obj2).V57tEvNfxZVVcOCAOih5PKr.iKANjmyTSxO6v6UuLPdu7DxOjlS;
            Fxt4Rl0PdDlupwtv fxt4Rl0PdDlupwtv2 = dip85slowsmng3.iKANjmyTSxO6v6UuLPdu7DxOjlS;
            fxt4Rl0PdDlupwtv.zzpBGItXfub0yWj = fxt4Rl0PdDlupwtv2.zzpBGItXfub0yWj;
            fxt4Rl0PdDlupwtv.V57tEvNfxZVVcOCAOih5PKr = fxt4Rl0PdDlupwtv2.V57tEvNfxZVVcOCAOih5PKr;
            fxt4Rl0PdDlupwtv.ZfQNn8hdWlEQ5cR94249PDsLR = fxt4Rl0PdDlupwtv2.ZfQNn8hdWlEQ5cR94249PDsLR;
            fxt4Rl0PdDlupwtv.LaeGQIruHQu81hfJldjMOQSVblH3x = fxt4Rl0PdDlupwtv2.LaeGQIruHQu81hfJldjMOQSVblH3x;
        }
        int size3 = arrayList2.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList2.get(i3);
            i3++;
            RD86Fssz0iKbf0t61L rD86Fssz0iKbf0t61L4 = (RD86Fssz0iKbf0t61L) obj3;
            KO5iX6ddrwZmAa4iLnc7 kO5iX6ddrwZmAa4iLnc7 = new KO5iX6ddrwZmAa4iLnc7();
            rD86Fssz0iKbf0t61L4.ZfQNn8hdWlEQ5cR94249PDsLR();
            HashSet hashSet = rD86Fssz0iKbf0t61L4.LaeGQIruHQu81hfJldjMOQSVblH3x;
            hashSet.add(kO5iX6ddrwZmAa4iLnc7);
            dlHQnQrSu4 dlhqnqrsu4 = new dlHQnQrSu4(rD86Fssz0iKbf0t61L4, kO5iX6ddrwZmAa4iLnc7);
            dlhqnqrsu4.ZfQNn8hdWlEQ5cR94249PDsLR = false;
            dlhqnqrsu4.V57tEvNfxZVVcOCAOih5PKr = z;
            arrayList3.add(dlhqnqrsu4);
            KO5iX6ddrwZmAa4iLnc7 kO5iX6ddrwZmAa4iLnc72 = new KO5iX6ddrwZmAa4iLnc7();
            rD86Fssz0iKbf0t61L4.ZfQNn8hdWlEQ5cR94249PDsLR();
            hashSet.add(kO5iX6ddrwZmAa4iLnc72);
            boolean z3 = !z ? rD86Fssz0iKbf0t61L4 != rD86Fssz0iKbf0t61L2 : rD86Fssz0iKbf0t61L4 != rD86Fssz0iKbf0t61L;
            YuN09nhVxe yuN09nhVxe = new YuN09nhVxe(rD86Fssz0iKbf0t61L4, kO5iX6ddrwZmAa4iLnc72);
            int i4 = rD86Fssz0iKbf0t61L4.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            dip85SLOWSmNG3 dip85slowsmng32 = rD86Fssz0iKbf0t61L4.V57tEvNfxZVVcOCAOih5PKr;
            if (i4 == 2) {
                if (z) {
                    Fxt4Rl0PdDlupwtv fxt4Rl0PdDlupwtv3 = dip85slowsmng32.iKANjmyTSxO6v6UuLPdu7DxOjlS;
                } else {
                    dip85slowsmng32.getClass();
                }
                if (z) {
                    Fxt4Rl0PdDlupwtv fxt4Rl0PdDlupwtv4 = dip85slowsmng32.iKANjmyTSxO6v6UuLPdu7DxOjlS;
                } else {
                    Fxt4Rl0PdDlupwtv fxt4Rl0PdDlupwtv5 = dip85slowsmng32.iKANjmyTSxO6v6UuLPdu7DxOjlS;
                }
            } else if (z) {
                Fxt4Rl0PdDlupwtv fxt4Rl0PdDlupwtv6 = dip85slowsmng32.iKANjmyTSxO6v6UuLPdu7DxOjlS;
            } else {
                dip85slowsmng32.getClass();
            }
            if (z3) {
                if (z) {
                    Fxt4Rl0PdDlupwtv fxt4Rl0PdDlupwtv7 = dip85slowsmng32.iKANjmyTSxO6v6UuLPdu7DxOjlS;
                } else {
                    dip85slowsmng32.getClass();
                }
            }
            arrayList4.add(yuN09nhVxe);
            rD86Fssz0iKbf0t61L4.ZfQNn8hdWlEQ5cR94249PDsLR.add(new gZVesoHrfMaGvAvfBsRIr(this, arrayList5, rD86Fssz0iKbf0t61L4));
            arrayList2 = arrayList;
        }
        HashMap map = new HashMap();
        int size4 = arrayList4.size();
        int i5 = 0;
        while (i5 < size4) {
            Object obj4 = arrayList4.get(i5);
            i5++;
            RD86Fssz0iKbf0t61L rD86Fssz0iKbf0t61L5 = (RD86Fssz0iKbf0t61L) ((YuN09nhVxe) obj4).VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (u9SlVAuoWhQUfJ.V57tEvNfxZVVcOCAOih5PKr(rD86Fssz0iKbf0t61L5.V57tEvNfxZVVcOCAOih5PKr.HVEwbdULInpTNa0IG) != rD86Fssz0iKbf0t61L5.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            }
        }
        int size5 = arrayList4.size();
        int i6 = 0;
        while (i6 < size5) {
            Object obj5 = arrayList4.get(i6);
            i6++;
            YuN09nhVxe yuN09nhVxe2 = (YuN09nhVxe) obj5;
            map.put((RD86Fssz0iKbf0t61L) yuN09nhVxe2.VxUQ9tBhpHJ2AAEDNW8sghc4m, Boolean.FALSE);
            yuN09nhVxe2.ZfQNn8hdWlEQ5cR94249PDsLR();
        }
        boolean zContainsValue = map.containsValue(Boolean.TRUE);
        ViewGroup viewGroup2 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        Context context = viewGroup2.getContext();
        ArrayList arrayList6 = new ArrayList();
        int size6 = arrayList3.size();
        boolean z4 = false;
        int i7 = 0;
        while (i7 < size6) {
            Object obj6 = arrayList3.get(i7);
            i7++;
            dlHQnQrSu4 dlhqnqrsu42 = (dlHQnQrSu4) obj6;
            boolean z5 = zContainsValue;
            RD86Fssz0iKbf0t61L rD86Fssz0iKbf0t61L6 = (RD86Fssz0iKbf0t61L) dlhqnqrsu42.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            ArrayList arrayList7 = arrayList3;
            int iV57tEvNfxZVVcOCAOih5PKr2 = u9SlVAuoWhQUfJ.V57tEvNfxZVVcOCAOih5PKr(rD86Fssz0iKbf0t61L6.V57tEvNfxZVVcOCAOih5PKr.HVEwbdULInpTNa0IG);
            int i8 = rD86Fssz0iKbf0t61L6.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            int i9 = size6;
            if (iV57tEvNfxZVVcOCAOih5PKr2 == i8 || !(iV57tEvNfxZVVcOCAOih5PKr2 == 2 || i8 == 2)) {
                z2 = z4;
                viewGroup = viewGroup2;
                dlhqnqrsu42.ZfQNn8hdWlEQ5cR94249PDsLR();
                zContainsValue = z5;
                size6 = i9;
                viewGroup2 = viewGroup;
                arrayList3 = arrayList7;
                z4 = z2;
            } else {
                dXZw8zZnRXsRIYJEIdZC dxzw8zznrxsriyjeidzcM9e7PWhFYLD2lOGMker = dlhqnqrsu42.M9e7PWhFYLD2lOGMker(context);
                if (dxzw8zznrxsriyjeidzcM9e7PWhFYLD2lOGMker == null) {
                    dlhqnqrsu42.ZfQNn8hdWlEQ5cR94249PDsLR();
                } else {
                    Animator animator = (Animator) dxzw8zznrxsriyjeidzcM9e7PWhFYLD2lOGMker.ZfQNn8hdWlEQ5cR94249PDsLR;
                    if (animator == null) {
                        arrayList6.add(dlhqnqrsu42);
                    } else {
                        RD86Fssz0iKbf0t61L rD86Fssz0iKbf0t61L7 = (RD86Fssz0iKbf0t61L) dlhqnqrsu42.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                        dip85SLOWSmNG3 dip85slowsmng33 = rD86Fssz0iKbf0t61L7.V57tEvNfxZVVcOCAOih5PKr;
                        z2 = z4;
                        if (Boolean.TRUE.equals(map.get(rD86Fssz0iKbf0t61L7))) {
                            if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + dip85slowsmng33 + " as this Fragment was involved in a Transition.");
                            }
                            dlhqnqrsu42.ZfQNn8hdWlEQ5cR94249PDsLR();
                            viewGroup = viewGroup2;
                            zContainsValue = z5;
                            size6 = i9;
                            viewGroup2 = viewGroup;
                            arrayList3 = arrayList7;
                            z4 = z2;
                        } else {
                            boolean z6 = rD86Fssz0iKbf0t61L7.VxUQ9tBhpHJ2AAEDNW8sghc4m == 3;
                            if (z6) {
                                arrayList5.remove(rD86Fssz0iKbf0t61L7);
                            }
                            View view = dip85slowsmng33.HVEwbdULInpTNa0IG;
                            viewGroup2.startViewTransition(view);
                            ViewGroup viewGroup3 = viewGroup2;
                            animator.addListener(new nNKLdBypjKp7Gh5eWaHxV53s4(viewGroup3, view, z6, rD86Fssz0iKbf0t61L7, dlhqnqrsu42));
                            animator.setTarget(view);
                            animator.start();
                            if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
                                Log.v("FragmentManager", "Animator from operation " + rD86Fssz0iKbf0t61L7 + " has started.");
                            }
                            ((KO5iX6ddrwZmAa4iLnc7) dlhqnqrsu42.zzpBGItXfub0yWj).VxUQ9tBhpHJ2AAEDNW8sghc4m(new dXZw8zZnRXsRIYJEIdZC(animator, rD86Fssz0iKbf0t61L7));
                            zContainsValue = z5;
                            size6 = i9;
                            viewGroup2 = viewGroup3;
                            arrayList3 = arrayList7;
                            z4 = true;
                        }
                    }
                }
                z2 = z4;
                viewGroup = viewGroup2;
                zContainsValue = z5;
                size6 = i9;
                viewGroup2 = viewGroup;
                arrayList3 = arrayList7;
                z4 = z2;
            }
        }
        boolean z7 = zContainsValue;
        boolean z8 = z4;
        ViewGroup viewGroup4 = viewGroup2;
        int size7 = arrayList6.size();
        int i10 = 0;
        while (i10 < size7) {
            Object obj7 = arrayList6.get(i10);
            i10++;
            dlHQnQrSu4 dlhqnqrsu43 = (dlHQnQrSu4) obj7;
            RD86Fssz0iKbf0t61L rD86Fssz0iKbf0t61L8 = (RD86Fssz0iKbf0t61L) dlhqnqrsu43.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            dip85SLOWSmNG3 dip85slowsmng34 = rD86Fssz0iKbf0t61L8.V57tEvNfxZVVcOCAOih5PKr;
            if (z7) {
                if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + dip85slowsmng34 + " as Animations cannot run alongside Transitions.");
                }
                dlhqnqrsu43.ZfQNn8hdWlEQ5cR94249PDsLR();
            } else if (z8) {
                if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + dip85slowsmng34 + " as Animations cannot run alongside Animators.");
                }
                dlhqnqrsu43.ZfQNn8hdWlEQ5cR94249PDsLR();
            } else {
                View view2 = dip85slowsmng34.HVEwbdULInpTNa0IG;
                dXZw8zZnRXsRIYJEIdZC dxzw8zznrxsriyjeidzcM9e7PWhFYLD2lOGMker2 = dlhqnqrsu43.M9e7PWhFYLD2lOGMker(context);
                dxzw8zznrxsriyjeidzcM9e7PWhFYLD2lOGMker2.getClass();
                Animation animation = (Animation) dxzw8zznrxsriyjeidzcM9e7PWhFYLD2lOGMker2.V57tEvNfxZVVcOCAOih5PKr;
                animation.getClass();
                int i11 = size7;
                if (rD86Fssz0iKbf0t61L8.VxUQ9tBhpHJ2AAEDNW8sghc4m != 1) {
                    view2.startAnimation(animation);
                    dlhqnqrsu43.ZfQNn8hdWlEQ5cR94249PDsLR();
                } else {
                    viewGroup4.startViewTransition(view2);
                    DBpyqStPl2aDvDcK1O0FE89Scb7 dBpyqStPl2aDvDcK1O0FE89Scb7 = new DBpyqStPl2aDvDcK1O0FE89Scb7(animation, viewGroup4, view2);
                    dBpyqStPl2aDvDcK1O0FE89Scb7.setAnimationListener(new pgkpBTPJiWlpOU(view2, viewGroup4, dlhqnqrsu43, rD86Fssz0iKbf0t61L8));
                    view2.startAnimation(dBpyqStPl2aDvDcK1O0FE89Scb7);
                    if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
                        Log.v("FragmentManager", "Animation from operation " + rD86Fssz0iKbf0t61L8 + " has started.");
                    }
                }
                ((KO5iX6ddrwZmAa4iLnc7) dlhqnqrsu43.zzpBGItXfub0yWj).VxUQ9tBhpHJ2AAEDNW8sghc4m(new nMRZPpfLCgJyuB(view2, viewGroup4, dlhqnqrsu43, rD86Fssz0iKbf0t61L8));
                size7 = i11;
            }
        }
        int size8 = arrayList5.size();
        int i12 = 0;
        while (i12 < size8) {
            Object obj8 = arrayList5.get(i12);
            i12++;
            RD86Fssz0iKbf0t61L rD86Fssz0iKbf0t61L9 = (RD86Fssz0iKbf0t61L) obj8;
            u9SlVAuoWhQUfJ.VxUQ9tBhpHJ2AAEDNW8sghc4m(rD86Fssz0iKbf0t61L9.V57tEvNfxZVVcOCAOih5PKr.HVEwbdULInpTNa0IG, rD86Fssz0iKbf0t61L9.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        }
        arrayList5.clear();
        if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + rD86Fssz0iKbf0t61L + " to " + rD86Fssz0iKbf0t61L2);
        }
    }
}
