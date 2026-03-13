package com.vdodsodjsdt;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class TBB88StmjQBzC implements GenericArrayType, Serializable {
    public final Type V57tEvNfxZVVcOCAOih5PKr;

    public TBB88StmjQBzC(Type type) {
        Objects.requireNonNull(type);
        this.V57tEvNfxZVVcOCAOih5PKr = hRrPPME7ytOB7ba.ZfQNn8hdWlEQ5cR94249PDsLR(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && hRrPPME7ytOB7ba.GI83zq0G8e7zkn(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.V57tEvNfxZVVcOCAOih5PKr;
    }

    public final int hashCode() {
        return this.V57tEvNfxZVVcOCAOih5PKr.hashCode();
    }

    public final String toString() {
        return hRrPPME7ytOB7ba.y1NaPKTl7R18DOr6e8i5(this.V57tEvNfxZVVcOCAOih5PKr) + "[]";
    }
}
