package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class lVmDeTGg7MOWpV {
    public final ip64iAOYuT7Wjhfuo5cbjxBm GI83zq0G8e7zkn;
    public Typeface KUYypEB4eNWOZWVDpH;
    public nK7IfeTXa4 LaeGQIruHQu81hfJldjMOQSVblH3x;
    public nK7IfeTXa4 NSjgqmGjEzuugn2SsG1mZFP;
    public nK7IfeTXa4 V57tEvNfxZVVcOCAOih5PKr;
    public final TextView VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public nK7IfeTXa4 ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public nK7IfeTXa4 ZfQNn8hdWlEQ5cR94249PDsLR;
    public boolean q1wNbhk2O6;
    public nK7IfeTXa4 zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public nK7IfeTXa4 zzpBGItXfub0yWj;
    public int M9e7PWhFYLD2lOGMker = 0;
    public int HzCpKshMOoaw76hFcbOVRYMeRd = -1;

    public lVmDeTGg7MOWpV(TextView textView) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = textView;
        this.GI83zq0G8e7zkn = new ip64iAOYuT7Wjhfuo5cbjxBm(textView);
    }

    public static void NSjgqmGjEzuugn2SsG1mZFP(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            AuWCPdlLhOuIvGOGYC9mCLNVz.ZfQNn8hdWlEQ5cR94249PDsLR(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            AuWCPdlLhOuIvGOGYC9mCLNVz.ZfQNn8hdWlEQ5cR94249PDsLR(editorInfo, text);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = text.length();
        if (i4 < 0 || i2 > length) {
            sGipz63rTUmSj3uFDvOtzihao.wdI7vzA3Qmcwd(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            sGipz63rTUmSj3uFDvOtzihao.wdI7vzA3Qmcwd(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            sGipz63rTUmSj3uFDvOtzihao.wdI7vzA3Qmcwd(editorInfo, text, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int iMin = Math.min(text.length() - i2, i8 - Math.min(i4, (int) (((double) i8) * 0.8d)));
        int iMin2 = Math.min(i4, i8 - iMin);
        int i9 = i4 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i9))) {
            i9++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i2 + iMin) - 1))) {
            iMin--;
        }
        int i10 = iMin2 + i7;
        sGipz63rTUmSj3uFDvOtzihao.wdI7vzA3Qmcwd(editorInfo, i7 != i6 ? TextUtils.concat(text.subSequence(i9, i9 + iMin2), text.subSequence(i2, iMin + i2)) : text.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    public static nK7IfeTXa4 V57tEvNfxZVVcOCAOih5PKr(Context context, aMdFkGJAdbLdAI00ZfKC7DaJw3k2 amdfkgjadbldai00zfkc7dajw3k2, int i) {
        ColorStateList colorStateListZIvmSL0wzmmKGc3X39b2Gw2mUGE;
        synchronized (amdfkgjadbldai00zfkc7dajw3k2) {
            colorStateListZIvmSL0wzmmKGc3X39b2Gw2mUGE = amdfkgjadbldai00zfkc7dajw3k2.VxUQ9tBhpHJ2AAEDNW8sghc4m.zIvmSL0wzmmKGc3X39b2Gw2mUGE(context, i);
        }
        if (colorStateListZIvmSL0wzmmKGc3X39b2Gw2mUGE == null) {
            return null;
        }
        nK7IfeTXa4 nk7ifetxa4 = new nK7IfeTXa4();
        nk7ifetxa4.zzpBGItXfub0yWj = true;
        nk7ifetxa4.V57tEvNfxZVVcOCAOih5PKr = colorStateListZIvmSL0wzmmKGc3X39b2Gw2mUGE;
        return nk7ifetxa4;
    }

    public final void GI83zq0G8e7zkn(int i, int i2, int i3, int i4) {
        ip64iAOYuT7Wjhfuo5cbjxBm ip64iaoyut7wjhfuo5cbjxbm = this.GI83zq0G8e7zkn;
        if (ip64iaoyut7wjhfuo5cbjxbm.M9e7PWhFYLD2lOGMker()) {
            DisplayMetrics displayMetrics = ip64iaoyut7wjhfuo5cbjxbm.M9e7PWhFYLD2lOGMker.getResources().getDisplayMetrics();
            ip64iaoyut7wjhfuo5cbjxbm.HzCpKshMOoaw76hFcbOVRYMeRd(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (ip64iaoyut7wjhfuo5cbjxbm.NSjgqmGjEzuugn2SsG1mZFP()) {
                ip64iaoyut7wjhfuo5cbjxbm.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            }
        }
    }

    public final void HzCpKshMOoaw76hFcbOVRYMeRd(int i) {
        ip64iAOYuT7Wjhfuo5cbjxBm ip64iaoyut7wjhfuo5cbjxbm = this.GI83zq0G8e7zkn;
        if (ip64iaoyut7wjhfuo5cbjxbm.M9e7PWhFYLD2lOGMker()) {
            if (i == 0) {
                ip64iaoyut7wjhfuo5cbjxbm.VxUQ9tBhpHJ2AAEDNW8sghc4m = 0;
                ip64iaoyut7wjhfuo5cbjxbm.ZfQNn8hdWlEQ5cR94249PDsLR = -1.0f;
                ip64iaoyut7wjhfuo5cbjxbm.LaeGQIruHQu81hfJldjMOQSVblH3x = -1.0f;
                ip64iaoyut7wjhfuo5cbjxbm.V57tEvNfxZVVcOCAOih5PKr = -1.0f;
                ip64iaoyut7wjhfuo5cbjxbm.zIvmSL0wzmmKGc3X39b2Gw2mUGE = new int[0];
                ip64iaoyut7wjhfuo5cbjxbm.zzpBGItXfub0yWj = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(u9SlVAuoWhQUfJ.NSjgqmGjEzuugn2SsG1mZFP("Unknown auto-size text type: ", i));
            }
            DisplayMetrics displayMetrics = ip64iaoyut7wjhfuo5cbjxbm.M9e7PWhFYLD2lOGMker.getResources().getDisplayMetrics();
            ip64iaoyut7wjhfuo5cbjxbm.HzCpKshMOoaw76hFcbOVRYMeRd(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (ip64iaoyut7wjhfuo5cbjxbm.NSjgqmGjEzuugn2SsG1mZFP()) {
                ip64iaoyut7wjhfuo5cbjxbm.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            }
        }
    }

    public final void KUYypEB4eNWOZWVDpH(ColorStateList colorStateList) {
        if (this.NSjgqmGjEzuugn2SsG1mZFP == null) {
            this.NSjgqmGjEzuugn2SsG1mZFP = new nK7IfeTXa4();
        }
        nK7IfeTXa4 nk7ifetxa4 = this.NSjgqmGjEzuugn2SsG1mZFP;
        nk7ifetxa4.V57tEvNfxZVVcOCAOih5PKr = colorStateList;
        nk7ifetxa4.zzpBGItXfub0yWj = colorStateList != null;
        this.zzpBGItXfub0yWj = nk7ifetxa4;
        this.V57tEvNfxZVVcOCAOih5PKr = nk7ifetxa4;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = nk7ifetxa4;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = nk7ifetxa4;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = nk7ifetxa4;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = nk7ifetxa4;
    }

    public final PorterDuff.Mode LaeGQIruHQu81hfJldjMOQSVblH3x() {
        nK7IfeTXa4 nk7ifetxa4 = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (nk7ifetxa4 != null) {
            return (PorterDuff.Mode) nk7ifetxa4.ZfQNn8hdWlEQ5cR94249PDsLR;
        }
        return null;
    }

    public final void M9e7PWhFYLD2lOGMker(int[] iArr, int i) {
        ip64iAOYuT7Wjhfuo5cbjxBm ip64iaoyut7wjhfuo5cbjxbm = this.GI83zq0G8e7zkn;
        if (ip64iaoyut7wjhfuo5cbjxbm.M9e7PWhFYLD2lOGMker()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = ip64iaoyut7wjhfuo5cbjxbm.M9e7PWhFYLD2lOGMker.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                ip64iaoyut7wjhfuo5cbjxbm.zIvmSL0wzmmKGc3X39b2Gw2mUGE = ip64iAOYuT7Wjhfuo5cbjxBm.zzpBGItXfub0yWj(iArrCopyOf);
                if (!ip64iaoyut7wjhfuo5cbjxbm.GI83zq0G8e7zkn()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                ip64iaoyut7wjhfuo5cbjxbm.ZLZeBXTMq0zDztBxtRTuCHrapQ = false;
            }
            if (ip64iaoyut7wjhfuo5cbjxbm.NSjgqmGjEzuugn2SsG1mZFP()) {
                ip64iaoyut7wjhfuo5cbjxbm.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            }
        }
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(Drawable drawable, nK7IfeTXa4 nk7ifetxa4) {
        if (drawable == null || nk7ifetxa4 == null) {
            return;
        }
        aMdFkGJAdbLdAI00ZfKC7DaJw3k2.LaeGQIruHQu81hfJldjMOQSVblH3x(drawable, nk7ifetxa4, this.VxUQ9tBhpHJ2AAEDNW8sghc4m.getDrawableState());
    }

    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AuEvIFo0QoYm1PHNG.TaDO7ogis3aEiWEtq);
        NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcM = new NrjuzzioPqfttNRptBDpZDzSYUrcM(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        p59rPv72J9(context, nrjuzzioPqfttNRptBDpZDzSYUrcM);
        if (i2 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            rW0TMCuwf8lds26m5BT.ZfQNn8hdWlEQ5cR94249PDsLR(textView, string);
        }
        nrjuzzioPqfttNRptBDpZDzSYUrcM.aXO0LSrt8bKV();
        Typeface typeface = this.KUYypEB4eNWOZWVDpH;
        if (typeface != null) {
            textView.setTypeface(typeface, this.M9e7PWhFYLD2lOGMker);
        }
    }

    public final ColorStateList ZfQNn8hdWlEQ5cR94249PDsLR() {
        nK7IfeTXa4 nk7ifetxa4 = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (nk7ifetxa4 != null) {
            return (ColorStateList) nk7ifetxa4.V57tEvNfxZVVcOCAOih5PKr;
        }
        return null;
    }

    public final void p59rPv72J9(Context context, NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcM) {
        String string;
        int i = this.M9e7PWhFYLD2lOGMker;
        TypedArray typedArray = (TypedArray) nrjuzzioPqfttNRptBDpZDzSYUrcM.V57tEvNfxZVVcOCAOih5PKr;
        this.M9e7PWhFYLD2lOGMker = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.HzCpKshMOoaw76hFcbOVRYMeRd = i3;
            if (i3 != -1) {
                this.M9e7PWhFYLD2lOGMker &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.q1wNbhk2O6 = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 == 1) {
                    this.KUYypEB4eNWOZWVDpH = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.KUYypEB4eNWOZWVDpH = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.KUYypEB4eNWOZWVDpH = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.KUYypEB4eNWOZWVDpH = null;
        int i5 = typedArray.hasValue(12) ? 12 : 10;
        int i6 = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        int i7 = this.M9e7PWhFYLD2lOGMker;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceJW7EiD0YL6xkbB158jMUzhWNWb1y = nrjuzzioPqfttNRptBDpZDzSYUrcM.jW7EiD0YL6xkbB158jMUzhWNWb1y(i5, this.M9e7PWhFYLD2lOGMker, new LRBGbkrLq2DH2orV6(this, i6, i7, new WeakReference(this.VxUQ9tBhpHJ2AAEDNW8sghc4m)));
                if (typefaceJW7EiD0YL6xkbB158jMUzhWNWb1y != null) {
                    if (i2 < 28 || this.HzCpKshMOoaw76hFcbOVRYMeRd == -1) {
                        this.KUYypEB4eNWOZWVDpH = typefaceJW7EiD0YL6xkbB158jMUzhWNWb1y;
                    } else {
                        this.KUYypEB4eNWOZWVDpH = Wmi1EviNhH.VxUQ9tBhpHJ2AAEDNW8sghc4m(Typeface.create(typefaceJW7EiD0YL6xkbB158jMUzhWNWb1y, 0), this.HzCpKshMOoaw76hFcbOVRYMeRd, (this.M9e7PWhFYLD2lOGMker & 2) != 0);
                    }
                }
                this.q1wNbhk2O6 = this.KUYypEB4eNWOZWVDpH == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.KUYypEB4eNWOZWVDpH != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.HzCpKshMOoaw76hFcbOVRYMeRd == -1) {
            this.KUYypEB4eNWOZWVDpH = Typeface.create(string, this.M9e7PWhFYLD2lOGMker);
        } else {
            this.KUYypEB4eNWOZWVDpH = Wmi1EviNhH.VxUQ9tBhpHJ2AAEDNW8sghc4m(Typeface.create(string, 0), this.HzCpKshMOoaw76hFcbOVRYMeRd, (this.M9e7PWhFYLD2lOGMker & 2) != 0);
        }
    }

    public final void q1wNbhk2O6(PorterDuff.Mode mode) {
        if (this.NSjgqmGjEzuugn2SsG1mZFP == null) {
            this.NSjgqmGjEzuugn2SsG1mZFP = new nK7IfeTXa4();
        }
        nK7IfeTXa4 nk7ifetxa4 = this.NSjgqmGjEzuugn2SsG1mZFP;
        nk7ifetxa4.ZfQNn8hdWlEQ5cR94249PDsLR = mode;
        nk7ifetxa4.VxUQ9tBhpHJ2AAEDNW8sghc4m = mode != null;
        this.zzpBGItXfub0yWj = nk7ifetxa4;
        this.V57tEvNfxZVVcOCAOih5PKr = nk7ifetxa4;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = nk7ifetxa4;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = nk7ifetxa4;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = nk7ifetxa4;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = nk7ifetxa4;
    }

    /* JADX WARN: Removed duplicated region for block: B:227:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:242:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zIvmSL0wzmmKGc3X39b2Gw2mUGE(android.util.AttributeSet r26, int r27) {
        /*
            Method dump skipped, instruction units count: 978
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.lVmDeTGg7MOWpV.zIvmSL0wzmmKGc3X39b2Gw2mUGE(android.util.AttributeSet, int):void");
    }

    public final void zzpBGItXfub0yWj() {
        nK7IfeTXa4 nk7ifetxa4 = this.zzpBGItXfub0yWj;
        TextView textView = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (nk7ifetxa4 != null || this.V57tEvNfxZVVcOCAOih5PKr != null || this.ZfQNn8hdWlEQ5cR94249PDsLR != null || this.LaeGQIruHQu81hfJldjMOQSVblH3x != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            VxUQ9tBhpHJ2AAEDNW8sghc4m(compoundDrawables[0], this.zzpBGItXfub0yWj);
            VxUQ9tBhpHJ2AAEDNW8sghc4m(compoundDrawables[1], this.V57tEvNfxZVVcOCAOih5PKr);
            VxUQ9tBhpHJ2AAEDNW8sghc4m(compoundDrawables[2], this.ZfQNn8hdWlEQ5cR94249PDsLR);
            VxUQ9tBhpHJ2AAEDNW8sghc4m(compoundDrawables[3], this.LaeGQIruHQu81hfJldjMOQSVblH3x);
        }
        if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE == null && this.ZLZeBXTMq0zDztBxtRTuCHrapQ == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        VxUQ9tBhpHJ2AAEDNW8sghc4m(compoundDrawablesRelative[0], this.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
        VxUQ9tBhpHJ2AAEDNW8sghc4m(compoundDrawablesRelative[2], this.ZLZeBXTMq0zDztBxtRTuCHrapQ);
    }
}
