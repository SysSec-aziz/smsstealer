package com.vdodsodjsdt;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class xgjEDGKy9VX5 implements M9zmSQ9uvfJjc32nUm5k6W1oN, VFqnQARHTng {
    public static final TreeMap HzCpKshMOoaw76hFcbOVRYMeRd = new TreeMap();
    public final int[] GI83zq0G8e7zkn;
    public final long[] LaeGQIruHQu81hfJldjMOQSVblH3x;
    public int M9e7PWhFYLD2lOGMker;
    public final byte[][] NSjgqmGjEzuugn2SsG1mZFP;
    public final int V57tEvNfxZVVcOCAOih5PKr;
    public final String[] ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public volatile String ZfQNn8hdWlEQ5cR94249PDsLR;
    public final double[] zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public xgjEDGKy9VX5(int i) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        int i2 = i + 1;
        this.GI83zq0G8e7zkn = new int[i2];
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = new long[i2];
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = new double[i2];
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = new String[i2];
        this.NSjgqmGjEzuugn2SsG1mZFP = new byte[i2][];
    }

    public static final xgjEDGKy9VX5 VxUQ9tBhpHJ2AAEDNW8sghc4m(String str, int i) {
        TreeMap treeMap = HzCpKshMOoaw76hFcbOVRYMeRd;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (entryCeilingEntry == null) {
                xgjEDGKy9VX5 xgjedgky9vx5 = new xgjEDGKy9VX5(i);
                xgjedgky9vx5.ZfQNn8hdWlEQ5cR94249PDsLR = str;
                xgjedgky9vx5.M9e7PWhFYLD2lOGMker = i;
                return xgjedgky9vx5;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            xgjEDGKy9VX5 xgjedgky9vx52 = (xgjEDGKy9VX5) entryCeilingEntry.getValue();
            xgjedgky9vx52.ZfQNn8hdWlEQ5cR94249PDsLR = str;
            xgjedgky9vx52.M9e7PWhFYLD2lOGMker = i;
            return xgjedgky9vx52;
        }
    }

    @Override // com.vdodsodjsdt.VFqnQARHTng
    public final void GI83zq0G8e7zkn(int i, double d) {
        this.GI83zq0G8e7zkn[i] = 3;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE[i] = d;
    }

    @Override // com.vdodsodjsdt.M9zmSQ9uvfJjc32nUm5k6W1oN
    public final void LaeGQIruHQu81hfJldjMOQSVblH3x(VFqnQARHTng vFqnQARHTng) {
        int i = this.M9e7PWhFYLD2lOGMker;
        if (1 > i) {
            return;
        }
        int i2 = 1;
        while (true) {
            int i3 = this.GI83zq0G8e7zkn[i2];
            if (i3 == 1) {
                vFqnQARHTng.ZLZeBXTMq0zDztBxtRTuCHrapQ(i2);
            } else if (i3 == 2) {
                vFqnQARHTng.p59rPv72J9(i2, this.LaeGQIruHQu81hfJldjMOQSVblH3x[i2]);
            } else if (i3 == 3) {
                vFqnQARHTng.GI83zq0G8e7zkn(i2, this.zIvmSL0wzmmKGc3X39b2Gw2mUGE[i2]);
            } else if (i3 == 4) {
                String str = this.ZLZeBXTMq0zDztBxtRTuCHrapQ[i2];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                vFqnQARHTng.f6ZQsR6bPLvvCDNXOUc(str, i2);
            } else if (i3 == 5) {
                byte[] bArr = this.NSjgqmGjEzuugn2SsG1mZFP[i2];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                vFqnQARHTng.jW7EiD0YL6xkbB158jMUzhWNWb1y(i2, bArr);
            }
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void M9e7PWhFYLD2lOGMker() {
        TreeMap treeMap = HzCpKshMOoaw76hFcbOVRYMeRd;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.V57tEvNfxZVVcOCAOih5PKr), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    @Override // com.vdodsodjsdt.M9zmSQ9uvfJjc32nUm5k6W1oN
    public final String V57tEvNfxZVVcOCAOih5PKr() {
        String str = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // com.vdodsodjsdt.VFqnQARHTng
    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ(int i) {
        this.GI83zq0G8e7zkn[i] = 1;
    }

    @Override // com.vdodsodjsdt.VFqnQARHTng
    public final void f6ZQsR6bPLvvCDNXOUc(String str, int i) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "value");
        this.GI83zq0G8e7zkn[i] = 4;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ[i] = str;
    }

    @Override // com.vdodsodjsdt.VFqnQARHTng
    public final void jW7EiD0YL6xkbB158jMUzhWNWb1y(int i, byte[] bArr) {
        this.GI83zq0G8e7zkn[i] = 5;
        this.NSjgqmGjEzuugn2SsG1mZFP[i] = bArr;
    }

    @Override // com.vdodsodjsdt.VFqnQARHTng
    public final void p59rPv72J9(int i, long j) {
        this.GI83zq0G8e7zkn[i] = 2;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x[i] = j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
