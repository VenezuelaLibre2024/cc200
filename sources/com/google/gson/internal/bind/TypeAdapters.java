package com.google.gson.internal.bind;

import com.google.gson.AbstractC1374j;
import com.google.gson.C1305g;
import com.google.gson.C1375k;
import com.google.gson.C1376l;
import com.google.gson.C1377m;
import com.google.gson.C1379o;
import com.google.gson.C1382r;
import com.google.gson.Gson;
import com.google.gson.InterfaceC1386v;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.C1363f;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import p295u9.InterfaceC4996c;
import p339x9.C5740a;
import p355y9.C5897a;
import p355y9.C5899c;
import p355y9.EnumC5898b;

/* loaded from: classes.dex */
public final class TypeAdapters {

    /* renamed from: A */
    public static final TypeAdapter<BigInteger> f5062A;

    /* renamed from: B */
    public static final InterfaceC1386v f5063B;

    /* renamed from: C */
    public static final TypeAdapter<StringBuilder> f5064C;

    /* renamed from: D */
    public static final InterfaceC1386v f5065D;

    /* renamed from: E */
    public static final TypeAdapter<StringBuffer> f5066E;

    /* renamed from: F */
    public static final InterfaceC1386v f5067F;

    /* renamed from: G */
    public static final TypeAdapter<URL> f5068G;

    /* renamed from: H */
    public static final InterfaceC1386v f5069H;

    /* renamed from: I */
    public static final TypeAdapter<URI> f5070I;

    /* renamed from: J */
    public static final InterfaceC1386v f5071J;

    /* renamed from: K */
    public static final TypeAdapter<InetAddress> f5072K;

    /* renamed from: L */
    public static final InterfaceC1386v f5073L;

    /* renamed from: M */
    public static final TypeAdapter<UUID> f5074M;

    /* renamed from: N */
    public static final InterfaceC1386v f5075N;

    /* renamed from: O */
    public static final TypeAdapter<Currency> f5076O;

    /* renamed from: P */
    public static final InterfaceC1386v f5077P;

    /* renamed from: Q */
    public static final TypeAdapter<Calendar> f5078Q;

    /* renamed from: R */
    public static final InterfaceC1386v f5079R;

    /* renamed from: S */
    public static final TypeAdapter<Locale> f5080S;

    /* renamed from: T */
    public static final InterfaceC1386v f5081T;

    /* renamed from: U */
    public static final TypeAdapter<AbstractC1374j> f5082U;

    /* renamed from: V */
    public static final InterfaceC1386v f5083V;

    /* renamed from: W */
    public static final InterfaceC1386v f5084W;

    /* renamed from: a */
    public static final TypeAdapter<Class> f5085a;

    /* renamed from: b */
    public static final InterfaceC1386v f5086b;

    /* renamed from: c */
    public static final TypeAdapter<BitSet> f5087c;

    /* renamed from: d */
    public static final InterfaceC1386v f5088d;

    /* renamed from: e */
    public static final TypeAdapter<Boolean> f5089e;

    /* renamed from: f */
    public static final TypeAdapter<Boolean> f5090f;

    /* renamed from: g */
    public static final InterfaceC1386v f5091g;

    /* renamed from: h */
    public static final TypeAdapter<Number> f5092h;

    /* renamed from: i */
    public static final InterfaceC1386v f5093i;

    /* renamed from: j */
    public static final TypeAdapter<Number> f5094j;

    /* renamed from: k */
    public static final InterfaceC1386v f5095k;

    /* renamed from: l */
    public static final TypeAdapter<Number> f5096l;

    /* renamed from: m */
    public static final InterfaceC1386v f5097m;

    /* renamed from: n */
    public static final TypeAdapter<AtomicInteger> f5098n;

    /* renamed from: o */
    public static final InterfaceC1386v f5099o;

    /* renamed from: p */
    public static final TypeAdapter<AtomicBoolean> f5100p;

    /* renamed from: q */
    public static final InterfaceC1386v f5101q;

    /* renamed from: r */
    public static final TypeAdapter<AtomicIntegerArray> f5102r;

    /* renamed from: s */
    public static final InterfaceC1386v f5103s;

    /* renamed from: t */
    public static final TypeAdapter<Number> f5104t;

    /* renamed from: u */
    public static final TypeAdapter<Number> f5105u;

    /* renamed from: v */
    public static final TypeAdapter<Number> f5106v;

    /* renamed from: w */
    public static final TypeAdapter<Character> f5107w;

    /* renamed from: x */
    public static final InterfaceC1386v f5108x;

    /* renamed from: y */
    public static final TypeAdapter<String> f5109y;

    /* renamed from: z */
    public static final TypeAdapter<BigDecimal> f5110z;

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$1 */
    /* loaded from: classes.dex */
    public class C13231 extends TypeAdapter<Class> {
        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public Class read(C5897a c5897a) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(C5899c c5899c, Class cls) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$10 */
    /* loaded from: classes.dex */
    public class C132410 extends TypeAdapter<AtomicIntegerArray> {
        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public AtomicIntegerArray read(C5897a c5897a) {
            ArrayList arrayList = new ArrayList();
            c5897a.mo5764a();
            while (c5897a.mo5755E()) {
                try {
                    arrayList.add(Integer.valueOf(c5897a.mo5766c0()));
                } catch (NumberFormatException e10) {
                    throw new C1382r(e10);
                }
            }
            c5897a.mo5772n();
            int size = arrayList.size();
            AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
            for (int i10 = 0; i10 < size; i10++) {
                atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
            }
            return atomicIntegerArray;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(C5899c c5899c, AtomicIntegerArray atomicIntegerArray) {
            c5899c.mo5780f();
            int length = atomicIntegerArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                c5899c.mo5783r0(atomicIntegerArray.get(i10));
            }
            c5899c.mo5782n();
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$11 */
    /* loaded from: classes.dex */
    public class C132511 extends TypeAdapter<Number> {
        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public Number read(C5897a c5897a) {
            if (c5897a.mo5774r0() == EnumC5898b.NULL) {
                c5897a.mo5770h0();
                return null;
            }
            try {
                return Long.valueOf(c5897a.mo5768e0());
            } catch (NumberFormatException e10) {
                throw new C1382r(e10);
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(C5899c c5899c, Number number) {
            c5899c.mo5785u0(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$12 */
    /* loaded from: classes.dex */
    public class C132612 extends TypeAdapter<Number> {
        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public Number read(C5897a c5897a) {
            if (c5897a.mo5774r0() != EnumC5898b.NULL) {
                return Float.valueOf((float) c5897a.mo5765b0());
            }
            c5897a.mo5770h0();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(C5899c c5899c, Number number) {
            c5899c.mo5785u0(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$13 */
    /* loaded from: classes.dex */
    public class C132713 extends TypeAdapter<Number> {
        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public Number read(C5897a c5897a) {
            if (c5897a.mo5774r0() != EnumC5898b.NULL) {
                return Double.valueOf(c5897a.mo5765b0());
            }
            c5897a.mo5770h0();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(C5899c c5899c, Number number) {
            c5899c.mo5785u0(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$14 */
    /* loaded from: classes.dex */
    public class C132814 extends TypeAdapter<Character> {
        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public Character read(C5897a c5897a) {
            if (c5897a.mo5774r0() == EnumC5898b.NULL) {
                c5897a.mo5770h0();
                return null;
            }
            String mo5771l0 = c5897a.mo5771l0();
            if (mo5771l0.length() == 1) {
                return Character.valueOf(mo5771l0.charAt(0));
            }
            throw new C1382r("Expecting character, got: " + mo5771l0);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(C5899c c5899c, Character ch) {
            c5899c.mo5786v0(ch == null ? null : String.valueOf(ch));
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$15 */
    /* loaded from: classes.dex */
    public class C132915 extends TypeAdapter<String> {
        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public String read(C5897a c5897a) {
            EnumC5898b mo5774r0 = c5897a.mo5774r0();
            if (mo5774r0 != EnumC5898b.NULL) {
                return mo5774r0 == EnumC5898b.BOOLEAN ? Boolean.toString(c5897a.mo5763W()) : c5897a.mo5771l0();
            }
            c5897a.mo5770h0();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(C5899c c5899c, String str) {
            c5899c.mo5786v0(str);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$16 */
    /* loaded from: classes.dex */
    public class C133016 extends TypeAdapter<BigDecimal> {
        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public BigDecimal read(C5897a c5897a) {
            if (c5897a.mo5774r0() == EnumC5898b.NULL) {
                c5897a.mo5770h0();
                return null;
            }
            try {
                return new BigDecimal(c5897a.mo5771l0());
            } catch (NumberFormatException e10) {
                throw new C1382r(e10);
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(C5899c c5899c, BigDecimal bigDecimal) {
            c5899c.mo5785u0(bigDecimal);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$17 */
    /* loaded from: classes.dex */
    public class C133117 extends TypeAdapter<BigInteger> {
        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public BigInteger read(C5897a c5897a) {
            if (c5897a.mo5774r0() == EnumC5898b.NULL) {
                c5897a.mo5770h0();
                return null;
            }
            try {
                return new BigInteger(c5897a.mo5771l0());
            } catch (NumberFormatException e10) {
                throw new C1382r(e10);
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(C5899c c5899c, BigInteger bigInteger) {
            c5899c.mo5785u0(bigInteger);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$18 */
    /* loaded from: classes.dex */
    public class C133218 extends TypeAdapter<StringBuilder> {
        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public StringBuilder read(C5897a c5897a) {
            if (c5897a.mo5774r0() != EnumC5898b.NULL) {
                return new StringBuilder(c5897a.mo5771l0());
            }
            c5897a.mo5770h0();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(C5899c c5899c, StringBuilder sb2) {
            c5899c.mo5786v0(sb2 == null ? null : sb2.toString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$19 */
    /* loaded from: classes.dex */
    public class C133319 extends TypeAdapter<StringBuffer> {
        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public StringBuffer read(C5897a c5897a) {
            if (c5897a.mo5774r0() != EnumC5898b.NULL) {
                return new StringBuffer(c5897a.mo5771l0());
            }
            c5897a.mo5770h0();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(C5899c c5899c, StringBuffer stringBuffer) {
            c5899c.mo5786v0(stringBuffer == null ? null : stringBuffer.toString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$2 */
    /* loaded from: classes.dex */
    public class C13342 extends TypeAdapter<BitSet> {
        /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        
            if (java.lang.Integer.parseInt(r1) != 0) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
        
            r5 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0067, code lost:
        
            if (r8.mo5766c0() != 0) goto L57;
         */
        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.util.BitSet read(p355y9.C5897a r8) {
            /*
                r7 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r8.mo5764a()
                y9.b r1 = r8.mo5774r0()
                r2 = 0
                r3 = r2
            Le:
                y9.b r4 = p355y9.EnumC5898b.END_ARRAY
                if (r1 == r4) goto L75
                int[] r4 = com.google.gson.internal.bind.TypeAdapters.C1357a.f5129a
                int r5 = r1.ordinal()
                r4 = r4[r5]
                r5 = 1
                if (r4 == r5) goto L63
                r6 = 2
                if (r4 == r6) goto L5e
                r6 = 3
                if (r4 != r6) goto L47
                java.lang.String r1 = r8.mo5771l0()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L30
                if (r1 == 0) goto L2e
                goto L69
            L2e:
                r5 = r2
                goto L69
            L30:
                com.google.gson.r r8 = new com.google.gson.r
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L47:
                com.google.gson.r r8 = new com.google.gson.r
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Invalid bitset value type: "
                r0.append(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r8.<init>(r0)
                throw r8
            L5e:
                boolean r5 = r8.mo5763W()
                goto L69
            L63:
                int r1 = r8.mo5766c0()
                if (r1 == 0) goto L2e
            L69:
                if (r5 == 0) goto L6e
                r0.set(r3)
            L6e:
                int r3 = r3 + 1
                y9.b r1 = r8.mo5774r0()
                goto Le
            L75:
                r8.mo5772n()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.C13342.read(y9.a):java.util.BitSet");
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(C5899c c5899c, BitSet bitSet) {
            c5899c.mo5780f();
            int length = bitSet.length();
            for (int i10 = 0; i10 < length; i10++) {
                c5899c.mo5783r0(bitSet.get(i10) ? 1L : 0L);
            }
            c5899c.mo5782n();
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$20 */
    /* loaded from: classes.dex */
    public class C133520 extends TypeAdapter<URL> {
        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public URL read(C5897a c5897a) {
            if (c5897a.mo5774r0() == EnumC5898b.NULL) {
                c5897a.mo5770h0();
                return null;
            }
            String mo5771l0 = c5897a.mo5771l0();
            if ("null".equals(mo5771l0)) {
                return null;
            }
            return new URL(mo5771l0);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(C5899c c5899c, URL url) {
            c5899c.mo5786v0(url == null ? null : url.toExternalForm());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$21 */
    /* loaded from: classes.dex */
    public class C133621 extends TypeAdapter<URI> {
        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public URI read(C5897a c5897a) {
            if (c5897a.mo5774r0() == EnumC5898b.NULL) {
                c5897a.mo5770h0();
                return null;
            }
            try {
                String mo5771l0 = c5897a.mo5771l0();
                if ("null".equals(mo5771l0)) {
                    return null;
                }
                return new URI(mo5771l0);
            } catch (URISyntaxException e10) {
                throw new C1375k(e10);
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(C5899c c5899c, URI uri) {
            c5899c.mo5786v0(uri == null ? null : uri.toASCIIString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$22 */
    /* loaded from: classes.dex */
    public class C133722 extends TypeAdapter<InetAddress> {
        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public InetAddress read(C5897a c5897a) {
            if (c5897a.mo5774r0() != EnumC5898b.NULL) {
                return InetAddress.getByName(c5897a.mo5771l0());
            }
            c5897a.mo5770h0();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(C5899c c5899c, InetAddress inetAddress) {
            c5899c.mo5786v0(inetAddress == null ? null : inetAddress.getHostAddress());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$23 */
    /* loaded from: classes.dex */
    public class C133823 extends TypeAdapter<UUID> {
        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public UUID read(C5897a c5897a) {
            if (c5897a.mo5774r0() != EnumC5898b.NULL) {
                return UUID.fromString(c5897a.mo5771l0());
            }
            c5897a.mo5770h0();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(C5899c c5899c, UUID uuid) {
            c5899c.mo5786v0(uuid == null ? null : uuid.toString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$24 */
    /* loaded from: classes.dex */
    public class C133924 extends TypeAdapter<Currency> {
        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public Currency read(C5897a c5897a) {
            return Currency.getInstance(c5897a.mo5771l0());
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(C5899c c5899c, Currency currency) {
            c5899c.mo5786v0(currency.getCurrencyCode());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$25 */
    /* loaded from: classes.dex */
    public class C134025 extends TypeAdapter<Calendar> {
        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public Calendar read(C5897a c5897a) {
            if (c5897a.mo5774r0() == EnumC5898b.NULL) {
                c5897a.mo5770h0();
                return null;
            }
            c5897a.mo5767d();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (c5897a.mo5774r0() != EnumC5898b.END_OBJECT) {
                String mo5769f0 = c5897a.mo5769f0();
                int mo5766c0 = c5897a.mo5766c0();
                if ("year".equals(mo5769f0)) {
                    i10 = mo5766c0;
                } else if ("month".equals(mo5769f0)) {
                    i11 = mo5766c0;
                } else if ("dayOfMonth".equals(mo5769f0)) {
                    i12 = mo5766c0;
                } else if ("hourOfDay".equals(mo5769f0)) {
                    i13 = mo5766c0;
                } else if ("minute".equals(mo5769f0)) {
                    i14 = mo5766c0;
                } else if ("second".equals(mo5769f0)) {
                    i15 = mo5766c0;
                }
            }
            c5897a.mo5775w();
            return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(C5899c c5899c, Calendar calendar) {
            if (calendar == null) {
                c5899c.mo5779W();
                return;
            }
            c5899c.mo5781j();
            c5899c.mo5778K("year");
            c5899c.mo5783r0(calendar.get(1));
            c5899c.mo5778K("month");
            c5899c.mo5783r0(calendar.get(2));
            c5899c.mo5778K("dayOfMonth");
            c5899c.mo5783r0(calendar.get(5));
            c5899c.mo5778K("hourOfDay");
            c5899c.mo5783r0(calendar.get(11));
            c5899c.mo5778K("minute");
            c5899c.mo5783r0(calendar.get(12));
            c5899c.mo5778K("second");
            c5899c.mo5783r0(calendar.get(13));
            c5899c.mo5787w();
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$26 */
    /* loaded from: classes.dex */
    public class C134126 extends TypeAdapter<Locale> {
        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public Locale read(C5897a c5897a) {
            if (c5897a.mo5774r0() == EnumC5898b.NULL) {
                c5897a.mo5770h0();
                return null;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(c5897a.mo5771l0(), "_");
            String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
            return (nextToken2 == null && nextToken3 == null) ? new Locale(nextToken) : nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(C5899c c5899c, Locale locale) {
            c5899c.mo5786v0(locale == null ? null : locale.toString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$27 */
    /* loaded from: classes.dex */
    public class C134227 extends TypeAdapter<AbstractC1374j> {
        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public AbstractC1374j read(C5897a c5897a) {
            if (c5897a instanceof C1358a) {
                return ((C1358a) c5897a).m5758M0();
            }
            switch (C1357a.f5129a[c5897a.mo5774r0().ordinal()]) {
                case 1:
                    return new C1379o(new C1363f(c5897a.mo5771l0()));
                case 2:
                    return new C1379o(Boolean.valueOf(c5897a.mo5763W()));
                case 3:
                    return new C1379o(c5897a.mo5771l0());
                case 4:
                    c5897a.mo5770h0();
                    return C1376l.f5213a;
                case 5:
                    C1305g c1305g = new C1305g();
                    c5897a.mo5764a();
                    while (c5897a.mo5755E()) {
                        c1305g.m5622n(read(c5897a));
                    }
                    c5897a.mo5772n();
                    return c1305g;
                case 6:
                    C1377m c1377m = new C1377m();
                    c5897a.mo5767d();
                    while (c5897a.mo5755E()) {
                        c1377m.m5842n(c5897a.mo5769f0(), read(c5897a));
                    }
                    c5897a.mo5775w();
                    return c1377m;
                default:
                    throw new IllegalArgumentException();
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(C5899c c5899c, AbstractC1374j abstractC1374j) {
            if (abstractC1374j == null || abstractC1374j.m5839j()) {
                c5899c.mo5779W();
                return;
            }
            if (abstractC1374j.m5841m()) {
                C1379o m5837d = abstractC1374j.m5837d();
                if (m5837d.m5852u()) {
                    c5899c.mo5785u0(m5837d.m5850q());
                    return;
                } else if (m5837d.m5851s()) {
                    c5899c.mo5788x0(m5837d.mo5620a());
                    return;
                } else {
                    c5899c.mo5786v0(m5837d.mo5621e());
                    return;
                }
            }
            if (abstractC1374j.m5838h()) {
                c5899c.mo5780f();
                Iterator<AbstractC1374j> it = abstractC1374j.m5835b().iterator();
                while (it.hasNext()) {
                    write(c5899c, it.next());
                }
                c5899c.mo5782n();
                return;
            }
            if (!abstractC1374j.m5840k()) {
                throw new IllegalArgumentException("Couldn't write " + abstractC1374j.getClass());
            }
            c5899c.mo5781j();
            for (Map.Entry<String, AbstractC1374j> entry : abstractC1374j.m5836c().m5843o()) {
                c5899c.mo5778K(entry.getKey());
                write(c5899c, entry.getValue());
            }
            c5899c.mo5787w();
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$28 */
    /* loaded from: classes.dex */
    public class C134328 implements InterfaceC1386v {
        @Override // com.google.gson.InterfaceC1386v
        public <T> TypeAdapter<T> create(Gson gson, C5740a<T> c5740a) {
            Class<? super T> rawType = c5740a.getRawType();
            if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                return null;
            }
            if (!rawType.isEnum()) {
                rawType = rawType.getSuperclass();
            }
            return new EnumTypeAdapter(rawType);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$29 */
    /* loaded from: classes.dex */
    public class C134429 implements InterfaceC1386v {

        /* renamed from: i */
        public final /* synthetic */ TypeAdapter f5112i;

        public C134429(TypeAdapter typeAdapter) {
            r2 = typeAdapter;
        }

        @Override // com.google.gson.InterfaceC1386v
        public <T> TypeAdapter<T> create(Gson gson, C5740a<T> c5740a) {
            if (c5740a.equals(C5740a.this)) {
                return r2;
            }
            return null;
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$3 */
    /* loaded from: classes.dex */
    public class C13453 extends TypeAdapter<Boolean> {
        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public Boolean read(C5897a c5897a) {
            EnumC5898b mo5774r0 = c5897a.mo5774r0();
            if (mo5774r0 != EnumC5898b.NULL) {
                return mo5774r0 == EnumC5898b.STRING ? Boolean.valueOf(Boolean.parseBoolean(c5897a.mo5771l0())) : Boolean.valueOf(c5897a.mo5763W());
            }
            c5897a.mo5770h0();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(C5899c c5899c, Boolean bool) {
            c5899c.mo5784s0(bool);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$30 */
    /* loaded from: classes.dex */
    public class C134630 implements InterfaceC1386v {

        /* renamed from: h */
        public final /* synthetic */ Class f5113h;

        /* renamed from: i */
        public final /* synthetic */ TypeAdapter f5114i;

        public C134630(Class cls, TypeAdapter typeAdapter) {
            r1 = cls;
            r2 = typeAdapter;
        }

        @Override // com.google.gson.InterfaceC1386v
        public <T> TypeAdapter<T> create(Gson gson, C5740a<T> c5740a) {
            if (c5740a.getRawType() == r1) {
                return r2;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + r1.getName() + ",adapter=" + r2 + "]";
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$31 */
    /* loaded from: classes.dex */
    public class C134731 implements InterfaceC1386v {

        /* renamed from: h */
        public final /* synthetic */ Class f5115h;

        /* renamed from: i */
        public final /* synthetic */ Class f5116i;

        /* renamed from: j */
        public final /* synthetic */ TypeAdapter f5117j;

        public C134731(Class cls, Class cls2, TypeAdapter typeAdapter) {
            r1 = cls;
            r2 = cls2;
            r3 = typeAdapter;
        }

        @Override // com.google.gson.InterfaceC1386v
        public <T> TypeAdapter<T> create(Gson gson, C5740a<T> c5740a) {
            Class<? super T> rawType = c5740a.getRawType();
            if (rawType == r1 || rawType == r2) {
                return r3;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + r2.getName() + "+" + r1.getName() + ",adapter=" + r3 + "]";
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$32 */
    /* loaded from: classes.dex */
    public class C134832 implements InterfaceC1386v {

        /* renamed from: h */
        public final /* synthetic */ Class f5118h;

        /* renamed from: i */
        public final /* synthetic */ Class f5119i;

        /* renamed from: j */
        public final /* synthetic */ TypeAdapter f5120j;

        public C134832(Class cls, Class cls2, TypeAdapter typeAdapter) {
            r1 = cls;
            r2 = cls2;
            r3 = typeAdapter;
        }

        @Override // com.google.gson.InterfaceC1386v
        public <T> TypeAdapter<T> create(Gson gson, C5740a<T> c5740a) {
            Class<? super T> rawType = c5740a.getRawType();
            if (rawType == r1 || rawType == r2) {
                return r3;
            }
            return null;
        }

        public String toString() {
            return "Factory[type=" + r1.getName() + "+" + r2.getName() + ",adapter=" + r3 + "]";
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$33 */
    /* loaded from: classes.dex */
    public class C134933 implements InterfaceC1386v {

        /* renamed from: h */
        public final /* synthetic */ Class f5121h;

        /* renamed from: i */
        public final /* synthetic */ TypeAdapter f5122i;

        /* renamed from: com.google.gson.internal.bind.TypeAdapters$33$1 */
        /* loaded from: classes.dex */
        public class AnonymousClass1<T1> extends TypeAdapter<T1> {

            /* renamed from: a */
            public final /* synthetic */ Class f5123a;

            public AnonymousClass1(Class cls) {
                r2 = cls;
            }

            @Override // com.google.gson.TypeAdapter
            public T1 read(C5897a c5897a) {
                T1 t12 = (T1) r2.read(c5897a);
                if (t12 == null || r2.isInstance(t12)) {
                    return t12;
                }
                throw new C1382r("Expected a " + r2.getName() + " but was " + t12.getClass().getName());
            }

            @Override // com.google.gson.TypeAdapter
            public void write(C5899c c5899c, T1 t12) {
                r2.write(c5899c, t12);
            }
        }

        public C134933(Class cls, TypeAdapter typeAdapter) {
            r1 = cls;
            r2 = typeAdapter;
        }

        @Override // com.google.gson.InterfaceC1386v
        public <T2> TypeAdapter<T2> create(Gson gson, C5740a<T2> c5740a) {
            Class<? super T2> rawType = c5740a.getRawType();
            if (r1.isAssignableFrom(rawType)) {
                return new TypeAdapter<T1>() { // from class: com.google.gson.internal.bind.TypeAdapters.33.1

                    /* renamed from: a */
                    public final /* synthetic */ Class f5123a;

                    public AnonymousClass1(Class rawType2) {
                        r2 = rawType2;
                    }

                    @Override // com.google.gson.TypeAdapter
                    public T1 read(C5897a c5897a) {
                        T1 t12 = (T1) r2.read(c5897a);
                        if (t12 == null || r2.isInstance(t12)) {
                            return t12;
                        }
                        throw new C1382r("Expected a " + r2.getName() + " but was " + t12.getClass().getName());
                    }

                    @Override // com.google.gson.TypeAdapter
                    public void write(C5899c c5899c, T1 t12) {
                        r2.write(c5899c, t12);
                    }
                };
            }
            return null;
        }

        public String toString() {
            return "Factory[typeHierarchy=" + r1.getName() + ",adapter=" + r2 + "]";
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$4 */
    /* loaded from: classes.dex */
    public class C13504 extends TypeAdapter<Boolean> {
        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public Boolean read(C5897a c5897a) {
            if (c5897a.mo5774r0() != EnumC5898b.NULL) {
                return Boolean.valueOf(c5897a.mo5771l0());
            }
            c5897a.mo5770h0();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(C5899c c5899c, Boolean bool) {
            c5899c.mo5786v0(bool == null ? "null" : bool.toString());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$5 */
    /* loaded from: classes.dex */
    public class C13515 extends TypeAdapter<Number> {
        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public Number read(C5897a c5897a) {
            if (c5897a.mo5774r0() == EnumC5898b.NULL) {
                c5897a.mo5770h0();
                return null;
            }
            try {
                return Byte.valueOf((byte) c5897a.mo5766c0());
            } catch (NumberFormatException e10) {
                throw new C1382r(e10);
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(C5899c c5899c, Number number) {
            c5899c.mo5785u0(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$6 */
    /* loaded from: classes.dex */
    public class C13526 extends TypeAdapter<Number> {
        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public Number read(C5897a c5897a) {
            if (c5897a.mo5774r0() == EnumC5898b.NULL) {
                c5897a.mo5770h0();
                return null;
            }
            try {
                return Short.valueOf((short) c5897a.mo5766c0());
            } catch (NumberFormatException e10) {
                throw new C1382r(e10);
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(C5899c c5899c, Number number) {
            c5899c.mo5785u0(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$7 */
    /* loaded from: classes.dex */
    public class C13537 extends TypeAdapter<Number> {
        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public Number read(C5897a c5897a) {
            if (c5897a.mo5774r0() == EnumC5898b.NULL) {
                c5897a.mo5770h0();
                return null;
            }
            try {
                return Integer.valueOf(c5897a.mo5766c0());
            } catch (NumberFormatException e10) {
                throw new C1382r(e10);
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(C5899c c5899c, Number number) {
            c5899c.mo5785u0(number);
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$8 */
    /* loaded from: classes.dex */
    public class C13548 extends TypeAdapter<AtomicInteger> {
        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public AtomicInteger read(C5897a c5897a) {
            try {
                return new AtomicInteger(c5897a.mo5766c0());
            } catch (NumberFormatException e10) {
                throw new C1382r(e10);
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(C5899c c5899c, AtomicInteger atomicInteger) {
            c5899c.mo5783r0(atomicInteger.get());
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$9 */
    /* loaded from: classes.dex */
    public class C13559 extends TypeAdapter<AtomicBoolean> {
        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public AtomicBoolean read(C5897a c5897a) {
            return new AtomicBoolean(c5897a.mo5763W());
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(C5899c c5899c, AtomicBoolean atomicBoolean) {
            c5899c.mo5788x0(atomicBoolean.get());
        }
    }

    /* loaded from: classes.dex */
    public static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {

        /* renamed from: a */
        public final Map<String, T> f5125a = new HashMap();

        /* renamed from: b */
        public final Map<T, String> f5126b = new HashMap();

        /* renamed from: com.google.gson.internal.bind.TypeAdapters$EnumTypeAdapter$a */
        /* loaded from: classes.dex */
        public class C1356a implements PrivilegedAction<Void> {

            /* renamed from: a */
            public final /* synthetic */ Field f5127a;

            public C1356a(Field field) {
                this.f5127a = field;
            }

            @Override // java.security.PrivilegedAction
            /* renamed from: a */
            public Void run() {
                this.f5127a.setAccessible(true);
                return null;
            }
        }

        public EnumTypeAdapter(Class<T> cls) {
            try {
                for (Field field : cls.getDeclaredFields()) {
                    if (field.isEnumConstant()) {
                        AccessController.doPrivileged(new C1356a(field));
                        Enum r42 = (Enum) field.get(null);
                        String name = r42.name();
                        InterfaceC4996c interfaceC4996c = (InterfaceC4996c) field.getAnnotation(InterfaceC4996c.class);
                        if (interfaceC4996c != null) {
                            name = interfaceC4996c.value();
                            for (String str : interfaceC4996c.alternate()) {
                                this.f5125a.put(str, r42);
                            }
                        }
                        this.f5125a.put(name, r42);
                        this.f5126b.put(r42, name);
                    }
                }
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public T read(C5897a c5897a) {
            if (c5897a.mo5774r0() != EnumC5898b.NULL) {
                return this.f5125a.get(c5897a.mo5771l0());
            }
            c5897a.mo5770h0();
            return null;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(C5899c c5899c, T t10) {
            c5899c.mo5786v0(t10 == null ? null : this.f5126b.get(t10));
        }
    }

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C1357a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5129a;

        static {
            int[] iArr = new int[EnumC5898b.values().length];
            f5129a = iArr;
            try {
                iArr[EnumC5898b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5129a[EnumC5898b.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5129a[EnumC5898b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5129a[EnumC5898b.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5129a[EnumC5898b.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5129a[EnumC5898b.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5129a[EnumC5898b.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5129a[EnumC5898b.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5129a[EnumC5898b.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f5129a[EnumC5898b.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    static {
        TypeAdapter<Class> nullSafe = new TypeAdapter<Class>() { // from class: com.google.gson.internal.bind.TypeAdapters.1
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Class read(C5897a c5897a) {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(C5899c c5899c, Class cls) {
                throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + cls.getName() + ". Forgot to register a type adapter?");
            }
        }.nullSafe();
        f5085a = nullSafe;
        f5086b = m5692a(Class.class, nullSafe);
        TypeAdapter<BitSet> nullSafe2 = new TypeAdapter<BitSet>() { // from class: com.google.gson.internal.bind.TypeAdapters.2
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public BitSet read(C5897a c5897a) {
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                    	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    */
                /*
                    this = this;
                    java.util.BitSet r0 = new java.util.BitSet
                    r0.<init>()
                    r8.mo5764a()
                    y9.b r1 = r8.mo5774r0()
                    r2 = 0
                    r3 = r2
                Le:
                    y9.b r4 = p355y9.EnumC5898b.END_ARRAY
                    if (r1 == r4) goto L75
                    int[] r4 = com.google.gson.internal.bind.TypeAdapters.C1357a.f5129a
                    int r5 = r1.ordinal()
                    r4 = r4[r5]
                    r5 = 1
                    if (r4 == r5) goto L63
                    r6 = 2
                    if (r4 == r6) goto L5e
                    r6 = 3
                    if (r4 != r6) goto L47
                    java.lang.String r1 = r8.mo5771l0()
                    int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L30
                    if (r1 == 0) goto L2e
                    goto L69
                L2e:
                    r5 = r2
                    goto L69
                L30:
                    com.google.gson.r r8 = new com.google.gson.r
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                    r0.append(r2)
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    r8.<init>(r0)
                    throw r8
                L47:
                    com.google.gson.r r8 = new com.google.gson.r
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r2 = "Invalid bitset value type: "
                    r0.append(r2)
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    r8.<init>(r0)
                    throw r8
                L5e:
                    boolean r5 = r8.mo5763W()
                    goto L69
                L63:
                    int r1 = r8.mo5766c0()
                    if (r1 == 0) goto L2e
                L69:
                    if (r5 == 0) goto L6e
                    r0.set(r3)
                L6e:
                    int r3 = r3 + 1
                    y9.b r1 = r8.mo5774r0()
                    goto Le
                L75:
                    r8.mo5772n()
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.C13342.read(y9.a):java.util.BitSet");
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(C5899c c5899c, BitSet bitSet) {
                c5899c.mo5780f();
                int length = bitSet.length();
                for (int i10 = 0; i10 < length; i10++) {
                    c5899c.mo5783r0(bitSet.get(i10) ? 1L : 0L);
                }
                c5899c.mo5782n();
            }
        }.nullSafe();
        f5087c = nullSafe2;
        f5088d = m5692a(BitSet.class, nullSafe2);
        C13453 c13453 = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.3
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Boolean read(C5897a c5897a) {
                EnumC5898b mo5774r0 = c5897a.mo5774r0();
                if (mo5774r0 != EnumC5898b.NULL) {
                    return mo5774r0 == EnumC5898b.STRING ? Boolean.valueOf(Boolean.parseBoolean(c5897a.mo5771l0())) : Boolean.valueOf(c5897a.mo5763W());
                }
                c5897a.mo5770h0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(C5899c c5899c, Boolean bool) {
                c5899c.mo5784s0(bool);
            }
        };
        f5089e = c13453;
        f5090f = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.4
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Boolean read(C5897a c5897a) {
                if (c5897a.mo5774r0() != EnumC5898b.NULL) {
                    return Boolean.valueOf(c5897a.mo5771l0());
                }
                c5897a.mo5770h0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(C5899c c5899c, Boolean bool) {
                c5899c.mo5786v0(bool == null ? "null" : bool.toString());
            }
        };
        f5091g = m5693b(Boolean.TYPE, Boolean.class, c13453);
        C13515 c13515 = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.5
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Number read(C5897a c5897a) {
                if (c5897a.mo5774r0() == EnumC5898b.NULL) {
                    c5897a.mo5770h0();
                    return null;
                }
                try {
                    return Byte.valueOf((byte) c5897a.mo5766c0());
                } catch (NumberFormatException e10) {
                    throw new C1382r(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(C5899c c5899c, Number number) {
                c5899c.mo5785u0(number);
            }
        };
        f5092h = c13515;
        f5093i = m5693b(Byte.TYPE, Byte.class, c13515);
        C13526 c13526 = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.6
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Number read(C5897a c5897a) {
                if (c5897a.mo5774r0() == EnumC5898b.NULL) {
                    c5897a.mo5770h0();
                    return null;
                }
                try {
                    return Short.valueOf((short) c5897a.mo5766c0());
                } catch (NumberFormatException e10) {
                    throw new C1382r(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(C5899c c5899c, Number number) {
                c5899c.mo5785u0(number);
            }
        };
        f5094j = c13526;
        f5095k = m5693b(Short.TYPE, Short.class, c13526);
        C13537 c13537 = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.7
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Number read(C5897a c5897a) {
                if (c5897a.mo5774r0() == EnumC5898b.NULL) {
                    c5897a.mo5770h0();
                    return null;
                }
                try {
                    return Integer.valueOf(c5897a.mo5766c0());
                } catch (NumberFormatException e10) {
                    throw new C1382r(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(C5899c c5899c, Number number) {
                c5899c.mo5785u0(number);
            }
        };
        f5096l = c13537;
        f5097m = m5693b(Integer.TYPE, Integer.class, c13537);
        TypeAdapter<AtomicInteger> nullSafe3 = new TypeAdapter<AtomicInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.8
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public AtomicInteger read(C5897a c5897a) {
                try {
                    return new AtomicInteger(c5897a.mo5766c0());
                } catch (NumberFormatException e10) {
                    throw new C1382r(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(C5899c c5899c, AtomicInteger atomicInteger) {
                c5899c.mo5783r0(atomicInteger.get());
            }
        }.nullSafe();
        f5098n = nullSafe3;
        f5099o = m5692a(AtomicInteger.class, nullSafe3);
        TypeAdapter<AtomicBoolean> nullSafe4 = new TypeAdapter<AtomicBoolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.9
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public AtomicBoolean read(C5897a c5897a) {
                return new AtomicBoolean(c5897a.mo5763W());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(C5899c c5899c, AtomicBoolean atomicBoolean) {
                c5899c.mo5788x0(atomicBoolean.get());
            }
        }.nullSafe();
        f5100p = nullSafe4;
        f5101q = m5692a(AtomicBoolean.class, nullSafe4);
        TypeAdapter<AtomicIntegerArray> nullSafe5 = new TypeAdapter<AtomicIntegerArray>() { // from class: com.google.gson.internal.bind.TypeAdapters.10
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public AtomicIntegerArray read(C5897a c5897a) {
                ArrayList arrayList = new ArrayList();
                c5897a.mo5764a();
                while (c5897a.mo5755E()) {
                    try {
                        arrayList.add(Integer.valueOf(c5897a.mo5766c0()));
                    } catch (NumberFormatException e10) {
                        throw new C1382r(e10);
                    }
                }
                c5897a.mo5772n();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i10 = 0; i10 < size; i10++) {
                    atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(C5899c c5899c, AtomicIntegerArray atomicIntegerArray) {
                c5899c.mo5780f();
                int length = atomicIntegerArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    c5899c.mo5783r0(atomicIntegerArray.get(i10));
                }
                c5899c.mo5782n();
            }
        }.nullSafe();
        f5102r = nullSafe5;
        f5103s = m5692a(AtomicIntegerArray.class, nullSafe5);
        f5104t = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.11
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Number read(C5897a c5897a) {
                if (c5897a.mo5774r0() == EnumC5898b.NULL) {
                    c5897a.mo5770h0();
                    return null;
                }
                try {
                    return Long.valueOf(c5897a.mo5768e0());
                } catch (NumberFormatException e10) {
                    throw new C1382r(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(C5899c c5899c, Number number) {
                c5899c.mo5785u0(number);
            }
        };
        f5105u = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.12
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Number read(C5897a c5897a) {
                if (c5897a.mo5774r0() != EnumC5898b.NULL) {
                    return Float.valueOf((float) c5897a.mo5765b0());
                }
                c5897a.mo5770h0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(C5899c c5899c, Number number) {
                c5899c.mo5785u0(number);
            }
        };
        f5106v = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.13
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Number read(C5897a c5897a) {
                if (c5897a.mo5774r0() != EnumC5898b.NULL) {
                    return Double.valueOf(c5897a.mo5765b0());
                }
                c5897a.mo5770h0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(C5899c c5899c, Number number) {
                c5899c.mo5785u0(number);
            }
        };
        C132814 c132814 = new TypeAdapter<Character>() { // from class: com.google.gson.internal.bind.TypeAdapters.14
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Character read(C5897a c5897a) {
                if (c5897a.mo5774r0() == EnumC5898b.NULL) {
                    c5897a.mo5770h0();
                    return null;
                }
                String mo5771l0 = c5897a.mo5771l0();
                if (mo5771l0.length() == 1) {
                    return Character.valueOf(mo5771l0.charAt(0));
                }
                throw new C1382r("Expecting character, got: " + mo5771l0);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(C5899c c5899c, Character ch) {
                c5899c.mo5786v0(ch == null ? null : String.valueOf(ch));
            }
        };
        f5107w = c132814;
        f5108x = m5693b(Character.TYPE, Character.class, c132814);
        C132915 c132915 = new TypeAdapter<String>() { // from class: com.google.gson.internal.bind.TypeAdapters.15
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public String read(C5897a c5897a) {
                EnumC5898b mo5774r0 = c5897a.mo5774r0();
                if (mo5774r0 != EnumC5898b.NULL) {
                    return mo5774r0 == EnumC5898b.BOOLEAN ? Boolean.toString(c5897a.mo5763W()) : c5897a.mo5771l0();
                }
                c5897a.mo5770h0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(C5899c c5899c, String str) {
                c5899c.mo5786v0(str);
            }
        };
        f5109y = c132915;
        f5110z = new TypeAdapter<BigDecimal>() { // from class: com.google.gson.internal.bind.TypeAdapters.16
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public BigDecimal read(C5897a c5897a) {
                if (c5897a.mo5774r0() == EnumC5898b.NULL) {
                    c5897a.mo5770h0();
                    return null;
                }
                try {
                    return new BigDecimal(c5897a.mo5771l0());
                } catch (NumberFormatException e10) {
                    throw new C1382r(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(C5899c c5899c, BigDecimal bigDecimal) {
                c5899c.mo5785u0(bigDecimal);
            }
        };
        f5062A = new TypeAdapter<BigInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.17
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public BigInteger read(C5897a c5897a) {
                if (c5897a.mo5774r0() == EnumC5898b.NULL) {
                    c5897a.mo5770h0();
                    return null;
                }
                try {
                    return new BigInteger(c5897a.mo5771l0());
                } catch (NumberFormatException e10) {
                    throw new C1382r(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(C5899c c5899c, BigInteger bigInteger) {
                c5899c.mo5785u0(bigInteger);
            }
        };
        f5063B = m5692a(String.class, c132915);
        C133218 c133218 = new TypeAdapter<StringBuilder>() { // from class: com.google.gson.internal.bind.TypeAdapters.18
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public StringBuilder read(C5897a c5897a) {
                if (c5897a.mo5774r0() != EnumC5898b.NULL) {
                    return new StringBuilder(c5897a.mo5771l0());
                }
                c5897a.mo5770h0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(C5899c c5899c, StringBuilder sb2) {
                c5899c.mo5786v0(sb2 == null ? null : sb2.toString());
            }
        };
        f5064C = c133218;
        f5065D = m5692a(StringBuilder.class, c133218);
        C133319 c133319 = new TypeAdapter<StringBuffer>() { // from class: com.google.gson.internal.bind.TypeAdapters.19
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public StringBuffer read(C5897a c5897a) {
                if (c5897a.mo5774r0() != EnumC5898b.NULL) {
                    return new StringBuffer(c5897a.mo5771l0());
                }
                c5897a.mo5770h0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(C5899c c5899c, StringBuffer stringBuffer) {
                c5899c.mo5786v0(stringBuffer == null ? null : stringBuffer.toString());
            }
        };
        f5066E = c133319;
        f5067F = m5692a(StringBuffer.class, c133319);
        C133520 c133520 = new TypeAdapter<URL>() { // from class: com.google.gson.internal.bind.TypeAdapters.20
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public URL read(C5897a c5897a) {
                if (c5897a.mo5774r0() == EnumC5898b.NULL) {
                    c5897a.mo5770h0();
                    return null;
                }
                String mo5771l0 = c5897a.mo5771l0();
                if ("null".equals(mo5771l0)) {
                    return null;
                }
                return new URL(mo5771l0);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(C5899c c5899c, URL url) {
                c5899c.mo5786v0(url == null ? null : url.toExternalForm());
            }
        };
        f5068G = c133520;
        f5069H = m5692a(URL.class, c133520);
        C133621 c133621 = new TypeAdapter<URI>() { // from class: com.google.gson.internal.bind.TypeAdapters.21
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public URI read(C5897a c5897a) {
                if (c5897a.mo5774r0() == EnumC5898b.NULL) {
                    c5897a.mo5770h0();
                    return null;
                }
                try {
                    String mo5771l0 = c5897a.mo5771l0();
                    if ("null".equals(mo5771l0)) {
                        return null;
                    }
                    return new URI(mo5771l0);
                } catch (URISyntaxException e10) {
                    throw new C1375k(e10);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(C5899c c5899c, URI uri) {
                c5899c.mo5786v0(uri == null ? null : uri.toASCIIString());
            }
        };
        f5070I = c133621;
        f5071J = m5692a(URI.class, c133621);
        C133722 c133722 = new TypeAdapter<InetAddress>() { // from class: com.google.gson.internal.bind.TypeAdapters.22
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public InetAddress read(C5897a c5897a) {
                if (c5897a.mo5774r0() != EnumC5898b.NULL) {
                    return InetAddress.getByName(c5897a.mo5771l0());
                }
                c5897a.mo5770h0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(C5899c c5899c, InetAddress inetAddress) {
                c5899c.mo5786v0(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        f5072K = c133722;
        f5073L = m5696e(InetAddress.class, c133722);
        C133823 c133823 = new TypeAdapter<UUID>() { // from class: com.google.gson.internal.bind.TypeAdapters.23
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public UUID read(C5897a c5897a) {
                if (c5897a.mo5774r0() != EnumC5898b.NULL) {
                    return UUID.fromString(c5897a.mo5771l0());
                }
                c5897a.mo5770h0();
                return null;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(C5899c c5899c, UUID uuid) {
                c5899c.mo5786v0(uuid == null ? null : uuid.toString());
            }
        };
        f5074M = c133823;
        f5075N = m5692a(UUID.class, c133823);
        TypeAdapter<Currency> nullSafe6 = new TypeAdapter<Currency>() { // from class: com.google.gson.internal.bind.TypeAdapters.24
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Currency read(C5897a c5897a) {
                return Currency.getInstance(c5897a.mo5771l0());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(C5899c c5899c, Currency currency) {
                c5899c.mo5786v0(currency.getCurrencyCode());
            }
        }.nullSafe();
        f5076O = nullSafe6;
        f5077P = m5692a(Currency.class, nullSafe6);
        C134025 c134025 = new TypeAdapter<Calendar>() { // from class: com.google.gson.internal.bind.TypeAdapters.25
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Calendar read(C5897a c5897a) {
                if (c5897a.mo5774r0() == EnumC5898b.NULL) {
                    c5897a.mo5770h0();
                    return null;
                }
                c5897a.mo5767d();
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (c5897a.mo5774r0() != EnumC5898b.END_OBJECT) {
                    String mo5769f0 = c5897a.mo5769f0();
                    int mo5766c0 = c5897a.mo5766c0();
                    if ("year".equals(mo5769f0)) {
                        i10 = mo5766c0;
                    } else if ("month".equals(mo5769f0)) {
                        i11 = mo5766c0;
                    } else if ("dayOfMonth".equals(mo5769f0)) {
                        i12 = mo5766c0;
                    } else if ("hourOfDay".equals(mo5769f0)) {
                        i13 = mo5766c0;
                    } else if ("minute".equals(mo5769f0)) {
                        i14 = mo5766c0;
                    } else if ("second".equals(mo5769f0)) {
                        i15 = mo5766c0;
                    }
                }
                c5897a.mo5775w();
                return new GregorianCalendar(i10, i11, i12, i13, i14, i15);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(C5899c c5899c, Calendar calendar) {
                if (calendar == null) {
                    c5899c.mo5779W();
                    return;
                }
                c5899c.mo5781j();
                c5899c.mo5778K("year");
                c5899c.mo5783r0(calendar.get(1));
                c5899c.mo5778K("month");
                c5899c.mo5783r0(calendar.get(2));
                c5899c.mo5778K("dayOfMonth");
                c5899c.mo5783r0(calendar.get(5));
                c5899c.mo5778K("hourOfDay");
                c5899c.mo5783r0(calendar.get(11));
                c5899c.mo5778K("minute");
                c5899c.mo5783r0(calendar.get(12));
                c5899c.mo5778K("second");
                c5899c.mo5783r0(calendar.get(13));
                c5899c.mo5787w();
            }
        };
        f5078Q = c134025;
        f5079R = m5695d(Calendar.class, GregorianCalendar.class, c134025);
        C134126 c134126 = new TypeAdapter<Locale>() { // from class: com.google.gson.internal.bind.TypeAdapters.26
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Locale read(C5897a c5897a) {
                if (c5897a.mo5774r0() == EnumC5898b.NULL) {
                    c5897a.mo5770h0();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(c5897a.mo5771l0(), "_");
                String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                return (nextToken2 == null && nextToken3 == null) ? new Locale(nextToken) : nextToken3 == null ? new Locale(nextToken, nextToken2) : new Locale(nextToken, nextToken2, nextToken3);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(C5899c c5899c, Locale locale) {
                c5899c.mo5786v0(locale == null ? null : locale.toString());
            }
        };
        f5080S = c134126;
        f5081T = m5692a(Locale.class, c134126);
        C134227 c134227 = new TypeAdapter<AbstractC1374j>() { // from class: com.google.gson.internal.bind.TypeAdapters.27
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public AbstractC1374j read(C5897a c5897a) {
                if (c5897a instanceof C1358a) {
                    return ((C1358a) c5897a).m5758M0();
                }
                switch (C1357a.f5129a[c5897a.mo5774r0().ordinal()]) {
                    case 1:
                        return new C1379o(new C1363f(c5897a.mo5771l0()));
                    case 2:
                        return new C1379o(Boolean.valueOf(c5897a.mo5763W()));
                    case 3:
                        return new C1379o(c5897a.mo5771l0());
                    case 4:
                        c5897a.mo5770h0();
                        return C1376l.f5213a;
                    case 5:
                        C1305g c1305g = new C1305g();
                        c5897a.mo5764a();
                        while (c5897a.mo5755E()) {
                            c1305g.m5622n(read(c5897a));
                        }
                        c5897a.mo5772n();
                        return c1305g;
                    case 6:
                        C1377m c1377m = new C1377m();
                        c5897a.mo5767d();
                        while (c5897a.mo5755E()) {
                            c1377m.m5842n(c5897a.mo5769f0(), read(c5897a));
                        }
                        c5897a.mo5775w();
                        return c1377m;
                    default:
                        throw new IllegalArgumentException();
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(C5899c c5899c, AbstractC1374j abstractC1374j) {
                if (abstractC1374j == null || abstractC1374j.m5839j()) {
                    c5899c.mo5779W();
                    return;
                }
                if (abstractC1374j.m5841m()) {
                    C1379o m5837d = abstractC1374j.m5837d();
                    if (m5837d.m5852u()) {
                        c5899c.mo5785u0(m5837d.m5850q());
                        return;
                    } else if (m5837d.m5851s()) {
                        c5899c.mo5788x0(m5837d.mo5620a());
                        return;
                    } else {
                        c5899c.mo5786v0(m5837d.mo5621e());
                        return;
                    }
                }
                if (abstractC1374j.m5838h()) {
                    c5899c.mo5780f();
                    Iterator<AbstractC1374j> it = abstractC1374j.m5835b().iterator();
                    while (it.hasNext()) {
                        write(c5899c, it.next());
                    }
                    c5899c.mo5782n();
                    return;
                }
                if (!abstractC1374j.m5840k()) {
                    throw new IllegalArgumentException("Couldn't write " + abstractC1374j.getClass());
                }
                c5899c.mo5781j();
                for (Map.Entry<String, AbstractC1374j> entry : abstractC1374j.m5836c().m5843o()) {
                    c5899c.mo5778K(entry.getKey());
                    write(c5899c, entry.getValue());
                }
                c5899c.mo5787w();
            }
        };
        f5082U = c134227;
        f5083V = m5696e(AbstractC1374j.class, c134227);
        f5084W = new InterfaceC1386v() { // from class: com.google.gson.internal.bind.TypeAdapters.28
            @Override // com.google.gson.InterfaceC1386v
            public <T> TypeAdapter<T> create(Gson gson, C5740a<T> c5740a) {
                Class<? super T> rawType = c5740a.getRawType();
                if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
                    return null;
                }
                if (!rawType.isEnum()) {
                    rawType = rawType.getSuperclass();
                }
                return new EnumTypeAdapter(rawType);
            }
        };
    }

    /* renamed from: a */
    public static <TT> InterfaceC1386v m5692a(Class<TT> cls, TypeAdapter<TT> typeAdapter) {
        return new InterfaceC1386v() { // from class: com.google.gson.internal.bind.TypeAdapters.30

            /* renamed from: h */
            public final /* synthetic */ Class f5113h;

            /* renamed from: i */
            public final /* synthetic */ TypeAdapter f5114i;

            public C134630(Class cls2, TypeAdapter typeAdapter2) {
                r1 = cls2;
                r2 = typeAdapter2;
            }

            @Override // com.google.gson.InterfaceC1386v
            public <T> TypeAdapter<T> create(Gson gson, C5740a<T> c5740a) {
                if (c5740a.getRawType() == r1) {
                    return r2;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + r1.getName() + ",adapter=" + r2 + "]";
            }
        };
    }

    /* renamed from: b */
    public static <TT> InterfaceC1386v m5693b(Class<TT> cls, Class<TT> cls2, TypeAdapter<? super TT> typeAdapter) {
        return new InterfaceC1386v() { // from class: com.google.gson.internal.bind.TypeAdapters.31

            /* renamed from: h */
            public final /* synthetic */ Class f5115h;

            /* renamed from: i */
            public final /* synthetic */ Class f5116i;

            /* renamed from: j */
            public final /* synthetic */ TypeAdapter f5117j;

            public C134731(Class cls3, Class cls22, TypeAdapter typeAdapter2) {
                r1 = cls3;
                r2 = cls22;
                r3 = typeAdapter2;
            }

            @Override // com.google.gson.InterfaceC1386v
            public <T> TypeAdapter<T> create(Gson gson, C5740a<T> c5740a) {
                Class<? super T> rawType = c5740a.getRawType();
                if (rawType == r1 || rawType == r2) {
                    return r3;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + r2.getName() + "+" + r1.getName() + ",adapter=" + r3 + "]";
            }
        };
    }

    /* renamed from: c */
    public static <TT> InterfaceC1386v m5694c(C5740a<TT> c5740a, TypeAdapter<TT> typeAdapter) {
        return new InterfaceC1386v() { // from class: com.google.gson.internal.bind.TypeAdapters.29

            /* renamed from: i */
            public final /* synthetic */ TypeAdapter f5112i;

            public C134429(TypeAdapter typeAdapter2) {
                r2 = typeAdapter2;
            }

            @Override // com.google.gson.InterfaceC1386v
            public <T> TypeAdapter<T> create(Gson gson, C5740a<T> c5740a2) {
                if (c5740a2.equals(C5740a.this)) {
                    return r2;
                }
                return null;
            }
        };
    }

    /* renamed from: d */
    public static <TT> InterfaceC1386v m5695d(Class<TT> cls, Class<? extends TT> cls2, TypeAdapter<? super TT> typeAdapter) {
        return new InterfaceC1386v() { // from class: com.google.gson.internal.bind.TypeAdapters.32

            /* renamed from: h */
            public final /* synthetic */ Class f5118h;

            /* renamed from: i */
            public final /* synthetic */ Class f5119i;

            /* renamed from: j */
            public final /* synthetic */ TypeAdapter f5120j;

            public C134832(Class cls3, Class cls22, TypeAdapter typeAdapter2) {
                r1 = cls3;
                r2 = cls22;
                r3 = typeAdapter2;
            }

            @Override // com.google.gson.InterfaceC1386v
            public <T> TypeAdapter<T> create(Gson gson, C5740a<T> c5740a) {
                Class<? super T> rawType = c5740a.getRawType();
                if (rawType == r1 || rawType == r2) {
                    return r3;
                }
                return null;
            }

            public String toString() {
                return "Factory[type=" + r1.getName() + "+" + r2.getName() + ",adapter=" + r3 + "]";
            }
        };
    }

    /* renamed from: e */
    public static <T1> InterfaceC1386v m5696e(Class<T1> cls, TypeAdapter<T1> typeAdapter) {
        return new InterfaceC1386v() { // from class: com.google.gson.internal.bind.TypeAdapters.33

            /* renamed from: h */
            public final /* synthetic */ Class f5121h;

            /* renamed from: i */
            public final /* synthetic */ TypeAdapter f5122i;

            /* renamed from: com.google.gson.internal.bind.TypeAdapters$33$1 */
            /* loaded from: classes.dex */
            public class AnonymousClass1<T1> extends TypeAdapter<T1> {

                /* renamed from: a */
                public final /* synthetic */ Class f5123a;

                public AnonymousClass1(Class rawType2) {
                    r2 = rawType2;
                }

                @Override // com.google.gson.TypeAdapter
                public T1 read(C5897a c5897a) {
                    T1 t12 = (T1) r2.read(c5897a);
                    if (t12 == null || r2.isInstance(t12)) {
                        return t12;
                    }
                    throw new C1382r("Expected a " + r2.getName() + " but was " + t12.getClass().getName());
                }

                @Override // com.google.gson.TypeAdapter
                public void write(C5899c c5899c, T1 t12) {
                    r2.write(c5899c, t12);
                }
            }

            public C134933(Class cls2, TypeAdapter typeAdapter2) {
                r1 = cls2;
                r2 = typeAdapter2;
            }

            @Override // com.google.gson.InterfaceC1386v
            public <T2> TypeAdapter<T2> create(Gson gson, C5740a<T2> c5740a) {
                Class rawType2 = c5740a.getRawType();
                if (r1.isAssignableFrom(rawType2)) {
                    return new TypeAdapter<T1>() { // from class: com.google.gson.internal.bind.TypeAdapters.33.1

                        /* renamed from: a */
                        public final /* synthetic */ Class f5123a;

                        public AnonymousClass1(Class rawType22) {
                            r2 = rawType22;
                        }

                        @Override // com.google.gson.TypeAdapter
                        public T1 read(C5897a c5897a) {
                            T1 t12 = (T1) r2.read(c5897a);
                            if (t12 == null || r2.isInstance(t12)) {
                                return t12;
                            }
                            throw new C1382r("Expected a " + r2.getName() + " but was " + t12.getClass().getName());
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void write(C5899c c5899c, T1 t12) {
                            r2.write(c5899c, t12);
                        }
                    };
                }
                return null;
            }

            public String toString() {
                return "Factory[typeHierarchy=" + r1.getName() + ",adapter=" + r2 + "]";
            }
        };
    }
}
