package p336x6;

import android.content.Context;

/* renamed from: x6.e */
/* loaded from: classes.dex */
public final class C5631e {

    /* renamed from: a */
    public static final String f21073a = "e";

    /* renamed from: b */
    public static boolean f21074b = false;

    /* renamed from: c */
    public static a f21075c = a.LEGACY;

    /* renamed from: x6.e$a */
    /* loaded from: classes.dex */
    public enum a {
        LEGACY,
        LATEST
    }

    /* renamed from: a */
    public static synchronized int m22674a(Context context) {
        int m22675b;
        synchronized (C5631e.class) {
            m22675b = m22675b(context, null, null);
        }
        return m22675b;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:13|14|15|16|(10:18|(1:(1:21))|22|23|(1:25)|26|27|(1:29)|30|31)|35|22|23|(0)|26|27|(0)|30|31) */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005b, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005c, code lost:
    
        android.util.Log.e(p336x6.C5631e.f21073a, "Failed to retrieve renderer type or log initialization.", r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f A[Catch: RemoteException -> 0x005b, all -> 0x0089, TryCatch #3 {RemoteException -> 0x005b, blocks: (B:23:0x0049, B:25:0x004f, B:26:0x0053), top: B:22:0x0049, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0076 A[Catch: all -> 0x0089, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0003, B:7:0x001e, B:12:0x0025, B:14:0x0029, B:16:0x0038, B:18:0x003d, B:23:0x0049, B:25:0x004f, B:26:0x0053, B:27:0x0063, B:29:0x0076, B:34:0x005c, B:38:0x007e, B:39:0x0083, B:42:0x0085), top: B:3:0x0003, inners: #0, #1, #3 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized int m22675b(android.content.Context r5, p336x6.C5631e.a r6, p336x6.InterfaceC5633g r7) {
        /*
            java.lang.Class<x6.e> r0 = p336x6.C5631e.class
            monitor-enter(r0)
            java.lang.String r1 = "Context is null"
            p108h6.C2394s.m9620m(r5, r1)     // Catch: java.lang.Throwable -> L89
            java.lang.String r1 = p336x6.C5631e.f21073a     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L89
            java.lang.String r3 = "preferredRenderer: "
            java.lang.String r2 = r3.concat(r2)     // Catch: java.lang.Throwable -> L89
            android.util.Log.d(r1, r2)     // Catch: java.lang.Throwable -> L89
            boolean r1 = p336x6.C5631e.f21074b     // Catch: java.lang.Throwable -> L89
            r2 = 0
            if (r1 == 0) goto L25
            if (r7 == 0) goto L23
            x6.e$a r5 = p336x6.C5631e.f21075c     // Catch: java.lang.Throwable -> L89
            r7.onMapsSdkInitialized(r5)     // Catch: java.lang.Throwable -> L89
        L23:
            monitor-exit(r0)
            return r2
        L25:
            y6.g0 r1 = p352y6.C5827e0.m23441a(r5, r6)     // Catch: p064e6.C1677g -> L84 java.lang.Throwable -> L89
            y6.a r3 = r1.zze()     // Catch: android.os.RemoteException -> L7d java.lang.Throwable -> L89
            p336x6.C5628b.m22625k(r3)     // Catch: android.os.RemoteException -> L7d java.lang.Throwable -> L89
            com.google.android.gms.internal.maps.zzi r3 = r1.zzj()     // Catch: android.os.RemoteException -> L7d java.lang.Throwable -> L89
            p367z6.C6000c.m24082e(r3)     // Catch: android.os.RemoteException -> L7d java.lang.Throwable -> L89
            r3 = 1
            p336x6.C5631e.f21074b = r3     // Catch: java.lang.Throwable -> L89
            r4 = 2
            if (r6 == 0) goto L48
            int r6 = r6.ordinal()     // Catch: java.lang.Throwable -> L89
            if (r6 == 0) goto L49
            if (r6 == r3) goto L46
            goto L48
        L46:
            r3 = r4
            goto L49
        L48:
            r3 = r2
        L49:
            int r6 = r1.zzd()     // Catch: android.os.RemoteException -> L5b java.lang.Throwable -> L89
            if (r6 != r4) goto L53
            x6.e$a r6 = p336x6.C5631e.a.LATEST     // Catch: android.os.RemoteException -> L5b java.lang.Throwable -> L89
            p336x6.C5631e.f21075c = r6     // Catch: android.os.RemoteException -> L5b java.lang.Throwable -> L89
        L53:
            r6.b r5 = p252r6.BinderC4309d.m16572g(r5)     // Catch: android.os.RemoteException -> L5b java.lang.Throwable -> L89
            r1.mo23451o1(r5, r3)     // Catch: android.os.RemoteException -> L5b java.lang.Throwable -> L89
            goto L63
        L5b:
            r5 = move-exception
            java.lang.String r6 = p336x6.C5631e.f21073a     // Catch: java.lang.Throwable -> L89
            java.lang.String r1 = "Failed to retrieve renderer type or log initialization."
            android.util.Log.e(r6, r1, r5)     // Catch: java.lang.Throwable -> L89
        L63:
            java.lang.String r5 = p336x6.C5631e.f21073a     // Catch: java.lang.Throwable -> L89
            x6.e$a r6 = p336x6.C5631e.f21075c     // Catch: java.lang.Throwable -> L89
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L89
            java.lang.String r1 = "loadedRenderer: "
            java.lang.String r6 = r1.concat(r6)     // Catch: java.lang.Throwable -> L89
            android.util.Log.d(r5, r6)     // Catch: java.lang.Throwable -> L89
            if (r7 == 0) goto L7b
            x6.e$a r5 = p336x6.C5631e.f21075c     // Catch: java.lang.Throwable -> L89
            r7.onMapsSdkInitialized(r5)     // Catch: java.lang.Throwable -> L89
        L7b:
            monitor-exit(r0)
            return r2
        L7d:
            r5 = move-exception
            z6.v r6 = new z6.v     // Catch: java.lang.Throwable -> L89
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L89
            throw r6     // Catch: java.lang.Throwable -> L89
        L84:
            r5 = move-exception
            int r5 = r5.f6262h     // Catch: java.lang.Throwable -> L89
            monitor-exit(r0)
            return r5
        L89:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p336x6.C5631e.m22675b(android.content.Context, x6.e$a, x6.g):int");
    }
}
