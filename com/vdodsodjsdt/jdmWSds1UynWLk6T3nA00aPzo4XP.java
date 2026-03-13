package com.vdodsodjsdt;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class jdmWSds1UynWLk6T3nA00aPzo4XP {
    public static final sSTjsLE9Ugp7iXfnwi18Akn1Jt zzpBGItXfub0yWj = new sSTjsLE9Ugp7iXfnwi18Akn1Jt(0);
    public final /* synthetic */ okcUO69vEcgndIAn0R VxUQ9tBhpHJ2AAEDNW8sghc4m;

    public jdmWSds1UynWLk6T3nA00aPzo4XP(okcUO69vEcgndIAn0R okcuo69vecgndian0r) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = okcuo69vecgndian0r;
    }

    public static Class V57tEvNfxZVVcOCAOih5PKr(ClassLoader classLoader, String str) {
        try {
            return zzpBGItXfub0yWj(classLoader, str);
        } catch (ClassCastException e) {
            throw new Eyg9qHiQ9Ki1REKbbd3J(u9SlVAuoWhQUfJ.M9e7PWhFYLD2lOGMker("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new Eyg9qHiQ9Ki1REKbbd3J(u9SlVAuoWhQUfJ.M9e7PWhFYLD2lOGMker("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public static Class zzpBGItXfub0yWj(ClassLoader classLoader, String str) throws ClassNotFoundException {
        sSTjsLE9Ugp7iXfnwi18Akn1Jt sstjsle9ugp7ixfnwi18akn1jt = zzpBGItXfub0yWj;
        sSTjsLE9Ugp7iXfnwi18Akn1Jt sstjsle9ugp7ixfnwi18akn1jt2 = (sSTjsLE9Ugp7iXfnwi18Akn1Jt) sstjsle9ugp7ixfnwi18akn1jt.get(classLoader);
        if (sstjsle9ugp7ixfnwi18akn1jt2 == null) {
            sstjsle9ugp7ixfnwi18akn1jt2 = new sSTjsLE9Ugp7iXfnwi18Akn1Jt(0);
            sstjsle9ugp7ixfnwi18akn1jt.put(classLoader, sstjsle9ugp7ixfnwi18akn1jt2);
        }
        Class cls = (Class) sstjsle9ugp7ixfnwi18akn1jt2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        sstjsle9ugp7ixfnwi18akn1jt2.put(str, cls2);
        return cls2;
    }

    public final dip85SLOWSmNG3 VxUQ9tBhpHJ2AAEDNW8sghc4m(String str) {
        try {
            return (dip85SLOWSmNG3) V57tEvNfxZVVcOCAOih5PKr(this.VxUQ9tBhpHJ2AAEDNW8sghc4m.f6ZQsR6bPLvvCDNXOUc.q1wNbhk2O6.getClassLoader(), str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e) {
            throw new Eyg9qHiQ9Ki1REKbbd3J(u9SlVAuoWhQUfJ.M9e7PWhFYLD2lOGMker("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new Eyg9qHiQ9Ki1REKbbd3J(u9SlVAuoWhQUfJ.M9e7PWhFYLD2lOGMker("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new Eyg9qHiQ9Ki1REKbbd3J(u9SlVAuoWhQUfJ.M9e7PWhFYLD2lOGMker("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new Eyg9qHiQ9Ki1REKbbd3J(u9SlVAuoWhQUfJ.M9e7PWhFYLD2lOGMker("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
