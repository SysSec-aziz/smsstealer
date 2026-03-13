package com.vdodsodjsdt;

import android.util.Log;
import java.io.IOException;
import java.io.Writer;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class fZomDShQOetqV85bG extends Writer {
    public final CharSequence LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final StringBuilder ZfQNn8hdWlEQ5cR94249PDsLR;

    public fZomDShQOetqV85bG() {
        this.V57tEvNfxZVVcOCAOih5PKr = 0;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new StringBuilder(128);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = "FragmentManager";
    }

    public void LaeGQIruHQu81hfJldjMOQSVblH3x() {
        StringBuilder sb = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (sb.length() > 0) {
            Log.d((String) this.LaeGQIruHQu81hfJldjMOQSVblH3x, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 1:
                this.ZfQNn8hdWlEQ5cR94249PDsLR.append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                LaeGQIruHQu81hfJldjMOQSVblH3x();
                break;
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                LaeGQIruHQu81hfJldjMOQSVblH3x();
                break;
        }
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                for (int i3 = 0; i3 < i2; i3++) {
                    char c = cArr[i + i3];
                    if (c == '\n') {
                        LaeGQIruHQu81hfJldjMOQSVblH3x();
                    } else {
                        this.ZfQNn8hdWlEQ5cR94249PDsLR.append(c);
                    }
                }
                break;
            default:
                eaGHbkTa1XoPoKq2zsKZFY eaghbkta1xopokq2zskzfy = (eaGHbkTa1XoPoKq2zsKZFY) this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                eaghbkta1xopokq2zskzfy.V57tEvNfxZVVcOCAOih5PKr = cArr;
                eaghbkta1xopokq2zskzfy.ZfQNn8hdWlEQ5cR94249PDsLR = null;
                this.ZfQNn8hdWlEQ5cR94249PDsLR.append((CharSequence) eaghbkta1xopokq2zskzfy, i, i2 + i);
                break;
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Appendable append(CharSequence charSequence) {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 1:
                this.ZfQNn8hdWlEQ5cR94249PDsLR.append(charSequence);
                return this;
            default:
                return super.append(charSequence);
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 1:
                this.ZfQNn8hdWlEQ5cR94249PDsLR.append(charSequence, i, i2);
                return this;
            default:
                return super.append(charSequence, i, i2);
        }
    }

    public fZomDShQOetqV85bG(StringBuilder sb) {
        this.V57tEvNfxZVVcOCAOih5PKr = 1;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = new eaGHbkTa1XoPoKq2zsKZFY();
        this.ZfQNn8hdWlEQ5cR94249PDsLR = sb;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Appendable append(CharSequence charSequence, int i, int i2) {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 1:
                this.ZfQNn8hdWlEQ5cR94249PDsLR.append(charSequence, i, i2);
                return this;
            default:
                return super.append(charSequence, i, i2);
        }
    }

    @Override // java.io.Writer
    public void write(int i) throws IOException {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 1:
                this.ZfQNn8hdWlEQ5cR94249PDsLR.append((char) i);
                break;
            default:
                super.write(i);
                break;
        }
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 1:
                Objects.requireNonNull(str);
                this.ZfQNn8hdWlEQ5cR94249PDsLR.append((CharSequence) str, i, i2 + i);
                break;
            default:
                super.write(str, i, i2);
                break;
        }
    }

    private final void V57tEvNfxZVVcOCAOih5PKr() {
    }

    private final void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
    }
}
