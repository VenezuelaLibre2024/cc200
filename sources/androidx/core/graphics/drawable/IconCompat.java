package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import p015b0.C0436a;
import p133j0.C3203b;
import p133j0.C3205d;
import p360z.C5934h;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k */
    public static final PorterDuff.Mode f1159k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a */
    public int f1160a;

    /* renamed from: b */
    public Object f1161b;

    /* renamed from: c */
    public byte[] f1162c;

    /* renamed from: d */
    public Parcelable f1163d;

    /* renamed from: e */
    public int f1164e;

    /* renamed from: f */
    public int f1165f;

    /* renamed from: g */
    public ColorStateList f1166g;

    /* renamed from: h */
    public PorterDuff.Mode f1167h;

    /* renamed from: i */
    public String f1168i;

    /* renamed from: j */
    public String f1169j;

    /* renamed from: androidx.core.graphics.drawable.IconCompat$a */
    /* loaded from: classes.dex */
    public static class C0245a {
        /* renamed from: a */
        public static IconCompat m1146a(Object obj) {
            C3205d.m11414j(obj);
            int m1149d = m1149d(obj);
            if (m1149d == 2) {
                return IconCompat.m1130l(null, m1148c(obj), m1147b(obj));
            }
            if (m1149d == 4) {
                return IconCompat.m1126h(m1150e(obj));
            }
            if (m1149d == 6) {
                return IconCompat.m1123e(m1150e(obj));
            }
            IconCompat iconCompat = new IconCompat(-1);
            iconCompat.f1161b = obj;
            return iconCompat;
        }

        /* renamed from: b */
        public static int m1147b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0247c.m1155a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon resource", e12);
                return 0;
            }
        }

        /* renamed from: c */
        public static String m1148c(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0247c.m1156b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon package", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon package", e12);
                return null;
            }
        }

        /* renamed from: d */
        public static int m1149d(Object obj) {
            StringBuilder sb2;
            if (Build.VERSION.SDK_INT >= 28) {
                return C0247c.m1157c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
            } catch (IllegalAccessException e10) {
                e = e10;
                sb2 = new StringBuilder();
                sb2.append("Unable to get icon type ");
                sb2.append(obj);
                Log.e("IconCompat", sb2.toString(), e);
                return -1;
            } catch (NoSuchMethodException e11) {
                e = e11;
                sb2 = new StringBuilder();
                sb2.append("Unable to get icon type ");
                sb2.append(obj);
                Log.e("IconCompat", sb2.toString(), e);
                return -1;
            } catch (InvocationTargetException e12) {
                e = e12;
                sb2 = new StringBuilder();
                sb2.append("Unable to get icon type ");
                sb2.append(obj);
                Log.e("IconCompat", sb2.toString(), e);
                return -1;
            }
        }

        /* renamed from: e */
        public static Uri m1150e(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return C0247c.m1158d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
            } catch (IllegalAccessException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            } catch (NoSuchMethodException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            } catch (InvocationTargetException e12) {
                Log.e("IconCompat", "Unable to get icon uri", e12);
                return null;
            }
        }

        /* renamed from: f */
        public static Drawable m1151f(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
        
            if (r0 >= 26) goto L22;
         */
        /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0005. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:11:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00b1  */
        /* renamed from: g */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static android.graphics.drawable.Icon m1152g(androidx.core.graphics.drawable.IconCompat r4, android.content.Context r5) {
            /*
                int r0 = r4.f1160a
                r1 = 0
                r2 = 26
                switch(r0) {
                    case -1: goto Lb5;
                    case 0: goto L8;
                    case 1: goto L9c;
                    case 2: goto L91;
                    case 3: goto L84;
                    case 4: goto L7b;
                    case 5: goto L65;
                    case 6: goto L10;
                    default: goto L8;
                }
            L8:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "Unknown type"
                r4.<init>(r5)
                throw r4
            L10:
                int r0 = android.os.Build.VERSION.SDK_INT
                r3 = 30
                if (r0 < r3) goto L20
                android.net.Uri r5 = r4.m1137r()
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.IconCompat.C0248d.m1159a(r5)
                goto La4
            L20:
                if (r5 == 0) goto L4a
                java.io.InputStream r5 = r4.m1138s(r5)
                if (r5 == 0) goto L2f
                android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r5)
                if (r0 < r2) goto L76
                goto L6d
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot load adaptive icon from uri: "
                r0.append(r1)
                android.net.Uri r4 = r4.m1137r()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
            L4a:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Context is required to resolve the file uri of the icon: "
                r0.append(r1)
                android.net.Uri r4 = r4.m1137r()
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
            L65:
                int r5 = android.os.Build.VERSION.SDK_INT
                if (r5 < r2) goto L72
                java.lang.Object r5 = r4.f1161b
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            L6d:
                android.graphics.drawable.Icon r5 = androidx.core.graphics.drawable.IconCompat.C0246b.m1154b(r5)
                goto La4
            L72:
                java.lang.Object r5 = r4.f1161b
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            L76:
                android.graphics.Bitmap r5 = androidx.core.graphics.drawable.IconCompat.m1122d(r5, r1)
                goto La0
            L7b:
                java.lang.Object r5 = r4.f1161b
                java.lang.String r5 = (java.lang.String) r5
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithContentUri(r5)
                goto La4
            L84:
                java.lang.Object r5 = r4.f1161b
                byte[] r5 = (byte[]) r5
                int r0 = r4.f1164e
                int r1 = r4.f1165f
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithData(r5, r0, r1)
                goto La4
            L91:
                java.lang.String r5 = r4.m1135o()
                int r0 = r4.f1164e
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithResource(r5, r0)
                goto La4
            L9c:
                java.lang.Object r5 = r4.f1161b
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            La0:
                android.graphics.drawable.Icon r5 = android.graphics.drawable.Icon.createWithBitmap(r5)
            La4:
                android.content.res.ColorStateList r0 = r4.f1166g
                if (r0 == 0) goto Lab
                r5.setTintList(r0)
            Lab:
                android.graphics.PorterDuff$Mode r4 = r4.f1167h
                android.graphics.PorterDuff$Mode r0 = androidx.core.graphics.drawable.IconCompat.f1159k
                if (r4 == r0) goto Lb4
                r5.setTintMode(r4)
            Lb4:
                return r5
            Lb5:
                java.lang.Object r4 = r4.f1161b
                android.graphics.drawable.Icon r4 = (android.graphics.drawable.Icon) r4
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.C0245a.m1152g(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
        }
    }

    /* renamed from: androidx.core.graphics.drawable.IconCompat$b */
    /* loaded from: classes.dex */
    public static class C0246b {
        /* renamed from: a */
        public static Drawable m1153a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        /* renamed from: b */
        public static Icon m1154b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    /* renamed from: androidx.core.graphics.drawable.IconCompat$c */
    /* loaded from: classes.dex */
    public static class C0247c {
        /* renamed from: a */
        public static int m1155a(Object obj) {
            return ((Icon) obj).getResId();
        }

        /* renamed from: b */
        public static String m1156b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        /* renamed from: c */
        public static int m1157c(Object obj) {
            return ((Icon) obj).getType();
        }

        /* renamed from: d */
        public static Uri m1158d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    /* renamed from: androidx.core.graphics.drawable.IconCompat$d */
    /* loaded from: classes.dex */
    public static class C0248d {
        /* renamed from: a */
        public static Icon m1159a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f1160a = -1;
        this.f1162c = null;
        this.f1163d = null;
        this.f1164e = 0;
        this.f1165f = 0;
        this.f1166g = null;
        this.f1167h = f1159k;
        this.f1168i = null;
    }

    public IconCompat(int i10) {
        this.f1160a = -1;
        this.f1162c = null;
        this.f1163d = null;
        this.f1164e = 0;
        this.f1165f = 0;
        this.f1166g = null;
        this.f1167h = f1159k;
        this.f1168i = null;
        this.f1160a = i10;
    }

    /* renamed from: A */
    public static String m1119A(int i10) {
        switch (i10) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0047. Please report as an issue. */
    /* renamed from: b */
    public static IconCompat m1120b(Bundle bundle) {
        Object parcelable;
        int i10 = bundle.getInt(ImagePickerCache.MAP_KEY_TYPE);
        IconCompat iconCompat = new IconCompat(i10);
        iconCompat.f1164e = bundle.getInt("int1");
        iconCompat.f1165f = bundle.getInt("int2");
        iconCompat.f1169j = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.f1166g = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.f1167h = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i10) {
            case -1:
            case 1:
            case 5:
                parcelable = bundle.getParcelable("obj");
                iconCompat.f1161b = parcelable;
                return iconCompat;
            case 0:
            default:
                Log.w("IconCompat", "Unknown type " + i10);
                return null;
            case 2:
            case 4:
            case 6:
                parcelable = bundle.getString("obj");
                iconCompat.f1161b = parcelable;
                return iconCompat;
            case 3:
                iconCompat.f1161b = bundle.getByteArray("obj");
                return iconCompat;
        }
    }

    /* renamed from: c */
    public static IconCompat m1121c(Icon icon) {
        return C0245a.m1146a(icon);
    }

    /* renamed from: d */
    public static Bitmap m1122d(Bitmap bitmap, boolean z10) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f10 = min;
        float f11 = 0.5f * f10;
        float f12 = 0.9166667f * f11;
        if (z10) {
            float f13 = 0.010416667f * f10;
            paint.setColor(0);
            paint.setShadowLayer(f13, 0.0f, f10 * 0.020833334f, 1023410176);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.setShadowLayer(f13, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f11, f11, f12, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f11, f11, f12, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    /* renamed from: e */
    public static IconCompat m1123e(Uri uri) {
        C3203b.m11401c(uri);
        return m1124f(uri.toString());
    }

    /* renamed from: f */
    public static IconCompat m1124f(String str) {
        C3203b.m11401c(str);
        IconCompat iconCompat = new IconCompat(6);
        iconCompat.f1161b = str;
        return iconCompat;
    }

    /* renamed from: g */
    public static IconCompat m1125g(Bitmap bitmap) {
        C3203b.m11401c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f1161b = bitmap;
        return iconCompat;
    }

    /* renamed from: h */
    public static IconCompat m1126h(Uri uri) {
        C3203b.m11401c(uri);
        return m1127i(uri.toString());
    }

    /* renamed from: i */
    public static IconCompat m1127i(String str) {
        C3203b.m11401c(str);
        IconCompat iconCompat = new IconCompat(4);
        iconCompat.f1161b = str;
        return iconCompat;
    }

    /* renamed from: j */
    public static IconCompat m1128j(byte[] bArr, int i10, int i11) {
        C3203b.m11401c(bArr);
        IconCompat iconCompat = new IconCompat(3);
        iconCompat.f1161b = bArr;
        iconCompat.f1164e = i10;
        iconCompat.f1165f = i11;
        return iconCompat;
    }

    /* renamed from: k */
    public static IconCompat m1129k(Context context, int i10) {
        C3203b.m11401c(context);
        return m1130l(context.getResources(), context.getPackageName(), i10);
    }

    /* renamed from: l */
    public static IconCompat m1130l(Resources resources, String str, int i10) {
        C3203b.m11401c(str);
        if (i10 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f1164e = i10;
        if (resources != null) {
            try {
                iconCompat.f1161b = resources.getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f1161b = str;
        }
        iconCompat.f1169j = str;
        return iconCompat;
    }

    /* renamed from: p */
    public static Resources m1131p(Context context, String str) {
        if ("android".equals(str)) {
            return Resources.getSystem();
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 8192);
            if (applicationInfo != null) {
                return packageManager.getResourcesForApplication(applicationInfo);
            }
            return null;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("IconCompat", String.format("Unable to find pkg=%s for icon", str), e10);
            return null;
        }
    }

    /* renamed from: a */
    public void m1132a(Context context) {
        Object obj;
        if (this.f1160a != 2 || (obj = this.f1161b) == null) {
            return;
        }
        String str = (String) obj;
        if (str.contains(":")) {
            String str2 = str.split(":", -1)[1];
            String str3 = str2.split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, -1)[0];
            String str4 = str2.split(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, -1)[1];
            String str5 = str.split(":", -1)[0];
            if ("0_resource_name_obfuscated".equals(str4)) {
                Log.i("IconCompat", "Found obfuscated resource, not trying to update resource id for it");
                return;
            }
            String m1135o = m1135o();
            int identifier = m1131p(context, m1135o).getIdentifier(str4, str3, str5);
            if (this.f1164e != identifier) {
                Log.i("IconCompat", "Id has changed for " + m1135o + " " + str);
                this.f1164e = identifier;
            }
        }
    }

    /* renamed from: m */
    public Bitmap m1133m() {
        int i10 = this.f1160a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.f1161b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i10 == 1) {
            return (Bitmap) this.f1161b;
        }
        if (i10 == 5) {
            return m1122d((Bitmap) this.f1161b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    /* renamed from: n */
    public int m1134n() {
        int i10 = this.f1160a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            return C0245a.m1147b(this.f1161b);
        }
        if (i10 == 2) {
            return this.f1164e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    /* renamed from: o */
    public String m1135o() {
        int i10 = this.f1160a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            return C0245a.m1148c(this.f1161b);
        }
        if (i10 == 2) {
            String str = this.f1169j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f1161b).split(":", -1)[0] : this.f1169j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    /* renamed from: q */
    public int m1136q() {
        int i10 = this.f1160a;
        return (i10 != -1 || Build.VERSION.SDK_INT < 23) ? i10 : C0245a.m1149d(this.f1161b);
    }

    /* renamed from: r */
    public Uri m1137r() {
        int i10 = this.f1160a;
        if (i10 == -1 && Build.VERSION.SDK_INT >= 23) {
            return C0245a.m1150e(this.f1161b);
        }
        if (i10 == 4 || i10 == 6) {
            return Uri.parse((String) this.f1161b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    /* renamed from: s */
    public InputStream m1138s(Context context) {
        StringBuilder sb2;
        String str;
        Uri m1137r = m1137r();
        String scheme = m1137r.getScheme();
        if ("content".equals(scheme) || Constants.FILE.equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(m1137r);
            } catch (Exception e10) {
                e = e10;
                sb2 = new StringBuilder();
                str = "Unable to load image from URI: ";
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f1161b));
            } catch (FileNotFoundException e11) {
                e = e11;
                sb2 = new StringBuilder();
                str = "Unable to load image from path: ";
            }
        }
        sb2.append(str);
        sb2.append(m1137r);
        Log.w("IconCompat", sb2.toString(), e);
        return null;
    }

    /* renamed from: t */
    public Drawable m1139t(Context context) {
        m1132a(context);
        if (Build.VERSION.SDK_INT >= 23) {
            return C0245a.m1151f(m1145z(context), context);
        }
        Drawable m1140u = m1140u(context);
        if (m1140u != null && (this.f1166g != null || this.f1167h != f1159k)) {
            m1140u.mutate();
            C0436a.m2263n(m1140u, this.f1166g);
            C0436a.m2264o(m1140u, this.f1167h);
        }
        return m1140u;
    }

    public String toString() {
        int height;
        if (this.f1160a == -1) {
            return String.valueOf(this.f1161b);
        }
        StringBuilder sb2 = new StringBuilder("Icon(typ=");
        sb2.append(m1119A(this.f1160a));
        switch (this.f1160a) {
            case 1:
            case 5:
                sb2.append(" size=");
                sb2.append(((Bitmap) this.f1161b).getWidth());
                sb2.append("x");
                height = ((Bitmap) this.f1161b).getHeight();
                sb2.append(height);
                break;
            case 2:
                sb2.append(" pkg=");
                sb2.append(this.f1169j);
                sb2.append(" id=");
                sb2.append(String.format("0x%08x", Integer.valueOf(m1134n())));
                break;
            case 3:
                sb2.append(" len=");
                sb2.append(this.f1164e);
                if (this.f1165f != 0) {
                    sb2.append(" off=");
                    height = this.f1165f;
                    sb2.append(height);
                    break;
                }
                break;
            case 4:
            case 6:
                sb2.append(" uri=");
                sb2.append(this.f1161b);
                break;
        }
        if (this.f1166g != null) {
            sb2.append(" tint=");
            sb2.append(this.f1166g);
        }
        if (this.f1167h != f1159k) {
            sb2.append(" mode=");
            sb2.append(this.f1167h);
        }
        sb2.append(")");
        return sb2.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: u */
    public final Drawable m1140u(Context context) {
        switch (this.f1160a) {
            case 1:
                return new BitmapDrawable(context.getResources(), (Bitmap) this.f1161b);
            case 2:
                String m1135o = m1135o();
                if (TextUtils.isEmpty(m1135o)) {
                    m1135o = context.getPackageName();
                }
                try {
                    return C5934h.m23748d(m1131p(context, m1135o), this.f1164e, context.getTheme());
                } catch (RuntimeException e10) {
                    Log.e("IconCompat", String.format("Unable to load resource 0x%08x from pkg=%s", Integer.valueOf(this.f1164e), this.f1161b), e10);
                    break;
                }
            case 3:
                return new BitmapDrawable(context.getResources(), BitmapFactory.decodeByteArray((byte[]) this.f1161b, this.f1164e, this.f1165f));
            case 4:
                InputStream m1138s = m1138s(context);
                if (m1138s != null) {
                    return new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(m1138s));
                }
                return null;
            case 5:
                return new BitmapDrawable(context.getResources(), m1122d((Bitmap) this.f1161b, false));
            case 6:
                InputStream m1138s2 = m1138s(context);
                if (m1138s2 != null) {
                    return Build.VERSION.SDK_INT >= 26 ? C0246b.m1153a(null, new BitmapDrawable(context.getResources(), BitmapFactory.decodeStream(m1138s2))) : new BitmapDrawable(context.getResources(), m1122d(BitmapFactory.decodeStream(m1138s2), false));
                }
                return null;
            default:
                return null;
        }
    }

    /* renamed from: v */
    public void m1141v() {
        Parcelable parcelable;
        this.f1167h = PorterDuff.Mode.valueOf(this.f1168i);
        switch (this.f1160a) {
            case -1:
                parcelable = this.f1163d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                parcelable = this.f1163d;
                if (parcelable == null) {
                    byte[] bArr = this.f1162c;
                    this.f1161b = bArr;
                    this.f1160a = 3;
                    this.f1164e = 0;
                    this.f1165f = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f1162c, Charset.forName("UTF-16"));
                this.f1161b = str;
                if (this.f1160a == 2 && this.f1169j == null) {
                    this.f1169j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f1161b = this.f1162c;
                return;
        }
        this.f1161b = parcelable;
    }

    /* renamed from: w */
    public void m1142w(boolean z10) {
        this.f1168i = this.f1167h.name();
        switch (this.f1160a) {
            case -1:
                if (z10) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z10) {
                    Bitmap bitmap = (Bitmap) this.f1161b;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f1162c = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.f1162c = ((String) this.f1161b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f1162c = (byte[]) this.f1161b;
                return;
            case 4:
            case 6:
                this.f1162c = this.f1161b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
        this.f1163d = (Parcelable) this.f1161b;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0009. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0050  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.os.Bundle m1143x() {
        /*
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            int r1 = r3.f1160a
            java.lang.String r2 = "obj"
            switch(r1) {
                case -1: goto L29;
                case 0: goto Lc;
                case 1: goto L24;
                case 2: goto L1c;
                case 3: goto L14;
                case 4: goto L1c;
                case 5: goto L24;
                case 6: goto L1c;
                default: goto Lc;
            }
        Lc:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Invalid icon"
            r0.<init>(r1)
            throw r0
        L14:
            java.lang.Object r1 = r3.f1161b
            byte[] r1 = (byte[]) r1
            r0.putByteArray(r2, r1)
            goto L30
        L1c:
            java.lang.Object r1 = r3.f1161b
            java.lang.String r1 = (java.lang.String) r1
            r0.putString(r2, r1)
            goto L30
        L24:
            java.lang.Object r1 = r3.f1161b
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            goto L2d
        L29:
            java.lang.Object r1 = r3.f1161b
            android.os.Parcelable r1 = (android.os.Parcelable) r1
        L2d:
            r0.putParcelable(r2, r1)
        L30:
            int r1 = r3.f1160a
            java.lang.String r2 = "type"
            r0.putInt(r2, r1)
            int r1 = r3.f1164e
            java.lang.String r2 = "int1"
            r0.putInt(r2, r1)
            int r1 = r3.f1165f
            java.lang.String r2 = "int2"
            r0.putInt(r2, r1)
            java.lang.String r1 = r3.f1169j
            java.lang.String r2 = "string1"
            r0.putString(r2, r1)
            android.content.res.ColorStateList r1 = r3.f1166g
            if (r1 == 0) goto L55
            java.lang.String r2 = "tint_list"
            r0.putParcelable(r2, r1)
        L55:
            android.graphics.PorterDuff$Mode r1 = r3.f1167h
            android.graphics.PorterDuff$Mode r2 = androidx.core.graphics.drawable.IconCompat.f1159k
            if (r1 == r2) goto L64
            java.lang.String r1 = r1.name()
            java.lang.String r2 = "tint_mode"
            r0.putString(r2, r1)
        L64:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.m1143x():android.os.Bundle");
    }

    @Deprecated
    /* renamed from: y */
    public Icon m1144y() {
        return m1145z(null);
    }

    /* renamed from: z */
    public Icon m1145z(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C0245a.m1152g(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }
}
