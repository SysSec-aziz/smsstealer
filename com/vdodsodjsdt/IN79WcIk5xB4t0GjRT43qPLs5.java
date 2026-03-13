package com.vdodsodjsdt;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import androidx.work.WorkerParameters;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public class IN79WcIk5xB4t0GjRT43qPLs5 implements DenmIypSdw0qfxt, DRNSD7OTZrolKY4iK67pQWIr, kJnadvTP3Pg, uQmaiFOQCFgLCkx8, CBgwRvRioz70v9hmKLhz6xwUoHcu2 {
    public final /* synthetic */ int V57tEvNfxZVVcOCAOih5PKr;
    public static final IN79WcIk5xB4t0GjRT43qPLs5 ZfQNn8hdWlEQ5cR94249PDsLR = new IN79WcIk5xB4t0GjRT43qPLs5(1);
    public static final IN79WcIk5xB4t0GjRT43qPLs5 LaeGQIruHQu81hfJldjMOQSVblH3x = new IN79WcIk5xB4t0GjRT43qPLs5(2);
    public static final /* synthetic */ IN79WcIk5xB4t0GjRT43qPLs5 zIvmSL0wzmmKGc3X39b2Gw2mUGE = new IN79WcIk5xB4t0GjRT43qPLs5(3);
    public static final IN79WcIk5xB4t0GjRT43qPLs5 ZLZeBXTMq0zDztBxtRTuCHrapQ = new IN79WcIk5xB4t0GjRT43qPLs5(4);
    public static final /* synthetic */ IN79WcIk5xB4t0GjRT43qPLs5 NSjgqmGjEzuugn2SsG1mZFP = new IN79WcIk5xB4t0GjRT43qPLs5(5);
    public static final IN79WcIk5xB4t0GjRT43qPLs5 GI83zq0G8e7zkn = new IN79WcIk5xB4t0GjRT43qPLs5(6);
    public static final IN79WcIk5xB4t0GjRT43qPLs5 M9e7PWhFYLD2lOGMker = new IN79WcIk5xB4t0GjRT43qPLs5(7);
    public static final /* synthetic */ IN79WcIk5xB4t0GjRT43qPLs5 HzCpKshMOoaw76hFcbOVRYMeRd = new IN79WcIk5xB4t0GjRT43qPLs5(8);
    public static final IN79WcIk5xB4t0GjRT43qPLs5 KUYypEB4eNWOZWVDpH = new IN79WcIk5xB4t0GjRT43qPLs5(9);
    public static final IN79WcIk5xB4t0GjRT43qPLs5 q1wNbhk2O6 = new IN79WcIk5xB4t0GjRT43qPLs5(10);
    public static final IN79WcIk5xB4t0GjRT43qPLs5 p59rPv72J9 = new IN79WcIk5xB4t0GjRT43qPLs5(11);
    public static final IN79WcIk5xB4t0GjRT43qPLs5 Ca81ebIan1u = new IN79WcIk5xB4t0GjRT43qPLs5(12);
    public static final IN79WcIk5xB4t0GjRT43qPLs5 h3jnZRsdwYJfY9UhQCkbvWciwvFHv = new IN79WcIk5xB4t0GjRT43qPLs5(13);
    public static final IN79WcIk5xB4t0GjRT43qPLs5 pYmKDYlAmhudp = new IN79WcIk5xB4t0GjRT43qPLs5(14);
    public static final IN79WcIk5xB4t0GjRT43qPLs5 ko09zE6UAgwkV = new IN79WcIk5xB4t0GjRT43qPLs5(15);
    public static final IN79WcIk5xB4t0GjRT43qPLs5 jW7EiD0YL6xkbB158jMUzhWNWb1y = new IN79WcIk5xB4t0GjRT43qPLs5(16);
    public static final IN79WcIk5xB4t0GjRT43qPLs5 f6ZQsR6bPLvvCDNXOUc = new IN79WcIk5xB4t0GjRT43qPLs5(17);

    public /* synthetic */ IN79WcIk5xB4t0GjRT43qPLs5(int i) {
        this.V57tEvNfxZVVcOCAOih5PKr = i;
    }

    public static oA1WO3soICf8H1N6bgpG HzCpKshMOoaw76hFcbOVRYMeRd(String str) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "<this>");
        byte[] bytes = str.getBytes(DEYHHOT0rxPFnkgGJgP0ym2DRq1.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(bytes, "getBytes(...)");
        oA1WO3soICf8H1N6bgpG oa1wo3soicf8h1n6bgpg = new oA1WO3soICf8H1N6bgpG(bytes);
        oa1wo3soicf8h1n6bgpg.LaeGQIruHQu81hfJldjMOQSVblH3x = str;
        return oa1wo3soicf8h1n6bgpg;
    }

    public static final E246m2jcOzL76dqF LaeGQIruHQu81hfJldjMOQSVblH3x(IN79WcIk5xB4t0GjRT43qPLs5 iN79WcIk5xB4t0GjRT43qPLs5, String str) {
        E246m2jcOzL76dqF e246m2jcOzL76dqF = new E246m2jcOzL76dqF(str);
        E246m2jcOzL76dqF.ZfQNn8hdWlEQ5cR94249PDsLR.put(str, e246m2jcOzL76dqF);
        return e246m2jcOzL76dqF;
    }

    public static oA1WO3soICf8H1N6bgpG M9e7PWhFYLD2lOGMker(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (zonOxHotd3BwAPJcwqr6I6uQNngg4.V57tEvNfxZVVcOCAOih5PKr(str.charAt(i2 + 1)) + (zonOxHotd3BwAPJcwqr6I6uQNngg4.V57tEvNfxZVVcOCAOih5PKr(str.charAt(i2)) << 4));
        }
        return new oA1WO3soICf8H1N6bgpG(bArr);
    }

    public static IN79WcIk5xB4t0GjRT43qPLs5 NSjgqmGjEzuugn2SsG1mZFP(Context context, int i) {
        KfeOQNOupsCg6878zi4e.M9e7PWhFYLD2lOGMker("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, PGobtLpyfPC4TCnlq740.p59rPv72J9);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        F44whnLsbQ.vBGA6pPLqSMuYGvprl270j7(context, typedArrayObtainStyledAttributes, 4);
        F44whnLsbQ.vBGA6pPLqSMuYGvprl270j7(context, typedArrayObtainStyledAttributes, 9);
        F44whnLsbQ.vBGA6pPLqSMuYGvprl270j7(context, typedArrayObtainStyledAttributes, 7);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        XdVIZOnOVHGi6uYUaae4zAI94b.VxUQ9tBhpHJ2AAEDNW8sghc4m(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new ZOzTbMJxsw(0)).VxUQ9tBhpHJ2AAEDNW8sghc4m();
        typedArrayObtainStyledAttributes.recycle();
        IN79WcIk5xB4t0GjRT43qPLs5 iN79WcIk5xB4t0GjRT43qPLs5 = new IN79WcIk5xB4t0GjRT43qPLs5(27);
        KfeOQNOupsCg6878zi4e.HzCpKshMOoaw76hFcbOVRYMeRd(rect.left);
        KfeOQNOupsCg6878zi4e.HzCpKshMOoaw76hFcbOVRYMeRd(rect.top);
        KfeOQNOupsCg6878zi4e.HzCpKshMOoaw76hFcbOVRYMeRd(rect.right);
        KfeOQNOupsCg6878zi4e.HzCpKshMOoaw76hFcbOVRYMeRd(rect.bottom);
        return iN79WcIk5xB4t0GjRT43qPLs5;
    }

    public static HVDN7cg44ou ZLZeBXTMq0zDztBxtRTuCHrapQ() throws InterruptedException {
        HVDN7cg44ou hVDN7cg44ou = HVDN7cg44ou.KUYypEB4eNWOZWVDpH;
        ej6unYlOWMDF.p59rPv72J9(hVDN7cg44ou);
        HVDN7cg44ou hVDN7cg44ou2 = hVDN7cg44ou.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        if (hVDN7cg44ou2 == null) {
            long jNanoTime = System.nanoTime();
            HVDN7cg44ou.GI83zq0G8e7zkn.await(HVDN7cg44ou.M9e7PWhFYLD2lOGMker, TimeUnit.MILLISECONDS);
            HVDN7cg44ou hVDN7cg44ou3 = HVDN7cg44ou.KUYypEB4eNWOZWVDpH;
            ej6unYlOWMDF.p59rPv72J9(hVDN7cg44ou3);
            if (hVDN7cg44ou3.zIvmSL0wzmmKGc3X39b2Gw2mUGE != null || System.nanoTime() - jNanoTime < HVDN7cg44ou.HzCpKshMOoaw76hFcbOVRYMeRd) {
                return null;
            }
            return HVDN7cg44ou.KUYypEB4eNWOZWVDpH;
        }
        long jNanoTime2 = hVDN7cg44ou2.ZLZeBXTMq0zDztBxtRTuCHrapQ - System.nanoTime();
        if (jNanoTime2 > 0) {
            HVDN7cg44ou.GI83zq0G8e7zkn.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        HVDN7cg44ou hVDN7cg44ou4 = HVDN7cg44ou.KUYypEB4eNWOZWVDpH;
        ej6unYlOWMDF.p59rPv72J9(hVDN7cg44ou4);
        hVDN7cg44ou4.zIvmSL0wzmmKGc3X39b2Gw2mUGE = hVDN7cg44ou2.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        hVDN7cg44ou2.zIvmSL0wzmmKGc3X39b2Gw2mUGE = null;
        hVDN7cg44ou2.LaeGQIruHQu81hfJldjMOQSVblH3x = 2;
        return hVDN7cg44ou2;
    }

    public static final void zIvmSL0wzmmKGc3X39b2Gw2mUGE(HVDN7cg44ou hVDN7cg44ou, long j, boolean z) {
        HVDN7cg44ou hVDN7cg44ou2;
        ReentrantLock reentrantLock = HVDN7cg44ou.NSjgqmGjEzuugn2SsG1mZFP;
        if (HVDN7cg44ou.KUYypEB4eNWOZWVDpH == null) {
            HVDN7cg44ou.KUYypEB4eNWOZWVDpH = new HVDN7cg44ou();
            rnMThk4SB9ZxrP0VYkRZfLPH9 rnmthk4sb9zxrp0vykrzflph9 = new rnMThk4SB9ZxrP0VYkRZfLPH9("Okio Watchdog");
            rnmthk4sb9zxrp0vykrzflph9.setDaemon(true);
            rnmthk4sb9zxrp0vykrzflph9.start();
        }
        long jNanoTime = System.nanoTime();
        if (j != 0 && z) {
            hVDN7cg44ou.ZLZeBXTMq0zDztBxtRTuCHrapQ = Math.min(j, hVDN7cg44ou.V57tEvNfxZVVcOCAOih5PKr() - jNanoTime) + jNanoTime;
        } else if (j != 0) {
            hVDN7cg44ou.ZLZeBXTMq0zDztBxtRTuCHrapQ = j + jNanoTime;
        } else {
            if (!z) {
                throw new AssertionError();
            }
            hVDN7cg44ou.ZLZeBXTMq0zDztBxtRTuCHrapQ = hVDN7cg44ou.V57tEvNfxZVVcOCAOih5PKr();
        }
        long j2 = hVDN7cg44ou.ZLZeBXTMq0zDztBxtRTuCHrapQ - jNanoTime;
        HVDN7cg44ou hVDN7cg44ou3 = HVDN7cg44ou.KUYypEB4eNWOZWVDpH;
        ej6unYlOWMDF.p59rPv72J9(hVDN7cg44ou3);
        while (true) {
            hVDN7cg44ou2 = hVDN7cg44ou3.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            if (hVDN7cg44ou2 == null || j2 < hVDN7cg44ou2.ZLZeBXTMq0zDztBxtRTuCHrapQ - jNanoTime) {
                break;
            }
            ej6unYlOWMDF.p59rPv72J9(hVDN7cg44ou2);
            hVDN7cg44ou3 = hVDN7cg44ou2;
        }
        hVDN7cg44ou.zIvmSL0wzmmKGc3X39b2Gw2mUGE = hVDN7cg44ou2;
        hVDN7cg44ou3.zIvmSL0wzmmKGc3X39b2Gw2mUGE = hVDN7cg44ou;
        if (hVDN7cg44ou3 == HVDN7cg44ou.KUYypEB4eNWOZWVDpH) {
            HVDN7cg44ou.GI83zq0G8e7zkn.signal();
        }
    }

    public E4DUcuxizcAv5WKy5qZ7sw GI83zq0G8e7zkn(Context context, String str, WorkerParameters workerParameters) {
        ej6unYlOWMDF.pYmKDYlAmhudp(context, "appContext");
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "workerClassName");
        ej6unYlOWMDF.pYmKDYlAmhudp(workerParameters, "workerParameters");
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str).asSubclass(E4DUcuxizcAv5WKy5qZ7sw.class);
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(clsAsSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Object objNewInstance = clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(objNewInstance, "{\n                val co…Parameters)\n            }");
                E4DUcuxizcAv5WKy5qZ7sw e4DUcuxizcAv5WKy5qZ7sw = (E4DUcuxizcAv5WKy5qZ7sw) objNewInstance;
                if (!e4DUcuxizcAv5WKy5qZ7sw.ZfQNn8hdWlEQ5cR94249PDsLR) {
                    return e4DUcuxizcAv5WKy5qZ7sw;
                }
                throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
            } catch (Throwable th) {
                psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().ZfQNn8hdWlEQ5cR94249PDsLR(ZRJ9bWwEbNXBbZByrAhiteNx6Xg2.VxUQ9tBhpHJ2AAEDNW8sghc4m, "Could not instantiate ".concat(str), th);
                throw th;
            }
        } catch (Throwable th2) {
            psATg3LCCdmDIiRgW.LaeGQIruHQu81hfJldjMOQSVblH3x().ZfQNn8hdWlEQ5cR94249PDsLR(ZRJ9bWwEbNXBbZByrAhiteNx6Xg2.VxUQ9tBhpHJ2AAEDNW8sghc4m, "Invalid class: ".concat(str), th2);
            throw th2;
        }
    }

    public synchronized E246m2jcOzL76dqF KUYypEB4eNWOZWVDpH(String str) {
        E246m2jcOzL76dqF e246m2jcOzL76dqF;
        String strConcat;
        try {
            ej6unYlOWMDF.pYmKDYlAmhudp(str, "javaName");
            LinkedHashMap linkedHashMap = E246m2jcOzL76dqF.ZfQNn8hdWlEQ5cR94249PDsLR;
            e246m2jcOzL76dqF = (E246m2jcOzL76dqF) linkedHashMap.get(str);
            if (e246m2jcOzL76dqF == null) {
                if (ngO5JXZkj8nfh41LltHvEjUc.lxWWbfAOLs4jWzd7PSIiIJ(str, "TLS_", false)) {
                    String strSubstring = str.substring(4);
                    ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strSubstring, "substring(...)");
                    strConcat = "SSL_".concat(strSubstring);
                } else if (ngO5JXZkj8nfh41LltHvEjUc.lxWWbfAOLs4jWzd7PSIiIJ(str, "SSL_", false)) {
                    String strSubstring2 = str.substring(4);
                    ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strSubstring2, "substring(...)");
                    strConcat = "TLS_".concat(strSubstring2);
                } else {
                    strConcat = str;
                }
                e246m2jcOzL76dqF = (E246m2jcOzL76dqF) linkedHashMap.get(strConcat);
                if (e246m2jcOzL76dqF == null) {
                    e246m2jcOzL76dqF = new E246m2jcOzL76dqF(str);
                }
                linkedHashMap.put(str, e246m2jcOzL76dqF);
            }
        } catch (Throwable th) {
            throw th;
        }
        return e246m2jcOzL76dqF;
    }

    @Override // com.vdodsodjsdt.uQmaiFOQCFgLCkx8
    public byte[] V57tEvNfxZVVcOCAOih5PKr(byte[] bArr, int i, int i2) {
        switch (this.V57tEvNfxZVVcOCAOih5PKr) {
            case 24:
                return Arrays.copyOfRange(bArr, i, i2 + i);
            default:
                byte[] bArr2 = new byte[i2];
                System.arraycopy(bArr, i, bArr2, 0, i2);
                return bArr2;
        }
    }

    @Override // com.vdodsodjsdt.kJnadvTP3Pg
    public boolean VxUQ9tBhpHJ2AAEDNW8sghc4m(SSLSocket sSLSocket) {
        return ngO5JXZkj8nfh41LltHvEjUc.lxWWbfAOLs4jWzd7PSIiIJ(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // com.vdodsodjsdt.kJnadvTP3Pg
    public RSSn7Y5tk2UmJ ZfQNn8hdWlEQ5cR94249PDsLR(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new RYrcWqAmRWNPbPL1pDGl1X(superclass);
    }

    @Override // com.vdodsodjsdt.DRNSD7OTZrolKY4iK67pQWIr
    public boolean h3jnZRsdwYJfY9UhQCkbvWciwvFHv(Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ) {
        return false;
    }

    public void p59rPv72J9(Object obj, utw5QZ2bV5OFu23kHkuL67s utw5qz2bv5ofu23khkul67s) {
        EDuXvmY6CU2gSBB eDuXvmY6CU2gSBBVxUQ9tBhpHJ2AAEDNW8sghc4m;
        Map mapVxUQ9tBhpHJ2AAEDNW8sghc4m = ((wg2qx8o8rURUQteWo0QkSZAxg4eSO) obj).VxUQ9tBhpHJ2AAEDNW8sghc4m();
        oq6kMi7oAYnkkVP oq6kmi7oaynkkvpP59rPv72J9 = hsTJlnOZEVw2.p59rPv72J9();
        for (Map.Entry entry : mapVxUQ9tBhpHJ2AAEDNW8sghc4m.entrySet()) {
            zabWiGvSFrO07AP3htLK7JkP zabwigvsfro07ap3htlk7jkp = (zabWiGvSFrO07AP3htLK7JkP) entry.getKey();
            Object value = entry.getValue();
            String str = zabwigvsfro07ap3htlk7jkp.VxUQ9tBhpHJ2AAEDNW8sghc4m;
            if (value instanceof Boolean) {
                L34L9T9oVIxCgI1O l34L9T9oVIxCgI1OAXO0LSrt8bKV = g8kevnL6UKpr15IYtcPJXuLo1L4.aXO0LSrt8bKV();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                l34L9T9oVIxCgI1OAXO0LSrt8bKV.V57tEvNfxZVVcOCAOih5PKr();
                g8kevnL6UKpr15IYtcPJXuLo1L4.pYmKDYlAmhudp((g8kevnL6UKpr15IYtcPJXuLo1L4) l34L9T9oVIxCgI1OAXO0LSrt8bKV.ZfQNn8hdWlEQ5cR94249PDsLR, zBooleanValue);
                eDuXvmY6CU2gSBBVxUQ9tBhpHJ2AAEDNW8sghc4m = l34L9T9oVIxCgI1OAXO0LSrt8bKV.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            } else if (value instanceof Float) {
                L34L9T9oVIxCgI1O l34L9T9oVIxCgI1OAXO0LSrt8bKV2 = g8kevnL6UKpr15IYtcPJXuLo1L4.aXO0LSrt8bKV();
                float fFloatValue = ((Number) value).floatValue();
                l34L9T9oVIxCgI1OAXO0LSrt8bKV2.V57tEvNfxZVVcOCAOih5PKr();
                g8kevnL6UKpr15IYtcPJXuLo1L4.ko09zE6UAgwkV((g8kevnL6UKpr15IYtcPJXuLo1L4) l34L9T9oVIxCgI1OAXO0LSrt8bKV2.ZfQNn8hdWlEQ5cR94249PDsLR, fFloatValue);
                eDuXvmY6CU2gSBBVxUQ9tBhpHJ2AAEDNW8sghc4m = l34L9T9oVIxCgI1OAXO0LSrt8bKV2.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            } else if (value instanceof Double) {
                L34L9T9oVIxCgI1O l34L9T9oVIxCgI1OAXO0LSrt8bKV3 = g8kevnL6UKpr15IYtcPJXuLo1L4.aXO0LSrt8bKV();
                double dDoubleValue = ((Number) value).doubleValue();
                l34L9T9oVIxCgI1OAXO0LSrt8bKV3.V57tEvNfxZVVcOCAOih5PKr();
                g8kevnL6UKpr15IYtcPJXuLo1L4.Ca81ebIan1u((g8kevnL6UKpr15IYtcPJXuLo1L4) l34L9T9oVIxCgI1OAXO0LSrt8bKV3.ZfQNn8hdWlEQ5cR94249PDsLR, dDoubleValue);
                eDuXvmY6CU2gSBBVxUQ9tBhpHJ2AAEDNW8sghc4m = l34L9T9oVIxCgI1OAXO0LSrt8bKV3.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            } else if (value instanceof Integer) {
                L34L9T9oVIxCgI1O l34L9T9oVIxCgI1OAXO0LSrt8bKV4 = g8kevnL6UKpr15IYtcPJXuLo1L4.aXO0LSrt8bKV();
                int iIntValue = ((Number) value).intValue();
                l34L9T9oVIxCgI1OAXO0LSrt8bKV4.V57tEvNfxZVVcOCAOih5PKr();
                g8kevnL6UKpr15IYtcPJXuLo1L4.jW7EiD0YL6xkbB158jMUzhWNWb1y((g8kevnL6UKpr15IYtcPJXuLo1L4) l34L9T9oVIxCgI1OAXO0LSrt8bKV4.ZfQNn8hdWlEQ5cR94249PDsLR, iIntValue);
                eDuXvmY6CU2gSBBVxUQ9tBhpHJ2AAEDNW8sghc4m = l34L9T9oVIxCgI1OAXO0LSrt8bKV4.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            } else if (value instanceof Long) {
                L34L9T9oVIxCgI1O l34L9T9oVIxCgI1OAXO0LSrt8bKV5 = g8kevnL6UKpr15IYtcPJXuLo1L4.aXO0LSrt8bKV();
                long jLongValue = ((Number) value).longValue();
                l34L9T9oVIxCgI1OAXO0LSrt8bKV5.V57tEvNfxZVVcOCAOih5PKr();
                g8kevnL6UKpr15IYtcPJXuLo1L4.KUYypEB4eNWOZWVDpH((g8kevnL6UKpr15IYtcPJXuLo1L4) l34L9T9oVIxCgI1OAXO0LSrt8bKV5.ZfQNn8hdWlEQ5cR94249PDsLR, jLongValue);
                eDuXvmY6CU2gSBBVxUQ9tBhpHJ2AAEDNW8sghc4m = l34L9T9oVIxCgI1OAXO0LSrt8bKV5.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            } else if (value instanceof String) {
                L34L9T9oVIxCgI1O l34L9T9oVIxCgI1OAXO0LSrt8bKV6 = g8kevnL6UKpr15IYtcPJXuLo1L4.aXO0LSrt8bKV();
                l34L9T9oVIxCgI1OAXO0LSrt8bKV6.V57tEvNfxZVVcOCAOih5PKr();
                g8kevnL6UKpr15IYtcPJXuLo1L4.q1wNbhk2O6((g8kevnL6UKpr15IYtcPJXuLo1L4) l34L9T9oVIxCgI1OAXO0LSrt8bKV6.ZfQNn8hdWlEQ5cR94249PDsLR, (String) value);
                eDuXvmY6CU2gSBBVxUQ9tBhpHJ2AAEDNW8sghc4m = l34L9T9oVIxCgI1OAXO0LSrt8bKV6.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            } else if (value instanceof Set) {
                L34L9T9oVIxCgI1O l34L9T9oVIxCgI1OAXO0LSrt8bKV7 = g8kevnL6UKpr15IYtcPJXuLo1L4.aXO0LSrt8bKV();
                c8TC5qjySF86nz8Gjjm6U c8tc5qjysf86nz8gjjm6uCa81ebIan1u = aS0YxkhIQ5lkxtzd61RUHagL.Ca81ebIan1u();
                c8tc5qjysf86nz8gjjm6uCa81ebIan1u.V57tEvNfxZVVcOCAOih5PKr();
                aS0YxkhIQ5lkxtzd61RUHagL.KUYypEB4eNWOZWVDpH((aS0YxkhIQ5lkxtzd61RUHagL) c8tc5qjysf86nz8gjjm6uCa81ebIan1u.ZfQNn8hdWlEQ5cR94249PDsLR, (Set) value);
                l34L9T9oVIxCgI1OAXO0LSrt8bKV7.V57tEvNfxZVVcOCAOih5PKr();
                g8kevnL6UKpr15IYtcPJXuLo1L4.p59rPv72J9((g8kevnL6UKpr15IYtcPJXuLo1L4) l34L9T9oVIxCgI1OAXO0LSrt8bKV7.ZfQNn8hdWlEQ5cR94249PDsLR, (aS0YxkhIQ5lkxtzd61RUHagL) c8tc5qjysf86nz8gjjm6uCa81ebIan1u.VxUQ9tBhpHJ2AAEDNW8sghc4m());
                eDuXvmY6CU2gSBBVxUQ9tBhpHJ2AAEDNW8sghc4m = l34L9T9oVIxCgI1OAXO0LSrt8bKV7.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalStateException("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                }
                L34L9T9oVIxCgI1O l34L9T9oVIxCgI1OAXO0LSrt8bKV8 = g8kevnL6UKpr15IYtcPJXuLo1L4.aXO0LSrt8bKV();
                byte[] bArr = (byte[]) value;
                uDRHTE5hsm7JpGOnK7F udrhte5hsm7jpgonk7fV57tEvNfxZVVcOCAOih5PKr = uDRHTE5hsm7JpGOnK7F.V57tEvNfxZVVcOCAOih5PKr(bArr, 0, bArr.length);
                l34L9T9oVIxCgI1OAXO0LSrt8bKV8.V57tEvNfxZVVcOCAOih5PKr();
                g8kevnL6UKpr15IYtcPJXuLo1L4.h3jnZRsdwYJfY9UhQCkbvWciwvFHv((g8kevnL6UKpr15IYtcPJXuLo1L4) l34L9T9oVIxCgI1OAXO0LSrt8bKV8.ZfQNn8hdWlEQ5cR94249PDsLR, udrhte5hsm7jpgonk7fV57tEvNfxZVVcOCAOih5PKr);
                eDuXvmY6CU2gSBBVxUQ9tBhpHJ2AAEDNW8sghc4m = l34L9T9oVIxCgI1OAXO0LSrt8bKV8.VxUQ9tBhpHJ2AAEDNW8sghc4m();
            }
            oq6kmi7oaynkkvpP59rPv72J9.getClass();
            str.getClass();
            oq6kmi7oaynkkvpP59rPv72J9.V57tEvNfxZVVcOCAOih5PKr();
            hsTJlnOZEVw2.KUYypEB4eNWOZWVDpH((hsTJlnOZEVw2) oq6kmi7oaynkkvpP59rPv72J9.ZfQNn8hdWlEQ5cR94249PDsLR).put(str, (g8kevnL6UKpr15IYtcPJXuLo1L4) eDuXvmY6CU2gSBBVxUQ9tBhpHJ2AAEDNW8sghc4m);
        }
        hsTJlnOZEVw2 hstjlnozevw2 = (hsTJlnOZEVw2) oq6kmi7oaynkkvpP59rPv72J9.VxUQ9tBhpHJ2AAEDNW8sghc4m();
        int iVxUQ9tBhpHJ2AAEDNW8sghc4m = hstjlnozevw2.VxUQ9tBhpHJ2AAEDNW8sghc4m(null);
        Logger logger = fMipVc9GFHAwh7dXz8.q1wNbhk2O6;
        if (iVxUQ9tBhpHJ2AAEDNW8sghc4m > 4096) {
            iVxUQ9tBhpHJ2AAEDNW8sghc4m = 4096;
        }
        fMipVc9GFHAwh7dXz8 fmipvc9gfhawh7dxz8 = new fMipVc9GFHAwh7dXz8(utw5qz2bv5ofu23khkul67s, iVxUQ9tBhpHJ2AAEDNW8sghc4m);
        hstjlnozevw2.zzpBGItXfub0yWj(fmipvc9gfhawh7dxz8);
        if (fmipvc9gfhawh7dxz8.HzCpKshMOoaw76hFcbOVRYMeRd > 0) {
            fmipvc9gfhawh7dxz8.Pf1HsU8AK92buCoUaexm5AC();
        }
    }

    public wg2qx8o8rURUQteWo0QkSZAxg4eSO q1wNbhk2O6(FileInputStream fileInputStream) throws kcgcwUvspdvSrLS9k {
        byte[] bArr;
        try {
            hsTJlnOZEVw2 hstjlnozevw2Ca81ebIan1u = hsTJlnOZEVw2.Ca81ebIan1u(fileInputStream);
            wg2qx8o8rURUQteWo0QkSZAxg4eSO wg2qx8o8ruruqtewo0qkszaxg4eso = new wg2qx8o8rURUQteWo0QkSZAxg4eSO(false);
            g4ffVLQQ5PDsWwHjlFY4T7cF0[] g4ffvlqq5pdswwhjlfy4t7cf0Arr = (g4ffVLQQ5PDsWwHjlFY4T7cF0[]) Arrays.copyOf(new g4ffVLQQ5PDsWwHjlFY4T7cF0[0], 0);
            ej6unYlOWMDF.pYmKDYlAmhudp(g4ffvlqq5pdswwhjlfy4t7cf0Arr, "pairs");
            wg2qx8o8ruruqtewo0qkszaxg4eso.zzpBGItXfub0yWj();
            if (g4ffvlqq5pdswwhjlfy4t7cf0Arr.length > 0) {
                g4ffVLQQ5PDsWwHjlFY4T7cF0 g4ffvlqq5pdswwhjlfy4t7cf0 = g4ffvlqq5pdswwhjlfy4t7cf0Arr[0];
                throw null;
            }
            Map mapQ1wNbhk2O6 = hstjlnozevw2Ca81ebIan1u.q1wNbhk2O6();
            ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(mapQ1wNbhk2O6, "preferencesProto.preferencesMap");
            for (Map.Entry entry : mapQ1wNbhk2O6.entrySet()) {
                String str = (String) entry.getKey();
                g8kevnL6UKpr15IYtcPJXuLo1L4 g8kevnl6ukpr15iytcpjxulo1l4 = (g8kevnL6UKpr15IYtcPJXuLo1L4) entry.getValue();
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(str, "name");
                ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(g8kevnl6ukpr15iytcpjxulo1l4, "value");
                int iPzqP2AqKW6J5PO8zCKnW = g8kevnl6ukpr15iytcpjxulo1l4.pzqP2AqKW6J5PO8zCKnW();
                switch (iPzqP2AqKW6J5PO8zCKnW == 0 ? -1 : wV7Ox0kiRQrgWEZZNfPf.VxUQ9tBhpHJ2AAEDNW8sghc4m[u9SlVAuoWhQUfJ.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(iPzqP2AqKW6J5PO8zCKnW)]) {
                    case -1:
                        throw new kcgcwUvspdvSrLS9k("Value case is null.", null);
                    case 0:
                    default:
                        throw new Eyg9qHiQ9Ki1REKbbd3J();
                    case 1:
                        wg2qx8o8ruruqtewo0qkszaxg4eso.V57tEvNfxZVVcOCAOih5PKr(new zabWiGvSFrO07AP3htLK7JkP(str), Boolean.valueOf(g8kevnl6ukpr15iytcpjxulo1l4.f6ZQsR6bPLvvCDNXOUc()));
                        break;
                    case g8kevnL6UKpr15IYtcPJXuLo1L4.FLOAT_FIELD_NUMBER /* 2 */:
                        wg2qx8o8ruruqtewo0qkszaxg4eso.V57tEvNfxZVVcOCAOih5PKr(new zabWiGvSFrO07AP3htLK7JkP(str), Float.valueOf(g8kevnl6ukpr15iytcpjxulo1l4.q11o1hieEkZDhF1MGOZI26oZiDT()));
                        break;
                    case g8kevnL6UKpr15IYtcPJXuLo1L4.INTEGER_FIELD_NUMBER /* 3 */:
                        wg2qx8o8ruruqtewo0qkszaxg4eso.V57tEvNfxZVVcOCAOih5PKr(new zabWiGvSFrO07AP3htLK7JkP(str), Double.valueOf(g8kevnl6ukpr15iytcpjxulo1l4.Irh5auREsoeV1C1RaBamlmy()));
                        break;
                    case g8kevnL6UKpr15IYtcPJXuLo1L4.LONG_FIELD_NUMBER /* 4 */:
                        wg2qx8o8ruruqtewo0qkszaxg4eso.V57tEvNfxZVVcOCAOih5PKr(new zabWiGvSFrO07AP3htLK7JkP(str), Integer.valueOf(g8kevnl6ukpr15iytcpjxulo1l4.w0Wu95l8dVNw5rZMRu()));
                        break;
                    case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_FIELD_NUMBER /* 5 */:
                        wg2qx8o8ruruqtewo0qkszaxg4eso.V57tEvNfxZVVcOCAOih5PKr(new zabWiGvSFrO07AP3htLK7JkP(str), Long.valueOf(g8kevnl6ukpr15iytcpjxulo1l4.RhfGHxtXxy0M0grmp2jkRjQg()));
                        break;
                    case g8kevnL6UKpr15IYtcPJXuLo1L4.STRING_SET_FIELD_NUMBER /* 6 */:
                        zabWiGvSFrO07AP3htLK7JkP zabwigvsfro07ap3htlk7jkp = new zabWiGvSFrO07AP3htLK7JkP(str);
                        String strQNPQb1obP7 = g8kevnl6ukpr15iytcpjxulo1l4.qNPQb1obP7();
                        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(strQNPQb1obP7, "value.string");
                        wg2qx8o8ruruqtewo0qkszaxg4eso.V57tEvNfxZVVcOCAOih5PKr(zabwigvsfro07ap3htlk7jkp, strQNPQb1obP7);
                        break;
                    case g8kevnL6UKpr15IYtcPJXuLo1L4.DOUBLE_FIELD_NUMBER /* 7 */:
                        zabWiGvSFrO07AP3htLK7JkP zabwigvsfro07ap3htlk7jkp2 = new zabWiGvSFrO07AP3htLK7JkP(str);
                        ClfGzCKqIREyDxAVtiR1 clfGzCKqIREyDxAVtiR1P59rPv72J9 = g8kevnl6ukpr15iytcpjxulo1l4.SuB3hEmTmbbRGAhtvOOmfKEon().p59rPv72J9();
                        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(clfGzCKqIREyDxAVtiR1P59rPv72J9, "value.stringSet.stringsList");
                        wg2qx8o8ruruqtewo0qkszaxg4eso.V57tEvNfxZVVcOCAOih5PKr(zabwigvsfro07ap3htlk7jkp2, gYXV3FZbh17i6ocMo1T.tpEo0fy9FaoJYrSFHRfIK6(clfGzCKqIREyDxAVtiR1P59rPv72J9));
                        break;
                    case g8kevnL6UKpr15IYtcPJXuLo1L4.BYTES_FIELD_NUMBER /* 8 */:
                        zabWiGvSFrO07AP3htLK7JkP zabwigvsfro07ap3htlk7jkp3 = new zabWiGvSFrO07AP3htLK7JkP(str);
                        uDRHTE5hsm7JpGOnK7F udrhte5hsm7jpgonk7fVBGA6pPLqSMuYGvprl270j7 = g8kevnl6ukpr15iytcpjxulo1l4.vBGA6pPLqSMuYGvprl270j7();
                        int size = udrhte5hsm7jpgonk7fVBGA6pPLqSMuYGvprl270j7.size();
                        if (size == 0) {
                            bArr = iJsJOOjKyWEygkebu5yh4.zzpBGItXfub0yWj;
                        } else {
                            byte[] bArr2 = new byte[size];
                            udrhte5hsm7jpgonk7fVBGA6pPLqSMuYGvprl270j7.ZfQNn8hdWlEQ5cR94249PDsLR(size, bArr2);
                            bArr = bArr2;
                        }
                        ej6unYlOWMDF.h3jnZRsdwYJfY9UhQCkbvWciwvFHv(bArr, "value.bytes.toByteArray()");
                        wg2qx8o8ruruqtewo0qkszaxg4eso.V57tEvNfxZVVcOCAOih5PKr(zabwigvsfro07ap3htlk7jkp3, bArr);
                        break;
                    case 9:
                        throw new kcgcwUvspdvSrLS9k("Value not set.", null);
                }
            }
            return new wg2qx8o8rURUQteWo0QkSZAxg4eSO(new LinkedHashMap(wg2qx8o8ruruqtewo0qkszaxg4eso.VxUQ9tBhpHJ2AAEDNW8sghc4m()), true);
        } catch (tabhAwpQKyJhu24Q e) {
            throw new kcgcwUvspdvSrLS9k("Unable to parse preferences proto.", e);
        }
    }

    @Override // com.vdodsodjsdt.DRNSD7OTZrolKY4iK67pQWIr
    public void zzpBGItXfub0yWj(Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ, boolean z) {
    }
}
