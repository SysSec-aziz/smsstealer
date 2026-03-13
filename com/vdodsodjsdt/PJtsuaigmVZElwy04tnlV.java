package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class PJtsuaigmVZElwy04tnlV extends NENDPFFAZXAw {
    public boolean VOvSEdhaZyc0oOGQ8;
    public int h2b7InwIaORKN91X7whfQh4;
    public int lxWWbfAOLs4jWzd7PSIiIJ;
    public boolean r0dB0ojIy6g8mnk1;

    public final int ItrQwCXbty5PZtje5JS() {
        int i = this.lxWWbfAOLs4jWzd7PSIiIJ;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    public final boolean JUdwvN8LfOMa() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.BDoqAMf0rlMRAnVghjC4qjG;
            if (i4 >= i) {
                break;
            }
            IPwvkMKvXW4H2mJtQ4szs9vgoyzLD iPwvkMKvXW4H2mJtQ4szs9vgoyzLD = this.AFOcXGdvoTMuqwiG8tD[i4];
            if ((this.VOvSEdhaZyc0oOGQ8 || iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.V57tEvNfxZVVcOCAOih5PKr()) && ((((i2 = this.lxWWbfAOLs4jWzd7PSIiIJ) == 0 || i2 == 1) && !iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.qNPQb1obP7()) || (((i3 = this.lxWWbfAOLs4jWzd7PSIiIJ) == 2 || i3 == 3) && !iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.SuB3hEmTmbbRGAhtvOOmfKEon()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.BDoqAMf0rlMRAnVghjC4qjG; i5++) {
            IPwvkMKvXW4H2mJtQ4szs9vgoyzLD iPwvkMKvXW4H2mJtQ4szs9vgoyzLD2 = this.AFOcXGdvoTMuqwiG8tD[i5];
            if (this.VOvSEdhaZyc0oOGQ8 || iPwvkMKvXW4H2mJtQ4szs9vgoyzLD2.V57tEvNfxZVVcOCAOih5PKr()) {
                if (!z2) {
                    int i6 = this.lxWWbfAOLs4jWzd7PSIiIJ;
                    if (i6 == 0) {
                        iMax = iPwvkMKvXW4H2mJtQ4szs9vgoyzLD2.GI83zq0G8e7zkn(2).ZfQNn8hdWlEQ5cR94249PDsLR();
                    } else if (i6 == 1) {
                        iMax = iPwvkMKvXW4H2mJtQ4szs9vgoyzLD2.GI83zq0G8e7zkn(4).ZfQNn8hdWlEQ5cR94249PDsLR();
                    } else if (i6 == 2) {
                        iMax = iPwvkMKvXW4H2mJtQ4szs9vgoyzLD2.GI83zq0G8e7zkn(3).ZfQNn8hdWlEQ5cR94249PDsLR();
                    } else if (i6 == 3) {
                        iMax = iPwvkMKvXW4H2mJtQ4szs9vgoyzLD2.GI83zq0G8e7zkn(5).ZfQNn8hdWlEQ5cR94249PDsLR();
                    }
                    z2 = true;
                }
                int i7 = this.lxWWbfAOLs4jWzd7PSIiIJ;
                if (i7 == 0) {
                    iMax = Math.min(iMax, iPwvkMKvXW4H2mJtQ4szs9vgoyzLD2.GI83zq0G8e7zkn(2).ZfQNn8hdWlEQ5cR94249PDsLR());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, iPwvkMKvXW4H2mJtQ4szs9vgoyzLD2.GI83zq0G8e7zkn(4).ZfQNn8hdWlEQ5cR94249PDsLR());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, iPwvkMKvXW4H2mJtQ4szs9vgoyzLD2.GI83zq0G8e7zkn(3).ZfQNn8hdWlEQ5cR94249PDsLR());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, iPwvkMKvXW4H2mJtQ4szs9vgoyzLD2.GI83zq0G8e7zkn(5).ZfQNn8hdWlEQ5cR94249PDsLR());
                }
            }
        }
        int i8 = iMax + this.h2b7InwIaORKN91X7whfQh4;
        int i9 = this.lxWWbfAOLs4jWzd7PSIiIJ;
        if (i9 == 0 || i9 == 1) {
            iKANjmyTSxO6v6UuLPdu7DxOjlS(i8, i8);
        } else {
            TqcnImqkSWIKht(i8, i8);
        }
        this.r0dB0ojIy6g8mnk1 = true;
        return true;
    }

    @Override // com.vdodsodjsdt.IPwvkMKvXW4H2mJtQ4szs9vgoyzLD
    public final boolean SuB3hEmTmbbRGAhtvOOmfKEon() {
        return this.r0dB0ojIy6g8mnk1;
    }

    @Override // com.vdodsodjsdt.IPwvkMKvXW4H2mJtQ4szs9vgoyzLD
    public final boolean V57tEvNfxZVVcOCAOih5PKr() {
        return true;
    }

    @Override // com.vdodsodjsdt.IPwvkMKvXW4H2mJtQ4szs9vgoyzLD
    public final boolean qNPQb1obP7() {
        return this.r0dB0ojIy6g8mnk1;
    }

    @Override // com.vdodsodjsdt.IPwvkMKvXW4H2mJtQ4szs9vgoyzLD
    public final String toString() {
        String strHzCpKshMOoaw76hFcbOVRYMeRd = u9SlVAuoWhQUfJ.HzCpKshMOoaw76hFcbOVRYMeRd(new StringBuilder("[Barrier] "), this.mhUCRR8ceqc7mAozW, " {");
        for (int i = 0; i < this.BDoqAMf0rlMRAnVghjC4qjG; i++) {
            IPwvkMKvXW4H2mJtQ4szs9vgoyzLD iPwvkMKvXW4H2mJtQ4szs9vgoyzLD = this.AFOcXGdvoTMuqwiG8tD[i];
            if (i > 0) {
                strHzCpKshMOoaw76hFcbOVRYMeRd = u9SlVAuoWhQUfJ.GI83zq0G8e7zkn(strHzCpKshMOoaw76hFcbOVRYMeRd, ", ");
            }
            strHzCpKshMOoaw76hFcbOVRYMeRd = strHzCpKshMOoaw76hFcbOVRYMeRd + iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.mhUCRR8ceqc7mAozW;
        }
        return u9SlVAuoWhQUfJ.GI83zq0G8e7zkn(strHzCpKshMOoaw76hFcbOVRYMeRd, "}");
    }

    @Override // com.vdodsodjsdt.IPwvkMKvXW4H2mJtQ4szs9vgoyzLD
    public final void zzpBGItXfub0yWj(uij8Ij9SZKI0vaNotiNzH uij8ij9szki0vanotinzh, boolean z) {
        boolean z2;
        int i;
        int i2;
        pySSTLZ4BX[] pysstlz4bxArr = this.gBaBUmihn5l4u;
        pySSTLZ4BX pysstlz4bx = this.qygqjTppWwx992;
        pysstlz4bxArr[0] = pysstlz4bx;
        int i3 = 2;
        pySSTLZ4BX pysstlz4bx2 = this.iKANjmyTSxO6v6UuLPdu7DxOjlS;
        pysstlz4bxArr[2] = pysstlz4bx2;
        pySSTLZ4BX pysstlz4bx3 = this.TqcnImqkSWIKht;
        pysstlz4bxArr[1] = pysstlz4bx3;
        pySSTLZ4BX pysstlz4bx4 = this.d9zDyyznnp3oaDT1Ug;
        pysstlz4bxArr[3] = pysstlz4bx4;
        for (pySSTLZ4BX pysstlz4bx5 : pysstlz4bxArr) {
            pysstlz4bx5.GI83zq0G8e7zkn = uij8ij9szki0vanotinzh.HzCpKshMOoaw76hFcbOVRYMeRd(pysstlz4bx5);
        }
        int i4 = this.lxWWbfAOLs4jWzd7PSIiIJ;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        pySSTLZ4BX pysstlz4bx6 = pysstlz4bxArr[i4];
        if (!this.r0dB0ojIy6g8mnk1) {
            JUdwvN8LfOMa();
        }
        if (this.r0dB0ojIy6g8mnk1) {
            this.r0dB0ojIy6g8mnk1 = false;
            int i5 = this.lxWWbfAOLs4jWzd7PSIiIJ;
            if (i5 == 0 || i5 == 1) {
                uij8ij9szki0vanotinzh.ZfQNn8hdWlEQ5cR94249PDsLR(pysstlz4bx.GI83zq0G8e7zkn, this.KYZ9RyuOc42A2J);
                uij8ij9szki0vanotinzh.ZfQNn8hdWlEQ5cR94249PDsLR(pysstlz4bx3.GI83zq0G8e7zkn, this.KYZ9RyuOc42A2J);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    uij8ij9szki0vanotinzh.ZfQNn8hdWlEQ5cR94249PDsLR(pysstlz4bx2.GI83zq0G8e7zkn, this.zOk739gUM7zIZC25HHUxoiyixWFjn);
                    uij8ij9szki0vanotinzh.ZfQNn8hdWlEQ5cR94249PDsLR(pysstlz4bx4.GI83zq0G8e7zkn, this.zOk739gUM7zIZC25HHUxoiyixWFjn);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.BDoqAMf0rlMRAnVghjC4qjG; i6++) {
            IPwvkMKvXW4H2mJtQ4szs9vgoyzLD iPwvkMKvXW4H2mJtQ4szs9vgoyzLD = this.AFOcXGdvoTMuqwiG8tD[i6];
            if ((this.VOvSEdhaZyc0oOGQ8 || iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.V57tEvNfxZVVcOCAOih5PKr()) && ((((i2 = this.lxWWbfAOLs4jWzd7PSIiIJ) == 0 || i2 == 1) && iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.e1gEV3X9xwmHj[0] == 3 && iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.qygqjTppWwx992.zIvmSL0wzmmKGc3X39b2Gw2mUGE != null && iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.TqcnImqkSWIKht.zIvmSL0wzmmKGc3X39b2Gw2mUGE != null) || ((i2 == 2 || i2 == 3) && iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.e1gEV3X9xwmHj[1] == 3 && iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.iKANjmyTSxO6v6UuLPdu7DxOjlS.zIvmSL0wzmmKGc3X39b2Gw2mUGE != null && iPwvkMKvXW4H2mJtQ4szs9vgoyzLD.d9zDyyznnp3oaDT1Ug.zIvmSL0wzmmKGc3X39b2Gw2mUGE != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = pysstlz4bx.ZLZeBXTMq0zDztBxtRTuCHrapQ() || pysstlz4bx3.ZLZeBXTMq0zDztBxtRTuCHrapQ();
        boolean z4 = pysstlz4bx2.ZLZeBXTMq0zDztBxtRTuCHrapQ() || pysstlz4bx4.ZLZeBXTMq0zDztBxtRTuCHrapQ();
        int i7 = !(!z2 && (((i = this.lxWWbfAOLs4jWzd7PSIiIJ) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.BDoqAMf0rlMRAnVghjC4qjG) {
            IPwvkMKvXW4H2mJtQ4szs9vgoyzLD iPwvkMKvXW4H2mJtQ4szs9vgoyzLD2 = this.AFOcXGdvoTMuqwiG8tD[i8];
            if (this.VOvSEdhaZyc0oOGQ8 || iPwvkMKvXW4H2mJtQ4szs9vgoyzLD2.V57tEvNfxZVVcOCAOih5PKr()) {
                hkOLVejSEWXUiK2HQlr9P2Z9 hkolvejsewxuik2hqlr9p2z9HzCpKshMOoaw76hFcbOVRYMeRd = uij8ij9szki0vanotinzh.HzCpKshMOoaw76hFcbOVRYMeRd(iPwvkMKvXW4H2mJtQ4szs9vgoyzLD2.gBaBUmihn5l4u[this.lxWWbfAOLs4jWzd7PSIiIJ]);
                pySSTLZ4BX[] pysstlz4bxArr2 = iPwvkMKvXW4H2mJtQ4szs9vgoyzLD2.gBaBUmihn5l4u;
                int i9 = this.lxWWbfAOLs4jWzd7PSIiIJ;
                pySSTLZ4BX pysstlz4bx7 = pysstlz4bxArr2[i9];
                pysstlz4bx7.GI83zq0G8e7zkn = hkolvejsewxuik2hqlr9p2z9HzCpKshMOoaw76hFcbOVRYMeRd;
                pySSTLZ4BX pysstlz4bx8 = pysstlz4bx7.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                int i10 = (pysstlz4bx8 == null || pysstlz4bx8.ZfQNn8hdWlEQ5cR94249PDsLR != this) ? 0 : pysstlz4bx7.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                if (i9 == 0 || i9 == i3) {
                    hkOLVejSEWXUiK2HQlr9P2Z9 hkolvejsewxuik2hqlr9p2z9 = pysstlz4bx6.GI83zq0G8e7zkn;
                    int i11 = this.h2b7InwIaORKN91X7whfQh4 - i10;
                    Ho5xN6K0JbsdCx5JGD ho5xN6K0JbsdCx5JGDKUYypEB4eNWOZWVDpH = uij8ij9szki0vanotinzh.KUYypEB4eNWOZWVDpH();
                    hkOLVejSEWXUiK2HQlr9P2Z9 hkolvejsewxuik2hqlr9p2z9Q1wNbhk2O6 = uij8ij9szki0vanotinzh.q1wNbhk2O6();
                    hkolvejsewxuik2hqlr9p2z9Q1wNbhk2O6.zIvmSL0wzmmKGc3X39b2Gw2mUGE = 0;
                    ho5xN6K0JbsdCx5JGDKUYypEB4eNWOZWVDpH.V57tEvNfxZVVcOCAOih5PKr(hkolvejsewxuik2hqlr9p2z9, hkolvejsewxuik2hqlr9p2z9HzCpKshMOoaw76hFcbOVRYMeRd, hkolvejsewxuik2hqlr9p2z9Q1wNbhk2O6, i11);
                    uij8ij9szki0vanotinzh.V57tEvNfxZVVcOCAOih5PKr(ho5xN6K0JbsdCx5JGDKUYypEB4eNWOZWVDpH);
                } else {
                    hkOLVejSEWXUiK2HQlr9P2Z9 hkolvejsewxuik2hqlr9p2z92 = pysstlz4bx6.GI83zq0G8e7zkn;
                    int i12 = this.h2b7InwIaORKN91X7whfQh4 + i10;
                    Ho5xN6K0JbsdCx5JGD ho5xN6K0JbsdCx5JGDKUYypEB4eNWOZWVDpH2 = uij8ij9szki0vanotinzh.KUYypEB4eNWOZWVDpH();
                    hkOLVejSEWXUiK2HQlr9P2Z9 hkolvejsewxuik2hqlr9p2z9Q1wNbhk2O62 = uij8ij9szki0vanotinzh.q1wNbhk2O6();
                    hkolvejsewxuik2hqlr9p2z9Q1wNbhk2O62.zIvmSL0wzmmKGc3X39b2Gw2mUGE = 0;
                    ho5xN6K0JbsdCx5JGDKUYypEB4eNWOZWVDpH2.zzpBGItXfub0yWj(hkolvejsewxuik2hqlr9p2z92, hkolvejsewxuik2hqlr9p2z9HzCpKshMOoaw76hFcbOVRYMeRd, hkolvejsewxuik2hqlr9p2z9Q1wNbhk2O62, i12);
                    uij8ij9szki0vanotinzh.V57tEvNfxZVVcOCAOih5PKr(ho5xN6K0JbsdCx5JGDKUYypEB4eNWOZWVDpH2);
                }
                uij8ij9szki0vanotinzh.LaeGQIruHQu81hfJldjMOQSVblH3x(pysstlz4bx6.GI83zq0G8e7zkn, hkolvejsewxuik2hqlr9p2z9HzCpKshMOoaw76hFcbOVRYMeRd, this.h2b7InwIaORKN91X7whfQh4 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.lxWWbfAOLs4jWzd7PSIiIJ;
        if (i13 == 0) {
            uij8ij9szki0vanotinzh.LaeGQIruHQu81hfJldjMOQSVblH3x(pysstlz4bx3.GI83zq0G8e7zkn, pysstlz4bx.GI83zq0G8e7zkn, 0, 8);
            uij8ij9szki0vanotinzh.LaeGQIruHQu81hfJldjMOQSVblH3x(pysstlz4bx.GI83zq0G8e7zkn, this.JUdwvN8LfOMa.TqcnImqkSWIKht.GI83zq0G8e7zkn, 0, 4);
            uij8ij9szki0vanotinzh.LaeGQIruHQu81hfJldjMOQSVblH3x(pysstlz4bx.GI83zq0G8e7zkn, this.JUdwvN8LfOMa.qygqjTppWwx992.GI83zq0G8e7zkn, 0, 0);
            return;
        }
        if (i13 == 1) {
            uij8ij9szki0vanotinzh.LaeGQIruHQu81hfJldjMOQSVblH3x(pysstlz4bx.GI83zq0G8e7zkn, pysstlz4bx3.GI83zq0G8e7zkn, 0, 8);
            uij8ij9szki0vanotinzh.LaeGQIruHQu81hfJldjMOQSVblH3x(pysstlz4bx.GI83zq0G8e7zkn, this.JUdwvN8LfOMa.qygqjTppWwx992.GI83zq0G8e7zkn, 0, 4);
            uij8ij9szki0vanotinzh.LaeGQIruHQu81hfJldjMOQSVblH3x(pysstlz4bx.GI83zq0G8e7zkn, this.JUdwvN8LfOMa.TqcnImqkSWIKht.GI83zq0G8e7zkn, 0, 0);
        } else if (i13 == 2) {
            uij8ij9szki0vanotinzh.LaeGQIruHQu81hfJldjMOQSVblH3x(pysstlz4bx4.GI83zq0G8e7zkn, pysstlz4bx2.GI83zq0G8e7zkn, 0, 8);
            uij8ij9szki0vanotinzh.LaeGQIruHQu81hfJldjMOQSVblH3x(pysstlz4bx2.GI83zq0G8e7zkn, this.JUdwvN8LfOMa.d9zDyyznnp3oaDT1Ug.GI83zq0G8e7zkn, 0, 4);
            uij8ij9szki0vanotinzh.LaeGQIruHQu81hfJldjMOQSVblH3x(pysstlz4bx2.GI83zq0G8e7zkn, this.JUdwvN8LfOMa.iKANjmyTSxO6v6UuLPdu7DxOjlS.GI83zq0G8e7zkn, 0, 0);
        } else if (i13 == 3) {
            uij8ij9szki0vanotinzh.LaeGQIruHQu81hfJldjMOQSVblH3x(pysstlz4bx2.GI83zq0G8e7zkn, pysstlz4bx4.GI83zq0G8e7zkn, 0, 8);
            uij8ij9szki0vanotinzh.LaeGQIruHQu81hfJldjMOQSVblH3x(pysstlz4bx2.GI83zq0G8e7zkn, this.JUdwvN8LfOMa.iKANjmyTSxO6v6UuLPdu7DxOjlS.GI83zq0G8e7zkn, 0, 4);
            uij8ij9szki0vanotinzh.LaeGQIruHQu81hfJldjMOQSVblH3x(pysstlz4bx2.GI83zq0G8e7zkn, this.JUdwvN8LfOMa.d9zDyyznnp3oaDT1Ug.GI83zq0G8e7zkn, 0, 0);
        }
    }
}
