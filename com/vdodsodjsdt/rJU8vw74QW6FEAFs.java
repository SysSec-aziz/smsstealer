package com.vdodsodjsdt;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class rJU8vw74QW6FEAFs extends EOksdALzG1YtVRjkh {
    public static final byte[] GI83zq0G8e7zkn;
    public static final byte[] M9e7PWhFYLD2lOGMker;
    public static final byte[] NSjgqmGjEzuugn2SsG1mZFP;
    public static final gILkjwpvkGF5oaalOyU ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public static final gILkjwpvkGF5oaalOyU zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public long LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final List V57tEvNfxZVVcOCAOih5PKr;
    public final gILkjwpvkGF5oaalOyU ZfQNn8hdWlEQ5cR94249PDsLR;
    public final oA1WO3soICf8H1N6bgpG zzpBGItXfub0yWj;

    static {
        u3oM4Jia4hn5PHaSzj7t25fUwRg7 u3om4jia4hn5phaszj7t25fuwrg7 = gILkjwpvkGF5oaalOyU.ZfQNn8hdWlEQ5cR94249PDsLR;
        zIvmSL0wzmmKGc3X39b2Gw2mUGE = KfeOQNOupsCg6878zi4e.ko09zE6UAgwkV("multipart/mixed");
        KfeOQNOupsCg6878zi4e.ko09zE6UAgwkV("multipart/alternative");
        KfeOQNOupsCg6878zi4e.ko09zE6UAgwkV("multipart/digest");
        KfeOQNOupsCg6878zi4e.ko09zE6UAgwkV("multipart/parallel");
        ZLZeBXTMq0zDztBxtRTuCHrapQ = KfeOQNOupsCg6878zi4e.ko09zE6UAgwkV("multipart/form-data");
        NSjgqmGjEzuugn2SsG1mZFP = new byte[]{58, 32};
        GI83zq0G8e7zkn = new byte[]{13, 10};
        M9e7PWhFYLD2lOGMker = new byte[]{45, 45};
    }

    public rJU8vw74QW6FEAFs(oA1WO3soICf8H1N6bgpG oa1wo3soicf8h1n6bgpg, gILkjwpvkGF5oaalOyU gilkjwpvkgf5oaaloyu, List list) {
        ej6unYlOWMDF.pYmKDYlAmhudp(oa1wo3soicf8h1n6bgpg, "boundaryByteString");
        ej6unYlOWMDF.pYmKDYlAmhudp(gilkjwpvkgf5oaaloyu, "type");
        this.zzpBGItXfub0yWj = oa1wo3soicf8h1n6bgpg;
        this.V57tEvNfxZVVcOCAOih5PKr = list;
        u3oM4Jia4hn5PHaSzj7t25fUwRg7 u3om4jia4hn5phaszj7t25fuwrg7 = gILkjwpvkGF5oaalOyU.ZfQNn8hdWlEQ5cR94249PDsLR;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = KfeOQNOupsCg6878zi4e.ko09zE6UAgwkV(gilkjwpvkgf5oaaloyu + "; boundary=" + oa1wo3soicf8h1n6bgpg.M9e7PWhFYLD2lOGMker());
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long LaeGQIruHQu81hfJldjMOQSVblH3x(zvqhqc7YVxGqa3qIRo zvqhqc7yvxgqa3qiro, boolean z) throws IOException {
        EouCzLZsW9ynithduh eouCzLZsW9ynithduh;
        zvqhqc7YVxGqa3qIRo eouCzLZsW9ynithduh2;
        if (z) {
            eouCzLZsW9ynithduh2 = new EouCzLZsW9ynithduh();
            eouCzLZsW9ynithduh = eouCzLZsW9ynithduh2;
        } else {
            eouCzLZsW9ynithduh = 0;
            eouCzLZsW9ynithduh2 = zvqhqc7yvxgqa3qiro;
        }
        List list = this.V57tEvNfxZVVcOCAOih5PKr;
        int size = list.size();
        long j = 0;
        int i = 0;
        while (true) {
            oA1WO3soICf8H1N6bgpG oa1wo3soicf8h1n6bgpg = this.zzpBGItXfub0yWj;
            byte[] bArr = M9e7PWhFYLD2lOGMker;
            byte[] bArr2 = GI83zq0G8e7zkn;
            if (i >= size) {
                ej6unYlOWMDF.p59rPv72J9(eouCzLZsW9ynithduh2);
                eouCzLZsW9ynithduh2.write(bArr);
                eouCzLZsW9ynithduh2.pYmKDYlAmhudp(oa1wo3soicf8h1n6bgpg);
                eouCzLZsW9ynithduh2.write(bArr);
                eouCzLZsW9ynithduh2.write(bArr2);
                if (!z) {
                    return j;
                }
                ej6unYlOWMDF.p59rPv72J9(eouCzLZsW9ynithduh);
                long j2 = j + eouCzLZsW9ynithduh.ZfQNn8hdWlEQ5cR94249PDsLR;
                eouCzLZsW9ynithduh.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                return j2;
            }
            y7op5wlt8jKmN y7op5wlt8jkmn = (y7op5wlt8jKmN) list.get(i);
            EUSG2RPrSQzuno7qTyOhv0Az eUSG2RPrSQzuno7qTyOhv0Az = y7op5wlt8jkmn.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            qR4G0Ppspx4V2jaYTHnJ qr4g0ppspx4v2jaythnj = y7op5wlt8jkmn.zzpBGItXfub0yWj;
            ej6unYlOWMDF.p59rPv72J9(eouCzLZsW9ynithduh2);
            eouCzLZsW9ynithduh2.write(bArr);
            eouCzLZsW9ynithduh2.pYmKDYlAmhudp(oa1wo3soicf8h1n6bgpg);
            eouCzLZsW9ynithduh2.write(bArr2);
            int size2 = eUSG2RPrSQzuno7qTyOhv0Az.size();
            for (int i2 = 0; i2 < size2; i2++) {
                eouCzLZsW9ynithduh2.Irh5auREsoeV1C1RaBamlmy(eUSG2RPrSQzuno7qTyOhv0Az.zzpBGItXfub0yWj(i2)).write(NSjgqmGjEzuugn2SsG1mZFP).Irh5auREsoeV1C1RaBamlmy(eUSG2RPrSQzuno7qTyOhv0Az.ZfQNn8hdWlEQ5cR94249PDsLR(i2)).write(bArr2);
            }
            gILkjwpvkGF5oaalOyU gilkjwpvkgf5oaaloyu = qr4g0ppspx4v2jaythnj.zzpBGItXfub0yWj;
            if (gilkjwpvkgf5oaaloyu != null) {
                eouCzLZsW9ynithduh2.Irh5auREsoeV1C1RaBamlmy("Content-Type: ").Irh5auREsoeV1C1RaBamlmy(gilkjwpvkgf5oaaloyu.VxUQ9tBhpHJ2AAEDNW8sghc4m).write(bArr2);
            }
            long length = qr4g0ppspx4v2jaythnj.V57tEvNfxZVVcOCAOih5PKr.length();
            if (length == -1 && z) {
                ej6unYlOWMDF.p59rPv72J9(eouCzLZsW9ynithduh);
                eouCzLZsW9ynithduh.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                return -1L;
            }
            eouCzLZsW9ynithduh2.write(bArr2);
            if (z) {
                j += length;
            } else {
                qr4g0ppspx4v2jaythnj.ZfQNn8hdWlEQ5cR94249PDsLR(eouCzLZsW9ynithduh2);
            }
            eouCzLZsW9ynithduh2.write(bArr2);
            i++;
        }
    }

    @Override // com.vdodsodjsdt.EOksdALzG1YtVRjkh
    public final boolean V57tEvNfxZVVcOCAOih5PKr() {
        List list = this.V57tEvNfxZVVcOCAOih5PKr;
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            qR4G0Ppspx4V2jaYTHnJ qr4g0ppspx4v2jaythnj = ((y7op5wlt8jKmN) it.next()).zzpBGItXfub0yWj;
        }
        return false;
    }

    @Override // com.vdodsodjsdt.EOksdALzG1YtVRjkh
    public final long VxUQ9tBhpHJ2AAEDNW8sghc4m() throws IOException {
        long j = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (j != -1) {
            return j;
        }
        long jLaeGQIruHQu81hfJldjMOQSVblH3x = LaeGQIruHQu81hfJldjMOQSVblH3x(null, true);
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = jLaeGQIruHQu81hfJldjMOQSVblH3x;
        return jLaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    @Override // com.vdodsodjsdt.EOksdALzG1YtVRjkh
    public final void ZfQNn8hdWlEQ5cR94249PDsLR(zvqhqc7YVxGqa3qIRo zvqhqc7yvxgqa3qiro) throws IOException {
        LaeGQIruHQu81hfJldjMOQSVblH3x(zvqhqc7yvxgqa3qiro, false);
    }

    @Override // com.vdodsodjsdt.EOksdALzG1YtVRjkh
    public final gILkjwpvkGF5oaalOyU zzpBGItXfub0yWj() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR;
    }
}
