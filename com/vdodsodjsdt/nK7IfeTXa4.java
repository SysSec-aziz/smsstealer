package com.vdodsodjsdt;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class nK7IfeTXa4 {
    public Object V57tEvNfxZVVcOCAOih5PKr;
    public boolean VxUQ9tBhpHJ2AAEDNW8sghc4m = true;
    public Serializable ZfQNn8hdWlEQ5cR94249PDsLR;
    public boolean zzpBGItXfub0yWj;

    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Serializable, java.lang.String[]] */
    public void LaeGQIruHQu81hfJldjMOQSVblH3x(String... strArr) {
        ej6unYlOWMDF.pYmKDYlAmhudp(strArr, "tlsVersions");
        if (!this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(objArrCopyOf, "copyOf(...)");
        this.ZfQNn8hdWlEQ5cR94249PDsLR = (String[]) objArrCopyOf;
    }

    public void V57tEvNfxZVVcOCAOih5PKr(String... strArr) {
        ej6unYlOWMDF.pYmKDYlAmhudp(strArr, "cipherSuites");
        if (!this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (strArr.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(objArrCopyOf, "copyOf(...)");
        this.V57tEvNfxZVVcOCAOih5PKr = (String[]) objArrCopyOf;
    }

    public aloYcuoPLQwNUIx6IjuQPANqqGRoM VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return new aloYcuoPLQwNUIx6IjuQPANqqGRoM(this.VxUQ9tBhpHJ2AAEDNW8sghc4m, this.zzpBGItXfub0yWj, (String[]) this.V57tEvNfxZVVcOCAOih5PKr, (String[]) this.ZfQNn8hdWlEQ5cR94249PDsLR);
    }

    public void ZfQNn8hdWlEQ5cR94249PDsLR(V04OhIg9zB... v04OhIg9zBArr) {
        if (!this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(v04OhIg9zBArr.length);
        for (V04OhIg9zB v04OhIg9zB : v04OhIg9zBArr) {
            arrayList.add(v04OhIg9zB.V57tEvNfxZVVcOCAOih5PKr);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        LaeGQIruHQu81hfJldjMOQSVblH3x((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void zzpBGItXfub0yWj(E246m2jcOzL76dqF... e246m2jcOzL76dqFArr) {
        ej6unYlOWMDF.pYmKDYlAmhudp(e246m2jcOzL76dqFArr, "cipherSuites");
        if (!this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(e246m2jcOzL76dqFArr.length);
        for (E246m2jcOzL76dqF e246m2jcOzL76dqF : e246m2jcOzL76dqFArr) {
            arrayList.add(e246m2jcOzL76dqF.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        V57tEvNfxZVVcOCAOih5PKr((String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
