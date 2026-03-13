package com.vdodsodjsdt;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class qR4G0Ppspx4V2jaYTHnJ extends EOksdALzG1YtVRjkh {
    public final /* synthetic */ File V57tEvNfxZVVcOCAOih5PKr;
    public final /* synthetic */ gILkjwpvkGF5oaalOyU zzpBGItXfub0yWj;

    public qR4G0Ppspx4V2jaYTHnJ(gILkjwpvkGF5oaalOyU gilkjwpvkgf5oaaloyu, File file) {
        this.zzpBGItXfub0yWj = gilkjwpvkgf5oaaloyu;
        this.V57tEvNfxZVVcOCAOih5PKr = file;
    }

    @Override // com.vdodsodjsdt.EOksdALzG1YtVRjkh
    public final long VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return this.V57tEvNfxZVVcOCAOih5PKr.length();
    }

    @Override // com.vdodsodjsdt.EOksdALzG1YtVRjkh
    public final void ZfQNn8hdWlEQ5cR94249PDsLR(zvqhqc7YVxGqa3qIRo zvqhqc7yvxgqa3qiro) throws IOException {
        nc8XjqIVIbczRCLb7rZ6G nc8xjqivibczrclb7rz6g = new nc8XjqIVIbczRCLb7rZ6G(1, new FileInputStream(this.V57tEvNfxZVVcOCAOih5PKr), Rls9YNaGzWVnzvwT.ZfQNn8hdWlEQ5cR94249PDsLR);
        try {
            zvqhqc7yvxgqa3qiro.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(nc8xjqivibczrclb7rz6g);
            nc8xjqivibczrclb7rz6g.close();
        } finally {
        }
    }

    @Override // com.vdodsodjsdt.EOksdALzG1YtVRjkh
    public final gILkjwpvkGF5oaalOyU zzpBGItXfub0yWj() {
        return this.zzpBGItXfub0yWj;
    }
}
