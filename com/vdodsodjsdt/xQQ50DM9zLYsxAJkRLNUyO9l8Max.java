package com.vdodsodjsdt;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xQQ50DM9zLYsxAJkRLNUyO9l8Max {
    public final qKXCIJM1cKNm0a1RAvamOBOVLgp V57tEvNfxZVVcOCAOih5PKr;
    public final qKXCIJM1cKNm0a1RAvamOBOVLgp VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final qKXCIJM1cKNm0a1RAvamOBOVLgp zzpBGItXfub0yWj;

    public xQQ50DM9zLYsxAJkRLNUyO9l8Max(qKXCIJM1cKNm0a1RAvamOBOVLgp qkxcijm1cknm0a1ravamobovlgp, qKXCIJM1cKNm0a1RAvamOBOVLgp qkxcijm1cknm0a1ravamobovlgp2, qKXCIJM1cKNm0a1RAvamOBOVLgp qkxcijm1cknm0a1ravamobovlgp3) {
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = qkxcijm1cknm0a1ravamobovlgp;
        this.zzpBGItXfub0yWj = qkxcijm1cknm0a1ravamobovlgp2;
        this.V57tEvNfxZVVcOCAOih5PKr = qkxcijm1cknm0a1ravamobovlgp3;
    }

    public final void GI83zq0G8e7zkn(BbDqqUJpcZ8e bbDqqUJpcZ8e) {
        if (bbDqqUJpcZ8e == null) {
            ((kQWyfLhecC6My1rEG579CENmQ1k) this).LaeGQIruHQu81hfJldjMOQSVblH3x.writeString(null);
            return;
        }
        try {
            ((kQWyfLhecC6My1rEG579CENmQ1k) this).LaeGQIruHQu81hfJldjMOQSVblH3x.writeString(zzpBGItXfub0yWj(bbDqqUJpcZ8e.getClass()).getName());
            kQWyfLhecC6My1rEG579CENmQ1k kqwyflhecc6my1reg579cenmq1kVxUQ9tBhpHJ2AAEDNW8sghc4m = VxUQ9tBhpHJ2AAEDNW8sghc4m();
            try {
                ZfQNn8hdWlEQ5cR94249PDsLR(bbDqqUJpcZ8e.getClass()).invoke(null, bbDqqUJpcZ8e, kqwyflhecc6my1reg579cenmq1kVxUQ9tBhpHJ2AAEDNW8sghc4m);
                Parcel parcel = kqwyflhecc6my1reg579cenmq1kVxUQ9tBhpHJ2AAEDNW8sghc4m.LaeGQIruHQu81hfJldjMOQSVblH3x;
                int i = kqwyflhecc6my1reg579cenmq1kVxUQ9tBhpHJ2AAEDNW8sghc4m.GI83zq0G8e7zkn;
                if (i >= 0) {
                    int i2 = kqwyflhecc6my1reg579cenmq1kVxUQ9tBhpHJ2AAEDNW8sghc4m.ZfQNn8hdWlEQ5cR94249PDsLR.get(i);
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(iDataPosition - i2);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(bbDqqUJpcZ8e.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }

    public abstract boolean LaeGQIruHQu81hfJldjMOQSVblH3x(int i);

    public abstract void NSjgqmGjEzuugn2SsG1mZFP(int i);

    public final Method V57tEvNfxZVVcOCAOih5PKr(String str) throws NoSuchMethodException {
        qKXCIJM1cKNm0a1RAvamOBOVLgp qkxcijm1cknm0a1ravamobovlgp = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        Method method = (Method) qkxcijm1cknm0a1ravamobovlgp.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, xQQ50DM9zLYsxAJkRLNUyO9l8Max.class.getClassLoader()).getDeclaredMethod("read", xQQ50DM9zLYsxAJkRLNUyO9l8Max.class);
        qkxcijm1cknm0a1ravamobovlgp.put(str, declaredMethod);
        return declaredMethod;
    }

    public abstract kQWyfLhecC6My1rEG579CENmQ1k VxUQ9tBhpHJ2AAEDNW8sghc4m();

    public final BbDqqUJpcZ8e ZLZeBXTMq0zDztBxtRTuCHrapQ() {
        String string = ((kQWyfLhecC6My1rEG579CENmQ1k) this).LaeGQIruHQu81hfJldjMOQSVblH3x.readString();
        if (string == null) {
            return null;
        }
        try {
            return (BbDqqUJpcZ8e) V57tEvNfxZVVcOCAOih5PKr(string).invoke(null, VxUQ9tBhpHJ2AAEDNW8sghc4m());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public final Method ZfQNn8hdWlEQ5cR94249PDsLR(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        qKXCIJM1cKNm0a1RAvamOBOVLgp qkxcijm1cknm0a1ravamobovlgp = this.zzpBGItXfub0yWj;
        Method method = (Method) qkxcijm1cknm0a1ravamobovlgp.get(name);
        if (method != null) {
            return method;
        }
        Class clsZzpBGItXfub0yWj = zzpBGItXfub0yWj(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsZzpBGItXfub0yWj.getDeclaredMethod("write", cls, xQQ50DM9zLYsxAJkRLNUyO9l8Max.class);
        qkxcijm1cknm0a1ravamobovlgp.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public final Parcelable zIvmSL0wzmmKGc3X39b2Gw2mUGE(Parcelable parcelable, int i) {
        if (!LaeGQIruHQu81hfJldjMOQSVblH3x(i)) {
            return parcelable;
        }
        return ((kQWyfLhecC6My1rEG579CENmQ1k) this).LaeGQIruHQu81hfJldjMOQSVblH3x.readParcelable(kQWyfLhecC6My1rEG579CENmQ1k.class.getClassLoader());
    }

    public final Class zzpBGItXfub0yWj(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        qKXCIJM1cKNm0a1RAvamOBOVLgp qkxcijm1cknm0a1ravamobovlgp = this.V57tEvNfxZVVcOCAOih5PKr;
        Class cls2 = (Class) qkxcijm1cknm0a1ravamobovlgp.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        qkxcijm1cknm0a1ravamobovlgp.put(cls.getName(), cls3);
        return cls3;
    }
}
