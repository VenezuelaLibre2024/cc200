package androidx.emoji2.text;

import io.flutter.embedding.android.KeyboardMap;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p314w0.C5192b;

/* renamed from: androidx.emoji2.text.l */
/* loaded from: classes.dex */
public class C0268l {

    /* renamed from: androidx.emoji2.text.l$a */
    /* loaded from: classes.dex */
    public static class a implements c {

        /* renamed from: a */
        public final ByteBuffer f1280a;

        public a(ByteBuffer byteBuffer) {
            this.f1280a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.C0268l.c
        /* renamed from: a */
        public void mo1315a(int i10) {
            ByteBuffer byteBuffer = this.f1280a;
            byteBuffer.position(byteBuffer.position() + i10);
        }

        @Override // androidx.emoji2.text.C0268l.c
        /* renamed from: b */
        public int mo1316b() {
            return this.f1280a.getInt();
        }

        @Override // androidx.emoji2.text.C0268l.c
        /* renamed from: c */
        public long mo1317c() {
            return C0268l.m1313c(this.f1280a.getInt());
        }

        @Override // androidx.emoji2.text.C0268l.c
        public long getPosition() {
            return this.f1280a.position();
        }

        @Override // androidx.emoji2.text.C0268l.c
        public int readUnsignedShort() {
            return C0268l.m1314d(this.f1280a.getShort());
        }
    }

    /* renamed from: androidx.emoji2.text.l$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final long f1281a;

        /* renamed from: b */
        public final long f1282b;

        public b(long j10, long j11) {
            this.f1281a = j10;
            this.f1282b = j11;
        }

        /* renamed from: a */
        public long m1318a() {
            return this.f1281a;
        }
    }

    /* renamed from: androidx.emoji2.text.l$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo1315a(int i10);

        /* renamed from: b */
        int mo1316b();

        /* renamed from: c */
        long mo1317c();

        long getPosition();

        int readUnsignedShort();
    }

    /* renamed from: a */
    public static b m1311a(c cVar) {
        long j10;
        cVar.mo1315a(4);
        int readUnsignedShort = cVar.readUnsignedShort();
        if (readUnsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        cVar.mo1315a(6);
        int i10 = 0;
        while (true) {
            if (i10 >= readUnsignedShort) {
                j10 = -1;
                break;
            }
            int mo1316b = cVar.mo1316b();
            cVar.mo1315a(4);
            j10 = cVar.mo1317c();
            cVar.mo1315a(4);
            if (1835365473 == mo1316b) {
                break;
            }
            i10++;
        }
        if (j10 != -1) {
            cVar.mo1315a((int) (j10 - cVar.getPosition()));
            cVar.mo1315a(12);
            long mo1317c = cVar.mo1317c();
            for (int i11 = 0; i11 < mo1317c; i11++) {
                int mo1316b2 = cVar.mo1316b();
                long mo1317c2 = cVar.mo1317c();
                long mo1317c3 = cVar.mo1317c();
                if (1164798569 == mo1316b2 || 1701669481 == mo1316b2) {
                    return new b(mo1317c2 + j10, mo1317c3);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    /* renamed from: b */
    public static C5192b m1312b(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) m1311a(new a(duplicate)).m1318a());
        return C5192b.m21020h(duplicate);
    }

    /* renamed from: c */
    public static long m1313c(int i10) {
        return i10 & KeyboardMap.kValueMask;
    }

    /* renamed from: d */
    public static int m1314d(short s10) {
        return s10 & 65535;
    }
}
