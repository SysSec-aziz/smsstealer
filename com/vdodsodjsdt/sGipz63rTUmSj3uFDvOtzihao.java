package com.vdodsodjsdt;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.icu.text.DecimalFormatSymbols;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.text.SpannableStringBuilder;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EdgeEffect;
import android.widget.TextView;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sGipz63rTUmSj3uFDvOtzihao implements u2BfIH7vVsa {
    public static final Object[] VxUQ9tBhpHJ2AAEDNW8sghc4m = new Object[0];
    public static final String[] zzpBGItXfub0yWj = new String[0];
    public static final int[] V57tEvNfxZVVcOCAOih5PKr = {android.R.attr.theme, R.attr.theme};
    public static final int[] ZfQNn8hdWlEQ5cR94249PDsLR = {R.attr.materialThemeOverlay};
    public static final byte[] LaeGQIruHQu81hfJldjMOQSVblH3x = {112, 114, 111, 0};
    public static final byte[] zIvmSL0wzmmKGc3X39b2Gw2mUGE = {112, 114, 109, 0};
    public static final aqhhl68tQrgIjcMGB3dY2YLK3vN ZLZeBXTMq0zDztBxtRTuCHrapQ = new aqhhl68tQrgIjcMGB3dY2YLK3vN("NO_THREAD_ELEMENTS", 2);

    public static Context BJQHddi0Plr5ElWetCyaixWOg9(Context context, AttributeSet attributeSet, int i, int i2, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZfQNn8hdWlEQ5cR94249PDsLR, i, i2);
        int[] iArr2 = {typedArrayObtainStyledAttributes.getResourceId(0, 0)};
        typedArrayObtainStyledAttributes.recycle();
        int i3 = iArr2[0];
        boolean z = (context instanceof KCzdBImvv2) && ((KCzdBImvv2) context).VxUQ9tBhpHJ2AAEDNW8sghc4m == i3;
        if (i3 == 0 || z) {
            return context;
        }
        KCzdBImvv2 kCzdBImvv2 = new KCzdBImvv2(context, i3);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        if (iArr.length > 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
            for (int i4 = 0; i4 < iArr.length; i4++) {
                iArr3[i4] = typedArrayObtainStyledAttributes2.getResourceId(i4, 0);
            }
            typedArrayObtainStyledAttributes2.recycle();
        }
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = iArr3[i5];
            if (i6 != 0) {
                kCzdBImvv2.getTheme().applyStyle(i6, true);
            }
        }
        TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, V57tEvNfxZVVcOCAOih5PKr);
        int resourceId = typedArrayObtainStyledAttributes3.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(1, 0);
        typedArrayObtainStyledAttributes3.recycle();
        if (resourceId == 0) {
            resourceId = resourceId2;
        }
        if (resourceId != 0) {
            kCzdBImvv2.getTheme().applyStyle(resourceId, true);
        }
        return kCzdBImvv2;
    }

    public static byte[] Ca81ebIan1u(mO6A2OjMYtJibfDvHozS[] mo6a2ojmytjibfdvhozsArr, byte[] bArr) throws IOException {
        int i = 0;
        int length = 0;
        for (mO6A2OjMYtJibfDvHozS mo6a2ojmytjibfdvhozs : mo6a2ojmytjibfdvhozsArr) {
            length += ((((mo6a2ojmytjibfdvhozs.ZLZeBXTMq0zDztBxtRTuCHrapQ * 2) + 7) & (-8)) / 8) + (mo6a2ojmytjibfdvhozs.LaeGQIruHQu81hfJldjMOQSVblH3x * 2) + pYmKDYlAmhudp(mo6a2ojmytjibfdvhozs.VxUQ9tBhpHJ2AAEDNW8sghc4m, mo6a2ojmytjibfdvhozs.zzpBGItXfub0yWj, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + mo6a2ojmytjibfdvhozs.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, KfeOQNOupsCg6878zi4e.GI83zq0G8e7zkn)) {
            int length2 = mo6a2ojmytjibfdvhozsArr.length;
            while (i < length2) {
                mO6A2OjMYtJibfDvHozS mo6a2ojmytjibfdvhozs2 = mo6a2ojmytjibfdvhozsArr[i];
                ubNpdCC1pl7L(byteArrayOutputStream, mo6a2ojmytjibfdvhozs2, pYmKDYlAmhudp(mo6a2ojmytjibfdvhozs2.VxUQ9tBhpHJ2AAEDNW8sghc4m, mo6a2ojmytjibfdvhozs2.zzpBGItXfub0yWj, bArr));
                p6bBrs4p3Ly(byteArrayOutputStream, mo6a2ojmytjibfdvhozs2);
                i++;
            }
        } else {
            for (mO6A2OjMYtJibfDvHozS mo6a2ojmytjibfdvhozs3 : mo6a2ojmytjibfdvhozsArr) {
                ubNpdCC1pl7L(byteArrayOutputStream, mo6a2ojmytjibfdvhozs3, pYmKDYlAmhudp(mo6a2ojmytjibfdvhozs3.VxUQ9tBhpHJ2AAEDNW8sghc4m, mo6a2ojmytjibfdvhozs3.zzpBGItXfub0yWj, bArr));
            }
            int length3 = mo6a2ojmytjibfdvhozsArr.length;
            while (i < length3) {
                p6bBrs4p3Ly(byteArrayOutputStream, mo6a2ojmytjibfdvhozsArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static D73WsmU258PapcWZb45SFW CixTK5ZX8oWXHz34qHYV(RKQqw795jswHmdL5AnfuvmeBZD rKQqw795jswHmdL5AnfuvmeBZD, D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFW) {
        ej6unYlOWMDF.pYmKDYlAmhudp(d73WsmU258PapcWZb45SFW, "context");
        return d73WsmU258PapcWZb45SFW == hu3HDJRthjXEukAdCh3Tdc.V57tEvNfxZVVcOCAOih5PKr ? rKQqw795jswHmdL5AnfuvmeBZD : (D73WsmU258PapcWZb45SFW) d73WsmU258PapcWZb45SFW.M9e7PWhFYLD2lOGMker(rKQqw795jswHmdL5AnfuvmeBZD, new crw9RUdROkcOv8ePh2G6u(1));
    }

    public static final Object[] GE1sqSYiEYQO2ew7WEZwTtUeS5(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    ej6unYlOWMDF.Ca81ebIan1u(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(objArrCopyOf, "copyOf(...)");
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf == objArr) {
                            objArr[i2] = null;
                            return objArr;
                        }
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i2);
                        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(objArrCopyOf2, "copyOf(...)");
                        return objArrCopyOf2;
                    }
                    i = i2;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static void GI83zq0G8e7zkn(String str) {
        if (str.length() <= 10000) {
            return;
        }
        throw new NumberFormatException("Number string too large: " + str.substring(0, 30) + "...");
    }

    public static ActionMode.Callback H2VFYNJEVGAX(ActionMode.Callback callback) {
        return (!(callback instanceof mDy1rlG6bPilgxEozn7jUqZRTk) || Build.VERSION.SDK_INT < 26) ? callback : ((mDy1rlG6bPilgxEozn7jUqZRTk) callback).VxUQ9tBhpHJ2AAEDNW8sghc4m;
    }

    public static void HAPpjhiCsV9ONY23505HCBI9IX(ByteArrayOutputStream byteArrayOutputStream, mO6A2OjMYtJibfDvHozS mo6a2ojmytjibfdvhozs) throws IOException {
        int i = 0;
        for (Map.Entry entry : mo6a2ojmytjibfdvhozs.GI83zq0G8e7zkn.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                F44whnLsbQ.p6bBrs4p3Ly(byteArrayOutputStream, iIntValue - i);
                F44whnLsbQ.p6bBrs4p3Ly(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }

    public static final void HVEwbdULInpTNa0IG(Context context) {
        Map map;
        ej6unYlOWMDF.pYmKDYlAmhudp(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        if (databasePath.exists()) {
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(QDbjWhN5tTgu73dBwz6ag.VxUQ9tBhpHJ2AAEDNW8sghc4m, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(databasePath2, "context.getDatabasePath(WORK_DATABASE_NAME)");
            File noBackupFilesDir = context.getNoBackupFilesDir();
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(noBackupFilesDir, "context.noBackupFilesDir");
            File file = new File(noBackupFilesDir, "androidx.work.workdb");
            String[] strArr = QDbjWhN5tTgu73dBwz6ag.zzpBGItXfub0yWj;
            int iD9zDyyznnp3oaDT1Ug = QtxmZgsffC8rBsc8wSUkFg2a.d9zDyyznnp3oaDT1Ug(strArr.length);
            if (iD9zDyyznnp3oaDT1Ug < 16) {
                iD9zDyyznnp3oaDT1Ug = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iD9zDyyznnp3oaDT1Ug);
            for (String str : strArr) {
                linkedHashMap.put(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
            }
            if (linkedHashMap.isEmpty()) {
                Map mapSingletonMap = Collections.singletonMap(databasePath2, file);
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(mapSingletonMap, "singletonMap(...)");
                map = mapSingletonMap;
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                linkedHashMap2.put(databasePath2, file);
                map = linkedHashMap2;
            }
            for (Map.Entry entry : map.entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().NSjgqmGjEzuugn2SsG1mZFP(QDbjWhN5tTgu73dBwz6ag.VxUQ9tBhpHJ2AAEDNW8sghc4m, "Over-writing contents of " + file3);
                    }
                    psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(QDbjWhN5tTgu73dBwz6ag.VxUQ9tBhpHJ2AAEDNW8sghc4m, file2.renameTo(file3) ? "Migrated " + file2 + "to " + file3 : "Renaming " + file2 + " to " + file3 + " failed");
                }
            }
        }
    }

    public static int HzCpKshMOoaw76hFcbOVRYMeRd(Context context, String str) {
        int iNoteProxyOpNoThrow;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int iMyUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (iMyUid2 == iMyUid && Objects.equals(packageName2, packageName) && Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), packageName);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, iMyUid, BNx7YAOy6zSdxROhZx2.VxUQ9tBhpHJ2AAEDNW8sghc4m(context)) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, packageName);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static void ItrQwCXbty5PZtje5JS(TextView textView, int i) {
        KfeOQNOupsCg6878zi4e.HzCpKshMOoaw76hFcbOVRYMeRd(i);
        if (Build.VERSION.SDK_INT >= 28) {
            kHXwlw9VpxBho.q1wNbhk2O6(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static final void JUdwvN8LfOMa(D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFW, Object obj) {
        if (obj == ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            return;
        }
        if (!(obj instanceof cEGXYZP8M9yphr2SfX0LLEudV)) {
            Object objM9e7PWhFYLD2lOGMker = d73WsmU258PapcWZb45SFW.M9e7PWhFYLD2lOGMker(null, M43IFB1xONkIzX.GI83zq0G8e7zkn);
            ej6unYlOWMDF.Ca81ebIan1u(objM9e7PWhFYLD2lOGMker, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            u9SlVAuoWhQUfJ.q1wNbhk2O6(objM9e7PWhFYLD2lOGMker);
            throw null;
        }
        cEGXYZP8M9yphr2SfX0LLEudV cegxyzp8m9yphr2sfx0lleudv = (cEGXYZP8M9yphr2SfX0LLEudV) obj;
        oTHHhhOFhSGaTE0oJZTnUCrF[] othhhhofhsgate0ojztnucrfArr = cegxyzp8m9yphr2sfx0lleudv.zzpBGItXfub0yWj;
        int length = othhhhofhsgate0ojztnucrfArr.length - 1;
        if (length < 0) {
            return;
        }
        oTHHhhOFhSGaTE0oJZTnUCrF othhhhofhsgate0ojztnucrf = othhhhofhsgate0ojztnucrfArr[length];
        ej6unYlOWMDF.p59rPv72J9(null);
        Object obj2 = cegxyzp8m9yphr2sfx0lleudv.VxUQ9tBhpHJ2AAEDNW8sghc4m[length];
        throw null;
    }

    public static int KUYypEB4eNWOZWVDpH(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static final Object KYZ9RyuOc42A2J(D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFW) {
        Object objM9e7PWhFYLD2lOGMker = d73WsmU258PapcWZb45SFW.M9e7PWhFYLD2lOGMker(0, M43IFB1xONkIzX.NSjgqmGjEzuugn2SsG1mZFP);
        ej6unYlOWMDF.p59rPv72J9(objM9e7PWhFYLD2lOGMker);
        return objM9e7PWhFYLD2lOGMker;
    }

    public static mO6A2OjMYtJibfDvHozS[] L8DMw02rUTs2w(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, KfeOQNOupsCg6878zi4e.NSjgqmGjEzuugn2SsG1mZFP)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iHKs1wlZyvtUNaW1f5ABIGacfPcvX = (int) F44whnLsbQ.hKs1wlZyvtUNaW1f5ABIGacfPcvX(fileInputStream, 1);
        byte[] bArrItrQwCXbty5PZtje5JS = F44whnLsbQ.ItrQwCXbty5PZtje5JS(fileInputStream, (int) F44whnLsbQ.hKs1wlZyvtUNaW1f5ABIGacfPcvX(fileInputStream, 4), (int) F44whnLsbQ.hKs1wlZyvtUNaW1f5ABIGacfPcvX(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrItrQwCXbty5PZtje5JS);
        try {
            mO6A2OjMYtJibfDvHozS[] mo6a2ojmytjibfdvhozsArrLQ0rO9lhQIyVe7Rp6 = lQ0rO9lhQIyVe7Rp6(byteArrayInputStream, str, iHKs1wlZyvtUNaW1f5ABIGacfPcvX);
            byteArrayInputStream.close();
            return mo6a2ojmytjibfdvhozsArrLQ0rO9lhQIyVe7Rp6;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void LaeGQIruHQu81hfJldjMOQSVblH3x(Throwable th, Throwable th2) {
        ej6unYlOWMDF.pYmKDYlAmhudp(th, "<this>");
        ej6unYlOWMDF.pYmKDYlAmhudp(th2, "exception");
        if (th != th2) {
            Integer num = VRnmrExEJFI.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = TtcSu7NdvSAZTEeHznS9.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static void M9e7PWhFYLD2lOGMker(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i > i2) {
                throw new IllegalArgumentException(u9SlVAuoWhQUfJ.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i, i2, "fromIndex: ", " > toIndex: "));
            }
            return;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
    }

    public static OwOLjYacvvUWq NSjgqmGjEzuugn2SsG1mZFP(OwOLjYacvvUWq owOLjYacvvUWq) {
        oYF7tn6ZjRnUNeIFvj8JBjiJ8Nv9 oyf7tn6zjrnuneifvj8jbjij8nv9 = owOLjYacvvUWq.V57tEvNfxZVVcOCAOih5PKr;
        oyf7tn6zjrnuneifvj8jbjij8nv9.zzpBGItXfub0yWj();
        return oyf7tn6zjrnuneifvj8jbjij8nv9.HzCpKshMOoaw76hFcbOVRYMeRd > 0 ? owOLjYacvvUWq : OwOLjYacvvUWq.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    public static Typeface O1xDAlBZZlZdoEf747lCFHld(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, KUYypEB4eNWOZWVDpH(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    public static boolean SuB3hEmTmbbRGAhtvOOmfKEon(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
    }

    public static float TqcnImqkSWIKht(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return qqKWL2qopCW20X.V57tEvNfxZVVcOCAOih5PKr(edgeEffect, f, f2);
        }
        S9NCLh7hE41priutYdlJWr.VxUQ9tBhpHJ2AAEDNW8sghc4m(edgeEffect, f, f2);
        return f;
    }

    public static mO6A2OjMYtJibfDvHozS[] YdNRGRc4rly(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, mO6A2OjMYtJibfDvHozS[] mo6a2ojmytjibfdvhozsArr) throws IOException {
        byte[] bArr3 = KfeOQNOupsCg6878zi4e.KUYypEB4eNWOZWVDpH;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, KfeOQNOupsCg6878zi4e.q1wNbhk2O6)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iHKs1wlZyvtUNaW1f5ABIGacfPcvX = (int) F44whnLsbQ.hKs1wlZyvtUNaW1f5ABIGacfPcvX(fileInputStream, 2);
            byte[] bArrItrQwCXbty5PZtje5JS = F44whnLsbQ.ItrQwCXbty5PZtje5JS(fileInputStream, (int) F44whnLsbQ.hKs1wlZyvtUNaW1f5ABIGacfPcvX(fileInputStream, 4), (int) F44whnLsbQ.hKs1wlZyvtUNaW1f5ABIGacfPcvX(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrItrQwCXbty5PZtje5JS);
            try {
                mO6A2OjMYtJibfDvHozS[] mo6a2ojmytjibfdvhozsArrGBaBUmihn5l4u = gBaBUmihn5l4u(byteArrayInputStream, bArr2, iHKs1wlZyvtUNaW1f5ABIGacfPcvX, mo6a2ojmytjibfdvhozsArr);
                byteArrayInputStream.close();
                return mo6a2ojmytjibfdvhozsArrGBaBUmihn5l4u;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(KfeOQNOupsCg6878zi4e.ZLZeBXTMq0zDztBxtRTuCHrapQ, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iHKs1wlZyvtUNaW1f5ABIGacfPcvX2 = (int) F44whnLsbQ.hKs1wlZyvtUNaW1f5ABIGacfPcvX(fileInputStream, 1);
        byte[] bArrItrQwCXbty5PZtje5JS2 = F44whnLsbQ.ItrQwCXbty5PZtje5JS(fileInputStream, (int) F44whnLsbQ.hKs1wlZyvtUNaW1f5ABIGacfPcvX(fileInputStream, 4), (int) F44whnLsbQ.hKs1wlZyvtUNaW1f5ABIGacfPcvX(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrItrQwCXbty5PZtje5JS2);
        try {
            mO6A2OjMYtJibfDvHozS[] mo6a2ojmytjibfdvhozsArrWRCD0SdqWCowdYU7bmzN = wRCD0SdqWCowdYU7bmzN(byteArrayInputStream2, iHKs1wlZyvtUNaW1f5ABIGacfPcvX2, mo6a2ojmytjibfdvhozsArr);
            byteArrayInputStream2.close();
            return mo6a2ojmytjibfdvhozsArrWRCD0SdqWCowdYU7bmzN;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static final Object Z1FjjMJ0suz8AFI7gsA4GDLMXv(D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFW, Object obj) {
        if (obj == null) {
            obj = KYZ9RyuOc42A2J(d73WsmU258PapcWZb45SFW);
        }
        if (obj == 0) {
            return ZLZeBXTMq0zDztBxtRTuCHrapQ;
        }
        if (obj instanceof Integer) {
            return d73WsmU258PapcWZb45SFW.M9e7PWhFYLD2lOGMker(new cEGXYZP8M9yphr2SfX0LLEudV(((Number) obj).intValue(), d73WsmU258PapcWZb45SFW), M43IFB1xONkIzX.M9e7PWhFYLD2lOGMker);
        }
        u9SlVAuoWhQUfJ.q1wNbhk2O6(obj);
        throw null;
    }

    public static boolean ZLZeBXTMq0zDztBxtRTuCHrapQ(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0082 -> B:25:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0085 -> B:25:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object ZfQNn8hdWlEQ5cR94249PDsLR(java.util.List r6, com.vdodsodjsdt.cKNTwymzwLXrvpS2nTMrj r7, com.vdodsodjsdt.tfu79AIgc4CGAZaxd4HhD r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof com.vdodsodjsdt.xahSd0ZAwGFb7jem3TXwXn8g6lG
            if (r0 == 0) goto L13
            r0 = r8
            com.vdodsodjsdt.xahSd0ZAwGFb7jem3TXwXn8g6lG r0 = (com.vdodsodjsdt.xahSd0ZAwGFb7jem3TXwXn8g6lG) r0
            int r1 = r0.GI83zq0G8e7zkn
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.GI83zq0G8e7zkn = r1
            goto L18
        L13:
            com.vdodsodjsdt.xahSd0ZAwGFb7jem3TXwXn8g6lG r0 = new com.vdodsodjsdt.xahSd0ZAwGFb7jem3TXwXn8g6lG
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.NSjgqmGjEzuugn2SsG1mZFP
            int r1 = r0.GI83zq0G8e7zkn
            r2 = 2
            r3 = 1
            com.vdodsodjsdt.w0JnONr1KwCkZY9pA0QjUDuh9aMcU r4 = com.vdodsodjsdt.w0JnONr1KwCkZY9pA0QjUDuh9aMcU.V57tEvNfxZVVcOCAOih5PKr
            if (r1 == 0) goto L42
            if (r1 == r3) goto L3a
            if (r1 != r2) goto L32
            java.util.Iterator r6 = r0.ZLZeBXTMq0zDztBxtRTuCHrapQ
            java.io.Serializable r7 = r0.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            com.vdodsodjsdt.coWWo2PO13fOPO r7 = (com.vdodsodjsdt.coWWo2PO13fOPO) r7
            com.vdodsodjsdt.ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(r8)     // Catch: java.lang.Throwable -> L30
            goto L65
        L30:
            r8 = move-exception
            goto L7e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.io.Serializable r6 = r0.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            java.util.List r6 = (java.util.List) r6
            com.vdodsodjsdt.ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(r8)
            goto L5c
        L42:
            com.vdodsodjsdt.ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            com.vdodsodjsdt.FraScyvWVdKLHI4dEwh8h1WO4 r1 = new com.vdodsodjsdt.FraScyvWVdKLHI4dEwh8h1WO4
            r5 = 0
            r1.<init>(r6, r8, r5)
            r0.zIvmSL0wzmmKGc3X39b2Gw2mUGE = r8
            r0.GI83zq0G8e7zkn = r3
            java.lang.Object r6 = r7.VxUQ9tBhpHJ2AAEDNW8sghc4m(r1, r0)
            if (r6 != r4) goto L5b
            goto L93
        L5b:
            r6 = r8
        L5c:
            com.vdodsodjsdt.coWWo2PO13fOPO r7 = new com.vdodsodjsdt.coWWo2PO13fOPO
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L65:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L8b
            java.lang.Object r8 = r6.next()
            com.vdodsodjsdt.vP57smEEh3YGCxzJ r8 = (com.vdodsodjsdt.vP57smEEh3YGCxzJ) r8
            r0.zIvmSL0wzmmKGc3X39b2Gw2mUGE = r7     // Catch: java.lang.Throwable -> L30
            r0.ZLZeBXTMq0zDztBxtRTuCHrapQ = r6     // Catch: java.lang.Throwable -> L30
            r0.GI83zq0G8e7zkn = r2     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r8.GI83zq0G8e7zkn(r0)     // Catch: java.lang.Throwable -> L30
            if (r8 != r4) goto L65
            goto L93
        L7e:
            java.lang.Object r1 = r7.V57tEvNfxZVVcOCAOih5PKr
            if (r1 != 0) goto L85
            r7.V57tEvNfxZVVcOCAOih5PKr = r8
            goto L65
        L85:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            LaeGQIruHQu81hfJldjMOQSVblH3x(r1, r8)
            goto L65
        L8b:
            java.lang.Object r6 = r7.V57tEvNfxZVVcOCAOih5PKr
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 != 0) goto L94
            com.vdodsodjsdt.hMtEZx9LFZEOBsEChkiRKnXNYh1GG r4 = com.vdodsodjsdt.hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m
        L93:
            return r4
        L94:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao.ZfQNn8hdWlEQ5cR94249PDsLR(java.util.List, com.vdodsodjsdt.cKNTwymzwLXrvpS2nTMrj, com.vdodsodjsdt.tfu79AIgc4CGAZaxd4HhD):java.lang.Object");
    }

    public static k5xHLp7fCPX0ktLE3ej5tGjGJa aXO0LSrt8bKV(final D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFW, final MGk7KfXeUv8YAfWiUw5LfOd mGk7KfXeUv8YAfWiUw5LfOd) {
        ej6unYlOWMDF.pYmKDYlAmhudp(d73WsmU258PapcWZb45SFW, "context");
        final Ho90S2EW0SHKgWtNbbE4M9TX ho90S2EW0SHKgWtNbbE4M9TX = Ho90S2EW0SHKgWtNbbE4M9TX.V57tEvNfxZVVcOCAOih5PKr;
        return ej6unYlOWMDF.RhfGHxtXxy0M0grmp2jkRjQg(new jugN3Lijm1(ho90S2EW0SHKgWtNbbE4M9TX, mGk7KfXeUv8YAfWiUw5LfOd) { // from class: com.vdodsodjsdt.L3penzsD72LpI
            public final /* synthetic */ GvuED9Eb9kjnYjng4BPJg7J V57tEvNfxZVVcOCAOih5PKr;
            public final /* synthetic */ Ho90S2EW0SHKgWtNbbE4M9TX zzpBGItXfub0yWj;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.V57tEvNfxZVVcOCAOih5PKr = (GvuED9Eb9kjnYjng4BPJg7J) mGk7KfXeUv8YAfWiUw5LfOd;
            }

            /* JADX WARN: Type inference failed for: r2v1, types: [com.vdodsodjsdt.GvuED9Eb9kjnYjng4BPJg7J, com.vdodsodjsdt.MGk7KfXeUv8YAfWiUw5LfOd] */
            @Override // com.vdodsodjsdt.jugN3Lijm1
            public final Object VxUQ9tBhpHJ2AAEDNW8sghc4m(VhYG3Kn7PElrnIYowGX3UR vhYG3Kn7PElrnIYowGX3UR) {
                IN79WcIk5xB4t0GjRT43qPLs5 iN79WcIk5xB4t0GjRT43qPLs5 = IN79WcIk5xB4t0GjRT43qPLs5.HzCpKshMOoaw76hFcbOVRYMeRd;
                D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFW2 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                lUqBmUbL53IL3VMM8GT8 luqbmubl53il3vmm8gt8 = new lUqBmUbL53IL3VMM8GT8(8, (sJ612dvaOBrP4lDkAwxzLpcxONSSp) d73WsmU258PapcWZb45SFW2.q11o1hieEkZDhF1MGOZI26oZiDT(iN79WcIk5xB4t0GjRT43qPLs5));
                bZonrKCuJyDEES bzonrkcujydees = vhYG3Kn7PElrnIYowGX3UR.V57tEvNfxZVVcOCAOih5PKr;
                if (bzonrkcujydees != null) {
                    bzonrkcujydees.VxUQ9tBhpHJ2AAEDNW8sghc4m(luqbmubl53il3vmm8gt8, M1AQjX17IIqtW1mEGSLJGUSZk4OZ.V57tEvNfxZVVcOCAOih5PKr);
                }
                return F44whnLsbQ.TqcnImqkSWIKht(zonOxHotd3BwAPJcwqr6I6uQNngg4.zzpBGItXfub0yWj(d73WsmU258PapcWZb45SFW2), null, this.zzpBGItXfub0yWj, new gAuZgsHe09zkBKSLqYXmZ((MGk7KfXeUv8YAfWiUw5LfOd) this.V57tEvNfxZVVcOCAOih5PKr, vhYG3Kn7PElrnIYowGX3UR, (IvfXhmjM3e3K) null), 1);
            }
        });
    }

    public static Context bjhcQ0u7VT2OYYrwk96HrWoN(Context context, AttributeSet attributeSet, int i, int i2) {
        return BJQHddi0Plr5ElWetCyaixWOg9(context, attributeSet, i, i2, new int[0]);
    }

    public static BigDecimal d9zDyyznnp3oaDT1Ug(String str) {
        GI83zq0G8e7zkn(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    public static mO6A2OjMYtJibfDvHozS[] gBaBUmihn5l4u(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, mO6A2OjMYtJibfDvHozS[] mo6a2ojmytjibfdvhozsArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new mO6A2OjMYtJibfDvHozS[0];
        }
        if (i != mo6a2ojmytjibfdvhozsArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            F44whnLsbQ.hKs1wlZyvtUNaW1f5ABIGacfPcvX(byteArrayInputStream, 2);
            String str = new String(F44whnLsbQ.JUdwvN8LfOMa(byteArrayInputStream, (int) F44whnLsbQ.hKs1wlZyvtUNaW1f5ABIGacfPcvX(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jHKs1wlZyvtUNaW1f5ABIGacfPcvX = F44whnLsbQ.hKs1wlZyvtUNaW1f5ABIGacfPcvX(byteArrayInputStream, 4);
            int iHKs1wlZyvtUNaW1f5ABIGacfPcvX = (int) F44whnLsbQ.hKs1wlZyvtUNaW1f5ABIGacfPcvX(byteArrayInputStream, 2);
            mO6A2OjMYtJibfDvHozS mo6a2ojmytjibfdvhozs = null;
            if (mo6a2ojmytjibfdvhozsArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i3 = 0;
                while (true) {
                    if (i3 >= mo6a2ojmytjibfdvhozsArr.length) {
                        break;
                    }
                    if (mo6a2ojmytjibfdvhozsArr[i3].zzpBGItXfub0yWj.equals(strSubstring)) {
                        mo6a2ojmytjibfdvhozs = mo6a2ojmytjibfdvhozsArr[i3];
                        break;
                    }
                    i3++;
                }
            }
            if (mo6a2ojmytjibfdvhozs == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            mo6a2ojmytjibfdvhozs.ZfQNn8hdWlEQ5cR94249PDsLR = jHKs1wlZyvtUNaW1f5ABIGacfPcvX;
            int[] iArrYmT6yQrus3w = ymT6yQrus3w(byteArrayInputStream, iHKs1wlZyvtUNaW1f5ABIGacfPcvX);
            if (Arrays.equals(bArr, KfeOQNOupsCg6878zi4e.HzCpKshMOoaw76hFcbOVRYMeRd)) {
                mo6a2ojmytjibfdvhozs.LaeGQIruHQu81hfJldjMOQSVblH3x = iHKs1wlZyvtUNaW1f5ABIGacfPcvX;
                mo6a2ojmytjibfdvhozs.NSjgqmGjEzuugn2SsG1mZFP = iArrYmT6yQrus3w;
            }
        }
        return mo6a2ojmytjibfdvhozsArr;
    }

    public static boolean h3jnZRsdwYJfY9UhQCkbvWciwvFHv(String str, String str2) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "current");
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str.length()) {
                    char cCharAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && cCharAt != '(') {
                        break;
                    }
                    if (cCharAt != '(') {
                        if (cCharAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                            break;
                        }
                    } else {
                        i2++;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    String strSubstring = str.substring(1, str.length() - 1);
                    ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(cwhrCnoVJBjJE2CBEAvBopmgF.tf2p6GzNN7uQY7Lun0pJ(strSubstring).toString(), str2);
                }
            }
        }
        return false;
    }

    public static void hKs1wlZyvtUNaW1f5ABIGacfPcvX(TextView textView, int i) {
        KfeOQNOupsCg6878zi4e.HzCpKshMOoaw76hFcbOVRYMeRd(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void iKANjmyTSxO6v6UuLPdu7DxOjlS(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static RKQqw795jswHmdL5AnfuvmeBZD ko09zE6UAgwkV(RKQqw795jswHmdL5AnfuvmeBZD rKQqw795jswHmdL5AnfuvmeBZD, DenmIypSdw0qfxt denmIypSdw0qfxt) {
        ej6unYlOWMDF.pYmKDYlAmhudp(denmIypSdw0qfxt, "key");
        if (ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(rKQqw795jswHmdL5AnfuvmeBZD.getKey(), denmIypSdw0qfxt)) {
            return rKQqw795jswHmdL5AnfuvmeBZD;
        }
        return null;
    }

    public static mO6A2OjMYtJibfDvHozS[] lQ0rO9lhQIyVe7Rp6(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new mO6A2OjMYtJibfDvHozS[0];
        }
        mO6A2OjMYtJibfDvHozS[] mo6a2ojmytjibfdvhozsArr = new mO6A2OjMYtJibfDvHozS[i];
        for (int i3 = 0; i3 < i; i3++) {
            int iHKs1wlZyvtUNaW1f5ABIGacfPcvX = (int) F44whnLsbQ.hKs1wlZyvtUNaW1f5ABIGacfPcvX(byteArrayInputStream, 2);
            int iHKs1wlZyvtUNaW1f5ABIGacfPcvX2 = (int) F44whnLsbQ.hKs1wlZyvtUNaW1f5ABIGacfPcvX(byteArrayInputStream, 2);
            mo6a2ojmytjibfdvhozsArr[i3] = new mO6A2OjMYtJibfDvHozS(str, new String(F44whnLsbQ.JUdwvN8LfOMa(byteArrayInputStream, iHKs1wlZyvtUNaW1f5ABIGacfPcvX), StandardCharsets.UTF_8), F44whnLsbQ.hKs1wlZyvtUNaW1f5ABIGacfPcvX(byteArrayInputStream, 4), iHKs1wlZyvtUNaW1f5ABIGacfPcvX2, (int) F44whnLsbQ.hKs1wlZyvtUNaW1f5ABIGacfPcvX(byteArrayInputStream, 4), (int) F44whnLsbQ.hKs1wlZyvtUNaW1f5ABIGacfPcvX(byteArrayInputStream, 4), new int[iHKs1wlZyvtUNaW1f5ABIGacfPcvX2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            mO6A2OjMYtJibfDvHozS mo6a2ojmytjibfdvhozs = mo6a2ojmytjibfdvhozsArr[i4];
            int iAvailable = byteArrayInputStream.available();
            int i5 = mo6a2ojmytjibfdvhozs.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            int i6 = mo6a2ojmytjibfdvhozs.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            TreeMap treeMap = mo6a2ojmytjibfdvhozs.GI83zq0G8e7zkn;
            int i7 = iAvailable - i5;
            int iHKs1wlZyvtUNaW1f5ABIGacfPcvX3 = i2;
            while (byteArrayInputStream.available() > i7) {
                iHKs1wlZyvtUNaW1f5ABIGacfPcvX3 += (int) F44whnLsbQ.hKs1wlZyvtUNaW1f5ABIGacfPcvX(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iHKs1wlZyvtUNaW1f5ABIGacfPcvX3), 1);
                int iHKs1wlZyvtUNaW1f5ABIGacfPcvX4 = (int) F44whnLsbQ.hKs1wlZyvtUNaW1f5ABIGacfPcvX(byteArrayInputStream, 2);
                while (iHKs1wlZyvtUNaW1f5ABIGacfPcvX4 > 0) {
                    F44whnLsbQ.hKs1wlZyvtUNaW1f5ABIGacfPcvX(byteArrayInputStream, 2);
                    int iHKs1wlZyvtUNaW1f5ABIGacfPcvX5 = (int) F44whnLsbQ.hKs1wlZyvtUNaW1f5ABIGacfPcvX(byteArrayInputStream, 1);
                    if (iHKs1wlZyvtUNaW1f5ABIGacfPcvX5 != 6 && iHKs1wlZyvtUNaW1f5ABIGacfPcvX5 != 7) {
                        while (iHKs1wlZyvtUNaW1f5ABIGacfPcvX5 > 0) {
                            F44whnLsbQ.hKs1wlZyvtUNaW1f5ABIGacfPcvX(byteArrayInputStream, 1);
                            int i8 = i2;
                            int i9 = i4;
                            for (int iHKs1wlZyvtUNaW1f5ABIGacfPcvX6 = (int) F44whnLsbQ.hKs1wlZyvtUNaW1f5ABIGacfPcvX(byteArrayInputStream, 1); iHKs1wlZyvtUNaW1f5ABIGacfPcvX6 > 0; iHKs1wlZyvtUNaW1f5ABIGacfPcvX6--) {
                                F44whnLsbQ.hKs1wlZyvtUNaW1f5ABIGacfPcvX(byteArrayInputStream, 2);
                            }
                            iHKs1wlZyvtUNaW1f5ABIGacfPcvX5--;
                            i2 = i8;
                            i4 = i9;
                        }
                    }
                    iHKs1wlZyvtUNaW1f5ABIGacfPcvX4--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i10 = i2;
            int i11 = i4;
            if (byteArrayInputStream.available() != i7) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            mo6a2ojmytjibfdvhozs.NSjgqmGjEzuugn2SsG1mZFP = ymT6yQrus3w(byteArrayInputStream, mo6a2ojmytjibfdvhozs.LaeGQIruHQu81hfJldjMOQSVblH3x);
            BitSet bitSetValueOf = BitSet.valueOf(F44whnLsbQ.JUdwvN8LfOMa(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i12 = i10; i12 < i6; i12++) {
                int i13 = bitSetValueOf.get(i12) ? 2 : i10;
                if (bitSetValueOf.get(i12 + i6)) {
                    i13 |= 4;
                }
                if (i13 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i12));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i10);
                    }
                    treeMap.put(Integer.valueOf(i12), Integer.valueOf(i13 | numValueOf.intValue()));
                }
            }
            i4 = i11 + 1;
            i2 = i10;
        }
        return mo6a2ojmytjibfdvhozsArr;
    }

    public static Object mhUCRR8ceqc7mAozW(MGk7KfXeUv8YAfWiUw5LfOd mGk7KfXeUv8YAfWiUw5LfOd, Object obj, IvfXhmjM3e3K ivfXhmjM3e3K) {
        Object d8YrWu4aeyXOnuhS;
        ej6unYlOWMDF.pYmKDYlAmhudp(mGk7KfXeUv8YAfWiUw5LfOd, "<this>");
        D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFWLaeGQIruHQu81hfJldjMOQSVblH3x = ivfXhmjM3e3K.LaeGQIruHQu81hfJldjMOQSVblH3x();
        if (d73WsmU258PapcWZb45SFWLaeGQIruHQu81hfJldjMOQSVblH3x == hu3HDJRthjXEukAdCh3Tdc.V57tEvNfxZVVcOCAOih5PKr) {
            d8YrWu4aeyXOnuhS = new Q1ul1oa7KgAQR0rGw0IYoIVWf6lZ(ivfXhmjM3e3K);
            if (ivfXhmjM3e3K.LaeGQIruHQu81hfJldjMOQSVblH3x() != hu3HDJRthjXEukAdCh3Tdc.V57tEvNfxZVVcOCAOih5PKr) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
            }
        } else {
            d8YrWu4aeyXOnuhS = new D8YrWu4aeyXOnuhS(ivfXhmjM3e3K, d73WsmU258PapcWZb45SFWLaeGQIruHQu81hfJldjMOQSVblH3x);
        }
        F44whnLsbQ.V57tEvNfxZVVcOCAOih5PKr(2, mGk7KfXeUv8YAfWiUw5LfOd);
        return mGk7KfXeUv8YAfWiUw5LfOd.NSjgqmGjEzuugn2SsG1mZFP(obj, d8YrWu4aeyXOnuhS);
    }

    public static final void p59rPv72J9(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                LaeGQIruHQu81hfJldjMOQSVblH3x(th, th2);
            }
        }
    }

    public static void p6bBrs4p3Ly(ByteArrayOutputStream byteArrayOutputStream, mO6A2OjMYtJibfDvHozS mo6a2ojmytjibfdvhozs) throws IOException {
        HAPpjhiCsV9ONY23505HCBI9IX(byteArrayOutputStream, mo6a2ojmytjibfdvhozs);
        int i = mo6a2ojmytjibfdvhozs.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        int[] iArr = mo6a2ojmytjibfdvhozs.NSjgqmGjEzuugn2SsG1mZFP;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            F44whnLsbQ.p6bBrs4p3Ly(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : mo6a2ojmytjibfdvhozs.GI83zq0G8e7zkn.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i5 = iIntValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i6 = iIntValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static String pYmKDYlAmhudp(String str, String str2, byte[] bArr) {
        byte[] bArr2 = KfeOQNOupsCg6878zi4e.M9e7PWhFYLD2lOGMker;
        byte[] bArr3 = KfeOQNOupsCg6878zi4e.HzCpKshMOoaw76hFcbOVRYMeRd;
        String str3 = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                return u9SlVAuoWhQUfJ.HzCpKshMOoaw76hFcbOVRYMeRd(sb, (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static aiTTrIAlPaeZYF q11o1hieEkZDhF1MGOZI26oZiDT(lzuj2xiOHpZAdsoZ1vJvxA lzuj2xiohpzadsoz1vjvxa) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new aiTTrIAlPaeZYF(kHXwlw9VpxBho.KUYypEB4eNWOZWVDpH(lzuj2xiohpzadsoz1vjvxa));
        }
        TextPaint textPaint = new TextPaint(lzuj2xiohpzadsoz1vjvxa.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = lzuj2xiohpzadsoz1vjvxa.getBreakStrategy();
        int hyphenationFrequency = lzuj2xiohpzadsoz1vjvxa.getHyphenationFrequency();
        if (lzuj2xiohpzadsoz1vjvxa.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else if (i < 28 || (lzuj2xiohpzadsoz1vjvxa.getInputType() & 15) != 3) {
            boolean z = lzuj2xiohpzadsoz1vjvxa.getLayoutDirection() == 1;
            switch (lzuj2xiohpzadsoz1vjvxa.getTextDirection()) {
                case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                    textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_FIELD_NUMBER /* 5 */:
                    textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_SET_FIELD_NUMBER /* 6 */:
                    break;
                case g8kevnL6UKpr15IYtcPJXuLo1L4.DOUBLE_FIELD_NUMBER /* 7 */:
                    textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    break;
                default:
                    if (z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    break;
            }
        } else {
            byte directionality = Character.getDirectionality(kHXwlw9VpxBho.V57tEvNfxZVVcOCAOih5PKr(DecimalFormatSymbols.getInstance(lzuj2xiohpzadsoz1vjvxa.getTextLocale()))[0].codePointAt(0));
            textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        return new aiTTrIAlPaeZYF(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static IvfXhmjM3e3K qNPQb1obP7(IvfXhmjM3e3K ivfXhmjM3e3K) {
        ej6unYlOWMDF.pYmKDYlAmhudp(ivfXhmjM3e3K, "<this>");
        tfu79AIgc4CGAZaxd4HhD tfu79aigc4cgazaxd4hhd = ivfXhmjM3e3K instanceof tfu79AIgc4CGAZaxd4HhD ? (tfu79AIgc4CGAZaxd4HhD) ivfXhmjM3e3K : null;
        if (tfu79aigc4cgazaxd4hhd == null || (ivfXhmjM3e3K = tfu79aigc4cgazaxd4hhd.LaeGQIruHQu81hfJldjMOQSVblH3x) != null) {
            return ivfXhmjM3e3K;
        }
        n4jMi1WVfiPg7ovxqj2Z n4jmi1wvfipg7ovxqj2z = (n4jMi1WVfiPg7ovxqj2Z) tfu79aigc4cgazaxd4hhd.LaeGQIruHQu81hfJldjMOQSVblH3x().q11o1hieEkZDhF1MGOZI26oZiDT(IN79WcIk5xB4t0GjRT43qPLs5.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
        IvfXhmjM3e3K j0kieyozlt6joglju = n4jmi1wvfipg7ovxqj2z != null ? new j0kIeYozLt6jOglJu((LL6zXCXfmDYzdHCRTT) n4jmi1wvfipg7ovxqj2z, tfu79aigc4cgazaxd4hhd) : tfu79aigc4cgazaxd4hhd;
        tfu79aigc4cgazaxd4hhd.LaeGQIruHQu81hfJldjMOQSVblH3x = j0kieyozlt6joglju;
        return j0kieyozlt6joglju;
    }

    public static D73WsmU258PapcWZb45SFW qygqjTppWwx992(RKQqw795jswHmdL5AnfuvmeBZD rKQqw795jswHmdL5AnfuvmeBZD, DenmIypSdw0qfxt denmIypSdw0qfxt) {
        ej6unYlOWMDF.pYmKDYlAmhudp(denmIypSdw0qfxt, "key");
        return ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(rKQqw795jswHmdL5AnfuvmeBZD.getKey(), denmIypSdw0qfxt) ? hu3HDJRthjXEukAdCh3Tdc.V57tEvNfxZVVcOCAOih5PKr : rKQqw795jswHmdL5AnfuvmeBZD;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean rERAmyEtGV6ANGszuKcQI(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, mO6A2OjMYtJibfDvHozS[] mo6a2ojmytjibfdvhozsArr) throws IOException {
        long j;
        int length;
        byte[] bArr2 = KfeOQNOupsCg6878zi4e.HzCpKshMOoaw76hFcbOVRYMeRd;
        byte[] bArr3 = KfeOQNOupsCg6878zi4e.M9e7PWhFYLD2lOGMker;
        byte[] bArr4 = KfeOQNOupsCg6878zi4e.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        int i = 0;
        if (Arrays.equals(bArr, bArr4)) {
            ArrayList arrayList = new ArrayList(3);
            ArrayList arrayList2 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                F44whnLsbQ.p6bBrs4p3Ly(byteArrayOutputStream2, mo6a2ojmytjibfdvhozsArr.length);
                int i2 = 2;
                int i3 = 2;
                for (mO6A2OjMYtJibfDvHozS mo6a2ojmytjibfdvhozs : mo6a2ojmytjibfdvhozsArr) {
                    F44whnLsbQ.rE05n5RsRkyWKIeA9cmLXAKv4Hze(byteArrayOutputStream2, mo6a2ojmytjibfdvhozs.V57tEvNfxZVVcOCAOih5PKr, 4);
                    F44whnLsbQ.rE05n5RsRkyWKIeA9cmLXAKv4Hze(byteArrayOutputStream2, mo6a2ojmytjibfdvhozs.ZfQNn8hdWlEQ5cR94249PDsLR, 4);
                    F44whnLsbQ.rE05n5RsRkyWKIeA9cmLXAKv4Hze(byteArrayOutputStream2, mo6a2ojmytjibfdvhozs.ZLZeBXTMq0zDztBxtRTuCHrapQ, 4);
                    String strPYmKDYlAmhudp = pYmKDYlAmhudp(mo6a2ojmytjibfdvhozs.VxUQ9tBhpHJ2AAEDNW8sghc4m, mo6a2ojmytjibfdvhozs.zzpBGItXfub0yWj, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = strPYmKDYlAmhudp.getBytes(charset).length;
                    F44whnLsbQ.p6bBrs4p3Ly(byteArrayOutputStream2, length2);
                    i3 = i3 + 14 + length2;
                    byteArrayOutputStream2.write(strPYmKDYlAmhudp.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i3 != byteArray.length) {
                    throw new IllegalStateException("Expected size " + i3 + ", does not match actual size " + byteArray.length);
                }
                q36zpyUsVXkfBnpWi2f3uddZ q36zpyusvxkfbnpwi2f3uddz = new q36zpyUsVXkfBnpWi2f3uddZ(1, byteArray, false);
                byteArrayOutputStream2.close();
                arrayList.add(q36zpyusvxkfbnpwi2f3uddz);
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                int i4 = 0;
                int i5 = 0;
                while (i4 < mo6a2ojmytjibfdvhozsArr.length) {
                    try {
                        mO6A2OjMYtJibfDvHozS mo6a2ojmytjibfdvhozs2 = mo6a2ojmytjibfdvhozsArr[i4];
                        F44whnLsbQ.p6bBrs4p3Ly(byteArrayOutputStream3, i4);
                        F44whnLsbQ.p6bBrs4p3Ly(byteArrayOutputStream3, mo6a2ojmytjibfdvhozs2.LaeGQIruHQu81hfJldjMOQSVblH3x);
                        i5 = i5 + 4 + (mo6a2ojmytjibfdvhozs2.LaeGQIruHQu81hfJldjMOQSVblH3x * i2);
                        int[] iArr = mo6a2ojmytjibfdvhozs2.NSjgqmGjEzuugn2SsG1mZFP;
                        int length3 = iArr.length;
                        int i6 = i;
                        int i7 = i2;
                        int i8 = i6;
                        while (i8 < length3) {
                            int i9 = iArr[i8];
                            F44whnLsbQ.p6bBrs4p3Ly(byteArrayOutputStream3, i9 - i6);
                            i8++;
                            i6 = i9;
                        }
                        i4++;
                        i2 = i7;
                        i = 0;
                    } catch (Throwable th) {
                    }
                }
                byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                if (i5 != byteArray2.length) {
                    throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray2.length);
                }
                q36zpyUsVXkfBnpWi2f3uddZ q36zpyusvxkfbnpwi2f3uddz2 = new q36zpyUsVXkfBnpWi2f3uddZ(3, byteArray2, true);
                byteArrayOutputStream3.close();
                arrayList.add(q36zpyusvxkfbnpwi2f3uddz2);
                byteArrayOutputStream3 = new ByteArrayOutputStream();
                int i10 = 0;
                int i11 = 0;
                while (i10 < mo6a2ojmytjibfdvhozsArr.length) {
                    try {
                        mO6A2OjMYtJibfDvHozS mo6a2ojmytjibfdvhozs3 = mo6a2ojmytjibfdvhozsArr[i10];
                        Iterator it = mo6a2ojmytjibfdvhozs3.GI83zq0G8e7zkn.entrySet().iterator();
                        int iIntValue = 0;
                        while (it.hasNext()) {
                            iIntValue |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
                        }
                        ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            wR7sbzHKf9hYV1lxoS6nqyszepWvN(byteArrayOutputStream4, iIntValue, mo6a2ojmytjibfdvhozs3);
                            byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            byteArrayOutputStream4 = new ByteArrayOutputStream();
                            try {
                                HAPpjhiCsV9ONY23505HCBI9IX(byteArrayOutputStream4, mo6a2ojmytjibfdvhozs3);
                                byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                                byteArrayOutputStream4.close();
                                F44whnLsbQ.p6bBrs4p3Ly(byteArrayOutputStream3, i10);
                                int length4 = byteArray3.length + 2 + byteArray4.length;
                                int i12 = i11 + 6;
                                int i13 = i10;
                                F44whnLsbQ.rE05n5RsRkyWKIeA9cmLXAKv4Hze(byteArrayOutputStream3, length4, 4);
                                F44whnLsbQ.p6bBrs4p3Ly(byteArrayOutputStream3, iIntValue);
                                byteArrayOutputStream3.write(byteArray3);
                                byteArrayOutputStream3.write(byteArray4);
                                i11 = i12 + length4;
                                i10 = i13 + 1;
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                        try {
                            byteArrayOutputStream3.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                }
                byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
                if (i11 != byteArray5.length) {
                    throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray5.length);
                }
                q36zpyUsVXkfBnpWi2f3uddZ q36zpyusvxkfbnpwi2f3uddz3 = new q36zpyUsVXkfBnpWi2f3uddZ(4, byteArray5, true);
                byteArrayOutputStream3.close();
                arrayList.add(q36zpyusvxkfbnpwi2f3uddz3);
                long j2 = 4;
                long size = j2 + j2 + 4 + ((long) (arrayList.size() * 16));
                F44whnLsbQ.rE05n5RsRkyWKIeA9cmLXAKv4Hze(byteArrayOutputStream, arrayList.size(), 4);
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    q36zpyUsVXkfBnpWi2f3uddZ q36zpyusvxkfbnpwi2f3uddz4 = (q36zpyUsVXkfBnpWi2f3uddZ) arrayList.get(i14);
                    int i15 = q36zpyusvxkfbnpwi2f3uddz4.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    byte[] bArr5 = q36zpyusvxkfbnpwi2f3uddz4.zzpBGItXfub0yWj;
                    if (i15 == 1) {
                        j = 0;
                    } else if (i15 == 2) {
                        j = 1;
                    } else if (i15 == 3) {
                        j = 2;
                    } else if (i15 == 4) {
                        j = 3;
                    } else {
                        if (i15 != 5) {
                            throw null;
                        }
                        j = 4;
                    }
                    F44whnLsbQ.rE05n5RsRkyWKIeA9cmLXAKv4Hze(byteArrayOutputStream, j, 4);
                    F44whnLsbQ.rE05n5RsRkyWKIeA9cmLXAKv4Hze(byteArrayOutputStream, size, 4);
                    if (q36zpyusvxkfbnpwi2f3uddz4.V57tEvNfxZVVcOCAOih5PKr) {
                        long length5 = bArr5.length;
                        byte[] bArrGI83zq0G8e7zkn = F44whnLsbQ.GI83zq0G8e7zkn(bArr5);
                        arrayList2.add(bArrGI83zq0G8e7zkn);
                        F44whnLsbQ.rE05n5RsRkyWKIeA9cmLXAKv4Hze(byteArrayOutputStream, bArrGI83zq0G8e7zkn.length, 4);
                        F44whnLsbQ.rE05n5RsRkyWKIeA9cmLXAKv4Hze(byteArrayOutputStream, length5, 4);
                        length = bArrGI83zq0G8e7zkn.length;
                    } else {
                        arrayList2.add(bArr5);
                        F44whnLsbQ.rE05n5RsRkyWKIeA9cmLXAKv4Hze(byteArrayOutputStream, bArr5.length, 4);
                        F44whnLsbQ.rE05n5RsRkyWKIeA9cmLXAKv4Hze(byteArrayOutputStream, 0L, 4);
                        length = bArr5.length;
                    }
                    size += (long) length;
                }
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    byteArrayOutputStream.write((byte[]) arrayList2.get(i16));
                }
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream2.close();
                    throw th3;
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } else {
            byte[] bArr6 = KfeOQNOupsCg6878zi4e.NSjgqmGjEzuugn2SsG1mZFP;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] bArrCa81ebIan1u = Ca81ebIan1u(mo6a2ojmytjibfdvhozsArr, bArr6);
                F44whnLsbQ.rE05n5RsRkyWKIeA9cmLXAKv4Hze(byteArrayOutputStream, mo6a2ojmytjibfdvhozsArr.length, 1);
                F44whnLsbQ.rE05n5RsRkyWKIeA9cmLXAKv4Hze(byteArrayOutputStream, bArrCa81ebIan1u.length, 4);
                byte[] bArrGI83zq0G8e7zkn2 = F44whnLsbQ.GI83zq0G8e7zkn(bArrCa81ebIan1u);
                F44whnLsbQ.rE05n5RsRkyWKIeA9cmLXAKv4Hze(byteArrayOutputStream, bArrGI83zq0G8e7zkn2.length, 4);
                byteArrayOutputStream.write(bArrGI83zq0G8e7zkn2);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                F44whnLsbQ.rE05n5RsRkyWKIeA9cmLXAKv4Hze(byteArrayOutputStream, mo6a2ojmytjibfdvhozsArr.length, 1);
                for (mO6A2OjMYtJibfDvHozS mo6a2ojmytjibfdvhozs4 : mo6a2ojmytjibfdvhozsArr) {
                    int size2 = mo6a2ojmytjibfdvhozs4.GI83zq0G8e7zkn.size() * 4;
                    String strPYmKDYlAmhudp2 = pYmKDYlAmhudp(mo6a2ojmytjibfdvhozs4.VxUQ9tBhpHJ2AAEDNW8sghc4m, mo6a2ojmytjibfdvhozs4.zzpBGItXfub0yWj, bArr3);
                    Charset charset2 = StandardCharsets.UTF_8;
                    F44whnLsbQ.p6bBrs4p3Ly(byteArrayOutputStream, strPYmKDYlAmhudp2.getBytes(charset2).length);
                    F44whnLsbQ.p6bBrs4p3Ly(byteArrayOutputStream, mo6a2ojmytjibfdvhozs4.NSjgqmGjEzuugn2SsG1mZFP.length);
                    F44whnLsbQ.rE05n5RsRkyWKIeA9cmLXAKv4Hze(byteArrayOutputStream, size2, 4);
                    F44whnLsbQ.rE05n5RsRkyWKIeA9cmLXAKv4Hze(byteArrayOutputStream, mo6a2ojmytjibfdvhozs4.V57tEvNfxZVVcOCAOih5PKr, 4);
                    byteArrayOutputStream.write(strPYmKDYlAmhudp2.getBytes(charset2));
                    Iterator it2 = mo6a2ojmytjibfdvhozs4.GI83zq0G8e7zkn.keySet().iterator();
                    while (it2.hasNext()) {
                        F44whnLsbQ.p6bBrs4p3Ly(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                        F44whnLsbQ.p6bBrs4p3Ly(byteArrayOutputStream, 0);
                    }
                    for (int i17 : mo6a2ojmytjibfdvhozs4.NSjgqmGjEzuugn2SsG1mZFP) {
                        F44whnLsbQ.p6bBrs4p3Ly(byteArrayOutputStream, i17);
                    }
                }
            } else {
                byte[] bArr7 = KfeOQNOupsCg6878zi4e.GI83zq0G8e7zkn;
                if (Arrays.equals(bArr, bArr7)) {
                    byte[] bArrCa81ebIan1u2 = Ca81ebIan1u(mo6a2ojmytjibfdvhozsArr, bArr7);
                    F44whnLsbQ.rE05n5RsRkyWKIeA9cmLXAKv4Hze(byteArrayOutputStream, mo6a2ojmytjibfdvhozsArr.length, 1);
                    F44whnLsbQ.rE05n5RsRkyWKIeA9cmLXAKv4Hze(byteArrayOutputStream, bArrCa81ebIan1u2.length, 4);
                    byte[] bArrGI83zq0G8e7zkn3 = F44whnLsbQ.GI83zq0G8e7zkn(bArrCa81ebIan1u2);
                    F44whnLsbQ.rE05n5RsRkyWKIeA9cmLXAKv4Hze(byteArrayOutputStream, bArrGI83zq0G8e7zkn3.length, 4);
                    byteArrayOutputStream.write(bArrGI83zq0G8e7zkn3);
                    return true;
                }
                if (!Arrays.equals(bArr, bArr2)) {
                    return false;
                }
                F44whnLsbQ.p6bBrs4p3Ly(byteArrayOutputStream, mo6a2ojmytjibfdvhozsArr.length);
                for (mO6A2OjMYtJibfDvHozS mo6a2ojmytjibfdvhozs5 : mo6a2ojmytjibfdvhozsArr) {
                    String str = mo6a2ojmytjibfdvhozs5.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    TreeMap treeMap = mo6a2ojmytjibfdvhozs5.GI83zq0G8e7zkn;
                    String strPYmKDYlAmhudp3 = pYmKDYlAmhudp(str, mo6a2ojmytjibfdvhozs5.zzpBGItXfub0yWj, bArr2);
                    Charset charset3 = StandardCharsets.UTF_8;
                    F44whnLsbQ.p6bBrs4p3Ly(byteArrayOutputStream, strPYmKDYlAmhudp3.getBytes(charset3).length);
                    F44whnLsbQ.p6bBrs4p3Ly(byteArrayOutputStream, treeMap.size());
                    F44whnLsbQ.p6bBrs4p3Ly(byteArrayOutputStream, mo6a2ojmytjibfdvhozs5.NSjgqmGjEzuugn2SsG1mZFP.length);
                    F44whnLsbQ.rE05n5RsRkyWKIeA9cmLXAKv4Hze(byteArrayOutputStream, mo6a2ojmytjibfdvhozs5.V57tEvNfxZVVcOCAOih5PKr, 4);
                    byteArrayOutputStream.write(strPYmKDYlAmhudp3.getBytes(charset3));
                    Iterator it3 = treeMap.keySet().iterator();
                    while (it3.hasNext()) {
                        F44whnLsbQ.p6bBrs4p3Ly(byteArrayOutputStream, ((Integer) it3.next()).intValue());
                    }
                    for (int i18 : mo6a2ojmytjibfdvhozs5.NSjgqmGjEzuugn2SsG1mZFP) {
                        F44whnLsbQ.p6bBrs4p3Ly(byteArrayOutputStream, i18);
                    }
                }
            }
        }
        return true;
    }

    public static ActionMode.Callback tFRdVJAePmTx77bP7FAN0uI(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof mDy1rlG6bPilgxEozn7jUqZRTk) || callback == null) ? callback : new mDy1rlG6bPilgxEozn7jUqZRTk(callback, textView);
    }

    public static void ubNpdCC1pl7L(ByteArrayOutputStream byteArrayOutputStream, mO6A2OjMYtJibfDvHozS mo6a2ojmytjibfdvhozs, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        F44whnLsbQ.p6bBrs4p3Ly(byteArrayOutputStream, str.getBytes(charset).length);
        F44whnLsbQ.p6bBrs4p3Ly(byteArrayOutputStream, mo6a2ojmytjibfdvhozs.LaeGQIruHQu81hfJldjMOQSVblH3x);
        F44whnLsbQ.rE05n5RsRkyWKIeA9cmLXAKv4Hze(byteArrayOutputStream, mo6a2ojmytjibfdvhozs.zIvmSL0wzmmKGc3X39b2Gw2mUGE, 4);
        F44whnLsbQ.rE05n5RsRkyWKIeA9cmLXAKv4Hze(byteArrayOutputStream, mo6a2ojmytjibfdvhozs.V57tEvNfxZVVcOCAOih5PKr, 4);
        F44whnLsbQ.rE05n5RsRkyWKIeA9cmLXAKv4Hze(byteArrayOutputStream, mo6a2ojmytjibfdvhozs.ZLZeBXTMq0zDztBxtRTuCHrapQ, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static float vBGA6pPLqSMuYGvprl270j7(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return qqKWL2qopCW20X.zzpBGItXfub0yWj(edgeEffect);
        }
        return 0.0f;
    }

    public static int vE4yDIjexsP2lGjLaTcB(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    public static void vXWl0o6I4U59CgHs9(TextView textView, int i) {
        KfeOQNOupsCg6878zi4e.HzCpKshMOoaw76hFcbOVRYMeRd(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static void wR7sbzHKf9hYV1lxoS6nqyszepWvN(ByteArrayOutputStream byteArrayOutputStream, int i, mO6A2OjMYtJibfDvHozS mo6a2ojmytjibfdvhozs) throws IOException {
        int i2 = mo6a2ojmytjibfdvhozs.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : mo6a2ojmytjibfdvhozs.GI83zq0G8e7zkn.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & iIntValue2) == i4) {
                        int i5 = (i3 * i2) + iIntValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static mO6A2OjMYtJibfDvHozS[] wRCD0SdqWCowdYU7bmzN(ByteArrayInputStream byteArrayInputStream, int i, mO6A2OjMYtJibfDvHozS[] mo6a2ojmytjibfdvhozsArr) {
        if (byteArrayInputStream.available() == 0) {
            return new mO6A2OjMYtJibfDvHozS[0];
        }
        if (i != mo6a2ojmytjibfdvhozsArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iHKs1wlZyvtUNaW1f5ABIGacfPcvX = (int) F44whnLsbQ.hKs1wlZyvtUNaW1f5ABIGacfPcvX(byteArrayInputStream, 2);
            iArr[i2] = (int) F44whnLsbQ.hKs1wlZyvtUNaW1f5ABIGacfPcvX(byteArrayInputStream, 2);
            strArr[i2] = new String(F44whnLsbQ.JUdwvN8LfOMa(byteArrayInputStream, iHKs1wlZyvtUNaW1f5ABIGacfPcvX), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            mO6A2OjMYtJibfDvHozS mo6a2ojmytjibfdvhozs = mo6a2ojmytjibfdvhozsArr[i3];
            if (!mo6a2ojmytjibfdvhozs.zzpBGItXfub0yWj.equals(strArr[i3])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            mo6a2ojmytjibfdvhozs.LaeGQIruHQu81hfJldjMOQSVblH3x = i4;
            mo6a2ojmytjibfdvhozs.NSjgqmGjEzuugn2SsG1mZFP = ymT6yQrus3w(byteArrayInputStream, i4);
        }
        return mo6a2ojmytjibfdvhozsArr;
    }

    public static void wdI7vzA3Qmcwd(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    public static int y1NaPKTl7R18DOr6e8i5(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static int[] ymT6yQrus3w(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iHKs1wlZyvtUNaW1f5ABIGacfPcvX = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHKs1wlZyvtUNaW1f5ABIGacfPcvX += (int) F44whnLsbQ.hKs1wlZyvtUNaW1f5ABIGacfPcvX(byteArrayInputStream, 2);
            iArr[i2] = iHKs1wlZyvtUNaW1f5ABIGacfPcvX;
        }
        return iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE(int r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11) {
        /*
            boolean r0 = ZLZeBXTMq0zDztBxtRTuCHrapQ(r8, r9, r10)
            boolean r1 = ZLZeBXTMq0zDztBxtRTuCHrapQ(r8, r9, r11)
            if (r1 != 0) goto L75
            if (r0 != 0) goto Le
            goto L75
        Le:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r2 = 33
            r3 = 66
            r4 = 17
            r5 = 1
            if (r8 == r4) goto L3c
            if (r8 == r2) goto L35
            if (r8 == r3) goto L2e
            if (r8 != r1) goto L28
            int r6 = r9.bottom
            int r7 = r11.top
            if (r6 > r7) goto L74
            goto L42
        L28:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L2e:
            int r6 = r9.right
            int r7 = r11.left
            if (r6 > r7) goto L74
            goto L42
        L35:
            int r6 = r9.top
            int r7 = r11.bottom
            if (r6 < r7) goto L74
            goto L42
        L3c:
            int r6 = r9.left
            int r7 = r11.right
            if (r6 < r7) goto L74
        L42:
            if (r8 == r4) goto L74
            if (r8 != r3) goto L47
            goto L74
        L47:
            int r10 = vE4yDIjexsP2lGjLaTcB(r8, r9, r10)
            if (r8 == r4) goto L69
            if (r8 == r2) goto L64
            if (r8 == r3) goto L5f
            if (r8 != r1) goto L59
            int r8 = r11.bottom
            int r9 = r9.bottom
        L57:
            int r8 = r8 - r9
            goto L6e
        L59:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L5f:
            int r8 = r11.right
            int r9 = r9.right
            goto L57
        L64:
            int r8 = r9.top
            int r9 = r11.top
            goto L57
        L69:
            int r8 = r9.left
            int r9 = r11.left
            goto L57
        L6e:
            int r8 = java.lang.Math.max(r5, r8)
            if (r10 >= r8) goto L75
        L74:
            return r5
        L75:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao.zIvmSL0wzmmKGc3X39b2Gw2mUGE(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static final Object[] zOk739gUM7zIZC25HHUxoiyixWFjn(Collection collection) {
        int size = collection.size();
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = new Object[size];
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(objArrCopyOf, "copyOf(...)");
                    } else if (!it.hasNext()) {
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i2);
                        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(objArrCopyOf2, "copyOf(...)");
                        return objArrCopyOf2;
                    }
                    i = i2;
                }
            }
        }
        return VxUQ9tBhpHJ2AAEDNW8sghc4m;
    }

    public abstract int Irh5auREsoeV1C1RaBamlmy(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract ViewPropertyAnimator RhfGHxtXxy0M0grmp2jkRjQg(View view, int i);

    public abstract String[] TaDO7ogis3aEiWEtq(Class cls);

    public abstract Constructor f6ZQsR6bPLvvCDNXOUc(Class cls);

    public abstract Method jW7EiD0YL6xkbB158jMUzhWNWb1y(Class cls, Field field);

    public abstract boolean pzqP2AqKW6J5PO8zCKnW(Class cls);

    public abstract List q1wNbhk2O6(String str, List list);

    public abstract void rE05n5RsRkyWKIeA9cmLXAKv4Hze(byte[] bArr, int i, int i2);

    public abstract int w0Wu95l8dVNw5rZMRu();

    @Override // com.vdodsodjsdt.u2BfIH7vVsa
    public void V57tEvNfxZVVcOCAOih5PKr() {
    }

    @Override // com.vdodsodjsdt.u2BfIH7vVsa
    public void zzpBGItXfub0yWj() {
    }
}
