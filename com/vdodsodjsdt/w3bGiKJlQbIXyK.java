package com.vdodsodjsdt;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class w3bGiKJlQbIXyK implements Ke30hT4A8wvbzFUrXgs4BPCTK41Rp {
    @Override // com.vdodsodjsdt.Ke30hT4A8wvbzFUrXgs4BPCTK41Rp
    public final eAZzwKf05brkM VxUQ9tBhpHJ2AAEDNW8sghc4m(Tt3445ZYXN tt3445ZYXN, q898WQEbycPNMnuoo6 q898wqebycpnmnuoo6) {
        Type type = q898wqebycpnmnuoo6.zzpBGItXfub0yWj;
        boolean z = type instanceof GenericArrayType;
        if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
            return null;
        }
        Type genericComponentType = z ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
        return new NYhMl6JOyeKyeGKL3RvrIEBlMmN4X(tt3445ZYXN, tt3445ZYXN.V57tEvNfxZVVcOCAOih5PKr(new q898WQEbycPNMnuoo6(genericComponentType)), hRrPPME7ytOB7ba.q1wNbhk2O6(genericComponentType));
    }
}
