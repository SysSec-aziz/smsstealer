package com.vdodsodjsdt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vmp19D2MODlOL extends ej6unYlOWMDF {
    public static Object[] AFOcXGdvoTMuqwiG8tD(Object[] objArr, int i, int i2) {
        ej6unYlOWMDF.pYmKDYlAmhudp(objArr, "<this>");
        ej6unYlOWMDF.f6ZQsR6bPLvvCDNXOUc(i2, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i2);
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static void BDoqAMf0rlMRAnVghjC4qjG(Object[] objArr, Object obj, int i, int i2) {
        ej6unYlOWMDF.pYmKDYlAmhudp(objArr, "<this>");
        Arrays.fill(objArr, i, i2, obj);
    }

    public static void ByTQIhgl7ezGvHXEd(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        ej6unYlOWMDF.pYmKDYlAmhudp(objArr, "<this>");
        ej6unYlOWMDF.pYmKDYlAmhudp(objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static void HAPpjhiCsV9ONY23505HCBI9IX(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        ej6unYlOWMDF.pYmKDYlAmhudp(iArr, "<this>");
        ej6unYlOWMDF.pYmKDYlAmhudp(iArr2, "destination");
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static ArrayList VOvSEdhaZyc0oOGQ8(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static byte[] e1gEV3X9xwmHj(byte[] bArr, int i, int i2) {
        ej6unYlOWMDF.pYmKDYlAmhudp(bArr, "<this>");
        ej6unYlOWMDF.f6ZQsR6bPLvvCDNXOUc(i2, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static Object h2b7InwIaORKN91X7whfQh4(Object[] objArr, int i) {
        ej6unYlOWMDF.pYmKDYlAmhudp(objArr, "<this>");
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static boolean p6bBrs4p3Ly(Object[] objArr, Object obj) {
        int i;
        if (obj == null) {
            int length = objArr.length;
            i = 0;
            while (i < length) {
                if (objArr[i] == null) {
                    break;
                }
                i++;
            }
            i = -1;
        } else {
            int length2 = objArr.length;
            for (int i2 = 0; i2 < length2; i2++) {
                if (obj.equals(objArr[i2])) {
                    i = i2;
                    break;
                }
            }
            i = -1;
        }
        return i >= 0;
    }

    public static char r0dB0ojIy6g8mnk1(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static List rE05n5RsRkyWKIeA9cmLXAKv4Hze(Object[] objArr) {
        ej6unYlOWMDF.pYmKDYlAmhudp(objArr, "<this>");
        List listAsList = Arrays.asList(objArr);
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(listAsList, "asList(...)");
        return listAsList;
    }

    public static /* synthetic */ void tpEo0fy9FaoJYrSFHRfIK6(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = objArr.length;
        }
        ByTQIhgl7ezGvHXEd(objArr, objArr2, 0, i, i2);
    }

    public static boolean ubNpdCC1pl7L(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr.length == objArr2.length) {
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                Object obj2 = objArr2[i];
                if (obj != obj2) {
                    if (obj != null && obj2 != null) {
                        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                            if (!ubNpdCC1pl7L((Object[]) obj, (Object[]) obj2)) {
                            }
                        } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                            if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            }
                        } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                            if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            }
                        } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                            if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            }
                        } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                            if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            }
                        } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                            if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            }
                        } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                            if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            }
                        } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                            if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            }
                        } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                            if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            }
                        } else if (!obj.equals(obj2)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static void wR7sbzHKf9hYV1lxoS6nqyszepWvN(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        ej6unYlOWMDF.pYmKDYlAmhudp(bArr, "<this>");
        ej6unYlOWMDF.pYmKDYlAmhudp(bArr2, "destination");
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }
}
