package p072f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.activity.result.C0175f;
import java.util.List;
import p072f.AbstractC1793a;
import p072f.C1796d;
import p079f6.C1841a;
import p115hd.C2502n;
import td.C4747g;
import td.C4753m;

/* renamed from: f.c */
/* loaded from: classes.dex */
public class C1795c extends AbstractC1793a<C0175f, List<Uri>> {

    /* renamed from: b */
    public static final a f6599b = new a(null);

    /* renamed from: a */
    public final int f6600a;

    /* renamed from: f.c$a */
    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C4747g c4747g) {
            this();
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        /* renamed from: a */
        public final int m7251a() {
            return C1796d.f6601a.m7260f() ? MediaStore.getPickImagesMaxLimit() : C1841a.e.API_PRIORITY_OTHER;
        }
    }

    public C1795c() {
        this(0, 1, null);
    }

    public C1795c(int i10) {
        this.f6600a = i10;
        if (!(i10 > 1)) {
            throw new IllegalArgumentException("Max items must be higher than 1".toString());
        }
    }

    public /* synthetic */ C1795c(int i10, int i11, C4747g c4747g) {
        this((i11 & 1) != 0 ? f6599b.m7251a() : i10);
    }

    @Override // p072f.AbstractC1793a
    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent mo1750a(Context context, C0175f c0175f) {
        C4753m.m18653f(context, "context");
        C4753m.m18653f(c0175f, "input");
        C1796d.a aVar = C1796d.f6601a;
        if (aVar.m7260f()) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(aVar.m7257c(c0175f.m638a()));
            if (!(this.f6600a <= MediaStore.getPickImagesMaxLimit())) {
                throw new IllegalArgumentException("Max items must be less or equals MediaStore.getPickImagesMaxLimit()".toString());
            }
            intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", this.f6600a);
            return intent;
        }
        if (aVar.m7259e(context)) {
            ResolveInfo m7256b = aVar.m7256b(context);
            if (m7256b == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            ActivityInfo activityInfo = m7256b.activityInfo;
            Intent intent2 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
            intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent2.setType(aVar.m7257c(c0175f.m638a()));
            intent2.putExtra("com.google.android.gms.provider.extra.PICK_IMAGES_MAX", this.f6600a);
            return intent2;
        }
        if (aVar.m7258d(context)) {
            ResolveInfo m7255a = aVar.m7255a(context);
            if (m7255a == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            ActivityInfo activityInfo2 = m7255a.activityInfo;
            Intent intent3 = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
            intent3.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
            intent3.putExtra("com.google.android.gms.provider.extra.PICK_IMAGES_MAX", this.f6600a);
            return intent3;
        }
        Intent intent4 = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent4.setType(aVar.m7257c(c0175f.m638a()));
        intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        if (intent4.getType() != null) {
            return intent4;
        }
        intent4.setType("*/*");
        intent4.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
        return intent4;
    }

    @Override // p072f.AbstractC1793a
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final AbstractC1793a.a<List<Uri>> mo7245b(Context context, C0175f c0175f) {
        C4753m.m18653f(context, "context");
        C4753m.m18653f(c0175f, "input");
        return null;
    }

    @Override // p072f.AbstractC1793a
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final List<Uri> mo1751c(int i10, Intent intent) {
        List<Uri> m7247a;
        if (!(i10 == -1)) {
            intent = null;
        }
        return (intent == null || (m7247a = C1794b.f6598a.m7247a(intent)) == null) ? C2502n.m9989e() : m7247a;
    }
}
