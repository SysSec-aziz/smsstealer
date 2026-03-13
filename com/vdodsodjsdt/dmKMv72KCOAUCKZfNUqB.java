package com.vdodsodjsdt;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class dmKMv72KCOAUCKZfNUqB extends ddmzHva1iv7LVcI8RRfsdy502 {
    public static final HashMap LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final Object[] V57tEvNfxZVVcOCAOih5PKr;
    public final HashMap ZfQNn8hdWlEQ5cR94249PDsLR;
    public final Constructor zzpBGItXfub0yWj;

    static {
        HashMap map = new HashMap();
        map.put(Byte.TYPE, (byte) 0);
        map.put(Short.TYPE, (short) 0);
        map.put(Integer.TYPE, 0);
        map.put(Long.TYPE, 0L);
        map.put(Float.TYPE, Float.valueOf(0.0f));
        map.put(Double.TYPE, Double.valueOf(0.0d));
        map.put(Character.TYPE, (char) 0);
        map.put(Boolean.TYPE, Boolean.FALSE);
        LaeGQIruHQu81hfJldjMOQSVblH3x = map;
    }

    public dmKMv72KCOAUCKZfNUqB(Class cls, RLNy5s6htks8FE7 rLNy5s6htks8FE7) {
        super(rLNy5s6htks8FE7);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new HashMap();
        sGipz63rTUmSj3uFDvOtzihao sgipz63rtumsj3ufdvotzihao = vFOm9GRo9HOyt53449EwgsRLOaA1Y.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        Constructor constructorF6ZQsR6bPLvvCDNXOUc = sgipz63rtumsj3ufdvotzihao.f6ZQsR6bPLvvCDNXOUc(cls);
        this.zzpBGItXfub0yWj = constructorF6ZQsR6bPLvvCDNXOUc;
        vFOm9GRo9HOyt53449EwgsRLOaA1Y.zIvmSL0wzmmKGc3X39b2Gw2mUGE(constructorF6ZQsR6bPLvvCDNXOUc);
        String[] strArrTaDO7ogis3aEiWEtq = sgipz63rtumsj3ufdvotzihao.TaDO7ogis3aEiWEtq(cls);
        for (int i = 0; i < strArrTaDO7ogis3aEiWEtq.length; i++) {
            this.ZfQNn8hdWlEQ5cR94249PDsLR.put(strArrTaDO7ogis3aEiWEtq[i], Integer.valueOf(i));
        }
        Class<?>[] parameterTypes = this.zzpBGItXfub0yWj.getParameterTypes();
        this.V57tEvNfxZVVcOCAOih5PKr = new Object[parameterTypes.length];
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            this.V57tEvNfxZVVcOCAOih5PKr[i2] = LaeGQIruHQu81hfJldjMOQSVblH3x.get(parameterTypes[i2]);
        }
    }

    @Override // com.vdodsodjsdt.ddmzHva1iv7LVcI8RRfsdy502
    public final Object LaeGQIruHQu81hfJldjMOQSVblH3x(Object obj) {
        Object[] objArr = (Object[]) obj;
        Constructor constructor = this.zzpBGItXfub0yWj;
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException e) {
            sGipz63rTUmSj3uFDvOtzihao sgipz63rtumsj3ufdvotzihao = vFOm9GRo9HOyt53449EwgsRLOaA1Y.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new RuntimeException("Failed to invoke constructor '" + vFOm9GRo9HOyt53449EwgsRLOaA1Y.zzpBGItXfub0yWj(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InstantiationException e3) {
            e = e3;
            throw new RuntimeException("Failed to invoke constructor '" + vFOm9GRo9HOyt53449EwgsRLOaA1Y.zzpBGItXfub0yWj(constructor) + "' with args " + Arrays.toString(objArr), e);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException("Failed to invoke constructor '" + vFOm9GRo9HOyt53449EwgsRLOaA1Y.zzpBGItXfub0yWj(constructor) + "' with args " + Arrays.toString(objArr), e4.getCause());
        }
    }

    @Override // com.vdodsodjsdt.ddmzHva1iv7LVcI8RRfsdy502
    public final Object ZfQNn8hdWlEQ5cR94249PDsLR() {
        return (Object[]) this.V57tEvNfxZVVcOCAOih5PKr.clone();
    }

    @Override // com.vdodsodjsdt.ddmzHva1iv7LVcI8RRfsdy502
    public final void zIvmSL0wzmmKGc3X39b2Gw2mUGE(Object obj, Gzdlhdn1ss gzdlhdn1ss, tyZQa3HN4Bho91H tyzqa3hn4bho91h) {
        Object[] objArr = (Object[]) obj;
        String str = tyzqa3hn4bho91h.V57tEvNfxZVVcOCAOih5PKr;
        Integer num = (Integer) this.ZfQNn8hdWlEQ5cR94249PDsLR.get(str);
        if (num == null) {
            throw new IllegalStateException("Could not find the index in the constructor '" + vFOm9GRo9HOyt53449EwgsRLOaA1Y.zzpBGItXfub0yWj(this.zzpBGItXfub0yWj) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }
        int iIntValue = num.intValue();
        Object objZzpBGItXfub0yWj = tyzqa3hn4bho91h.zIvmSL0wzmmKGc3X39b2Gw2mUGE.zzpBGItXfub0yWj(gzdlhdn1ss);
        if (objZzpBGItXfub0yWj != null || !tyzqa3hn4bho91h.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            objArr[iIntValue] = objZzpBGItXfub0yWj;
        } else {
            StringBuilder sbKUYypEB4eNWOZWVDpH = u9SlVAuoWhQUfJ.KUYypEB4eNWOZWVDpH("null is not allowed as value for record component '", str, "' of primitive type; at path ");
            sbKUYypEB4eNWOZWVDpH.append(gzdlhdn1ss.SuB3hEmTmbbRGAhtvOOmfKEon(false));
            throw new Eyg9qHiQ9Ki1REKbbd3J(sbKUYypEB4eNWOZWVDpH.toString());
        }
    }
}
