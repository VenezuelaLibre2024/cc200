package p187n;

/* renamed from: n.p0 */
/* loaded from: classes.dex */
public class C3653p0 {

    /* renamed from: a */
    public int f12982a = 0;

    /* renamed from: b */
    public int f12983b = 0;

    /* renamed from: c */
    public int f12984c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f12985d = Integer.MIN_VALUE;

    /* renamed from: e */
    public int f12986e = 0;

    /* renamed from: f */
    public int f12987f = 0;

    /* renamed from: g */
    public boolean f12988g = false;

    /* renamed from: h */
    public boolean f12989h = false;

    /* renamed from: a */
    public int m13662a() {
        return this.f12988g ? this.f12982a : this.f12983b;
    }

    /* renamed from: b */
    public int m13663b() {
        return this.f12982a;
    }

    /* renamed from: c */
    public int m13664c() {
        return this.f12983b;
    }

    /* renamed from: d */
    public int m13665d() {
        return this.f12988g ? this.f12983b : this.f12982a;
    }

    /* renamed from: e */
    public void m13666e(int i10, int i11) {
        this.f12989h = false;
        if (i10 != Integer.MIN_VALUE) {
            this.f12986e = i10;
            this.f12982a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f12987f = i11;
            this.f12983b = i11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001a, code lost:
    
        if (r2 != Integer.MIN_VALUE) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0028, code lost:
    
        if (r2 != Integer.MIN_VALUE) goto L25;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m13667f(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.f12988g
            if (r2 != r0) goto L5
            return
        L5:
            r1.f12988g = r2
            boolean r0 = r1.f12989h
            if (r0 == 0) goto L2b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L1d
            int r2 = r1.f12985d
            if (r2 == r0) goto L14
            goto L16
        L14:
            int r2 = r1.f12986e
        L16:
            r1.f12982a = r2
            int r2 = r1.f12984c
            if (r2 == r0) goto L2f
            goto L31
        L1d:
            int r2 = r1.f12984c
            if (r2 == r0) goto L22
            goto L24
        L22:
            int r2 = r1.f12986e
        L24:
            r1.f12982a = r2
            int r2 = r1.f12985d
            if (r2 == r0) goto L2f
            goto L31
        L2b:
            int r2 = r1.f12986e
            r1.f12982a = r2
        L2f:
            int r2 = r1.f12987f
        L31:
            r1.f12983b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p187n.C3653p0.m13667f(boolean):void");
    }

    /* renamed from: g */
    public void m13668g(int i10, int i11) {
        this.f12984c = i10;
        this.f12985d = i11;
        this.f12989h = true;
        if (this.f12988g) {
            if (i11 != Integer.MIN_VALUE) {
                this.f12982a = i11;
            }
            if (i10 != Integer.MIN_VALUE) {
                this.f12983b = i10;
                return;
            }
            return;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f12982a = i10;
        }
        if (i11 != Integer.MIN_VALUE) {
            this.f12983b = i11;
        }
    }
}
