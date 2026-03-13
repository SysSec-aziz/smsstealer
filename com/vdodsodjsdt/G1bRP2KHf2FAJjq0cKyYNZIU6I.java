package com.vdodsodjsdt;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class G1bRP2KHf2FAJjq0cKyYNZIU6I extends eAZzwKf05brkM {
    public static final G1bRP2KHf2FAJjq0cKyYNZIU6I VxUQ9tBhpHJ2AAEDNW8sghc4m = new G1bRP2KHf2FAJjq0cKyYNZIU6I();

    private G1bRP2KHf2FAJjq0cKyYNZIU6I() {
    }

    public static void LaeGQIruHQu81hfJldjMOQSVblH3x(tVkLQdIevlOoRF1qYmTyvenTzI tvklqdievloorf1qymtyventzi, QeKKFV2Up7IkAXaln9fr qeKKFV2Up7IkAXaln9fr) throws IOException {
        if (qeKKFV2Up7IkAXaln9fr == null || (qeKKFV2Up7IkAXaln9fr instanceof dR4bajOWGsCpClWgxIODH)) {
            tvklqdievloorf1qymtyventzi.pzqP2AqKW6J5PO8zCKnW();
            return;
        }
        boolean z = qeKKFV2Up7IkAXaln9fr instanceof ieONE9OqM8j1yPd2PJhYTZ7;
        if (z) {
            if (!z) {
                throw new IllegalStateException("Not a JSON Primitive: " + qeKKFV2Up7IkAXaln9fr);
            }
            ieONE9OqM8j1yPd2PJhYTZ7 ieone9oqm8j1ypd2pjhytz7 = (ieONE9OqM8j1yPd2PJhYTZ7) qeKKFV2Up7IkAXaln9fr;
            Serializable serializable = ieone9oqm8j1ypd2pjhytz7.V57tEvNfxZVVcOCAOih5PKr;
            if (serializable instanceof Number) {
                tvklqdievloorf1qymtyventzi.iKANjmyTSxO6v6UuLPdu7DxOjlS(ieone9oqm8j1ypd2pjhytz7.zzpBGItXfub0yWj());
                return;
            } else if (serializable instanceof Boolean) {
                tvklqdievloorf1qymtyventzi.d9zDyyznnp3oaDT1Ug(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(ieone9oqm8j1ypd2pjhytz7.V57tEvNfxZVVcOCAOih5PKr()));
                return;
            } else {
                tvklqdievloorf1qymtyventzi.TqcnImqkSWIKht(ieone9oqm8j1ypd2pjhytz7.V57tEvNfxZVVcOCAOih5PKr());
                return;
            }
        }
        boolean z2 = qeKKFV2Up7IkAXaln9fr instanceof N9RUKcU88NfGDdbMbExcN2Wk;
        if (z2) {
            tvklqdievloorf1qymtyventzi.V57tEvNfxZVVcOCAOih5PKr();
            if (!z2) {
                throw new IllegalStateException("Not a JSON Array: " + qeKKFV2Up7IkAXaln9fr);
            }
            ArrayList arrayList = ((N9RUKcU88NfGDdbMbExcN2Wk) qeKKFV2Up7IkAXaln9fr).V57tEvNfxZVVcOCAOih5PKr;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                LaeGQIruHQu81hfJldjMOQSVblH3x(tvklqdievloorf1qymtyventzi, (QeKKFV2Up7IkAXaln9fr) obj);
            }
            tvklqdievloorf1qymtyventzi.KUYypEB4eNWOZWVDpH();
            return;
        }
        boolean z3 = qeKKFV2Up7IkAXaln9fr instanceof ETviAcrtV5P5;
        if (!z3) {
            throw new IllegalArgumentException("Couldn't write " + qeKKFV2Up7IkAXaln9fr.getClass());
        }
        tvklqdievloorf1qymtyventzi.LaeGQIruHQu81hfJldjMOQSVblH3x();
        if (!z3) {
            throw new IllegalStateException("Not a JSON Object: " + qeKKFV2Up7IkAXaln9fr);
        }
        Iterator it = ((UGdIdpErCW3yV) ((ETviAcrtV5P5) qeKKFV2Up7IkAXaln9fr).V57tEvNfxZVVcOCAOih5PKr.entrySet()).iterator();
        while (((NNss8hexSyKT03dohpPoXWbKv9) it).hasNext()) {
            AFFHICUFcvabTydqa5fiI aFFHICUFcvabTydqa5fiIZzpBGItXfub0yWj = ((NNss8hexSyKT03dohpPoXWbKv9) it).zzpBGItXfub0yWj();
            tvklqdievloorf1qymtyventzi.RhfGHxtXxy0M0grmp2jkRjQg((String) aFFHICUFcvabTydqa5fiIZzpBGItXfub0yWj.getKey());
            LaeGQIruHQu81hfJldjMOQSVblH3x(tvklqdievloorf1qymtyventzi, (QeKKFV2Up7IkAXaln9fr) aFFHICUFcvabTydqa5fiIZzpBGItXfub0yWj.getValue());
        }
        tvklqdievloorf1qymtyventzi.q11o1hieEkZDhF1MGOZI26oZiDT();
    }

    public static QeKKFV2Up7IkAXaln9fr ZfQNn8hdWlEQ5cR94249PDsLR(Gzdlhdn1ss gzdlhdn1ss, int i) throws IOException {
        int iH3jnZRsdwYJfY9UhQCkbvWciwvFHv = u9SlVAuoWhQUfJ.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(i);
        if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv == 5) {
            return new ieONE9OqM8j1yPd2PJhYTZ7(gzdlhdn1ss.ymT6yQrus3w());
        }
        if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv == 6) {
            return new ieONE9OqM8j1yPd2PJhYTZ7(new Ic53uc1TSX1PhLp3lGbBDfNitR(gzdlhdn1ss.ymT6yQrus3w()));
        }
        if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv == 7) {
            return new ieONE9OqM8j1yPd2PJhYTZ7(Boolean.valueOf(gzdlhdn1ss.O1xDAlBZZlZdoEf747lCFHld()));
        }
        if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(u9SlVAuoWhQUfJ.pYmKDYlAmhudp(i)));
        }
        gzdlhdn1ss.d9zDyyznnp3oaDT1Ug();
        return dR4bajOWGsCpClWgxIODH.V57tEvNfxZVVcOCAOih5PKr;
    }

    @Override // com.vdodsodjsdt.eAZzwKf05brkM
    public final /* bridge */ /* synthetic */ void V57tEvNfxZVVcOCAOih5PKr(tVkLQdIevlOoRF1qYmTyvenTzI tvklqdievloorf1qymtyventzi, Object obj) throws IOException {
        LaeGQIruHQu81hfJldjMOQSVblH3x(tvklqdievloorf1qymtyventzi, (QeKKFV2Up7IkAXaln9fr) obj);
    }

    @Override // com.vdodsodjsdt.eAZzwKf05brkM
    public final Object zzpBGItXfub0yWj(Gzdlhdn1ss gzdlhdn1ss) throws IOException {
        QeKKFV2Up7IkAXaln9fr n9RUKcU88NfGDdbMbExcN2Wk;
        QeKKFV2Up7IkAXaln9fr n9RUKcU88NfGDdbMbExcN2Wk2;
        int iWRCD0SdqWCowdYU7bmzN = gzdlhdn1ss.wRCD0SdqWCowdYU7bmzN();
        int iH3jnZRsdwYJfY9UhQCkbvWciwvFHv = u9SlVAuoWhQUfJ.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(iWRCD0SdqWCowdYU7bmzN);
        if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv == 0) {
            gzdlhdn1ss.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            n9RUKcU88NfGDdbMbExcN2Wk = new N9RUKcU88NfGDdbMbExcN2Wk();
        } else if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv != 2) {
            n9RUKcU88NfGDdbMbExcN2Wk = null;
        } else {
            gzdlhdn1ss.V57tEvNfxZVVcOCAOih5PKr();
            n9RUKcU88NfGDdbMbExcN2Wk = new ETviAcrtV5P5();
        }
        if (n9RUKcU88NfGDdbMbExcN2Wk == null) {
            return ZfQNn8hdWlEQ5cR94249PDsLR(gzdlhdn1ss, iWRCD0SdqWCowdYU7bmzN);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (gzdlhdn1ss.pzqP2AqKW6J5PO8zCKnW()) {
                String strIKANjmyTSxO6v6UuLPdu7DxOjlS = n9RUKcU88NfGDdbMbExcN2Wk instanceof ETviAcrtV5P5 ? gzdlhdn1ss.iKANjmyTSxO6v6UuLPdu7DxOjlS() : null;
                int iWRCD0SdqWCowdYU7bmzN2 = gzdlhdn1ss.wRCD0SdqWCowdYU7bmzN();
                int iH3jnZRsdwYJfY9UhQCkbvWciwvFHv2 = u9SlVAuoWhQUfJ.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(iWRCD0SdqWCowdYU7bmzN2);
                if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv2 == 0) {
                    gzdlhdn1ss.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                    n9RUKcU88NfGDdbMbExcN2Wk2 = new N9RUKcU88NfGDdbMbExcN2Wk();
                } else if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv2 != 2) {
                    n9RUKcU88NfGDdbMbExcN2Wk2 = null;
                } else {
                    gzdlhdn1ss.V57tEvNfxZVVcOCAOih5PKr();
                    n9RUKcU88NfGDdbMbExcN2Wk2 = new ETviAcrtV5P5();
                }
                boolean z = n9RUKcU88NfGDdbMbExcN2Wk2 != null;
                if (n9RUKcU88NfGDdbMbExcN2Wk2 == null) {
                    n9RUKcU88NfGDdbMbExcN2Wk2 = ZfQNn8hdWlEQ5cR94249PDsLR(gzdlhdn1ss, iWRCD0SdqWCowdYU7bmzN2);
                }
                if (n9RUKcU88NfGDdbMbExcN2Wk instanceof N9RUKcU88NfGDdbMbExcN2Wk) {
                    ((N9RUKcU88NfGDdbMbExcN2Wk) n9RUKcU88NfGDdbMbExcN2Wk).V57tEvNfxZVVcOCAOih5PKr.add(n9RUKcU88NfGDdbMbExcN2Wk2);
                } else {
                    ((ETviAcrtV5P5) n9RUKcU88NfGDdbMbExcN2Wk).V57tEvNfxZVVcOCAOih5PKr.put(strIKANjmyTSxO6v6UuLPdu7DxOjlS, n9RUKcU88NfGDdbMbExcN2Wk2);
                }
                if (z) {
                    arrayDeque.addLast(n9RUKcU88NfGDdbMbExcN2Wk);
                    n9RUKcU88NfGDdbMbExcN2Wk = n9RUKcU88NfGDdbMbExcN2Wk2;
                }
            } else {
                if (n9RUKcU88NfGDdbMbExcN2Wk instanceof N9RUKcU88NfGDdbMbExcN2Wk) {
                    gzdlhdn1ss.KUYypEB4eNWOZWVDpH();
                } else {
                    gzdlhdn1ss.q11o1hieEkZDhF1MGOZI26oZiDT();
                }
                if (arrayDeque.isEmpty()) {
                    return n9RUKcU88NfGDdbMbExcN2Wk;
                }
                n9RUKcU88NfGDdbMbExcN2Wk = (QeKKFV2Up7IkAXaln9fr) arrayDeque.removeLast();
            }
        }
    }
}
