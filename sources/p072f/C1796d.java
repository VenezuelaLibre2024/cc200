package p072f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.activity.result.C0175f;
import gd.C2235i;
import p072f.AbstractC1793a;
import p115hd.C2510v;
import td.C4747g;
import td.C4753m;

/* renamed from: f.d */
/* loaded from: classes.dex */
public class C1796d extends AbstractC1793a<C0175f, Uri> {

    /* renamed from: a */
    public static final a f6601a = new a(null);

    /* renamed from: f.d$a */
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }

        /* renamed from: a */
        public final ResolveInfo m7255a(Context context) {
            C4753m.m18653f(context, "context");
            return context.getPackageManager().resolveActivity(new Intent("com.google.android.gms.provider.action.PICK_IMAGES"), 1114112);
        }

        /* renamed from: b */
        public final ResolveInfo m7256b(Context context) {
            C4753m.m18653f(context, "context");
            return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
        }

        /* renamed from: c */
        public final String m7257c(f fVar) {
            C4753m.m18653f(fVar, "input");
            if (fVar instanceof c) {
                return "image/*";
            }
            if (fVar instanceof e) {
                return "video/*";
            }
            if (fVar instanceof d) {
                return ((d) fVar).m7261a();
            }
            if (fVar instanceof b) {
                return null;
            }
            throw new C2235i();
        }

        /* renamed from: d */
        public final boolean m7258d(Context context) {
            C4753m.m18653f(context, "context");
            return m7255a(context) != null;
        }

        /* renamed from: e */
        public final boolean m7259e(Context context) {
            C4753m.m18653f(context, "context");
            return m7256b(context) != null;
        }

        @SuppressLint({"ClassVerificationFailure", "NewApi"})
        /* renamed from: f */
        public final boolean m7260f() {
            int i10 = Build.VERSION.SDK_INT;
            return i10 >= 33 || (i10 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2);
        }
    }

    /* renamed from: f.d$b */
    /* loaded from: classes.dex */
    public static final class b implements f {

        /* renamed from: a */
        public static final b f6602a = new b();
    }

    /* renamed from: f.d$c */
    /* loaded from: classes.dex */
    public static final class c implements f {

        /* renamed from: a */
        public static final c f6603a = new c();
    }

    /* renamed from: f.d$d */
    /* loaded from: classes.dex */
    public static final class d implements f {

        /* renamed from: a */
        public final String f6604a;

        /* renamed from: a */
        public final String m7261a() {
            return this.f6604a;
        }
    }

    /* renamed from: f.d$e */
    /* loaded from: classes.dex */
    public static final class e implements f {

        /* renamed from: a */
        public static final e f6605a = new e();
    }

    /* renamed from: f.d$f */
    /* loaded from: classes.dex */
    public interface f {
    }

    @Override // p072f.AbstractC1793a
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent mo1750a(Context context, C0175f c0175f) {
        ActivityInfo activityInfo;
        Intent intent;
        C4753m.m18653f(context, "context");
        C4753m.m18653f(c0175f, "input");
        a aVar = f6601a;
        if (aVar.m7260f()) {
            Intent intent2 = new Intent("android.provider.action.PICK_IMAGES");
            intent2.setType(aVar.m7257c(c0175f.m638a()));
            return intent2;
        }
        if (aVar.m7259e(context)) {
            ResolveInfo m7256b = aVar.m7256b(context);
            if (m7256b == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            activityInfo = m7256b.activityInfo;
            intent = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        } else {
            if (!aVar.m7258d(context)) {
                Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent3.setType(aVar.m7257c(c0175f.m638a()));
                if (intent3.getType() != null) {
                    return intent3;
                }
                intent3.setType("*/*");
                intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                return intent3;
            }
            ResolveInfo m7255a = aVar.m7255a(context);
            if (m7255a == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            activityInfo = m7255a.activityInfo;
            intent = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
        }
        intent.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent.setType(aVar.m7257c(c0175f.m638a()));
        return intent;
    }

    @Override // p072f.AbstractC1793a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final AbstractC1793a.a<Uri> mo7245b(Context context, C0175f c0175f) {
        C4753m.m18653f(context, "context");
        C4753m.m18653f(c0175f, "input");
        return null;
    }

    @Override // p072f.AbstractC1793a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Uri mo1751c(int i10, Intent intent) {
        if (!(i10 == -1)) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        Uri data = intent.getData();
        if (data == null) {
            data = (Uri) C2510v.m10020s(C1794b.f6598a.m7247a(intent));
        }
        return data;
    }
}
