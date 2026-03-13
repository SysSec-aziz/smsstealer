package com.vdodsodjsdt;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class JHTtgY8YA1mDJLk5P3f1Lj5sJwDiC extends CancellationException {
    public final transient fXGTDnUxIdCVHFvA63E V57tEvNfxZVVcOCAOih5PKr;

    public JHTtgY8YA1mDJLk5P3f1Lj5sJwDiC(String str, Throwable th, fXGTDnUxIdCVHFvA63E fxgtdnuxidcvhfva63e) {
        super(str);
        this.V57tEvNfxZVVcOCAOih5PKr = fxgtdnuxidcvhfva63e;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JHTtgY8YA1mDJLk5P3f1Lj5sJwDiC)) {
            return false;
        }
        JHTtgY8YA1mDJLk5P3f1Lj5sJwDiC jHTtgY8YA1mDJLk5P3f1Lj5sJwDiC = (JHTtgY8YA1mDJLk5P3f1Lj5sJwDiC) obj;
        return ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(jHTtgY8YA1mDJLk5P3f1Lj5sJwDiC.getMessage(), getMessage()) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(jHTtgY8YA1mDJLk5P3f1Lj5sJwDiC.V57tEvNfxZVVcOCAOih5PKr, this.V57tEvNfxZVVcOCAOih5PKr) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(jHTtgY8YA1mDJLk5P3f1Lj5sJwDiC.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        ej6unYlOWMDF.p59rPv72J9(message);
        int iHashCode = (this.V57tEvNfxZVVcOCAOih5PKr.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return iHashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.V57tEvNfxZVVcOCAOih5PKr;
    }
}
