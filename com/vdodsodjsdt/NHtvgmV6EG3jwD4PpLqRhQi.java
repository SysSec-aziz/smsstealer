package com.vdodsodjsdt;

import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class NHtvgmV6EG3jwD4PpLqRhQi {
    public static Paint V57tEvNfxZVVcOCAOih5PKr;
    public static final F44whnLsbQ VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public static final OBsbe4YQtB2vgUFxLzO6ssT0 zzpBGItXfub0yWj;

    static {
        Trace.beginSection(hRrPPME7ytOB7ba.HVEwbdULInpTNa0IG("TypefaceCompat static init"));
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            VxUQ9tBhpHJ2AAEDNW8sghc4m = new HXzviOqBxIiMu78EkHguc();
        } else if (i >= 29) {
            VxUQ9tBhpHJ2AAEDNW8sghc4m = new Zu5J9WNKih9fC4AtKCn();
        } else if (i >= 28) {
            VxUQ9tBhpHJ2AAEDNW8sghc4m = new edd5zstTubH8iMBFiWUSaji();
        } else if (i >= 26) {
            VxUQ9tBhpHJ2AAEDNW8sghc4m = new r6cr5KsgZxiucn0gAS3HtPF16ZAvL();
        } else {
            Method method = DfpYPPWBtQIdXRJG.q1wNbhk2O6;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                VxUQ9tBhpHJ2AAEDNW8sghc4m = new DfpYPPWBtQIdXRJG();
            } else {
                VxUQ9tBhpHJ2AAEDNW8sghc4m = new UwqFzq75FTpQvxtMbqt();
            }
        }
        zzpBGItXfub0yWj = new OBsbe4YQtB2vgUFxLzO6ssT0(16);
        V57tEvNfxZVVcOCAOih5PKr = null;
        Trace.endSection();
    }

    public static Typeface V57tEvNfxZVVcOCAOih5PKr(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e5, code lost:
    
        r7 = r12.build();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface VxUQ9tBhpHJ2AAEDNW8sghc4m(android.content.Context r16, com.vdodsodjsdt.OqqfVMfmaBd7PmbWoUZs3u r17, android.content.res.Resources r18, int r19, java.lang.String r20, int r21, int r22, com.vdodsodjsdt.KfeOQNOupsCg6878zi4e r23, boolean r24) {
        /*
            Method dump skipped, instruction units count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.NHtvgmV6EG3jwD4PpLqRhQi.VxUQ9tBhpHJ2AAEDNW8sghc4m(android.content.Context, com.vdodsodjsdt.OqqfVMfmaBd7PmbWoUZs3u, android.content.res.Resources, int, java.lang.String, int, int, com.vdodsodjsdt.KfeOQNOupsCg6878zi4e, boolean):android.graphics.Typeface");
    }

    public static Font ZfQNn8hdWlEQ5cR94249PDsLR(Typeface typeface) {
        if (V57tEvNfxZVVcOCAOih5PKr == null) {
            V57tEvNfxZVVcOCAOih5PKr = new Paint();
        }
        V57tEvNfxZVVcOCAOih5PKr.setTextSize(10.0f);
        V57tEvNfxZVVcOCAOih5PKr.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, V57tEvNfxZVVcOCAOih5PKr);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }

    public static String zzpBGItXfub0yWj(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
