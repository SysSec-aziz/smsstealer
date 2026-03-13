package com.vdodsodjsdt;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class HXzviOqBxIiMu78EkHguc extends Zu5J9WNKih9fC4AtKCn {
    @Override // com.vdodsodjsdt.Zu5J9WNKih9fC4AtKCn
    public final Font ByTQIhgl7ezGvHXEd(j5O1PfCuTxZKdtuvF7 j5o1pfcutxzkdtuvf7) {
        Font fontZfQNn8hdWlEQ5cR94249PDsLR;
        Uri uri = j5o1pfcutxzkdtuvf7.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        boolean zEquals = Objects.equals(uri.getScheme(), "systemfont");
        String str = j5o1pfcutxzkdtuvf7.LaeGQIruHQu81hfJldjMOQSVblH3x;
        String authority = zEquals ? uri.getAuthority() : null;
        if (authority != null) {
            Typeface typefaceCreate = Typeface.create(authority, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                typefaceCreate = null;
            }
            if (typefaceCreate != null && (fontZfQNn8hdWlEQ5cR94249PDsLR = NHtvgmV6EG3jwD4PpLqRhQi.ZfQNn8hdWlEQ5cR94249PDsLR(typefaceCreate)) != null) {
                if (TextUtils.isEmpty(str)) {
                    return fontZfQNn8hdWlEQ5cR94249PDsLR;
                }
                try {
                    return new Font.Builder(fontZfQNn8hdWlEQ5cR94249PDsLR).setFontVariationSettings(str).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}
