package com.vdodsodjsdt;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class idvZLuVtEHk6C2 implements TextWatcher {
    public boolean LaeGQIruHQu81hfJldjMOQSVblH3x = true;
    public final EditText V57tEvNfxZVVcOCAOih5PKr;
    public gAItek4sjAVVIxDjX ZfQNn8hdWlEQ5cR94249PDsLR;

    public idvZLuVtEHk6C2(EditText editText) {
        this.V57tEvNfxZVVcOCAOih5PKr = editText;
    }

    public static void VxUQ9tBhpHJ2AAEDNW8sghc4m(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            ZxVLD9H77Z62NUllXp zxVLD9H77Z62NUllXpVxUQ9tBhpHJ2AAEDNW8sghc4m = ZxVLD9H77Z62NUllXp.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            if (editableText == null) {
                length = 0;
            } else {
                zxVLD9H77Z62NUllXpVxUQ9tBhpHJ2AAEDNW8sghc4m.getClass();
                length = editableText.length();
            }
            zxVLD9H77Z62NUllXpVxUQ9tBhpHJ2AAEDNW8sghc4m.LaeGQIruHQu81hfJldjMOQSVblH3x(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
        EditText editText = this.V57tEvNfxZVVcOCAOih5PKr;
        if (editText.isInEditMode() || !this.LaeGQIruHQu81hfJldjMOQSVblH3x || ZxVLD9H77Z62NUllXp.HzCpKshMOoaw76hFcbOVRYMeRd == null || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iZzpBGItXfub0yWj = ZxVLD9H77Z62NUllXp.VxUQ9tBhpHJ2AAEDNW8sghc4m().zzpBGItXfub0yWj();
        if (iZzpBGItXfub0yWj != 0) {
            if (iZzpBGItXfub0yWj == 1) {
                ZxVLD9H77Z62NUllXp.VxUQ9tBhpHJ2AAEDNW8sghc4m().LaeGQIruHQu81hfJldjMOQSVblH3x((Spannable) charSequence, i, i3 + i);
                return;
            } else if (iZzpBGItXfub0yWj != 3) {
                return;
            }
        }
        ZxVLD9H77Z62NUllXp zxVLD9H77Z62NUllXpVxUQ9tBhpHJ2AAEDNW8sghc4m = ZxVLD9H77Z62NUllXp.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR == null) {
            this.ZfQNn8hdWlEQ5cR94249PDsLR = new gAItek4sjAVVIxDjX(editText);
        }
        zxVLD9H77Z62NUllXpVxUQ9tBhpHJ2AAEDNW8sghc4m.zIvmSL0wzmmKGc3X39b2Gw2mUGE(this.ZfQNn8hdWlEQ5cR94249PDsLR);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
