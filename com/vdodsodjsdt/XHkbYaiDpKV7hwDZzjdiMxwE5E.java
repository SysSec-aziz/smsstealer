package com.vdodsodjsdt;

import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class XHkbYaiDpKV7hwDZzjdiMxwE5E extends uYcghEwaCDl7XDJKY3gWL1 {
    public final /* synthetic */ int zzpBGItXfub0yWj;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ XHkbYaiDpKV7hwDZzjdiMxwE5E(int i, Class cls) {
        super(cls);
        this.zzpBGItXfub0yWj = i;
    }

    @Override // com.vdodsodjsdt.uYcghEwaCDl7XDJKY3gWL1
    public final Date VxUQ9tBhpHJ2AAEDNW8sghc4m(Date date) {
        switch (this.zzpBGItXfub0yWj) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
