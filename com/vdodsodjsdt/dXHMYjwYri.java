package com.vdodsodjsdt;

import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class dXHMYjwYri implements iIBl3qIny2 {
    public final /* synthetic */ AIQ3M1G7NlBb9nFUZAGJvkBOAC NSjgqmGjEzuugn2SsG1mZFP;
    public final long V57tEvNfxZVVcOCAOih5PKr;
    public boolean ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public boolean ZfQNn8hdWlEQ5cR94249PDsLR;
    public final EouCzLZsW9ynithduh LaeGQIruHQu81hfJldjMOQSVblH3x = new EouCzLZsW9ynithduh();
    public final EouCzLZsW9ynithduh zIvmSL0wzmmKGc3X39b2Gw2mUGE = new EouCzLZsW9ynithduh();

    public dXHMYjwYri(AIQ3M1G7NlBb9nFUZAGJvkBOAC aIQ3M1G7NlBb9nFUZAGJvkBOAC, long j, boolean z) {
        this.NSjgqmGjEzuugn2SsG1mZFP = aIQ3M1G7NlBb9nFUZAGJvkBOAC;
        this.V57tEvNfxZVVcOCAOih5PKr = j;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        AIQ3M1G7NlBb9nFUZAGJvkBOAC aIQ3M1G7NlBb9nFUZAGJvkBOAC = this.NSjgqmGjEzuugn2SsG1mZFP;
        synchronized (aIQ3M1G7NlBb9nFUZAGJvkBOAC) {
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = true;
            EouCzLZsW9ynithduh eouCzLZsW9ynithduh = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            j = eouCzLZsW9ynithduh.ZfQNn8hdWlEQ5cR94249PDsLR;
            eouCzLZsW9ynithduh.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            aIQ3M1G7NlBb9nFUZAGJvkBOAC.notifyAll();
        }
        if (j > 0) {
            AIQ3M1G7NlBb9nFUZAGJvkBOAC aIQ3M1G7NlBb9nFUZAGJvkBOAC2 = this.NSjgqmGjEzuugn2SsG1mZFP;
            TimeZone timeZone = U7JVXX1Kyh43VgUF.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            aIQ3M1G7NlBb9nFUZAGJvkBOAC2.zzpBGItXfub0yWj.KUYypEB4eNWOZWVDpH(j);
        }
        this.NSjgqmGjEzuugn2SsG1mZFP.VxUQ9tBhpHJ2AAEDNW8sghc4m();
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9 A[Catch: all -> 0x0022, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x0005, B:7:0x0012, B:13:0x001c, B:47:0x00b9, B:61:0x00df, B:62:0x00e4, B:17:0x0025, B:19:0x002b, B:21:0x002f, B:23:0x0033, B:27:0x0044, B:29:0x0048, B:31:0x0052, B:33:0x006f, B:35:0x0080, B:38:0x0097, B:41:0x00a1, B:43:0x00a7, B:44:0x00b3, B:58:0x00d5, B:59:0x00dc), top: B:66:0x0005, inners: #0 }] */
    @Override // com.vdodsodjsdt.iIBl3qIny2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long ko09zE6UAgwkV(long r22, com.vdodsodjsdt.EouCzLZsW9ynithduh r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.dXHMYjwYri.ko09zE6UAgwkV(long, com.vdodsodjsdt.EouCzLZsW9ynithduh):long");
    }

    @Override // com.vdodsodjsdt.iIBl3qIny2, com.vdodsodjsdt.CZ74FjSsfST8z15SHXk
    public final Rls9YNaGzWVnzvwT zzpBGItXfub0yWj() {
        return this.NSjgqmGjEzuugn2SsG1mZFP.M9e7PWhFYLD2lOGMker;
    }
}
