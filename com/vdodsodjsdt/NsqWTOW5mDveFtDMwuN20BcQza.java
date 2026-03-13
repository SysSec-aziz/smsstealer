package com.vdodsodjsdt;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class NsqWTOW5mDveFtDMwuN20BcQza implements KeyListener {
    public final KeyListener VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final FG8LIxsgYiLSfhN0jYKIKr zzpBGItXfub0yWj;

    public NsqWTOW5mDveFtDMwuN20BcQza(KeyListener keyListener) {
        FG8LIxsgYiLSfhN0jYKIKr fG8LIxsgYiLSfhN0jYKIKr = new FG8LIxsgYiLSfhN0jYKIKr(5);
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = keyListener;
        this.zzpBGItXfub0yWj = fG8LIxsgYiLSfhN0jYKIKr;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean z;
        this.zzpBGItXfub0yWj.getClass();
        if (i != 67 ? i != 112 ? false : NrjuzzioPqfttNRptBDpZDzSYUrcM.GI83zq0G8e7zkn(editable, keyEvent, true) : NrjuzzioPqfttNRptBDpZDzSYUrcM.GI83zq0G8e7zkn(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z = true;
        } else {
            z = false;
        }
        return z || this.VxUQ9tBhpHJ2AAEDNW8sghc4m.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m.onKeyUp(view, editable, i, keyEvent);
    }
}
