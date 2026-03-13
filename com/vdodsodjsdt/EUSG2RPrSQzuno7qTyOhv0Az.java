package com.vdodsodjsdt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class EUSG2RPrSQzuno7qTyOhv0Az implements Iterable, X7FI9474k7GlT7TZYuRwmu {
    public static final EUSG2RPrSQzuno7qTyOhv0Az ZfQNn8hdWlEQ5cR94249PDsLR = new EUSG2RPrSQzuno7qTyOhv0Az(new String[0]);
    public final String[] V57tEvNfxZVVcOCAOih5PKr;

    public EUSG2RPrSQzuno7qTyOhv0Az(String[] strArr) {
        ej6unYlOWMDF.pYmKDYlAmhudp(strArr, "namesAndValues");
        this.V57tEvNfxZVVcOCAOih5PKr = strArr;
    }

    public final yxp1I6Gr2tLDD3dH0UsMPMDr7 V57tEvNfxZVVcOCAOih5PKr() {
        yxp1I6Gr2tLDD3dH0UsMPMDr7 yxp1i6gr2tldd3dh0usmpmdr7 = new yxp1I6Gr2tLDD3dH0UsMPMDr7();
        ArrayList arrayList = yxp1i6gr2tldd3dh0usmpmdr7.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        ej6unYlOWMDF.pYmKDYlAmhudp(arrayList, "<this>");
        String[] strArr = this.V57tEvNfxZVVcOCAOih5PKr;
        ej6unYlOWMDF.pYmKDYlAmhudp(strArr, "elements");
        arrayList.addAll(vmp19D2MODlOL.rE05n5RsRkyWKIeA9cmLXAKv4Hze(strArr));
        return yxp1i6gr2tldd3dh0usmpmdr7;
    }

    public final String VxUQ9tBhpHJ2AAEDNW8sghc4m(String str) {
        String[] strArr = this.V57tEvNfxZVVcOCAOih5PKr;
        ej6unYlOWMDF.pYmKDYlAmhudp(strArr, "namesAndValues");
        int length = strArr.length - 2;
        int iW0Wu95l8dVNw5rZMRu = zonOxHotd3BwAPJcwqr6I6uQNngg4.w0Wu95l8dVNw5rZMRu(length, 0, -2);
        if (iW0Wu95l8dVNw5rZMRu > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == iW0Wu95l8dVNw5rZMRu) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String ZfQNn8hdWlEQ5cR94249PDsLR(int i) {
        String str = (String) vmp19D2MODlOL.h2b7InwIaORKN91X7whfQh4(this.V57tEvNfxZVVcOCAOih5PKr, (i * 2) + 1);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i + ']');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof EUSG2RPrSQzuno7qTyOhv0Az) {
            return Arrays.equals(this.V57tEvNfxZVVcOCAOih5PKr, ((EUSG2RPrSQzuno7qTyOhv0Az) obj).V57tEvNfxZVVcOCAOih5PKr);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.V57tEvNfxZVVcOCAOih5PKr);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        FgeGQUnjhbxnrwqkj[] fgeGQUnjhbxnrwqkjArr = new FgeGQUnjhbxnrwqkj[size];
        for (int i = 0; i < size; i++) {
            fgeGQUnjhbxnrwqkjArr[i] = new FgeGQUnjhbxnrwqkj(zzpBGItXfub0yWj(i), ZfQNn8hdWlEQ5cR94249PDsLR(i));
        }
        return new b5p8GpwErDXqVGUollgu(fgeGQUnjhbxnrwqkjArr);
    }

    public final int size() {
        return this.V57tEvNfxZVVcOCAOih5PKr.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strZzpBGItXfub0yWj = zzpBGItXfub0yWj(i);
            String strZfQNn8hdWlEQ5cR94249PDsLR = ZfQNn8hdWlEQ5cR94249PDsLR(i);
            sb.append(strZzpBGItXfub0yWj);
            sb.append(": ");
            if (jHlOQHj3hlCsydfI7r5ApVdQjYvKf.M9e7PWhFYLD2lOGMker(strZzpBGItXfub0yWj)) {
                strZfQNn8hdWlEQ5cR94249PDsLR = "██";
            }
            sb.append(strZfQNn8hdWlEQ5cR94249PDsLR);
            sb.append("\n");
        }
        return sb.toString();
    }

    public final String zzpBGItXfub0yWj(int i) {
        String str = (String) vmp19D2MODlOL.h2b7InwIaORKN91X7whfQh4(this.V57tEvNfxZVVcOCAOih5PKr, i * 2);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i + ']');
    }
}
