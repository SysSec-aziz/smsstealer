package com.vdodsodjsdt;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jVaNsOYs2UVt extends t8wLTr4ubNX0huCA8 {
    public int LaeGQIruHQu81hfJldjMOQSVblH3x;

    public jVaNsOYs2UVt(int i) {
        super(0L, TrXcUZLEn3kaSijyhUrmV5.ZLZeBXTMq0zDztBxtRTuCHrapQ);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = i;
    }

    public final void GI83zq0G8e7zkn(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            sGipz63rTUmSj3uFDvOtzihao.LaeGQIruHQu81hfJldjMOQSVblH3x(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        ej6unYlOWMDF.p59rPv72J9(th);
        ej6unYlOWMDF.O1xDAlBZZlZdoEf747lCFHld(V57tEvNfxZVVcOCAOih5PKr().LaeGQIruHQu81hfJldjMOQSVblH3x(), new Kb3X6BRc48SyHLv("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object M9e7PWhFYLD2lOGMker();

    public abstract IvfXhmjM3e3K V57tEvNfxZVVcOCAOih5PKr();

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r13 = this;
            com.vdodsodjsdt.hMtEZx9LFZEOBsEChkiRKnXNYh1GG r0 = com.vdodsodjsdt.hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m
            com.vdodsodjsdt.psATg3LCCdmDIiRgW r1 = r13.ZfQNn8hdWlEQ5cR94249PDsLR
            com.vdodsodjsdt.IvfXhmjM3e3K r2 = r13.V57tEvNfxZVVcOCAOih5PKr()     // Catch: java.lang.Throwable -> L25
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            com.vdodsodjsdt.ej6unYlOWMDF.Ca81ebIan1u(r2, r3)     // Catch: java.lang.Throwable -> L25
            com.vdodsodjsdt.j0kIeYozLt6jOglJu r2 = (com.vdodsodjsdt.j0kIeYozLt6jOglJu) r2     // Catch: java.lang.Throwable -> L25
            com.vdodsodjsdt.tfu79AIgc4CGAZaxd4HhD r3 = r2.ZLZeBXTMq0zDztBxtRTuCHrapQ     // Catch: java.lang.Throwable -> L25
            java.lang.Object r2 = r2.GI83zq0G8e7zkn     // Catch: java.lang.Throwable -> L25
            com.vdodsodjsdt.D73WsmU258PapcWZb45SFW r4 = r3.LaeGQIruHQu81hfJldjMOQSVblH3x()     // Catch: java.lang.Throwable -> L25
            java.lang.Object r2 = com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao.Z1FjjMJ0suz8AFI7gsA4GDLMXv(r4, r2)     // Catch: java.lang.Throwable -> L25
            com.vdodsodjsdt.aqhhl68tQrgIjcMGB3dY2YLK3vN r5 = com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao.ZLZeBXTMq0zDztBxtRTuCHrapQ     // Catch: java.lang.Throwable -> L25
            r6 = 0
            if (r2 == r5) goto L28
            com.vdodsodjsdt.rDVwronXktMoWAubpmvA r5 = com.vdodsodjsdt.KfeOQNOupsCg6878zi4e.GE1sqSYiEYQO2ew7WEZwTtUeS5(r3, r4, r2)     // Catch: java.lang.Throwable -> L25
            goto L29
        L25:
            r2 = move-exception
            goto La1
        L28:
            r5 = r6
        L29:
            com.vdodsodjsdt.D73WsmU258PapcWZb45SFW r7 = r3.LaeGQIruHQu81hfJldjMOQSVblH3x()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r8 = r13.M9e7PWhFYLD2lOGMker()     // Catch: java.lang.Throwable -> L4c
            java.lang.Throwable r9 = r13.zIvmSL0wzmmKGc3X39b2Gw2mUGE(r8)     // Catch: java.lang.Throwable -> L4c
            if (r9 != 0) goto L4e
            int r10 = r13.LaeGQIruHQu81hfJldjMOQSVblH3x     // Catch: java.lang.Throwable -> L4c
            r11 = 1
            if (r10 == r11) goto L41
            r12 = 2
            if (r10 != r12) goto L40
            goto L41
        L40:
            r11 = 0
        L41:
            if (r11 == 0) goto L4e
            com.vdodsodjsdt.IN79WcIk5xB4t0GjRT43qPLs5 r10 = com.vdodsodjsdt.IN79WcIk5xB4t0GjRT43qPLs5.HzCpKshMOoaw76hFcbOVRYMeRd     // Catch: java.lang.Throwable -> L4c
            com.vdodsodjsdt.RKQqw795jswHmdL5AnfuvmeBZD r7 = r7.q11o1hieEkZDhF1MGOZI26oZiDT(r10)     // Catch: java.lang.Throwable -> L4c
            com.vdodsodjsdt.sJ612dvaOBrP4lDkAwxzLpcxONSSp r7 = (com.vdodsodjsdt.sJ612dvaOBrP4lDkAwxzLpcxONSSp) r7     // Catch: java.lang.Throwable -> L4c
            goto L4f
        L4c:
            r3 = move-exception
            goto L95
        L4e:
            r7 = r6
        L4f:
            if (r7 == 0) goto L68
            boolean r10 = r7.VxUQ9tBhpHJ2AAEDNW8sghc4m()     // Catch: java.lang.Throwable -> L4c
            if (r10 != 0) goto L68
            com.vdodsodjsdt.fXGTDnUxIdCVHFvA63E r7 = (com.vdodsodjsdt.fXGTDnUxIdCVHFvA63E) r7     // Catch: java.lang.Throwable -> L4c
            java.util.concurrent.CancellationException r7 = r7.SuB3hEmTmbbRGAhtvOOmfKEon()     // Catch: java.lang.Throwable -> L4c
            r13.zzpBGItXfub0yWj(r8, r7)     // Catch: java.lang.Throwable -> L4c
            com.vdodsodjsdt.OR0CruaKl9s17fPszEbrsfoKYmn r7 = com.vdodsodjsdt.ej6unYlOWMDF.vBGA6pPLqSMuYGvprl270j7(r7)     // Catch: java.lang.Throwable -> L4c
            r3.ZLZeBXTMq0zDztBxtRTuCHrapQ(r7)     // Catch: java.lang.Throwable -> L4c
            goto L79
        L68:
            if (r9 == 0) goto L72
            com.vdodsodjsdt.OR0CruaKl9s17fPszEbrsfoKYmn r7 = com.vdodsodjsdt.ej6unYlOWMDF.vBGA6pPLqSMuYGvprl270j7(r9)     // Catch: java.lang.Throwable -> L4c
            r3.ZLZeBXTMq0zDztBxtRTuCHrapQ(r7)     // Catch: java.lang.Throwable -> L4c
            goto L79
        L72:
            java.lang.Object r7 = r13.NSjgqmGjEzuugn2SsG1mZFP(r8)     // Catch: java.lang.Throwable -> L4c
            r3.ZLZeBXTMq0zDztBxtRTuCHrapQ(r7)     // Catch: java.lang.Throwable -> L4c
        L79:
            if (r5 == 0) goto L81
            boolean r3 = r5.zOk739gUM7zIZC25HHUxoiyixWFjn()     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto L84
        L81:
            com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao.JUdwvN8LfOMa(r4, r2)     // Catch: java.lang.Throwable -> L25
        L84:
            r1.getClass()     // Catch: java.lang.Throwable -> L88
            goto L8d
        L88:
            r0 = move-exception
            com.vdodsodjsdt.OR0CruaKl9s17fPszEbrsfoKYmn r0 = com.vdodsodjsdt.ej6unYlOWMDF.vBGA6pPLqSMuYGvprl270j7(r0)
        L8d:
            java.lang.Throwable r0 = com.vdodsodjsdt.irzKrQ86nQxhDp2QXhxUmPnyA6TkB.VxUQ9tBhpHJ2AAEDNW8sghc4m(r0)
            r13.GI83zq0G8e7zkn(r6, r0)
            goto Lb1
        L95:
            if (r5 == 0) goto L9d
            boolean r5 = r5.zOk739gUM7zIZC25HHUxoiyixWFjn()     // Catch: java.lang.Throwable -> L25
            if (r5 == 0) goto La0
        L9d:
            com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao.JUdwvN8LfOMa(r4, r2)     // Catch: java.lang.Throwable -> L25
        La0:
            throw r3     // Catch: java.lang.Throwable -> L25
        La1:
            r1.getClass()     // Catch: java.lang.Throwable -> La5
            goto Laa
        La5:
            r0 = move-exception
            com.vdodsodjsdt.OR0CruaKl9s17fPszEbrsfoKYmn r0 = com.vdodsodjsdt.ej6unYlOWMDF.vBGA6pPLqSMuYGvprl270j7(r0)
        Laa:
            java.lang.Throwable r0 = com.vdodsodjsdt.irzKrQ86nQxhDp2QXhxUmPnyA6TkB.VxUQ9tBhpHJ2AAEDNW8sghc4m(r0)
            r13.GI83zq0G8e7zkn(r2, r0)
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.jVaNsOYs2UVt.run():void");
    }

    public Throwable zIvmSL0wzmmKGc3X39b2Gw2mUGE(Object obj) {
        XpG0A5IpJsSX9uJPSmP4WwTAl xpG0A5IpJsSX9uJPSmP4WwTAl = obj instanceof XpG0A5IpJsSX9uJPSmP4WwTAl ? (XpG0A5IpJsSX9uJPSmP4WwTAl) obj : null;
        if (xpG0A5IpJsSX9uJPSmP4WwTAl != null) {
            return xpG0A5IpJsSX9uJPSmP4WwTAl.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        }
        return null;
    }

    public abstract void zzpBGItXfub0yWj(Object obj, CancellationException cancellationException);

    public Object NSjgqmGjEzuugn2SsG1mZFP(Object obj) {
        return obj;
    }
}
