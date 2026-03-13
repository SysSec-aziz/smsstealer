package com.vdodsodjsdt;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class h5LN26CslhxOuU14z3lZMUV {
    public zlYdhFpnS6XsVTW5KDHmGSNWQ VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public ArrayList zzpBGItXfub0yWj;

    public static long VxUQ9tBhpHJ2AAEDNW8sghc4m(JAJOdQxoSupJbf jAJOdQxoSupJbf, long j) {
        zlYdhFpnS6XsVTW5KDHmGSNWQ zlydhfpns6xsvtw5kdhmgsnwq = jAJOdQxoSupJbf.ZfQNn8hdWlEQ5cR94249PDsLR;
        ArrayList arrayList = jAJOdQxoSupJbf.HzCpKshMOoaw76hFcbOVRYMeRd;
        if (zlydhfpns6xsvtw5kdhmgsnwq instanceof jGbNNJgR8XauFvyUtrLqQ0r) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            rRtj0UwVMQB0jmiHtuB rrtj0uwvmqb0jmihtub = (rRtj0UwVMQB0jmiHtuB) arrayList.get(i);
            if (rrtj0uwvmqb0jmihtub instanceof JAJOdQxoSupJbf) {
                JAJOdQxoSupJbf jAJOdQxoSupJbf2 = (JAJOdQxoSupJbf) rrtj0uwvmqb0jmihtub;
                if (jAJOdQxoSupJbf2.ZfQNn8hdWlEQ5cR94249PDsLR != zlydhfpns6xsvtw5kdhmgsnwq) {
                    jMin = Math.min(jMin, VxUQ9tBhpHJ2AAEDNW8sghc4m(jAJOdQxoSupJbf2, ((long) jAJOdQxoSupJbf2.zIvmSL0wzmmKGc3X39b2Gw2mUGE) + j));
                }
            }
        }
        JAJOdQxoSupJbf jAJOdQxoSupJbf3 = zlydhfpns6xsvtw5kdhmgsnwq.GI83zq0G8e7zkn;
        JAJOdQxoSupJbf jAJOdQxoSupJbf4 = zlydhfpns6xsvtw5kdhmgsnwq.NSjgqmGjEzuugn2SsG1mZFP;
        if (jAJOdQxoSupJbf != jAJOdQxoSupJbf3) {
            return jMin;
        }
        long jM9e7PWhFYLD2lOGMker = j - zlydhfpns6xsvtw5kdhmgsnwq.M9e7PWhFYLD2lOGMker();
        return Math.min(Math.min(jMin, VxUQ9tBhpHJ2AAEDNW8sghc4m(jAJOdQxoSupJbf4, jM9e7PWhFYLD2lOGMker)), jM9e7PWhFYLD2lOGMker - ((long) jAJOdQxoSupJbf4.zIvmSL0wzmmKGc3X39b2Gw2mUGE));
    }

    public static long zzpBGItXfub0yWj(JAJOdQxoSupJbf jAJOdQxoSupJbf, long j) {
        zlYdhFpnS6XsVTW5KDHmGSNWQ zlydhfpns6xsvtw5kdhmgsnwq = jAJOdQxoSupJbf.ZfQNn8hdWlEQ5cR94249PDsLR;
        ArrayList arrayList = jAJOdQxoSupJbf.HzCpKshMOoaw76hFcbOVRYMeRd;
        if (zlydhfpns6xsvtw5kdhmgsnwq instanceof jGbNNJgR8XauFvyUtrLqQ0r) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            rRtj0UwVMQB0jmiHtuB rrtj0uwvmqb0jmihtub = (rRtj0UwVMQB0jmiHtuB) arrayList.get(i);
            if (rrtj0uwvmqb0jmihtub instanceof JAJOdQxoSupJbf) {
                JAJOdQxoSupJbf jAJOdQxoSupJbf2 = (JAJOdQxoSupJbf) rrtj0uwvmqb0jmihtub;
                if (jAJOdQxoSupJbf2.ZfQNn8hdWlEQ5cR94249PDsLR != zlydhfpns6xsvtw5kdhmgsnwq) {
                    jMax = Math.max(jMax, zzpBGItXfub0yWj(jAJOdQxoSupJbf2, ((long) jAJOdQxoSupJbf2.zIvmSL0wzmmKGc3X39b2Gw2mUGE) + j));
                }
            }
        }
        JAJOdQxoSupJbf jAJOdQxoSupJbf3 = zlydhfpns6xsvtw5kdhmgsnwq.NSjgqmGjEzuugn2SsG1mZFP;
        JAJOdQxoSupJbf jAJOdQxoSupJbf4 = zlydhfpns6xsvtw5kdhmgsnwq.GI83zq0G8e7zkn;
        if (jAJOdQxoSupJbf != jAJOdQxoSupJbf3) {
            return jMax;
        }
        long jM9e7PWhFYLD2lOGMker = zlydhfpns6xsvtw5kdhmgsnwq.M9e7PWhFYLD2lOGMker() + j;
        return Math.max(Math.max(jMax, zzpBGItXfub0yWj(jAJOdQxoSupJbf4, jM9e7PWhFYLD2lOGMker)), jM9e7PWhFYLD2lOGMker - ((long) jAJOdQxoSupJbf4.zIvmSL0wzmmKGc3X39b2Gw2mUGE));
    }
}
