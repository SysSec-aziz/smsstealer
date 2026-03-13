package com.vdodsodjsdt;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class h1BoqRrS8lfx3E1oK implements WildcardType, Serializable {
    public final Type V57tEvNfxZVVcOCAOih5PKr;
    public final Type ZfQNn8hdWlEQ5cR94249PDsLR;

    public h1BoqRrS8lfx3E1oK(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException("At most one lower bound is supported");
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException("Exactly one upper bound must be specified");
        }
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            hRrPPME7ytOB7ba.LaeGQIruHQu81hfJldjMOQSVblH3x(typeArr[0]);
            this.ZfQNn8hdWlEQ5cR94249PDsLR = null;
            this.V57tEvNfxZVVcOCAOih5PKr = hRrPPME7ytOB7ba.ZfQNn8hdWlEQ5cR94249PDsLR(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        hRrPPME7ytOB7ba.LaeGQIruHQu81hfJldjMOQSVblH3x(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException("When lower bound is specified, upper bound must be Object");
        }
        this.ZfQNn8hdWlEQ5cR94249PDsLR = hRrPPME7ytOB7ba.ZfQNn8hdWlEQ5cR94249PDsLR(typeArr2[0]);
        this.V57tEvNfxZVVcOCAOih5PKr = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && hRrPPME7ytOB7ba.GI83zq0G8e7zkn(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        return type != null ? new Type[]{type} : hRrPPME7ytOB7ba.NSjgqmGjEzuugn2SsG1mZFP;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.V57tEvNfxZVVcOCAOih5PKr};
    }

    public final int hashCode() {
        Type type = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.V57tEvNfxZVVcOCAOih5PKr.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (type != null) {
            return "? super " + hRrPPME7ytOB7ba.y1NaPKTl7R18DOr6e8i5(type);
        }
        Type type2 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + hRrPPME7ytOB7ba.y1NaPKTl7R18DOr6e8i5(type2);
    }
}
