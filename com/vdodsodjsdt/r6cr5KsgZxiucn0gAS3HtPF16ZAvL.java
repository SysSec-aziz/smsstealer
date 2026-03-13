package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class r6cr5KsgZxiucn0gAS3HtPF16ZAvL extends UwqFzq75FTpQvxtMbqt {
    public final Method TaDO7ogis3aEiWEtq;
    public final Method f6ZQsR6bPLvvCDNXOUc;
    public final Class h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public final Method jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public final Method ko09zE6UAgwkV;
    public final Constructor pYmKDYlAmhudp;
    public final Method vBGA6pPLqSMuYGvprl270j7;

    public r6cr5KsgZxiucn0gAS3HtPF16ZAvL() throws NoSuchMethodException {
        Method methodBDoqAMf0rlMRAnVghjC4qjG;
        Constructor<?> constructor;
        Method methodAFOcXGdvoTMuqwiG8tD;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodAFOcXGdvoTMuqwiG8tD = AFOcXGdvoTMuqwiG8tD(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodBDoqAMf0rlMRAnVghjC4qjG = BDoqAMf0rlMRAnVghjC4qjG(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e.getClass().getName()), e);
            methodBDoqAMf0rlMRAnVghjC4qjG = null;
            constructor = null;
            methodAFOcXGdvoTMuqwiG8tD = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = cls;
        this.pYmKDYlAmhudp = constructor;
        this.ko09zE6UAgwkV = methodAFOcXGdvoTMuqwiG8tD;
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = method;
        this.f6ZQsR6bPLvvCDNXOUc = method2;
        this.vBGA6pPLqSMuYGvprl270j7 = method3;
        this.TaDO7ogis3aEiWEtq = methodBDoqAMf0rlMRAnVghjC4qjG;
    }

    public static Method AFOcXGdvoTMuqwiG8tD(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public Method BDoqAMf0rlMRAnVghjC4qjG(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public final boolean ByTQIhgl7ezGvHXEd(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.ko09zE6UAgwkV.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // com.vdodsodjsdt.UwqFzq75FTpQvxtMbqt, com.vdodsodjsdt.F44whnLsbQ
    public final Typeface HzCpKshMOoaw76hFcbOVRYMeRd(Context context, j5O1PfCuTxZKdtuvF7[] j5o1pfcutxzkdtuvf7Arr, int i) throws IOException {
        Object objNewInstance;
        Typeface typefaceTpEo0fy9FaoJYrSFHRfIK6;
        boolean zBooleanValue;
        if (j5o1pfcutxzkdtuvf7Arr.length >= 1) {
            Method method = this.ko09zE6UAgwkV;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            try {
                if (method != null) {
                    HashMap map = new HashMap();
                    for (j5O1PfCuTxZKdtuvF7 j5o1pfcutxzkdtuvf7 : j5o1pfcutxzkdtuvf7Arr) {
                        if (j5o1pfcutxzkdtuvf7.zIvmSL0wzmmKGc3X39b2Gw2mUGE == 0) {
                            Uri uri = j5o1pfcutxzkdtuvf7.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                            if (!map.containsKey(uri)) {
                                map.put(uri, FLWIoSaHb1q8TqFvEBgPyRGrzvi6.pzqP2AqKW6J5PO8zCKnW(context, uri));
                            }
                        }
                    }
                    Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                    try {
                        objNewInstance = this.pYmKDYlAmhudp.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        objNewInstance = null;
                    }
                    if (objNewInstance != null) {
                        int length = j5o1pfcutxzkdtuvf7Arr.length;
                        int i2 = 0;
                        boolean z = false;
                        while (true) {
                            Method method2 = this.vBGA6pPLqSMuYGvprl270j7;
                            if (i2 < length) {
                                j5O1PfCuTxZKdtuvF7 j5o1pfcutxzkdtuvf72 = j5o1pfcutxzkdtuvf7Arr[i2];
                                ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(j5o1pfcutxzkdtuvf72.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                                if (byteBuffer != null) {
                                    try {
                                        zBooleanValue = ((Boolean) this.jW7EiD0YL6xkbB158jMUzhWNWb1y.invoke(objNewInstance, byteBuffer, Integer.valueOf(j5o1pfcutxzkdtuvf72.zzpBGItXfub0yWj), null, Integer.valueOf(j5o1pfcutxzkdtuvf72.V57tEvNfxZVVcOCAOih5PKr), Integer.valueOf(j5o1pfcutxzkdtuvf72.ZfQNn8hdWlEQ5cR94249PDsLR ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        zBooleanValue = false;
                                    }
                                    if (!zBooleanValue) {
                                        method2.invoke(objNewInstance, null);
                                        break;
                                    }
                                    z = true;
                                }
                                i2++;
                                z = z;
                            } else if (!z) {
                                method2.invoke(objNewInstance, null);
                            } else if (e1gEV3X9xwmHj(objNewInstance) && (typefaceTpEo0fy9FaoJYrSFHRfIK6 = tpEo0fy9FaoJYrSFHRfIK6(objNewInstance)) != null) {
                                return Typeface.create(typefaceTpEo0fy9FaoJYrSFHRfIK6, i);
                            }
                        }
                    }
                } else {
                    j5O1PfCuTxZKdtuvF7 j5o1pfcutxzkdtuvf7JW7EiD0YL6xkbB158jMUzhWNWb1y = jW7EiD0YL6xkbB158jMUzhWNWb1y(j5o1pfcutxzkdtuvf7Arr, i);
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(j5o1pfcutxzkdtuvf7JW7EiD0YL6xkbB158jMUzhWNWb1y.VxUQ9tBhpHJ2AAEDNW8sghc4m, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(j5o1pfcutxzkdtuvf7JW7EiD0YL6xkbB158jMUzhWNWb1y.V57tEvNfxZVVcOCAOih5PKr).setItalic(j5o1pfcutxzkdtuvf7JW7EiD0YL6xkbB158jMUzhWNWb1y.ZfQNn8hdWlEQ5cR94249PDsLR).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } finally {
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // com.vdodsodjsdt.UwqFzq75FTpQvxtMbqt, com.vdodsodjsdt.F44whnLsbQ
    public final Typeface M9e7PWhFYLD2lOGMker(Context context, NEoz7FxOyLX3r49rfTBZNOYjpdY5x nEoz7FxOyLX3r49rfTBZNOYjpdY5x, Resources resources, int i) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.ko09zE6UAgwkV;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.M9e7PWhFYLD2lOGMker(context, nEoz7FxOyLX3r49rfTBZNOYjpdY5x, resources, i);
        }
        try {
            objNewInstance = this.pYmKDYlAmhudp.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            lg8An0fK4MQzMPmeENxB1c[] lg8an0fk4mqzmpmeenxb1cArr = nEoz7FxOyLX3r49rfTBZNOYjpdY5x.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            int length = lg8an0fk4mqzmpmeenxb1cArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    lg8An0fK4MQzMPmeENxB1c lg8an0fk4mqzmpmeenxb1c = lg8an0fk4mqzmpmeenxb1cArr[i2];
                    Context context2 = context;
                    if (ByTQIhgl7ezGvHXEd(context2, objNewInstance, lg8an0fk4mqzmpmeenxb1c.VxUQ9tBhpHJ2AAEDNW8sghc4m, lg8an0fk4mqzmpmeenxb1c.LaeGQIruHQu81hfJldjMOQSVblH3x, lg8an0fk4mqzmpmeenxb1c.zzpBGItXfub0yWj, lg8an0fk4mqzmpmeenxb1c.V57tEvNfxZVVcOCAOih5PKr ? 1 : 0, FontVariationAxis.fromFontVariationSettings(lg8an0fk4mqzmpmeenxb1c.ZfQNn8hdWlEQ5cR94249PDsLR))) {
                        i2++;
                        context = context2;
                    } else {
                        try {
                            this.vBGA6pPLqSMuYGvprl270j7.invoke(objNewInstance, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                } else if (e1gEV3X9xwmHj(objNewInstance)) {
                    return tpEo0fy9FaoJYrSFHRfIK6(objNewInstance);
                }
            }
        }
        return null;
    }

    public final boolean e1gEV3X9xwmHj(Object obj) {
        try {
            return ((Boolean) this.f6ZQsR6bPLvvCDNXOUc.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    @Override // com.vdodsodjsdt.F44whnLsbQ
    public final Typeface p59rPv72J9(Context context, Resources resources, int i, String str, int i2) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object objNewInstance;
        Method method = this.ko09zE6UAgwkV;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.p59rPv72J9(context, resources, i, str, i2);
        }
        try {
            objNewInstance = this.pYmKDYlAmhudp.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            objNewInstance = null;
        }
        if (objNewInstance != null) {
            if (!ByTQIhgl7ezGvHXEd(context, objNewInstance, str, 0, -1, -1, null)) {
                try {
                    this.vBGA6pPLqSMuYGvprl270j7.invoke(objNewInstance, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (e1gEV3X9xwmHj(objNewInstance)) {
                return tpEo0fy9FaoJYrSFHRfIK6(objNewInstance);
            }
        }
        return null;
    }

    public Typeface tpEo0fy9FaoJYrSFHRfIK6(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.TaDO7ogis3aEiWEtq.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
