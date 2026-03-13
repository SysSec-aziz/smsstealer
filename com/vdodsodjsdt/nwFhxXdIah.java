package com.vdodsodjsdt;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class nwFhxXdIah {
    public final long V57tEvNfxZVVcOCAOih5PKr;
    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final long ZfQNn8hdWlEQ5cR94249PDsLR;
    public final int zzpBGItXfub0yWj;

    public nwFhxXdIah(int i, int i2, long j, long j2) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        this.zzpBGItXfub0yWj = i2;
        this.V57tEvNfxZVVcOCAOih5PKr = j;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = j2;
    }

    public static nwFhxXdIah VxUQ9tBhpHJ2AAEDNW8sghc4m(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            nwFhxXdIah nwfhxxdiah = new nwFhxXdIah(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return nwfhxxdiah;
        } finally {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof nwFhxXdIah)) {
            nwFhxXdIah nwfhxxdiah = (nwFhxXdIah) obj;
            if (this.zzpBGItXfub0yWj == nwfhxxdiah.zzpBGItXfub0yWj && this.V57tEvNfxZVVcOCAOih5PKr == nwfhxxdiah.V57tEvNfxZVVcOCAOih5PKr && this.VxUQ9tBhpHJ2AAEDNW8sghc4m == nwfhxxdiah.VxUQ9tBhpHJ2AAEDNW8sghc4m && this.ZfQNn8hdWlEQ5cR94249PDsLR == nwfhxxdiah.ZfQNn8hdWlEQ5cR94249PDsLR) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.zzpBGItXfub0yWj), Long.valueOf(this.V57tEvNfxZVVcOCAOih5PKr), Integer.valueOf(this.VxUQ9tBhpHJ2AAEDNW8sghc4m), Long.valueOf(this.ZfQNn8hdWlEQ5cR94249PDsLR));
    }

    public final void zzpBGItXfub0yWj(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.VxUQ9tBhpHJ2AAEDNW8sghc4m);
            dataOutputStream.writeInt(this.zzpBGItXfub0yWj);
            dataOutputStream.writeLong(this.V57tEvNfxZVVcOCAOih5PKr);
            dataOutputStream.writeLong(this.ZfQNn8hdWlEQ5cR94249PDsLR);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
