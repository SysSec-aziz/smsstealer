package com.vdodsodjsdt;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class hkOLVejSEWXUiK2HQlr9P2Z9 implements Comparable {
    public boolean V57tEvNfxZVVcOCAOih5PKr;
    public float ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public int p59rPv72J9;
    public int ZfQNn8hdWlEQ5cR94249PDsLR = -1;
    public int LaeGQIruHQu81hfJldjMOQSVblH3x = -1;
    public int zIvmSL0wzmmKGc3X39b2Gw2mUGE = 0;
    public boolean NSjgqmGjEzuugn2SsG1mZFP = false;
    public final float[] GI83zq0G8e7zkn = new float[9];
    public final float[] M9e7PWhFYLD2lOGMker = new float[9];
    public Ho5xN6K0JbsdCx5JGD[] HzCpKshMOoaw76hFcbOVRYMeRd = new Ho5xN6K0JbsdCx5JGD[16];
    public int KUYypEB4eNWOZWVDpH = 0;
    public int q1wNbhk2O6 = 0;

    public hkOLVejSEWXUiK2HQlr9P2Z9(int i) {
        this.p59rPv72J9 = i;
    }

    public final void LaeGQIruHQu81hfJldjMOQSVblH3x(uij8Ij9SZKI0vaNotiNzH uij8ij9szki0vanotinzh, Ho5xN6K0JbsdCx5JGD ho5xN6K0JbsdCx5JGD) {
        int i = this.KUYypEB4eNWOZWVDpH;
        for (int i2 = 0; i2 < i; i2++) {
            this.HzCpKshMOoaw76hFcbOVRYMeRd[i2].GI83zq0G8e7zkn(uij8ij9szki0vanotinzh, ho5xN6K0JbsdCx5JGD, false);
        }
        this.KUYypEB4eNWOZWVDpH = 0;
    }

    public final void V57tEvNfxZVVcOCAOih5PKr() {
        this.p59rPv72J9 = 5;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = 0;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = -1;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = -1;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = 0.0f;
        this.NSjgqmGjEzuugn2SsG1mZFP = false;
        int i = this.KUYypEB4eNWOZWVDpH;
        for (int i2 = 0; i2 < i; i2++) {
            this.HzCpKshMOoaw76hFcbOVRYMeRd[i2] = null;
        }
        this.KUYypEB4eNWOZWVDpH = 0;
        this.q1wNbhk2O6 = 0;
        this.V57tEvNfxZVVcOCAOih5PKr = false;
        Arrays.fill(this.M9e7PWhFYLD2lOGMker, 0.0f);
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(Ho5xN6K0JbsdCx5JGD ho5xN6K0JbsdCx5JGD) {
        int i = 0;
        while (true) {
            int i2 = this.KUYypEB4eNWOZWVDpH;
            if (i >= i2) {
                Ho5xN6K0JbsdCx5JGD[] ho5xN6K0JbsdCx5JGDArr = this.HzCpKshMOoaw76hFcbOVRYMeRd;
                if (i2 >= ho5xN6K0JbsdCx5JGDArr.length) {
                    this.HzCpKshMOoaw76hFcbOVRYMeRd = (Ho5xN6K0JbsdCx5JGD[]) Arrays.copyOf(ho5xN6K0JbsdCx5JGDArr, ho5xN6K0JbsdCx5JGDArr.length * 2);
                }
                Ho5xN6K0JbsdCx5JGD[] ho5xN6K0JbsdCx5JGDArr2 = this.HzCpKshMOoaw76hFcbOVRYMeRd;
                int i3 = this.KUYypEB4eNWOZWVDpH;
                ho5xN6K0JbsdCx5JGDArr2[i3] = ho5xN6K0JbsdCx5JGD;
                this.KUYypEB4eNWOZWVDpH = i3 + 1;
                return;
            }
            if (this.HzCpKshMOoaw76hFcbOVRYMeRd[i] == ho5xN6K0JbsdCx5JGD) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR(uij8Ij9SZKI0vaNotiNzH uij8ij9szki0vanotinzh, float f) {
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = f;
        this.NSjgqmGjEzuugn2SsG1mZFP = true;
        int i = this.KUYypEB4eNWOZWVDpH;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.HzCpKshMOoaw76hFcbOVRYMeRd[i2].NSjgqmGjEzuugn2SsG1mZFP(uij8ij9szki0vanotinzh, this, false);
        }
        this.KUYypEB4eNWOZWVDpH = 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR - ((hkOLVejSEWXUiK2HQlr9P2Z9) obj).ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    public final String toString() {
        return "" + this.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    public final void zzpBGItXfub0yWj(Ho5xN6K0JbsdCx5JGD ho5xN6K0JbsdCx5JGD) {
        int i = this.KUYypEB4eNWOZWVDpH;
        int i2 = 0;
        while (i2 < i) {
            if (this.HzCpKshMOoaw76hFcbOVRYMeRd[i2] == ho5xN6K0JbsdCx5JGD) {
                while (i2 < i - 1) {
                    Ho5xN6K0JbsdCx5JGD[] ho5xN6K0JbsdCx5JGDArr = this.HzCpKshMOoaw76hFcbOVRYMeRd;
                    int i3 = i2 + 1;
                    ho5xN6K0JbsdCx5JGDArr[i2] = ho5xN6K0JbsdCx5JGDArr[i3];
                    i2 = i3;
                }
                this.KUYypEB4eNWOZWVDpH--;
                return;
            }
            i2++;
        }
    }
}
