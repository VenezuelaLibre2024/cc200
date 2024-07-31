package bd;

import android.content.res.Resources;
import android.database.Cursor;
import android.provider.ContactsContract;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import java.util.HashMap;

/* renamed from: bd.c */
/* loaded from: classes2.dex */
public class C0548c {

    /* renamed from: a */
    public String f2468a;

    /* renamed from: b */
    public String f2469b;

    /* renamed from: c */
    public int f2470c;

    public C0548c(String str, String str2, int i10) {
        this.f2468a = str;
        this.f2469b = str2;
        this.f2470c = i10;
    }

    /* renamed from: a */
    public static C0548c m2736a(HashMap<String, String> hashMap) {
        String str = hashMap.get("label");
        String str2 = hashMap.get("value");
        String str3 = hashMap.get(ImagePickerCache.MAP_KEY_TYPE);
        return new C0548c(str, str2, str3 != null ? Integer.parseInt(str3) : -1);
    }

    /* renamed from: b */
    public static String m2737b(Resources resources, int i10, Cursor cursor, boolean z10) {
        String string;
        if (z10) {
            string = ContactsContract.CommonDataKinds.Email.getTypeLabel(resources, i10, "").toString();
        } else {
            if (i10 != 0) {
                return i10 != 1 ? i10 != 2 ? i10 != 4 ? "other" : "mobile" : "work" : "home";
            }
            if (cursor.getString(cursor.getColumnIndex("data3")) == null) {
                return "";
            }
            string = cursor.getString(cursor.getColumnIndex("data3"));
        }
        return string.toLowerCase();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0019. Please report as an issue. */
    /* renamed from: c */
    public static String m2738c(Resources resources, int i10, Cursor cursor, boolean z10) {
        String string;
        if (z10) {
            string = ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources, i10, "").toString();
        } else {
            if (i10 == 10) {
                return "company";
            }
            if (i10 == 12) {
                return FlutterActivityLaunchConfigs.DEFAULT_DART_ENTRYPOINT;
            }
            switch (i10) {
                case 0:
                    if (cursor.getString(cursor.getColumnIndex("data3")) == null) {
                        return "";
                    }
                    string = cursor.getString(cursor.getColumnIndex("data3"));
                    break;
                case 1:
                    return "home";
                case 2:
                    return "mobile";
                case 3:
                    return "work";
                case 4:
                    return "fax work";
                case 5:
                    return "fax home";
                case 6:
                    return "pager";
                default:
                    return "other";
            }
        }
        return string.toLowerCase();
    }

    /* renamed from: d */
    public HashMap<String, String> m2739d() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("label", this.f2468a);
        hashMap.put("value", this.f2469b);
        hashMap.put(ImagePickerCache.MAP_KEY_TYPE, String.valueOf(this.f2470c));
        return hashMap;
    }
}
