package com.vdodsodjsdt;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class hGzyxEAtPzT implements EfIvTei3Q8wBNpyLTZJevpFxej {
    public final fwzr2yRMgOq0UE8cQLHe V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ aLVvFTl6cTT ZfQNn8hdWlEQ5cR94249PDsLR;

    public hGzyxEAtPzT(aLVvFTl6cTT alvvftl6ctt, fwzr2yRMgOq0UE8cQLHe fwzr2yrmgoq0ue8cqlhe) {
        this.ZfQNn8hdWlEQ5cR94249PDsLR = alvvftl6ctt;
        this.V57tEvNfxZVVcOCAOih5PKr = fwzr2yrmgoq0ue8cqlhe;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.vdodsodjsdt.aLVvFTl6cTT] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.vdodsodjsdt.sRSjJ4B4UdKzPCFBE] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.vdodsodjsdt.EfIvTei3Q8wBNpyLTZJevpFxej
    public final Object VxUQ9tBhpHJ2AAEDNW8sghc4m() throws Throwable {
        Throwable th;
        sRSjJ4B4UdKzPCFBE srsjj4b4udkzpcfbe;
        ?? r0 = this.ZfQNn8hdWlEQ5cR94249PDsLR;
        fwzr2yRMgOq0UE8cQLHe fwzr2yrmgoq0ue8cqlhe = this.V57tEvNfxZVVcOCAOih5PKr;
        sRSjJ4B4UdKzPCFBE srsjj4b4udkzpcfbe2 = sRSjJ4B4UdKzPCFBE.INTERNAL_ERROR;
        ?? r3 = 1;
        IOException e = null;
        try {
            try {
                try {
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e2) {
                e = e2;
                srsjj4b4udkzpcfbe = srsjj4b4udkzpcfbe2;
            }
            if (!fwzr2yrmgoq0ue8cqlhe.VxUQ9tBhpHJ2AAEDNW8sghc4m(true, this)) {
                throw new IOException("Required SETTINGS preface not received");
            }
            do {
                try {
                } catch (Throwable th3) {
                    th = th3;
                }
            } while (fwzr2yrmgoq0ue8cqlhe.VxUQ9tBhpHJ2AAEDNW8sghc4m(false, this));
            srsjj4b4udkzpcfbe = sRSjJ4B4UdKzPCFBE.NO_ERROR;
            try {
                srsjj4b4udkzpcfbe2 = sRSjJ4B4UdKzPCFBE.CANCEL;
                r0.VxUQ9tBhpHJ2AAEDNW8sghc4m(srsjj4b4udkzpcfbe, srsjj4b4udkzpcfbe2, null);
                r3 = srsjj4b4udkzpcfbe;
            } catch (IOException e3) {
                e = e3;
                srsjj4b4udkzpcfbe2 = sRSjJ4B4UdKzPCFBE.PROTOCOL_ERROR;
                r0.VxUQ9tBhpHJ2AAEDNW8sghc4m(srsjj4b4udkzpcfbe2, srsjj4b4udkzpcfbe2, e);
                r3 = srsjj4b4udkzpcfbe;
            }
            jHlOQHj3hlCsydfI7r5ApVdQjYvKf.zzpBGItXfub0yWj(fwzr2yrmgoq0ue8cqlhe);
            return hMtEZx9LFZEOBsEChkiRKnXNYh1GG.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            r3 = srsjj4b4udkzpcfbe2;
        } catch (Throwable th4) {
            th = th4;
        }
        r0.VxUQ9tBhpHJ2AAEDNW8sghc4m(r3, srsjj4b4udkzpcfbe2, e);
        jHlOQHj3hlCsydfI7r5ApVdQjYvKf.zzpBGItXfub0yWj(fwzr2yrmgoq0ue8cqlhe);
        throw th;
    }
}
