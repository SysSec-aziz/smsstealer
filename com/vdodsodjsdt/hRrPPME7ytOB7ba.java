package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hRrPPME7ytOB7ba {
    public static boolean Ca81ebIan1u = false;
    public static Method HzCpKshMOoaw76hFcbOVRYMeRd = null;
    public static Method Irh5auREsoeV1C1RaBamlmy = null;
    public static boolean KUYypEB4eNWOZWVDpH = false;
    public static boolean RhfGHxtXxy0M0grmp2jkRjQg = true;
    public static boolean SuB3hEmTmbbRGAhtvOOmfKEon;
    public static long TaDO7ogis3aEiWEtq;
    public static Field f6ZQsR6bPLvvCDNXOUc;
    public static Class h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public static boolean jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public static Field ko09zE6UAgwkV;
    public static Field p59rPv72J9;
    public static boolean pYmKDYlAmhudp;
    public static Method q11o1hieEkZDhF1MGOZI26oZiDT;
    public static Field qNPQb1obP7;
    public static boolean vBGA6pPLqSMuYGvprl270j7;
    public static Method w0Wu95l8dVNw5rZMRu;
    public static final int[] VxUQ9tBhpHJ2AAEDNW8sghc4m = {android.R.attr.name, android.R.attr.tint, android.R.attr.height, android.R.attr.width, android.R.attr.alpha, android.R.attr.autoMirrored, android.R.attr.tintMode, android.R.attr.viewportWidth, android.R.attr.viewportHeight};
    public static final int[] zzpBGItXfub0yWj = {android.R.attr.name, android.R.attr.pivotX, android.R.attr.pivotY, android.R.attr.scaleX, android.R.attr.scaleY, android.R.attr.rotation, android.R.attr.translateX, android.R.attr.translateY};
    public static final int[] V57tEvNfxZVVcOCAOih5PKr = {android.R.attr.name, android.R.attr.fillColor, android.R.attr.pathData, android.R.attr.strokeColor, android.R.attr.strokeWidth, android.R.attr.trimPathStart, android.R.attr.trimPathEnd, android.R.attr.trimPathOffset, android.R.attr.strokeLineCap, android.R.attr.strokeLineJoin, android.R.attr.strokeMiterLimit, android.R.attr.strokeAlpha, android.R.attr.fillAlpha, android.R.attr.fillType};
    public static final int[] ZfQNn8hdWlEQ5cR94249PDsLR = {android.R.attr.name, android.R.attr.pathData, android.R.attr.fillType};
    public static final int[] LaeGQIruHQu81hfJldjMOQSVblH3x = {android.R.attr.drawable};
    public static final int[] zIvmSL0wzmmKGc3X39b2Gw2mUGE = {android.R.attr.name, android.R.attr.animation};
    public static final String[] ZLZeBXTMq0zDztBxtRTuCHrapQ = {"com.idamob.tinkoff.android", "ru.rostel", "ru.beeline.services", "com.wildberries.ru", "ru.ozon.fintech.finance", "ru.mts.bank", "ru.mts.mymts", "ru.vtb24.mobilebanking.android", "ru.alfabank.mobile.android", "com.valvesoftware.android.steam.community", "ru.lewis.dbo", "ru.sberbankmobile", "ru.oneme.app", "ru.otpbank.mobile", "ru.tsk.ftc.bender.qpay", "ru.bankuralsib.mb.android", "logo.com.mbanking", "ru.vtb24.mobilebanking.android", "ru.alfabank.mobile.android", "ru.rshb.dbo", "ru.gazprombank.android.mobilebank.app", "ru.letobank.Prometheus", "ru.akbars.mobile"};
    public static final Type[] NSjgqmGjEzuugn2SsG1mZFP = new Type[0];
    public static final aqhhl68tQrgIjcMGB3dY2YLK3vN GI83zq0G8e7zkn = new aqhhl68tQrgIjcMGB3dY2YLK3vN("NO_OWNER", 2);
    public static final Object M9e7PWhFYLD2lOGMker = new Object();
    public static final VSncX8ksA0tswc2TMhzhOMdd q1wNbhk2O6 = new VSncX8ksA0tswc2TMhzhOMdd();

    public static boolean GI83zq0G8e7zkn(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return GI83zq0G8e7zkn(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return Objects.equals(typeVariable.getGenericDeclaration(), typeVariable2.getGenericDeclaration()) && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static String HVEwbdULInpTNa0IG(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    public static Type HzCpKshMOoaw76hFcbOVRYMeRd(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return HzCpKshMOoaw76hFcbOVRYMeRd(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return HzCpKshMOoaw76hFcbOVRYMeRd(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static final String KUYypEB4eNWOZWVDpH(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static void LaeGQIruHQu81hfJldjMOQSVblH3x(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException("Primitive type is not allowed");
        }
    }

    public static final AhgUxI6t6E M9e7PWhFYLD2lOGMker(vIPEe55rgLxLcs vipee55rglxlcs) {
        ej6unYlOWMDF.pYmKDYlAmhudp(vipee55rglxlcs, "<this>");
        return new AhgUxI6t6E(vipee55rglxlcs.VxUQ9tBhpHJ2AAEDNW8sghc4m, vipee55rglxlcs.f6ZQsR6bPLvvCDNXOUc);
    }

    public static final void NSjgqmGjEzuugn2SsG1mZFP(D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFW) {
        sJ612dvaOBrP4lDkAwxzLpcxONSSp sj612dvaobrp4ldkawxzlpcxonssp = (sJ612dvaOBrP4lDkAwxzLpcxONSSp) d73WsmU258PapcWZb45SFW.q11o1hieEkZDhF1MGOZI26oZiDT(IN79WcIk5xB4t0GjRT43qPLs5.HzCpKshMOoaw76hFcbOVRYMeRd);
        if (sj612dvaobrp4ldkawxzlpcxonssp != null && !sj612dvaobrp4ldkawxzlpcxonssp.VxUQ9tBhpHJ2AAEDNW8sghc4m()) {
            throw ((fXGTDnUxIdCVHFvA63E) sj612dvaobrp4ldkawxzlpcxonssp).SuB3hEmTmbbRGAhtvOOmfKEon();
        }
    }

    public static final String O1xDAlBZZlZdoEf747lCFHld(IvfXhmjM3e3K ivfXhmjM3e3K) {
        Object objVBGA6pPLqSMuYGvprl270j7;
        if (ivfXhmjM3e3K instanceof j0kIeYozLt6jOglJu) {
            return ivfXhmjM3e3K.toString();
        }
        try {
            objVBGA6pPLqSMuYGvprl270j7 = ivfXhmjM3e3K + '@' + KUYypEB4eNWOZWVDpH(ivfXhmjM3e3K);
        } catch (Throwable th) {
            objVBGA6pPLqSMuYGvprl270j7 = ej6unYlOWMDF.vBGA6pPLqSMuYGvprl270j7(th);
        }
        if (irzKrQ86nQxhDp2QXhxUmPnyA6TkB.VxUQ9tBhpHJ2AAEDNW8sghc4m(objVBGA6pPLqSMuYGvprl270j7) != null) {
            objVBGA6pPLqSMuYGvprl270j7 = ivfXhmjM3e3K.getClass().getName() + '@' + KUYypEB4eNWOZWVDpH(ivfXhmjM3e3K);
        }
        return (String) objVBGA6pPLqSMuYGvprl270j7;
    }

    public static final Object RhfGHxtXxy0M0grmp2jkRjQg(Object obj) {
        return obj instanceof XpG0A5IpJsSX9uJPSmP4WwTAl ? ej6unYlOWMDF.vBGA6pPLqSMuYGvprl270j7(((XpG0A5IpJsSX9uJPSmP4WwTAl) obj).VxUQ9tBhpHJ2AAEDNW8sghc4m) : obj;
    }

    public static final void TqcnImqkSWIKht(FileOutputStream fileOutputStream, String str, Charset charset) throws IOException {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "text");
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        ej6unYlOWMDF.p59rPv72J9(charsetEncoderOnUnmappableCharacter);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192 * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(byteBufferAllocate, "allocate(...)");
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int iMin = Math.min(8192 - i2, str.length() - i);
            int i3 = i + iMin;
            char[] cArrArray = charBufferAllocate.array();
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(cArrArray, "array(...)");
            str.getChars(i, i3, cArrArray, i2);
            charBufferAllocate.limit(iMin + i2);
            i2 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i3 == str.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i2 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i = i3;
        }
    }

    public static final void V57tEvNfxZVVcOCAOih5PKr(D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFW, CancellationException cancellationException) {
        sJ612dvaOBrP4lDkAwxzLpcxONSSp sj612dvaobrp4ldkawxzlpcxonssp = (sJ612dvaOBrP4lDkAwxzLpcxONSSp) d73WsmU258PapcWZb45SFW.q11o1hieEkZDhF1MGOZI26oZiDT(IN79WcIk5xB4t0GjRT43qPLs5.HzCpKshMOoaw76hFcbOVRYMeRd);
        if (sj612dvaobrp4ldkawxzlpcxonssp != null) {
            sj612dvaobrp4ldkawxzlpcxonssp.V57tEvNfxZVVcOCAOih5PKr(cancellationException);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x06d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:433:0x06f2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void VxUQ9tBhpHJ2AAEDNW8sghc4m(com.vdodsodjsdt.rwLNq3eKZ2vnR0XP r40, com.vdodsodjsdt.uij8Ij9SZKI0vaNotiNzH r41, java.util.ArrayList r42, int r43) {
        /*
            Method dump skipped, instruction units count: 1791
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.hRrPPME7ytOB7ba.VxUQ9tBhpHJ2AAEDNW8sghc4m(com.vdodsodjsdt.rwLNq3eKZ2vnR0XP, com.vdodsodjsdt.uij8Ij9SZKI0vaNotiNzH, java.util.ArrayList, int):void");
    }

    public static final Object ZLZeBXTMq0zDztBxtRTuCHrapQ(long j, GvuED9Eb9kjnYjng4BPJg7J gvuED9Eb9kjnYjng4BPJg7J) {
        if (j > 0) {
            YAf4BMDpiCAb4hYaN6VqW yAf4BMDpiCAb4hYaN6VqW = new YAf4BMDpiCAb4hYaN6VqW(1, sGipz63rTUmSj3uFDvOtzihao.qNPQb1obP7(gvuED9Eb9kjnYjng4BPJg7J));
            yAf4BMDpiCAb4hYaN6VqW.vBGA6pPLqSMuYGvprl270j7();
            if (j < Long.MAX_VALUE) {
                RKQqw795jswHmdL5AnfuvmeBZD rKQqw795jswHmdL5AnfuvmeBZDQ11o1hieEkZDhF1MGOZI26oZiDT = yAf4BMDpiCAb4hYaN6VqW.ZLZeBXTMq0zDztBxtRTuCHrapQ.q11o1hieEkZDhF1MGOZI26oZiDT(IN79WcIk5xB4t0GjRT43qPLs5.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
                w1TUuqPealEllpif2 w1tuuqpealellpif2 = rKQqw795jswHmdL5AnfuvmeBZDQ11o1hieEkZDhF1MGOZI26oZiDT instanceof w1TUuqPealEllpif2 ? (w1TUuqPealEllpif2) rKQqw795jswHmdL5AnfuvmeBZDQ11o1hieEkZDhF1MGOZI26oZiDT : null;
                if (w1tuuqpealellpif2 == null) {
                    w1tuuqpealellpif2 = ZvAHVaT4O4c.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                }
                w1tuuqpealellpif2.LaeGQIruHQu81hfJldjMOQSVblH3x(j, yAf4BMDpiCAb4hYaN6VqW);
            }
            Object objF6ZQsR6bPLvvCDNXOUc = yAf4BMDpiCAb4hYaN6VqW.f6ZQsR6bPLvvCDNXOUc();
            if (objF6ZQsR6bPLvvCDNXOUc == w0JnONr1KwCkZY9pA0QjUDuh9aMcU.V57tEvNfxZVVcOCAOih5PKr) {
                return objF6ZQsR6bPLvvCDNXOUc;
            }
        }
        return hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m;
    }

    public static Type ZfQNn8hdWlEQ5cR94249PDsLR(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new TBB88StmjQBzC(ZfQNn8hdWlEQ5cR94249PDsLR(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new pF5I85ojfL0LfnVzCFznQb(parameterizedType.getOwnerType(), (Class) parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new TBB88StmjQBzC(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new h1BoqRrS8lfx3E1oK(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static final vQITfhejPO aXO0LSrt8bKV(vQITfhejPO vqitfhejpo) {
        ej6unYlOWMDF.pYmKDYlAmhudp(vqitfhejpo, "<this>");
        GPbzGuds6T72DsvjLiqOziy8CFcNt gPbzGuds6T72DsvjLiqOziy8CFcNtVxUQ9tBhpHJ2AAEDNW8sghc4m = vqitfhejpo.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        vMNcbMafUgq vmncbmafugq = vqitfhejpo.GI83zq0G8e7zkn;
        gPbzGuds6T72DsvjLiqOziy8CFcNtVxUQ9tBhpHJ2AAEDNW8sghc4m.ZLZeBXTMq0zDztBxtRTuCHrapQ = new uQt4mpbnJwFCjx(vmncbmafugq.V57tEvNfxZVVcOCAOih5PKr(), vmncbmafugq.VxUQ9tBhpHJ2AAEDNW8sghc4m());
        return gPbzGuds6T72DsvjLiqOziy8CFcNtVxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m();
    }

    public static boolean f6ZQsR6bPLvvCDNXOUc() {
        if (Build.VERSION.SDK_INT >= 29) {
            return mmgMCzcirsQFJfg2qYVvddWgELh.V57tEvNfxZVVcOCAOih5PKr();
        }
        try {
            if (Irh5auREsoeV1C1RaBamlmy == null) {
                TaDO7ogis3aEiWEtq = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Irh5auREsoeV1C1RaBamlmy = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) Irh5auREsoeV1C1RaBamlmy.invoke(null, Long.valueOf(TaDO7ogis3aEiWEtq))).booleanValue();
        } catch (Exception e) {
            h3jnZRsdwYJfY9UhQCkbvWciwvFHv("isTagEnabled", e);
            return false;
        }
    }

    public static void h3jnZRsdwYJfY9UhQCkbvWciwvFHv(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static void iKANjmyTSxO6v6UuLPdu7DxOjlS(File file, String str) throws IOException {
        Charset charset = DEYHHOT0rxPFnkgGJgP0ym2DRq1.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "text");
        ej6unYlOWMDF.pYmKDYlAmhudp(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            TqcnImqkSWIKht(fileOutputStream, str, charset);
            fileOutputStream.close();
        } finally {
        }
    }

    public static c5ORlH4Pzc4yAttMD7dLGkl48Uya jW7EiD0YL6xkbB158jMUzhWNWb1y(sJ612dvaOBrP4lDkAwxzLpcxONSSp sj612dvaobrp4ldkawxzlpcxonssp, boolean z, WQoBeERitBjo wQoBeERitBjo, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        boolean z2 = (i & 2) != 0;
        if (sj612dvaobrp4ldkawxzlpcxonssp instanceof fXGTDnUxIdCVHFvA63E) {
            return ((fXGTDnUxIdCVHFvA63E) sj612dvaobrp4ldkawxzlpcxonssp).iKANjmyTSxO6v6UuLPdu7DxOjlS(z, z2, wQoBeERitBjo);
        }
        EbUZCIstGipH ebUZCIstGipH = new EbUZCIstGipH(1, wQoBeERitBjo, y44yd1lomoSgJ.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 0);
        fXGTDnUxIdCVHFvA63E fxgtdnuxidcvhfva63e = (fXGTDnUxIdCVHFvA63E) sj612dvaobrp4ldkawxzlpcxonssp;
        fxgtdnuxidcvhfva63e.getClass();
        return fxgtdnuxidcvhfva63e.iKANjmyTSxO6v6UuLPdu7DxOjlS(z, z2, new PYETDFuqRYdpU1Sz(ebUZCIstGipH));
    }

    public static final int ko09zE6UAgwkV(DBkPCwg2bk dBkPCwg2bk, Object obj, int i) {
        int i2 = dBkPCwg2bk.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iM9e7PWhFYLD2lOGMker = ej6unYlOWMDF.M9e7PWhFYLD2lOGMker(i2, i, dBkPCwg2bk.V57tEvNfxZVVcOCAOih5PKr);
            if (iM9e7PWhFYLD2lOGMker < 0 || ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(obj, dBkPCwg2bk.ZfQNn8hdWlEQ5cR94249PDsLR[iM9e7PWhFYLD2lOGMker])) {
                return iM9e7PWhFYLD2lOGMker;
            }
            int i3 = iM9e7PWhFYLD2lOGMker + 1;
            while (i3 < i2 && dBkPCwg2bk.V57tEvNfxZVVcOCAOih5PKr[i3] == i) {
                if (ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(obj, dBkPCwg2bk.ZfQNn8hdWlEQ5cR94249PDsLR[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iM9e7PWhFYLD2lOGMker - 1; i4 >= 0 && dBkPCwg2bk.V57tEvNfxZVVcOCAOih5PKr[i4] == i; i4--) {
                if (ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(obj, dBkPCwg2bk.ZfQNn8hdWlEQ5cR94249PDsLR[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static Type p59rPv72J9(Type type, Class cls, Class cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        if (cls2.isAssignableFrom(cls)) {
            return qNPQb1obP7(type, cls, HzCpKshMOoaw76hFcbOVRYMeRd(type, cls, cls2), new HashMap());
        }
        throw new IllegalArgumentException(cls + " is not the same as or a subtype of " + cls2);
    }

    public static final void pYmKDYlAmhudp(D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFW, Throwable th) {
        Throwable runtimeException;
        Iterator it = myYTWQSDWvEBK8NNx.VxUQ9tBhpHJ2AAEDNW8sghc4m.iterator();
        while (it.hasNext()) {
            try {
                ((OxEujxDldXY8GLtopEvvq) it.next()).SuB3hEmTmbbRGAhtvOOmfKEon(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    sGipz63rTUmSj3uFDvOtzihao.LaeGQIruHQu81hfJldjMOQSVblH3x(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            sGipz63rTUmSj3uFDvOtzihao.LaeGQIruHQu81hfJldjMOQSVblH3x(th, new obHrwVLq9i8l0U5mU3mxj8(d73WsmU258PapcWZb45SFW));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final boolean q11o1hieEkZDhF1MGOZI26oZiDT(String str) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "method");
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static Class q1wNbhk2O6(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) q1wNbhk2O6(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return q1wNbhk2O6(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0141 A[EDGE_INSN: B:86:0x0141->B:80:0x0141 BREAK  A[LOOP:0: B:3:0x0002->B:89:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[LOOP:0: B:3:0x0002->B:89:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r12v3, types: [com.vdodsodjsdt.h1BoqRrS8lfx3E1oK] */
    /* JADX WARN: Type inference failed for: r12v4, types: [com.vdodsodjsdt.h1BoqRrS8lfx3E1oK] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.reflect.Type qNPQb1obP7(java.lang.reflect.Type r10, java.lang.Class r11, java.lang.reflect.Type r12, java.util.HashMap r13) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.hRrPPME7ytOB7ba.qNPQb1obP7(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.HashMap):java.lang.reflect.Type");
    }

    public static Class qygqjTppWwx992(Class cls) {
        return cls == Integer.TYPE ? Integer.class : cls == Float.TYPE ? Float.class : cls == Byte.TYPE ? Byte.class : cls == Double.TYPE ? Double.class : cls == Long.TYPE ? Long.class : cls == Character.TYPE ? Character.class : cls == Boolean.TYPE ? Boolean.class : cls == Short.TYPE ? Short.class : cls == Void.TYPE ? Void.class : cls;
    }

    public static boolean vBGA6pPLqSMuYGvprl270j7(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static int vE4yDIjexsP2lGjLaTcB(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static pt4pjl1pNXdDyK812k w0Wu95l8dVNw5rZMRu(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = byteBufferDuplicate.getInt();
                long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    byteBufferDuplicate.position((int) (j3 + j));
                    pt4pjl1pNXdDyK812k pt4pjl1pnxddyk812k = new pt4pjl1pNXdDyK812k();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    pt4pjl1pnxddyk812k.zIvmSL0wzmmKGc3X39b2Gw2mUGE = byteBufferDuplicate;
                    pt4pjl1pnxddyk812k.V57tEvNfxZVVcOCAOih5PKr = iPosition;
                    int i6 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    pt4pjl1pnxddyk812k.ZfQNn8hdWlEQ5cR94249PDsLR = i6;
                    pt4pjl1pnxddyk812k.LaeGQIruHQu81hfJldjMOQSVblH3x = ((ByteBuffer) pt4pjl1pnxddyk812k.zIvmSL0wzmmKGc3X39b2Gw2mUGE).getShort(i6);
                    return pt4pjl1pnxddyk812k;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static String y1NaPKTl7R18DOr6e8i5(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static PNtmYBy22HJklJ zIvmSL0wzmmKGc3X39b2Gw2mUGE(TYHMBipJh2 tYHMBipJh2, TYHMBipJh2 tYHMBipJh22, zCTjlTvX7kUnDg4oo78 zctjltvx7kundg4oo78, zCTjlTvX7kUnDg4oo78 zctjltvx7kundg4oo782) {
        return new PNtmYBy22HJklJ(tYHMBipJh2, tYHMBipJh22, zctjltvx7kundg4oo78, zctjltvx7kundg4oo782);
    }

    public static void zzpBGItXfub0yWj(VFqnQARHTng vFqnQARHTng, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            if (obj == null) {
                vFqnQARHTng.ZLZeBXTMq0zDztBxtRTuCHrapQ(i);
            } else if (obj instanceof byte[]) {
                vFqnQARHTng.jW7EiD0YL6xkbB158jMUzhWNWb1y(i, (byte[]) obj);
            } else if (obj instanceof Float) {
                vFqnQARHTng.GI83zq0G8e7zkn(i, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                vFqnQARHTng.GI83zq0G8e7zkn(i, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                vFqnQARHTng.p59rPv72J9(i, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                vFqnQARHTng.p59rPv72J9(i, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                vFqnQARHTng.p59rPv72J9(i, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                vFqnQARHTng.p59rPv72J9(i, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                vFqnQARHTng.f6ZQsR6bPLvvCDNXOUc((String) obj, i);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                vFqnQARHTng.p59rPv72J9(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
    }

    public float Ca81ebIan1u(View view) {
        if (RhfGHxtXxy0M0grmp2jkRjQg) {
            try {
                return p6GG1R7ou7tlhSqqyFPjD.VxUQ9tBhpHJ2AAEDNW8sghc4m(view);
            } catch (NoSuchMethodError unused) {
                RhfGHxtXxy0M0grmp2jkRjQg = false;
            }
        }
        return view.getAlpha();
    }

    public abstract void Irh5auREsoeV1C1RaBamlmy(nMRZPpfLCgJyuB nmrzppflcgjyub);

    public void SuB3hEmTmbbRGAhtvOOmfKEon(View view, float f) {
        if (RhfGHxtXxy0M0grmp2jkRjQg) {
            try {
                p6GG1R7ou7tlhSqqyFPjD.zzpBGItXfub0yWj(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                RhfGHxtXxy0M0grmp2jkRjQg = false;
            }
        }
        view.setAlpha(f);
    }

    public abstract void TaDO7ogis3aEiWEtq(Throwable th);

    public void pzqP2AqKW6J5PO8zCKnW(View view, int i) {
        if (!SuB3hEmTmbbRGAhtvOOmfKEon) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                qNPQb1obP7 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            SuB3hEmTmbbRGAhtvOOmfKEon = true;
        }
        Field field = qNPQb1obP7;
        if (field != null) {
            try {
                qNPQb1obP7.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
