package com.vdodsodjsdt;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class aHSmfN78YYNLQV extends sGipz63rTUmSj3uFDvOtzihao {
    public final Method HzCpKshMOoaw76hFcbOVRYMeRd;
    public final Method M9e7PWhFYLD2lOGMker;
    public final Method NSjgqmGjEzuugn2SsG1mZFP = Class.class.getMethod("isRecord", null);
    public final Method GI83zq0G8e7zkn = Class.class.getMethod("getRecordComponents", null);

    public aHSmfN78YYNLQV() throws ClassNotFoundException {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.M9e7PWhFYLD2lOGMker = cls.getMethod("getName", null);
        this.HzCpKshMOoaw76hFcbOVRYMeRd = cls.getMethod("getType", null);
    }

    @Override // com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao
    public final String[] TaDO7ogis3aEiWEtq(Class cls) {
        try {
            Object[] objArr = (Object[]) this.GI83zq0G8e7zkn.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.M9e7PWhFYLD2lOGMker.invoke(objArr[i], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao
    public final Constructor f6ZQsR6bPLvvCDNXOUc(Class cls) {
        try {
            Object[] objArr = (Object[]) this.GI83zq0G8e7zkn.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.HzCpKshMOoaw76hFcbOVRYMeRd.invoke(objArr[i], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao
    public final Method jW7EiD0YL6xkbB158jMUzhWNWb1y(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao
    public final boolean pzqP2AqKW6J5PO8zCKnW(Class cls) {
        try {
            return ((Boolean) this.NSjgqmGjEzuugn2SsG1mZFP.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.13.2). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }
}
