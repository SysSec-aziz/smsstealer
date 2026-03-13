package com.vdodsodjsdt;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class Zu5J9WNKih9fC4AtKCn extends F44whnLsbQ {
    public static int tpEo0fy9FaoJYrSFHRfIK6(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    public static Font wR7sbzHKf9hYV1lxoS6nqyszepWvN(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iTpEo0fy9FaoJYrSFHRfIK6 = tpEo0fy9FaoJYrSFHRfIK6(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iTpEo0fy9FaoJYrSFHRfIK62 = tpEo0fy9FaoJYrSFHRfIK6(fontStyle, font2.getStyle());
            if (iTpEo0fy9FaoJYrSFHRfIK62 < iTpEo0fy9FaoJYrSFHRfIK6) {
                font = font2;
                iTpEo0fy9FaoJYrSFHRfIK6 = iTpEo0fy9FaoJYrSFHRfIK62;
            }
        }
        return font;
    }

    public Font ByTQIhgl7ezGvHXEd(j5O1PfCuTxZKdtuvF7 j5o1pfcutxzkdtuvf7) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    public final FontFamily HAPpjhiCsV9ONY23505HCBI9IX(j5O1PfCuTxZKdtuvF7[] j5o1pfcutxzkdtuvf7Arr, ContentResolver contentResolver) {
        Font fontBuild;
        String str;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FontFamily.Builder builder = null;
        for (j5O1PfCuTxZKdtuvF7 j5o1pfcutxzkdtuvf7 : j5o1pfcutxzkdtuvf7Arr) {
            if (Objects.equals(j5o1pfcutxzkdtuvf7.VxUQ9tBhpHJ2AAEDNW8sghc4m.getScheme(), "systemfont")) {
                fontBuild = ByTQIhgl7ezGvHXEd(j5o1pfcutxzkdtuvf7);
            } else {
                try {
                    Uri uri = j5o1pfcutxzkdtuvf7.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    str = j5o1pfcutxzkdtuvf7.LaeGQIruHQu81hfJldjMOQSVblH3x;
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException e) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                    fontBuild = null;
                }
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    fontBuild = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(j5o1pfcutxzkdtuvf7.V57tEvNfxZVVcOCAOih5PKr).setSlant(j5o1pfcutxzkdtuvf7.ZfQNn8hdWlEQ5cR94249PDsLR ? 1 : 0).setTtcIndex(j5o1pfcutxzkdtuvf7.zzpBGItXfub0yWj);
                        if (!TextUtils.isEmpty(str)) {
                            ttcIndex.setFontVariationSettings(str);
                        }
                        fontBuild = ttcIndex.build();
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    @Override // com.vdodsodjsdt.F44whnLsbQ
    public final Typeface HzCpKshMOoaw76hFcbOVRYMeRd(Context context, j5O1PfCuTxZKdtuvF7[] j5o1pfcutxzkdtuvf7Arr, int i) {
        try {
            FontFamily fontFamilyHAPpjhiCsV9ONY23505HCBI9IX = HAPpjhiCsV9ONY23505HCBI9IX(j5o1pfcutxzkdtuvf7Arr, context.getContentResolver());
            if (fontFamilyHAPpjhiCsV9ONY23505HCBI9IX == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyHAPpjhiCsV9ONY23505HCBI9IX).setStyle(wR7sbzHKf9hYV1lxoS6nqyszepWvN(fontFamilyHAPpjhiCsV9ONY23505HCBI9IX, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // com.vdodsodjsdt.F44whnLsbQ
    public final Typeface KUYypEB4eNWOZWVDpH(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyHAPpjhiCsV9ONY23505HCBI9IX = HAPpjhiCsV9ONY23505HCBI9IX((j5O1PfCuTxZKdtuvF7[]) list.get(0), contentResolver);
            if (fontFamilyHAPpjhiCsV9ONY23505HCBI9IX == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyHAPpjhiCsV9ONY23505HCBI9IX);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily fontFamilyHAPpjhiCsV9ONY23505HCBI9IX2 = HAPpjhiCsV9ONY23505HCBI9IX((j5O1PfCuTxZKdtuvF7[]) list.get(i2), contentResolver);
                if (fontFamilyHAPpjhiCsV9ONY23505HCBI9IX2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyHAPpjhiCsV9ONY23505HCBI9IX2);
                }
            }
            return customFallbackBuilder.setStyle(wR7sbzHKf9hYV1lxoS6nqyszepWvN(fontFamilyHAPpjhiCsV9ONY23505HCBI9IX, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // com.vdodsodjsdt.F44whnLsbQ
    public final Typeface M9e7PWhFYLD2lOGMker(Context context, NEoz7FxOyLX3r49rfTBZNOYjpdY5x nEoz7FxOyLX3r49rfTBZNOYjpdY5x, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (lg8An0fK4MQzMPmeENxB1c lg8an0fk4mqzmpmeenxb1c : nEoz7FxOyLX3r49rfTBZNOYjpdY5x.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
                try {
                    Font fontBuild = new Font.Builder(resources, lg8an0fk4mqzmpmeenxb1c.zIvmSL0wzmmKGc3X39b2Gw2mUGE).setWeight(lg8an0fk4mqzmpmeenxb1c.zzpBGItXfub0yWj).setSlant(lg8an0fk4mqzmpmeenxb1c.V57tEvNfxZVVcOCAOih5PKr ? 1 : 0).setTtcIndex(lg8an0fk4mqzmpmeenxb1c.LaeGQIruHQu81hfJldjMOQSVblH3x).setFontVariationSettings(lg8an0fk4mqzmpmeenxb1c.ZfQNn8hdWlEQ5cR94249PDsLR).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(wR7sbzHKf9hYV1lxoS6nqyszepWvN(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // com.vdodsodjsdt.F44whnLsbQ
    public final j5O1PfCuTxZKdtuvF7 jW7EiD0YL6xkbB158jMUzhWNWb1y(j5O1PfCuTxZKdtuvF7[] j5o1pfcutxzkdtuvf7Arr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // com.vdodsodjsdt.F44whnLsbQ
    public final Typeface p59rPv72J9(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // com.vdodsodjsdt.F44whnLsbQ
    public final Typeface q1wNbhk2O6(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
