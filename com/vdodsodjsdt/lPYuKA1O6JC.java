package com.vdodsodjsdt;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class lPYuKA1O6JC implements TextWatcher {
    public final /* synthetic */ TextInputLayout LaeGQIruHQu81hfJldjMOQSVblH3x;
    public int V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ EditText ZfQNn8hdWlEQ5cR94249PDsLR;

    public lPYuKA1O6JC(TextInputLayout textInputLayout, EditText editText) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = textInputLayout;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = editText;
        this.V57tEvNfxZVVcOCAOih5PKr = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        textInputLayout.Irh5auREsoeV1C1RaBamlmy(!textInputLayout.DNP7yXLsojH0rPMHr8fUY14M, false);
        if (textInputLayout.p59rPv72J9) {
            textInputLayout.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(editable);
        }
        if (textInputLayout.TaDO7ogis3aEiWEtq) {
            textInputLayout.q11o1hieEkZDhF1MGOZI26oZiDT(editable);
        }
        EditText editText = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        int lineCount = editText.getLineCount();
        int i = this.V57tEvNfxZVVcOCAOih5PKr;
        if (lineCount != i) {
            if (lineCount < i) {
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.VOvSEdhaZyc0oOGQ8;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.V57tEvNfxZVVcOCAOih5PKr = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
