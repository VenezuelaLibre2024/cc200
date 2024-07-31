package p316w2;

import io.flutter.plugin.common.MethodChannel;
import p303v2.EnumC5102b;

/* renamed from: w2.c */
/* loaded from: classes.dex */
public class C5201c implements InterfaceC5217s {

    /* renamed from: a */
    public MethodChannel.Result f19728a;

    public C5201c(MethodChannel.Result result) {
        this.f19728a = result;
    }

    @Override // p316w2.InterfaceC5217s
    /* renamed from: a */
    public void mo21055a(boolean z10) {
        this.f19728a.success(Boolean.valueOf(z10));
    }

    @Override // p316w2.InterfaceC5217s
    /* renamed from: b */
    public void mo21056b(EnumC5102b enumC5102b) {
        this.f19728a.error(enumC5102b.toString(), enumC5102b.m20742c(), null);
    }
}
