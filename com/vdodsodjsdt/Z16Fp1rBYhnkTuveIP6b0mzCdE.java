package com.vdodsodjsdt;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class Z16Fp1rBYhnkTuveIP6b0mzCdE {
    public final NrjuzzioPqfttNRptBDpZDzSYUrcM V57tEvNfxZVVcOCAOih5PKr;
    public final Ho5xN6K0JbsdCx5JGD zzpBGItXfub0yWj;
    public int VxUQ9tBhpHJ2AAEDNW8sghc4m = 0;
    public int ZfQNn8hdWlEQ5cR94249PDsLR = 8;
    public int[] LaeGQIruHQu81hfJldjMOQSVblH3x = new int[8];
    public int[] zIvmSL0wzmmKGc3X39b2Gw2mUGE = new int[8];
    public float[] ZLZeBXTMq0zDztBxtRTuCHrapQ = new float[8];
    public int NSjgqmGjEzuugn2SsG1mZFP = -1;
    public int GI83zq0G8e7zkn = -1;
    public boolean M9e7PWhFYLD2lOGMker = false;

    public Z16Fp1rBYhnkTuveIP6b0mzCdE(Ho5xN6K0JbsdCx5JGD ho5xN6K0JbsdCx5JGD, NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcM) {
        this.zzpBGItXfub0yWj = ho5xN6K0JbsdCx5JGD;
        this.V57tEvNfxZVVcOCAOih5PKr = nrjuzzioPqfttNRptBDpZDzSYUrcM;
    }

    public final hkOLVejSEWXUiK2HQlr9P2Z9 LaeGQIruHQu81hfJldjMOQSVblH3x(int i) {
        int i2 = this.NSjgqmGjEzuugn2SsG1mZFP;
        for (int i3 = 0; i2 != -1 && i3 < this.VxUQ9tBhpHJ2AAEDNW8sghc4m; i3++) {
            if (i3 == i) {
                return ((hkOLVejSEWXUiK2HQlr9P2Z9[]) this.V57tEvNfxZVVcOCAOih5PKr.ZfQNn8hdWlEQ5cR94249PDsLR)[this.LaeGQIruHQu81hfJldjMOQSVblH3x[i2]];
            }
            i2 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE[i2];
        }
        return null;
    }

    public final float NSjgqmGjEzuugn2SsG1mZFP(hkOLVejSEWXUiK2HQlr9P2Z9 hkolvejsewxuik2hqlr9p2z9, boolean z) {
        int i = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            if (this.LaeGQIruHQu81hfJldjMOQSVblH3x[i] == hkolvejsewxuik2hqlr9p2z9.ZfQNn8hdWlEQ5cR94249PDsLR) {
                if (i == this.NSjgqmGjEzuugn2SsG1mZFP) {
                    this.NSjgqmGjEzuugn2SsG1mZFP = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE[i];
                } else {
                    int[] iArr = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    hkolvejsewxuik2hqlr9p2z9.zzpBGItXfub0yWj(this.zzpBGItXfub0yWj);
                }
                hkolvejsewxuik2hqlr9p2z9.q1wNbhk2O6--;
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m--;
                this.LaeGQIruHQu81hfJldjMOQSVblH3x[i] = -1;
                if (this.M9e7PWhFYLD2lOGMker) {
                    this.GI83zq0G8e7zkn = i;
                }
                return this.ZLZeBXTMq0zDztBxtRTuCHrapQ[i];
            }
            i2++;
            i3 = i;
            i = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE[i];
        }
        return 0.0f;
    }

    public final float V57tEvNfxZVVcOCAOih5PKr(hkOLVejSEWXUiK2HQlr9P2Z9 hkolvejsewxuik2hqlr9p2z9) {
        int i = this.NSjgqmGjEzuugn2SsG1mZFP;
        for (int i2 = 0; i != -1 && i2 < this.VxUQ9tBhpHJ2AAEDNW8sghc4m; i2++) {
            if (this.LaeGQIruHQu81hfJldjMOQSVblH3x[i] == hkolvejsewxuik2hqlr9p2z9.ZfQNn8hdWlEQ5cR94249PDsLR) {
                return this.ZLZeBXTMq0zDztBxtRTuCHrapQ[i];
            }
            i = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE[i];
        }
        return 0.0f;
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(hkOLVejSEWXUiK2HQlr9P2Z9 hkolvejsewxuik2hqlr9p2z9, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.NSjgqmGjEzuugn2SsG1mZFP;
            Ho5xN6K0JbsdCx5JGD ho5xN6K0JbsdCx5JGD = this.zzpBGItXfub0yWj;
            if (i == -1) {
                this.NSjgqmGjEzuugn2SsG1mZFP = 0;
                this.ZLZeBXTMq0zDztBxtRTuCHrapQ[0] = f;
                this.LaeGQIruHQu81hfJldjMOQSVblH3x[0] = hkolvejsewxuik2hqlr9p2z9.ZfQNn8hdWlEQ5cR94249PDsLR;
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE[0] = -1;
                hkolvejsewxuik2hqlr9p2z9.q1wNbhk2O6++;
                hkolvejsewxuik2hqlr9p2z9.VxUQ9tBhpHJ2AAEDNW8sghc4m(ho5xN6K0JbsdCx5JGD);
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m++;
                if (this.M9e7PWhFYLD2lOGMker) {
                    return;
                }
                int i2 = this.GI83zq0G8e7zkn + 1;
                this.GI83zq0G8e7zkn = i2;
                int[] iArr = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                if (i2 >= iArr.length) {
                    this.M9e7PWhFYLD2lOGMker = true;
                    this.GI83zq0G8e7zkn = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.VxUQ9tBhpHJ2AAEDNW8sghc4m; i4++) {
                int i5 = this.LaeGQIruHQu81hfJldjMOQSVblH3x[i];
                int i6 = hkolvejsewxuik2hqlr9p2z9.ZfQNn8hdWlEQ5cR94249PDsLR;
                if (i5 == i6) {
                    float[] fArr = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.NSjgqmGjEzuugn2SsG1mZFP) {
                            this.NSjgqmGjEzuugn2SsG1mZFP = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE[i];
                        } else {
                            int[] iArr2 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            hkolvejsewxuik2hqlr9p2z9.zzpBGItXfub0yWj(ho5xN6K0JbsdCx5JGD);
                        }
                        if (this.M9e7PWhFYLD2lOGMker) {
                            this.GI83zq0G8e7zkn = i;
                        }
                        hkolvejsewxuik2hqlr9p2z9.q1wNbhk2O6--;
                        this.VxUQ9tBhpHJ2AAEDNW8sghc4m--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE[i];
            }
            int length = this.GI83zq0G8e7zkn;
            int i7 = length + 1;
            if (this.M9e7PWhFYLD2lOGMker) {
                int[] iArr3 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i7;
            }
            int[] iArr4 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            if (length >= iArr4.length && this.VxUQ9tBhpHJ2AAEDNW8sghc4m < iArr4.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr5 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                    if (i8 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i8] == -1) {
                        length = i8;
                        break;
                    }
                    i8++;
                }
            }
            int[] iArr6 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i9 = this.ZfQNn8hdWlEQ5cR94249PDsLR * 2;
                this.ZfQNn8hdWlEQ5cR94249PDsLR = i9;
                this.M9e7PWhFYLD2lOGMker = false;
                this.GI83zq0G8e7zkn = length - 1;
                this.ZLZeBXTMq0zDztBxtRTuCHrapQ = Arrays.copyOf(this.ZLZeBXTMq0zDztBxtRTuCHrapQ, i9);
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = Arrays.copyOf(this.LaeGQIruHQu81hfJldjMOQSVblH3x, this.ZfQNn8hdWlEQ5cR94249PDsLR);
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = Arrays.copyOf(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE, this.ZfQNn8hdWlEQ5cR94249PDsLR);
            }
            this.LaeGQIruHQu81hfJldjMOQSVblH3x[length] = hkolvejsewxuik2hqlr9p2z9.ZfQNn8hdWlEQ5cR94249PDsLR;
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ[length] = f;
            if (i3 != -1) {
                int[] iArr7 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                iArr7[length] = iArr7[i3];
                iArr7[i3] = length;
            } else {
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE[length] = this.NSjgqmGjEzuugn2SsG1mZFP;
                this.NSjgqmGjEzuugn2SsG1mZFP = length;
            }
            hkolvejsewxuik2hqlr9p2z9.q1wNbhk2O6++;
            hkolvejsewxuik2hqlr9p2z9.VxUQ9tBhpHJ2AAEDNW8sghc4m(ho5xN6K0JbsdCx5JGD);
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m++;
            if (!this.M9e7PWhFYLD2lOGMker) {
                this.GI83zq0G8e7zkn++;
            }
            int i10 = this.GI83zq0G8e7zkn;
            int[] iArr8 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            if (i10 >= iArr8.length) {
                this.M9e7PWhFYLD2lOGMker = true;
                this.GI83zq0G8e7zkn = iArr8.length - 1;
            }
        }
    }

    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ(hkOLVejSEWXUiK2HQlr9P2Z9 hkolvejsewxuik2hqlr9p2z9, float f) {
        if (f == 0.0f) {
            NSjgqmGjEzuugn2SsG1mZFP(hkolvejsewxuik2hqlr9p2z9, true);
            return;
        }
        int i = this.NSjgqmGjEzuugn2SsG1mZFP;
        Ho5xN6K0JbsdCx5JGD ho5xN6K0JbsdCx5JGD = this.zzpBGItXfub0yWj;
        if (i == -1) {
            this.NSjgqmGjEzuugn2SsG1mZFP = 0;
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ[0] = f;
            this.LaeGQIruHQu81hfJldjMOQSVblH3x[0] = hkolvejsewxuik2hqlr9p2z9.ZfQNn8hdWlEQ5cR94249PDsLR;
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE[0] = -1;
            hkolvejsewxuik2hqlr9p2z9.q1wNbhk2O6++;
            hkolvejsewxuik2hqlr9p2z9.VxUQ9tBhpHJ2AAEDNW8sghc4m(ho5xN6K0JbsdCx5JGD);
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m++;
            if (this.M9e7PWhFYLD2lOGMker) {
                return;
            }
            int i2 = this.GI83zq0G8e7zkn + 1;
            this.GI83zq0G8e7zkn = i2;
            int[] iArr = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            if (i2 >= iArr.length) {
                this.M9e7PWhFYLD2lOGMker = true;
                this.GI83zq0G8e7zkn = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.VxUQ9tBhpHJ2AAEDNW8sghc4m; i4++) {
            int i5 = this.LaeGQIruHQu81hfJldjMOQSVblH3x[i];
            int i6 = hkolvejsewxuik2hqlr9p2z9.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (i5 == i6) {
                this.ZLZeBXTMq0zDztBxtRTuCHrapQ[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE[i];
        }
        int length = this.GI83zq0G8e7zkn;
        int i7 = length + 1;
        if (this.M9e7PWhFYLD2lOGMker) {
            int[] iArr2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i7;
        }
        int[] iArr3 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (length >= iArr3.length && this.VxUQ9tBhpHJ2AAEDNW8sghc4m < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                if (i8 >= iArr4.length) {
                    break;
                }
                if (iArr4[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        int[] iArr5 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i9 = this.ZfQNn8hdWlEQ5cR94249PDsLR * 2;
            this.ZfQNn8hdWlEQ5cR94249PDsLR = i9;
            this.M9e7PWhFYLD2lOGMker = false;
            this.GI83zq0G8e7zkn = length - 1;
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = Arrays.copyOf(this.ZLZeBXTMq0zDztBxtRTuCHrapQ, i9);
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = Arrays.copyOf(this.LaeGQIruHQu81hfJldjMOQSVblH3x, this.ZfQNn8hdWlEQ5cR94249PDsLR);
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = Arrays.copyOf(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE, this.ZfQNn8hdWlEQ5cR94249PDsLR);
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x[length] = hkolvejsewxuik2hqlr9p2z9.ZfQNn8hdWlEQ5cR94249PDsLR;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ[length] = f;
        if (i3 != -1) {
            int[] iArr6 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            iArr6[length] = iArr6[i3];
            iArr6[i3] = length;
        } else {
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE[length] = this.NSjgqmGjEzuugn2SsG1mZFP;
            this.NSjgqmGjEzuugn2SsG1mZFP = length;
        }
        hkolvejsewxuik2hqlr9p2z9.q1wNbhk2O6++;
        hkolvejsewxuik2hqlr9p2z9.VxUQ9tBhpHJ2AAEDNW8sghc4m(ho5xN6K0JbsdCx5JGD);
        int i10 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m + 1;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i10;
        if (!this.M9e7PWhFYLD2lOGMker) {
            this.GI83zq0G8e7zkn++;
        }
        int[] iArr7 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i10 >= iArr7.length) {
            this.M9e7PWhFYLD2lOGMker = true;
        }
        if (this.GI83zq0G8e7zkn >= iArr7.length) {
            this.M9e7PWhFYLD2lOGMker = true;
            this.GI83zq0G8e7zkn = iArr7.length - 1;
        }
    }

    public final int ZfQNn8hdWlEQ5cR94249PDsLR() {
        return this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
    }

    public final String toString() {
        int i = this.NSjgqmGjEzuugn2SsG1mZFP;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.VxUQ9tBhpHJ2AAEDNW8sghc4m; i2++) {
            str = (u9SlVAuoWhQUfJ.GI83zq0G8e7zkn(str, " -> ") + this.ZLZeBXTMq0zDztBxtRTuCHrapQ[i] + " : ") + ((hkOLVejSEWXUiK2HQlr9P2Z9[]) this.V57tEvNfxZVVcOCAOih5PKr.ZfQNn8hdWlEQ5cR94249PDsLR)[this.LaeGQIruHQu81hfJldjMOQSVblH3x[i]];
            i = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE[i];
        }
        return str;
    }

    public final float zIvmSL0wzmmKGc3X39b2Gw2mUGE(int i) {
        int i2 = this.NSjgqmGjEzuugn2SsG1mZFP;
        for (int i3 = 0; i2 != -1 && i3 < this.VxUQ9tBhpHJ2AAEDNW8sghc4m; i3++) {
            if (i3 == i) {
                return this.ZLZeBXTMq0zDztBxtRTuCHrapQ[i2];
            }
            i2 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE[i2];
        }
        return 0.0f;
    }

    public final void zzpBGItXfub0yWj() {
        int i = this.NSjgqmGjEzuugn2SsG1mZFP;
        for (int i2 = 0; i != -1 && i2 < this.VxUQ9tBhpHJ2AAEDNW8sghc4m; i2++) {
            hkOLVejSEWXUiK2HQlr9P2Z9 hkolvejsewxuik2hqlr9p2z9 = ((hkOLVejSEWXUiK2HQlr9P2Z9[]) this.V57tEvNfxZVVcOCAOih5PKr.ZfQNn8hdWlEQ5cR94249PDsLR)[this.LaeGQIruHQu81hfJldjMOQSVblH3x[i]];
            if (hkolvejsewxuik2hqlr9p2z9 != null) {
                hkolvejsewxuik2hqlr9p2z9.zzpBGItXfub0yWj(this.zzpBGItXfub0yWj);
            }
            i = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE[i];
        }
        this.NSjgqmGjEzuugn2SsG1mZFP = -1;
        this.GI83zq0G8e7zkn = -1;
        this.M9e7PWhFYLD2lOGMker = false;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 0;
    }
}
