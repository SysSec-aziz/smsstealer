package com.vdodsodjsdt;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.io.File;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class OUBU6uEMdVy8Z extends iR5xCBIVvX5dAZmnw05F0Cv implements EfIvTei3Q8wBNpyLTZJevpFxej {
    public final /* synthetic */ Object LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ int ZfQNn8hdWlEQ5cR94249PDsLR;
    public final /* synthetic */ Object zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OUBU6uEMdVy8Z(int i, Object obj, Object obj2) {
        super(0);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = obj;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = obj2;
    }

    @Override // com.vdodsodjsdt.EfIvTei3Q8wBNpyLTZJevpFxej
    public final Object VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        switch (this.ZfQNn8hdWlEQ5cR94249PDsLR) {
            case 0:
                pfLEtIq3hsg pfletiq3hsg = ((Avg9jswKZ9h8Wncg2f7) this.LaeGQIruHQu81hfJldjMOQSVblH3x).VxUQ9tBhpHJ2AAEDNW8sghc4m;
                t5PfYuyafrlVFLx02ZcOerl6 t5pfyuyafrlvflx02zcoerl6 = (t5PfYuyafrlVFLx02ZcOerl6) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                pfletiq3hsg.getClass();
                synchronized (pfletiq3hsg.V57tEvNfxZVVcOCAOih5PKr) {
                    if (pfletiq3hsg.ZfQNn8hdWlEQ5cR94249PDsLR.remove(t5pfyuyafrlvflx02zcoerl6) && pfletiq3hsg.ZfQNn8hdWlEQ5cR94249PDsLR.isEmpty()) {
                        pfletiq3hsg.ZfQNn8hdWlEQ5cR94249PDsLR();
                    }
                    break;
                }
                return hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            case 1:
                kooPss93uoBTOWlOLlaD koopss93uobtowlollad = (kooPss93uoBTOWlOLlaD) this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                WorkDatabase workDatabase = koopss93uobtowlollad.M9e7PWhFYLD2lOGMker;
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(workDatabase, "workManagerImpl.workDatabase");
                UUID uuid = (UUID) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                workDatabase.V57tEvNfxZVVcOCAOih5PKr();
                try {
                    String string = uuid.toString();
                    ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(string, "id.toString()");
                    zonOxHotd3BwAPJcwqr6I6uQNngg4.zIvmSL0wzmmKGc3X39b2Gw2mUGE(koopss93uobtowlollad, string);
                    workDatabase.Ca81ebIan1u();
                    workDatabase.HzCpKshMOoaw76hFcbOVRYMeRd();
                    IajRZM8bx6ydOtWJS1Sd9DI.zzpBGItXfub0yWj(koopss93uobtowlollad.GI83zq0G8e7zkn, koopss93uobtowlollad.M9e7PWhFYLD2lOGMker, koopss93uobtowlollad.KUYypEB4eNWOZWVDpH);
                    return hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                } catch (Throwable th) {
                    workDatabase.HzCpKshMOoaw76hFcbOVRYMeRd();
                    throw th;
                }
            default:
                Context context = (Context) this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                ((Au8a9wlsohh4txw) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE).getClass();
                String strConcat = "preferences".concat(".preferences_pb");
                ej6unYlOWMDF.pYmKDYlAmhudp(strConcat, "fileName");
                return new File(context.getApplicationContext().getFilesDir(), "datastore/".concat(strConcat));
        }
    }
}
