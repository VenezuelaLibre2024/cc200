package com.google.gson.internal;

import com.google.gson.AbstractC1374j;
import com.google.gson.C1375k;
import com.google.gson.C1376l;
import com.google.gson.C1382r;
import com.google.gson.internal.bind.TypeAdapters;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import p355y9.C5897a;
import p355y9.C5899c;
import p355y9.C5900d;

/* renamed from: com.google.gson.internal.k */
/* loaded from: classes.dex */
public final class C1368k {

    /* renamed from: com.google.gson.internal.k$a */
    /* loaded from: classes.dex */
    public static final class a extends Writer {

        /* renamed from: h */
        public final Appendable f5193h;

        /* renamed from: i */
        public final C6157a f5194i = new C6157a();

        /* renamed from: com.google.gson.internal.k$a$a */
        /* loaded from: classes.dex */
        public static class C6157a implements CharSequence {

            /* renamed from: h */
            public char[] f5195h;

            @Override // java.lang.CharSequence
            public char charAt(int i10) {
                return this.f5195h[i10];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f5195h.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i10, int i11) {
                return new String(this.f5195h, i10, i11 - i10);
            }
        }

        public a(Appendable appendable) {
            this.f5193h = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(int i10) {
            this.f5193h.append((char) i10);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            C6157a c6157a = this.f5194i;
            c6157a.f5195h = cArr;
            this.f5193h.append(c6157a, i10, i11 + i10);
        }
    }

    /* renamed from: a */
    public static AbstractC1374j m5821a(C5897a c5897a) {
        boolean z10;
        try {
            try {
                c5897a.mo5774r0();
                z10 = false;
                try {
                    return TypeAdapters.f5082U.read(c5897a);
                } catch (EOFException e10) {
                    e = e10;
                    if (z10) {
                        return C1376l.f5213a;
                    }
                    throw new C1382r(e);
                }
            } catch (IOException e11) {
                throw new C1375k(e11);
            } catch (NumberFormatException e12) {
                throw new C1382r(e12);
            } catch (C5900d e13) {
                throw new C1382r(e13);
            }
        } catch (EOFException e14) {
            e = e14;
            z10 = true;
        }
    }

    /* renamed from: b */
    public static void m5822b(AbstractC1374j abstractC1374j, C5899c c5899c) {
        TypeAdapters.f5082U.write(c5899c, abstractC1374j);
    }

    /* renamed from: c */
    public static Writer m5823c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new a(appendable);
    }
}
