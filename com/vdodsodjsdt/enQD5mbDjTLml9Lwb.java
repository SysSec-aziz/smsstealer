package com.vdodsodjsdt;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class enQD5mbDjTLml9Lwb extends kfY5YDtDv6dzFxBj {
    public final WeakReference VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final WeakReference zzpBGItXfub0yWj;

    public enQD5mbDjTLml9Lwb(TextView textView, MczqQTEILYdz358JaZBNKUUlbTp mczqQTEILYdz358JaZBNKUUlbTp) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new WeakReference(textView);
        this.zzpBGItXfub0yWj = new WeakReference(mczqQTEILYdz358JaZBNKUUlbTp);
    }

    @Override // com.vdodsodjsdt.kfY5YDtDv6dzFxBj
    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() throws Throwable {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.VxUQ9tBhpHJ2AAEDNW8sghc4m.get();
        InputFilter inputFilter = (InputFilter) this.zzpBGItXfub0yWj.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    ZxVLD9H77Z62NUllXp zxVLD9H77Z62NUllXpVxUQ9tBhpHJ2AAEDNW8sghc4m = ZxVLD9H77Z62NUllXp.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                    if (text == null) {
                        length = 0;
                    } else {
                        zxVLD9H77Z62NUllXpVxUQ9tBhpHJ2AAEDNW8sghc4m.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceLaeGQIruHQu81hfJldjMOQSVblH3x = zxVLD9H77Z62NUllXpVxUQ9tBhpHJ2AAEDNW8sghc4m.LaeGQIruHQu81hfJldjMOQSVblH3x(text, 0, length);
                    if (text == charSequenceLaeGQIruHQu81hfJldjMOQSVblH3x) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceLaeGQIruHQu81hfJldjMOQSVblH3x);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceLaeGQIruHQu81hfJldjMOQSVblH3x);
                    textView.setText(charSequenceLaeGQIruHQu81hfJldjMOQSVblH3x);
                    if (charSequenceLaeGQIruHQu81hfJldjMOQSVblH3x instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceLaeGQIruHQu81hfJldjMOQSVblH3x;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
