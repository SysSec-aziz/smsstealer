package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Trace;
import com.vdodsodjsdt.Eyg9qHiQ9Ki1REKbbd3J;
import com.vdodsodjsdt.NrjuzzioPqfttNRptBDpZDzSYUrcM;
import com.vdodsodjsdt.hRrPPME7ytOB7ba;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new Eyg9qHiQ9Ki1REKbbd3J("Context cannot be null");
        }
        if (context.getApplicationContext() == null) {
            return true;
        }
        NrjuzzioPqfttNRptBDpZDzSYUrcM nrjuzzioPqfttNRptBDpZDzSYUrcMF6ZQsR6bPLvvCDNXOUc = NrjuzzioPqfttNRptBDpZDzSYUrcM.f6ZQsR6bPLvvCDNXOUc(context);
        Class<?> cls = getClass();
        Context context2 = (Context) nrjuzzioPqfttNRptBDpZDzSYUrcMF6ZQsR6bPLvvCDNXOUc.ZfQNn8hdWlEQ5cR94249PDsLR;
        try {
            try {
                Trace.beginSection(hRrPPME7ytOB7ba.HVEwbdULInpTNa0IG("Startup"));
                nrjuzzioPqfttNRptBDpZDzSYUrcMF6ZQsR6bPLvvCDNXOUc.HzCpKshMOoaw76hFcbOVRYMeRd(context2.getPackageManager().getProviderInfo(new ComponentName(context2, cls), 128).metaData);
                return true;
            } catch (PackageManager.NameNotFoundException e) {
                throw new Eyg9qHiQ9Ki1REKbbd3J(e);
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
