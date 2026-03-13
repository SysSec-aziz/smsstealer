package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.AssetManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class UL4JI0eLnaD84py2JT {
    public Object LaeGQIruHQu81hfJldjMOQSVblH3x;
    public Object V57tEvNfxZVVcOCAOih5PKr;
    public Object VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public Object ZfQNn8hdWlEQ5cR94249PDsLR;
    public Object zzpBGItXfub0yWj;

    public UL4JI0eLnaD84py2JT(int i) {
        switch (i) {
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = XC6rwBjRUhvxaQ8TfYI.V57tEvNfxZVVcOCAOih5PKr;
                this.zzpBGItXfub0yWj = "GET";
                this.V57tEvNfxZVVcOCAOih5PKr = new yxp1I6Gr2tLDD3dH0UsMPMDr7();
                break;
            default:
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new AtomicBoolean(false);
                this.zzpBGItXfub0yWj = new CountDownLatch(1);
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = "PublicSuffixDatabase.list";
                break;
        }
    }

    public void Ca81ebIan1u(String str) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "url");
        if (ngO5JXZkj8nfh41LltHvEjUc.lxWWbfAOLs4jWzd7PSIiIJ(str, "ws:", true)) {
            String strSubstring = str.substring(3);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strSubstring, "substring(...)");
            str = "http:".concat(strSubstring);
        } else if (ngO5JXZkj8nfh41LltHvEjUc.lxWWbfAOLs4jWzd7PSIiIJ(str, "wss:", true)) {
            String strSubstring2 = str.substring(4);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strSubstring2, "substring(...)");
            str = "https:".concat(strSubstring2);
        }
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "<this>");
        oLPwQu4XgJ olpwqu4xgj = new oLPwQu4XgJ(0);
        olpwqu4xgj.zIvmSL0wzmmKGc3X39b2Gw2mUGE(null, str);
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = olpwqu4xgj.V57tEvNfxZVVcOCAOih5PKr();
    }

    public void GI83zq0G8e7zkn(String str, EOksdALzG1YtVRjkh eOksdALzG1YtVRjkh) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "method");
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (eOksdALzG1YtVRjkh == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                throw new IllegalArgumentException(u9SlVAuoWhQUfJ.M9e7PWhFYLD2lOGMker("method ", str, " must have a request body.").toString());
            }
        } else if (!hRrPPME7ytOB7ba.q11o1hieEkZDhF1MGOZI26oZiDT(str)) {
            throw new IllegalArgumentException(u9SlVAuoWhQUfJ.M9e7PWhFYLD2lOGMker("method ", str, " must not have a request body.").toString());
        }
        this.zzpBGItXfub0yWj = str;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = eOksdALzG1YtVRjkh;
    }

    public void HzCpKshMOoaw76hFcbOVRYMeRd(H73tKnp5B8 h73tKnp5B8) {
        IxShTNMvCWlbR ixShTNMvCWlbR = (IxShTNMvCWlbR) this.ZfQNn8hdWlEQ5cR94249PDsLR;
        ((ArrayList) this.V57tEvNfxZVVcOCAOih5PKr).add(h73tKnp5B8);
        int i = h73tKnp5B8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (i == 1) {
            ixShTNMvCWlbR.ZfQNn8hdWlEQ5cR94249PDsLR(h73tKnp5B8.zzpBGItXfub0yWj, h73tKnp5B8.V57tEvNfxZVVcOCAOih5PKr);
            return;
        }
        if (i == 2) {
            int i2 = h73tKnp5B8.zzpBGItXfub0yWj;
            int i3 = h73tKnp5B8.V57tEvNfxZVVcOCAOih5PKr;
            RecyclerView recyclerView = ixShTNMvCWlbR.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            recyclerView.YdNRGRc4rly(i2, i3, false);
            recyclerView.BJQHddi0Plr5ElWetCyaixWOg9 = true;
            return;
        }
        if (i == 4) {
            ixShTNMvCWlbR.V57tEvNfxZVVcOCAOih5PKr(h73tKnp5B8.zzpBGItXfub0yWj, h73tKnp5B8.V57tEvNfxZVVcOCAOih5PKr);
        } else if (i == 8) {
            ixShTNMvCWlbR.LaeGQIruHQu81hfJldjMOQSVblH3x(h73tKnp5B8.zzpBGItXfub0yWj, h73tKnp5B8.V57tEvNfxZVVcOCAOih5PKr);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + h73tKnp5B8);
        }
    }

    public void KUYypEB4eNWOZWVDpH() {
        try {
            nfXvCNpsFLQkxk3Wa nfxvcnpsflqkxk3wa = new nfXvCNpsFLQkxk3Wa(NSjgqmGjEzuugn2SsG1mZFP());
            try {
                oA1WO3soICf8H1N6bgpG oa1wo3soicf8h1n6bgpgZIvmSL0wzmmKGc3X39b2Gw2mUGE = nfxvcnpsflqkxk3wa.zIvmSL0wzmmKGc3X39b2Gw2mUGE(nfxvcnpsflqkxk3wa.readInt());
                oA1WO3soICf8H1N6bgpG oa1wo3soicf8h1n6bgpgZIvmSL0wzmmKGc3X39b2Gw2mUGE2 = nfxvcnpsflqkxk3wa.zIvmSL0wzmmKGc3X39b2Gw2mUGE(nfxvcnpsflqkxk3wa.readInt());
                nfxvcnpsflqkxk3wa.close();
                synchronized (this) {
                    ej6unYlOWMDF.p59rPv72J9(oa1wo3soicf8h1n6bgpgZIvmSL0wzmmKGc3X39b2Gw2mUGE);
                    this.V57tEvNfxZVVcOCAOih5PKr = oa1wo3soicf8h1n6bgpgZIvmSL0wzmmKGc3X39b2Gw2mUGE;
                    ej6unYlOWMDF.p59rPv72J9(oa1wo3soicf8h1n6bgpgZIvmSL0wzmmKGc3X39b2Gw2mUGE2);
                    this.ZfQNn8hdWlEQ5cR94249PDsLR = oa1wo3soicf8h1n6bgpgZIvmSL0wzmmKGc3X39b2Gw2mUGE2;
                }
            } finally {
            }
        } finally {
            ((CountDownLatch) this.zzpBGItXfub0yWj).countDown();
        }
    }

    public int LaeGQIruHQu81hfJldjMOQSVblH3x(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.V57tEvNfxZVVcOCAOih5PKr;
        int size = arrayList.size();
        while (i2 < size) {
            H73tKnp5B8 h73tKnp5B8 = (H73tKnp5B8) arrayList.get(i2);
            int i3 = h73tKnp5B8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (i3 == 8) {
                int i4 = h73tKnp5B8.zzpBGItXfub0yWj;
                if (i4 == i) {
                    i = h73tKnp5B8.V57tEvNfxZVVcOCAOih5PKr;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (h73tKnp5B8.V57tEvNfxZVVcOCAOih5PKr <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = h73tKnp5B8.zzpBGItXfub0yWj;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = h73tKnp5B8.V57tEvNfxZVVcOCAOih5PKr;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += h73tKnp5B8.V57tEvNfxZVVcOCAOih5PKr;
                }
            }
            i2++;
        }
        return i;
    }

    public H73tKnp5B8 M9e7PWhFYLD2lOGMker(int i, int i2, int i3) {
        H73tKnp5B8 h73tKnp5B8 = (H73tKnp5B8) ((ecw4qnyPnY9UWzcAo9wor) this.VxUQ9tBhpHJ2AAEDNW8sghc4m).VxUQ9tBhpHJ2AAEDNW8sghc4m();
        if (h73tKnp5B8 != null) {
            h73tKnp5B8.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
            h73tKnp5B8.zzpBGItXfub0yWj = i2;
            h73tKnp5B8.V57tEvNfxZVVcOCAOih5PKr = i3;
            return h73tKnp5B8;
        }
        H73tKnp5B8 h73tKnp5B82 = new H73tKnp5B8();
        h73tKnp5B82.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        h73tKnp5B82.zzpBGItXfub0yWj = i2;
        h73tKnp5B82.V57tEvNfxZVVcOCAOih5PKr = i3;
        return h73tKnp5B82;
    }

    public nc8XjqIVIbczRCLb7rZ6G NSjgqmGjEzuugn2SsG1mZFP() throws IOException {
        AssetManager assets;
        O510kkNvCgHHMXIbKz1NqEFfrmj o510kkNvCgHHMXIbKz1NqEFfrmj = O510kkNvCgHHMXIbKz1NqEFfrmj.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        Object obj = O510kkNvCgHHMXIbKz1NqEFfrmj.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        Ih2RkfswCyHapPVuA ih2RkfswCyHapPVuA = obj != null ? (Ih2RkfswCyHapPVuA) obj : null;
        Context contextZzpBGItXfub0yWj = ih2RkfswCyHapPVuA != null ? ih2RkfswCyHapPVuA.zzpBGItXfub0yWj() : null;
        if (contextZzpBGItXfub0yWj == null || (assets = contextZzpBGItXfub0yWj.getAssets()) == null) {
            throw new IOException("Platform applicationContext not initialized");
        }
        InputStream inputStreamOpen = assets.open((String) this.LaeGQIruHQu81hfJldjMOQSVblH3x);
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(inputStreamOpen, "open(...)");
        return new nc8XjqIVIbczRCLb7rZ6G(1, inputStreamOpen, new Rls9YNaGzWVnzvwT());
    }

    public void V57tEvNfxZVVcOCAOih5PKr(H73tKnp5B8 h73tKnp5B8) {
        int i;
        ecw4qnyPnY9UWzcAo9wor ecw4qnypny9uwzcao9wor = (ecw4qnyPnY9UWzcAo9wor) this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        int i2 = h73tKnp5B8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iP59rPv72J9 = p59rPv72J9(h73tKnp5B8.zzpBGItXfub0yWj, i2);
        int i3 = h73tKnp5B8.zzpBGItXfub0yWj;
        int i4 = h73tKnp5B8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + h73tKnp5B8);
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < h73tKnp5B8.V57tEvNfxZVVcOCAOih5PKr; i6++) {
            int iP59rPv72J92 = p59rPv72J9((i * i6) + h73tKnp5B8.zzpBGItXfub0yWj, h73tKnp5B8.VxUQ9tBhpHJ2AAEDNW8sghc4m);
            int i7 = h73tKnp5B8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (i7 == 2 ? iP59rPv72J92 != iP59rPv72J9 : !(i7 == 4 && iP59rPv72J92 == iP59rPv72J9 + 1)) {
                H73tKnp5B8 h73tKnp5B8M9e7PWhFYLD2lOGMker = M9e7PWhFYLD2lOGMker(i7, iP59rPv72J9, i5);
                ZfQNn8hdWlEQ5cR94249PDsLR(h73tKnp5B8M9e7PWhFYLD2lOGMker, i3);
                ecw4qnypny9uwzcao9wor.V57tEvNfxZVVcOCAOih5PKr(h73tKnp5B8M9e7PWhFYLD2lOGMker);
                if (h73tKnp5B8.VxUQ9tBhpHJ2AAEDNW8sghc4m == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iP59rPv72J9 = iP59rPv72J92;
            } else {
                i5++;
            }
        }
        ecw4qnypny9uwzcao9wor.V57tEvNfxZVVcOCAOih5PKr(h73tKnp5B8);
        if (i5 > 0) {
            H73tKnp5B8 h73tKnp5B8M9e7PWhFYLD2lOGMker2 = M9e7PWhFYLD2lOGMker(h73tKnp5B8.VxUQ9tBhpHJ2AAEDNW8sghc4m, iP59rPv72J9, i5);
            ZfQNn8hdWlEQ5cR94249PDsLR(h73tKnp5B8M9e7PWhFYLD2lOGMker2, i3);
            ecw4qnypny9uwzcao9wor.V57tEvNfxZVVcOCAOih5PKr(h73tKnp5B8M9e7PWhFYLD2lOGMker2);
        }
    }

    public boolean VxUQ9tBhpHJ2AAEDNW8sghc4m(int i) {
        ArrayList arrayList = (ArrayList) this.V57tEvNfxZVVcOCAOih5PKr;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            H73tKnp5B8 h73tKnp5B8 = (H73tKnp5B8) arrayList.get(i2);
            int i3 = h73tKnp5B8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = h73tKnp5B8.zzpBGItXfub0yWj;
                    int i5 = h73tKnp5B8.V57tEvNfxZVVcOCAOih5PKr + i4;
                    while (i4 < i5) {
                        if (LaeGQIruHQu81hfJldjMOQSVblH3x(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (LaeGQIruHQu81hfJldjMOQSVblH3x(h73tKnp5B8.V57tEvNfxZVVcOCAOih5PKr, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public void ZLZeBXTMq0zDztBxtRTuCHrapQ(String str, String str2) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str2, "value");
        yxp1I6Gr2tLDD3dH0UsMPMDr7 yxp1i6gr2tldd3dh0usmpmdr7 = (yxp1I6Gr2tLDD3dH0UsMPMDr7) this.V57tEvNfxZVVcOCAOih5PKr;
        yxp1i6gr2tldd3dh0usmpmdr7.getClass();
        zonOxHotd3BwAPJcwqr6I6uQNngg4.aXO0LSrt8bKV(str);
        zonOxHotd3BwAPJcwqr6I6uQNngg4.vE4yDIjexsP2lGjLaTcB(str2, str);
        yxp1i6gr2tldd3dh0usmpmdr7.V57tEvNfxZVVcOCAOih5PKr(str);
        zonOxHotd3BwAPJcwqr6I6uQNngg4.NSjgqmGjEzuugn2SsG1mZFP(yxp1i6gr2tldd3dh0usmpmdr7, str, str2);
    }

    public void ZfQNn8hdWlEQ5cR94249PDsLR(H73tKnp5B8 h73tKnp5B8, int i) {
        IxShTNMvCWlbR ixShTNMvCWlbR = (IxShTNMvCWlbR) this.ZfQNn8hdWlEQ5cR94249PDsLR;
        ixShTNMvCWlbR.VxUQ9tBhpHJ2AAEDNW8sghc4m(h73tKnp5B8);
        int i2 = h73tKnp5B8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            ixShTNMvCWlbR.V57tEvNfxZVVcOCAOih5PKr(i, h73tKnp5B8.V57tEvNfxZVVcOCAOih5PKr);
        } else {
            int i3 = h73tKnp5B8.V57tEvNfxZVVcOCAOih5PKr;
            RecyclerView recyclerView = ixShTNMvCWlbR.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            recyclerView.YdNRGRc4rly(i, i3, true);
            recyclerView.BJQHddi0Plr5ElWetCyaixWOg9 = true;
            recyclerView.H2VFYNJEVGAX.V57tEvNfxZVVcOCAOih5PKr += i3;
        }
    }

    public int p59rPv72J9(int i, int i2) {
        int i3;
        int i4;
        ecw4qnyPnY9UWzcAo9wor ecw4qnypny9uwzcao9wor = (ecw4qnyPnY9UWzcAo9wor) this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        ArrayList arrayList = (ArrayList) this.V57tEvNfxZVVcOCAOih5PKr;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            H73tKnp5B8 h73tKnp5B8 = (H73tKnp5B8) arrayList.get(size);
            int i5 = h73tKnp5B8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (i5 == 8) {
                int i6 = h73tKnp5B8.zzpBGItXfub0yWj;
                int i7 = h73tKnp5B8.V57tEvNfxZVVcOCAOih5PKr;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            h73tKnp5B8.zzpBGItXfub0yWj = i6 + 1;
                            h73tKnp5B8.V57tEvNfxZVVcOCAOih5PKr = i7 + 1;
                        } else if (i2 == 2) {
                            h73tKnp5B8.zzpBGItXfub0yWj = i6 - 1;
                            h73tKnp5B8.V57tEvNfxZVVcOCAOih5PKr = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        h73tKnp5B8.V57tEvNfxZVVcOCAOih5PKr = i7 + 1;
                    } else if (i2 == 2) {
                        h73tKnp5B8.V57tEvNfxZVVcOCAOih5PKr = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        h73tKnp5B8.zzpBGItXfub0yWj = i6 + 1;
                    } else if (i2 == 2) {
                        h73tKnp5B8.zzpBGItXfub0yWj = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = h73tKnp5B8.zzpBGItXfub0yWj;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= h73tKnp5B8.V57tEvNfxZVVcOCAOih5PKr;
                    } else if (i5 == 2) {
                        i += h73tKnp5B8.V57tEvNfxZVVcOCAOih5PKr;
                    }
                } else if (i2 == 1) {
                    h73tKnp5B8.zzpBGItXfub0yWj = i8 + 1;
                } else if (i2 == 2) {
                    h73tKnp5B8.zzpBGItXfub0yWj = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            H73tKnp5B8 h73tKnp5B82 = (H73tKnp5B8) arrayList.get(size2);
            if (h73tKnp5B82.VxUQ9tBhpHJ2AAEDNW8sghc4m == 8) {
                int i9 = h73tKnp5B82.V57tEvNfxZVVcOCAOih5PKr;
                if (i9 == h73tKnp5B82.zzpBGItXfub0yWj || i9 < 0) {
                    arrayList.remove(size2);
                    ecw4qnypny9uwzcao9wor.V57tEvNfxZVVcOCAOih5PKr(h73tKnp5B82);
                }
            } else if (h73tKnp5B82.V57tEvNfxZVVcOCAOih5PKr <= 0) {
                arrayList.remove(size2);
                ecw4qnypny9uwzcao9wor.V57tEvNfxZVVcOCAOih5PKr(h73tKnp5B82);
            }
        }
        return i;
    }

    public void q1wNbhk2O6(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            H73tKnp5B8 h73tKnp5B8 = (H73tKnp5B8) arrayList.get(i);
            h73tKnp5B8.getClass();
            ((ecw4qnyPnY9UWzcAo9wor) this.VxUQ9tBhpHJ2AAEDNW8sghc4m).V57tEvNfxZVVcOCAOih5PKr(h73tKnp5B8);
        }
        arrayList.clear();
    }

    public boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE() {
        return ((ArrayList) this.zzpBGItXfub0yWj).size() > 0;
    }

    public void zzpBGItXfub0yWj() {
        IxShTNMvCWlbR ixShTNMvCWlbR = (IxShTNMvCWlbR) this.ZfQNn8hdWlEQ5cR94249PDsLR;
        ArrayList arrayList = (ArrayList) this.V57tEvNfxZVVcOCAOih5PKr;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((IxShTNMvCWlbR) this.ZfQNn8hdWlEQ5cR94249PDsLR).VxUQ9tBhpHJ2AAEDNW8sghc4m((H73tKnp5B8) arrayList.get(i));
        }
        q1wNbhk2O6(arrayList);
        ArrayList arrayList2 = (ArrayList) this.zzpBGItXfub0yWj;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            H73tKnp5B8 h73tKnp5B8 = (H73tKnp5B8) arrayList2.get(i2);
            int i3 = h73tKnp5B8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (i3 == 1) {
                ixShTNMvCWlbR.VxUQ9tBhpHJ2AAEDNW8sghc4m(h73tKnp5B8);
                ixShTNMvCWlbR.ZfQNn8hdWlEQ5cR94249PDsLR(h73tKnp5B8.zzpBGItXfub0yWj, h73tKnp5B8.V57tEvNfxZVVcOCAOih5PKr);
            } else if (i3 == 2) {
                ixShTNMvCWlbR.VxUQ9tBhpHJ2AAEDNW8sghc4m(h73tKnp5B8);
                int i4 = h73tKnp5B8.zzpBGItXfub0yWj;
                int i5 = h73tKnp5B8.V57tEvNfxZVVcOCAOih5PKr;
                RecyclerView recyclerView = ixShTNMvCWlbR.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                recyclerView.YdNRGRc4rly(i4, i5, true);
                recyclerView.BJQHddi0Plr5ElWetCyaixWOg9 = true;
                recyclerView.H2VFYNJEVGAX.V57tEvNfxZVVcOCAOih5PKr += i5;
            } else if (i3 == 4) {
                ixShTNMvCWlbR.VxUQ9tBhpHJ2AAEDNW8sghc4m(h73tKnp5B8);
                ixShTNMvCWlbR.V57tEvNfxZVVcOCAOih5PKr(h73tKnp5B8.zzpBGItXfub0yWj, h73tKnp5B8.V57tEvNfxZVVcOCAOih5PKr);
            } else if (i3 == 8) {
                ixShTNMvCWlbR.VxUQ9tBhpHJ2AAEDNW8sghc4m(h73tKnp5B8);
                ixShTNMvCWlbR.LaeGQIruHQu81hfJldjMOQSVblH3x(h73tKnp5B8.zzpBGItXfub0yWj, h73tKnp5B8.V57tEvNfxZVVcOCAOih5PKr);
            }
        }
        q1wNbhk2O6(arrayList2);
    }
}
