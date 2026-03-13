package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class nUshirpmbH6saVf9I {
    public static final SparseIntArray LaeGQIruHQu81hfJldjMOQSVblH3x;
    public static final int[] ZfQNn8hdWlEQ5cR94249PDsLR = {0, 4, 8};
    public static final SparseIntArray zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final HashMap VxUQ9tBhpHJ2AAEDNW8sghc4m = new HashMap();
    public final boolean zzpBGItXfub0yWj = true;
    public final HashMap V57tEvNfxZVVcOCAOih5PKr = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        LaeGQIruHQu81hfJldjMOQSVblH3x = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        zIvmSL0wzmmKGc3X39b2Gw2mUGE = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    public static void NSjgqmGjEzuugn2SsG1mZFP(ZtjVvctVhW3SMibpO0L8oqBK ztjVvctVhW3SMibpO0L8oqBK, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                i = strSubstring.equalsIgnoreCase("W") ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f = Float.parseFloat(strSubstring3);
                        float f2 = Float.parseFloat(strSubstring4);
                        if (f > 0.0f && f2 > 0.0f) {
                            if (i == 1) {
                                Math.abs(f2 / f);
                            } else {
                                Math.abs(f / f2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        ztjVvctVhW3SMibpO0L8oqBK.HVEwbdULInpTNa0IG = str;
    }

    public static int[] V57tEvNfxZVVcOCAOih5PKr(YFE9GC9U4ndsIRwhZC9xI1 yFE9GC9U4ndsIRwhZC9xI1, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = yFE9GC9U4ndsIRwhZC9xI1.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = dQe4GlYslGx26Y6hUeth.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && yFE9GC9U4ndsIRwhZC9xI1.isInEditMode() && (yFE9GC9U4ndsIRwhZC9xI1.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) yFE9GC9U4ndsIRwhZC9xI1.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.Ca81ebIan1u;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.Ca81ebIan1u.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void ZLZeBXTMq0zDztBxtRTuCHrapQ(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.nUshirpmbH6saVf9I.ZLZeBXTMq0zDztBxtRTuCHrapQ(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    public static LofngUTEmVOfi2SbomD3ONlMmDH ZfQNn8hdWlEQ5cR94249PDsLR(Context context, AttributeSet attributeSet, boolean z) {
        int i;
        int i2;
        LofngUTEmVOfi2SbomD3ONlMmDH lofngUTEmVOfi2SbomD3ONlMmDH = new LofngUTEmVOfi2SbomD3ONlMmDH();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? ehtgKpBkv4pNXGKK0RL6dwwx7f.V57tEvNfxZVVcOCAOih5PKr : ehtgKpBkv4pNXGKK0RL6dwwx7f.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        String[] strArr = FLWIoSaHb1q8TqFvEBgPyRGrzvi6.zzpBGItXfub0yWj;
        hdKGVRpn3DqhXUHXyNOxMgD hdkgvrpn3dqhxuhxynoxmgd = lofngUTEmVOfi2SbomD3ONlMmDH.zzpBGItXfub0yWj;
        bH916XNpUQyRtvyPZq bh916xnpuqyrtvypzq = lofngUTEmVOfi2SbomD3ONlMmDH.LaeGQIruHQu81hfJldjMOQSVblH3x;
        WJZtWYAr4vKPgpkod wJZtWYAr4vKPgpkod = lofngUTEmVOfi2SbomD3ONlMmDH.V57tEvNfxZVVcOCAOih5PKr;
        siyClBnOpLkmTPckcsOgX siyclbnoplkmtpckcsogx = lofngUTEmVOfi2SbomD3ONlMmDH.ZfQNn8hdWlEQ5cR94249PDsLR;
        int[] iArr = ZfQNn8hdWlEQ5cR94249PDsLR;
        SparseIntArray sparseIntArray = LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (z) {
            yu7uov4Y2Pl6f0G4nvxUNG yu7uov4y2pl6f0g4nvxung = new yu7uov4Y2Pl6f0G4nvxUNG();
            yu7uov4y2pl6f0g4nvxung.VxUQ9tBhpHJ2AAEDNW8sghc4m = new int[10];
            yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj = new int[10];
            yu7uov4y2pl6f0g4nvxung.V57tEvNfxZVVcOCAOih5PKr = 0;
            yu7uov4y2pl6f0g4nvxung.ZfQNn8hdWlEQ5cR94249PDsLR = new int[10];
            yu7uov4y2pl6f0g4nvxung.LaeGQIruHQu81hfJldjMOQSVblH3x = new float[10];
            yu7uov4y2pl6f0g4nvxung.zIvmSL0wzmmKGc3X39b2Gw2mUGE = 0;
            yu7uov4y2pl6f0g4nvxung.ZLZeBXTMq0zDztBxtRTuCHrapQ = new int[5];
            yu7uov4y2pl6f0g4nvxung.NSjgqmGjEzuugn2SsG1mZFP = new String[5];
            yu7uov4y2pl6f0g4nvxung.GI83zq0G8e7zkn = 0;
            yu7uov4y2pl6f0g4nvxung.M9e7PWhFYLD2lOGMker = new int[4];
            yu7uov4y2pl6f0g4nvxung.HzCpKshMOoaw76hFcbOVRYMeRd = new boolean[4];
            yu7uov4y2pl6f0g4nvxung.KUYypEB4eNWOZWVDpH = 0;
            wJZtWYAr4vKPgpkod.getClass();
            siyclbnoplkmtpckcsogx.getClass();
            bh916xnpuqyrtvypzq.getClass();
            int i3 = 0;
            for (int indexCount = typedArrayObtainStyledAttributes.getIndexCount(); i3 < indexCount; indexCount = i2) {
                int index = typedArrayObtainStyledAttributes.getIndex(i3);
                int i4 = i3;
                switch (zIvmSL0wzmmKGc3X39b2Gw2mUGE.get(index)) {
                    case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, siyclbnoplkmtpckcsogx.qygqjTppWwx992));
                        continue;
                        i3 = i4 + 1;
                        break;
                    case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                    case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                    case 9:
                    case 10:
                    case 25:
                    case 26:
                    case 29:
                    case 30:
                    case 32:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        i2 = indexCount;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_FIELD_NUMBER /* 5 */:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.ZfQNn8hdWlEQ5cR94249PDsLR(typedArrayObtainStyledAttributes.getString(index), 5);
                        continue;
                        i3 = i4 + 1;
                        break;
                    case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_SET_FIELD_NUMBER /* 6 */:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, siyclbnoplkmtpckcsogx.pzqP2AqKW6J5PO8zCKnW));
                        break;
                    case g8kevnL6UKpr15IYtcPJXuLo1L4.DOUBLE_FIELD_NUMBER /* 7 */:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, siyclbnoplkmtpckcsogx.aXO0LSrt8bKV));
                        break;
                    case g8kevnL6UKpr15IYtcPJXuLo1L4.BYTES_FIELD_NUMBER /* 8 */:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, siyclbnoplkmtpckcsogx.iKANjmyTSxO6v6UuLPdu7DxOjlS));
                        break;
                    case 11:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, siyclbnoplkmtpckcsogx.wRCD0SdqWCowdYU7bmzN));
                        break;
                    case 12:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, siyclbnoplkmtpckcsogx.gBaBUmihn5l4u));
                        break;
                    case 13:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, siyclbnoplkmtpckcsogx.CixTK5ZX8oWXHz34qHYV));
                        break;
                    case 14:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, siyclbnoplkmtpckcsogx.YdNRGRc4rly));
                        break;
                    case 15:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, siyclbnoplkmtpckcsogx.L8DMw02rUTs2w));
                        break;
                    case 16:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, siyclbnoplkmtpckcsogx.ymT6yQrus3w));
                        break;
                    case 17:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, siyclbnoplkmtpckcsogx.ZfQNn8hdWlEQ5cR94249PDsLR));
                        break;
                    case 18:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, siyclbnoplkmtpckcsogx.LaeGQIruHQu81hfJldjMOQSVblH3x));
                        break;
                    case 19:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.VxUQ9tBhpHJ2AAEDNW8sghc4m(19, typedArrayObtainStyledAttributes.getFloat(index, siyclbnoplkmtpckcsogx.zIvmSL0wzmmKGc3X39b2Gw2mUGE));
                        break;
                    case 20:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.VxUQ9tBhpHJ2AAEDNW8sghc4m(20, typedArrayObtainStyledAttributes.getFloat(index, siyclbnoplkmtpckcsogx.Irh5auREsoeV1C1RaBamlmy));
                        break;
                    case 21:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, siyclbnoplkmtpckcsogx.V57tEvNfxZVVcOCAOih5PKr));
                        break;
                    case 22:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(22, iArr[typedArrayObtainStyledAttributes.getInt(index, hdkgvrpn3dqhxuhxynoxmgd.VxUQ9tBhpHJ2AAEDNW8sghc4m)]);
                        break;
                    case 23:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, siyclbnoplkmtpckcsogx.zzpBGItXfub0yWj));
                        break;
                    case 24:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, siyclbnoplkmtpckcsogx.O1xDAlBZZlZdoEf747lCFHld));
                        break;
                    case 27:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(27, typedArrayObtainStyledAttributes.getInt(index, siyclbnoplkmtpckcsogx.vE4yDIjexsP2lGjLaTcB));
                        break;
                    case 28:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, siyclbnoplkmtpckcsogx.HVEwbdULInpTNa0IG));
                        break;
                    case 31:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, siyclbnoplkmtpckcsogx.TqcnImqkSWIKht));
                        break;
                    case 34:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, siyclbnoplkmtpckcsogx.y1NaPKTl7R18DOr6e8i5));
                        break;
                    case 37:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.VxUQ9tBhpHJ2AAEDNW8sghc4m(37, typedArrayObtainStyledAttributes.getFloat(index, siyclbnoplkmtpckcsogx.q11o1hieEkZDhF1MGOZI26oZiDT));
                        break;
                    case 38:
                        i2 = indexCount;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, lofngUTEmVOfi2SbomD3ONlMmDH.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                        lofngUTEmVOfi2SbomD3ONlMmDH.VxUQ9tBhpHJ2AAEDNW8sghc4m = resourceId;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(38, resourceId);
                        break;
                    case 39:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.VxUQ9tBhpHJ2AAEDNW8sghc4m(39, typedArrayObtainStyledAttributes.getFloat(index, siyclbnoplkmtpckcsogx.ItrQwCXbty5PZtje5JS));
                        break;
                    case 40:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.VxUQ9tBhpHJ2AAEDNW8sghc4m(40, typedArrayObtainStyledAttributes.getFloat(index, siyclbnoplkmtpckcsogx.JUdwvN8LfOMa));
                        break;
                    case 41:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(41, typedArrayObtainStyledAttributes.getInt(index, siyclbnoplkmtpckcsogx.hKs1wlZyvtUNaW1f5ABIGacfPcvX));
                        break;
                    case 42:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(42, typedArrayObtainStyledAttributes.getInt(index, siyclbnoplkmtpckcsogx.vXWl0o6I4U59CgHs9));
                        break;
                    case 43:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.VxUQ9tBhpHJ2AAEDNW8sghc4m(43, typedArrayObtainStyledAttributes.getFloat(index, hdkgvrpn3dqhxuhxynoxmgd.V57tEvNfxZVVcOCAOih5PKr));
                        break;
                    case 44:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.V57tEvNfxZVVcOCAOih5PKr(44, true);
                        yu7uov4y2pl6f0g4nvxung.VxUQ9tBhpHJ2AAEDNW8sghc4m(44, typedArrayObtainStyledAttributes.getDimension(index, bh916xnpuqyrtvypzq.q1wNbhk2O6));
                        break;
                    case 45:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.VxUQ9tBhpHJ2AAEDNW8sghc4m(45, typedArrayObtainStyledAttributes.getFloat(index, bh916xnpuqyrtvypzq.zzpBGItXfub0yWj));
                        break;
                    case 46:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.VxUQ9tBhpHJ2AAEDNW8sghc4m(46, typedArrayObtainStyledAttributes.getFloat(index, bh916xnpuqyrtvypzq.V57tEvNfxZVVcOCAOih5PKr));
                        break;
                    case 47:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.VxUQ9tBhpHJ2AAEDNW8sghc4m(47, typedArrayObtainStyledAttributes.getFloat(index, bh916xnpuqyrtvypzq.ZfQNn8hdWlEQ5cR94249PDsLR));
                        break;
                    case 48:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.VxUQ9tBhpHJ2AAEDNW8sghc4m(48, typedArrayObtainStyledAttributes.getFloat(index, bh916xnpuqyrtvypzq.LaeGQIruHQu81hfJldjMOQSVblH3x));
                        break;
                    case 49:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.VxUQ9tBhpHJ2AAEDNW8sghc4m(49, typedArrayObtainStyledAttributes.getDimension(index, bh916xnpuqyrtvypzq.zIvmSL0wzmmKGc3X39b2Gw2mUGE));
                        break;
                    case 50:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.VxUQ9tBhpHJ2AAEDNW8sghc4m(50, typedArrayObtainStyledAttributes.getDimension(index, bh916xnpuqyrtvypzq.ZLZeBXTMq0zDztBxtRTuCHrapQ));
                        break;
                    case 51:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.VxUQ9tBhpHJ2AAEDNW8sghc4m(51, typedArrayObtainStyledAttributes.getDimension(index, bh916xnpuqyrtvypzq.GI83zq0G8e7zkn));
                        break;
                    case 52:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.VxUQ9tBhpHJ2AAEDNW8sghc4m(52, typedArrayObtainStyledAttributes.getDimension(index, bh916xnpuqyrtvypzq.M9e7PWhFYLD2lOGMker));
                        break;
                    case 53:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.VxUQ9tBhpHJ2AAEDNW8sghc4m(53, typedArrayObtainStyledAttributes.getDimension(index, bh916xnpuqyrtvypzq.HzCpKshMOoaw76hFcbOVRYMeRd));
                        break;
                    case 54:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(54, typedArrayObtainStyledAttributes.getInt(index, siyclbnoplkmtpckcsogx.wdI7vzA3Qmcwd));
                        break;
                    case 55:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(55, typedArrayObtainStyledAttributes.getInt(index, siyclbnoplkmtpckcsogx.KYZ9RyuOc42A2J));
                        break;
                    case 56:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, siyclbnoplkmtpckcsogx.zOk739gUM7zIZC25HHUxoiyixWFjn));
                        break;
                    case 57:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, siyclbnoplkmtpckcsogx.GE1sqSYiEYQO2ew7WEZwTtUeS5));
                        break;
                    case 58:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, siyclbnoplkmtpckcsogx.rERAmyEtGV6ANGszuKcQI));
                        break;
                    case 59:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, siyclbnoplkmtpckcsogx.H2VFYNJEVGAX));
                        break;
                    case 60:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.VxUQ9tBhpHJ2AAEDNW8sghc4m(60, typedArrayObtainStyledAttributes.getFloat(index, bh916xnpuqyrtvypzq.VxUQ9tBhpHJ2AAEDNW8sghc4m));
                        break;
                    case 62:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, siyclbnoplkmtpckcsogx.qNPQb1obP7));
                        break;
                    case 63:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.VxUQ9tBhpHJ2AAEDNW8sghc4m(63, typedArrayObtainStyledAttributes.getFloat(index, siyclbnoplkmtpckcsogx.SuB3hEmTmbbRGAhtvOOmfKEon));
                        break;
                    case 64:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(64, zIvmSL0wzmmKGc3X39b2Gw2mUGE(typedArrayObtainStyledAttributes, index, wJZtWYAr4vKPgpkod.VxUQ9tBhpHJ2AAEDNW8sghc4m));
                        break;
                    case 65:
                        i2 = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            yu7uov4y2pl6f0g4nvxung.ZfQNn8hdWlEQ5cR94249PDsLR(typedArrayObtainStyledAttributes.getString(index), 65);
                        } else {
                            yu7uov4y2pl6f0g4nvxung.ZfQNn8hdWlEQ5cR94249PDsLR(strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)], 65);
                        }
                        break;
                    case 66:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.VxUQ9tBhpHJ2AAEDNW8sghc4m(67, typedArrayObtainStyledAttributes.getFloat(index, wJZtWYAr4vKPgpkod.LaeGQIruHQu81hfJldjMOQSVblH3x));
                        break;
                    case 68:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.VxUQ9tBhpHJ2AAEDNW8sghc4m(68, typedArrayObtainStyledAttributes.getFloat(index, hdkgvrpn3dqhxuhxynoxmgd.ZfQNn8hdWlEQ5cR94249PDsLR));
                        break;
                    case 69:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.VxUQ9tBhpHJ2AAEDNW8sghc4m(69, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.VxUQ9tBhpHJ2AAEDNW8sghc4m(70, typedArrayObtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i2 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(72, typedArrayObtainStyledAttributes.getInt(index, siyclbnoplkmtpckcsogx.BJQHddi0Plr5ElWetCyaixWOg9));
                        break;
                    case 73:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, siyclbnoplkmtpckcsogx.tFRdVJAePmTx77bP7FAN0uI));
                        break;
                    case 74:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.ZfQNn8hdWlEQ5cR94249PDsLR(typedArrayObtainStyledAttributes.getString(index), 74);
                        break;
                    case 75:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.V57tEvNfxZVVcOCAOih5PKr(75, typedArrayObtainStyledAttributes.getBoolean(index, siyclbnoplkmtpckcsogx.ByTQIhgl7ezGvHXEd));
                        break;
                    case 76:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(76, typedArrayObtainStyledAttributes.getInt(index, wJZtWYAr4vKPgpkod.V57tEvNfxZVVcOCAOih5PKr));
                        break;
                    case 77:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.ZfQNn8hdWlEQ5cR94249PDsLR(typedArrayObtainStyledAttributes.getString(index), 77);
                        break;
                    case 78:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(78, typedArrayObtainStyledAttributes.getInt(index, hdkgvrpn3dqhxuhxynoxmgd.zzpBGItXfub0yWj));
                        break;
                    case 79:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.VxUQ9tBhpHJ2AAEDNW8sghc4m(79, typedArrayObtainStyledAttributes.getFloat(index, wJZtWYAr4vKPgpkod.ZfQNn8hdWlEQ5cR94249PDsLR));
                        break;
                    case 80:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.V57tEvNfxZVVcOCAOih5PKr(80, typedArrayObtainStyledAttributes.getBoolean(index, siyclbnoplkmtpckcsogx.wR7sbzHKf9hYV1lxoS6nqyszepWvN));
                        break;
                    case 81:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.V57tEvNfxZVVcOCAOih5PKr(81, typedArrayObtainStyledAttributes.getBoolean(index, siyclbnoplkmtpckcsogx.HAPpjhiCsV9ONY23505HCBI9IX));
                        break;
                    case 82:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(82, typedArrayObtainStyledAttributes.getInteger(index, wJZtWYAr4vKPgpkod.zzpBGItXfub0yWj));
                        break;
                    case 83:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(83, zIvmSL0wzmmKGc3X39b2Gw2mUGE(typedArrayObtainStyledAttributes, index, bh916xnpuqyrtvypzq.NSjgqmGjEzuugn2SsG1mZFP));
                        break;
                    case 84:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(84, typedArrayObtainStyledAttributes.getInteger(index, wJZtWYAr4vKPgpkod.ZLZeBXTMq0zDztBxtRTuCHrapQ));
                        break;
                    case 85:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.VxUQ9tBhpHJ2AAEDNW8sghc4m(85, typedArrayObtainStyledAttributes.getFloat(index, wJZtWYAr4vKPgpkod.zIvmSL0wzmmKGc3X39b2Gw2mUGE));
                        break;
                    case 86:
                        i2 = indexCount;
                        int i5 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i5 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            wJZtWYAr4vKPgpkod.GI83zq0G8e7zkn = resourceId2;
                            yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(89, resourceId2);
                            if (wJZtWYAr4vKPgpkod.GI83zq0G8e7zkn != -1) {
                                yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(88, -2);
                            }
                        } else if (i5 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            wJZtWYAr4vKPgpkod.NSjgqmGjEzuugn2SsG1mZFP = string;
                            yu7uov4y2pl6f0g4nvxung.ZfQNn8hdWlEQ5cR94249PDsLR(string, 90);
                            if (wJZtWYAr4vKPgpkod.NSjgqmGjEzuugn2SsG1mZFP.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                wJZtWYAr4vKPgpkod.GI83zq0G8e7zkn = resourceId3;
                                yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(89, resourceId3);
                                yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(88, -2);
                            } else {
                                yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(88, -1);
                            }
                        } else {
                            yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(88, typedArrayObtainStyledAttributes.getInteger(index, wJZtWYAr4vKPgpkod.GI83zq0G8e7zkn));
                        }
                        break;
                    case 87:
                        i2 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, siyclbnoplkmtpckcsogx.d9zDyyznnp3oaDT1Ug));
                        break;
                    case 94:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, siyclbnoplkmtpckcsogx.lQ0rO9lhQIyVe7Rp6));
                        break;
                    case 95:
                        i2 = indexCount;
                        ZLZeBXTMq0zDztBxtRTuCHrapQ(yu7uov4y2pl6f0g4nvxung, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i2 = indexCount;
                        ZLZeBXTMq0zDztBxtRTuCHrapQ(yu7uov4y2pl6f0g4nvxung, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.zzpBGItXfub0yWj(97, typedArrayObtainStyledAttributes.getInt(index, siyclbnoplkmtpckcsogx.tpEo0fy9FaoJYrSFHRfIK6));
                        break;
                    case 98:
                        i2 = indexCount;
                        int i6 = HdEe2MGI6XJkcVw9bjwK0RKA.jW7EiD0YL6xkbB158jMUzhWNWb1y;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            lofngUTEmVOfi2SbomD3ONlMmDH.VxUQ9tBhpHJ2AAEDNW8sghc4m = typedArrayObtainStyledAttributes.getResourceId(index, lofngUTEmVOfi2SbomD3ONlMmDH.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                        }
                        break;
                    case 99:
                        i2 = indexCount;
                        yu7uov4y2pl6f0g4nvxung.V57tEvNfxZVVcOCAOih5PKr(99, typedArrayObtainStyledAttributes.getBoolean(index, siyclbnoplkmtpckcsogx.ZLZeBXTMq0zDztBxtRTuCHrapQ));
                        break;
                }
                i3 = i4 + 1;
            }
        } else {
            int i7 = 0;
            for (int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount(); i7 < indexCount2; indexCount2 = i) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i7);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        wJZtWYAr4vKPgpkod.getClass();
                        siyclbnoplkmtpckcsogx.getClass();
                        bh916xnpuqyrtvypzq.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = zIvmSL0wzmmKGc3X39b2Gw2mUGE(typedArrayObtainStyledAttributes, index2, siyclbnoplkmtpckcsogx.h3jnZRsdwYJfY9UhQCkbvWciwvFHv);
                        continue;
                        i7++;
                        break;
                    case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.qygqjTppWwx992 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, siyclbnoplkmtpckcsogx.qygqjTppWwx992);
                        continue;
                        i7++;
                        break;
                    case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.Ca81ebIan1u = zIvmSL0wzmmKGc3X39b2Gw2mUGE(typedArrayObtainStyledAttributes, index2, siyclbnoplkmtpckcsogx.Ca81ebIan1u);
                        continue;
                        i7++;
                        break;
                    case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.p59rPv72J9 = zIvmSL0wzmmKGc3X39b2Gw2mUGE(typedArrayObtainStyledAttributes, index2, siyclbnoplkmtpckcsogx.p59rPv72J9);
                        continue;
                        i7++;
                        break;
                    case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_FIELD_NUMBER /* 5 */:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.w0Wu95l8dVNw5rZMRu = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i7++;
                        break;
                    case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_SET_FIELD_NUMBER /* 6 */:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.pzqP2AqKW6J5PO8zCKnW = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, siyclbnoplkmtpckcsogx.pzqP2AqKW6J5PO8zCKnW);
                        continue;
                        i7++;
                        break;
                    case g8kevnL6UKpr15IYtcPJXuLo1L4.DOUBLE_FIELD_NUMBER /* 7 */:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.aXO0LSrt8bKV = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, siyclbnoplkmtpckcsogx.aXO0LSrt8bKV);
                        continue;
                        i7++;
                        break;
                    case g8kevnL6UKpr15IYtcPJXuLo1L4.BYTES_FIELD_NUMBER /* 8 */:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.iKANjmyTSxO6v6UuLPdu7DxOjlS = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, siyclbnoplkmtpckcsogx.iKANjmyTSxO6v6UuLPdu7DxOjlS);
                        continue;
                        i7++;
                        break;
                    case 9:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.TaDO7ogis3aEiWEtq = zIvmSL0wzmmKGc3X39b2Gw2mUGE(typedArrayObtainStyledAttributes, index2, siyclbnoplkmtpckcsogx.TaDO7ogis3aEiWEtq);
                        continue;
                        i7++;
                        break;
                    case 10:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.vBGA6pPLqSMuYGvprl270j7 = zIvmSL0wzmmKGc3X39b2Gw2mUGE(typedArrayObtainStyledAttributes, index2, siyclbnoplkmtpckcsogx.vBGA6pPLqSMuYGvprl270j7);
                        continue;
                        i7++;
                        break;
                    case 11:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.wRCD0SdqWCowdYU7bmzN = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, siyclbnoplkmtpckcsogx.wRCD0SdqWCowdYU7bmzN);
                        continue;
                        i7++;
                        break;
                    case 12:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.gBaBUmihn5l4u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, siyclbnoplkmtpckcsogx.gBaBUmihn5l4u);
                        continue;
                        i7++;
                        break;
                    case 13:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.CixTK5ZX8oWXHz34qHYV = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, siyclbnoplkmtpckcsogx.CixTK5ZX8oWXHz34qHYV);
                        continue;
                        i7++;
                        break;
                    case 14:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.YdNRGRc4rly = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, siyclbnoplkmtpckcsogx.YdNRGRc4rly);
                        continue;
                        i7++;
                        break;
                    case 15:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.L8DMw02rUTs2w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, siyclbnoplkmtpckcsogx.L8DMw02rUTs2w);
                        continue;
                        i7++;
                        break;
                    case 16:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.ymT6yQrus3w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, siyclbnoplkmtpckcsogx.ymT6yQrus3w);
                        continue;
                        i7++;
                        break;
                    case 17:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.ZfQNn8hdWlEQ5cR94249PDsLR = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, siyclbnoplkmtpckcsogx.ZfQNn8hdWlEQ5cR94249PDsLR);
                        continue;
                        i7++;
                        break;
                    case 18:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.LaeGQIruHQu81hfJldjMOQSVblH3x = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, siyclbnoplkmtpckcsogx.LaeGQIruHQu81hfJldjMOQSVblH3x);
                        continue;
                        i7++;
                        break;
                    case 19:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.zIvmSL0wzmmKGc3X39b2Gw2mUGE = typedArrayObtainStyledAttributes.getFloat(index2, siyclbnoplkmtpckcsogx.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
                        continue;
                        i7++;
                        break;
                    case 20:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.Irh5auREsoeV1C1RaBamlmy = typedArrayObtainStyledAttributes.getFloat(index2, siyclbnoplkmtpckcsogx.Irh5auREsoeV1C1RaBamlmy);
                        continue;
                        i7++;
                        break;
                    case 21:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.V57tEvNfxZVVcOCAOih5PKr = typedArrayObtainStyledAttributes.getLayoutDimension(index2, siyclbnoplkmtpckcsogx.V57tEvNfxZVVcOCAOih5PKr);
                        continue;
                        i7++;
                        break;
                    case 22:
                        i = indexCount2;
                        int i8 = typedArrayObtainStyledAttributes.getInt(index2, hdkgvrpn3dqhxuhxynoxmgd.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                        hdkgvrpn3dqhxuhxynoxmgd.VxUQ9tBhpHJ2AAEDNW8sghc4m = i8;
                        hdkgvrpn3dqhxuhxynoxmgd.VxUQ9tBhpHJ2AAEDNW8sghc4m = iArr[i8];
                        continue;
                        i7++;
                        break;
                    case 23:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.zzpBGItXfub0yWj = typedArrayObtainStyledAttributes.getLayoutDimension(index2, siyclbnoplkmtpckcsogx.zzpBGItXfub0yWj);
                        continue;
                        i7++;
                        break;
                    case 24:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.O1xDAlBZZlZdoEf747lCFHld = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, siyclbnoplkmtpckcsogx.O1xDAlBZZlZdoEf747lCFHld);
                        continue;
                        i7++;
                        break;
                    case 25:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.NSjgqmGjEzuugn2SsG1mZFP = zIvmSL0wzmmKGc3X39b2Gw2mUGE(typedArrayObtainStyledAttributes, index2, siyclbnoplkmtpckcsogx.NSjgqmGjEzuugn2SsG1mZFP);
                        continue;
                        i7++;
                        break;
                    case 26:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.GI83zq0G8e7zkn = zIvmSL0wzmmKGc3X39b2Gw2mUGE(typedArrayObtainStyledAttributes, index2, siyclbnoplkmtpckcsogx.GI83zq0G8e7zkn);
                        continue;
                        i7++;
                        break;
                    case 27:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.vE4yDIjexsP2lGjLaTcB = typedArrayObtainStyledAttributes.getInt(index2, siyclbnoplkmtpckcsogx.vE4yDIjexsP2lGjLaTcB);
                        continue;
                        i7++;
                        break;
                    case 28:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.HVEwbdULInpTNa0IG = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, siyclbnoplkmtpckcsogx.HVEwbdULInpTNa0IG);
                        continue;
                        i7++;
                        break;
                    case 29:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.M9e7PWhFYLD2lOGMker = zIvmSL0wzmmKGc3X39b2Gw2mUGE(typedArrayObtainStyledAttributes, index2, siyclbnoplkmtpckcsogx.M9e7PWhFYLD2lOGMker);
                        continue;
                        i7++;
                        break;
                    case 30:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.HzCpKshMOoaw76hFcbOVRYMeRd = zIvmSL0wzmmKGc3X39b2Gw2mUGE(typedArrayObtainStyledAttributes, index2, siyclbnoplkmtpckcsogx.HzCpKshMOoaw76hFcbOVRYMeRd);
                        continue;
                        i7++;
                        break;
                    case 31:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.TqcnImqkSWIKht = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, siyclbnoplkmtpckcsogx.TqcnImqkSWIKht);
                        continue;
                        i7++;
                        break;
                    case 32:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.jW7EiD0YL6xkbB158jMUzhWNWb1y = zIvmSL0wzmmKGc3X39b2Gw2mUGE(typedArrayObtainStyledAttributes, index2, siyclbnoplkmtpckcsogx.jW7EiD0YL6xkbB158jMUzhWNWb1y);
                        continue;
                        i7++;
                        break;
                    case 33:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.f6ZQsR6bPLvvCDNXOUc = zIvmSL0wzmmKGc3X39b2Gw2mUGE(typedArrayObtainStyledAttributes, index2, siyclbnoplkmtpckcsogx.f6ZQsR6bPLvvCDNXOUc);
                        continue;
                        i7++;
                        break;
                    case 34:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.y1NaPKTl7R18DOr6e8i5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, siyclbnoplkmtpckcsogx.y1NaPKTl7R18DOr6e8i5);
                        continue;
                        i7++;
                        break;
                    case 35:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.q1wNbhk2O6 = zIvmSL0wzmmKGc3X39b2Gw2mUGE(typedArrayObtainStyledAttributes, index2, siyclbnoplkmtpckcsogx.q1wNbhk2O6);
                        continue;
                        i7++;
                        break;
                    case 36:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.KUYypEB4eNWOZWVDpH = zIvmSL0wzmmKGc3X39b2Gw2mUGE(typedArrayObtainStyledAttributes, index2, siyclbnoplkmtpckcsogx.KUYypEB4eNWOZWVDpH);
                        continue;
                        i7++;
                        break;
                    case 37:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.q11o1hieEkZDhF1MGOZI26oZiDT = typedArrayObtainStyledAttributes.getFloat(index2, siyclbnoplkmtpckcsogx.q11o1hieEkZDhF1MGOZI26oZiDT);
                        continue;
                        i7++;
                        break;
                    case 38:
                        i = indexCount2;
                        lofngUTEmVOfi2SbomD3ONlMmDH.VxUQ9tBhpHJ2AAEDNW8sghc4m = typedArrayObtainStyledAttributes.getResourceId(index2, lofngUTEmVOfi2SbomD3ONlMmDH.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                        continue;
                        i7++;
                        break;
                    case 39:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.ItrQwCXbty5PZtje5JS = typedArrayObtainStyledAttributes.getFloat(index2, siyclbnoplkmtpckcsogx.ItrQwCXbty5PZtje5JS);
                        continue;
                        i7++;
                        break;
                    case 40:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.JUdwvN8LfOMa = typedArrayObtainStyledAttributes.getFloat(index2, siyclbnoplkmtpckcsogx.JUdwvN8LfOMa);
                        continue;
                        i7++;
                        break;
                    case 41:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.hKs1wlZyvtUNaW1f5ABIGacfPcvX = typedArrayObtainStyledAttributes.getInt(index2, siyclbnoplkmtpckcsogx.hKs1wlZyvtUNaW1f5ABIGacfPcvX);
                        continue;
                        i7++;
                        break;
                    case 42:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.vXWl0o6I4U59CgHs9 = typedArrayObtainStyledAttributes.getInt(index2, siyclbnoplkmtpckcsogx.vXWl0o6I4U59CgHs9);
                        continue;
                        i7++;
                        break;
                    case 43:
                        i = indexCount2;
                        hdkgvrpn3dqhxuhxynoxmgd.V57tEvNfxZVVcOCAOih5PKr = typedArrayObtainStyledAttributes.getFloat(index2, hdkgvrpn3dqhxuhxynoxmgd.V57tEvNfxZVVcOCAOih5PKr);
                        continue;
                        i7++;
                        break;
                    case 44:
                        i = indexCount2;
                        bh916xnpuqyrtvypzq.KUYypEB4eNWOZWVDpH = true;
                        bh916xnpuqyrtvypzq.q1wNbhk2O6 = typedArrayObtainStyledAttributes.getDimension(index2, bh916xnpuqyrtvypzq.q1wNbhk2O6);
                        continue;
                        i7++;
                        break;
                    case 45:
                        i = indexCount2;
                        bh916xnpuqyrtvypzq.zzpBGItXfub0yWj = typedArrayObtainStyledAttributes.getFloat(index2, bh916xnpuqyrtvypzq.zzpBGItXfub0yWj);
                        continue;
                        i7++;
                        break;
                    case 46:
                        i = indexCount2;
                        bh916xnpuqyrtvypzq.V57tEvNfxZVVcOCAOih5PKr = typedArrayObtainStyledAttributes.getFloat(index2, bh916xnpuqyrtvypzq.V57tEvNfxZVVcOCAOih5PKr);
                        continue;
                        i7++;
                        break;
                    case 47:
                        i = indexCount2;
                        bh916xnpuqyrtvypzq.ZfQNn8hdWlEQ5cR94249PDsLR = typedArrayObtainStyledAttributes.getFloat(index2, bh916xnpuqyrtvypzq.ZfQNn8hdWlEQ5cR94249PDsLR);
                        continue;
                        i7++;
                        break;
                    case 48:
                        i = indexCount2;
                        bh916xnpuqyrtvypzq.LaeGQIruHQu81hfJldjMOQSVblH3x = typedArrayObtainStyledAttributes.getFloat(index2, bh916xnpuqyrtvypzq.LaeGQIruHQu81hfJldjMOQSVblH3x);
                        continue;
                        i7++;
                        break;
                    case 49:
                        i = indexCount2;
                        bh916xnpuqyrtvypzq.zIvmSL0wzmmKGc3X39b2Gw2mUGE = typedArrayObtainStyledAttributes.getDimension(index2, bh916xnpuqyrtvypzq.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
                        continue;
                        i7++;
                        break;
                    case 50:
                        i = indexCount2;
                        bh916xnpuqyrtvypzq.ZLZeBXTMq0zDztBxtRTuCHrapQ = typedArrayObtainStyledAttributes.getDimension(index2, bh916xnpuqyrtvypzq.ZLZeBXTMq0zDztBxtRTuCHrapQ);
                        continue;
                        i7++;
                        break;
                    case 51:
                        i = indexCount2;
                        bh916xnpuqyrtvypzq.GI83zq0G8e7zkn = typedArrayObtainStyledAttributes.getDimension(index2, bh916xnpuqyrtvypzq.GI83zq0G8e7zkn);
                        continue;
                        i7++;
                        break;
                    case 52:
                        i = indexCount2;
                        bh916xnpuqyrtvypzq.M9e7PWhFYLD2lOGMker = typedArrayObtainStyledAttributes.getDimension(index2, bh916xnpuqyrtvypzq.M9e7PWhFYLD2lOGMker);
                        continue;
                        i7++;
                        break;
                    case 53:
                        i = indexCount2;
                        bh916xnpuqyrtvypzq.HzCpKshMOoaw76hFcbOVRYMeRd = typedArrayObtainStyledAttributes.getDimension(index2, bh916xnpuqyrtvypzq.HzCpKshMOoaw76hFcbOVRYMeRd);
                        continue;
                        i7++;
                        break;
                    case 54:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.wdI7vzA3Qmcwd = typedArrayObtainStyledAttributes.getInt(index2, siyclbnoplkmtpckcsogx.wdI7vzA3Qmcwd);
                        continue;
                        i7++;
                        break;
                    case 55:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.KYZ9RyuOc42A2J = typedArrayObtainStyledAttributes.getInt(index2, siyclbnoplkmtpckcsogx.KYZ9RyuOc42A2J);
                        continue;
                        i7++;
                        break;
                    case 56:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.zOk739gUM7zIZC25HHUxoiyixWFjn = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, siyclbnoplkmtpckcsogx.zOk739gUM7zIZC25HHUxoiyixWFjn);
                        continue;
                        i7++;
                        break;
                    case 57:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.GE1sqSYiEYQO2ew7WEZwTtUeS5 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, siyclbnoplkmtpckcsogx.GE1sqSYiEYQO2ew7WEZwTtUeS5);
                        continue;
                        i7++;
                        break;
                    case 58:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.rERAmyEtGV6ANGszuKcQI = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, siyclbnoplkmtpckcsogx.rERAmyEtGV6ANGszuKcQI);
                        continue;
                        i7++;
                        break;
                    case 59:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.H2VFYNJEVGAX = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, siyclbnoplkmtpckcsogx.H2VFYNJEVGAX);
                        continue;
                        i7++;
                        break;
                    case 60:
                        i = indexCount2;
                        bh916xnpuqyrtvypzq.VxUQ9tBhpHJ2AAEDNW8sghc4m = typedArrayObtainStyledAttributes.getFloat(index2, bh916xnpuqyrtvypzq.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                        continue;
                        i7++;
                        break;
                    case 61:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.RhfGHxtXxy0M0grmp2jkRjQg = zIvmSL0wzmmKGc3X39b2Gw2mUGE(typedArrayObtainStyledAttributes, index2, siyclbnoplkmtpckcsogx.RhfGHxtXxy0M0grmp2jkRjQg);
                        continue;
                        i7++;
                        break;
                    case 62:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.qNPQb1obP7 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, siyclbnoplkmtpckcsogx.qNPQb1obP7);
                        continue;
                        i7++;
                        break;
                    case 63:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.SuB3hEmTmbbRGAhtvOOmfKEon = typedArrayObtainStyledAttributes.getFloat(index2, siyclbnoplkmtpckcsogx.SuB3hEmTmbbRGAhtvOOmfKEon);
                        continue;
                        i7++;
                        break;
                    case 64:
                        i = indexCount2;
                        wJZtWYAr4vKPgpkod.VxUQ9tBhpHJ2AAEDNW8sghc4m = zIvmSL0wzmmKGc3X39b2Gw2mUGE(typedArrayObtainStyledAttributes, index2, wJZtWYAr4vKPgpkod.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                        continue;
                        i7++;
                        break;
                    case 65:
                        i = indexCount2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            wJZtWYAr4vKPgpkod.getClass();
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            wJZtWYAr4vKPgpkod.getClass();
                            i7++;
                        }
                        break;
                    case 66:
                        i = indexCount2;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        wJZtWYAr4vKPgpkod.getClass();
                        continue;
                        i7++;
                        break;
                    case 67:
                        i = indexCount2;
                        wJZtWYAr4vKPgpkod.LaeGQIruHQu81hfJldjMOQSVblH3x = typedArrayObtainStyledAttributes.getFloat(index2, wJZtWYAr4vKPgpkod.LaeGQIruHQu81hfJldjMOQSVblH3x);
                        break;
                    case 68:
                        i = indexCount2;
                        hdkgvrpn3dqhxuhxynoxmgd.ZfQNn8hdWlEQ5cR94249PDsLR = typedArrayObtainStyledAttributes.getFloat(index2, hdkgvrpn3dqhxuhxynoxmgd.ZfQNn8hdWlEQ5cR94249PDsLR);
                        break;
                    case 69:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.Z1FjjMJ0suz8AFI7gsA4GDLMXv = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.bjhcQ0u7VT2OYYrwk96HrWoN = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.BJQHddi0Plr5ElWetCyaixWOg9 = typedArrayObtainStyledAttributes.getInt(index2, siyclbnoplkmtpckcsogx.BJQHddi0Plr5ElWetCyaixWOg9);
                        break;
                    case 73:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.tFRdVJAePmTx77bP7FAN0uI = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, siyclbnoplkmtpckcsogx.tFRdVJAePmTx77bP7FAN0uI);
                        break;
                    case 74:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.p6bBrs4p3Ly = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.ByTQIhgl7ezGvHXEd = typedArrayObtainStyledAttributes.getBoolean(index2, siyclbnoplkmtpckcsogx.ByTQIhgl7ezGvHXEd);
                        break;
                    case 76:
                        i = indexCount2;
                        wJZtWYAr4vKPgpkod.V57tEvNfxZVVcOCAOih5PKr = typedArrayObtainStyledAttributes.getInt(index2, wJZtWYAr4vKPgpkod.V57tEvNfxZVVcOCAOih5PKr);
                        break;
                    case 77:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.ubNpdCC1pl7L = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i = indexCount2;
                        hdkgvrpn3dqhxuhxynoxmgd.zzpBGItXfub0yWj = typedArrayObtainStyledAttributes.getInt(index2, hdkgvrpn3dqhxuhxynoxmgd.zzpBGItXfub0yWj);
                        break;
                    case 79:
                        i = indexCount2;
                        wJZtWYAr4vKPgpkod.ZfQNn8hdWlEQ5cR94249PDsLR = typedArrayObtainStyledAttributes.getFloat(index2, wJZtWYAr4vKPgpkod.ZfQNn8hdWlEQ5cR94249PDsLR);
                        break;
                    case 80:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.wR7sbzHKf9hYV1lxoS6nqyszepWvN = typedArrayObtainStyledAttributes.getBoolean(index2, siyclbnoplkmtpckcsogx.wR7sbzHKf9hYV1lxoS6nqyszepWvN);
                        break;
                    case 81:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.HAPpjhiCsV9ONY23505HCBI9IX = typedArrayObtainStyledAttributes.getBoolean(index2, siyclbnoplkmtpckcsogx.HAPpjhiCsV9ONY23505HCBI9IX);
                        break;
                    case 82:
                        i = indexCount2;
                        wJZtWYAr4vKPgpkod.zzpBGItXfub0yWj = typedArrayObtainStyledAttributes.getInteger(index2, wJZtWYAr4vKPgpkod.zzpBGItXfub0yWj);
                        break;
                    case 83:
                        i = indexCount2;
                        bh916xnpuqyrtvypzq.NSjgqmGjEzuugn2SsG1mZFP = zIvmSL0wzmmKGc3X39b2Gw2mUGE(typedArrayObtainStyledAttributes, index2, bh916xnpuqyrtvypzq.NSjgqmGjEzuugn2SsG1mZFP);
                        break;
                    case 84:
                        i = indexCount2;
                        wJZtWYAr4vKPgpkod.ZLZeBXTMq0zDztBxtRTuCHrapQ = typedArrayObtainStyledAttributes.getInteger(index2, wJZtWYAr4vKPgpkod.ZLZeBXTMq0zDztBxtRTuCHrapQ);
                        break;
                    case 85:
                        i = indexCount2;
                        wJZtWYAr4vKPgpkod.zIvmSL0wzmmKGc3X39b2Gw2mUGE = typedArrayObtainStyledAttributes.getFloat(index2, wJZtWYAr4vKPgpkod.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
                        break;
                    case 86:
                        i = indexCount2;
                        int i9 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i9 == 1) {
                            wJZtWYAr4vKPgpkod.GI83zq0G8e7zkn = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i9 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            wJZtWYAr4vKPgpkod.NSjgqmGjEzuugn2SsG1mZFP = string2;
                            if (string2.indexOf("/") > 0) {
                                wJZtWYAr4vKPgpkod.GI83zq0G8e7zkn = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, wJZtWYAr4vKPgpkod.GI83zq0G8e7zkn);
                        }
                        break;
                    case 87:
                        i = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 91:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.pYmKDYlAmhudp = zIvmSL0wzmmKGc3X39b2Gw2mUGE(typedArrayObtainStyledAttributes, index2, siyclbnoplkmtpckcsogx.pYmKDYlAmhudp);
                        break;
                    case 92:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.ko09zE6UAgwkV = zIvmSL0wzmmKGc3X39b2Gw2mUGE(typedArrayObtainStyledAttributes, index2, siyclbnoplkmtpckcsogx.ko09zE6UAgwkV);
                        break;
                    case 93:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.d9zDyyznnp3oaDT1Ug = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, siyclbnoplkmtpckcsogx.d9zDyyznnp3oaDT1Ug);
                        break;
                    case 94:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.lQ0rO9lhQIyVe7Rp6 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, siyclbnoplkmtpckcsogx.lQ0rO9lhQIyVe7Rp6);
                        break;
                    case 95:
                        i = indexCount2;
                        ZLZeBXTMq0zDztBxtRTuCHrapQ(siyclbnoplkmtpckcsogx, typedArrayObtainStyledAttributes, index2, 0);
                        continue;
                        i7++;
                        break;
                    case 96:
                        i = indexCount2;
                        ZLZeBXTMq0zDztBxtRTuCHrapQ(siyclbnoplkmtpckcsogx, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i = indexCount2;
                        siyclbnoplkmtpckcsogx.tpEo0fy9FaoJYrSFHRfIK6 = typedArrayObtainStyledAttributes.getInt(index2, siyclbnoplkmtpckcsogx.tpEo0fy9FaoJYrSFHRfIK6);
                        break;
                }
                i7++;
            }
            if (siyclbnoplkmtpckcsogx.p6bBrs4p3Ly != null) {
                siyclbnoplkmtpckcsogx.rE05n5RsRkyWKIeA9cmLXAKv4Hze = null;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return lofngUTEmVOfi2SbomD3ONlMmDH;
    }

    public static int zIvmSL0wzmmKGc3X39b2Gw2mUGE(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    public final void LaeGQIruHQu81hfJldjMOQSVblH3x(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    LofngUTEmVOfi2SbomD3ONlMmDH lofngUTEmVOfi2SbomD3ONlMmDHZfQNn8hdWlEQ5cR94249PDsLR = ZfQNn8hdWlEQ5cR94249PDsLR(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        lofngUTEmVOfi2SbomD3ONlMmDHZfQNn8hdWlEQ5cR94249PDsLR.ZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m = true;
                    }
                    this.V57tEvNfxZVVcOCAOih5PKr.put(Integer.valueOf(lofngUTEmVOfi2SbomD3ONlMmDHZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m), lofngUTEmVOfi2SbomD3ONlMmDHZfQNn8hdWlEQ5cR94249PDsLR);
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i;
        int i2;
        String str;
        HashMap map;
        String resourceEntryName;
        nUshirpmbH6saVf9I nushirpmbh6savf9i = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = nushirpmbh6savf9i.V57tEvNfxZVVcOCAOih5PKr;
        HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            int id = childAt.getId();
            if (!map2.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb.append(resourceEntryName);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (nushirpmbh6savf9i.zzpBGItXfub0yWj && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (map2.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        LofngUTEmVOfi2SbomD3ONlMmDH lofngUTEmVOfi2SbomD3ONlMmDH = (LofngUTEmVOfi2SbomD3ONlMmDH) map2.get(Integer.valueOf(id));
                        if (lofngUTEmVOfi2SbomD3ONlMmDH != null) {
                            hdKGVRpn3DqhXUHXyNOxMgD hdkgvrpn3dqhxuhxynoxmgd = lofngUTEmVOfi2SbomD3ONlMmDH.zzpBGItXfub0yWj;
                            siyClBnOpLkmTPckcsOgX siyclbnoplkmtpckcsogx = lofngUTEmVOfi2SbomD3ONlMmDH.ZfQNn8hdWlEQ5cR94249PDsLR;
                            bH916XNpUQyRtvyPZq bh916xnpuqyrtvypzq = lofngUTEmVOfi2SbomD3ONlMmDH.LaeGQIruHQu81hfJldjMOQSVblH3x;
                            if (childAt instanceof YFE9GC9U4ndsIRwhZC9xI1) {
                                siyclbnoplkmtpckcsogx.mhUCRR8ceqc7mAozW = 1;
                                YFE9GC9U4ndsIRwhZC9xI1 yFE9GC9U4ndsIRwhZC9xI1 = (YFE9GC9U4ndsIRwhZC9xI1) childAt;
                                yFE9GC9U4ndsIRwhZC9xI1.setId(id);
                                yFE9GC9U4ndsIRwhZC9xI1.setType(siyclbnoplkmtpckcsogx.BJQHddi0Plr5ElWetCyaixWOg9);
                                yFE9GC9U4ndsIRwhZC9xI1.setMargin(siyclbnoplkmtpckcsogx.tFRdVJAePmTx77bP7FAN0uI);
                                yFE9GC9U4ndsIRwhZC9xI1.setAllowsGoneWidget(siyclbnoplkmtpckcsogx.ByTQIhgl7ezGvHXEd);
                                int[] iArr = siyclbnoplkmtpckcsogx.rE05n5RsRkyWKIeA9cmLXAKv4Hze;
                                if (iArr != null) {
                                    yFE9GC9U4ndsIRwhZC9xI1.setReferencedIds(iArr);
                                } else {
                                    String str2 = siyclbnoplkmtpckcsogx.p6bBrs4p3Ly;
                                    if (str2 != null) {
                                        int[] iArrV57tEvNfxZVVcOCAOih5PKr = V57tEvNfxZVVcOCAOih5PKr(yFE9GC9U4ndsIRwhZC9xI1, str2);
                                        siyclbnoplkmtpckcsogx.rE05n5RsRkyWKIeA9cmLXAKv4Hze = iArrV57tEvNfxZVVcOCAOih5PKr;
                                        yFE9GC9U4ndsIRwhZC9xI1.setReferencedIds(iArrV57tEvNfxZVVcOCAOih5PKr);
                                    }
                                }
                            }
                            ZtjVvctVhW3SMibpO0L8oqBK ztjVvctVhW3SMibpO0L8oqBK = (ZtjVvctVhW3SMibpO0L8oqBK) childAt.getLayoutParams();
                            ztjVvctVhW3SMibpO0L8oqBK.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                            lofngUTEmVOfi2SbomD3ONlMmDH.VxUQ9tBhpHJ2AAEDNW8sghc4m(ztjVvctVhW3SMibpO0L8oqBK);
                            HashMap map3 = lofngUTEmVOfi2SbomD3ONlMmDH.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                            Class<?> cls = childAt.getClass();
                            for (String str3 : map3.keySet()) {
                                JgmHAQnVfjnEuZhzo2mto jgmHAQnVfjnEuZhzo2mto = (JgmHAQnVfjnEuZhzo2mto) map3.get(str3);
                                HashSet hashSet3 = hashSet2;
                                if (jgmHAQnVfjnEuZhzo2mto.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
                                    i2 = i3;
                                    str = str3;
                                } else {
                                    i2 = i3;
                                    str = "set" + str3;
                                }
                                try {
                                    int iH3jnZRsdwYJfY9UhQCkbvWciwvFHv = u9SlVAuoWhQUfJ.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(jgmHAQnVfjnEuZhzo2mto.zzpBGItXfub0yWj);
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (iH3jnZRsdwYJfY9UhQCkbvWciwvFHv) {
                                        case 0:
                                            map = map3;
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(jgmHAQnVfjnEuZhzo2mto.V57tEvNfxZVVcOCAOih5PKr));
                                            break;
                                        case 1:
                                            map = map3;
                                            cls.getMethod(str, cls2).invoke(childAt, Float.valueOf(jgmHAQnVfjnEuZhzo2mto.ZfQNn8hdWlEQ5cR94249PDsLR));
                                            break;
                                        case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                                            map = map3;
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(jgmHAQnVfjnEuZhzo2mto.ZLZeBXTMq0zDztBxtRTuCHrapQ));
                                            break;
                                        case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                                            Method method = cls.getMethod(str, Drawable.class);
                                            map = map3;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(jgmHAQnVfjnEuZhzo2mto.ZLZeBXTMq0zDztBxtRTuCHrapQ);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e) {
                                                e = e;
                                                StringBuilder sbKUYypEB4eNWOZWVDpH = u9SlVAuoWhQUfJ.KUYypEB4eNWOZWVDpH(" Custom Attribute \"", str3, "\" not found on ");
                                                sbKUYypEB4eNWOZWVDpH.append(cls.getName());
                                                Log.e("TransitionLayout", sbKUYypEB4eNWOZWVDpH.toString(), e);
                                            } catch (NoSuchMethodException e2) {
                                                e = e2;
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e);
                                            } catch (InvocationTargetException e3) {
                                                e = e3;
                                                StringBuilder sbKUYypEB4eNWOZWVDpH2 = u9SlVAuoWhQUfJ.KUYypEB4eNWOZWVDpH(" Custom Attribute \"", str3, "\" not found on ");
                                                sbKUYypEB4eNWOZWVDpH2.append(cls.getName());
                                                Log.e("TransitionLayout", sbKUYypEB4eNWOZWVDpH2.toString(), e);
                                            }
                                            break;
                                        case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                                            cls.getMethod(str, CharSequence.class).invoke(childAt, jgmHAQnVfjnEuZhzo2mto.LaeGQIruHQu81hfJldjMOQSVblH3x);
                                            map = map3;
                                            break;
                                        case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_FIELD_NUMBER /* 5 */:
                                            cls.getMethod(str, Boolean.TYPE).invoke(childAt, Boolean.valueOf(jgmHAQnVfjnEuZhzo2mto.zIvmSL0wzmmKGc3X39b2Gw2mUGE));
                                            map = map3;
                                            break;
                                        case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_SET_FIELD_NUMBER /* 6 */:
                                            cls.getMethod(str, cls2).invoke(childAt, Float.valueOf(jgmHAQnVfjnEuZhzo2mto.ZfQNn8hdWlEQ5cR94249PDsLR));
                                            map = map3;
                                            break;
                                        case g8kevnL6UKpr15IYtcPJXuLo1L4.DOUBLE_FIELD_NUMBER /* 7 */:
                                            cls.getMethod(str, cls3).invoke(childAt, Integer.valueOf(jgmHAQnVfjnEuZhzo2mto.V57tEvNfxZVVcOCAOih5PKr));
                                            map = map3;
                                            break;
                                        default:
                                            map = map3;
                                            break;
                                    }
                                } catch (IllegalAccessException e4) {
                                    e = e4;
                                    map = map3;
                                } catch (NoSuchMethodException e5) {
                                    e = e5;
                                    map = map3;
                                } catch (InvocationTargetException e6) {
                                    e = e6;
                                    map = map3;
                                }
                                hashSet2 = hashSet3;
                                i3 = i2;
                                map3 = map;
                            }
                            hashSet = hashSet2;
                            i = i3;
                            childAt.setLayoutParams(ztjVvctVhW3SMibpO0L8oqBK);
                            if (hdkgvrpn3dqhxuhxynoxmgd.zzpBGItXfub0yWj == 0) {
                                childAt.setVisibility(hdkgvrpn3dqhxuhxynoxmgd.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                            }
                            childAt.setAlpha(hdkgvrpn3dqhxuhxynoxmgd.V57tEvNfxZVVcOCAOih5PKr);
                            childAt.setRotation(bh916xnpuqyrtvypzq.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                            childAt.setRotationX(bh916xnpuqyrtvypzq.zzpBGItXfub0yWj);
                            childAt.setRotationY(bh916xnpuqyrtvypzq.V57tEvNfxZVVcOCAOih5PKr);
                            childAt.setScaleX(bh916xnpuqyrtvypzq.ZfQNn8hdWlEQ5cR94249PDsLR);
                            childAt.setScaleY(bh916xnpuqyrtvypzq.LaeGQIruHQu81hfJldjMOQSVblH3x);
                            if (bh916xnpuqyrtvypzq.NSjgqmGjEzuugn2SsG1mZFP != -1) {
                                if (((View) childAt.getParent()).findViewById(bh916xnpuqyrtvypzq.NSjgqmGjEzuugn2SsG1mZFP) != null) {
                                    float bottom = (r0.getBottom() + r0.getTop()) / 2.0f;
                                    float right = (r0.getRight() + r0.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(bh916xnpuqyrtvypzq.zIvmSL0wzmmKGc3X39b2Gw2mUGE)) {
                                    childAt.setPivotX(bh916xnpuqyrtvypzq.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
                                }
                                if (!Float.isNaN(bh916xnpuqyrtvypzq.ZLZeBXTMq0zDztBxtRTuCHrapQ)) {
                                    childAt.setPivotY(bh916xnpuqyrtvypzq.ZLZeBXTMq0zDztBxtRTuCHrapQ);
                                }
                            }
                            childAt.setTranslationX(bh916xnpuqyrtvypzq.GI83zq0G8e7zkn);
                            childAt.setTranslationY(bh916xnpuqyrtvypzq.M9e7PWhFYLD2lOGMker);
                            childAt.setTranslationZ(bh916xnpuqyrtvypzq.HzCpKshMOoaw76hFcbOVRYMeRd);
                            if (bh916xnpuqyrtvypzq.KUYypEB4eNWOZWVDpH) {
                                childAt.setElevation(bh916xnpuqyrtvypzq.q1wNbhk2O6);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i = i3;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
                i3 = i + 1;
                nushirpmbh6savf9i = this;
                hashSet2 = hashSet;
            }
            hashSet = hashSet2;
            i = i3;
            i3 = i + 1;
            nushirpmbh6savf9i = this;
            hashSet2 = hashSet;
        }
        for (Integer num : hashSet2) {
            LofngUTEmVOfi2SbomD3ONlMmDH lofngUTEmVOfi2SbomD3ONlMmDH2 = (LofngUTEmVOfi2SbomD3ONlMmDH) map2.get(num);
            if (lofngUTEmVOfi2SbomD3ONlMmDH2 != null) {
                siyClBnOpLkmTPckcsOgX siyclbnoplkmtpckcsogx2 = lofngUTEmVOfi2SbomD3ONlMmDH2.ZfQNn8hdWlEQ5cR94249PDsLR;
                if (siyclbnoplkmtpckcsogx2.mhUCRR8ceqc7mAozW == 1) {
                    Context context = constraintLayout.getContext();
                    YFE9GC9U4ndsIRwhZC9xI1 yFE9GC9U4ndsIRwhZC9xI12 = new YFE9GC9U4ndsIRwhZC9xI1(context);
                    yFE9GC9U4ndsIRwhZC9xI12.V57tEvNfxZVVcOCAOih5PKr = new int[32];
                    yFE9GC9U4ndsIRwhZC9xI12.GI83zq0G8e7zkn = new HashMap();
                    yFE9GC9U4ndsIRwhZC9xI12.LaeGQIruHQu81hfJldjMOQSVblH3x = context;
                    PJtsuaigmVZElwy04tnlV pJtsuaigmVZElwy04tnlV = new PJtsuaigmVZElwy04tnlV();
                    pJtsuaigmVZElwy04tnlV.lxWWbfAOLs4jWzd7PSIiIJ = 0;
                    pJtsuaigmVZElwy04tnlV.VOvSEdhaZyc0oOGQ8 = true;
                    pJtsuaigmVZElwy04tnlV.h2b7InwIaORKN91X7whfQh4 = 0;
                    pJtsuaigmVZElwy04tnlV.r0dB0ojIy6g8mnk1 = false;
                    yFE9GC9U4ndsIRwhZC9xI12.KUYypEB4eNWOZWVDpH = pJtsuaigmVZElwy04tnlV;
                    yFE9GC9U4ndsIRwhZC9xI12.zIvmSL0wzmmKGc3X39b2Gw2mUGE = pJtsuaigmVZElwy04tnlV;
                    yFE9GC9U4ndsIRwhZC9xI12.GI83zq0G8e7zkn();
                    yFE9GC9U4ndsIRwhZC9xI12.setVisibility(8);
                    yFE9GC9U4ndsIRwhZC9xI12.setId(num.intValue());
                    int[] iArr2 = siyclbnoplkmtpckcsogx2.rE05n5RsRkyWKIeA9cmLXAKv4Hze;
                    if (iArr2 != null) {
                        yFE9GC9U4ndsIRwhZC9xI12.setReferencedIds(iArr2);
                    } else {
                        String str4 = siyclbnoplkmtpckcsogx2.p6bBrs4p3Ly;
                        if (str4 != null) {
                            int[] iArrV57tEvNfxZVVcOCAOih5PKr2 = V57tEvNfxZVVcOCAOih5PKr(yFE9GC9U4ndsIRwhZC9xI12, str4);
                            siyclbnoplkmtpckcsogx2.rE05n5RsRkyWKIeA9cmLXAKv4Hze = iArrV57tEvNfxZVVcOCAOih5PKr2;
                            yFE9GC9U4ndsIRwhZC9xI12.setReferencedIds(iArrV57tEvNfxZVVcOCAOih5PKr2);
                        }
                    }
                    yFE9GC9U4ndsIRwhZC9xI12.setType(siyclbnoplkmtpckcsogx2.BJQHddi0Plr5ElWetCyaixWOg9);
                    yFE9GC9U4ndsIRwhZC9xI12.setMargin(siyclbnoplkmtpckcsogx2.tFRdVJAePmTx77bP7FAN0uI);
                    ZtjVvctVhW3SMibpO0L8oqBK ztjVvctVhW3SMibpO0L8oqBKZLZeBXTMq0zDztBxtRTuCHrapQ = ConstraintLayout.ZLZeBXTMq0zDztBxtRTuCHrapQ();
                    yFE9GC9U4ndsIRwhZC9xI12.GI83zq0G8e7zkn();
                    lofngUTEmVOfi2SbomD3ONlMmDH2.VxUQ9tBhpHJ2AAEDNW8sghc4m(ztjVvctVhW3SMibpO0L8oqBKZLZeBXTMq0zDztBxtRTuCHrapQ);
                    constraintLayout.addView(yFE9GC9U4ndsIRwhZC9xI12, ztjVvctVhW3SMibpO0L8oqBKZLZeBXTMq0zDztBxtRTuCHrapQ);
                }
                if (siyclbnoplkmtpckcsogx2.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
                    View yvuhriuajhqpy = new yVuHRiUaJhQPY(constraintLayout.getContext());
                    yvuhriuajhqpy.setId(num.intValue());
                    ZtjVvctVhW3SMibpO0L8oqBK ztjVvctVhW3SMibpO0L8oqBKZLZeBXTMq0zDztBxtRTuCHrapQ2 = ConstraintLayout.ZLZeBXTMq0zDztBxtRTuCHrapQ();
                    lofngUTEmVOfi2SbomD3ONlMmDH2.VxUQ9tBhpHJ2AAEDNW8sghc4m(ztjVvctVhW3SMibpO0L8oqBKZLZeBXTMq0zDztBxtRTuCHrapQ2);
                    constraintLayout.addView(yvuhriuajhqpy, ztjVvctVhW3SMibpO0L8oqBKZLZeBXTMq0zDztBxtRTuCHrapQ2);
                }
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = constraintLayout.getChildAt(i4);
            if (childAt2 instanceof HnVNsdy3Lwin5xfqq) {
                ((HnVNsdy3Lwin5xfqq) childAt2).LaeGQIruHQu81hfJldjMOQSVblH3x(constraintLayout);
            }
        }
    }

    public final void zzpBGItXfub0yWj(ConstraintLayout constraintLayout) {
        int i;
        HashMap map;
        int i2;
        nUshirpmbH6saVf9I nushirpmbh6savf9i = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = nushirpmbh6savf9i.V57tEvNfxZVVcOCAOih5PKr;
        map2.clear();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            ZtjVvctVhW3SMibpO0L8oqBK ztjVvctVhW3SMibpO0L8oqBK = (ZtjVvctVhW3SMibpO0L8oqBK) childAt.getLayoutParams();
            int id = childAt.getId();
            if (nushirpmbh6savf9i.zzpBGItXfub0yWj && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map2.containsKey(Integer.valueOf(id))) {
                map2.put(Integer.valueOf(id), new LofngUTEmVOfi2SbomD3ONlMmDH());
            }
            LofngUTEmVOfi2SbomD3ONlMmDH lofngUTEmVOfi2SbomD3ONlMmDH = (LofngUTEmVOfi2SbomD3ONlMmDH) map2.get(Integer.valueOf(id));
            if (lofngUTEmVOfi2SbomD3ONlMmDH == null) {
                i = childCount;
                map = map2;
                i2 = i3;
            } else {
                hdKGVRpn3DqhXUHXyNOxMgD hdkgvrpn3dqhxuhxynoxmgd = lofngUTEmVOfi2SbomD3ONlMmDH.zzpBGItXfub0yWj;
                siyClBnOpLkmTPckcsOgX siyclbnoplkmtpckcsogx = lofngUTEmVOfi2SbomD3ONlMmDH.ZfQNn8hdWlEQ5cR94249PDsLR;
                bH916XNpUQyRtvyPZq bh916xnpuqyrtvypzq = lofngUTEmVOfi2SbomD3ONlMmDH.LaeGQIruHQu81hfJldjMOQSVblH3x;
                i = childCount;
                HashMap map3 = new HashMap();
                map = map2;
                Class<?> cls = childAt.getClass();
                i2 = i3;
                HashMap map4 = nushirpmbh6savf9i.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                for (String str : map4.keySet()) {
                    JgmHAQnVfjnEuZhzo2mto jgmHAQnVfjnEuZhzo2mto = (JgmHAQnVfjnEuZhzo2mto) map4.get(str);
                    HashMap map5 = map4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new JgmHAQnVfjnEuZhzo2mto(jgmHAQnVfjnEuZhzo2mto, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            map3.put(str, new JgmHAQnVfjnEuZhzo2mto(jgmHAQnVfjnEuZhzo2mto, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e) {
                        StringBuilder sbKUYypEB4eNWOZWVDpH = u9SlVAuoWhQUfJ.KUYypEB4eNWOZWVDpH(" Custom Attribute \"", str, "\" not found on ");
                        sbKUYypEB4eNWOZWVDpH.append(cls.getName());
                        Log.e("TransitionLayout", sbKUYypEB4eNWOZWVDpH.toString(), e);
                    } catch (NoSuchMethodException e2) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e2);
                    } catch (InvocationTargetException e3) {
                        StringBuilder sbKUYypEB4eNWOZWVDpH2 = u9SlVAuoWhQUfJ.KUYypEB4eNWOZWVDpH(" Custom Attribute \"", str, "\" not found on ");
                        sbKUYypEB4eNWOZWVDpH2.append(cls.getName());
                        Log.e("TransitionLayout", sbKUYypEB4eNWOZWVDpH2.toString(), e3);
                    }
                    map4 = map5;
                }
                lofngUTEmVOfi2SbomD3ONlMmDH.zIvmSL0wzmmKGc3X39b2Gw2mUGE = map3;
                lofngUTEmVOfi2SbomD3ONlMmDH.VxUQ9tBhpHJ2AAEDNW8sghc4m = id;
                siyclbnoplkmtpckcsogx.NSjgqmGjEzuugn2SsG1mZFP = ztjVvctVhW3SMibpO0L8oqBK.LaeGQIruHQu81hfJldjMOQSVblH3x;
                siyclbnoplkmtpckcsogx.GI83zq0G8e7zkn = ztjVvctVhW3SMibpO0L8oqBK.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                siyclbnoplkmtpckcsogx.M9e7PWhFYLD2lOGMker = ztjVvctVhW3SMibpO0L8oqBK.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                siyclbnoplkmtpckcsogx.HzCpKshMOoaw76hFcbOVRYMeRd = ztjVvctVhW3SMibpO0L8oqBK.NSjgqmGjEzuugn2SsG1mZFP;
                siyclbnoplkmtpckcsogx.KUYypEB4eNWOZWVDpH = ztjVvctVhW3SMibpO0L8oqBK.GI83zq0G8e7zkn;
                siyclbnoplkmtpckcsogx.q1wNbhk2O6 = ztjVvctVhW3SMibpO0L8oqBK.M9e7PWhFYLD2lOGMker;
                siyclbnoplkmtpckcsogx.p59rPv72J9 = ztjVvctVhW3SMibpO0L8oqBK.HzCpKshMOoaw76hFcbOVRYMeRd;
                siyclbnoplkmtpckcsogx.Ca81ebIan1u = ztjVvctVhW3SMibpO0L8oqBK.KUYypEB4eNWOZWVDpH;
                siyclbnoplkmtpckcsogx.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = ztjVvctVhW3SMibpO0L8oqBK.q1wNbhk2O6;
                siyclbnoplkmtpckcsogx.pYmKDYlAmhudp = ztjVvctVhW3SMibpO0L8oqBK.p59rPv72J9;
                siyclbnoplkmtpckcsogx.ko09zE6UAgwkV = ztjVvctVhW3SMibpO0L8oqBK.Ca81ebIan1u;
                siyclbnoplkmtpckcsogx.jW7EiD0YL6xkbB158jMUzhWNWb1y = ztjVvctVhW3SMibpO0L8oqBK.jW7EiD0YL6xkbB158jMUzhWNWb1y;
                siyclbnoplkmtpckcsogx.f6ZQsR6bPLvvCDNXOUc = ztjVvctVhW3SMibpO0L8oqBK.f6ZQsR6bPLvvCDNXOUc;
                siyclbnoplkmtpckcsogx.vBGA6pPLqSMuYGvprl270j7 = ztjVvctVhW3SMibpO0L8oqBK.vBGA6pPLqSMuYGvprl270j7;
                siyclbnoplkmtpckcsogx.TaDO7ogis3aEiWEtq = ztjVvctVhW3SMibpO0L8oqBK.TaDO7ogis3aEiWEtq;
                siyclbnoplkmtpckcsogx.Irh5auREsoeV1C1RaBamlmy = ztjVvctVhW3SMibpO0L8oqBK.vE4yDIjexsP2lGjLaTcB;
                siyclbnoplkmtpckcsogx.q11o1hieEkZDhF1MGOZI26oZiDT = ztjVvctVhW3SMibpO0L8oqBK.O1xDAlBZZlZdoEf747lCFHld;
                siyclbnoplkmtpckcsogx.w0Wu95l8dVNw5rZMRu = ztjVvctVhW3SMibpO0L8oqBK.HVEwbdULInpTNa0IG;
                siyclbnoplkmtpckcsogx.RhfGHxtXxy0M0grmp2jkRjQg = ztjVvctVhW3SMibpO0L8oqBK.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
                siyclbnoplkmtpckcsogx.qNPQb1obP7 = ztjVvctVhW3SMibpO0L8oqBK.pYmKDYlAmhudp;
                siyclbnoplkmtpckcsogx.SuB3hEmTmbbRGAhtvOOmfKEon = ztjVvctVhW3SMibpO0L8oqBK.ko09zE6UAgwkV;
                siyclbnoplkmtpckcsogx.pzqP2AqKW6J5PO8zCKnW = ztjVvctVhW3SMibpO0L8oqBK.JUdwvN8LfOMa;
                siyclbnoplkmtpckcsogx.aXO0LSrt8bKV = ztjVvctVhW3SMibpO0L8oqBK.ItrQwCXbty5PZtje5JS;
                siyclbnoplkmtpckcsogx.vE4yDIjexsP2lGjLaTcB = ztjVvctVhW3SMibpO0L8oqBK.hKs1wlZyvtUNaW1f5ABIGacfPcvX;
                siyclbnoplkmtpckcsogx.zIvmSL0wzmmKGc3X39b2Gw2mUGE = ztjVvctVhW3SMibpO0L8oqBK.V57tEvNfxZVVcOCAOih5PKr;
                siyclbnoplkmtpckcsogx.ZfQNn8hdWlEQ5cR94249PDsLR = ztjVvctVhW3SMibpO0L8oqBK.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                siyclbnoplkmtpckcsogx.LaeGQIruHQu81hfJldjMOQSVblH3x = ztjVvctVhW3SMibpO0L8oqBK.zzpBGItXfub0yWj;
                siyclbnoplkmtpckcsogx.zzpBGItXfub0yWj = ((ViewGroup.MarginLayoutParams) ztjVvctVhW3SMibpO0L8oqBK).width;
                siyclbnoplkmtpckcsogx.V57tEvNfxZVVcOCAOih5PKr = ((ViewGroup.MarginLayoutParams) ztjVvctVhW3SMibpO0L8oqBK).height;
                siyclbnoplkmtpckcsogx.O1xDAlBZZlZdoEf747lCFHld = ((ViewGroup.MarginLayoutParams) ztjVvctVhW3SMibpO0L8oqBK).leftMargin;
                siyclbnoplkmtpckcsogx.HVEwbdULInpTNa0IG = ((ViewGroup.MarginLayoutParams) ztjVvctVhW3SMibpO0L8oqBK).rightMargin;
                siyclbnoplkmtpckcsogx.y1NaPKTl7R18DOr6e8i5 = ((ViewGroup.MarginLayoutParams) ztjVvctVhW3SMibpO0L8oqBK).topMargin;
                siyclbnoplkmtpckcsogx.qygqjTppWwx992 = ((ViewGroup.MarginLayoutParams) ztjVvctVhW3SMibpO0L8oqBK).bottomMargin;
                siyclbnoplkmtpckcsogx.d9zDyyznnp3oaDT1Ug = ztjVvctVhW3SMibpO0L8oqBK.aXO0LSrt8bKV;
                siyclbnoplkmtpckcsogx.JUdwvN8LfOMa = ztjVvctVhW3SMibpO0L8oqBK.qygqjTppWwx992;
                siyclbnoplkmtpckcsogx.ItrQwCXbty5PZtje5JS = ztjVvctVhW3SMibpO0L8oqBK.y1NaPKTl7R18DOr6e8i5;
                siyclbnoplkmtpckcsogx.vXWl0o6I4U59CgHs9 = ztjVvctVhW3SMibpO0L8oqBK.TqcnImqkSWIKht;
                siyclbnoplkmtpckcsogx.hKs1wlZyvtUNaW1f5ABIGacfPcvX = ztjVvctVhW3SMibpO0L8oqBK.iKANjmyTSxO6v6UuLPdu7DxOjlS;
                siyclbnoplkmtpckcsogx.wR7sbzHKf9hYV1lxoS6nqyszepWvN = ztjVvctVhW3SMibpO0L8oqBK.vXWl0o6I4U59CgHs9;
                siyclbnoplkmtpckcsogx.HAPpjhiCsV9ONY23505HCBI9IX = ztjVvctVhW3SMibpO0L8oqBK.wdI7vzA3Qmcwd;
                siyclbnoplkmtpckcsogx.wdI7vzA3Qmcwd = ztjVvctVhW3SMibpO0L8oqBK.d9zDyyznnp3oaDT1Ug;
                siyclbnoplkmtpckcsogx.KYZ9RyuOc42A2J = ztjVvctVhW3SMibpO0L8oqBK.CixTK5ZX8oWXHz34qHYV;
                siyclbnoplkmtpckcsogx.zOk739gUM7zIZC25HHUxoiyixWFjn = ztjVvctVhW3SMibpO0L8oqBK.wRCD0SdqWCowdYU7bmzN;
                siyclbnoplkmtpckcsogx.GE1sqSYiEYQO2ew7WEZwTtUeS5 = ztjVvctVhW3SMibpO0L8oqBK.gBaBUmihn5l4u;
                siyclbnoplkmtpckcsogx.rERAmyEtGV6ANGszuKcQI = ztjVvctVhW3SMibpO0L8oqBK.ymT6yQrus3w;
                siyclbnoplkmtpckcsogx.H2VFYNJEVGAX = ztjVvctVhW3SMibpO0L8oqBK.YdNRGRc4rly;
                siyclbnoplkmtpckcsogx.Z1FjjMJ0suz8AFI7gsA4GDLMXv = ztjVvctVhW3SMibpO0L8oqBK.L8DMw02rUTs2w;
                siyclbnoplkmtpckcsogx.bjhcQ0u7VT2OYYrwk96HrWoN = ztjVvctVhW3SMibpO0L8oqBK.lQ0rO9lhQIyVe7Rp6;
                siyclbnoplkmtpckcsogx.ubNpdCC1pl7L = ztjVvctVhW3SMibpO0L8oqBK.KYZ9RyuOc42A2J;
                siyclbnoplkmtpckcsogx.ymT6yQrus3w = ztjVvctVhW3SMibpO0L8oqBK.q11o1hieEkZDhF1MGOZI26oZiDT;
                siyclbnoplkmtpckcsogx.wRCD0SdqWCowdYU7bmzN = ztjVvctVhW3SMibpO0L8oqBK.RhfGHxtXxy0M0grmp2jkRjQg;
                siyclbnoplkmtpckcsogx.CixTK5ZX8oWXHz34qHYV = ztjVvctVhW3SMibpO0L8oqBK.Irh5auREsoeV1C1RaBamlmy;
                siyclbnoplkmtpckcsogx.YdNRGRc4rly = ztjVvctVhW3SMibpO0L8oqBK.w0Wu95l8dVNw5rZMRu;
                siyclbnoplkmtpckcsogx.L8DMw02rUTs2w = ztjVvctVhW3SMibpO0L8oqBK.qNPQb1obP7;
                siyclbnoplkmtpckcsogx.gBaBUmihn5l4u = ztjVvctVhW3SMibpO0L8oqBK.SuB3hEmTmbbRGAhtvOOmfKEon;
                siyclbnoplkmtpckcsogx.lQ0rO9lhQIyVe7Rp6 = ztjVvctVhW3SMibpO0L8oqBK.pzqP2AqKW6J5PO8zCKnW;
                siyclbnoplkmtpckcsogx.tpEo0fy9FaoJYrSFHRfIK6 = ztjVvctVhW3SMibpO0L8oqBK.zOk739gUM7zIZC25HHUxoiyixWFjn;
                siyclbnoplkmtpckcsogx.iKANjmyTSxO6v6UuLPdu7DxOjlS = ztjVvctVhW3SMibpO0L8oqBK.getMarginEnd();
                siyclbnoplkmtpckcsogx.TqcnImqkSWIKht = ztjVvctVhW3SMibpO0L8oqBK.getMarginStart();
                hdkgvrpn3dqhxuhxynoxmgd.VxUQ9tBhpHJ2AAEDNW8sghc4m = childAt.getVisibility();
                hdkgvrpn3dqhxuhxynoxmgd.V57tEvNfxZVVcOCAOih5PKr = childAt.getAlpha();
                bh916xnpuqyrtvypzq.VxUQ9tBhpHJ2AAEDNW8sghc4m = childAt.getRotation();
                bh916xnpuqyrtvypzq.zzpBGItXfub0yWj = childAt.getRotationX();
                bh916xnpuqyrtvypzq.V57tEvNfxZVVcOCAOih5PKr = childAt.getRotationY();
                bh916xnpuqyrtvypzq.ZfQNn8hdWlEQ5cR94249PDsLR = childAt.getScaleX();
                bh916xnpuqyrtvypzq.LaeGQIruHQu81hfJldjMOQSVblH3x = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    bh916xnpuqyrtvypzq.zIvmSL0wzmmKGc3X39b2Gw2mUGE = pivotX;
                    bh916xnpuqyrtvypzq.ZLZeBXTMq0zDztBxtRTuCHrapQ = pivotY;
                }
                bh916xnpuqyrtvypzq.GI83zq0G8e7zkn = childAt.getTranslationX();
                bh916xnpuqyrtvypzq.M9e7PWhFYLD2lOGMker = childAt.getTranslationY();
                bh916xnpuqyrtvypzq.HzCpKshMOoaw76hFcbOVRYMeRd = childAt.getTranslationZ();
                if (bh916xnpuqyrtvypzq.KUYypEB4eNWOZWVDpH) {
                    bh916xnpuqyrtvypzq.q1wNbhk2O6 = childAt.getElevation();
                }
                if (childAt instanceof YFE9GC9U4ndsIRwhZC9xI1) {
                    YFE9GC9U4ndsIRwhZC9xI1 yFE9GC9U4ndsIRwhZC9xI1 = (YFE9GC9U4ndsIRwhZC9xI1) childAt;
                    siyclbnoplkmtpckcsogx.ByTQIhgl7ezGvHXEd = yFE9GC9U4ndsIRwhZC9xI1.getAllowsGoneWidget();
                    siyclbnoplkmtpckcsogx.rE05n5RsRkyWKIeA9cmLXAKv4Hze = yFE9GC9U4ndsIRwhZC9xI1.getReferencedIds();
                    siyclbnoplkmtpckcsogx.BJQHddi0Plr5ElWetCyaixWOg9 = yFE9GC9U4ndsIRwhZC9xI1.getType();
                    siyclbnoplkmtpckcsogx.tFRdVJAePmTx77bP7FAN0uI = yFE9GC9U4ndsIRwhZC9xI1.getMargin();
                }
            }
            i3 = i2 + 1;
            nushirpmbh6savf9i = this;
            childCount = i;
            map2 = map;
        }
    }
}
