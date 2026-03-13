package com.vdodsodjsdt;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class U4Gf2WRl4jA30QHPc implements cWn2EVjHRjuSHU5xQi {
    public static final EUSG2RPrSQzuno7qTyOhv0Az ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final hy3v1zJcCYok89Y1iAeFhN66 V57tEvNfxZVVcOCAOih5PKr;
    public final o8p4Xhf9gKH3WuUFc74 VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final zvqhqc7YVxGqa3qIRo ZfQNn8hdWlEQ5cR94249PDsLR;
    public final xBkpwtKksCOQS zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final ohjB5lavt9Gy1qVLWRd zzpBGItXfub0yWj;

    static {
        EUSG2RPrSQzuno7qTyOhv0Az eUSG2RPrSQzuno7qTyOhv0Az = EUSG2RPrSQzuno7qTyOhv0Az.ZfQNn8hdWlEQ5cR94249PDsLR;
        String[] strArr = (String[]) Arrays.copyOf(new String[]{"OkHttp-Response-Body", "Truncated"}, 2);
        ej6unYlOWMDF.pYmKDYlAmhudp(strArr, "inputNamesAndValues");
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        int length = strArr2.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (strArr2[i2] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i2] = cwhrCnoVJBjJE2CBEAvBopmgF.tf2p6GzNN7uQY7Lun0pJ(strArr[i2]).toString();
        }
        int iW0Wu95l8dVNw5rZMRu = zonOxHotd3BwAPJcwqr6I6uQNngg4.w0Wu95l8dVNw5rZMRu(0, strArr2.length - 1, 2);
        if (iW0Wu95l8dVNw5rZMRu >= 0) {
            while (true) {
                String str = strArr2[i];
                String str2 = strArr2[i + 1];
                zonOxHotd3BwAPJcwqr6I6uQNngg4.aXO0LSrt8bKV(str);
                zonOxHotd3BwAPJcwqr6I6uQNngg4.vE4yDIjexsP2lGjLaTcB(str2, str);
                if (i == iW0Wu95l8dVNw5rZMRu) {
                    break;
                } else {
                    i += 2;
                }
            }
        }
        ZLZeBXTMq0zDztBxtRTuCHrapQ = new EUSG2RPrSQzuno7qTyOhv0Az(strArr2);
    }

    public U4Gf2WRl4jA30QHPc(o8p4Xhf9gKH3WuUFc74 o8p4xhf9gkh3wuufc74, ohjB5lavt9Gy1qVLWRd ohjb5lavt9gy1qvlwrd, hy3v1zJcCYok89Y1iAeFhN66 hy3v1zjccyok89y1iaefhn66, zvqhqc7YVxGqa3qIRo zvqhqc7yvxgqa3qiro) {
        ej6unYlOWMDF.pYmKDYlAmhudp(hy3v1zjccyok89y1iaefhn66, "source");
        ej6unYlOWMDF.pYmKDYlAmhudp(zvqhqc7yvxgqa3qiro, "sink");
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = o8p4xhf9gkh3wuufc74;
        this.zzpBGItXfub0yWj = ohjb5lavt9gy1qvlwrd;
        this.V57tEvNfxZVVcOCAOih5PKr = hy3v1zjccyok89y1iaefhn66;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = zvqhqc7yvxgqa3qiro;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = new xBkpwtKksCOQS(hy3v1zjccyok89y1iaefhn66);
    }

    @Override // com.vdodsodjsdt.cWn2EVjHRjuSHU5xQi
    public final GPbzGuds6T72DsvjLiqOziy8CFcNt GI83zq0G8e7zkn(boolean z) throws IOException {
        xBkpwtKksCOQS xbkpwtkkscoqs = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.LaeGQIruHQu81hfJldjMOQSVblH3x).toString());
        }
        try {
            String strQ1wNbhk2O6 = ((hy3v1zJcCYok89Y1iAeFhN66) xbkpwtkkscoqs.V57tEvNfxZVVcOCAOih5PKr).q1wNbhk2O6(xbkpwtkkscoqs.zzpBGItXfub0yWj);
            xbkpwtkkscoqs.zzpBGItXfub0yWj -= (long) strQ1wNbhk2O6.length();
            EojTdi0RA3dj3eHVZuyuXZ1kkQ3Cb eojTdi0RA3dj3eHVZuyuXZ1kkQ3CbD9zDyyznnp3oaDT1Ug = zonOxHotd3BwAPJcwqr6I6uQNngg4.d9zDyyznnp3oaDT1Ug(strQ1wNbhk2O6);
            int i2 = eojTdi0RA3dj3eHVZuyuXZ1kkQ3CbD9zDyyznnp3oaDT1Ug.zzpBGItXfub0yWj;
            GPbzGuds6T72DsvjLiqOziy8CFcNt gPbzGuds6T72DsvjLiqOziy8CFcNt = new GPbzGuds6T72DsvjLiqOziy8CFcNt();
            gPbzGuds6T72DsvjLiqOziy8CFcNt.zzpBGItXfub0yWj = (ZQ5iEBLmvObelGeRgKLPRxHbZEk) eojTdi0RA3dj3eHVZuyuXZ1kkQ3CbD9zDyyznnp3oaDT1Ug.V57tEvNfxZVVcOCAOih5PKr;
            gPbzGuds6T72DsvjLiqOziy8CFcNt.V57tEvNfxZVVcOCAOih5PKr = i2;
            gPbzGuds6T72DsvjLiqOziy8CFcNt.ZfQNn8hdWlEQ5cR94249PDsLR = (String) eojTdi0RA3dj3eHVZuyuXZ1kkQ3CbD9zDyyznnp3oaDT1Ug.ZfQNn8hdWlEQ5cR94249PDsLR;
            gPbzGuds6T72DsvjLiqOziy8CFcNt.zIvmSL0wzmmKGc3X39b2Gw2mUGE = xbkpwtkkscoqs.zIvmSL0wzmmKGc3X39b2Gw2mUGE().V57tEvNfxZVVcOCAOih5PKr();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = 3;
                return gPbzGuds6T72DsvjLiqOziy8CFcNt;
            }
            if (102 > i2 || i2 >= 200) {
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = 4;
                return gPbzGuds6T72DsvjLiqOziy8CFcNt;
            }
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = 3;
            return gPbzGuds6T72DsvjLiqOziy8CFcNt;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on " + this.zzpBGItXfub0yWj.zIvmSL0wzmmKGc3X39b2Gw2mUGE().VxUQ9tBhpHJ2AAEDNW8sghc4m.GI83zq0G8e7zkn.ZLZeBXTMq0zDztBxtRTuCHrapQ(), e);
        }
    }

    public final void HzCpKshMOoaw76hFcbOVRYMeRd(EUSG2RPrSQzuno7qTyOhv0Az eUSG2RPrSQzuno7qTyOhv0Az, String str) {
        ej6unYlOWMDF.pYmKDYlAmhudp(eUSG2RPrSQzuno7qTyOhv0Az, "headers");
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "requestLine");
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x != 0) {
            throw new IllegalStateException(("state: " + this.LaeGQIruHQu81hfJldjMOQSVblH3x).toString());
        }
        zvqhqc7YVxGqa3qIRo zvqhqc7yvxgqa3qiro = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        zvqhqc7yvxgqa3qiro.Irh5auREsoeV1C1RaBamlmy(str).Irh5auREsoeV1C1RaBamlmy("\r\n");
        int size = eUSG2RPrSQzuno7qTyOhv0Az.size();
        for (int i = 0; i < size; i++) {
            zvqhqc7yvxgqa3qiro.Irh5auREsoeV1C1RaBamlmy(eUSG2RPrSQzuno7qTyOhv0Az.zzpBGItXfub0yWj(i)).Irh5auREsoeV1C1RaBamlmy(": ").Irh5auREsoeV1C1RaBamlmy(eUSG2RPrSQzuno7qTyOhv0Az.ZfQNn8hdWlEQ5cR94249PDsLR(i)).Irh5auREsoeV1C1RaBamlmy("\r\n");
        }
        zvqhqc7yvxgqa3qiro.Irh5auREsoeV1C1RaBamlmy("\r\n");
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = 1;
    }

    @Override // com.vdodsodjsdt.cWn2EVjHRjuSHU5xQi
    public final ohjB5lavt9Gy1qVLWRd LaeGQIruHQu81hfJldjMOQSVblH3x() {
        return this.zzpBGItXfub0yWj;
    }

    public final aUMGpK2XTYCqkTc7b M9e7PWhFYLD2lOGMker(sveu0WcbYc1gIe sveu0wcbyc1gie, long j) {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x == 4) {
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = 5;
            return new aUMGpK2XTYCqkTc7b(this, sveu0wcbyc1gie, j);
        }
        throw new IllegalStateException(("state: " + this.LaeGQIruHQu81hfJldjMOQSVblH3x).toString());
    }

    @Override // com.vdodsodjsdt.cWn2EVjHRjuSHU5xQi
    public final void NSjgqmGjEzuugn2SsG1mZFP(tpLngQCdAeyjjtxlI tplngqcdaeyjjtxli) {
        Proxy.Type type = this.zzpBGItXfub0yWj.zIvmSL0wzmmKGc3X39b2Gw2mUGE().zzpBGItXfub0yWj.type();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(type, "type(...)");
        StringBuilder sb = new StringBuilder();
        sb.append((String) tplngqcdaeyjjtxli.V57tEvNfxZVVcOCAOih5PKr);
        sb.append(' ');
        sveu0WcbYc1gIe sveu0wcbyc1gie = (sveu0WcbYc1gIe) tplngqcdaeyjjtxli.zzpBGItXfub0yWj;
        if (ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(sveu0wcbyc1gie.VxUQ9tBhpHJ2AAEDNW8sghc4m, "https") || type != Proxy.Type.HTTP) {
            String strZzpBGItXfub0yWj = sveu0wcbyc1gie.zzpBGItXfub0yWj();
            String strZfQNn8hdWlEQ5cR94249PDsLR = sveu0wcbyc1gie.ZfQNn8hdWlEQ5cR94249PDsLR();
            if (strZfQNn8hdWlEQ5cR94249PDsLR != null) {
                strZzpBGItXfub0yWj = strZzpBGItXfub0yWj + '?' + strZfQNn8hdWlEQ5cR94249PDsLR;
            }
            sb.append(strZzpBGItXfub0yWj);
        } else {
            sb.append(sveu0wcbyc1gie);
        }
        sb.append(" HTTP/1.1");
        HzCpKshMOoaw76hFcbOVRYMeRd((EUSG2RPrSQzuno7qTyOhv0Az) tplngqcdaeyjjtxli.ZfQNn8hdWlEQ5cR94249PDsLR, sb.toString());
    }

    @Override // com.vdodsodjsdt.cWn2EVjHRjuSHU5xQi
    public final boolean V57tEvNfxZVVcOCAOih5PKr() {
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x == 6;
    }

    @Override // com.vdodsodjsdt.cWn2EVjHRjuSHU5xQi
    public final long VxUQ9tBhpHJ2AAEDNW8sghc4m(vQITfhejPO vqitfhejpo) {
        if (!UG5R4AGFAqQpcgiqbH.VxUQ9tBhpHJ2AAEDNW8sghc4m(vqitfhejpo)) {
            return 0L;
        }
        String strVxUQ9tBhpHJ2AAEDNW8sghc4m = vqitfhejpo.NSjgqmGjEzuugn2SsG1mZFP.VxUQ9tBhpHJ2AAEDNW8sghc4m("Transfer-Encoding");
        if (strVxUQ9tBhpHJ2AAEDNW8sghc4m == null) {
            strVxUQ9tBhpHJ2AAEDNW8sghc4m = null;
        }
        if ("chunked".equalsIgnoreCase(strVxUQ9tBhpHJ2AAEDNW8sghc4m)) {
            return -1L;
        }
        return U7JVXX1Kyh43VgUF.ZfQNn8hdWlEQ5cR94249PDsLR(vqitfhejpo);
    }

    @Override // com.vdodsodjsdt.cWn2EVjHRjuSHU5xQi
    public final iIBl3qIny2 ZLZeBXTMq0zDztBxtRTuCHrapQ(vQITfhejPO vqitfhejpo) {
        tpLngQCdAeyjjtxlI tplngqcdaeyjjtxli = vqitfhejpo.V57tEvNfxZVVcOCAOih5PKr;
        if (!UG5R4AGFAqQpcgiqbH.VxUQ9tBhpHJ2AAEDNW8sghc4m(vqitfhejpo)) {
            return M9e7PWhFYLD2lOGMker((sveu0WcbYc1gIe) tplngqcdaeyjjtxli.zzpBGItXfub0yWj, 0L);
        }
        String strVxUQ9tBhpHJ2AAEDNW8sghc4m = vqitfhejpo.NSjgqmGjEzuugn2SsG1mZFP.VxUQ9tBhpHJ2AAEDNW8sghc4m("Transfer-Encoding");
        if (strVxUQ9tBhpHJ2AAEDNW8sghc4m == null) {
            strVxUQ9tBhpHJ2AAEDNW8sghc4m = null;
        }
        if ("chunked".equalsIgnoreCase(strVxUQ9tBhpHJ2AAEDNW8sghc4m)) {
            sveu0WcbYc1gIe sveu0wcbyc1gie = (sveu0WcbYc1gIe) tplngqcdaeyjjtxli.zzpBGItXfub0yWj;
            if (this.LaeGQIruHQu81hfJldjMOQSVblH3x == 4) {
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = 5;
                return new W3AsHjFbohQYd(this, sveu0wcbyc1gie);
            }
            throw new IllegalStateException(("state: " + this.LaeGQIruHQu81hfJldjMOQSVblH3x).toString());
        }
        long jZfQNn8hdWlEQ5cR94249PDsLR = U7JVXX1Kyh43VgUF.ZfQNn8hdWlEQ5cR94249PDsLR(vqitfhejpo);
        if (jZfQNn8hdWlEQ5cR94249PDsLR != -1) {
            return M9e7PWhFYLD2lOGMker((sveu0WcbYc1gIe) tplngqcdaeyjjtxli.zzpBGItXfub0yWj, jZfQNn8hdWlEQ5cR94249PDsLR);
        }
        sveu0WcbYc1gIe sveu0wcbyc1gie2 = (sveu0WcbYc1gIe) tplngqcdaeyjjtxli.zzpBGItXfub0yWj;
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x != 4) {
            throw new IllegalStateException(("state: " + this.LaeGQIruHQu81hfJldjMOQSVblH3x).toString());
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = 5;
        this.zzpBGItXfub0yWj.NSjgqmGjEzuugn2SsG1mZFP();
        ej6unYlOWMDF.pYmKDYlAmhudp(sveu0wcbyc1gie2, "url");
        return new hPZKIw1gzrCmP(this, sveu0wcbyc1gie2);
    }

    @Override // com.vdodsodjsdt.cWn2EVjHRjuSHU5xQi
    public final void ZfQNn8hdWlEQ5cR94249PDsLR() {
        this.ZfQNn8hdWlEQ5cR94249PDsLR.flush();
    }

    @Override // com.vdodsodjsdt.cWn2EVjHRjuSHU5xQi
    public final void cancel() {
        this.zzpBGItXfub0yWj.cancel();
    }

    @Override // com.vdodsodjsdt.cWn2EVjHRjuSHU5xQi
    public final CZ74FjSsfST8z15SHXk zIvmSL0wzmmKGc3X39b2Gw2mUGE(tpLngQCdAeyjjtxlI tplngqcdaeyjjtxli, long j) {
        if ("chunked".equalsIgnoreCase(((EUSG2RPrSQzuno7qTyOhv0Az) tplngqcdaeyjjtxli.ZfQNn8hdWlEQ5cR94249PDsLR).VxUQ9tBhpHJ2AAEDNW8sghc4m("Transfer-Encoding"))) {
            if (this.LaeGQIruHQu81hfJldjMOQSVblH3x == 1) {
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = 2;
                return new x6wsDFBJNUHHP0Fl1UlQEjR44n9n(this);
            }
            throw new IllegalStateException(("state: " + this.LaeGQIruHQu81hfJldjMOQSVblH3x).toString());
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x == 1) {
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = 2;
            return new YYF9txVtIMdGq7J3GviNNsQqNj6vT(this);
        }
        throw new IllegalStateException(("state: " + this.LaeGQIruHQu81hfJldjMOQSVblH3x).toString());
    }

    @Override // com.vdodsodjsdt.cWn2EVjHRjuSHU5xQi
    public final void zzpBGItXfub0yWj() {
        this.ZfQNn8hdWlEQ5cR94249PDsLR.flush();
    }
}
