package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Paint;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.work.impl.WorkDatabase;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class o0x3OWMw3He {
    public final Object V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ int VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public Object zzpBGItXfub0yWj;

    public /* synthetic */ o0x3OWMw3He(int i, Object obj) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        this.V57tEvNfxZVVcOCAOih5PKr = obj;
    }

    public static String VxUQ9tBhpHJ2AAEDNW8sghc4m(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    public void Ca81ebIan1u(boolean z) {
        dip85SLOWSmNG3 dip85slowsmng3 = ((okcUO69vEcgndIAn0R) this.V57tEvNfxZVVcOCAOih5PKr).TaDO7ogis3aEiWEtq;
        if (dip85slowsmng3 != null) {
            dip85slowsmng3.M9e7PWhFYLD2lOGMker().KUYypEB4eNWOZWVDpH.Ca81ebIan1u(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.zzpBGItXfub0yWj).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void GI83zq0G8e7zkn(boolean z) {
        dip85SLOWSmNG3 dip85slowsmng3 = ((okcUO69vEcgndIAn0R) this.V57tEvNfxZVVcOCAOih5PKr).TaDO7ogis3aEiWEtq;
        if (dip85slowsmng3 != null) {
            dip85slowsmng3.M9e7PWhFYLD2lOGMker().KUYypEB4eNWOZWVDpH.GI83zq0G8e7zkn(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.zzpBGItXfub0yWj).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void HzCpKshMOoaw76hFcbOVRYMeRd(boolean z) {
        dip85SLOWSmNG3 dip85slowsmng3 = ((okcUO69vEcgndIAn0R) this.V57tEvNfxZVVcOCAOih5PKr).TaDO7ogis3aEiWEtq;
        if (dip85slowsmng3 != null) {
            dip85slowsmng3.M9e7PWhFYLD2lOGMker().KUYypEB4eNWOZWVDpH.HzCpKshMOoaw76hFcbOVRYMeRd(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.zzpBGItXfub0yWj).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public euYTwHHkzT79KP8ssihrzwr Irh5auREsoeV1C1RaBamlmy(InputConnection inputConnection, EditorInfo editorInfo) {
        Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQ = (Skgk8FYn8b4TvRiBOsElZw4XkNLhQ) this.V57tEvNfxZVVcOCAOih5PKr;
        if (inputConnection == null) {
            skgk8FYn8b4TvRiBOsElZw4XkNLhQ.getClass();
            inputConnection = null;
        } else {
            o0x3OWMw3He o0x3owmw3he = (o0x3OWMw3He) skgk8FYn8b4TvRiBOsElZw4XkNLhQ.ZfQNn8hdWlEQ5cR94249PDsLR;
            o0x3owmw3he.getClass();
            if (!(inputConnection instanceof euYTwHHkzT79KP8ssihrzwr)) {
                inputConnection = new euYTwHHkzT79KP8ssihrzwr((EditText) o0x3owmw3he.zzpBGItXfub0yWj, inputConnection, editorInfo);
            }
        }
        return (euYTwHHkzT79KP8ssihrzwr) inputConnection;
    }

    public void KUYypEB4eNWOZWVDpH(boolean z) {
        dip85SLOWSmNG3 dip85slowsmng3 = ((okcUO69vEcgndIAn0R) this.V57tEvNfxZVVcOCAOih5PKr).TaDO7ogis3aEiWEtq;
        if (dip85slowsmng3 != null) {
            dip85slowsmng3.M9e7PWhFYLD2lOGMker().KUYypEB4eNWOZWVDpH.KUYypEB4eNWOZWVDpH(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.zzpBGItXfub0yWj).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void LaeGQIruHQu81hfJldjMOQSVblH3x(boolean z) {
        dip85SLOWSmNG3 dip85slowsmng3 = ((okcUO69vEcgndIAn0R) this.V57tEvNfxZVVcOCAOih5PKr).TaDO7ogis3aEiWEtq;
        if (dip85slowsmng3 != null) {
            dip85slowsmng3.M9e7PWhFYLD2lOGMker().KUYypEB4eNWOZWVDpH.LaeGQIruHQu81hfJldjMOQSVblH3x(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.zzpBGItXfub0yWj).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void M9e7PWhFYLD2lOGMker(boolean z) {
        dip85SLOWSmNG3 dip85slowsmng3 = ((okcUO69vEcgndIAn0R) this.V57tEvNfxZVVcOCAOih5PKr).TaDO7ogis3aEiWEtq;
        if (dip85slowsmng3 != null) {
            dip85slowsmng3.M9e7PWhFYLD2lOGMker().KUYypEB4eNWOZWVDpH.M9e7PWhFYLD2lOGMker(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.zzpBGItXfub0yWj).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void NSjgqmGjEzuugn2SsG1mZFP(boolean z) {
        okcUO69vEcgndIAn0R okcuo69vecgndian0r = (okcUO69vEcgndIAn0R) this.V57tEvNfxZVVcOCAOih5PKr;
        zf8a67a5ZO524dLUgOFxsfO zf8a67a5zo524dlugofxsfo = okcuo69vecgndian0r.f6ZQsR6bPLvvCDNXOUc.q1wNbhk2O6;
        dip85SLOWSmNG3 dip85slowsmng3 = okcuo69vecgndian0r.TaDO7ogis3aEiWEtq;
        if (dip85slowsmng3 != null) {
            dip85slowsmng3.M9e7PWhFYLD2lOGMker().KUYypEB4eNWOZWVDpH.NSjgqmGjEzuugn2SsG1mZFP(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.zzpBGItXfub0yWj).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void TaDO7ogis3aEiWEtq(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = ((EditText) this.zzpBGItXfub0yWj).getContext().obtainStyledAttributes(attributeSet, AuEvIFo0QoYm1PHNG.GI83zq0G8e7zkn, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            q11o1hieEkZDhF1MGOZI26oZiDT(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public void V57tEvNfxZVVcOCAOih5PKr(boolean z) {
        okcUO69vEcgndIAn0R okcuo69vecgndian0r = (okcUO69vEcgndIAn0R) this.V57tEvNfxZVVcOCAOih5PKr;
        zf8a67a5ZO524dLUgOFxsfO zf8a67a5zo524dlugofxsfo = okcuo69vecgndian0r.f6ZQsR6bPLvvCDNXOUc.q1wNbhk2O6;
        dip85SLOWSmNG3 dip85slowsmng3 = okcuo69vecgndian0r.TaDO7ogis3aEiWEtq;
        if (dip85slowsmng3 != null) {
            dip85slowsmng3.M9e7PWhFYLD2lOGMker().KUYypEB4eNWOZWVDpH.V57tEvNfxZVVcOCAOih5PKr(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.zzpBGItXfub0yWj).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void ZLZeBXTMq0zDztBxtRTuCHrapQ(boolean z) {
        dip85SLOWSmNG3 dip85slowsmng3 = ((okcUO69vEcgndIAn0R) this.V57tEvNfxZVVcOCAOih5PKr).TaDO7ogis3aEiWEtq;
        if (dip85slowsmng3 != null) {
            dip85slowsmng3.M9e7PWhFYLD2lOGMker().KUYypEB4eNWOZWVDpH.ZLZeBXTMq0zDztBxtRTuCHrapQ(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.zzpBGItXfub0yWj).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void ZfQNn8hdWlEQ5cR94249PDsLR(boolean z) {
        dip85SLOWSmNG3 dip85slowsmng3 = ((okcUO69vEcgndIAn0R) this.V57tEvNfxZVVcOCAOih5PKr).TaDO7ogis3aEiWEtq;
        if (dip85slowsmng3 != null) {
            dip85slowsmng3.M9e7PWhFYLD2lOGMker().KUYypEB4eNWOZWVDpH.ZfQNn8hdWlEQ5cR94249PDsLR(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.zzpBGItXfub0yWj).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void f6ZQsR6bPLvvCDNXOUc(iI04L8AdRx9Y2pbmi6FzqrqMSV ii04l8adrx9y2pbmi6fzqrqmsv) {
        WorkDatabase workDatabase = (WorkDatabase) this.zzpBGItXfub0yWj;
        workDatabase.zzpBGItXfub0yWj();
        workDatabase.V57tEvNfxZVVcOCAOih5PKr();
        try {
            ((xR0ZoYA1SdIBIre5oWm06m) this.V57tEvNfxZVVcOCAOih5PKr).zIvmSL0wzmmKGc3X39b2Gw2mUGE(ii04l8adrx9y2pbmi6fzqrqmsv);
            workDatabase.Ca81ebIan1u();
        } finally {
            workDatabase.HzCpKshMOoaw76hFcbOVRYMeRd();
        }
    }

    public View h3jnZRsdwYJfY9UhQCkbvWciwvFHv(int i, int i2, int i3, int i4) {
        View viewVBGA6pPLqSMuYGvprl270j7;
        OjNhSQff2yOfzldut ojNhSQff2yOfzldut = (OjNhSQff2yOfzldut) this.V57tEvNfxZVVcOCAOih5PKr;
        v0TUlllCd5A1AKhbyZO v0tulllcd5a1akhbyzo = (v0TUlllCd5A1AKhbyZO) this.zzpBGItXfub0yWj;
        int iZfQNn8hdWlEQ5cR94249PDsLR = v0tulllcd5a1akhbyzo.ZfQNn8hdWlEQ5cR94249PDsLR();
        int iV57tEvNfxZVVcOCAOih5PKr = v0tulllcd5a1akhbyzo.V57tEvNfxZVVcOCAOih5PKr();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            switch (v0tulllcd5a1akhbyzo.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
                case 0:
                    viewVBGA6pPLqSMuYGvprl270j7 = v0tulllcd5a1akhbyzo.zzpBGItXfub0yWj.vBGA6pPLqSMuYGvprl270j7(i);
                    break;
                default:
                    viewVBGA6pPLqSMuYGvprl270j7 = v0tulllcd5a1akhbyzo.zzpBGItXfub0yWj.vBGA6pPLqSMuYGvprl270j7(i);
                    break;
            }
            int iZzpBGItXfub0yWj = v0tulllcd5a1akhbyzo.zzpBGItXfub0yWj(viewVBGA6pPLqSMuYGvprl270j7);
            int iVxUQ9tBhpHJ2AAEDNW8sghc4m = v0tulllcd5a1akhbyzo.VxUQ9tBhpHJ2AAEDNW8sghc4m(viewVBGA6pPLqSMuYGvprl270j7);
            ojNhSQff2yOfzldut.zzpBGItXfub0yWj = iZfQNn8hdWlEQ5cR94249PDsLR;
            ojNhSQff2yOfzldut.V57tEvNfxZVVcOCAOih5PKr = iV57tEvNfxZVVcOCAOih5PKr;
            ojNhSQff2yOfzldut.ZfQNn8hdWlEQ5cR94249PDsLR = iZzpBGItXfub0yWj;
            ojNhSQff2yOfzldut.LaeGQIruHQu81hfJldjMOQSVblH3x = iVxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (i3 != 0) {
                ojNhSQff2yOfzldut.VxUQ9tBhpHJ2AAEDNW8sghc4m = i3;
                if (ojNhSQff2yOfzldut.VxUQ9tBhpHJ2AAEDNW8sghc4m()) {
                    return viewVBGA6pPLqSMuYGvprl270j7;
                }
            }
            if (i4 != 0) {
                ojNhSQff2yOfzldut.VxUQ9tBhpHJ2AAEDNW8sghc4m = i4;
                if (ojNhSQff2yOfzldut.VxUQ9tBhpHJ2AAEDNW8sghc4m()) {
                    view = viewVBGA6pPLqSMuYGvprl270j7;
                }
            }
            i += i5;
        }
        return view;
    }

    public Long jW7EiD0YL6xkbB158jMUzhWNWb1y(String str) {
        xgjEDGKy9VX5 xgjedgky9vx5VxUQ9tBhpHJ2AAEDNW8sghc4m = xgjEDGKy9VX5.VxUQ9tBhpHJ2AAEDNW8sghc4m("SELECT long_value FROM Preference where `key`=?", 1);
        xgjedgky9vx5VxUQ9tBhpHJ2AAEDNW8sghc4m.f6ZQsR6bPLvvCDNXOUc(str, 1);
        WorkDatabase workDatabase = (WorkDatabase) this.zzpBGItXfub0yWj;
        workDatabase.zzpBGItXfub0yWj();
        Cursor cursorQ1wNbhk2O6 = workDatabase.q1wNbhk2O6(xgjedgky9vx5VxUQ9tBhpHJ2AAEDNW8sghc4m);
        try {
            Long lValueOf = null;
            if (cursorQ1wNbhk2O6.moveToFirst() && !cursorQ1wNbhk2O6.isNull(0)) {
                lValueOf = Long.valueOf(cursorQ1wNbhk2O6.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorQ1wNbhk2O6.close();
            xgjedgky9vx5VxUQ9tBhpHJ2AAEDNW8sghc4m.M9e7PWhFYLD2lOGMker();
        }
    }

    public KeyListener ko09zE6UAgwkV(KeyListener keyListener) {
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        ((o0x3OWMw3He) ((Skgk8FYn8b4TvRiBOsElZw4XkNLhQ) this.V57tEvNfxZVVcOCAOih5PKr).ZfQNn8hdWlEQ5cR94249PDsLR).getClass();
        if (keyListener instanceof NsqWTOW5mDveFtDMwuN20BcQza) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        return keyListener instanceof NumberKeyListener ? keyListener : new NsqWTOW5mDveFtDMwuN20BcQza(keyListener);
    }

    public void p59rPv72J9(boolean z) {
        dip85SLOWSmNG3 dip85slowsmng3 = ((okcUO69vEcgndIAn0R) this.V57tEvNfxZVVcOCAOih5PKr).TaDO7ogis3aEiWEtq;
        if (dip85slowsmng3 != null) {
            dip85slowsmng3.M9e7PWhFYLD2lOGMker().KUYypEB4eNWOZWVDpH.p59rPv72J9(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.zzpBGItXfub0yWj).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.vdodsodjsdt.HOYh3odfAhsInxjoW2Lj8Uep pYmKDYlAmhudp(com.vdodsodjsdt.q898WQEbycPNMnuoo6 r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.o0x3OWMw3He.pYmKDYlAmhudp(com.vdodsodjsdt.q898WQEbycPNMnuoo6, boolean):com.vdodsodjsdt.HOYh3odfAhsInxjoW2Lj8Uep");
    }

    public void q11o1hieEkZDhF1MGOZI26oZiDT(boolean z) {
        idvZLuVtEHk6C2 idvzluvtehk6c2 = (idvZLuVtEHk6C2) ((o0x3OWMw3He) ((Skgk8FYn8b4TvRiBOsElZw4XkNLhQ) this.V57tEvNfxZVVcOCAOih5PKr).ZfQNn8hdWlEQ5cR94249PDsLR).V57tEvNfxZVVcOCAOih5PKr;
        if (idvzluvtehk6c2.LaeGQIruHQu81hfJldjMOQSVblH3x != z) {
            if (idvzluvtehk6c2.ZfQNn8hdWlEQ5cR94249PDsLR != null) {
                ZxVLD9H77Z62NUllXp zxVLD9H77Z62NUllXpVxUQ9tBhpHJ2AAEDNW8sghc4m = ZxVLD9H77Z62NUllXp.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                gAItek4sjAVVIxDjX gaitek4sjavvixdjx = idvzluvtehk6c2.ZfQNn8hdWlEQ5cR94249PDsLR;
                zxVLD9H77Z62NUllXpVxUQ9tBhpHJ2AAEDNW8sghc4m.getClass();
                KfeOQNOupsCg6878zi4e.KUYypEB4eNWOZWVDpH(gaitek4sjavvixdjx, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = zxVLD9H77Z62NUllXpVxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    zxVLD9H77Z62NUllXpVxUQ9tBhpHJ2AAEDNW8sghc4m.zzpBGItXfub0yWj.remove(gaitek4sjavvixdjx);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            idvzluvtehk6c2.LaeGQIruHQu81hfJldjMOQSVblH3x = z;
            if (z) {
                idvZLuVtEHk6C2.VxUQ9tBhpHJ2AAEDNW8sghc4m(idvzluvtehk6c2.V57tEvNfxZVVcOCAOih5PKr, ZxVLD9H77Z62NUllXp.VxUQ9tBhpHJ2AAEDNW8sghc4m().zzpBGItXfub0yWj());
            }
        }
    }

    public void q1wNbhk2O6(boolean z) {
        dip85SLOWSmNG3 dip85slowsmng3 = ((okcUO69vEcgndIAn0R) this.V57tEvNfxZVVcOCAOih5PKr).TaDO7ogis3aEiWEtq;
        if (dip85slowsmng3 != null) {
            dip85slowsmng3.M9e7PWhFYLD2lOGMker().KUYypEB4eNWOZWVDpH.q1wNbhk2O6(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.zzpBGItXfub0yWj).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public String toString() {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                return ((Map) this.zzpBGItXfub0yWj).toString();
            case g8kevnL6UKpr15IYtcPJXuLo1L4.DOUBLE_FIELD_NUMBER /* 7 */:
                String str = "[ ";
                if (((hkOLVejSEWXUiK2HQlr9P2Z9) this.zzpBGItXfub0yWj) != null) {
                    for (int i = 0; i < 9; i++) {
                        str = str + ((hkOLVejSEWXUiK2HQlr9P2Z9) this.zzpBGItXfub0yWj).M9e7PWhFYLD2lOGMker[i] + " ";
                    }
                }
                return str + "] " + ((hkOLVejSEWXUiK2HQlr9P2Z9) this.zzpBGItXfub0yWj);
            case 9:
                return "Bounds{lower=" + ((MCkc9XaOBWJ3kr1ZFUGL46e9N) this.zzpBGItXfub0yWj) + " upper=" + ((MCkc9XaOBWJ3kr1ZFUGL46e9N) this.V57tEvNfxZVVcOCAOih5PKr) + "}";
            default:
                return super.toString();
        }
    }

    public boolean vBGA6pPLqSMuYGvprl270j7(View view) {
        OjNhSQff2yOfzldut ojNhSQff2yOfzldut = (OjNhSQff2yOfzldut) this.V57tEvNfxZVVcOCAOih5PKr;
        v0TUlllCd5A1AKhbyZO v0tulllcd5a1akhbyzo = (v0TUlllCd5A1AKhbyZO) this.zzpBGItXfub0yWj;
        int iZfQNn8hdWlEQ5cR94249PDsLR = v0tulllcd5a1akhbyzo.ZfQNn8hdWlEQ5cR94249PDsLR();
        int iV57tEvNfxZVVcOCAOih5PKr = v0tulllcd5a1akhbyzo.V57tEvNfxZVVcOCAOih5PKr();
        int iZzpBGItXfub0yWj = v0tulllcd5a1akhbyzo.zzpBGItXfub0yWj(view);
        int iVxUQ9tBhpHJ2AAEDNW8sghc4m = v0tulllcd5a1akhbyzo.VxUQ9tBhpHJ2AAEDNW8sghc4m(view);
        ojNhSQff2yOfzldut.zzpBGItXfub0yWj = iZfQNn8hdWlEQ5cR94249PDsLR;
        ojNhSQff2yOfzldut.V57tEvNfxZVVcOCAOih5PKr = iV57tEvNfxZVVcOCAOih5PKr;
        ojNhSQff2yOfzldut.ZfQNn8hdWlEQ5cR94249PDsLR = iZzpBGItXfub0yWj;
        ojNhSQff2yOfzldut.LaeGQIruHQu81hfJldjMOQSVblH3x = iVxUQ9tBhpHJ2AAEDNW8sghc4m;
        ojNhSQff2yOfzldut.VxUQ9tBhpHJ2AAEDNW8sghc4m = 24579;
        return ojNhSQff2yOfzldut.VxUQ9tBhpHJ2AAEDNW8sghc4m();
    }

    public void zIvmSL0wzmmKGc3X39b2Gw2mUGE(boolean z) {
        dip85SLOWSmNG3 dip85slowsmng3 = ((okcUO69vEcgndIAn0R) this.V57tEvNfxZVVcOCAOih5PKr).TaDO7ogis3aEiWEtq;
        if (dip85slowsmng3 != null) {
            dip85slowsmng3.M9e7PWhFYLD2lOGMker().KUYypEB4eNWOZWVDpH.zIvmSL0wzmmKGc3X39b2Gw2mUGE(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.zzpBGItXfub0yWj).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void zzpBGItXfub0yWj(boolean z) {
        dip85SLOWSmNG3 dip85slowsmng3 = ((okcUO69vEcgndIAn0R) this.V57tEvNfxZVVcOCAOih5PKr).TaDO7ogis3aEiWEtq;
        if (dip85slowsmng3 != null) {
            dip85slowsmng3.M9e7PWhFYLD2lOGMker().KUYypEB4eNWOZWVDpH.zzpBGItXfub0yWj(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.zzpBGItXfub0yWj).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public /* synthetic */ o0x3OWMw3He(int i, Object obj, Object obj2) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        this.zzpBGItXfub0yWj = obj;
        this.V57tEvNfxZVVcOCAOih5PKr = obj2;
    }

    public o0x3OWMw3He(WorkDatabase workDatabase) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 0;
        this.zzpBGItXfub0yWj = workDatabase;
        this.V57tEvNfxZVVcOCAOih5PKr = new xR0ZoYA1SdIBIre5oWm06m(workDatabase);
    }

    public o0x3OWMw3He(EditText editText, int i) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        switch (i) {
            case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_FIELD_NUMBER /* 5 */:
                this.zzpBGItXfub0yWj = editText;
                idvZLuVtEHk6C2 idvzluvtehk6c2 = new idvZLuVtEHk6C2(editText);
                this.V57tEvNfxZVVcOCAOih5PKr = idvzluvtehk6c2;
                editText.addTextChangedListener(idvzluvtehk6c2);
                if (up1rBPptPljaaYk2FGLYyQ.zzpBGItXfub0yWj == null) {
                    synchronized (up1rBPptPljaaYk2FGLYyQ.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
                        try {
                            if (up1rBPptPljaaYk2FGLYyQ.zzpBGItXfub0yWj == null) {
                                up1rBPptPljaaYk2FGLYyQ up1rbpptpljaayk2fglyyq = new up1rBPptPljaaYk2FGLYyQ();
                                try {
                                    up1rBPptPljaaYk2FGLYyQ.V57tEvNfxZVVcOCAOih5PKr = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, up1rBPptPljaaYk2FGLYyQ.class.getClassLoader());
                                    break;
                                } catch (Throwable unused) {
                                }
                                up1rBPptPljaaYk2FGLYyQ.zzpBGItXfub0yWj = up1rbpptpljaayk2fglyyq;
                            }
                        } finally {
                        }
                        break;
                    }
                }
                editText.setEditableFactory(up1rBPptPljaaYk2FGLYyQ.zzpBGItXfub0yWj);
                return;
            default:
                this.zzpBGItXfub0yWj = editText;
                this.V57tEvNfxZVVcOCAOih5PKr = new Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(editText);
                return;
        }
    }

    public o0x3OWMw3He(okcUO69vEcgndIAn0R okcuo69vecgndian0r) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 6;
        this.zzpBGItXfub0yWj = new CopyOnWriteArrayList();
        this.V57tEvNfxZVVcOCAOih5PKr = okcuo69vecgndian0r;
    }

    public o0x3OWMw3He(Context context) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 3;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(ej6unYlOWMDF.wdI7vzA3Qmcwd(R.attr.materialCalendarStyle, context, ddDbMgQuo9affXXIMNMhQZaG3.class.getCanonicalName()).data, PGobtLpyfPC4TCnlq740.q1wNbhk2O6);
        IN79WcIk5xB4t0GjRT43qPLs5.NSjgqmGjEzuugn2SsG1mZFP(context, typedArrayObtainStyledAttributes.getResourceId(4, 0));
        IN79WcIk5xB4t0GjRT43qPLs5.NSjgqmGjEzuugn2SsG1mZFP(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        IN79WcIk5xB4t0GjRT43qPLs5.NSjgqmGjEzuugn2SsG1mZFP(context, typedArrayObtainStyledAttributes.getResourceId(3, 0));
        IN79WcIk5xB4t0GjRT43qPLs5.NSjgqmGjEzuugn2SsG1mZFP(context, typedArrayObtainStyledAttributes.getResourceId(5, 0));
        ColorStateList colorStateListVBGA6pPLqSMuYGvprl270j7 = F44whnLsbQ.vBGA6pPLqSMuYGvprl270j7(context, typedArrayObtainStyledAttributes, 7);
        this.zzpBGItXfub0yWj = IN79WcIk5xB4t0GjRT43qPLs5.NSjgqmGjEzuugn2SsG1mZFP(context, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        IN79WcIk5xB4t0GjRT43qPLs5.NSjgqmGjEzuugn2SsG1mZFP(context, typedArrayObtainStyledAttributes.getResourceId(8, 0));
        this.V57tEvNfxZVVcOCAOih5PKr = IN79WcIk5xB4t0GjRT43qPLs5.NSjgqmGjEzuugn2SsG1mZFP(context, typedArrayObtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(colorStateListVBGA6pPLqSMuYGvprl270j7.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }

    public o0x3OWMw3He(v0TUlllCd5A1AKhbyZO v0tulllcd5a1akhbyzo) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = 8;
        this.zzpBGItXfub0yWj = v0tulllcd5a1akhbyzo;
        OjNhSQff2yOfzldut ojNhSQff2yOfzldut = new OjNhSQff2yOfzldut();
        ojNhSQff2yOfzldut.VxUQ9tBhpHJ2AAEDNW8sghc4m = 0;
        this.V57tEvNfxZVVcOCAOih5PKr = ojNhSQff2yOfzldut;
    }
}
