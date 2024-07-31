package com.google.gson.internal.sql;

import com.google.gson.InterfaceC1386v;
import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import java.sql.Timestamp;
import java.util.Date;

/* renamed from: com.google.gson.internal.sql.a */
/* loaded from: classes.dex */
public final class C1373a {

    /* renamed from: a */
    public static final boolean f5207a;

    /* renamed from: b */
    public static final DefaultDateTypeAdapter.AbstractC1314b<? extends Date> f5208b;

    /* renamed from: c */
    public static final DefaultDateTypeAdapter.AbstractC1314b<? extends Date> f5209c;

    /* renamed from: d */
    public static final InterfaceC1386v f5210d;

    /* renamed from: e */
    public static final InterfaceC1386v f5211e;

    /* renamed from: f */
    public static final InterfaceC1386v f5212f;

    /* renamed from: com.google.gson.internal.sql.a$a */
    /* loaded from: classes.dex */
    public class a extends DefaultDateTypeAdapter.AbstractC1314b<java.sql.Date> {
        public a(Class cls) {
            super(cls);
        }

        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.AbstractC1314b
        /* renamed from: e */
        public java.sql.Date mo5669d(Date date) {
            return new java.sql.Date(date.getTime());
        }
    }

    /* renamed from: com.google.gson.internal.sql.a$b */
    /* loaded from: classes.dex */
    public class b extends DefaultDateTypeAdapter.AbstractC1314b<Timestamp> {
        public b(Class cls) {
            super(cls);
        }

        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.AbstractC1314b
        /* renamed from: e */
        public Timestamp mo5669d(Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z10;
        InterfaceC1386v interfaceC1386v;
        try {
            Class.forName("java.sql.Date");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f5207a = z10;
        if (z10) {
            f5208b = new a(java.sql.Date.class);
            f5209c = new b(Timestamp.class);
            f5210d = SqlDateTypeAdapter.f5201b;
            f5211e = SqlTimeTypeAdapter.f5203b;
            interfaceC1386v = SqlTimestampTypeAdapter.f5205b;
        } else {
            interfaceC1386v = null;
            f5208b = null;
            f5209c = null;
            f5210d = null;
            f5211e = null;
        }
        f5212f = interfaceC1386v;
    }
}
