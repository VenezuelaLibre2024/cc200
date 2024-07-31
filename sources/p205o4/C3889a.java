package p205o4;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p109h7.C2420c;
import p109h7.C2422e;
import p152k4.AbstractC3354g;
import p152k4.C3348a;
import p152k4.C3351d;

/* renamed from: o4.a */
/* loaded from: classes.dex */
public final class C3889a extends AbstractC3354g {

    /* renamed from: c */
    public static final Pattern f13954c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a */
    public final CharsetDecoder f13955a = C2422e.f9747c.newDecoder();

    /* renamed from: b */
    public final CharsetDecoder f13956b = C2422e.f9746b.newDecoder();

    @Override // p152k4.AbstractC3354g
    /* renamed from: b */
    public C3348a mo12429b(C3351d c3351d, ByteBuffer byteBuffer) {
        String m14755c = m14755c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (m14755c == null) {
            return new C3348a(new C3891c(bArr, null, null));
        }
        Matcher matcher = f13954c.matcher(m14755c);
        String str2 = null;
        for (int i10 = 0; matcher.find(i10); i10 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String m9665e = C2420c.m9665e(group);
                m9665e.hashCode();
                if (m9665e.equals("streamurl")) {
                    str2 = group2;
                } else if (m9665e.equals("streamtitle")) {
                    str = group2;
                }
            }
        }
        return new C3348a(new C3891c(bArr, str, str2));
    }

    /* renamed from: c */
    public final String m14755c(ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder;
        try {
            str = this.f13955a.decode(byteBuffer).toString();
            charsetDecoder = this.f13955a;
        } catch (CharacterCodingException unused) {
            this.f13955a.reset();
            byteBuffer.rewind();
            try {
                str = this.f13956b.decode(byteBuffer).toString();
            } catch (CharacterCodingException unused2) {
                str = null;
            } catch (Throwable th) {
                this.f13956b.reset();
                byteBuffer.rewind();
                throw th;
            }
            charsetDecoder = this.f13956b;
        } catch (Throwable th2) {
            this.f13955a.reset();
            byteBuffer.rewind();
            throw th2;
        }
        charsetDecoder.reset();
        byteBuffer.rewind();
        return str;
    }
}
