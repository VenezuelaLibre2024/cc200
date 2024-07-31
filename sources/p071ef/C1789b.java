package p071ef;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import com.yalantis.ucrop.C1498a;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import sc.C4565a;

/* renamed from: ef.b */
/* loaded from: classes2.dex */
public class C1789b implements PluginRegistry.ActivityResultListener {

    /* renamed from: h */
    public final Activity f6589h;

    /* renamed from: i */
    public MethodChannel.Result f6590i;

    /* renamed from: j */
    public C1788a f6591j = new C1788a();

    public C1789b(Activity activity) {
        this.f6589h = activity;
    }

    /* renamed from: a */
    public final void m7233a() {
        this.f6590i = null;
    }

    /* renamed from: b */
    public final int m7234b(int i10) {
        Color.colorToHSV(i10, r0);
        float[] fArr = {0.0f, 0.0f, fArr[2] * 0.8f};
        return Color.HSVToColor(fArr);
    }

    /* renamed from: c */
    public final void m7235c(String str, String str2, Throwable th) {
        MethodChannel.Result result = this.f6590i;
        if (result != null) {
            result.error(str, str2, th);
            m7233a();
        }
    }

    /* renamed from: d */
    public final void m7236d(String str) {
        MethodChannel.Result result = this.f6590i;
        if (result != null) {
            result.success(str);
            m7233a();
        }
    }

    /* renamed from: e */
    public final C4565a m7237e(String str) {
        return "square".equals(str) ? new C4565a(null, 1.0f, 1.0f) : "original".equals(str) ? new C4565a(this.f6589h.getString(C1791d.f6594a).toUpperCase(), 0.0f, 1.0f) : "3x2".equals(str) ? new C4565a(null, 3.0f, 2.0f) : "4x3".equals(str) ? new C4565a(null, 4.0f, 3.0f) : "5x3".equals(str) ? new C4565a(null, 5.0f, 3.0f) : "5x4".equals(str) ? new C4565a(null, 5.0f, 4.0f) : "7x5".equals(str) ? new C4565a(null, 7.0f, 5.0f) : "16x9".equals(str) ? new C4565a(null, 16.0f, 9.0f) : new C4565a(this.f6589h.getString(C1791d.f6594a).toUpperCase(), 0.0f, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0122  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.yalantis.ucrop.C1498a.a m7238f(com.yalantis.ucrop.C1498a.a r19, io.flutter.plugin.common.MethodCall r20) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p071ef.C1789b.m7238f(com.yalantis.ucrop.a$a, io.flutter.plugin.common.MethodCall):com.yalantis.ucrop.a$a");
    }

    /* renamed from: g */
    public void m7239g(MethodCall methodCall, MethodChannel.Result result) {
        Integer num;
        Double d10;
        Double d11;
        File file;
        String str = (String) methodCall.argument("source_path");
        Integer num2 = (Integer) methodCall.argument("max_width");
        Integer num3 = (Integer) methodCall.argument("max_height");
        Double d12 = (Double) methodCall.argument("ratio_x");
        Double d13 = (Double) methodCall.argument("ratio_y");
        String str2 = (String) methodCall.argument("crop_style");
        String str3 = (String) methodCall.argument("compress_format");
        Integer num4 = (Integer) methodCall.argument("compress_quality");
        ArrayList arrayList = (ArrayList) methodCall.argument("aspect_ratio_presets");
        String str4 = (String) methodCall.argument("android.init_aspect_ratio");
        this.f6590i = result;
        File cacheDir = this.f6589h.getCacheDir();
        if ("png".equals(str3)) {
            d11 = d13;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("image_cropper_");
            num = num3;
            d10 = d12;
            sb2.append(new Date().getTime());
            sb2.append(".png");
            file = new File(cacheDir, sb2.toString());
        } else {
            num = num3;
            d10 = d12;
            d11 = d13;
            file = new File(cacheDir, "image_cropper_" + new Date().getTime() + ".jpg");
        }
        Uri fromFile = Uri.fromFile(new File(str));
        Uri fromFile2 = Uri.fromFile(file);
        C1498a.a aVar = new C1498a.a();
        aVar.m6055e("png".equals(str3) ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG);
        aVar.m6056f(num4 != null ? num4.intValue() : 90);
        if ("circle".equals(str2)) {
            aVar.m6054d(true);
        }
        m7238f(aVar, methodCall);
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                String str5 = (String) arrayList.get(i11);
                if (str5 != null) {
                    arrayList2.add(m7237e(str5));
                    if (str5.equals(str4)) {
                        i10 = i11;
                    }
                }
            }
            aVar.m6053c(i10, (C4565a[]) arrayList2.toArray(new C4565a[0]));
        }
        C1498a m6050g = C1498a.m6046d(fromFile, fromFile2).m6050g(aVar);
        if (num2 != null && num != null) {
            m6050g.m6049f(num2.intValue(), num.intValue());
        }
        if (d10 != null && d11 != null) {
            m6050g.m6048e(d10.floatValue(), d11.floatValue());
        }
        Activity activity = this.f6589h;
        activity.startActivityForResult(m6050g.m6047b(activity), 69);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        if (i10 != 69) {
            return false;
        }
        if (i11 == -1) {
            m7236d(this.f6591j.m7232e(this.f6589h, C1498a.m6045c(intent)));
            return true;
        }
        if (i11 == 96) {
            Throwable m6044a = C1498a.m6044a(intent);
            m7235c("crop_error", m6044a.getLocalizedMessage(), m6044a);
            return true;
        }
        MethodChannel.Result result = this.f6590i;
        if (result == null) {
            return false;
        }
        result.success(null);
        m7233a();
        return true;
    }
}
