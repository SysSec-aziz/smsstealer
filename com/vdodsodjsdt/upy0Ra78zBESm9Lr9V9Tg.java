package com.vdodsodjsdt;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class upy0Ra78zBESm9Lr9V9Tg extends HVDN7cg44ou {
    public final Socket q1wNbhk2O6;

    public upy0Ra78zBESm9Lr9V9Tg(Socket socket) {
        this.q1wNbhk2O6 = socket;
    }

    public final IOException HzCpKshMOoaw76hFcbOVRYMeRd(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // com.vdodsodjsdt.HVDN7cg44ou
    public final void M9e7PWhFYLD2lOGMker() {
        Socket socket = this.q1wNbhk2O6;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!NGazqytLkjPn2m.VxUQ9tBhpHJ2AAEDNW8sghc4m(e)) {
                throw e;
            }
            NGazqytLkjPn2m.VxUQ9tBhpHJ2AAEDNW8sghc4m.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            NGazqytLkjPn2m.VxUQ9tBhpHJ2AAEDNW8sghc4m.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }
}
