package com.vdodsodjsdt;

import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class DVUnsAEpZJal32FfIqcAC1su9 extends eAZzwKf05brkM {
    public static final X7zTQZBHMFNtMxCWE8ubCFi ZfQNn8hdWlEQ5cR94249PDsLR = new X7zTQZBHMFNtMxCWE8ubCFi();
    public final HashMap VxUQ9tBhpHJ2AAEDNW8sghc4m = new HashMap();
    public final HashMap zzpBGItXfub0yWj = new HashMap();
    public final HashMap V57tEvNfxZVVcOCAOih5PKr = new HashMap();

    public DVUnsAEpZJal32FfIqcAC1su9(Class cls) {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i] = field;
                    i++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r4 = (Enum) field2.get(null);
                String strName = r4.name();
                String string = r4.toString();
                gONlSwuqWpO gonlswuqwpo = (gONlSwuqWpO) field2.getAnnotation(gONlSwuqWpO.class);
                if (gonlswuqwpo != null) {
                    strName = gonlswuqwpo.value();
                    for (String str : gonlswuqwpo.alternate()) {
                        this.VxUQ9tBhpHJ2AAEDNW8sghc4m.put(str, r4);
                    }
                }
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m.put(strName, r4);
                this.zzpBGItXfub0yWj.put(string, r4);
                this.V57tEvNfxZVVcOCAOih5PKr.put(r4, strName);
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.vdodsodjsdt.eAZzwKf05brkM
    public final void V57tEvNfxZVVcOCAOih5PKr(tVkLQdIevlOoRF1qYmTyvenTzI tvklqdievloorf1qymtyventzi, Object obj) throws IOException {
        Enum r3 = (Enum) obj;
        tvklqdievloorf1qymtyventzi.TqcnImqkSWIKht(r3 == null ? null : (String) this.V57tEvNfxZVVcOCAOih5PKr.get(r3));
    }

    @Override // com.vdodsodjsdt.eAZzwKf05brkM
    public final Object zzpBGItXfub0yWj(Gzdlhdn1ss gzdlhdn1ss) throws IOException {
        if (gzdlhdn1ss.wRCD0SdqWCowdYU7bmzN() == 9) {
            gzdlhdn1ss.d9zDyyznnp3oaDT1Ug();
            return null;
        }
        String strYmT6yQrus3w = gzdlhdn1ss.ymT6yQrus3w();
        Enum r0 = (Enum) this.VxUQ9tBhpHJ2AAEDNW8sghc4m.get(strYmT6yQrus3w);
        return r0 == null ? (Enum) this.zzpBGItXfub0yWj.get(strYmT6yQrus3w) : r0;
    }
}
