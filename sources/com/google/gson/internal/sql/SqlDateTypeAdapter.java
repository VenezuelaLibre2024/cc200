package com.google.gson.internal.sql;

import com.google.gson.C1382r;
import com.google.gson.Gson;
import com.google.gson.InterfaceC1386v;
import com.google.gson.TypeAdapter;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import p339x9.C5740a;
import p355y9.C5897a;
import p355y9.C5899c;
import p355y9.EnumC5898b;

/* loaded from: classes.dex */
final class SqlDateTypeAdapter extends TypeAdapter<Date> {

    /* renamed from: b */
    public static final InterfaceC1386v f5201b = new InterfaceC1386v() { // from class: com.google.gson.internal.sql.SqlDateTypeAdapter.1
        @Override // com.google.gson.InterfaceC1386v
        public <T> TypeAdapter<T> create(Gson gson, C5740a<T> c5740a) {
            if (c5740a.getRawType() == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a */
    public final DateFormat f5202a;

    private SqlDateTypeAdapter() {
        this.f5202a = new SimpleDateFormat("MMM d, yyyy");
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public synchronized Date read(C5897a c5897a) {
        if (c5897a.mo5774r0() == EnumC5898b.NULL) {
            c5897a.mo5770h0();
            return null;
        }
        try {
            return new Date(this.f5202a.parse(c5897a.mo5771l0()).getTime());
        } catch (ParseException e10) {
            throw new C1382r(e10);
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public synchronized void write(C5899c c5899c, Date date) {
        c5899c.mo5786v0(date == null ? null : this.f5202a.format((java.util.Date) date));
    }
}
