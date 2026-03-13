package com.vdodsodjsdt;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class i8O1bEx5KirDRJHaM implements XhOTOb5WElknWhz7qZHtdk, PAV4EgyY4zt6 {
    public static final /* synthetic */ int zzpBGItXfub0yWj = 0;
    public final Class VxUQ9tBhpHJ2AAEDNW8sghc4m;

    static {
        List listRE05n5RsRkyWKIeA9cmLXAKv4Hze = vmp19D2MODlOL.rE05n5RsRkyWKIeA9cmLXAKv4Hze(new Class[]{EfIvTei3Q8wBNpyLTZJevpFxej.class, vP57smEEh3YGCxzJ.class, MGk7KfXeUv8YAfWiUw5LfOd.class, l9lNb4EFvaVMyQnsu.class, ms7wepD1jVm6vK0NgycK.class, dnqISl3sQEucvKrFQtZwETYj4.class, lPhFiWhhniyVPQCBvT.class, k4zJCGmfSjniVHqTFxNt.class, GeynfBbhiYnmbCEOk1AdsJgOo0CM.class, ALNgcezWPPEZnM.class, tnWuEafPPQ7aS7ruTDH78p2csnhH.class, A5oj1eQApM4DJxu.class, cTTcmLuDWSQHtAGFs7Wa7Grb268J.class, KCb1rWgQu4LL5kch6uJ.class, T8UaPJNlA5VGAIHfoSkQD1XERnSK.class, aQd6qVRYUiAEspbrLVmv.class, PRo49G6A3BDG9eLgVjcrNeQv.class, T61eD6j8DX14PkhJIqxgbwR.class, h73phBDEqc4c8te6K0S.class, CbTTh5TP1kcz.class, Wq4FBH1xkUVfIFgkGheEWSYR.class, zGVWbnKnUXjyS4uUvBou5QyJ16tsQ.class, yA4KgL71yIkYJst.class});
        ArrayList arrayList = new ArrayList(M5nvSQFWCkc.bjhcQ0u7VT2OYYrwk96HrWoN(listRE05n5RsRkyWKIeA9cmLXAKv4Hze));
        int i = 0;
        for (Object obj : listRE05n5RsRkyWKIeA9cmLXAKv4Hze) {
            int i2 = i + 1;
            if (i < 0) {
                kzhIjSJtHYuLoiUgKqSRIck3W8.Z1FjjMJ0suz8AFI7gsA4GDLMXv();
                throw null;
            }
            arrayList.add(new FgeGQUnjhbxnrwqkj((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        QtxmZgsffC8rBsc8wSUkFg2a.CixTK5ZX8oWXHz34qHYV(arrayList);
    }

    public i8O1bEx5KirDRJHaM(Class cls) {
        ej6unYlOWMDF.pYmKDYlAmhudp(cls, "jClass");
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = cls;
    }

    @Override // com.vdodsodjsdt.PAV4EgyY4zt6
    public final Class VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof i8O1bEx5KirDRJHaM) && ej6unYlOWMDF.qNPQb1obP7(this).equals(ej6unYlOWMDF.qNPQb1obP7((XhOTOb5WElknWhz7qZHtdk) obj));
    }

    public final int hashCode() {
        return ej6unYlOWMDF.qNPQb1obP7(this).hashCode();
    }

    public final String toString() {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.toString() + " (Kotlin reflection is not available)";
    }

    public final String zzpBGItXfub0yWj() {
        String strQygqjTppWwx992;
        Class cls = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        ej6unYlOWMDF.pYmKDYlAmhudp(cls, "jClass");
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strQygqjTppWwx9922 = FLWIoSaHb1q8TqFvEBgPyRGrzvi6.qygqjTppWwx992(cls.getName());
                return strQygqjTppWwx9922 == null ? cls.getSimpleName() : strQygqjTppWwx9922;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strQygqjTppWwx992 = FLWIoSaHb1q8TqFvEBgPyRGrzvi6.qygqjTppWwx992(componentType.getName())) != null) {
                strConcat = strQygqjTppWwx992.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return cwhrCnoVJBjJE2CBEAvBopmgF.SdPSMGy13dYOH9CwolJVKu21val(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor != null) {
            return cwhrCnoVJBjJE2CBEAvBopmgF.SdPSMGy13dYOH9CwolJVKu21val(simpleName, enclosingConstructor.getName() + '$');
        }
        int iPf1HsU8AK92buCoUaexm5AC = cwhrCnoVJBjJE2CBEAvBopmgF.Pf1HsU8AK92buCoUaexm5AC(simpleName, '$', 0, 6);
        if (iPf1HsU8AK92buCoUaexm5AC == -1) {
            return simpleName;
        }
        String strSubstring = simpleName.substring(iPf1HsU8AK92buCoUaexm5AC + 1, simpleName.length());
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strSubstring, "substring(...)");
        return strSubstring;
    }
}
