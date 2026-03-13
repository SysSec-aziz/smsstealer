package com.vdodsodjsdt;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.google.android.material.appbar.MaterialToolbar;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.regex.Matcher;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class KfeOQNOupsCg6878zi4e {
    public static final NrjuzzioPqfttNRptBDpZDzSYUrcM LaeGQIruHQu81hfJldjMOQSVblH3x;
    public static final aqhhl68tQrgIjcMGB3dY2YLK3vN V57tEvNfxZVVcOCAOih5PKr;
    public static final aqhhl68tQrgIjcMGB3dY2YLK3vN ZfQNn8hdWlEQ5cR94249PDsLR;
    public static NrjuzzioPqfttNRptBDpZDzSYUrcM zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public static final aqhhl68tQrgIjcMGB3dY2YLK3vN zzpBGItXfub0yWj;
    public static final char[] VxUQ9tBhpHJ2AAEDNW8sghc4m = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final byte[] ZLZeBXTMq0zDztBxtRTuCHrapQ = {48, 49, 53, 0};
    public static final byte[] NSjgqmGjEzuugn2SsG1mZFP = {48, 49, 48, 0};
    public static final byte[] GI83zq0G8e7zkn = {48, 48, 57, 0};
    public static final byte[] M9e7PWhFYLD2lOGMker = {48, 48, 53, 0};
    public static final byte[] HzCpKshMOoaw76hFcbOVRYMeRd = {48, 48, 49, 0};
    public static final byte[] KUYypEB4eNWOZWVDpH = {48, 48, 49, 0};
    public static final byte[] q1wNbhk2O6 = {48, 48, 50, 0};
    public static final T3RbnymT8IuKvnwatFNeNL7H p59rPv72J9 = new T3RbnymT8IuKvnwatFNeNL7H(5);

    static {
        int i = 2;
        zzpBGItXfub0yWj = new aqhhl68tQrgIjcMGB3dY2YLK3vN("CLOSED", i);
        V57tEvNfxZVVcOCAOih5PKr = new aqhhl68tQrgIjcMGB3dY2YLK3vN("REMOVED_TASK", i);
        ZfQNn8hdWlEQ5cR94249PDsLR = new aqhhl68tQrgIjcMGB3dY2YLK3vN("CLOSED_EMPTY", i);
        Object obj = null;
        LaeGQIruHQu81hfJldjMOQSVblH3x = new NrjuzzioPqfttNRptBDpZDzSYUrcM(obj, obj, obj, 10);
    }

    public static final Object Ca81ebIan1u(fw6arzf1nhE87EaA fw6arzf1nhe87eaa, long j, MGk7KfXeUv8YAfWiUw5LfOd mGk7KfXeUv8YAfWiUw5LfOd) {
        while (true) {
            if (fw6arzf1nhe87eaa.V57tEvNfxZVVcOCAOih5PKr >= j && !fw6arzf1nhe87eaa.V57tEvNfxZVVcOCAOih5PKr()) {
                return fw6arzf1nhe87eaa;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = D0vuyCrFBAWQbRciLh0X.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            Object obj = atomicReferenceFieldUpdater.get(fw6arzf1nhe87eaa);
            aqhhl68tQrgIjcMGB3dY2YLK3vN aqhhl68tqrgijcmgb3dy2ylk3vn = zzpBGItXfub0yWj;
            if (obj == aqhhl68tqrgijcmgb3dy2ylk3vn) {
                return aqhhl68tqrgijcmgb3dy2ylk3vn;
            }
            fw6arzf1nhE87EaA fw6arzf1nhe87eaa2 = (fw6arzf1nhE87EaA) ((D0vuyCrFBAWQbRciLh0X) obj);
            if (fw6arzf1nhe87eaa2 == null) {
                fw6arzf1nhe87eaa2 = (fw6arzf1nhE87EaA) mGk7KfXeUv8YAfWiUw5LfOd.NSjgqmGjEzuugn2SsG1mZFP(Long.valueOf(fw6arzf1nhe87eaa.V57tEvNfxZVVcOCAOih5PKr + 1), fw6arzf1nhe87eaa);
                while (!atomicReferenceFieldUpdater.compareAndSet(fw6arzf1nhe87eaa, null, fw6arzf1nhe87eaa2)) {
                    if (atomicReferenceFieldUpdater.get(fw6arzf1nhe87eaa) != null) {
                        break;
                    }
                }
                if (fw6arzf1nhe87eaa.V57tEvNfxZVVcOCAOih5PKr()) {
                    fw6arzf1nhe87eaa.ZfQNn8hdWlEQ5cR94249PDsLR();
                }
            }
            fw6arzf1nhe87eaa = fw6arzf1nhe87eaa2;
        }
    }

    public static String CixTK5ZX8oWXHz34qHYV(X509Certificate x509Certificate) throws NoSuchAlgorithmException {
        StringBuilder sb = new StringBuilder("sha256/");
        oA1WO3soICf8H1N6bgpG oa1wo3soicf8h1n6bgpg = oA1WO3soICf8H1N6bgpG.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(encoded, "getEncoded(...)");
        int length = encoded.length;
        int i = 0;
        FLWIoSaHb1q8TqFvEBgPyRGrzvi6.ZLZeBXTMq0zDztBxtRTuCHrapQ(encoded.length, 0, length);
        byte[] bArrE1gEV3X9xwmHj = vmp19D2MODlOL.e1gEV3X9xwmHj(encoded, 0, length);
        oA1WO3soICf8H1N6bgpG oa1wo3soicf8h1n6bgpg2 = new oA1WO3soICf8H1N6bgpG(bArrE1gEV3X9xwmHj);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update(bArrE1gEV3X9xwmHj, 0, oa1wo3soicf8h1n6bgpg2.VxUQ9tBhpHJ2AAEDNW8sghc4m());
        byte[] bArrDigest = messageDigest.digest();
        ej6unYlOWMDF.p59rPv72J9(bArrDigest);
        new oA1WO3soICf8H1N6bgpG(bArrDigest);
        byte[] bArr = iVKrTMqOw0TqCeNN.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        ej6unYlOWMDF.pYmKDYlAmhudp(bArr, "map");
        byte[] bArr2 = new byte[((bArrDigest.length + 2) / 3) * 4];
        int length2 = bArrDigest.length - (bArrDigest.length % 3);
        int i2 = 0;
        while (i < length2) {
            byte b = bArrDigest[i];
            int i3 = i + 2;
            byte b2 = bArrDigest[i + 1];
            i += 3;
            byte b3 = bArrDigest[i3];
            bArr2[i2] = bArr[(b & 255) >> 2];
            bArr2[i2 + 1] = bArr[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr2[i2 + 2] = bArr[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 += 4;
            bArr2[i4] = bArr[b3 & 63];
        }
        int length3 = bArrDigest.length - length2;
        if (length3 == 1) {
            byte b4 = bArrDigest[i];
            bArr2[i2] = bArr[(b4 & 255) >> 2];
            bArr2[i2 + 1] = bArr[(b4 & 3) << 4];
            bArr2[i2 + 2] = 61;
            bArr2[i2 + 3] = 61;
        } else if (length3 == 2) {
            int i5 = i + 1;
            byte b5 = bArrDigest[i];
            byte b6 = bArrDigest[i5];
            bArr2[i2] = bArr[(b5 & 255) >> 2];
            bArr2[i2 + 1] = bArr[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr2[i2 + 2] = bArr[(b6 & 15) << 2];
            bArr2[i2 + 3] = 61;
        }
        sb.append(new String(bArr2, DEYHHOT0rxPFnkgGJgP0ym2DRq1.VxUQ9tBhpHJ2AAEDNW8sghc4m));
        return sb.toString();
    }

    public static final rDVwronXktMoWAubpmvA GE1sqSYiEYQO2ew7WEZwTtUeS5(IvfXhmjM3e3K ivfXhmjM3e3K, D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFW, Object obj) {
        rDVwronXktMoWAubpmvA rdvwronxktmowaubpmva = null;
        if ((ivfXhmjM3e3K instanceof fqQIeYf1n7m) && d73WsmU258PapcWZb45SFW.q11o1hieEkZDhF1MGOZI26oZiDT(mh3HsyTszeie6XiiSpXgcJAy9VF.V57tEvNfxZVVcOCAOih5PKr) != null) {
            fqQIeYf1n7m fqqieyf1n7mZfQNn8hdWlEQ5cR94249PDsLR = (fqQIeYf1n7m) ivfXhmjM3e3K;
            while (true) {
                if ((fqqieyf1n7mZfQNn8hdWlEQ5cR94249PDsLR instanceof gHXBIIhsUHosFRVh36G1cLOZ9o) || (fqqieyf1n7mZfQNn8hdWlEQ5cR94249PDsLR = fqqieyf1n7mZfQNn8hdWlEQ5cR94249PDsLR.ZfQNn8hdWlEQ5cR94249PDsLR()) == null) {
                    break;
                }
                if (fqqieyf1n7mZfQNn8hdWlEQ5cR94249PDsLR instanceof rDVwronXktMoWAubpmvA) {
                    rdvwronxktmowaubpmva = (rDVwronXktMoWAubpmvA) fqqieyf1n7mZfQNn8hdWlEQ5cR94249PDsLR;
                    break;
                }
            }
            if (rdvwronxktmowaubpmva != null) {
                rdvwronxktmowaubpmva.GE1sqSYiEYQO2ew7WEZwTtUeS5(d73WsmU258PapcWZb45SFW, obj);
            }
        }
        return rdvwronxktmowaubpmva;
    }

    public static List HVEwbdULInpTNa0IG(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static void HzCpKshMOoaw76hFcbOVRYMeRd(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void KUYypEB4eNWOZWVDpH(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final Object KYZ9RyuOc42A2J(yB0MgkQF0w4aWkiL0rHiqFb54ZHEs yb0mgkqf0w4awkil0rhiqfb54zhes, yB0MgkQF0w4aWkiL0rHiqFb54ZHEs yb0mgkqf0w4awkil0rhiqfb54zhes2, MGk7KfXeUv8YAfWiUw5LfOd mGk7KfXeUv8YAfWiUw5LfOd) throws Throwable {
        Object xpG0A5IpJsSX9uJPSmP4WwTAl;
        Object objYmT6yQrus3w;
        try {
            F44whnLsbQ.V57tEvNfxZVVcOCAOih5PKr(2, mGk7KfXeUv8YAfWiUw5LfOd);
            xpG0A5IpJsSX9uJPSmP4WwTAl = mGk7KfXeUv8YAfWiUw5LfOd.NSjgqmGjEzuugn2SsG1mZFP(yb0mgkqf0w4awkil0rhiqfb54zhes2, yb0mgkqf0w4awkil0rhiqfb54zhes);
        } catch (Throwable th) {
            xpG0A5IpJsSX9uJPSmP4WwTAl = new XpG0A5IpJsSX9uJPSmP4WwTAl(th, false);
        }
        w0JnONr1KwCkZY9pA0QjUDuh9aMcU w0jnonr1kwckzy9pa0qjuduh9amcu = w0JnONr1KwCkZY9pA0QjUDuh9aMcU.V57tEvNfxZVVcOCAOih5PKr;
        if (xpG0A5IpJsSX9uJPSmP4WwTAl == w0jnonr1kwckzy9pa0qjuduh9amcu || (objYmT6yQrus3w = yb0mgkqf0w4awkil0rhiqfb54zhes.ymT6yQrus3w(xpG0A5IpJsSX9uJPSmP4WwTAl)) == zonOxHotd3BwAPJcwqr6I6uQNngg4.ZfQNn8hdWlEQ5cR94249PDsLR) {
            return w0jnonr1kwckzy9pa0qjuduh9amcu;
        }
        if (objYmT6yQrus3w instanceof XpG0A5IpJsSX9uJPSmP4WwTAl) {
            throw ((XpG0A5IpJsSX9uJPSmP4WwTAl) objYmT6yQrus3w).VxUQ9tBhpHJ2AAEDNW8sghc4m;
        }
        return zonOxHotd3BwAPJcwqr6I6uQNngg4.wdI7vzA3Qmcwd(objYmT6yQrus3w);
    }

    public static final dz5NyGIwqDW6k3gnpAoL L8DMw02rUTs2w(Um0z2cMcEZpu6blUyqa58pl um0z2cMcEZpu6blUyqa58pl, String str, boolean z) throws IOException {
        Cursor cursorAXO0LSrt8bKV = um0z2cMcEZpu6blUyqa58pl.aXO0LSrt8bKV("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorAXO0LSrt8bKV.getColumnIndex("seqno");
            int columnIndex2 = cursorAXO0LSrt8bKV.getColumnIndex("cid");
            int columnIndex3 = cursorAXO0LSrt8bKV.getColumnIndex("name");
            int columnIndex4 = cursorAXO0LSrt8bKV.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorAXO0LSrt8bKV.moveToNext()) {
                    if (cursorAXO0LSrt8bKV.getInt(columnIndex2) >= 0) {
                        int i = cursorAXO0LSrt8bKV.getInt(columnIndex);
                        String string = cursorAXO0LSrt8bKV.getString(columnIndex3);
                        String str2 = cursorAXO0LSrt8bKV.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer numValueOf = Integer.valueOf(i);
                        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(string, "columnName");
                        treeMap.put(numValueOf, string);
                        treeMap2.put(Integer.valueOf(i), str2);
                    }
                }
                Collection collectionValues = treeMap.values();
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(collectionValues, "columnsMap.values");
                List listByTQIhgl7ezGvHXEd = gYXV3FZbh17i6ocMo1T.ByTQIhgl7ezGvHXEd(collectionValues);
                Collection collectionValues2 = treeMap2.values();
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(collectionValues2, "ordersMap.values");
                dz5NyGIwqDW6k3gnpAoL dz5nygiwqdw6k3gnpaol = new dz5NyGIwqDW6k3gnpAoL(str, z, listByTQIhgl7ezGvHXEd, gYXV3FZbh17i6ocMo1T.ByTQIhgl7ezGvHXEd(collectionValues2));
                cursorAXO0LSrt8bKV.close();
                return dz5nygiwqdw6k3gnpaol;
            }
            cursorAXO0LSrt8bKV.close();
            return null;
        } finally {
        }
    }

    public static void M9e7PWhFYLD2lOGMker(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static int O1xDAlBZZlZdoEf747lCFHld(int i, int i2, int i3) throws IOException {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        throw new IOException(u9SlVAuoWhQUfJ.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i3, i, "PROTOCOL_ERROR padding ", " > remaining length "));
    }

    public static String SuB3hEmTmbbRGAhtvOOmfKEon(String str, String str2) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "tableName");
        ej6unYlOWMDF.pYmKDYlAmhudp(str2, "triggerType");
        return "`room_table_modification_trigger_" + str + '_' + str2 + '`';
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.vdodsodjsdt.OqqfVMfmaBd7PmbWoUZs3u TqcnImqkSWIKht(android.content.res.XmlResourceParser r25, android.content.res.Resources r26) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.KfeOQNOupsCg6878zi4e.TqcnImqkSWIKht(android.content.res.XmlResourceParser, android.content.res.Resources):com.vdodsodjsdt.OqqfVMfmaBd7PmbWoUZs3u");
    }

    public static CdyQYCBK2awPZQYrStW8hpQgDJcqR V57tEvNfxZVVcOCAOih5PKr(CdyQYCBK2awPZQYrStW8hpQgDJcqR cdyQYCBK2awPZQYrStW8hpQgDJcqR) {
        cdyQYCBK2awPZQYrStW8hpQgDJcqR.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        cdyQYCBK2awPZQYrStW8hpQgDJcqR.LaeGQIruHQu81hfJldjMOQSVblH3x = true;
        return cdyQYCBK2awPZQYrStW8hpQgDJcqR.ZfQNn8hdWlEQ5cR94249PDsLR > 0 ? cdyQYCBK2awPZQYrStW8hpQgDJcqR : CdyQYCBK2awPZQYrStW8hpQgDJcqR.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    }

    public static PorterDuff.Mode d9zDyyznnp3oaDT1Ug(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static final List gBaBUmihn5l4u(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        CdyQYCBK2awPZQYrStW8hpQgDJcqR cdyQYCBK2awPZQYrStW8hpQgDJcqR = new CdyQYCBK2awPZQYrStW8hpQgDJcqR(10);
        while (cursor.moveToNext()) {
            int i = cursor.getInt(columnIndex);
            int i2 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(string2, "cursor.getString(toColumnIndex)");
            cdyQYCBK2awPZQYrStW8hpQgDJcqR.add(new JhdVf4yuw8SyYxYHxb7F(i, i2, string, string2));
        }
        CdyQYCBK2awPZQYrStW8hpQgDJcqR cdyQYCBK2awPZQYrStW8hpQgDJcqRV57tEvNfxZVVcOCAOih5PKr = V57tEvNfxZVVcOCAOih5PKr(cdyQYCBK2awPZQYrStW8hpQgDJcqR);
        ej6unYlOWMDF.pYmKDYlAmhudp(cdyQYCBK2awPZQYrStW8hpQgDJcqRV57tEvNfxZVVcOCAOih5PKr, "<this>");
        if (cdyQYCBK2awPZQYrStW8hpQgDJcqRV57tEvNfxZVVcOCAOih5PKr.VxUQ9tBhpHJ2AAEDNW8sghc4m() <= 1) {
            return gYXV3FZbh17i6ocMo1T.ByTQIhgl7ezGvHXEd(cdyQYCBK2awPZQYrStW8hpQgDJcqRV57tEvNfxZVVcOCAOih5PKr);
        }
        Object[] array = cdyQYCBK2awPZQYrStW8hpQgDJcqRV57tEvNfxZVVcOCAOih5PKr.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return vmp19D2MODlOL.rE05n5RsRkyWKIeA9cmLXAKv4Hze(array);
    }

    public static final D73WsmU258PapcWZb45SFW h3jnZRsdwYJfY9UhQCkbvWciwvFHv(D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFW, D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFW2, boolean z) {
        Boolean bool = Boolean.FALSE;
        M43IFB1xONkIzX m43IFB1xONkIzX = M43IFB1xONkIzX.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        boolean zBooleanValue = ((Boolean) d73WsmU258PapcWZb45SFW.M9e7PWhFYLD2lOGMker(bool, m43IFB1xONkIzX)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) d73WsmU258PapcWZb45SFW2.M9e7PWhFYLD2lOGMker(bool, m43IFB1xONkIzX)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return d73WsmU258PapcWZb45SFW.RhfGHxtXxy0M0grmp2jkRjQg(d73WsmU258PapcWZb45SFW2);
        }
        M43IFB1xONkIzX m43IFB1xONkIzX2 = new M43IFB1xONkIzX(2, 6);
        hu3HDJRthjXEukAdCh3Tdc hu3hdjrthjxeukadch3tdc = hu3HDJRthjXEukAdCh3Tdc.V57tEvNfxZVVcOCAOih5PKr;
        D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFW3 = (D73WsmU258PapcWZb45SFW) d73WsmU258PapcWZb45SFW.M9e7PWhFYLD2lOGMker(hu3hdjrthjxeukadch3tdc, m43IFB1xONkIzX2);
        Object objM9e7PWhFYLD2lOGMker = d73WsmU258PapcWZb45SFW2;
        if (zBooleanValue2) {
            objM9e7PWhFYLD2lOGMker = d73WsmU258PapcWZb45SFW2.M9e7PWhFYLD2lOGMker(hu3hdjrthjxeukadch3tdc, M43IFB1xONkIzX.LaeGQIruHQu81hfJldjMOQSVblH3x);
        }
        return d73WsmU258PapcWZb45SFW3.RhfGHxtXxy0M0grmp2jkRjQg((D73WsmU258PapcWZb45SFW) objM9e7PWhFYLD2lOGMker);
    }

    public static final liO60E789qF hKs1wlZyvtUNaW1f5ABIGacfPcvX(Socket socket) throws IOException {
        upy0Ra78zBESm9Lr9V9Tg upy0ra78zbesm9lr9v9tg = new upy0Ra78zBESm9Lr9V9Tg(socket);
        OutputStream outputStream = socket.getOutputStream();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(outputStream, "getOutputStream(...)");
        return new liO60E789qF(upy0ra78zbesm9lr9v9tg, new liO60E789qF(outputStream, upy0ra78zbesm9lr9v9tg));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.vdodsodjsdt.jpZwbnG1disJO iKANjmyTSxO6v6UuLPdu7DxOjlS(com.vdodsodjsdt.EUSG2RPrSQzuno7qTyOhv0Az r26) {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.KfeOQNOupsCg6878zi4e.iKANjmyTSxO6v6UuLPdu7DxOjlS(com.vdodsodjsdt.EUSG2RPrSQzuno7qTyOhv0Az):com.vdodsodjsdt.jpZwbnG1disJO");
    }

    public static Drawable jW7EiD0YL6xkbB158jMUzhWNWb1y(Context context, int i) {
        return ZSO61OFnW5yAt.zzpBGItXfub0yWj().V57tEvNfxZVVcOCAOih5PKr(context, i);
    }

    public static gILkjwpvkGF5oaalOyU ko09zE6UAgwkV(String str) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "<this>");
        NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcMVxUQ9tBhpHJ2AAEDNW8sghc4m = gILkjwpvkGF5oaalOyU.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m(str, 0);
        if (nrjuzzioPqfttNRptBDpZDzSYUrcMVxUQ9tBhpHJ2AAEDNW8sghc4m == null) {
            throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
        }
        if (((IkC0kQ0U8GIegkmQzumMteKmNgV) nrjuzzioPqfttNRptBDpZDzSYUrcMVxUQ9tBhpHJ2AAEDNW8sghc4m.ZfQNn8hdWlEQ5cR94249PDsLR) == null) {
            nrjuzzioPqfttNRptBDpZDzSYUrcMVxUQ9tBhpHJ2AAEDNW8sghc4m.ZfQNn8hdWlEQ5cR94249PDsLR = new IkC0kQ0U8GIegkmQzumMteKmNgV(nrjuzzioPqfttNRptBDpZDzSYUrcMVxUQ9tBhpHJ2AAEDNW8sghc4m);
        }
        IkC0kQ0U8GIegkmQzumMteKmNgV ikC0kQ0U8GIegkmQzumMteKmNgV = (IkC0kQ0U8GIegkmQzumMteKmNgV) nrjuzzioPqfttNRptBDpZDzSYUrcMVxUQ9tBhpHJ2AAEDNW8sghc4m.ZfQNn8hdWlEQ5cR94249PDsLR;
        ej6unYlOWMDF.p59rPv72J9(ikC0kQ0U8GIegkmQzumMteKmNgV);
        String str2 = (String) ikC0kQ0U8GIegkmQzumMteKmNgV.get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(lowerCase, "toLowerCase(...)");
        if (((IkC0kQ0U8GIegkmQzumMteKmNgV) nrjuzzioPqfttNRptBDpZDzSYUrcMVxUQ9tBhpHJ2AAEDNW8sghc4m.ZfQNn8hdWlEQ5cR94249PDsLR) == null) {
            nrjuzzioPqfttNRptBDpZDzSYUrcMVxUQ9tBhpHJ2AAEDNW8sghc4m.ZfQNn8hdWlEQ5cR94249PDsLR = new IkC0kQ0U8GIegkmQzumMteKmNgV(nrjuzzioPqfttNRptBDpZDzSYUrcMVxUQ9tBhpHJ2AAEDNW8sghc4m);
        }
        IkC0kQ0U8GIegkmQzumMteKmNgV ikC0kQ0U8GIegkmQzumMteKmNgV2 = (IkC0kQ0U8GIegkmQzumMteKmNgV) nrjuzzioPqfttNRptBDpZDzSYUrcMVxUQ9tBhpHJ2AAEDNW8sghc4m.ZfQNn8hdWlEQ5cR94249PDsLR;
        ej6unYlOWMDF.p59rPv72J9(ikC0kQ0U8GIegkmQzumMteKmNgV2);
        String lowerCase2 = ((String) ikC0kQ0U8GIegkmQzumMteKmNgV2.get(2)).toLowerCase(locale);
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(lowerCase2, "toLowerCase(...)");
        ArrayList arrayList = new ArrayList();
        Matcher matcher = (Matcher) nrjuzzioPqfttNRptBDpZDzSYUrcMVxUQ9tBhpHJ2AAEDNW8sghc4m.zzpBGItXfub0yWj;
        int i = F44whnLsbQ.BJQHddi0Plr5ElWetCyaixWOg9(matcher.start(), matcher.end()).ZfQNn8hdWlEQ5cR94249PDsLR;
        while (true) {
            int i2 = i + 1;
            if (i2 >= str.length()) {
                return new gILkjwpvkGF5oaalOyU(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcMVxUQ9tBhpHJ2AAEDNW8sghc4m2 = gILkjwpvkGF5oaalOyU.LaeGQIruHQu81hfJldjMOQSVblH3x.VxUQ9tBhpHJ2AAEDNW8sghc4m(str, i2);
            if (nrjuzzioPqfttNRptBDpZDzSYUrcMVxUQ9tBhpHJ2AAEDNW8sghc4m2 == null) {
                StringBuilder sb = new StringBuilder("Parameter is not formatted correctly: \"");
                String strSubstring = str.substring(i2);
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strSubstring, "substring(...)");
                sb.append(strSubstring);
                sb.append("\" for: \"");
                sb.append(str);
                sb.append('\"');
                throw new IllegalArgumentException(sb.toString().toString());
            }
            Matcher matcher2 = (Matcher) nrjuzzioPqfttNRptBDpZDzSYUrcMVxUQ9tBhpHJ2AAEDNW8sghc4m2.zzpBGItXfub0yWj;
            QW59YEFNB5tWX9c7WYp qW59YEFNB5tWX9c7WYp = (QW59YEFNB5tWX9c7WYp) nrjuzzioPqfttNRptBDpZDzSYUrcMVxUQ9tBhpHJ2AAEDNW8sghc4m2.V57tEvNfxZVVcOCAOih5PKr;
            lkIZZ3qLf0vosCrRGDmqT3HUB24f lkizz3qlf0voscrrgdmqt3hub24fZzpBGItXfub0yWj = qW59YEFNB5tWX9c7WYp.zzpBGItXfub0yWj(1);
            String str3 = lkizz3qlf0voscrrgdmqt3hub24fZzpBGItXfub0yWj != null ? lkizz3qlf0voscrrgdmqt3hub24fZzpBGItXfub0yWj.VxUQ9tBhpHJ2AAEDNW8sghc4m : null;
            if (str3 == null) {
                i = F44whnLsbQ.BJQHddi0Plr5ElWetCyaixWOg9(matcher2.start(), matcher2.end()).ZfQNn8hdWlEQ5cR94249PDsLR;
            } else {
                lkIZZ3qLf0vosCrRGDmqT3HUB24f lkizz3qlf0voscrrgdmqt3hub24fZzpBGItXfub0yWj2 = qW59YEFNB5tWX9c7WYp.zzpBGItXfub0yWj(2);
                String strSubstring2 = lkizz3qlf0voscrrgdmqt3hub24fZzpBGItXfub0yWj2 != null ? lkizz3qlf0voscrrgdmqt3hub24fZzpBGItXfub0yWj2.VxUQ9tBhpHJ2AAEDNW8sghc4m : null;
                if (strSubstring2 == null) {
                    lkIZZ3qLf0vosCrRGDmqT3HUB24f lkizz3qlf0voscrrgdmqt3hub24fZzpBGItXfub0yWj3 = qW59YEFNB5tWX9c7WYp.zzpBGItXfub0yWj(3);
                    ej6unYlOWMDF.p59rPv72J9(lkizz3qlf0voscrrgdmqt3hub24fZzpBGItXfub0yWj3);
                    strSubstring2 = lkizz3qlf0voscrrgdmqt3hub24fZzpBGItXfub0yWj3.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                } else if (strSubstring2.length() > 0 && F44whnLsbQ.ko09zE6UAgwkV(strSubstring2.charAt(0), '\'', false) && strSubstring2.length() > 0 && F44whnLsbQ.ko09zE6UAgwkV(strSubstring2.charAt(cwhrCnoVJBjJE2CBEAvBopmgF.r0dB0ojIy6g8mnk1(strSubstring2)), '\'', false) && strSubstring2.length() > 2) {
                    strSubstring2 = strSubstring2.substring(1, strSubstring2.length() - 1);
                    ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strSubstring2, "substring(...)");
                }
                arrayList.add(str3);
                arrayList.add(strSubstring2);
                i = F44whnLsbQ.BJQHddi0Plr5ElWetCyaixWOg9(matcher2.start(), matcher2.end()).ZfQNn8hdWlEQ5cR94249PDsLR;
            }
        }
    }

    public static void lQ0rO9lhQIyVe7Rp6(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            ZtxxgIh9OPs.VxUQ9tBhpHJ2AAEDNW8sghc4m(view, charSequence);
            return;
        }
        SK2iudXiiGFYEIJZmC sK2iudXiiGFYEIJZmC = SK2iudXiiGFYEIJZmC.q1wNbhk2O6;
        if (sK2iudXiiGFYEIJZmC != null && sK2iudXiiGFYEIJZmC.V57tEvNfxZVVcOCAOih5PKr == view) {
            SK2iudXiiGFYEIJZmC.zzpBGItXfub0yWj(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new SK2iudXiiGFYEIJZmC(view, charSequence);
            return;
        }
        SK2iudXiiGFYEIJZmC sK2iudXiiGFYEIJZmC2 = SK2iudXiiGFYEIJZmC.p59rPv72J9;
        if (sK2iudXiiGFYEIJZmC2 != null && sK2iudXiiGFYEIJZmC2.V57tEvNfxZVVcOCAOih5PKr == view) {
            sK2iudXiiGFYEIJZmC2.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static final kooPss93uoBTOWlOLlaD p59rPv72J9(Context context, Eh21X7fdrXs eh21X7fdrXs) {
        buGEWuZSQxpsIlfiQeH bugewuzsqxpsilfiqeh;
        boolean zContainsKey;
        int i;
        ej6unYlOWMDF.pYmKDYlAmhudp(context, "context");
        nMRZPpfLCgJyuB nmrzppflcgjyub = new nMRZPpfLCgJyuB(eh21X7fdrXs.V57tEvNfxZVVcOCAOih5PKr);
        Context applicationContext = context.getApplicationContext();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(applicationContext, "context.applicationContext");
        ki0ZWFpNS2MqGdb ki0zwfpns2mqgdb = (ki0ZWFpNS2MqGdb) nmrzppflcgjyub.V57tEvNfxZVVcOCAOih5PKr;
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(ki0zwfpns2mqgdb, "workTaskExecutor.serialTaskExecutor");
        VSncX8ksA0tswc2TMhzhOMdd vSncX8ksA0tswc2TMhzhOMdd = eh21X7fdrXs.ZfQNn8hdWlEQ5cR94249PDsLR;
        boolean z = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        ej6unYlOWMDF.pYmKDYlAmhudp(vSncX8ksA0tswc2TMhzhOMdd, "clock");
        int i2 = 6;
        if (z) {
            bugewuzsqxpsilfiqeh = new buGEWuZSQxpsIlfiQeH(applicationContext, null);
            bugewuzsqxpsilfiqeh.GI83zq0G8e7zkn = true;
        } else {
            if (cwhrCnoVJBjJE2CBEAvBopmgF.DNP7yXLsojH0rPMHr8fUY14M("androidx.work.workdb")) {
                throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            }
            buGEWuZSQxpsIlfiQeH bugewuzsqxpsilfiqeh2 = new buGEWuZSQxpsIlfiQeH(applicationContext, "androidx.work.workdb");
            bugewuzsqxpsilfiqeh2.NSjgqmGjEzuugn2SsG1mZFP = new Jc01di1Hsv(i2, applicationContext);
            bugewuzsqxpsilfiqeh = bugewuzsqxpsilfiqeh2;
        }
        bugewuzsqxpsilfiqeh.zIvmSL0wzmmKGc3X39b2Gw2mUGE = ki0zwfpns2mqgdb;
        Ofbi2hz5bZSXx ofbi2hz5bZSXx = new Ofbi2hz5bZSXx(vSncX8ksA0tswc2TMhzhOMdd);
        ArrayList arrayList = bugewuzsqxpsilfiqeh.V57tEvNfxZVVcOCAOih5PKr;
        arrayList.add(ofbi2hz5bZSXx);
        bugewuzsqxpsilfiqeh.VxUQ9tBhpHJ2AAEDNW8sghc4m(cjLZ5U3rfR2ILd.NSjgqmGjEzuugn2SsG1mZFP);
        bugewuzsqxpsilfiqeh.VxUQ9tBhpHJ2AAEDNW8sghc4m(new u7sKwVkq9wY342fX3xuIdCIDU9(applicationContext, 2, 3));
        bugewuzsqxpsilfiqeh.VxUQ9tBhpHJ2AAEDNW8sghc4m(cjLZ5U3rfR2ILd.GI83zq0G8e7zkn);
        bugewuzsqxpsilfiqeh.VxUQ9tBhpHJ2AAEDNW8sghc4m(cjLZ5U3rfR2ILd.M9e7PWhFYLD2lOGMker);
        bugewuzsqxpsilfiqeh.VxUQ9tBhpHJ2AAEDNW8sghc4m(new u7sKwVkq9wY342fX3xuIdCIDU9(applicationContext, 5, 6));
        bugewuzsqxpsilfiqeh.VxUQ9tBhpHJ2AAEDNW8sghc4m(cjLZ5U3rfR2ILd.HzCpKshMOoaw76hFcbOVRYMeRd);
        bugewuzsqxpsilfiqeh.VxUQ9tBhpHJ2AAEDNW8sghc4m(cjLZ5U3rfR2ILd.KUYypEB4eNWOZWVDpH);
        bugewuzsqxpsilfiqeh.VxUQ9tBhpHJ2AAEDNW8sghc4m(cjLZ5U3rfR2ILd.q1wNbhk2O6);
        bugewuzsqxpsilfiqeh.VxUQ9tBhpHJ2AAEDNW8sghc4m(new u7sKwVkq9wY342fX3xuIdCIDU9(applicationContext));
        bugewuzsqxpsilfiqeh.VxUQ9tBhpHJ2AAEDNW8sghc4m(new u7sKwVkq9wY342fX3xuIdCIDU9(applicationContext, 10, 11));
        bugewuzsqxpsilfiqeh.VxUQ9tBhpHJ2AAEDNW8sghc4m(cjLZ5U3rfR2ILd.ZfQNn8hdWlEQ5cR94249PDsLR);
        bugewuzsqxpsilfiqeh.VxUQ9tBhpHJ2AAEDNW8sghc4m(cjLZ5U3rfR2ILd.LaeGQIruHQu81hfJldjMOQSVblH3x);
        bugewuzsqxpsilfiqeh.VxUQ9tBhpHJ2AAEDNW8sghc4m(cjLZ5U3rfR2ILd.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
        bugewuzsqxpsilfiqeh.VxUQ9tBhpHJ2AAEDNW8sghc4m(cjLZ5U3rfR2ILd.ZLZeBXTMq0zDztBxtRTuCHrapQ);
        bugewuzsqxpsilfiqeh.VxUQ9tBhpHJ2AAEDNW8sghc4m(new u7sKwVkq9wY342fX3xuIdCIDU9(applicationContext, 21, 22));
        bugewuzsqxpsilfiqeh.HzCpKshMOoaw76hFcbOVRYMeRd = false;
        bugewuzsqxpsilfiqeh.KUYypEB4eNWOZWVDpH = true;
        Executor executor = bugewuzsqxpsilfiqeh.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (executor == null && bugewuzsqxpsilfiqeh.ZLZeBXTMq0zDztBxtRTuCHrapQ == null) {
            SrWj7TXjIxKCejoDzqp3JUFJYtU srWj7TXjIxKCejoDzqp3JUFJYtU = MeBidpR8Y2gW4.vE4yDIjexsP2lGjLaTcB;
            bugewuzsqxpsilfiqeh.ZLZeBXTMq0zDztBxtRTuCHrapQ = srWj7TXjIxKCejoDzqp3JUFJYtU;
            bugewuzsqxpsilfiqeh.zIvmSL0wzmmKGc3X39b2Gw2mUGE = srWj7TXjIxKCejoDzqp3JUFJYtU;
        } else if (executor != null && bugewuzsqxpsilfiqeh.ZLZeBXTMq0zDztBxtRTuCHrapQ == null) {
            bugewuzsqxpsilfiqeh.ZLZeBXTMq0zDztBxtRTuCHrapQ = executor;
        } else if (executor == null) {
            bugewuzsqxpsilfiqeh.zIvmSL0wzmmKGc3X39b2Gw2mUGE = bugewuzsqxpsilfiqeh.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        }
        HashSet hashSet = bugewuzsqxpsilfiqeh.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        LinkedHashSet linkedHashSet = bugewuzsqxpsilfiqeh.Ca81ebIan1u;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                    throw new IllegalArgumentException(u9SlVAuoWhQUfJ.NSjgqmGjEzuugn2SsG1mZFP("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ", iIntValue).toString());
                }
            }
        }
        E2spx2fDWN5IUkY2rPialU0ch7 fG8LIxsgYiLSfhN0jYKIKr = bugewuzsqxpsilfiqeh.NSjgqmGjEzuugn2SsG1mZFP;
        if (fG8LIxsgYiLSfhN0jYKIKr == null) {
            fG8LIxsgYiLSfhN0jYKIKr = new FG8LIxsgYiLSfhN0jYKIKr(12);
        }
        E2spx2fDWN5IUkY2rPialU0ch7 e2spx2fDWN5IUkY2rPialU0ch7 = fG8LIxsgYiLSfhN0jYKIKr;
        if (bugewuzsqxpsilfiqeh.q1wNbhk2O6 > 0) {
            if (bugewuzsqxpsilfiqeh.zzpBGItXfub0yWj != null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
        }
        boolean z2 = bugewuzsqxpsilfiqeh.GI83zq0G8e7zkn;
        int i3 = bugewuzsqxpsilfiqeh.M9e7PWhFYLD2lOGMker;
        if (i3 == 0) {
            throw null;
        }
        Context context2 = bugewuzsqxpsilfiqeh.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (i3 == 1) {
            Object systemService = context2.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            i3 = (activityManager == null || activityManager.isLowRamDevice()) ? 2 : 3;
        }
        Executor executor2 = bugewuzsqxpsilfiqeh.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (executor2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Executor executor3 = bugewuzsqxpsilfiqeh.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (executor3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        boolean z3 = bugewuzsqxpsilfiqeh.HzCpKshMOoaw76hFcbOVRYMeRd;
        boolean z4 = bugewuzsqxpsilfiqeh.KUYypEB4eNWOZWVDpH;
        String str = bugewuzsqxpsilfiqeh.zzpBGItXfub0yWj;
        N1mT85AVNMY84KnH4 n1mT85AVNMY84KnH4 = bugewuzsqxpsilfiqeh.p59rPv72J9;
        int i4 = i3;
        ArrayList arrayList2 = bugewuzsqxpsilfiqeh.ZfQNn8hdWlEQ5cR94249PDsLR;
        ArrayList arrayList3 = bugewuzsqxpsilfiqeh.LaeGQIruHQu81hfJldjMOQSVblH3x;
        GqVneYMXyuJ8mHvjvRdtat gqVneYMXyuJ8mHvjvRdtat = new GqVneYMXyuJ8mHvjvRdtat(context2, str, e2spx2fDWN5IUkY2rPialU0ch7, n1mT85AVNMY84KnH4, arrayList, z2, i4, executor2, executor3, z3, z4, linkedHashSet, arrayList2, arrayList3);
        Package r10 = WorkDatabase.class.getPackage();
        ej6unYlOWMDF.p59rPv72J9(r10);
        String name = r10.getName();
        String canonicalName = WorkDatabase.class.getCanonicalName();
        ej6unYlOWMDF.p59rPv72J9(canonicalName);
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(name, "fullPackage");
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(canonicalName, "this as java.lang.String).substring(startIndex)");
        }
        String strReplace = canonicalName.replace('.', '_');
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strReplace, "replace(...)");
        String strConcat = strReplace.concat("_Impl");
        try {
            Class<?> cls = Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, WorkDatabase.class.getClassLoader());
            ej6unYlOWMDF.Ca81ebIan1u(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
            WorkDatabase workDatabase = (WorkDatabase) cls.getDeclaredConstructor(null).newInstance(null);
            TGLcRwWGu8YLUNxbS0tKEz tGLcRwWGu8YLUNxbS0tKEz = workDatabase.ZfQNn8hdWlEQ5cR94249PDsLR;
            LinkedHashMap linkedHashMap = workDatabase.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            workDatabase.V57tEvNfxZVVcOCAOih5PKr = workDatabase.LaeGQIruHQu81hfJldjMOQSVblH3x(gqVneYMXyuJ8mHvjvRdtat);
            Set<Class> setGI83zq0G8e7zkn = workDatabase.GI83zq0G8e7zkn();
            BitSet bitSet = new BitSet();
            for (Class cls2 : setGI83zq0G8e7zkn) {
                int size = arrayList3.size() - 1;
                if (size >= 0) {
                    do {
                        i = size;
                        size = i - 1;
                        if (cls2.isAssignableFrom(arrayList3.get(i).getClass())) {
                            bitSet.set(i);
                            break;
                        }
                    } while (size >= 0);
                    i = -1;
                } else {
                    i = -1;
                }
                if (i < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + cls2.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                linkedHashMap.put(cls2, arrayList3.get(i));
            }
            int size2 = arrayList3.size() - 1;
            if (size2 >= 0) {
                while (true) {
                    int i5 = size2 - 1;
                    if (!bitSet.get(size2)) {
                        throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                    }
                    if (i5 < 0) {
                        break;
                    }
                    size2 = i5;
                }
            }
            for (SsiwtF6NFC0P ssiwtF6NFC0P : workDatabase.ZLZeBXTMq0zDztBxtRTuCHrapQ(linkedHashMap)) {
                int i6 = ssiwtF6NFC0P.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                int i7 = ssiwtF6NFC0P.zzpBGItXfub0yWj;
                LinkedHashMap linkedHashMap2 = n1mT85AVNMY84KnH4.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                if (linkedHashMap2.containsKey(Integer.valueOf(i6))) {
                    Map map = (Map) linkedHashMap2.get(Integer.valueOf(i6));
                    if (map == null) {
                        map = XC6rwBjRUhvxaQ8TfYI.V57tEvNfxZVVcOCAOih5PKr;
                    }
                    zContainsKey = map.containsKey(Integer.valueOf(i7));
                } else {
                    zContainsKey = false;
                }
                if (!zContainsKey) {
                    n1mT85AVNMY84KnH4.VxUQ9tBhpHJ2AAEDNW8sghc4m(ssiwtF6NFC0P);
                }
            }
            workDatabase.NSjgqmGjEzuugn2SsG1mZFP().setWriteAheadLoggingEnabled(gqVneYMXyuJ8mHvjvRdtat.ZLZeBXTMq0zDztBxtRTuCHrapQ == 3);
            workDatabase.zIvmSL0wzmmKGc3X39b2Gw2mUGE = gqVneYMXyuJ8mHvjvRdtat.LaeGQIruHQu81hfJldjMOQSVblH3x;
            workDatabase.zzpBGItXfub0yWj = gqVneYMXyuJ8mHvjvRdtat.NSjgqmGjEzuugn2SsG1mZFP;
            new ki0ZWFpNS2MqGdb(gqVneYMXyuJ8mHvjvRdtat.GI83zq0G8e7zkn, 1);
            workDatabase.LaeGQIruHQu81hfJldjMOQSVblH3x = gqVneYMXyuJ8mHvjvRdtat.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            Map mapM9e7PWhFYLD2lOGMker = workDatabase.M9e7PWhFYLD2lOGMker();
            BitSet bitSet2 = new BitSet();
            for (Map.Entry entry : mapM9e7PWhFYLD2lOGMker.entrySet()) {
                Class cls3 = (Class) entry.getKey();
                for (Class cls4 : (List) entry.getValue()) {
                    int size3 = arrayList2.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i8 = size3 - 1;
                            if (cls4.isAssignableFrom(arrayList2.get(size3).getClass())) {
                                bitSet2.set(size3);
                                break;
                            }
                            if (i8 < 0) {
                                break;
                            }
                            size3 = i8;
                        }
                        size3 = -1;
                    } else {
                        size3 = -1;
                    }
                    if (!(size3 >= 0)) {
                        throw new IllegalArgumentException(("A required type converter (" + cls4 + ") for " + cls3.getCanonicalName() + " is missing in the database configuration.").toString());
                    }
                    workDatabase.HzCpKshMOoaw76hFcbOVRYMeRd.put(cls4, arrayList2.get(size3));
                }
            }
            int size4 = arrayList2.size() - 1;
            if (size4 >= 0) {
                while (true) {
                    int i9 = size4 - 1;
                    if (!bitSet2.get(size4)) {
                        throw new IllegalArgumentException("Unexpected type converter " + arrayList2.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                    if (i9 < 0) {
                        break;
                    }
                    size4 = i9;
                }
            }
            Context applicationContext2 = context.getApplicationContext();
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(applicationContext2, "context.applicationContext");
            Context applicationContext3 = applicationContext2.getApplicationContext();
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(applicationContext3, "context.applicationContext");
            NXYyCFwrJiQhpxSwJB6lJD37IZ nXYyCFwrJiQhpxSwJB6lJD37IZ = new NXYyCFwrJiQhpxSwJB6lJD37IZ(applicationContext3, nmrzppflcgjyub, 0);
            Context applicationContext4 = applicationContext2.getApplicationContext();
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(applicationContext4, "context.applicationContext");
            NXYyCFwrJiQhpxSwJB6lJD37IZ nXYyCFwrJiQhpxSwJB6lJD37IZ2 = new NXYyCFwrJiQhpxSwJB6lJD37IZ(applicationContext4, nmrzppflcgjyub, 1);
            Context applicationContext5 = applicationContext2.getApplicationContext();
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(applicationContext5, "context.applicationContext");
            String str2 = HEvwRDc2p73b2IOU2WQo18Rp.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            fNrXyotlf8e6 fnrxyotlf8e6 = new fNrXyotlf8e6(applicationContext5, nmrzppflcgjyub);
            Context applicationContext6 = applicationContext2.getApplicationContext();
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(applicationContext6, "context.applicationContext");
            NXYyCFwrJiQhpxSwJB6lJD37IZ nXYyCFwrJiQhpxSwJB6lJD37IZ3 = new NXYyCFwrJiQhpxSwJB6lJD37IZ(applicationContext6, nmrzppflcgjyub, 2);
            UL4JI0eLnaD84py2JT uL4JI0eLnaD84py2JT = new UL4JI0eLnaD84py2JT();
            uL4JI0eLnaD84py2JT.VxUQ9tBhpHJ2AAEDNW8sghc4m = applicationContext2;
            uL4JI0eLnaD84py2JT.zzpBGItXfub0yWj = nXYyCFwrJiQhpxSwJB6lJD37IZ;
            uL4JI0eLnaD84py2JT.V57tEvNfxZVVcOCAOih5PKr = nXYyCFwrJiQhpxSwJB6lJD37IZ2;
            uL4JI0eLnaD84py2JT.ZfQNn8hdWlEQ5cR94249PDsLR = fnrxyotlf8e6;
            uL4JI0eLnaD84py2JT.LaeGQIruHQu81hfJldjMOQSVblH3x = nXYyCFwrJiQhpxSwJB6lJD37IZ3;
            IVPB9DLMIoeA0Qp8AgwLlJ iVPB9DLMIoeA0Qp8AgwLlJ = new IVPB9DLMIoeA0Qp8AgwLlJ(context.getApplicationContext(), eh21X7fdrXs, nmrzppflcgjyub, workDatabase);
            String str3 = IajRZM8bx6ydOtWJS1Sd9DI.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            T9LNBTwcS97exQoP t9LNBTwcS97exQoP = new T9LNBTwcS97exQoP(context, workDatabase, eh21X7fdrXs);
            EO99NGehiWVPkTbvSXC31nMw5bMD.VxUQ9tBhpHJ2AAEDNW8sghc4m(context, SystemJobService.class, true);
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(IajRZM8bx6ydOtWJS1Sd9DI.VxUQ9tBhpHJ2AAEDNW8sghc4m, "Created SystemJobScheduler and enabled SystemJobService");
            return new kooPss93uoBTOWlOLlaD(context.getApplicationContext(), eh21X7fdrXs, nmrzppflcgjyub, workDatabase, vmp19D2MODlOL.rE05n5RsRkyWKIeA9cmLXAKv4Hze(new SBDculXSmt[]{t9LNBTwcS97exQoP, new jlv3qp7JVl9aXN(context, eh21X7fdrXs, uL4JI0eLnaD84py2JT, iVPB9DLMIoeA0Qp8AgwLlJ, new o6OxmOsCD9HJ6LF8UTncnTX9Cf21(iVPB9DLMIoeA0Qp8AgwLlJ, nmrzppflcgjyub), nmrzppflcgjyub)}), iVPB9DLMIoeA0Qp8AgwLlJ, uL4JI0eLnaD84py2JT);
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + WorkDatabase.class.getCanonicalName() + ". " + strConcat + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + WorkDatabase.class.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + WorkDatabase.class.getCanonicalName());
        }
    }

    public static final LL6zXCXfmDYzdHCRTT pYmKDYlAmhudp(Executor executor) {
        return new LWcyhQFsn8EAAdNGJ(executor);
    }

    public static scWJtRrcQpw1SO8qayAb4dT2LAw q1wNbhk2O6(Context context) {
        ProviderInfo providerInfo;
        zDPogDYnaf4Ok5KljFrcZIbCgM2B zdpogdynaf4ok5kljfrczibcgm2b;
        ApplicationInfo applicationInfo;
        FG8LIxsgYiLSfhN0jYKIKr kjfyq5kjzjnidhbegtiqs = Build.VERSION.SDK_INT >= 28 ? new kJfyq5kjZJnidHbEGtiqS(2) : new FG8LIxsgYiLSfhN0jYKIKr(2);
        PackageManager packageManager = context.getPackageManager();
        KUYypEB4eNWOZWVDpH(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            zdpogdynaf4ok5kljfrczibcgm2b = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrM9e7PWhFYLD2lOGMker = kjfyq5kjzjnidhbegtiqs.M9e7PWhFYLD2lOGMker(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrM9e7PWhFYLD2lOGMker) {
                    arrayList.add(signature.toByteArray());
                }
                zdpogdynaf4ok5kljfrczibcgm2b = new zDPogDYnaf4Ok5KljFrcZIbCgM2B(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                zdpogdynaf4ok5kljfrczibcgm2b = null;
            }
        }
        if (zdpogdynaf4ok5kljfrczibcgm2b == null) {
            return null;
        }
        return new scWJtRrcQpw1SO8qayAb4dT2LAw(new CyFp8PEPozZQnhAUmNMq(context, zdpogdynaf4ok5kljfrczibcgm2b));
    }

    public static ArrayList qNPQb1obP7(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < materialToolbar.getChildCount(); i++) {
            View childAt = materialToolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static void vXWl0o6I4U59CgHs9(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static List wRCD0SdqWCowdYU7bmzN(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (typedArrayObtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static final nc8XjqIVIbczRCLb7rZ6G wdI7vzA3Qmcwd(Socket socket) throws IOException {
        upy0Ra78zBESm9Lr9V9Tg upy0ra78zbesm9lr9v9tg = new upy0Ra78zBESm9Lr9V9Tg(socket);
        InputStream inputStream = socket.getInputStream();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(inputStream, "getInputStream(...)");
        return new nc8XjqIVIbczRCLb7rZ6G(0, upy0ra78zbesm9lr9v9tg, new nc8XjqIVIbczRCLb7rZ6G(1, inputStream, upy0ra78zbesm9lr9v9tg));
    }

    public static final Object zzpBGItXfub0yWj(RsZYdPZzPnvxFX2Iwr2ecGA rsZYdPZzPnvxFX2Iwr2ecGA, GvuED9Eb9kjnYjng4BPJg7J gvuED9Eb9kjnYjng4BPJg7J) throws Throwable {
        try {
            if (rsZYdPZzPnvxFX2Iwr2ecGA.isDone()) {
                return mBO0VNMBTnz.zIvmSL0wzmmKGc3X39b2Gw2mUGE(rsZYdPZzPnvxFX2Iwr2ecGA);
            }
            YAf4BMDpiCAb4hYaN6VqW yAf4BMDpiCAb4hYaN6VqW = new YAf4BMDpiCAb4hYaN6VqW(1, sGipz63rTUmSj3uFDvOtzihao.qNPQb1obP7(gvuED9Eb9kjnYjng4BPJg7J));
            rsZYdPZzPnvxFX2Iwr2ecGA.VxUQ9tBhpHJ2AAEDNW8sghc4m(new UkXxyCicd0z9TnGhIYxZdP3m7gyNE(rsZYdPZzPnvxFX2Iwr2ecGA, yAf4BMDpiCAb4hYaN6VqW, 1), Pc6RWKQx1TgzViTaxeEB62.V57tEvNfxZVVcOCAOih5PKr);
            yAf4BMDpiCAb4hYaN6VqW.Irh5auREsoeV1C1RaBamlmy(new IfFMrI1zTS7HZ2joFZe(1, rsZYdPZzPnvxFX2Iwr2ecGA));
            return yAf4BMDpiCAb4hYaN6VqW.f6ZQsR6bPLvvCDNXOUc();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause != null) {
                throw cause;
            }
            fgDtWyi9UWDNPECrQO4B3R9Or9 fgdtwyi9uwdnpecrqo4b3r9or9 = new fgDtWyi9UWDNPECrQO4B3R9Or9();
            ej6unYlOWMDF.zOk739gUM7zIZC25HHUxoiyixWFjn(fgdtwyi9uwdnpecrqo4b3r9or9, ej6unYlOWMDF.class.getName());
            throw fgdtwyi9uwdnpecrqo4b3r9or9;
        }
    }

    public abstract boolean GI83zq0G8e7zkn(mBO0VNMBTnz mbo0vnmbtnz, pjNHP1KyCckTb7 pjnhp1kyccktb7, pjNHP1KyCckTb7 pjnhp1kyccktb72);

    public abstract int Irh5auREsoeV1C1RaBamlmy();

    public abstract boolean ItrQwCXbty5PZtje5JS(View view, float f);

    public abstract void JUdwvN8LfOMa(JtQzUw7TKDRZv8Cwx jtQzUw7TKDRZv8Cwx, JtQzUw7TKDRZv8Cwx jtQzUw7TKDRZv8Cwx2, Window window, View view, boolean z, boolean z2);

    public abstract float LaeGQIruHQu81hfJldjMOQSVblH3x(int i);

    public abstract boolean NSjgqmGjEzuugn2SsG1mZFP(mBO0VNMBTnz mbo0vnmbtnz, Object obj, Object obj2);

    public abstract int RhfGHxtXxy0M0grmp2jkRjQg();

    public abstract int TaDO7ogis3aEiWEtq();

    public abstract void YdNRGRc4rly(pjNHP1KyCckTb7 pjnhp1kyccktb7, Thread thread);

    public abstract boolean ZLZeBXTMq0zDztBxtRTuCHrapQ(mBO0VNMBTnz mbo0vnmbtnz, yOuYFVCVfzcehN7zbUPS9Gj0l8 youyfvcvfzcehn7zbups9gj0l8, yOuYFVCVfzcehN7zbUPS9Gj0l8 youyfvcvfzcehn7zbups9gj0l82);

    public abstract int ZfQNn8hdWlEQ5cR94249PDsLR(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract boolean aXO0LSrt8bKV(View view);

    public abstract int f6ZQsR6bPLvvCDNXOUc();

    public abstract boolean pzqP2AqKW6J5PO8zCKnW(float f);

    public abstract int q11o1hieEkZDhF1MGOZI26oZiDT(View view);

    public abstract void qygqjTppWwx992(Typeface typeface);

    public abstract int vBGA6pPLqSMuYGvprl270j7();

    public abstract boolean vE4yDIjexsP2lGjLaTcB(float f, float f2);

    public abstract int w0Wu95l8dVNw5rZMRu(CoordinatorLayout coordinatorLayout);

    public abstract void y1NaPKTl7R18DOr6e8i5(int i);

    public abstract void ymT6yQrus3w(pjNHP1KyCckTb7 pjnhp1kyccktb7, pjNHP1KyCckTb7 pjnhp1kyccktb72);

    public void zIvmSL0wzmmKGc3X39b2Gw2mUGE(int i) {
        new Handler(Looper.getMainLooper()).post(new CD5GcvNfXO(this, i, 0));
    }

    public abstract void zOk739gUM7zIZC25HHUxoiyixWFjn(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);

    public void VxUQ9tBhpHJ2AAEDNW8sghc4m(Window window) {
    }
}
