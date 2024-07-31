package p030c3;

import ae.C0107m;
import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.File;
import org.json.JSONObject;
import p243qd.C4246m;
import td.C4753m;

/* renamed from: c3.b */
/* loaded from: classes.dex */
public final class C0606b {

    /* renamed from: a */
    public final String f2637a;

    public C0606b(String str) {
        C4753m.m18653f(str, "channelName");
        this.f2637a = str;
    }

    /* renamed from: a */
    public final void m3007a(Context context, MethodChannel.Result result) {
        C4753m.m18653f(context, "context");
        C4753m.m18653f(result, "result");
        File externalFilesDir = context.getExternalFilesDir("video_compress");
        result.success(externalFilesDir != null ? Boolean.valueOf(C4246m.m16296h(externalFilesDir)) : null);
    }

    /* renamed from: b */
    public final void m3008b(File file) {
        C4753m.m18653f(file, Constants.FILE);
        if (file.exists()) {
            file.delete();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0040  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap m3009c(java.lang.String r5, long r6, io.flutter.plugin.common.MethodChannel.Result r8) {
        /*
            r4 = this;
            java.lang.String r0 = "Assume this is a corrupt video file"
            java.lang.String r1 = "Ignore failures while cleaning up"
            java.lang.String r2 = "path"
            td.C4753m.m18653f(r5, r2)
            java.lang.String r2 = "result"
            td.C4753m.m18653f(r8, r2)
            android.media.MediaMetadataRetriever r2 = new android.media.MediaMetadataRetriever
            r2.<init>()
            r3 = 0
            r2.setDataSource(r5)     // Catch: java.lang.Throwable -> L27 java.lang.RuntimeException -> L29 java.lang.IllegalArgumentException -> L38
            r5 = 2
            android.graphics.Bitmap r5 = r2.getFrameAtTime(r6, r5)     // Catch: java.lang.Throwable -> L27 java.lang.RuntimeException -> L29 java.lang.IllegalArgumentException -> L38
            r2.release()     // Catch: java.lang.RuntimeException -> L20
            goto L25
        L20:
            java.lang.String r6 = r4.f2637a
            r8.error(r6, r1, r3)
        L25:
            r3 = r5
            goto L3e
        L27:
            r5 = move-exception
            goto L72
        L29:
            java.lang.String r5 = r4.f2637a     // Catch: java.lang.Throwable -> L27
            r8.error(r5, r0, r3)     // Catch: java.lang.Throwable -> L27
        L2e:
            r2.release()     // Catch: java.lang.RuntimeException -> L32
            goto L3e
        L32:
            java.lang.String r5 = r4.f2637a
            r8.error(r5, r1, r3)
            goto L3e
        L38:
            java.lang.String r5 = r4.f2637a     // Catch: java.lang.Throwable -> L27
            r8.error(r5, r0, r3)     // Catch: java.lang.Throwable -> L27
            goto L2e
        L3e:
            if (r3 != 0) goto L46
            r5 = 0
            java.lang.Integer[] r5 = new java.lang.Integer[r5]
            r8.success(r5)
        L46:
            td.C4753m.m18650c(r3)
            int r5 = r3.getWidth()
            int r6 = r3.getHeight()
            int r7 = java.lang.Math.max(r5, r6)
            r8 = 512(0x200, float:7.17E-43)
            if (r7 <= r8) goto L6e
            r8 = 1140850688(0x44000000, float:512.0)
            float r7 = (float) r7
            float r8 = r8 / r7
            float r5 = (float) r5
            float r5 = r5 * r8
            int r5 = java.lang.Math.round(r5)
            float r6 = (float) r6
            float r8 = r8 * r6
            int r6 = java.lang.Math.round(r8)
            r7 = 1
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createScaledBitmap(r3, r5, r6, r7)
        L6e:
            td.C4753m.m18650c(r3)
            return r3
        L72:
            r2.release()     // Catch: java.lang.RuntimeException -> L76
            goto L7b
        L76:
            java.lang.String r6 = r4.f2637a
            r8.error(r6, r1, r3)
        L7b:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p030c3.C0606b.m3009c(java.lang.String, long, io.flutter.plugin.common.MethodChannel$Result):android.graphics.Bitmap");
    }

    /* renamed from: d */
    public final JSONObject m3010d(Context context, String str) {
        C4753m.m18653f(context, "context");
        C4753m.m18653f(str, "path");
        File file = new File(str);
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(context, Uri.fromFile(file));
        String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
        String extractMetadata2 = mediaMetadataRetriever.extractMetadata(7);
        if (extractMetadata2 == null) {
            extractMetadata2 = "";
        }
        String extractMetadata3 = mediaMetadataRetriever.extractMetadata(3);
        String str2 = extractMetadata3 != null ? extractMetadata3 : "";
        String extractMetadata4 = mediaMetadataRetriever.extractMetadata(18);
        String extractMetadata5 = mediaMetadataRetriever.extractMetadata(19);
        long parseLong = Long.parseLong(extractMetadata);
        long parseLong2 = Long.parseLong(extractMetadata4);
        long parseLong3 = Long.parseLong(extractMetadata5);
        long length = file.length();
        String extractMetadata6 = Build.VERSION.SDK_INT >= 17 ? mediaMetadataRetriever.extractMetadata(24) : null;
        Integer m420f = extractMetadata6 != null ? C0107m.m420f(extractMetadata6) : null;
        if (m420f != null && m3011e(m420f.intValue())) {
            parseLong3 = parseLong2;
            parseLong2 = parseLong3;
        }
        mediaMetadataRetriever.release();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("path", str);
        jSONObject.put("title", extractMetadata2);
        jSONObject.put("author", str2);
        jSONObject.put("width", parseLong2);
        jSONObject.put("height", parseLong3);
        jSONObject.put("duration", parseLong);
        jSONObject.put("filesize", length);
        if (m420f != null) {
            jSONObject.put("orientation", m420f.intValue());
        }
        return jSONObject;
    }

    /* renamed from: e */
    public final boolean m3011e(int i10) {
        return (i10 == 90 || i10 == 270) ? false : true;
    }
}
