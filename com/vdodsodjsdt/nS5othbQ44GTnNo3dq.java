package com.vdodsodjsdt;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: compiled from: r8-map-id-3f77bbef96f83a8bf86e140490b9d41fcf0723d2c79bd2f3f370cb94135e1be4 */
/* JADX INFO: loaded from: classes.dex */
public final class nS5othbQ44GTnNo3dq {
    public final InetSocketAddress V57tEvNfxZVVcOCAOih5PKr;
    public final xJilh3An9LAykwTqP7vc VxUQ9tBhpHJ2AAEDNW8sghc4m;
    public final Proxy zzpBGItXfub0yWj;

    public nS5othbQ44GTnNo3dq(xJilh3An9LAykwTqP7vc xjilh3an9laykwtqp7vc, Proxy proxy, InetSocketAddress inetSocketAddress) {
        ej6unYlOWMDF.pYmKDYlAmhudp(xjilh3an9laykwtqp7vc, "address");
        ej6unYlOWMDF.pYmKDYlAmhudp(inetSocketAddress, "socketAddress");
        this.VxUQ9tBhpHJ2AAEDNW8sghc4m = xjilh3an9laykwtqp7vc;
        this.zzpBGItXfub0yWj = proxy;
        this.V57tEvNfxZVVcOCAOih5PKr = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nS5othbQ44GTnNo3dq)) {
            return false;
        }
        nS5othbQ44GTnNo3dq ns5othbq44gtnno3dq = (nS5othbQ44GTnNo3dq) obj;
        return ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(ns5othbq44gtnno3dq.VxUQ9tBhpHJ2AAEDNW8sghc4m, this.VxUQ9tBhpHJ2AAEDNW8sghc4m) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(ns5othbq44gtnno3dq.zzpBGItXfub0yWj, this.zzpBGItXfub0yWj) && ej6unYlOWMDF.NSjgqmGjEzuugn2SsG1mZFP(ns5othbq44gtnno3dq.V57tEvNfxZVVcOCAOih5PKr, this.V57tEvNfxZVVcOCAOih5PKr);
    }

    public final int hashCode() {
        return this.V57tEvNfxZVVcOCAOih5PKr.hashCode() + ((this.zzpBGItXfub0yWj.hashCode() + ((this.VxUQ9tBhpHJ2AAEDNW8sghc4m.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        xJilh3An9LAykwTqP7vc xjilh3an9laykwtqp7vc = this.VxUQ9tBhpHJ2AAEDNW8sghc4m;
        sveu0WcbYc1gIe sveu0wcbyc1gie = xjilh3an9laykwtqp7vc.GI83zq0G8e7zkn;
        sveu0WcbYc1gIe sveu0wcbyc1gie2 = xjilh3an9laykwtqp7vc.GI83zq0G8e7zkn;
        String str = sveu0wcbyc1gie.ZfQNn8hdWlEQ5cR94249PDsLR;
        InetSocketAddress inetSocketAddress = this.V57tEvNfxZVVcOCAOih5PKr;
        InetAddress address = inetSocketAddress.getAddress();
        String strZzpBGItXfub0yWj = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : IQjv3jTNogGqr6Koi5AtfzaT9p.zzpBGItXfub0yWj(hostAddress);
        if (cwhrCnoVJBjJE2CBEAvBopmgF.VOvSEdhaZyc0oOGQ8(str, ':')) {
            sb.append("[");
            sb.append(str);
            sb.append("]");
        } else {
            sb.append(str);
        }
        if (sveu0wcbyc1gie2.LaeGQIruHQu81hfJldjMOQSVblH3x != inetSocketAddress.getPort() || str.equals(strZzpBGItXfub0yWj)) {
            sb.append(":");
            sb.append(sveu0wcbyc1gie2.LaeGQIruHQu81hfJldjMOQSVblH3x);
        }
        if (!str.equals(strZzpBGItXfub0yWj)) {
            if (this.zzpBGItXfub0yWj.equals(Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (strZzpBGItXfub0yWj == null) {
                sb.append("<unresolved>");
            } else if (cwhrCnoVJBjJE2CBEAvBopmgF.VOvSEdhaZyc0oOGQ8(strZzpBGItXfub0yWj, ':')) {
                sb.append("[");
                sb.append(strZzpBGItXfub0yWj);
                sb.append("]");
            } else {
                sb.append(strZzpBGItXfub0yWj);
            }
            sb.append(":");
            sb.append(inetSocketAddress.getPort());
        }
        return sb.toString();
    }
}
