package com.vdodsodjsdt;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class WS3PVV2SF0Y6GNPIPGhbLX {
    public float LaeGQIruHQu81hfJldjMOQSVblH3x;
    public float V57tEvNfxZVVcOCAOih5PKr;
    public float VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public float ZfQNn8hdWlEQ5cR94249PDsLR;
    public float zzpBGItXfub0yWj;
    public final ArrayList zIvmSL0wzmmKGc3X39b2Gw2mUGE = new ArrayList();
    public final ArrayList ZLZeBXTMq0zDztBxtRTuCHrapQ = new ArrayList();

    public WS3PVV2SF0Y6GNPIPGhbLX() {
        ZfQNn8hdWlEQ5cR94249PDsLR(0.0f, 270.0f, 0.0f);
    }

    public final void V57tEvNfxZVVcOCAOih5PKr(float f, float f2) {
        skGrJUpGDGTSq1YORq skgrjupgdgtsq1yorq = new skGrJUpGDGTSq1YORq();
        skgrjupgdgtsq1yorq.zzpBGItXfub0yWj = f;
        skgrjupgdgtsq1yorq.V57tEvNfxZVVcOCAOih5PKr = f2;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.add(skgrjupgdgtsq1yorq);
        x0BgwBwaZlJuMBjgQfe5 x0bgwbwazljumbjgqfe5 = new x0BgwBwaZlJuMBjgQfe5(skgrjupgdgtsq1yorq, this.zzpBGItXfub0yWj, this.V57tEvNfxZVVcOCAOih5PKr);
        float fZzpBGItXfub0yWj = x0bgwbwazljumbjgqfe5.zzpBGItXfub0yWj() + 270.0f;
        float fZzpBGItXfub0yWj2 = x0bgwbwazljumbjgqfe5.zzpBGItXfub0yWj() + 270.0f;
        VxUQ9tBhpHJ2AAEDNW8sghc4m(fZzpBGItXfub0yWj);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ.add(x0bgwbwazljumbjgqfe5);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = fZzpBGItXfub0yWj2;
        this.zzpBGItXfub0yWj = f;
        this.V57tEvNfxZVVcOCAOih5PKr = f2;
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m(float f) {
        float f2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.zzpBGItXfub0yWj;
        float f5 = this.V57tEvNfxZVVcOCAOih5PKr;
        i4euwj2RC7G i4euwj2rc7g = new i4euwj2RC7G(f4, f5, f4, f5);
        i4euwj2rc7g.zIvmSL0wzmmKGc3X39b2Gw2mUGE = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        i4euwj2rc7g.ZLZeBXTMq0zDztBxtRTuCHrapQ = f3;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ.add(new klgtwKmukV83wasssvKCPan5J(i4euwj2rc7g));
        this.ZfQNn8hdWlEQ5cR94249PDsLR = f;
    }

    public final void ZfQNn8hdWlEQ5cR94249PDsLR(float f, float f2, float f3) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = f;
        this.zzpBGItXfub0yWj = 0.0f;
        this.V57tEvNfxZVVcOCAOih5PKr = f;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = f2;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = (f2 + f3) % 360.0f;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.clear();
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ.clear();
    }

    public final void zzpBGItXfub0yWj(Matrix matrix, Path path) {
        ArrayList arrayList = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AX2t0nklNro2XY8nBuz) arrayList.get(i)).VxUQ9tBhpHJ2AAEDNW8sghc4m(matrix, path);
        }
    }
}
