package com.vdodsodjsdt;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class CsEvLVebpPqWiZ9 implements zcuZ56coxbuAPrHfBRu, c6HqQbG2usib, XL61XSHqyMdc1 {
    public final dip85SLOWSmNG3 V57tEvNfxZVVcOCAOih5PKr;
    public final cx2YoQOPZxuB1B0n1aU3M ZfQNn8hdWlEQ5cR94249PDsLR;
    public androidx.lifecycle.iVKrTMqOw0TqCeNN LaeGQIruHQu81hfJldjMOQSVblH3x = null;
    public Khx5NlXjnBf0cIn8cBMdY4O4mD zIvmSL0wzmmKGc3X39b2Gw2mUGE = null;

    public CsEvLVebpPqWiZ9(dip85SLOWSmNG3 dip85slowsmng3, cx2YoQOPZxuB1B0n1aU3M cx2yoqopzxub1b0n1au3m) {
        this.V57tEvNfxZVVcOCAOih5PKr = dip85slowsmng3;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = cx2yoqopzxub1b0n1au3m;
    }

    @Override // com.vdodsodjsdt.hCgEybj69le8
    public final androidx.lifecycle.iVKrTMqOw0TqCeNN LaeGQIruHQu81hfJldjMOQSVblH3x() {
        zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    @Override // com.vdodsodjsdt.zcuZ56coxbuAPrHfBRu
    public final V9VO2k88X42B V57tEvNfxZVVcOCAOih5PKr() {
        Application application;
        dip85SLOWSmNG3 dip85slowsmng3 = this.V57tEvNfxZVVcOCAOih5PKr;
        Context applicationContext = dip85slowsmng3.SuB3hEmTmbbRGAhtvOOmfKEon().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        V9VO2k88X42B v9VO2k88X42B = new V9VO2k88X42B(0);
        LinkedHashMap linkedHashMap = v9VO2k88X42B.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        if (application != null) {
            linkedHashMap.put(IN79WcIk5xB4t0GjRT43qPLs5.jW7EiD0YL6xkbB158jMUzhWNWb1y, application);
        }
        linkedHashMap.put(ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP, this);
        linkedHashMap.put(ej6unYlOWMDF.GI83zq0G8e7zkn, this);
        Bundle bundle = dip85slowsmng3.NSjgqmGjEzuugn2SsG1mZFP;
        if (bundle != null) {
            linkedHashMap.put(ej6unYlOWMDF.M9e7PWhFYLD2lOGMker, bundle);
        }
        return v9VO2k88X42B;
    }

    @Override // com.vdodsodjsdt.c6HqQbG2usib
    public final ALnH3AptNOGA7UbXGxOl2SnVeZ VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        return (ALnH3AptNOGA7UbXGxOl2SnVeZ) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.V57tEvNfxZVVcOCAOih5PKr;
    }

    @Override // com.vdodsodjsdt.XL61XSHqyMdc1
    public final cx2YoQOPZxuB1B0n1aU3M ZfQNn8hdWlEQ5cR94249PDsLR() {
        zIvmSL0wzmmKGc3X39b2Gw2mUGE();
        return this.ZfQNn8hdWlEQ5cR94249PDsLR;
    }

    public final void zIvmSL0wzmmKGc3X39b2Gw2mUGE() {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x == null) {
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = new androidx.lifecycle.iVKrTMqOw0TqCeNN(this);
            Khx5NlXjnBf0cIn8cBMdY4O4mD khx5NlXjnBf0cIn8cBMdY4O4mD = new Khx5NlXjnBf0cIn8cBMdY4O4mD(this);
            this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = khx5NlXjnBf0cIn8cBMdY4O4mD;
            khx5NlXjnBf0cIn8cBMdY4O4mD.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            ej6unYlOWMDF.Irh5auREsoeV1C1RaBamlmy(this);
        }
    }

    public final void zzpBGItXfub0yWj(XOTOHmUA5NYhlyOBh7 xOTOHmUA5NYhlyOBh7) {
        this.LaeGQIruHQu81hfJldjMOQSVblH3x.ZfQNn8hdWlEQ5cR94249PDsLR(xOTOHmUA5NYhlyOBh7);
    }
}
