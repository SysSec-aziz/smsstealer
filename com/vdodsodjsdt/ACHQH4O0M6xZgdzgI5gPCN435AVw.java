package com.vdodsodjsdt;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ACHQH4O0M6xZgdzgI5gPCN435AVw extends ueiyNUHTUsoj16g9F {
    public static boolean GI83zq0G8e7zkn = false;
    public static Class HzCpKshMOoaw76hFcbOVRYMeRd;
    public static Field KUYypEB4eNWOZWVDpH;
    public static Method M9e7PWhFYLD2lOGMker;
    public static Field q1wNbhk2O6;
    public MCkc9XaOBWJ3kr1ZFUGL46e9N LaeGQIruHQu81hfJldjMOQSVblH3x;
    public int NSjgqmGjEzuugn2SsG1mZFP;
    public final WindowInsets V57tEvNfxZVVcOCAOih5PKr;
    public MCkc9XaOBWJ3kr1ZFUGL46e9N ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public MCkc9XaOBWJ3kr1ZFUGL46e9N[] ZfQNn8hdWlEQ5cR94249PDsLR;
    public pmJH8rqWIwRth8COqq zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public ACHQH4O0M6xZgdzgI5gPCN435AVw(pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqq, WindowInsets windowInsets) {
        super(pmjh8rqwiwrth8coqq);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = null;
        this.V57tEvNfxZVVcOCAOih5PKr = windowInsets;
    }

    @SuppressLint({"PrivateApi"})
    private static void Irh5auREsoeV1C1RaBamlmy() {
        try {
            M9e7PWhFYLD2lOGMker = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            HzCpKshMOoaw76hFcbOVRYMeRd = cls;
            KUYypEB4eNWOZWVDpH = cls.getDeclaredField("mVisibleInsets");
            q1wNbhk2O6 = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            KUYypEB4eNWOZWVDpH.setAccessible(true);
            q1wNbhk2O6.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        GI83zq0G8e7zkn = true;
    }

    private MCkc9XaOBWJ3kr1ZFUGL46e9N TaDO7ogis3aEiWEtq(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!GI83zq0G8e7zkn) {
            Irh5auREsoeV1C1RaBamlmy();
        }
        Method method = M9e7PWhFYLD2lOGMker;
        if (method != null && HzCpKshMOoaw76hFcbOVRYMeRd != null && KUYypEB4eNWOZWVDpH != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) KUYypEB4eNWOZWVDpH.get(q1wNbhk2O6.get(objInvoke));
                if (rect != null) {
                    return MCkc9XaOBWJ3kr1ZFUGL46e9N.zzpBGItXfub0yWj(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    @SuppressLint({"WrongConstant"})
    private MCkc9XaOBWJ3kr1ZFUGL46e9N jW7EiD0YL6xkbB158jMUzhWNWb1y(int i, boolean z) {
        MCkc9XaOBWJ3kr1ZFUGL46e9N mCkc9XaOBWJ3kr1ZFUGL46e9NVxUQ9tBhpHJ2AAEDNW8sghc4m = MCkc9XaOBWJ3kr1ZFUGL46e9N.LaeGQIruHQu81hfJldjMOQSVblH3x;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                mCkc9XaOBWJ3kr1ZFUGL46e9NVxUQ9tBhpHJ2AAEDNW8sghc4m = MCkc9XaOBWJ3kr1ZFUGL46e9N.VxUQ9tBhpHJ2AAEDNW8sghc4m(mCkc9XaOBWJ3kr1ZFUGL46e9NVxUQ9tBhpHJ2AAEDNW8sghc4m, f6ZQsR6bPLvvCDNXOUc(i2, z));
            }
        }
        return mCkc9XaOBWJ3kr1ZFUGL46e9NVxUQ9tBhpHJ2AAEDNW8sghc4m;
    }

    private MCkc9XaOBWJ3kr1ZFUGL46e9N vBGA6pPLqSMuYGvprl270j7() {
        pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqq = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        return pmjh8rqwiwrth8coqq != null ? pmjh8rqwiwrth8coqq.VxUQ9tBhpHJ2AAEDNW8sghc4m.NSjgqmGjEzuugn2SsG1mZFP() : MCkc9XaOBWJ3kr1ZFUGL46e9N.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    public static boolean w0Wu95l8dVNw5rZMRu(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    @Override // com.vdodsodjsdt.ueiyNUHTUsoj16g9F
    public void Ca81ebIan1u(MCkc9XaOBWJ3kr1ZFUGL46e9N[] mCkc9XaOBWJ3kr1ZFUGL46e9NArr) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR = mCkc9XaOBWJ3kr1ZFUGL46e9NArr;
    }

    @Override // com.vdodsodjsdt.ueiyNUHTUsoj16g9F
    public pmJH8rqWIwRth8COqq KUYypEB4eNWOZWVDpH(int i, int i2, int i3, int i4) {
        pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ = pmJH8rqWIwRth8COqq.ZLZeBXTMq0zDztBxtRTuCHrapQ(null, this.V57tEvNfxZVVcOCAOih5PKr);
        int i5 = Build.VERSION.SDK_INT;
        LVSdrptRp9 fq3Bs0prQtLat6 = i5 >= 34 ? new Fq3Bs0prQtLat6(pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ) : i5 >= 31 ? new fi6bazFdEnPBJ(pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ) : i5 >= 30 ? new pJLDv0icdTgj6BPWve3wUpnLp(pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ) : i5 >= 29 ? new p57FoMnk3HKM7uLVmLF1zeLl(pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ) : new NsOvxcOeb6vgXelqa7wP4(pmjh8rqwiwrth8coqqZLZeBXTMq0zDztBxtRTuCHrapQ);
        fq3Bs0prQtLat6.ZLZeBXTMq0zDztBxtRTuCHrapQ(pmJH8rqWIwRth8COqq.LaeGQIruHQu81hfJldjMOQSVblH3x(M9e7PWhFYLD2lOGMker(), i, i2, i3, i4));
        fq3Bs0prQtLat6.LaeGQIruHQu81hfJldjMOQSVblH3x(pmJH8rqWIwRth8COqq.LaeGQIruHQu81hfJldjMOQSVblH3x(NSjgqmGjEzuugn2SsG1mZFP(), i, i2, i3, i4));
        return fq3Bs0prQtLat6.zzpBGItXfub0yWj();
    }

    @Override // com.vdodsodjsdt.ueiyNUHTUsoj16g9F
    public final MCkc9XaOBWJ3kr1ZFUGL46e9N M9e7PWhFYLD2lOGMker() {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x == null) {
            WindowInsets windowInsets = this.V57tEvNfxZVVcOCAOih5PKr;
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = MCkc9XaOBWJ3kr1ZFUGL46e9N.zzpBGItXfub0yWj(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    @Override // com.vdodsodjsdt.ueiyNUHTUsoj16g9F
    public void ZfQNn8hdWlEQ5cR94249PDsLR(View view) {
        MCkc9XaOBWJ3kr1ZFUGL46e9N mCkc9XaOBWJ3kr1ZFUGL46e9NTaDO7ogis3aEiWEtq = TaDO7ogis3aEiWEtq(view);
        if (mCkc9XaOBWJ3kr1ZFUGL46e9NTaDO7ogis3aEiWEtq == null) {
            mCkc9XaOBWJ3kr1ZFUGL46e9NTaDO7ogis3aEiWEtq = MCkc9XaOBWJ3kr1ZFUGL46e9N.LaeGQIruHQu81hfJldjMOQSVblH3x;
        }
        q11o1hieEkZDhF1MGOZI26oZiDT(mCkc9XaOBWJ3kr1ZFUGL46e9NTaDO7ogis3aEiWEtq);
    }

    @Override // com.vdodsodjsdt.ueiyNUHTUsoj16g9F
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        ACHQH4O0M6xZgdzgI5gPCN435AVw aCHQH4O0M6xZgdzgI5gPCN435AVw = (ACHQH4O0M6xZgdzgI5gPCN435AVw) obj;
        return Objects.equals(this.ZLZeBXTMq0zDztBxtRTuCHrapQ, aCHQH4O0M6xZgdzgI5gPCN435AVw.ZLZeBXTMq0zDztBxtRTuCHrapQ) && w0Wu95l8dVNw5rZMRu(this.NSjgqmGjEzuugn2SsG1mZFP, aCHQH4O0M6xZgdzgI5gPCN435AVw.NSjgqmGjEzuugn2SsG1mZFP);
    }

    public MCkc9XaOBWJ3kr1ZFUGL46e9N f6ZQsR6bPLvvCDNXOUc(int i, boolean z) {
        MCkc9XaOBWJ3kr1ZFUGL46e9N mCkc9XaOBWJ3kr1ZFUGL46e9NNSjgqmGjEzuugn2SsG1mZFP;
        int i2;
        MCkc9XaOBWJ3kr1ZFUGL46e9N mCkc9XaOBWJ3kr1ZFUGL46e9N = MCkc9XaOBWJ3kr1ZFUGL46e9N.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    MCkc9XaOBWJ3kr1ZFUGL46e9N[] mCkc9XaOBWJ3kr1ZFUGL46e9NArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                    mCkc9XaOBWJ3kr1ZFUGL46e9NNSjgqmGjEzuugn2SsG1mZFP = mCkc9XaOBWJ3kr1ZFUGL46e9NArr != null ? mCkc9XaOBWJ3kr1ZFUGL46e9NArr[zonOxHotd3BwAPJcwqr6I6uQNngg4.HVEwbdULInpTNa0IG(8)] : null;
                    if (mCkc9XaOBWJ3kr1ZFUGL46e9NNSjgqmGjEzuugn2SsG1mZFP != null) {
                        return mCkc9XaOBWJ3kr1ZFUGL46e9NNSjgqmGjEzuugn2SsG1mZFP;
                    }
                    MCkc9XaOBWJ3kr1ZFUGL46e9N mCkc9XaOBWJ3kr1ZFUGL46e9NM9e7PWhFYLD2lOGMker = M9e7PWhFYLD2lOGMker();
                    MCkc9XaOBWJ3kr1ZFUGL46e9N mCkc9XaOBWJ3kr1ZFUGL46e9NVBGA6pPLqSMuYGvprl270j7 = vBGA6pPLqSMuYGvprl270j7();
                    int i3 = mCkc9XaOBWJ3kr1ZFUGL46e9NM9e7PWhFYLD2lOGMker.ZfQNn8hdWlEQ5cR94249PDsLR;
                    if (i3 > mCkc9XaOBWJ3kr1ZFUGL46e9NVBGA6pPLqSMuYGvprl270j7.ZfQNn8hdWlEQ5cR94249PDsLR) {
                        return MCkc9XaOBWJ3kr1ZFUGL46e9N.zzpBGItXfub0yWj(0, 0, 0, i3);
                    }
                    MCkc9XaOBWJ3kr1ZFUGL46e9N mCkc9XaOBWJ3kr1ZFUGL46e9N2 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                    if (mCkc9XaOBWJ3kr1ZFUGL46e9N2 != null && !mCkc9XaOBWJ3kr1ZFUGL46e9N2.equals(mCkc9XaOBWJ3kr1ZFUGL46e9N) && (i2 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ.ZfQNn8hdWlEQ5cR94249PDsLR) > mCkc9XaOBWJ3kr1ZFUGL46e9NVBGA6pPLqSMuYGvprl270j7.ZfQNn8hdWlEQ5cR94249PDsLR) {
                        return MCkc9XaOBWJ3kr1ZFUGL46e9N.zzpBGItXfub0yWj(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return GI83zq0G8e7zkn();
                    }
                    if (i == 32) {
                        return ZLZeBXTMq0zDztBxtRTuCHrapQ();
                    }
                    if (i == 64) {
                        return HzCpKshMOoaw76hFcbOVRYMeRd();
                    }
                    if (i == 128) {
                        pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqq = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                        QqSlARFYnjeu4iv9uWe qqSlARFYnjeu4iv9uWeLaeGQIruHQu81hfJldjMOQSVblH3x = pmjh8rqwiwrth8coqq != null ? pmjh8rqwiwrth8coqq.VxUQ9tBhpHJ2AAEDNW8sghc4m.LaeGQIruHQu81hfJldjMOQSVblH3x() : LaeGQIruHQu81hfJldjMOQSVblH3x();
                        if (qqSlARFYnjeu4iv9uWeLaeGQIruHQu81hfJldjMOQSVblH3x != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return MCkc9XaOBWJ3kr1ZFUGL46e9N.zzpBGItXfub0yWj(i4 >= 28 ? kHXwlw9VpxBho.NSjgqmGjEzuugn2SsG1mZFP(qqSlARFYnjeu4iv9uWeLaeGQIruHQu81hfJldjMOQSVblH3x.VxUQ9tBhpHJ2AAEDNW8sghc4m) : 0, i4 >= 28 ? kHXwlw9VpxBho.M9e7PWhFYLD2lOGMker(qqSlARFYnjeu4iv9uWeLaeGQIruHQu81hfJldjMOQSVblH3x.VxUQ9tBhpHJ2AAEDNW8sghc4m) : 0, i4 >= 28 ? kHXwlw9VpxBho.GI83zq0G8e7zkn(qqSlARFYnjeu4iv9uWeLaeGQIruHQu81hfJldjMOQSVblH3x.VxUQ9tBhpHJ2AAEDNW8sghc4m) : 0, i4 >= 28 ? kHXwlw9VpxBho.ZLZeBXTMq0zDztBxtRTuCHrapQ(qqSlARFYnjeu4iv9uWeLaeGQIruHQu81hfJldjMOQSVblH3x.VxUQ9tBhpHJ2AAEDNW8sghc4m) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    MCkc9XaOBWJ3kr1ZFUGL46e9N mCkc9XaOBWJ3kr1ZFUGL46e9NVBGA6pPLqSMuYGvprl270j72 = vBGA6pPLqSMuYGvprl270j7();
                    MCkc9XaOBWJ3kr1ZFUGL46e9N mCkc9XaOBWJ3kr1ZFUGL46e9NNSjgqmGjEzuugn2SsG1mZFP2 = NSjgqmGjEzuugn2SsG1mZFP();
                    return MCkc9XaOBWJ3kr1ZFUGL46e9N.zzpBGItXfub0yWj(Math.max(mCkc9XaOBWJ3kr1ZFUGL46e9NVBGA6pPLqSMuYGvprl270j72.VxUQ9tBhpHJ2AAEDNW8sghc4m, mCkc9XaOBWJ3kr1ZFUGL46e9NNSjgqmGjEzuugn2SsG1mZFP2.VxUQ9tBhpHJ2AAEDNW8sghc4m), 0, Math.max(mCkc9XaOBWJ3kr1ZFUGL46e9NVBGA6pPLqSMuYGvprl270j72.V57tEvNfxZVVcOCAOih5PKr, mCkc9XaOBWJ3kr1ZFUGL46e9NNSjgqmGjEzuugn2SsG1mZFP2.V57tEvNfxZVVcOCAOih5PKr), Math.max(mCkc9XaOBWJ3kr1ZFUGL46e9NVBGA6pPLqSMuYGvprl270j72.ZfQNn8hdWlEQ5cR94249PDsLR, mCkc9XaOBWJ3kr1ZFUGL46e9NNSjgqmGjEzuugn2SsG1mZFP2.ZfQNn8hdWlEQ5cR94249PDsLR));
                }
                if ((this.NSjgqmGjEzuugn2SsG1mZFP & 2) == 0) {
                    MCkc9XaOBWJ3kr1ZFUGL46e9N mCkc9XaOBWJ3kr1ZFUGL46e9NM9e7PWhFYLD2lOGMker2 = M9e7PWhFYLD2lOGMker();
                    pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqq2 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                    mCkc9XaOBWJ3kr1ZFUGL46e9NNSjgqmGjEzuugn2SsG1mZFP = pmjh8rqwiwrth8coqq2 != null ? pmjh8rqwiwrth8coqq2.VxUQ9tBhpHJ2AAEDNW8sghc4m.NSjgqmGjEzuugn2SsG1mZFP() : null;
                    int iMin = mCkc9XaOBWJ3kr1ZFUGL46e9NM9e7PWhFYLD2lOGMker2.ZfQNn8hdWlEQ5cR94249PDsLR;
                    if (mCkc9XaOBWJ3kr1ZFUGL46e9NNSjgqmGjEzuugn2SsG1mZFP != null) {
                        iMin = Math.min(iMin, mCkc9XaOBWJ3kr1ZFUGL46e9NNSjgqmGjEzuugn2SsG1mZFP.ZfQNn8hdWlEQ5cR94249PDsLR);
                    }
                    return MCkc9XaOBWJ3kr1ZFUGL46e9N.zzpBGItXfub0yWj(mCkc9XaOBWJ3kr1ZFUGL46e9NM9e7PWhFYLD2lOGMker2.VxUQ9tBhpHJ2AAEDNW8sghc4m, 0, mCkc9XaOBWJ3kr1ZFUGL46e9NM9e7PWhFYLD2lOGMker2.V57tEvNfxZVVcOCAOih5PKr, iMin);
                }
            }
        } else {
            if (z) {
                return MCkc9XaOBWJ3kr1ZFUGL46e9N.zzpBGItXfub0yWj(0, Math.max(vBGA6pPLqSMuYGvprl270j7().zzpBGItXfub0yWj, M9e7PWhFYLD2lOGMker().zzpBGItXfub0yWj), 0, 0);
            }
            if ((this.NSjgqmGjEzuugn2SsG1mZFP & 4) == 0) {
                return MCkc9XaOBWJ3kr1ZFUGL46e9N.zzpBGItXfub0yWj(0, M9e7PWhFYLD2lOGMker().zzpBGItXfub0yWj, 0, 0);
            }
        }
        return mCkc9XaOBWJ3kr1ZFUGL46e9N;
    }

    @Override // com.vdodsodjsdt.ueiyNUHTUsoj16g9F
    public void h3jnZRsdwYJfY9UhQCkbvWciwvFHv(pmJH8rqWIwRth8COqq pmjh8rqwiwrth8coqq) {
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = pmjh8rqwiwrth8coqq;
    }

    @Override // com.vdodsodjsdt.ueiyNUHTUsoj16g9F
    public void ko09zE6UAgwkV(int i) {
        this.NSjgqmGjEzuugn2SsG1mZFP = i;
    }

    @Override // com.vdodsodjsdt.ueiyNUHTUsoj16g9F
    public boolean p59rPv72J9() {
        return this.V57tEvNfxZVVcOCAOih5PKr.isRound();
    }

    public void q11o1hieEkZDhF1MGOZI26oZiDT(MCkc9XaOBWJ3kr1ZFUGL46e9N mCkc9XaOBWJ3kr1ZFUGL46e9N) {
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = mCkc9XaOBWJ3kr1ZFUGL46e9N;
    }

    @Override // com.vdodsodjsdt.ueiyNUHTUsoj16g9F
    public MCkc9XaOBWJ3kr1ZFUGL46e9N zIvmSL0wzmmKGc3X39b2Gw2mUGE(int i) {
        return jW7EiD0YL6xkbB158jMUzhWNWb1y(i, false);
    }
}
