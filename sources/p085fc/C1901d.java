package p085fc;

import ac.InterfaceC0087b;
import android.media.MediaCodec;
import android.media.MediaFormat;
import ec.InterfaceC1766b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p311vb.EnumC5160d;
import p371zb.InterfaceC6116a;

/* renamed from: fc.d */
/* loaded from: classes.dex */
public class C1901d implements InterfaceC1902e {

    /* renamed from: a */
    public final InterfaceC0087b f7202a;

    /* renamed from: b */
    public final InterfaceC6116a f7203b;

    /* renamed from: c */
    public final InterfaceC0087b.a f7204c;

    /* renamed from: d */
    public final EnumC5160d f7205d;

    /* renamed from: f */
    public boolean f7207f;

    /* renamed from: g */
    public final MediaFormat f7208g;

    /* renamed from: i */
    public InterfaceC1766b f7210i;

    /* renamed from: e */
    public final MediaCodec.BufferInfo f7206e = new MediaCodec.BufferInfo();

    /* renamed from: h */
    public boolean f7209h = false;

    public C1901d(InterfaceC0087b interfaceC0087b, InterfaceC6116a interfaceC6116a, EnumC5160d enumC5160d, InterfaceC1766b interfaceC1766b) {
        this.f7202a = interfaceC0087b;
        this.f7203b = interfaceC6116a;
        this.f7205d = enumC5160d;
        MediaFormat mo380e = interfaceC0087b.mo380e(enumC5160d);
        this.f7208g = mo380e;
        if (mo380e == null) {
            throw new IllegalArgumentException("Output format is null!");
        }
        int integer = mo380e.getInteger("max-input-size");
        InterfaceC0087b.a aVar = new InterfaceC0087b.a();
        this.f7204c = aVar;
        aVar.f306a = ByteBuffer.allocateDirect(integer).order(ByteOrder.nativeOrder());
        this.f7210i = interfaceC1766b;
    }

    @Override // p085fc.InterfaceC1902e
    /* renamed from: a */
    public boolean mo7769a() {
        return this.f7207f;
    }

    @Override // p085fc.InterfaceC1902e
    /* renamed from: b */
    public void mo7770b(MediaFormat mediaFormat) {
    }

    @Override // p085fc.InterfaceC1902e
    /* renamed from: c */
    public boolean mo7771c(boolean z10) {
        if (this.f7207f) {
            return false;
        }
        if (!this.f7209h) {
            this.f7203b.mo24402b(this.f7205d, this.f7208g);
            this.f7209h = true;
        }
        if (this.f7202a.mo383h() || z10) {
            this.f7204c.f306a.clear();
            this.f7206e.set(0, 0, 0L, 4);
            this.f7203b.mo24403c(this.f7205d, this.f7204c.f306a, this.f7206e);
            this.f7207f = true;
            return true;
        }
        if (!this.f7202a.mo387l(this.f7205d)) {
            return false;
        }
        this.f7204c.f306a.clear();
        this.f7202a.mo385j(this.f7204c);
        long mo7065a = this.f7210i.mo7065a(this.f7205d, this.f7204c.f308c);
        InterfaceC0087b.a aVar = this.f7204c;
        this.f7206e.set(0, aVar.f309d, mo7065a, aVar.f307b ? 1 : 0);
        this.f7203b.mo24403c(this.f7205d, this.f7204c.f306a, this.f7206e);
        return true;
    }

    @Override // p085fc.InterfaceC1902e
    public void release() {
    }
}
