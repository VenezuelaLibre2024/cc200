package ac;

import ac.InterfaceC0087b;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p311vb.EnumC5160d;

/* renamed from: ac.a */
/* loaded from: classes.dex */
public class C0086a implements InterfaceC0087b {

    /* renamed from: a */
    public final long f302a;

    /* renamed from: c */
    public final MediaFormat f304c;

    /* renamed from: d */
    public long f305d = 0;

    /* renamed from: b */
    public final ByteBuffer f303b = ByteBuffer.allocateDirect(8192).order(ByteOrder.nativeOrder());

    public C0086a(long j10) {
        this.f302a = j10;
        MediaFormat mediaFormat = new MediaFormat();
        this.f304c = mediaFormat;
        mediaFormat.setString("mime", "audio/raw");
        mediaFormat.setInteger("bitrate", 1411200);
        mediaFormat.setInteger("channel-count", 2);
        mediaFormat.setInteger("max-input-size", 8192);
        mediaFormat.setInteger("sample-rate", 44100);
    }

    @Override // ac.InterfaceC0087b
    /* renamed from: b */
    public long mo378b(long j10) {
        this.f305d = j10;
        return j10;
    }

    @Override // ac.InterfaceC0087b
    /* renamed from: d */
    public long mo379d() {
        return this.f302a;
    }

    @Override // ac.InterfaceC0087b
    /* renamed from: e */
    public MediaFormat mo380e(EnumC5160d enumC5160d) {
        if (enumC5160d == EnumC5160d.AUDIO) {
            return this.f304c;
        }
        return null;
    }

    @Override // ac.InterfaceC0087b
    /* renamed from: f */
    public void mo381f(EnumC5160d enumC5160d) {
    }

    @Override // ac.InterfaceC0087b
    /* renamed from: g */
    public void mo382g(EnumC5160d enumC5160d) {
    }

    @Override // ac.InterfaceC0087b
    public int getOrientation() {
        return 0;
    }

    @Override // ac.InterfaceC0087b
    /* renamed from: h */
    public boolean mo383h() {
        return this.f305d >= mo379d();
    }

    @Override // ac.InterfaceC0087b
    /* renamed from: i */
    public long mo384i() {
        return this.f305d;
    }

    @Override // ac.InterfaceC0087b
    /* renamed from: j */
    public void mo385j(InterfaceC0087b.a aVar) {
        this.f303b.clear();
        aVar.f306a = this.f303b;
        aVar.f307b = true;
        long j10 = this.f305d;
        aVar.f308c = j10;
        aVar.f309d = 8192;
        this.f305d = j10 + 46439;
    }

    @Override // ac.InterfaceC0087b
    /* renamed from: k */
    public void mo386k() {
        this.f305d = 0L;
    }

    @Override // ac.InterfaceC0087b
    /* renamed from: l */
    public boolean mo387l(EnumC5160d enumC5160d) {
        return enumC5160d == EnumC5160d.AUDIO;
    }

    @Override // ac.InterfaceC0087b
    /* renamed from: m */
    public double[] mo388m() {
        return null;
    }
}
