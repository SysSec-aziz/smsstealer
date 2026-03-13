package com.vdodsodjsdt;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class gDY2Y75we8ufAoe {
    public final HashMap VxUQ9tBhpHJ2AAEDNW8sghc4m = new HashMap();
    public final HashMap zzpBGItXfub0yWj;

    public gDY2Y75we8ufAoe(HashMap map) {
        this.zzpBGItXfub0yWj = map;
        for (Map.Entry entry : map.entrySet()) {
            XOTOHmUA5NYhlyOBh7 xOTOHmUA5NYhlyOBh7 = (XOTOHmUA5NYhlyOBh7) entry.getValue();
            List arrayList = (List) this.VxUQ9tBhpHJ2AAEDNW8sghc4m.get(xOTOHmUA5NYhlyOBh7);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m.put(xOTOHmUA5NYhlyOBh7, arrayList);
            }
            arrayList.add((EUA9XibSHCTfMcY6HvaoZW) entry.getKey());
        }
    }

    public static void VxUQ9tBhpHJ2AAEDNW8sghc4m(List list, hCgEybj69le8 hcgeybj69le8, XOTOHmUA5NYhlyOBh7 xOTOHmUA5NYhlyOBh7, PK8UD0RGb9ZPE5j3wginWdYYxEI pK8UD0RGb9ZPE5j3wginWdYYxEI) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                EUA9XibSHCTfMcY6HvaoZW eUA9XibSHCTfMcY6HvaoZW = (EUA9XibSHCTfMcY6HvaoZW) list.get(size);
                Method method = eUA9XibSHCTfMcY6HvaoZW.zzpBGItXfub0yWj;
                try {
                    int i = eUA9XibSHCTfMcY6HvaoZW.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                    if (i == 0) {
                        method.invoke(pK8UD0RGb9ZPE5j3wginWdYYxEI, null);
                    } else if (i == 1) {
                        method.invoke(pK8UD0RGb9ZPE5j3wginWdYYxEI, hcgeybj69le8);
                    } else if (i == 2) {
                        method.invoke(pK8UD0RGb9ZPE5j3wginWdYYxEI, hcgeybj69le8, xOTOHmUA5NYhlyOBh7);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
