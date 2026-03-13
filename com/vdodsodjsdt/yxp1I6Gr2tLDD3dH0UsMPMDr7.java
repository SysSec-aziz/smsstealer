package com.vdodsodjsdt;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class yxp1I6Gr2tLDD3dH0UsMPMDr7 {
    public final ArrayList VxUQ9tBhpHJ2AAEDNW8sghc4m;

    public yxp1I6Gr2tLDD3dH0UsMPMDr7(UL4JI0eLnaD84py2JT uL4JI0eLnaD84py2JT) {
        zQ5iOOU0O4Uuuk zq5ioou0o4uuuk;
        ej6unYlOWMDF.pYmKDYlAmhudp(uL4JI0eLnaD84py2JT, "trackers");
        DuqD4c7s5ZkEmVA5C duqD4c7s5ZkEmVA5C = new DuqD4c7s5ZkEmVA5C((pfLEtIq3hsg) uL4JI0eLnaD84py2JT.zzpBGItXfub0yWj, 0);
        DuqD4c7s5ZkEmVA5C duqD4c7s5ZkEmVA5C2 = new DuqD4c7s5ZkEmVA5C((NXYyCFwrJiQhpxSwJB6lJD37IZ) uL4JI0eLnaD84py2JT.V57tEvNfxZVVcOCAOih5PKr);
        DuqD4c7s5ZkEmVA5C duqD4c7s5ZkEmVA5C3 = new DuqD4c7s5ZkEmVA5C((pfLEtIq3hsg) uL4JI0eLnaD84py2JT.LaeGQIruHQu81hfJldjMOQSVblH3x, 4);
        pfLEtIq3hsg pfletiq3hsg = (pfLEtIq3hsg) uL4JI0eLnaD84py2JT.ZfQNn8hdWlEQ5cR94249PDsLR;
        DuqD4c7s5ZkEmVA5C duqD4c7s5ZkEmVA5C4 = new DuqD4c7s5ZkEmVA5C(pfletiq3hsg, 2);
        DuqD4c7s5ZkEmVA5C duqD4c7s5ZkEmVA5C5 = new DuqD4c7s5ZkEmVA5C(pfletiq3hsg, 3);
        ztUXGMUlY1D6Lz2k559 ztuxgmuly1d6lz2k559 = new ztUXGMUlY1D6Lz2k559(pfletiq3hsg);
        rVTyqtWb24L rvtyqtwb24l = new rVTyqtWb24L(pfletiq3hsg);
        if (Build.VERSION.SDK_INT >= 28) {
            Context context = (Context) uL4JI0eLnaD84py2JT.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            String str = muOaMHIFqe96qo7.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            ej6unYlOWMDF.pYmKDYlAmhudp(context, "context");
            Object systemService = context.getSystemService("connectivity");
            ej6unYlOWMDF.Ca81ebIan1u(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            zq5ioou0o4uuuk = new zQ5iOOU0O4Uuuk((ConnectivityManager) systemService);
        } else {
            zq5ioou0o4uuuk = null;
        }
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = vmp19D2MODlOL.VOvSEdhaZyc0oOGQ8(new bipD1yHZW4C[]{duqD4c7s5ZkEmVA5C, duqD4c7s5ZkEmVA5C2, duqD4c7s5ZkEmVA5C3, duqD4c7s5ZkEmVA5C4, duqD4c7s5ZkEmVA5C5, ztuxgmuly1d6lz2k559, rvtyqtwb24l, zq5ioou0o4uuuk});
    }

    public void V57tEvNfxZVVcOCAOih5PKr(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public boolean VxUQ9tBhpHJ2AAEDNW8sghc4m(vIPEe55rgLxLcs vipee55rglxlcs) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            if (((bipD1yHZW4C) obj).V57tEvNfxZVVcOCAOih5PKr(vipee55rglxlcs)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(muOaMHIFqe96qo7.VxUQ9tBhpHJ2AAEDNW8sghc4m, "Work " + vipee55rglxlcs.VxUQ9tBhpHJ2AAEDNW8sghc4m + " constrained by " + gYXV3FZbh17i6ocMo1T.rE05n5RsRkyWKIeA9cmLXAKv4Hze(arrayList, null, null, null, BIhaoaY7PwYE.M9e7PWhFYLD2lOGMker, 31));
        }
        return arrayList.isEmpty();
    }

    public jDNq5zhgCb57UDl ZfQNn8hdWlEQ5cR94249PDsLR(vIPEe55rgLxLcs vipee55rglxlcs) {
        ej6unYlOWMDF.pYmKDYlAmhudp(vipee55rglxlcs, "spec");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            if (((bipD1yHZW4C) obj).zzpBGItXfub0yWj(vipee55rglxlcs)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(M5nvSQFWCkc.bjhcQ0u7VT2OYYrwk96HrWoN(arrayList));
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            arrayList3.add(((bipD1yHZW4C) obj2).VxUQ9tBhpHJ2AAEDNW8sghc4m(vipee55rglxlcs.M9e7PWhFYLD2lOGMker));
        }
        return zonOxHotd3BwAPJcwqr6I6uQNngg4.pYmKDYlAmhudp(new gKCgw0OPjYohWMZEmrO6rYi1(3, (jDNq5zhgCb57UDl[]) gYXV3FZbh17i6ocMo1T.ByTQIhgl7ezGvHXEd(arrayList3).toArray(new jDNq5zhgCb57UDl[0])));
    }

    public EUSG2RPrSQzuno7qTyOhv0Az zzpBGItXfub0yWj() {
        return new EUSG2RPrSQzuno7qTyOhv0Az((String[]) this.VxUQ9tBhpHJ2AAEDNW8sghc4m.toArray(new String[0]));
    }

    public yxp1I6Gr2tLDD3dH0UsMPMDr7() {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new ArrayList(20);
    }
}
