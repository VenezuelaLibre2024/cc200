package com.google.gson.internal.bind;

import com.google.gson.C1382r;
import com.google.gson.Gson;
import com.google.gson.InterfaceC1386v;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.C1361d;
import com.google.gson.internal.C1366i;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p310v9.C5153a;
import p339x9.C5740a;
import p355y9.C5897a;
import p355y9.C5899c;
import p355y9.EnumC5898b;

/* loaded from: classes.dex */
public final class DateTypeAdapter extends TypeAdapter<Date> {

    /* renamed from: b */
    public static final InterfaceC1386v f5007b = new InterfaceC1386v() { // from class: com.google.gson.internal.bind.DateTypeAdapter.1
        @Override // com.google.gson.InterfaceC1386v
        public <T> TypeAdapter<T> create(Gson gson, C5740a<T> c5740a) {
            if (c5740a.getRawType() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a */
    public final List<DateFormat> f5008a;

    /* renamed from: com.google.gson.internal.bind.DateTypeAdapter$1 */
    /* loaded from: classes.dex */
    public class C13121 implements InterfaceC1386v {
        @Override // com.google.gson.InterfaceC1386v
        public <T> TypeAdapter<T> create(Gson gson, C5740a<T> c5740a) {
            if (c5740a.getRawType() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    }

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.f5008a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C1361d.m5799e()) {
            arrayList.add(C1366i.m5819c(2, 2));
        }
    }

    /* renamed from: a */
    public final synchronized Date m5660a(String str) {
        Iterator<DateFormat> it = this.f5008a.iterator();
        while (it.hasNext()) {
            try {
                return it.next().parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return C5153a.m20849c(str, new ParsePosition(0));
        } catch (ParseException e10) {
            throw new C1382r(str, e10);
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b */
    public Date read(C5897a c5897a) {
        if (c5897a.mo5774r0() != EnumC5898b.NULL) {
            return m5660a(c5897a.mo5771l0());
        }
        c5897a.mo5770h0();
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: c */
    public synchronized void write(C5899c c5899c, Date date) {
        if (date == null) {
            c5899c.mo5779W();
        } else {
            c5899c.mo5786v0(this.f5008a.get(0).format(date));
        }
    }
}
