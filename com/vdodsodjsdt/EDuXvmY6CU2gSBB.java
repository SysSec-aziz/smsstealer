package com.vdodsodjsdt;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class EDuXvmY6CU2gSBB extends hKY45oVk0UzhW2UdRV {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, EDuXvmY6CU2gSBB> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected sE56ypyAr5rUSL24j5APySHkB9r8y unknownFields;

    public EDuXvmY6CU2gSBB() {
        this.memoizedHashCode = UNINITIALIZED_HASH_CODE;
        this.memoizedSerializedSize = -1;
        this.unknownFields = sE56ypyAr5rUSL24j5APySHkB9r8y.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    }

    public static Object LaeGQIruHQu81hfJldjMOQSVblH3x(Method method, EDuXvmY6CU2gSBB eDuXvmY6CU2gSBB, Object... objArr) {
        try {
            return method.invoke(eDuXvmY6CU2gSBB, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static void M9e7PWhFYLD2lOGMker(Class cls, EDuXvmY6CU2gSBB eDuXvmY6CU2gSBB) {
        eDuXvmY6CU2gSBB.NSjgqmGjEzuugn2SsG1mZFP();
        defaultInstanceMap.put(cls, eDuXvmY6CU2gSBB);
    }

    public static EDuXvmY6CU2gSBB ZfQNn8hdWlEQ5cR94249PDsLR(Class cls) {
        EDuXvmY6CU2gSBB eDuXvmY6CU2gSBB = defaultInstanceMap.get(cls);
        if (eDuXvmY6CU2gSBB == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                eDuXvmY6CU2gSBB = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (eDuXvmY6CU2gSBB != null) {
            return eDuXvmY6CU2gSBB;
        }
        EDuXvmY6CU2gSBB eDuXvmY6CU2gSBB2 = (EDuXvmY6CU2gSBB) ((EDuXvmY6CU2gSBB) VFd9YrZLozMNzEwgrLgkRG.ZfQNn8hdWlEQ5cR94249PDsLR(cls)).V57tEvNfxZVVcOCAOih5PKr(6);
        if (eDuXvmY6CU2gSBB2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, eDuXvmY6CU2gSBB2);
        return eDuXvmY6CU2gSBB2;
    }

    public static final boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE(EDuXvmY6CU2gSBB eDuXvmY6CU2gSBB, boolean z) {
        byte bByteValue = ((Byte) eDuXvmY6CU2gSBB.V57tEvNfxZVVcOCAOih5PKr(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        fsiIibR9odqEwhUwtyl8oM fsiiibr9odqewhuwtyl8om = fsiIibR9odqEwhUwtyl8oM.V57tEvNfxZVVcOCAOih5PKr;
        fsiiibr9odqewhuwtyl8om.getClass();
        boolean zNSjgqmGjEzuugn2SsG1mZFP = fsiiibr9odqewhuwtyl8om.VxUQ9tBhpHJ2AAEDNW8sghc4m(eDuXvmY6CU2gSBB.getClass()).NSjgqmGjEzuugn2SsG1mZFP(eDuXvmY6CU2gSBB);
        if (z) {
            eDuXvmY6CU2gSBB.V57tEvNfxZVVcOCAOih5PKr(2);
        }
        return zNSjgqmGjEzuugn2SsG1mZFP;
    }

    public final EDuXvmY6CU2gSBB GI83zq0G8e7zkn() {
        return (EDuXvmY6CU2gSBB) V57tEvNfxZVVcOCAOih5PKr(4);
    }

    public final void HzCpKshMOoaw76hFcbOVRYMeRd(int i) {
        if (i < 0) {
            throw new IllegalStateException(u9SlVAuoWhQUfJ.NSjgqmGjEzuugn2SsG1mZFP("serialized size must be non-negative, was ", i));
        }
        this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final void NSjgqmGjEzuugn2SsG1mZFP() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public abstract Object V57tEvNfxZVVcOCAOih5PKr(int i);

    @Override // com.vdodsodjsdt.hKY45oVk0UzhW2UdRV
    public final int VxUQ9tBhpHJ2AAEDNW8sghc4m(daoEmhfC82oCShPhDmB3 daoemhfc82ocshphdmb3) {
        int iZfQNn8hdWlEQ5cR94249PDsLR;
        int iZfQNn8hdWlEQ5cR94249PDsLR2;
        if (ZLZeBXTMq0zDztBxtRTuCHrapQ()) {
            if (daoemhfc82ocshphdmb3 == null) {
                fsiIibR9odqEwhUwtyl8oM fsiiibr9odqewhuwtyl8om = fsiIibR9odqEwhUwtyl8oM.V57tEvNfxZVVcOCAOih5PKr;
                fsiiibr9odqewhuwtyl8om.getClass();
                iZfQNn8hdWlEQ5cR94249PDsLR2 = fsiiibr9odqewhuwtyl8om.VxUQ9tBhpHJ2AAEDNW8sghc4m(getClass()).ZfQNn8hdWlEQ5cR94249PDsLR(this);
            } else {
                iZfQNn8hdWlEQ5cR94249PDsLR2 = daoemhfc82ocshphdmb3.ZfQNn8hdWlEQ5cR94249PDsLR(this);
            }
            if (iZfQNn8hdWlEQ5cR94249PDsLR2 >= 0) {
                return iZfQNn8hdWlEQ5cR94249PDsLR2;
            }
            throw new IllegalStateException(u9SlVAuoWhQUfJ.NSjgqmGjEzuugn2SsG1mZFP("serialized size must be non-negative, was ", iZfQNn8hdWlEQ5cR94249PDsLR2));
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (daoemhfc82ocshphdmb3 == null) {
            fsiIibR9odqEwhUwtyl8oM fsiiibr9odqewhuwtyl8om2 = fsiIibR9odqEwhUwtyl8oM.V57tEvNfxZVVcOCAOih5PKr;
            fsiiibr9odqewhuwtyl8om2.getClass();
            iZfQNn8hdWlEQ5cR94249PDsLR = fsiiibr9odqewhuwtyl8om2.VxUQ9tBhpHJ2AAEDNW8sghc4m(getClass()).ZfQNn8hdWlEQ5cR94249PDsLR(this);
        } else {
            iZfQNn8hdWlEQ5cR94249PDsLR = daoemhfc82ocshphdmb3.ZfQNn8hdWlEQ5cR94249PDsLR(this);
        }
        HzCpKshMOoaw76hFcbOVRYMeRd(iZfQNn8hdWlEQ5cR94249PDsLR);
        return iZfQNn8hdWlEQ5cR94249PDsLR;
    }

    public final boolean ZLZeBXTMq0zDztBxtRTuCHrapQ() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fsiIibR9odqEwhUwtyl8oM fsiiibr9odqewhuwtyl8om = fsiIibR9odqEwhUwtyl8oM.V57tEvNfxZVVcOCAOih5PKr;
        fsiiibr9odqewhuwtyl8om.getClass();
        return fsiiibr9odqewhuwtyl8om.VxUQ9tBhpHJ2AAEDNW8sghc4m(getClass()).ZLZeBXTMq0zDztBxtRTuCHrapQ(this, (EDuXvmY6CU2gSBB) obj);
    }

    public final int hashCode() {
        if (ZLZeBXTMq0zDztBxtRTuCHrapQ()) {
            fsiIibR9odqEwhUwtyl8oM fsiiibr9odqewhuwtyl8om = fsiIibR9odqEwhUwtyl8oM.V57tEvNfxZVVcOCAOih5PKr;
            fsiiibr9odqewhuwtyl8om.getClass();
            return fsiiibr9odqewhuwtyl8om.VxUQ9tBhpHJ2AAEDNW8sghc4m(getClass()).zzpBGItXfub0yWj(this);
        }
        if (this.memoizedHashCode == 0) {
            fsiIibR9odqEwhUwtyl8oM fsiiibr9odqewhuwtyl8om2 = fsiIibR9odqEwhUwtyl8oM.V57tEvNfxZVVcOCAOih5PKr;
            fsiiibr9odqewhuwtyl8om2.getClass();
            this.memoizedHashCode = fsiiibr9odqewhuwtyl8om2.VxUQ9tBhpHJ2AAEDNW8sghc4m(getClass()).zzpBGItXfub0yWj(this);
        }
        return this.memoizedHashCode;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = E3Y62UgPSYWMVgLHR.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        E3Y62UgPSYWMVgLHR.V57tEvNfxZVVcOCAOih5PKr(this, sb, UNINITIALIZED_HASH_CODE);
        return sb.toString();
    }

    @Override // com.vdodsodjsdt.hKY45oVk0UzhW2UdRV
    public final void zzpBGItXfub0yWj(fMipVc9GFHAwh7dXz8 fmipvc9gfhawh7dxz8) {
        fsiIibR9odqEwhUwtyl8oM fsiiibr9odqewhuwtyl8om = fsiIibR9odqEwhUwtyl8oM.V57tEvNfxZVVcOCAOih5PKr;
        fsiiibr9odqewhuwtyl8om.getClass();
        daoEmhfC82oCShPhDmB3 daoemhfc82ocshphdmb3VxUQ9tBhpHJ2AAEDNW8sghc4m = fsiiibr9odqewhuwtyl8om.VxUQ9tBhpHJ2AAEDNW8sghc4m(getClass());
        Skgk8FYn8b4TvRiBOsElZw4XkNLhQ skgk8FYn8b4TvRiBOsElZw4XkNLhQ = fmipvc9gfhawh7dxz8.NSjgqmGjEzuugn2SsG1mZFP;
        if (skgk8FYn8b4TvRiBOsElZw4XkNLhQ == null) {
            skgk8FYn8b4TvRiBOsElZw4XkNLhQ = new Skgk8FYn8b4TvRiBOsElZw4XkNLhQ(fmipvc9gfhawh7dxz8);
        }
        daoemhfc82ocshphdmb3VxUQ9tBhpHJ2AAEDNW8sghc4m.LaeGQIruHQu81hfJldjMOQSVblH3x(this, skgk8FYn8b4TvRiBOsElZw4XkNLhQ);
    }
}
