package com.vdodsodjsdt;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class N1mT85AVNMY84KnH4 {
    public final LinkedHashMap VxUQ9tBhpHJ2AAEDNW8sghc4m;

    public N1mT85AVNMY84KnH4(int i) {
        switch (i) {
            case 1:
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new LinkedHashMap(0, 0.75f, true);
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new LinkedHashMap();
                break;
            case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new LinkedHashMap();
                break;
            default:
                this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new LinkedHashMap();
                break;
        }
    }

    public ztNFMw5IuWLfuP LaeGQIruHQu81hfJldjMOQSVblH3x(AhgUxI6t6E ahgUxI6t6E) {
        LinkedHashMap linkedHashMap = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        Object ztnfmw5iuwlfup = linkedHashMap.get(ahgUxI6t6E);
        if (ztnfmw5iuwlfup == null) {
            ztnfmw5iuwlfup = new ztNFMw5IuWLfuP(ahgUxI6t6E);
            linkedHashMap.put(ahgUxI6t6E, ztnfmw5iuwlfup);
        }
        return (ztNFMw5IuWLfuP) ztnfmw5iuwlfup;
    }

    public ztNFMw5IuWLfuP V57tEvNfxZVVcOCAOih5PKr(AhgUxI6t6E ahgUxI6t6E) {
        ej6unYlOWMDF.pYmKDYlAmhudp(ahgUxI6t6E, "id");
        return (ztNFMw5IuWLfuP) this.VxUQ9tBhpHJ2AAEDNW8sghc4m.remove(ahgUxI6t6E);
    }

    public void VxUQ9tBhpHJ2AAEDNW8sghc4m(SsiwtF6NFC0P... ssiwtF6NFC0PArr) {
        ej6unYlOWMDF.pYmKDYlAmhudp(ssiwtF6NFC0PArr, "migrations");
        for (SsiwtF6NFC0P ssiwtF6NFC0P : ssiwtF6NFC0PArr) {
            int i = ssiwtF6NFC0P.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            int i2 = ssiwtF6NFC0P.zzpBGItXfub0yWj;
            Integer numValueOf = Integer.valueOf(i);
            LinkedHashMap linkedHashMap = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            Object treeMap = linkedHashMap.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                linkedHashMap.put(numValueOf, treeMap);
            }
            TreeMap treeMap2 = (TreeMap) treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i2))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i2)) + " with " + ssiwtF6NFC0P);
            }
            treeMap2.put(Integer.valueOf(i2), ssiwtF6NFC0P);
        }
    }

    public List ZfQNn8hdWlEQ5cR94249PDsLR(String str) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "workSpecId");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(((AhgUxI6t6E) entry.getKey()).VxUQ9tBhpHJ2AAEDNW8sghc4m, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap2.remove((AhgUxI6t6E) it.next());
        }
        return gYXV3FZbh17i6ocMo1T.ByTQIhgl7ezGvHXEd(linkedHashMap.values());
    }

    public void zzpBGItXfub0yWj(HashMap map) {
        Object[] objArr;
        ej6unYlOWMDF.pYmKDYlAmhudp(map, "values");
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            ej6unYlOWMDF.pYmKDYlAmhudp(str, "key");
            if (value == null) {
                value = null;
            } else {
                i8O1bEx5KirDRJHaM i8o1bex5kirdrjhamVxUQ9tBhpHJ2AAEDNW8sghc4m = LbKUuf4Fs4.VxUQ9tBhpHJ2AAEDNW8sghc4m(value.getClass());
                if (i8o1bex5kirdrjhamVxUQ9tBhpHJ2AAEDNW8sghc4m.equals(LbKUuf4Fs4.VxUQ9tBhpHJ2AAEDNW8sghc4m(Boolean.TYPE)) ? true : i8o1bex5kirdrjhamVxUQ9tBhpHJ2AAEDNW8sghc4m.equals(LbKUuf4Fs4.VxUQ9tBhpHJ2AAEDNW8sghc4m(Byte.TYPE)) ? true : i8o1bex5kirdrjhamVxUQ9tBhpHJ2AAEDNW8sghc4m.equals(LbKUuf4Fs4.VxUQ9tBhpHJ2AAEDNW8sghc4m(Integer.TYPE)) ? true : i8o1bex5kirdrjhamVxUQ9tBhpHJ2AAEDNW8sghc4m.equals(LbKUuf4Fs4.VxUQ9tBhpHJ2AAEDNW8sghc4m(Long.TYPE)) ? true : i8o1bex5kirdrjhamVxUQ9tBhpHJ2AAEDNW8sghc4m.equals(LbKUuf4Fs4.VxUQ9tBhpHJ2AAEDNW8sghc4m(Float.TYPE)) ? true : i8o1bex5kirdrjhamVxUQ9tBhpHJ2AAEDNW8sghc4m.equals(LbKUuf4Fs4.VxUQ9tBhpHJ2AAEDNW8sghc4m(Double.TYPE)) ? true : i8o1bex5kirdrjhamVxUQ9tBhpHJ2AAEDNW8sghc4m.equals(LbKUuf4Fs4.VxUQ9tBhpHJ2AAEDNW8sghc4m(String.class)) ? true : i8o1bex5kirdrjhamVxUQ9tBhpHJ2AAEDNW8sghc4m.equals(LbKUuf4Fs4.VxUQ9tBhpHJ2AAEDNW8sghc4m(Boolean[].class)) ? true : i8o1bex5kirdrjhamVxUQ9tBhpHJ2AAEDNW8sghc4m.equals(LbKUuf4Fs4.VxUQ9tBhpHJ2AAEDNW8sghc4m(Byte[].class)) ? true : i8o1bex5kirdrjhamVxUQ9tBhpHJ2AAEDNW8sghc4m.equals(LbKUuf4Fs4.VxUQ9tBhpHJ2AAEDNW8sghc4m(Integer[].class)) ? true : i8o1bex5kirdrjhamVxUQ9tBhpHJ2AAEDNW8sghc4m.equals(LbKUuf4Fs4.VxUQ9tBhpHJ2AAEDNW8sghc4m(Long[].class)) ? true : i8o1bex5kirdrjhamVxUQ9tBhpHJ2AAEDNW8sghc4m.equals(LbKUuf4Fs4.VxUQ9tBhpHJ2AAEDNW8sghc4m(Float[].class)) ? true : i8o1bex5kirdrjhamVxUQ9tBhpHJ2AAEDNW8sghc4m.equals(LbKUuf4Fs4.VxUQ9tBhpHJ2AAEDNW8sghc4m(Double[].class)) ? true : i8o1bex5kirdrjhamVxUQ9tBhpHJ2AAEDNW8sghc4m.equals(LbKUuf4Fs4.VxUQ9tBhpHJ2AAEDNW8sghc4m(String[].class))) {
                    continue;
                } else {
                    int i = 0;
                    if (i8o1bex5kirdrjhamVxUQ9tBhpHJ2AAEDNW8sghc4m.equals(LbKUuf4Fs4.VxUQ9tBhpHJ2AAEDNW8sghc4m(boolean[].class))) {
                        boolean[] zArr = (boolean[]) value;
                        String str2 = aKozz2KH3TgtX7U19.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                        int length = zArr.length;
                        objArr = new Boolean[length];
                        while (i < length) {
                            objArr[i] = Boolean.valueOf(zArr[i]);
                            i++;
                        }
                    } else if (i8o1bex5kirdrjhamVxUQ9tBhpHJ2AAEDNW8sghc4m.equals(LbKUuf4Fs4.VxUQ9tBhpHJ2AAEDNW8sghc4m(byte[].class))) {
                        byte[] bArr = (byte[]) value;
                        String str3 = aKozz2KH3TgtX7U19.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                        int length2 = bArr.length;
                        objArr = new Byte[length2];
                        while (i < length2) {
                            objArr[i] = Byte.valueOf(bArr[i]);
                            i++;
                        }
                    } else if (i8o1bex5kirdrjhamVxUQ9tBhpHJ2AAEDNW8sghc4m.equals(LbKUuf4Fs4.VxUQ9tBhpHJ2AAEDNW8sghc4m(int[].class))) {
                        int[] iArr = (int[]) value;
                        String str4 = aKozz2KH3TgtX7U19.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                        int length3 = iArr.length;
                        objArr = new Integer[length3];
                        while (i < length3) {
                            objArr[i] = Integer.valueOf(iArr[i]);
                            i++;
                        }
                    } else if (i8o1bex5kirdrjhamVxUQ9tBhpHJ2AAEDNW8sghc4m.equals(LbKUuf4Fs4.VxUQ9tBhpHJ2AAEDNW8sghc4m(long[].class))) {
                        long[] jArr = (long[]) value;
                        String str5 = aKozz2KH3TgtX7U19.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                        int length4 = jArr.length;
                        objArr = new Long[length4];
                        while (i < length4) {
                            objArr[i] = Long.valueOf(jArr[i]);
                            i++;
                        }
                    } else if (i8o1bex5kirdrjhamVxUQ9tBhpHJ2AAEDNW8sghc4m.equals(LbKUuf4Fs4.VxUQ9tBhpHJ2AAEDNW8sghc4m(float[].class))) {
                        float[] fArr = (float[]) value;
                        String str6 = aKozz2KH3TgtX7U19.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                        int length5 = fArr.length;
                        objArr = new Float[length5];
                        while (i < length5) {
                            objArr[i] = Float.valueOf(fArr[i]);
                            i++;
                        }
                    } else {
                        if (!i8o1bex5kirdrjhamVxUQ9tBhpHJ2AAEDNW8sghc4m.equals(LbKUuf4Fs4.VxUQ9tBhpHJ2AAEDNW8sghc4m(double[].class))) {
                            throw new IllegalArgumentException("Key " + str + " has invalid type " + i8o1bex5kirdrjhamVxUQ9tBhpHJ2AAEDNW8sghc4m);
                        }
                        double[] dArr = (double[]) value;
                        String str7 = aKozz2KH3TgtX7U19.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                        int length6 = dArr.length;
                        objArr = new Double[length6];
                        while (i < length6) {
                            objArr[i] = Double.valueOf(dArr[i]);
                            i++;
                        }
                    }
                    value = objArr;
                }
            }
            this.VxUQ9tBhpHJ2AAEDNW8sghc4m.put(str, value);
        }
    }
}
