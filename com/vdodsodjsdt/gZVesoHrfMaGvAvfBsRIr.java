package com.vdodsodjsdt;

import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class gZVesoHrfMaGvAvfBsRIr implements Runnable {
    public final Object LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public Object ZfQNn8hdWlEQ5cR94249PDsLR;

    public /* synthetic */ gZVesoHrfMaGvAvfBsRIr(int i, Object obj, Object obj2) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = obj;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n52qNbrWmzyJ3ZNP4nIEjnDJFclzk n52qnbrwmzyj3znp4niejndjfclzk;
        vIPEe55rgLxLcs vipee55rglxlcs;
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 0:
                x7RNBrm11qTEy x7rnbrm11qtey = (x7RNBrm11qTEy) this.ZfQNn8hdWlEQ5cR94249PDsLR;
                JaGiaIfgE4oZFS8GScUJb jaGiaIfgE4oZFS8GScUJb = (JaGiaIfgE4oZFS8GScUJb) this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ = jaGiaIfgE4oZFS8GScUJb.LaeGQIruHQu81hfJldjMOQSVblH3x;
                if (stuu2Qyz6BSCKFEomt5b51vUnV1HQ != null && (n52qnbrwmzyj3znp4niejndjfclzk = stuu2Qyz6BSCKFEomt5b51vUnV1HQ.LaeGQIruHQu81hfJldjMOQSVblH3x) != null) {
                    n52qnbrwmzyj3znp4niejndjfclzk.NSjgqmGjEzuugn2SsG1mZFP(stuu2Qyz6BSCKFEomt5b51vUnV1HQ);
                }
                View view = (View) jaGiaIfgE4oZFS8GScUJb.M9e7PWhFYLD2lOGMker;
                if (view != null && view.getWindowToken() != null) {
                    if (x7rnbrm11qtey.zzpBGItXfub0yWj()) {
                        jaGiaIfgE4oZFS8GScUJb.vBGA6pPLqSMuYGvprl270j7 = x7rnbrm11qtey;
                    } else if (x7rnbrm11qtey.LaeGQIruHQu81hfJldjMOQSVblH3x != null) {
                        x7rnbrm11qtey.ZfQNn8hdWlEQ5cR94249PDsLR(0, 0, false, false);
                        jaGiaIfgE4oZFS8GScUJb.vBGA6pPLqSMuYGvprl270j7 = x7rnbrm11qtey;
                    }
                }
                jaGiaIfgE4oZFS8GScUJb.Irh5auREsoeV1C1RaBamlmy = null;
                return;
            case 1:
                ((y4cYNyrJZVDngci) this.ZfQNn8hdWlEQ5cR94249PDsLR).VxUQ9tBhpHJ2AAEDNW8sghc4m = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                return;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                ((Application) this.ZfQNn8hdWlEQ5cR94249PDsLR).unregisterActivityLifecycleCallbacks((y4cYNyrJZVDngci) this.LaeGQIruHQu81hfJldjMOQSVblH3x);
                return;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                Object obj = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                Object obj2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                try {
                    Method method = QqrV3Oj6DsM69UhUe.ZfQNn8hdWlEQ5cR94249PDsLR;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        QqrV3Oj6DsM69UhUe.LaeGQIruHQu81hfJldjMOQSVblH3x.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e) {
                    if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                        throw e;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                qF22Y620JkFyombtDYw0h0h8Rxpja qf22y620jkfyombtdyw0h0h8rxpja = (qF22Y620JkFyombtDYw0h0h8Rxpja) this.ZfQNn8hdWlEQ5cR94249PDsLR;
                Typeface typeface = (Typeface) this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                KfeOQNOupsCg6878zi4e kfeOQNOupsCg6878zi4e = (KfeOQNOupsCg6878zi4e) qf22y620jkfyombtdyw0h0h8rxpja.V57tEvNfxZVVcOCAOih5PKr;
                if (kfeOQNOupsCg6878zi4e != null) {
                    kfeOQNOupsCg6878zi4e.qygqjTppWwx992(typeface);
                    return;
                }
                return;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_FIELD_NUMBER /* 5 */:
                ArrayList arrayList = (ArrayList) this.ZfQNn8hdWlEQ5cR94249PDsLR;
                RD86Fssz0iKbf0t61L rD86Fssz0iKbf0t61L = (RD86Fssz0iKbf0t61L) this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                if (arrayList.contains(rD86Fssz0iKbf0t61L)) {
                    arrayList.remove(rD86Fssz0iKbf0t61L);
                    u9SlVAuoWhQUfJ.VxUQ9tBhpHJ2AAEDNW8sghc4m(rD86Fssz0iKbf0t61L.V57tEvNfxZVVcOCAOih5PKr.HVEwbdULInpTNa0IG, rD86Fssz0iKbf0t61L.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                    return;
                }
                return;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_SET_FIELD_NUMBER /* 6 */:
                psATg3LCCdmDIiRgW psatg3lccdmdiirgwLaeGQIruHQu81hfJldjMOQSVblH3x = psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x();
                String str = deSD4tN0Wv5VY1mbnR1CZOFvWyqT8.LaeGQIruHQu81hfJldjMOQSVblH3x;
                StringBuilder sb = new StringBuilder("Scheduling work ");
                vIPEe55rgLxLcs vipee55rglxlcs2 = (vIPEe55rgLxLcs) this.ZfQNn8hdWlEQ5cR94249PDsLR;
                sb.append(vipee55rglxlcs2.VxUQ9tBhpHJ2AAEDNW8sghc4m);
                psatg3lccdmdiirgwLaeGQIruHQu81hfJldjMOQSVblH3x.VxUQ9tBhpHJ2AAEDNW8sghc4m(str, sb.toString());
                ((deSD4tN0Wv5VY1mbnR1CZOFvWyqT8) this.LaeGQIruHQu81hfJldjMOQSVblH3x).VxUQ9tBhpHJ2AAEDNW8sghc4m.ZfQNn8hdWlEQ5cR94249PDsLR(vipee55rglxlcs2);
                return;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.DOUBLE_FIELD_NUMBER /* 7 */:
                ((YAf4BMDpiCAb4hYaN6VqW) this.ZfQNn8hdWlEQ5cR94249PDsLR).vE4yDIjexsP2lGjLaTcB((lWFWbhxVImQVcJF82BX8sTg) this.LaeGQIruHQu81hfJldjMOQSVblH3x);
                return;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.BYTES_FIELD_NUMBER /* 8 */:
                BKV8Ru45KI4 bKV8Ru45KI4 = (BKV8Ru45KI4) this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                LL6zXCXfmDYzdHCRTT lL6zXCXfmDYzdHCRTT = bKV8Ru45KI4.LaeGQIruHQu81hfJldjMOQSVblH3x;
                int i = 0;
                while (true) {
                    try {
                        ((Runnable) this.ZfQNn8hdWlEQ5cR94249PDsLR).run();
                    } catch (Throwable th2) {
                        ej6unYlOWMDF.O1xDAlBZZlZdoEf747lCFHld(hu3HDJRthjXEukAdCh3Tdc.V57tEvNfxZVVcOCAOih5PKr, th2);
                    }
                    Runnable runnableVE4yDIjexsP2lGjLaTcB = bKV8Ru45KI4.vE4yDIjexsP2lGjLaTcB();
                    if (runnableVE4yDIjexsP2lGjLaTcB == null) {
                        return;
                    }
                    this.ZfQNn8hdWlEQ5cR94249PDsLR = runnableVE4yDIjexsP2lGjLaTcB;
                    i++;
                    if (i >= 16 && lL6zXCXfmDYzdHCRTT.aXO0LSrt8bKV(bKV8Ru45KI4)) {
                        lL6zXCXfmDYzdHCRTT.SuB3hEmTmbbRGAhtvOOmfKEon(bKV8Ru45KI4, this);
                        return;
                    }
                    break;
                }
                break;
            case 9:
                ((WpiLOI3RQ2nVUwtF) this.ZfQNn8hdWlEQ5cR94249PDsLR).accept(this.LaeGQIruHQu81hfJldjMOQSVblH3x);
                return;
            case 10:
                ((YAf4BMDpiCAb4hYaN6VqW) this.LaeGQIruHQu81hfJldjMOQSVblH3x).vE4yDIjexsP2lGjLaTcB((LWcyhQFsn8EAAdNGJ) this.ZfQNn8hdWlEQ5cR94249PDsLR);
                return;
            case 11:
                try {
                    ((Runnable) this.LaeGQIruHQu81hfJldjMOQSVblH3x).run();
                    synchronized (((ki0ZWFpNS2MqGdb) this.ZfQNn8hdWlEQ5cR94249PDsLR).ZLZeBXTMq0zDztBxtRTuCHrapQ) {
                        ((ki0ZWFpNS2MqGdb) this.ZfQNn8hdWlEQ5cR94249PDsLR).VxUQ9tBhpHJ2AAEDNW8sghc4m();
                        break;
                    }
                    return;
                } catch (Throwable th3) {
                    synchronized (((ki0ZWFpNS2MqGdb) this.ZfQNn8hdWlEQ5cR94249PDsLR).ZLZeBXTMq0zDztBxtRTuCHrapQ) {
                        ((ki0ZWFpNS2MqGdb) this.ZfQNn8hdWlEQ5cR94249PDsLR).VxUQ9tBhpHJ2AAEDNW8sghc4m();
                        throw th3;
                    }
                }
            case 12:
                TxXBRRtCrcR759WKDq8m6Xg txXBRRtCrcR759WKDq8m6Xg = ((SwipeDismissBehavior) this.LaeGQIruHQu81hfJldjMOQSVblH3x).VxUQ9tBhpHJ2AAEDNW8sghc4m;
                if (txXBRRtCrcR759WKDq8m6Xg == null || !txXBRRtCrcR759WKDq8m6Xg.zIvmSL0wzmmKGc3X39b2Gw2mUGE()) {
                    return;
                }
                ((View) this.ZfQNn8hdWlEQ5cR94249PDsLR).postOnAnimation(this);
                return;
            default:
                IVPB9DLMIoeA0Qp8AgwLlJ iVPB9DLMIoeA0Qp8AgwLlJ = ((NLwwv8wzadD) this.LaeGQIruHQu81hfJldjMOQSVblH3x).V57tEvNfxZVVcOCAOih5PKr.q1wNbhk2O6;
                String str2 = (String) this.ZfQNn8hdWlEQ5cR94249PDsLR;
                synchronized (iVPB9DLMIoeA0Qp8AgwLlJ.HzCpKshMOoaw76hFcbOVRYMeRd) {
                    try {
                        miZQAIwqUtukbpjcHsFxaDq57gE mizqaiwqutukbpjchsfxadq57geV57tEvNfxZVVcOCAOih5PKr = iVPB9DLMIoeA0Qp8AgwLlJ.V57tEvNfxZVVcOCAOih5PKr(str2);
                        vipee55rglxlcs = mizqaiwqutukbpjchsfxadq57geV57tEvNfxZVVcOCAOih5PKr != null ? mizqaiwqutukbpjchsfxadq57geV57tEvNfxZVVcOCAOih5PKr.VxUQ9tBhpHJ2AAEDNW8sghc4m : null;
                    } finally {
                    }
                }
                if (vipee55rglxlcs == null || !vipee55rglxlcs.V57tEvNfxZVVcOCAOih5PKr()) {
                    return;
                }
                synchronized (((NLwwv8wzadD) this.LaeGQIruHQu81hfJldjMOQSVblH3x).LaeGQIruHQu81hfJldjMOQSVblH3x) {
                    ((NLwwv8wzadD) this.LaeGQIruHQu81hfJldjMOQSVblH3x).NSjgqmGjEzuugn2SsG1mZFP.put(hRrPPME7ytOB7ba.M9e7PWhFYLD2lOGMker(vipee55rglxlcs), vipee55rglxlcs);
                    NLwwv8wzadD nLwwv8wzadD = (NLwwv8wzadD) this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                    ((NLwwv8wzadD) this.LaeGQIruHQu81hfJldjMOQSVblH3x).GI83zq0G8e7zkn.put(hRrPPME7ytOB7ba.M9e7PWhFYLD2lOGMker(vipee55rglxlcs), muOaMHIFqe96qo7.VxUQ9tBhpHJ2AAEDNW8sghc4m(nLwwv8wzadD.M9e7PWhFYLD2lOGMker, vipee55rglxlcs, (LL6zXCXfmDYzdHCRTT) nLwwv8wzadD.ZfQNn8hdWlEQ5cR94249PDsLR.ZfQNn8hdWlEQ5cR94249PDsLR, nLwwv8wzadD));
                    break;
                }
                return;
        }
    }

    public /* synthetic */ gZVesoHrfMaGvAvfBsRIr(Object obj, Object obj2, int i, boolean z) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = obj;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = obj2;
    }

    public gZVesoHrfMaGvAvfBsRIr(iFKXVhXhX8FyZGUEP1rAer7 ifkxvhxhx8fyzguep1raer7, ArrayList arrayList, RD86Fssz0iKbf0t61L rD86Fssz0iKbf0t61L) {
        this.V57tEvNfxZVVcOCAOih5PKr = 5;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = arrayList;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = rD86Fssz0iKbf0t61L;
    }

    public gZVesoHrfMaGvAvfBsRIr(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.V57tEvNfxZVVcOCAOih5PKr = 12;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = swipeDismissBehavior;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = view;
    }
}
