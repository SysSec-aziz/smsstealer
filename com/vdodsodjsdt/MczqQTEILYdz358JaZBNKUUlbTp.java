package com.vdodsodjsdt;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class MczqQTEILYdz358JaZBNKUUlbTp implements InputFilter {
    public final TextView VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public enQD5mbDjTLml9Lwb zzpBGItXfub0yWj;

    public MczqQTEILYdz358JaZBNKUUlbTp(TextView textView) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iZzpBGItXfub0yWj = ZxVLD9H77Z62NUllXp.VxUQ9tBhpHJ2AAEDNW8sghc4m().zzpBGItXfub0yWj();
        if (iZzpBGItXfub0yWj != 0) {
            if (iZzpBGItXfub0yWj == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return ZxVLD9H77Z62NUllXp.VxUQ9tBhpHJ2AAEDNW8sghc4m().LaeGQIruHQu81hfJldjMOQSVblH3x(charSequence, 0, charSequence.length());
            }
            if (iZzpBGItXfub0yWj != 3) {
                return charSequence;
            }
        }
        ZxVLD9H77Z62NUllXp zxVLD9H77Z62NUllXpVxUQ9tBhpHJ2AAEDNW8sghc4m = ZxVLD9H77Z62NUllXp.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        if (this.zzpBGItXfub0yWj == null) {
            this.zzpBGItXfub0yWj = new enQD5mbDjTLml9Lwb(textView, this);
        }
        zxVLD9H77Z62NUllXpVxUQ9tBhpHJ2AAEDNW8sghc4m.zIvmSL0wzmmKGc3X39b2Gw2mUGE(this.zzpBGItXfub0yWj);
        return charSequence;
    }
}
