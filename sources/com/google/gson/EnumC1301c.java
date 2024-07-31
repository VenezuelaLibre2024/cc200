package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.google.gson.c */
/* loaded from: classes.dex */
public abstract class EnumC1301c implements InterfaceC1302d {

    /* renamed from: h */
    public static final EnumC1301c f4955h;

    /* renamed from: i */
    public static final EnumC1301c f4956i;

    /* renamed from: j */
    public static final EnumC1301c f4957j;

    /* renamed from: k */
    public static final EnumC1301c f4958k;

    /* renamed from: l */
    public static final EnumC1301c f4959l;

    /* renamed from: m */
    public static final EnumC1301c f4960m;

    /* renamed from: n */
    public static final /* synthetic */ EnumC1301c[] f4961n;

    /* renamed from: com.google.gson.c$a */
    /* loaded from: classes.dex */
    public enum a extends EnumC1301c {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // com.google.gson.InterfaceC1302d
        /* renamed from: b */
        public String mo5614b(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        f4955h = aVar;
        EnumC1301c enumC1301c = new EnumC1301c("UPPER_CAMEL_CASE", 1) { // from class: com.google.gson.c.b
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.InterfaceC1302d
            /* renamed from: b */
            public String mo5614b(Field field) {
                return EnumC1301c.m5613f(field.getName());
            }
        };
        f4956i = enumC1301c;
        EnumC1301c enumC1301c2 = new EnumC1301c("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: com.google.gson.c.c
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.InterfaceC1302d
            /* renamed from: b */
            public String mo5614b(Field field) {
                return EnumC1301c.m5613f(EnumC1301c.m5612c(field.getName(), " "));
            }
        };
        f4957j = enumC1301c2;
        EnumC1301c enumC1301c3 = new EnumC1301c("LOWER_CASE_WITH_UNDERSCORES", 3) { // from class: com.google.gson.c.d
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.InterfaceC1302d
            /* renamed from: b */
            public String mo5614b(Field field) {
                return EnumC1301c.m5612c(field.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        };
        f4958k = enumC1301c3;
        EnumC1301c enumC1301c4 = new EnumC1301c("LOWER_CASE_WITH_DASHES", 4) { // from class: com.google.gson.c.e
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.InterfaceC1302d
            /* renamed from: b */
            public String mo5614b(Field field) {
                return EnumC1301c.m5612c(field.getName(), "-").toLowerCase(Locale.ENGLISH);
            }
        };
        f4959l = enumC1301c4;
        EnumC1301c enumC1301c5 = new EnumC1301c("LOWER_CASE_WITH_DOTS", 5) { // from class: com.google.gson.c.f
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.InterfaceC1302d
            /* renamed from: b */
            public String mo5614b(Field field) {
                return EnumC1301c.m5612c(field.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        };
        f4960m = enumC1301c5;
        f4961n = new EnumC1301c[]{aVar, enumC1301c, enumC1301c2, enumC1301c3, enumC1301c4, enumC1301c5};
    }

    public EnumC1301c(String str, int i10) {
    }

    public /* synthetic */ EnumC1301c(String str, int i10, a aVar) {
        this(str, i10);
    }

    /* renamed from: c */
    public static String m5612c(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt) && sb2.length() != 0) {
                sb2.append(str2);
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    /* renamed from: f */
    public static String m5613f(String str) {
        int length = str.length() - 1;
        int i10 = 0;
        while (!Character.isLetter(str.charAt(i10)) && i10 < length) {
            i10++;
        }
        char charAt = str.charAt(i10);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        if (i10 == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i10) + upperCase + str.substring(i10 + 1);
    }

    public static EnumC1301c valueOf(String str) {
        return (EnumC1301c) Enum.valueOf(EnumC1301c.class, str);
    }

    public static EnumC1301c[] values() {
        return (EnumC1301c[]) f4961n.clone();
    }
}
