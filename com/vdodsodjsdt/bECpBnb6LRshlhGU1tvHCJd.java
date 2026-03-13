package com.vdodsodjsdt;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class bECpBnb6LRshlhGU1tvHCJd implements Closeable {
    public static final Logger NSjgqmGjEzuugn2SsG1mZFP = Logger.getLogger(tFVUzh05cCwb.class.getName());
    public int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final zvqhqc7YVxGqa3qIRo V57tEvNfxZVVcOCAOih5PKr;
    public final nFFJFOn6wSChD0eG ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final EouCzLZsW9ynithduh ZfQNn8hdWlEQ5cR94249PDsLR;
    public boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public bECpBnb6LRshlhGU1tvHCJd(zvqhqc7YVxGqa3qIRo zvqhqc7yvxgqa3qiro) {
        ej6unYlOWMDF.pYmKDYlAmhudp(zvqhqc7yvxgqa3qiro, "sink");
        this.V57tEvNfxZVVcOCAOih5PKr = zvqhqc7yvxgqa3qiro;
        EouCzLZsW9ynithduh eouCzLZsW9ynithduh = new EouCzLZsW9ynithduh();
        this.ZfQNn8hdWlEQ5cR94249PDsLR = eouCzLZsW9ynithduh;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = 16384;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = new nFFJFOn6wSChD0eG(eouCzLZsW9ynithduh);
    }

    public final void KUYypEB4eNWOZWVDpH(boolean z, int i, ArrayList arrayList) {
        synchronized (this) {
            if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
                throw new IOException("closed");
            }
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ.ZfQNn8hdWlEQ5cR94249PDsLR(arrayList);
            long j = this.ZfQNn8hdWlEQ5cR94249PDsLR.ZfQNn8hdWlEQ5cR94249PDsLR;
            long jMin = Math.min(this.LaeGQIruHQu81hfJldjMOQSVblH3x, j);
            int i2 = j == jMin ? 4 : 0;
            if (z) {
                i2 |= 1;
            }
            LaeGQIruHQu81hfJldjMOQSVblH3x(i, (int) jMin, 1, i2);
            this.V57tEvNfxZVVcOCAOih5PKr.Ca81ebIan1u(jMin, this.ZfQNn8hdWlEQ5cR94249PDsLR);
            if (j > jMin) {
                long j2 = j - jMin;
                while (j2 > 0) {
                    long jMin2 = Math.min(this.LaeGQIruHQu81hfJldjMOQSVblH3x, j2);
                    j2 -= jMin2;
                    LaeGQIruHQu81hfJldjMOQSVblH3x(i, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                    this.V57tEvNfxZVVcOCAOih5PKr.Ca81ebIan1u(jMin2, this.ZfQNn8hdWlEQ5cR94249PDsLR);
                }
            }
        }
    }

    public final void LaeGQIruHQu81hfJldjMOQSVblH3x(int i, int i2, int i3, int i4) {
        if (i3 != 8) {
            Level level = Level.FINE;
            Logger logger = NSjgqmGjEzuugn2SsG1mZFP;
            if (logger.isLoggable(level)) {
                logger.fine(tFVUzh05cCwb.zzpBGItXfub0yWj(false, i, i2, i3, i4));
            }
        }
        if (i2 > this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.LaeGQIruHQu81hfJldjMOQSVblH3x + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(u9SlVAuoWhQUfJ.NSjgqmGjEzuugn2SsG1mZFP("reserved bit set: ", i).toString());
        }
        byte[] bArr = jHlOQHj3hlCsydfI7r5ApVdQjYvKf.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        zvqhqc7YVxGqa3qIRo zvqhqc7yvxgqa3qiro = this.V57tEvNfxZVVcOCAOih5PKr;
        ej6unYlOWMDF.pYmKDYlAmhudp(zvqhqc7yvxgqa3qiro, "<this>");
        zvqhqc7yvxgqa3qiro.writeByte((i2 >>> 16) & 255);
        zvqhqc7yvxgqa3qiro.writeByte((i2 >>> 8) & 255);
        zvqhqc7yvxgqa3qiro.writeByte(i2 & 255);
        zvqhqc7yvxgqa3qiro.writeByte(i3 & 255);
        zvqhqc7yvxgqa3qiro.writeByte(i4 & 255);
        zvqhqc7yvxgqa3qiro.writeInt(i & Integer.MAX_VALUE);
    }

    public final void M9e7PWhFYLD2lOGMker(int i, sRSjJ4B4UdKzPCFBE srsjj4b4udkzpcfbe, byte[] bArr) {
        synchronized (this) {
            if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
                throw new IOException("closed");
            }
            if (srsjj4b4udkzpcfbe.V57tEvNfxZVVcOCAOih5PKr == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            LaeGQIruHQu81hfJldjMOQSVblH3x(0, bArr.length + 8, 7, 0);
            this.V57tEvNfxZVVcOCAOih5PKr.writeInt(i);
            this.V57tEvNfxZVVcOCAOih5PKr.writeInt(srsjj4b4udkzpcfbe.V57tEvNfxZVVcOCAOih5PKr);
            if (bArr.length != 0) {
                this.V57tEvNfxZVVcOCAOih5PKr.write(bArr);
            }
            this.V57tEvNfxZVVcOCAOih5PKr.flush();
        }
    }

    public final void RhfGHxtXxy0M0grmp2jkRjQg(int i, sRSjJ4B4UdKzPCFBE srsjj4b4udkzpcfbe) {
        synchronized (this) {
            if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
                throw new IOException("closed");
            }
            if (srsjj4b4udkzpcfbe.V57tEvNfxZVVcOCAOih5PKr == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            LaeGQIruHQu81hfJldjMOQSVblH3x(i, 4, 3, 0);
            this.V57tEvNfxZVVcOCAOih5PKr.writeInt(srsjj4b4udkzpcfbe.V57tEvNfxZVVcOCAOih5PKr);
            this.V57tEvNfxZVVcOCAOih5PKr.flush();
        }
    }

    public final void SuB3hEmTmbbRGAhtvOOmfKEon(int i, long j) {
        synchronized (this) {
            try {
                if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
                    throw new IOException("closed");
                }
                if (j == 0 || j > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                }
                Logger logger = NSjgqmGjEzuugn2SsG1mZFP;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(tFVUzh05cCwb.V57tEvNfxZVVcOCAOih5PKr(false, i, 4, j));
                }
                LaeGQIruHQu81hfJldjMOQSVblH3x(i, 4, 8, 0);
                this.V57tEvNfxZVVcOCAOih5PKr.writeInt((int) j);
                this.V57tEvNfxZVVcOCAOih5PKr.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void V57tEvNfxZVVcOCAOih5PKr(boolean z, int i, EouCzLZsW9ynithduh eouCzLZsW9ynithduh, int i2) {
        synchronized (this) {
            if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
                throw new IOException("closed");
            }
            LaeGQIruHQu81hfJldjMOQSVblH3x(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                zvqhqc7YVxGqa3qIRo zvqhqc7yvxgqa3qiro = this.V57tEvNfxZVVcOCAOih5PKr;
                ej6unYlOWMDF.p59rPv72J9(eouCzLZsW9ynithduh);
                zvqhqc7yvxgqa3qiro.Ca81ebIan1u(i2, eouCzLZsW9ynithduh);
            }
        }
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(bof4DtY4zFmy9PX46PcOrxENM bof4dty4zfmy9px46pcorxenm) {
        ej6unYlOWMDF.pYmKDYlAmhudp(bof4dty4zfmy9px46pcorxenm, "peerSettings");
        synchronized (this) {
            try {
                if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
                    throw new IOException("closed");
                }
                int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                int i2 = bof4dty4zfmy9px46pcorxenm.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                if ((i2 & 32) != 0) {
                    i = bof4dty4zfmy9px46pcorxenm.zzpBGItXfub0yWj[5];
                }
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = i;
                if (((i2 & 2) != 0 ? bof4dty4zfmy9px46pcorxenm.zzpBGItXfub0yWj[1] : -1) != -1) {
                    nFFJFOn6wSChD0eG nffjfon6wschd0eg = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                    int i3 = (i2 & 2) != 0 ? bof4dty4zfmy9px46pcorxenm.zzpBGItXfub0yWj[1] : -1;
                    nffjfon6wschd0eg.getClass();
                    int iMin = Math.min(i3, 16384);
                    int i4 = nffjfon6wschd0eg.ZfQNn8hdWlEQ5cR94249PDsLR;
                    if (i4 != iMin) {
                        if (iMin < i4) {
                            nffjfon6wschd0eg.zzpBGItXfub0yWj = Math.min(nffjfon6wschd0eg.zzpBGItXfub0yWj, iMin);
                        }
                        nffjfon6wschd0eg.V57tEvNfxZVVcOCAOih5PKr = true;
                        nffjfon6wschd0eg.ZfQNn8hdWlEQ5cR94249PDsLR = iMin;
                        int i5 = nffjfon6wschd0eg.NSjgqmGjEzuugn2SsG1mZFP;
                        if (iMin < i5) {
                            if (iMin == 0) {
                                KK6EHiwUVZvS[] kK6EHiwUVZvSArr = nffjfon6wschd0eg.LaeGQIruHQu81hfJldjMOQSVblH3x;
                                vmp19D2MODlOL.BDoqAMf0rlMRAnVghjC4qjG(kK6EHiwUVZvSArr, null, 0, kK6EHiwUVZvSArr.length);
                                nffjfon6wschd0eg.zIvmSL0wzmmKGc3X39b2Gw2mUGE = nffjfon6wschd0eg.LaeGQIruHQu81hfJldjMOQSVblH3x.length - 1;
                                nffjfon6wschd0eg.ZLZeBXTMq0zDztBxtRTuCHrapQ = 0;
                                nffjfon6wschd0eg.NSjgqmGjEzuugn2SsG1mZFP = 0;
                            } else {
                                nffjfon6wschd0eg.VxUQ9tBhpHJ2AAEDNW8sghc4m(i5 - iMin);
                            }
                        }
                    }
                }
                LaeGQIruHQu81hfJldjMOQSVblH3x(0, 0, 4, 1);
                this.V57tEvNfxZVVcOCAOih5PKr.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = true;
            this.V57tEvNfxZVVcOCAOih5PKr.close();
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
                throw new IOException("closed");
            }
            this.V57tEvNfxZVVcOCAOih5PKr.flush();
        }
    }

    public final void q11o1hieEkZDhF1MGOZI26oZiDT(int i, int i2, boolean z) {
        synchronized (this) {
            if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
                throw new IOException("closed");
            }
            LaeGQIruHQu81hfJldjMOQSVblH3x(0, 8, 6, z ? 1 : 0);
            this.V57tEvNfxZVVcOCAOih5PKr.writeInt(i);
            this.V57tEvNfxZVVcOCAOih5PKr.writeInt(i2);
            this.V57tEvNfxZVVcOCAOih5PKr.flush();
        }
    }
}
