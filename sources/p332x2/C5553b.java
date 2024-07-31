package p332x2;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import io.flutter.plugin.common.PluginRegistry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p303v2.C5103c;
import p303v2.EnumC5102b;
import p303v2.InterfaceC5101a;
import p329x.C5484b;
import p345y.C5782a;

/* renamed from: x2.b */
/* loaded from: classes.dex */
public class C5553b implements PluginRegistry.RequestPermissionsResultListener {

    /* renamed from: h */
    public Activity f20824h;

    /* renamed from: i */
    public InterfaceC5101a f20825i;

    /* renamed from: j */
    public InterfaceC5554c f20826j;

    /* renamed from: b */
    public static List<String> m22359b(Context context) {
        boolean m22366b = C5555d.m22366b(context, "android.permission.ACCESS_FINE_LOCATION");
        boolean m22366b2 = C5555d.m22366b(context, "android.permission.ACCESS_COARSE_LOCATION");
        if (!m22366b && !m22366b2) {
            throw new C5103c();
        }
        ArrayList arrayList = new ArrayList();
        if (m22366b) {
            arrayList.add("android.permission.ACCESS_FINE_LOCATION");
        }
        if (m22366b2) {
            arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
        }
        return arrayList;
    }

    /* renamed from: e */
    public static <T> int m22360e(T[] tArr, T t10) {
        return Arrays.asList(tArr).indexOf(t10);
    }

    /* renamed from: a */
    public EnumC5552a m22361a(Context context) {
        char c10;
        List<String> m22359b = m22359b(context);
        if (Build.VERSION.SDK_INT < 23) {
            return EnumC5552a.always;
        }
        Iterator<String> it = m22359b.iterator();
        while (true) {
            if (!it.hasNext()) {
                c10 = 65535;
                break;
            }
            if (C5782a.checkSelfPermission(context, it.next()) == 0) {
                c10 = 0;
                break;
            }
        }
        if (c10 == 65535) {
            return EnumC5552a.denied;
        }
        if (Build.VERSION.SDK_INT < 29) {
            return EnumC5552a.always;
        }
        if (C5555d.m22366b(context, "android.permission.ACCESS_BACKGROUND_LOCATION") && C5782a.checkSelfPermission(context, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0) {
            return EnumC5552a.always;
        }
        return EnumC5552a.whileInUse;
    }

    /* renamed from: c */
    public final boolean m22362c(String[] strArr, int[] iArr) {
        int m22360e = m22360e(strArr, "android.permission.ACCESS_BACKGROUND_LOCATION");
        return m22360e >= 0 && iArr[m22360e] == 0;
    }

    /* renamed from: d */
    public boolean m22363d(Context context) {
        EnumC5552a m22361a = m22361a(context);
        return m22361a == EnumC5552a.whileInUse || m22361a == EnumC5552a.always;
    }

    /* renamed from: f */
    public void m22364f(Activity activity, InterfaceC5554c interfaceC5554c, InterfaceC5101a interfaceC5101a) {
        if (activity == null) {
            interfaceC5101a.mo18816a(EnumC5102b.activityMissing);
            return;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 23) {
            interfaceC5554c.mo18822a(EnumC5552a.always);
            return;
        }
        List<String> m22359b = m22359b(activity);
        if (i10 >= 29 && C5555d.m22366b(activity, "android.permission.ACCESS_BACKGROUND_LOCATION") && m22361a(activity) == EnumC5552a.whileInUse) {
            m22359b.add("android.permission.ACCESS_BACKGROUND_LOCATION");
        }
        this.f20825i = interfaceC5101a;
        this.f20826j = interfaceC5554c;
        this.f20824h = activity;
        C5484b.m21745g(activity, (String[]) m22359b.toArray(new String[0]), C1417R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (i10 != 109) {
            return false;
        }
        Activity activity = this.f20824h;
        if (activity == null) {
            Log.e("Geolocator", "Trying to process permission result without an valid Activity instance");
            InterfaceC5101a interfaceC5101a = this.f20825i;
            if (interfaceC5101a != null) {
                interfaceC5101a.mo18816a(EnumC5102b.activityMissing);
            }
            return false;
        }
        try {
            List<String> m22359b = m22359b(activity);
            if (iArr.length == 0) {
                Log.i("Geolocator", "The grantResults array is empty. This can happen when the user cancels the permission request");
                return false;
            }
            EnumC5552a enumC5552a = EnumC5552a.denied;
            char c10 = 65535;
            boolean z10 = false;
            boolean z11 = false;
            for (String str : m22359b) {
                int m22360e = m22360e(strArr, str);
                if (m22360e >= 0) {
                    z10 = true;
                }
                if (iArr[m22360e] == 0) {
                    c10 = 0;
                }
                if (C5484b.m21748j(this.f20824h, str)) {
                    z11 = true;
                }
            }
            if (!z10) {
                Log.w("Geolocator", "Location permissions not part of permissions send to onRequestPermissionsResult method.");
                return false;
            }
            if (c10 == 0) {
                enumC5552a = (Build.VERSION.SDK_INT < 29 || m22362c(strArr, iArr)) ? EnumC5552a.always : EnumC5552a.whileInUse;
            } else if (!z11) {
                enumC5552a = EnumC5552a.deniedForever;
            }
            InterfaceC5554c interfaceC5554c = this.f20826j;
            if (interfaceC5554c != null) {
                interfaceC5554c.mo18822a(enumC5552a);
            }
            return true;
        } catch (C5103c unused) {
            InterfaceC5101a interfaceC5101a2 = this.f20825i;
            if (interfaceC5101a2 != null) {
                interfaceC5101a2.mo18816a(EnumC5102b.permissionDefinitionsNotFound);
            }
            return false;
        }
    }
}
