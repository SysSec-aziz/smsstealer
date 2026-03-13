package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class g8kevnL6UKpr15IYtcPJXuLo1L4 extends EDuXvmY6CU2gSBB {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final g8kevnL6UKpr15IYtcPJXuLo1L4 DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile xpSpN44OjvYt7tQaLUg0QNYD PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        g8kevnL6UKpr15IYtcPJXuLo1L4 g8kevnl6ukpr15iytcpjxulo1l4 = new g8kevnL6UKpr15IYtcPJXuLo1L4();
        DEFAULT_INSTANCE = g8kevnl6ukpr15iytcpjxulo1l4;
        EDuXvmY6CU2gSBB.M9e7PWhFYLD2lOGMker(g8kevnL6UKpr15IYtcPJXuLo1L4.class, g8kevnl6ukpr15iytcpjxulo1l4);
    }

    public static void Ca81ebIan1u(g8kevnL6UKpr15IYtcPJXuLo1L4 g8kevnl6ukpr15iytcpjxulo1l4, double d) {
        g8kevnl6ukpr15iytcpjxulo1l4.valueCase_ = 7;
        g8kevnl6ukpr15iytcpjxulo1l4.value_ = Double.valueOf(d);
    }

    public static void KUYypEB4eNWOZWVDpH(g8kevnL6UKpr15IYtcPJXuLo1L4 g8kevnl6ukpr15iytcpjxulo1l4, long j) {
        g8kevnl6ukpr15iytcpjxulo1l4.valueCase_ = 4;
        g8kevnl6ukpr15iytcpjxulo1l4.value_ = Long.valueOf(j);
    }

    public static g8kevnL6UKpr15IYtcPJXuLo1L4 TaDO7ogis3aEiWEtq() {
        return DEFAULT_INSTANCE;
    }

    public static L34L9T9oVIxCgI1O aXO0LSrt8bKV() {
        return (L34L9T9oVIxCgI1O) ((VPMtT1jcR7zbXRt4l8GJjBtPr) DEFAULT_INSTANCE.V57tEvNfxZVVcOCAOih5PKr(5));
    }

    public static void h3jnZRsdwYJfY9UhQCkbvWciwvFHv(g8kevnL6UKpr15IYtcPJXuLo1L4 g8kevnl6ukpr15iytcpjxulo1l4, uDRHTE5hsm7JpGOnK7F udrhte5hsm7jpgonk7f) {
        g8kevnl6ukpr15iytcpjxulo1l4.getClass();
        g8kevnl6ukpr15iytcpjxulo1l4.valueCase_ = 8;
        g8kevnl6ukpr15iytcpjxulo1l4.value_ = udrhte5hsm7jpgonk7f;
    }

    public static void jW7EiD0YL6xkbB158jMUzhWNWb1y(g8kevnL6UKpr15IYtcPJXuLo1L4 g8kevnl6ukpr15iytcpjxulo1l4, int i) {
        g8kevnl6ukpr15iytcpjxulo1l4.valueCase_ = 3;
        g8kevnl6ukpr15iytcpjxulo1l4.value_ = Integer.valueOf(i);
    }

    public static void ko09zE6UAgwkV(g8kevnL6UKpr15IYtcPJXuLo1L4 g8kevnl6ukpr15iytcpjxulo1l4, float f) {
        g8kevnl6ukpr15iytcpjxulo1l4.valueCase_ = 2;
        g8kevnl6ukpr15iytcpjxulo1l4.value_ = Float.valueOf(f);
    }

    public static void p59rPv72J9(g8kevnL6UKpr15IYtcPJXuLo1L4 g8kevnl6ukpr15iytcpjxulo1l4, aS0YxkhIQ5lkxtzd61RUHagL as0yxkhiq5lkxtzd61ruhagl) {
        g8kevnl6ukpr15iytcpjxulo1l4.getClass();
        g8kevnl6ukpr15iytcpjxulo1l4.value_ = as0yxkhiq5lkxtzd61ruhagl;
        g8kevnl6ukpr15iytcpjxulo1l4.valueCase_ = 6;
    }

    public static void pYmKDYlAmhudp(g8kevnL6UKpr15IYtcPJXuLo1L4 g8kevnl6ukpr15iytcpjxulo1l4, boolean z) {
        g8kevnl6ukpr15iytcpjxulo1l4.valueCase_ = 1;
        g8kevnl6ukpr15iytcpjxulo1l4.value_ = Boolean.valueOf(z);
    }

    public static void q1wNbhk2O6(g8kevnL6UKpr15IYtcPJXuLo1L4 g8kevnl6ukpr15iytcpjxulo1l4, String str) {
        g8kevnl6ukpr15iytcpjxulo1l4.getClass();
        g8kevnl6ukpr15iytcpjxulo1l4.valueCase_ = 5;
        g8kevnl6ukpr15iytcpjxulo1l4.value_ = str;
    }

    public final double Irh5auREsoeV1C1RaBamlmy() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final long RhfGHxtXxy0M0grmp2jkRjQg() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final aS0YxkhIQ5lkxtzd61RUHagL SuB3hEmTmbbRGAhtvOOmfKEon() {
        return this.valueCase_ == 6 ? (aS0YxkhIQ5lkxtzd61RUHagL) this.value_ : aS0YxkhIQ5lkxtzd61RUHagL.q1wNbhk2O6();
    }

    @Override // com.vdodsodjsdt.EDuXvmY6CU2gSBB
    public final Object V57tEvNfxZVVcOCAOih5PKr(int i) {
        xpSpN44OjvYt7tQaLUg0QNYD kqtmfxqfwrfojdzok0t7;
        switch (u9SlVAuoWhQUfJ.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case FLOAT_FIELD_NUMBER /* 2 */:
                return new YKlOoXxkpyoAf0(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", aS0YxkhIQ5lkxtzd61RUHagL.class});
            case INTEGER_FIELD_NUMBER /* 3 */:
                return new g8kevnL6UKpr15IYtcPJXuLo1L4();
            case LONG_FIELD_NUMBER /* 4 */:
                return new L34L9T9oVIxCgI1O(DEFAULT_INSTANCE);
            case STRING_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                xpSpN44OjvYt7tQaLUg0QNYD xpspn44ojvyt7tqalug0qnyd = PARSER;
                if (xpspn44ojvyt7tqalug0qnyd != null) {
                    return xpspn44ojvyt7tqalug0qnyd;
                }
                synchronized (g8kevnL6UKpr15IYtcPJXuLo1L4.class) {
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

    public final boolean f6ZQsR6bPLvvCDNXOUc() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final int pzqP2AqKW6J5PO8zCKnW() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case FLOAT_FIELD_NUMBER /* 2 */:
                return 2;
            case INTEGER_FIELD_NUMBER /* 3 */:
                return 3;
            case LONG_FIELD_NUMBER /* 4 */:
                return 4;
            case STRING_FIELD_NUMBER /* 5 */:
                return 5;
            case STRING_SET_FIELD_NUMBER /* 6 */:
                return 6;
            case DOUBLE_FIELD_NUMBER /* 7 */:
                return 7;
            case BYTES_FIELD_NUMBER /* 8 */:
                return 8;
            default:
                return 0;
        }
    }

    public final float q11o1hieEkZDhF1MGOZI26oZiDT() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final String qNPQb1obP7() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public final uDRHTE5hsm7JpGOnK7F vBGA6pPLqSMuYGvprl270j7() {
        return this.valueCase_ == 8 ? (uDRHTE5hsm7JpGOnK7F) this.value_ : uDRHTE5hsm7JpGOnK7F.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    public final int w0Wu95l8dVNw5rZMRu() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }
}
