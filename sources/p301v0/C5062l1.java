package p301v0;

/* renamed from: v0.l1 */
/* loaded from: classes.dex */
public final class C5062l1 {

    /* renamed from: v0.l1$a */
    /* loaded from: classes.dex */
    public static class a implements b {

        /* renamed from: a */
        public final /* synthetic */ AbstractC5048h f19024a;

        public a(AbstractC5048h abstractC5048h) {
            this.f19024a = abstractC5048h;
        }

        @Override // p301v0.C5062l1.b
        /* renamed from: a */
        public byte mo20352a(int i10) {
            return this.f19024a.mo19958b(i10);
        }

        @Override // p301v0.C5062l1.b
        public int size() {
            return this.f19024a.size();
        }
    }

    /* renamed from: v0.l1$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        byte mo20352a(int i10);

        int size();
    }

    /* renamed from: a */
    public static String m20349a(AbstractC5048h abstractC5048h) {
        return m20350b(new a(abstractC5048h));
    }

    /* renamed from: b */
    public static String m20350b(b bVar) {
        String str;
        StringBuilder sb2 = new StringBuilder(bVar.size());
        for (int i10 = 0; i10 < bVar.size(); i10++) {
            int mo20352a = bVar.mo20352a(i10);
            if (mo20352a == 34) {
                str = "\\\"";
            } else if (mo20352a == 39) {
                str = "\\'";
            } else if (mo20352a != 92) {
                switch (mo20352a) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (mo20352a < 32 || mo20352a > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((mo20352a >>> 6) & 3) + 48));
                            sb2.append((char) (((mo20352a >>> 3) & 7) + 48));
                            mo20352a = (mo20352a & 7) + 48;
                        }
                        sb2.append((char) mo20352a);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    /* renamed from: c */
    public static String m20351c(String str) {
        return m20349a(AbstractC5048h.m19954j(str));
    }
}
