package com.vdodsodjsdt;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class uSwMtrrFsGroJ7T5fAxDxv {
    public static final HashMap LaeGQIruHQu81hfJldjMOQSVblH3x = new HashMap();
    public final Lock V57tEvNfxZVVcOCAOih5PKr;
    public final boolean VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public FileChannel ZfQNn8hdWlEQ5cR94249PDsLR;
    public final File zzpBGItXfub0yWj;

    public uSwMtrrFsGroJ7T5fAxDxv(String str, File file, boolean z) {
        Lock lock;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = z;
        this.zzpBGItXfub0yWj = file != null ? new File(file, str.concat(".lck")) : null;
        HashMap map = LaeGQIruHQu81hfJldjMOQSVblH3x;
        synchronized (map) {
            try {
                Object reentrantLock = map.get(str);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(str, reentrantLock);
                }
                lock = (Lock) reentrantLock;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.V57tEvNfxZVVcOCAOih5PKr = lock;
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(boolean z) {
        this.V57tEvNfxZVVcOCAOih5PKr.lock();
        if (z) {
            File file = this.zzpBGItXfub0yWj;
            try {
                if (file == null) {
                    throw new IOException("No lock directory was provided.");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                channel.lock();
                this.ZfQNn8hdWlEQ5cR94249PDsLR = channel;
            } catch (IOException e) {
                this.ZfQNn8hdWlEQ5cR94249PDsLR = null;
                Log.w("SupportSQLiteLock", "Unable to grab file lock.", e);
            }
        }
    }

    public final void zzpBGItXfub0yWj() {
        try {
            FileChannel fileChannel = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.V57tEvNfxZVVcOCAOih5PKr.unlock();
    }
}
