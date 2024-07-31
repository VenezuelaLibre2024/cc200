package com.google.gson;

import com.google.gson.internal.bind.C1358a;
import com.google.gson.internal.bind.C1359b;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import p355y9.C5897a;
import p355y9.C5899c;
import p355y9.EnumC5898b;

/* loaded from: classes.dex */
public abstract class TypeAdapter<T> {
    public final T fromJson(Reader reader) {
        return read(new C5897a(reader));
    }

    public final T fromJson(String str) {
        return fromJson(new StringReader(str));
    }

    public final T fromJsonTree(AbstractC1374j abstractC1374j) {
        try {
            return read(new C1358a(abstractC1374j));
        } catch (IOException e10) {
            throw new C1375k(e10);
        }
    }

    public final TypeAdapter<T> nullSafe() {
        return new TypeAdapter<T>() { // from class: com.google.gson.TypeAdapter.1
            @Override // com.google.gson.TypeAdapter
            public T read(C5897a c5897a) {
                if (c5897a.mo5774r0() != EnumC5898b.NULL) {
                    return (T) TypeAdapter.this.read(c5897a);
                }
                c5897a.mo5770h0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            public void write(C5899c c5899c, T t10) {
                if (t10 == null) {
                    c5899c.mo5779W();
                } else {
                    TypeAdapter.this.write(c5899c, t10);
                }
            }
        };
    }

    public abstract T read(C5897a c5897a);

    public final String toJson(T t10) {
        StringWriter stringWriter = new StringWriter();
        try {
            toJson(stringWriter, t10);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final void toJson(Writer writer, T t10) {
        write(new C5899c(writer), t10);
    }

    public final AbstractC1374j toJsonTree(T t10) {
        try {
            C1359b c1359b = new C1359b();
            write(c1359b, t10);
            return c1359b.m5789z0();
        } catch (IOException e10) {
            throw new C1375k(e10);
        }
    }

    public abstract void write(C5899c c5899c, T t10);
}
