package com.vdodsodjsdt;

import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class FraScyvWVdKLHI4dEwh8h1WO4 extends GvuED9Eb9kjnYjng4BPJg7J implements MGk7KfXeUv8YAfWiUw5LfOd {
    public int GI83zq0G8e7zkn;
    public /* synthetic */ Object HzCpKshMOoaw76hFcbOVRYMeRd;
    public final /* synthetic */ Object KUYypEB4eNWOZWVDpH;
    public Object M9e7PWhFYLD2lOGMker;
    public Object NSjgqmGjEzuugn2SsG1mZFP;
    public final /* synthetic */ int ZLZeBXTMq0zDztBxtRTuCHrapQ = 0;
    public final /* synthetic */ Object q1wNbhk2O6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FraScyvWVdKLHI4dEwh8h1WO4(WorkDatabase_Impl workDatabase_Impl, Q1zAhWfgG5v13hOK q1zAhWfgG5v13hOK, String[] strArr, llyzAJs14odKUIEFXSubfA00DoNX llyzajs14odkuiefxsubfa00donx, IvfXhmjM3e3K ivfXhmjM3e3K) {
        super(2, ivfXhmjM3e3K);
        this.M9e7PWhFYLD2lOGMker = workDatabase_Impl;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = q1zAhWfgG5v13hOK;
        this.KUYypEB4eNWOZWVDpH = strArr;
        this.q1wNbhk2O6 = llyzajs14odkuiefxsubfa00donx;
    }

    @Override // com.vdodsodjsdt.c2NCuhRgMI2BFzsocC
    public final Object KUYypEB4eNWOZWVDpH(Object obj) throws Throwable {
        List list;
        Iterator it;
        switch (this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            case 0:
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.M9e7PWhFYLD2lOGMker;
                int i = this.GI83zq0G8e7zkn;
                hMtEZx9LFZEOBsEChkiRKnXNYh1GG hmtezx9lfzeobsechkirknxnyh1gg = hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(obj);
                    return hmtezx9lfzeobsechkirknxnyh1gg;
                }
                ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(obj);
                jG2FHg9iAk jg2fhg9iak = (jG2FHg9iAk) this.NSjgqmGjEzuugn2SsG1mZFP;
                AQYAU4MRDJq aQYAU4MRDJqVxUQ9tBhpHJ2AAEDNW8sghc4m = zonOxHotd3BwAPJcwqr6I6uQNngg4.VxUQ9tBhpHJ2AAEDNW8sghc4m(-1, null, 6);
                o6OxmOsCD9HJ6LF8UTncnTX9Cf21 o6oxmoscd9hj6lf8utncntx9cf21 = new o6OxmOsCD9HJ6LF8UTncnTX9Cf21((String[]) this.KUYypEB4eNWOZWVDpH, aQYAU4MRDJqVxUQ9tBhpHJ2AAEDNW8sghc4m);
                aQYAU4MRDJqVxUQ9tBhpHJ2AAEDNW8sghc4m.HzCpKshMOoaw76hFcbOVRYMeRd(hmtezx9lfzeobsechkirknxnyh1gg);
                if (jg2fhg9iak.zIvmSL0wzmmKGc3X39b2Gw2mUGE().q11o1hieEkZDhF1MGOZI26oZiDT(rvaivvKEBAG44bC9trXcWJ3MqrND.V57tEvNfxZVVcOCAOih5PKr) != null) {
                    throw new ClassCastException();
                }
                Map map = workDatabase_Impl.M9e7PWhFYLD2lOGMker;
                Object objPYmKDYlAmhudp = map.get("QueryDispatcher");
                if (objPYmKDYlAmhudp == null) {
                    Executor executor = workDatabase_Impl.zzpBGItXfub0yWj;
                    if (executor == null) {
                        ej6unYlOWMDF.BJQHddi0Plr5ElWetCyaixWOg9("internalQueryExecutor");
                        throw null;
                    }
                    objPYmKDYlAmhudp = KfeOQNOupsCg6878zi4e.pYmKDYlAmhudp(executor);
                    map.put("QueryDispatcher", objPYmKDYlAmhudp);
                }
                AQYAU4MRDJq aQYAU4MRDJqVxUQ9tBhpHJ2AAEDNW8sghc4m2 = zonOxHotd3BwAPJcwqr6I6uQNngg4.VxUQ9tBhpHJ2AAEDNW8sghc4m(0, null, 7);
                F44whnLsbQ.TqcnImqkSWIKht(jg2fhg9iak, (LL6zXCXfmDYzdHCRTT) objPYmKDYlAmhudp, null, new je0ANrY3bkTeIfZFWvtAW01tsFXX(workDatabase_Impl, o6oxmoscd9hj6lf8utncntx9cf21, aQYAU4MRDJqVxUQ9tBhpHJ2AAEDNW8sghc4m, (llyzAJs14odKUIEFXSubfA00DoNX) this.q1wNbhk2O6, aQYAU4MRDJqVxUQ9tBhpHJ2AAEDNW8sghc4m2, null), 2);
                Q1zAhWfgG5v13hOK q1zAhWfgG5v13hOK = (Q1zAhWfgG5v13hOK) this.HzCpKshMOoaw76hFcbOVRYMeRd;
                this.GI83zq0G8e7zkn = 1;
                Object objH3jnZRsdwYJfY9UhQCkbvWciwvFHv = F44whnLsbQ.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(q1zAhWfgG5v13hOK, aQYAU4MRDJqVxUQ9tBhpHJ2AAEDNW8sghc4m2, true, this);
                w0JnONr1KwCkZY9pA0QjUDuh9aMcU w0jnonr1kwckzy9pa0qjuduh9amcu = w0JnONr1KwCkZY9pA0QjUDuh9aMcU.V57tEvNfxZVVcOCAOih5PKr;
                if (objH3jnZRsdwYJfY9UhQCkbvWciwvFHv != w0jnonr1kwckzy9pa0qjuduh9amcu) {
                    objH3jnZRsdwYJfY9UhQCkbvWciwvFHv = hmtezx9lfzeobsechkirknxnyh1gg;
                }
                return objH3jnZRsdwYJfY9UhQCkbvWciwvFHv == w0jnonr1kwckzy9pa0qjuduh9amcu ? w0jnonr1kwckzy9pa0qjuduh9amcu : hmtezx9lfzeobsechkirknxnyh1gg;
            default:
                int i2 = this.GI83zq0G8e7zkn;
                if (i2 == 0) {
                    ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(obj);
                    obj = this.HzCpKshMOoaw76hFcbOVRYMeRd;
                    List list2 = (List) this.KUYypEB4eNWOZWVDpH;
                    list = (ArrayList) this.q1wNbhk2O6;
                    it = list2.iterator();
                } else if (i2 == 1) {
                    Object obj2 = this.NSjgqmGjEzuugn2SsG1mZFP;
                    Iterator it2 = (Iterator) this.M9e7PWhFYLD2lOGMker;
                    List list3 = (List) this.HzCpKshMOoaw76hFcbOVRYMeRd;
                    ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(obj);
                    if (((Boolean) obj).booleanValue()) {
                        list3.add(new cmogmhi8vtDa(1, null));
                        this.HzCpKshMOoaw76hFcbOVRYMeRd = list3;
                        this.M9e7PWhFYLD2lOGMker = it2;
                        this.NSjgqmGjEzuugn2SsG1mZFP = null;
                        this.GI83zq0G8e7zkn = 2;
                        throw null;
                    }
                    obj = obj2;
                    it = it2;
                    list = list3;
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.M9e7PWhFYLD2lOGMker;
                    list = (List) this.HzCpKshMOoaw76hFcbOVRYMeRd;
                    ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(obj);
                }
                if (!it.hasNext()) {
                    return obj;
                }
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                this.HzCpKshMOoaw76hFcbOVRYMeRd = list;
                this.M9e7PWhFYLD2lOGMker = it;
                this.NSjgqmGjEzuugn2SsG1mZFP = obj;
                this.GI83zq0G8e7zkn = 1;
                throw null;
        }
    }

    @Override // com.vdodsodjsdt.c2NCuhRgMI2BFzsocC
    public final IvfXhmjM3e3K M9e7PWhFYLD2lOGMker(IvfXhmjM3e3K ivfXhmjM3e3K, Object obj) {
        switch (this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            case 0:
                FraScyvWVdKLHI4dEwh8h1WO4 fraScyvWVdKLHI4dEwh8h1WO4 = new FraScyvWVdKLHI4dEwh8h1WO4((WorkDatabase_Impl) this.M9e7PWhFYLD2lOGMker, (Q1zAhWfgG5v13hOK) this.HzCpKshMOoaw76hFcbOVRYMeRd, (String[]) this.KUYypEB4eNWOZWVDpH, (llyzAJs14odKUIEFXSubfA00DoNX) this.q1wNbhk2O6, ivfXhmjM3e3K);
                fraScyvWVdKLHI4dEwh8h1WO4.NSjgqmGjEzuugn2SsG1mZFP = obj;
                return fraScyvWVdKLHI4dEwh8h1WO4;
            default:
                FraScyvWVdKLHI4dEwh8h1WO4 fraScyvWVdKLHI4dEwh8h1WO42 = new FraScyvWVdKLHI4dEwh8h1WO4((List) this.KUYypEB4eNWOZWVDpH, (ArrayList) this.q1wNbhk2O6, ivfXhmjM3e3K);
                fraScyvWVdKLHI4dEwh8h1WO42.HzCpKshMOoaw76hFcbOVRYMeRd = obj;
                return fraScyvWVdKLHI4dEwh8h1WO42;
        }
    }

    @Override // com.vdodsodjsdt.MGk7KfXeUv8YAfWiUw5LfOd
    public final Object NSjgqmGjEzuugn2SsG1mZFP(Object obj, Object obj2) {
        switch (this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            case 0:
                return ((FraScyvWVdKLHI4dEwh8h1WO4) M9e7PWhFYLD2lOGMker((IvfXhmjM3e3K) obj2, (jG2FHg9iAk) obj)).KUYypEB4eNWOZWVDpH(hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m);
            default:
                return ((FraScyvWVdKLHI4dEwh8h1WO4) M9e7PWhFYLD2lOGMker((IvfXhmjM3e3K) obj2, obj)).KUYypEB4eNWOZWVDpH(hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FraScyvWVdKLHI4dEwh8h1WO4(List list, ArrayList arrayList, IvfXhmjM3e3K ivfXhmjM3e3K) {
        super(2, ivfXhmjM3e3K);
        this.KUYypEB4eNWOZWVDpH = list;
        this.q1wNbhk2O6 = arrayList;
    }
}
