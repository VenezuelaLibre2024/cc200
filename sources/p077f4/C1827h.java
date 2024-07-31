package p077f4;

import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import p126i7.AbstractC2651u;
import p152k4.C3348a;
import p221p4.AbstractC4008i;
import p221p4.C4000a;
import p221p4.C4004e;
import p221p4.C4009j;
import p221p4.C4012m;
import p222p5.C4015a0;
import p222p5.C4046r;
import p235q4.C4163a;
import p264s3.C4463m1;
import p333x3.C5582v;

/* renamed from: f4.h */
/* loaded from: classes.dex */
public final class C1827h {

    /* renamed from: a */
    public static final String[] f6883a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* renamed from: a */
    public static C4004e m7490a(int i10, C4015a0 c4015a0) {
        int m15241p = c4015a0.m15241p();
        if (c4015a0.m15241p() == 1684108385) {
            c4015a0.m15224U(8);
            String m15205B = c4015a0.m15205B(m15241p - 16);
            return new C4004e("und", m15205B, m15205B);
        }
        C4046r.m15529i("MetadataUtil", "Failed to parse comment attribute: " + AbstractC1820a.m7389a(i10));
        return null;
    }

    /* renamed from: b */
    public static C4000a m7491b(C4015a0 c4015a0) {
        String str;
        int m15241p = c4015a0.m15241p();
        if (c4015a0.m15241p() == 1684108385) {
            int m7390b = AbstractC1820a.m7390b(c4015a0.m15241p());
            String str2 = m7390b == 13 ? "image/jpeg" : m7390b == 14 ? "image/png" : null;
            if (str2 != null) {
                c4015a0.m15224U(4);
                int i10 = m15241p - 16;
                byte[] bArr = new byte[i10];
                c4015a0.m15237l(bArr, 0, i10);
                return new C4000a(str2, null, 3, bArr);
            }
            str = "Unrecognized cover art flags: " + m7390b;
        } else {
            str = "Failed to parse cover art attribute";
        }
        C4046r.m15529i("MetadataUtil", str);
        return null;
    }

    /* renamed from: c */
    public static C3348a.b m7492c(C4015a0 c4015a0) {
        int m15231f = c4015a0.m15231f() + c4015a0.m15241p();
        int m15241p = c4015a0.m15241p();
        int i10 = (m15241p >> 24) & 255;
        try {
            if (i10 == 169 || i10 == 253) {
                int i11 = 16777215 & m15241p;
                if (i11 == 6516084) {
                    return m7490a(m15241p, c4015a0);
                }
                if (i11 == 7233901 || i11 == 7631467) {
                    return m7497h(m15241p, "TIT2", c4015a0);
                }
                if (i11 == 6516589 || i11 == 7828084) {
                    return m7497h(m15241p, "TCOM", c4015a0);
                }
                if (i11 == 6578553) {
                    return m7497h(m15241p, "TDRC", c4015a0);
                }
                if (i11 == 4280916) {
                    return m7497h(m15241p, "TPE1", c4015a0);
                }
                if (i11 == 7630703) {
                    return m7497h(m15241p, "TSSE", c4015a0);
                }
                if (i11 == 6384738) {
                    return m7497h(m15241p, "TALB", c4015a0);
                }
                if (i11 == 7108978) {
                    return m7497h(m15241p, "USLT", c4015a0);
                }
                if (i11 == 6776174) {
                    return m7497h(m15241p, "TCON", c4015a0);
                }
                if (i11 == 6779504) {
                    return m7497h(m15241p, "TIT1", c4015a0);
                }
            } else {
                if (m15241p == 1735291493) {
                    return m7496g(c4015a0);
                }
                if (m15241p == 1684632427) {
                    return m7493d(m15241p, "TPOS", c4015a0);
                }
                if (m15241p == 1953655662) {
                    return m7493d(m15241p, "TRCK", c4015a0);
                }
                if (m15241p == 1953329263) {
                    return m7498i(m15241p, "TBPM", c4015a0, true, false);
                }
                if (m15241p == 1668311404) {
                    return m7498i(m15241p, "TCMP", c4015a0, true, true);
                }
                if (m15241p == 1668249202) {
                    return m7491b(c4015a0);
                }
                if (m15241p == 1631670868) {
                    return m7497h(m15241p, "TPE2", c4015a0);
                }
                if (m15241p == 1936682605) {
                    return m7497h(m15241p, "TSOT", c4015a0);
                }
                if (m15241p == 1936679276) {
                    return m7497h(m15241p, "TSO2", c4015a0);
                }
                if (m15241p == 1936679282) {
                    return m7497h(m15241p, "TSOA", c4015a0);
                }
                if (m15241p == 1936679265) {
                    return m7497h(m15241p, "TSOP", c4015a0);
                }
                if (m15241p == 1936679791) {
                    return m7497h(m15241p, "TSOC", c4015a0);
                }
                if (m15241p == 1920233063) {
                    return m7498i(m15241p, "ITUNESADVISORY", c4015a0, false, false);
                }
                if (m15241p == 1885823344) {
                    return m7498i(m15241p, "ITUNESGAPLESS", c4015a0, false, true);
                }
                if (m15241p == 1936683886) {
                    return m7497h(m15241p, "TVSHOWSORT", c4015a0);
                }
                if (m15241p == 1953919848) {
                    return m7497h(m15241p, "TVSHOW", c4015a0);
                }
                if (m15241p == 757935405) {
                    return m7494e(c4015a0, m15231f);
                }
            }
            C4046r.m15522b("MetadataUtil", "Skipped unknown metadata entry: " + AbstractC1820a.m7389a(m15241p));
            return null;
        } finally {
            c4015a0.m15223T(m15231f);
        }
    }

    /* renamed from: d */
    public static C4012m m7493d(int i10, String str, C4015a0 c4015a0) {
        int m15241p = c4015a0.m15241p();
        if (c4015a0.m15241p() == 1684108385 && m15241p >= 22) {
            c4015a0.m15224U(10);
            int m15216M = c4015a0.m15216M();
            if (m15216M > 0) {
                String str2 = "" + m15216M;
                int m15216M2 = c4015a0.m15216M();
                if (m15216M2 > 0) {
                    str2 = str2 + FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE + m15216M2;
                }
                return new C4012m(str, null, AbstractC2651u.m10771v(str2));
            }
        }
        C4046r.m15529i("MetadataUtil", "Failed to parse index/count attribute: " + AbstractC1820a.m7389a(i10));
        return null;
    }

    /* renamed from: e */
    public static AbstractC4008i m7494e(C4015a0 c4015a0, int i10) {
        int i11 = -1;
        int i12 = -1;
        String str = null;
        String str2 = null;
        while (c4015a0.m15231f() < i10) {
            int m15231f = c4015a0.m15231f();
            int m15241p = c4015a0.m15241p();
            int m15241p2 = c4015a0.m15241p();
            c4015a0.m15224U(4);
            if (m15241p2 == 1835360622) {
                str = c4015a0.m15205B(m15241p - 12);
            } else if (m15241p2 == 1851878757) {
                str2 = c4015a0.m15205B(m15241p - 12);
            } else {
                if (m15241p2 == 1684108385) {
                    i11 = m15231f;
                    i12 = m15241p;
                }
                c4015a0.m15224U(m15241p - 12);
            }
        }
        if (str == null || str2 == null || i11 == -1) {
            return null;
        }
        c4015a0.m15223T(i11);
        c4015a0.m15224U(16);
        return new C4009j(str, str2, c4015a0.m15205B(i12 - 16));
    }

    /* renamed from: f */
    public static C4163a m7495f(C4015a0 c4015a0, int i10, String str) {
        while (true) {
            int m15231f = c4015a0.m15231f();
            if (m15231f >= i10) {
                return null;
            }
            int m15241p = c4015a0.m15241p();
            if (c4015a0.m15241p() == 1684108385) {
                int m15241p2 = c4015a0.m15241p();
                int m15241p3 = c4015a0.m15241p();
                int i11 = m15241p - 16;
                byte[] bArr = new byte[i11];
                c4015a0.m15237l(bArr, 0, i11);
                return new C4163a(str, bArr, m15241p3, m15241p2);
            }
            c4015a0.m15223T(m15231f + m15241p);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p221p4.C4012m m7496g(p222p5.C4015a0 r3) {
        /*
            int r3 = m7499j(r3)
            r0 = 0
            if (r3 <= 0) goto L11
            java.lang.String[] r1 = p077f4.C1827h.f6883a
            int r2 = r1.length
            if (r3 > r2) goto L11
            int r3 = r3 + (-1)
            r3 = r1[r3]
            goto L12
        L11:
            r3 = r0
        L12:
            if (r3 == 0) goto L20
            p4.m r1 = new p4.m
            i7.u r3 = p126i7.AbstractC2651u.m10771v(r3)
            java.lang.String r2 = "TCON"
            r1.<init>(r2, r0, r3)
            return r1
        L20:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            p222p5.C4046r.m15529i(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p077f4.C1827h.m7496g(p5.a0):p4.m");
    }

    /* renamed from: h */
    public static C4012m m7497h(int i10, String str, C4015a0 c4015a0) {
        int m15241p = c4015a0.m15241p();
        if (c4015a0.m15241p() == 1684108385) {
            c4015a0.m15224U(8);
            return new C4012m(str, null, AbstractC2651u.m10771v(c4015a0.m15205B(m15241p - 16)));
        }
        C4046r.m15529i("MetadataUtil", "Failed to parse text attribute: " + AbstractC1820a.m7389a(i10));
        return null;
    }

    /* renamed from: i */
    public static AbstractC4008i m7498i(int i10, String str, C4015a0 c4015a0, boolean z10, boolean z11) {
        int m7499j = m7499j(c4015a0);
        if (z11) {
            m7499j = Math.min(1, m7499j);
        }
        if (m7499j >= 0) {
            return z10 ? new C4012m(str, null, AbstractC2651u.m10771v(Integer.toString(m7499j))) : new C4004e("und", str, Integer.toString(m7499j));
        }
        C4046r.m15529i("MetadataUtil", "Failed to parse uint8 attribute: " + AbstractC1820a.m7389a(i10));
        return null;
    }

    /* renamed from: j */
    public static int m7499j(C4015a0 c4015a0) {
        c4015a0.m15224U(4);
        if (c4015a0.m15241p() == 1684108385) {
            c4015a0.m15224U(8);
            return c4015a0.m15210G();
        }
        C4046r.m15529i("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    /* renamed from: k */
    public static void m7500k(int i10, C5582v c5582v, C4463m1.b bVar) {
        if (i10 == 1 && c5582v.m22498a()) {
            bVar.m17457P(c5582v.f20955a).m17458Q(c5582v.f20956b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000b, code lost:
    
        if (r6 != null) goto L19;
     */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m7501l(int r5, p152k4.C3348a r6, p152k4.C3348a r7, p264s3.C4463m1.b r8, p152k4.C3348a... r9) {
        /*
            k4.a r0 = new k4.a
            r1 = 0
            k4.a$b[] r2 = new p152k4.C3348a.b[r1]
            r0.<init>(r2)
            r2 = 1
            if (r5 != r2) goto Le
            if (r6 == 0) goto L3c
            goto L3d
        Le:
            r6 = 2
            if (r5 != r6) goto L3c
            if (r7 == 0) goto L3c
            r5 = r1
        L14:
            int r6 = r7.m12414f()
            if (r5 >= r6) goto L3c
            k4.a$b r6 = r7.m12413e(r5)
            boolean r3 = r6 instanceof p235q4.C4163a
            if (r3 == 0) goto L39
            q4.a r6 = (p235q4.C4163a) r6
            java.lang.String r3 = r6.f14960h
            java.lang.String r4 = "com.android.capture.fps"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L39
            k4.a r5 = new k4.a
            k4.a$b[] r7 = new p152k4.C3348a.b[r2]
            r7[r1] = r6
            r5.<init>(r7)
            r6 = r5
            goto L3d
        L39:
            int r5 = r5 + 1
            goto L14
        L3c:
            r6 = r0
        L3d:
            int r5 = r9.length
        L3e:
            if (r1 >= r5) goto L49
            r7 = r9[r1]
            k4.a r6 = r6.m12411b(r7)
            int r1 = r1 + 1
            goto L3e
        L49:
            int r5 = r6.m12414f()
            if (r5 <= 0) goto L52
            r8.m17467Z(r6)
        L52:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p077f4.C1827h.m7501l(int, k4.a, k4.a, s3.m1$b, k4.a[]):void");
    }
}
