package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class ZMoD0hQJsS1v4tTc5bgXQ7sN1hiNa {
    public static sE56ypyAr5rUSL24j5APySHkB9r8y VxUQ9tBhpHJ2AAEDNW8sghc4m(Object obj) {
        EDuXvmY6CU2gSBB eDuXvmY6CU2gSBB = (EDuXvmY6CU2gSBB) obj;
        sE56ypyAr5rUSL24j5APySHkB9r8y se56ypyar5rusl24j5apyshkb9r8y = eDuXvmY6CU2gSBB.unknownFields;
        if (se56ypyar5rusl24j5apyshkb9r8y != sE56ypyAr5rUSL24j5APySHkB9r8y.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
            return se56ypyar5rusl24j5apyshkb9r8y;
        }
        sE56ypyAr5rUSL24j5APySHkB9r8y se56ypyar5rusl24j5apyshkb9r8y2 = new sE56ypyAr5rUSL24j5APySHkB9r8y(0, new int[8], new Object[8], true);
        eDuXvmY6CU2gSBB.unknownFields = se56ypyar5rusl24j5apyshkb9r8y2;
        return se56ypyar5rusl24j5apyshkb9r8y2;
    }

    public static boolean zzpBGItXfub0yWj(int i, MSl7hPM6XqjxyBV5m mSl7hPM6XqjxyBV5m, Object obj) throws tabhAwpQKyJhu24Q {
        caFA212npwWVdtc2e6z cafa212npwwvdtc2e6z = (caFA212npwWVdtc2e6z) mSl7hPM6XqjxyBV5m.ZfQNn8hdWlEQ5cR94249PDsLR;
        int i2 = mSl7hPM6XqjxyBV5m.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            mSl7hPM6XqjxyBV5m.w0Wu95l8dVNw5rZMRu(0);
            ((sE56ypyAr5rUSL24j5APySHkB9r8y) obj).V57tEvNfxZVVcOCAOih5PKr(i3 << 3, Long.valueOf(cafa212npwwvdtc2e6z.p59rPv72J9()));
            return true;
        }
        if (i4 == 1) {
            mSl7hPM6XqjxyBV5m.w0Wu95l8dVNw5rZMRu(1);
            ((sE56ypyAr5rUSL24j5APySHkB9r8y) obj).V57tEvNfxZVVcOCAOih5PKr((i3 << 3) | 1, Long.valueOf(cafa212npwwvdtc2e6z.HzCpKshMOoaw76hFcbOVRYMeRd()));
            return true;
        }
        if (i4 == 2) {
            ((sE56ypyAr5rUSL24j5APySHkB9r8y) obj).V57tEvNfxZVVcOCAOih5PKr((i3 << 3) | 2, mSl7hPM6XqjxyBV5m.ZLZeBXTMq0zDztBxtRTuCHrapQ());
            return true;
        }
        if (i4 != 3) {
            if (i4 == 4) {
                return false;
            }
            if (i4 != 5) {
                throw tabhAwpQKyJhu24Q.zzpBGItXfub0yWj();
            }
            mSl7hPM6XqjxyBV5m.w0Wu95l8dVNw5rZMRu(5);
            ((sE56ypyAr5rUSL24j5APySHkB9r8y) obj).V57tEvNfxZVVcOCAOih5PKr(5 | (i3 << 3), Integer.valueOf(cafa212npwwvdtc2e6z.M9e7PWhFYLD2lOGMker()));
            return true;
        }
        sE56ypyAr5rUSL24j5APySHkB9r8y se56ypyar5rusl24j5apyshkb9r8y = new sE56ypyAr5rUSL24j5APySHkB9r8y(0, new int[8], new Object[8], true);
        int i5 = i3 << 3;
        int i6 = i5 | 4;
        int i7 = i + 1;
        if (i7 >= 100) {
            throw new tabhAwpQKyJhu24Q("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (mSl7hPM6XqjxyBV5m.V57tEvNfxZVVcOCAOih5PKr() != Integer.MAX_VALUE && zzpBGItXfub0yWj(i7, mSl7hPM6XqjxyBV5m, se56ypyar5rusl24j5apyshkb9r8y)) {
        }
        if (i6 != mSl7hPM6XqjxyBV5m.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            throw new tabhAwpQKyJhu24Q("Protocol message end-group tag did not match expected tag.");
        }
        if (se56ypyar5rusl24j5apyshkb9r8y.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            se56ypyar5rusl24j5apyshkb9r8y.LaeGQIruHQu81hfJldjMOQSVblH3x = false;
        }
        ((sE56ypyAr5rUSL24j5APySHkB9r8y) obj).V57tEvNfxZVVcOCAOih5PKr(i5 | 3, se56ypyar5rusl24j5apyshkb9r8y);
        return true;
    }
}
