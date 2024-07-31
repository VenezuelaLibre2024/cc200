package com.yalantis.ucrop;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import sc.C4565a;

/* renamed from: com.yalantis.ucrop.a */
/* loaded from: classes2.dex */
public class C1498a {

    /* renamed from: a */
    public Intent f5423a = new Intent();

    /* renamed from: b */
    public Bundle f5424b;

    /* renamed from: com.yalantis.ucrop.a$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        public final Bundle f5425a = new Bundle();

        /* renamed from: a */
        public Bundle m6051a() {
            return this.f5425a;
        }

        /* renamed from: b */
        public void m6052b(int i10) {
            this.f5425a.putInt("com.yalantis.ucrop.UcropColorControlsWidgetActive", i10);
        }

        /* renamed from: c */
        public void m6053c(int i10, C4565a... c4565aArr) {
            if (i10 >= c4565aArr.length) {
                throw new IllegalArgumentException(String.format(Locale.US, "Index [selectedByDefault = %d] (0-based) cannot be higher or equal than aspect ratio options count [count = %d].", Integer.valueOf(i10), Integer.valueOf(c4565aArr.length)));
            }
            this.f5425a.putInt("com.yalantis.ucrop.AspectRatioSelectedByDefault", i10);
            this.f5425a.putParcelableArrayList("com.yalantis.ucrop.AspectRatioOptions", new ArrayList<>(Arrays.asList(c4565aArr)));
        }

        /* renamed from: d */
        public void m6054d(boolean z10) {
            this.f5425a.putBoolean("com.yalantis.ucrop.CircleDimmedLayer", z10);
        }

        /* renamed from: e */
        public void m6055e(Bitmap.CompressFormat compressFormat) {
            this.f5425a.putString("com.yalantis.ucrop.CompressionFormatName", compressFormat.name());
        }

        /* renamed from: f */
        public void m6056f(int i10) {
            this.f5425a.putInt("com.yalantis.ucrop.CompressionQuality", i10);
        }

        /* renamed from: g */
        public void m6057g(int i10) {
            this.f5425a.putInt("com.yalantis.ucrop.CropFrameColor", i10);
        }

        /* renamed from: h */
        public void m6058h(int i10) {
            this.f5425a.putInt("com.yalantis.ucrop.CropFrameStrokeWidth", i10);
        }

        /* renamed from: i */
        public void m6059i(int i10) {
            this.f5425a.putInt("com.yalantis.ucrop.CropGridColor", i10);
        }

        /* renamed from: j */
        public void m6060j(int i10) {
            this.f5425a.putInt("com.yalantis.ucrop.CropGridColumnCount", i10);
        }

        /* renamed from: k */
        public void m6061k(int i10) {
            this.f5425a.putInt("com.yalantis.ucrop.CropGridRowCount", i10);
        }

        /* renamed from: l */
        public void m6062l(int i10) {
            this.f5425a.putInt("com.yalantis.ucrop.CropGridStrokeWidth", i10);
        }

        /* renamed from: m */
        public void m6063m(int i10) {
            this.f5425a.putInt("com.yalantis.ucrop.DimmedLayerColor", i10);
        }

        /* renamed from: n */
        public void m6064n(boolean z10) {
            this.f5425a.putBoolean("com.yalantis.ucrop.FreeStyleCrop", z10);
        }

        /* renamed from: o */
        public void m6065o(boolean z10) {
            this.f5425a.putBoolean("com.yalantis.ucrop.HideBottomControls", z10);
        }

        /* renamed from: p */
        public void m6066p(int i10) {
            this.f5425a.putInt("com.yalantis.ucrop.UcropRootViewBackgroundColor", i10);
        }

        /* renamed from: q */
        public void m6067q(boolean z10) {
            this.f5425a.putBoolean("com.yalantis.ucrop.ShowCropGrid", z10);
        }

        /* renamed from: r */
        public void m6068r(int i10) {
            this.f5425a.putInt("com.yalantis.ucrop.StatusBarColor", i10);
        }

        /* renamed from: s */
        public void m6069s(int i10) {
            this.f5425a.putInt("com.yalantis.ucrop.ToolbarColor", i10);
        }

        /* renamed from: t */
        public void m6070t(String str) {
            this.f5425a.putString("com.yalantis.ucrop.UcropToolbarTitleText", str);
        }

        /* renamed from: u */
        public void m6071u(int i10) {
            this.f5425a.putInt("com.yalantis.ucrop.UcropToolbarWidgetColor", i10);
        }
    }

    public C1498a(Uri uri, Uri uri2) {
        Bundle bundle = new Bundle();
        this.f5424b = bundle;
        bundle.putParcelable("com.yalantis.ucrop.InputUri", uri);
        this.f5424b.putParcelable("com.yalantis.ucrop.OutputUri", uri2);
    }

    /* renamed from: a */
    public static Throwable m6044a(Intent intent) {
        return (Throwable) intent.getSerializableExtra("com.yalantis.ucrop.Error");
    }

    /* renamed from: c */
    public static Uri m6045c(Intent intent) {
        return (Uri) intent.getParcelableExtra("com.yalantis.ucrop.OutputUri");
    }

    /* renamed from: d */
    public static C1498a m6046d(Uri uri, Uri uri2) {
        return new C1498a(uri, uri2);
    }

    /* renamed from: b */
    public Intent m6047b(Context context) {
        this.f5423a.setClass(context, UCropActivity.class);
        this.f5423a.putExtras(this.f5424b);
        return this.f5423a;
    }

    /* renamed from: e */
    public C1498a m6048e(float f10, float f11) {
        this.f5424b.putFloat("com.yalantis.ucrop.AspectRatioX", f10);
        this.f5424b.putFloat("com.yalantis.ucrop.AspectRatioY", f11);
        return this;
    }

    /* renamed from: f */
    public C1498a m6049f(int i10, int i11) {
        if (i10 < 10) {
            i10 = 10;
        }
        if (i11 < 10) {
            i11 = 10;
        }
        this.f5424b.putInt("com.yalantis.ucrop.MaxSizeX", i10);
        this.f5424b.putInt("com.yalantis.ucrop.MaxSizeY", i11);
        return this;
    }

    /* renamed from: g */
    public C1498a m6050g(a aVar) {
        this.f5424b.putAll(aVar.m6051a());
        return this;
    }
}
