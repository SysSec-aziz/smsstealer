package com.vdodsodjsdt;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class xslkgYRPKFuOSM9hmx2 {
    public static int zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public int V57tEvNfxZVVcOCAOih5PKr;
    public ArrayList VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public ArrayList ZfQNn8hdWlEQ5cR94249PDsLR;
    public int zzpBGItXfub0yWj;

    public final void V57tEvNfxZVVcOCAOih5PKr(int i, xslkgYRPKFuOSM9hmx2 xslkgyrpkfuosm9hmx2) {
        int i2 = xslkgyrpkfuosm9hmx2.zzpBGItXfub0yWj;
        ArrayList arrayList = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            IPwvkMKvXW4H2mJtQ4szs9vgoyzLD iPwvkMKvXW4H2mJtQ4szs9vgoyzLD = (IPwvkMKvXW4H2mJtQ4szs9vgoyzLD) obj;
            ArrayList arrayList2 = xslkgyrpkfuosm9hmx2.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (!arrayList2.contains(iPwvkMKvXW4H2mJtQ4szs9vgoyzLD)) {
                arrayList2.add(iPwvkMKvXW4H2mJtQ4szs9vgoyzLD);
            }
            if (i == 0) {
                iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.ByTQIhgl7ezGvHXEd = i2;
            } else {
                iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.tpEo0fy9FaoJYrSFHRfIK6 = i2;
            }
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = i2;
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(ArrayList arrayList) {
        int size = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.size();
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                xslkgYRPKFuOSM9hmx2 xslkgyrpkfuosm9hmx2 = (xslkgYRPKFuOSM9hmx2) arrayList.get(i);
                if (this.LaeGQIruHQu81hfJldjMOQSVblH3x == xslkgyrpkfuosm9hmx2.zzpBGItXfub0yWj) {
                    V57tEvNfxZVVcOCAOih5PKr(this.V57tEvNfxZVVcOCAOih5PKr, xslkgyrpkfuosm9hmx2);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.V57tEvNfxZVVcOCAOih5PKr;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.zzpBGItXfub0yWj);
        sb.append("] <");
        String string = sb.toString();
        ArrayList arrayList = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            string = string + " " + ((IPwvkMKvXW4H2mJtQ4szs9vgoyzLD) obj).mhUCRR8ceqc7mAozW;
        }
        return u9SlVAuoWhQUfJ.GI83zq0G8e7zkn(string, " >");
    }

    public final int zzpBGItXfub0yWj(uij8Ij9SZKI0vaNotiNzH uij8ij9szki0vanotinzh, int i) {
        int iP59rPv72J9;
        int iP59rPv72J92;
        ArrayList arrayList = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (arrayList.size() == 0) {
            return 0;
        }
        rwLNq3eKZ2vnR0XP rwlnq3ekz2vnr0xp = (rwLNq3eKZ2vnR0XP) ((IPwvkMKvXW4H2mJtQ4szs9vgoyzLD) arrayList.get(0)).JUdwvN8LfOMa;
        uij8ij9szki0vanotinzh.f6ZQsR6bPLvvCDNXOUc();
        rwlnq3ekz2vnr0xp.zzpBGItXfub0yWj(uij8ij9szki0vanotinzh, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((IPwvkMKvXW4H2mJtQ4szs9vgoyzLD) arrayList.get(i2)).zzpBGItXfub0yWj(uij8ij9szki0vanotinzh, false);
        }
        if (i == 0 && rwlnq3ekz2vnr0xp.KMiA9Sqk243eQkFNNoS > 0) {
            hRrPPME7ytOB7ba.VxUQ9tBhpHJ2AAEDNW8sghc4m(rwlnq3ekz2vnr0xp, uij8ij9szki0vanotinzh, arrayList, 0);
        }
        if (i == 1 && rwlnq3ekz2vnr0xp.DNP7yXLsojH0rPMHr8fUY14M > 0) {
            hRrPPME7ytOB7ba.VxUQ9tBhpHJ2AAEDNW8sghc4m(rwlnq3ekz2vnr0xp, uij8ij9szki0vanotinzh, arrayList, 1);
        }
        try {
            uij8ij9szki0vanotinzh.h3jnZRsdwYJfY9UhQCkbvWciwvFHv();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            IPwvkMKvXW4H2mJtQ4szs9vgoyzLD iPwvkMKvXW4H2mJtQ4szs9vgoyzLD = (IPwvkMKvXW4H2mJtQ4szs9vgoyzLD) arrayList.get(i3);
            VSncX8ksA0tswc2TMhzhOMdd vSncX8ksA0tswc2TMhzhOMdd = new VSncX8ksA0tswc2TMhzhOMdd();
            new WeakReference(iPwvkMKvXW4H2mJtQ4szs9vgoyzLD);
            uij8Ij9SZKI0vaNotiNzH.p59rPv72J9(iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.qygqjTppWwx992);
            uij8Ij9SZKI0vaNotiNzH.p59rPv72J9(iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.iKANjmyTSxO6v6UuLPdu7DxOjlS);
            uij8Ij9SZKI0vaNotiNzH.p59rPv72J9(iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.TqcnImqkSWIKht);
            uij8Ij9SZKI0vaNotiNzH.p59rPv72J9(iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.d9zDyyznnp3oaDT1Ug);
            uij8Ij9SZKI0vaNotiNzH.p59rPv72J9(iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.CixTK5ZX8oWXHz34qHYV);
            this.ZfQNn8hdWlEQ5cR94249PDsLR.add(vSncX8ksA0tswc2TMhzhOMdd);
        }
        if (i == 0) {
            iP59rPv72J9 = uij8Ij9SZKI0vaNotiNzH.p59rPv72J9(rwlnq3ekz2vnr0xp.qygqjTppWwx992);
            iP59rPv72J92 = uij8Ij9SZKI0vaNotiNzH.p59rPv72J9(rwlnq3ekz2vnr0xp.TqcnImqkSWIKht);
            uij8ij9szki0vanotinzh.f6ZQsR6bPLvvCDNXOUc();
        } else {
            iP59rPv72J9 = uij8Ij9SZKI0vaNotiNzH.p59rPv72J9(rwlnq3ekz2vnr0xp.iKANjmyTSxO6v6UuLPdu7DxOjlS);
            iP59rPv72J92 = uij8Ij9SZKI0vaNotiNzH.p59rPv72J9(rwlnq3ekz2vnr0xp.d9zDyyznnp3oaDT1Ug);
            uij8ij9szki0vanotinzh.f6ZQsR6bPLvvCDNXOUc();
        }
        return iP59rPv72J92 - iP59rPv72J9;
    }
}
