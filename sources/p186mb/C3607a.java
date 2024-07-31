package p186mb;

import ae.C0099e;
import ae.C0108n;
import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import java.util.List;
import java.util.ListIterator;
import p115hd.C2502n;
import p115hd.C2510v;
import td.C4753m;

/* renamed from: mb.a */
/* loaded from: classes.dex */
public final class C3607a {

    /* renamed from: a */
    public static final C3607a f12724a = new C3607a();

    /* renamed from: a */
    public final String m13343a(Context context, Uri uri) {
        List m9989e;
        Uri uri2;
        List m9989e2;
        C4753m.m18653f(context, "context");
        C4753m.m18653f(uri, "uri");
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (m13346d(uri)) {
                String documentId = DocumentsContract.getDocumentId(uri);
                C4753m.m18652e(documentId, "docId");
                List<String> m412c = new C0099e(":").m412c(documentId, 0);
                if (!m412c.isEmpty()) {
                    ListIterator<String> listIterator = m412c.listIterator(m412c.size());
                    while (listIterator.hasPrevious()) {
                        if (!(listIterator.previous().length() == 0)) {
                            m9989e2 = C2510v.m10004G(m412c, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                m9989e2 = C2502n.m9989e();
                String[] strArr = (String[]) m9989e2.toArray(new String[0]);
                if (!C0108n.m427m("primary", strArr[0], true)) {
                    return m13344b(context, uri, null, null);
                }
                return Environment.getExternalStorageDirectory().toString() + '/' + strArr[1];
            }
            if (m13345c(uri)) {
                try {
                    String documentId2 = DocumentsContract.getDocumentId(uri);
                    Uri parse = Uri.parse("content://downloads/public_downloads");
                    Long valueOf = Long.valueOf(documentId2);
                    C4753m.m18652e(valueOf, "valueOf(id)");
                    Uri withAppendedId = ContentUris.withAppendedId(parse, valueOf.longValue());
                    C4753m.m18652e(withAppendedId, "withAppendedId(\n        …va.lang.Long.valueOf(id))");
                    return m13344b(context, withAppendedId, null, null);
                } catch (Exception unused) {
                    return m13344b(context, uri, null, null);
                }
            }
            if (m13347e(uri)) {
                String documentId3 = DocumentsContract.getDocumentId(uri);
                C4753m.m18652e(documentId3, "docId");
                List<String> m412c2 = new C0099e(":").m412c(documentId3, 0);
                if (!m412c2.isEmpty()) {
                    ListIterator<String> listIterator2 = m412c2.listIterator(m412c2.size());
                    while (listIterator2.hasPrevious()) {
                        if (!(listIterator2.previous().length() == 0)) {
                            m9989e = C2510v.m10004G(m412c2, listIterator2.nextIndex() + 1);
                            break;
                        }
                    }
                }
                m9989e = C2502n.m9989e();
                String[] strArr2 = (String[]) m9989e.toArray(new String[0]);
                String str = strArr2[0];
                int hashCode = str.hashCode();
                if (hashCode == 93166550) {
                    if (str.equals("audio")) {
                        uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    }
                    uri2 = null;
                } else if (hashCode != 100313435) {
                    if (hashCode == 112202875 && str.equals("video")) {
                        uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    }
                    uri2 = null;
                } else {
                    if (str.equals("image")) {
                        uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    }
                    uri2 = null;
                }
                if (uri2 == null) {
                    return null;
                }
                return m13344b(context, uri2, "_id=?", new String[]{strArr2[1]});
            }
        } else if (C0108n.m427m("content", uri.getScheme(), true)) {
            return m13344b(context, uri, null, null);
        }
        return uri.getPath();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0050  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m13344b(android.content.Context r9, android.net.Uri r10, java.lang.String r11, java.lang.String[] r12) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p186mb.C3607a.m13344b(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    /* renamed from: c */
    public final boolean m13345c(Uri uri) {
        C4753m.m18653f(uri, "uri");
        return C4753m.m18648a("com.android.providers.downloads.documents", uri.getAuthority());
    }

    /* renamed from: d */
    public final boolean m13346d(Uri uri) {
        C4753m.m18653f(uri, "uri");
        return C4753m.m18648a("com.android.externalstorage.documents", uri.getAuthority());
    }

    /* renamed from: e */
    public final boolean m13347e(Uri uri) {
        C4753m.m18653f(uri, "uri");
        return C4753m.m18648a("com.android.providers.media.documents", uri.getAuthority());
    }
}
