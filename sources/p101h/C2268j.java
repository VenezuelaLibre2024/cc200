package p101h;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: h.j */
/* loaded from: classes.dex */
public class C2268j {

    /* renamed from: a */
    public static Field f9036a;

    /* renamed from: b */
    public static boolean f9037b;

    /* renamed from: c */
    public static Class<?> f9038c;

    /* renamed from: d */
    public static boolean f9039d;

    /* renamed from: e */
    public static Field f9040e;

    /* renamed from: f */
    public static boolean f9041f;

    /* renamed from: g */
    public static Field f9042g;

    /* renamed from: h */
    public static boolean f9043h;

    /* renamed from: h.j$a */
    /* loaded from: classes.dex */
    public static class a {
        /* renamed from: a */
        public static void m9186a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    /* renamed from: a */
    public static void m9181a(Resources resources) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return;
        }
        if (i10 >= 24) {
            m9184d(resources);
        } else if (i10 >= 23) {
            m9183c(resources);
        } else if (i10 >= 21) {
            m9182b(resources);
        }
    }

    /* renamed from: b */
    public static void m9182b(Resources resources) {
        if (!f9037b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f9036a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e10);
            }
            f9037b = true;
        }
        Field field = f9036a;
        if (field != null) {
            Map map = null;
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e11);
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* renamed from: c */
    public static void m9183c(Resources resources) {
        if (!f9037b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f9036a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e10);
            }
            f9037b = true;
        }
        Object obj = null;
        Field field = f9036a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e11);
            }
        }
        if (obj == null) {
            return;
        }
        m9185e(obj);
    }

    /* renamed from: d */
    public static void m9184d(Resources resources) {
        Object obj;
        if (!f9043h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f9042g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e10);
            }
            f9043h = true;
        }
        Field field = f9042g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e11) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e11);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f9037b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f9036a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e12) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
            }
            f9037b = true;
        }
        Field field2 = f9036a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e13) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
            }
        }
        if (obj2 != null) {
            m9185e(obj2);
        }
    }

    /* renamed from: e */
    public static void m9185e(Object obj) {
        if (!f9039d) {
            try {
                f9038c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            f9039d = true;
        }
        Class<?> cls = f9038c;
        if (cls == null) {
            return;
        }
        if (!f9041f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f9040e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
            }
            f9041f = true;
        }
        Field field = f9040e;
        if (field == null) {
            return;
        }
        LongSparseArray longSparseArray = null;
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e12) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
        }
        if (longSparseArray != null) {
            a.m9186a(longSparseArray);
        }
    }
}
