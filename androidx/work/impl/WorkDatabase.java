package androidx.work.impl;

import android.database.Cursor;
import android.os.Looper;
import com.vdodsodjsdt.GqVneYMXyuJ8mHvjvRdtat;
import com.vdodsodjsdt.Ldmx6alJBFBEfM0MLq2vhR;
import com.vdodsodjsdt.M9zmSQ9uvfJjc32nUm5k6W1oN;
import com.vdodsodjsdt.NrjuzzioPqfttNRptBDpZDzSYUrcM;
import com.vdodsodjsdt.RGN0mODQUR;
import com.vdodsodjsdt.S28Az6EscEakl8kzvM;
import com.vdodsodjsdt.SX5PHeJQdzT24G3iHfmAKRZsddf;
import com.vdodsodjsdt.TGLcRwWGu8YLUNxbS0tKEz;
import com.vdodsodjsdt.Um0z2cMcEZpu6blUyqa58pl;
import com.vdodsodjsdt.XC6rwBjRUhvxaQ8TfYI;
import com.vdodsodjsdt.dXZw8zZnRXsRIYJEIdZC;
import com.vdodsodjsdt.ej6unYlOWMDF;
import com.vdodsodjsdt.m5oAfDmMBYGFl;
import com.vdodsodjsdt.nMRZPpfLCgJyuB;
import com.vdodsodjsdt.o0x3OWMw3He;
import com.vdodsodjsdt.o6OxmOsCD9HJ6LF8UTncnTX9Cf21;
import com.vdodsodjsdt.zyfAMJWWt8IroEev2OgKlBxvdV;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class WorkDatabase {
    public final LinkedHashMap HzCpKshMOoaw76hFcbOVRYMeRd;
    public boolean LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final Map M9e7PWhFYLD2lOGMker;
    public Ldmx6alJBFBEfM0MLq2vhR V57tEvNfxZVVcOCAOih5PKr;
    public volatile Um0z2cMcEZpu6blUyqa58pl VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public List zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public Executor zzpBGItXfub0yWj;
    public final TGLcRwWGu8YLUNxbS0tKEz ZfQNn8hdWlEQ5cR94249PDsLR = ZfQNn8hdWlEQ5cR94249PDsLR();
    public final LinkedHashMap ZLZeBXTMq0zDztBxtRTuCHrapQ = new LinkedHashMap();
    public final ReentrantReadWriteLock NSjgqmGjEzuugn2SsG1mZFP = new ReentrantReadWriteLock();
    public final ThreadLocal GI83zq0G8e7zkn = new ThreadLocal();

    public WorkDatabase() {
        Map mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(mapSynchronizedMap, "synchronizedMap(mutableMapOf())");
        this.M9e7PWhFYLD2lOGMker = mapSynchronizedMap;
        this.HzCpKshMOoaw76hFcbOVRYMeRd = new LinkedHashMap();
    }

    public static Object pYmKDYlAmhudp(Class cls, Ldmx6alJBFBEfM0MLq2vhR ldmx6alJBFBEfM0MLq2vhR) {
        if (cls.isInstance(ldmx6alJBFBEfM0MLq2vhR)) {
            return ldmx6alJBFBEfM0MLq2vhR;
        }
        if (ldmx6alJBFBEfM0MLq2vhR instanceof m5oAfDmMBYGFl) {
            return pYmKDYlAmhudp(cls, ((m5oAfDmMBYGFl) ldmx6alJBFBEfM0MLq2vhR).VxUQ9tBhpHJ2AAEDNW8sghc4m());
        }
        return null;
    }

    public final void Ca81ebIan1u() {
        NSjgqmGjEzuugn2SsG1mZFP().w0Wu95l8dVNw5rZMRu().vE4yDIjexsP2lGjLaTcB();
    }

    public Set GI83zq0G8e7zkn() {
        return RGN0mODQUR.V57tEvNfxZVVcOCAOih5PKr;
    }

    public final void HzCpKshMOoaw76hFcbOVRYMeRd() {
        NSjgqmGjEzuugn2SsG1mZFP().w0Wu95l8dVNw5rZMRu().M9e7PWhFYLD2lOGMker();
        if (NSjgqmGjEzuugn2SsG1mZFP().w0Wu95l8dVNw5rZMRu().RhfGHxtXxy0M0grmp2jkRjQg()) {
            return;
        }
        TGLcRwWGu8YLUNxbS0tKEz tGLcRwWGu8YLUNxbS0tKEz = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (tGLcRwWGu8YLUNxbS0tKEz.zIvmSL0wzmmKGc3X39b2Gw2mUGE.compareAndSet(false, true)) {
            Executor executor = tGLcRwWGu8YLUNxbS0tKEz.VxUQ9tBhpHJ2AAEDNW8sghc4m.zzpBGItXfub0yWj;
            if (executor != null) {
                executor.execute(tGLcRwWGu8YLUNxbS0tKEz.q1wNbhk2O6);
            } else {
                ej6unYlOWMDF.BJQHddi0Plr5ElWetCyaixWOg9("internalQueryExecutor");
                throw null;
            }
        }
    }

    public abstract o0x3OWMw3He KUYypEB4eNWOZWVDpH();

    public abstract Ldmx6alJBFBEfM0MLq2vhR LaeGQIruHQu81hfJldjMOQSVblH3x(GqVneYMXyuJ8mHvjvRdtat gqVneYMXyuJ8mHvjvRdtat);

    public Map M9e7PWhFYLD2lOGMker() {
        return XC6rwBjRUhvxaQ8TfYI.V57tEvNfxZVVcOCAOih5PKr;
    }

    public final Ldmx6alJBFBEfM0MLq2vhR NSjgqmGjEzuugn2SsG1mZFP() {
        Ldmx6alJBFBEfM0MLq2vhR ldmx6alJBFBEfM0MLq2vhR = this.V57tEvNfxZVVcOCAOih5PKr;
        if (ldmx6alJBFBEfM0MLq2vhR != null) {
            return ldmx6alJBFBEfM0MLq2vhR;
        }
        ej6unYlOWMDF.BJQHddi0Plr5ElWetCyaixWOg9("internalOpenHelper");
        throw null;
    }

    public final void V57tEvNfxZVVcOCAOih5PKr() {
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
        Um0z2cMcEZpu6blUyqa58pl um0z2cMcEZpu6blUyqa58plW0Wu95l8dVNw5rZMRu = NSjgqmGjEzuugn2SsG1mZFP().w0Wu95l8dVNw5rZMRu();
        this.ZfQNn8hdWlEQ5cR94249PDsLR.ZfQNn8hdWlEQ5cR94249PDsLR(um0z2cMcEZpu6blUyqa58plW0Wu95l8dVNw5rZMRu);
        if (um0z2cMcEZpu6blUyqa58plW0Wu95l8dVNw5rZMRu.SuB3hEmTmbbRGAhtvOOmfKEon()) {
            um0z2cMcEZpu6blUyqa58plW0Wu95l8dVNw5rZMRu.V57tEvNfxZVVcOCAOih5PKr();
        } else {
            um0z2cMcEZpu6blUyqa58plW0Wu95l8dVNw5rZMRu.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        }
    }

    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        if (!this.LaeGQIruHQu81hfJldjMOQSVblH3x && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public List ZLZeBXTMq0zDztBxtRTuCHrapQ(Map map) {
        ej6unYlOWMDF.pYmKDYlAmhudp(map, "autoMigrationSpecs");
        return zyfAMJWWt8IroEev2OgKlBxvdV.V57tEvNfxZVVcOCAOih5PKr;
    }

    public abstract TGLcRwWGu8YLUNxbS0tKEz ZfQNn8hdWlEQ5cR94249PDsLR();

    public abstract SX5PHeJQdzT24G3iHfmAKRZsddf f6ZQsR6bPLvvCDNXOUc();

    public abstract nMRZPpfLCgJyuB h3jnZRsdwYJfY9UhQCkbvWciwvFHv();

    public abstract NrjuzzioPqfttNRptBDpZDzSYUrcM jW7EiD0YL6xkbB158jMUzhWNWb1y();

    public abstract S28Az6EscEakl8kzvM ko09zE6UAgwkV();

    public final Object p59rPv72J9(Callable callable) {
        V57tEvNfxZVVcOCAOih5PKr();
        try {
            Object objCall = callable.call();
            Ca81ebIan1u();
            return objCall;
        } finally {
            HzCpKshMOoaw76hFcbOVRYMeRd();
        }
    }

    public final Cursor q1wNbhk2O6(M9zmSQ9uvfJjc32nUm5k6W1oN m9zmSQ9uvfJjc32nUm5k6W1oN) {
        VxUQ9tBhpHJ2AAEDNW8sghc4m();
        zzpBGItXfub0yWj();
        return NSjgqmGjEzuugn2SsG1mZFP().w0Wu95l8dVNw5rZMRu().pzqP2AqKW6J5PO8zCKnW(m9zmSQ9uvfJjc32nUm5k6W1oN);
    }

    public abstract o6OxmOsCD9HJ6LF8UTncnTX9Cf21 vBGA6pPLqSMuYGvprl270j7();

    public abstract dXZw8zZnRXsRIYJEIdZC zIvmSL0wzmmKGc3X39b2Gw2mUGE();

    public final void zzpBGItXfub0yWj() {
        if (!NSjgqmGjEzuugn2SsG1mZFP().w0Wu95l8dVNw5rZMRu().RhfGHxtXxy0M0grmp2jkRjQg() && this.GI83zq0G8e7zkn.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }
}
