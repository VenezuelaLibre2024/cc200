package p165l2;

import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import p029c2.C0585c;
import p029c2.C0601s;
import p029c2.EnumC0583a;
import p029c2.EnumC0593k;
import p029c2.EnumC0596n;

/* renamed from: l2.v */
/* loaded from: classes.dex */
public class C3426v {

    /* renamed from: l2.v$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f12060a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f12061b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f12062c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f12063d;

        static {
            int[] iArr = new int[EnumC0596n.values().length];
            f12063d = iArr;
            try {
                iArr[EnumC0596n.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12063d[EnumC0596n.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0593k.values().length];
            f12062c = iArr2;
            try {
                iArr2[EnumC0593k.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12062c[EnumC0593k.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12062c[EnumC0593k.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12062c[EnumC0593k.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12062c[EnumC0593k.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[EnumC0583a.values().length];
            f12061b = iArr3;
            try {
                iArr3[EnumC0583a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12061b[EnumC0583a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[C0601s.a.values().length];
            f12060a = iArr4;
            try {
                iArr4[C0601s.a.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f12060a[C0601s.a.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f12060a[C0601s.a.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f12060a[C0601s.a.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f12060a[C0601s.a.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f12060a[C0601s.a.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* renamed from: a */
    public static int m12763a(EnumC0583a enumC0583a) {
        int i10 = a.f12061b[enumC0583a.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + enumC0583a + " to int");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x005a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p029c2.C0585c m12764b(byte[] r6) {
        /*
            c2.c r0 = new c2.c
            r0.<init>()
            if (r6 != 0) goto L8
            return r0
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r6)
            r6 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3d
            int r6 = r2.readInt()     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
        L17:
            if (r6 <= 0) goto L2b
            java.lang.String r3 = r2.readUTF()     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            boolean r4 = r2.readBoolean()     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            r0.m2956a(r3, r4)     // Catch: java.io.IOException -> L37 java.lang.Throwable -> L57
            int r6 = r6 + (-1)
            goto L17
        L2b:
            r2.close()     // Catch: java.io.IOException -> L2f
            goto L33
        L2f:
            r6 = move-exception
            r6.printStackTrace()
        L33:
            r1.close()     // Catch: java.io.IOException -> L52
            goto L56
        L37:
            r6 = move-exception
            goto L41
        L39:
            r0 = move-exception
            r2 = r6
            r6 = r0
            goto L58
        L3d:
            r2 = move-exception
            r5 = r2
            r2 = r6
            r6 = r5
        L41:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L4e
            r2.close()     // Catch: java.io.IOException -> L4a
            goto L4e
        L4a:
            r6 = move-exception
            r6.printStackTrace()
        L4e:
            r1.close()     // Catch: java.io.IOException -> L52
            goto L56
        L52:
            r6 = move-exception
            r6.printStackTrace()
        L56:
            return r0
        L57:
            r6 = move-exception
        L58:
            if (r2 == 0) goto L62
            r2.close()     // Catch: java.io.IOException -> L5e
            goto L62
        L5e:
            r0 = move-exception
            r0.printStackTrace()
        L62:
            r1.close()     // Catch: java.io.IOException -> L66
            goto L6a
        L66:
            r0 = move-exception
            r0.printStackTrace()
        L6a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p165l2.C3426v.m12764b(byte[]):c2.c");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0067 -> B:18:0x006a). Please report as a decompilation issue!!! */
    /* renamed from: c */
    public static byte[] m12765c(C0585c c0585c) {
        boolean hasNext;
        ObjectOutputStream objectOutputStream = null;
        ObjectOutputStream objectOutputStream2 = null;
        objectOutputStream = null;
        if (c0585c.m2958c() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
        } catch (IOException e10) {
            e10.printStackTrace();
            objectOutputStream = objectOutputStream;
        }
        try {
            try {
                ObjectOutputStream objectOutputStream3 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream3.writeInt(c0585c.m2958c());
                    Iterator<C0585c.a> it = c0585c.m2957b().iterator();
                    while (true) {
                        hasNext = it.hasNext();
                        if (hasNext != 0) {
                            C0585c.a next = it.next();
                            objectOutputStream3.writeUTF(next.m2959a().toString());
                            objectOutputStream3.writeBoolean(next.m2960b());
                        } else {
                            try {
                                break;
                            } catch (IOException e11) {
                                e11.printStackTrace();
                            }
                        }
                    }
                    objectOutputStream3.close();
                    byteArrayOutputStream.close();
                    objectOutputStream = hasNext;
                } catch (IOException e12) {
                    e = e12;
                    objectOutputStream2 = objectOutputStream3;
                    e.printStackTrace();
                    if (objectOutputStream2 != null) {
                        try {
                            objectOutputStream2.close();
                        } catch (IOException e13) {
                            e13.printStackTrace();
                        }
                    }
                    byteArrayOutputStream.close();
                    objectOutputStream = objectOutputStream2;
                    return byteArrayOutputStream.toByteArray();
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream3;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e14) {
                            e14.printStackTrace();
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e15) {
                        e15.printStackTrace();
                        throw th;
                    }
                }
            } catch (IOException e16) {
                e = e16;
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: d */
    public static EnumC0583a m12766d(int i10) {
        if (i10 == 0) {
            return EnumC0583a.EXPONENTIAL;
        }
        if (i10 == 1) {
            return EnumC0583a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to BackoffPolicy");
    }

    /* renamed from: e */
    public static EnumC0593k m12767e(int i10) {
        if (i10 == 0) {
            return EnumC0593k.NOT_REQUIRED;
        }
        if (i10 == 1) {
            return EnumC0593k.CONNECTED;
        }
        if (i10 == 2) {
            return EnumC0593k.UNMETERED;
        }
        if (i10 == 3) {
            return EnumC0593k.NOT_ROAMING;
        }
        if (i10 == 4) {
            return EnumC0593k.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i10 == 5) {
            return EnumC0593k.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to NetworkType");
    }

    /* renamed from: f */
    public static EnumC0596n m12768f(int i10) {
        if (i10 == 0) {
            return EnumC0596n.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i10 == 1) {
            return EnumC0596n.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to OutOfQuotaPolicy");
    }

    /* renamed from: g */
    public static C0601s.a m12769g(int i10) {
        if (i10 == 0) {
            return C0601s.a.ENQUEUED;
        }
        if (i10 == 1) {
            return C0601s.a.RUNNING;
        }
        if (i10 == 2) {
            return C0601s.a.SUCCEEDED;
        }
        if (i10 == 3) {
            return C0601s.a.FAILED;
        }
        if (i10 == 4) {
            return C0601s.a.BLOCKED;
        }
        if (i10 == 5) {
            return C0601s.a.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i10 + " to State");
    }

    /* renamed from: h */
    public static int m12770h(EnumC0593k enumC0593k) {
        int i10 = a.f12062c[enumC0593k.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && enumC0593k == EnumC0593k.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + enumC0593k + " to int");
    }

    /* renamed from: i */
    public static int m12771i(EnumC0596n enumC0596n) {
        int i10 = a.f12063d[enumC0596n.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + enumC0596n + " to int");
    }

    /* renamed from: j */
    public static int m12772j(C0601s.a aVar) {
        switch (a.f12060a[aVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + aVar + " to int");
        }
    }
}
