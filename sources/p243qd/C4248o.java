package p243qd;

import java.io.InputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import td.C4753m;

/* renamed from: qd.o */
/* loaded from: classes2.dex */
public final class C4248o {
    /* renamed from: a */
    public static final long m16298a(Reader reader, Writer writer, int i10) {
        C4753m.m18653f(reader, "<this>");
        C4753m.m18653f(writer, "out");
        char[] cArr = new char[i10];
        int read = reader.read(cArr);
        long j10 = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j10 += read;
            read = reader.read(cArr);
        }
        return j10;
    }

    /* renamed from: b */
    public static /* synthetic */ long m16299b(Reader reader, Writer writer, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        return m16298a(reader, writer, i10);
    }

    /* renamed from: c */
    public static final byte[] m16300c(URL url) {
        C4753m.m18653f(url, "<this>");
        InputStream openStream = url.openStream();
        try {
            C4753m.m18652e(openStream, "it");
            byte[] m16273c = C4235b.m16273c(openStream);
            C4236c.m16274a(openStream, null);
            return m16273c;
        } finally {
        }
    }

    /* renamed from: d */
    public static final String m16301d(Reader reader) {
        C4753m.m18653f(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        m16299b(reader, stringWriter, 0, 2, null);
        String stringWriter2 = stringWriter.toString();
        C4753m.m18652e(stringWriter2, "buffer.toString()");
        return stringWriter2;
    }
}
