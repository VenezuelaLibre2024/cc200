package p317w3;

import android.annotation.SuppressLint;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p077f4.C1831l;
import p109h7.C2422e;
import p222p5.C4014a;
import p222p5.C4015a0;
import p222p5.C4041n0;
import p222p5.C4046r;
import p264s3.C4441i;
import p275t3.C4674s1;
import p317w3.C5247m;
import p317w3.InterfaceC5226b0;

/* renamed from: w3.f0 */
/* loaded from: classes.dex */
public final class C5234f0 implements InterfaceC5226b0 {

    /* renamed from: d */
    public static final InterfaceC5226b0.c f19809d = C5232e0.f19807a;

    /* renamed from: a */
    public final UUID f19810a;

    /* renamed from: b */
    public final MediaDrm f19811b;

    /* renamed from: c */
    public int f19812c;

    /* renamed from: w3.f0$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static boolean m21161a(MediaDrm mediaDrm, String str) {
            return mediaDrm.requiresSecureDecoder(str);
        }

        /* renamed from: b */
        public static void m21162b(MediaDrm mediaDrm, byte[] bArr, C4674s1 c4674s1) {
            LogSessionId m18497a = c4674s1.m18497a();
            if (m18497a.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            ((MediaDrm.PlaybackComponent) C4014a.m15199e(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(m18497a);
        }
    }

    public C5234f0(UUID uuid) {
        C4014a.m15199e(uuid);
        C4014a.m15196b(!C4441i.f16298b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f19810a = uuid;
        MediaDrm mediaDrm = new MediaDrm(m21155u(uuid));
        this.f19811b = mediaDrm;
        this.f19812c = 1;
        if (C4441i.f16300d.equals(uuid) && m21146B()) {
            m21156w(mediaDrm);
        }
    }

    /* renamed from: A */
    public static /* synthetic */ InterfaceC5226b0 m21145A(UUID uuid) {
        try {
            return m21147C(uuid);
        } catch (C5244k0 unused) {
            C4046r.m15523c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new C5260z();
        }
    }

    /* renamed from: B */
    public static boolean m21146B() {
        return "ASUS_Z00AD".equals(C4041n0.f14516d);
    }

    /* renamed from: C */
    public static C5234f0 m21147C(UUID uuid) {
        try {
            return new C5234f0(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new C5244k0(1, e10);
        } catch (Exception e11) {
            throw new C5244k0(2, e11);
        }
    }

    /* renamed from: p */
    public static byte[] m21150p(byte[] bArr) {
        C4015a0 c4015a0 = new C4015a0(bArr);
        int m15245t = c4015a0.m15245t();
        short m15247v = c4015a0.m15247v();
        short m15247v2 = c4015a0.m15247v();
        if (m15247v != 1 || m15247v2 != 1) {
            C4046r.m15526f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short m15247v3 = c4015a0.m15247v();
        Charset charset = C2422e.f9749e;
        String m15208E = c4015a0.m15208E(m15247v3, charset);
        if (m15208E.contains("<LA_URL>")) {
            return bArr;
        }
        int indexOf = m15208E.indexOf("</DATA>");
        if (indexOf == -1) {
            C4046r.m15529i("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = m15208E.substring(0, indexOf) + "<LA_URL>https://x</LA_URL>" + m15208E.substring(indexOf);
        int i10 = m15245t + 52;
        ByteBuffer allocate = ByteBuffer.allocate(i10);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        allocate.putInt(i10);
        allocate.putShort(m15247v);
        allocate.putShort(m15247v2);
        allocate.putShort((short) (str.length() * 2));
        allocate.put(str.getBytes(charset));
        return allocate.array();
    }

    /* renamed from: q */
    public static String m21151q(String str) {
        return "<LA_URL>https://x</LA_URL>".equals(str) ? "" : (C4041n0.f14513a == 33 && "https://default.url".equals(str)) ? "" : str;
    }

    /* renamed from: r */
    public static byte[] m21152r(UUID uuid, byte[] bArr) {
        return C4441i.f16299c.equals(uuid) ? C5223a.m21114a(bArr) : bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        if ("AFTT".equals(r0) == false) goto L57;
     */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] m21153s(java.util.UUID r3, byte[] r4) {
        /*
            java.util.UUID r0 = p264s3.C4441i.f16301e
            boolean r1 = r0.equals(r3)
            if (r1 == 0) goto L18
            byte[] r1 = p077f4.C1831l.m7530e(r4, r3)
            if (r1 != 0) goto Lf
            goto L10
        Lf:
            r4 = r1
        L10:
            byte[] r4 = m21150p(r4)
            byte[] r4 = p077f4.C1831l.m7526a(r0, r4)
        L18:
            int r1 = p222p5.C4041n0.f14513a
            r2 = 23
            if (r1 >= r2) goto L26
            java.util.UUID r1 = p264s3.C4441i.f16300d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L58
        L26:
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L5f
            java.lang.String r0 = p222p5.C4041n0.f14515c
            java.lang.String r1 = "Amazon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
            java.lang.String r0 = p222p5.C4041n0.f14516d
            java.lang.String r1 = "AFTB"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTS"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L58
            java.lang.String r1 = "AFTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5f
        L58:
            byte[] r3 = p077f4.C1831l.m7530e(r4, r3)
            if (r3 == 0) goto L5f
            return r3
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p317w3.C5234f0.m21153s(java.util.UUID, byte[]):byte[]");
    }

    /* renamed from: t */
    public static String m21154t(UUID uuid, String str) {
        return (C4041n0.f14513a < 26 && C4441i.f16299c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    /* renamed from: u */
    public static UUID m21155u(UUID uuid) {
        return (C4041n0.f14513a >= 27 || !C4441i.f16299c.equals(uuid)) ? uuid : C4441i.f16298b;
    }

    /* renamed from: w */
    public static void m21156w(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    /* renamed from: y */
    public static C5247m.b m21157y(UUID uuid, List<C5247m.b> list) {
        boolean z10;
        if (C4441i.f16300d.equals(uuid)) {
            if (C4041n0.f14513a >= 28 && list.size() > 1) {
                C5247m.b bVar = list.get(0);
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    C5247m.b bVar2 = list.get(i11);
                    byte[] bArr = (byte[]) C4014a.m15199e(bVar2.f19913l);
                    if (!C4041n0.m15449c(bVar2.f19912k, bVar.f19912k) || !C4041n0.m15449c(bVar2.f19911j, bVar.f19911j) || !C1831l.m7528c(bArr)) {
                        z10 = false;
                        break;
                    }
                    i10 += bArr.length;
                }
                z10 = true;
                if (z10) {
                    byte[] bArr2 = new byte[i10];
                    int i12 = 0;
                    for (int i13 = 0; i13 < list.size(); i13++) {
                        byte[] bArr3 = (byte[]) C4014a.m15199e(list.get(i13).f19913l);
                        int length = bArr3.length;
                        System.arraycopy(bArr3, 0, bArr2, i12, length);
                        i12 += length;
                    }
                    return bVar.m21264b(bArr2);
                }
            }
            for (int i14 = 0; i14 < list.size(); i14++) {
                C5247m.b bVar3 = list.get(i14);
                int m7532g = C1831l.m7532g((byte[]) C4014a.m15199e(bVar3.f19913l));
                int i15 = C4041n0.f14513a;
                if (i15 < 23 && m7532g == 0) {
                    return bVar3;
                }
                if (i15 >= 23 && m7532g == 1) {
                    return bVar3;
                }
            }
        }
        return list.get(0);
    }

    /* renamed from: z */
    public /* synthetic */ void m21158z(InterfaceC5226b0.b bVar, MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        bVar.mo21141a(this, bArr, i10, i11, bArr2);
    }

    @Override // p317w3.InterfaceC5226b0
    /* renamed from: a */
    public Map<String, String> mo21126a(byte[] bArr) {
        return this.f19811b.queryKeyStatus(bArr);
    }

    @Override // p317w3.InterfaceC5226b0
    /* renamed from: b */
    public InterfaceC5226b0.d mo21127b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f19811b.getProvisionRequest();
        return new InterfaceC5226b0.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // p317w3.InterfaceC5226b0
    /* renamed from: d */
    public byte[] mo21129d() {
        return this.f19811b.openSession();
    }

    @Override // p317w3.InterfaceC5226b0
    /* renamed from: e */
    public void mo21130e(InterfaceC5226b0.b bVar) {
        this.f19811b.setOnEventListener(bVar == null ? null : new MediaDrm.OnEventListener() { // from class: w3.d0

            /* renamed from: b */
            public final /* synthetic */ InterfaceC5226b0.b f19805b;

            public /* synthetic */ C5230d0(InterfaceC5226b0.b bVar2) {
                r2 = bVar2;
            }

            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                C5234f0.this.m21158z(r2, mediaDrm, bArr, i10, i11, bArr2);
            }
        });
    }

    @Override // p317w3.InterfaceC5226b0
    /* renamed from: f */
    public void mo21131f(byte[] bArr, C4674s1 c4674s1) {
        if (C4041n0.f14513a >= 31) {
            try {
                a.m21162b(this.f19811b, bArr, c4674s1);
            } catch (UnsupportedOperationException unused) {
                C4046r.m15529i("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // p317w3.InterfaceC5226b0
    /* renamed from: g */
    public boolean mo21132g(byte[] bArr, String str) {
        if (C4041n0.f14513a >= 31) {
            return a.m21161a(this.f19811b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f19810a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // p317w3.InterfaceC5226b0
    /* renamed from: h */
    public void mo21133h(byte[] bArr, byte[] bArr2) {
        this.f19811b.restoreKeys(bArr, bArr2);
    }

    @Override // p317w3.InterfaceC5226b0
    /* renamed from: i */
    public void mo21134i(byte[] bArr) {
        this.f19811b.closeSession(bArr);
    }

    @Override // p317w3.InterfaceC5226b0
    /* renamed from: j */
    public byte[] mo21135j(byte[] bArr, byte[] bArr2) {
        if (C4441i.f16299c.equals(this.f19810a)) {
            bArr2 = C5223a.m21115b(bArr2);
        }
        return this.f19811b.provideKeyResponse(bArr, bArr2);
    }

    @Override // p317w3.InterfaceC5226b0
    /* renamed from: k */
    public void mo21136k(byte[] bArr) {
        this.f19811b.provideProvisionResponse(bArr);
    }

    @Override // p317w3.InterfaceC5226b0
    @SuppressLint({"WrongConstant"})
    /* renamed from: l */
    public InterfaceC5226b0.a mo21137l(byte[] bArr, List<C5247m.b> list, int i10, HashMap<String, String> hashMap) {
        byte[] bArr2;
        String str;
        C5247m.b bVar = null;
        if (list != null) {
            bVar = m21157y(this.f19810a, list);
            bArr2 = m21153s(this.f19810a, (byte[]) C4014a.m15199e(bVar.f19913l));
            str = m21154t(this.f19810a, bVar.f19912k);
        } else {
            bArr2 = null;
            str = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f19811b.getKeyRequest(bArr, bArr2, str, i10, hashMap);
        byte[] m21152r = m21152r(this.f19810a, keyRequest.getData());
        String m21151q = m21151q(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(m21151q) && bVar != null && !TextUtils.isEmpty(bVar.f19911j)) {
            m21151q = bVar.f19911j;
        }
        return new InterfaceC5226b0.a(m21152r, m21151q, C4041n0.f14513a >= 23 ? keyRequest.getRequestType() : Integer.MIN_VALUE);
    }

    @Override // p317w3.InterfaceC5226b0
    /* renamed from: m */
    public int mo21138m() {
        return 2;
    }

    @Override // p317w3.InterfaceC5226b0
    public synchronized void release() {
        int i10 = this.f19812c - 1;
        this.f19812c = i10;
        if (i10 == 0) {
            this.f19811b.release();
        }
    }

    @Override // p317w3.InterfaceC5226b0
    /* renamed from: v */
    public C5228c0 mo21128c(byte[] bArr) {
        return new C5228c0(m21155u(this.f19810a), bArr, C4041n0.f14513a < 21 && C4441i.f16300d.equals(this.f19810a) && "L3".equals(m21160x("securityLevel")));
    }

    /* renamed from: x */
    public String m21160x(String str) {
        return this.f19811b.getPropertyString(str);
    }
}
