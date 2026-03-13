package com.vdodsodjsdt;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class hsTJlnOZEVw2 extends EDuXvmY6CU2gSBB {
    private static final hsTJlnOZEVw2 DEFAULT_INSTANCE;
    private static volatile xpSpN44OjvYt7tQaLUg0QNYD PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private g8M0ERZRsdov5nGlPF preferences_ = g8M0ERZRsdov5nGlPF.ZfQNn8hdWlEQ5cR94249PDsLR;

    static {
        hsTJlnOZEVw2 hstjlnozevw2 = new hsTJlnOZEVw2();
        DEFAULT_INSTANCE = hstjlnozevw2;
        EDuXvmY6CU2gSBB.M9e7PWhFYLD2lOGMker(hsTJlnOZEVw2.class, hstjlnozevw2);
    }

    public static hsTJlnOZEVw2 Ca81ebIan1u(FileInputStream fileInputStream) {
        hsTJlnOZEVw2 hstjlnozevw2 = DEFAULT_INSTANCE;
        oyUuaPTzkB2VnvqP oyuuaptzkb2vnvqp = new oyUuaPTzkB2VnvqP(fileInputStream);
        GYA7qjG8LaMjCjwXLn6w7s6 gYA7qjG8LaMjCjwXLn6w7s6VxUQ9tBhpHJ2AAEDNW8sghc4m = GYA7qjG8LaMjCjwXLn6w7s6.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        EDuXvmY6CU2gSBB eDuXvmY6CU2gSBBGI83zq0G8e7zkn = hstjlnozevw2.GI83zq0G8e7zkn();
        try {
            fsiIibR9odqEwhUwtyl8oM fsiiibr9odqewhuwtyl8om = fsiIibR9odqEwhUwtyl8oM.V57tEvNfxZVVcOCAOih5PKr;
            fsiiibr9odqewhuwtyl8om.getClass();
            daoEmhfC82oCShPhDmB3 daoemhfc82ocshphdmb3VxUQ9tBhpHJ2AAEDNW8sghc4m = fsiiibr9odqewhuwtyl8om.VxUQ9tBhpHJ2AAEDNW8sghc4m(eDuXvmY6CU2gSBBGI83zq0G8e7zkn.getClass());
            MSl7hPM6XqjxyBV5m mSl7hPM6XqjxyBV5m = oyuuaptzkb2vnvqp.zzpBGItXfub0yWj;
            if (mSl7hPM6XqjxyBV5m == null) {
                mSl7hPM6XqjxyBV5m = new MSl7hPM6XqjxyBV5m(oyuuaptzkb2vnvqp);
            }
            daoemhfc82ocshphdmb3VxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m(eDuXvmY6CU2gSBBGI83zq0G8e7zkn, mSl7hPM6XqjxyBV5m, gYA7qjG8LaMjCjwXLn6w7s6VxUQ9tBhpHJ2AAEDNW8sghc4m);
            daoemhfc82ocshphdmb3VxUQ9tBhpHJ2AAEDNW8sghc4m.zIvmSL0wzmmKGc3X39b2Gw2mUGE(eDuXvmY6CU2gSBBGI83zq0G8e7zkn);
            if (EDuXvmY6CU2gSBB.zIvmSL0wzmmKGc3X39b2Gw2mUGE(eDuXvmY6CU2gSBBGI83zq0G8e7zkn, true)) {
                return (hsTJlnOZEVw2) eDuXvmY6CU2gSBBGI83zq0G8e7zkn;
            }
            throw new tabhAwpQKyJhu24Q(new hTeLHMrKVYUS2O0JN6TkrN6().getMessage());
        } catch (hTeLHMrKVYUS2O0JN6TkrN6 e) {
            throw new tabhAwpQKyJhu24Q(e.getMessage());
        } catch (tabhAwpQKyJhu24Q e2) {
            if (e2.V57tEvNfxZVVcOCAOih5PKr) {
                throw new tabhAwpQKyJhu24Q(e2.getMessage(), e2);
            }
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof tabhAwpQKyJhu24Q) {
                throw ((tabhAwpQKyJhu24Q) e3.getCause());
            }
            throw new tabhAwpQKyJhu24Q(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof tabhAwpQKyJhu24Q) {
                throw ((tabhAwpQKyJhu24Q) e4.getCause());
            }
            throw e4;
        }
    }

    public static g8M0ERZRsdov5nGlPF KUYypEB4eNWOZWVDpH(hsTJlnOZEVw2 hstjlnozevw2) {
        g8M0ERZRsdov5nGlPF g8m0erzrsdov5nglpf = hstjlnozevw2.preferences_;
        if (!g8m0erzrsdov5nglpf.V57tEvNfxZVVcOCAOih5PKr) {
            hstjlnozevw2.preferences_ = g8m0erzrsdov5nglpf.zzpBGItXfub0yWj();
        }
        return hstjlnozevw2.preferences_;
    }

    public static oq6kMi7oAYnkkVP p59rPv72J9() {
        return (oq6kMi7oAYnkkVP) ((VPMtT1jcR7zbXRt4l8GJjBtPr) DEFAULT_INSTANCE.V57tEvNfxZVVcOCAOih5PKr(5));
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
                return new YKlOoXxkpyoAf0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", BdgXQVnn1Xos5Gl6fvu6ve.VxUQ9tBhpHJ2AAEDNW8sghc4m});
            case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                return new hsTJlnOZEVw2();
            case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                return new oq6kMi7oAYnkkVP(DEFAULT_INSTANCE);
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_SET_FIELD_NUMBER /* 6 */:
                xpSpN44OjvYt7tQaLUg0QNYD xpspn44ojvyt7tqalug0qnyd = PARSER;
                if (xpspn44ojvyt7tqalug0qnyd != null) {
                    return xpspn44ojvyt7tqalug0qnyd;
                }
                synchronized (hsTJlnOZEVw2.class) {
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

    public final Map q1wNbhk2O6() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
