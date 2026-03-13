package com.vdodsodjsdt;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class RpM8PhcGvxtJQZ extends HVDN7cg44ou {
    public final /* synthetic */ EwfUDU4p8ayzzu4RNSgUdB q1wNbhk2O6;

    public RpM8PhcGvxtJQZ(EwfUDU4p8ayzzu4RNSgUdB ewfUDU4p8ayzzu4RNSgUdB) {
        this.q1wNbhk2O6 = ewfUDU4p8ayzzu4RNSgUdB;
    }

    @Override // com.vdodsodjsdt.HVDN7cg44ou
    public final void M9e7PWhFYLD2lOGMker() {
        EwfUDU4p8ayzzu4RNSgUdB ewfUDU4p8ayzzu4RNSgUdB = this.q1wNbhk2O6;
        if (ewfUDU4p8ayzzu4RNSgUdB.Ca81ebIan1u) {
            return;
        }
        ewfUDU4p8ayzzu4RNSgUdB.Ca81ebIan1u = true;
        Zqam9EI4z3IGnFKq zqam9EI4z3IGnFKq = ewfUDU4p8ayzzu4RNSgUdB.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        if (zqam9EI4z3IGnFKq != null) {
            ((cWn2EVjHRjuSHU5xQi) zqam9EI4z3IGnFKq.ZfQNn8hdWlEQ5cR94249PDsLR).cancel();
        }
        Iterator it = ewfUDU4p8ayzzu4RNSgUdB.pYmKDYlAmhudp.iterator();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(it, "iterator(...)");
        while (it.hasNext()) {
            ((AkpQfjiBveZX5wDhj0) it.next()).cancel();
        }
    }
}
