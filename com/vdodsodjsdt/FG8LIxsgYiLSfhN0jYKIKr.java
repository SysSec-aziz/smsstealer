package com.vdodsodjsdt;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class FG8LIxsgYiLSfhN0jYKIKr implements XGVgBiBsAB8XY, E2spx2fDWN5IUkY2rPialU0ch7, ZN0iEARZEGpwTTqbyBVzgj {
    public static volatile FG8LIxsgYiLSfhN0jYKIKr ZfQNn8hdWlEQ5cR94249PDsLR;
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;

    public /* synthetic */ FG8LIxsgYiLSfhN0jYKIKr(int i) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
    }

    public static ZQ5iEBLmvObelGeRgKLPRxHbZEk GI83zq0G8e7zkn(String str) throws IOException {
        if (str.equals("http/1.0")) {
            return ZQ5iEBLmvObelGeRgKLPRxHbZEk.LaeGQIruHQu81hfJldjMOQSVblH3x;
        }
        if (str.equals("http/1.1")) {
            return ZQ5iEBLmvObelGeRgKLPRxHbZEk.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        }
        if (str.equals("h2_prior_knowledge")) {
            return ZQ5iEBLmvObelGeRgKLPRxHbZEk.GI83zq0G8e7zkn;
        }
        if (str.equals("h2")) {
            return ZQ5iEBLmvObelGeRgKLPRxHbZEk.NSjgqmGjEzuugn2SsG1mZFP;
        }
        if (str.equals("spdy/3.1")) {
            return ZQ5iEBLmvObelGeRgKLPRxHbZEk.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        }
        if (str.equals("quic")) {
            return ZQ5iEBLmvObelGeRgKLPRxHbZEk.M9e7PWhFYLD2lOGMker;
        }
        if (ngO5JXZkj8nfh41LltHvEjUc.lxWWbfAOLs4jWzd7PSIiIJ(str, "h3", false)) {
            return ZQ5iEBLmvObelGeRgKLPRxHbZEk.HzCpKshMOoaw76hFcbOVRYMeRd;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:93:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean HzCpKshMOoaw76hFcbOVRYMeRd(com.vdodsodjsdt.euYTwHHkzT79KP8ssihrzwr r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.FG8LIxsgYiLSfhN0jYKIKr.HzCpKshMOoaw76hFcbOVRYMeRd(com.vdodsodjsdt.euYTwHHkzT79KP8ssihrzwr, android.text.Editable, int, int, boolean):boolean");
    }

    public static byte[] NSjgqmGjEzuugn2SsG1mZFP(List list) {
        ej6unYlOWMDF.pYmKDYlAmhudp(list, "protocols");
        EouCzLZsW9ynithduh eouCzLZsW9ynithduh = new EouCzLZsW9ynithduh();
        ArrayList arrayListZLZeBXTMq0zDztBxtRTuCHrapQ = ZLZeBXTMq0zDztBxtRTuCHrapQ(list);
        int size = arrayListZLZeBXTMq0zDztBxtRTuCHrapQ.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListZLZeBXTMq0zDztBxtRTuCHrapQ.get(i);
            i++;
            String str = (String) obj;
            eouCzLZsW9ynithduh.O1xDAlBZZlZdoEf747lCFHld(str.length());
            eouCzLZsW9ynithduh.TqcnImqkSWIKht(str);
        }
        return eouCzLZsW9ynithduh.KUYypEB4eNWOZWVDpH(eouCzLZsW9ynithduh.ZfQNn8hdWlEQ5cR94249PDsLR);
    }

    public static ArrayList ZLZeBXTMq0zDztBxtRTuCHrapQ(List list) {
        ej6unYlOWMDF.pYmKDYlAmhudp(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ZQ5iEBLmvObelGeRgKLPRxHbZEk) obj) != ZQ5iEBLmvObelGeRgKLPRxHbZEk.LaeGQIruHQu81hfJldjMOQSVblH3x) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(M5nvSQFWCkc.bjhcQ0u7VT2OYYrwk96HrWoN(arrayList));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((ZQ5iEBLmvObelGeRgKLPRxHbZEk) obj2).V57tEvNfxZVVcOCAOih5PKr);
        }
        return arrayList2;
    }

    public static final String zIvmSL0wzmmKGc3X39b2Gw2mUGE(oA1WO3soICf8H1N6bgpG oa1wo3soicf8h1n6bgpg, oA1WO3soICf8H1N6bgpG[] oa1wo3soicf8h1n6bgpgArr, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        oA1WO3soICf8H1N6bgpG oa1wo3soicf8h1n6bgpg2 = pN24dqosQuwKRHaREt1n0AEZnr2K.zzpBGItXfub0yWj;
        int iVxUQ9tBhpHJ2AAEDNW8sghc4m = oa1wo3soicf8h1n6bgpg.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        int i5 = 0;
        while (i5 < iVxUQ9tBhpHJ2AAEDNW8sghc4m) {
            int i6 = (i5 + iVxUQ9tBhpHJ2AAEDNW8sghc4m) / 2;
            while (i6 > -1 && oa1wo3soicf8h1n6bgpg.ZfQNn8hdWlEQ5cR94249PDsLR(i6) != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (oa1wo3soicf8h1n6bgpg.ZfQNn8hdWlEQ5cR94249PDsLR(i2) == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    byte bZfQNn8hdWlEQ5cR94249PDsLR = oa1wo3soicf8h1n6bgpgArr[i10].ZfQNn8hdWlEQ5cR94249PDsLR(i11);
                    byte[] bArr = jHlOQHj3hlCsydfI7r5ApVdQjYvKf.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    int i13 = bZfQNn8hdWlEQ5cR94249PDsLR & 255;
                    z = z2;
                    i3 = i13;
                }
                byte bZfQNn8hdWlEQ5cR94249PDsLR2 = oa1wo3soicf8h1n6bgpg.ZfQNn8hdWlEQ5cR94249PDsLR(i7 + i12);
                byte[] bArr2 = jHlOQHj3hlCsydfI7r5ApVdQjYvKf.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                i4 = i3 - (bZfQNn8hdWlEQ5cR94249PDsLR2 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                }
                if (oa1wo3soicf8h1n6bgpgArr[i10].VxUQ9tBhpHJ2AAEDNW8sghc4m() != i11) {
                    z2 = z;
                } else {
                    if (i10 == oa1wo3soicf8h1n6bgpgArr.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z2 = true;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i14 = i9 - i12;
                    int iVxUQ9tBhpHJ2AAEDNW8sghc4m2 = oa1wo3soicf8h1n6bgpgArr[i10].VxUQ9tBhpHJ2AAEDNW8sghc4m() - i11;
                    int length = oa1wo3soicf8h1n6bgpgArr.length;
                    for (int i15 = i10 + 1; i15 < length; i15++) {
                        iVxUQ9tBhpHJ2AAEDNW8sghc4m2 += oa1wo3soicf8h1n6bgpgArr[i15].VxUQ9tBhpHJ2AAEDNW8sghc4m();
                    }
                    if (iVxUQ9tBhpHJ2AAEDNW8sghc4m2 >= i14) {
                        if (iVxUQ9tBhpHJ2AAEDNW8sghc4m2 <= i14) {
                            return oa1wo3soicf8h1n6bgpg.NSjgqmGjEzuugn2SsG1mZFP(i7, i9 + i7).ZLZeBXTMq0zDztBxtRTuCHrapQ(DEYHHOT0rxPFnkgGJgP0ym2DRq1.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            iVxUQ9tBhpHJ2AAEDNW8sghc4m = i6;
        }
        return null;
    }

    @Override // com.vdodsodjsdt.ZN0iEARZEGpwTTqbyBVzgj
    public void LaeGQIruHQu81hfJldjMOQSVblH3x(int i, Object obj) {
        String str;
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 21:
                break;
            default:
                switch (i) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_FIELD_NUMBER /* 5 */:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_SET_FIELD_NUMBER /* 6 */:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case g8kevnL6UKpr15IYtcPJXuLo1L4.DOUBLE_FIELD_NUMBER /* 7 */:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case g8kevnL6UKpr15IYtcPJXuLo1L4.BYTES_FIELD_NUMBER /* 8 */:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i == 6 || i == 7 || i == 8) {
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                } else {
                    Log.d("ProfileInstaller", str);
                }
                break;
        }
    }

    public Signature[] M9e7PWhFYLD2lOGMker(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // com.vdodsodjsdt.XGVgBiBsAB8XY
    public l6xJVUTn99ZWyAVk V57tEvNfxZVVcOCAOih5PKr(Class cls) {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 11:
                return new LkK8Z00PpYi0bCdvKCe3Ni9pHGRqm(true);
            default:
                return new RsM2tiFklbbxTcN();
        }
    }

    @Override // com.vdodsodjsdt.ZN0iEARZEGpwTTqbyBVzgj
    public void ZfQNn8hdWlEQ5cR94249PDsLR() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 21:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    @Override // com.vdodsodjsdt.E2spx2fDWN5IUkY2rPialU0ch7
    public Ldmx6alJBFBEfM0MLq2vhR zzpBGItXfub0yWj(z5jqbAH0neG z5jqbah0neg) {
        return new ECym1srKKeqP9(z5jqbah0neg.VxUQ9tBhpHJ2AAEDNW8sghc4m, z5jqbah0neg.zzpBGItXfub0yWj, z5jqbah0neg.V57tEvNfxZVVcOCAOih5PKr, z5jqbah0neg.ZfQNn8hdWlEQ5cR94249PDsLR, z5jqbah0neg.LaeGQIruHQu81hfJldjMOQSVblH3x);
    }

    public FG8LIxsgYiLSfhN0jYKIKr(RecyclerView recyclerView) {
        this.V57tEvNfxZVVcOCAOih5PKr = 27;
    }

    private final void KUYypEB4eNWOZWVDpH() {
    }

    private final void q1wNbhk2O6(int i, Object obj) {
    }
}
