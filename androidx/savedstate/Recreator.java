package androidx.savedstate;

import android.os.Bundle;
import com.vdodsodjsdt.ALnH3AptNOGA7UbXGxOl2SnVeZ;
import com.vdodsodjsdt.F44whnLsbQ;
import com.vdodsodjsdt.W3ZqXaAE9m3wS;
import com.vdodsodjsdt.XL61XSHqyMdc1;
import com.vdodsodjsdt.XOTOHmUA5NYhlyOBh7;
import com.vdodsodjsdt.c6HqQbG2usib;
import com.vdodsodjsdt.cx2YoQOPZxuB1B0n1aU3M;
import com.vdodsodjsdt.ej6unYlOWMDF;
import com.vdodsodjsdt.hCgEybj69le8;
import com.vdodsodjsdt.l6xJVUTn99ZWyAVk;
import com.vdodsodjsdt.oC7AmLfFTmaVQ;
import com.vdodsodjsdt.u9SlVAuoWhQUfJ;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class Recreator implements W3ZqXaAE9m3wS {
    public final c6HqQbG2usib V57tEvNfxZVVcOCAOih5PKr;

    public Recreator(c6HqQbG2usib c6hqqbg2usib) {
        this.V57tEvNfxZVVcOCAOih5PKr = c6hqqbg2usib;
    }

    @Override // com.vdodsodjsdt.W3ZqXaAE9m3wS
    public final void zzpBGItXfub0yWj(hCgEybj69le8 hcgeybj69le8, XOTOHmUA5NYhlyOBh7 xOTOHmUA5NYhlyOBh7) {
        if (xOTOHmUA5NYhlyOBh7 != XOTOHmUA5NYhlyOBh7.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        hcgeybj69le8.LaeGQIruHQu81hfJldjMOQSVblH3x().zIvmSL0wzmmKGc3X39b2Gw2mUGE(this);
        c6HqQbG2usib c6hqqbg2usib = this.V57tEvNfxZVVcOCAOih5PKr;
        Bundle bundleV57tEvNfxZVVcOCAOih5PKr = c6hqqbg2usib.VxUQ9tBhpHJ2AAEDNW8sghc4m().V57tEvNfxZVVcOCAOih5PKr("androidx.savedstate.Restarter");
        if (bundleV57tEvNfxZVVcOCAOih5PKr == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleV57tEvNfxZVVcOCAOih5PKr.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        int size = stringArrayList.size();
        int i = 0;
        while (i < size) {
            String str = stringArrayList.get(i);
            i++;
            String str2 = str;
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str2, false, Recreator.class.getClassLoader()).asSubclass(oC7AmLfFTmaVQ.class);
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(null);
                        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(objNewInstance, "{\n                constr…wInstance()\n            }");
                        if (!(c6hqqbg2usib instanceof XL61XSHqyMdc1)) {
                            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                        }
                        cx2YoQOPZxuB1B0n1aU3M cx2yoqopzxub1b0n1au3mZfQNn8hdWlEQ5cR94249PDsLR = ((XL61XSHqyMdc1) c6hqqbg2usib).ZfQNn8hdWlEQ5cR94249PDsLR();
                        ALnH3AptNOGA7UbXGxOl2SnVeZ aLnH3AptNOGA7UbXGxOl2SnVeZVxUQ9tBhpHJ2AAEDNW8sghc4m = c6hqqbg2usib.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                        cx2yoqopzxub1b0n1au3mZfQNn8hdWlEQ5cR94249PDsLR.getClass();
                        LinkedHashMap linkedHashMap = cx2yoqopzxub1b0n1au3mZfQNn8hdWlEQ5cR94249PDsLR.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                        for (String str3 : new HashSet(linkedHashMap.keySet())) {
                            ej6unYlOWMDF.pYmKDYlAmhudp(str3, "key");
                            l6xJVUTn99ZWyAVk l6xjvutn99zwyavk = (l6xJVUTn99ZWyAVk) linkedHashMap.get(str3);
                            ej6unYlOWMDF.p59rPv72J9(l6xjvutn99zwyavk);
                            F44whnLsbQ.zzpBGItXfub0yWj(l6xjvutn99zwyavk, aLnH3AptNOGA7UbXGxOl2SnVeZVxUQ9tBhpHJ2AAEDNW8sghc4m, c6hqqbg2usib.LaeGQIruHQu81hfJldjMOQSVblH3x());
                        }
                        if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                            aLnH3AptNOGA7UbXGxOl2SnVeZVxUQ9tBhpHJ2AAEDNW8sghc4m.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
                        }
                    } catch (Exception e) {
                        throw new RuntimeException("Failed to instantiate " + str2, e);
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException(u9SlVAuoWhQUfJ.M9e7PWhFYLD2lOGMker("Class ", str2, " wasn't found"), e3);
            }
        }
    }
}
