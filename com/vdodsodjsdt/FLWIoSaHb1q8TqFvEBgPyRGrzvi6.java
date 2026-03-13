package com.vdodsodjsdt;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class FLWIoSaHb1q8TqFvEBgPyRGrzvi6 implements bZzY6fKPECX4DUwp {
    public static boolean ZLZeBXTMq0zDztBxtRTuCHrapQ = true;
    public static final aqhhl68tQrgIjcMGB3dY2YLK3vN VxUQ9tBhpHJ2AAEDNW8sghc4m = new aqhhl68tQrgIjcMGB3dY2YLK3vN("RESUME_TOKEN", 2);
    public static final String[] zzpBGItXfub0yWj = {"standard", "accelerate", "decelerate", "linear"};
    public static final Object V57tEvNfxZVVcOCAOih5PKr = new Object();
    public static final FG8LIxsgYiLSfhN0jYKIKr ZfQNn8hdWlEQ5cR94249PDsLR = new FG8LIxsgYiLSfhN0jYKIKr(21);
    public static final int[] LaeGQIruHQu81hfJldjMOQSVblH3x = {R.attr.colorPrimary};
    public static final int[] zIvmSL0wzmmKGc3X39b2Gw2mUGE = {R.attr.colorPrimaryVariant};

    public static boolean Ca81ebIan1u(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            HzCpKshMOoaw76hFcbOVRYMeRd(fileOutputStream2);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    }
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                    HzCpKshMOoaw76hFcbOVRYMeRd(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    HzCpKshMOoaw76hFcbOVRYMeRd(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    public static int CixTK5ZX8oWXHz34qHYV(String str, int i, int i2) {
        return (int) d9zDyyznnp3oaDT1Ug(str, i, 1, (i2 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static void GI83zq0G8e7zkn(Context context, int[] iArr, String str) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i)) {
                typedArrayObtainStyledAttributes.recycle();
                throw new IllegalArgumentException(u9SlVAuoWhQUfJ.M9e7PWhFYLD2lOGMker("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static final void HVEwbdULInpTNa0IG(Object[] objArr, int i, int i2) {
        ej6unYlOWMDF.pYmKDYlAmhudp(objArr, "<this>");
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static void HzCpKshMOoaw76hFcbOVRYMeRd(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Double[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Float[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Long[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Byte[]] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Serializable, java.lang.Boolean[]] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
    public static final Serializable Irh5auREsoeV1C1RaBamlmy(DataInputStream dataInputStream, byte b) throws IOException {
        if (b == 0) {
            return null;
        }
        if (b == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b == 7) {
            return dataInputStream.readUTF();
        }
        int i = 0;
        if (b == 8) {
            int i2 = dataInputStream.readInt();
            ?? r0 = new Boolean[i2];
            while (i < i2) {
                r0[i] = Boolean.valueOf(dataInputStream.readBoolean());
                i++;
            }
            return r0;
        }
        if (b == 9) {
            int i3 = dataInputStream.readInt();
            ?? r02 = new Byte[i3];
            while (i < i3) {
                r02[i] = Byte.valueOf(dataInputStream.readByte());
                i++;
            }
            return r02;
        }
        if (b == 10) {
            int i4 = dataInputStream.readInt();
            ?? r03 = new Integer[i4];
            while (i < i4) {
                r03[i] = Integer.valueOf(dataInputStream.readInt());
                i++;
            }
            return r03;
        }
        if (b == 11) {
            int i5 = dataInputStream.readInt();
            ?? r04 = new Long[i5];
            while (i < i5) {
                r04[i] = Long.valueOf(dataInputStream.readLong());
                i++;
            }
            return r04;
        }
        if (b == 12) {
            int i6 = dataInputStream.readInt();
            ?? r05 = new Float[i6];
            while (i < i6) {
                r05[i] = Float.valueOf(dataInputStream.readFloat());
                i++;
            }
            return r05;
        }
        if (b == 13) {
            int i7 = dataInputStream.readInt();
            ?? r06 = new Double[i7];
            while (i < i7) {
                r06[i] = Double.valueOf(dataInputStream.readDouble());
                i++;
            }
            return r06;
        }
        if (b != 14) {
            throw new IllegalStateException(u9SlVAuoWhQUfJ.NSjgqmGjEzuugn2SsG1mZFP("Unsupported type ", b));
        }
        int i8 = dataInputStream.readInt();
        ?? r1 = new String[i8];
        while (i < i8) {
            String utf = dataInputStream.readUTF();
            if (ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(utf, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                utf = null;
            }
            r1[i] = utf;
            i++;
        }
        return r1;
    }

    public static final long KUYypEB4eNWOZWVDpH(long j, HPBeLW9a95sRGCi hPBeLW9a95sRGCi, HPBeLW9a95sRGCi hPBeLW9a95sRGCi2) {
        ej6unYlOWMDF.pYmKDYlAmhudp(hPBeLW9a95sRGCi, "sourceUnit");
        ej6unYlOWMDF.pYmKDYlAmhudp(hPBeLW9a95sRGCi2, "targetUnit");
        return hPBeLW9a95sRGCi2.V57tEvNfxZVVcOCAOih5PKr.convert(j, hPBeLW9a95sRGCi.V57tEvNfxZVVcOCAOih5PKr);
    }

    public static void LaeGQIruHQu81hfJldjMOQSVblH3x(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, PGobtLpyfPC4TCnlq740.vE4yDIjexsP2lGjLaTcB, i, i2);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                GI83zq0G8e7zkn(context, zIvmSL0wzmmKGc3X39b2Gw2mUGE, "Theme.MaterialComponents");
            }
        }
        GI83zq0G8e7zkn(context, LaeGQIruHQu81hfJldjMOQSVblH3x, "Theme.AppCompat");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String M9e7PWhFYLD2lOGMker(String str) {
        int iHashCode = str.hashCode();
        switch (iHashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "kotlin.Double.Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "kotlin.Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "kotlin.Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "kotlin.Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "kotlin.Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "kotlin.collections.Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "kotlin.collections.Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "kotlin.Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "kotlin.Byte.Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "kotlin.CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "kotlin.collections.Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "kotlin.Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "kotlin.Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "kotlin.Char.Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "kotlin.Long.Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "kotlin.collections.Map.Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "kotlin.Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "kotlin.Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "kotlin.Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "kotlin.collections.List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "kotlin.Short.Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "kotlin.Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "kotlin.Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "kotlin.Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "kotlin.Enum.Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "kotlin.Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "kotlin.Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "kotlin.Float.Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "kotlin.collections.Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "kotlin.collections.ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "kotlin.String.Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "kotlin.Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "kotlin.Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "kotlin.Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "kotlin.String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "kotlin.collections.Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "kotlin.Boolean.Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "kotlin.Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "kotlin.Int.Companion";
                }
                return null;
            default:
                switch (iHashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (iHashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (iHashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static void NSjgqmGjEzuugn2SsG1mZFP(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, PGobtLpyfPC4TCnlq740.vE4yDIjexsP2lGjLaTcB, i, i2);
        boolean z = false;
        if (!typedArrayObtainStyledAttributes.getBoolean(2, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            for (int i3 : iArr2) {
                if (typedArrayObtainStyledAttributes2.getResourceId(i3, -1) == -1) {
                    typedArrayObtainStyledAttributes2.recycle();
                    break;
                }
            }
            typedArrayObtainStyledAttributes2.recycle();
            z = true;
        } else if (typedArrayObtainStyledAttributes.getResourceId(0, -1) != -1) {
            z = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static final Object O1xDAlBZZlZdoEf747lCFHld(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static void RhfGHxtXxy0M0grmp2jkRjQg(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    public static File SuB3hEmTmbbRGAhtvOOmfKEon(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static final void TaDO7ogis3aEiWEtq(DataInputStream dataInputStream) throws IOException {
        short s = dataInputStream.readShort();
        if (s != -21521) {
            throw new IllegalStateException(u9SlVAuoWhQUfJ.NSjgqmGjEzuugn2SsG1mZFP("Magic number doesn't match: ", s).toString());
        }
        short s2 = dataInputStream.readShort();
        if (s2 != 1) {
            throw new IllegalStateException(u9SlVAuoWhQUfJ.NSjgqmGjEzuugn2SsG1mZFP("Unsupported version number: ", s2).toString());
        }
    }

    public static void TqcnImqkSWIKht(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            VnHzBdUqXp5vGDZxp64ebSCkTPcyX.zzpBGItXfub0yWj(viewGroup, z);
        } else if (ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            try {
                VnHzBdUqXp5vGDZxp64ebSCkTPcyX.zzpBGItXfub0yWj(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                ZLZeBXTMq0zDztBxtRTuCHrapQ = false;
            }
        }
    }

    public static final boolean V57tEvNfxZVVcOCAOih5PKr(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        ej6unYlOWMDF.pYmKDYlAmhudp(bArr, "a");
        ej6unYlOWMDF.pYmKDYlAmhudp(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object VxUQ9tBhpHJ2AAEDNW8sghc4m(com.vdodsodjsdt.Tgg54lc4w2N26DiLu r4, com.vdodsodjsdt.eOzfvYucUvutw8ISUcYM r5, java.lang.Throwable r6, com.vdodsodjsdt.tfu79AIgc4CGAZaxd4HhD r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof com.vdodsodjsdt.aOqC1jyCBWo6TynMW4MLol
            if (r0 == 0) goto L13
            r0 = r7
            com.vdodsodjsdt.aOqC1jyCBWo6TynMW4MLol r0 = (com.vdodsodjsdt.aOqC1jyCBWo6TynMW4MLol) r0
            int r1 = r0.NSjgqmGjEzuugn2SsG1mZFP
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.NSjgqmGjEzuugn2SsG1mZFP = r1
            goto L18
        L13:
            com.vdodsodjsdt.aOqC1jyCBWo6TynMW4MLol r0 = new com.vdodsodjsdt.aOqC1jyCBWo6TynMW4MLol
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.ZLZeBXTMq0zDztBxtRTuCHrapQ
            int r1 = r0.NSjgqmGjEzuugn2SsG1mZFP
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            java.lang.Throwable r6 = r0.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            com.vdodsodjsdt.ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(r7)     // Catch: java.lang.Throwable -> L27
            goto L41
        L27:
            r4 = move-exception
            goto L44
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            com.vdodsodjsdt.ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(r7)
            r0.zIvmSL0wzmmKGc3X39b2Gw2mUGE = r6     // Catch: java.lang.Throwable -> L27
            r0.NSjgqmGjEzuugn2SsG1mZFP = r2     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = r5.zzpBGItXfub0yWj(r4, r6, r0)     // Catch: java.lang.Throwable -> L27
            com.vdodsodjsdt.w0JnONr1KwCkZY9pA0QjUDuh9aMcU r5 = com.vdodsodjsdt.w0JnONr1KwCkZY9pA0QjUDuh9aMcU.V57tEvNfxZVVcOCAOih5PKr
            if (r4 != r5) goto L41
            return r5
        L41:
            com.vdodsodjsdt.hMtEZx9LFZEOBsEChkiRKnXNYh1GG r4 = com.vdodsodjsdt.hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m
            return r4
        L44:
            if (r6 == 0) goto L4b
            if (r6 == r4) goto L4b
            com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao.LaeGQIruHQu81hfJldjMOQSVblH3x(r4, r6)
        L4b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.FLWIoSaHb1q8TqFvEBgPyRGrzvi6.VxUQ9tBhpHJ2AAEDNW8sghc4m(com.vdodsodjsdt.Tgg54lc4w2N26DiLu, com.vdodsodjsdt.eOzfvYucUvutw8ISUcYM, java.lang.Throwable, com.vdodsodjsdt.tfu79AIgc4CGAZaxd4HhD):java.lang.Object");
    }

    public static final void YdNRGRc4rly(DataOutputStream dataOutputStream, String str, Object obj) throws IOException {
        String strM9e7PWhFYLD2lOGMker;
        int i;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else {
            if (!(obj instanceof Object[])) {
                throw new IllegalArgumentException("Unsupported value type " + LbKUuf4Fs4.VxUQ9tBhpHJ2AAEDNW8sghc4m(obj.getClass()).zzpBGItXfub0yWj());
            }
            Object[] objArr = (Object[]) obj;
            i8O1bEx5KirDRJHaM i8o1bex5kirdrjhamVxUQ9tBhpHJ2AAEDNW8sghc4m = LbKUuf4Fs4.VxUQ9tBhpHJ2AAEDNW8sghc4m(objArr.getClass());
            String strM9e7PWhFYLD2lOGMker2 = null;
            if (i8o1bex5kirdrjhamVxUQ9tBhpHJ2AAEDNW8sghc4m.equals(LbKUuf4Fs4.VxUQ9tBhpHJ2AAEDNW8sghc4m(Boolean[].class))) {
                i = 8;
            } else if (i8o1bex5kirdrjhamVxUQ9tBhpHJ2AAEDNW8sghc4m.equals(LbKUuf4Fs4.VxUQ9tBhpHJ2AAEDNW8sghc4m(Byte[].class))) {
                i = 9;
            } else if (i8o1bex5kirdrjhamVxUQ9tBhpHJ2AAEDNW8sghc4m.equals(LbKUuf4Fs4.VxUQ9tBhpHJ2AAEDNW8sghc4m(Integer[].class))) {
                i = 10;
            } else if (i8o1bex5kirdrjhamVxUQ9tBhpHJ2AAEDNW8sghc4m.equals(LbKUuf4Fs4.VxUQ9tBhpHJ2AAEDNW8sghc4m(Long[].class))) {
                i = 11;
            } else if (i8o1bex5kirdrjhamVxUQ9tBhpHJ2AAEDNW8sghc4m.equals(LbKUuf4Fs4.VxUQ9tBhpHJ2AAEDNW8sghc4m(Float[].class))) {
                i = 12;
            } else if (i8o1bex5kirdrjhamVxUQ9tBhpHJ2AAEDNW8sghc4m.equals(LbKUuf4Fs4.VxUQ9tBhpHJ2AAEDNW8sghc4m(Double[].class))) {
                i = 13;
            } else {
                if (!i8o1bex5kirdrjhamVxUQ9tBhpHJ2AAEDNW8sghc4m.equals(LbKUuf4Fs4.VxUQ9tBhpHJ2AAEDNW8sghc4m(String[].class))) {
                    StringBuilder sb = new StringBuilder("Unsupported value type ");
                    i8O1bEx5KirDRJHaM i8o1bex5kirdrjhamVxUQ9tBhpHJ2AAEDNW8sghc4m2 = LbKUuf4Fs4.VxUQ9tBhpHJ2AAEDNW8sghc4m(objArr.getClass());
                    int i2 = i8O1bEx5KirDRJHaM.zzpBGItXfub0yWj;
                    Class cls = i8o1bex5kirdrjhamVxUQ9tBhpHJ2AAEDNW8sghc4m2.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    ej6unYlOWMDF.pYmKDYlAmhudp(cls, "jClass");
                    if (!cls.isAnonymousClass() && !cls.isLocalClass()) {
                        if (cls.isArray()) {
                            Class<?> componentType = cls.getComponentType();
                            if (componentType.isPrimitive() && (strM9e7PWhFYLD2lOGMker = M9e7PWhFYLD2lOGMker(componentType.getName())) != null) {
                                strM9e7PWhFYLD2lOGMker2 = strM9e7PWhFYLD2lOGMker.concat("Array");
                            }
                            if (strM9e7PWhFYLD2lOGMker2 == null) {
                                strM9e7PWhFYLD2lOGMker2 = "kotlin.Array";
                            }
                        } else {
                            strM9e7PWhFYLD2lOGMker2 = M9e7PWhFYLD2lOGMker(cls.getName());
                            if (strM9e7PWhFYLD2lOGMker2 == null) {
                                strM9e7PWhFYLD2lOGMker2 = cls.getCanonicalName();
                            }
                        }
                    }
                    sb.append(strM9e7PWhFYLD2lOGMker2);
                    throw new IllegalArgumentException(sb.toString());
                }
                i = 14;
            }
            dataOutputStream.writeByte(i);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                if (i == 8) {
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i == 9) {
                    Byte b = obj2 instanceof Byte ? (Byte) obj2 : null;
                    dataOutputStream.writeByte(b != null ? b.byteValue() : (byte) 0);
                } else if (i == 10) {
                    Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i == 11) {
                    Long l = obj2 instanceof Long ? (Long) obj2 : null;
                    dataOutputStream.writeLong(l != null ? l.longValue() : 0L);
                } else if (i == 12) {
                    Float f = obj2 instanceof Float ? (Float) obj2 : null;
                    dataOutputStream.writeFloat(f != null ? f.floatValue() : 0.0f);
                } else if (i == 13) {
                    Double d = obj2 instanceof Double ? (Double) obj2 : null;
                    dataOutputStream.writeDouble(d != null ? d.doubleValue() : 0.0d);
                } else if (i == 14) {
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        }
        dataOutputStream.writeUTF(str);
    }

    public static final void ZLZeBXTMq0zDztBxtRTuCHrapQ(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    public static boolean ZfQNn8hdWlEQ5cR94249PDsLR(z0zMVFrIHPlPXE40lO7hy9QDKt8FJ[] z0zmvfrihplpxe40lo7hy9qdkt8fjArr, z0zMVFrIHPlPXE40lO7hy9QDKt8FJ[] z0zmvfrihplpxe40lo7hy9qdkt8fjArr2) {
        if (z0zmvfrihplpxe40lo7hy9qdkt8fjArr == null || z0zmvfrihplpxe40lo7hy9qdkt8fjArr2 == null || z0zmvfrihplpxe40lo7hy9qdkt8fjArr.length != z0zmvfrihplpxe40lo7hy9qdkt8fjArr2.length) {
            return false;
        }
        for (int i = 0; i < z0zmvfrihplpxe40lo7hy9qdkt8fjArr.length; i++) {
            z0zMVFrIHPlPXE40lO7hy9QDKt8FJ z0zmvfrihplpxe40lo7hy9qdkt8fj = z0zmvfrihplpxe40lo7hy9qdkt8fjArr[i];
            char c = z0zmvfrihplpxe40lo7hy9qdkt8fj.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            z0zMVFrIHPlPXE40lO7hy9QDKt8FJ z0zmvfrihplpxe40lo7hy9qdkt8fj2 = z0zmvfrihplpxe40lo7hy9qdkt8fjArr2[i];
            if (c != z0zmvfrihplpxe40lo7hy9qdkt8fj2.VxUQ9tBhpHJ2AAEDNW8sghc4m || z0zmvfrihplpxe40lo7hy9qdkt8fj.zzpBGItXfub0yWj.length != z0zmvfrihplpxe40lo7hy9qdkt8fj2.zzpBGItXfub0yWj.length) {
                return false;
            }
        }
        return true;
    }

    public static void aXO0LSrt8bKV(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static final long d9zDyyznnp3oaDT1Ug(String str, long j, long j2, long j3) {
        String property;
        boolean z;
        String str2;
        Long lValueOf;
        int i = ursTu5yfUDTCBVzqCa.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        F44whnLsbQ.zIvmSL0wzmmKGc3X39b2Gw2mUGE(10);
        int length = property.length();
        if (length == 0) {
            str2 = property;
            lValueOf = null;
            break;
        }
        int i2 = 0;
        char cCharAt = property.charAt(0);
        long j4 = -9223372036854775807L;
        if (ej6unYlOWMDF.ko09zE6UAgwkV(cCharAt, 48) < 0) {
            z = true;
            if (length != 1) {
                if (cCharAt == '+') {
                    z = false;
                    i2 = 1;
                } else if (cCharAt == '-') {
                    j4 = Long.MIN_VALUE;
                    i2 = 1;
                }
            }
            str2 = property;
            lValueOf = null;
            break;
        }
        z = false;
        long j5 = 0;
        long j6 = -256204778801521550L;
        while (i2 < length) {
            int iDigit = Character.digit((int) property.charAt(i2), 10);
            if (iDigit >= 0) {
                if (j5 >= j6) {
                    str2 = property;
                } else if (j6 == -256204778801521550L) {
                    str2 = property;
                    j6 = j4 / ((long) 10);
                    if (j5 < j6) {
                    }
                    lValueOf = null;
                    break;
                }
                long j7 = j5 * ((long) 10);
                long j8 = iDigit;
                if (j7 < j4 + j8) {
                    lValueOf = null;
                    break;
                }
                j5 = j7 - j8;
                i2++;
                property = str2;
            }
            str2 = property;
            lValueOf = null;
            break;
        }
        str2 = property;
        lValueOf = z ? Long.valueOf(j5) : Long.valueOf(-j5);
        if (lValueOf == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long jLongValue = lValueOf.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0168 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x01c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0150  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v27, types: [int] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v59 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void gBaBUmihn5l4u(android.content.Context r18, java.util.concurrent.Executor r19, com.vdodsodjsdt.ZN0iEARZEGpwTTqbyBVzgj r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 745
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.FLWIoSaHb1q8TqFvEBgPyRGrzvi6.gBaBUmihn5l4u(android.content.Context, java.util.concurrent.Executor, com.vdodsodjsdt.ZN0iEARZEGpwTTqbyBVzgj, boolean):void");
    }

    public static FLWIoSaHb1q8TqFvEBgPyRGrzvi6 h3jnZRsdwYJfY9UhQCkbvWciwvFHv(int i) {
        return i != 0 ? i != 1 ? new ZP4eo8ej66W7kmHDyh() : new Lhsy431SR0F() : new ZP4eo8ej66W7kmHDyh();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void iKANjmyTSxO6v6UuLPdu7DxOjlS(MGk7KfXeUv8YAfWiUw5LfOd mGk7KfXeUv8YAfWiUw5LfOd, Y5mpEs4XqQ8WYSIF y5mpEs4XqQ8WYSIF, Y5mpEs4XqQ8WYSIF y5mpEs4XqQ8WYSIF2) {
        try {
            F44whnLsbQ.vXWl0o6I4U59CgHs9(sGipz63rTUmSj3uFDvOtzihao.qNPQb1obP7(((c2NCuhRgMI2BFzsocC) mGk7KfXeUv8YAfWiUw5LfOd).M9e7PWhFYLD2lOGMker(y5mpEs4XqQ8WYSIF2, y5mpEs4XqQ8WYSIF)), hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        } catch (Throwable th) {
            y5mpEs4XqQ8WYSIF2.ZLZeBXTMq0zDztBxtRTuCHrapQ(ej6unYlOWMDF.vBGA6pPLqSMuYGvprl270j7(th));
            throw th;
        }
    }

    public static z0zMVFrIHPlPXE40lO7hy9QDKt8FJ[] jW7EiD0YL6xkbB158jMUzhWNWb1y(z0zMVFrIHPlPXE40lO7hy9QDKt8FJ[] z0zmvfrihplpxe40lo7hy9qdkt8fjArr) {
        z0zMVFrIHPlPXE40lO7hy9QDKt8FJ[] z0zmvfrihplpxe40lo7hy9qdkt8fjArr2 = new z0zMVFrIHPlPXE40lO7hy9QDKt8FJ[z0zmvfrihplpxe40lo7hy9qdkt8fjArr.length];
        for (int i = 0; i < z0zmvfrihplpxe40lo7hy9qdkt8fjArr.length; i++) {
            z0zmvfrihplpxe40lo7hy9qdkt8fjArr2[i] = new z0zMVFrIHPlPXE40lO7hy9QDKt8FJ(z0zmvfrihplpxe40lo7hy9qdkt8fjArr[i]);
        }
        return z0zmvfrihplpxe40lo7hy9qdkt8fjArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:44:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.vdodsodjsdt.z0zMVFrIHPlPXE40lO7hy9QDKt8FJ[] ko09zE6UAgwkV(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.FLWIoSaHb1q8TqFvEBgPyRGrzvi6.ko09zE6UAgwkV(java.lang.String):com.vdodsodjsdt.z0zMVFrIHPlPXE40lO7hy9QDKt8FJ[]");
    }

    public static boolean p59rPv72J9(File file, Resources resources, int i) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
        } catch (Throwable th) {
            th = th;
            inputStreamOpenRawResource = null;
        }
        try {
            boolean zCa81ebIan1u = Ca81ebIan1u(file, inputStreamOpenRawResource);
            HzCpKshMOoaw76hFcbOVRYMeRd(inputStreamOpenRawResource);
            return zCa81ebIan1u;
        } catch (Throwable th2) {
            th = th2;
            HzCpKshMOoaw76hFcbOVRYMeRd(inputStreamOpenRawResource);
            throw th;
        }
    }

    public static VKeHn9sH669RutJ8aaqncC pYmKDYlAmhudp(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : iArr) {
            try {
                builder.addCapability(i);
            } catch (IllegalArgumentException e) {
                psATg3LCCdmDIiRgW psatg3lccdmdiirgwLaeGQIruHQu81hfJldjMOQSVblH3x = psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x();
                String str = VKeHn9sH669RutJ8aaqncC.zzpBGItXfub0yWj;
                String str2 = VKeHn9sH669RutJ8aaqncC.zzpBGItXfub0yWj;
                String str3 = "Ignoring adding capability '" + i + '\'';
                if (psatg3lccdmdiirgwLaeGQIruHQu81hfJldjMOQSVblH3x.VxUQ9tBhpHJ2AAEDNW8sghc4m <= 5) {
                    Log.w(str2, str3, e);
                }
            }
        }
        int[] iArr3 = ej6unYlOWMDF.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr3[i2];
            int length = iArr.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    i4 = -1;
                    break;
                }
                if (i3 == iArr[i4]) {
                    break;
                }
                i4++;
            }
            if (!(i4 >= 0)) {
                try {
                    builder.removeCapability(i3);
                } catch (IllegalArgumentException e2) {
                    psATg3LCCdmDIiRgW psatg3lccdmdiirgwLaeGQIruHQu81hfJldjMOQSVblH3x2 = psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x();
                    String str4 = VKeHn9sH669RutJ8aaqncC.zzpBGItXfub0yWj;
                    String str5 = VKeHn9sH669RutJ8aaqncC.zzpBGItXfub0yWj;
                    String str6 = "Ignoring removing default capability '" + i3 + '\'';
                    if (psatg3lccdmdiirgwLaeGQIruHQu81hfJldjMOQSVblH3x2.VxUQ9tBhpHJ2AAEDNW8sghc4m <= 5) {
                        Log.w(str5, str6, e2);
                    }
                }
            }
        }
        for (int i5 : iArr2) {
            builder.addTransportType(i5);
        }
        NetworkRequest networkRequestBuild = builder.build();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(networkRequestBuild, "networkRequest.build()");
        return new VKeHn9sH669RutJ8aaqncC(networkRequestBuild);
    }

    public static MappedByteBuffer pzqP2AqKW6J5PO8zCKnW(Context context, Uri uri) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static PVtnHWoGacfAJXum4 q11o1hieEkZDhF1MGOZI26oZiDT(SSLSession sSLSession) throws IOException {
        Object objGI83zq0G8e7zkn;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        E246m2jcOzL76dqF e246m2jcOzL76dqFKUYypEB4eNWOZWVDpH = E246m2jcOzL76dqF.zzpBGItXfub0yWj.KUYypEB4eNWOZWVDpH(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        V04OhIg9zB.ZfQNn8hdWlEQ5cR94249PDsLR.getClass();
        V04OhIg9zB v04OhIg9zBZzpBGItXfub0yWj = VSncX8ksA0tswc2TMhzhOMdd.zzpBGItXfub0yWj(protocol);
        try {
            objGI83zq0G8e7zkn = U7JVXX1Kyh43VgUF.GI83zq0G8e7zkn(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            objGI83zq0G8e7zkn = zyfAMJWWt8IroEev2OgKlBxvdV.V57tEvNfxZVVcOCAOih5PKr;
        }
        return new PVtnHWoGacfAJXum4(v04OhIg9zBZzpBGItXfub0yWj, e246m2jcOzL76dqFKUYypEB4eNWOZWVDpH, U7JVXX1Kyh43VgUF.GI83zq0G8e7zkn(sSLSession.getLocalCertificates()), new hfnU5q1H9m1kOmNb(1, objGI83zq0G8e7zkn));
    }

    public static float[] q1wNbhk2O6(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static Object qNPQb1obP7(String str, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 34) {
            return OHRoAMjK5gn3.V57tEvNfxZVVcOCAOih5PKr(str, bundle);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (zHpcvbo7P2.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String qygqjTppWwx992(String str) {
        int iHashCode = str.hashCode();
        switch (iHashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "Companion";
                }
                return null;
            default:
                switch (iHashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (iHashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (iHashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static String vBGA6pPLqSMuYGvprl270j7(uDRHTE5hsm7JpGOnK7F udrhte5hsm7jpgonk7f) {
        StringBuilder sb = new StringBuilder(udrhte5hsm7jpgonk7f.size());
        for (int i = 0; i < udrhte5hsm7jpgonk7f.size(); i++) {
            byte bVxUQ9tBhpHJ2AAEDNW8sghc4m = udrhte5hsm7jpgonk7f.VxUQ9tBhpHJ2AAEDNW8sghc4m(i);
            if (bVxUQ9tBhpHJ2AAEDNW8sghc4m == 34) {
                sb.append("\\\"");
            } else if (bVxUQ9tBhpHJ2AAEDNW8sghc4m == 39) {
                sb.append("\\'");
            } else if (bVxUQ9tBhpHJ2AAEDNW8sghc4m != 92) {
                switch (bVxUQ9tBhpHJ2AAEDNW8sghc4m) {
                    case g8kevnL6UKpr15IYtcPJXuLo1L4.DOUBLE_FIELD_NUMBER /* 7 */:
                        sb.append("\\a");
                        break;
                    case g8kevnL6UKpr15IYtcPJXuLo1L4.BYTES_FIELD_NUMBER /* 8 */:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bVxUQ9tBhpHJ2AAEDNW8sghc4m < 32 || bVxUQ9tBhpHJ2AAEDNW8sghc4m > 126) {
                            sb.append('\\');
                            sb.append((char) (((bVxUQ9tBhpHJ2AAEDNW8sghc4m >>> 6) & 3) + 48));
                            sb.append((char) (((bVxUQ9tBhpHJ2AAEDNW8sghc4m >>> 3) & 7) + 48));
                            sb.append((char) ((bVxUQ9tBhpHJ2AAEDNW8sghc4m & 7) + 48));
                        } else {
                            sb.append((char) bVxUQ9tBhpHJ2AAEDNW8sghc4m);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static TypedArray vE4yDIjexsP2lGjLaTcB(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        LaeGQIruHQu81hfJldjMOQSVblH3x(context, attributeSet, i, i2);
        NSjgqmGjEzuugn2SsG1mZFP(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static final String wRCD0SdqWCowdYU7bmzN(int i) {
        if (i == 0) {
            return "0";
        }
        char[] cArr = KfeOQNOupsCg6878zi4e.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int i2 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i2 < 8 && cArr2[i2] == '0') {
            i2++;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException(u9SlVAuoWhQUfJ.ZLZeBXTMq0zDztBxtRTuCHrapQ(i2, "startIndex: ", ", endIndex: 8, size: 8"));
        }
        if (i2 <= 8) {
            return new String(cArr2, i2, 8 - i2);
        }
        throw new IllegalArgumentException(u9SlVAuoWhQUfJ.ZLZeBXTMq0zDztBxtRTuCHrapQ(i2, "startIndex: ", " > endIndex: 8"));
    }

    public static void y1NaPKTl7R18DOr6e8i5(View view, EQz8nVyVxmIrHN6fNCQWutFG0b30O eQz8nVyVxmIrHN6fNCQWutFG0b30O) {
        kpVE7S4FrjjO5 kpve7s4frjjo5 = eQz8nVyVxmIrHN6fNCQWutFG0b30O.ZfQNn8hdWlEQ5cR94249PDsLR.V57tEvNfxZVVcOCAOih5PKr;
        if (kpve7s4frjjo5 == null || !kpve7s4frjjo5.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            return;
        }
        float elevation = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            elevation += ((View) parent).getElevation();
        }
        UBOeuWsbhSgSQGqnIbdJ9ZBGKUI3 uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3 = eQz8nVyVxmIrHN6fNCQWutFG0b30O.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3.q1wNbhk2O6 != elevation) {
            uBOeuWsbhSgSQGqnIbdJ9ZBGKUI3.q1wNbhk2O6 = elevation;
            eQz8nVyVxmIrHN6fNCQWutFG0b30O.jW7EiD0YL6xkbB158jMUzhWNWb1y();
        }
    }

    public static byte[] ymT6yQrus3w(c9cdYDXIxS3U c9cdydxixs3u) {
        ej6unYlOWMDF.pYmKDYlAmhudp(c9cdydxixs3u, "data");
        HashMap map = c9cdydxixs3u.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                dataOutputStream.writeInt(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    YdNRGRc4rly(dataOutputStream, (String) entry.getKey(), entry.getValue());
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(byteArray, "{\n                ByteAr…          }\n            }");
                return byteArray;
            } finally {
            }
        } catch (IOException e) {
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().ZfQNn8hdWlEQ5cR94249PDsLR(aKozz2KH3TgtX7U19.VxUQ9tBhpHJ2AAEDNW8sghc4m, "Error in Data#toByteArray: ", e);
            return new byte[0];
        }
    }

    public static final void zIvmSL0wzmmKGc3X39b2Gw2mUGE(WorkDatabase workDatabase, Eh21X7fdrXs eh21X7fdrXs, Ux5CG4Z7p3K8gvz6V6O ux5CG4Z7p3K8gvz6V6O) {
        int i;
        ej6unYlOWMDF.pYmKDYlAmhudp(workDatabase, "workDatabase");
        ej6unYlOWMDF.pYmKDYlAmhudp(eh21X7fdrXs, "configuration");
        ArrayList arrayListH2VFYNJEVGAX = kzhIjSJtHYuLoiUgKqSRIck3W8.H2VFYNJEVGAX(ux5CG4Z7p3K8gvz6V6O);
        int i2 = 0;
        while (!arrayListH2VFYNJEVGAX.isEmpty()) {
            List list = ((Ux5CG4Z7p3K8gvz6V6O) gYXV3FZbh17i6ocMo1T.ubNpdCC1pl7L(arrayListH2VFYNJEVGAX)).GI83zq0G8e7zkn;
            if (list.isEmpty()) {
                i = 0;
            } else {
                Iterator it = list.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (!((Dei5I6vFbwXVXgdLb) it.next()).zzpBGItXfub0yWj.M9e7PWhFYLD2lOGMker.GI83zq0G8e7zkn.isEmpty() && (i = i + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            }
            i2 += i;
        }
        if (i2 == 0) {
            return;
        }
        SX5PHeJQdzT24G3iHfmAKRZsddf sX5PHeJQdzT24G3iHfmAKRZsddfF6ZQsR6bPLvvCDNXOUc = workDatabase.f6ZQsR6bPLvvCDNXOUc();
        sX5PHeJQdzT24G3iHfmAKRZsddfF6ZQsR6bPLvvCDNXOUc.getClass();
        xgjEDGKy9VX5 xgjedgky9vx5VxUQ9tBhpHJ2AAEDNW8sghc4m = xgjEDGKy9VX5.VxUQ9tBhpHJ2AAEDNW8sghc4m("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)", 0);
        WorkDatabase_Impl workDatabase_Impl = sX5PHeJQdzT24G3iHfmAKRZsddfF6ZQsR6bPLvvCDNXOUc.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        workDatabase_Impl.zzpBGItXfub0yWj();
        Cursor cursorQ1wNbhk2O6 = workDatabase_Impl.q1wNbhk2O6(xgjedgky9vx5VxUQ9tBhpHJ2AAEDNW8sghc4m);
        try {
            int i3 = cursorQ1wNbhk2O6.moveToFirst() ? cursorQ1wNbhk2O6.getInt(0) : 0;
            cursorQ1wNbhk2O6.close();
            xgjedgky9vx5VxUQ9tBhpHJ2AAEDNW8sghc4m.M9e7PWhFYLD2lOGMker();
            int i4 = eh21X7fdrXs.M9e7PWhFYLD2lOGMker;
            if (i3 + i2 <= i4) {
                return;
            }
            throw new IllegalArgumentException("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: " + i4 + ";\nalready enqueued count: " + i3 + ";\ncurrent enqueue operation count: " + i2 + ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.");
        } catch (Throwable th) {
            cursorQ1wNbhk2O6.close();
            xgjedgky9vx5VxUQ9tBhpHJ2AAEDNW8sghc4m.M9e7PWhFYLD2lOGMker();
            throw th;
        }
    }

    public static final String zzpBGItXfub0yWj(Object[] objArr, int i, int i2, SFaXeG5AhT5EKsg5pAgE sFaXeG5AhT5EKsg5pAgE) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == sFaXeG5AhT5EKsg5pAgE) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(string, "toString(...)");
        return string;
    }

    public void f6ZQsR6bPLvvCDNXOUc(Dei5I6vFbwXVXgdLb dei5I6vFbwXVXgdLb) {
        List listHVEwbdULInpTNa0IG = KfeOQNOupsCg6878zi4e.HVEwbdULInpTNa0IG(dei5I6vFbwXVXgdLb);
        kooPss93uoBTOWlOLlaD koopss93uobtowlollad = (kooPss93uoBTOWlOLlaD) this;
        if (listHVEwbdULInpTNa0IG.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        Ux5CG4Z7p3K8gvz6V6O ux5CG4Z7p3K8gvz6V6O = new Ux5CG4Z7p3K8gvz6V6O(koopss93uobtowlollad, listHVEwbdULInpTNa0IG);
        if (!ux5CG4Z7p3K8gvz6V6O.KUYypEB4eNWOZWVDpH) {
            zonOxHotd3BwAPJcwqr6I6uQNngg4.qygqjTppWwx992(koopss93uobtowlollad.GI83zq0G8e7zkn.q1wNbhk2O6, "EnqueueRunnable_KEEP", (ki0ZWFpNS2MqGdb) koopss93uobtowlollad.HzCpKshMOoaw76hFcbOVRYMeRd.V57tEvNfxZVVcOCAOih5PKr, new hfnU5q1H9m1kOmNb(3, ux5CG4Z7p3K8gvz6V6O));
            return;
        }
        psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().NSjgqmGjEzuugn2SsG1mZFP(Ux5CG4Z7p3K8gvz6V6O.q1wNbhk2O6, "Already enqueued work ids (" + TextUtils.join(", ", ux5CG4Z7p3K8gvz6V6O.M9e7PWhFYLD2lOGMker) + ")");
    }

    public abstract void w0Wu95l8dVNw5rZMRu(WS3PVV2SF0Y6GNPIPGhbLX wS3PVV2SF0Y6GNPIPGhbLX, float f, float f2);
}
