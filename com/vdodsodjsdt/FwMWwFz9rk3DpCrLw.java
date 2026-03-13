package com.vdodsodjsdt;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class FwMWwFz9rk3DpCrLw {
    public final String LaeGQIruHQu81hfJldjMOQSVblH3x;
    public byte[] NSjgqmGjEzuugn2SsG1mZFP;
    public final byte[] V57tEvNfxZVVcOCAOih5PKr;
    public final Executor VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public mO6A2OjMYtJibfDvHozS[] ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final File ZfQNn8hdWlEQ5cR94249PDsLR;
    public boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE = false;
    public final ZN0iEARZEGpwTTqbyBVzgj zzpBGItXfub0yWj;

    public FwMWwFz9rk3DpCrLw(AssetManager assetManager, Executor executor, ZN0iEARZEGpwTTqbyBVzgj zN0iEARZEGpwTTqbyBVzgj, String str, File file) {
        byte[] bArr;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = executor;
        this.zzpBGItXfub0yWj = zN0iEARZEGpwTTqbyBVzgj;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = str;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 24:
                case 25:
                    bArr = KfeOQNOupsCg6878zi4e.HzCpKshMOoaw76hFcbOVRYMeRd;
                    break;
                case 26:
                    bArr = KfeOQNOupsCg6878zi4e.M9e7PWhFYLD2lOGMker;
                    break;
                case 27:
                    bArr = KfeOQNOupsCg6878zi4e.GI83zq0G8e7zkn;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = KfeOQNOupsCg6878zi4e.NSjgqmGjEzuugn2SsG1mZFP;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = KfeOQNOupsCg6878zi4e.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        }
        this.V57tEvNfxZVVcOCAOih5PKr = bArr;
    }

    public final FileInputStream VxUQ9tBhpHJ2AAEDNW8sghc4m(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.zzpBGItXfub0yWj.ZfQNn8hdWlEQ5cR94249PDsLR();
            return null;
        }
    }

    public final void zzpBGItXfub0yWj(int i, Serializable serializable) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.execute(new mMfUDmjShjTxhFzD4(i, 2, this, serializable));
    }
}
