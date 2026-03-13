package com.vdodsodjsdt;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class q898WQEbycPNMnuoo6<T> {
    public final int V57tEvNfxZVVcOCAOih5PKr;
    public final Class VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final Type zzpBGItXfub0yWj;

    public q898WQEbycPNMnuoo6() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == q898WQEbycPNMnuoo6.class) {
                Type typeZfQNn8hdWlEQ5cR94249PDsLR = hRrPPME7ytOB7ba.ZfQNn8hdWlEQ5cR94249PDsLR(parameterizedType.getActualTypeArguments()[0]);
                if (!Objects.equals(System.getProperty("gson.allowCapturingTypeVariables"), "true")) {
                    VxUQ9tBhpHJ2AAEDNW8sghc4m(typeZfQNn8hdWlEQ5cR94249PDsLR);
                }
                this.zzpBGItXfub0yWj = typeZfQNn8hdWlEQ5cR94249PDsLR;
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m = hRrPPME7ytOB7ba.q1wNbhk2O6(typeZfQNn8hdWlEQ5cR94249PDsLR);
                this.V57tEvNfxZVVcOCAOih5PKr = typeZfQNn8hdWlEQ5cR94249PDsLR.hashCode();
                return;
            }
        } else if (genericSuperclass == q898WQEbycPNMnuoo6.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("type-token-raw"));
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public static void VxUQ9tBhpHJ2AAEDNW8sghc4m(Type type) {
        if (type instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type;
            throw new IllegalArgumentException("TypeToken type argument must not contain a type variable; captured type variable " + typeVariable.getName() + " declared by " + typeVariable.getGenericDeclaration() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("typetoken-type-variable"));
        }
        if (type instanceof GenericArrayType) {
            VxUQ9tBhpHJ2AAEDNW8sghc4m(((GenericArrayType) type).getGenericComponentType());
            return;
        }
        int i = 0;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType != null) {
                VxUQ9tBhpHJ2AAEDNW8sghc4m(ownerType);
            }
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length = actualTypeArguments.length;
            while (i < length) {
                VxUQ9tBhpHJ2AAEDNW8sghc4m(actualTypeArguments[i]);
                i++;
            }
            return;
        }
        if (!(type instanceof WildcardType)) {
            if (type == null) {
                throw new IllegalArgumentException("TypeToken captured `null` as type argument; probably a compiler / runtime bug");
            }
            return;
        }
        WildcardType wildcardType = (WildcardType) type;
        for (Type type2 : wildcardType.getLowerBounds()) {
            VxUQ9tBhpHJ2AAEDNW8sghc4m(type2);
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        int length2 = upperBounds.length;
        while (i < length2) {
            VxUQ9tBhpHJ2AAEDNW8sghc4m(upperBounds[i]);
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q898WQEbycPNMnuoo6) {
            return hRrPPME7ytOB7ba.GI83zq0G8e7zkn(this.zzpBGItXfub0yWj, ((q898WQEbycPNMnuoo6) obj).zzpBGItXfub0yWj);
        }
        return false;
    }

    public final int hashCode() {
        return this.V57tEvNfxZVVcOCAOih5PKr;
    }

    public final String toString() {
        return hRrPPME7ytOB7ba.y1NaPKTl7R18DOr6e8i5(this.zzpBGItXfub0yWj);
    }

    public q898WQEbycPNMnuoo6(Type type) {
        Objects.requireNonNull(type);
        Type typeZfQNn8hdWlEQ5cR94249PDsLR = hRrPPME7ytOB7ba.ZfQNn8hdWlEQ5cR94249PDsLR(type);
        this.zzpBGItXfub0yWj = typeZfQNn8hdWlEQ5cR94249PDsLR;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = hRrPPME7ytOB7ba.q1wNbhk2O6(typeZfQNn8hdWlEQ5cR94249PDsLR);
        this.V57tEvNfxZVVcOCAOih5PKr = typeZfQNn8hdWlEQ5cR94249PDsLR.hashCode();
    }
}
