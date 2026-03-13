package com.vdodsodjsdt;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class RD86Fssz0iKbf0t61L {
    public final HashSet LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final androidx.fragment.app.iVKrTMqOw0TqCeNN NSjgqmGjEzuugn2SsG1mZFP;
    public final dip85SLOWSmNG3 V57tEvNfxZVVcOCAOih5PKr;
    public int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public boolean ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final ArrayList ZfQNn8hdWlEQ5cR94249PDsLR;
    public boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public int zzpBGItXfub0yWj;

    public RD86Fssz0iKbf0t61L(int i, int i2, androidx.fragment.app.iVKrTMqOw0TqCeNN ivkrtmqow0tqcenn, KO5iX6ddrwZmAa4iLnc7 kO5iX6ddrwZmAa4iLnc7) {
        dip85SLOWSmNG3 dip85slowsmng3 = ivkrtmqow0tqcenn.V57tEvNfxZVVcOCAOih5PKr;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new ArrayList();
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = new HashSet();
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = false;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = false;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        this.zzpBGItXfub0yWj = i2;
        this.V57tEvNfxZVVcOCAOih5PKr = dip85slowsmng3;
        kO5iX6ddrwZmAa4iLnc7.VxUQ9tBhpHJ2AAEDNW8sghc4m(new qF22Y620JkFyombtDYw0h0h8Rxpja(this));
        this.NSjgqmGjEzuugn2SsG1mZFP = ivkrtmqow0tqcenn;
    }

    public final void V57tEvNfxZVVcOCAOih5PKr(int i, int i2) {
        int iH3jnZRsdwYJfY9UhQCkbvWciwvFHv = u9SlVAuoWhQUfJ.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(i2);
        dip85SLOWSmNG3 dip85slowsmng3 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv == 0) {
            if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m != 1) {
                if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + dip85slowsmng3 + " mFinalState = " + u9SlVAuoWhQUfJ.f6ZQsR6bPLvvCDNXOUc(this.VxUQ9tBhpHJ2AAEDNW8sghc4m) + " -> " + u9SlVAuoWhQUfJ.f6ZQsR6bPLvvCDNXOUc(i) + ". ");
                }
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
                return;
            }
            return;
        }
        if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv == 1) {
            if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m == 1) {
                if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + dip85slowsmng3 + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + u9SlVAuoWhQUfJ.jW7EiD0YL6xkbB158jMUzhWNWb1y(this.zzpBGItXfub0yWj) + " to ADDING.");
                }
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 2;
                this.zzpBGItXfub0yWj = 2;
                return;
            }
            return;
        }
        if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv != 2) {
            return;
        }
        if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + dip85slowsmng3 + " mFinalState = " + u9SlVAuoWhQUfJ.f6ZQsR6bPLvvCDNXOUc(this.VxUQ9tBhpHJ2AAEDNW8sghc4m) + " -> REMOVED. mLifecycleImpact  = " + u9SlVAuoWhQUfJ.jW7EiD0YL6xkbB158jMUzhWNWb1y(this.zzpBGItXfub0yWj) + " to REMOVING.");
        }
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 1;
        this.zzpBGItXfub0yWj = 3;
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        HashSet hashSet = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
            return;
        }
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = true;
        if (hashSet.isEmpty()) {
            zzpBGItXfub0yWj();
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            KO5iX6ddrwZmAa4iLnc7 kO5iX6ddrwZmAa4iLnc7 = (KO5iX6ddrwZmAa4iLnc7) obj;
            synchronized (kO5iX6ddrwZmAa4iLnc7) {
                try {
                    if (!kO5iX6ddrwZmAa4iLnc7.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
                        kO5iX6ddrwZmAa4iLnc7.VxUQ9tBhpHJ2AAEDNW8sghc4m = true;
                        kO5iX6ddrwZmAa4iLnc7.V57tEvNfxZVVcOCAOih5PKr = true;
                        xI49lv6n0OP7vk xi49lv6n0op7vk = kO5iX6ddrwZmAa4iLnc7.zzpBGItXfub0yWj;
                        if (xi49lv6n0op7vk != null) {
                            try {
                                xi49lv6n0op7vk.onCancel();
                            } catch (Throwable th) {
                                synchronized (kO5iX6ddrwZmAa4iLnc7) {
                                    kO5iX6ddrwZmAa4iLnc7.V57tEvNfxZVVcOCAOih5PKr = false;
                                    kO5iX6ddrwZmAa4iLnc7.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (kO5iX6ddrwZmAa4iLnc7) {
                            kO5iX6ddrwZmAa4iLnc7.V57tEvNfxZVVcOCAOih5PKr = false;
                            kO5iX6ddrwZmAa4iLnc7.notifyAll();
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR() {
        int i = this.zzpBGItXfub0yWj;
        androidx.fragment.app.iVKrTMqOw0TqCeNN ivkrtmqow0tqcenn = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (i != 2) {
            if (i == 3) {
                dip85SLOWSmNG3 dip85slowsmng3 = ivkrtmqow0tqcenn.V57tEvNfxZVVcOCAOih5PKr;
                View viewPzqP2AqKW6J5PO8zCKnW = dip85slowsmng3.pzqP2AqKW6J5PO8zCKnW();
                if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
                    Log.v("FragmentManager", "Clearing focus " + viewPzqP2AqKW6J5PO8zCKnW.findFocus() + " on view " + viewPzqP2AqKW6J5PO8zCKnW + " for Fragment " + dip85slowsmng3);
                }
                viewPzqP2AqKW6J5PO8zCKnW.clearFocus();
                return;
            }
            return;
        }
        dip85SLOWSmNG3 dip85slowsmng32 = ivkrtmqow0tqcenn.V57tEvNfxZVVcOCAOih5PKr;
        View viewFindFocus = dip85slowsmng32.HVEwbdULInpTNa0IG.findFocus();
        if (viewFindFocus != null) {
            dip85slowsmng32.zIvmSL0wzmmKGc3X39b2Gw2mUGE().HzCpKshMOoaw76hFcbOVRYMeRd = viewFindFocus;
            if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
                Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + dip85slowsmng32);
            }
        }
        View viewPzqP2AqKW6J5PO8zCKnW2 = this.V57tEvNfxZVVcOCAOih5PKr.pzqP2AqKW6J5PO8zCKnW();
        if (viewPzqP2AqKW6J5PO8zCKnW2.getParent() == null) {
            ivkrtmqow0tqcenn.zzpBGItXfub0yWj();
            viewPzqP2AqKW6J5PO8zCKnW2.setAlpha(0.0f);
        }
        if (viewPzqP2AqKW6J5PO8zCKnW2.getAlpha() == 0.0f && viewPzqP2AqKW6J5PO8zCKnW2.getVisibility() == 0) {
            viewPzqP2AqKW6J5PO8zCKnW2.setVisibility(4);
        }
        Fxt4Rl0PdDlupwtv fxt4Rl0PdDlupwtv = dip85slowsmng32.iKANjmyTSxO6v6UuLPdu7DxOjlS;
        viewPzqP2AqKW6J5PO8zCKnW2.setAlpha(fxt4Rl0PdDlupwtv == null ? 1.0f : fxt4Rl0PdDlupwtv.M9e7PWhFYLD2lOGMker);
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + u9SlVAuoWhQUfJ.f6ZQsR6bPLvvCDNXOUc(this.VxUQ9tBhpHJ2AAEDNW8sghc4m) + "} {mLifecycleImpact = " + u9SlVAuoWhQUfJ.jW7EiD0YL6xkbB158jMUzhWNWb1y(this.zzpBGItXfub0yWj) + "} {mFragment = " + this.V57tEvNfxZVVcOCAOih5PKr + "}";
    }

    public final void zzpBGItXfub0yWj() {
        if (!this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            if (okcUO69vEcgndIAn0R.O1xDAlBZZlZdoEf747lCFHld(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = true;
            ArrayList arrayList = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
        }
        this.NSjgqmGjEzuugn2SsG1mZFP.HzCpKshMOoaw76hFcbOVRYMeRd();
    }
}
