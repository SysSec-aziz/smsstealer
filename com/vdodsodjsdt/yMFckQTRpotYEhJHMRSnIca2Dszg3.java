package com.vdodsodjsdt;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class yMFckQTRpotYEhJHMRSnIca2Dszg3 implements Spannable {
    public boolean V57tEvNfxZVVcOCAOih5PKr = false;
    public Spannable ZfQNn8hdWlEQ5cR94249PDsLR;

    public yMFckQTRpotYEhJHMRSnIca2Dszg3(Spannable spannable) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR = spannable;
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        Spannable spannable = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (!this.V57tEvNfxZVVcOCAOih5PKr) {
            if ((Build.VERSION.SDK_INT < 28 ? new VSncX8ksA0tswc2TMhzhOMdd() : new hcOzzZXAKZ01GvOuv5L9vhddbz6()).ZfQNn8hdWlEQ5cR94249PDsLR(spannable)) {
                this.ZfQNn8hdWlEQ5cR94249PDsLR = new SpannableString(spannable);
            }
        }
        this.V57tEvNfxZVVcOCAOih5PKr = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
        this.ZfQNn8hdWlEQ5cR94249PDsLR.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
        this.ZfQNn8hdWlEQ5cR94249PDsLR.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR.toString();
    }
}
