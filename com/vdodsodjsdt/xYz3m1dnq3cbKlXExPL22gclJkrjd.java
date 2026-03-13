package com.vdodsodjsdt;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class xYz3m1dnq3cbKlXExPL22gclJkrjd extends EM5Ueg4SS3xqKechziQvaSKq {
    public float GI83zq0G8e7zkn;
    public String HzCpKshMOoaw76hFcbOVRYMeRd;
    public float LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final Matrix M9e7PWhFYLD2lOGMker;
    public float NSjgqmGjEzuugn2SsG1mZFP;
    public float V57tEvNfxZVVcOCAOih5PKr;
    public final Matrix VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public float ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public float ZfQNn8hdWlEQ5cR94249PDsLR;
    public float zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final ArrayList zzpBGItXfub0yWj;

    public xYz3m1dnq3cbKlXExPL22gclJkrjd() {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new Matrix();
        this.zzpBGItXfub0yWj = new ArrayList();
        this.V57tEvNfxZVVcOCAOih5PKr = 0.0f;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = 0.0f;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = 0.0f;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = 1.0f;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = 1.0f;
        this.NSjgqmGjEzuugn2SsG1mZFP = 0.0f;
        this.GI83zq0G8e7zkn = 0.0f;
        this.M9e7PWhFYLD2lOGMker = new Matrix();
        this.HzCpKshMOoaw76hFcbOVRYMeRd = null;
    }

    public final void V57tEvNfxZVVcOCAOih5PKr() {
        Matrix matrix = this.M9e7PWhFYLD2lOGMker;
        matrix.reset();
        matrix.postTranslate(-this.ZfQNn8hdWlEQ5cR94249PDsLR, -this.LaeGQIruHQu81hfJldjMOQSVblH3x);
        matrix.postScale(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE, this.ZLZeBXTMq0zDztBxtRTuCHrapQ);
        matrix.postRotate(this.V57tEvNfxZVVcOCAOih5PKr, 0.0f, 0.0f);
        matrix.postTranslate(this.NSjgqmGjEzuugn2SsG1mZFP + this.ZfQNn8hdWlEQ5cR94249PDsLR, this.GI83zq0G8e7zkn + this.LaeGQIruHQu81hfJldjMOQSVblH3x);
    }

    @Override // com.vdodsodjsdt.EM5Ueg4SS3xqKechziQvaSKq
    public final boolean VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.zzpBGItXfub0yWj;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((EM5Ueg4SS3xqKechziQvaSKq) arrayList.get(i)).VxUQ9tBhpHJ2AAEDNW8sghc4m()) {
                return true;
            }
            i++;
        }
    }

    public String getGroupName() {
        return this.HzCpKshMOoaw76hFcbOVRYMeRd;
    }

    public Matrix getLocalMatrix() {
        return this.M9e7PWhFYLD2lOGMker;
    }

    public float getPivotX() {
        return this.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    public float getPivotY() {
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    public float getRotation() {
        return this.V57tEvNfxZVVcOCAOih5PKr;
    }

    public float getScaleX() {
        return this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    }

    public float getScaleY() {
        return this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
    }

    public float getTranslateX() {
        return this.NSjgqmGjEzuugn2SsG1mZFP;
    }

    public float getTranslateY() {
        return this.GI83zq0G8e7zkn;
    }

    public void setPivotX(float f) {
        if (f != this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            this.ZfQNn8hdWlEQ5cR94249PDsLR = f;
            V57tEvNfxZVVcOCAOih5PKr();
        }
    }

    public void setPivotY(float f) {
        if (f != this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = f;
            V57tEvNfxZVVcOCAOih5PKr();
        }
    }

    public void setRotation(float f) {
        if (f != this.V57tEvNfxZVVcOCAOih5PKr) {
            this.V57tEvNfxZVVcOCAOih5PKr = f;
            V57tEvNfxZVVcOCAOih5PKr();
        }
    }

    public void setScaleX(float f) {
        if (f != this.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = f;
            V57tEvNfxZVVcOCAOih5PKr();
        }
    }

    public void setScaleY(float f) {
        if (f != this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            this.ZLZeBXTMq0zDztBxtRTuCHrapQ = f;
            V57tEvNfxZVVcOCAOih5PKr();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.NSjgqmGjEzuugn2SsG1mZFP) {
            this.NSjgqmGjEzuugn2SsG1mZFP = f;
            V57tEvNfxZVVcOCAOih5PKr();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.GI83zq0G8e7zkn) {
            this.GI83zq0G8e7zkn = f;
            V57tEvNfxZVVcOCAOih5PKr();
        }
    }

    @Override // com.vdodsodjsdt.EM5Ueg4SS3xqKechziQvaSKq
    public final boolean zzpBGItXfub0yWj(int[] iArr) {
        int i = 0;
        boolean zZzpBGItXfub0yWj = false;
        while (true) {
            ArrayList arrayList = this.zzpBGItXfub0yWj;
            if (i >= arrayList.size()) {
                return zZzpBGItXfub0yWj;
            }
            zZzpBGItXfub0yWj |= ((EM5Ueg4SS3xqKechziQvaSKq) arrayList.get(i)).zzpBGItXfub0yWj(iArr);
            i++;
        }
    }

    public xYz3m1dnq3cbKlXExPL22gclJkrjd(xYz3m1dnq3cbKlXExPL22gclJkrjd xyz3m1dnq3cbklxexpl22gcljkrjd, qKXCIJM1cKNm0a1RAvamOBOVLgp qkxcijm1cknm0a1ravamobovlgp) {
        tGqXED78tOVJkBMS0QEJy g7gq4oPCUZ1wY;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new Matrix();
        this.zzpBGItXfub0yWj = new ArrayList();
        this.V57tEvNfxZVVcOCAOih5PKr = 0.0f;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = 0.0f;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = 0.0f;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = 1.0f;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = 1.0f;
        this.NSjgqmGjEzuugn2SsG1mZFP = 0.0f;
        this.GI83zq0G8e7zkn = 0.0f;
        Matrix matrix = new Matrix();
        this.M9e7PWhFYLD2lOGMker = matrix;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = null;
        this.V57tEvNfxZVVcOCAOih5PKr = xyz3m1dnq3cbklxexpl22gcljkrjd.V57tEvNfxZVVcOCAOih5PKr;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = xyz3m1dnq3cbklxexpl22gcljkrjd.ZfQNn8hdWlEQ5cR94249PDsLR;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = xyz3m1dnq3cbklxexpl22gcljkrjd.LaeGQIruHQu81hfJldjMOQSVblH3x;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = xyz3m1dnq3cbklxexpl22gcljkrjd.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = xyz3m1dnq3cbklxexpl22gcljkrjd.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        this.NSjgqmGjEzuugn2SsG1mZFP = xyz3m1dnq3cbklxexpl22gcljkrjd.NSjgqmGjEzuugn2SsG1mZFP;
        this.GI83zq0G8e7zkn = xyz3m1dnq3cbklxexpl22gcljkrjd.GI83zq0G8e7zkn;
        String str = xyz3m1dnq3cbklxexpl22gcljkrjd.HzCpKshMOoaw76hFcbOVRYMeRd;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = str;
        if (str != null) {
            qkxcijm1cknm0a1ravamobovlgp.put(str, this);
        }
        matrix.set(xyz3m1dnq3cbklxexpl22gcljkrjd.M9e7PWhFYLD2lOGMker);
        ArrayList arrayList = xyz3m1dnq3cbklxexpl22gcljkrjd.zzpBGItXfub0yWj;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof xYz3m1dnq3cbKlXExPL22gclJkrjd) {
                this.zzpBGItXfub0yWj.add(new xYz3m1dnq3cbKlXExPL22gclJkrjd((xYz3m1dnq3cbKlXExPL22gclJkrjd) obj, qkxcijm1cknm0a1ravamobovlgp));
            } else {
                if (obj instanceof QtoKMOQ86Bcawp0YPtt6VaR9oidpB) {
                    QtoKMOQ86Bcawp0YPtt6VaR9oidpB qtoKMOQ86Bcawp0YPtt6VaR9oidpB = (QtoKMOQ86Bcawp0YPtt6VaR9oidpB) obj;
                    QtoKMOQ86Bcawp0YPtt6VaR9oidpB qtoKMOQ86Bcawp0YPtt6VaR9oidpB2 = new QtoKMOQ86Bcawp0YPtt6VaR9oidpB(qtoKMOQ86Bcawp0YPtt6VaR9oidpB);
                    qtoKMOQ86Bcawp0YPtt6VaR9oidpB2.LaeGQIruHQu81hfJldjMOQSVblH3x = 0.0f;
                    qtoKMOQ86Bcawp0YPtt6VaR9oidpB2.ZLZeBXTMq0zDztBxtRTuCHrapQ = 1.0f;
                    qtoKMOQ86Bcawp0YPtt6VaR9oidpB2.NSjgqmGjEzuugn2SsG1mZFP = 1.0f;
                    qtoKMOQ86Bcawp0YPtt6VaR9oidpB2.GI83zq0G8e7zkn = 0.0f;
                    qtoKMOQ86Bcawp0YPtt6VaR9oidpB2.M9e7PWhFYLD2lOGMker = 1.0f;
                    qtoKMOQ86Bcawp0YPtt6VaR9oidpB2.HzCpKshMOoaw76hFcbOVRYMeRd = 0.0f;
                    qtoKMOQ86Bcawp0YPtt6VaR9oidpB2.KUYypEB4eNWOZWVDpH = Paint.Cap.BUTT;
                    qtoKMOQ86Bcawp0YPtt6VaR9oidpB2.q1wNbhk2O6 = Paint.Join.MITER;
                    qtoKMOQ86Bcawp0YPtt6VaR9oidpB2.p59rPv72J9 = 4.0f;
                    qtoKMOQ86Bcawp0YPtt6VaR9oidpB2.ZfQNn8hdWlEQ5cR94249PDsLR = qtoKMOQ86Bcawp0YPtt6VaR9oidpB.ZfQNn8hdWlEQ5cR94249PDsLR;
                    qtoKMOQ86Bcawp0YPtt6VaR9oidpB2.LaeGQIruHQu81hfJldjMOQSVblH3x = qtoKMOQ86Bcawp0YPtt6VaR9oidpB.LaeGQIruHQu81hfJldjMOQSVblH3x;
                    qtoKMOQ86Bcawp0YPtt6VaR9oidpB2.ZLZeBXTMq0zDztBxtRTuCHrapQ = qtoKMOQ86Bcawp0YPtt6VaR9oidpB.ZLZeBXTMq0zDztBxtRTuCHrapQ;
                    qtoKMOQ86Bcawp0YPtt6VaR9oidpB2.zIvmSL0wzmmKGc3X39b2Gw2mUGE = qtoKMOQ86Bcawp0YPtt6VaR9oidpB.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                    qtoKMOQ86Bcawp0YPtt6VaR9oidpB2.V57tEvNfxZVVcOCAOih5PKr = qtoKMOQ86Bcawp0YPtt6VaR9oidpB.V57tEvNfxZVVcOCAOih5PKr;
                    qtoKMOQ86Bcawp0YPtt6VaR9oidpB2.NSjgqmGjEzuugn2SsG1mZFP = qtoKMOQ86Bcawp0YPtt6VaR9oidpB.NSjgqmGjEzuugn2SsG1mZFP;
                    qtoKMOQ86Bcawp0YPtt6VaR9oidpB2.GI83zq0G8e7zkn = qtoKMOQ86Bcawp0YPtt6VaR9oidpB.GI83zq0G8e7zkn;
                    qtoKMOQ86Bcawp0YPtt6VaR9oidpB2.M9e7PWhFYLD2lOGMker = qtoKMOQ86Bcawp0YPtt6VaR9oidpB.M9e7PWhFYLD2lOGMker;
                    qtoKMOQ86Bcawp0YPtt6VaR9oidpB2.HzCpKshMOoaw76hFcbOVRYMeRd = qtoKMOQ86Bcawp0YPtt6VaR9oidpB.HzCpKshMOoaw76hFcbOVRYMeRd;
                    qtoKMOQ86Bcawp0YPtt6VaR9oidpB2.KUYypEB4eNWOZWVDpH = qtoKMOQ86Bcawp0YPtt6VaR9oidpB.KUYypEB4eNWOZWVDpH;
                    qtoKMOQ86Bcawp0YPtt6VaR9oidpB2.q1wNbhk2O6 = qtoKMOQ86Bcawp0YPtt6VaR9oidpB.q1wNbhk2O6;
                    qtoKMOQ86Bcawp0YPtt6VaR9oidpB2.p59rPv72J9 = qtoKMOQ86Bcawp0YPtt6VaR9oidpB.p59rPv72J9;
                    g7gq4oPCUZ1wY = qtoKMOQ86Bcawp0YPtt6VaR9oidpB2;
                } else if (obj instanceof G7gq4oPCUZ1wY) {
                    g7gq4oPCUZ1wY = new G7gq4oPCUZ1wY((G7gq4oPCUZ1wY) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.zzpBGItXfub0yWj.add(g7gq4oPCUZ1wY);
                Object obj2 = g7gq4oPCUZ1wY.zzpBGItXfub0yWj;
                if (obj2 != null) {
                    qkxcijm1cknm0a1ravamobovlgp.put(obj2, g7gq4oPCUZ1wY);
                }
            }
        }
    }
}
