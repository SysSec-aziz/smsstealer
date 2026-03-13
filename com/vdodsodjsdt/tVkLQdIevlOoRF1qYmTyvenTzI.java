package com.vdodsodjsdt;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class tVkLQdIevlOoRF1qYmTyvenTzI implements Closeable, Flushable {
    public static final String[] h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public boolean GI83zq0G8e7zkn;
    public boolean HzCpKshMOoaw76hFcbOVRYMeRd;
    public String KUYypEB4eNWOZWVDpH;
    public int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public int M9e7PWhFYLD2lOGMker;
    public String NSjgqmGjEzuugn2SsG1mZFP;
    public final Writer V57tEvNfxZVVcOCAOih5PKr;
    public String ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public int[] ZfQNn8hdWlEQ5cR94249PDsLR;
    public boolean q1wNbhk2O6;
    public emqFyMkWkwZHiLAioE4xU9Pubq zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public static final Pattern p59rPv72J9 = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] Ca81ebIan1u = new String[128];

    static {
        for (int i = 0; i <= 31; i++) {
            Ca81ebIan1u[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = Ca81ebIan1u;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        h3jnZRsdwYJfY9UhQCkbvWciwvFHv = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public tVkLQdIevlOoRF1qYmTyvenTzI(Writer writer) {
        int[] iArr = new int[32];
        this.ZfQNn8hdWlEQ5cR94249PDsLR = iArr;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = 0;
        if (iArr.length == 0) {
            this.ZfQNn8hdWlEQ5cR94249PDsLR = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = i + 1;
        iArr2[i] = 6;
        this.M9e7PWhFYLD2lOGMker = 2;
        this.q1wNbhk2O6 = true;
        Objects.requireNonNull(writer, "out == null");
        this.V57tEvNfxZVVcOCAOih5PKr = writer;
        vE4yDIjexsP2lGjLaTcB(emqFyMkWkwZHiLAioE4xU9Pubq.ZfQNn8hdWlEQ5cR94249PDsLR);
    }

    public final void CixTK5ZX8oWXHz34qHYV() throws IOException {
        if (this.KUYypEB4eNWOZWVDpH != null) {
            int iAXO0LSrt8bKV = aXO0LSrt8bKV();
            if (iAXO0LSrt8bKV == 5) {
                this.V57tEvNfxZVVcOCAOih5PKr.write(this.NSjgqmGjEzuugn2SsG1mZFP);
            } else if (iAXO0LSrt8bKV != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            SuB3hEmTmbbRGAhtvOOmfKEon();
            this.ZfQNn8hdWlEQ5cR94249PDsLR[this.LaeGQIruHQu81hfJldjMOQSVblH3x - 1] = 4;
            HVEwbdULInpTNa0IG(this.KUYypEB4eNWOZWVDpH);
            this.KUYypEB4eNWOZWVDpH = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void HVEwbdULInpTNa0IG(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.HzCpKshMOoaw76hFcbOVRYMeRd
            if (r0 == 0) goto L7
            java.lang.String[] r0 = com.vdodsodjsdt.tVkLQdIevlOoRF1qYmTyvenTzI.h3jnZRsdwYJfY9UhQCkbvWciwvFHv
            goto L9
        L7:
            java.lang.String[] r0 = com.vdodsodjsdt.tVkLQdIevlOoRF1qYmTyvenTzI.Ca81ebIan1u
        L9:
            java.io.Writer r1 = r8.V57tEvNfxZVVcOCAOih5PKr
            r2 = 34
            r1.write(r2)
            int r3 = r9.length()
            r4 = 0
            r5 = r4
        L16:
            if (r4 >= r3) goto L41
            char r6 = r9.charAt(r4)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L25
            r6 = r0[r6]
            if (r6 != 0) goto L32
            goto L3e
        L25:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2c
            java.lang.String r6 = "\\u2028"
            goto L32
        L2c:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L3e
            java.lang.String r6 = "\\u2029"
        L32:
            if (r5 >= r4) goto L39
            int r7 = r4 - r5
            r1.write(r9, r5, r7)
        L39:
            r1.write(r6)
            int r5 = r4 + 1
        L3e:
            int r4 = r4 + 1
            goto L16
        L41:
            if (r5 >= r3) goto L47
            int r3 = r3 - r5
            r1.write(r9, r5, r3)
        L47:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.tVkLQdIevlOoRF1qYmTyvenTzI.HVEwbdULInpTNa0IG(java.lang.String):void");
    }

    public void KUYypEB4eNWOZWVDpH() throws IOException {
        M9e7PWhFYLD2lOGMker(1, 2, ']');
    }

    public void LaeGQIruHQu81hfJldjMOQSVblH3x() throws IOException {
        CixTK5ZX8oWXHz34qHYV();
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
        int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        int[] iArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (i == iArr.length) {
            this.ZfQNn8hdWlEQ5cR94249PDsLR = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        int i2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = i2 + 1;
        iArr2[i2] = 3;
        this.V57tEvNfxZVVcOCAOih5PKr.write(123);
    }

    public final void M9e7PWhFYLD2lOGMker(int i, int i2, char c) throws IOException {
        int iAXO0LSrt8bKV = aXO0LSrt8bKV();
        if (iAXO0LSrt8bKV != i2 && iAXO0LSrt8bKV != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.KUYypEB4eNWOZWVDpH != null) {
            throw new IllegalStateException("Dangling name: " + this.KUYypEB4eNWOZWVDpH);
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x--;
        if (iAXO0LSrt8bKV == i2) {
            SuB3hEmTmbbRGAhtvOOmfKEon();
        }
        this.V57tEvNfxZVVcOCAOih5PKr.write(c);
    }

    public final void O1xDAlBZZlZdoEf747lCFHld(int i) {
        if (i == 0) {
            throw null;
        }
        this.M9e7PWhFYLD2lOGMker = i;
    }

    public void RhfGHxtXxy0M0grmp2jkRjQg(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.KUYypEB4eNWOZWVDpH != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iAXO0LSrt8bKV = aXO0LSrt8bKV();
        if (iAXO0LSrt8bKV != 3 && iAXO0LSrt8bKV != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.KUYypEB4eNWOZWVDpH = str;
    }

    public final void SuB3hEmTmbbRGAhtvOOmfKEon() throws IOException {
        if (this.GI83zq0G8e7zkn) {
            return;
        }
        String str = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        Writer writer = this.V57tEvNfxZVVcOCAOih5PKr;
        writer.write(str);
        int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.zzpBGItXfub0yWj);
        }
    }

    public void TqcnImqkSWIKht(String str) throws IOException {
        if (str == null) {
            pzqP2AqKW6J5PO8zCKnW();
            return;
        }
        CixTK5ZX8oWXHz34qHYV();
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
        HVEwbdULInpTNa0IG(str);
    }

    public void V57tEvNfxZVVcOCAOih5PKr() throws IOException {
        CixTK5ZX8oWXHz34qHYV();
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
        int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        int[] iArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (i == iArr.length) {
            this.ZfQNn8hdWlEQ5cR94249PDsLR = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        int i2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = i2 + 1;
        iArr2[i2] = 1;
        this.V57tEvNfxZVVcOCAOih5PKr.write(91);
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() throws IOException {
        int iAXO0LSrt8bKV = aXO0LSrt8bKV();
        if (iAXO0LSrt8bKV == 1) {
            this.ZfQNn8hdWlEQ5cR94249PDsLR[this.LaeGQIruHQu81hfJldjMOQSVblH3x - 1] = 2;
            SuB3hEmTmbbRGAhtvOOmfKEon();
            return;
        }
        Writer writer = this.V57tEvNfxZVVcOCAOih5PKr;
        if (iAXO0LSrt8bKV == 2) {
            writer.append((CharSequence) this.NSjgqmGjEzuugn2SsG1mZFP);
            SuB3hEmTmbbRGAhtvOOmfKEon();
        } else {
            if (iAXO0LSrt8bKV == 4) {
                writer.append((CharSequence) this.ZLZeBXTMq0zDztBxtRTuCHrapQ);
                this.ZfQNn8hdWlEQ5cR94249PDsLR[this.LaeGQIruHQu81hfJldjMOQSVblH3x - 1] = 5;
                return;
            }
            if (iAXO0LSrt8bKV != 6) {
                if (iAXO0LSrt8bKV != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.M9e7PWhFYLD2lOGMker != 1) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.ZfQNn8hdWlEQ5cR94249PDsLR[this.LaeGQIruHQu81hfJldjMOQSVblH3x - 1] = 7;
        }
    }

    public final int aXO0LSrt8bKV() {
        int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i != 0) {
            return this.ZfQNn8hdWlEQ5cR94249PDsLR[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.V57tEvNfxZVVcOCAOih5PKr.close();
        int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i > 1 || (i == 1 && this.ZfQNn8hdWlEQ5cR94249PDsLR[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = 0;
    }

    public void d9zDyyznnp3oaDT1Ug(boolean z) throws IOException {
        CixTK5ZX8oWXHz34qHYV();
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
        this.V57tEvNfxZVVcOCAOih5PKr.write(z ? "true" : "false");
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.V57tEvNfxZVVcOCAOih5PKr.flush();
    }

    public void iKANjmyTSxO6v6UuLPdu7DxOjlS(Number number) throws IOException {
        if (number == null) {
            pzqP2AqKW6J5PO8zCKnW();
            return;
        }
        CixTK5ZX8oWXHz34qHYV();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.M9e7PWhFYLD2lOGMker != 1) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(string));
                }
            } else if (cls != Float.class && cls != Double.class && !p59rPv72J9.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        }
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
        this.V57tEvNfxZVVcOCAOih5PKr.append((CharSequence) string);
    }

    public tVkLQdIevlOoRF1qYmTyvenTzI pzqP2AqKW6J5PO8zCKnW() throws IOException {
        if (this.KUYypEB4eNWOZWVDpH != null) {
            if (!this.q1wNbhk2O6) {
                this.KUYypEB4eNWOZWVDpH = null;
                return this;
            }
            CixTK5ZX8oWXHz34qHYV();
        }
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
        this.V57tEvNfxZVVcOCAOih5PKr.write("null");
        return this;
    }

    public void q11o1hieEkZDhF1MGOZI26oZiDT() throws IOException {
        M9e7PWhFYLD2lOGMker(3, 5, '}');
    }

    public void qygqjTppWwx992(long j) throws IOException {
        CixTK5ZX8oWXHz34qHYV();
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
        this.V57tEvNfxZVVcOCAOih5PKr.write(Long.toString(j));
    }

    public final void vE4yDIjexsP2lGjLaTcB(emqFyMkWkwZHiLAioE4xU9Pubq emqfymkwkwzhilaioe4xu9pubq) {
        Objects.requireNonNull(emqfymkwkwzhilaioe4xu9pubq);
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = emqfymkwkwzhilaioe4xu9pubq;
        this.NSjgqmGjEzuugn2SsG1mZFP = ",";
        if (emqfymkwkwzhilaioe4xu9pubq.V57tEvNfxZVVcOCAOih5PKr) {
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = ": ";
            if (emqfymkwkwzhilaioe4xu9pubq.VxUQ9tBhpHJ2AAEDNW8sghc4m.isEmpty()) {
                this.NSjgqmGjEzuugn2SsG1mZFP = ", ";
            }
        } else {
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = ":";
        }
        this.GI83zq0G8e7zkn = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.VxUQ9tBhpHJ2AAEDNW8sghc4m.isEmpty() && this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.zzpBGItXfub0yWj.isEmpty();
    }

    public void y1NaPKTl7R18DOr6e8i5(double d) throws IOException {
        CixTK5ZX8oWXHz34qHYV();
        if (this.M9e7PWhFYLD2lOGMker == 1 || !(Double.isNaN(d) || Double.isInfinite(d))) {
            VxUQ9tBhpHJ2AAEDNW8sghc4m();
            this.V57tEvNfxZVVcOCAOih5PKr.append((CharSequence) Double.toString(d));
        } else {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
    }
}
