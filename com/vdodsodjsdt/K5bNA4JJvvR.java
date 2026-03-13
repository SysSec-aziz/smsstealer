package com.vdodsodjsdt;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class K5bNA4JJvvR implements EfIvTei3Q8wBNpyLTZJevpFxej {
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ zf8a67a5ZO524dLUgOFxsfO ZfQNn8hdWlEQ5cR94249PDsLR;

    public /* synthetic */ K5bNA4JJvvR(zf8a67a5ZO524dLUgOFxsfO zf8a67a5zo524dlugofxsfo, int i) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = zf8a67a5zo524dlugofxsfo;
    }

    @Override // com.vdodsodjsdt.EfIvTei3Q8wBNpyLTZJevpFxej
    public final Object VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                zf8a67a5ZO524dLUgOFxsfO zf8a67a5zo524dlugofxsfo = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                return new YfKjQAEakPJuedd66wUsn(zf8a67a5zo524dlugofxsfo.NSjgqmGjEzuugn2SsG1mZFP, new K5bNA4JJvvR(zf8a67a5zo524dlugofxsfo, 2));
            case 1:
                zf8a67a5ZO524dLUgOFxsfO zf8a67a5zo524dlugofxsfo2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                androidx.activity.iVKrTMqOw0TqCeNN ivkrtmqow0tqcenn = new androidx.activity.iVKrTMqOw0TqCeNN(new TrmJHraDbHR4RYeI4Eu(zf8a67a5zo524dlugofxsfo2, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(Looper.myLooper(), Looper.getMainLooper())) {
                        zf8a67a5zo524dlugofxsfo2.V57tEvNfxZVVcOCAOih5PKr.VxUQ9tBhpHJ2AAEDNW8sghc4m(new LSRezm46jAVKHH(ivkrtmqow0tqcenn, zf8a67a5zo524dlugofxsfo2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new KEiB9IZn8Hnusye5ELtMjAaq02l5M(1, zf8a67a5zo524dlugofxsfo2, ivkrtmqow0tqcenn));
                    }
                }
                return ivkrtmqow0tqcenn;
            default:
                this.ZfQNn8hdWlEQ5cR94249PDsLR.reportFullyDrawn();
                return hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        }
    }
}
