package com.vdodsodjsdt;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class JsnZMsYEp5ShmM4 {
    public Object LaeGQIruHQu81hfJldjMOQSVblH3x;
    public Object V57tEvNfxZVVcOCAOih5PKr;
    public final Object VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public Object ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public Object ZfQNn8hdWlEQ5cR94249PDsLR;
    public Object zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public Object zzpBGItXfub0yWj;

    public JsnZMsYEp5ShmM4(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.ZfQNn8hdWlEQ5cR94249PDsLR = layoutParams;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = new Rect();
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = new int[2];
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = new int[2];
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.zzpBGItXfub0yWj = viewInflate;
        this.V57tEvNfxZVVcOCAOih5PKr = (TextView) viewInflate.findViewById(R.id.message);
        layoutParams.setTitle(JsnZMsYEp5ShmM4.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public JsnZMsYEp5ShmM4(Context context, Eh21X7fdrXs eh21X7fdrXs, nMRZPpfLCgJyuB nmrzppflcgjyub, IVPB9DLMIoeA0Qp8AgwLlJ iVPB9DLMIoeA0Qp8AgwLlJ, WorkDatabase workDatabase, vIPEe55rgLxLcs vipee55rglxlcs, ArrayList arrayList) {
        ej6unYlOWMDF.pYmKDYlAmhudp(context, "context");
        this.zzpBGItXfub0yWj = eh21X7fdrXs;
        this.V57tEvNfxZVVcOCAOih5PKr = nmrzppflcgjyub;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = iVPB9DLMIoeA0Qp8AgwLlJ;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = workDatabase;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = vipee55rglxlcs;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = arrayList;
        Context applicationContext = context.getApplicationContext();
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(applicationContext, "context.applicationContext");
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = applicationContext;
        new VSncX8ksA0tswc2TMhzhOMdd();
    }

    public JsnZMsYEp5ShmM4(j5jyRGaw4k j5jyrgaw4k) {
        ej6unYlOWMDF.pYmKDYlAmhudp(j5jyrgaw4k, "taskRunner");
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = j5jyrgaw4k;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = SBvbXpgT6Ff7FomWxrO.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = UFiflNDkv7brFTbpqA3.VxUQ9tBhpHJ2AAEDNW8sghc4m;
    }
}
