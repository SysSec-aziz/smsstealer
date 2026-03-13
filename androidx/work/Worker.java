package androidx.work;

import android.content.Context;
import com.vdodsodjsdt.E4DUcuxizcAv5WKy5qZ7sw;
import com.vdodsodjsdt.HcTCXqDiOj8Ka0HX;
import com.vdodsodjsdt.ej6unYlOWMDF;
import com.vdodsodjsdt.ek4IsStTbvjeGaTN76;
import com.vdodsodjsdt.fUHFsIYAhZNjnB;
import com.vdodsodjsdt.k5xHLp7fCPX0ktLE3ej5tGjGJa;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Worker extends E4DUcuxizcAv5WKy5qZ7sw {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        ej6unYlOWMDF.pYmKDYlAmhudp(context, "context");
        ej6unYlOWMDF.pYmKDYlAmhudp(workerParameters, "workerParams");
    }

    public abstract fUHFsIYAhZNjnB V57tEvNfxZVVcOCAOih5PKr();

    @Override // com.vdodsodjsdt.E4DUcuxizcAv5WKy5qZ7sw
    public final k5xHLp7fCPX0ktLE3ej5tGjGJa VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        ExecutorService executorService = this.zzpBGItXfub0yWj.V57tEvNfxZVVcOCAOih5PKr;
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(executorService, "backgroundExecutor");
        return ej6unYlOWMDF.RhfGHxtXxy0M0grmp2jkRjQg(new ek4IsStTbvjeGaTN76(executorService, new HcTCXqDiOj8Ka0HX(this, 0)));
    }

    @Override // com.vdodsodjsdt.E4DUcuxizcAv5WKy5qZ7sw
    public final k5xHLp7fCPX0ktLE3ej5tGjGJa zzpBGItXfub0yWj() {
        ExecutorService executorService = this.zzpBGItXfub0yWj.V57tEvNfxZVVcOCAOih5PKr;
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(executorService, "backgroundExecutor");
        return ej6unYlOWMDF.RhfGHxtXxy0M0grmp2jkRjQg(new ek4IsStTbvjeGaTN76(executorService, new HcTCXqDiOj8Ka0HX(this, 1)));
    }
}
