package com.vdodsodjsdt;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class F2fKrE33wuRBc extends iR5xCBIVvX5dAZmnw05F0Cv implements EfIvTei3Q8wBNpyLTZJevpFxej {
    public final /* synthetic */ Object LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ int ZfQNn8hdWlEQ5cR94249PDsLR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F2fKrE33wuRBc(int i, Object obj) {
        super(0);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = obj;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.vdodsodjsdt.EfIvTei3Q8wBNpyLTZJevpFxej, com.vdodsodjsdt.iR5xCBIVvX5dAZmnw05F0Cv] */
    @Override // com.vdodsodjsdt.EfIvTei3Q8wBNpyLTZJevpFxej
    public final Object VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        GofbC1cUip5HE6iHoCm gofbC1cUip5HE6iHoCm;
        switch (this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            case 0:
                Object obj = AD8oVJKWXjHStg.ZfQNn8hdWlEQ5cR94249PDsLR;
                File file = (File) this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                synchronized (obj) {
                    AD8oVJKWXjHStg.V57tEvNfxZVVcOCAOih5PKr.remove(file.getAbsolutePath());
                }
                return hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            case 1:
                ECym1srKKeqP9 eCym1srKKeqP9 = (ECym1srKKeqP9) this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                Context context = eCym1srKKeqP9.V57tEvNfxZVVcOCAOih5PKr;
                String str = eCym1srKKeqP9.ZfQNn8hdWlEQ5cR94249PDsLR;
                if (str == null || !eCym1srKKeqP9.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
                    gofbC1cUip5HE6iHoCm = new GofbC1cUip5HE6iHoCm(context, eCym1srKKeqP9.ZfQNn8hdWlEQ5cR94249PDsLR, new Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(21), eCym1srKKeqP9.LaeGQIruHQu81hfJldjMOQSVblH3x, eCym1srKKeqP9.ZLZeBXTMq0zDztBxtRTuCHrapQ);
                } else {
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(noBackupFilesDir, "context.noBackupFilesDir");
                    gofbC1cUip5HE6iHoCm = new GofbC1cUip5HE6iHoCm(context, new File(noBackupFilesDir, str).getAbsolutePath(), new Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(21), eCym1srKKeqP9.LaeGQIruHQu81hfJldjMOQSVblH3x, eCym1srKKeqP9.ZLZeBXTMq0zDztBxtRTuCHrapQ);
                }
                gofbC1cUip5HE6iHoCm.setWriteAheadLoggingEnabled(eCym1srKKeqP9.GI83zq0G8e7zkn);
                return gofbC1cUip5HE6iHoCm;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                ((iR5xCBIVvX5dAZmnw05F0Cv) this.LaeGQIruHQu81hfJldjMOQSVblH3x).VxUQ9tBhpHJ2AAEDNW8sghc4m();
                return hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                File file2 = (File) ((OUBU6uEMdVy8Z) this.LaeGQIruHQu81hfJldjMOQSVblH3x).VxUQ9tBhpHJ2AAEDNW8sghc4m();
                String name = file2.getName();
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(name, "getName(...)");
                String strSubstring = "";
                int iPfK8qHOJoCLG = cwhrCnoVJBjJE2CBEAvBopmgF.PfK8qHOJoCLG(name, '.', 0, 6);
                if (iPfK8qHOJoCLG != -1) {
                    strSubstring = name.substring(iPfK8qHOJoCLG + 1, name.length());
                    ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strSubstring, "substring(...)");
                }
                if (strSubstring.equals("preferences_pb")) {
                    File absoluteFile = file2.getAbsoluteFile();
                    ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(absoluteFile, "file.absoluteFile");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file2 + " does not match required extension for Preferences file: preferences_pb").toString());
            case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                return ej6unYlOWMDF.pzqP2AqKW6J5PO8zCKnW((XL61XSHqyMdc1) this.LaeGQIruHQu81hfJldjMOQSVblH3x);
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_FIELD_NUMBER /* 5 */:
                return ((pwZBKEudH0MwQ4P) this.LaeGQIruHQu81hfJldjMOQSVblH3x).zzpBGItXfub0yWj();
            default:
                return new CWJlFo6DaGDzNFh4w[((jDNq5zhgCb57UDl[]) this.LaeGQIruHQu81hfJldjMOQSVblH3x).length];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public F2fKrE33wuRBc(EfIvTei3Q8wBNpyLTZJevpFxej efIvTei3Q8wBNpyLTZJevpFxej) {
        super(0);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = 2;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = (iR5xCBIVvX5dAZmnw05F0Cv) efIvTei3Q8wBNpyLTZJevpFxej;
    }
}
