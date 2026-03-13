package com.vdodsodjsdt;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zf8a67a5ZO524dLUgOFxsfO extends zlpVhmuRpIfHYqU implements oMWxlXM7wVUhp72H4IDfzeCn7FdZ {
    public boolean q11o1hieEkZDhF1MGOZI26oZiDT;
    public BbqUXujjobWQwx4SY qNPQb1obP7;
    public boolean w0Wu95l8dVNw5rZMRu;
    public final Skgk8FYn8b4TvRiBOsElZw4XkNLhQ TaDO7ogis3aEiWEtq = new Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(20, new Dqd3yw7CrPyec1dms6HVj(this));
    public final androidx.lifecycle.iVKrTMqOw0TqCeNN Irh5auREsoeV1C1RaBamlmy = new androidx.lifecycle.iVKrTMqOw0TqCeNN(this);
    public boolean RhfGHxtXxy0M0grmp2jkRjQg = true;

    public zf8a67a5ZO524dLUgOFxsfO() {
        ((ALnH3AptNOGA7UbXGxOl2SnVeZ) this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.V57tEvNfxZVVcOCAOih5PKr).LaeGQIruHQu81hfJldjMOQSVblH3x("android:support:lifecycle", new dKWv1GC655M7RKJlo3rGkcysjC2I(1, this));
        final int i = 0;
        ZLZeBXTMq0zDztBxtRTuCHrapQ(new EFN6xDhtisHH7dVlRZ1E5(this) { // from class: com.vdodsodjsdt.MY3tvA34dKekqaLSpcpOmjR2JJ7H
            public final /* synthetic */ zf8a67a5ZO524dLUgOFxsfO zzpBGItXfub0yWj;

            {
                this.zzpBGItXfub0yWj = this;
            }

            @Override // com.vdodsodjsdt.EFN6xDhtisHH7dVlRZ1E5
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        this.zzpBGItXfub0yWj.TaDO7ogis3aEiWEtq.Irh5auREsoeV1C1RaBamlmy();
                        break;
                    default:
                        this.zzpBGItXfub0yWj.TaDO7ogis3aEiWEtq.Irh5auREsoeV1C1RaBamlmy();
                        break;
                }
            }
        });
        final int i2 = 1;
        this.p59rPv72J9.add(new EFN6xDhtisHH7dVlRZ1E5(this) { // from class: com.vdodsodjsdt.MY3tvA34dKekqaLSpcpOmjR2JJ7H
            public final /* synthetic */ zf8a67a5ZO524dLUgOFxsfO zzpBGItXfub0yWj;

            {
                this.zzpBGItXfub0yWj = this;
            }

            @Override // com.vdodsodjsdt.EFN6xDhtisHH7dVlRZ1E5
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        this.zzpBGItXfub0yWj.TaDO7ogis3aEiWEtq.Irh5auREsoeV1C1RaBamlmy();
                        break;
                    default:
                        this.zzpBGItXfub0yWj.TaDO7ogis3aEiWEtq.Irh5auREsoeV1C1RaBamlmy();
                        break;
                }
            }
        });
        NSjgqmGjEzuugn2SsG1mZFP(new QtG03lkTeBa4oRIc(this, 1));
    }

    public static boolean KUYypEB4eNWOZWVDpH(okcUO69vEcgndIAn0R okcuo69vecgndian0r) {
        boolean zKUYypEB4eNWOZWVDpH = false;
        for (dip85SLOWSmNG3 dip85slowsmng3 : okcuo69vecgndian0r.V57tEvNfxZVVcOCAOih5PKr.KUYypEB4eNWOZWVDpH()) {
            if (dip85slowsmng3 != null) {
                Dqd3yw7CrPyec1dms6HVj dqd3yw7CrPyec1dms6HVj = dip85slowsmng3.vBGA6pPLqSMuYGvprl270j7;
                if ((dqd3yw7CrPyec1dms6HVj == null ? null : dqd3yw7CrPyec1dms6HVj.h3jnZRsdwYJfY9UhQCkbvWciwvFHv) != null) {
                    zKUYypEB4eNWOZWVDpH |= KUYypEB4eNWOZWVDpH(dip85slowsmng3.ZLZeBXTMq0zDztBxtRTuCHrapQ());
                }
                CsEvLVebpPqWiZ9 csEvLVebpPqWiZ9 = dip85slowsmng3.wRCD0SdqWCowdYU7bmzN;
                Cg8BA4YSFFWr8 cg8BA4YSFFWr8 = Cg8BA4YSFFWr8.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
                if (csEvLVebpPqWiZ9 != null && csEvLVebpPqWiZ9.LaeGQIruHQu81hfJldjMOQSVblH3x().V57tEvNfxZVVcOCAOih5PKr.compareTo(cg8BA4YSFFWr8) >= 0) {
                    dip85slowsmng3.wRCD0SdqWCowdYU7bmzN.LaeGQIruHQu81hfJldjMOQSVblH3x.ZLZeBXTMq0zDztBxtRTuCHrapQ();
                    zKUYypEB4eNWOZWVDpH = true;
                }
                if (dip85slowsmng3.YdNRGRc4rly.V57tEvNfxZVVcOCAOih5PKr.compareTo(cg8BA4YSFFWr8) >= 0) {
                    dip85slowsmng3.YdNRGRc4rly.ZLZeBXTMq0zDztBxtRTuCHrapQ();
                    zKUYypEB4eNWOZWVDpH = true;
                }
            }
        }
        return zKUYypEB4eNWOZWVDpH;
    }

    public final void Ca81ebIan1u() {
        super.onPostResume();
        this.Irh5auREsoeV1C1RaBamlmy.ZfQNn8hdWlEQ5cR94249PDsLR(XOTOHmUA5NYhlyOBh7.ON_RESUME);
        okcUO69vEcgndIAn0R okcuo69vecgndian0r = ((Dqd3yw7CrPyec1dms6HVj) this.TaDO7ogis3aEiWEtq.ZfQNn8hdWlEQ5cR94249PDsLR).Ca81ebIan1u;
        okcuo69vecgndian0r.vE4yDIjexsP2lGjLaTcB = false;
        okcuo69vecgndian0r.O1xDAlBZZlZdoEf747lCFHld = false;
        okcuo69vecgndian0r.d9zDyyznnp3oaDT1Ug.NSjgqmGjEzuugn2SsG1mZFP = false;
        okcuo69vecgndian0r.vBGA6pPLqSMuYGvprl270j7(7);
    }

    public final HqgfdHRFzXYO3mSc HzCpKshMOoaw76hFcbOVRYMeRd() {
        if (this.qNPQb1obP7 == null) {
            ki0ZWFpNS2MqGdb ki0zwfpns2mqgdb = HqgfdHRFzXYO3mSc.V57tEvNfxZVVcOCAOih5PKr;
            this.qNPQb1obP7 = new BbqUXujjobWQwx4SY(this, null, this, this);
        }
        return this.qNPQb1obP7;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        M9e7PWhFYLD2lOGMker();
        BbqUXujjobWQwx4SY bbqUXujjobWQwx4SY = (BbqUXujjobWQwx4SY) HzCpKshMOoaw76hFcbOVRYMeRd();
        bbqUXujjobWQwx4SY.TaDO7ogis3aEiWEtq();
        ((ViewGroup) bbqUXujjobWQwx4SY.aXO0LSrt8bKV.findViewById(android.R.id.content)).addView(view, layoutParams);
        bbqUXujjobWQwx4SY.Ca81ebIan1u.VxUQ9tBhpHJ2AAEDNW8sghc4m(bbqUXujjobWQwx4SY.p59rPv72J9.getCallback());
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x0231 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00aa  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r11) {
        /*
            Method dump skipped, instruction units count: 586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.zf8a67a5ZO524dLUgOFxsfO.attachBaseContext(android.content.Context):void");
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((BbqUXujjobWQwx4SY) HzCpKshMOoaw76hFcbOVRYMeRd()).RhfGHxtXxy0M0grmp2jkRjQg();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // com.vdodsodjsdt.jOCHSDr891Bpw8RplQXPUZuF07s, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((BbqUXujjobWQwx4SY) HzCpKshMOoaw76hFcbOVRYMeRd()).RhfGHxtXxy0M0grmp2jkRjQg();
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dump(java.lang.String r7, java.io.FileDescriptor r8, java.io.PrintWriter r9, java.lang.String[] r10) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.zf8a67a5ZO524dLUgOFxsfO.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        BbqUXujjobWQwx4SY bbqUXujjobWQwx4SY = (BbqUXujjobWQwx4SY) HzCpKshMOoaw76hFcbOVRYMeRd();
        bbqUXujjobWQwx4SY.TaDO7ogis3aEiWEtq();
        return bbqUXujjobWQwx4SY.p59rPv72J9.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        BbqUXujjobWQwx4SY bbqUXujjobWQwx4SY = (BbqUXujjobWQwx4SY) HzCpKshMOoaw76hFcbOVRYMeRd();
        if (bbqUXujjobWQwx4SY.ko09zE6UAgwkV == null) {
            bbqUXujjobWQwx4SY.RhfGHxtXxy0M0grmp2jkRjQg();
            L6YGERc84Mt1k8Qot l6YGERc84Mt1k8Qot = bbqUXujjobWQwx4SY.pYmKDYlAmhudp;
            bbqUXujjobWQwx4SY.ko09zE6UAgwkV = new uQVzckisSl8(l6YGERc84Mt1k8Qot != null ? l6YGERc84Mt1k8Qot.p6bBrs4p3Ly() : bbqUXujjobWQwx4SY.q1wNbhk2O6);
        }
        return bbqUXujjobWQwx4SY.ko09zE6UAgwkV;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = WHVrwqZ2FG9A4trhgBEXBb.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        return super.getResources();
    }

    public final void h3jnZRsdwYJfY9UhQCkbvWciwvFHv() {
        Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQ = this.TaDO7ogis3aEiWEtq;
        skgk8FYn8b4TvRiBOsElZw4XkNLhQ.Irh5auREsoeV1C1RaBamlmy();
        Dqd3yw7CrPyec1dms6HVj dqd3yw7CrPyec1dms6HVj = (Dqd3yw7CrPyec1dms6HVj) skgk8FYn8b4TvRiBOsElZw4XkNLhQ.ZfQNn8hdWlEQ5cR94249PDsLR;
        super.onStart();
        this.RhfGHxtXxy0M0grmp2jkRjQg = false;
        if (!this.q11o1hieEkZDhF1MGOZI26oZiDT) {
            this.q11o1hieEkZDhF1MGOZI26oZiDT = true;
            dqd3yw7CrPyec1dms6HVj.Ca81ebIan1u.NSjgqmGjEzuugn2SsG1mZFP();
        }
        dqd3yw7CrPyec1dms6HVj.Ca81ebIan1u.w0Wu95l8dVNw5rZMRu(true);
        this.Irh5auREsoeV1C1RaBamlmy.ZfQNn8hdWlEQ5cR94249PDsLR(XOTOHmUA5NYhlyOBh7.ON_START);
        okcUO69vEcgndIAn0R okcuo69vecgndian0r = dqd3yw7CrPyec1dms6HVj.Ca81ebIan1u;
        okcuo69vecgndian0r.vE4yDIjexsP2lGjLaTcB = false;
        okcuo69vecgndian0r.O1xDAlBZZlZdoEf747lCFHld = false;
        okcuo69vecgndian0r.d9zDyyznnp3oaDT1Ug.NSjgqmGjEzuugn2SsG1mZFP = false;
        okcuo69vecgndian0r.vBGA6pPLqSMuYGvprl270j7(5);
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        BbqUXujjobWQwx4SY bbqUXujjobWQwx4SY = (BbqUXujjobWQwx4SY) HzCpKshMOoaw76hFcbOVRYMeRd();
        if (bbqUXujjobWQwx4SY.pYmKDYlAmhudp != null) {
            bbqUXujjobWQwx4SY.RhfGHxtXxy0M0grmp2jkRjQg();
            bbqUXujjobWQwx4SY.pYmKDYlAmhudp.getClass();
            bbqUXujjobWQwx4SY.qNPQb1obP7(0);
        }
    }

    @Override // com.vdodsodjsdt.zlpVhmuRpIfHYqU, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.TaDO7ogis3aEiWEtq.Irh5auREsoeV1C1RaBamlmy();
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.vdodsodjsdt.zlpVhmuRpIfHYqU, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        BbqUXujjobWQwx4SY bbqUXujjobWQwx4SY = (BbqUXujjobWQwx4SY) HzCpKshMOoaw76hFcbOVRYMeRd();
        if (bbqUXujjobWQwx4SY.qygqjTppWwx992 && bbqUXujjobWQwx4SY.pzqP2AqKW6J5PO8zCKnW) {
            bbqUXujjobWQwx4SY.RhfGHxtXxy0M0grmp2jkRjQg();
            L6YGERc84Mt1k8Qot l6YGERc84Mt1k8Qot = bbqUXujjobWQwx4SY.pYmKDYlAmhudp;
            if (l6YGERc84Mt1k8Qot != null) {
                l6YGERc84Mt1k8Qot.HAPpjhiCsV9ONY23505HCBI9IX(l6YGERc84Mt1k8Qot.KUYypEB4eNWOZWVDpH.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            }
        }
        aMdFkGJAdbLdAI00ZfKC7DaJw3k2 amdfkgjadbldai00zfkc7dajw3k2VxUQ9tBhpHJ2AAEDNW8sghc4m = aMdFkGJAdbLdAI00ZfKC7DaJw3k2.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        Context context = bbqUXujjobWQwx4SY.q1wNbhk2O6;
        synchronized (amdfkgjadbldai00zfkc7dajw3k2VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            ZSO61OFnW5yAt zSO61OFnW5yAt = amdfkgjadbldai00zfkc7dajw3k2VxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            synchronized (zSO61OFnW5yAt) {
                kxD7lnfhVByiEwFdNtrRslxulbe kxd7lnfhvbyiewfdntrrslxulbe = (kxD7lnfhVByiEwFdNtrRslxulbe) zSO61OFnW5yAt.zzpBGItXfub0yWj.get(context);
                if (kxd7lnfhvbyiewfdntrrslxulbe != null) {
                    kxd7lnfhvbyiewfdntrrslxulbe.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                }
            }
        }
        bbqUXujjobWQwx4SY.ItrQwCXbty5PZtje5JS = new Configuration(bbqUXujjobWQwx4SY.q1wNbhk2O6.getResources().getConfiguration());
        bbqUXujjobWQwx4SY.q1wNbhk2O6(false, false);
    }

    @Override // com.vdodsodjsdt.zlpVhmuRpIfHYqU, com.vdodsodjsdt.jOCHSDr891Bpw8RplQXPUZuF07s, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.Irh5auREsoeV1C1RaBamlmy.ZfQNn8hdWlEQ5cR94249PDsLR(XOTOHmUA5NYhlyOBh7.ON_CREATE);
        okcUO69vEcgndIAn0R okcuo69vecgndian0r = ((Dqd3yw7CrPyec1dms6HVj) this.TaDO7ogis3aEiWEtq.ZfQNn8hdWlEQ5cR94249PDsLR).Ca81ebIan1u;
        okcuo69vecgndian0r.vE4yDIjexsP2lGjLaTcB = false;
        okcuo69vecgndian0r.O1xDAlBZZlZdoEf747lCFHld = false;
        okcuo69vecgndian0r.d9zDyyznnp3oaDT1Ug.NSjgqmGjEzuugn2SsG1mZFP = false;
        okcuo69vecgndian0r.vBGA6pPLqSMuYGvprl270j7(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((Dqd3yw7CrPyec1dms6HVj) this.TaDO7ogis3aEiWEtq.ZfQNn8hdWlEQ5cR94249PDsLR).Ca81ebIan1u.zIvmSL0wzmmKGc3X39b2Gw2mUGE.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        q1wNbhk2O6();
        HzCpKshMOoaw76hFcbOVRYMeRd().ZfQNn8hdWlEQ5cR94249PDsLR();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // com.vdodsodjsdt.zlpVhmuRpIfHYqU, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent intentQNPQb1obP7;
        if (!p59rPv72J9(i, menuItem)) {
            BbqUXujjobWQwx4SY bbqUXujjobWQwx4SY = (BbqUXujjobWQwx4SY) HzCpKshMOoaw76hFcbOVRYMeRd();
            bbqUXujjobWQwx4SY.RhfGHxtXxy0M0grmp2jkRjQg();
            L6YGERc84Mt1k8Qot l6YGERc84Mt1k8Qot = bbqUXujjobWQwx4SY.pYmKDYlAmhudp;
            if (menuItem.getItemId() != 16908332 || l6YGERc84Mt1k8Qot == null || (((oD78NtkeSuRtaWUfMs1KgLg1WoWNL) l6YGERc84Mt1k8Qot.h3jnZRsdwYJfY9UhQCkbvWciwvFHv).zzpBGItXfub0yWj & 4) == 0 || (intentQNPQb1obP7 = F44whnLsbQ.qNPQb1obP7(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(intentQNPQb1obP7)) {
                navigateUpTo(intentQNPQb1obP7);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentQNPQb1obP72 = F44whnLsbQ.qNPQb1obP7(this);
            if (intentQNPQb1obP72 == null) {
                intentQNPQb1obP72 = F44whnLsbQ.qNPQb1obP7(this);
            }
            if (intentQNPQb1obP72 != null) {
                ComponentName component = intentQNPQb1obP72.getComponent();
                if (component == null) {
                    component = intentQNPQb1obP72.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent intentSuB3hEmTmbbRGAhtvOOmfKEon = F44whnLsbQ.SuB3hEmTmbbRGAhtvOOmfKEon(this, component);
                    while (intentSuB3hEmTmbbRGAhtvOOmfKEon != null) {
                        arrayList.add(size, intentSuB3hEmTmbbRGAhtvOOmfKEon);
                        intentSuB3hEmTmbbRGAhtvOOmfKEon = F44whnLsbQ.SuB3hEmTmbbRGAhtvOOmfKEon(this, intentSuB3hEmTmbbRGAhtvOOmfKEon.getComponent());
                    }
                    arrayList.add(intentQNPQb1obP72);
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e);
                }
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            startActivities(intentArr, null);
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.w0Wu95l8dVNw5rZMRu = false;
        ((Dqd3yw7CrPyec1dms6HVj) this.TaDO7ogis3aEiWEtq.ZfQNn8hdWlEQ5cR94249PDsLR).Ca81ebIan1u.vBGA6pPLqSMuYGvprl270j7(5);
        this.Irh5auREsoeV1C1RaBamlmy.ZfQNn8hdWlEQ5cR94249PDsLR(XOTOHmUA5NYhlyOBh7.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((BbqUXujjobWQwx4SY) HzCpKshMOoaw76hFcbOVRYMeRd()).TaDO7ogis3aEiWEtq();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        Ca81ebIan1u();
        BbqUXujjobWQwx4SY bbqUXujjobWQwx4SY = (BbqUXujjobWQwx4SY) HzCpKshMOoaw76hFcbOVRYMeRd();
        bbqUXujjobWQwx4SY.RhfGHxtXxy0M0grmp2jkRjQg();
        L6YGERc84Mt1k8Qot l6YGERc84Mt1k8Qot = bbqUXujjobWQwx4SY.pYmKDYlAmhudp;
        if (l6YGERc84Mt1k8Qot != null) {
            l6YGERc84Mt1k8Qot.vE4yDIjexsP2lGjLaTcB = true;
        }
    }

    @Override // com.vdodsodjsdt.zlpVhmuRpIfHYqU, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.TaDO7ogis3aEiWEtq.Irh5auREsoeV1C1RaBamlmy();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final void onResume() {
        Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQ = this.TaDO7ogis3aEiWEtq;
        skgk8FYn8b4TvRiBOsElZw4XkNLhQ.Irh5auREsoeV1C1RaBamlmy();
        super.onResume();
        this.w0Wu95l8dVNw5rZMRu = true;
        ((Dqd3yw7CrPyec1dms6HVj) skgk8FYn8b4TvRiBOsElZw4XkNLhQ.ZfQNn8hdWlEQ5cR94249PDsLR).Ca81ebIan1u.w0Wu95l8dVNw5rZMRu(true);
    }

    @Override // android.app.Activity
    public final void onStart() {
        h3jnZRsdwYJfY9UhQCkbvWciwvFHv();
        ((BbqUXujjobWQwx4SY) HzCpKshMOoaw76hFcbOVRYMeRd()).q1wNbhk2O6(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.TaDO7ogis3aEiWEtq.Irh5auREsoeV1C1RaBamlmy();
    }

    @Override // android.app.Activity
    public final void onStop() {
        pYmKDYlAmhudp();
        BbqUXujjobWQwx4SY bbqUXujjobWQwx4SY = (BbqUXujjobWQwx4SY) HzCpKshMOoaw76hFcbOVRYMeRd();
        bbqUXujjobWQwx4SY.RhfGHxtXxy0M0grmp2jkRjQg();
        L6YGERc84Mt1k8Qot l6YGERc84Mt1k8Qot = bbqUXujjobWQwx4SY.pYmKDYlAmhudp;
        if (l6YGERc84Mt1k8Qot != null) {
            l6YGERc84Mt1k8Qot.vE4yDIjexsP2lGjLaTcB = false;
            gXZrMY3vlni2 gxzrmy3vlni2 = l6YGERc84Mt1k8Qot.aXO0LSrt8bKV;
            if (gxzrmy3vlni2 != null) {
                gxzrmy3vlni2.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        HzCpKshMOoaw76hFcbOVRYMeRd().KUYypEB4eNWOZWVDpH(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((BbqUXujjobWQwx4SY) HzCpKshMOoaw76hFcbOVRYMeRd()).RhfGHxtXxy0M0grmp2jkRjQg();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public final boolean p59rPv72J9(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((Dqd3yw7CrPyec1dms6HVj) this.TaDO7ogis3aEiWEtq.ZfQNn8hdWlEQ5cR94249PDsLR).Ca81ebIan1u.M9e7PWhFYLD2lOGMker();
        }
        return false;
    }

    public final void pYmKDYlAmhudp() {
        Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQ;
        super.onStop();
        this.RhfGHxtXxy0M0grmp2jkRjQg = true;
        do {
            skgk8FYn8b4TvRiBOsElZw4XkNLhQ = this.TaDO7ogis3aEiWEtq;
        } while (KUYypEB4eNWOZWVDpH(((Dqd3yw7CrPyec1dms6HVj) skgk8FYn8b4TvRiBOsElZw4XkNLhQ.ZfQNn8hdWlEQ5cR94249PDsLR).Ca81ebIan1u));
        okcUO69vEcgndIAn0R okcuo69vecgndian0r = ((Dqd3yw7CrPyec1dms6HVj) skgk8FYn8b4TvRiBOsElZw4XkNLhQ.ZfQNn8hdWlEQ5cR94249PDsLR).Ca81ebIan1u;
        okcuo69vecgndian0r.O1xDAlBZZlZdoEf747lCFHld = true;
        okcuo69vecgndian0r.d9zDyyznnp3oaDT1Ug.NSjgqmGjEzuugn2SsG1mZFP = true;
        okcuo69vecgndian0r.vBGA6pPLqSMuYGvprl270j7(4);
        this.Irh5auREsoeV1C1RaBamlmy.ZfQNn8hdWlEQ5cR94249PDsLR(XOTOHmUA5NYhlyOBh7.ON_STOP);
    }

    public final void q1wNbhk2O6() {
        super.onDestroy();
        ((Dqd3yw7CrPyec1dms6HVj) this.TaDO7ogis3aEiWEtq.ZfQNn8hdWlEQ5cR94249PDsLR).Ca81ebIan1u.KUYypEB4eNWOZWVDpH();
        this.Irh5auREsoeV1C1RaBamlmy.ZfQNn8hdWlEQ5cR94249PDsLR(XOTOHmUA5NYhlyOBh7.ON_DESTROY);
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        M9e7PWhFYLD2lOGMker();
        HzCpKshMOoaw76hFcbOVRYMeRd().ZLZeBXTMq0zDztBxtRTuCHrapQ(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((BbqUXujjobWQwx4SY) HzCpKshMOoaw76hFcbOVRYMeRd()).vXWl0o6I4U59CgHs9 = i;
    }

    @Override // com.vdodsodjsdt.zlpVhmuRpIfHYqU, android.app.Activity
    public void setContentView(View view) {
        M9e7PWhFYLD2lOGMker();
        HzCpKshMOoaw76hFcbOVRYMeRd().M9e7PWhFYLD2lOGMker(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        M9e7PWhFYLD2lOGMker();
        HzCpKshMOoaw76hFcbOVRYMeRd().HzCpKshMOoaw76hFcbOVRYMeRd(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((Dqd3yw7CrPyec1dms6HVj) this.TaDO7ogis3aEiWEtq.ZfQNn8hdWlEQ5cR94249PDsLR).Ca81ebIan1u.zIvmSL0wzmmKGc3X39b2Gw2mUGE.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
