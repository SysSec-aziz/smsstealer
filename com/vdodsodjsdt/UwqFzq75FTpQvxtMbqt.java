package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class UwqFzq75FTpQvxtMbqt extends F44whnLsbQ {
    public static boolean Ca81ebIan1u = false;
    public static Class HzCpKshMOoaw76hFcbOVRYMeRd;
    public static Constructor KUYypEB4eNWOZWVDpH;
    public static Method p59rPv72J9;
    public static Method q1wNbhk2O6;

    public static void HAPpjhiCsV9ONY23505HCBI9IX() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (Ca81ebIan1u) {
            return;
        }
        Ca81ebIan1u = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        KUYypEB4eNWOZWVDpH = constructor;
        HzCpKshMOoaw76hFcbOVRYMeRd = cls;
        q1wNbhk2O6 = method2;
        p59rPv72J9 = method;
    }

    public static boolean wR7sbzHKf9hYV1lxoS6nqyszepWvN(Object obj, String str, int i, boolean z) throws NoSuchMethodException {
        HAPpjhiCsV9ONY23505HCBI9IX();
        try {
            return ((Boolean) q1wNbhk2O6.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.vdodsodjsdt.F44whnLsbQ
    public Typeface HzCpKshMOoaw76hFcbOVRYMeRd(Context context, j5O1PfCuTxZKdtuvF7[] j5o1pfcutxzkdtuvf7Arr, int i) {
        String str;
        if (j5o1pfcutxzkdtuvf7Arr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(jW7EiD0YL6xkbB158jMUzhWNWb1y(j5o1pfcutxzkdtuvf7Arr, i).VxUQ9tBhpHJ2AAEDNW8sghc4m, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                        } catch (ErrnoException unused) {
                        }
                        File file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                        if (file != null && file.canRead()) {
                            Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceCreateFromFile;
                        }
                        FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                        try {
                            Typeface typefaceQ1wNbhk2O6 = q1wNbhk2O6(context, fileInputStream);
                            fileInputStream.close();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceQ1wNbhk2O6;
                        } finally {
                        }
                    } finally {
                    }
                }
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return null;
                }
            } catch (IOException unused2) {
            }
        }
        return null;
    }

    @Override // com.vdodsodjsdt.F44whnLsbQ
    public Typeface M9e7PWhFYLD2lOGMker(Context context, NEoz7FxOyLX3r49rfTBZNOYjpdY5x nEoz7FxOyLX3r49rfTBZNOYjpdY5x, Resources resources, int i) throws NoSuchMethodException {
        HAPpjhiCsV9ONY23505HCBI9IX();
        try {
            Object objNewInstance = KUYypEB4eNWOZWVDpH.newInstance(null);
            for (lg8An0fK4MQzMPmeENxB1c lg8an0fk4mqzmpmeenxb1c : nEoz7FxOyLX3r49rfTBZNOYjpdY5x.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
                File fileSuB3hEmTmbbRGAhtvOOmfKEon = FLWIoSaHb1q8TqFvEBgPyRGrzvi6.SuB3hEmTmbbRGAhtvOOmfKEon(context);
                if (fileSuB3hEmTmbbRGAhtvOOmfKEon == null) {
                    return null;
                }
                try {
                    if (!FLWIoSaHb1q8TqFvEBgPyRGrzvi6.p59rPv72J9(fileSuB3hEmTmbbRGAhtvOOmfKEon, resources, lg8an0fk4mqzmpmeenxb1c.zIvmSL0wzmmKGc3X39b2Gw2mUGE)) {
                        return null;
                    }
                    if (!wR7sbzHKf9hYV1lxoS6nqyszepWvN(objNewInstance, fileSuB3hEmTmbbRGAhtvOOmfKEon.getPath(), lg8an0fk4mqzmpmeenxb1c.zzpBGItXfub0yWj, lg8an0fk4mqzmpmeenxb1c.V57tEvNfxZVVcOCAOih5PKr)) {
                        return null;
                    }
                    fileSuB3hEmTmbbRGAhtvOOmfKEon.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileSuB3hEmTmbbRGAhtvOOmfKEon.delete();
                }
            }
            HAPpjhiCsV9ONY23505HCBI9IX();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) HzCpKshMOoaw76hFcbOVRYMeRd, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) p59rPv72J9.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }
}
