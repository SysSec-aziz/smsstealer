package com.vdodsodjsdt;

import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class Dei5I6vFbwXVXgdLb {
    public final LinkedHashSet V57tEvNfxZVVcOCAOih5PKr;
    public final UUID VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final vIPEe55rgLxLcs zzpBGItXfub0yWj;

    public Dei5I6vFbwXVXgdLb(UUID uuid, vIPEe55rgLxLcs vipee55rglxlcs, LinkedHashSet linkedHashSet) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = uuid;
        this.zzpBGItXfub0yWj = vipee55rglxlcs;
        this.V57tEvNfxZVVcOCAOih5PKr = linkedHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.List] */
    public static final Dei5I6vFbwXVXgdLb VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        ?? QwZcr6V7mfRUaij0Bp3zpr5ClBcxr;
        String strVAUpruoPNdSAVh;
        UUID uuidRandomUUID = UUID.randomUUID();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(uuidRandomUUID, "randomUUID()");
        String string = uuidRandomUUID.toString();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(string, "id.toString()");
        String name = DiagnosticsWorker.class.getName();
        vIPEe55rgLxLcs vipee55rglxlcs = new vIPEe55rgLxLcs(string, 0, name, (String) null, (c9cdYDXIxS3U) null, (c9cdYDXIxS3U) null, 0L, 0L, 0L, (c0WB626RcDoa849JB) null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 0L, 0, 0, (String) null, 16777210);
        String[] strArr = {DiagnosticsWorker.class.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(QtxmZgsffC8rBsc8wSUkFg2a.d9zDyyznnp3oaDT1Ug(1));
        linkedHashSet.add(strArr[0]);
        Dei5I6vFbwXVXgdLb dei5I6vFbwXVXgdLb = new Dei5I6vFbwXVXgdLb(uuidRandomUUID, vipee55rglxlcs, linkedHashSet);
        c0WB626RcDoa849JB c0wb626rcdoa849jb = vipee55rglxlcs.M9e7PWhFYLD2lOGMker;
        boolean z = !c0wb626rcdoa849jb.GI83zq0G8e7zkn.isEmpty() || c0wb626rcdoa849jb.LaeGQIruHQu81hfJldjMOQSVblH3x || c0wb626rcdoa849jb.V57tEvNfxZVVcOCAOih5PKr || c0wb626rcdoa849jb.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (vipee55rglxlcs.pYmKDYlAmhudp) {
            if (z) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (vipee55rglxlcs.ZLZeBXTMq0zDztBxtRTuCHrapQ > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        if (vipee55rglxlcs.q11o1hieEkZDhF1MGOZI26oZiDT == null) {
            String[] strArr2 = {"."};
            String str = strArr2[0];
            if (str.length() == 0) {
                EHKKXdpPo0DCa2P eHKKXdpPo0DCa2P = new EHKKXdpPo0DCa2P(new kVCYLXlG6ES6f(name, new jzN8JaOxjw7m3J(0, vmp19D2MODlOL.rE05n5RsRkyWKIeA9cmLXAKv4Hze(strArr2))));
                QwZcr6V7mfRUaij0Bp3zpr5ClBcxr = new ArrayList(M5nvSQFWCkc.bjhcQ0u7VT2OYYrwk96HrWoN(eHKKXdpPo0DCa2P));
                Iterator it = eHKKXdpPo0DCa2P.iterator();
                while (true) {
                    sBkYA4xAqdoH1yhi2vLUi sbkya4xaqdoh1yhi2vlui = (sBkYA4xAqdoH1yhi2vLUi) it;
                    if (!sbkya4xaqdoh1yhi2vlui.hasNext()) {
                        break;
                    }
                    stS3uecPKs3MU4EfeT sts3uecpks3mu4efet = (stS3uecPKs3MU4EfeT) sbkya4xaqdoh1yhi2vlui.next();
                    ej6unYlOWMDF.pYmKDYlAmhudp(sts3uecpks3mu4efet, "range");
                    QwZcr6V7mfRUaij0Bp3zpr5ClBcxr.add(name.subSequence(sts3uecpks3mu4efet.V57tEvNfxZVVcOCAOih5PKr, sts3uecpks3mu4efet.ZfQNn8hdWlEQ5cR94249PDsLR + 1).toString());
                }
            } else {
                QwZcr6V7mfRUaij0Bp3zpr5ClBcxr = cwhrCnoVJBjJE2CBEAvBopmgF.QwZcr6V7mfRUaij0Bp3zpr5ClBcxr(name, str);
            }
            if (QwZcr6V7mfRUaij0Bp3zpr5ClBcxr.size() == 1) {
                strVAUpruoPNdSAVh = (String) QwZcr6V7mfRUaij0Bp3zpr5ClBcxr.get(0);
            } else {
                if (QwZcr6V7mfRUaij0Bp3zpr5ClBcxr.isEmpty()) {
                    throw new NoSuchElementException("List is empty.");
                }
                strVAUpruoPNdSAVh = (String) QwZcr6V7mfRUaij0Bp3zpr5ClBcxr.get(QwZcr6V7mfRUaij0Bp3zpr5ClBcxr.size() - 1);
            }
            if (strVAUpruoPNdSAVh.length() > 127) {
                strVAUpruoPNdSAVh = cwhrCnoVJBjJE2CBEAvBopmgF.VAUpruoPNdSAVh(strVAUpruoPNdSAVh, 127);
            }
            vipee55rglxlcs.q11o1hieEkZDhF1MGOZI26oZiDT = strVAUpruoPNdSAVh;
        }
        UUID uuidRandomUUID2 = UUID.randomUUID();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(uuidRandomUUID2, "randomUUID()");
        String string2 = uuidRandomUUID2.toString();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(string2, "id.toString()");
        new vIPEe55rgLxLcs(string2, vipee55rglxlcs.zzpBGItXfub0yWj, vipee55rglxlcs.V57tEvNfxZVVcOCAOih5PKr, vipee55rglxlcs.ZfQNn8hdWlEQ5cR94249PDsLR, new c9cdYDXIxS3U(vipee55rglxlcs.LaeGQIruHQu81hfJldjMOQSVblH3x), new c9cdYDXIxS3U(vipee55rglxlcs.zIvmSL0wzmmKGc3X39b2Gw2mUGE), vipee55rglxlcs.ZLZeBXTMq0zDztBxtRTuCHrapQ, vipee55rglxlcs.NSjgqmGjEzuugn2SsG1mZFP, vipee55rglxlcs.GI83zq0G8e7zkn, new c0WB626RcDoa849JB(vipee55rglxlcs.M9e7PWhFYLD2lOGMker), vipee55rglxlcs.HzCpKshMOoaw76hFcbOVRYMeRd, vipee55rglxlcs.KUYypEB4eNWOZWVDpH, vipee55rglxlcs.q1wNbhk2O6, vipee55rglxlcs.p59rPv72J9, vipee55rglxlcs.Ca81ebIan1u, vipee55rglxlcs.h3jnZRsdwYJfY9UhQCkbvWciwvFHv, vipee55rglxlcs.pYmKDYlAmhudp, vipee55rglxlcs.ko09zE6UAgwkV, vipee55rglxlcs.jW7EiD0YL6xkbB158jMUzhWNWb1y, vipee55rglxlcs.vBGA6pPLqSMuYGvprl270j7, vipee55rglxlcs.TaDO7ogis3aEiWEtq, vipee55rglxlcs.Irh5auREsoeV1C1RaBamlmy, vipee55rglxlcs.q11o1hieEkZDhF1MGOZI26oZiDT, 524288);
        return dei5I6vFbwXVXgdLb;
    }
}
