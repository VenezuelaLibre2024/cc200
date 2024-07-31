package com.google.gson.internal;

/* renamed from: com.google.gson.internal.d */
/* loaded from: classes.dex */
public final class C1361d {

    /* renamed from: a */
    public static final int f5166a = m5795a();

    /* renamed from: a */
    public static int m5795a() {
        return m5798d(System.getProperty("java.version"));
    }

    /* renamed from: b */
    public static int m5796b(String str) {
        try {
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb2.append(charAt);
            }
            return Integer.parseInt(sb2.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static int m5797c() {
        return f5166a;
    }

    /* renamed from: d */
    public static int m5798d(String str) {
        int m5800f = m5800f(str);
        if (m5800f == -1) {
            m5800f = m5796b(str);
        }
        if (m5800f == -1) {
            return 6;
        }
        return m5800f;
    }

    /* renamed from: e */
    public static boolean m5799e() {
        return f5166a >= 9;
    }

    /* renamed from: f */
    public static int m5800f(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
