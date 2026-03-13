package com.vdodsodjsdt;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class edd5zstTubH8iMBFiWUSaji extends r6cr5KsgZxiucn0gAS3HtPF16ZAvL {
    @Override // com.vdodsodjsdt.r6cr5KsgZxiucn0gAS3HtPF16ZAvL
    public final Method BDoqAMf0rlMRAnVghjC4qjG(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // com.vdodsodjsdt.r6cr5KsgZxiucn0gAS3HtPF16ZAvL
    public final Typeface tpEo0fy9FaoJYrSFHRfIK6(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.TaDO7ogis3aEiWEtq.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
