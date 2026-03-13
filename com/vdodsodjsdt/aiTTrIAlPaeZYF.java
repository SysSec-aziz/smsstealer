package com.vdodsodjsdt;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class aiTTrIAlPaeZYF {
    public final int V57tEvNfxZVVcOCAOih5PKr;
    public final TextPaint VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final int ZfQNn8hdWlEQ5cR94249PDsLR;
    public final TextDirectionHeuristic zzpBGItXfub0yWj;

    public aiTTrIAlPaeZYF(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            nQSfo8KBISNjPGeZ.NSjgqmGjEzuugn2SsG1mZFP(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
        }
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = textPaint;
        this.zzpBGItXfub0yWj = textDirectionHeuristic;
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aiTTrIAlPaeZYF)) {
            return false;
        }
        aiTTrIAlPaeZYF aittrialpaezyf = (aiTTrIAlPaeZYF) obj;
        if (this.V57tEvNfxZVVcOCAOih5PKr != aittrialpaezyf.V57tEvNfxZVVcOCAOih5PKr || this.ZfQNn8hdWlEQ5cR94249PDsLR != aittrialpaezyf.ZfQNn8hdWlEQ5cR94249PDsLR) {
            return false;
        }
        TextPaint textPaint = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        float textSize = textPaint.getTextSize();
        TextPaint textPaint2 = aittrialpaezyf.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (textSize != textPaint2.getTextSize() || textPaint.getTextScaleX() != textPaint2.getTextScaleX() || textPaint.getTextSkewX() != textPaint2.getTextSkewX() || textPaint.getLetterSpacing() != textPaint2.getLetterSpacing() || !TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) || textPaint.getFlags() != textPaint2.getFlags() || !textPaint.getTextLocales().equals(textPaint2.getTextLocales())) {
            return false;
        }
        if (textPaint.getTypeface() == null) {
            if (textPaint2.getTypeface() != null) {
                return false;
            }
        } else if (!textPaint.getTypeface().equals(textPaint2.getTypeface())) {
            return false;
        }
        return this.zzpBGItXfub0yWj == aittrialpaezyf.zzpBGItXfub0yWj;
    }

    public final int hashCode() {
        TextPaint textPaint = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.zzpBGItXfub0yWj, Integer.valueOf(this.V57tEvNfxZVVcOCAOih5PKr), Integer.valueOf(this.ZfQNn8hdWlEQ5cR94249PDsLR));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i >= 26) {
            sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb.append(", textDir=" + this.zzpBGItXfub0yWj);
        sb.append(", breakStrategy=" + this.V57tEvNfxZVVcOCAOih5PKr);
        sb.append(", hyphenationFrequency=" + this.ZfQNn8hdWlEQ5cR94249PDsLR);
        sb.append("}");
        return sb.toString();
    }

    public aiTTrIAlPaeZYF(PrecomputedText.Params params) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = params.getTextPaint();
        this.zzpBGItXfub0yWj = params.getTextDirection();
        this.V57tEvNfxZVVcOCAOih5PKr = params.getBreakStrategy();
        this.ZfQNn8hdWlEQ5cR94249PDsLR = params.getHyphenationFrequency();
    }
}
