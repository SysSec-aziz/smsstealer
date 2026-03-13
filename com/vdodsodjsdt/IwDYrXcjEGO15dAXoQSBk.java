package com.vdodsodjsdt;

import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class IwDYrXcjEGO15dAXoQSBk extends Handler {
    public static final IwDYrXcjEGO15dAXoQSBk VxUQ9tBhpHJ2AAEDNW8sghc4m = new IwDYrXcjEGO15dAXoQSBk();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        ej6unYlOWMDF.pYmKDYlAmhudp(logRecord, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = a8IKGxZ7ZrNFkaHe62tpu.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        String loggerName = logRecord.getLoggerName();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(loggerName, "getLoggerName(...)");
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        int i = iIntValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(message, "getMessage(...)");
        a8IKGxZ7ZrNFkaHe62tpu.VxUQ9tBhpHJ2AAEDNW8sghc4m(loggerName, i, message, logRecord.getThrown());
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
