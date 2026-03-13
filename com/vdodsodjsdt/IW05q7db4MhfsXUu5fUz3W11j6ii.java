package com.vdodsodjsdt;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class IW05q7db4MhfsXUu5fUz3W11j6ii extends wDM0OIsoelVNxywVsHYCFqoeSJqb implements Iterator {
    public final /* synthetic */ dMJzfWfinPaaf19pTno5S3Iet7AJ LaeGQIruHQu81hfJldjMOQSVblH3x;
    public BzqvZe2HlF1ngslPHZd V57tEvNfxZVVcOCAOih5PKr;
    public boolean ZfQNn8hdWlEQ5cR94249PDsLR = true;

    public IW05q7db4MhfsXUu5fUz3W11j6ii(dMJzfWfinPaaf19pTno5S3Iet7AJ dmjzfwfinpaaf19ptno5s3iet7aj) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = dmjzfwfinpaaf19ptno5s3iet7aj;
    }

    @Override // com.vdodsodjsdt.wDM0OIsoelVNxywVsHYCFqoeSJqb
    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(BzqvZe2HlF1ngslPHZd bzqvZe2HlF1ngslPHZd) {
        BzqvZe2HlF1ngslPHZd bzqvZe2HlF1ngslPHZd2 = this.V57tEvNfxZVVcOCAOih5PKr;
        if (bzqvZe2HlF1ngslPHZd == bzqvZe2HlF1ngslPHZd2) {
            BzqvZe2HlF1ngslPHZd bzqvZe2HlF1ngslPHZd3 = bzqvZe2HlF1ngslPHZd2.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            this.V57tEvNfxZVVcOCAOih5PKr = bzqvZe2HlF1ngslPHZd3;
            this.ZfQNn8hdWlEQ5cR94249PDsLR = bzqvZe2HlF1ngslPHZd3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            return this.LaeGQIruHQu81hfJldjMOQSVblH3x.V57tEvNfxZVVcOCAOih5PKr != null;
        }
        BzqvZe2HlF1ngslPHZd bzqvZe2HlF1ngslPHZd = this.V57tEvNfxZVVcOCAOih5PKr;
        return (bzqvZe2HlF1ngslPHZd == null || bzqvZe2HlF1ngslPHZd.LaeGQIruHQu81hfJldjMOQSVblH3x == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            this.ZfQNn8hdWlEQ5cR94249PDsLR = false;
            this.V57tEvNfxZVVcOCAOih5PKr = this.LaeGQIruHQu81hfJldjMOQSVblH3x.V57tEvNfxZVVcOCAOih5PKr;
        } else {
            BzqvZe2HlF1ngslPHZd bzqvZe2HlF1ngslPHZd = this.V57tEvNfxZVVcOCAOih5PKr;
            this.V57tEvNfxZVVcOCAOih5PKr = bzqvZe2HlF1ngslPHZd != null ? bzqvZe2HlF1ngslPHZd.LaeGQIruHQu81hfJldjMOQSVblH3x : null;
        }
        return this.V57tEvNfxZVVcOCAOih5PKr;
    }
}
