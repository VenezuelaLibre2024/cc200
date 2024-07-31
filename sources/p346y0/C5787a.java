package p346y0;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.flutter.embedding.android.KeyboardMap;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import p079f6.C1841a;
import p346y0.C5788b;

/* renamed from: y0.a */
/* loaded from: classes.dex */
public class C5787a {

    /* renamed from: U */
    public static SimpleDateFormat f21554U;

    /* renamed from: V */
    public static SimpleDateFormat f21555V;

    /* renamed from: Z */
    public static final e[] f21559Z;

    /* renamed from: a0 */
    public static final e[] f21560a0;

    /* renamed from: b0 */
    public static final e[] f21561b0;

    /* renamed from: c0 */
    public static final e[] f21562c0;

    /* renamed from: d0 */
    public static final e[] f21563d0;

    /* renamed from: e0 */
    public static final e f21564e0;

    /* renamed from: f0 */
    public static final e[] f21565f0;

    /* renamed from: g0 */
    public static final e[] f21566g0;

    /* renamed from: h0 */
    public static final e[] f21567h0;

    /* renamed from: i0 */
    public static final e[] f21568i0;

    /* renamed from: j0 */
    public static final e[][] f21569j0;

    /* renamed from: k0 */
    public static final e[] f21570k0;

    /* renamed from: l0 */
    public static final HashMap<Integer, e>[] f21571l0;

    /* renamed from: m0 */
    public static final HashMap<String, e>[] f21572m0;

    /* renamed from: n0 */
    public static final HashSet<String> f21573n0;

    /* renamed from: o0 */
    public static final HashMap<Integer, Integer> f21574o0;

    /* renamed from: p0 */
    public static final Charset f21575p0;

    /* renamed from: q0 */
    public static final byte[] f21576q0;

    /* renamed from: r0 */
    public static final byte[] f21577r0;

    /* renamed from: s0 */
    public static final Pattern f21578s0;

    /* renamed from: t0 */
    public static final Pattern f21579t0;

    /* renamed from: u0 */
    public static final Pattern f21580u0;

    /* renamed from: v0 */
    public static final Pattern f21582v0;

    /* renamed from: a */
    public String f21587a;

    /* renamed from: b */
    public FileDescriptor f21588b;

    /* renamed from: c */
    public AssetManager.AssetInputStream f21589c;

    /* renamed from: d */
    public int f21590d;

    /* renamed from: e */
    public boolean f21591e;

    /* renamed from: f */
    public final HashMap<String, d>[] f21592f;

    /* renamed from: g */
    public Set<Integer> f21593g;

    /* renamed from: h */
    public ByteOrder f21594h;

    /* renamed from: i */
    public boolean f21595i;

    /* renamed from: j */
    public boolean f21596j;

    /* renamed from: k */
    public boolean f21597k;

    /* renamed from: l */
    public int f21598l;

    /* renamed from: m */
    public int f21599m;

    /* renamed from: n */
    public byte[] f21600n;

    /* renamed from: o */
    public int f21601o;

    /* renamed from: p */
    public int f21602p;

    /* renamed from: q */
    public int f21603q;

    /* renamed from: r */
    public int f21604r;

    /* renamed from: s */
    public int f21605s;

    /* renamed from: t */
    public boolean f21606t;

    /* renamed from: u */
    public boolean f21607u;

    /* renamed from: v */
    public static final boolean f21581v = Log.isLoggable("ExifInterface", 3);

    /* renamed from: w */
    public static final List<Integer> f21583w = Arrays.asList(1, 6, 3, 8);

    /* renamed from: x */
    public static final List<Integer> f21584x = Arrays.asList(2, 7, 4, 5);

    /* renamed from: y */
    public static final int[] f21585y = {8, 8, 8};

    /* renamed from: z */
    public static final int[] f21586z = {4};

    /* renamed from: A */
    public static final int[] f21534A = {8};

    /* renamed from: B */
    public static final byte[] f21535B = {-1, -40, -1};

    /* renamed from: C */
    public static final byte[] f21536C = {102, 116, 121, 112};

    /* renamed from: D */
    public static final byte[] f21537D = {109, 105, 102, 49};

    /* renamed from: E */
    public static final byte[] f21538E = {104, 101, 105, 99};

    /* renamed from: F */
    public static final byte[] f21539F = {79, 76, 89, 77, 80, 0};

    /* renamed from: G */
    public static final byte[] f21540G = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: H */
    public static final byte[] f21541H = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: I */
    public static final byte[] f21542I = {101, 88, 73, 102};

    /* renamed from: J */
    public static final byte[] f21543J = {73, 72, 68, 82};

    /* renamed from: K */
    public static final byte[] f21544K = {73, 69, 78, 68};

    /* renamed from: L */
    public static final byte[] f21545L = {82, 73, 70, 70};

    /* renamed from: M */
    public static final byte[] f21546M = {87, 69, 66, 80};

    /* renamed from: N */
    public static final byte[] f21547N = {69, 88, 73, 70};

    /* renamed from: O */
    public static final byte[] f21548O = {-99, 1, 42};

    /* renamed from: P */
    public static final byte[] f21549P = "VP8X".getBytes(Charset.defaultCharset());

    /* renamed from: Q */
    public static final byte[] f21550Q = "VP8L".getBytes(Charset.defaultCharset());

    /* renamed from: R */
    public static final byte[] f21551R = "VP8 ".getBytes(Charset.defaultCharset());

    /* renamed from: S */
    public static final byte[] f21552S = "ANIM".getBytes(Charset.defaultCharset());

    /* renamed from: T */
    public static final byte[] f21553T = "ANMF".getBytes(Charset.defaultCharset());

    /* renamed from: W */
    public static final String[] f21556W = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: X */
    public static final int[] f21557X = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: Y */
    public static final byte[] f21558Y = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: y0.a$a */
    /* loaded from: classes.dex */
    public class a extends MediaDataSource {

        /* renamed from: h */
        public long f21608h;

        /* renamed from: i */
        public final /* synthetic */ g f21609i;

        public a(g gVar) {
            this.f21609i = gVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j10, byte[] bArr, int i10, int i11) {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f21608h;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + this.f21609i.available()) {
                        return -1;
                    }
                    this.f21609i.m23178n(j10);
                    this.f21608h = j10;
                }
                if (i11 > this.f21609i.available()) {
                    i11 = this.f21609i.available();
                }
                int read = this.f21609i.read(bArr, i10, i11);
                if (read >= 0) {
                    this.f21608h += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f21608h = -1L;
            return -1;
        }
    }

    /* renamed from: y0.a$b */
    /* loaded from: classes.dex */
    public static class b extends InputStream implements DataInput {

        /* renamed from: h */
        public final DataInputStream f21611h;

        /* renamed from: i */
        public int f21612i;

        /* renamed from: j */
        public ByteOrder f21613j;

        /* renamed from: k */
        public byte[] f21614k;

        /* renamed from: l */
        public int f21615l;

        public b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public b(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f21611h = dataInputStream;
            dataInputStream.mark(0);
            this.f21612i = 0;
            this.f21613j = byteOrder;
            this.f21615l = inputStream instanceof b ? ((b) inputStream).m23149a() : -1;
        }

        public b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.f21615l = bArr.length;
        }

        /* renamed from: a */
        public int m23149a() {
            return this.f21615l;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f21611h.available();
        }

        /* renamed from: d */
        public int m23150d() {
            return this.f21612i;
        }

        /* renamed from: f */
        public long m23151f() {
            return readInt() & KeyboardMap.kValueMask;
        }

        /* renamed from: j */
        public void m23152j(ByteOrder byteOrder) {
            this.f21613j = byteOrder;
        }

        /* renamed from: l */
        public void m23153l(int i10) {
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i10 - i11;
                int skip = (int) this.f21611h.skip(i12);
                if (skip <= 0) {
                    if (this.f21614k == null) {
                        this.f21614k = new byte[8192];
                    }
                    skip = this.f21611h.read(this.f21614k, 0, Math.min(8192, i12));
                    if (skip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i10 + " bytes.");
                    }
                }
                i11 += skip;
            }
            this.f21612i += i11;
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() {
            this.f21612i++;
            return this.f21611h.read();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            int read = this.f21611h.read(bArr, i10, i11);
            this.f21612i += read;
            return read;
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f21612i++;
            return this.f21611h.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() {
            this.f21612i++;
            int read = this.f21611h.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f21612i += 2;
            return this.f21611h.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) {
            this.f21612i += bArr.length;
            this.f21611h.readFully(bArr);
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i10, int i11) {
            this.f21612i += i11;
            this.f21611h.readFully(bArr, i10, i11);
        }

        @Override // java.io.DataInput
        public int readInt() {
            this.f21612i += 4;
            int read = this.f21611h.read();
            int read2 = this.f21611h.read();
            int read3 = this.f21611h.read();
            int read4 = this.f21611h.read();
            if ((read | read2 | read3 | read4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f21613j;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.f21613j);
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() {
            this.f21612i += 8;
            int read = this.f21611h.read();
            int read2 = this.f21611h.read();
            int read3 = this.f21611h.read();
            int read4 = this.f21611h.read();
            int read5 = this.f21611h.read();
            int read6 = this.f21611h.read();
            int read7 = this.f21611h.read();
            int read8 = this.f21611h.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f21613j;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            throw new IOException("Invalid byte order: " + this.f21613j);
        }

        @Override // java.io.DataInput
        public short readShort() {
            this.f21612i += 2;
            int read = this.f21611h.read();
            int read2 = this.f21611h.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f21613j;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.f21613j);
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f21612i += 2;
            return this.f21611h.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f21612i++;
            return this.f21611h.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() {
            this.f21612i += 2;
            int read = this.f21611h.read();
            int read2 = this.f21611h.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f21613j;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.f21613j);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i10) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }
    }

    /* renamed from: y0.a$c */
    /* loaded from: classes.dex */
    public static class c extends FilterOutputStream {

        /* renamed from: h */
        public final OutputStream f21616h;

        /* renamed from: i */
        public ByteOrder f21617i;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f21616h = outputStream;
            this.f21617i = byteOrder;
        }

        /* renamed from: a */
        public void m23154a(ByteOrder byteOrder) {
            this.f21617i = byteOrder;
        }

        /* renamed from: d */
        public void m23155d(int i10) {
            this.f21616h.write(i10);
        }

        /* renamed from: f */
        public void m23156f(int i10) {
            OutputStream outputStream;
            int i11;
            ByteOrder byteOrder = this.f21617i;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f21616h.write((i10 >>> 0) & 255);
                this.f21616h.write((i10 >>> 8) & 255);
                this.f21616h.write((i10 >>> 16) & 255);
                outputStream = this.f21616h;
                i11 = i10 >>> 24;
            } else {
                if (byteOrder != ByteOrder.BIG_ENDIAN) {
                    return;
                }
                this.f21616h.write((i10 >>> 24) & 255);
                this.f21616h.write((i10 >>> 16) & 255);
                this.f21616h.write((i10 >>> 8) & 255);
                outputStream = this.f21616h;
                i11 = i10 >>> 0;
            }
            outputStream.write(i11 & 255);
        }

        /* renamed from: j */
        public void m23157j(short s10) {
            OutputStream outputStream;
            int i10;
            ByteOrder byteOrder = this.f21617i;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f21616h.write((s10 >>> 0) & 255);
                outputStream = this.f21616h;
                i10 = s10 >>> 8;
            } else {
                if (byteOrder != ByteOrder.BIG_ENDIAN) {
                    return;
                }
                this.f21616h.write((s10 >>> 8) & 255);
                outputStream = this.f21616h;
                i10 = s10 >>> 0;
            }
            outputStream.write(i10 & 255);
        }

        /* renamed from: l */
        public void m23158l(long j10) {
            if (j10 > KeyboardMap.kValueMask) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
            }
            m23156f((int) j10);
        }

        /* renamed from: n */
        public void m23159n(int i10) {
            if (i10 > 65535) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
            }
            m23157j((short) i10);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) {
            this.f21616h.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            this.f21616h.write(bArr, i10, i11);
        }
    }

    /* renamed from: y0.a$d */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        public final int f21618a;

        /* renamed from: b */
        public final int f21619b;

        /* renamed from: c */
        public final long f21620c;

        /* renamed from: d */
        public final byte[] f21621d;

        public d(int i10, int i11, long j10, byte[] bArr) {
            this.f21618a = i10;
            this.f21619b = i11;
            this.f21620c = j10;
            this.f21621d = bArr;
        }

        public d(int i10, int i11, byte[] bArr) {
            this(i10, i11, -1L, bArr);
        }

        /* renamed from: a */
        public static d m23160a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(C5787a.f21575p0);
            return new d(1, bytes.length, bytes);
        }

        /* renamed from: b */
        public static d m23161b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C5787a.f21557X[12] * dArr.length]);
            wrap.order(byteOrder);
            for (double d10 : dArr) {
                wrap.putDouble(d10);
            }
            return new d(12, dArr.length, wrap.array());
        }

        /* renamed from: c */
        public static d m23162c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C5787a.f21557X[9] * iArr.length]);
            wrap.order(byteOrder);
            for (int i10 : iArr) {
                wrap.putInt(i10);
            }
            return new d(9, iArr.length, wrap.array());
        }

        /* renamed from: d */
        public static d m23163d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C5787a.f21557X[10] * fVarArr.length]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f21626a);
                wrap.putInt((int) fVar.f21627b);
            }
            return new d(10, fVarArr.length, wrap.array());
        }

        /* renamed from: e */
        public static d m23164e(String str) {
            byte[] bytes = (str + (char) 0).getBytes(C5787a.f21575p0);
            return new d(2, bytes.length, bytes);
        }

        /* renamed from: f */
        public static d m23165f(long j10, ByteOrder byteOrder) {
            return m23166g(new long[]{j10}, byteOrder);
        }

        /* renamed from: g */
        public static d m23166g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C5787a.f21557X[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j10 : jArr) {
                wrap.putInt((int) j10);
            }
            return new d(4, jArr.length, wrap.array());
        }

        /* renamed from: h */
        public static d m23167h(f fVar, ByteOrder byteOrder) {
            return m23168i(new f[]{fVar}, byteOrder);
        }

        /* renamed from: i */
        public static d m23168i(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C5787a.f21557X[5] * fVarArr.length]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f21626a);
                wrap.putInt((int) fVar.f21627b);
            }
            return new d(5, fVarArr.length, wrap.array());
        }

        /* renamed from: j */
        public static d m23169j(int i10, ByteOrder byteOrder) {
            return m23170k(new int[]{i10}, byteOrder);
        }

        /* renamed from: k */
        public static d m23170k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[C5787a.f21557X[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i10 : iArr) {
                wrap.putShort((short) i10);
            }
            return new d(3, iArr.length, wrap.array());
        }

        /* renamed from: l */
        public double m23171l(ByteOrder byteOrder) {
            Object m23174o = m23174o(byteOrder);
            if (m23174o == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (m23174o instanceof String) {
                return Double.parseDouble((String) m23174o);
            }
            if (m23174o instanceof long[]) {
                if (((long[]) m23174o).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (m23174o instanceof int[]) {
                if (((int[]) m23174o).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (m23174o instanceof double[]) {
                double[] dArr = (double[]) m23174o;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(m23174o instanceof f[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            f[] fVarArr = (f[]) m23174o;
            if (fVarArr.length == 1) {
                return fVarArr[0].m23177a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        /* renamed from: m */
        public int m23172m(ByteOrder byteOrder) {
            Object m23174o = m23174o(byteOrder);
            if (m23174o == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (m23174o instanceof String) {
                return Integer.parseInt((String) m23174o);
            }
            if (m23174o instanceof long[]) {
                long[] jArr = (long[]) m23174o;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(m23174o instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) m23174o;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        /* renamed from: n */
        public String m23173n(ByteOrder byteOrder) {
            Object m23174o = m23174o(byteOrder);
            if (m23174o == null) {
                return null;
            }
            if (m23174o instanceof String) {
                return (String) m23174o;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            if (m23174o instanceof long[]) {
                long[] jArr = (long[]) m23174o;
                while (i10 < jArr.length) {
                    sb2.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (m23174o instanceof int[]) {
                int[] iArr = (int[]) m23174o;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (m23174o instanceof double[]) {
                double[] dArr = (double[]) m23174o;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (!(m23174o instanceof f[])) {
                return null;
            }
            f[] fVarArr = (f[]) m23174o;
            while (i10 < fVarArr.length) {
                sb2.append(fVarArr[i10].f21626a);
                sb2.append('/');
                sb2.append(fVarArr[i10].f21627b);
                i10++;
                if (i10 != fVarArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x019c: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:169:0x019c */
        /* JADX WARN: Removed duplicated region for block: B:172:0x019f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object m23174o(java.nio.ByteOrder r11) {
            /*
                Method dump skipped, instructions count: 452
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p346y0.C5787a.d.m23174o(java.nio.ByteOrder):java.lang.Object");
        }

        /* renamed from: p */
        public int m23175p() {
            return C5787a.f21557X[this.f21618a] * this.f21619b;
        }

        public String toString() {
            return "(" + C5787a.f21556W[this.f21618a] + ", data length:" + this.f21621d.length + ")";
        }
    }

    /* renamed from: y0.a$e */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a */
        public final int f21622a;

        /* renamed from: b */
        public final String f21623b;

        /* renamed from: c */
        public final int f21624c;

        /* renamed from: d */
        public final int f21625d;

        public e(String str, int i10, int i11) {
            this.f21623b = str;
            this.f21622a = i10;
            this.f21624c = i11;
            this.f21625d = -1;
        }

        public e(String str, int i10, int i11, int i12) {
            this.f21623b = str;
            this.f21622a = i10;
            this.f21624c = i11;
            this.f21625d = i12;
        }

        /* renamed from: a */
        public boolean m23176a(int i10) {
            int i11;
            int i12 = this.f21624c;
            if (i12 == 7 || i10 == 7 || i12 == i10 || (i11 = this.f21625d) == i10) {
                return true;
            }
            if ((i12 == 4 || i11 == 4) && i10 == 3) {
                return true;
            }
            if ((i12 == 9 || i11 == 9) && i10 == 8) {
                return true;
            }
            return (i12 == 12 || i11 == 12) && i10 == 11;
        }
    }

    /* renamed from: y0.a$f */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a */
        public final long f21626a;

        /* renamed from: b */
        public final long f21627b;

        public f(double d10) {
            this((long) (d10 * 10000.0d), 10000L);
        }

        public f(long j10, long j11) {
            if (j11 == 0) {
                this.f21626a = 0L;
                this.f21627b = 1L;
            } else {
                this.f21626a = j10;
                this.f21627b = j11;
            }
        }

        /* renamed from: a */
        public double m23177a() {
            return this.f21626a / this.f21627b;
        }

        public String toString() {
            return this.f21626a + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + this.f21627b;
        }
    }

    /* renamed from: y0.a$g */
    /* loaded from: classes.dex */
    public static class g extends b {
        public g(InputStream inputStream) {
            super(inputStream);
            if (!inputStream.markSupported()) {
                throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            }
            this.f21611h.mark(C1841a.e.API_PRIORITY_OTHER);
        }

        public g(byte[] bArr) {
            super(bArr);
            this.f21611h.mark(C1841a.e.API_PRIORITY_OTHER);
        }

        /* renamed from: n */
        public void m23178n(long j10) {
            int i10 = this.f21612i;
            if (i10 > j10) {
                this.f21612i = 0;
                this.f21611h.reset();
            } else {
                j10 -= i10;
            }
            m23153l((int) j10);
        }
    }

    static {
        e[] eVarArr = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ImageWidth", 256, 3, 4), new e("ImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", 700, 1)};
        f21559Z = eVarArr;
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f21560a0 = eVarArr2;
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        f21561b0 = eVarArr3;
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        f21562c0 = eVarArr4;
        e[] eVarArr5 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", 256, 3, 4), new e("ThumbnailImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f21563d0 = eVarArr5;
        f21564e0 = new e("StripOffsets", 273, 3);
        e[] eVarArr6 = {new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)};
        f21565f0 = eVarArr6;
        e[] eVarArr7 = {new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4)};
        f21566g0 = eVarArr7;
        e[] eVarArr8 = {new e("AspectFrame", 4371, 3)};
        f21567h0 = eVarArr8;
        e[] eVarArr9 = {new e("ColorSpace", 55, 3)};
        f21568i0 = eVarArr9;
        e[][] eVarArr10 = {eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, eVarArr6, eVarArr7, eVarArr8, eVarArr9};
        f21569j0 = eVarArr10;
        f21570k0 = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        f21571l0 = new HashMap[eVarArr10.length];
        f21572m0 = new HashMap[eVarArr10.length];
        f21573n0 = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f21574o0 = new HashMap<>();
        Charset forName = Charset.forName("US-ASCII");
        f21575p0 = forName;
        f21576q0 = "Exif\u0000\u0000".getBytes(forName);
        f21577r0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f21554U = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f21555V = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            e[][] eVarArr11 = f21569j0;
            if (i10 >= eVarArr11.length) {
                HashMap<Integer, Integer> hashMap = f21574o0;
                e[] eVarArr12 = f21570k0;
                hashMap.put(Integer.valueOf(eVarArr12[0].f21622a), 5);
                hashMap.put(Integer.valueOf(eVarArr12[1].f21622a), 1);
                hashMap.put(Integer.valueOf(eVarArr12[2].f21622a), 2);
                hashMap.put(Integer.valueOf(eVarArr12[3].f21622a), 3);
                hashMap.put(Integer.valueOf(eVarArr12[4].f21622a), 7);
                hashMap.put(Integer.valueOf(eVarArr12[5].f21622a), 8);
                f21578s0 = Pattern.compile(".*[1-9].*");
                f21579t0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f21580u0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f21582v0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f21571l0[i10] = new HashMap<>();
            f21572m0[i10] = new HashMap<>();
            for (e eVar : eVarArr11[i10]) {
                f21571l0[i10].put(Integer.valueOf(eVar.f21622a), eVar);
                f21572m0[i10].put(eVar.f21623b, eVar);
            }
            i10++;
        }
    }

    public C5787a(FileDescriptor fileDescriptor) {
        FileInputStream fileInputStream;
        Throwable th;
        e[][] eVarArr = f21569j0;
        this.f21592f = new HashMap[eVarArr.length];
        this.f21593g = new HashSet(eVarArr.length);
        this.f21594h = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(fileDescriptor, "fileDescriptor cannot be null");
        this.f21589c = null;
        this.f21587a = null;
        boolean z10 = false;
        if (Build.VERSION.SDK_INT < 21 || !m23096C(fileDescriptor)) {
            this.f21588b = null;
        } else {
            this.f21588b = fileDescriptor;
            try {
                fileDescriptor = C5788b.a.m23186b(fileDescriptor);
                z10 = true;
            } catch (Exception e10) {
                throw new IOException("Failed to duplicate file descriptor", e10);
            }
        }
        try {
            fileInputStream = new FileInputStream(fileDescriptor);
        } catch (Throwable th2) {
            fileInputStream = null;
            th = th2;
        }
        try {
            m23107H(fileInputStream);
            C5788b.m23180b(fileInputStream);
            if (z10) {
                C5788b.m23179a(fileDescriptor);
            }
        } catch (Throwable th3) {
            th = th3;
            C5788b.m23180b(fileInputStream);
            if (z10) {
                C5788b.m23179a(fileDescriptor);
            }
            throw th;
        }
    }

    public C5787a(InputStream inputStream) {
        this(inputStream, 0);
    }

    public C5787a(InputStream inputStream, int i10) {
        e[][] eVarArr = f21569j0;
        this.f21592f = new HashMap[eVarArr.length];
        this.f21593g = new HashSet(eVarArr.length);
        this.f21594h = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(inputStream, "inputStream cannot be null");
        this.f21587a = null;
        if (i10 == 1) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, f21576q0.length);
            if (!m23100v(bufferedInputStream)) {
                Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                return;
            }
            this.f21591e = true;
            this.f21589c = null;
            this.f21588b = null;
            inputStream = bufferedInputStream;
        } else {
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f21589c = (AssetManager.AssetInputStream) inputStream;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (m23096C(fileInputStream.getFD())) {
                        this.f21589c = null;
                        this.f21588b = fileInputStream.getFD();
                    }
                }
                this.f21589c = null;
            }
            this.f21588b = null;
        }
        m23107H(inputStream);
    }

    public C5787a(String str) {
        e[][] eVarArr = f21569j0;
        this.f21592f = new HashMap[eVarArr.length];
        this.f21593g = new HashSet(eVarArr.length);
        this.f21594h = ByteOrder.BIG_ENDIAN;
        Objects.requireNonNull(str, "filename cannot be null");
        m23145u(str);
    }

    /* renamed from: C */
    public static boolean m23096C(FileDescriptor fileDescriptor) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                C5788b.a.m23187c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
                return true;
            } catch (Exception unused) {
                if (f21581v) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
            }
        }
        return false;
    }

    /* renamed from: E */
    public static boolean m23097E(int i10) {
        return i10 == 4 || i10 == 13 || i10 == 14;
    }

    /* renamed from: W */
    public static boolean m23098W(int i10) {
        return (i10 == 4 || i10 == 9 || i10 == 13 || i10 == 14) ? false : true;
    }

    /* renamed from: r */
    public static Pair<Integer, Integer> m23099r(String str) {
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair<Integer, Integer> m23099r = m23099r(split[0]);
            if (((Integer) m23099r.first).intValue() == 2) {
                return m23099r;
            }
            for (int i10 = 1; i10 < split.length; i10++) {
                Pair<Integer, Integer> m23099r2 = m23099r(split[i10]);
                int intValue = (((Integer) m23099r2.first).equals(m23099r.first) || ((Integer) m23099r2.second).equals(m23099r.first)) ? ((Integer) m23099r.first).intValue() : -1;
                int intValue2 = (((Integer) m23099r.second).intValue() == -1 || !(((Integer) m23099r2.first).equals(m23099r.second) || ((Integer) m23099r2.second).equals(m23099r.second))) ? -1 : ((Integer) m23099r.second).intValue();
                if (intValue == -1 && intValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (intValue == -1) {
                    m23099r = new Pair<>(Integer.valueOf(intValue2), -1);
                } else if (intValue2 == -1) {
                    m23099r = new Pair<>(Integer.valueOf(intValue), -1);
                }
            }
            return m23099r;
        }
        if (!str.contains(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE)) {
            try {
                try {
                    Long valueOf = Long.valueOf(Long.parseLong(str));
                    return (valueOf.longValue() < 0 || valueOf.longValue() > 65535) ? valueOf.longValue() < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1) : new Pair<>(3, 4);
                } catch (NumberFormatException unused) {
                    Double.parseDouble(str);
                    return new Pair<>(12, -1);
                }
            } catch (NumberFormatException unused2) {
                return new Pair<>(2, -1);
            }
        }
        String[] split2 = str.split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, -1);
        if (split2.length == 2) {
            try {
                long parseDouble = (long) Double.parseDouble(split2[0]);
                long parseDouble2 = (long) Double.parseDouble(split2[1]);
                if (parseDouble >= 0 && parseDouble2 >= 0) {
                    if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                        return new Pair<>(10, 5);
                    }
                    return new Pair<>(5, -1);
                }
                return new Pair<>(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair<>(2, -1);
    }

    /* renamed from: v */
    public static boolean m23100v(BufferedInputStream bufferedInputStream) {
        byte[] bArr = f21576q0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i10 = 0;
        while (true) {
            byte[] bArr3 = f21576q0;
            if (i10 >= bArr3.length) {
                return true;
            }
            if (bArr2[i10] != bArr3[i10]) {
                return false;
            }
            i10++;
        }
    }

    /* renamed from: x */
    public static boolean m23101x(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f21535B;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    /* renamed from: A */
    public final boolean m23102A(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i10 = 0; i10 < bytes.length; i10++) {
            if (bArr[i10] != bytes[i10]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: B */
    public final boolean m23103B(byte[] bArr) {
        b bVar;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            ByteOrder m23110K = m23110K(bVar);
            this.f21594h = m23110K;
            bVar.m23152j(m23110K);
            boolean z10 = bVar.readShort() == 85;
            bVar.close();
            return z10;
        } catch (Exception unused2) {
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
    }

    /* renamed from: D */
    public final boolean m23104D(HashMap hashMap) {
        d dVar;
        int m23172m;
        d dVar2 = (d) hashMap.get("BitsPerSample");
        if (dVar2 != null) {
            int[] iArr = (int[]) dVar2.m23174o(this.f21594h);
            int[] iArr2 = f21585y;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f21590d == 3 && (dVar = (d) hashMap.get("PhotometricInterpretation")) != null && (((m23172m = dVar.m23172m(this.f21594h)) == 1 && Arrays.equals(iArr, f21534A)) || (m23172m == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f21581v) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    /* renamed from: F */
    public final boolean m23105F(HashMap hashMap) {
        d dVar = (d) hashMap.get("ImageLength");
        d dVar2 = (d) hashMap.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.m23172m(this.f21594h) <= 512 && dVar2.m23172m(this.f21594h) <= 512;
    }

    /* renamed from: G */
    public final boolean m23106G(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f21545L;
            if (i10 >= bArr2.length) {
                int i11 = 0;
                while (true) {
                    byte[] bArr3 = f21546M;
                    if (i11 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f21545L.length + i11 + 4] != bArr3[i11]) {
                        return false;
                    }
                    i11++;
                }
            } else {
                if (bArr[i10] != bArr2[i10]) {
                    return false;
                }
                i10++;
            }
        }
    }

    /* renamed from: H */
    public final void m23107H(InputStream inputStream) {
        Objects.requireNonNull(inputStream, "inputstream shouldn't be null");
        for (int i10 = 0; i10 < f21569j0.length; i10++) {
            try {
                try {
                    this.f21592f[i10] = new HashMap<>();
                } catch (IOException | UnsupportedOperationException e10) {
                    boolean z10 = f21581v;
                    if (z10) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e10);
                    }
                    m23125a();
                    if (!z10) {
                        return;
                    }
                }
            } finally {
                m23125a();
                if (f21581v) {
                    m23109J();
                }
            }
        }
        if (!this.f21591e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f21590d = m23133h(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (m23098W(this.f21590d)) {
            g gVar = new g(inputStream);
            if (this.f21591e) {
                m23139n(gVar);
            } else {
                int i11 = this.f21590d;
                if (i11 == 12) {
                    m23131f(gVar);
                } else if (i11 == 7) {
                    m23134i(gVar);
                } else if (i11 == 10) {
                    m23138m(gVar);
                } else {
                    m23137l(gVar);
                }
            }
            gVar.m23178n(this.f21602p);
            m23121V(gVar);
        } else {
            b bVar = new b(inputStream);
            int i12 = this.f21590d;
            if (i12 == 4) {
                m23132g(bVar, 0, 0);
            } else if (i12 == 13) {
                m23135j(bVar);
            } else if (i12 == 9) {
                m23136k(bVar);
            } else if (i12 == 14) {
                m23142q(bVar);
            }
        }
    }

    /* renamed from: I */
    public final void m23108I(b bVar) {
        ByteOrder m23110K = m23110K(bVar);
        this.f21594h = m23110K;
        bVar.m23152j(m23110K);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i10 = this.f21590d;
        if (i10 != 7 && i10 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = bVar.readInt();
        if (readInt < 8) {
            throw new IOException("Invalid first Ifd offset: " + readInt);
        }
        int i11 = readInt - 8;
        if (i11 > 0) {
            bVar.m23153l(i11);
        }
    }

    /* renamed from: J */
    public final void m23109J() {
        for (int i10 = 0; i10 < this.f21592f.length; i10++) {
            Log.d("ExifInterface", "The size of tag group[" + i10 + "]: " + this.f21592f[i10].size());
            for (Map.Entry<String, d> entry : this.f21592f[i10].entrySet()) {
                d value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.m23173n(this.f21594h) + "'");
            }
        }
    }

    /* renamed from: K */
    public final ByteOrder m23110K(b bVar) {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            if (f21581v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            if (f21581v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    /* renamed from: L */
    public final void m23111L(byte[] bArr, int i10) {
        g gVar = new g(bArr);
        m23108I(gVar);
        m23112M(gVar, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x028c  */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m23112M(p346y0.C5787a.g r30, int r31) {
        /*
            Method dump skipped, instructions count: 953
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p346y0.C5787a.m23112M(y0.a$g, int):void");
    }

    /* renamed from: N */
    public final void m23113N(String str) {
        for (int i10 = 0; i10 < f21569j0.length; i10++) {
            this.f21592f[i10].remove(str);
        }
    }

    /* renamed from: O */
    public final void m23114O(int i10, String str, String str2) {
        if (this.f21592f[i10].isEmpty() || this.f21592f[i10].get(str) == null) {
            return;
        }
        HashMap[] hashMapArr = this.f21592f;
        hashMapArr[i10].put(str2, hashMapArr[i10].get(str));
        this.f21592f[i10].remove(str);
    }

    /* renamed from: P */
    public final void m23115P(g gVar, int i10) {
        d dVar = this.f21592f[i10].get("ImageLength");
        d dVar2 = this.f21592f[i10].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            d dVar3 = this.f21592f[i10].get("JPEGInterchangeFormat");
            d dVar4 = this.f21592f[i10].get("JPEGInterchangeFormatLength");
            if (dVar3 == null || dVar4 == null) {
                return;
            }
            int m23172m = dVar3.m23172m(this.f21594h);
            int m23172m2 = dVar3.m23172m(this.f21594h);
            gVar.m23178n(m23172m);
            byte[] bArr = new byte[m23172m2];
            gVar.readFully(bArr);
            m23132g(new b(bArr), m23172m, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00f2 A[Catch: all -> 0x011e, Exception -> 0x0120, TryCatch #17 {Exception -> 0x0120, all -> 0x011e, blocks: (B:58:0x00ee, B:60:0x00f2, B:62:0x00f6, B:64:0x010d, B:68:0x0105), top: B:57:0x00ee }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0105 A[Catch: all -> 0x011e, Exception -> 0x0120, TryCatch #17 {Exception -> 0x0120, all -> 0x011e, blocks: (B:58:0x00ee, B:60:0x00f2, B:62:0x00f6, B:64:0x010d, B:68:0x0105), top: B:57:0x00ee }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0157  */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m23116Q() {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p346y0.C5787a.m23116Q():void");
    }

    /* renamed from: R */
    public final void m23117R(InputStream inputStream, OutputStream outputStream) {
        if (f21581v) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.m23155d(-1);
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.m23155d(-40);
        d dVar = null;
        if (m23129d("Xmp") != null && this.f21607u) {
            dVar = this.f21592f[0].remove("Xmp");
        }
        cVar.m23155d(-1);
        cVar.m23155d(-31);
        m23126a0(cVar);
        if (dVar != null) {
            this.f21592f[0].put("Xmp", dVar);
        }
        byte[] bArr = new byte[4096];
        while (bVar.readByte() == -1) {
            byte readByte = bVar.readByte();
            if (readByte == -39 || readByte == -38) {
                cVar.m23155d(-1);
                cVar.m23155d(readByte);
                C5788b.m23182d(bVar, cVar);
                return;
            }
            if (readByte != -31) {
                cVar.m23155d(-1);
                cVar.m23155d(readByte);
                int readUnsignedShort = bVar.readUnsignedShort();
                cVar.m23159n(readUnsignedShort);
                int i10 = readUnsignedShort - 2;
                if (i10 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i10 > 0) {
                    int read = bVar.read(bArr, 0, Math.min(i10, 4096));
                    if (read >= 0) {
                        cVar.write(bArr, 0, read);
                        i10 -= read;
                    }
                }
            } else {
                int readUnsignedShort2 = bVar.readUnsignedShort() - 2;
                if (readUnsignedShort2 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (readUnsignedShort2 >= 6) {
                    bVar.readFully(bArr2);
                    if (Arrays.equals(bArr2, f21576q0)) {
                        bVar.m23153l(readUnsignedShort2 - 6);
                    }
                }
                cVar.m23155d(-1);
                cVar.m23155d(readByte);
                cVar.m23159n(readUnsignedShort2 + 2);
                if (readUnsignedShort2 >= 6) {
                    readUnsignedShort2 -= 6;
                    cVar.write(bArr2);
                }
                while (readUnsignedShort2 > 0) {
                    int read2 = bVar.read(bArr, 0, Math.min(readUnsignedShort2, 4096));
                    if (read2 >= 0) {
                        cVar.write(bArr, 0, read2);
                        readUnsignedShort2 -= read2;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    /* renamed from: S */
    public final void m23118S(InputStream inputStream, OutputStream outputStream) {
        if (f21581v) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = f21541H;
        C5788b.m23183e(bVar, cVar, bArr.length);
        int i10 = this.f21602p;
        if (i10 == 0) {
            int readInt = bVar.readInt();
            cVar.m23156f(readInt);
            C5788b.m23183e(bVar, cVar, readInt + 4 + 4);
        } else {
            C5788b.m23183e(bVar, cVar, ((i10 - bArr.length) - 4) - 4);
            bVar.m23153l(bVar.readInt() + 4 + 4);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                m23126a0(cVar2);
                byte[] byteArray = ((ByteArrayOutputStream) cVar2.f21616h).toByteArray();
                cVar.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                cVar.m23156f((int) crc32.getValue());
                C5788b.m23180b(byteArrayOutputStream2);
                C5788b.m23182d(bVar, cVar);
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                C5788b.m23180b(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: T */
    public final void m23119T(InputStream inputStream, OutputStream outputStream) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        if (f21581v) {
            Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(inputStream, byteOrder);
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = f21545L;
        C5788b.m23183e(bVar, cVar, bArr.length);
        byte[] bArr2 = f21546M;
        bVar.m23153l(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                    int i13 = this.f21602p;
                    if (i13 != 0) {
                        C5788b.m23183e(bVar, cVar2, ((i13 - ((bArr.length + 4) + bArr2.length)) - 4) - 4);
                        bVar.m23153l(4);
                        int readInt = bVar.readInt();
                        if (readInt % 2 != 0) {
                            readInt++;
                        }
                        bVar.m23153l(readInt);
                    } else {
                        byte[] bArr3 = new byte[4];
                        bVar.readFully(bArr3);
                        byte[] bArr4 = f21549P;
                        boolean z11 = true;
                        if (!Arrays.equals(bArr3, bArr4)) {
                            byte[] bArr5 = f21551R;
                            if (Arrays.equals(bArr3, bArr5) || Arrays.equals(bArr3, f21550Q)) {
                                int readInt2 = bVar.readInt();
                                int i14 = readInt2 % 2 == 1 ? readInt2 + 1 : readInt2;
                                byte[] bArr6 = new byte[3];
                                if (Arrays.equals(bArr3, bArr5)) {
                                    bVar.readFully(bArr6);
                                    byte[] bArr7 = new byte[3];
                                    bVar.readFully(bArr7);
                                    if (!Arrays.equals(f21548O, bArr7)) {
                                        throw new IOException("Error checking VP8 signature");
                                    }
                                    int readInt3 = bVar.readInt();
                                    i12 = (readInt3 << 2) >> 18;
                                    i14 -= 10;
                                    i10 = (readInt3 << 18) >> 18;
                                    i11 = readInt3;
                                    z11 = false;
                                } else if (!Arrays.equals(bArr3, f21550Q)) {
                                    i10 = 0;
                                    z11 = false;
                                    i11 = 0;
                                    i12 = 0;
                                } else {
                                    if (bVar.readByte() != 47) {
                                        throw new IOException("Error checking VP8L signature");
                                    }
                                    i11 = bVar.readInt();
                                    i10 = (i11 & 16383) + 1;
                                    i12 = ((i11 & 268419072) >>> 14) + 1;
                                    if ((i11 & 268435456) == 0) {
                                        z11 = false;
                                    }
                                    i14 -= 5;
                                }
                                cVar2.write(bArr4);
                                cVar2.m23156f(10);
                                byte[] bArr8 = new byte[10];
                                if (z11) {
                                    bArr8[0] = (byte) (bArr8[0] | 16);
                                }
                                bArr8[0] = (byte) (bArr8[0] | 8);
                                int i15 = i10 - 1;
                                int i16 = i12 - 1;
                                bArr8[4] = (byte) i15;
                                bArr8[5] = (byte) (i15 >> 8);
                                bArr8[6] = (byte) (i15 >> 16);
                                bArr8[7] = (byte) i16;
                                bArr8[8] = (byte) (i16 >> 8);
                                bArr8[9] = (byte) (i16 >> 16);
                                cVar2.write(bArr8);
                                cVar2.write(bArr3);
                                cVar2.m23156f(readInt2);
                                if (Arrays.equals(bArr3, bArr5)) {
                                    cVar2.write(bArr6);
                                    cVar2.write(f21548O);
                                } else {
                                    if (Arrays.equals(bArr3, f21550Q)) {
                                        cVar2.write(47);
                                    }
                                    C5788b.m23183e(bVar, cVar2, i14);
                                }
                                cVar2.m23156f(i11);
                                C5788b.m23183e(bVar, cVar2, i14);
                            }
                            C5788b.m23182d(bVar, cVar2);
                            int size = byteArrayOutputStream2.size();
                            byte[] bArr9 = f21546M;
                            cVar.m23156f(size + bArr9.length);
                            cVar.write(bArr9);
                            byteArrayOutputStream2.writeTo(cVar);
                            C5788b.m23180b(byteArrayOutputStream2);
                        }
                        int readInt4 = bVar.readInt();
                        byte[] bArr10 = new byte[readInt4 % 2 == 1 ? readInt4 + 1 : readInt4];
                        bVar.readFully(bArr10);
                        bArr10[0] = (byte) (8 | bArr10[0]);
                        boolean z12 = ((bArr10[0] >> 1) & 1) == 1;
                        cVar2.write(bArr4);
                        cVar2.m23156f(readInt4);
                        cVar2.write(bArr10);
                        if (z12) {
                            m23127b(bVar, cVar2, f21552S, null);
                            while (true) {
                                byte[] bArr11 = new byte[4];
                                try {
                                    bVar.readFully(bArr11);
                                    z10 = !Arrays.equals(bArr11, f21553T);
                                } catch (EOFException unused) {
                                    z10 = true;
                                }
                                if (z10) {
                                    break;
                                } else {
                                    m23128c(bVar, cVar2, bArr11);
                                }
                            }
                        } else {
                            m23127b(bVar, cVar2, f21551R, f21550Q);
                        }
                    }
                    m23126a0(cVar2);
                    C5788b.m23182d(bVar, cVar2);
                    int size2 = byteArrayOutputStream2.size();
                    byte[] bArr92 = f21546M;
                    cVar.m23156f(size2 + bArr92.length);
                    cVar.write(bArr92);
                    byteArrayOutputStream2.writeTo(cVar);
                    C5788b.m23180b(byteArrayOutputStream2);
                } catch (Exception e10) {
                    e = e10;
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    C5788b.m23180b(byteArrayOutputStream);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:56:0x01f4. Please report as an issue. */
    /* renamed from: U */
    public void m23120U(String str, String str2) {
        StringBuilder sb2;
        e eVar;
        int i10;
        int i11;
        HashMap<String, d> hashMap;
        d m23160a;
        HashMap<String, d> hashMap2;
        d m23162c;
        String str3 = str;
        String str4 = str2;
        Objects.requireNonNull(str3, "tag shouldn't be null");
        if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && str4 != null) {
            boolean find = f21580u0.matcher(str4).find();
            boolean find2 = f21582v0.matcher(str4).find();
            if (str2.length() != 19 || (!find && !find2)) {
                sb2 = new StringBuilder();
                sb2.append("Invalid value for ");
                sb2.append(str3);
                sb2.append(" : ");
                sb2.append(str4);
                Log.w("ExifInterface", sb2.toString());
                return;
            }
            if (find2) {
                str4 = str4.replaceAll("-", ":");
            }
        }
        if ("ISOSpeedRatings".equals(str3)) {
            if (f21581v) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str3 = "PhotographicSensitivity";
        }
        int i12 = 2;
        int i13 = 1;
        if (str4 != null && f21573n0.contains(str3)) {
            if (str3.equals("GPSTimeStamp")) {
                Matcher matcher = f21579t0.matcher(str4);
                if (!matcher.find()) {
                    sb2 = new StringBuilder();
                    sb2.append("Invalid value for ");
                    sb2.append(str3);
                    sb2.append(" : ");
                    sb2.append(str4);
                    Log.w("ExifInterface", sb2.toString());
                    return;
                }
                str4 = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    str4 = new f(Double.parseDouble(str4)).toString();
                } catch (NumberFormatException unused) {
                    sb2 = new StringBuilder();
                }
            }
        }
        int i14 = 0;
        int i15 = 0;
        while (i15 < f21569j0.length) {
            if ((i15 != 4 || this.f21595i) && (eVar = f21572m0[i15].get(str3)) != null) {
                if (str4 == null) {
                    this.f21592f[i15].remove(str3);
                } else {
                    Pair<Integer, Integer> m23099r = m23099r(str4);
                    int i16 = -1;
                    if (eVar.f21624c == ((Integer) m23099r.first).intValue() || eVar.f21624c == ((Integer) m23099r.second).intValue()) {
                        i10 = eVar.f21624c;
                    } else {
                        int i17 = eVar.f21625d;
                        if (i17 == -1 || !(i17 == ((Integer) m23099r.first).intValue() || eVar.f21625d == ((Integer) m23099r.second).intValue())) {
                            int i18 = eVar.f21624c;
                            if (i18 == i13 || i18 == 7 || i18 == i12) {
                                i10 = i18;
                            } else if (f21581v) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("Given tag (");
                                sb3.append(str3);
                                sb3.append(") value didn't match with one of expected formats: ");
                                String[] strArr = f21556W;
                                sb3.append(strArr[eVar.f21624c]);
                                sb3.append(eVar.f21625d == -1 ? "" : ", " + strArr[eVar.f21625d]);
                                sb3.append(" (guess: ");
                                sb3.append(strArr[((Integer) m23099r.first).intValue()]);
                                sb3.append(((Integer) m23099r.second).intValue() != -1 ? ", " + strArr[((Integer) m23099r.second).intValue()] : "");
                                sb3.append(")");
                                Log.d("ExifInterface", sb3.toString());
                            }
                        } else {
                            i10 = eVar.f21625d;
                        }
                    }
                    switch (i10) {
                        case 1:
                            i11 = i13;
                            hashMap = this.f21592f[i15];
                            m23160a = d.m23160a(str4);
                            hashMap.put(str3, m23160a);
                            break;
                        case 2:
                        case 7:
                            i11 = i13;
                            hashMap = this.f21592f[i15];
                            m23160a = d.m23164e(str4);
                            hashMap.put(str3, m23160a);
                            break;
                        case 3:
                            i11 = i13;
                            String[] split = str4.split(",", -1);
                            int[] iArr = new int[split.length];
                            for (int i19 = 0; i19 < split.length; i19++) {
                                iArr[i19] = Integer.parseInt(split[i19]);
                            }
                            hashMap = this.f21592f[i15];
                            m23160a = d.m23170k(iArr, this.f21594h);
                            hashMap.put(str3, m23160a);
                            break;
                        case 4:
                            i11 = i13;
                            String[] split2 = str4.split(",", -1);
                            long[] jArr = new long[split2.length];
                            for (int i20 = 0; i20 < split2.length; i20++) {
                                jArr[i20] = Long.parseLong(split2[i20]);
                            }
                            hashMap = this.f21592f[i15];
                            m23160a = d.m23166g(jArr, this.f21594h);
                            hashMap.put(str3, m23160a);
                            break;
                        case 5:
                            String[] split3 = str4.split(",", -1);
                            f[] fVarArr = new f[split3.length];
                            int i21 = 0;
                            while (i21 < split3.length) {
                                String[] split4 = split3[i21].split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, i16);
                                fVarArr[i21] = new f((long) Double.parseDouble(split4[0]), (long) Double.parseDouble(split4[1]));
                                i21++;
                                i16 = -1;
                            }
                            i11 = 1;
                            hashMap = this.f21592f[i15];
                            m23160a = d.m23168i(fVarArr, this.f21594h);
                            hashMap.put(str3, m23160a);
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            i11 = i13;
                            if (f21581v) {
                                Log.d("ExifInterface", "Data format isn't one of expected formats: " + i10);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            String[] split5 = str4.split(",", -1);
                            int[] iArr2 = new int[split5.length];
                            for (int i22 = 0; i22 < split5.length; i22++) {
                                iArr2[i22] = Integer.parseInt(split5[i22]);
                            }
                            hashMap2 = this.f21592f[i15];
                            m23162c = d.m23162c(iArr2, this.f21594h);
                            hashMap2.put(str3, m23162c);
                            i11 = 1;
                            break;
                        case 10:
                            String[] split6 = str4.split(",", -1);
                            f[] fVarArr2 = new f[split6.length];
                            int i23 = i14;
                            while (i23 < split6.length) {
                                String[] split7 = split6[i23].split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, -1);
                                fVarArr2[i23] = new f((long) Double.parseDouble(split7[i14]), (long) Double.parseDouble(split7[i13]));
                                i23++;
                                split6 = split6;
                                i14 = 0;
                                i13 = 1;
                            }
                            hashMap2 = this.f21592f[i15];
                            m23162c = d.m23163d(fVarArr2, this.f21594h);
                            hashMap2.put(str3, m23162c);
                            i11 = 1;
                            break;
                        case 12:
                            String[] split8 = str4.split(",", -1);
                            double[] dArr = new double[split8.length];
                            for (int i24 = i14; i24 < split8.length; i24++) {
                                dArr[i24] = Double.parseDouble(split8[i24]);
                            }
                            this.f21592f[i15].put(str3, d.m23161b(dArr, this.f21594h));
                            break;
                    }
                    i15++;
                    i13 = i11;
                    i12 = 2;
                    i14 = 0;
                }
            }
            i11 = i13;
            i15++;
            i13 = i11;
            i12 = 2;
            i14 = 0;
        }
    }

    /* renamed from: V */
    public final void m23121V(b bVar) {
        HashMap<String, d> hashMap = this.f21592f[4];
        d dVar = hashMap.get("Compression");
        if (dVar != null) {
            int m23172m = dVar.m23172m(this.f21594h);
            this.f21601o = m23172m;
            if (m23172m != 1) {
                if (m23172m != 6) {
                    if (m23172m != 7) {
                        return;
                    }
                }
            }
            if (m23104D(hashMap)) {
                m23144t(bVar, hashMap);
                return;
            }
            return;
        }
        this.f21601o = 6;
        m23143s(bVar, hashMap);
    }

    /* renamed from: X */
    public final void m23122X(int i10, int i11) {
        String str;
        if (this.f21592f[i10].isEmpty() || this.f21592f[i11].isEmpty()) {
            if (f21581v) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        d dVar = this.f21592f[i10].get("ImageLength");
        d dVar2 = this.f21592f[i10].get("ImageWidth");
        d dVar3 = this.f21592f[i11].get("ImageLength");
        d dVar4 = this.f21592f[i11].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            if (!f21581v) {
                return;
            } else {
                str = "First image does not contain valid size information";
            }
        } else {
            if (dVar3 != null && dVar4 != null) {
                int m23172m = dVar.m23172m(this.f21594h);
                int m23172m2 = dVar2.m23172m(this.f21594h);
                int m23172m3 = dVar3.m23172m(this.f21594h);
                int m23172m4 = dVar4.m23172m(this.f21594h);
                if (m23172m >= m23172m3 || m23172m2 >= m23172m4) {
                    return;
                }
                HashMap<String, d>[] hashMapArr = this.f21592f;
                HashMap<String, d> hashMap = hashMapArr[i10];
                hashMapArr[i10] = hashMapArr[i11];
                hashMapArr[i11] = hashMap;
                return;
            }
            if (!f21581v) {
                return;
            } else {
                str = "Second image does not contain valid size information";
            }
        }
        Log.d("ExifInterface", str);
    }

    /* renamed from: Y */
    public final void m23123Y(g gVar, int i10) {
        StringBuilder sb2;
        String arrays;
        d m23169j;
        d m23169j2;
        d dVar = this.f21592f[i10].get("DefaultCropSize");
        d dVar2 = this.f21592f[i10].get("SensorTopBorder");
        d dVar3 = this.f21592f[i10].get("SensorLeftBorder");
        d dVar4 = this.f21592f[i10].get("SensorBottomBorder");
        d dVar5 = this.f21592f[i10].get("SensorRightBorder");
        if (dVar == null) {
            if (dVar2 == null || dVar3 == null || dVar4 == null || dVar5 == null) {
                m23115P(gVar, i10);
                return;
            }
            int m23172m = dVar2.m23172m(this.f21594h);
            int m23172m2 = dVar4.m23172m(this.f21594h);
            int m23172m3 = dVar5.m23172m(this.f21594h);
            int m23172m4 = dVar3.m23172m(this.f21594h);
            if (m23172m2 <= m23172m || m23172m3 <= m23172m4) {
                return;
            }
            d m23169j3 = d.m23169j(m23172m2 - m23172m, this.f21594h);
            d m23169j4 = d.m23169j(m23172m3 - m23172m4, this.f21594h);
            this.f21592f[i10].put("ImageLength", m23169j3);
            this.f21592f[i10].put("ImageWidth", m23169j4);
            return;
        }
        if (dVar.f21618a == 5) {
            f[] fVarArr = (f[]) dVar.m23174o(this.f21594h);
            if (fVarArr != null && fVarArr.length == 2) {
                m23169j = d.m23167h(fVarArr[0], this.f21594h);
                m23169j2 = d.m23167h(fVarArr[1], this.f21594h);
                this.f21592f[i10].put("ImageWidth", m23169j);
                this.f21592f[i10].put("ImageLength", m23169j2);
                return;
            }
            sb2 = new StringBuilder();
            sb2.append("Invalid crop size values. cropSize=");
            arrays = Arrays.toString(fVarArr);
            sb2.append(arrays);
            Log.w("ExifInterface", sb2.toString());
        }
        int[] iArr = (int[]) dVar.m23174o(this.f21594h);
        if (iArr != null && iArr.length == 2) {
            m23169j = d.m23169j(iArr[0], this.f21594h);
            m23169j2 = d.m23169j(iArr[1], this.f21594h);
            this.f21592f[i10].put("ImageWidth", m23169j);
            this.f21592f[i10].put("ImageLength", m23169j2);
            return;
        }
        sb2 = new StringBuilder();
        sb2.append("Invalid crop size values. cropSize=");
        arrays = Arrays.toString(iArr);
        sb2.append(arrays);
        Log.w("ExifInterface", sb2.toString());
    }

    /* renamed from: Z */
    public final void m23124Z() {
        m23122X(0, 5);
        m23122X(0, 4);
        m23122X(5, 4);
        d dVar = this.f21592f[1].get("PixelXDimension");
        d dVar2 = this.f21592f[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            this.f21592f[0].put("ImageWidth", dVar);
            this.f21592f[0].put("ImageLength", dVar2);
        }
        if (this.f21592f[4].isEmpty() && m23105F(this.f21592f[5])) {
            HashMap<String, d>[] hashMapArr = this.f21592f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!m23105F(this.f21592f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        m23114O(0, "ThumbnailOrientation", "Orientation");
        m23114O(0, "ThumbnailImageLength", "ImageLength");
        m23114O(0, "ThumbnailImageWidth", "ImageWidth");
        m23114O(5, "ThumbnailOrientation", "Orientation");
        m23114O(5, "ThumbnailImageLength", "ImageLength");
        m23114O(5, "ThumbnailImageWidth", "ImageWidth");
        m23114O(4, "Orientation", "ThumbnailOrientation");
        m23114O(4, "ImageLength", "ThumbnailImageLength");
        m23114O(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* renamed from: a */
    public final void m23125a() {
        String m23129d = m23129d("DateTimeOriginal");
        if (m23129d != null && m23129d("DateTime") == null) {
            this.f21592f[0].put("DateTime", d.m23164e(m23129d));
        }
        if (m23129d("ImageWidth") == null) {
            this.f21592f[0].put("ImageWidth", d.m23165f(0L, this.f21594h));
        }
        if (m23129d("ImageLength") == null) {
            this.f21592f[0].put("ImageLength", d.m23165f(0L, this.f21594h));
        }
        if (m23129d("Orientation") == null) {
            this.f21592f[0].put("Orientation", d.m23165f(0L, this.f21594h));
        }
        if (m23129d("LightSource") == null) {
            this.f21592f[1].put("LightSource", d.m23165f(0L, this.f21594h));
        }
    }

    /* renamed from: a0 */
    public final int m23126a0(c cVar) {
        e[][] eVarArr = f21569j0;
        int[] iArr = new int[eVarArr.length];
        int[] iArr2 = new int[eVarArr.length];
        for (e eVar : f21570k0) {
            m23113N(eVar.f21623b);
        }
        if (this.f21595i) {
            if (this.f21596j) {
                m23113N("StripOffsets");
                m23113N("StripByteCounts");
            } else {
                m23113N("JPEGInterchangeFormat");
                m23113N("JPEGInterchangeFormatLength");
            }
        }
        for (int i10 = 0; i10 < f21569j0.length; i10++) {
            for (Object obj : this.f21592f[i10].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f21592f[i10].remove(entry.getKey());
                }
            }
        }
        if (!this.f21592f[1].isEmpty()) {
            this.f21592f[0].put(f21570k0[1].f21623b, d.m23165f(0L, this.f21594h));
        }
        if (!this.f21592f[2].isEmpty()) {
            this.f21592f[0].put(f21570k0[2].f21623b, d.m23165f(0L, this.f21594h));
        }
        if (!this.f21592f[3].isEmpty()) {
            this.f21592f[1].put(f21570k0[3].f21623b, d.m23165f(0L, this.f21594h));
        }
        if (this.f21595i) {
            if (this.f21596j) {
                this.f21592f[4].put("StripOffsets", d.m23169j(0, this.f21594h));
                this.f21592f[4].put("StripByteCounts", d.m23169j(this.f21599m, this.f21594h));
            } else {
                this.f21592f[4].put("JPEGInterchangeFormat", d.m23165f(0L, this.f21594h));
                this.f21592f[4].put("JPEGInterchangeFormatLength", d.m23165f(this.f21599m, this.f21594h));
            }
        }
        for (int i11 = 0; i11 < f21569j0.length; i11++) {
            Iterator<Map.Entry<String, d>> it = this.f21592f[i11].entrySet().iterator();
            int i12 = 0;
            while (it.hasNext()) {
                int m23175p = it.next().getValue().m23175p();
                if (m23175p > 4) {
                    i12 += m23175p;
                }
            }
            iArr2[i11] = iArr2[i11] + i12;
        }
        int i13 = 8;
        for (int i14 = 0; i14 < f21569j0.length; i14++) {
            if (!this.f21592f[i14].isEmpty()) {
                iArr[i14] = i13;
                i13 += (this.f21592f[i14].size() * 12) + 2 + 4 + iArr2[i14];
            }
        }
        if (this.f21595i) {
            if (this.f21596j) {
                this.f21592f[4].put("StripOffsets", d.m23169j(i13, this.f21594h));
            } else {
                this.f21592f[4].put("JPEGInterchangeFormat", d.m23165f(i13, this.f21594h));
            }
            this.f21598l = i13;
            i13 += this.f21599m;
        }
        if (this.f21590d == 4) {
            i13 += 8;
        }
        if (f21581v) {
            for (int i15 = 0; i15 < f21569j0.length; i15++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i15), Integer.valueOf(iArr[i15]), Integer.valueOf(this.f21592f[i15].size()), Integer.valueOf(iArr2[i15]), Integer.valueOf(i13)));
            }
        }
        if (!this.f21592f[1].isEmpty()) {
            this.f21592f[0].put(f21570k0[1].f21623b, d.m23165f(iArr[1], this.f21594h));
        }
        if (!this.f21592f[2].isEmpty()) {
            this.f21592f[0].put(f21570k0[2].f21623b, d.m23165f(iArr[2], this.f21594h));
        }
        if (!this.f21592f[3].isEmpty()) {
            this.f21592f[1].put(f21570k0[3].f21623b, d.m23165f(iArr[3], this.f21594h));
        }
        int i16 = this.f21590d;
        if (i16 == 4) {
            if (i13 > 65535) {
                throw new IllegalStateException("Size of exif data (" + i13 + " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)");
            }
            cVar.m23159n(i13);
            cVar.write(f21576q0);
        } else if (i16 == 13) {
            cVar.m23156f(i13);
            cVar.write(f21542I);
        } else if (i16 == 14) {
            cVar.write(f21547N);
            cVar.m23156f(i13);
        }
        cVar.m23157j(this.f21594h == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.m23154a(this.f21594h);
        cVar.m23159n(42);
        cVar.m23158l(8L);
        for (int i17 = 0; i17 < f21569j0.length; i17++) {
            if (!this.f21592f[i17].isEmpty()) {
                cVar.m23159n(this.f21592f[i17].size());
                int size = iArr[i17] + 2 + (this.f21592f[i17].size() * 12) + 4;
                for (Map.Entry<String, d> entry2 : this.f21592f[i17].entrySet()) {
                    int i18 = f21572m0[i17].get(entry2.getKey()).f21622a;
                    d value = entry2.getValue();
                    int m23175p2 = value.m23175p();
                    cVar.m23159n(i18);
                    cVar.m23159n(value.f21618a);
                    cVar.m23156f(value.f21619b);
                    if (m23175p2 > 4) {
                        cVar.m23158l(size);
                        size += m23175p2;
                    } else {
                        cVar.write(value.f21621d);
                        if (m23175p2 < 4) {
                            while (m23175p2 < 4) {
                                cVar.m23155d(0);
                                m23175p2++;
                            }
                        }
                    }
                }
                if (i17 != 0 || this.f21592f[4].isEmpty()) {
                    cVar.m23158l(0L);
                } else {
                    cVar.m23158l(iArr[4]);
                }
                Iterator<Map.Entry<String, d>> it2 = this.f21592f[i17].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = it2.next().getValue().f21621d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f21595i) {
            cVar.write(m23141p());
        }
        if (this.f21590d == 14 && i13 % 2 == 1) {
            cVar.m23155d(0);
        }
        cVar.m23154a(ByteOrder.BIG_ENDIAN);
        return i13;
    }

    /* renamed from: b */
    public final void m23127b(b bVar, c cVar, byte[] bArr, byte[] bArr2) {
        while (true) {
            byte[] bArr3 = new byte[4];
            bVar.readFully(bArr3);
            m23128c(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void m23128c(b bVar, c cVar, byte[] bArr) {
        int readInt = bVar.readInt();
        cVar.write(bArr);
        cVar.m23156f(readInt);
        if (readInt % 2 == 1) {
            readInt++;
        }
        C5788b.m23183e(bVar, cVar, readInt);
    }

    /* renamed from: d */
    public String m23129d(String str) {
        String str2;
        Objects.requireNonNull(str, "tag shouldn't be null");
        d m23130e = m23130e(str);
        if (m23130e != null) {
            if (!f21573n0.contains(str)) {
                return m23130e.m23173n(this.f21594h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i10 = m23130e.f21618a;
                if (i10 == 5 || i10 == 10) {
                    f[] fVarArr = (f[]) m23130e.m23174o(this.f21594h);
                    if (fVarArr != null && fVarArr.length == 3) {
                        return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) fVarArr[0].f21626a) / ((float) fVarArr[0].f21627b))), Integer.valueOf((int) (((float) fVarArr[1].f21626a) / ((float) fVarArr[1].f21627b))), Integer.valueOf((int) (((float) fVarArr[2].f21626a) / ((float) fVarArr[2].f21627b))));
                    }
                    str2 = "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr);
                } else {
                    str2 = "GPS Timestamp format is not rational. format=" + m23130e.f21618a;
                }
                Log.w("ExifInterface", str2);
                return null;
            }
            try {
                return Double.toString(m23130e.m23171l(this.f21594h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* renamed from: e */
    public final d m23130e(String str) {
        Objects.requireNonNull(str, "tag shouldn't be null");
        if ("ISOSpeedRatings".equals(str)) {
            if (f21581v) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < f21569j0.length; i10++) {
            d dVar = this.f21592f[i10].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    /* renamed from: f */
    public final void m23131f(g gVar) {
        String str;
        String str2;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                C5788b.b.m23188a(mediaMetadataRetriever, new a(gVar));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                String str3 = null;
                if ("yes".equals(extractMetadata3)) {
                    str3 = mediaMetadataRetriever.extractMetadata(29);
                    str = mediaMetadataRetriever.extractMetadata(30);
                    str2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str3 = mediaMetadataRetriever.extractMetadata(18);
                    str = mediaMetadataRetriever.extractMetadata(19);
                    str2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                }
                if (str3 != null) {
                    this.f21592f[0].put("ImageWidth", d.m23169j(Integer.parseInt(str3), this.f21594h));
                }
                if (str != null) {
                    this.f21592f[0].put("ImageLength", d.m23169j(Integer.parseInt(str), this.f21594h));
                }
                if (str2 != null) {
                    int i10 = 1;
                    int parseInt = Integer.parseInt(str2);
                    if (parseInt == 90) {
                        i10 = 6;
                    } else if (parseInt == 180) {
                        i10 = 3;
                    } else if (parseInt == 270) {
                        i10 = 8;
                    }
                    this.f21592f[0].put("Orientation", d.m23169j(i10, this.f21594h));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    gVar.m23178n(parseInt2);
                    byte[] bArr = new byte[6];
                    gVar.readFully(bArr);
                    int i11 = parseInt2 + 6;
                    int i12 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, f21576q0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i12];
                    gVar.readFully(bArr2);
                    this.f21602p = i11;
                    m23111L(bArr2, 0);
                }
                if (f21581v) {
                    Log.d("ExifInterface", "Heif meta: " + str3 + "x" + str + ", rotation " + str2);
                }
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x018f, code lost:
    
        r22.m23152j(r21.f21594h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0194, code lost:
    
        return;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x00b3. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0179 A[LOOP:0: B:9:0x0038->B:33:0x0179, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0183 A[SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m23132g(p346y0.C5787a.b r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p346y0.C5787a.m23132g(y0.a$b, int, int):void");
    }

    /* renamed from: h */
    public final int m23133h(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (m23101x(bArr)) {
            return 4;
        }
        if (m23102A(bArr)) {
            return 9;
        }
        if (m23146w(bArr)) {
            return 12;
        }
        if (m23147y(bArr)) {
            return 7;
        }
        if (m23103B(bArr)) {
            return 10;
        }
        if (m23148z(bArr)) {
            return 13;
        }
        return m23106G(bArr) ? 14 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m23134i(p346y0.C5787a.g r7) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p346y0.C5787a.m23134i(y0.a$g):void");
    }

    /* renamed from: j */
    public final void m23135j(b bVar) {
        if (f21581v) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.m23152j(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f21541H;
        bVar.m23153l(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i10 = length + 4 + 4;
                if (i10 == 16 && !Arrays.equals(bArr2, f21543J)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, f21544K)) {
                    return;
                }
                if (Arrays.equals(bArr2, f21542I)) {
                    byte[] bArr3 = new byte[readInt];
                    bVar.readFully(bArr3);
                    int readInt2 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.f21602p = i10;
                        m23111L(bArr3, 0);
                        m23124Z();
                        m23121V(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                }
                int i11 = readInt + 4;
                bVar.m23153l(i11);
                length = i10 + i11;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    /* renamed from: k */
    public final void m23136k(b bVar) {
        boolean z10 = f21581v;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.m23153l(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.m23153l(i10 - bVar.m23150d());
        bVar.readFully(bArr4);
        m23132g(new b(bArr4), i10, 5);
        bVar.m23153l(i12 - bVar.m23150d());
        bVar.m23152j(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i13 = 0; i13 < readInt; i13++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f21564e0.f21622a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                d m23169j = d.m23169j(readShort, this.f21594h);
                d m23169j2 = d.m23169j(readShort2, this.f21594h);
                this.f21592f[0].put("ImageLength", m23169j);
                this.f21592f[0].put("ImageWidth", m23169j2);
                if (f21581v) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.m23153l(readUnsignedShort2);
        }
    }

    /* renamed from: l */
    public final void m23137l(g gVar) {
        d dVar;
        m23108I(gVar);
        m23112M(gVar, 0);
        m23123Y(gVar, 0);
        m23123Y(gVar, 5);
        m23123Y(gVar, 4);
        m23124Z();
        if (this.f21590d != 8 || (dVar = this.f21592f[1].get("MakerNote")) == null) {
            return;
        }
        g gVar2 = new g(dVar.f21621d);
        gVar2.m23152j(this.f21594h);
        gVar2.m23153l(6);
        m23112M(gVar2, 9);
        d dVar2 = this.f21592f[9].get("ColorSpace");
        if (dVar2 != null) {
            this.f21592f[1].put("ColorSpace", dVar2);
        }
    }

    /* renamed from: m */
    public final void m23138m(g gVar) {
        if (f21581v) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        m23137l(gVar);
        d dVar = this.f21592f[0].get("JpgFromRaw");
        if (dVar != null) {
            m23132g(new b(dVar.f21621d), (int) dVar.f21620c, 5);
        }
        d dVar2 = this.f21592f[0].get("ISO");
        d dVar3 = this.f21592f[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        this.f21592f[1].put("PhotographicSensitivity", dVar2);
    }

    /* renamed from: n */
    public final void m23139n(g gVar) {
        byte[] bArr = f21576q0;
        gVar.m23153l(bArr.length);
        byte[] bArr2 = new byte[gVar.available()];
        gVar.readFully(bArr2);
        this.f21602p = bArr.length;
        m23111L(bArr2, 0);
    }

    /* renamed from: o */
    public byte[] m23140o() {
        int i10 = this.f21601o;
        if (i10 == 6 || i10 == 7) {
            return m23141p();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[Catch: Exception -> 0x0081, all -> 0x009e, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x009e, blocks: (B:18:0x0062, B:23:0x0083, B:24:0x0088, B:26:0x0090), top: B:6:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083 A[Catch: Exception -> 0x0081, all -> 0x009e, TRY_ENTER, TryCatch #6 {all -> 0x009e, blocks: (B:18:0x0062, B:23:0x0083, B:24:0x0088, B:26:0x0090), top: B:6:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a5  */
    /* JADX WARN: Type inference failed for: r1v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.content.res.AssetManager$AssetInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable, java.io.InputStream] */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public byte[] m23141p() {
        /*
            r8 = this;
            java.lang.String r0 = "ExifInterface"
            boolean r1 = r8.f21595i
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            byte[] r1 = r8.f21600n
            if (r1 == 0) goto Ld
            return r1
        Ld:
            android.content.res.AssetManager$AssetInputStream r1 = r8.f21589c     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            if (r1 == 0) goto L2e
            boolean r3 = r1.markSupported()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
            if (r3 == 0) goto L1c
            r1.reset()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
        L1a:
            r3 = r2
            goto L60
        L1c:
            java.lang.String r3 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r0, r3)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
            p346y0.C5788b.m23180b(r1)
            return r2
        L25:
            r0 = move-exception
            r3 = r2
            goto L9f
        L29:
            r3 = move-exception
            r4 = r3
            r3 = r2
            goto L90
        L2e:
            java.lang.String r1 = r8.f21587a     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            if (r1 == 0) goto L3a
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            java.lang.String r3 = r8.f21587a     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            goto L1a
        L3a:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            r3 = 21
            if (r1 < r3) goto L5e
            java.io.FileDescriptor r1 = r8.f21588b     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            java.io.FileDescriptor r1 = p346y0.C5788b.a.m23186b(r1)     // Catch: java.lang.Throwable -> L89 java.lang.Exception -> L8c
            r3 = 0
            int r5 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            p346y0.C5788b.a.m23187c(r1, r3, r5)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L56 java.lang.Exception -> L59
            r7 = r3
            r3 = r1
            r1 = r7
            goto L60
        L56:
            r0 = move-exception
            r3 = r1
            goto La0
        L59:
            r3 = move-exception
            r4 = r3
            r3 = r1
            r1 = r2
            goto L90
        L5e:
            r1 = r2
            r3 = r1
        L60:
            if (r1 == 0) goto L83
            y0.a$b r4 = new y0.a$b     // Catch: java.lang.Exception -> L81 java.lang.Throwable -> L9e
            r4.<init>(r1)     // Catch: java.lang.Exception -> L81 java.lang.Throwable -> L9e
            int r5 = r8.f21598l     // Catch: java.lang.Exception -> L81 java.lang.Throwable -> L9e
            int r6 = r8.f21602p     // Catch: java.lang.Exception -> L81 java.lang.Throwable -> L9e
            int r5 = r5 + r6
            r4.m23153l(r5)     // Catch: java.lang.Exception -> L81 java.lang.Throwable -> L9e
            int r5 = r8.f21599m     // Catch: java.lang.Exception -> L81 java.lang.Throwable -> L9e
            byte[] r5 = new byte[r5]     // Catch: java.lang.Exception -> L81 java.lang.Throwable -> L9e
            r4.readFully(r5)     // Catch: java.lang.Exception -> L81 java.lang.Throwable -> L9e
            r8.f21600n = r5     // Catch: java.lang.Exception -> L81 java.lang.Throwable -> L9e
            p346y0.C5788b.m23180b(r1)
            if (r3 == 0) goto L80
            p346y0.C5788b.m23179a(r3)
        L80:
            return r5
        L81:
            r4 = move-exception
            goto L90
        L83:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException     // Catch: java.lang.Exception -> L81 java.lang.Throwable -> L9e
            r4.<init>()     // Catch: java.lang.Exception -> L81 java.lang.Throwable -> L9e
            throw r4     // Catch: java.lang.Exception -> L81 java.lang.Throwable -> L9e
        L89:
            r0 = move-exception
            r3 = r2
            goto La0
        L8c:
            r3 = move-exception
            r1 = r2
            r4 = r3
            r3 = r1
        L90:
            java.lang.String r5 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r0, r5, r4)     // Catch: java.lang.Throwable -> L9e
            p346y0.C5788b.m23180b(r1)
            if (r3 == 0) goto L9d
            p346y0.C5788b.m23179a(r3)
        L9d:
            return r2
        L9e:
            r0 = move-exception
        L9f:
            r2 = r1
        La0:
            p346y0.C5788b.m23180b(r2)
            if (r3 == 0) goto La8
            p346y0.C5788b.m23179a(r3)
        La8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p346y0.C5787a.m23141p():byte[]");
    }

    /* renamed from: q */
    public final void m23142q(b bVar) {
        if (f21581v) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.m23152j(ByteOrder.LITTLE_ENDIAN);
        bVar.m23153l(f21545L.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = f21546M;
        bVar.m23153l(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int readInt2 = bVar.readInt();
                int i10 = length + 4 + 4;
                if (Arrays.equals(f21547N, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    bVar.readFully(bArr3);
                    this.f21602p = i10;
                    m23111L(bArr3, 0);
                    m23121V(new b(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i10 + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.m23153l(readInt2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* renamed from: s */
    public final void m23143s(b bVar, HashMap hashMap) {
        d dVar = (d) hashMap.get("JPEGInterchangeFormat");
        d dVar2 = (d) hashMap.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int m23172m = dVar.m23172m(this.f21594h);
        int m23172m2 = dVar2.m23172m(this.f21594h);
        if (this.f21590d == 7) {
            m23172m += this.f21603q;
        }
        if (m23172m > 0 && m23172m2 > 0) {
            this.f21595i = true;
            if (this.f21587a == null && this.f21589c == null && this.f21588b == null) {
                byte[] bArr = new byte[m23172m2];
                bVar.m23153l(m23172m);
                bVar.readFully(bArr);
                this.f21600n = bArr;
            }
            this.f21598l = m23172m;
            this.f21599m = m23172m2;
        }
        if (f21581v) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + m23172m + ", length: " + m23172m2);
        }
    }

    /* renamed from: t */
    public final void m23144t(b bVar, HashMap hashMap) {
        d dVar = (d) hashMap.get("StripOffsets");
        d dVar2 = (d) hashMap.get("StripByteCounts");
        if (dVar == null || dVar2 == null) {
            return;
        }
        long[] m23181c = C5788b.m23181c(dVar.m23174o(this.f21594h));
        long[] m23181c2 = C5788b.m23181c(dVar2.m23174o(this.f21594h));
        if (m23181c == null || m23181c.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (m23181c2 == null || m23181c2.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (m23181c.length != m23181c2.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j10 = 0;
        for (long j11 : m23181c2) {
            j10 += j11;
        }
        int i10 = (int) j10;
        byte[] bArr = new byte[i10];
        int i11 = 1;
        this.f21597k = true;
        this.f21596j = true;
        this.f21595i = true;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < m23181c.length) {
            int i15 = (int) m23181c[i12];
            int i16 = (int) m23181c2[i12];
            if (i12 < m23181c.length - i11 && i15 + i16 != m23181c[i12 + 1]) {
                this.f21597k = false;
            }
            int i17 = i15 - i13;
            if (i17 < 0) {
                Log.d("ExifInterface", "Invalid strip offset value");
                return;
            }
            try {
                bVar.m23153l(i17);
                int i18 = i13 + i17;
                byte[] bArr2 = new byte[i16];
                try {
                    bVar.readFully(bArr2);
                    i13 = i18 + i16;
                    System.arraycopy(bArr2, 0, bArr, i14, i16);
                    i14 += i16;
                    i12++;
                    i11 = 1;
                } catch (EOFException unused) {
                    Log.d("ExifInterface", "Failed to read " + i16 + " bytes.");
                    return;
                }
            } catch (EOFException unused2) {
                Log.d("ExifInterface", "Failed to skip " + i17 + " bytes.");
                return;
            }
        }
        this.f21600n = bArr;
        if (this.f21597k) {
            this.f21598l = (int) m23181c[0];
            this.f21599m = i10;
        }
    }

    /* renamed from: u */
    public final void m23145u(String str) {
        FileInputStream fileInputStream;
        Objects.requireNonNull(str, "filename cannot be null");
        FileInputStream fileInputStream2 = null;
        this.f21589c = null;
        this.f21587a = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (m23096C(fileInputStream.getFD())) {
                this.f21588b = fileInputStream.getFD();
            } else {
                this.f21588b = null;
            }
            m23107H(fileInputStream);
            C5788b.m23180b(fileInputStream);
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            C5788b.m23180b(fileInputStream2);
            throw th;
        }
    }

    /* renamed from: w */
    public final boolean m23146w(byte[] bArr) {
        b bVar;
        long readInt;
        byte[] bArr2;
        b bVar2 = null;
        try {
            try {
                bVar = new b(bArr);
                try {
                    readInt = bVar.readInt();
                    bArr2 = new byte[4];
                    bVar.readFully(bArr2);
                } catch (Exception e10) {
                    e = e10;
                    bVar2 = bVar;
                    if (f21581v) {
                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                    }
                    if (bVar2 != null) {
                        bVar2.close();
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e11) {
            e = e11;
        }
        if (!Arrays.equals(bArr2, f21536C)) {
            bVar.close();
            return false;
        }
        long j10 = 16;
        if (readInt == 1) {
            readInt = bVar.readLong();
            if (readInt < 16) {
                bVar.close();
                return false;
            }
        } else {
            j10 = 8;
        }
        if (readInt > bArr.length) {
            readInt = bArr.length;
        }
        long j11 = readInt - j10;
        if (j11 < 8) {
            bVar.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z10 = false;
        boolean z11 = false;
        for (long j12 = 0; j12 < j11 / 4; j12++) {
            try {
                bVar.readFully(bArr3);
                if (j12 != 1) {
                    if (Arrays.equals(bArr3, f21537D)) {
                        z10 = true;
                    } else if (Arrays.equals(bArr3, f21538E)) {
                        z11 = true;
                    }
                    if (z10 && z11) {
                        bVar.close();
                        return true;
                    }
                }
            } catch (EOFException unused) {
                bVar.close();
                return false;
            }
        }
        bVar.close();
        return false;
    }

    /* renamed from: y */
    public final boolean m23147y(byte[] bArr) {
        b bVar;
        b bVar2 = null;
        try {
            bVar = new b(bArr);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            ByteOrder m23110K = m23110K(bVar);
            this.f21594h = m23110K;
            bVar.m23152j(m23110K);
            short readShort = bVar.readShort();
            boolean z10 = readShort == 20306 || readShort == 21330;
            bVar.close();
            return z10;
        } catch (Exception unused2) {
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
    }

    /* renamed from: z */
    public final boolean m23148z(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f21541H;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }
}
