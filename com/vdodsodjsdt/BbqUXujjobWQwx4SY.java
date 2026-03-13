package com.vdodsodjsdt;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class BbqUXujjobWQwx4SY extends HqgfdHRFzXYO3mSc implements n52qNbrWmzyJ3ZNP4nIEjnDJFclzk, LayoutInflater.Factory2 {
    public Rect BJQHddi0Plr5ElWetCyaixWOg9;
    public GHjuTOKsU93p3o6Pd0TxhwLWCTN Ca81ebIan1u;
    public boolean CixTK5ZX8oWXHz34qHYV;
    public wPzckzzcoD GE1sqSYiEYQO2ew7WEZwTtUeS5;
    public int H2VFYNJEVGAX;
    public boolean HVEwbdULInpTNa0IG;
    public KoccBHOLe4XJgL Irh5auREsoeV1C1RaBamlmy;
    public Configuration ItrQwCXbty5PZtje5JS;
    public boolean JUdwvN8LfOMa;
    public final Object KUYypEB4eNWOZWVDpH;
    public boolean KYZ9RyuOc42A2J;
    public boolean L8DMw02rUTs2w;
    public View O1xDAlBZZlZdoEf747lCFHld;
    public BOLnrr2jCIFL4gTrjk5BSGxFMgD9 RhfGHxtXxy0M0grmp2jkRjQg;
    public qmcPqJNTxlBY TaDO7ogis3aEiWEtq;
    public boolean TqcnImqkSWIKht;
    public Wi6Xv9fVcEv2ynXTQIkU[] YdNRGRc4rly;
    public ViewGroup aXO0LSrt8bKV;
    public boolean bjhcQ0u7VT2OYYrwk96HrWoN;
    public boolean d9zDyyznnp3oaDT1Ug;
    public b7tXVJgFVKMR70Bq4h4cKeMdWq f6ZQsR6bPLvvCDNXOUc;
    public boolean gBaBUmihn5l4u;
    public final Object h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
    public final int hKs1wlZyvtUNaW1f5ABIGacfPcvX;
    public boolean iKANjmyTSxO6v6UuLPdu7DxOjlS;
    public CharSequence jW7EiD0YL6xkbB158jMUzhWNWb1y;
    public uQVzckisSl8 ko09zE6UAgwkV;
    public boolean lQ0rO9lhQIyVe7Rp6;
    public S6di43kkchb2oBOK mhUCRR8ceqc7mAozW;
    public Window p59rPv72J9;
    public OnBackInvokedCallback p6bBrs4p3Ly;
    public L6YGERc84Mt1k8Qot pYmKDYlAmhudp;
    public boolean pzqP2AqKW6J5PO8zCKnW;
    public ActionBarContextView q11o1hieEkZDhF1MGOZI26oZiDT;
    public final Context q1wNbhk2O6;
    public boolean qygqjTppWwx992;
    public OnBackInvokedDispatcher rE05n5RsRkyWKIeA9cmLXAKv4Hze;
    public boolean rERAmyEtGV6ANGszuKcQI;
    public Rect tFRdVJAePmTx77bP7FAN0uI;
    public qmcPqJNTxlBY vBGA6pPLqSMuYGvprl270j7;
    public TextView vE4yDIjexsP2lGjLaTcB;
    public int vXWl0o6I4U59CgHs9;
    public PopupWindow w0Wu95l8dVNw5rZMRu;
    public Wi6Xv9fVcEv2ynXTQIkU wRCD0SdqWCowdYU7bmzN;
    public int wdI7vzA3Qmcwd;
    public boolean y1NaPKTl7R18DOr6e8i5;
    public boolean ymT6yQrus3w;
    public wPzckzzcoD zOk739gUM7zIZC25HHUxoiyixWFjn;
    public static final sSTjsLE9Ugp7iXfnwi18Akn1Jt ubNpdCC1pl7L = new sSTjsLE9Ugp7iXfnwi18Akn1Jt(0);
    public static final int[] wR7sbzHKf9hYV1lxoS6nqyszepWvN = {android.R.attr.windowBackground};
    public static final boolean HAPpjhiCsV9ONY23505HCBI9IX = !"robolectric".equals(Build.FINGERPRINT);
    public d9uIUa0qhR0HmxFMet qNPQb1obP7 = null;
    public final boolean SuB3hEmTmbbRGAhtvOOmfKEon = true;
    public final BOLnrr2jCIFL4gTrjk5BSGxFMgD9 Z1FjjMJ0suz8AFI7gsA4GDLMXv = new BOLnrr2jCIFL4gTrjk5BSGxFMgD9(this, 0);

    public BbqUXujjobWQwx4SY(Context context, Window window, oMWxlXM7wVUhp72H4IDfzeCn7FdZ omwxlxm7wvuhp72h4idfzecn7fdz, Object obj) {
        zf8a67a5ZO524dLUgOFxsfO zf8a67a5zo524dlugofxsfo = null;
        this.hKs1wlZyvtUNaW1f5ABIGacfPcvX = -100;
        this.q1wNbhk2O6 = context;
        this.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = omwxlxm7wvuhp72h4idfzecn7fdz;
        this.KUYypEB4eNWOZWVDpH = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof zf8a67a5ZO524dLUgOFxsfO)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        zf8a67a5zo524dlugofxsfo = (zf8a67a5ZO524dLUgOFxsfO) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (zf8a67a5zo524dlugofxsfo != null) {
                this.hKs1wlZyvtUNaW1f5ABIGacfPcvX = ((BbqUXujjobWQwx4SY) zf8a67a5zo524dlugofxsfo.HzCpKshMOoaw76hFcbOVRYMeRd()).hKs1wlZyvtUNaW1f5ABIGacfPcvX;
            }
        }
        if (this.hKs1wlZyvtUNaW1f5ABIGacfPcvX == -100) {
            String name = this.KUYypEB4eNWOZWVDpH.getClass().getName();
            sSTjsLE9Ugp7iXfnwi18Akn1Jt sstjsle9ugp7ixfnwi18akn1jt = ubNpdCC1pl7L;
            Integer num = (Integer) sstjsle9ugp7ixfnwi18akn1jt.get(name);
            if (num != null) {
                this.hKs1wlZyvtUNaW1f5ABIGacfPcvX = num.intValue();
                sstjsle9ugp7ixfnwi18akn1jt.remove(this.KUYypEB4eNWOZWVDpH.getClass().getName());
            }
        }
        if (window != null) {
            p59rPv72J9(window);
        }
        aMdFkGJAdbLdAI00ZfKC7DaJw3k2.ZfQNn8hdWlEQ5cR94249PDsLR();
    }

    public static BIajpH9rKfhy3tkxKeGET7A9E5xV Ca81ebIan1u(Context context) {
        BIajpH9rKfhy3tkxKeGET7A9E5xV bIajpH9rKfhy3tkxKeGET7A9E5xV;
        BIajpH9rKfhy3tkxKeGET7A9E5xV bIajpH9rKfhy3tkxKeGET7A9E5xV2;
        if (Build.VERSION.SDK_INT >= 33 || (bIajpH9rKfhy3tkxKeGET7A9E5xV = HqgfdHRFzXYO3mSc.LaeGQIruHQu81hfJldjMOQSVblH3x) == null) {
            return null;
        }
        zCWUDzxibeVs zcwudzxibevs = bIajpH9rKfhy3tkxKeGET7A9E5xV.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        BIajpH9rKfhy3tkxKeGET7A9E5xV bIajpH9rKfhy3tkxKeGET7A9E5xVZzpBGItXfub0yWj = U3aqd5paMeprrrQlmVL5ISZ.zzpBGItXfub0yWj(context.getApplicationContext().getResources().getConfiguration());
        if (zcwudzxibevs.VxUQ9tBhpHJ2AAEDNW8sghc4m.isEmpty()) {
            bIajpH9rKfhy3tkxKeGET7A9E5xV2 = BIajpH9rKfhy3tkxKeGET7A9E5xV.zzpBGItXfub0yWj;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < bIajpH9rKfhy3tkxKeGET7A9E5xVZzpBGItXfub0yWj.VxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m.size() + zcwudzxibevs.VxUQ9tBhpHJ2AAEDNW8sghc4m.size()) {
                Locale locale = i < zcwudzxibevs.VxUQ9tBhpHJ2AAEDNW8sghc4m.size() ? zcwudzxibevs.VxUQ9tBhpHJ2AAEDNW8sghc4m.get(i) : bIajpH9rKfhy3tkxKeGET7A9E5xVZzpBGItXfub0yWj.VxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m.get(i - zcwudzxibevs.VxUQ9tBhpHJ2AAEDNW8sghc4m.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            bIajpH9rKfhy3tkxKeGET7A9E5xV2 = new BIajpH9rKfhy3tkxKeGET7A9E5xV(new zCWUDzxibeVs(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return bIajpH9rKfhy3tkxKeGET7A9E5xV2.VxUQ9tBhpHJ2AAEDNW8sghc4m.VxUQ9tBhpHJ2AAEDNW8sghc4m.isEmpty() ? bIajpH9rKfhy3tkxKeGET7A9E5xVZzpBGItXfub0yWj : bIajpH9rKfhy3tkxKeGET7A9E5xV2;
    }

    public static Configuration jW7EiD0YL6xkbB158jMUzhWNWb1y(Context context, int i, BIajpH9rKfhy3tkxKeGET7A9E5xV bIajpH9rKfhy3tkxKeGET7A9E5xV, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (bIajpH9rKfhy3tkxKeGET7A9E5xV != null) {
            U3aqd5paMeprrrQlmVL5ISZ.ZfQNn8hdWlEQ5cR94249PDsLR(configuration2, bIajpH9rKfhy3tkxKeGET7A9E5xV);
        }
        return configuration2;
    }

    @Override // com.vdodsodjsdt.n52qNbrWmzyJ3ZNP4nIEjnDJFclzk
    public final boolean GI83zq0G8e7zkn(Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ, MenuItem menuItem) {
        Wi6Xv9fVcEv2ynXTQIkU wi6Xv9fVcEv2ynXTQIkU;
        Window.Callback callback = this.p59rPv72J9.getCallback();
        if (callback != null && !this.JUdwvN8LfOMa) {
            Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQHzCpKshMOoaw76hFcbOVRYMeRd = stuu2Qyz6BSCKFEomt5b51vUnV1HQ.HzCpKshMOoaw76hFcbOVRYMeRd();
            Wi6Xv9fVcEv2ynXTQIkU[] wi6Xv9fVcEv2ynXTQIkUArr = this.YdNRGRc4rly;
            int length = wi6Xv9fVcEv2ynXTQIkUArr != null ? wi6Xv9fVcEv2ynXTQIkUArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    wi6Xv9fVcEv2ynXTQIkU = wi6Xv9fVcEv2ynXTQIkUArr[i];
                    if (wi6Xv9fVcEv2ynXTQIkU != null && wi6Xv9fVcEv2ynXTQIkU.NSjgqmGjEzuugn2SsG1mZFP == stuu2Qyz6BSCKFEomt5b51vUnV1HQHzCpKshMOoaw76hFcbOVRYMeRd) {
                        break;
                    }
                    i++;
                } else {
                    wi6Xv9fVcEv2ynXTQIkU = null;
                    break;
                }
            }
            if (wi6Xv9fVcEv2ynXTQIkU != null) {
                return callback.onMenuItemSelected(wi6Xv9fVcEv2ynXTQIkU.VxUQ9tBhpHJ2AAEDNW8sghc4m, menuItem);
            }
        }
        return false;
    }

    public final void HVEwbdULInpTNa0IG() {
        if (this.pzqP2AqKW6J5PO8zCKnW) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @Override // com.vdodsodjsdt.HqgfdHRFzXYO3mSc
    public final void HzCpKshMOoaw76hFcbOVRYMeRd(View view, ViewGroup.LayoutParams layoutParams) {
        TaDO7ogis3aEiWEtq();
        ViewGroup viewGroup = (ViewGroup) this.aXO0LSrt8bKV.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.Ca81ebIan1u.VxUQ9tBhpHJ2AAEDNW8sghc4m(this.p59rPv72J9.getCallback());
    }

    public final void Irh5auREsoeV1C1RaBamlmy() {
        if (this.p59rPv72J9 == null) {
            Object obj = this.KUYypEB4eNWOZWVDpH;
            if (obj instanceof Activity) {
                p59rPv72J9(((Activity) obj).getWindow());
            }
        }
        if (this.p59rPv72J9 == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    @Override // com.vdodsodjsdt.HqgfdHRFzXYO3mSc
    public final void KUYypEB4eNWOZWVDpH(CharSequence charSequence) {
        this.jW7EiD0YL6xkbB158jMUzhWNWb1y = charSequence;
        b7tXVJgFVKMR70Bq4h4cKeMdWq b7txvjgfvkmr70bq4h4ckemdwq = this.f6ZQsR6bPLvvCDNXOUc;
        if (b7txvjgfvkmr70bq4h4ckemdwq != null) {
            b7txvjgfvkmr70bq4h4ckemdwq.setWindowTitle(charSequence);
            return;
        }
        L6YGERc84Mt1k8Qot l6YGERc84Mt1k8Qot = this.pYmKDYlAmhudp;
        if (l6YGERc84Mt1k8Qot == null) {
            TextView textView = this.vE4yDIjexsP2lGjLaTcB;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        oD78NtkeSuRtaWUfMs1KgLg1WoWNL od78ntkesurtawufms1kglg1wownl = (oD78NtkeSuRtaWUfMs1KgLg1WoWNL) l6YGERc84Mt1k8Qot.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
        if (od78ntkesurtawufms1kglg1wownl.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
            return;
        }
        Toolbar toolbar = od78ntkesurtawufms1kglg1wownl.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        od78ntkesurtawufms1kglg1wownl.NSjgqmGjEzuugn2SsG1mZFP = charSequence;
        if ((od78ntkesurtawufms1kglg1wownl.zzpBGItXfub0yWj & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (od78ntkesurtawufms1kglg1wownl.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
                xb0r6yEzq0tw9m7nTWG5BFR8.p59rPv72J9(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // com.vdodsodjsdt.HqgfdHRFzXYO3mSc
    public final void M9e7PWhFYLD2lOGMker(View view) {
        TaDO7ogis3aEiWEtq();
        ViewGroup viewGroup = (ViewGroup) this.aXO0LSrt8bKV.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.Ca81ebIan1u.VxUQ9tBhpHJ2AAEDNW8sghc4m(this.p59rPv72J9.getCallback());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        if (r6.NSjgqmGjEzuugn2SsG1mZFP() != false) goto L20;
     */
    @Override // com.vdodsodjsdt.n52qNbrWmzyJ3ZNP4nIEjnDJFclzk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void NSjgqmGjEzuugn2SsG1mZFP(com.vdodsodjsdt.Stuu2Qyz6BSCKFEomt5b51vUnV1HQ r6) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.BbqUXujjobWQwx4SY.NSjgqmGjEzuugn2SsG1mZFP(com.vdodsodjsdt.Stuu2Qyz6BSCKFEomt5b51vUnV1HQ):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean O1xDAlBZZlZdoEf747lCFHld(com.vdodsodjsdt.Wi6Xv9fVcEv2ynXTQIkU r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.BbqUXujjobWQwx4SY.O1xDAlBZZlZdoEf747lCFHld(com.vdodsodjsdt.Wi6Xv9fVcEv2ynXTQIkU, android.view.KeyEvent):boolean");
    }

    public final void RhfGHxtXxy0M0grmp2jkRjQg() {
        TaDO7ogis3aEiWEtq();
        if (this.qygqjTppWwx992 && this.pYmKDYlAmhudp == null) {
            Object obj = this.KUYypEB4eNWOZWVDpH;
            if (obj instanceof Activity) {
                this.pYmKDYlAmhudp = new L6YGERc84Mt1k8Qot((Activity) obj, this.iKANjmyTSxO6v6UuLPdu7DxOjlS);
            } else if (obj instanceof Dialog) {
                this.pYmKDYlAmhudp = new L6YGERc84Mt1k8Qot((Dialog) obj);
            }
            L6YGERc84Mt1k8Qot l6YGERc84Mt1k8Qot = this.pYmKDYlAmhudp;
            if (l6YGERc84Mt1k8Qot != null) {
                l6YGERc84Mt1k8Qot.wR7sbzHKf9hYV1lxoS6nqyszepWvN(this.bjhcQ0u7VT2OYYrwk96HrWoN);
            }
        }
    }

    public final int SuB3hEmTmbbRGAhtvOOmfKEon(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.GE1sqSYiEYQO2ew7WEZwTtUeS5 == null) {
                            this.GE1sqSYiEYQO2ew7WEZwTtUeS5 = new wPzckzzcoD(this, context);
                        }
                        return this.GE1sqSYiEYQO2ew7WEZwTtUeS5.zIvmSL0wzmmKGc3X39b2Gw2mUGE();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return q11o1hieEkZDhF1MGOZI26oZiDT(context).zIvmSL0wzmmKGc3X39b2Gw2mUGE();
                }
            }
            return i;
        }
        return -1;
    }

    public final void TaDO7ogis3aEiWEtq() {
        ViewGroup viewGroup;
        if (this.pzqP2AqKW6J5PO8zCKnW) {
            return;
        }
        Context context = this.q1wNbhk2O6;
        int[] iArr = AuEvIFo0QoYm1PHNG.M9e7PWhFYLD2lOGMker;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!typedArrayObtainStyledAttributes.hasValue(117)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        int i = 0;
        int i2 = 1;
        if (typedArrayObtainStyledAttributes.getBoolean(126, false)) {
            zIvmSL0wzmmKGc3X39b2Gw2mUGE(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(117, false)) {
            zIvmSL0wzmmKGc3X39b2Gw2mUGE(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(118, false)) {
            zIvmSL0wzmmKGc3X39b2Gw2mUGE(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(119, false)) {
            zIvmSL0wzmmKGc3X39b2Gw2mUGE(10);
        }
        this.d9zDyyznnp3oaDT1Ug = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        Irh5auREsoeV1C1RaBamlmy();
        this.p59rPv72J9.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        if (this.CixTK5ZX8oWXHz34qHYV) {
            viewGroup = this.TqcnImqkSWIKht ? (ViewGroup) layoutInflaterFrom.inflate(R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.d9zDyyznnp3oaDT1Ug) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.iKANjmyTSxO6v6UuLPdu7DxOjlS = false;
            this.qygqjTppWwx992 = false;
        } else if (this.qygqjTppWwx992) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new KCzdBImvv2(context, typedValue.resourceId) : context).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
            b7tXVJgFVKMR70Bq4h4cKeMdWq b7txvjgfvkmr70bq4h4ckemdwq = (b7tXVJgFVKMR70Bq4h4cKeMdWq) viewGroup.findViewById(R.id.decor_content_parent);
            this.f6ZQsR6bPLvvCDNXOUc = b7txvjgfvkmr70bq4h4ckemdwq;
            b7txvjgfvkmr70bq4h4ckemdwq.setWindowCallback(this.p59rPv72J9.getCallback());
            if (this.iKANjmyTSxO6v6UuLPdu7DxOjlS) {
                ((ActionBarOverlayLayout) this.f6ZQsR6bPLvvCDNXOUc).M9e7PWhFYLD2lOGMker(109);
            }
            if (this.HVEwbdULInpTNa0IG) {
                ((ActionBarOverlayLayout) this.f6ZQsR6bPLvvCDNXOUc).M9e7PWhFYLD2lOGMker(2);
            }
            if (this.y1NaPKTl7R18DOr6e8i5) {
                ((ActionBarOverlayLayout) this.f6ZQsR6bPLvvCDNXOUc).M9e7PWhFYLD2lOGMker(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.qygqjTppWwx992 + ", windowActionBarOverlay: " + this.iKANjmyTSxO6v6UuLPdu7DxOjlS + ", android:windowIsFloating: " + this.d9zDyyznnp3oaDT1Ug + ", windowActionModeOverlay: " + this.TqcnImqkSWIKht + ", windowNoTitle: " + this.CixTK5ZX8oWXHz34qHYV + " }");
        }
        qmcPqJNTxlBY qmcpqjntxlby = new qmcPqJNTxlBY(this, i);
        WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        lJgFFp37ou.M9e7PWhFYLD2lOGMker(viewGroup, qmcpqjntxlby);
        if (this.f6ZQsR6bPLvvCDNXOUc == null) {
            this.vE4yDIjexsP2lGjLaTcB = (TextView) viewGroup.findViewById(R.id.title);
        }
        boolean z = TbV4rkOPds9wwfLx.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.p59rPv72J9.findViewById(android.R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(android.R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.p59rPv72J9.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new qmcPqJNTxlBY(this, i2));
        this.aXO0LSrt8bKV = viewGroup;
        Object obj = this.KUYypEB4eNWOZWVDpH;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.jW7EiD0YL6xkbB158jMUzhWNWb1y;
        if (!TextUtils.isEmpty(title)) {
            b7tXVJgFVKMR70Bq4h4cKeMdWq b7txvjgfvkmr70bq4h4ckemdwq2 = this.f6ZQsR6bPLvvCDNXOUc;
            if (b7txvjgfvkmr70bq4h4ckemdwq2 != null) {
                b7txvjgfvkmr70bq4h4ckemdwq2.setWindowTitle(title);
            } else {
                L6YGERc84Mt1k8Qot l6YGERc84Mt1k8Qot = this.pYmKDYlAmhudp;
                if (l6YGERc84Mt1k8Qot != null) {
                    oD78NtkeSuRtaWUfMs1KgLg1WoWNL od78ntkesurtawufms1kglg1wownl = (oD78NtkeSuRtaWUfMs1KgLg1WoWNL) l6YGERc84Mt1k8Qot.h3jnZRsdwYJfY9UhQCkbvWciwvFHv;
                    if (!od78ntkesurtawufms1kglg1wownl.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
                        Toolbar toolbar = od78ntkesurtawufms1kglg1wownl.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                        od78ntkesurtawufms1kglg1wownl.NSjgqmGjEzuugn2SsG1mZFP = title;
                        if ((od78ntkesurtawufms1kglg1wownl.zzpBGItXfub0yWj & 8) != 0) {
                            toolbar.setTitle(title);
                            if (od78ntkesurtawufms1kglg1wownl.ZLZeBXTMq0zDztBxtRTuCHrapQ) {
                                xb0r6yEzq0tw9m7nTWG5BFR8.p59rPv72J9(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.vE4yDIjexsP2lGjLaTcB;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.aXO0LSrt8bKV.findViewById(android.R.id.content);
        View decorView = this.p59rPv72J9.getDecorView();
        contentFrameLayout2.GI83zq0G8e7zkn.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        typedArrayObtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        typedArrayObtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes2.hasValue(122)) {
            typedArrayObtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(123)) {
            typedArrayObtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(120)) {
            typedArrayObtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes2.hasValue(121)) {
            typedArrayObtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.pzqP2AqKW6J5PO8zCKnW = true;
        Wi6Xv9fVcEv2ynXTQIkU wi6Xv9fVcEv2ynXTQIkUW0Wu95l8dVNw5rZMRu = w0Wu95l8dVNw5rZMRu(0);
        if (this.JUdwvN8LfOMa || wi6Xv9fVcEv2ynXTQIkUW0Wu95l8dVNw5rZMRu.NSjgqmGjEzuugn2SsG1mZFP != null) {
            return;
        }
        qNPQb1obP7(108);
    }

    @Override // com.vdodsodjsdt.HqgfdHRFzXYO3mSc
    public final void V57tEvNfxZVVcOCAOih5PKr() {
        String strPzqP2AqKW6J5PO8zCKnW;
        this.L8DMw02rUTs2w = true;
        q1wNbhk2O6(false, true);
        Irh5auREsoeV1C1RaBamlmy();
        Object obj = this.KUYypEB4eNWOZWVDpH;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    strPzqP2AqKW6J5PO8zCKnW = F44whnLsbQ.pzqP2AqKW6J5PO8zCKnW(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                strPzqP2AqKW6J5PO8zCKnW = null;
            }
            if (strPzqP2AqKW6J5PO8zCKnW != null) {
                L6YGERc84Mt1k8Qot l6YGERc84Mt1k8Qot = this.pYmKDYlAmhudp;
                if (l6YGERc84Mt1k8Qot == null) {
                    this.bjhcQ0u7VT2OYYrwk96HrWoN = true;
                } else {
                    l6YGERc84Mt1k8Qot.wR7sbzHKf9hYV1lxoS6nqyszepWvN(true);
                }
            }
            synchronized (HqgfdHRFzXYO3mSc.M9e7PWhFYLD2lOGMker) {
                HqgfdHRFzXYO3mSc.LaeGQIruHQu81hfJldjMOQSVblH3x(this);
                HqgfdHRFzXYO3mSc.GI83zq0G8e7zkn.add(new WeakReference(this));
            }
        }
        this.ItrQwCXbty5PZtje5JS = new Configuration(this.q1wNbhk2O6.getResources().getConfiguration());
        this.lQ0rO9lhQIyVe7Rp6 = true;
    }

    @Override // com.vdodsodjsdt.HqgfdHRFzXYO3mSc
    public final void VxUQ9tBhpHJ2AAEDNW8sghc4m() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.q1wNbhk2O6);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof BbqUXujjobWQwx4SY) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // com.vdodsodjsdt.HqgfdHRFzXYO3mSc
    public final void ZLZeBXTMq0zDztBxtRTuCHrapQ(int i) {
        TaDO7ogis3aEiWEtq();
        ViewGroup viewGroup = (ViewGroup) this.aXO0LSrt8bKV.findViewById(android.R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.q1wNbhk2O6).inflate(i, viewGroup);
        this.Ca81ebIan1u.VxUQ9tBhpHJ2AAEDNW8sghc4m(this.p59rPv72J9.getCallback());
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // com.vdodsodjsdt.HqgfdHRFzXYO3mSc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void ZfQNn8hdWlEQ5cR94249PDsLR() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.KUYypEB4eNWOZWVDpH
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = com.vdodsodjsdt.HqgfdHRFzXYO3mSc.M9e7PWhFYLD2lOGMker
            monitor-enter(r0)
            com.vdodsodjsdt.HqgfdHRFzXYO3mSc.LaeGQIruHQu81hfJldjMOQSVblH3x(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.rERAmyEtGV6ANGszuKcQI
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.p59rPv72J9
            android.view.View r0 = r0.getDecorView()
            com.vdodsodjsdt.BOLnrr2jCIFL4gTrjk5BSGxFMgD9 r1 = r3.Z1FjjMJ0suz8AFI7gsA4GDLMXv
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.JUdwvN8LfOMa = r0
            int r0 = r3.hKs1wlZyvtUNaW1f5ABIGacfPcvX
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.KUYypEB4eNWOZWVDpH
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            com.vdodsodjsdt.sSTjsLE9Ugp7iXfnwi18Akn1Jt r0 = com.vdodsodjsdt.BbqUXujjobWQwx4SY.ubNpdCC1pl7L
            java.lang.Object r1 = r3.KUYypEB4eNWOZWVDpH
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.hKs1wlZyvtUNaW1f5ABIGacfPcvX
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            com.vdodsodjsdt.sSTjsLE9Ugp7iXfnwi18Akn1Jt r0 = com.vdodsodjsdt.BbqUXujjobWQwx4SY.ubNpdCC1pl7L
            java.lang.Object r1 = r3.KUYypEB4eNWOZWVDpH
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            com.vdodsodjsdt.wPzckzzcoD r0 = r3.zOk739gUM7zIZC25HHUxoiyixWFjn
            if (r0 == 0) goto L63
            r0.V57tEvNfxZVVcOCAOih5PKr()
        L63:
            com.vdodsodjsdt.wPzckzzcoD r0 = r3.GE1sqSYiEYQO2ew7WEZwTtUeS5
            if (r0 == 0) goto L6a
            r0.V57tEvNfxZVVcOCAOih5PKr()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.BbqUXujjobWQwx4SY.ZfQNn8hdWlEQ5cR94249PDsLR():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0176, code lost:
    
        if (r2.NSjgqmGjEzuugn2SsG1mZFP.getCount() > 0) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void aXO0LSrt8bKV(com.vdodsodjsdt.Wi6Xv9fVcEv2ynXTQIkU r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.BbqUXujjobWQwx4SY.aXO0LSrt8bKV(com.vdodsodjsdt.Wi6Xv9fVcEv2ynXTQIkU, android.view.KeyEvent):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f6ZQsR6bPLvvCDNXOUc(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instruction units count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.BbqUXujjobWQwx4SY.f6ZQsR6bPLvvCDNXOUc(android.view.KeyEvent):boolean");
    }

    public final void h3jnZRsdwYJfY9UhQCkbvWciwvFHv(int i, Wi6Xv9fVcEv2ynXTQIkU wi6Xv9fVcEv2ynXTQIkU, Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ) {
        if (stuu2Qyz6BSCKFEomt5b51vUnV1HQ == null) {
            if (wi6Xv9fVcEv2ynXTQIkU == null && i >= 0) {
                Wi6Xv9fVcEv2ynXTQIkU[] wi6Xv9fVcEv2ynXTQIkUArr = this.YdNRGRc4rly;
                if (i < wi6Xv9fVcEv2ynXTQIkUArr.length) {
                    wi6Xv9fVcEv2ynXTQIkU = wi6Xv9fVcEv2ynXTQIkUArr[i];
                }
            }
            if (wi6Xv9fVcEv2ynXTQIkU != null) {
                stuu2Qyz6BSCKFEomt5b51vUnV1HQ = wi6Xv9fVcEv2ynXTQIkU.NSjgqmGjEzuugn2SsG1mZFP;
            }
        }
        if ((wi6Xv9fVcEv2ynXTQIkU == null || wi6Xv9fVcEv2ynXTQIkU.q1wNbhk2O6) && !this.JUdwvN8LfOMa) {
            GHjuTOKsU93p3o6Pd0TxhwLWCTN gHjuTOKsU93p3o6Pd0TxhwLWCTN = this.Ca81ebIan1u;
            Window.Callback callback = this.p59rPv72J9.getCallback();
            gHjuTOKsU93p3o6Pd0TxhwLWCTN.getClass();
            try {
                gHjuTOKsU93p3o6Pd0TxhwLWCTN.zIvmSL0wzmmKGc3X39b2Gw2mUGE = true;
                callback.onPanelClosed(i, stuu2Qyz6BSCKFEomt5b51vUnV1HQ);
            } finally {
                gHjuTOKsU93p3o6Pd0TxhwLWCTN.zIvmSL0wzmmKGc3X39b2Gw2mUGE = false;
            }
        }
    }

    public final void ko09zE6UAgwkV(Wi6Xv9fVcEv2ynXTQIkU wi6Xv9fVcEv2ynXTQIkU, boolean z) {
        Os0YjjlP0Nm8TZXIoEcgDYfM os0YjjlP0Nm8TZXIoEcgDYfM;
        b7tXVJgFVKMR70Bq4h4cKeMdWq b7txvjgfvkmr70bq4h4ckemdwq;
        JaGiaIfgE4oZFS8GScUJb jaGiaIfgE4oZFS8GScUJb;
        if (z && wi6Xv9fVcEv2ynXTQIkU.VxUQ9tBhpHJ2AAEDNW8sghc4m == 0 && (b7txvjgfvkmr70bq4h4ckemdwq = this.f6ZQsR6bPLvvCDNXOUc) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) b7txvjgfvkmr70bq4h4ckemdwq;
            actionBarOverlayLayout.HzCpKshMOoaw76hFcbOVRYMeRd();
            ActionMenuView actionMenuView = ((oD78NtkeSuRtaWUfMs1KgLg1WoWNL) actionBarOverlayLayout.ZLZeBXTMq0zDztBxtRTuCHrapQ).VxUQ9tBhpHJ2AAEDNW8sghc4m.V57tEvNfxZVVcOCAOih5PKr;
            if (actionMenuView != null && (jaGiaIfgE4oZFS8GScUJb = actionMenuView.TaDO7ogis3aEiWEtq) != null && jaGiaIfgE4oZFS8GScUJb.NSjgqmGjEzuugn2SsG1mZFP()) {
                pYmKDYlAmhudp(wi6Xv9fVcEv2ynXTQIkU.NSjgqmGjEzuugn2SsG1mZFP);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.q1wNbhk2O6.getSystemService("window");
        if (windowManager != null && wi6Xv9fVcEv2ynXTQIkU.q1wNbhk2O6 && (os0YjjlP0Nm8TZXIoEcgDYfM = wi6Xv9fVcEv2ynXTQIkU.LaeGQIruHQu81hfJldjMOQSVblH3x) != null) {
            windowManager.removeView(os0YjjlP0Nm8TZXIoEcgDYfM);
            if (z) {
                h3jnZRsdwYJfY9UhQCkbvWciwvFHv(wi6Xv9fVcEv2ynXTQIkU.VxUQ9tBhpHJ2AAEDNW8sghc4m, wi6Xv9fVcEv2ynXTQIkU, null);
            }
        }
        wi6Xv9fVcEv2ynXTQIkU.HzCpKshMOoaw76hFcbOVRYMeRd = false;
        wi6Xv9fVcEv2ynXTQIkU.KUYypEB4eNWOZWVDpH = false;
        wi6Xv9fVcEv2ynXTQIkU.q1wNbhk2O6 = false;
        wi6Xv9fVcEv2ynXTQIkU.zIvmSL0wzmmKGc3X39b2Gw2mUGE = null;
        wi6Xv9fVcEv2ynXTQIkU.p59rPv72J9 = true;
        if (this.wRCD0SdqWCowdYU7bmzN == wi6Xv9fVcEv2ynXTQIkU) {
            this.wRCD0SdqWCowdYU7bmzN = null;
        }
        if (wi6Xv9fVcEv2ynXTQIkU.VxUQ9tBhpHJ2AAEDNW8sghc4m == 0) {
            y1NaPKTl7R18DOr6e8i5();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:117:0x01e3
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View r9, java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instruction units count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.BbqUXujjobWQwx4SY.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p59rPv72J9(android.view.Window r8) {
        /*
            r7 = this;
            java.lang.String r0 = "AppCompat has already installed itself into the Window"
            android.view.Window r1 = r7.p59rPv72J9
            if (r1 != 0) goto L80
            android.view.Window$Callback r1 = r8.getCallback()
            boolean r2 = r1 instanceof com.vdodsodjsdt.GHjuTOKsU93p3o6Pd0TxhwLWCTN
            if (r2 != 0) goto L7a
            com.vdodsodjsdt.GHjuTOKsU93p3o6Pd0TxhwLWCTN r0 = new com.vdodsodjsdt.GHjuTOKsU93p3o6Pd0TxhwLWCTN
            r0.<init>(r7, r1)
            r7.Ca81ebIan1u = r0
            r8.setCallback(r0)
            android.content.Context r0 = r7.q1wNbhk2O6
            int[] r1 = com.vdodsodjsdt.BbqUXujjobWQwx4SY.wR7sbzHKf9hYV1lxoS6nqyszepWvN
            r2 = 0
            android.content.res.TypedArray r1 = r0.obtainStyledAttributes(r2, r1)
            r3 = 0
            boolean r4 = r1.hasValue(r3)
            if (r4 == 0) goto L3f
            int r3 = r1.getResourceId(r3, r3)
            if (r3 == 0) goto L3f
            com.vdodsodjsdt.aMdFkGJAdbLdAI00ZfKC7DaJw3k2 r4 = com.vdodsodjsdt.aMdFkGJAdbLdAI00ZfKC7DaJw3k2.VxUQ9tBhpHJ2AAEDNW8sghc4m()
            monitor-enter(r4)
            com.vdodsodjsdt.ZSO61OFnW5yAt r5 = r4.VxUQ9tBhpHJ2AAEDNW8sghc4m     // Catch: java.lang.Throwable -> L3c
            r6 = 1
            android.graphics.drawable.Drawable r0 = r5.ZfQNn8hdWlEQ5cR94249PDsLR(r0, r3, r6)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r4)
            goto L40
        L3c:
            r8 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3c
            throw r8
        L3f:
            r0 = r2
        L40:
            if (r0 == 0) goto L45
            r8.setBackgroundDrawable(r0)
        L45:
            r1.recycle()
            r7.p59rPv72J9 = r8
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r8 < r0) goto L79
            android.window.OnBackInvokedDispatcher r8 = r7.rE05n5RsRkyWKIeA9cmLXAKv4Hze
            if (r8 != 0) goto L79
            java.lang.Object r0 = r7.KUYypEB4eNWOZWVDpH
            if (r8 == 0) goto L61
            android.window.OnBackInvokedCallback r1 = r7.p6bBrs4p3Ly
            if (r1 == 0) goto L61
            com.vdodsodjsdt.xWI98Utc6yBpIJWt.V57tEvNfxZVVcOCAOih5PKr(r8, r1)
            r7.p6bBrs4p3Ly = r2
        L61:
            boolean r8 = r0 instanceof android.app.Activity
            if (r8 == 0) goto L74
            android.app.Activity r0 = (android.app.Activity) r0
            android.view.Window r8 = r0.getWindow()
            if (r8 == 0) goto L74
            android.window.OnBackInvokedDispatcher r8 = com.vdodsodjsdt.xWI98Utc6yBpIJWt.VxUQ9tBhpHJ2AAEDNW8sghc4m(r0)
            r7.rE05n5RsRkyWKIeA9cmLXAKv4Hze = r8
            goto L76
        L74:
            r7.rE05n5RsRkyWKIeA9cmLXAKv4Hze = r2
        L76:
            r7.y1NaPKTl7R18DOr6e8i5()
        L79:
            return
        L7a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r0)
            throw r8
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.BbqUXujjobWQwx4SY.p59rPv72J9(android.view.Window):void");
    }

    public final void pYmKDYlAmhudp(Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ) {
        JaGiaIfgE4oZFS8GScUJb jaGiaIfgE4oZFS8GScUJb;
        if (this.ymT6yQrus3w) {
            return;
        }
        this.ymT6yQrus3w = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f6ZQsR6bPLvvCDNXOUc;
        actionBarOverlayLayout.HzCpKshMOoaw76hFcbOVRYMeRd();
        ActionMenuView actionMenuView = ((oD78NtkeSuRtaWUfMs1KgLg1WoWNL) actionBarOverlayLayout.ZLZeBXTMq0zDztBxtRTuCHrapQ).VxUQ9tBhpHJ2AAEDNW8sghc4m.V57tEvNfxZVVcOCAOih5PKr;
        if (actionMenuView != null && (jaGiaIfgE4oZFS8GScUJb = actionMenuView.TaDO7ogis3aEiWEtq) != null) {
            jaGiaIfgE4oZFS8GScUJb.ZfQNn8hdWlEQ5cR94249PDsLR();
            x7RNBrm11qTEy x7rnbrm11qtey = jaGiaIfgE4oZFS8GScUJb.TaDO7ogis3aEiWEtq;
            if (x7rnbrm11qtey != null && x7rnbrm11qtey.zzpBGItXfub0yWj()) {
                x7rnbrm11qtey.GI83zq0G8e7zkn.dismiss();
            }
        }
        Window.Callback callback = this.p59rPv72J9.getCallback();
        if (callback != null && !this.JUdwvN8LfOMa) {
            callback.onPanelClosed(108, stuu2Qyz6BSCKFEomt5b51vUnV1HQ);
        }
        this.ymT6yQrus3w = false;
    }

    public final boolean pzqP2AqKW6J5PO8zCKnW() {
        hMSqZXAdAtwr9Ih2G hmsqzxadatwr9ih2g;
        qE1OfTIjlj6BdfNlBJklCURi qe1oftijlj6bdfnlbjklcuri;
        boolean z = this.gBaBUmihn5l4u;
        this.gBaBUmihn5l4u = false;
        Wi6Xv9fVcEv2ynXTQIkU wi6Xv9fVcEv2ynXTQIkUW0Wu95l8dVNw5rZMRu = w0Wu95l8dVNw5rZMRu(0);
        if (!wi6Xv9fVcEv2ynXTQIkUW0Wu95l8dVNw5rZMRu.q1wNbhk2O6) {
            KoccBHOLe4XJgL koccBHOLe4XJgL = this.Irh5auREsoeV1C1RaBamlmy;
            if (koccBHOLe4XJgL != null) {
                koccBHOLe4XJgL.VxUQ9tBhpHJ2AAEDNW8sghc4m();
                return true;
            }
            RhfGHxtXxy0M0grmp2jkRjQg();
            L6YGERc84Mt1k8Qot l6YGERc84Mt1k8Qot = this.pYmKDYlAmhudp;
            if (l6YGERc84Mt1k8Qot == null || (hmsqzxadatwr9ih2g = l6YGERc84Mt1k8Qot.h3jnZRsdwYJfY9UhQCkbvWciwvFHv) == null || (qe1oftijlj6bdfnlbjklcuri = ((oD78NtkeSuRtaWUfMs1KgLg1WoWNL) hmsqzxadatwr9ih2g).VxUQ9tBhpHJ2AAEDNW8sghc4m.ymT6yQrus3w) == null || qe1oftijlj6bdfnlbjklcuri.ZfQNn8hdWlEQ5cR94249PDsLR == null) {
                return false;
            }
            qE1OfTIjlj6BdfNlBJklCURi qe1oftijlj6bdfnlbjklcuri2 = ((oD78NtkeSuRtaWUfMs1KgLg1WoWNL) hmsqzxadatwr9ih2g).VxUQ9tBhpHJ2AAEDNW8sghc4m.ymT6yQrus3w;
            rkuo6pAmWq0N rkuo6pamwq0n = qe1oftijlj6bdfnlbjklcuri2 == null ? null : qe1oftijlj6bdfnlbjklcuri2.ZfQNn8hdWlEQ5cR94249PDsLR;
            if (rkuo6pamwq0n != null) {
                rkuo6pamwq0n.collapseActionView();
            }
        } else if (!z) {
            ko09zE6UAgwkV(wi6Xv9fVcEv2ynXTQIkUW0Wu95l8dVNw5rZMRu, true);
            return true;
        }
        return true;
    }

    public final UdNpBSaUQhOqU q11o1hieEkZDhF1MGOZI26oZiDT(Context context) {
        if (this.zOk739gUM7zIZC25HHUxoiyixWFjn == null) {
            if (NrjuzzioPqfttNRptBDpZDzSYUrcM.ZLZeBXTMq0zDztBxtRTuCHrapQ == null) {
                Context applicationContext = context.getApplicationContext();
                NrjuzzioPqfttNRptBDpZDzSYUrcM.ZLZeBXTMq0zDztBxtRTuCHrapQ = new NrjuzzioPqfttNRptBDpZDzSYUrcM(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.zOk739gUM7zIZC25HHUxoiyixWFjn = new wPzckzzcoD(this, NrjuzzioPqfttNRptBDpZDzSYUrcM.ZLZeBXTMq0zDztBxtRTuCHrapQ);
        }
        return this.zOk739gUM7zIZC25HHUxoiyixWFjn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q1wNbhk2O6(boolean r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 593
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vdodsodjsdt.BbqUXujjobWQwx4SY.q1wNbhk2O6(boolean, boolean):boolean");
    }

    public final void qNPQb1obP7(int i) {
        this.H2VFYNJEVGAX = (1 << i) | this.H2VFYNJEVGAX;
        if (this.rERAmyEtGV6ANGszuKcQI) {
            return;
        }
        View decorView = this.p59rPv72J9.getDecorView();
        WeakHashMap weakHashMap = xb0r6yEzq0tw9m7nTWG5BFR8.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        decorView.postOnAnimation(this.Z1FjjMJ0suz8AFI7gsA4GDLMXv);
        this.rERAmyEtGV6ANGszuKcQI = true;
    }

    public final void vBGA6pPLqSMuYGvprl270j7(int i) {
        Wi6Xv9fVcEv2ynXTQIkU wi6Xv9fVcEv2ynXTQIkUW0Wu95l8dVNw5rZMRu = w0Wu95l8dVNw5rZMRu(i);
        if (wi6Xv9fVcEv2ynXTQIkUW0Wu95l8dVNw5rZMRu.NSjgqmGjEzuugn2SsG1mZFP != null) {
            Bundle bundle = new Bundle();
            wi6Xv9fVcEv2ynXTQIkUW0Wu95l8dVNw5rZMRu.NSjgqmGjEzuugn2SsG1mZFP.f6ZQsR6bPLvvCDNXOUc(bundle);
            if (bundle.size() > 0) {
                wi6Xv9fVcEv2ynXTQIkUW0Wu95l8dVNw5rZMRu.h3jnZRsdwYJfY9UhQCkbvWciwvFHv = bundle;
            }
            wi6Xv9fVcEv2ynXTQIkUW0Wu95l8dVNw5rZMRu.NSjgqmGjEzuugn2SsG1mZFP.Irh5auREsoeV1C1RaBamlmy();
            wi6Xv9fVcEv2ynXTQIkUW0Wu95l8dVNw5rZMRu.NSjgqmGjEzuugn2SsG1mZFP.clear();
        }
        wi6Xv9fVcEv2ynXTQIkUW0Wu95l8dVNw5rZMRu.Ca81ebIan1u = true;
        wi6Xv9fVcEv2ynXTQIkUW0Wu95l8dVNw5rZMRu.p59rPv72J9 = true;
        if ((i == 108 || i == 0) && this.f6ZQsR6bPLvvCDNXOUc != null) {
            Wi6Xv9fVcEv2ynXTQIkU wi6Xv9fVcEv2ynXTQIkUW0Wu95l8dVNw5rZMRu2 = w0Wu95l8dVNw5rZMRu(0);
            wi6Xv9fVcEv2ynXTQIkUW0Wu95l8dVNw5rZMRu2.HzCpKshMOoaw76hFcbOVRYMeRd = false;
            O1xDAlBZZlZdoEf747lCFHld(wi6Xv9fVcEv2ynXTQIkUW0Wu95l8dVNw5rZMRu2, null);
        }
    }

    public final boolean vE4yDIjexsP2lGjLaTcB(Wi6Xv9fVcEv2ynXTQIkU wi6Xv9fVcEv2ynXTQIkU, int i, KeyEvent keyEvent) {
        Stuu2Qyz6BSCKFEomt5b51vUnV1HQ stuu2Qyz6BSCKFEomt5b51vUnV1HQ;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((wi6Xv9fVcEv2ynXTQIkU.HzCpKshMOoaw76hFcbOVRYMeRd || O1xDAlBZZlZdoEf747lCFHld(wi6Xv9fVcEv2ynXTQIkU, keyEvent)) && (stuu2Qyz6BSCKFEomt5b51vUnV1HQ = wi6Xv9fVcEv2ynXTQIkU.NSjgqmGjEzuugn2SsG1mZFP) != null) {
            return stuu2Qyz6BSCKFEomt5b51vUnV1HQ.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    public final Wi6Xv9fVcEv2ynXTQIkU w0Wu95l8dVNw5rZMRu(int i) {
        Wi6Xv9fVcEv2ynXTQIkU[] wi6Xv9fVcEv2ynXTQIkUArr = this.YdNRGRc4rly;
        if (wi6Xv9fVcEv2ynXTQIkUArr == null || wi6Xv9fVcEv2ynXTQIkUArr.length <= i) {
            Wi6Xv9fVcEv2ynXTQIkU[] wi6Xv9fVcEv2ynXTQIkUArr2 = new Wi6Xv9fVcEv2ynXTQIkU[i + 1];
            if (wi6Xv9fVcEv2ynXTQIkUArr != null) {
                System.arraycopy(wi6Xv9fVcEv2ynXTQIkUArr, 0, wi6Xv9fVcEv2ynXTQIkUArr2, 0, wi6Xv9fVcEv2ynXTQIkUArr.length);
            }
            this.YdNRGRc4rly = wi6Xv9fVcEv2ynXTQIkUArr2;
            wi6Xv9fVcEv2ynXTQIkUArr = wi6Xv9fVcEv2ynXTQIkUArr2;
        }
        Wi6Xv9fVcEv2ynXTQIkU wi6Xv9fVcEv2ynXTQIkU = wi6Xv9fVcEv2ynXTQIkUArr[i];
        if (wi6Xv9fVcEv2ynXTQIkU != null) {
            return wi6Xv9fVcEv2ynXTQIkU;
        }
        Wi6Xv9fVcEv2ynXTQIkU wi6Xv9fVcEv2ynXTQIkU2 = new Wi6Xv9fVcEv2ynXTQIkU();
        wi6Xv9fVcEv2ynXTQIkU2.VxUQ9tBhpHJ2AAEDNW8sghc4m = i;
        wi6Xv9fVcEv2ynXTQIkU2.p59rPv72J9 = false;
        wi6Xv9fVcEv2ynXTQIkUArr[i] = wi6Xv9fVcEv2ynXTQIkU2;
        return wi6Xv9fVcEv2ynXTQIkU2;
    }

    public final void y1NaPKTl7R18DOr6e8i5() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.rE05n5RsRkyWKIeA9cmLXAKv4Hze != null && (w0Wu95l8dVNw5rZMRu(0).q1wNbhk2O6 || this.Irh5auREsoeV1C1RaBamlmy != null)) {
                z = true;
            }
            if (z && this.p6bBrs4p3Ly == null) {
                this.p6bBrs4p3Ly = xWI98Utc6yBpIJWt.zzpBGItXfub0yWj(this.rE05n5RsRkyWKIeA9cmLXAKv4Hze, this);
            } else {
                if (z || (onBackInvokedCallback = this.p6bBrs4p3Ly) == null) {
                    return;
                }
                xWI98Utc6yBpIJWt.V57tEvNfxZVVcOCAOih5PKr(this.rE05n5RsRkyWKIeA9cmLXAKv4Hze, onBackInvokedCallback);
                this.p6bBrs4p3Ly = null;
            }
        }
    }

    @Override // com.vdodsodjsdt.HqgfdHRFzXYO3mSc
    public final boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.CixTK5ZX8oWXHz34qHYV && i == 108) {
            return false;
        }
        if (this.qygqjTppWwx992 && i == 1) {
            this.qygqjTppWwx992 = false;
        }
        if (i == 1) {
            HVEwbdULInpTNa0IG();
            this.CixTK5ZX8oWXHz34qHYV = true;
            return true;
        }
        if (i == 2) {
            HVEwbdULInpTNa0IG();
            this.HVEwbdULInpTNa0IG = true;
            return true;
        }
        if (i == 5) {
            HVEwbdULInpTNa0IG();
            this.y1NaPKTl7R18DOr6e8i5 = true;
            return true;
        }
        if (i == 10) {
            HVEwbdULInpTNa0IG();
            this.TqcnImqkSWIKht = true;
            return true;
        }
        if (i == 108) {
            HVEwbdULInpTNa0IG();
            this.qygqjTppWwx992 = true;
            return true;
        }
        if (i != 109) {
            return this.p59rPv72J9.requestFeature(i);
        }
        HVEwbdULInpTNa0IG();
        this.iKANjmyTSxO6v6UuLPdu7DxOjlS = true;
        return true;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
