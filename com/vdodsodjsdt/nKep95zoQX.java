package com.vdodsodjsdt;

import android.content.Context;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class nKep95zoQX extends GvuED9Eb9kjnYjng4BPJg7J implements MGk7KfXeUv8YAfWiUw5LfOd {
    public /* synthetic */ Object GI83zq0G8e7zkn;
    public final /* synthetic */ Object HzCpKshMOoaw76hFcbOVRYMeRd;
    public final /* synthetic */ Object KUYypEB4eNWOZWVDpH;
    public final /* synthetic */ Object M9e7PWhFYLD2lOGMker;
    public int NSjgqmGjEzuugn2SsG1mZFP;
    public final /* synthetic */ int ZLZeBXTMq0zDztBxtRTuCHrapQ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nKep95zoQX(WorkDatabase_Impl workDatabase_Impl, String[] strArr, llyzAJs14odKUIEFXSubfA00DoNX llyzajs14odkuiefxsubfa00donx, IvfXhmjM3e3K ivfXhmjM3e3K) {
        super(2, ivfXhmjM3e3K);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = 2;
        this.M9e7PWhFYLD2lOGMker = workDatabase_Impl;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = strArr;
        this.KUYypEB4eNWOZWVDpH = llyzajs14odkuiefxsubfa00donx;
    }

    @Override // com.vdodsodjsdt.c2NCuhRgMI2BFzsocC
    public final Object KUYypEB4eNWOZWVDpH(Object obj) throws Throwable {
        switch (this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            case 0:
                int i = this.NSjgqmGjEzuugn2SsG1mZFP;
                if (i == 0) {
                    ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(obj);
                    yxp1I6Gr2tLDD3dH0UsMPMDr7 yxp1i6gr2tldd3dh0usmpmdr7 = (yxp1I6Gr2tLDD3dH0UsMPMDr7) this.GI83zq0G8e7zkn;
                    vIPEe55rgLxLcs vipee55rglxlcs = (vIPEe55rgLxLcs) this.M9e7PWhFYLD2lOGMker;
                    this.NSjgqmGjEzuugn2SsG1mZFP = 1;
                    obj = FfcDTkSCwZeMdgS8L4b2MNeOoJ.VxUQ9tBhpHJ2AAEDNW8sghc4m(yxp1i6gr2tldd3dh0usmpmdr7, vipee55rglxlcs, this);
                    w0JnONr1KwCkZY9pA0QjUDuh9aMcU w0jnonr1kwckzy9pa0qjuduh9amcu = w0JnONr1KwCkZY9pA0QjUDuh9aMcU.V57tEvNfxZVVcOCAOih5PKr;
                    if (obj == w0jnonr1kwckzy9pa0qjuduh9amcu) {
                        return w0jnonr1kwckzy9pa0qjuduh9amcu;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(obj);
                }
                ((AtomicInteger) this.HzCpKshMOoaw76hFcbOVRYMeRd).set(((Number) obj).intValue());
                ((RsZYdPZzPnvxFX2Iwr2ecGA) this.KUYypEB4eNWOZWVDpH).cancel(true);
                return hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            case 1:
                int i2 = this.NSjgqmGjEzuugn2SsG1mZFP;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(obj);
                    return obj;
                }
                ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(obj);
                ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.HzCpKshMOoaw76hFcbOVRYMeRd;
                E4DUcuxizcAv5WKy5qZ7sw e4DUcuxizcAv5WKy5qZ7sw = (E4DUcuxizcAv5WKy5qZ7sw) this.KUYypEB4eNWOZWVDpH;
                yxp1I6Gr2tLDD3dH0UsMPMDr7 yxp1i6gr2tldd3dh0usmpmdr72 = (yxp1I6Gr2tLDD3dH0UsMPMDr7) this.GI83zq0G8e7zkn;
                vIPEe55rgLxLcs vipee55rglxlcs2 = (vIPEe55rgLxLcs) this.M9e7PWhFYLD2lOGMker;
                this.NSjgqmGjEzuugn2SsG1mZFP = 1;
                Object objZfQNn8hdWlEQ5cR94249PDsLR = ConstraintTrackingWorker.ZfQNn8hdWlEQ5cR94249PDsLR(constraintTrackingWorker, e4DUcuxizcAv5WKy5qZ7sw, yxp1i6gr2tldd3dh0usmpmdr72, vipee55rglxlcs2, this);
                w0JnONr1KwCkZY9pA0QjUDuh9aMcU w0jnonr1kwckzy9pa0qjuduh9amcu2 = w0JnONr1KwCkZY9pA0QjUDuh9aMcU.V57tEvNfxZVVcOCAOih5PKr;
                return objZfQNn8hdWlEQ5cR94249PDsLR == w0jnonr1kwckzy9pa0qjuduh9amcu2 ? w0jnonr1kwckzy9pa0qjuduh9amcu2 : objZfQNn8hdWlEQ5cR94249PDsLR;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                int i3 = this.NSjgqmGjEzuugn2SsG1mZFP;
                if (i3 == 0) {
                    ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(obj);
                    FraScyvWVdKLHI4dEwh8h1WO4 fraScyvWVdKLHI4dEwh8h1WO4 = new FraScyvWVdKLHI4dEwh8h1WO4((WorkDatabase_Impl) this.M9e7PWhFYLD2lOGMker, (Q1zAhWfgG5v13hOK) this.GI83zq0G8e7zkn, (String[]) this.HzCpKshMOoaw76hFcbOVRYMeRd, (llyzAJs14odKUIEFXSubfA00DoNX) this.KUYypEB4eNWOZWVDpH, null);
                    this.NSjgqmGjEzuugn2SsG1mZFP = 1;
                    yB0MgkQF0w4aWkiL0rHiqFb54ZHEs yb0mgkqf0w4awkil0rhiqfb54zhes = new yB0MgkQF0w4aWkiL0rHiqFb54ZHEs(this, LaeGQIruHQu81hfJldjMOQSVblH3x());
                    Object objKYZ9RyuOc42A2J = KfeOQNOupsCg6878zi4e.KYZ9RyuOc42A2J(yb0mgkqf0w4awkil0rhiqfb54zhes, yb0mgkqf0w4awkil0rhiqfb54zhes, fraScyvWVdKLHI4dEwh8h1WO4);
                    w0JnONr1KwCkZY9pA0QjUDuh9aMcU w0jnonr1kwckzy9pa0qjuduh9amcu3 = w0JnONr1KwCkZY9pA0QjUDuh9aMcU.V57tEvNfxZVVcOCAOih5PKr;
                    if (objKYZ9RyuOc42A2J == w0jnonr1kwckzy9pa0qjuduh9amcu3) {
                        return w0jnonr1kwckzy9pa0qjuduh9amcu3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(obj);
                }
                return hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            default:
                String str = ((vIPEe55rgLxLcs) this.M9e7PWhFYLD2lOGMker).V57tEvNfxZVVcOCAOih5PKr;
                E4DUcuxizcAv5WKy5qZ7sw e4DUcuxizcAv5WKy5qZ7sw2 = (E4DUcuxizcAv5WKy5qZ7sw) this.GI83zq0G8e7zkn;
                int i4 = this.NSjgqmGjEzuugn2SsG1mZFP;
                w0JnONr1KwCkZY9pA0QjUDuh9aMcU w0jnonr1kwckzy9pa0qjuduh9amcu4 = w0JnONr1KwCkZY9pA0QjUDuh9aMcU.V57tEvNfxZVVcOCAOih5PKr;
                if (i4 == 0) {
                    ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(obj);
                    k5xHLp7fCPX0ktLE3ej5tGjGJa k5xhlp7fcpx0ktle3ej5tgjgjaVxUQ9tBhpHJ2AAEDNW8sghc4m = e4DUcuxizcAv5WKy5qZ7sw2.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                    this.NSjgqmGjEzuugn2SsG1mZFP = 1;
                    obj = WymhoAQMxaR.VxUQ9tBhpHJ2AAEDNW8sghc4m(k5xhlp7fcpx0ktle3ej5tgjgjaVxUQ9tBhpHJ2AAEDNW8sghc4m, e4DUcuxizcAv5WKy5qZ7sw2, this);
                    if (obj != w0jnonr1kwckzy9pa0qjuduh9amcu4) {
                    }
                    return w0jnonr1kwckzy9pa0qjuduh9amcu4;
                }
                if (i4 != 1) {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(obj);
                    return obj;
                }
                ej6unYlOWMDF.bjhcQ0u7VT2OYYrwk96HrWoN(obj);
                ssIlBIazVyEpdtn9SOpMLpu7YjIT3 ssilbiazvyepdtn9sopmlpu7yjit3 = (ssIlBIazVyEpdtn9SOpMLpu7YjIT3) obj;
                if (ssilbiazvyepdtn9sopmlpu7yjit3 == null) {
                    throw new IllegalStateException(u9SlVAuoWhQUfJ.M9e7PWhFYLD2lOGMker("Worker was marked important (", str, ") but did not provide ForegroundInfo"));
                }
                String str2 = uNLYhcQ21Um5yeOqAF.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().VxUQ9tBhpHJ2AAEDNW8sghc4m(str2, "Updating notification for " + str);
                H2jsGOgXlkbRqFUBUI3hx5 h2jsGOgXlkbRqFUBUI3hx5 = (H2jsGOgXlkbRqFUBUI3hx5) this.HzCpKshMOoaw76hFcbOVRYMeRd;
                Context context = (Context) this.KUYypEB4eNWOZWVDpH;
                UUID uuid = e4DUcuxizcAv5WKy5qZ7sw2.zzpBGItXfub0yWj.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                ki0ZWFpNS2MqGdb ki0zwfpns2mqgdb = (ki0ZWFpNS2MqGdb) h2jsGOgXlkbRqFUBUI3hx5.VxUQ9tBhpHJ2AAEDNW8sghc4m.V57tEvNfxZVVcOCAOih5PKr;
                H5020FzOIeGdxBWIL1OKPe h5020FzOIeGdxBWIL1OKPe = new H5020FzOIeGdxBWIL1OKPe(h2jsGOgXlkbRqFUBUI3hx5, uuid, ssilbiazvyepdtn9sopmlpu7yjit3, context);
                ej6unYlOWMDF.pYmKDYlAmhudp(ki0zwfpns2mqgdb, "<this>");
                k5xHLp7fCPX0ktLE3ej5tGjGJa k5xhlp7fcpx0ktle3ej5tgjgjaRhfGHxtXxy0M0grmp2jkRjQg = ej6unYlOWMDF.RhfGHxtXxy0M0grmp2jkRjQg(new ek4IsStTbvjeGaTN76((Executor) ki0zwfpns2mqgdb, h5020FzOIeGdxBWIL1OKPe));
                this.NSjgqmGjEzuugn2SsG1mZFP = 2;
                Object objZzpBGItXfub0yWj = KfeOQNOupsCg6878zi4e.zzpBGItXfub0yWj(k5xhlp7fcpx0ktle3ej5tgjgjaRhfGHxtXxy0M0grmp2jkRjQg, this);
                if (objZzpBGItXfub0yWj != w0jnonr1kwckzy9pa0qjuduh9amcu4) {
                    return objZzpBGItXfub0yWj;
                }
                return w0jnonr1kwckzy9pa0qjuduh9amcu4;
        }
    }

    @Override // com.vdodsodjsdt.c2NCuhRgMI2BFzsocC
    public final IvfXhmjM3e3K M9e7PWhFYLD2lOGMker(IvfXhmjM3e3K ivfXhmjM3e3K, Object obj) {
        switch (this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            case 0:
                return new nKep95zoQX((yxp1I6Gr2tLDD3dH0UsMPMDr7) this.GI83zq0G8e7zkn, (vIPEe55rgLxLcs) this.M9e7PWhFYLD2lOGMker, (AtomicInteger) this.HzCpKshMOoaw76hFcbOVRYMeRd, (RsZYdPZzPnvxFX2Iwr2ecGA) this.KUYypEB4eNWOZWVDpH, ivfXhmjM3e3K, 0);
            case 1:
                return new nKep95zoQX((ConstraintTrackingWorker) this.HzCpKshMOoaw76hFcbOVRYMeRd, (E4DUcuxizcAv5WKy5qZ7sw) this.KUYypEB4eNWOZWVDpH, (yxp1I6Gr2tLDD3dH0UsMPMDr7) this.GI83zq0G8e7zkn, (vIPEe55rgLxLcs) this.M9e7PWhFYLD2lOGMker, ivfXhmjM3e3K);
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                nKep95zoQX nkep95zoqx = new nKep95zoQX((WorkDatabase_Impl) this.M9e7PWhFYLD2lOGMker, (String[]) this.HzCpKshMOoaw76hFcbOVRYMeRd, (llyzAJs14odKUIEFXSubfA00DoNX) this.KUYypEB4eNWOZWVDpH, ivfXhmjM3e3K);
                nkep95zoqx.GI83zq0G8e7zkn = obj;
                return nkep95zoqx;
            default:
                return new nKep95zoQX((E4DUcuxizcAv5WKy5qZ7sw) this.GI83zq0G8e7zkn, (vIPEe55rgLxLcs) this.M9e7PWhFYLD2lOGMker, (H2jsGOgXlkbRqFUBUI3hx5) this.HzCpKshMOoaw76hFcbOVRYMeRd, (Context) this.KUYypEB4eNWOZWVDpH, ivfXhmjM3e3K, 3);
        }
    }

    @Override // com.vdodsodjsdt.MGk7KfXeUv8YAfWiUw5LfOd
    public final Object NSjgqmGjEzuugn2SsG1mZFP(Object obj, Object obj2) {
        switch (this.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            case 0:
                return ((nKep95zoQX) M9e7PWhFYLD2lOGMker((IvfXhmjM3e3K) obj2, (jG2FHg9iAk) obj)).KUYypEB4eNWOZWVDpH(hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m);
            case 1:
                return ((nKep95zoQX) M9e7PWhFYLD2lOGMker((IvfXhmjM3e3K) obj2, (jG2FHg9iAk) obj)).KUYypEB4eNWOZWVDpH(hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m);
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                return ((nKep95zoQX) M9e7PWhFYLD2lOGMker((IvfXhmjM3e3K) obj2, (Q1zAhWfgG5v13hOK) obj)).KUYypEB4eNWOZWVDpH(hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m);
            default:
                return ((nKep95zoQX) M9e7PWhFYLD2lOGMker((IvfXhmjM3e3K) obj2, (jG2FHg9iAk) obj)).KUYypEB4eNWOZWVDpH(hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nKep95zoQX(ConstraintTrackingWorker constraintTrackingWorker, E4DUcuxizcAv5WKy5qZ7sw e4DUcuxizcAv5WKy5qZ7sw, yxp1I6Gr2tLDD3dH0UsMPMDr7 yxp1i6gr2tldd3dh0usmpmdr7, vIPEe55rgLxLcs vipee55rglxlcs, IvfXhmjM3e3K ivfXhmjM3e3K) {
        super(2, ivfXhmjM3e3K);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = 1;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = constraintTrackingWorker;
        this.KUYypEB4eNWOZWVDpH = e4DUcuxizcAv5WKy5qZ7sw;
        this.GI83zq0G8e7zkn = yxp1i6gr2tldd3dh0usmpmdr7;
        this.M9e7PWhFYLD2lOGMker = vipee55rglxlcs;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nKep95zoQX(Object obj, vIPEe55rgLxLcs vipee55rglxlcs, Object obj2, Object obj3, IvfXhmjM3e3K ivfXhmjM3e3K, int i) {
        super(2, ivfXhmjM3e3K);
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = i;
        this.GI83zq0G8e7zkn = obj;
        this.M9e7PWhFYLD2lOGMker = vipee55rglxlcs;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = obj2;
        this.KUYypEB4eNWOZWVDpH = obj3;
    }
}
