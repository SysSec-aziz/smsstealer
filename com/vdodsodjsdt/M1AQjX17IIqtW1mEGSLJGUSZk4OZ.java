package com.vdodsodjsdt;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class M1AQjX17IIqtW1mEGSLJGUSZk4OZ implements Executor {
    public static final M1AQjX17IIqtW1mEGSLJGUSZk4OZ V57tEvNfxZVVcOCAOih5PKr;
    public static final /* synthetic */ M1AQjX17IIqtW1mEGSLJGUSZk4OZ[] ZfQNn8hdWlEQ5cR94249PDsLR;

    static {
        M1AQjX17IIqtW1mEGSLJGUSZk4OZ m1AQjX17IIqtW1mEGSLJGUSZk4OZ = new M1AQjX17IIqtW1mEGSLJGUSZk4OZ("INSTANCE", 0);
        V57tEvNfxZVVcOCAOih5PKr = m1AQjX17IIqtW1mEGSLJGUSZk4OZ;
        ZfQNn8hdWlEQ5cR94249PDsLR = new M1AQjX17IIqtW1mEGSLJGUSZk4OZ[]{m1AQjX17IIqtW1mEGSLJGUSZk4OZ};
    }

    public static M1AQjX17IIqtW1mEGSLJGUSZk4OZ valueOf(String str) {
        return (M1AQjX17IIqtW1mEGSLJGUSZk4OZ) Enum.valueOf(M1AQjX17IIqtW1mEGSLJGUSZk4OZ.class, str);
    }

    public static M1AQjX17IIqtW1mEGSLJGUSZk4OZ[] values() {
        return (M1AQjX17IIqtW1mEGSLJGUSZk4OZ[]) ZfQNn8hdWlEQ5cR94249PDsLR.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ej6unYlOWMDF.pYmKDYlAmhudp(runnable, "command");
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
