package com.google.gson.internal.bind;

import com.google.gson.C1382r;
import com.google.gson.InterfaceC1386v;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.C1309a;
import com.google.gson.internal.C1361d;
import com.google.gson.internal.C1366i;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p310v9.C5153a;
import p355y9.C5897a;
import p355y9.C5899c;
import p355y9.EnumC5898b;

/* loaded from: classes.dex */
public final class DefaultDateTypeAdapter<T extends Date> extends TypeAdapter<T> {

    /* renamed from: a */
    public final AbstractC1314b<T> f5009a;

    /* renamed from: b */
    public final List<DateFormat> f5010b;

    /* renamed from: com.google.gson.internal.bind.DefaultDateTypeAdapter$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1314b<T extends Date> {

        /* renamed from: b */
        public static final AbstractC1314b<Date> f5011b = new a(Date.class);

        /* renamed from: a */
        public final Class<T> f5012a;

        /* renamed from: com.google.gson.internal.bind.DefaultDateTypeAdapter$b$a */
        /* loaded from: classes.dex */
        public class a extends AbstractC1314b<Date> {
            public a(Class cls) {
                super(cls);
            }

            @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.AbstractC1314b
            /* renamed from: d */
            public Date mo5669d(Date date) {
                return date;
            }
        }

        public AbstractC1314b(Class<T> cls) {
            this.f5012a = cls;
        }

        /* renamed from: a */
        public final InterfaceC1386v m5666a(int i10, int i11) {
            return m5668c(new DefaultDateTypeAdapter<>(this, i10, i11));
        }

        /* renamed from: b */
        public final InterfaceC1386v m5667b(String str) {
            return m5668c(new DefaultDateTypeAdapter<>(this, str));
        }

        /* renamed from: c */
        public final InterfaceC1386v m5668c(DefaultDateTypeAdapter<T> defaultDateTypeAdapter) {
            return TypeAdapters.m5692a(this.f5012a, defaultDateTypeAdapter);
        }

        /* renamed from: d */
        public abstract T mo5669d(Date date);
    }

    public DefaultDateTypeAdapter(AbstractC1314b<T> abstractC1314b, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f5010b = arrayList;
        this.f5009a = (AbstractC1314b) C1309a.m5636b(abstractC1314b);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
        }
        if (C1361d.m5799e()) {
            arrayList.add(C1366i.m5819c(i10, i11));
        }
    }

    public DefaultDateTypeAdapter(AbstractC1314b<T> abstractC1314b, String str) {
        ArrayList arrayList = new ArrayList();
        this.f5010b = arrayList;
        this.f5009a = (AbstractC1314b) C1309a.m5636b(abstractC1314b);
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    /* renamed from: a */
    public final Date m5663a(String str) {
        synchronized (this.f5010b) {
            Iterator<DateFormat> it = this.f5010b.iterator();
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
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public T read(C5897a c5897a) {
        if (c5897a.mo5774r0() == EnumC5898b.NULL) {
            c5897a.mo5770h0();
            return null;
        }
        return this.f5009a.mo5669d(m5663a(c5897a.mo5771l0()));
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void write(C5899c c5899c, Date date) {
        if (date == null) {
            c5899c.mo5779W();
            return;
        }
        synchronized (this.f5010b) {
            c5899c.mo5786v0(this.f5010b.get(0).format(date));
        }
    }

    public String toString() {
        StringBuilder sb2;
        String simpleName;
        DateFormat dateFormat = this.f5010b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            sb2 = new StringBuilder();
            sb2.append("DefaultDateTypeAdapter(");
            simpleName = ((SimpleDateFormat) dateFormat).toPattern();
        } else {
            sb2 = new StringBuilder();
            sb2.append("DefaultDateTypeAdapter(");
            simpleName = dateFormat.getClass().getSimpleName();
        }
        sb2.append(simpleName);
        sb2.append(')');
        return sb2.toString();
    }
}
