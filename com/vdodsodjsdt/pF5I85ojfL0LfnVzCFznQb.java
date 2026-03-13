package com.vdodsodjsdt;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class pF5I85ojfL0LfnVzCFznQb implements ParameterizedType, Serializable {
    public final Type[] LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final Type V57tEvNfxZVVcOCAOih5PKr;
    public final Type ZfQNn8hdWlEQ5cR94249PDsLR;

    public pF5I85ojfL0LfnVzCFznQb(Type type, Class cls, Type... typeArr) {
        Objects.requireNonNull(cls);
        if (type == null && !Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
            throw new IllegalArgumentException("Must specify owner type for " + cls);
        }
        this.V57tEvNfxZVVcOCAOih5PKr = type == null ? null : hRrPPME7ytOB7ba.ZfQNn8hdWlEQ5cR94249PDsLR(type);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = hRrPPME7ytOB7ba.ZfQNn8hdWlEQ5cR94249PDsLR(cls);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            Objects.requireNonNull(this.LaeGQIruHQu81hfJldjMOQSVblH3x[i]);
            hRrPPME7ytOB7ba.LaeGQIruHQu81hfJldjMOQSVblH3x(this.LaeGQIruHQu81hfJldjMOQSVblH3x[i]);
            Type[] typeArr3 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            typeArr3[i] = hRrPPME7ytOB7ba.ZfQNn8hdWlEQ5cR94249PDsLR(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && hRrPPME7ytOB7ba.GI83zq0G8e7zkn(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.LaeGQIruHQu81hfJldjMOQSVblH3x.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.V57tEvNfxZVVcOCAOih5PKr;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.LaeGQIruHQu81hfJldjMOQSVblH3x) ^ this.ZfQNn8hdWlEQ5cR94249PDsLR.hashCode();
        Type type = this.V57tEvNfxZVVcOCAOih5PKr;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        int length = typeArr.length;
        Type type = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (length == 0) {
            return hRrPPME7ytOB7ba.y1NaPKTl7R18DOr6e8i5(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(hRrPPME7ytOB7ba.y1NaPKTl7R18DOr6e8i5(type));
        sb.append("<");
        sb.append(hRrPPME7ytOB7ba.y1NaPKTl7R18DOr6e8i5(typeArr[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(hRrPPME7ytOB7ba.y1NaPKTl7R18DOr6e8i5(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
