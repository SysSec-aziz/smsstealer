package com.vdodsodjsdt;

import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class Tt3445ZYXN {
    public final List LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final int NSjgqmGjEzuugn2SsG1mZFP;
    public final o0x3OWMw3He V57tEvNfxZVVcOCAOih5PKr;
    public final ThreadLocal VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final emqFyMkWkwZHiLAioE4xU9Pubq ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final mKyXpbfBTd6Xym7lvKzrk ZfQNn8hdWlEQ5cR94249PDsLR;
    public final boolean zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final ConcurrentHashMap zzpBGItXfub0yWj;
    public static final emqFyMkWkwZHiLAioE4xU9Pubq GI83zq0G8e7zkn = emqFyMkWkwZHiLAioE4xU9Pubq.ZfQNn8hdWlEQ5cR94249PDsLR;
    public static final ZXknyTEvPc613p2Waph63 M9e7PWhFYLD2lOGMker = AKwTJzw8hwGnOgalgHPBi2qJw9.V57tEvNfxZVVcOCAOih5PKr;
    public static final hP3dMpetkqP HzCpKshMOoaw76hFcbOVRYMeRd = IDoeXZSl9E3.V57tEvNfxZVVcOCAOih5PKr;
    public static final kMOMP1curnTy3VVCjVVGfKy2Q2c KUYypEB4eNWOZWVDpH = IDoeXZSl9E3.ZfQNn8hdWlEQ5cR94249PDsLR;

    /* JADX WARN: Illegal instructions before constructor call */
    public Tt3445ZYXN() {
        QoDg49fVMc3IKdfO5UuOmvvyMJ qoDg49fVMc3IKdfO5UuOmvvyMJ = QoDg49fVMc3IKdfO5UuOmvvyMJ.LaeGQIruHQu81hfJldjMOQSVblH3x;
        Map map = Collections.EMPTY_MAP;
        List list = Collections.EMPTY_LIST;
        this(qoDg49fVMc3IKdfO5UuOmvvyMJ, M9e7PWhFYLD2lOGMker, map, GI83zq0G8e7zkn, 0, list, HzCpKshMOoaw76hFcbOVRYMeRd, KUYypEB4eNWOZWVDpH, list);
    }

    public static void VxUQ9tBhpHJ2AAEDNW8sghc4m(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final void LaeGQIruHQu81hfJldjMOQSVblH3x(Object obj, Class cls, tVkLQdIevlOoRF1qYmTyvenTzI tvklqdievloorf1qymtyventzi) {
        eAZzwKf05brkM eazzwkf05brkmV57tEvNfxZVVcOCAOih5PKr = V57tEvNfxZVVcOCAOih5PKr(new q898WQEbycPNMnuoo6(cls));
        int i = tvklqdievloorf1qymtyventzi.M9e7PWhFYLD2lOGMker;
        int i2 = this.NSjgqmGjEzuugn2SsG1mZFP;
        if (i2 != 0) {
            tvklqdievloorf1qymtyventzi.O1xDAlBZZlZdoEf747lCFHld(i2);
        } else if (i == 2) {
            tvklqdievloorf1qymtyventzi.M9e7PWhFYLD2lOGMker = 1;
        }
        boolean z = tvklqdievloorf1qymtyventzi.HzCpKshMOoaw76hFcbOVRYMeRd;
        boolean z2 = tvklqdievloorf1qymtyventzi.q1wNbhk2O6;
        tvklqdievloorf1qymtyventzi.HzCpKshMOoaw76hFcbOVRYMeRd = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
        tvklqdievloorf1qymtyventzi.q1wNbhk2O6 = false;
        try {
            try {
                eazzwkf05brkmV57tEvNfxZVVcOCAOih5PKr.V57tEvNfxZVVcOCAOih5PKr(tvklqdievloorf1qymtyventzi, obj);
            } catch (IOException e) {
                throw new RKQxRZwHjgpy5pOG0vmNeEAGIjPIP(e);
            } catch (AssertionError e2) {
                throw new AssertionError("AssertionError (GSON 2.13.2): " + e2.getMessage(), e2);
            }
        } finally {
            tvklqdievloorf1qymtyventzi.O1xDAlBZZlZdoEf747lCFHld(i);
            tvklqdievloorf1qymtyventzi.HzCpKshMOoaw76hFcbOVRYMeRd = z;
            tvklqdievloorf1qymtyventzi.q1wNbhk2O6 = z2;
        }
    }

    public final eAZzwKf05brkM V57tEvNfxZVVcOCAOih5PKr(q898WQEbycPNMnuoo6 q898wqebycpnmnuoo6) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = this.zzpBGItXfub0yWj;
        eAZzwKf05brkM eazzwkf05brkm = (eAZzwKf05brkM) concurrentHashMap.get(q898wqebycpnmnuoo6);
        if (eazzwkf05brkm != null) {
            return eazzwkf05brkm;
        }
        ThreadLocal threadLocal = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            eAZzwKf05brkM eazzwkf05brkm2 = (eAZzwKf05brkM) map.get(q898wqebycpnmnuoo6);
            if (eazzwkf05brkm2 != null) {
                return eazzwkf05brkm2;
            }
            z = false;
        }
        try {
            llY8MifO0gBxRcpRNy8Sf lly8mifo0gbxrcprny8sf = new llY8MifO0gBxRcpRNy8Sf();
            map.put(q898wqebycpnmnuoo6, lly8mifo0gbxrcprny8sf);
            Iterator it = this.LaeGQIruHQu81hfJldjMOQSVblH3x.iterator();
            eAZzwKf05brkM eazzwkf05brkmVxUQ9tBhpHJ2AAEDNW8sghc4m = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                eazzwkf05brkmVxUQ9tBhpHJ2AAEDNW8sghc4m = ((Ke30hT4A8wvbzFUrXgs4BPCTK41Rp) it.next()).VxUQ9tBhpHJ2AAEDNW8sghc4m(this, q898wqebycpnmnuoo6);
                if (eazzwkf05brkmVxUQ9tBhpHJ2AAEDNW8sghc4m != null) {
                    if (lly8mifo0gbxrcprny8sf.VxUQ9tBhpHJ2AAEDNW8sghc4m != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    lly8mifo0gbxrcprny8sf.VxUQ9tBhpHJ2AAEDNW8sghc4m = eazzwkf05brkmVxUQ9tBhpHJ2AAEDNW8sghc4m;
                    map.put(q898wqebycpnmnuoo6, eazzwkf05brkmVxUQ9tBhpHJ2AAEDNW8sghc4m);
                }
            }
            if (z) {
                threadLocal.remove();
            }
            if (eazzwkf05brkmVxUQ9tBhpHJ2AAEDNW8sghc4m != null) {
                if (z) {
                    concurrentHashMap.putAll(map);
                }
                return eazzwkf05brkmVxUQ9tBhpHJ2AAEDNW8sghc4m;
            }
            throw new IllegalArgumentException("GSON (2.13.2) cannot handle " + q898wqebycpnmnuoo6);
        } catch (Throwable th) {
            if (z) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final String ZfQNn8hdWlEQ5cR94249PDsLR(Object obj) {
        Class<?> cls = obj.getClass();
        StringBuilder sb = new StringBuilder();
        try {
            tVkLQdIevlOoRF1qYmTyvenTzI tvklqdievloorf1qymtyventzi = new tVkLQdIevlOoRF1qYmTyvenTzI(new fZomDShQOetqV85bG(sb));
            tvklqdievloorf1qymtyventzi.vE4yDIjexsP2lGjLaTcB(this.ZLZeBXTMq0zDztBxtRTuCHrapQ);
            tvklqdievloorf1qymtyventzi.HzCpKshMOoaw76hFcbOVRYMeRd = this.zIvmSL0wzmmKGc3X39b2Gw2mUGE;
            int i = this.NSjgqmGjEzuugn2SsG1mZFP;
            if (i == 0) {
                i = 2;
            }
            tvklqdievloorf1qymtyventzi.O1xDAlBZZlZdoEf747lCFHld(i);
            tvklqdievloorf1qymtyventzi.q1wNbhk2O6 = false;
            LaeGQIruHQu81hfJldjMOQSVblH3x(obj, cls, tvklqdievloorf1qymtyventzi);
            return sb.toString();
        } catch (IOException e) {
            throw new RKQxRZwHjgpy5pOG0vmNeEAGIjPIP(e);
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.LaeGQIruHQu81hfJldjMOQSVblH3x + ",instanceCreators:" + this.V57tEvNfxZVVcOCAOih5PKr + "}";
    }

    public final Object zzpBGItXfub0yWj(String str, Type type) {
        Object objZzpBGItXfub0yWj;
        q898WQEbycPNMnuoo6 q898wqebycpnmnuoo6 = new q898WQEbycPNMnuoo6(type);
        Object obj = null;
        if (str == null) {
            return null;
        }
        Gzdlhdn1ss gzdlhdn1ss = new Gzdlhdn1ss(new StringReader(str));
        int i = this.NSjgqmGjEzuugn2SsG1mZFP;
        int i2 = i == 0 ? 2 : i;
        if (i2 == 0) {
            throw null;
        }
        gzdlhdn1ss.pYmKDYlAmhudp = i2;
        boolean z = true;
        if (i != 0) {
            if (i == 0) {
                throw null;
            }
            gzdlhdn1ss.pYmKDYlAmhudp = i;
        } else if (i2 == 2) {
            gzdlhdn1ss.pYmKDYlAmhudp = 1;
        }
        try {
            try {
                try {
                    try {
                        gzdlhdn1ss.wRCD0SdqWCowdYU7bmzN();
                        z = false;
                        eAZzwKf05brkM eazzwkf05brkmV57tEvNfxZVVcOCAOih5PKr = V57tEvNfxZVVcOCAOih5PKr(q898wqebycpnmnuoo6);
                        Class cls = q898wqebycpnmnuoo6.VxUQ9tBhpHJ2AAEDNW8sghc4m;
                        objZzpBGItXfub0yWj = eazzwkf05brkmV57tEvNfxZVVcOCAOih5PKr.zzpBGItXfub0yWj(gzdlhdn1ss);
                        Class clsQygqjTppWwx992 = hRrPPME7ytOB7ba.qygqjTppWwx992(cls);
                        if (objZzpBGItXfub0yWj != null && !clsQygqjTppWwx992.isInstance(objZzpBGItXfub0yWj)) {
                            throw new ClassCastException("Type adapter '" + eazzwkf05brkmV57tEvNfxZVVcOCAOih5PKr + "' returned wrong type; requested " + cls + " but got instance of " + objZzpBGItXfub0yWj.getClass() + "\nVerify that the adapter was registered for the correct type.");
                        }
                    } catch (IOException e) {
                        throw new RKQxRZwHjgpy5pOG0vmNeEAGIjPIP(e);
                    } catch (AssertionError e2) {
                        throw new AssertionError("AssertionError (GSON 2.13.2): " + e2.getMessage(), e2);
                    }
                } catch (IllegalStateException e3) {
                    throw new RKQxRZwHjgpy5pOG0vmNeEAGIjPIP(e3);
                }
            } catch (EOFException e4) {
                if (!z) {
                    throw new RKQxRZwHjgpy5pOG0vmNeEAGIjPIP(e4);
                }
                if (i2 == 0) {
                    throw null;
                }
                gzdlhdn1ss.pYmKDYlAmhudp = i2;
            }
            if (i2 == 0) {
                throw null;
            }
            gzdlhdn1ss.pYmKDYlAmhudp = i2;
            obj = objZzpBGItXfub0yWj;
            if (obj != null) {
                try {
                    if (gzdlhdn1ss.wRCD0SdqWCowdYU7bmzN() != 10) {
                        throw new RKQxRZwHjgpy5pOG0vmNeEAGIjPIP("JSON document was not fully consumed.");
                    }
                } catch (UW0OfzFGj7 e5) {
                    throw new RKQxRZwHjgpy5pOG0vmNeEAGIjPIP(e5);
                } catch (IOException e6) {
                    throw new RKQxRZwHjgpy5pOG0vmNeEAGIjPIP(e6);
                }
            }
            return obj;
        } catch (Throwable th) {
            if (i2 == 0) {
                throw null;
            }
            gzdlhdn1ss.pYmKDYlAmhudp = i2;
            throw th;
        }
    }

    public Tt3445ZYXN(QoDg49fVMc3IKdfO5UuOmvvyMJ qoDg49fVMc3IKdfO5UuOmvvyMJ, AKwTJzw8hwGnOgalgHPBi2qJw9 aKwTJzw8hwGnOgalgHPBi2qJw9, Map map, emqFyMkWkwZHiLAioE4xU9Pubq emqfymkwkwzhilaioe4xu9pubq, int i, List list, IDoeXZSl9E3 iDoeXZSl9E3, IDoeXZSl9E3 iDoeXZSl9E32, List list2) {
        uo1VguaVsUUJ5AoQooXnMNgd uo1vguavsuuj5aoqooxnmngd;
        uo1VguaVsUUJ5AoQooXnMNgd uo1vguavsuuj5aoqooxnmngd2;
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = new ThreadLocal();
        this.zzpBGItXfub0yWj = new ConcurrentHashMap();
        o0x3OWMw3He o0x3owmw3he = new o0x3OWMw3He(4, map, list2);
        this.V57tEvNfxZVVcOCAOih5PKr = o0x3owmw3he;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = true;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = emqfymkwkwzhilaioe4xu9pubq;
        this.NSjgqmGjEzuugn2SsG1mZFP = i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(QGHnBQqmHmq3G29u1seH.qNPQb1obP7);
        if (iDoeXZSl9E3 == IDoeXZSl9E3.V57tEvNfxZVVcOCAOih5PKr) {
            uo1vguavsuuj5aoqooxnmngd = emTN5EQXt1i0.V57tEvNfxZVVcOCAOih5PKr;
        } else {
            uo1vguavsuuj5aoqooxnmngd = new uo1VguaVsUUJ5AoQooXnMNgd(1, iDoeXZSl9E3);
        }
        arrayList.add(uo1vguavsuuj5aoqooxnmngd);
        arrayList.add(qoDg49fVMc3IKdfO5UuOmvvyMJ);
        arrayList.addAll(list);
        arrayList.add(QGHnBQqmHmq3G29u1seH.h3jnZRsdwYJfY9UhQCkbvWciwvFHv);
        arrayList.add(QGHnBQqmHmq3G29u1seH.ZLZeBXTMq0zDztBxtRTuCHrapQ);
        arrayList.add(QGHnBQqmHmq3G29u1seH.ZfQNn8hdWlEQ5cR94249PDsLR);
        arrayList.add(QGHnBQqmHmq3G29u1seH.LaeGQIruHQu81hfJldjMOQSVblH3x);
        arrayList.add(QGHnBQqmHmq3G29u1seH.zIvmSL0wzmmKGc3X39b2Gw2mUGE);
        gXiMF4UgHVlpFwToO07vlNy3k gximf4ughvlpfwtoo07vlny3k = QGHnBQqmHmq3G29u1seH.HzCpKshMOoaw76hFcbOVRYMeRd;
        arrayList.add(new oei7KeBbYgFTIZJmzY2KKi(Long.TYPE, Long.class, gximf4ughvlpfwtoo07vlny3k));
        arrayList.add(new oei7KeBbYgFTIZJmzY2KKi(Double.TYPE, Double.class, new WJflZAwJ8HiDtXPEEKMD(0)));
        arrayList.add(new oei7KeBbYgFTIZJmzY2KKi(Float.TYPE, Float.class, new WJflZAwJ8HiDtXPEEKMD(1)));
        if (iDoeXZSl9E32 == IDoeXZSl9E3.ZfQNn8hdWlEQ5cR94249PDsLR) {
            uo1vguavsuuj5aoqooxnmngd2 = QyK0WG3sR9RvrBCr5JGfOq14.V57tEvNfxZVVcOCAOih5PKr;
        } else {
            uo1vguavsuuj5aoqooxnmngd2 = new uo1VguaVsUUJ5AoQooXnMNgd(0, new QyK0WG3sR9RvrBCr5JGfOq14(2, iDoeXZSl9E32));
        }
        arrayList.add(uo1vguavsuuj5aoqooxnmngd2);
        arrayList.add(QGHnBQqmHmq3G29u1seH.NSjgqmGjEzuugn2SsG1mZFP);
        arrayList.add(QGHnBQqmHmq3G29u1seH.GI83zq0G8e7zkn);
        arrayList.add(new pprWOkBDEQ5eVufdLCrXUe1(AtomicLong.class, new QyK0WG3sR9RvrBCr5JGfOq14(0, gximf4ughvlpfwtoo07vlny3k).VxUQ9tBhpHJ2AAEDNW8sghc4m(), 0));
        int i2 = 0;
        arrayList.add(new pprWOkBDEQ5eVufdLCrXUe1(AtomicLongArray.class, new QyK0WG3sR9RvrBCr5JGfOq14(1, gximf4ughvlpfwtoo07vlny3k).VxUQ9tBhpHJ2AAEDNW8sghc4m(), i2));
        arrayList.add(QGHnBQqmHmq3G29u1seH.M9e7PWhFYLD2lOGMker);
        arrayList.add(QGHnBQqmHmq3G29u1seH.KUYypEB4eNWOZWVDpH);
        arrayList.add(QGHnBQqmHmq3G29u1seH.pYmKDYlAmhudp);
        arrayList.add(QGHnBQqmHmq3G29u1seH.ko09zE6UAgwkV);
        arrayList.add(new pprWOkBDEQ5eVufdLCrXUe1(BigDecimal.class, QGHnBQqmHmq3G29u1seH.q1wNbhk2O6, i2));
        arrayList.add(new pprWOkBDEQ5eVufdLCrXUe1(BigInteger.class, QGHnBQqmHmq3G29u1seH.p59rPv72J9, i2));
        arrayList.add(new pprWOkBDEQ5eVufdLCrXUe1(Ic53uc1TSX1PhLp3lGbBDfNitR.class, QGHnBQqmHmq3G29u1seH.Ca81ebIan1u, i2));
        arrayList.add(QGHnBQqmHmq3G29u1seH.jW7EiD0YL6xkbB158jMUzhWNWb1y);
        arrayList.add(QGHnBQqmHmq3G29u1seH.f6ZQsR6bPLvvCDNXOUc);
        arrayList.add(QGHnBQqmHmq3G29u1seH.TaDO7ogis3aEiWEtq);
        arrayList.add(QGHnBQqmHmq3G29u1seH.Irh5auREsoeV1C1RaBamlmy);
        arrayList.add(QGHnBQqmHmq3G29u1seH.w0Wu95l8dVNw5rZMRu);
        arrayList.add(QGHnBQqmHmq3G29u1seH.vBGA6pPLqSMuYGvprl270j7);
        arrayList.add(QGHnBQqmHmq3G29u1seH.zzpBGItXfub0yWj);
        arrayList.add(YL0QkPiwQTRZsjsmHhw9bLuQHa1h.V57tEvNfxZVVcOCAOih5PKr);
        arrayList.add(QGHnBQqmHmq3G29u1seH.q11o1hieEkZDhF1MGOZI26oZiDT);
        if (gqt6MrXew54kIVBtPLclAu62kQ.VxUQ9tBhpHJ2AAEDNW8sghc4m) {
            arrayList.add(gqt6MrXew54kIVBtPLclAu62kQ.V57tEvNfxZVVcOCAOih5PKr);
            arrayList.add(gqt6MrXew54kIVBtPLclAu62kQ.zzpBGItXfub0yWj);
            arrayList.add(gqt6MrXew54kIVBtPLclAu62kQ.ZfQNn8hdWlEQ5cR94249PDsLR);
        }
        arrayList.add(NYhMl6JOyeKyeGKL3RvrIEBlMmN4X.V57tEvNfxZVVcOCAOih5PKr);
        arrayList.add(QGHnBQqmHmq3G29u1seH.VxUQ9tBhpHJ2AAEDNW8sghc4m);
        arrayList.add(new vYsD6Gl1lGeyLILI(o0x3owmw3he, 0));
        arrayList.add(new vYsD6Gl1lGeyLILI(o0x3owmw3he, 1));
        mKyXpbfBTd6Xym7lvKzrk mkyxpbfbtd6xym7lvkzrk = new mKyXpbfBTd6Xym7lvKzrk(o0x3owmw3he);
        this.ZfQNn8hdWlEQ5cR94249PDsLR = mkyxpbfbtd6xym7lvkzrk;
        arrayList.add(mkyxpbfbtd6xym7lvkzrk);
        arrayList.add(QGHnBQqmHmq3G29u1seH.SuB3hEmTmbbRGAhtvOOmfKEon);
        arrayList.add(new TpqgSOnzkzlAfmNLUoDL3koDp(o0x3owmw3he, aKwTJzw8hwGnOgalgHPBi2qJw9, qoDg49fVMc3IKdfO5UuOmvvyMJ, mkyxpbfbtd6xym7lvkzrk, list2));
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = Collections.unmodifiableList(arrayList);
    }
}
