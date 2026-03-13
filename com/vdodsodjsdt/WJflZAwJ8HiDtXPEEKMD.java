package com.vdodsodjsdt;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class WJflZAwJ8HiDtXPEEKMD extends eAZzwKf05brkM {
    public final /* synthetic */ int VxUQ9tBhpHJ2AAEDNW8sghc4m;

    @Override // com.vdodsodjsdt.eAZzwKf05brkM
    public final void V57tEvNfxZVVcOCAOih5PKr(tVkLQdIevlOoRF1qYmTyvenTzI tvklqdievloorf1qymtyventzi, Object obj) throws IOException {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                Number number = (Number) obj;
                if (number != null) {
                    double dDoubleValue = number.doubleValue();
                    Tt3445ZYXN.VxUQ9tBhpHJ2AAEDNW8sghc4m(dDoubleValue);
                    tvklqdievloorf1qymtyventzi.y1NaPKTl7R18DOr6e8i5(dDoubleValue);
                } else {
                    tvklqdievloorf1qymtyventzi.pzqP2AqKW6J5PO8zCKnW();
                }
                break;
            case 1:
                Number numberValueOf = (Number) obj;
                if (numberValueOf != null) {
                    float fFloatValue = numberValueOf.floatValue();
                    Tt3445ZYXN.VxUQ9tBhpHJ2AAEDNW8sghc4m(fFloatValue);
                    if (!(numberValueOf instanceof Float)) {
                        numberValueOf = Float.valueOf(fFloatValue);
                    }
                    tvklqdievloorf1qymtyventzi.iKANjmyTSxO6v6UuLPdu7DxOjlS(numberValueOf);
                } else {
                    tvklqdievloorf1qymtyventzi.pzqP2AqKW6J5PO8zCKnW();
                }
                break;
            default:
                tvklqdievloorf1qymtyventzi.pzqP2AqKW6J5PO8zCKnW();
                break;
        }
    }

    public String toString() {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }

    @Override // com.vdodsodjsdt.eAZzwKf05brkM
    public final Object zzpBGItXfub0yWj(Gzdlhdn1ss gzdlhdn1ss) throws IOException {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                if (gzdlhdn1ss.wRCD0SdqWCowdYU7bmzN() != 9) {
                    return Double.valueOf(gzdlhdn1ss.HVEwbdULInpTNa0IG());
                }
                gzdlhdn1ss.d9zDyyznnp3oaDT1Ug();
                return null;
            case 1:
                if (gzdlhdn1ss.wRCD0SdqWCowdYU7bmzN() != 9) {
                    return Float.valueOf((float) gzdlhdn1ss.HVEwbdULInpTNa0IG());
                }
                gzdlhdn1ss.d9zDyyznnp3oaDT1Ug();
                return null;
            default:
                gzdlhdn1ss.hKs1wlZyvtUNaW1f5ABIGacfPcvX();
                return null;
        }
    }
}
