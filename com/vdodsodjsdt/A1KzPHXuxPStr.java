package com.vdodsodjsdt;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class A1KzPHXuxPStr extends Ho5xN6K0JbsdCx5JGD {
    public o0x3OWMw3He GI83zq0G8e7zkn;
    public int NSjgqmGjEzuugn2SsG1mZFP;
    public hkOLVejSEWXUiK2HQlr9P2Z9[] ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public hkOLVejSEWXUiK2HQlr9P2Z9[] zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    @Override // com.vdodsodjsdt.Ho5xN6K0JbsdCx5JGD
    public final void GI83zq0G8e7zkn(uij8Ij9SZKI0vaNotiNzH uij8ij9szki0vanotinzh, Ho5xN6K0JbsdCx5JGD ho5xN6K0JbsdCx5JGD, boolean z) {
        hkOLVejSEWXUiK2HQlr9P2Z9 hkolvejsewxuik2hqlr9p2z9 = ho5xN6K0JbsdCx5JGD.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (hkolvejsewxuik2hqlr9p2z9 == null) {
            return;
        }
        float[] fArr = hkolvejsewxuik2hqlr9p2z9.M9e7PWhFYLD2lOGMker;
        Z16Fp1rBYhnkTuveIP6b0mzCdE z16Fp1rBYhnkTuveIP6b0mzCdE = ho5xN6K0JbsdCx5JGD.ZfQNn8hdWlEQ5cR94249PDsLR;
        int iZfQNn8hdWlEQ5cR94249PDsLR = z16Fp1rBYhnkTuveIP6b0mzCdE.ZfQNn8hdWlEQ5cR94249PDsLR();
        for (int i = 0; i < iZfQNn8hdWlEQ5cR94249PDsLR; i++) {
            hkOLVejSEWXUiK2HQlr9P2Z9 hkolvejsewxuik2hqlr9p2z9LaeGQIruHQu81hfJldjMOQSVblH3x = z16Fp1rBYhnkTuveIP6b0mzCdE.LaeGQIruHQu81hfJldjMOQSVblH3x(i);
            float fZIvmSL0wzmmKGc3X39b2Gw2mUGE = z16Fp1rBYhnkTuveIP6b0mzCdE.zIvmSL0wzmmKGc3X39b2Gw2mUGE(i);
            o0x3OWMw3He o0x3owmw3he = this.GI83zq0G8e7zkn;
            o0x3owmw3he.zzpBGItXfub0yWj = hkolvejsewxuik2hqlr9p2z9LaeGQIruHQu81hfJldjMOQSVblH3x;
            if (hkolvejsewxuik2hqlr9p2z9LaeGQIruHQu81hfJldjMOQSVblH3x.V57tEvNfxZVVcOCAOih5PKr) {
                boolean z2 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((hkOLVejSEWXUiK2HQlr9P2Z9) o0x3owmw3he.zzpBGItXfub0yWj).M9e7PWhFYLD2lOGMker;
                    float f = (fArr[i2] * fZIvmSL0wzmmKGc3X39b2Gw2mUGE) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        ((hkOLVejSEWXUiK2HQlr9P2Z9) o0x3owmw3he.zzpBGItXfub0yWj).M9e7PWhFYLD2lOGMker[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    ((A1KzPHXuxPStr) o0x3owmw3he.V57tEvNfxZVVcOCAOih5PKr).HzCpKshMOoaw76hFcbOVRYMeRd((hkOLVejSEWXUiK2HQlr9P2Z9) o0x3owmw3he.zzpBGItXfub0yWj);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fZIvmSL0wzmmKGc3X39b2Gw2mUGE;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        ((hkOLVejSEWXUiK2HQlr9P2Z9) o0x3owmw3he.zzpBGItXfub0yWj).M9e7PWhFYLD2lOGMker[i3] = f3;
                    } else {
                        ((hkOLVejSEWXUiK2HQlr9P2Z9) o0x3owmw3he.zzpBGItXfub0yWj).M9e7PWhFYLD2lOGMker[i3] = 0.0f;
                    }
                }
                M9e7PWhFYLD2lOGMker(hkolvejsewxuik2hqlr9p2z9LaeGQIruHQu81hfJldjMOQSVblH3x);
            }
            this.zzpBGItXfub0yWj = (ho5xN6K0JbsdCx5JGD.zzpBGItXfub0yWj * fZIvmSL0wzmmKGc3X39b2Gw2mUGE) + this.zzpBGItXfub0yWj;
        }
        HzCpKshMOoaw76hFcbOVRYMeRd(hkolvejsewxuik2hqlr9p2z9);
    }

    public final void HzCpKshMOoaw76hFcbOVRYMeRd(hkOLVejSEWXUiK2HQlr9P2Z9 hkolvejsewxuik2hqlr9p2z9) {
        int i = 0;
        while (i < this.NSjgqmGjEzuugn2SsG1mZFP) {
            if (this.zIvmSL0wzmmKGc3X39b2Gw2mUGE[i] == hkolvejsewxuik2hqlr9p2z9) {
                while (true) {
                    int i2 = this.NSjgqmGjEzuugn2SsG1mZFP;
                    if (i >= i2 - 1) {
                        this.NSjgqmGjEzuugn2SsG1mZFP = i2 - 1;
                        hkolvejsewxuik2hqlr9p2z9.V57tEvNfxZVVcOCAOih5PKr = false;
                        return;
                    } else {
                        hkOLVejSEWXUiK2HQlr9P2Z9[] hkolvejsewxuik2hqlr9p2z9Arr = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                        int i3 = i + 1;
                        hkolvejsewxuik2hqlr9p2z9Arr[i] = hkolvejsewxuik2hqlr9p2z9Arr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // com.vdodsodjsdt.Ho5xN6K0JbsdCx5JGD
    public final boolean LaeGQIruHQu81hfJldjMOQSVblH3x() {
        return this.NSjgqmGjEzuugn2SsG1mZFP == 0;
    }

    public final void M9e7PWhFYLD2lOGMker(hkOLVejSEWXUiK2HQlr9P2Z9 hkolvejsewxuik2hqlr9p2z9) {
        int i;
        int i2 = this.NSjgqmGjEzuugn2SsG1mZFP + 1;
        hkOLVejSEWXUiK2HQlr9P2Z9[] hkolvejsewxuik2hqlr9p2z9Arr = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (i2 > hkolvejsewxuik2hqlr9p2z9Arr.length) {
            hkOLVejSEWXUiK2HQlr9P2Z9[] hkolvejsewxuik2hqlr9p2z9Arr2 = (hkOLVejSEWXUiK2HQlr9P2Z9[]) Arrays.copyOf(hkolvejsewxuik2hqlr9p2z9Arr, hkolvejsewxuik2hqlr9p2z9Arr.length * 2);
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = hkolvejsewxuik2hqlr9p2z9Arr2;
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = (hkOLVejSEWXUiK2HQlr9P2Z9[]) Arrays.copyOf(hkolvejsewxuik2hqlr9p2z9Arr2, hkolvejsewxuik2hqlr9p2z9Arr2.length * 2);
        }
        hkOLVejSEWXUiK2HQlr9P2Z9[] hkolvejsewxuik2hqlr9p2z9Arr3 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        int i3 = this.NSjgqmGjEzuugn2SsG1mZFP;
        hkolvejsewxuik2hqlr9p2z9Arr3[i3] = hkolvejsewxuik2hqlr9p2z9;
        int i4 = i3 + 1;
        this.NSjgqmGjEzuugn2SsG1mZFP = i4;
        if (i4 > 1 && hkolvejsewxuik2hqlr9p2z9Arr3[i3].ZfQNn8hdWlEQ5cR94249PDsLR > hkolvejsewxuik2hqlr9p2z9.ZfQNn8hdWlEQ5cR94249PDsLR) {
            int i5 = 0;
            while (true) {
                i = this.NSjgqmGjEzuugn2SsG1mZFP;
                if (i5 >= i) {
                    break;
                }
                this.ZLZeBXTMq0zDztBxtRTuCHrapQ[i5] = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE[i5];
                i5++;
            }
            Arrays.sort(this.ZLZeBXTMq0zDztBxtRTuCHrapQ, 0, i, new T3RbnymT8IuKvnwatFNeNL7H(4));
            for (int i6 = 0; i6 < this.NSjgqmGjEzuugn2SsG1mZFP; i6++) {
                this.zIvmSL0wzmmKGc3X39b2Gw2mUGE[i6] = this.ZLZeBXTMq0zDztBxtRTuCHrapQ[i6];
            }
        }
        hkolvejsewxuik2hqlr9p2z9.V57tEvNfxZVVcOCAOih5PKr = true;
        hkolvejsewxuik2hqlr9p2z9.VxUQ9tBhpHJ2AAEDNW8sghc4m(this);
    }

    @Override // com.vdodsodjsdt.Ho5xN6K0JbsdCx5JGD
    public final hkOLVejSEWXUiK2HQlr9P2Z9 ZfQNn8hdWlEQ5cR94249PDsLR(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.NSjgqmGjEzuugn2SsG1mZFP; i2++) {
            hkOLVejSEWXUiK2HQlr9P2Z9[] hkolvejsewxuik2hqlr9p2z9Arr = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            hkOLVejSEWXUiK2HQlr9P2Z9 hkolvejsewxuik2hqlr9p2z9 = hkolvejsewxuik2hqlr9p2z9Arr[i2];
            if (!zArr[hkolvejsewxuik2hqlr9p2z9.ZfQNn8hdWlEQ5cR94249PDsLR]) {
                o0x3OWMw3He o0x3owmw3he = this.GI83zq0G8e7zkn;
                o0x3owmw3he.zzpBGItXfub0yWj = hkolvejsewxuik2hqlr9p2z9;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = ((hkOLVejSEWXUiK2HQlr9P2Z9) o0x3owmw3he.zzpBGItXfub0yWj).M9e7PWhFYLD2lOGMker[i3];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    hkOLVejSEWXUiK2HQlr9P2Z9 hkolvejsewxuik2hqlr9p2z92 = hkolvejsewxuik2hqlr9p2z9Arr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = hkolvejsewxuik2hqlr9p2z92.M9e7PWhFYLD2lOGMker[i3];
                            float f3 = ((hkOLVejSEWXUiK2HQlr9P2Z9) o0x3owmw3he.zzpBGItXfub0yWj).M9e7PWhFYLD2lOGMker[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 < f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE[i];
    }

    @Override // com.vdodsodjsdt.Ho5xN6K0JbsdCx5JGD
    public final String toString() {
        o0x3OWMw3He o0x3owmw3he = this.GI83zq0G8e7zkn;
        String str = " goal -> (" + this.zzpBGItXfub0yWj + ") : ";
        for (int i = 0; i < this.NSjgqmGjEzuugn2SsG1mZFP; i++) {
            o0x3owmw3he.zzpBGItXfub0yWj = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE[i];
            str = str + o0x3owmw3he + " ";
        }
        return str;
    }
}
