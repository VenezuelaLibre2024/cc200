package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.google.gson.s */
/* loaded from: classes.dex */
public abstract class EnumC1383s {

    /* renamed from: h */
    public static final EnumC1383s f5216h;

    /* renamed from: i */
    public static final EnumC1383s f5217i;

    /* renamed from: j */
    public static final /* synthetic */ EnumC1383s[] f5218j;

    /* renamed from: com.google.gson.s$a */
    /* loaded from: classes.dex */
    public enum a extends EnumC1383s {
        public a(String str, int i10) {
            super(str, i10, null);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        f5216h = aVar;
        EnumC1383s enumC1383s = new EnumC1383s("STRING", 1) { // from class: com.google.gson.s.b
            {
                a aVar2 = null;
            }
        };
        f5217i = enumC1383s;
        f5218j = new EnumC1383s[]{aVar, enumC1383s};
    }

    public EnumC1383s(String str, int i10) {
    }

    public /* synthetic */ EnumC1383s(String str, int i10, a aVar) {
        this(str, i10);
    }

    public static EnumC1383s valueOf(String str) {
        return (EnumC1383s) Enum.valueOf(EnumC1383s.class, str);
    }

    public static EnumC1383s[] values() {
        return (EnumC1383s[]) f5218j.clone();
    }
}
