package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.iVKrTMqOw0TqCeNN;
import com.vdodsodjsdt.AO2JzxMx6g;
import com.vdodsodjsdt.KKgVVtgki1NTGogYfNtieIfD;
import com.vdodsodjsdt.NrjuzzioPqfttNRptBDpZDzSYUrcM;
import com.vdodsodjsdt.ZxVLD9H77Z62NUllXp;
import com.vdodsodjsdt.aDb6H06xgqYbjmZ2EhuGObz49FET;
import com.vdodsodjsdt.eCXkhutEc2DfjDV4bwVSYXtTP775A;
import com.vdodsodjsdt.hCgEybj69le8;
import com.vdodsodjsdt.rZPdN5i9sJdFw2QQx;
import com.vdodsodjsdt.scWJtRrcQpw1SO8qayAb4dT2LAw;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements AO2JzxMx6g {
    @Override // com.vdodsodjsdt.AO2JzxMx6g
    public final List VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // com.vdodsodjsdt.AO2JzxMx6g
    public final Object zzpBGItXfub0yWj(Context context) {
        Object objKUYypEB4eNWOZWVDpH;
        scWJtRrcQpw1SO8qayAb4dT2LAw scwjtrrcqpw1so8qayab4dt2law = new scWJtRrcQpw1SO8qayAb4dT2LAw(new KKgVVtgki1NTGogYfNtieIfD(context, 0));
        scwjtrrcqpw1so8qayab4dt2law.VxUQ9tBhpHJ2AAEDNW8sghc4m = 1;
        if (ZxVLD9H77Z62NUllXp.HzCpKshMOoaw76hFcbOVRYMeRd == null) {
            synchronized (ZxVLD9H77Z62NUllXp.M9e7PWhFYLD2lOGMker) {
                try {
                    if (ZxVLD9H77Z62NUllXp.HzCpKshMOoaw76hFcbOVRYMeRd == null) {
                        ZxVLD9H77Z62NUllXp.HzCpKshMOoaw76hFcbOVRYMeRd = new ZxVLD9H77Z62NUllXp(scwjtrrcqpw1so8qayab4dt2law);
                    }
                } finally {
                }
            }
        }
        NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcMF6ZQsR6bPLvvCDNXOUc = NrjuzzioPqfttNRptBDpZDzSYUrcM.f6ZQsR6bPLvvCDNXOUc(context);
        nrjuzzioPqfttNRptBDpZDzSYUrcMF6ZQsR6bPLvvCDNXOUc.getClass();
        synchronized (NrjuzzioPqfttNRptBDpZDzSYUrcM.zIvmSL0wzmmKGc3X39b2Gw2mUGE) {
            try {
                objKUYypEB4eNWOZWVDpH = ((HashMap) nrjuzzioPqfttNRptBDpZDzSYUrcMF6ZQsR6bPLvvCDNXOUc.zzpBGItXfub0yWj).get(ProcessLifecycleInitializer.class);
                if (objKUYypEB4eNWOZWVDpH == null) {
                    objKUYypEB4eNWOZWVDpH = nrjuzzioPqfttNRptBDpZDzSYUrcMF6ZQsR6bPLvvCDNXOUc.KUYypEB4eNWOZWVDpH(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        final iVKrTMqOw0TqCeNN ivkrtmqow0tqcennLaeGQIruHQu81hfJldjMOQSVblH3x = ((hCgEybj69le8) objKUYypEB4eNWOZWVDpH).LaeGQIruHQu81hfJldjMOQSVblH3x();
        ivkrtmqow0tqcennLaeGQIruHQu81hfJldjMOQSVblH3x.VxUQ9tBhpHJ2AAEDNW8sghc4m(new aDb6H06xgqYbjmZ2EhuGObz49FET(this) { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // com.vdodsodjsdt.aDb6H06xgqYbjmZ2EhuGObz49FET
            public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
                (Build.VERSION.SDK_INT >= 28 ? rZPdN5i9sJdFw2QQx.VxUQ9tBhpHJ2AAEDNW8sghc4m(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new eCXkhutEc2DfjDV4bwVSYXtTP775A(), 500L);
                ivkrtmqow0tqcennLaeGQIruHQu81hfJldjMOQSVblH3x.zIvmSL0wzmmKGc3X39b2Gw2mUGE(this);
            }
        });
        return Boolean.TRUE;
    }
}
