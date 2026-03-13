package com.vdodsodjsdt;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c2NCuhRgMI2BFzsocC implements IvfXhmjM3e3K, fqQIeYf1n7m, Serializable {
    public final IvfXhmjM3e3K V57tEvNfxZVVcOCAOih5PKr;

    public c2NCuhRgMI2BFzsocC(IvfXhmjM3e3K ivfXhmjM3e3K) {
        this.V57tEvNfxZVVcOCAOih5PKr = ivfXhmjM3e3K;
    }

    public StackTraceElement HzCpKshMOoaw76hFcbOVRYMeRd() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        SYArNbm8ysyWH0ROoGWFj88V0t sYArNbm8ysyWH0ROoGWFj88V0t = (SYArNbm8ysyWH0ROoGWFj88V0t) getClass().getAnnotation(SYArNbm8ysyWH0ROoGWFj88V0t.class);
        String str = null;
        if (sYArNbm8ysyWH0ROoGWFj88V0t == null || sYArNbm8ysyWH0ROoGWFj88V0t.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? sYArNbm8ysyWH0ROoGWFj88V0t.l()[iIntValue] : -1;
        NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcM = KfeOQNOupsCg6878zi4e.LaeGQIruHQu81hfJldjMOQSVblH3x;
        NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcM2 = KfeOQNOupsCg6878zi4e.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (nrjuzzioPqfttNRptBDpZDzSYUrcM2 == null) {
            try {
                NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcM3 = new NrjuzzioPqfttNRptBDpZDzSYUrcM(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 10);
                KfeOQNOupsCg6878zi4e.zIvmSL0wzmmKGc3X39b2Gw2mUGE = nrjuzzioPqfttNRptBDpZDzSYUrcM3;
                nrjuzzioPqfttNRptBDpZDzSYUrcM2 = nrjuzzioPqfttNRptBDpZDzSYUrcM3;
            } catch (Exception unused2) {
                KfeOQNOupsCg6878zi4e.zIvmSL0wzmmKGc3X39b2Gw2mUGE = nrjuzzioPqfttNRptBDpZDzSYUrcM;
                nrjuzzioPqfttNRptBDpZDzSYUrcM2 = nrjuzzioPqfttNRptBDpZDzSYUrcM;
            }
        }
        if (nrjuzzioPqfttNRptBDpZDzSYUrcM2 != nrjuzzioPqfttNRptBDpZDzSYUrcM && (method = (Method) nrjuzzioPqfttNRptBDpZDzSYUrcM2.zzpBGItXfub0yWj) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) nrjuzzioPqfttNRptBDpZDzSYUrcM2.V57tEvNfxZVVcOCAOih5PKr) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) nrjuzzioPqfttNRptBDpZDzSYUrcM2.ZfQNn8hdWlEQ5cR94249PDsLR;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = sYArNbm8ysyWH0ROoGWFj88V0t.c();
        } else {
            strC = str + '/' + sYArNbm8ysyWH0ROoGWFj88V0t.c();
        }
        return new StackTraceElement(strC, sYArNbm8ysyWH0ROoGWFj88V0t.m(), sYArNbm8ysyWH0ROoGWFj88V0t.f(), i);
    }

    public abstract Object KUYypEB4eNWOZWVDpH(Object obj);

    public IvfXhmjM3e3K M9e7PWhFYLD2lOGMker(IvfXhmjM3e3K ivfXhmjM3e3K, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    @Override // com.vdodsodjsdt.IvfXhmjM3e3K
    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ(Object obj) {
        IvfXhmjM3e3K ivfXhmjM3e3K = this;
        while (true) {
            c2NCuhRgMI2BFzsocC c2ncuhrgmi2bfzsocc = (c2NCuhRgMI2BFzsocC) ivfXhmjM3e3K;
            IvfXhmjM3e3K ivfXhmjM3e3K2 = c2ncuhrgmi2bfzsocc.V57tEvNfxZVVcOCAOih5PKr;
            ej6unYlOWMDF.p59rPv72J9(ivfXhmjM3e3K2);
            try {
                obj = c2ncuhrgmi2bfzsocc.KUYypEB4eNWOZWVDpH(obj);
                if (obj == w0JnONr1KwCkZY9pA0QjUDuh9aMcU.V57tEvNfxZVVcOCAOih5PKr) {
                    return;
                }
            } catch (Throwable th) {
                obj = ej6unYlOWMDF.vBGA6pPLqSMuYGvprl270j7(th);
            }
            c2ncuhrgmi2bfzsocc.Ca81ebIan1u();
            if (!(ivfXhmjM3e3K2 instanceof c2NCuhRgMI2BFzsocC)) {
                ivfXhmjM3e3K2.ZLZeBXTMq0zDztBxtRTuCHrapQ(obj);
                return;
            }
            ivfXhmjM3e3K = ivfXhmjM3e3K2;
        }
    }

    @Override // com.vdodsodjsdt.fqQIeYf1n7m
    public fqQIeYf1n7m ZfQNn8hdWlEQ5cR94249PDsLR() {
        IvfXhmjM3e3K ivfXhmjM3e3K = this.V57tEvNfxZVVcOCAOih5PKr;
        if (ivfXhmjM3e3K instanceof fqQIeYf1n7m) {
            return (fqQIeYf1n7m) ivfXhmjM3e3K;
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object objHzCpKshMOoaw76hFcbOVRYMeRd = HzCpKshMOoaw76hFcbOVRYMeRd();
        if (objHzCpKshMOoaw76hFcbOVRYMeRd == null) {
            objHzCpKshMOoaw76hFcbOVRYMeRd = getClass().getName();
        }
        sb.append(objHzCpKshMOoaw76hFcbOVRYMeRd);
        return sb.toString();
    }

    public void Ca81ebIan1u() {
    }
}
