package com.vdodsodjsdt;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class uLKh0h5Zrkfub {
    public final /* synthetic */ eswEmxJomeZU VxUQ9tBhpHJ2AAEDNW8sghc4m;

    public uLKh0h5Zrkfub(eswEmxJomeZU eswemxjomezu) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = eswemxjomezu;
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(TextInputLayout textInputLayout) {
        eswEmxJomeZU eswemxjomezu = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        OJU6RB3pv2nOUirXxioh6 oJU6RB3pv2nOUirXxioh6 = eswemxjomezu.q11o1hieEkZDhF1MGOZI26oZiDT;
        if (eswemxjomezu.vBGA6pPLqSMuYGvprl270j7 == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = eswemxjomezu.vBGA6pPLqSMuYGvprl270j7;
        if (editText != null) {
            editText.removeTextChangedListener(oJU6RB3pv2nOUirXxioh6);
            if (eswemxjomezu.vBGA6pPLqSMuYGvprl270j7.getOnFocusChangeListener() == eswemxjomezu.zzpBGItXfub0yWj().LaeGQIruHQu81hfJldjMOQSVblH3x()) {
                eswemxjomezu.vBGA6pPLqSMuYGvprl270j7.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        eswemxjomezu.vBGA6pPLqSMuYGvprl270j7 = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(oJU6RB3pv2nOUirXxioh6);
        }
        eswemxjomezu.zzpBGItXfub0yWj().KUYypEB4eNWOZWVDpH(eswemxjomezu.vBGA6pPLqSMuYGvprl270j7);
        eswemxjomezu.M9e7PWhFYLD2lOGMker(eswemxjomezu.zzpBGItXfub0yWj());
    }
}
