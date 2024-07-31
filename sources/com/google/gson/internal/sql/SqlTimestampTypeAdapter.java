package com.google.gson.internal.sql;

import com.google.gson.Gson;
import com.google.gson.InterfaceC1386v;
import com.google.gson.TypeAdapter;
import java.sql.Timestamp;
import java.util.Date;
import p339x9.C5740a;
import p355y9.C5897a;
import p355y9.C5899c;

/* loaded from: classes.dex */
class SqlTimestampTypeAdapter extends TypeAdapter<Timestamp> {

    /* renamed from: b */
    public static final InterfaceC1386v f5205b = new InterfaceC1386v() { // from class: com.google.gson.internal.sql.SqlTimestampTypeAdapter.1
        @Override // com.google.gson.InterfaceC1386v
        public <T> TypeAdapter<T> create(Gson gson, C5740a<T> c5740a) {
            if (c5740a.getRawType() == Timestamp.class) {
                return new SqlTimestampTypeAdapter(gson.m5587j(Date.class));
            }
            return null;
        }
    };

    /* renamed from: a */
    public final TypeAdapter<Date> f5206a;

    public SqlTimestampTypeAdapter(TypeAdapter<Date> typeAdapter) {
        this.f5206a = typeAdapter;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Timestamp read(C5897a c5897a) {
        Date read = this.f5206a.read(c5897a);
        if (read != null) {
            return new Timestamp(read.getTime());
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void write(C5899c c5899c, Timestamp timestamp) {
        this.f5206a.write(c5899c, timestamp);
    }
}
