package p317w3;

import java.util.UUID;
import p222p5.C4041n0;
import p304v3.InterfaceC5105b;

/* renamed from: w3.c0 */
/* loaded from: classes.dex */
public final class C5228c0 implements InterfaceC5105b {

    /* renamed from: d */
    public static final boolean f19799d;

    /* renamed from: a */
    public final UUID f19800a;

    /* renamed from: b */
    public final byte[] f19801b;

    /* renamed from: c */
    public final boolean f19802c;

    static {
        boolean z10;
        if ("Amazon".equals(C4041n0.f14515c)) {
            String str = C4041n0.f14516d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f19799d = z10;
            }
        }
        z10 = false;
        f19799d = z10;
    }

    public C5228c0(UUID uuid, byte[] bArr, boolean z10) {
        this.f19800a = uuid;
        this.f19801b = bArr;
        this.f19802c = z10;
    }
}
