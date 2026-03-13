package com.vdodsodjsdt;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.SavedStateHandleController;
import com.vdodsodjsdt.XOTOHmUA5NYhlyOBh7;
import com.vdodsodjsdt.hCgEybj69le8;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class F44whnLsbQ {
    public static final aqhhl68tQrgIjcMGB3dY2YLK3vN GI83zq0G8e7zkn;
    public static final aqhhl68tQrgIjcMGB3dY2YLK3vN LaeGQIruHQu81hfJldjMOQSVblH3x;
    public static final aqhhl68tQrgIjcMGB3dY2YLK3vN M9e7PWhFYLD2lOGMker;
    public static final aqhhl68tQrgIjcMGB3dY2YLK3vN ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public static final aqhhl68tQrgIjcMGB3dY2YLK3vN zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public static final float[][] VxUQ9tBhpHJ2AAEDNW8sghc4m = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] zzpBGItXfub0yWj = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] V57tEvNfxZVVcOCAOih5PKr = {95.047f, 100.0f, 108.883f};
    public static final float[][] ZfQNn8hdWlEQ5cR94249PDsLR = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final boolean[] NSjgqmGjEzuugn2SsG1mZFP = new boolean[3];

    static {
        int i = 2;
        LaeGQIruHQu81hfJldjMOQSVblH3x = new aqhhl68tQrgIjcMGB3dY2YLK3vN("UNDEFINED", i);
        zIvmSL0wzmmKGc3X39b2Gw2mUGE = new aqhhl68tQrgIjcMGB3dY2YLK3vN("REUSABLE_CLAIMED", i);
        ZLZeBXTMq0zDztBxtRTuCHrapQ = new aqhhl68tQrgIjcMGB3dY2YLK3vN("CONDITION_FALSE", i);
        GI83zq0G8e7zkn = new aqhhl68tQrgIjcMGB3dY2YLK3vN("NONE", i);
        M9e7PWhFYLD2lOGMker = new aqhhl68tQrgIjcMGB3dY2YLK3vN("PENDING", i);
    }

    public F44whnLsbQ() {
        new ConcurrentHashMap();
    }

    public static stS3uecPKs3MU4EfeT BJQHddi0Plr5ElWetCyaixWOg9(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new stS3uecPKs3MU4EfeT(i, i2 - 1, 1);
        }
        stS3uecPKs3MU4EfeT sts3uecpks3mu4efet = stS3uecPKs3MU4EfeT.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        return stS3uecPKs3MU4EfeT.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    }

    public static int Ca81ebIan1u(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static byte[] GI83zq0G8e7zkn(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static rER8RCI8e7U94QVUg H2VFYNJEVGAX(stS3uecPKs3MU4EfeT sts3uecpks3mu4efet, int i) {
        ej6unYlOWMDF.pYmKDYlAmhudp(sts3uecpks3mu4efet, "<this>");
        boolean z = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
        }
        int i2 = sts3uecpks3mu4efet.V57tEvNfxZVVcOCAOih5PKr;
        int i3 = sts3uecpks3mu4efet.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (sts3uecpks3mu4efet.LaeGQIruHQu81hfJldjMOQSVblH3x <= 0) {
            i = -i;
        }
        return new rER8RCI8e7U94QVUg(i2, i3, i);
    }

    public static int HVEwbdULInpTNa0IG(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = V57tEvNfxZVVcOCAOih5PKr;
        return PyYsF2FE67iANgZ0fDkVtNG5uhA.VxUQ9tBhpHJ2AAEDNW8sghc4m(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    public static ColorStateList Irh5auREsoeV1C1RaBamlmy(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !NeiBzdigGVkOo7gD.vBGA6pPLqSMuYGvprl270j7(drawable)) {
            return null;
        }
        return NeiBzdigGVkOo7gD.zIvmSL0wzmmKGc3X39b2Gw2mUGE(drawable).getColorStateList();
    }

    public static byte[] ItrQwCXbty5PZtje5JS(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = fileInputStream.read(bArr2);
                if (i4 < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            if (i3 == i) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw new IllegalStateException("Inflater did not finish");
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    public static byte[] JUdwvN8LfOMa(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                throw new IllegalStateException(u9SlVAuoWhQUfJ.NSjgqmGjEzuugn2SsG1mZFP("Not enough bytes to read: ", i));
            }
            i2 += i3;
        }
        return bArr;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void KYZ9RyuOc42A2J(MGk7KfXeUv8YAfWiUw5LfOd mGk7KfXeUv8YAfWiUw5LfOd) throws Throwable {
        D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFW;
        Thread threadCurrentThread = Thread.currentThread();
        IN79WcIk5xB4t0GjRT43qPLs5 iN79WcIk5xB4t0GjRT43qPLs5 = IN79WcIk5xB4t0GjRT43qPLs5.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        CwickyU0ZjEG0JwJwvvsOp0vRH0PB cwickyU0ZjEG0JwJwvvsOp0vRH0PBVxUQ9tBhpHJ2AAEDNW8sghc4m = bxg58FPVmiJdXQNjZxsZ.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        boolean zBooleanValue = ((Boolean) cwickyU0ZjEG0JwJwvvsOp0vRH0PBVxUQ9tBhpHJ2AAEDNW8sghc4m.M9e7PWhFYLD2lOGMker(Boolean.FALSE, M43IFB1xONkIzX.zIvmSL0wzmmKGc3X39b2Gw2mUGE)).booleanValue();
        if (zBooleanValue) {
            hu3HDJRthjXEukAdCh3Tdc hu3hdjrthjxeukadch3tdc = hu3HDJRthjXEukAdCh3Tdc.V57tEvNfxZVVcOCAOih5PKr;
            D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFW2 = (D73WsmU258PapcWZb45SFW) (zBooleanValue ? cwickyU0ZjEG0JwJwvvsOp0vRH0PBVxUQ9tBhpHJ2AAEDNW8sghc4m.M9e7PWhFYLD2lOGMker(hu3hdjrthjxeukadch3tdc, M43IFB1xONkIzX.LaeGQIruHQu81hfJldjMOQSVblH3x) : cwickyU0ZjEG0JwJwvvsOp0vRH0PBVxUQ9tBhpHJ2AAEDNW8sghc4m);
            hu3hdjrthjxeukadch3tdc.RhfGHxtXxy0M0grmp2jkRjQg(d73WsmU258PapcWZb45SFW2);
            d73WsmU258PapcWZb45SFW = d73WsmU258PapcWZb45SFW2;
        } else {
            d73WsmU258PapcWZb45SFW = cwickyU0ZjEG0JwJwvvsOp0vRH0PBVxUQ9tBhpHJ2AAEDNW8sghc4m;
        }
        J5GsGzwx46 j5GsGzwx46 = wRXy41zFnpLczeVR.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFWRhfGHxtXxy0M0grmp2jkRjQg = d73WsmU258PapcWZb45SFW;
        if (d73WsmU258PapcWZb45SFW != j5GsGzwx46) {
            RKQqw795jswHmdL5AnfuvmeBZD rKQqw795jswHmdL5AnfuvmeBZDQ11o1hieEkZDhF1MGOZI26oZiDT = d73WsmU258PapcWZb45SFW.q11o1hieEkZDhF1MGOZI26oZiDT(iN79WcIk5xB4t0GjRT43qPLs5);
            d73WsmU258PapcWZb45SFWRhfGHxtXxy0M0grmp2jkRjQg = d73WsmU258PapcWZb45SFW;
            if (rKQqw795jswHmdL5AnfuvmeBZDQ11o1hieEkZDhF1MGOZI26oZiDT == null) {
                d73WsmU258PapcWZb45SFWRhfGHxtXxy0M0grmp2jkRjQg = d73WsmU258PapcWZb45SFW.RhfGHxtXxy0M0grmp2jkRjQg(j5GsGzwx46);
            }
        }
        gQlBB3OHfTjE gqlbb3ohftje = new gQlBB3OHfTjE(d73WsmU258PapcWZb45SFWRhfGHxtXxy0M0grmp2jkRjQg, threadCurrentThread, cwickyU0ZjEG0JwJwvvsOp0vRH0PBVxUQ9tBhpHJ2AAEDNW8sghc4m);
        gqlbb3ohftje.KYZ9RyuOc42A2J(Ho90S2EW0SHKgWtNbbE4M9TX.V57tEvNfxZVVcOCAOih5PKr, gqlbb3ohftje, mGk7KfXeUv8YAfWiUw5LfOd);
        CwickyU0ZjEG0JwJwvvsOp0vRH0PB cwickyU0ZjEG0JwJwvvsOp0vRH0PB = gqlbb3ohftje.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (cwickyU0ZjEG0JwJwvvsOp0vRH0PB != null) {
            int i = CwickyU0ZjEG0JwJwvvsOp0vRH0PB.NSjgqmGjEzuugn2SsG1mZFP;
            cwickyU0ZjEG0JwJwvvsOp0vRH0PB.y1NaPKTl7R18DOr6e8i5(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jQygqjTppWwx992 = cwickyU0ZjEG0JwJwvvsOp0vRH0PB != null ? cwickyU0ZjEG0JwJwvvsOp0vRH0PB.qygqjTppWwx992() : Long.MAX_VALUE;
                if (!(gqlbb3ohftje.O1xDAlBZZlZdoEf747lCFHld() instanceof yVilYaP7xC)) {
                    if (cwickyU0ZjEG0JwJwvvsOp0vRH0PB != null) {
                        int i2 = CwickyU0ZjEG0JwJwvvsOp0vRH0PB.NSjgqmGjEzuugn2SsG1mZFP;
                        cwickyU0ZjEG0JwJwvvsOp0vRH0PB.vE4yDIjexsP2lGjLaTcB(false);
                    }
                    Object objWdI7vzA3Qmcwd = zonOxHotd3BwAPJcwqr6I6uQNngg4.wdI7vzA3Qmcwd(gqlbb3ohftje.O1xDAlBZZlZdoEf747lCFHld());
                    XpG0A5IpJsSX9uJPSmP4WwTAl xpG0A5IpJsSX9uJPSmP4WwTAl = objWdI7vzA3Qmcwd instanceof XpG0A5IpJsSX9uJPSmP4WwTAl ? (XpG0A5IpJsSX9uJPSmP4WwTAl) objWdI7vzA3Qmcwd : null;
                    if (xpG0A5IpJsSX9uJPSmP4WwTAl != null) {
                        throw xpG0A5IpJsSX9uJPSmP4WwTAl.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    }
                    return;
                }
                LockSupport.parkNanos(gqlbb3ohftje, jQygqjTppWwx992);
            } catch (Throwable th) {
                if (cwickyU0ZjEG0JwJwvvsOp0vRH0PB != null) {
                    int i3 = CwickyU0ZjEG0JwJwvvsOp0vRH0PB.NSjgqmGjEzuugn2SsG1mZFP;
                    cwickyU0ZjEG0JwJwvvsOp0vRH0PB.vE4yDIjexsP2lGjLaTcB(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        gqlbb3ohftje.ko09zE6UAgwkV(interruptedException);
        throw interruptedException;
    }

    public static void LaeGQIruHQu81hfJldjMOQSVblH3x(rwLNq3eKZ2vnR0XP rwlnq3ekz2vnr0xp, uij8Ij9SZKI0vaNotiNzH uij8ij9szki0vanotinzh, IPwvkMKvXW4H2mJtQ4szs9vgoyzLD iPwvkMKvXW4H2mJtQ4szs9vgoyzLD) {
        iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.Ca81ebIan1u = -1;
        pySSTLZ4BX pysstlz4bx = iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.CixTK5ZX8oWXHz34qHYV;
        int[] iArr = iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.e1gEV3X9xwmHj;
        pySSTLZ4BX pysstlz4bx2 = iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.d9zDyyznnp3oaDT1Ug;
        pySSTLZ4BX pysstlz4bx3 = iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.iKANjmyTSxO6v6UuLPdu7DxOjlS;
        pySSTLZ4BX pysstlz4bx4 = iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.TqcnImqkSWIKht;
        pySSTLZ4BX pysstlz4bx5 = iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.qygqjTppWwx992;
        iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = -1;
        int[] iArr2 = rwlnq3ekz2vnr0xp.e1gEV3X9xwmHj;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i = pysstlz4bx5.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            int iPYmKDYlAmhudp = rwlnq3ekz2vnr0xp.pYmKDYlAmhudp() - pysstlz4bx4.ZLZeBXTMq0zDztBxtRTuCHrapQ;
            pysstlz4bx5.GI83zq0G8e7zkn = uij8ij9szki0vanotinzh.HzCpKshMOoaw76hFcbOVRYMeRd(pysstlz4bx5);
            pysstlz4bx4.GI83zq0G8e7zkn = uij8ij9szki0vanotinzh.HzCpKshMOoaw76hFcbOVRYMeRd(pysstlz4bx4);
            uij8ij9szki0vanotinzh.ZfQNn8hdWlEQ5cR94249PDsLR(pysstlz4bx5.GI83zq0G8e7zkn, i);
            uij8ij9szki0vanotinzh.ZfQNn8hdWlEQ5cR94249PDsLR(pysstlz4bx4.GI83zq0G8e7zkn, iPYmKDYlAmhudp);
            iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.Ca81ebIan1u = 2;
            iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.KYZ9RyuOc42A2J = i;
            int i2 = iPYmKDYlAmhudp - i;
            iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.ItrQwCXbty5PZtje5JS = i2;
            int i3 = iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.rERAmyEtGV6ANGszuKcQI;
            if (i2 < i3) {
                iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.ItrQwCXbty5PZtje5JS = i3;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i4 = pysstlz4bx3.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        int iHzCpKshMOoaw76hFcbOVRYMeRd = rwlnq3ekz2vnr0xp.HzCpKshMOoaw76hFcbOVRYMeRd() - pysstlz4bx2.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        pysstlz4bx3.GI83zq0G8e7zkn = uij8ij9szki0vanotinzh.HzCpKshMOoaw76hFcbOVRYMeRd(pysstlz4bx3);
        pysstlz4bx2.GI83zq0G8e7zkn = uij8ij9szki0vanotinzh.HzCpKshMOoaw76hFcbOVRYMeRd(pysstlz4bx2);
        uij8ij9szki0vanotinzh.ZfQNn8hdWlEQ5cR94249PDsLR(pysstlz4bx3.GI83zq0G8e7zkn, i4);
        uij8ij9szki0vanotinzh.ZfQNn8hdWlEQ5cR94249PDsLR(pysstlz4bx2.GI83zq0G8e7zkn, iHzCpKshMOoaw76hFcbOVRYMeRd);
        if (iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.GE1sqSYiEYQO2ew7WEZwTtUeS5 > 0 || iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.tFRdVJAePmTx77bP7FAN0uI == 8) {
            hkOLVejSEWXUiK2HQlr9P2Z9 hkolvejsewxuik2hqlr9p2z9HzCpKshMOoaw76hFcbOVRYMeRd = uij8ij9szki0vanotinzh.HzCpKshMOoaw76hFcbOVRYMeRd(pysstlz4bx);
            pysstlz4bx.GI83zq0G8e7zkn = hkolvejsewxuik2hqlr9p2z9HzCpKshMOoaw76hFcbOVRYMeRd;
            uij8ij9szki0vanotinzh.ZfQNn8hdWlEQ5cR94249PDsLR(hkolvejsewxuik2hqlr9p2z9HzCpKshMOoaw76hFcbOVRYMeRd, iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.GE1sqSYiEYQO2ew7WEZwTtUeS5 + i4);
        }
        iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = 2;
        iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.zOk739gUM7zIZC25HHUxoiyixWFjn = i4;
        int i5 = iHzCpKshMOoaw76hFcbOVRYMeRd - i4;
        iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.hKs1wlZyvtUNaW1f5ABIGacfPcvX = i5;
        int i6 = iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.H2VFYNJEVGAX;
        if (i5 < i6) {
            iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.hKs1wlZyvtUNaW1f5ABIGacfPcvX = i6;
        }
    }

    public static final YAf4BMDpiCAb4hYaN6VqW RhfGHxtXxy0M0grmp2jkRjQg(IvfXhmjM3e3K ivfXhmjM3e3K) {
        YAf4BMDpiCAb4hYaN6VqW yAf4BMDpiCAb4hYaN6VqW;
        YAf4BMDpiCAb4hYaN6VqW yAf4BMDpiCAb4hYaN6VqW2;
        if (!(ivfXhmjM3e3K instanceof j0kIeYozLt6jOglJu)) {
            return new YAf4BMDpiCAb4hYaN6VqW(1, ivfXhmjM3e3K);
        }
        j0kIeYozLt6jOglJu j0kieyozlt6joglju = (j0kIeYozLt6jOglJu) ivfXhmjM3e3K;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j0kIeYozLt6jOglJu.M9e7PWhFYLD2lOGMker;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(j0kieyozlt6joglju);
            yAf4BMDpiCAb4hYaN6VqW = null;
            aqhhl68tQrgIjcMGB3dY2YLK3vN aqhhl68tqrgijcmgb3dy2ylk3vn = zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(j0kieyozlt6joglju, aqhhl68tqrgijcmgb3dy2ylk3vn);
                yAf4BMDpiCAb4hYaN6VqW2 = null;
                break;
            }
            if (obj instanceof YAf4BMDpiCAb4hYaN6VqW) {
                while (!atomicReferenceFieldUpdater.compareAndSet(j0kieyozlt6joglju, obj, aqhhl68tqrgijcmgb3dy2ylk3vn)) {
                    if (atomicReferenceFieldUpdater.get(j0kieyozlt6joglju) != obj) {
                        break;
                    }
                }
                yAf4BMDpiCAb4hYaN6VqW2 = (YAf4BMDpiCAb4hYaN6VqW) obj;
                break loop0;
            }
            if (obj != aqhhl68tqrgijcmgb3dy2ylk3vn && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (yAf4BMDpiCAb4hYaN6VqW2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = YAf4BMDpiCAb4hYaN6VqW.GI83zq0G8e7zkn;
            Object obj2 = atomicReferenceFieldUpdater2.get(yAf4BMDpiCAb4hYaN6VqW2);
            if (!(obj2 instanceof sLGv12xZEa) || ((sLGv12xZEa) obj2).ZfQNn8hdWlEQ5cR94249PDsLR == null) {
                YAf4BMDpiCAb4hYaN6VqW.NSjgqmGjEzuugn2SsG1mZFP.set(yAf4BMDpiCAb4hYaN6VqW2, 536870911);
                atomicReferenceFieldUpdater2.set(yAf4BMDpiCAb4hYaN6VqW2, f3m9Wb7qofjtR8jYjIKdaE7fk.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                yAf4BMDpiCAb4hYaN6VqW = yAf4BMDpiCAb4hYaN6VqW2;
            } else {
                yAf4BMDpiCAb4hYaN6VqW2.pYmKDYlAmhudp();
            }
            if (yAf4BMDpiCAb4hYaN6VqW != null) {
                return yAf4BMDpiCAb4hYaN6VqW;
            }
        }
        return new YAf4BMDpiCAb4hYaN6VqW(2, ivfXhmjM3e3K);
    }

    public static Intent SuB3hEmTmbbRGAhtvOOmfKEon(zf8a67a5ZO524dLUgOFxsfO zf8a67a5zo524dlugofxsfo, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strPzqP2AqKW6J5PO8zCKnW = pzqP2AqKW6J5PO8zCKnW(zf8a67a5zo524dlugofxsfo, componentName);
        if (strPzqP2AqKW6J5PO8zCKnW == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strPzqP2AqKW6J5PO8zCKnW);
        return pzqP2AqKW6J5PO8zCKnW(zf8a67a5zo524dlugofxsfo, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static ColorStateList TaDO7ogis3aEiWEtq(Context context, NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcM, int i) {
        int resourceId;
        ColorStateList colorStateListTaDO7ogis3aEiWEtq;
        TypedArray typedArray = (TypedArray) nrjuzzioPqfttNRptBDpZDzSYUrcM.V57tEvNfxZVVcOCAOih5PKr;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListTaDO7ogis3aEiWEtq = zonOxHotd3BwAPJcwqr6I6uQNngg4.TaDO7ogis3aEiWEtq(context, resourceId)) == null) ? nrjuzzioPqfttNRptBDpZDzSYUrcM.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(i) : colorStateListTaDO7ogis3aEiWEtq;
    }

    public static TMhzu0mi5J4jkWF8gkI TqcnImqkSWIKht(jG2FHg9iAk jg2fhg9iak, LL6zXCXfmDYzdHCRTT lL6zXCXfmDYzdHCRTT, Ho90S2EW0SHKgWtNbbE4M9TX ho90S2EW0SHKgWtNbbE4M9TX, MGk7KfXeUv8YAfWiUw5LfOd mGk7KfXeUv8YAfWiUw5LfOd, int i) {
        D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFW = lL6zXCXfmDYzdHCRTT;
        if ((i & 1) != 0) {
            d73WsmU258PapcWZb45SFW = hu3HDJRthjXEukAdCh3Tdc.V57tEvNfxZVVcOCAOih5PKr;
        }
        if ((i & 2) != 0) {
            ho90S2EW0SHKgWtNbbE4M9TX = Ho90S2EW0SHKgWtNbbE4M9TX.V57tEvNfxZVVcOCAOih5PKr;
        }
        D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFWH3jnZRsdwYJfY9UhQCkbvWciwvFHv = KfeOQNOupsCg6878zi4e.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(jg2fhg9iak.zIvmSL0wzmmKGc3X39b2Gw2mUGE(), d73WsmU258PapcWZb45SFW, true);
        J5GsGzwx46 j5GsGzwx46 = wRXy41zFnpLczeVR.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (d73WsmU258PapcWZb45SFWH3jnZRsdwYJfY9UhQCkbvWciwvFHv != j5GsGzwx46 && d73WsmU258PapcWZb45SFWH3jnZRsdwYJfY9UhQCkbvWciwvFHv.q11o1hieEkZDhF1MGOZI26oZiDT(IN79WcIk5xB4t0GjRT43qPLs5.zIvmSL0wzmmKGc3X39b2Gw2mUGE) == null) {
            d73WsmU258PapcWZb45SFWH3jnZRsdwYJfY9UhQCkbvWciwvFHv = d73WsmU258PapcWZb45SFWH3jnZRsdwYJfY9UhQCkbvWciwvFHv.RhfGHxtXxy0M0grmp2jkRjQg(j5GsGzwx46);
        }
        TMhzu0mi5J4jkWF8gkI eanwbs5ndd8wyutkewdcisbc = ho90S2EW0SHKgWtNbbE4M9TX == Ho90S2EW0SHKgWtNbbE4M9TX.ZfQNn8hdWlEQ5cR94249PDsLR ? new eanWbs5nDd8wyUtkeWDCisBc(d73WsmU258PapcWZb45SFWH3jnZRsdwYJfY9UhQCkbvWciwvFHv, mGk7KfXeUv8YAfWiUw5LfOd) : new TMhzu0mi5J4jkWF8gkI(d73WsmU258PapcWZb45SFWH3jnZRsdwYJfY9UhQCkbvWciwvFHv, true);
        eanwbs5ndd8wyutkewdcisbc.KYZ9RyuOc42A2J(ho90S2EW0SHKgWtNbbE4M9TX, eanwbs5ndd8wyutkewdcisbc, mGk7KfXeUv8YAfWiUw5LfOd);
        return eanwbs5ndd8wyutkewdcisbc;
    }

    public static void V57tEvNfxZVVcOCAOih5PKr(int i, Object obj) {
        if (obj != null) {
            if (obj instanceof pIIcZc6b8AgdMqbzrMD) {
                if ((obj instanceof oZASC2thEDkXWhbNM ? ((oZASC2thEDkXWhbNM) obj).V57tEvNfxZVVcOCAOih5PKr() : obj instanceof EfIvTei3Q8wBNpyLTZJevpFxej ? 0 : obj instanceof vP57smEEh3YGCxzJ ? 1 : obj instanceof MGk7KfXeUv8YAfWiUw5LfOd ? 2 : obj instanceof l9lNb4EFvaVMyQnsu ? 3 : obj instanceof ms7wepD1jVm6vK0NgycK ? 4 : obj instanceof lPhFiWhhniyVPQCBvT ? 6 : -1) == i) {
                    return;
                }
            }
            Z1FjjMJ0suz8AFI7gsA4GDLMXv(obj, "kotlin.jvm.functions.Function" + i);
            throw null;
        }
    }

    public static void VxUQ9tBhpHJ2AAEDNW8sghc4m(StringBuilder sb, Object obj, vP57smEEh3YGCxzJ vp57smeeh3ygcxzj) {
        if (vp57smeeh3ygcxzj != null) {
            sb.append((CharSequence) vp57smeeh3ygcxzj.GI83zq0G8e7zkn(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static void Z1FjjMJ0suz8AFI7gsA4GDLMXv(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        ej6unYlOWMDF.zOk739gUM7zIZC25HHUxoiyixWFjn(classCastException, F44whnLsbQ.class.getName());
        throw classCastException;
    }

    public static void ZfQNn8hdWlEQ5cR94249PDsLR(long j, EouCzLZsW9ynithduh eouCzLZsW9ynithduh, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        long j2;
        int i6;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 >= i3) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (((oA1WO3soICf8H1N6bgpG) arrayList4.get(i8)).VxUQ9tBhpHJ2AAEDNW8sghc4m() < i7) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        oA1WO3soICf8H1N6bgpG oa1wo3soicf8h1n6bgpg = (oA1WO3soICf8H1N6bgpG) arrayList.get(i2);
        oA1WO3soICf8H1N6bgpG oa1wo3soicf8h1n6bgpg2 = (oA1WO3soICf8H1N6bgpG) arrayList4.get(i3 - 1);
        if (i7 == oa1wo3soicf8h1n6bgpg.VxUQ9tBhpHJ2AAEDNW8sghc4m()) {
            int iIntValue = ((Number) arrayList5.get(i2)).intValue();
            int i9 = i2 + 1;
            oA1WO3soICf8H1N6bgpG oa1wo3soicf8h1n6bgpg3 = (oA1WO3soICf8H1N6bgpG) arrayList4.get(i9);
            i4 = i9;
            i5 = iIntValue;
            oa1wo3soicf8h1n6bgpg = oa1wo3soicf8h1n6bgpg3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (oa1wo3soicf8h1n6bgpg.ZfQNn8hdWlEQ5cR94249PDsLR(i7) == oa1wo3soicf8h1n6bgpg2.ZfQNn8hdWlEQ5cR94249PDsLR(i7)) {
            int iMin = Math.min(oa1wo3soicf8h1n6bgpg.VxUQ9tBhpHJ2AAEDNW8sghc4m(), oa1wo3soicf8h1n6bgpg2.VxUQ9tBhpHJ2AAEDNW8sghc4m());
            int i10 = 0;
            for (int i11 = i7; i11 < iMin && oa1wo3soicf8h1n6bgpg.ZfQNn8hdWlEQ5cR94249PDsLR(i11) == oa1wo3soicf8h1n6bgpg2.ZfQNn8hdWlEQ5cR94249PDsLR(i11); i11++) {
                i10++;
            }
            long j3 = 4;
            long j4 = (eouCzLZsW9ynithduh.ZfQNn8hdWlEQ5cR94249PDsLR / j3) + j + ((long) 2) + ((long) i10) + 1;
            eouCzLZsW9ynithduh.qygqjTppWwx992(-i10);
            eouCzLZsW9ynithduh.qygqjTppWwx992(i5);
            int i12 = i7 + i10;
            while (i7 < i12) {
                eouCzLZsW9ynithduh.qygqjTppWwx992(oa1wo3soicf8h1n6bgpg.ZfQNn8hdWlEQ5cR94249PDsLR(i7) & 255);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i12 != ((oA1WO3soICf8H1N6bgpG) arrayList4.get(i4)).VxUQ9tBhpHJ2AAEDNW8sghc4m()) {
                    throw new IllegalStateException("Check failed.");
                }
                eouCzLZsW9ynithduh.qygqjTppWwx992(((Number) arrayList5.get(i4)).intValue());
                return;
            } else {
                EouCzLZsW9ynithduh eouCzLZsW9ynithduh2 = new EouCzLZsW9ynithduh();
                eouCzLZsW9ynithduh.qygqjTppWwx992(((int) ((eouCzLZsW9ynithduh2.ZfQNn8hdWlEQ5cR94249PDsLR / j3) + j4)) * (-1));
                ZfQNn8hdWlEQ5cR94249PDsLR(j4, eouCzLZsW9ynithduh2, i12, arrayList4, i4, i3, arrayList5);
                eouCzLZsW9ynithduh.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(eouCzLZsW9ynithduh2);
                return;
            }
        }
        int i13 = 1;
        for (int i14 = i4 + 1; i14 < i3; i14++) {
            if (((oA1WO3soICf8H1N6bgpG) arrayList4.get(i14 - 1)).ZfQNn8hdWlEQ5cR94249PDsLR(i7) != ((oA1WO3soICf8H1N6bgpG) arrayList4.get(i14)).ZfQNn8hdWlEQ5cR94249PDsLR(i7)) {
                i13++;
            }
        }
        long j5 = 4;
        long j6 = (eouCzLZsW9ynithduh.ZfQNn8hdWlEQ5cR94249PDsLR / j5) + j + ((long) 2) + ((long) (i13 * 2));
        eouCzLZsW9ynithduh.qygqjTppWwx992(i13);
        eouCzLZsW9ynithduh.qygqjTppWwx992(i5);
        for (int i15 = i4; i15 < i3; i15++) {
            int iZfQNn8hdWlEQ5cR94249PDsLR = ((oA1WO3soICf8H1N6bgpG) arrayList4.get(i15)).ZfQNn8hdWlEQ5cR94249PDsLR(i7);
            if (i15 == i4 || iZfQNn8hdWlEQ5cR94249PDsLR != ((oA1WO3soICf8H1N6bgpG) arrayList4.get(i15 - 1)).ZfQNn8hdWlEQ5cR94249PDsLR(i7)) {
                eouCzLZsW9ynithduh.qygqjTppWwx992(iZfQNn8hdWlEQ5cR94249PDsLR & 255);
            }
        }
        EouCzLZsW9ynithduh eouCzLZsW9ynithduh3 = new EouCzLZsW9ynithduh();
        int i16 = i4;
        while (i16 < i3) {
            byte bZfQNn8hdWlEQ5cR94249PDsLR = ((oA1WO3soICf8H1N6bgpG) arrayList4.get(i16)).ZfQNn8hdWlEQ5cR94249PDsLR(i7);
            int i17 = i16 + 1;
            int i18 = i17;
            while (true) {
                if (i18 >= i3) {
                    i18 = i3;
                    break;
                } else if (bZfQNn8hdWlEQ5cR94249PDsLR != ((oA1WO3soICf8H1N6bgpG) arrayList4.get(i18)).ZfQNn8hdWlEQ5cR94249PDsLR(i7)) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i17 == i18 && i7 + 1 == ((oA1WO3soICf8H1N6bgpG) arrayList4.get(i16)).VxUQ9tBhpHJ2AAEDNW8sghc4m()) {
                eouCzLZsW9ynithduh.qygqjTppWwx992(((Number) arrayList5.get(i16)).intValue());
                arrayList3 = arrayList5;
                j2 = j6;
                i6 = i18;
            } else {
                eouCzLZsW9ynithduh.qygqjTppWwx992(((int) ((eouCzLZsW9ynithduh3.ZfQNn8hdWlEQ5cR94249PDsLR / j5) + j6)) * (-1));
                arrayList3 = arrayList5;
                j2 = j6;
                i6 = i18;
                ZfQNn8hdWlEQ5cR94249PDsLR(j2, eouCzLZsW9ynithduh3, i7 + 1, arrayList, i16, i6, arrayList3);
                arrayList4 = arrayList;
            }
            j6 = j2;
            i16 = i6;
            arrayList5 = arrayList3;
        }
        eouCzLZsW9ynithduh.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(eouCzLZsW9ynithduh3);
    }

    public static final fw6arzf1nhE87EaA aXO0LSrt8bKV(Object obj) {
        if (obj != KfeOQNOupsCg6878zi4e.zzpBGItXfub0yWj) {
            return (fw6arzf1nhE87EaA) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static float d9zDyyznnp3oaDT1Ug(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static xslkgYRPKFuOSM9hmx2 f6ZQsR6bPLvvCDNXOUc(IPwvkMKvXW4H2mJtQ4szs9vgoyzLD iPwvkMKvXW4H2mJtQ4szs9vgoyzLD, int i, ArrayList arrayList, xslkgYRPKFuOSM9hmx2 xslkgyrpkfuosm9hmx2) {
        int i2;
        int i3 = i == 0 ? iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.ByTQIhgl7ezGvHXEd : iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.tpEo0fy9FaoJYrSFHRfIK6;
        if (i3 != -1 && (xslkgyrpkfuosm9hmx2 == null || i3 != xslkgyrpkfuosm9hmx2.zzpBGItXfub0yWj)) {
            int i4 = 0;
            while (true) {
                if (i4 >= arrayList.size()) {
                    break;
                }
                xslkgYRPKFuOSM9hmx2 xslkgyrpkfuosm9hmx22 = (xslkgYRPKFuOSM9hmx2) arrayList.get(i4);
                if (xslkgyrpkfuosm9hmx22.zzpBGItXfub0yWj == i3) {
                    if (xslkgyrpkfuosm9hmx2 != null) {
                        xslkgyrpkfuosm9hmx2.V57tEvNfxZVVcOCAOih5PKr(i, xslkgyrpkfuosm9hmx22);
                        arrayList.remove(xslkgyrpkfuosm9hmx2);
                    }
                    xslkgyrpkfuosm9hmx2 = xslkgyrpkfuosm9hmx22;
                } else {
                    i4++;
                }
            }
        } else if (i3 != -1) {
            return xslkgyrpkfuosm9hmx2;
        }
        if (xslkgyrpkfuosm9hmx2 == null) {
            if (iPwvkMKvXW4H2mJtQ4szs9vgoyzLD instanceof NENDPFFAZXAw) {
                NENDPFFAZXAw nENDPFFAZXAw = (NENDPFFAZXAw) iPwvkMKvXW4H2mJtQ4szs9vgoyzLD;
                int i5 = 0;
                while (true) {
                    if (i5 >= nENDPFFAZXAw.BDoqAMf0rlMRAnVghjC4qjG) {
                        i2 = -1;
                        break;
                    }
                    IPwvkMKvXW4H2mJtQ4szs9vgoyzLD iPwvkMKvXW4H2mJtQ4szs9vgoyzLD2 = nENDPFFAZXAw.AFOcXGdvoTMuqwiG8tD[i5];
                    if ((i == 0 && (i2 = iPwvkMKvXW4H2mJtQ4szs9vgoyzLD2.ByTQIhgl7ezGvHXEd) != -1) || (i == 1 && (i2 = iPwvkMKvXW4H2mJtQ4szs9vgoyzLD2.tpEo0fy9FaoJYrSFHRfIK6) != -1)) {
                        break;
                    }
                    i5++;
                }
                if (i2 != -1) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList.size()) {
                            break;
                        }
                        xslkgYRPKFuOSM9hmx2 xslkgyrpkfuosm9hmx23 = (xslkgYRPKFuOSM9hmx2) arrayList.get(i6);
                        if (xslkgyrpkfuosm9hmx23.zzpBGItXfub0yWj == i2) {
                            xslkgyrpkfuosm9hmx2 = xslkgyrpkfuosm9hmx23;
                            break;
                        }
                        i6++;
                    }
                }
            }
            if (xslkgyrpkfuosm9hmx2 == null) {
                xslkgyrpkfuosm9hmx2 = new xslkgYRPKFuOSM9hmx2();
                xslkgyrpkfuosm9hmx2.VxUQ9tBhpHJ2AAEDNW8sghc4m = new ArrayList();
                xslkgyrpkfuosm9hmx2.ZfQNn8hdWlEQ5cR94249PDsLR = null;
                xslkgyrpkfuosm9hmx2.LaeGQIruHQu81hfJldjMOQSVblH3x = -1;
                int i7 = xslkgYRPKFuOSM9hmx2.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                xslkgYRPKFuOSM9hmx2.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i7 + 1;
                xslkgyrpkfuosm9hmx2.zzpBGItXfub0yWj = i7;
                xslkgyrpkfuosm9hmx2.V57tEvNfxZVVcOCAOih5PKr = i;
            }
            arrayList.add(xslkgyrpkfuosm9hmx2);
        }
        int i8 = xslkgyrpkfuosm9hmx2.zzpBGItXfub0yWj;
        ArrayList arrayList2 = xslkgyrpkfuosm9hmx2.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (arrayList2.contains(iPwvkMKvXW4H2mJtQ4szs9vgoyzLD)) {
            return xslkgyrpkfuosm9hmx2;
        }
        arrayList2.add(iPwvkMKvXW4H2mJtQ4szs9vgoyzLD);
        if (iPwvkMKvXW4H2mJtQ4szs9vgoyzLD instanceof lgLPimJSSQ0NVW) {
            lgLPimJSSQ0NVW lglpimjssq0nvw = (lgLPimJSSQ0NVW) iPwvkMKvXW4H2mJtQ4szs9vgoyzLD;
            lglpimjssq0nvw.VOvSEdhaZyc0oOGQ8.V57tEvNfxZVVcOCAOih5PKr(lglpimjssq0nvw.h2b7InwIaORKN91X7whfQh4 == 0 ? 1 : 0, xslkgyrpkfuosm9hmx2, arrayList);
        }
        if (i == 0) {
            iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.ByTQIhgl7ezGvHXEd = i8;
            iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.qygqjTppWwx992.V57tEvNfxZVVcOCAOih5PKr(i, xslkgyrpkfuosm9hmx2, arrayList);
            iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.TqcnImqkSWIKht.V57tEvNfxZVVcOCAOih5PKr(i, xslkgyrpkfuosm9hmx2, arrayList);
        } else {
            iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.tpEo0fy9FaoJYrSFHRfIK6 = i8;
            iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.iKANjmyTSxO6v6UuLPdu7DxOjlS.V57tEvNfxZVVcOCAOih5PKr(i, xslkgyrpkfuosm9hmx2, arrayList);
            iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.CixTK5ZX8oWXHz34qHYV.V57tEvNfxZVVcOCAOih5PKr(i, xslkgyrpkfuosm9hmx2, arrayList);
            iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.d9zDyyznnp3oaDT1Ug.V57tEvNfxZVVcOCAOih5PKr(i, xslkgyrpkfuosm9hmx2, arrayList);
        }
        iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.wRCD0SdqWCowdYU7bmzN.V57tEvNfxZVVcOCAOih5PKr(i, xslkgyrpkfuosm9hmx2, arrayList);
        return xslkgyrpkfuosm9hmx2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        if (r1.zIvmSL0wzmmKGc3X39b2Gw2mUGE(r10, r0) == r5) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x002f, B:25:0x0056, B:29:0x006b, B:31:0x0073, B:20:0x0047, B:24:0x0052), top: B:52:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.vdodsodjsdt.dJaiaGWkeWaMlzD, com.vdodsodjsdt.tw4aeftrJT] */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.vdodsodjsdt.dJaiaGWkeWaMlzD] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.vdodsodjsdt.dJaiaGWkeWaMlzD] */
    /* JADX WARN: Type inference failed for: r8v3, types: [com.vdodsodjsdt.dJaiaGWkeWaMlzD] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0085 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h3jnZRsdwYJfY9UhQCkbvWciwvFHv(com.vdodsodjsdt.Q1zAhWfgG5v13hOK r7, com.vdodsodjsdt.tw4aeftrJT r8, boolean r9, com.vdodsodjsdt.tfu79AIgc4CGAZaxd4HhD r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof com.vdodsodjsdt.LjtNXsBjsPV
            if (r0 == 0) goto L13
            r0 = r10
            com.vdodsodjsdt.LjtNXsBjsPV r0 = (com.vdodsodjsdt.LjtNXsBjsPV) r0
            int r1 = r0.HzCpKshMOoaw76hFcbOVRYMeRd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.HzCpKshMOoaw76hFcbOVRYMeRd = r1
            goto L18
        L13:
            com.vdodsodjsdt.LjtNXsBjsPV r0 = new com.vdodsodjsdt.LjtNXsBjsPV
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.M9e7PWhFYLD2lOGMker
            int r1 = r0.HzCpKshMOoaw76hFcbOVRYMeRd
            r2 = 0
            r3 = 2
            r4 = 1
            com.vdodsodjsdt.w0JnONr1KwCkZY9pA0QjUDuh9aMcU r5 = com.vdodsodjsdt.w0JnONr1KwCkZY9pA0QjUDuh9aMcU.V57tEvNfxZVVcOCAOih5PKr
            if (r1 == 0) goto L4b
            if (r1 == r4) goto L3f
            if (r1 != r3) goto L37
            boolean r9 = r0.GI83zq0G8e7zkn
            com.vdodsodjsdt.fqChXYa8o3dXHKjdsT9dZR r7 = r0.NSjgqmGjEzuugn2SsG1mZFP
            com.vdodsodjsdt.dJaiaGWkeWaMlzD r8 = r0.ZLZeBXTMq0zDztBxtRTuCHrapQ
            com.vdodsodjsdt.Q1zAhWfgG5v13hOK r1 = r0.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            com.vdodsodjsdt.ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r1
            goto L56
        L35:
            r7 = move-exception
            goto L90
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            boolean r9 = r0.GI83zq0G8e7zkn
            com.vdodsodjsdt.fqChXYa8o3dXHKjdsT9dZR r7 = r0.NSjgqmGjEzuugn2SsG1mZFP
            com.vdodsodjsdt.dJaiaGWkeWaMlzD r8 = r0.ZLZeBXTMq0zDztBxtRTuCHrapQ
            com.vdodsodjsdt.Q1zAhWfgG5v13hOK r1 = r0.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            com.vdodsodjsdt.ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(r10)     // Catch: java.lang.Throwable -> L35
            goto L6b
        L4b:
            com.vdodsodjsdt.ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(r10)
            boolean r10 = r7 instanceof com.vdodsodjsdt.Tgg54lc4w2N26DiLu
            if (r10 != 0) goto Lab
            com.vdodsodjsdt.fqChXYa8o3dXHKjdsT9dZR r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L56:
            r0.zIvmSL0wzmmKGc3X39b2Gw2mUGE = r7     // Catch: java.lang.Throwable -> L35
            r0.ZLZeBXTMq0zDztBxtRTuCHrapQ = r8     // Catch: java.lang.Throwable -> L35
            r0.NSjgqmGjEzuugn2SsG1mZFP = r10     // Catch: java.lang.Throwable -> L35
            r0.GI83zq0G8e7zkn = r9     // Catch: java.lang.Throwable -> L35
            r0.HzCpKshMOoaw76hFcbOVRYMeRd = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r10.zzpBGItXfub0yWj(r0)     // Catch: java.lang.Throwable -> L35
            if (r1 != r5) goto L67
            goto L87
        L67:
            r6 = r1
            r1 = r7
            r7 = r10
            r10 = r6
        L6b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L88
            java.lang.Object r10 = r7.V57tEvNfxZVVcOCAOih5PKr()     // Catch: java.lang.Throwable -> L35
            r0.zIvmSL0wzmmKGc3X39b2Gw2mUGE = r1     // Catch: java.lang.Throwable -> L35
            r0.ZLZeBXTMq0zDztBxtRTuCHrapQ = r8     // Catch: java.lang.Throwable -> L35
            r0.NSjgqmGjEzuugn2SsG1mZFP = r7     // Catch: java.lang.Throwable -> L35
            r0.GI83zq0G8e7zkn = r9     // Catch: java.lang.Throwable -> L35
            r0.HzCpKshMOoaw76hFcbOVRYMeRd = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r1.zIvmSL0wzmmKGc3X39b2Gw2mUGE(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r5) goto L32
        L87:
            return r5
        L88:
            if (r9 == 0) goto L8d
            r8.V57tEvNfxZVVcOCAOih5PKr(r2)
        L8d:
            com.vdodsodjsdt.hMtEZx9LFZEOBsEChkiRKnXNYh1GG r7 = com.vdodsodjsdt.hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m
            return r7
        L90:
            throw r7     // Catch: java.lang.Throwable -> L91
        L91:
            r10 = move-exception
            if (r9 == 0) goto Laa
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L9b
            r2 = r7
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L9b:
            if (r2 != 0) goto La7
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r2.<init>(r9)
            r2.initCause(r7)
        La7:
            r8.V57tEvNfxZVVcOCAOih5PKr(r2)
        Laa:
            throw r10
        Lab:
            com.vdodsodjsdt.Tgg54lc4w2N26DiLu r7 = (com.vdodsodjsdt.Tgg54lc4w2N26DiLu) r7
            java.lang.Throwable r7 = r7.V57tEvNfxZVVcOCAOih5PKr
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.F44whnLsbQ.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(com.vdodsodjsdt.Q1zAhWfgG5v13hOK, com.vdodsodjsdt.tw4aeftrJT, boolean, com.vdodsodjsdt.tfu79AIgc4CGAZaxd4HhD):java.lang.Object");
    }

    public static long hKs1wlZyvtUNaW1f5ABIGacfPcvX(InputStream inputStream, int i) throws IOException {
        byte[] bArrJUdwvN8LfOMa = JUdwvN8LfOMa(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArrJUdwvN8LfOMa[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    public static final boolean iKANjmyTSxO6v6UuLPdu7DxOjlS(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    public static final boolean ko09zE6UAgwkV(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long lQ0rO9lhQIyVe7Rp6(java.lang.String r14, int r15) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.F44whnLsbQ.lQ0rO9lhQIyVe7Rp6(java.lang.String, int):long");
    }

    public static final Object mhUCRR8ceqc7mAozW(D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFW, MGk7KfXeUv8YAfWiUw5LfOd mGk7KfXeUv8YAfWiUw5LfOd, tfu79AIgc4CGAZaxd4HhD tfu79aigc4cgazaxd4hhd) throws Throwable {
        D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFWLaeGQIruHQu81hfJldjMOQSVblH3x = tfu79aigc4cgazaxd4hhd.LaeGQIruHQu81hfJldjMOQSVblH3x();
        D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFWRhfGHxtXxy0M0grmp2jkRjQg = !((Boolean) d73WsmU258PapcWZb45SFW.M9e7PWhFYLD2lOGMker(Boolean.FALSE, M43IFB1xONkIzX.zIvmSL0wzmmKGc3X39b2Gw2mUGE)).booleanValue() ? d73WsmU258PapcWZb45SFWLaeGQIruHQu81hfJldjMOQSVblH3x.RhfGHxtXxy0M0grmp2jkRjQg(d73WsmU258PapcWZb45SFW) : KfeOQNOupsCg6878zi4e.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(d73WsmU258PapcWZb45SFWLaeGQIruHQu81hfJldjMOQSVblH3x, d73WsmU258PapcWZb45SFW, false);
        hRrPPME7ytOB7ba.NSjgqmGjEzuugn2SsG1mZFP(d73WsmU258PapcWZb45SFWRhfGHxtXxy0M0grmp2jkRjQg);
        if (d73WsmU258PapcWZb45SFWRhfGHxtXxy0M0grmp2jkRjQg == d73WsmU258PapcWZb45SFWLaeGQIruHQu81hfJldjMOQSVblH3x) {
            yB0MgkQF0w4aWkiL0rHiqFb54ZHEs yb0mgkqf0w4awkil0rhiqfb54zhes = new yB0MgkQF0w4aWkiL0rHiqFb54ZHEs(tfu79aigc4cgazaxd4hhd, d73WsmU258PapcWZb45SFWRhfGHxtXxy0M0grmp2jkRjQg);
            return KfeOQNOupsCg6878zi4e.KYZ9RyuOc42A2J(yb0mgkqf0w4awkil0rhiqfb54zhes, yb0mgkqf0w4awkil0rhiqfb54zhes, mGk7KfXeUv8YAfWiUw5LfOd);
        }
        IN79WcIk5xB4t0GjRT43qPLs5 iN79WcIk5xB4t0GjRT43qPLs5 = IN79WcIk5xB4t0GjRT43qPLs5.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(d73WsmU258PapcWZb45SFWRhfGHxtXxy0M0grmp2jkRjQg.q11o1hieEkZDhF1MGOZI26oZiDT(iN79WcIk5xB4t0GjRT43qPLs5), d73WsmU258PapcWZb45SFWLaeGQIruHQu81hfJldjMOQSVblH3x.q11o1hieEkZDhF1MGOZI26oZiDT(iN79WcIk5xB4t0GjRT43qPLs5))) {
            rDVwronXktMoWAubpmvA rdvwronxktmowaubpmva = new rDVwronXktMoWAubpmvA(d73WsmU258PapcWZb45SFWRhfGHxtXxy0M0grmp2jkRjQg, tfu79aigc4cgazaxd4hhd);
            D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFW2 = rdvwronxktmowaubpmva.LaeGQIruHQu81hfJldjMOQSVblH3x;
            Object objZ1FjjMJ0suz8AFI7gsA4GDLMXv = sGipz63rTUmSj3uFDvOtzihao.Z1FjjMJ0suz8AFI7gsA4GDLMXv(d73WsmU258PapcWZb45SFW2, null);
            try {
                return KfeOQNOupsCg6878zi4e.KYZ9RyuOc42A2J(rdvwronxktmowaubpmva, rdvwronxktmowaubpmva, mGk7KfXeUv8YAfWiUw5LfOd);
            } finally {
                sGipz63rTUmSj3uFDvOtzihao.JUdwvN8LfOMa(d73WsmU258PapcWZb45SFW2, objZ1FjjMJ0suz8AFI7gsA4GDLMXv);
            }
        }
        gHXBIIhsUHosFRVh36G1cLOZ9o ghxbiihsuhosfrvh36g1cloz9o = new gHXBIIhsUHosFRVh36G1cLOZ9o(tfu79aigc4cgazaxd4hhd, d73WsmU258PapcWZb45SFWRhfGHxtXxy0M0grmp2jkRjQg);
        FLWIoSaHb1q8TqFvEBgPyRGrzvi6.iKANjmyTSxO6v6UuLPdu7DxOjlS(mGk7KfXeUv8YAfWiUw5LfOd, ghxbiihsuhosfrvh36g1cloz9o, ghxbiihsuhosfrvh36g1cloz9o);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = gHXBIIhsUHosFRVh36G1cLOZ9o.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        do {
            int i = atomicIntegerFieldUpdater.get(ghxbiihsuhosfrvh36g1cloz9o);
            if (i != 0) {
                if (i != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                Object objWdI7vzA3Qmcwd = zonOxHotd3BwAPJcwqr6I6uQNngg4.wdI7vzA3Qmcwd(ghxbiihsuhosfrvh36g1cloz9o.O1xDAlBZZlZdoEf747lCFHld());
                if (objWdI7vzA3Qmcwd instanceof XpG0A5IpJsSX9uJPSmP4WwTAl) {
                    throw ((XpG0A5IpJsSX9uJPSmP4WwTAl) objWdI7vzA3Qmcwd).VxUQ9tBhpHJ2AAEDNW8sghc4m;
                }
                return objWdI7vzA3Qmcwd;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(ghxbiihsuhosfrvh36g1cloz9o, 0, 1));
        return w0JnONr1KwCkZY9pA0QjUDuh9aMcU.V57tEvNfxZVVcOCAOih5PKr;
    }

    public static void p6bBrs4p3Ly(ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        rE05n5RsRkyWKIeA9cmLXAKv4Hze(byteArrayOutputStream, i, 2);
    }

    public static final boolean pYmKDYlAmhudp(int i, int i2) {
        return (i & i2) == i2;
    }

    public static String pzqP2AqKW6J5PO8zCKnW(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final int q11o1hieEkZDhF1MGOZI26oZiDT(Cursor cursor, String str) {
        String string;
        ej6unYlOWMDF.pYmKDYlAmhudp(cursor, "c");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = cursor.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
                    String[] columnNames = cursor.getColumnNames();
                    ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(columnNames, "columnNames");
                    String strConcat = ".".concat(str);
                    String str2 = "." + str + '`';
                    int length = columnNames.length;
                    int i = 0;
                    int i2 = 0;
                    while (i2 < length) {
                        String str3 = columnNames[i2];
                        int i3 = i + 1;
                        if (str3.length() >= str.length() + 2 && (ngO5JXZkj8nfh41LltHvEjUc.ByTQIhgl7ezGvHXEd(str3, strConcat) || (str3.charAt(0) == '`' && ngO5JXZkj8nfh41LltHvEjUc.ByTQIhgl7ezGvHXEd(str3, str2)))) {
                            columnIndex = i;
                            break;
                        }
                        i2++;
                        i = i3;
                    }
                    columnIndex = -1;
                } else {
                    columnIndex = -1;
                }
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames2 = cursor.getColumnNames();
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(columnNames2, "c.columnNames");
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "");
            int i4 = 0;
            for (String str4 : columnNames2) {
                i4++;
                if (i4 > 1) {
                    sb.append((CharSequence) ", ");
                }
                VxUQ9tBhpHJ2AAEDNW8sghc4m(sb, str4, null);
            }
            sb.append((CharSequence) "");
            string = sb.toString();
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            string = "unknown";
        }
        throw new IllegalArgumentException("column '" + str + "' does not exist. Available columns: " + string);
    }

    public static Intent qNPQb1obP7(zf8a67a5ZO524dLUgOFxsfO zf8a67a5zo524dlugofxsfo) {
        Intent parentActivityIntent = zf8a67a5zo524dlugofxsfo.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strPzqP2AqKW6J5PO8zCKnW = pzqP2AqKW6J5PO8zCKnW(zf8a67a5zo524dlugofxsfo, zf8a67a5zo524dlugofxsfo.getComponentName());
            if (strPzqP2AqKW6J5PO8zCKnW == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(zf8a67a5zo524dlugofxsfo, strPzqP2AqKW6J5PO8zCKnW);
            try {
                return pzqP2AqKW6J5PO8zCKnW(zf8a67a5zo524dlugofxsfo, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strPzqP2AqKW6J5PO8zCKnW + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static boolean qygqjTppWwx992(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static void rE05n5RsRkyWKIeA9cmLXAKv4Hze(ByteArrayOutputStream byteArrayOutputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static boolean tFRdVJAePmTx77bP7FAN0uI(int i, int i2, int i3, int i4) {
        return (i3 == 1 || i3 == 2 || (i3 == 4 && i != 2)) || (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2));
    }

    public static float ubNpdCC1pl7L() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public static ColorStateList vBGA6pPLqSMuYGvprl270j7(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListTaDO7ogis3aEiWEtq;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListTaDO7ogis3aEiWEtq = zonOxHotd3BwAPJcwqr6I6uQNngg4.TaDO7ogis3aEiWEtq(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListTaDO7ogis3aEiWEtq;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0090 A[Catch: all -> 0x006f, DONT_GENERATE, TryCatch #2 {all -> 0x006f, blocks: (B:16:0x004a, B:18:0x0058, B:20:0x005e, B:33:0x0093, B:23:0x0071, B:25:0x007f, B:30:0x008a, B:32:0x0090, B:38:0x00a0, B:41:0x00a9, B:40:0x00a6, B:28:0x0085), top: B:54:0x004a, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void vXWl0o6I4U59CgHs9(com.vdodsodjsdt.IvfXhmjM3e3K r9, java.lang.Object r10) {
        /*
            boolean r0 = r9 instanceof com.vdodsodjsdt.j0kIeYozLt6jOglJu
            if (r0 == 0) goto Lb4
            com.vdodsodjsdt.j0kIeYozLt6jOglJu r9 = (com.vdodsodjsdt.j0kIeYozLt6jOglJu) r9
            com.vdodsodjsdt.LL6zXCXfmDYzdHCRTT r0 = r9.zIvmSL0wzmmKGc3X39b2Gw2mUGE
            com.vdodsodjsdt.tfu79AIgc4CGAZaxd4HhD r1 = r9.ZLZeBXTMq0zDztBxtRTuCHrapQ
            java.lang.Throwable r2 = com.vdodsodjsdt.irzKrQ86nQxhDp2QXhxUmPnyA6TkB.VxUQ9tBhpHJ2AAEDNW8sghc4m(r10)
            if (r2 != 0) goto L12
            r3 = r10
            goto L18
        L12:
            com.vdodsodjsdt.XpG0A5IpJsSX9uJPSmP4WwTAl r3 = new com.vdodsodjsdt.XpG0A5IpJsSX9uJPSmP4WwTAl
            r4 = 0
            r3.<init>(r2, r4)
        L18:
            com.vdodsodjsdt.D73WsmU258PapcWZb45SFW r2 = r1.LaeGQIruHQu81hfJldjMOQSVblH3x()
            boolean r2 = r0.aXO0LSrt8bKV(r2)
            r4 = 1
            if (r2 == 0) goto L2f
            r9.NSjgqmGjEzuugn2SsG1mZFP = r3
            r9.LaeGQIruHQu81hfJldjMOQSVblH3x = r4
            com.vdodsodjsdt.D73WsmU258PapcWZb45SFW r10 = r1.LaeGQIruHQu81hfJldjMOQSVblH3x()
            r0.SuB3hEmTmbbRGAhtvOOmfKEon(r10, r9)
            return
        L2f:
            com.vdodsodjsdt.CwickyU0ZjEG0JwJwvvsOp0vRH0PB r0 = com.vdodsodjsdt.bxg58FPVmiJdXQNjZxsZ.VxUQ9tBhpHJ2AAEDNW8sghc4m()
            long r5 = r0.LaeGQIruHQu81hfJldjMOQSVblH3x
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L46
            r9.NSjgqmGjEzuugn2SsG1mZFP = r3
            r9.LaeGQIruHQu81hfJldjMOQSVblH3x = r4
            r0.O1xDAlBZZlZdoEf747lCFHld(r9)
            goto Lae
        L46:
            r0.y1NaPKTl7R18DOr6e8i5(r4)
            r2 = 0
            com.vdodsodjsdt.D73WsmU258PapcWZb45SFW r5 = r1.LaeGQIruHQu81hfJldjMOQSVblH3x()     // Catch: java.lang.Throwable -> L6f
            com.vdodsodjsdt.IN79WcIk5xB4t0GjRT43qPLs5 r6 = com.vdodsodjsdt.IN79WcIk5xB4t0GjRT43qPLs5.HzCpKshMOoaw76hFcbOVRYMeRd     // Catch: java.lang.Throwable -> L6f
            com.vdodsodjsdt.RKQqw795jswHmdL5AnfuvmeBZD r5 = r5.q11o1hieEkZDhF1MGOZI26oZiDT(r6)     // Catch: java.lang.Throwable -> L6f
            com.vdodsodjsdt.sJ612dvaOBrP4lDkAwxzLpcxONSSp r5 = (com.vdodsodjsdt.sJ612dvaOBrP4lDkAwxzLpcxONSSp) r5     // Catch: java.lang.Throwable -> L6f
            if (r5 == 0) goto L71
            boolean r6 = r5.VxUQ9tBhpHJ2AAEDNW8sghc4m()     // Catch: java.lang.Throwable -> L6f
            if (r6 != 0) goto L71
            com.vdodsodjsdt.fXGTDnUxIdCVHFvA63E r5 = (com.vdodsodjsdt.fXGTDnUxIdCVHFvA63E) r5     // Catch: java.lang.Throwable -> L6f
            java.util.concurrent.CancellationException r10 = r5.SuB3hEmTmbbRGAhtvOOmfKEon()     // Catch: java.lang.Throwable -> L6f
            r9.zzpBGItXfub0yWj(r3, r10)     // Catch: java.lang.Throwable -> L6f
            com.vdodsodjsdt.OR0CruaKl9s17fPszEbrsfoKYmn r10 = com.vdodsodjsdt.ej6unYlOWMDF.vBGA6pPLqSMuYGvprl270j7(r10)     // Catch: java.lang.Throwable -> L6f
            r9.ZLZeBXTMq0zDztBxtRTuCHrapQ(r10)     // Catch: java.lang.Throwable -> L6f
            goto L93
        L6f:
            r10 = move-exception
            goto Laa
        L71:
            java.lang.Object r3 = r9.GI83zq0G8e7zkn     // Catch: java.lang.Throwable -> L6f
            com.vdodsodjsdt.D73WsmU258PapcWZb45SFW r5 = r1.LaeGQIruHQu81hfJldjMOQSVblH3x()     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r3 = com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao.Z1FjjMJ0suz8AFI7gsA4GDLMXv(r5, r3)     // Catch: java.lang.Throwable -> L6f
            com.vdodsodjsdt.aqhhl68tQrgIjcMGB3dY2YLK3vN r6 = com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao.ZLZeBXTMq0zDztBxtRTuCHrapQ     // Catch: java.lang.Throwable -> L6f
            if (r3 == r6) goto L84
            com.vdodsodjsdt.rDVwronXktMoWAubpmvA r6 = com.vdodsodjsdt.KfeOQNOupsCg6878zi4e.GE1sqSYiEYQO2ew7WEZwTtUeS5(r1, r5, r3)     // Catch: java.lang.Throwable -> L6f
            goto L85
        L84:
            r6 = r2
        L85:
            r1.ZLZeBXTMq0zDztBxtRTuCHrapQ(r10)     // Catch: java.lang.Throwable -> L9d
            if (r6 == 0) goto L90
            boolean r10 = r6.zOk739gUM7zIZC25HHUxoiyixWFjn()     // Catch: java.lang.Throwable -> L6f
            if (r10 == 0) goto L93
        L90:
            com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao.JUdwvN8LfOMa(r5, r3)     // Catch: java.lang.Throwable -> L6f
        L93:
            boolean r10 = r0.iKANjmyTSxO6v6UuLPdu7DxOjlS()     // Catch: java.lang.Throwable -> L6f
            if (r10 != 0) goto L93
        L99:
            r0.vE4yDIjexsP2lGjLaTcB(r4)
            goto Lae
        L9d:
            r10 = move-exception
            if (r6 == 0) goto La6
            boolean r1 = r6.zOk739gUM7zIZC25HHUxoiyixWFjn()     // Catch: java.lang.Throwable -> L6f
            if (r1 == 0) goto La9
        La6:
            com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao.JUdwvN8LfOMa(r5, r3)     // Catch: java.lang.Throwable -> L6f
        La9:
            throw r10     // Catch: java.lang.Throwable -> L6f
        Laa:
            r9.GI83zq0G8e7zkn(r10, r2)     // Catch: java.lang.Throwable -> Laf
            goto L99
        Lae:
            return
        Laf:
            r9 = move-exception
            r0.vE4yDIjexsP2lGjLaTcB(r4)
            throw r9
        Lb4:
            r9.ZLZeBXTMq0zDztBxtRTuCHrapQ(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.F44whnLsbQ.vXWl0o6I4U59CgHs9(com.vdodsodjsdt.IvfXhmjM3e3K, java.lang.Object):void");
    }

    public static Drawable w0Wu95l8dVNw5rZMRu(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableJW7EiD0YL6xkbB158jMUzhWNWb1y;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableJW7EiD0YL6xkbB158jMUzhWNWb1y = KfeOQNOupsCg6878zi4e.jW7EiD0YL6xkbB158jMUzhWNWb1y(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableJW7EiD0YL6xkbB158jMUzhWNWb1y;
    }

    public static final boolean y1NaPKTl7R18DOr6e8i5(Object obj) {
        return obj == KfeOQNOupsCg6878zi4e.zzpBGItXfub0yWj;
    }

    public static void zIvmSL0wzmmKGc3X39b2Gw2mUGE(int i) {
        if (2 > i || i >= 37) {
            throw new IllegalArgumentException("radix " + i + " was not in valid range " + new stS3uecPKs3MU4EfeT(2, 36, 1));
        }
    }

    public static final int zOk739gUM7zIZC25HHUxoiyixWFjn(PPtIx4psoo4sPV6C2irfHMJrxl pPtIx4psoo4sPV6C2irfHMJrxl, int i) {
        int i2;
        int[] iArr = pPtIx4psoo4sPV6C2irfHMJrxl.NSjgqmGjEzuugn2SsG1mZFP;
        int i3 = i + 1;
        int length = pPtIx4psoo4sPV6C2irfHMJrxl.ZLZeBXTMq0zDztBxtRTuCHrapQ.length;
        ej6unYlOWMDF.pYmKDYlAmhudp(iArr, "<this>");
        int i4 = length - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = iArr[i2];
                if (i6 >= i3) {
                    if (i6 <= i3) {
                        break;
                    }
                    i4 = i2 - 1;
                } else {
                    i5 = i2 + 1;
                }
            } else {
                i2 = (-i5) - 1;
                break;
            }
        }
        return i2 >= 0 ? i2 : ~i2;
    }

    public static final void zzpBGItXfub0yWj(l6xJVUTn99ZWyAVk l6xjvutn99zwyavk, final ALnH3AptNOGA7UbXGxOl2SnVeZ aLnH3AptNOGA7UbXGxOl2SnVeZ, final androidx.lifecycle.iVKrTMqOw0TqCeNN ivkrtmqow0tqcenn) {
        Object obj;
        ej6unYlOWMDF.pYmKDYlAmhudp(aLnH3AptNOGA7UbXGxOl2SnVeZ, "registry");
        ej6unYlOWMDF.pYmKDYlAmhudp(ivkrtmqow0tqcenn, "lifecycle");
        HashMap map = l6xjvutn99zwyavk.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (map == null) {
            obj = null;
        } else {
            synchronized (map) {
                obj = l6xjvutn99zwyavk.VxUQ9tBhpHJ2AAEDNW8sghc4m.get("androidx.lifecycle.savedstate.vm.tag");
            }
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController == null || savedStateHandleController.V57tEvNfxZVVcOCAOih5PKr) {
            return;
        }
        savedStateHandleController.getClass();
        ej6unYlOWMDF.pYmKDYlAmhudp(aLnH3AptNOGA7UbXGxOl2SnVeZ, "registry");
        ej6unYlOWMDF.pYmKDYlAmhudp(ivkrtmqow0tqcenn, "lifecycle");
        if (savedStateHandleController.V57tEvNfxZVVcOCAOih5PKr) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        savedStateHandleController.V57tEvNfxZVVcOCAOih5PKr = true;
        ivkrtmqow0tqcenn.VxUQ9tBhpHJ2AAEDNW8sghc4m(savedStateHandleController);
        aLnH3AptNOGA7UbXGxOl2SnVeZ.LaeGQIruHQu81hfJldjMOQSVblH3x(null, null);
        Cg8BA4YSFFWr8 cg8BA4YSFFWr8 = ivkrtmqow0tqcenn.V57tEvNfxZVVcOCAOih5PKr;
        if (cg8BA4YSFFWr8 == Cg8BA4YSFFWr8.ZfQNn8hdWlEQ5cR94249PDsLR || cg8BA4YSFFWr8.compareTo(Cg8BA4YSFFWr8.zIvmSL0wzmmKGc3X39b2Gw2mUGE) >= 0) {
            aLnH3AptNOGA7UbXGxOl2SnVeZ.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        } else {
            ivkrtmqow0tqcenn.VxUQ9tBhpHJ2AAEDNW8sghc4m(new W3ZqXaAE9m3wS() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // com.vdodsodjsdt.W3ZqXaAE9m3wS
                public final void zzpBGItXfub0yWj(hCgEybj69le8 hcgeybj69le8, XOTOHmUA5NYhlyOBh7 xOTOHmUA5NYhlyOBh7) {
                    if (xOTOHmUA5NYhlyOBh7 == XOTOHmUA5NYhlyOBh7.ON_START) {
                        ivkrtmqow0tqcenn.zIvmSL0wzmmKGc3X39b2Gw2mUGE(this);
                        aLnH3AptNOGA7UbXGxOl2SnVeZ.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
                    }
                }
            });
        }
    }

    public abstract void CixTK5ZX8oWXHz34qHYV(int i);

    public abstract Typeface HzCpKshMOoaw76hFcbOVRYMeRd(Context context, j5O1PfCuTxZKdtuvF7[] j5o1pfcutxzkdtuvf7Arr, int i);

    public Typeface KUYypEB4eNWOZWVDpH(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public abstract void L8DMw02rUTs2w(View view, float f, float f2);

    public abstract Typeface M9e7PWhFYLD2lOGMker(Context context, NEoz7FxOyLX3r49rfTBZNOYjpdY5x nEoz7FxOyLX3r49rfTBZNOYjpdY5x, Resources resources, int i);

    public abstract int NSjgqmGjEzuugn2SsG1mZFP(View view, int i);

    public int O1xDAlBZZlZdoEf747lCFHld() {
        return 0;
    }

    public abstract int ZLZeBXTMq0zDztBxtRTuCHrapQ(View view, int i);

    public abstract boolean bjhcQ0u7VT2OYYrwk96HrWoN(View view, int i);

    public abstract void gBaBUmihn5l4u(View view, int i, int i2);

    public j5O1PfCuTxZKdtuvF7 jW7EiD0YL6xkbB158jMUzhWNWb1y(j5O1PfCuTxZKdtuvF7[] j5o1pfcutxzkdtuvf7Arr, int i) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        j5O1PfCuTxZKdtuvF7 j5o1pfcutxzkdtuvf7 = null;
        int i3 = Integer.MAX_VALUE;
        for (j5O1PfCuTxZKdtuvF7 j5o1pfcutxzkdtuvf72 : j5o1pfcutxzkdtuvf7Arr) {
            int iAbs = (Math.abs(j5o1pfcutxzkdtuvf72.V57tEvNfxZVVcOCAOih5PKr - i2) * 2) + (j5o1pfcutxzkdtuvf72.ZfQNn8hdWlEQ5cR94249PDsLR == z ? 0 : 1);
            if (j5o1pfcutxzkdtuvf7 == null || i3 > iAbs) {
                j5o1pfcutxzkdtuvf7 = j5o1pfcutxzkdtuvf72;
                i3 = iAbs;
            }
        }
        return j5o1pfcutxzkdtuvf7;
    }

    public Typeface p59rPv72J9(Context context, Resources resources, int i, String str, int i2) {
        File fileSuB3hEmTmbbRGAhtvOOmfKEon = FLWIoSaHb1q8TqFvEBgPyRGrzvi6.SuB3hEmTmbbRGAhtvOOmfKEon(context);
        if (fileSuB3hEmTmbbRGAhtvOOmfKEon == null) {
            return null;
        }
        try {
            if (FLWIoSaHb1q8TqFvEBgPyRGrzvi6.p59rPv72J9(fileSuB3hEmTmbbRGAhtvOOmfKEon, resources, i)) {
                return Typeface.createFromFile(fileSuB3hEmTmbbRGAhtvOOmfKEon.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileSuB3hEmTmbbRGAhtvOOmfKEon.delete();
        }
    }

    public Typeface q1wNbhk2O6(Context context, InputStream inputStream) {
        File fileSuB3hEmTmbbRGAhtvOOmfKEon = FLWIoSaHb1q8TqFvEBgPyRGrzvi6.SuB3hEmTmbbRGAhtvOOmfKEon(context);
        if (fileSuB3hEmTmbbRGAhtvOOmfKEon == null) {
            return null;
        }
        try {
            if (FLWIoSaHb1q8TqFvEBgPyRGrzvi6.Ca81ebIan1u(fileSuB3hEmTmbbRGAhtvOOmfKEon, inputStream)) {
                return Typeface.createFromFile(fileSuB3hEmTmbbRGAhtvOOmfKEon.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileSuB3hEmTmbbRGAhtvOOmfKEon.delete();
        }
    }

    public abstract void rERAmyEtGV6ANGszuKcQI(boolean z);

    public int vE4yDIjexsP2lGjLaTcB(View view) {
        return 0;
    }

    public abstract void wRCD0SdqWCowdYU7bmzN(int i);

    public abstract void ymT6yQrus3w(Typeface typeface, boolean z);

    public void GE1sqSYiEYQO2ew7WEZwTtUeS5(boolean z) {
    }

    public void YdNRGRc4rly(View view, int i) {
    }
}
