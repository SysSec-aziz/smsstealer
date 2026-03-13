package com.vdodsodjsdt;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xpKXrogL5QN2Ln5bIc {
    public static final OBsbe4YQtB2vgUFxLzO6ssT0 VxUQ9tBhpHJ2AAEDNW8sghc4m = new OBsbe4YQtB2vgUFxLzO6ssT0(2);
    public static final h3GACMRqJSD8rLN7wCMqODSttyM zzpBGItXfub0yWj = new h3GACMRqJSD8rLN7wCMqODSttyM();

    public static j5O1PfCuTxZKdtuvF7[] V57tEvNfxZVVcOCAOih5PKr(Context context, zDPogDYnaf4Ok5KljFrcZIbCgM2B zdpogdynaf4ok5kljfrczibcgm2b, String str) {
        Trace.beginSection(hRrPPME7ytOB7ba.HVEwbdULInpTNa0IG("FontProvider.query"));
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
            Cursor cursorQuery = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                Trace.beginSection(hRrPPME7ytOB7ba.HVEwbdULInpTNa0IG("ContentQueryWrapper.query"));
                try {
                    String[] strArr2 = {zdpogdynaf4ok5kljfrczibcgm2b.V57tEvNfxZVVcOCAOih5PKr};
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        try {
                            cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e) {
                            Log.w("FontsProvider", "Unable to query the content provider", e);
                        }
                    }
                    Trace.endSection();
                    if (cursorQuery != null && cursorQuery.getCount() > 0) {
                        int columnIndex = cursorQuery.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursorQuery.getColumnIndex("_id");
                        int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                        int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                        int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                        while (cursorQuery.moveToNext()) {
                            int i = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                            arrayList2.add(new j5O1PfCuTxZKdtuvF7(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, i));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    return (j5O1PfCuTxZKdtuvF7[]) arrayList.toArray(new j5O1PfCuTxZKdtuvF7[0]);
                } finally {
                }
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
                throw th;
            }
        } finally {
        }
    }

    public static z8uyl4sTQr2O9dK1e VxUQ9tBhpHJ2AAEDNW8sghc4m(Context context, List list) {
        String str;
        Typeface typefaceV57tEvNfxZVVcOCAOih5PKr;
        Trace.beginSection(hRrPPME7ytOB7ba.HVEwbdULInpTNa0IG("FontProvider.getFontFamilyResult"));
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                zDPogDYnaf4Ok5KljFrcZIbCgM2B zdpogdynaf4ok5kljfrczibcgm2b = (zDPogDYnaf4Ok5KljFrcZIbCgM2B) list.get(i);
                if (Build.VERSION.SDK_INT < 31 || (typefaceV57tEvNfxZVVcOCAOih5PKr = NHtvgmV6EG3jwD4PpLqRhQi.V57tEvNfxZVVcOCAOih5PKr((str = zdpogdynaf4ok5kljfrczibcgm2b.LaeGQIruHQu81hfJldjMOQSVblH3x))) == null || NHtvgmV6EG3jwD4PpLqRhQi.ZfQNn8hdWlEQ5cR94249PDsLR(typefaceV57tEvNfxZVVcOCAOih5PKr) == null) {
                    ProviderInfo providerInfoZzpBGItXfub0yWj = zzpBGItXfub0yWj(context.getPackageManager(), zdpogdynaf4ok5kljfrczibcgm2b, context.getResources());
                    if (providerInfoZzpBGItXfub0yWj == null) {
                        return new z8uyl4sTQr2O9dK1e();
                    }
                    arrayList.add(V57tEvNfxZVVcOCAOih5PKr(context, zdpogdynaf4ok5kljfrczibcgm2b, providerInfoZzpBGItXfub0yWj.authority));
                } else {
                    arrayList.add(new j5O1PfCuTxZKdtuvF7[]{new j5O1PfCuTxZKdtuvF7(str, zdpogdynaf4ok5kljfrczibcgm2b.zIvmSL0wzmmKGc3X39b2Gw2mUGE)});
                }
            }
            return new z8uyl4sTQr2O9dK1e(arrayList, 2);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo zzpBGItXfub0yWj(PackageManager packageManager, zDPogDYnaf4Ok5KljFrcZIbCgM2B zdpogdynaf4ok5kljfrczibcgm2b, Resources resources) {
        h3GACMRqJSD8rLN7wCMqODSttyM h3gacmrqjsd8rln7wcmqodsttym = zzpBGItXfub0yWj;
        OBsbe4YQtB2vgUFxLzO6ssT0 oBsbe4YQtB2vgUFxLzO6ssT0 = VxUQ9tBhpHJ2AAEDNW8sghc4m;
        Trace.beginSection(hRrPPME7ytOB7ba.HVEwbdULInpTNa0IG("FontProvider.getProvider"));
        try {
            List listWRCD0SdqWCowdYU7bmzN = zdpogdynaf4ok5kljfrczibcgm2b.ZfQNn8hdWlEQ5cR94249PDsLR;
            String str = zdpogdynaf4ok5kljfrczibcgm2b.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            String str2 = zdpogdynaf4ok5kljfrczibcgm2b.zzpBGItXfub0yWj;
            if (listWRCD0SdqWCowdYU7bmzN == null) {
                listWRCD0SdqWCowdYU7bmzN = KfeOQNOupsCg6878zi4e.wRCD0SdqWCowdYU7bmzN(resources, 0);
            }
            Nff1wlGiNFPZNGO nff1wlGiNFPZNGO = new Nff1wlGiNFPZNGO();
            nff1wlGiNFPZNGO.VxUQ9tBhpHJ2AAEDNW8sghc4m = str;
            nff1wlGiNFPZNGO.zzpBGItXfub0yWj = str2;
            nff1wlGiNFPZNGO.V57tEvNfxZVVcOCAOih5PKr = listWRCD0SdqWCowdYU7bmzN;
            ProviderInfo providerInfo = (ProviderInfo) oBsbe4YQtB2vgUFxLzO6ssT0.zIvmSL0wzmmKGc3X39b2Gw2mUGE(nff1wlGiNFPZNGO);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, h3gacmrqjsd8rln7wcmqodsttym);
            for (int i = 0; i < listWRCD0SdqWCowdYU7bmzN.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) listWRCD0SdqWCowdYU7bmzN.get(i));
                Collections.sort(arrayList2, h3gacmrqjsd8rln7wcmqodsttym);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                    }
                    oBsbe4YQtB2vgUFxLzO6ssT0.M9e7PWhFYLD2lOGMker(nff1wlGiNFPZNGO, providerInfoResolveContentProvider);
                    return providerInfoResolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }
}
