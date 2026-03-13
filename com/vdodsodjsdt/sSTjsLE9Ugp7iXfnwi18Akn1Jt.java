package com.vdodsodjsdt;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class sSTjsLE9Ugp7iXfnwi18Akn1Jt {
    public int LaeGQIruHQu81hfJldjMOQSVblH3x;
    public int[] V57tEvNfxZVVcOCAOih5PKr;
    public Object[] ZfQNn8hdWlEQ5cR94249PDsLR;

    public sSTjsLE9Ugp7iXfnwi18Akn1Jt(int i) {
        this.V57tEvNfxZVVcOCAOih5PKr = i == 0 ? ej6unYlOWMDF.ZfQNn8hdWlEQ5cR94249PDsLR : new int[i];
        this.ZfQNn8hdWlEQ5cR94249PDsLR = i == 0 ? ej6unYlOWMDF.LaeGQIruHQu81hfJldjMOQSVblH3x : new Object[i << 1];
    }

    public final Object GI83zq0G8e7zkn(int i) {
        if (i < 0 || i >= this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new IllegalArgumentException(u9SlVAuoWhQUfJ.NSjgqmGjEzuugn2SsG1mZFP("Expected index to be within 0..size()-1, but was ", i).toString());
        }
        return this.ZfQNn8hdWlEQ5cR94249PDsLR[(i << 1) + 1];
    }

    public final int LaeGQIruHQu81hfJldjMOQSVblH3x() {
        int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i == 0) {
            return -1;
        }
        int iM9e7PWhFYLD2lOGMker = ej6unYlOWMDF.M9e7PWhFYLD2lOGMker(i, 0, this.V57tEvNfxZVVcOCAOih5PKr);
        if (iM9e7PWhFYLD2lOGMker < 0 || this.ZfQNn8hdWlEQ5cR94249PDsLR[iM9e7PWhFYLD2lOGMker << 1] == null) {
            return iM9e7PWhFYLD2lOGMker;
        }
        int i2 = iM9e7PWhFYLD2lOGMker + 1;
        while (i2 < i && this.V57tEvNfxZVVcOCAOih5PKr[i2] == 0) {
            if (this.ZfQNn8hdWlEQ5cR94249PDsLR[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM9e7PWhFYLD2lOGMker - 1; i3 >= 0 && this.V57tEvNfxZVVcOCAOih5PKr[i3] == 0; i3--) {
            if (this.ZfQNn8hdWlEQ5cR94249PDsLR[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final Object NSjgqmGjEzuugn2SsG1mZFP(int i, Object obj) {
        if (i < 0 || i >= this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new IllegalArgumentException(u9SlVAuoWhQUfJ.NSjgqmGjEzuugn2SsG1mZFP("Expected index to be within 0..size()-1, but was ", i).toString());
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final int V57tEvNfxZVVcOCAOih5PKr(int i, Object obj) {
        int i2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i2 == 0) {
            return -1;
        }
        int iM9e7PWhFYLD2lOGMker = ej6unYlOWMDF.M9e7PWhFYLD2lOGMker(i2, i, this.V57tEvNfxZVVcOCAOih5PKr);
        if (iM9e7PWhFYLD2lOGMker < 0 || ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(obj, this.ZfQNn8hdWlEQ5cR94249PDsLR[iM9e7PWhFYLD2lOGMker << 1])) {
            return iM9e7PWhFYLD2lOGMker;
        }
        int i3 = iM9e7PWhFYLD2lOGMker + 1;
        while (i3 < i2 && this.V57tEvNfxZVVcOCAOih5PKr[i3] == i) {
            if (ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(obj, this.ZfQNn8hdWlEQ5cR94249PDsLR[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM9e7PWhFYLD2lOGMker - 1; i4 >= 0 && this.V57tEvNfxZVVcOCAOih5PKr[i4] == i; i4--) {
            if (ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(obj, this.ZfQNn8hdWlEQ5cR94249PDsLR[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m(Object obj) {
        int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x * 2;
        Object[] objArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final Object ZLZeBXTMq0zDztBxtRTuCHrapQ(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x)) {
            throw new IllegalArgumentException(u9SlVAuoWhQUfJ.NSjgqmGjEzuugn2SsG1mZFP("Expected index to be within 0..size()-1, but was ", i).toString());
        }
        Object[] objArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.V57tEvNfxZVVcOCAOih5PKr;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                vmp19D2MODlOL.HAPpjhiCsV9ONY23505HCBI9IX(i, i5, i2, iArr, iArr);
                Object[] objArr2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr2, objArr2, i3, i5 << 1, i2 << 1);
            }
            Object[] objArr3 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i7);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(iArrCopyOf, "copyOf(this, newSize)");
            this.V57tEvNfxZVVcOCAOih5PKr = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.ZfQNn8hdWlEQ5cR94249PDsLR, i7 << 1);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(objArrCopyOf, "copyOf(this, newSize)");
            this.ZfQNn8hdWlEQ5cR94249PDsLR = objArrCopyOf;
            if (i2 != this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                vmp19D2MODlOL.HAPpjhiCsV9ONY23505HCBI9IX(0, 0, i, iArr, this.V57tEvNfxZVVcOCAOih5PKr);
                vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr, this.ZfQNn8hdWlEQ5cR94249PDsLR, 0, 0, i3);
            }
            if (i < i4) {
                int i8 = i + 1;
                vmp19D2MODlOL.HAPpjhiCsV9ONY23505HCBI9IX(i, i8, i2, iArr, this.V57tEvNfxZVVcOCAOih5PKr);
                vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr, this.ZfQNn8hdWlEQ5cR94249PDsLR, i3, i8 << 1, i2 << 1);
            }
        }
        if (i2 != this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new ConcurrentModificationException();
        }
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = i4;
        return obj;
    }

    public final int ZfQNn8hdWlEQ5cR94249PDsLR(Object obj) {
        return obj == null ? LaeGQIruHQu81hfJldjMOQSVblH3x() : V57tEvNfxZVVcOCAOih5PKr(obj.hashCode(), obj);
    }

    public final void clear() {
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x > 0) {
            this.V57tEvNfxZVVcOCAOih5PKr = ej6unYlOWMDF.ZfQNn8hdWlEQ5cR94249PDsLR;
            this.ZfQNn8hdWlEQ5cR94249PDsLR = ej6unYlOWMDF.LaeGQIruHQu81hfJldjMOQSVblH3x;
            this.LaeGQIruHQu81hfJldjMOQSVblH3x = 0;
        }
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return ZfQNn8hdWlEQ5cR94249PDsLR(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return VxUQ9tBhpHJ2AAEDNW8sghc4m(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof sSTjsLE9Ugp7iXfnwi18Akn1Jt) {
                int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
                if (i != ((sSTjsLE9Ugp7iXfnwi18Akn1Jt) obj).LaeGQIruHQu81hfJldjMOQSVblH3x) {
                    return false;
                }
                sSTjsLE9Ugp7iXfnwi18Akn1Jt sstjsle9ugp7ixfnwi18akn1jt = (sSTjsLE9Ugp7iXfnwi18Akn1Jt) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object objZIvmSL0wzmmKGc3X39b2Gw2mUGE = zIvmSL0wzmmKGc3X39b2Gw2mUGE(i2);
                    Object objGI83zq0G8e7zkn = GI83zq0G8e7zkn(i2);
                    Object obj2 = sstjsle9ugp7ixfnwi18akn1jt.get(objZIvmSL0wzmmKGc3X39b2Gw2mUGE);
                    if (objGI83zq0G8e7zkn == null) {
                        if (obj2 != null || !sstjsle9ugp7ixfnwi18akn1jt.containsKey(objZIvmSL0wzmmKGc3X39b2Gw2mUGE)) {
                            return false;
                        }
                    } else if (!objGI83zq0G8e7zkn.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.LaeGQIruHQu81hfJldjMOQSVblH3x != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objZIvmSL0wzmmKGc3X39b2Gw2mUGE2 = zIvmSL0wzmmKGc3X39b2Gw2mUGE(i4);
                Object objGI83zq0G8e7zkn2 = GI83zq0G8e7zkn(i4);
                Object obj3 = ((Map) obj).get(objZIvmSL0wzmmKGc3X39b2Gw2mUGE2);
                if (objGI83zq0G8e7zkn2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objZIvmSL0wzmmKGc3X39b2Gw2mUGE2)) {
                        return false;
                    }
                } else if (!objGI83zq0G8e7zkn2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object get(Object obj) {
        int iZfQNn8hdWlEQ5cR94249PDsLR = ZfQNn8hdWlEQ5cR94249PDsLR(obj);
        if (iZfQNn8hdWlEQ5cR94249PDsLR >= 0) {
            return this.ZfQNn8hdWlEQ5cR94249PDsLR[(iZfQNn8hdWlEQ5cR94249PDsLR << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iZfQNn8hdWlEQ5cR94249PDsLR = ZfQNn8hdWlEQ5cR94249PDsLR(obj);
        return iZfQNn8hdWlEQ5cR94249PDsLR >= 0 ? this.ZfQNn8hdWlEQ5cR94249PDsLR[(iZfQNn8hdWlEQ5cR94249PDsLR << 1) + 1] : obj2;
    }

    public final int hashCode() {
        int[] iArr = this.V57tEvNfxZVVcOCAOih5PKr;
        Object[] objArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    public final boolean isEmpty() {
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iV57tEvNfxZVVcOCAOih5PKr = obj != null ? V57tEvNfxZVVcOCAOih5PKr(iHashCode, obj) : LaeGQIruHQu81hfJldjMOQSVblH3x();
        if (iV57tEvNfxZVVcOCAOih5PKr >= 0) {
            int i2 = (iV57tEvNfxZVVcOCAOih5PKr << 1) + 1;
            Object[] objArr = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iV57tEvNfxZVVcOCAOih5PKr;
        int[] iArr = this.V57tEvNfxZVVcOCAOih5PKr;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i4);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(iArrCopyOf, "copyOf(this, newSize)");
            this.V57tEvNfxZVVcOCAOih5PKr = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.ZfQNn8hdWlEQ5cR94249PDsLR, i4 << 1);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(objArrCopyOf, "copyOf(this, newSize)");
            this.ZfQNn8hdWlEQ5cR94249PDsLR = objArrCopyOf;
            if (i != this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.V57tEvNfxZVVcOCAOih5PKr;
            int i5 = i3 + 1;
            vmp19D2MODlOL.HAPpjhiCsV9ONY23505HCBI9IX(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
            vmp19D2MODlOL.ByTQIhgl7ezGvHXEd(objArr2, objArr2, i5 << 1, i3 << 1, this.LaeGQIruHQu81hfJldjMOQSVblH3x << 1);
        }
        int i6 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        if (i == i6) {
            int[] iArr3 = this.V57tEvNfxZVVcOCAOih5PKr;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.LaeGQIruHQu81hfJldjMOQSVblH3x = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iZfQNn8hdWlEQ5cR94249PDsLR = ZfQNn8hdWlEQ5cR94249PDsLR(obj);
        if (iZfQNn8hdWlEQ5cR94249PDsLR >= 0) {
            return ZLZeBXTMq0zDztBxtRTuCHrapQ(iZfQNn8hdWlEQ5cR94249PDsLR);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iZfQNn8hdWlEQ5cR94249PDsLR = ZfQNn8hdWlEQ5cR94249PDsLR(obj);
        if (iZfQNn8hdWlEQ5cR94249PDsLR >= 0) {
            return NSjgqmGjEzuugn2SsG1mZFP(iZfQNn8hdWlEQ5cR94249PDsLR, obj2);
        }
        return null;
    }

    public final int size() {
        return this.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.LaeGQIruHQu81hfJldjMOQSVblH3x * 28);
        sb.append('{');
        int i = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objZIvmSL0wzmmKGc3X39b2Gw2mUGE = zIvmSL0wzmmKGc3X39b2Gw2mUGE(i2);
            if (objZIvmSL0wzmmKGc3X39b2Gw2mUGE != sb) {
                sb.append(objZIvmSL0wzmmKGc3X39b2Gw2mUGE);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objGI83zq0G8e7zkn = GI83zq0G8e7zkn(i2);
            if (objGI83zq0G8e7zkn != sb) {
                sb.append(objGI83zq0G8e7zkn);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public final Object zIvmSL0wzmmKGc3X39b2Gw2mUGE(int i) {
        if (i < 0 || i >= this.LaeGQIruHQu81hfJldjMOQSVblH3x) {
            throw new IllegalArgumentException(u9SlVAuoWhQUfJ.NSjgqmGjEzuugn2SsG1mZFP("Expected index to be within 0..size()-1, but was ", i).toString());
        }
        return this.ZfQNn8hdWlEQ5cR94249PDsLR[i << 1];
    }

    public final void zzpBGItXfub0yWj(int i) {
        int i2 = this.LaeGQIruHQu81hfJldjMOQSVblH3x;
        int[] iArr = this.V57tEvNfxZVVcOCAOih5PKr;
        if (iArr.length < i) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(iArrCopyOf, "copyOf(this, newSize)");
            this.V57tEvNfxZVVcOCAOih5PKr = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.ZfQNn8hdWlEQ5cR94249PDsLR, i * 2);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(objArrCopyOf, "copyOf(this, newSize)");
            this.ZfQNn8hdWlEQ5cR94249PDsLR = objArrCopyOf;
        }
        if (this.LaeGQIruHQu81hfJldjMOQSVblH3x != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean remove(Object obj, Object obj2) {
        int iZfQNn8hdWlEQ5cR94249PDsLR = ZfQNn8hdWlEQ5cR94249PDsLR(obj);
        if (iZfQNn8hdWlEQ5cR94249PDsLR < 0 || !ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(obj2, GI83zq0G8e7zkn(iZfQNn8hdWlEQ5cR94249PDsLR))) {
            return false;
        }
        ZLZeBXTMq0zDztBxtRTuCHrapQ(iZfQNn8hdWlEQ5cR94249PDsLR);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iZfQNn8hdWlEQ5cR94249PDsLR = ZfQNn8hdWlEQ5cR94249PDsLR(obj);
        if (iZfQNn8hdWlEQ5cR94249PDsLR < 0 || !ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(obj2, GI83zq0G8e7zkn(iZfQNn8hdWlEQ5cR94249PDsLR))) {
            return false;
        }
        NSjgqmGjEzuugn2SsG1mZFP(iZfQNn8hdWlEQ5cR94249PDsLR, obj3);
        return true;
    }
}
