package p108h6;

import java.util.concurrent.ConcurrentHashMap;

@Deprecated
/* renamed from: h6.o */
/* loaded from: classes.dex */
public class C2382o {

    /* renamed from: b */
    public static final C2367j f9661b = new C2367j("LibraryVersion", "");

    /* renamed from: c */
    public static final C2382o f9662c = new C2382o();

    /* renamed from: a */
    public final ConcurrentHashMap f9663a = new ConcurrentHashMap();

    /* renamed from: a */
    public static C2382o m9585a() {
        return f9662c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @java.lang.Deprecated
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String m9586b(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "Failed to get app version for libraryName: "
            java.lang.String r1 = "LibraryVersion"
            java.lang.String r2 = "Please provide a valid libraryName"
            p108h6.C2394s.m9614g(r9, r2)
            java.util.concurrent.ConcurrentHashMap r2 = r8.f9663a
            boolean r2 = r2.containsKey(r9)
            if (r2 == 0) goto L1a
            java.util.concurrent.ConcurrentHashMap r0 = r8.f9663a
            java.lang.Object r9 = r0.get(r9)
            java.lang.String r9 = (java.lang.String) r9
            return r9
        L1a:
            java.util.Properties r2 = new java.util.Properties
            r2.<init>()
            r3 = 0
            java.lang.String r4 = "/%s.properties"
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L76
            r6 = 0
            r5[r6] = r9     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L76
            java.lang.String r4 = java.lang.String.format(r4, r5)     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L76
            java.lang.Class<h6.o> r5 = p108h6.C2382o.class
            java.io.InputStream r4 = r5.getResourceAsStream(r4)     // Catch: java.lang.Throwable -> L74 java.io.IOException -> L76
            if (r4 == 0) goto L57
            r2.load(r4)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6f
            java.lang.String r5 = "version"
            java.lang.String r3 = r2.getProperty(r5, r3)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6f
            h6.j r2 = p108h6.C2382o.f9661b     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6f
            r5.<init>()     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6f
            r5.append(r9)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6f
            java.lang.String r6 = " version is "
            r5.append(r6)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6f
            r5.append(r3)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6f
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6f
            r2.m9574d(r1, r5)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6f
            goto L8f
        L57:
            h6.j r2 = p108h6.C2382o.f9661b     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6f
            r5.<init>()     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6f
            r5.append(r0)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6f
            r5.append(r9)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6f
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6f
            r2.m9575e(r1, r5)     // Catch: java.lang.Throwable -> L6c java.io.IOException -> L6f
            goto L8f
        L6c:
            r9 = move-exception
            r3 = r4
            goto La5
        L6f:
            r2 = move-exception
            r7 = r4
            r4 = r3
            r3 = r7
            goto L78
        L74:
            r9 = move-exception
            goto La5
        L76:
            r2 = move-exception
            r4 = r3
        L78:
            h6.j r5 = p108h6.C2382o.f9661b     // Catch: java.lang.Throwable -> L74
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r6.<init>()     // Catch: java.lang.Throwable -> L74
            r6.append(r0)     // Catch: java.lang.Throwable -> L74
            r6.append(r9)     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = r6.toString()     // Catch: java.lang.Throwable -> L74
            r5.m9573c(r1, r0, r2)     // Catch: java.lang.Throwable -> L74
            r7 = r4
            r4 = r3
            r3 = r7
        L8f:
            if (r4 == 0) goto L94
            p207o6.C3941j.m14949a(r4)
        L94:
            if (r3 != 0) goto L9f
            h6.j r0 = p108h6.C2382o.f9661b
            java.lang.String r2 = ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"
            r0.m9572b(r1, r2)
            java.lang.String r3 = "UNKNOWN"
        L9f:
            java.util.concurrent.ConcurrentHashMap r0 = r8.f9663a
            r0.put(r9, r3)
            return r3
        La5:
            if (r3 == 0) goto Laa
            p207o6.C3941j.m14949a(r3)
        Laa:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p108h6.C2382o.m9586b(java.lang.String):java.lang.String");
    }
}
