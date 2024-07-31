package p077f4;

import java.nio.ByteBuffer;
import java.util.UUID;
import p222p5.C4015a0;
import p222p5.C4046r;

/* renamed from: f4.l */
/* loaded from: classes.dex */
public final class C1831l {

    /* renamed from: f4.l$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        public final UUID f6916a;

        /* renamed from: b */
        public final int f6917b;

        /* renamed from: c */
        public final byte[] f6918c;

        public a(UUID uuid, int i10, byte[] bArr) {
            this.f6916a = uuid;
            this.f6917b = i10;
            this.f6918c = bArr;
        }
    }

    /* renamed from: a */
    public static byte[] m7526a(UUID uuid, byte[] bArr) {
        return m7527b(uuid, null, bArr);
    }

    /* renamed from: b */
    public static byte[] m7527b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(1886614376);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    /* renamed from: c */
    public static boolean m7528c(byte[] bArr) {
        return m7529d(bArr) != null;
    }

    /* renamed from: d */
    public static a m7529d(byte[] bArr) {
        C4015a0 c4015a0 = new C4015a0(bArr);
        if (c4015a0.m15232g() < 32) {
            return null;
        }
        c4015a0.m15223T(0);
        if (c4015a0.m15241p() != c4015a0.m15226a() + 4 || c4015a0.m15241p() != 1886614376) {
            return null;
        }
        int m7391c = AbstractC1820a.m7391c(c4015a0.m15241p());
        if (m7391c > 1) {
            C4046r.m15529i("PsshAtomUtil", "Unsupported pssh version: " + m7391c);
            return null;
        }
        UUID uuid = new UUID(c4015a0.m15251z(), c4015a0.m15251z());
        if (m7391c == 1) {
            c4015a0.m15224U(c4015a0.m15214K() * 16);
        }
        int m15214K = c4015a0.m15214K();
        if (m15214K != c4015a0.m15226a()) {
            return null;
        }
        byte[] bArr2 = new byte[m15214K];
        c4015a0.m15237l(bArr2, 0, m15214K);
        return new a(uuid, m7391c, bArr2);
    }

    /* renamed from: e */
    public static byte[] m7530e(byte[] bArr, UUID uuid) {
        a m7529d = m7529d(bArr);
        if (m7529d == null) {
            return null;
        }
        if (uuid.equals(m7529d.f6916a)) {
            return m7529d.f6918c;
        }
        C4046r.m15529i("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + m7529d.f6916a + ".");
        return null;
    }

    /* renamed from: f */
    public static UUID m7531f(byte[] bArr) {
        a m7529d = m7529d(bArr);
        if (m7529d == null) {
            return null;
        }
        return m7529d.f6916a;
    }

    /* renamed from: g */
    public static int m7532g(byte[] bArr) {
        a m7529d = m7529d(bArr);
        if (m7529d == null) {
            return -1;
        }
        return m7529d.f6917b;
    }
}
