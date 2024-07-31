package p369z8;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* renamed from: z8.n */
/* loaded from: classes.dex */
public class C6090n {

    /* renamed from: a */
    public static final byte f22613a = Byte.parseByte("01110000", 2);

    /* renamed from: b */
    public static final byte f22614b = Byte.parseByte("00001111", 2);

    /* renamed from: b */
    public static String m24337b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    /* renamed from: c */
    public static byte[] m24338c(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    /* renamed from: a */
    public String m24339a() {
        byte[] m24338c = m24338c(UUID.randomUUID(), new byte[17]);
        m24338c[16] = m24338c[0];
        m24338c[0] = (byte) ((f22614b & m24338c[0]) | f22613a);
        return m24337b(m24338c);
    }
}
