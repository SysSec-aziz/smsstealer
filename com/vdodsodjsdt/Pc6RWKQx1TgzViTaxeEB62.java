package com.vdodsodjsdt;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class Pc6RWKQx1TgzViTaxeEB62 implements Executor {
    public static final Pc6RWKQx1TgzViTaxeEB62 V57tEvNfxZVVcOCAOih5PKr;
    public static final /* synthetic */ Pc6RWKQx1TgzViTaxeEB62[] ZfQNn8hdWlEQ5cR94249PDsLR;

    static {
        Pc6RWKQx1TgzViTaxeEB62 pc6RWKQx1TgzViTaxeEB62 = new Pc6RWKQx1TgzViTaxeEB62("INSTANCE", 0);
        V57tEvNfxZVVcOCAOih5PKr = pc6RWKQx1TgzViTaxeEB62;
        ZfQNn8hdWlEQ5cR94249PDsLR = new Pc6RWKQx1TgzViTaxeEB62[]{pc6RWKQx1TgzViTaxeEB62};
    }

    public static Pc6RWKQx1TgzViTaxeEB62 valueOf(String str) {
        return (Pc6RWKQx1TgzViTaxeEB62) Enum.valueOf(Pc6RWKQx1TgzViTaxeEB62.class, str);
    }

    public static Pc6RWKQx1TgzViTaxeEB62[] values() {
        return (Pc6RWKQx1TgzViTaxeEB62[]) ZfQNn8hdWlEQ5cR94249PDsLR.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
