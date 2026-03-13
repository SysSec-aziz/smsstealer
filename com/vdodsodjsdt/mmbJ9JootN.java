package com.vdodsodjsdt;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class mmbJ9JootN implements Pkjoalb0jfHaOD {
    public static final mmbJ9JootN zzpBGItXfub0yWj = new mmbJ9JootN(0);
    public final /* synthetic */ int VxUQ9tBhpHJ2AAEDNW8sghc4m;

    public /* synthetic */ mmbJ9JootN(int i) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
    }

    @Override // com.vdodsodjsdt.Pkjoalb0jfHaOD
    public final YKlOoXxkpyoAf0 VxUQ9tBhpHJ2AAEDNW8sghc4m(Class cls) {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                if (!EDuXvmY6CU2gSBB.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (YKlOoXxkpyoAf0) EDuXvmY6CU2gSBB.ZfQNn8hdWlEQ5cR94249PDsLR(cls.asSubclass(EDuXvmY6CU2gSBB.class)).V57tEvNfxZVVcOCAOih5PKr(3);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // com.vdodsodjsdt.Pkjoalb0jfHaOD
    public final boolean zzpBGItXfub0yWj(Class cls) {
        switch (this.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            case 0:
                return EDuXvmY6CU2gSBB.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
