package com.vdodsodjsdt;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class ZxVLD9H77Z62NUllXp {
    public static volatile ZxVLD9H77Z62NUllXp HzCpKshMOoaw76hFcbOVRYMeRd;
    public static final Object M9e7PWhFYLD2lOGMker = new Object();
    public final wsqHCLtouHBbS4err7j GI83zq0G8e7zkn;
    public final kwpQ2cITbiO8uSwWuGlUDM7X7GE LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final int NSjgqmGjEzuugn2SsG1mZFP;
    public volatile int V57tEvNfxZVVcOCAOih5PKr;
    public final ReentrantReadWriteLock VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final FG8LIxsgYiLSfhN0jYKIKr ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final Handler ZfQNn8hdWlEQ5cR94249PDsLR;
    public final kpXzRIgLxQiglBj zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final DBkPCwg2bk zzpBGItXfub0yWj;

    public ZxVLD9H77Z62NUllXp(scWJtRrcQpw1SO8qayAb4dT2LAw scwjtrrcqpw1so8qayab4dt2law) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = reentrantReadWriteLock;
        this.V57tEvNfxZVVcOCAOih5PKr = 3;
        kpXzRIgLxQiglBj kpxzriglxqiglbj = (kpXzRIgLxQiglBj) scwjtrrcqpw1so8qayab4dt2law.zzpBGItXfub0yWj;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = kpxzriglxqiglbj;
        int i = scwjtrrcqpw1so8qayab4dt2law.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        this.NSjgqmGjEzuugn2SsG1mZFP = i;
        this.GI83zq0G8e7zkn = (wsqHCLtouHBbS4err7j) scwjtrrcqpw1so8qayab4dt2law.V57tEvNfxZVVcOCAOih5PKr;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = new Handler(Looper.getMainLooper());
        this.zzpBGItXfub0yWj = new DBkPCwg2bk();
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = new FG8LIxsgYiLSfhN0jYKIKr(3);
        kwpQ2cITbiO8uSwWuGlUDM7X7GE kwpq2citbio8uswwugludm7x7ge = new kwpQ2cITbiO8uSwWuGlUDM7X7GE(this);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = kwpq2citbio8uswwugludm7x7ge;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.V57tEvNfxZVVcOCAOih5PKr = 0;
            } catch (Throwable th) {
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (zzpBGItXfub0yWj() == 0) {
            try {
                kpxzriglxqiglbj.VxUQ9tBhpHJ2AAEDNW8sghc4m(new hIcWfKoe5m0vknpcm6sJ0(kwpq2citbio8uswwugludm7x7ge));
            } catch (Throwable th2) {
                ZfQNn8hdWlEQ5cR94249PDsLR(th2);
            }
        }
    }

    public static ZxVLD9H77Z62NUllXp VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        ZxVLD9H77Z62NUllXp zxVLD9H77Z62NUllXp;
        synchronized (M9e7PWhFYLD2lOGMker) {
            try {
                zxVLD9H77Z62NUllXp = HzCpKshMOoaw76hFcbOVRYMeRd;
                if (!(zxVLD9H77Z62NUllXp != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return zxVLD9H77Z62NUllXp;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f A[Catch: all -> 0x0082, TRY_ENTER, TryCatch #0 {all -> 0x0082, blocks: (B:32:0x005a, B:35:0x005f, B:37:0x0063, B:39:0x0070, B:46:0x008f, B:48:0x0099, B:50:0x009c, B:52:0x009f, B:54:0x00af, B:55:0x00b2), top: B:93:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009f A[Catch: all -> 0x0082, TryCatch #0 {all -> 0x0082, blocks: (B:32:0x005a, B:35:0x005f, B:37:0x0063, B:39:0x0070, B:46:0x008f, B:48:0x0099, B:50:0x009c, B:52:0x009f, B:54:0x00af, B:55:0x00b2), top: B:93:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c1 A[Catch: all -> 0x00f6, TRY_ENTER, TryCatch #1 {all -> 0x00f6, blocks: (B:59:0x00c1, B:62:0x00c9, B:64:0x00cf, B:44:0x0085), top: B:95:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence LaeGQIruHQu81hfJldjMOQSVblH3x(java.lang.CharSequence r11, int r12, int r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.ZxVLD9H77Z62NUllXp.LaeGQIruHQu81hfJldjMOQSVblH3x(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    public final void V57tEvNfxZVVcOCAOih5PKr() {
        if (!(this.NSjgqmGjEzuugn2SsG1mZFP == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (zzpBGItXfub0yWj() == 1) {
            return;
        }
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.writeLock().lock();
        try {
            if (this.V57tEvNfxZVVcOCAOih5PKr == 0) {
                return;
            }
            this.V57tEvNfxZVVcOCAOih5PKr = 0;
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m.writeLock().unlock();
            kwpQ2cITbiO8uSwWuGlUDM7X7GE kwpq2citbio8uswwugludm7x7ge = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            ZxVLD9H77Z62NUllXp zxVLD9H77Z62NUllXp = kwpq2citbio8uswwugludm7x7ge.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            try {
                zxVLD9H77Z62NUllXp.zIvmSL0wzmmKGc3X39b2Gw2mUGE.VxUQ9tBhpHJ2AAEDNW8sghc4m(new hIcWfKoe5m0vknpcm6sJ0(kwpq2citbio8uswwugludm7x7ge));
            } catch (Throwable th) {
                zxVLD9H77Z62NUllXp.ZfQNn8hdWlEQ5cR94249PDsLR(th);
            }
        } finally {
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m.writeLock().unlock();
        }
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.writeLock().lock();
        try {
            this.V57tEvNfxZVVcOCAOih5PKr = 2;
            arrayList.addAll(this.zzpBGItXfub0yWj);
            this.zzpBGItXfub0yWj.clear();
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m.writeLock().unlock();
            this.ZfQNn8hdWlEQ5cR94249PDsLR.post(new WRVe1iRhTJq3tx(arrayList, this.V57tEvNfxZVVcOCAOih5PKr, th));
        } catch (Throwable th2) {
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m.writeLock().unlock();
            throw th2;
        }
    }

    public final void zIvmSL0wzmmKGc3X39b2Gw2mUGE(kfY5YDtDv6dzFxBj kfy5ydtdv6dzfxbj) {
        KfeOQNOupsCg6878zi4e.KUYypEB4eNWOZWVDpH(kfy5ydtdv6dzfxbj, "initCallback cannot be null");
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.writeLock().lock();
        try {
            if (this.V57tEvNfxZVVcOCAOih5PKr == 1 || this.V57tEvNfxZVVcOCAOih5PKr == 2) {
                this.ZfQNn8hdWlEQ5cR94249PDsLR.post(new WRVe1iRhTJq3tx(Arrays.asList(kfy5ydtdv6dzfxbj), this.V57tEvNfxZVVcOCAOih5PKr, (Throwable) null));
            } else {
                this.zzpBGItXfub0yWj.add(kfy5ydtdv6dzfxbj);
            }
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m.writeLock().unlock();
        } catch (Throwable th) {
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m.writeLock().unlock();
            throw th;
        }
    }

    public final int zzpBGItXfub0yWj() {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.readLock().lock();
        try {
            return this.V57tEvNfxZVVcOCAOih5PKr;
        } finally {
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m.readLock().unlock();
        }
    }
}
