package com.vdodsodjsdt;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class euYTwHHkzT79KP8ssihrzwr extends InputConnectionWrapper {
    public final EditText VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final FG8LIxsgYiLSfhN0jYKIKr zzpBGItXfub0yWj;

    public euYTwHHkzT79KP8ssihrzwr(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        FG8LIxsgYiLSfhN0jYKIKr fG8LIxsgYiLSfhN0jYKIKr = new FG8LIxsgYiLSfhN0jYKIKr(4);
        super(inputConnection, false);
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = editText;
        this.zzpBGItXfub0yWj = fG8LIxsgYiLSfhN0jYKIKr;
        if (ZxVLD9H77Z62NUllXp.HzCpKshMOoaw76hFcbOVRYMeRd != null) {
            ZxVLD9H77Z62NUllXp zxVLD9H77Z62NUllXpVxUQ9tBhpHJ2AAEDNW8sghc4m = ZxVLD9H77Z62NUllXp.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            if (zxVLD9H77Z62NUllXpVxUQ9tBhpHJ2AAEDNW8sghc4m.zzpBGItXfub0yWj() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            kwpQ2cITbiO8uSwWuGlUDM7X7GE kwpq2citbio8uswwugludm7x7ge = zxVLD9H77Z62NUllXpVxUQ9tBhpHJ2AAEDNW8sghc4m.LaeGQIruHQu81hfJldjMOQSVblH3x;
            kwpq2citbio8uswwugludm7x7ge.getClass();
            Bundle bundle = editorInfo.extras;
            pt4pjl1pNXdDyK812k pt4pjl1pnxddyk812k = (pt4pjl1pNXdDyK812k) kwpq2citbio8uswwugludm7x7ge.V57tEvNfxZVVcOCAOih5PKr.V57tEvNfxZVVcOCAOih5PKr;
            int iVxUQ9tBhpHJ2AAEDNW8sghc4m = pt4pjl1pnxddyk812k.VxUQ9tBhpHJ2AAEDNW8sghc4m(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iVxUQ9tBhpHJ2AAEDNW8sghc4m != 0 ? ((ByteBuffer) pt4pjl1pnxddyk812k.zIvmSL0wzmmKGc3X39b2Gw2mUGE).getInt(iVxUQ9tBhpHJ2AAEDNW8sghc4m + pt4pjl1pnxddyk812k.V57tEvNfxZVVcOCAOih5PKr) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.getEditableText();
        this.zzpBGItXfub0yWj.getClass();
        return FG8LIxsgYiLSfhN0jYKIKr.HzCpKshMOoaw76hFcbOVRYMeRd(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.VxUQ9tBhpHJ2AAEDNW8sghc4m.getEditableText();
        this.zzpBGItXfub0yWj.getClass();
        return FG8LIxsgYiLSfhN0jYKIKr.HzCpKshMOoaw76hFcbOVRYMeRd(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
