package com.vdodsodjsdt;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class QKIH77ZVGMjTqK4XOIPLci1Yc implements Runnable {
    public final /* synthetic */ Object LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ Object ZfQNn8hdWlEQ5cR94249PDsLR;
    public final /* synthetic */ Object zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public /* synthetic */ QKIH77ZVGMjTqK4XOIPLci1Yc(Object obj, Object obj2, Object obj3, int i) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = obj;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = obj2;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = obj3;
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [com.vdodsodjsdt.EfIvTei3Q8wBNpyLTZJevpFxej, com.vdodsodjsdt.iR5xCBIVvX5dAZmnw05F0Cv] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        boolean zBooleanValue;
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                KKgVVtgki1NTGogYfNtieIfD kKgVVtgki1NTGogYfNtieIfD = (KKgVVtgki1NTGogYfNtieIfD) this.ZfQNn8hdWlEQ5cR94249PDsLR;
                hRrPPME7ytOB7ba hrrppme7ytob7ba = (hRrPPME7ytOB7ba) this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                try {
                    scWJtRrcQpw1SO8qayAb4dT2LAw scwjtrrcqpw1so8qayab4dt2lawQ1wNbhk2O6 = KfeOQNOupsCg6878zi4e.q1wNbhk2O6(kKgVVtgki1NTGogYfNtieIfD.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                    if (scwjtrrcqpw1so8qayab4dt2lawQ1wNbhk2O6 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    CyFp8PEPozZQnhAUmNMq cyFp8PEPozZQnhAUmNMq = (CyFp8PEPozZQnhAUmNMq) ((kpXzRIgLxQiglBj) scwjtrrcqpw1so8qayab4dt2lawQ1wNbhk2O6.zzpBGItXfub0yWj);
                    synchronized (cyFp8PEPozZQnhAUmNMq.ZfQNn8hdWlEQ5cR94249PDsLR) {
                        cyFp8PEPozZQnhAUmNMq.zIvmSL0wzmmKGc3X39b2Gw2mUGE = threadPoolExecutor;
                        break;
                    }
                    ((kpXzRIgLxQiglBj) scwjtrrcqpw1so8qayab4dt2lawQ1wNbhk2O6.zzpBGItXfub0yWj).VxUQ9tBhpHJ2AAEDNW8sghc4m(new mCoBpJdbZA7WvUgYYgqJp7o(hrrppme7ytob7ba, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    hrrppme7ytob7ba.TaDO7ogis3aEiWEtq(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.ZfQNn8hdWlEQ5cR94249PDsLR;
                VhYG3Kn7PElrnIYowGX3UR vhYG3Kn7PElrnIYowGX3UR = (VhYG3Kn7PElrnIYowGX3UR) this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                H5020FzOIeGdxBWIL1OKPe h5020FzOIeGdxBWIL1OKPe = (H5020FzOIeGdxBWIL1OKPe) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                if (atomicBoolean.get()) {
                    return;
                }
                try {
                    h5020FzOIeGdxBWIL1OKPe.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                    vhYG3Kn7PElrnIYowGX3UR.VxUQ9tBhpHJ2AAEDNW8sghc4m(null);
                    return;
                } catch (Throwable th2) {
                    vhYG3Kn7PElrnIYowGX3UR.zzpBGItXfub0yWj(th2);
                    return;
                }
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                IVPB9DLMIoeA0Qp8AgwLlJ iVPB9DLMIoeA0Qp8AgwLlJ = (IVPB9DLMIoeA0Qp8AgwLlJ) this.ZfQNn8hdWlEQ5cR94249PDsLR;
                k5xHLp7fCPX0ktLE3ej5tGjGJa k5xhlp7fcpx0ktle3ej5tgjgja = (k5xHLp7fCPX0ktLE3ej5tGjGJa) this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                miZQAIwqUtukbpjcHsFxaDq57gE mizqaiwqutukbpjchsfxadq57ge = (miZQAIwqUtukbpjcHsFxaDq57gE) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                try {
                    zBooleanValue = ((Boolean) k5xhlp7fcpx0ktle3ej5tgjgja.ZfQNn8hdWlEQ5cR94249PDsLR.get()).booleanValue();
                    break;
                } catch (InterruptedException | ExecutionException unused) {
                    zBooleanValue = true;
                }
                synchronized (iVPB9DLMIoeA0Qp8AgwLlJ.HzCpKshMOoaw76hFcbOVRYMeRd) {
                    try {
                        AhgUxI6t6E ahgUxI6t6EM9e7PWhFYLD2lOGMker = hRrPPME7ytOB7ba.M9e7PWhFYLD2lOGMker(mizqaiwqutukbpjchsfxadq57ge.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                        String str = ahgUxI6t6EM9e7PWhFYLD2lOGMker.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                        if (iVPB9DLMIoeA0Qp8AgwLlJ.V57tEvNfxZVVcOCAOih5PKr(str) == mizqaiwqutukbpjchsfxadq57ge) {
                            iVPB9DLMIoeA0Qp8AgwLlJ.zzpBGItXfub0yWj(str);
                        }
                        psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(IVPB9DLMIoeA0Qp8AgwLlJ.KUYypEB4eNWOZWVDpH, IVPB9DLMIoeA0Qp8AgwLlJ.class.getSimpleName() + " " + str + " executed; reschedule = " + zBooleanValue);
                        ArrayList arrayList = iVPB9DLMIoeA0Qp8AgwLlJ.M9e7PWhFYLD2lOGMker;
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            ((owwckn2XMaN2nHMo) obj).LaeGQIruHQu81hfJldjMOQSVblH3x(ahgUxI6t6EM9e7PWhFYLD2lOGMker, zBooleanValue);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                Context context = (Context) this.ZfQNn8hdWlEQ5cR94249PDsLR;
                String str2 = (String) this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQ = (Skgk8FYn8b4TvRiBOsElZw4XkNLhQ) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                String string = context.getResources().getString(R.string.HOST);
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(string, "getString(...)");
                try {
                    VSncX8ksA0tswc2TMhzhOMdd.VxUQ9tBhpHJ2AAEDNW8sghc4m(string.concat("/register"), str2, context, null, 8);
                    break;
                } catch (Exception unused2) {
                    Log.d("sendRegInfo", "Error sending request");
                }
                ((MainActivity) skgk8FYn8b4TvRiBOsElZw4XkNLhQ.ZfQNn8hdWlEQ5cR94249PDsLR).SuB3hEmTmbbRGAhtvOOmfKEon = true;
                skgk8FYn8b4TvRiBOsElZw4XkNLhQ.jW7EiD0YL6xkbB158jMUzhWNWb1y();
                return;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                ((IVPB9DLMIoeA0Qp8AgwLlJ) ((o6OxmOsCD9HJ6LF8UTncnTX9Cf21) this.ZfQNn8hdWlEQ5cR94249PDsLR).V57tEvNfxZVVcOCAOih5PKr).zIvmSL0wzmmKGc3X39b2Gw2mUGE((ztNFMw5IuWLfuP) this.LaeGQIruHQu81hfJldjMOQSVblH3x, (VSncX8ksA0tswc2TMhzhOMdd) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
                return;
            default:
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.ZfQNn8hdWlEQ5cR94249PDsLR;
                VhYG3Kn7PElrnIYowGX3UR vhYG3Kn7PElrnIYowGX3UR2 = (VhYG3Kn7PElrnIYowGX3UR) this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                ?? r2 = (iR5xCBIVvX5dAZmnw05F0Cv) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                if (atomicBoolean2.get()) {
                    return;
                }
                try {
                    vhYG3Kn7PElrnIYowGX3UR2.VxUQ9tBhpHJ2AAEDNW8sghc4m(r2.VxUQ9tBhpHJ2AAEDNW8sghc4m());
                    return;
                } catch (Throwable th4) {
                    vhYG3Kn7PElrnIYowGX3UR2.zzpBGItXfub0yWj(th4);
                    return;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ QKIH77ZVGMjTqK4XOIPLci1Yc(AtomicBoolean atomicBoolean, VhYG3Kn7PElrnIYowGX3UR vhYG3Kn7PElrnIYowGX3UR, EfIvTei3Q8wBNpyLTZJevpFxej efIvTei3Q8wBNpyLTZJevpFxej) {
        this.V57tEvNfxZVVcOCAOih5PKr = 5;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = atomicBoolean;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = vhYG3Kn7PElrnIYowGX3UR;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = (iR5xCBIVvX5dAZmnw05F0Cv) efIvTei3Q8wBNpyLTZJevpFxej;
    }
}
