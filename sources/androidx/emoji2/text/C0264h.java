package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.C0261e;
import androidx.emoji2.text.C0269m;
import java.util.Arrays;

/* renamed from: androidx.emoji2.text.h */
/* loaded from: classes.dex */
public final class C0264h {

    /* renamed from: a */
    public final C0261e.i f1250a;

    /* renamed from: b */
    public final C0269m f1251b;

    /* renamed from: c */
    public C0261e.d f1252c;

    /* renamed from: d */
    public final boolean f1253d;

    /* renamed from: e */
    public final int[] f1254e;

    /* renamed from: androidx.emoji2.text.h$a */
    /* loaded from: classes.dex */
    public static final class a {
        /* renamed from: a */
        public static int m1290a(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    i10--;
                    if (i10 < 0) {
                        return z10 ? -1 : 0;
                    }
                    char charAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i11--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i11--;
                    } else {
                        if (Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        z10 = true;
                    }
                }
                return i10;
            }
        }

        /* renamed from: b */
        public static int m1291b(CharSequence charSequence, int i10, int i11) {
            int length = charSequence.length();
            if (i10 < 0 || length < i10 || i11 < 0) {
                return -1;
            }
            while (true) {
                boolean z10 = false;
                while (i11 != 0) {
                    if (i10 >= length) {
                        if (z10) {
                            return -1;
                        }
                        return length;
                    }
                    char charAt = charSequence.charAt(i10);
                    if (z10) {
                        if (!Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i11--;
                        i10++;
                    } else if (!Character.isSurrogate(charAt)) {
                        i11--;
                        i10++;
                    } else {
                        if (Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i10++;
                        z10 = true;
                    }
                }
                return i10;
            }
        }
    }

    /* renamed from: androidx.emoji2.text.h$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public int f1255a = 1;

        /* renamed from: b */
        public final C0269m.a f1256b;

        /* renamed from: c */
        public C0269m.a f1257c;

        /* renamed from: d */
        public C0269m.a f1258d;

        /* renamed from: e */
        public int f1259e;

        /* renamed from: f */
        public int f1260f;

        /* renamed from: g */
        public final boolean f1261g;

        /* renamed from: h */
        public final int[] f1262h;

        public b(C0269m.a aVar, boolean z10, int[] iArr) {
            this.f1256b = aVar;
            this.f1257c = aVar;
            this.f1261g = z10;
            this.f1262h = iArr;
        }

        /* renamed from: d */
        public static boolean m1292d(int i10) {
            return i10 == 65039;
        }

        /* renamed from: f */
        public static boolean m1293f(int i10) {
            return i10 == 65038;
        }

        /* renamed from: a */
        public int m1294a(int i10) {
            C0269m.a m1327a = this.f1257c.m1327a(i10);
            int i11 = 3;
            if (this.f1255a != 2) {
                if (m1327a != null) {
                    this.f1255a = 2;
                    this.f1257c = m1327a;
                    this.f1260f = 1;
                    i11 = 2;
                }
                i11 = m1298g();
            } else {
                if (m1327a != null) {
                    this.f1257c = m1327a;
                    this.f1260f++;
                } else {
                    if (!m1293f(i10)) {
                        if (!m1292d(i10)) {
                            if (this.f1257c.m1328b() != null && (this.f1260f != 1 || m1299h())) {
                                this.f1258d = this.f1257c;
                                m1298g();
                            }
                        }
                    }
                    i11 = m1298g();
                }
                i11 = 2;
            }
            this.f1259e = i10;
            return i11;
        }

        /* renamed from: b */
        public C0263g m1295b() {
            return this.f1257c.m1328b();
        }

        /* renamed from: c */
        public C0263g m1296c() {
            return this.f1258d.m1328b();
        }

        /* renamed from: e */
        public boolean m1297e() {
            return this.f1255a == 2 && this.f1257c.m1328b() != null && (this.f1260f > 1 || m1299h());
        }

        /* renamed from: g */
        public final int m1298g() {
            this.f1255a = 1;
            this.f1257c = this.f1256b;
            this.f1260f = 0;
            return 1;
        }

        /* renamed from: h */
        public final boolean m1299h() {
            if (this.f1257c.m1328b().m1280j() || m1292d(this.f1259e)) {
                return true;
            }
            if (this.f1261g) {
                if (this.f1262h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f1262h, this.f1257c.m1328b().m1272b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }
    }

    public C0264h(C0269m c0269m, C0261e.i iVar, C0261e.d dVar, boolean z10, int[] iArr) {
        this.f1250a = iVar;
        this.f1251b = c0269m;
        this.f1252c = dVar;
        this.f1253d = z10;
        this.f1254e = iArr;
    }

    /* renamed from: b */
    public static boolean m1282b(Editable editable, KeyEvent keyEvent, boolean z10) {
        AbstractC0265i[] abstractC0265iArr;
        if (m1286g(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!m1285f(selectionStart, selectionEnd) && (abstractC0265iArr = (AbstractC0265i[]) editable.getSpans(selectionStart, selectionEnd, AbstractC0265i.class)) != null && abstractC0265iArr.length > 0) {
            for (AbstractC0265i abstractC0265i : abstractC0265iArr) {
                int spanStart = editable.getSpanStart(abstractC0265i);
                int spanEnd = editable.getSpanEnd(abstractC0265i);
                if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m1283c(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z10) {
        int max;
        int min;
        if (editable != null && inputConnection != null && i10 >= 0 && i11 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (m1285f(selectionStart, selectionEnd)) {
                return false;
            }
            if (z10) {
                max = a.m1290a(editable, selectionStart, Math.max(i10, 0));
                min = a.m1291b(editable, selectionEnd, Math.max(i11, 0));
                if (max == -1 || min == -1) {
                    return false;
                }
            } else {
                max = Math.max(selectionStart - i10, 0);
                min = Math.min(selectionEnd + i11, editable.length());
            }
            AbstractC0265i[] abstractC0265iArr = (AbstractC0265i[]) editable.getSpans(max, min, AbstractC0265i.class);
            if (abstractC0265iArr != null && abstractC0265iArr.length > 0) {
                for (AbstractC0265i abstractC0265i : abstractC0265iArr) {
                    int spanStart = editable.getSpanStart(abstractC0265i);
                    int spanEnd = editable.getSpanEnd(abstractC0265i);
                    max = Math.min(spanStart, max);
                    min = Math.max(spanEnd, min);
                }
                int max2 = Math.max(max, 0);
                int min2 = Math.min(min, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max2, min2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m1284d(Editable editable, int i10, KeyEvent keyEvent) {
        if (!(i10 != 67 ? i10 != 112 ? false : m1282b(editable, keyEvent, true) : m1282b(editable, keyEvent, false))) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    /* renamed from: f */
    public static boolean m1285f(int i10, int i11) {
        return i10 == -1 || i11 == -1 || i10 != i11;
    }

    /* renamed from: g */
    public static boolean m1286g(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    /* renamed from: a */
    public final void m1287a(Spannable spannable, C0263g c0263g, int i10, int i11) {
        spannable.setSpan(this.f1250a.m1270a(c0263g), i10, i11, 33);
    }

    /* renamed from: e */
    public final boolean m1288e(CharSequence charSequence, int i10, int i11, C0263g c0263g) {
        if (c0263g.m1274d() == 0) {
            c0263g.m1281k(this.f1252c.mo1240a(charSequence, i10, i11, c0263g.m1278h()));
        }
        return c0263g.m1274d() == 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x0125, code lost:
    
        ((androidx.emoji2.text.C0270n) r10).m1333d();
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0047 A[Catch: all -> 0x012c, TryCatch #0 {all -> 0x012c, blocks: (B:99:0x000d, B:102:0x0012, B:104:0x0016, B:106:0x0025, B:9:0x0036, B:11:0x0040, B:13:0x0043, B:15:0x0047, B:17:0x0053, B:19:0x0056, B:23:0x0063, B:29:0x0072, B:30:0x0080, B:34:0x009b, B:60:0x00ab, B:64:0x00b7, B:65:0x00c1, B:47:0x00cb, B:50:0x00d2, B:37:0x00d7, B:39:0x00e2, B:71:0x00e9, B:75:0x00f3, B:78:0x00ff, B:79:0x0105, B:81:0x010e, B:6:0x002b), top: B:98:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ff A[Catch: all -> 0x012c, TryCatch #0 {all -> 0x012c, blocks: (B:99:0x000d, B:102:0x0012, B:104:0x0016, B:106:0x0025, B:9:0x0036, B:11:0x0040, B:13:0x0043, B:15:0x0047, B:17:0x0053, B:19:0x0056, B:23:0x0063, B:29:0x0072, B:30:0x0080, B:34:0x009b, B:60:0x00ab, B:64:0x00b7, B:65:0x00c1, B:47:0x00cb, B:50:0x00d2, B:37:0x00d7, B:39:0x00e2, B:71:0x00e9, B:75:0x00f3, B:78:0x00ff, B:79:0x0105, B:81:0x010e, B:6:0x002b), top: B:98:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010e A[Catch: all -> 0x012c, TRY_LEAVE, TryCatch #0 {all -> 0x012c, blocks: (B:99:0x000d, B:102:0x0012, B:104:0x0016, B:106:0x0025, B:9:0x0036, B:11:0x0040, B:13:0x0043, B:15:0x0047, B:17:0x0053, B:19:0x0056, B:23:0x0063, B:29:0x0072, B:30:0x0080, B:34:0x009b, B:60:0x00ab, B:64:0x00b7, B:65:0x00c1, B:47:0x00cb, B:50:0x00d2, B:37:0x00d7, B:39:0x00e2, B:71:0x00e9, B:75:0x00f3, B:78:0x00ff, B:79:0x0105, B:81:0x010e, B:6:0x002b), top: B:98:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011a  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.CharSequence m1289h(java.lang.CharSequence r10, int r11, int r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C0264h.m1289h(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }
}
