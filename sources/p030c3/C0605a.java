package p030c3;

import ae.C0109o;
import android.content.Context;
import android.graphics.Bitmap;
import io.flutter.plugin.common.MethodChannel;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import p115hd.C2497j;
import p115hd.C2510v;
import p243qd.C4244k;
import td.C4753m;

/* renamed from: c3.a */
/* loaded from: classes.dex */
public final class C0605a {

    /* renamed from: a */
    public final C0606b f2636a;

    public C0605a(String str) {
        C4753m.m18653f(str, "channelName");
        this.f2636a = new C0606b(str);
    }

    /* renamed from: a */
    public final void m3005a(String str, int i10, long j10, MethodChannel.Result result) {
        C4753m.m18653f(str, "path");
        C4753m.m18653f(result, "result");
        Bitmap m3009c = this.f2636a.m3009c(str, j10, result);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m3009c.compress(Bitmap.CompressFormat.JPEG, i10, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        m3009c.recycle();
        C4753m.m18652e(byteArray, "byteArray");
        result.success(C2510v.m10005H(C2497j.m9949J(byteArray)));
    }

    /* renamed from: b */
    public final void m3006b(Context context, String str, int i10, long j10, MethodChannel.Result result) {
        C4753m.m18653f(context, "context");
        C4753m.m18653f(str, "path");
        C4753m.m18653f(result, "result");
        Bitmap m3009c = this.f2636a.m3009c(str, j10, result);
        File externalFilesDir = context.getExternalFilesDir("video_compress");
        if (externalFilesDir != null && !externalFilesDir.exists()) {
            externalFilesDir.mkdirs();
        }
        StringBuilder sb2 = new StringBuilder();
        String substring = str.substring(C0109o.m442I(str, '/', 0, false, 6, null), C0109o.m442I(str, '.', 0, false, 6, null));
        C4753m.m18652e(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb2.append(substring);
        sb2.append(".jpg");
        File file = new File(externalFilesDir, sb2.toString());
        this.f2636a.m3008b(file);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m3009c.compress(Bitmap.CompressFormat.JPEG, i10, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            file.createNewFile();
            C4753m.m18652e(byteArray, "byteArray");
            C4244k.m16290b(file, byteArray);
        } catch (IOException e10) {
            e10.printStackTrace();
        }
        m3009c.recycle();
        result.success(file.getAbsolutePath());
    }
}
