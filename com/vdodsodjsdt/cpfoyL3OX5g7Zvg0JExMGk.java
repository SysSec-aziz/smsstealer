package com.vdodsodjsdt;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class cpfoyL3OX5g7Zvg0JExMGk {
    public static final ZMoD0hQJsS1v4tTc5bgXQ7sN1hiNa V57tEvNfxZVVcOCAOih5PKr;
    public static final Class VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public static final ZMoD0hQJsS1v4tTc5bgXQ7sN1hiNa zzpBGItXfub0yWj;

    static {
        Class<?> cls;
        Class<?> cls2;
        fsiIibR9odqEwhUwtyl8oM fsiiibr9odqewhuwtyl8om = fsiIibR9odqEwhUwtyl8oM.V57tEvNfxZVVcOCAOih5PKr;
        ZMoD0hQJsS1v4tTc5bgXQ7sN1hiNa zMoD0hQJsS1v4tTc5bgXQ7sN1hiNa = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        VxUQ9tBhpHJ2AAEDNW8sghc4m = cls;
        try {
            fsiIibR9odqEwhUwtyl8oM fsiiibr9odqewhuwtyl8om2 = fsiIibR9odqEwhUwtyl8oM.V57tEvNfxZVVcOCAOih5PKr;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                zMoD0hQJsS1v4tTc5bgXQ7sN1hiNa = (ZMoD0hQJsS1v4tTc5bgXQ7sN1hiNa) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        zzpBGItXfub0yWj = zMoD0hQJsS1v4tTc5bgXQ7sN1hiNa;
        V57tEvNfxZVVcOCAOih5PKr = new ZMoD0hQJsS1v4tTc5bgXQ7sN1hiNa();
    }

    public static void Ca81ebIan1u(int i, List list, Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQ, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        fMipVc9GFHAwh7dXz8 fmipvc9gfhawh7dxz8 = (fMipVc9GFHAwh7dXz8) skgk8FYn8b4TvRiBOsElZw4XkNLhQ.ZfQNn8hdWlEQ5cR94249PDsLR;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                fmipvc9gfhawh7dxz8.uQ30BFNHbnwcS96Dk6jHUECPfOq(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        fmipvc9gfhawh7dxz8.DUIkOzkuF3hUt(i, 2);
        int iG479XgNG9rK8jPPbSXr = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iG479XgNG9rK8jPPbSXr += fMipVc9GFHAwh7dXz8.G479XgNG9rK8jPPbSXr(((Integer) list.get(i3)).intValue());
        }
        fmipvc9gfhawh7dxz8.u04PSKYidgCYrHk5CAtyMkPOXcY(iG479XgNG9rK8jPPbSXr);
        while (i2 < list.size()) {
            fmipvc9gfhawh7dxz8.SdPSMGy13dYOH9CwolJVKu21val(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static int GI83zq0G8e7zkn(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iG479XgNG9rK8jPPbSXr = 0;
        for (int i = 0; i < size; i++) {
            iG479XgNG9rK8jPPbSXr += fMipVc9GFHAwh7dXz8.G479XgNG9rK8jPPbSXr(((Long) list.get(i)).longValue());
        }
        return iG479XgNG9rK8jPPbSXr;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void HzCpKshMOoaw76hFcbOVRYMeRd(ZMoD0hQJsS1v4tTc5bgXQ7sN1hiNa zMoD0hQJsS1v4tTc5bgXQ7sN1hiNa, Object obj, Object obj2) {
        zMoD0hQJsS1v4tTc5bgXQ7sN1hiNa.getClass();
        EDuXvmY6CU2gSBB eDuXvmY6CU2gSBB = (EDuXvmY6CU2gSBB) obj;
        sE56ypyAr5rUSL24j5APySHkB9r8y se56ypyar5rusl24j5apyshkb9r8y = eDuXvmY6CU2gSBB.unknownFields;
        sE56ypyAr5rUSL24j5APySHkB9r8y se56ypyar5rusl24j5apyshkb9r8y2 = ((EDuXvmY6CU2gSBB) obj2).unknownFields;
        sE56ypyAr5rUSL24j5APySHkB9r8y se56ypyar5rusl24j5apyshkb9r8y3 = sE56ypyAr5rUSL24j5APySHkB9r8y.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (!se56ypyar5rusl24j5apyshkb9r8y3.equals(se56ypyar5rusl24j5apyshkb9r8y2)) {
            if (se56ypyar5rusl24j5apyshkb9r8y3.equals(se56ypyar5rusl24j5apyshkb9r8y)) {
                int i = se56ypyar5rusl24j5apyshkb9r8y.VxUQ9tBhpHJ2AAEDNW8sghc4m + se56ypyar5rusl24j5apyshkb9r8y2.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                int[] iArrCopyOf = Arrays.copyOf(se56ypyar5rusl24j5apyshkb9r8y.zzpBGItXfub0yWj, i);
                System.arraycopy(se56ypyar5rusl24j5apyshkb9r8y2.zzpBGItXfub0yWj, 0, iArrCopyOf, se56ypyar5rusl24j5apyshkb9r8y.VxUQ9tBhpHJ2AAEDNW8sghc4m, se56ypyar5rusl24j5apyshkb9r8y2.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                Object[] objArrCopyOf = Arrays.copyOf(se56ypyar5rusl24j5apyshkb9r8y.V57tEvNfxZVVcOCAOih5PKr, i);
                System.arraycopy(se56ypyar5rusl24j5apyshkb9r8y2.V57tEvNfxZVVcOCAOih5PKr, 0, objArrCopyOf, se56ypyar5rusl24j5apyshkb9r8y.VxUQ9tBhpHJ2AAEDNW8sghc4m, se56ypyar5rusl24j5apyshkb9r8y2.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                se56ypyar5rusl24j5apyshkb9r8y = new sE56ypyAr5rUSL24j5APySHkB9r8y(i, iArrCopyOf, objArrCopyOf, true);
            } else {
                se56ypyar5rusl24j5apyshkb9r8y.getClass();
                if (!se56ypyar5rusl24j5apyshkb9r8y2.equals(se56ypyar5rusl24j5apyshkb9r8y3)) {
                    if (!se56ypyar5rusl24j5apyshkb9r8y.LaeGQIruHQu81hfJldjMOQSVblH3x) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = se56ypyar5rusl24j5apyshkb9r8y.VxUQ9tBhpHJ2AAEDNW8sghc4m + se56ypyar5rusl24j5apyshkb9r8y2.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    se56ypyar5rusl24j5apyshkb9r8y.VxUQ9tBhpHJ2AAEDNW8sghc4m(i2);
                    System.arraycopy(se56ypyar5rusl24j5apyshkb9r8y2.zzpBGItXfub0yWj, 0, se56ypyar5rusl24j5apyshkb9r8y.zzpBGItXfub0yWj, se56ypyar5rusl24j5apyshkb9r8y.VxUQ9tBhpHJ2AAEDNW8sghc4m, se56ypyar5rusl24j5apyshkb9r8y2.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                    System.arraycopy(se56ypyar5rusl24j5apyshkb9r8y2.V57tEvNfxZVVcOCAOih5PKr, 0, se56ypyar5rusl24j5apyshkb9r8y.V57tEvNfxZVVcOCAOih5PKr, se56ypyar5rusl24j5apyshkb9r8y.VxUQ9tBhpHJ2AAEDNW8sghc4m, se56ypyar5rusl24j5apyshkb9r8y2.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                    se56ypyar5rusl24j5apyshkb9r8y.VxUQ9tBhpHJ2AAEDNW8sghc4m = i2;
                }
            }
        }
        eDuXvmY6CU2gSBB.unknownFields = se56ypyar5rusl24j5apyshkb9r8y;
    }

    public static void Irh5auREsoeV1C1RaBamlmy(int i, List list, Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQ, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        fMipVc9GFHAwh7dXz8 fmipvc9gfhawh7dxz8 = (fMipVc9GFHAwh7dXz8) skgk8FYn8b4TvRiBOsElZw4XkNLhQ.ZfQNn8hdWlEQ5cR94249PDsLR;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                fmipvc9gfhawh7dxz8.w45GC0xYcf4u8gmC(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i2++;
            }
            return;
        }
        fmipvc9gfhawh7dxz8.DUIkOzkuF3hUt(i, 2);
        int iR0dB0ojIy6g8mnk1 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iR0dB0ojIy6g8mnk1 += fMipVc9GFHAwh7dXz8.r0dB0ojIy6g8mnk1((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        fmipvc9gfhawh7dxz8.u04PSKYidgCYrHk5CAtyMkPOXcY(iR0dB0ojIy6g8mnk1);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            fmipvc9gfhawh7dxz8.u04PSKYidgCYrHk5CAtyMkPOXcY((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i2++;
        }
    }

    public static boolean KUYypEB4eNWOZWVDpH(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int LaeGQIruHQu81hfJldjMOQSVblH3x(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iG479XgNG9rK8jPPbSXr = 0;
        for (int i = 0; i < size; i++) {
            iG479XgNG9rK8jPPbSXr += fMipVc9GFHAwh7dXz8.G479XgNG9rK8jPPbSXr(((Long) list.get(i)).longValue());
        }
        return iG479XgNG9rK8jPPbSXr;
    }

    public static int NSjgqmGjEzuugn2SsG1mZFP(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR0dB0ojIy6g8mnk1 = 0;
        for (int i = 0; i < size; i++) {
            iR0dB0ojIy6g8mnk1 += fMipVc9GFHAwh7dXz8.r0dB0ojIy6g8mnk1(((Integer) list.get(i)).intValue());
        }
        return iR0dB0ojIy6g8mnk1;
    }

    public static void RhfGHxtXxy0M0grmp2jkRjQg(int i, List list, Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQ, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        fMipVc9GFHAwh7dXz8 fmipvc9gfhawh7dxz8 = (fMipVc9GFHAwh7dXz8) skgk8FYn8b4TvRiBOsElZw4XkNLhQ.ZfQNn8hdWlEQ5cR94249PDsLR;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                fmipvc9gfhawh7dxz8.dWgUTvLDR2aOE7pFLrMrHP(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        fmipvc9gfhawh7dxz8.DUIkOzkuF3hUt(i, 2);
        int iG479XgNG9rK8jPPbSXr = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iG479XgNG9rK8jPPbSXr += fMipVc9GFHAwh7dXz8.G479XgNG9rK8jPPbSXr(((Long) list.get(i3)).longValue());
        }
        fmipvc9gfhawh7dxz8.u04PSKYidgCYrHk5CAtyMkPOXcY(iG479XgNG9rK8jPPbSXr);
        while (i2 < list.size()) {
            fmipvc9gfhawh7dxz8.W5cWMjmJv6kqhapkBbKZYxBWC2p(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void TaDO7ogis3aEiWEtq(int i, List list, Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQ, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        fMipVc9GFHAwh7dXz8 fmipvc9gfhawh7dxz8 = (fMipVc9GFHAwh7dXz8) skgk8FYn8b4TvRiBOsElZw4XkNLhQ.ZfQNn8hdWlEQ5cR94249PDsLR;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                fmipvc9gfhawh7dxz8.N08cqkgagFuPYWJcTFAQVt(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        fmipvc9gfhawh7dxz8.DUIkOzkuF3hUt(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = fMipVc9GFHAwh7dXz8.q1wNbhk2O6;
            i3 += 8;
        }
        fmipvc9gfhawh7dxz8.u04PSKYidgCYrHk5CAtyMkPOXcY(i3);
        while (i2 < list.size()) {
            fmipvc9gfhawh7dxz8.QwZcr6V7mfRUaij0Bp3zpr5ClBcxr(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int V57tEvNfxZVVcOCAOih5PKr(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (fMipVc9GFHAwh7dXz8.h2b7InwIaORKN91X7whfQh4(i) + 8) * size;
    }

    public static int VxUQ9tBhpHJ2AAEDNW8sghc4m(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iG479XgNG9rK8jPPbSXr = 0;
        for (int i = 0; i < size; i++) {
            iG479XgNG9rK8jPPbSXr += fMipVc9GFHAwh7dXz8.G479XgNG9rK8jPPbSXr(((Integer) list.get(i)).intValue());
        }
        return iG479XgNG9rK8jPPbSXr;
    }

    public static int ZLZeBXTMq0zDztBxtRTuCHrapQ(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iG479XgNG9rK8jPPbSXr = 0;
        for (int i = 0; i < size; i++) {
            long jLongValue = ((Long) list.get(i)).longValue();
            iG479XgNG9rK8jPPbSXr += fMipVc9GFHAwh7dXz8.G479XgNG9rK8jPPbSXr((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iG479XgNG9rK8jPPbSXr;
    }

    public static int ZfQNn8hdWlEQ5cR94249PDsLR(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iG479XgNG9rK8jPPbSXr = 0;
        for (int i = 0; i < size; i++) {
            iG479XgNG9rK8jPPbSXr += fMipVc9GFHAwh7dXz8.G479XgNG9rK8jPPbSXr(((Integer) list.get(i)).intValue());
        }
        return iG479XgNG9rK8jPPbSXr;
    }

    public static void f6ZQsR6bPLvvCDNXOUc(int i, List list, Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQ, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        fMipVc9GFHAwh7dXz8 fmipvc9gfhawh7dxz8 = (fMipVc9GFHAwh7dXz8) skgk8FYn8b4TvRiBOsElZw4XkNLhQ.ZfQNn8hdWlEQ5cR94249PDsLR;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                fmipvc9gfhawh7dxz8.dWgUTvLDR2aOE7pFLrMrHP(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        fmipvc9gfhawh7dxz8.DUIkOzkuF3hUt(i, 2);
        int iG479XgNG9rK8jPPbSXr = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iG479XgNG9rK8jPPbSXr += fMipVc9GFHAwh7dXz8.G479XgNG9rK8jPPbSXr(((Long) list.get(i3)).longValue());
        }
        fmipvc9gfhawh7dxz8.u04PSKYidgCYrHk5CAtyMkPOXcY(iG479XgNG9rK8jPPbSXr);
        while (i2 < list.size()) {
            fmipvc9gfhawh7dxz8.W5cWMjmJv6kqhapkBbKZYxBWC2p(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void h3jnZRsdwYJfY9UhQCkbvWciwvFHv(int i, List list, Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQ, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        fMipVc9GFHAwh7dXz8 fmipvc9gfhawh7dxz8 = (fMipVc9GFHAwh7dXz8) skgk8FYn8b4TvRiBOsElZw4XkNLhQ.ZfQNn8hdWlEQ5cR94249PDsLR;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                fmipvc9gfhawh7dxz8.Hf6zp5JYLjGyFD2HXbpHA9(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        fmipvc9gfhawh7dxz8.DUIkOzkuF3hUt(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = fMipVc9GFHAwh7dXz8.q1wNbhk2O6;
            i3 += 4;
        }
        fmipvc9gfhawh7dxz8.u04PSKYidgCYrHk5CAtyMkPOXcY(i3);
        while (i2 < list.size()) {
            fmipvc9gfhawh7dxz8.pCrI77IVeIpJnmCUHd(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void jW7EiD0YL6xkbB158jMUzhWNWb1y(int i, List list, Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQ, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        fMipVc9GFHAwh7dXz8 fmipvc9gfhawh7dxz8 = (fMipVc9GFHAwh7dXz8) skgk8FYn8b4TvRiBOsElZw4XkNLhQ.ZfQNn8hdWlEQ5cR94249PDsLR;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                fmipvc9gfhawh7dxz8.uQ30BFNHbnwcS96Dk6jHUECPfOq(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        fmipvc9gfhawh7dxz8.DUIkOzkuF3hUt(i, 2);
        int iG479XgNG9rK8jPPbSXr = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iG479XgNG9rK8jPPbSXr += fMipVc9GFHAwh7dXz8.G479XgNG9rK8jPPbSXr(((Integer) list.get(i3)).intValue());
        }
        fmipvc9gfhawh7dxz8.u04PSKYidgCYrHk5CAtyMkPOXcY(iG479XgNG9rK8jPPbSXr);
        while (i2 < list.size()) {
            fmipvc9gfhawh7dxz8.SdPSMGy13dYOH9CwolJVKu21val(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void ko09zE6UAgwkV(int i, List list, Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQ, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        fMipVc9GFHAwh7dXz8 fmipvc9gfhawh7dxz8 = (fMipVc9GFHAwh7dXz8) skgk8FYn8b4TvRiBOsElZw4XkNLhQ.ZfQNn8hdWlEQ5cR94249PDsLR;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                fmipvc9gfhawh7dxz8.getClass();
                fmipvc9gfhawh7dxz8.Hf6zp5JYLjGyFD2HXbpHA9(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        fmipvc9gfhawh7dxz8.DUIkOzkuF3hUt(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            Logger logger = fMipVc9GFHAwh7dXz8.q1wNbhk2O6;
            i3 += 4;
        }
        fmipvc9gfhawh7dxz8.u04PSKYidgCYrHk5CAtyMkPOXcY(i3);
        while (i2 < list.size()) {
            fmipvc9gfhawh7dxz8.pCrI77IVeIpJnmCUHd(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void p59rPv72J9(int i, List list, Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQ, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        fMipVc9GFHAwh7dXz8 fmipvc9gfhawh7dxz8 = (fMipVc9GFHAwh7dXz8) skgk8FYn8b4TvRiBOsElZw4XkNLhQ.ZfQNn8hdWlEQ5cR94249PDsLR;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                fmipvc9gfhawh7dxz8.getClass();
                fmipvc9gfhawh7dxz8.N08cqkgagFuPYWJcTFAQVt(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        fmipvc9gfhawh7dxz8.DUIkOzkuF3hUt(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            Logger logger = fMipVc9GFHAwh7dXz8.q1wNbhk2O6;
            i3 += 8;
        }
        fmipvc9gfhawh7dxz8.u04PSKYidgCYrHk5CAtyMkPOXcY(i3);
        while (i2 < list.size()) {
            fmipvc9gfhawh7dxz8.QwZcr6V7mfRUaij0Bp3zpr5ClBcxr(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void pYmKDYlAmhudp(int i, List list, Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQ, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        fMipVc9GFHAwh7dXz8 fmipvc9gfhawh7dxz8 = (fMipVc9GFHAwh7dXz8) skgk8FYn8b4TvRiBOsElZw4XkNLhQ.ZfQNn8hdWlEQ5cR94249PDsLR;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                fmipvc9gfhawh7dxz8.N08cqkgagFuPYWJcTFAQVt(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        fmipvc9gfhawh7dxz8.DUIkOzkuF3hUt(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            Logger logger = fMipVc9GFHAwh7dXz8.q1wNbhk2O6;
            i3 += 8;
        }
        fmipvc9gfhawh7dxz8.u04PSKYidgCYrHk5CAtyMkPOXcY(i3);
        while (i2 < list.size()) {
            fmipvc9gfhawh7dxz8.QwZcr6V7mfRUaij0Bp3zpr5ClBcxr(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void q11o1hieEkZDhF1MGOZI26oZiDT(int i, List list, Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQ, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        fMipVc9GFHAwh7dXz8 fmipvc9gfhawh7dxz8 = (fMipVc9GFHAwh7dXz8) skgk8FYn8b4TvRiBOsElZw4XkNLhQ.ZfQNn8hdWlEQ5cR94249PDsLR;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                fmipvc9gfhawh7dxz8.dWgUTvLDR2aOE7pFLrMrHP(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        fmipvc9gfhawh7dxz8.DUIkOzkuF3hUt(i, 2);
        int iG479XgNG9rK8jPPbSXr = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iG479XgNG9rK8jPPbSXr += fMipVc9GFHAwh7dXz8.G479XgNG9rK8jPPbSXr((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        fmipvc9gfhawh7dxz8.u04PSKYidgCYrHk5CAtyMkPOXcY(iG479XgNG9rK8jPPbSXr);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            fmipvc9gfhawh7dxz8.W5cWMjmJv6kqhapkBbKZYxBWC2p((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    public static void q1wNbhk2O6(int i, List list, Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQ, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        fMipVc9GFHAwh7dXz8 fmipvc9gfhawh7dxz8 = (fMipVc9GFHAwh7dXz8) skgk8FYn8b4TvRiBOsElZw4XkNLhQ.ZfQNn8hdWlEQ5cR94249PDsLR;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                fmipvc9gfhawh7dxz8.nNOZCSz1a7S(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        fmipvc9gfhawh7dxz8.DUIkOzkuF3hUt(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).getClass();
            Logger logger = fMipVc9GFHAwh7dXz8.q1wNbhk2O6;
            i3++;
        }
        fmipvc9gfhawh7dxz8.u04PSKYidgCYrHk5CAtyMkPOXcY(i3);
        while (i2 < list.size()) {
            fmipvc9gfhawh7dxz8.KMiA9Sqk243eQkFNNoS(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void vBGA6pPLqSMuYGvprl270j7(int i, List list, Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQ, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        fMipVc9GFHAwh7dXz8 fmipvc9gfhawh7dxz8 = (fMipVc9GFHAwh7dXz8) skgk8FYn8b4TvRiBOsElZw4XkNLhQ.ZfQNn8hdWlEQ5cR94249PDsLR;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                fmipvc9gfhawh7dxz8.Hf6zp5JYLjGyFD2HXbpHA9(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        fmipvc9gfhawh7dxz8.DUIkOzkuF3hUt(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).getClass();
            Logger logger = fMipVc9GFHAwh7dXz8.q1wNbhk2O6;
            i3 += 4;
        }
        fmipvc9gfhawh7dxz8.u04PSKYidgCYrHk5CAtyMkPOXcY(i3);
        while (i2 < list.size()) {
            fmipvc9gfhawh7dxz8.pCrI77IVeIpJnmCUHd(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void w0Wu95l8dVNw5rZMRu(int i, List list, Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQ, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        fMipVc9GFHAwh7dXz8 fmipvc9gfhawh7dxz8 = (fMipVc9GFHAwh7dXz8) skgk8FYn8b4TvRiBOsElZw4XkNLhQ.ZfQNn8hdWlEQ5cR94249PDsLR;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                fmipvc9gfhawh7dxz8.w45GC0xYcf4u8gmC(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        fmipvc9gfhawh7dxz8.DUIkOzkuF3hUt(i, 2);
        int iR0dB0ojIy6g8mnk1 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iR0dB0ojIy6g8mnk1 += fMipVc9GFHAwh7dXz8.r0dB0ojIy6g8mnk1(((Integer) list.get(i3)).intValue());
        }
        fmipvc9gfhawh7dxz8.u04PSKYidgCYrHk5CAtyMkPOXcY(iR0dB0ojIy6g8mnk1);
        while (i2 < list.size()) {
            fmipvc9gfhawh7dxz8.u04PSKYidgCYrHk5CAtyMkPOXcY(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static int zIvmSL0wzmmKGc3X39b2Gw2mUGE(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR0dB0ojIy6g8mnk1 = 0;
        for (int i = 0; i < size; i++) {
            int iIntValue = ((Integer) list.get(i)).intValue();
            iR0dB0ojIy6g8mnk1 += fMipVc9GFHAwh7dXz8.r0dB0ojIy6g8mnk1((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iR0dB0ojIy6g8mnk1;
    }

    public static int zzpBGItXfub0yWj(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (fMipVc9GFHAwh7dXz8.h2b7InwIaORKN91X7whfQh4(i) + 4) * size;
    }

    public static Object M9e7PWhFYLD2lOGMker(Object obj, int i, ClfGzCKqIREyDxAVtiR1 clfGzCKqIREyDxAVtiR1, Object obj2, ZMoD0hQJsS1v4tTc5bgXQ7sN1hiNa zMoD0hQJsS1v4tTc5bgXQ7sN1hiNa) {
        return obj2;
    }
}
