package com.vdodsodjsdt;

import android.os.Build;
import android.window.BackEvent;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class T5eDMfOLHVGf0WqS2ry {
    public final long LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final float V57tEvNfxZVVcOCAOih5PKr;
    public final float VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final int ZfQNn8hdWlEQ5cR94249PDsLR;
    public final float zzpBGItXfub0yWj;

    public T5eDMfOLHVGf0WqS2ry(BackEvent backEvent) {
        float fHzCpKshMOoaw76hFcbOVRYMeRd = lCRYuW4DMv8M.HzCpKshMOoaw76hFcbOVRYMeRd(backEvent);
        float fKUYypEB4eNWOZWVDpH = lCRYuW4DMv8M.KUYypEB4eNWOZWVDpH(backEvent);
        float fNSjgqmGjEzuugn2SsG1mZFP = lCRYuW4DMv8M.NSjgqmGjEzuugn2SsG1mZFP(backEvent);
        int iM9e7PWhFYLD2lOGMker = lCRYuW4DMv8M.M9e7PWhFYLD2lOGMker(backEvent);
        long jZzpBGItXfub0yWj = Build.VERSION.SDK_INT >= 36 ? TsD9eeztji4NblKmSt11.zzpBGItXfub0yWj(backEvent) : 0L;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = fHzCpKshMOoaw76hFcbOVRYMeRd;
        this.zzpBGItXfub0yWj = fKUYypEB4eNWOZWVDpH;
        this.V57tEvNfxZVVcOCAOih5PKr = fNSjgqmGjEzuugn2SsG1mZFP;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = iM9e7PWhFYLD2lOGMker;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = jZzpBGItXfub0yWj;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.VxUQ9tBhpHJ2AAEDNW8sghc4m + ", touchY=" + this.zzpBGItXfub0yWj + ", progress=" + this.V57tEvNfxZVVcOCAOih5PKr + ", swipeEdge=" + this.ZfQNn8hdWlEQ5cR94249PDsLR + ", frameTimeMillis=" + this.LaeGQIruHQu81hfJldjMOQSVblH3x + '}';
    }
}
