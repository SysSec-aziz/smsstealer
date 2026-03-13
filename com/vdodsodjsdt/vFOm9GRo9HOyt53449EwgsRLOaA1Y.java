package com.vdodsodjsdt;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vFOm9GRo9HOyt53449EwgsRLOaA1Y {
    public static final sGipz63rTUmSj3uFDvOtzihao VxUQ9tBhpHJ2AAEDNW8sghc4m;

    static {
        sGipz63rTUmSj3uFDvOtzihao bVbZAmUULTBoLvv8eII0;
        try {
            bVbZAmUULTBoLvv8eII0 = new aHSmfN78YYNLQV();
        } catch (ReflectiveOperationException unused) {
            bVbZAmUULTBoLvv8eII0 = new BVbZAmUULTBoLvv8eII0();
        }
        VxUQ9tBhpHJ2AAEDNW8sghc4m = bVbZAmUULTBoLvv8eII0;
    }

    public static String LaeGQIruHQu81hfJldjMOQSVblH3x(Exception exc) {
        if (!exc.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
            return "";
        }
        String message = exc.getMessage();
        return "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat((message == null || !message.contains("to module com.google.gson")) ? "reflection-inaccessible" : "reflection-inaccessible-to-module-gson");
    }

    public static String V57tEvNfxZVVcOCAOih5PKr(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    public static void VxUQ9tBhpHJ2AAEDNW8sghc4m(AccessibleObject accessibleObject, StringBuilder sb) {
        sb.append('(');
        Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(parameterTypes[i].getSimpleName());
        }
        sb.append(')');
    }

    public static String ZfQNn8hdWlEQ5cR94249PDsLR(AccessibleObject accessibleObject, boolean z) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + V57tEvNfxZVVcOCAOih5PKr((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb = new StringBuilder(method.getName());
            VxUQ9tBhpHJ2AAEDNW8sghc4m(method, sb);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + zzpBGItXfub0yWj((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (!z || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public static void zIvmSL0wzmmKGc3X39b2Gw2mUGE(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e) {
            StringBuilder sbKUYypEB4eNWOZWVDpH = u9SlVAuoWhQUfJ.KUYypEB4eNWOZWVDpH("Failed making ", ZfQNn8hdWlEQ5cR94249PDsLR(accessibleObject, false), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type.");
            sbKUYypEB4eNWOZWVDpH.append(LaeGQIruHQu81hfJldjMOQSVblH3x(e));
            throw new RKQxRZwHjgpy5pOG0vmNeEAGIjPIP(sbKUYypEB4eNWOZWVDpH.toString(), e);
        }
    }

    public static String zzpBGItXfub0yWj(Constructor constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        VxUQ9tBhpHJ2AAEDNW8sghc4m(constructor, sb);
        return sb.toString();
    }
}
