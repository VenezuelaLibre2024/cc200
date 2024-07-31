package p283tb;

import android.opengl.GLES20;
import gd.C2245s;
import p212ob.C3979c;
import p212ob.C3981e;
import p212ob.InterfaceC3980d;
import sd.InterfaceC4569a;
import td.AbstractC4754n;
import td.C4747g;

/* renamed from: tb.a */
/* loaded from: classes.dex */
public final class C4737a implements InterfaceC3980d {

    /* renamed from: a */
    public final int f17678a;

    /* renamed from: b */
    public final int f17679b;

    /* renamed from: c */
    public final int f17680c;

    /* renamed from: tb.a$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC4754n implements InterfaceC4569a<C2245s> {

        /* renamed from: i */
        public final /* synthetic */ Integer f17682i;

        /* renamed from: j */
        public final /* synthetic */ Integer f17683j;

        /* renamed from: k */
        public final /* synthetic */ Integer f17684k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Integer num, Integer num2, Integer num3) {
            super(0);
            this.f17682i = num;
            this.f17683j = num2;
            this.f17684k = num3;
        }

        /* renamed from: a */
        public final void m18619a() {
            if (this.f17682i != null && this.f17683j != null && this.f17684k != null) {
                GLES20.glTexImage2D(C4737a.this.m18617d(), 0, this.f17684k.intValue(), this.f17682i.intValue(), this.f17683j.intValue(), 0, this.f17684k.intValue(), 5121, null);
            }
            GLES20.glTexParameterf(C4737a.this.m18617d(), 10241, 9728);
            GLES20.glTexParameterf(C4737a.this.m18617d(), 10240, 9729);
            GLES20.glTexParameteri(C4737a.this.m18617d(), 10242, 33071);
            GLES20.glTexParameteri(C4737a.this.m18617d(), 10243, 33071);
            C3979c.m15108b("glTexParameter");
        }

        @Override // sd.InterfaceC4569a
        public /* bridge */ /* synthetic */ C2245s invoke() {
            m18619a();
            return C2245s.f8873a;
        }
    }

    public C4737a() {
        this(0, 0, null, 7, null);
    }

    public C4737a(int i10, int i11, Integer num) {
        this(i10, i11, num, null, null, null);
    }

    public /* synthetic */ C4737a(int i10, int i11, Integer num, int i12, C4747g c4747g) {
        this((i12 & 1) != 0 ? 33984 : i10, (i12 & 2) != 0 ? 36197 : i11, (i12 & 4) != 0 ? null : num);
    }

    public C4737a(int i10, int i11, Integer num, Integer num2, Integer num3, Integer num4) {
        int i12;
        this.f17679b = i10;
        this.f17680c = i11;
        if (num != null) {
            i12 = num.intValue();
        } else {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            C3979c.m15108b("glGenTextures");
            i12 = iArr[0];
        }
        this.f17678a = i12;
        if (num == null) {
            C3981e.m15112a(this, new a(num2, num3, num4));
        }
    }

    @Override // p212ob.InterfaceC3980d
    /* renamed from: a */
    public void mo15110a() {
        GLES20.glBindTexture(this.f17680c, 0);
        GLES20.glActiveTexture(33984);
        C3979c.m15108b("unbind");
    }

    @Override // p212ob.InterfaceC3980d
    /* renamed from: b */
    public void mo15111b() {
        GLES20.glActiveTexture(this.f17679b);
        GLES20.glBindTexture(this.f17680c, this.f17678a);
        C3979c.m15108b("bind");
    }

    /* renamed from: c */
    public final int m18616c() {
        return this.f17678a;
    }

    /* renamed from: d */
    public final int m18617d() {
        return this.f17680c;
    }

    /* renamed from: e */
    public final void m18618e() {
        GLES20.glDeleteTextures(1, new int[]{this.f17678a}, 0);
    }
}
