package androidx.work;

import android.content.Context;
import com.vdodsodjsdt.D73WsmU258PapcWZb45SFW;
import com.vdodsodjsdt.E4DUcuxizcAv5WKy5qZ7sw;
import com.vdodsodjsdt.aGLXkGgj9ZepFnRvHMEtzaaSY;
import com.vdodsodjsdt.dqNdaRBButrU7AyqGRVyUEyy;
import com.vdodsodjsdt.ej6unYlOWMDF;
import com.vdodsodjsdt.k5xHLp7fCPX0ktLE3ej5tGjGJa;
import com.vdodsodjsdt.sGipz63rTUmSj3uFDvOtzihao;
import com.vdodsodjsdt.tip6Bn6qwOmejUJFpa09lcJqL;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class CoroutineWorker extends E4DUcuxizcAv5WKy5qZ7sw {
    public final WorkerParameters LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final dqNdaRBButrU7AyqGRVyUEyy zIvmSL0wzmmKGc3X39b2Gw2mUGE;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        ej6unYlOWMDF.pYmKDYlAmhudp(context, "appContext");
        ej6unYlOWMDF.pYmKDYlAmhudp(workerParameters, "params");
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = workerParameters;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = dqNdaRBButrU7AyqGRVyUEyy.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    public abstract Object V57tEvNfxZVVcOCAOih5PKr(tip6Bn6qwOmejUJFpa09lcJqL tip6bn6qwomejujfpa09lcjql);

    @Override // com.vdodsodjsdt.E4DUcuxizcAv5WKy5qZ7sw
    public final k5xHLp7fCPX0ktLE3ej5tGjGJa VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        aGLXkGgj9ZepFnRvHMEtzaaSY aglxkggj9zepfnrvhmetzaasy = new aGLXkGgj9ZepFnRvHMEtzaaSY();
        dqNdaRBButrU7AyqGRVyUEyy dqndarbbutru7ayqgrvyueyy = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        dqndarbbutru7ayqgrvyueyy.getClass();
        return sGipz63rTUmSj3uFDvOtzihao.aXO0LSrt8bKV(sGipz63rTUmSj3uFDvOtzihao.CixTK5ZX8oWXHz34qHYV(dqndarbbutru7ayqgrvyueyy, aglxkggj9zepfnrvhmetzaasy), new tip6Bn6qwOmejUJFpa09lcJqL(this, null, 0));
    }

    @Override // com.vdodsodjsdt.E4DUcuxizcAv5WKy5qZ7sw
    public final k5xHLp7fCPX0ktLE3ej5tGjGJa zzpBGItXfub0yWj() {
        dqNdaRBButrU7AyqGRVyUEyy dqndarbbutru7ayqgrvyueyy = dqNdaRBButrU7AyqGRVyUEyy.LaeGQIruHQu81hfJldjMOQSVblH3x;
        D73WsmU258PapcWZb45SFW d73WsmU258PapcWZb45SFW = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(d73WsmU258PapcWZb45SFW, dqndarbbutru7ayqgrvyueyy)) {
            d73WsmU258PapcWZb45SFW = this.LaeGQIruHQu81hfJldjMOQSVblH3x.ZfQNn8hdWlEQ5cR94249PDsLR;
        }
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(d73WsmU258PapcWZb45SFW, "if (coroutineContext != …rkerContext\n            }");
        return sGipz63rTUmSj3uFDvOtzihao.aXO0LSrt8bKV(d73WsmU258PapcWZb45SFW.RhfGHxtXxy0M0grmp2jkRjQg(new aGLXkGgj9ZepFnRvHMEtzaaSY()), new tip6Bn6qwOmejUJFpa09lcJqL(this, null, 1));
    }
}
