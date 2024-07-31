package p329x;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p329x.C5494l;

/* renamed from: x.n */
/* loaded from: classes.dex */
public class C5496n {

    /* renamed from: b */
    public static Field f20542b;

    /* renamed from: c */
    public static boolean f20543c;

    /* renamed from: a */
    public static final Object f20541a = new Object();

    /* renamed from: d */
    public static final Object f20544d = new Object();

    /* renamed from: a */
    public static SparseArray<Bundle> m22061a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            Bundle bundle = list.get(i10);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i10, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: b */
    public static Bundle m22062b(C5494l.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat m21818f = aVar.m21818f();
        bundle.putInt("icon", m21818f != null ? m21818f.m1134n() : 0);
        bundle.putCharSequence("title", aVar.m21822j());
        bundle.putParcelable("actionIntent", aVar.m21813a());
        Bundle bundle2 = aVar.m21816d() != null ? new Bundle(aVar.m21816d()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.m21814b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", m22065e(aVar.m21819g()));
        bundle.putBoolean("showsUserInterface", aVar.m21821i());
        bundle.putInt("semanticAction", aVar.m21820h());
        return bundle;
    }

    /* renamed from: c */
    public static Bundle m22063c(Notification notification) {
        String str;
        String str2;
        synchronized (f20541a) {
            if (f20543c) {
                return null;
            }
            try {
                if (f20542b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f20543c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f20542b = declaredField;
                }
                Bundle bundle = (Bundle) f20542b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f20542b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e10) {
                e = e10;
                str = "NotificationCompat";
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                f20543c = true;
                return null;
            } catch (NoSuchFieldException e11) {
                e = e11;
                str = "NotificationCompat";
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                f20543c = true;
                return null;
            }
        }
    }

    /* renamed from: d */
    public static Bundle m22064d(C5502t c5502t) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", c5502t.m22134j());
        bundle.putCharSequence("label", c5502t.m22133i());
        bundle.putCharSequenceArray("choices", c5502t.m22130e());
        bundle.putBoolean("allowFreeFormInput", c5502t.m22128c());
        bundle.putBundle("extras", c5502t.m22132h());
        Set<String> m22129d = c5502t.m22129d();
        if (m22129d != null && !m22129d.isEmpty()) {
            ArrayList<String> arrayList = new ArrayList<>(m22129d.size());
            Iterator<String> it = m22129d.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    /* renamed from: e */
    public static Bundle[] m22065e(C5502t[] c5502tArr) {
        if (c5502tArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[c5502tArr.length];
        for (int i10 = 0; i10 < c5502tArr.length; i10++) {
            bundleArr[i10] = m22064d(c5502tArr[i10]);
        }
        return bundleArr;
    }

    /* renamed from: f */
    public static Bundle m22066f(Notification.Builder builder, C5494l.a aVar) {
        IconCompat m21818f = aVar.m21818f();
        builder.addAction(m21818f != null ? m21818f.m1134n() : 0, aVar.m21822j(), aVar.m21813a());
        Bundle bundle = new Bundle(aVar.m21816d());
        if (aVar.m21819g() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", m22065e(aVar.m21819g()));
        }
        if (aVar.m21815c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", m22065e(aVar.m21815c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.m21814b());
        return bundle;
    }
}
