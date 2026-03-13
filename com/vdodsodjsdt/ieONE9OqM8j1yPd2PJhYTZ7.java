package com.vdodsodjsdt;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class ieONE9OqM8j1yPd2PJhYTZ7 extends QeKKFV2Up7IkAXaln9fr {
    public final Serializable V57tEvNfxZVVcOCAOih5PKr;

    public ieONE9OqM8j1yPd2PJhYTZ7(Boolean bool) {
        Objects.requireNonNull(bool);
        this.V57tEvNfxZVVcOCAOih5PKr = bool;
    }

    public static boolean ZfQNn8hdWlEQ5cR94249PDsLR(ieONE9OqM8j1yPd2PJhYTZ7 ieone9oqm8j1ypd2pjhytz7) {
        Serializable serializable = ieone9oqm8j1ypd2pjhytz7.V57tEvNfxZVVcOCAOih5PKr;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public final String V57tEvNfxZVVcOCAOih5PKr() {
        Serializable serializable = this.V57tEvNfxZVVcOCAOih5PKr;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return zzpBGItXfub0yWj().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final BigInteger VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        Serializable serializable = this.V57tEvNfxZVVcOCAOih5PKr;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (ZfQNn8hdWlEQ5cR94249PDsLR(this)) {
            return BigInteger.valueOf(zzpBGItXfub0yWj().longValue());
        }
        String strV57tEvNfxZVVcOCAOih5PKr = V57tEvNfxZVVcOCAOih5PKr();
        sGipz63rTUmSj3uFDvOtzihao.GI83zq0G8e7zkn(strV57tEvNfxZVVcOCAOih5PKr);
        return new BigInteger(strV57tEvNfxZVVcOCAOih5PKr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ieONE9OqM8j1yPd2PJhYTZ7.class != obj.getClass()) {
            return false;
        }
        ieONE9OqM8j1yPd2PJhYTZ7 ieone9oqm8j1ypd2pjhytz7 = (ieONE9OqM8j1yPd2PJhYTZ7) obj;
        Serializable serializable = ieone9oqm8j1ypd2pjhytz7.V57tEvNfxZVVcOCAOih5PKr;
        Serializable serializable2 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (serializable2 == null) {
            return serializable == null;
        }
        if (ZfQNn8hdWlEQ5cR94249PDsLR(this) && ZfQNn8hdWlEQ5cR94249PDsLR(ieone9oqm8j1ypd2pjhytz7)) {
            return ((serializable2 instanceof BigInteger) || (serializable instanceof BigInteger)) ? VxUQ9tBhpHJ2AAEDNW8sghc4m().equals(ieone9oqm8j1ypd2pjhytz7.VxUQ9tBhpHJ2AAEDNW8sghc4m()) : zzpBGItXfub0yWj().longValue() == ieone9oqm8j1ypd2pjhytz7.zzpBGItXfub0yWj().longValue();
        }
        if (!(serializable2 instanceof Number) || !(serializable instanceof Number)) {
            return serializable2.equals(serializable);
        }
        if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
            return (serializable2 instanceof BigDecimal ? (BigDecimal) serializable2 : sGipz63rTUmSj3uFDvOtzihao.d9zDyyznnp3oaDT1Ug(V57tEvNfxZVVcOCAOih5PKr())).compareTo(serializable instanceof BigDecimal ? (BigDecimal) serializable : sGipz63rTUmSj3uFDvOtzihao.d9zDyyznnp3oaDT1Ug(ieone9oqm8j1ypd2pjhytz7.V57tEvNfxZVVcOCAOih5PKr())) == 0;
        }
        double dDoubleValue = serializable2 instanceof Number ? zzpBGItXfub0yWj().doubleValue() : Double.parseDouble(V57tEvNfxZVVcOCAOih5PKr());
        double dDoubleValue2 = serializable instanceof Number ? ieone9oqm8j1ypd2pjhytz7.zzpBGItXfub0yWj().doubleValue() : Double.parseDouble(ieone9oqm8j1ypd2pjhytz7.V57tEvNfxZVVcOCAOih5PKr());
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.V57tEvNfxZVVcOCAOih5PKr;
        if (serializable == null) {
            return 31;
        }
        if (ZfQNn8hdWlEQ5cR94249PDsLR(this)) {
            jDoubleToLongBits = zzpBGItXfub0yWj().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(zzpBGItXfub0yWj().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final Number zzpBGItXfub0yWj() {
        Serializable serializable = this.V57tEvNfxZVVcOCAOih5PKr;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new Ic53uc1TSX1PhLp3lGbBDfNitR((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public ieONE9OqM8j1yPd2PJhYTZ7(Number number) {
        Objects.requireNonNull(number);
        this.V57tEvNfxZVVcOCAOih5PKr = number;
    }

    public ieONE9OqM8j1yPd2PJhYTZ7(String str) {
        Objects.requireNonNull(str);
        this.V57tEvNfxZVVcOCAOih5PKr = str;
    }
}
