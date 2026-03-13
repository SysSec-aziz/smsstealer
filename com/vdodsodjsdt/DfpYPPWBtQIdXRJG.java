package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class DfpYPPWBtQIdXRJG extends F44whnLsbQ {
    public static final Class HzCpKshMOoaw76hFcbOVRYMeRd;
    public static final Constructor KUYypEB4eNWOZWVDpH;
    public static final Method p59rPv72J9;
    public static final Method q1wNbhk2O6;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        KUYypEB4eNWOZWVDpH = constructor;
        HzCpKshMOoaw76hFcbOVRYMeRd = cls;
        q1wNbhk2O6 = method2;
        p59rPv72J9 = method;
    }

    public static Typeface HAPpjhiCsV9ONY23505HCBI9IX(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) HzCpKshMOoaw76hFcbOVRYMeRd, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) p59rPv72J9.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public static boolean wR7sbzHKf9hYV1lxoS6nqyszepWvN(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) q1wNbhk2O6.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // com.vdodsodjsdt.F44whnLsbQ
    public final Typeface HzCpKshMOoaw76hFcbOVRYMeRd(Context context, j5O1PfCuTxZKdtuvF7[] j5o1pfcutxzkdtuvf7Arr, int i) {
        Object objNewInstance;
        try {
            objNewInstance = KUYypEB4eNWOZWVDpH.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            int i2 = 0;
            sSTjsLE9Ugp7iXfnwi18Akn1Jt sstjsle9ugp7ixfnwi18akn1jt = new sSTjsLE9Ugp7iXfnwi18Akn1Jt(0);
            int length = j5o1pfcutxzkdtuvf7Arr.length;
            while (true) {
                if (i2 < length) {
                    j5O1PfCuTxZKdtuvF7 j5o1pfcutxzkdtuvf7 = j5o1pfcutxzkdtuvf7Arr[i2];
                    Uri uri = j5o1pfcutxzkdtuvf7.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    ByteBuffer byteBufferPzqP2AqKW6J5PO8zCKnW = (ByteBuffer) sstjsle9ugp7ixfnwi18akn1jt.get(uri);
                    if (byteBufferPzqP2AqKW6J5PO8zCKnW == null) {
                        byteBufferPzqP2AqKW6J5PO8zCKnW = FLWIoSaHb1q8TqFvEBgPyRGrzvi6.pzqP2AqKW6J5PO8zCKnW(context, uri);
                        sstjsle9ugp7ixfnwi18akn1jt.put(uri, byteBufferPzqP2AqKW6J5PO8zCKnW);
                    }
                    if (byteBufferPzqP2AqKW6J5PO8zCKnW == null || !wR7sbzHKf9hYV1lxoS6nqyszepWvN(objNewInstance, byteBufferPzqP2AqKW6J5PO8zCKnW, j5o1pfcutxzkdtuvf7.zzpBGItXfub0yWj, j5o1pfcutxzkdtuvf7.V57tEvNfxZVVcOCAOih5PKr, j5o1pfcutxzkdtuvf7.ZfQNn8hdWlEQ5cR94249PDsLR)) {
                        break;
                    }
                    i2++;
                } else {
                    Typeface typefaceHAPpjhiCsV9ONY23505HCBI9IX = HAPpjhiCsV9ONY23505HCBI9IX(objNewInstance);
                    if (typefaceHAPpjhiCsV9ONY23505HCBI9IX != null) {
                        return Typeface.create(typefaceHAPpjhiCsV9ONY23505HCBI9IX, i);
                    }
                }
            }
        }
        return null;
    }

    @Override // com.vdodsodjsdt.F44whnLsbQ
    public final Typeface M9e7PWhFYLD2lOGMker(Context context, NEoz7FxOyLX3r49rfTBZNOYjpdY5x nEoz7FxOyLX3r49rfTBZNOYjpdY5x, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        MappedByteBuffer map;
        try {
            objNewInstance = KUYypEB4eNWOZWVDpH.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            for (lg8An0fK4MQzMPmeENxB1c lg8an0fk4mqzmpmeenxb1c : nEoz7FxOyLX3r49rfTBZNOYjpdY5x.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
                int i2 = lg8an0fk4mqzmpmeenxb1c.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                File fileSuB3hEmTmbbRGAhtvOOmfKEon = FLWIoSaHb1q8TqFvEBgPyRGrzvi6.SuB3hEmTmbbRGAhtvOOmfKEon(context);
                if (fileSuB3hEmTmbbRGAhtvOOmfKEon != null) {
                    try {
                        if (FLWIoSaHb1q8TqFvEBgPyRGrzvi6.p59rPv72J9(fileSuB3hEmTmbbRGAhtvOOmfKEon, resources, i2)) {
                            try {
                                FileInputStream fileInputStream = new FileInputStream(fileSuB3hEmTmbbRGAhtvOOmfKEon);
                                try {
                                    FileChannel channel = fileInputStream.getChannel();
                                    map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                    fileInputStream.close();
                                } finally {
                                }
                            } catch (IOException unused2) {
                                map = null;
                            }
                            if (map != null && wR7sbzHKf9hYV1lxoS6nqyszepWvN(objNewInstance, map, lg8an0fk4mqzmpmeenxb1c.LaeGQIruHQu81hfJldjMOQSVblH3x, lg8an0fk4mqzmpmeenxb1c.zzpBGItXfub0yWj, lg8an0fk4mqzmpmeenxb1c.V57tEvNfxZVVcOCAOih5PKr)) {
                            }
                        }
                    } finally {
                        fileSuB3hEmTmbbRGAhtvOOmfKEon.delete();
                    }
                }
                map = null;
                if (map != null) {
                }
            }
            return HAPpjhiCsV9ONY23505HCBI9IX(objNewInstance);
        }
        return null;
    }
}
