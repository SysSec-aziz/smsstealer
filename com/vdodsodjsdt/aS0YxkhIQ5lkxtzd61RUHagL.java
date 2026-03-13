package com.vdodsodjsdt;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class aS0YxkhIQ5lkxtzd61RUHagL extends EDuXvmY6CU2gSBB {
    private static final aS0YxkhIQ5lkxtzd61RUHagL DEFAULT_INSTANCE;
    private static volatile xpSpN44OjvYt7tQaLUg0QNYD PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private ClfGzCKqIREyDxAVtiR1 strings_ = FkYZxaoTQsjNYfO3Sh.zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    static {
        aS0YxkhIQ5lkxtzd61RUHagL as0yxkhiq5lkxtzd61ruhagl = new aS0YxkhIQ5lkxtzd61RUHagL();
        DEFAULT_INSTANCE = as0yxkhiq5lkxtzd61ruhagl;
        EDuXvmY6CU2gSBB.M9e7PWhFYLD2lOGMker(aS0YxkhIQ5lkxtzd61RUHagL.class, as0yxkhiq5lkxtzd61ruhagl);
    }

    public static c8TC5qjySF86nz8Gjjm6U Ca81ebIan1u() {
        return (c8TC5qjySF86nz8Gjjm6U) ((VPMtT1jcR7zbXRt4l8GJjBtPr) DEFAULT_INSTANCE.V57tEvNfxZVVcOCAOih5PKr(5));
    }

    public static void KUYypEB4eNWOZWVDpH(aS0YxkhIQ5lkxtzd61RUHagL as0yxkhiq5lkxtzd61ruhagl, Set set) {
        ClfGzCKqIREyDxAVtiR1 clfGzCKqIREyDxAVtiR1 = as0yxkhiq5lkxtzd61ruhagl.strings_;
        if (!((YSt4yvIps7DNt8) clfGzCKqIREyDxAVtiR1).V57tEvNfxZVVcOCAOih5PKr) {
            FkYZxaoTQsjNYfO3Sh fkYZxaoTQsjNYfO3Sh = (FkYZxaoTQsjNYfO3Sh) clfGzCKqIREyDxAVtiR1;
            int i = fkYZxaoTQsjNYfO3Sh.LaeGQIruHQu81hfJldjMOQSVblH3x;
            as0yxkhiq5lkxtzd61ruhagl.strings_ = fkYZxaoTQsjNYfO3Sh.V57tEvNfxZVVcOCAOih5PKr(i == 0 ? 10 : i * 2);
        }
        RandomAccess randomAccess = as0yxkhiq5lkxtzd61ruhagl.strings_;
        Charset charset = iJsJOOjKyWEygkebu5yh4.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (randomAccess instanceof ArrayList) {
            ((ArrayList) randomAccess).ensureCapacity(set.size() + ((FkYZxaoTQsjNYfO3Sh) randomAccess).LaeGQIruHQu81hfJldjMOQSVblH3x);
        }
        FkYZxaoTQsjNYfO3Sh fkYZxaoTQsjNYfO3Sh2 = (FkYZxaoTQsjNYfO3Sh) randomAccess;
        int i2 = fkYZxaoTQsjNYfO3Sh2.LaeGQIruHQu81hfJldjMOQSVblH3x;
        for (Object obj : set) {
            if (obj == null) {
                String str = "Element at index " + (fkYZxaoTQsjNYfO3Sh2.LaeGQIruHQu81hfJldjMOQSVblH3x - i2) + " is null.";
                for (int i3 = fkYZxaoTQsjNYfO3Sh2.LaeGQIruHQu81hfJldjMOQSVblH3x - 1; i3 >= i2; i3--) {
                    fkYZxaoTQsjNYfO3Sh2.remove(i3);
                }
                throw new NullPointerException(str);
            }
            fkYZxaoTQsjNYfO3Sh2.add(obj);
        }
    }

    public static aS0YxkhIQ5lkxtzd61RUHagL q1wNbhk2O6() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.vdodsodjsdt.EDuXvmY6CU2gSBB
    public final Object V57tEvNfxZVVcOCAOih5PKr(int i) {
        xpSpN44OjvYt7tQaLUg0QNYD kqtmfxqfwrfojdzok0t7;
        switch (u9SlVAuoWhQUfJ.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                return new YKlOoXxkpyoAf0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                return new aS0YxkhIQ5lkxtzd61RUHagL();
            case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                return new c8TC5qjySF86nz8Gjjm6U(DEFAULT_INSTANCE);
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_SET_FIELD_NUMBER /* 6 */:
                xpSpN44OjvYt7tQaLUg0QNYD xpspn44ojvyt7tqalug0qnyd = PARSER;
                if (xpspn44ojvyt7tqalug0qnyd != null) {
                    return xpspn44ojvyt7tqalug0qnyd;
                }
                synchronized (aS0YxkhIQ5lkxtzd61RUHagL.class) {
                    try {
                        kqtmfxqfwrfojdzok0t7 = PARSER;
                        if (kqtmfxqfwrfojdzok0t7 == null) {
                            kqtmfxqfwrfojdzok0t7 = new kQtMfXQfwRFojdzok0t7();
                            PARSER = kqtmfxqfwrfojdzok0t7;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return kqtmfxqfwrfojdzok0t7;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final ClfGzCKqIREyDxAVtiR1 p59rPv72J9() {
        return this.strings_;
    }
}
