package com.vdodsodjsdt;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class xJilh3An9LAykwTqP7vc {
    public final sveu0WcbYc1gIe GI83zq0G8e7zkn;
    public final List HzCpKshMOoaw76hFcbOVRYMeRd;
    public final PZstJ1QixRNRG4lJj4zCb3 LaeGQIruHQu81hfJldjMOQSVblH3x;
    public final List M9e7PWhFYLD2lOGMker;
    public final ProxySelector NSjgqmGjEzuugn2SsG1mZFP;
    public final SSLSocketFactory V57tEvNfxZVVcOCAOih5PKr;
    public final IN79WcIk5xB4t0GjRT43qPLs5 VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final Proxy ZLZeBXTMq0zDztBxtRTuCHrapQ;
    public final HostnameVerifier ZfQNn8hdWlEQ5cR94249PDsLR;
    public final IN79WcIk5xB4t0GjRT43qPLs5 zIvmSL0wzmmKGc3X39b2Gw2mUGE;
    public final SocketFactory zzpBGItXfub0yWj;

    public xJilh3An9LAykwTqP7vc(String str, int i, IN79WcIk5xB4t0GjRT43qPLs5 iN79WcIk5xB4t0GjRT43qPLs5, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, hy5mi4r2tCUt8XWYMONXrnOpOrTV hy5mi4r2tcut8xwymonxrnoportv, PZstJ1QixRNRG4lJj4zCb3 pZstJ1QixRNRG4lJj4zCb3, IN79WcIk5xB4t0GjRT43qPLs5 iN79WcIk5xB4t0GjRT43qPLs52, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        ej6unYlOWMDF.pYmKDYlAmhudp(str, "uriHost");
        ej6unYlOWMDF.pYmKDYlAmhudp(iN79WcIk5xB4t0GjRT43qPLs5, "dns");
        ej6unYlOWMDF.pYmKDYlAmhudp(socketFactory, "socketFactory");
        ej6unYlOWMDF.pYmKDYlAmhudp(iN79WcIk5xB4t0GjRT43qPLs52, "proxyAuthenticator");
        ej6unYlOWMDF.pYmKDYlAmhudp(list, "protocols");
        ej6unYlOWMDF.pYmKDYlAmhudp(list2, "connectionSpecs");
        ej6unYlOWMDF.pYmKDYlAmhudp(proxySelector, "proxySelector");
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = iN79WcIk5xB4t0GjRT43qPLs5;
        this.zzpBGItXfub0yWj = socketFactory;
        this.V57tEvNfxZVVcOCAOih5PKr = sSLSocketFactory;
        this.ZfQNn8hdWlEQ5cR94249PDsLR = hy5mi4r2tcut8xwymonxrnoportv;
        this.LaeGQIruHQu81hfJldjMOQSVblH3x = pZstJ1QixRNRG4lJj4zCb3;
        this.zIvmSL0wzmmKGc3X39b2Gw2mUGE = iN79WcIk5xB4t0GjRT43qPLs52;
        this.ZLZeBXTMq0zDztBxtRTuCHrapQ = proxy;
        this.NSjgqmGjEzuugn2SsG1mZFP = proxySelector;
        oLPwQu4XgJ olpwqu4xgj = new oLPwQu4XgJ(0);
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            olpwqu4xgj.V57tEvNfxZVVcOCAOih5PKr = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            olpwqu4xgj.V57tEvNfxZVVcOCAOih5PKr = "https";
        }
        String strZzpBGItXfub0yWj = IQjv3jTNogGqr6Koi5AtfzaT9p.zzpBGItXfub0yWj(ej6unYlOWMDF.wRCD0SdqWCowdYU7bmzN(str, 0, 0, 7));
        if (strZzpBGItXfub0yWj == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        olpwqu4xgj.zIvmSL0wzmmKGc3X39b2Gw2mUGE = strZzpBGItXfub0yWj;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(u9SlVAuoWhQUfJ.NSjgqmGjEzuugn2SsG1mZFP("unexpected port: ", i).toString());
        }
        olpwqu4xgj.zzpBGItXfub0yWj = i;
        this.GI83zq0G8e7zkn = olpwqu4xgj.V57tEvNfxZVVcOCAOih5PKr();
        this.M9e7PWhFYLD2lOGMker = U7JVXX1Kyh43VgUF.NSjgqmGjEzuugn2SsG1mZFP(list);
        this.HzCpKshMOoaw76hFcbOVRYMeRd = U7JVXX1Kyh43VgUF.NSjgqmGjEzuugn2SsG1mZFP(list2);
    }

    public final boolean VxUQ9tBhpHJ2AAEDNW8sghc4m(xJilh3An9LAykwTqP7vc xjilh3an9laykwtqp7vc) {
        ej6unYlOWMDF.pYmKDYlAmhudp(xjilh3an9laykwtqp7vc, "that");
        return ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.VxUQ9tBhpHJ2AAEDNW8sghc4m, xjilh3an9laykwtqp7vc.VxUQ9tBhpHJ2AAEDNW8sghc4m) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.zIvmSL0wzmmKGc3X39b2Gw2mUGE, xjilh3an9laykwtqp7vc.zIvmSL0wzmmKGc3X39b2Gw2mUGE) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.M9e7PWhFYLD2lOGMker, xjilh3an9laykwtqp7vc.M9e7PWhFYLD2lOGMker) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.HzCpKshMOoaw76hFcbOVRYMeRd, xjilh3an9laykwtqp7vc.HzCpKshMOoaw76hFcbOVRYMeRd) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.NSjgqmGjEzuugn2SsG1mZFP, xjilh3an9laykwtqp7vc.NSjgqmGjEzuugn2SsG1mZFP) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.ZLZeBXTMq0zDztBxtRTuCHrapQ, xjilh3an9laykwtqp7vc.ZLZeBXTMq0zDztBxtRTuCHrapQ) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.V57tEvNfxZVVcOCAOih5PKr, xjilh3an9laykwtqp7vc.V57tEvNfxZVVcOCAOih5PKr) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.ZfQNn8hdWlEQ5cR94249PDsLR, xjilh3an9laykwtqp7vc.ZfQNn8hdWlEQ5cR94249PDsLR) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.LaeGQIruHQu81hfJldjMOQSVblH3x, xjilh3an9laykwtqp7vc.LaeGQIruHQu81hfJldjMOQSVblH3x) && this.GI83zq0G8e7zkn.LaeGQIruHQu81hfJldjMOQSVblH3x == xjilh3an9laykwtqp7vc.GI83zq0G8e7zkn.LaeGQIruHQu81hfJldjMOQSVblH3x;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xJilh3An9LAykwTqP7vc)) {
            return false;
        }
        xJilh3An9LAykwTqP7vc xjilh3an9laykwtqp7vc = (xJilh3An9LAykwTqP7vc) obj;
        return ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(this.GI83zq0G8e7zkn, xjilh3an9laykwtqp7vc.GI83zq0G8e7zkn) && VxUQ9tBhpHJ2AAEDNW8sghc4m(xjilh3an9laykwtqp7vc);
    }

    public final int hashCode() {
        return Objects.hashCode(this.LaeGQIruHQu81hfJldjMOQSVblH3x) + ((Objects.hashCode(this.ZfQNn8hdWlEQ5cR94249PDsLR) + ((Objects.hashCode(this.V57tEvNfxZVVcOCAOih5PKr) + ((Objects.hashCode(this.ZLZeBXTMq0zDztBxtRTuCHrapQ) + ((this.NSjgqmGjEzuugn2SsG1mZFP.hashCode() + ((this.HzCpKshMOoaw76hFcbOVRYMeRd.hashCode() + ((this.M9e7PWhFYLD2lOGMker.hashCode() + ((this.zIvmSL0wzmmKGc3X39b2Gw2mUGE.hashCode() + ((this.VxUQ9tBhpHJ2AAEDNW8sghc4m.hashCode() + u9SlVAuoWhQUfJ.LaeGQIruHQu81hfJldjMOQSVblH3x(this.GI83zq0G8e7zkn.NSjgqmGjEzuugn2SsG1mZFP, 527, 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Address{");
        sveu0WcbYc1gIe sveu0wcbyc1gie = this.GI83zq0G8e7zkn;
        sb.append(sveu0wcbyc1gie.ZfQNn8hdWlEQ5cR94249PDsLR);
        sb.append(':');
        sb.append(sveu0wcbyc1gie.LaeGQIruHQu81hfJldjMOQSVblH3x);
        sb.append(", ");
        Proxy proxy = this.ZLZeBXTMq0zDztBxtRTuCHrapQ;
        if (proxy != null) {
            str = "proxy=" + proxy;
        } else {
            str = "proxySelector=" + this.NSjgqmGjEzuugn2SsG1mZFP;
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
