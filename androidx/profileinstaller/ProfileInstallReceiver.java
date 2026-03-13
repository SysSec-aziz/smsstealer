package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import com.vdodsodjsdt.FLWIoSaHb1q8TqFvEBgPyRGrzvi6;
import com.vdodsodjsdt.SrWj7TXjIxKCejoDzqp3JUFJYtU;
import com.vdodsodjsdt.qF22Y620JkFyombtDYw0h0h8Rxpja;
import com.vdodsodjsdt.zonOxHotd3BwAPJcwqr6I6uQNngg4;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            FLWIoSaHb1q8TqFvEBgPyRGrzvi6.gBaBUmihn5l4u(context, new SrWj7TXjIxKCejoDzqp3JUFJYtU(1), new qF22Y620JkFyombtDYw0h0h8Rxpja(this), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                        return;
                    }
                    return;
                }
                qF22Y620JkFyombtDYw0h0h8Rxpja qf22y620jkfyombtdyw0h0h8rxpja = new qF22Y620JkFyombtDYw0h0h8Rxpja(this);
                try {
                    FLWIoSaHb1q8TqFvEBgPyRGrzvi6.aXO0LSrt8bKV(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    qf22y620jkfyombtdyw0h0h8rxpja.LaeGQIruHQu81hfJldjMOQSVblH3x(10, null);
                    return;
                } catch (PackageManager.NameNotFoundException e) {
                    qf22y620jkfyombtdyw0h0h8rxpja.LaeGQIruHQu81hfJldjMOQSVblH3x(7, e);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            Process.sendSignal(Process.myPid(), 10);
            Log.d("ProfileInstaller", "");
            setResultCode(12);
        } else {
            if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                return;
            }
            String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
            qF22Y620JkFyombtDYw0h0h8Rxpja qf22y620jkfyombtdyw0h0h8rxpja2 = new qF22Y620JkFyombtDYw0h0h8Rxpja(this);
            if (!"DROP_SHADER_CACHE".equals(string2)) {
                qf22y620jkfyombtdyw0h0h8rxpja2.LaeGQIruHQu81hfJldjMOQSVblH3x(16, null);
                return;
            }
            if (zonOxHotd3BwAPJcwqr6I6uQNngg4.p59rPv72J9(Build.VERSION.SDK_INT >= 34 ? context.createDeviceProtectedStorageContext().getCacheDir() : context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                qf22y620jkfyombtdyw0h0h8rxpja2.LaeGQIruHQu81hfJldjMOQSVblH3x(14, null);
            } else {
                qf22y620jkfyombtdyw0h0h8rxpja2.LaeGQIruHQu81hfJldjMOQSVblH3x(15, null);
            }
        }
    }
}
