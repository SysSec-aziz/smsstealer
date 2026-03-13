package com.vdodsodjsdt;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class yu7uov4Y2Pl6f0G4nvxUNG {
    public int GI83zq0G8e7zkn;
    public boolean[] HzCpKshMOoaw76hFcbOVRYMeRd;
    public int KUYypEB4eNWOZWVDpH;
    public float[] LaeGQIruHQu81hfJldjMOQSVblH3x;
    public int[] M9e7PWhFYLD2lOGMker;
    public String[] NSjgqmGjEzuugn2SsG1mZFP;
    public int V57tEvNfxZVVcOCAOih5PKr;
    public int[] VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public int[] ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public int[] ZfQNn8hdWlEQ5cR94249PDsLR;
    public int zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public int[] zzpBGItXfub0yWj;

    public final void V57tEvNfxZVVcOCAOih5PKr(int i, boolean z) {
        int i2 = this.KUYypEB4eNWOZWVDpH;
        int[] iArr = this.M9e7PWhFYLD2lOGMker;
        if (i2 >= iArr.length) {
            this.M9e7PWhFYLD2lOGMker = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.HzCpKshMOoaw76hFcbOVRYMeRd;
            this.HzCpKshMOoaw76hFcbOVRYMeRd = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.M9e7PWhFYLD2lOGMker;
        int i3 = this.KUYypEB4eNWOZWVDpH;
        iArr2[i3] = i;
        boolean[] zArr2 = this.HzCpKshMOoaw76hFcbOVRYMeRd;
        this.KUYypEB4eNWOZWVDpH = i3 + 1;
        zArr2[i3] = z;
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(int i, float f) {
        int i2 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        int[] iArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (i2 >= iArr.length) {
            this.ZfQNn8hdWlEQ5cR94249PDsLR = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        int i3 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        iArr2[i3] = i;
        float[] fArr2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = i3 + 1;
        fArr2[i3] = f;
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR(String str, int i) {
        int i2 = this.GI83zq0G8e7zkn;
        int[] iArr = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (i2 >= iArr.length) {
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.NSjgqmGjEzuugn2SsG1mZFP;
            this.NSjgqmGjEzuugn2SsG1mZFP = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        int i3 = this.GI83zq0G8e7zkn;
        iArr2[i3] = i;
        String[] strArr2 = this.NSjgqmGjEzuugn2SsG1mZFP;
        this.GI83zq0G8e7zkn = i3 + 1;
        strArr2[i3] = str;
    }

    public final void zzpBGItXfub0yWj(int i, int i2) {
        int i3 = this.V57tEvNfxZVVcOCAOih5PKr;
        int[] iArr = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (i3 >= iArr.length) {
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.zzpBGItXfub0yWj;
            this.zzpBGItXfub0yWj = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int i4 = this.V57tEvNfxZVVcOCAOih5PKr;
        iArr3[i4] = i;
        int[] iArr4 = this.zzpBGItXfub0yWj;
        this.V57tEvNfxZVVcOCAOih5PKr = i4 + 1;
        iArr4[i4] = i2;
    }
}
