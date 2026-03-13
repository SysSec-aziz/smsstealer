package com.vdodsodjsdt;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class xPkmmA8xByE6WyLiH {
    public boolean HzCpKshMOoaw76hFcbOVRYMeRd;
    public final int V57tEvNfxZVVcOCAOih5PKr;
    public CharSequence VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public int ZfQNn8hdWlEQ5cR94249PDsLR;
    public Jc01di1Hsv q1wNbhk2O6;
    public final TextPaint zzpBGItXfub0yWj;
    public Layout.Alignment LaeGQIruHQu81hfJldjMOQSVblH3x = Layout.Alignment.ALIGN_NORMAL;
    public int zIvmSL0wzmmKGc3X39b2Gw2mUGE = Integer.MAX_VALUE;
    public float ZLZeBXTMq0zDztBxtRTuCHrapQ = 0.0f;
    public float NSjgqmGjEzuugn2SsG1mZFP = 1.0f;
    public int GI83zq0G8e7zkn = 1;
    public boolean M9e7PWhFYLD2lOGMker = true;
    public TextUtils.TruncateAt KUYypEB4eNWOZWVDpH = null;

    public xPkmmA8xByE6WyLiH(CharSequence charSequence, TextPaint textPaint, int i) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = charSequence;
        this.zzpBGItXfub0yWj = textPaint;
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = charSequence.length();
    }

    public final StaticLayout VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        if (this.VxUQ9tBhpHJ2AAEDNW8sghc4m == null) {
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m = "";
        }
        int iMax = Math.max(0, this.V57tEvNfxZVVcOCAOih5PKr);
        CharSequence charSequenceEllipsize = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int i = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        TextPaint textPaint = this.zzpBGItXfub0yWj;
        if (i == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.KUYypEB4eNWOZWVDpH);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.ZfQNn8hdWlEQ5cR94249PDsLR);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = iMin;
        if (this.HzCpKshMOoaw76hFcbOVRYMeRd && this.zIvmSL0wzmmKGc3X39b2Gw2mUGE == 1) {
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.LaeGQIruHQu81hfJldjMOQSVblH3x);
        builderObtain.setIncludePad(this.M9e7PWhFYLD2lOGMker);
        builderObtain.setTextDirection(this.HzCpKshMOoaw76hFcbOVRYMeRd ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.KUYypEB4eNWOZWVDpH;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
        float f = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (f != 0.0f || this.NSjgqmGjEzuugn2SsG1mZFP != 1.0f) {
            builderObtain.setLineSpacing(f, this.NSjgqmGjEzuugn2SsG1mZFP);
        }
        if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE > 1) {
            builderObtain.setHyphenationFrequency(this.GI83zq0G8e7zkn);
        }
        Jc01di1Hsv jc01di1Hsv = this.q1wNbhk2O6;
        if (jc01di1Hsv != null) {
            builderObtain.setBreakStrategy(((TextInputLayout) jc01di1Hsv.ZfQNn8hdWlEQ5cR94249PDsLR).Irh5auREsoeV1C1RaBamlmy.getBreakStrategy());
        }
        return builderObtain.build();
    }
}
