package bd;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.database.Cursor;
import android.provider.ContactsContract;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import java.util.HashMap;

@TargetApi(5)
/* renamed from: bd.d */
/* loaded from: classes2.dex */
public class C0549d {

    /* renamed from: a */
    public String f2471a;

    /* renamed from: b */
    public String f2472b;

    /* renamed from: c */
    public String f2473c;

    /* renamed from: d */
    public String f2474d;

    /* renamed from: e */
    public String f2475e;

    /* renamed from: f */
    public String f2476f;

    /* renamed from: g */
    public int f2477g;

    public C0549d(String str, String str2, String str3, String str4, String str5, String str6, int i10) {
        this.f2471a = str;
        this.f2472b = str2;
        this.f2473c = str3;
        this.f2474d = str4;
        this.f2475e = str5;
        this.f2476f = str6;
        this.f2477g = i10;
    }

    /* renamed from: a */
    public static C0549d m2740a(HashMap<String, String> hashMap) {
        String str = hashMap.get("label");
        String str2 = hashMap.get("street");
        String str3 = hashMap.get("city");
        String str4 = hashMap.get("postcode");
        String str5 = hashMap.get("region");
        String str6 = hashMap.get("country");
        String str7 = hashMap.get(ImagePickerCache.MAP_KEY_TYPE);
        return new C0549d(str, str2, str3, str4, str5, str6, str7 != null ? Integer.parseInt(str7) : -1);
    }

    /* renamed from: b */
    public static String m2741b(Resources resources, int i10, Cursor cursor, boolean z10) {
        if (z10) {
            return ContactsContract.CommonDataKinds.StructuredPostal.getTypeLabel(resources, i10, "").toString().toLowerCase();
        }
        int i11 = cursor.getInt(cursor.getColumnIndex("data2"));
        if (i11 != 0) {
            return i11 != 1 ? i11 != 2 ? "other" : "work" : "home";
        }
        String string = cursor.getString(cursor.getColumnIndex("data3"));
        return string != null ? string : "";
    }

    /* renamed from: c */
    public HashMap<String, String> m2742c() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("label", this.f2471a);
        hashMap.put("street", this.f2472b);
        hashMap.put("city", this.f2473c);
        hashMap.put("postcode", this.f2474d);
        hashMap.put("region", this.f2475e);
        hashMap.put("country", this.f2476f);
        hashMap.put(ImagePickerCache.MAP_KEY_TYPE, String.valueOf(this.f2477g));
        return hashMap;
    }
}
