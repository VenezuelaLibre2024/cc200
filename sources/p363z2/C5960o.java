package p363z2;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.pichillilorenzo.flutter_inappwebview.C1417R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import p329x.C5484b;

/* renamed from: z2.o */
/* loaded from: classes.dex */
public class C5960o {
    /* renamed from: a */
    public static String m23864a(Context context, String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 && m23868e(context, null, str)) {
            return str;
        }
        if (i10 >= 29) {
            if (m23868e(context, null, "android.permission.ACCESS_FINE_LOCATION")) {
                return "android.permission.ACCESS_FINE_LOCATION";
            }
            return null;
        }
        if (m23868e(context, null, "android.permission.ACCESS_FINE_LOCATION")) {
            return "android.permission.ACCESS_FINE_LOCATION";
        }
        if (m23868e(context, null, "android.permission.ACCESS_COARSE_LOCATION")) {
            return "android.permission.ACCESS_COARSE_LOCATION";
        }
        return null;
    }

    /* renamed from: b */
    public static int m23865b(Activity activity, String str) {
        if (activity == null || Build.VERSION.SDK_INT < 23) {
            return 0;
        }
        boolean m23875l = m23875l(activity, str);
        boolean z10 = true;
        boolean z11 = !m23869f(activity, str);
        if (!m23875l) {
            z10 = z11;
        } else if (z11) {
            z10 = false;
        }
        if (!m23875l && z10) {
            m23871h(activity, str);
        }
        return (m23875l && z10) ? 4 : 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x017f, code lost:
    
        if (m23868e(r7, r0, "android.permission.BODY_SENSORS") != false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x018d, code lost:
    
        if (m23868e(r7, r0, "android.permission.READ_MEDIA_IMAGES") != false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        if (m23868e(r7, r0, "android.permission.SCHEDULE_EXACT_ALARM") != false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0204, code lost:
    
        if (m23868e(r7, r0, "android.permission.RECORD_AUDIO") != false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x025c, code lost:
    
        r0.add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x025a, code lost:
    
        if (m23868e(r7, r0, "android.permission.CAMERA") != false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x026f, code lost:
    
        if (m23868e(r7, r0, "android.permission.READ_CALENDAR") != false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        if (r7 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
    
        if (r7 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008f, code lost:
    
        if (r7 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b6, code lost:
    
        if (m23868e(r7, r0, "android.permission.SYSTEM_ALERT_WINDOW") != false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d1, code lost:
    
        if (m23868e(r7, r0, "android.permission.BLUETOOTH") != false) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0112, code lost:
    
        if (m23868e(r7, r0, "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS") != false) goto L182;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0010. Please report as an issue. */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<java.lang.String> m23866c(android.content.Context r7, int r8) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p363z2.C5960o.m23866c(android.content.Context, int):java.util.List");
    }

    /* renamed from: d */
    public static PackageInfo m23867d(Context context) {
        PackageManager packageManager = context.getPackageManager();
        int i10 = Build.VERSION.SDK_INT;
        String packageName = context.getPackageName();
        return i10 >= 33 ? packageManager.getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(4096L)) : packageManager.getPackageInfo(packageName, 4096);
    }

    /* renamed from: e */
    public static boolean m23868e(Context context, ArrayList<String> arrayList, String str) {
        if (arrayList != null) {
            try {
                Iterator<String> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next().equals(str)) {
                        return true;
                    }
                }
            } catch (Exception e10) {
                Log.d("permissions_handler", "Unable to check manifest for permission: ", e10);
            }
        }
        if (context == null) {
            Log.d("permissions_handler", "Unable to detect current Activity or App Context.");
            return false;
        }
        PackageInfo m23867d = m23867d(context);
        if (m23867d == null) {
            Log.d("permissions_handler", "Unable to get Package info, will not be able to determine permissions to request.");
            return false;
        }
        Iterator it2 = new ArrayList(Arrays.asList(m23867d.requestedPermissions)).iterator();
        while (it2.hasNext()) {
            if (((String) it2.next()).equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m23869f(Activity activity, String str) {
        return !C5484b.m21748j(activity, str);
    }

    /* renamed from: g */
    public static int m23870g(String str) {
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2062386608:
                if (str.equals("android.permission.READ_SMS")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1928411001:
                if (str.equals("android.permission.READ_CALENDAR")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1925850455:
                if (str.equals("android.permission.POST_NOTIFICATIONS")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1921431796:
                if (str.equals("android.permission.READ_CALL_LOG")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1888586689:
                if (str.equals("android.permission.ACCESS_FINE_LOCATION")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1813079487:
                if (str.equals("android.permission.MANAGE_EXTERNAL_STORAGE")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1783097621:
                if (str.equals("android.permission.ACCESS_NOTIFICATION_POLICY")) {
                    c10 = 6;
                    break;
                }
                break;
            case -1561629405:
                if (str.equals("android.permission.SYSTEM_ALERT_WINDOW")) {
                    c10 = 7;
                    break;
                }
                break;
            case -1479758289:
                if (str.equals("android.permission.RECEIVE_WAP_PUSH")) {
                    c10 = '\b';
                    break;
                }
                break;
            case -1238066820:
                if (str.equals("android.permission.BODY_SENSORS")) {
                    c10 = '\t';
                    break;
                }
                break;
            case -1164582768:
                if (str.equals("android.permission.READ_PHONE_NUMBERS")) {
                    c10 = '\n';
                    break;
                }
                break;
            case -909527021:
                if (str.equals("android.permission.NEARBY_WIFI_DEVICES")) {
                    c10 = 11;
                    break;
                }
                break;
            case -895679497:
                if (str.equals("android.permission.RECEIVE_MMS")) {
                    c10 = '\f';
                    break;
                }
                break;
            case -895673731:
                if (str.equals("android.permission.RECEIVE_SMS")) {
                    c10 = '\r';
                    break;
                }
                break;
            case -798669607:
                if (str.equals("android.permission.BLUETOOTH_CONNECT")) {
                    c10 = 14;
                    break;
                }
                break;
            case -406040016:
                if (str.equals("android.permission.READ_EXTERNAL_STORAGE")) {
                    c10 = 15;
                    break;
                }
                break;
            case -63024214:
                if (str.equals("android.permission.ACCESS_COARSE_LOCATION")) {
                    c10 = 16;
                    break;
                }
                break;
            case -5573545:
                if (str.equals("android.permission.READ_PHONE_STATE")) {
                    c10 = 17;
                    break;
                }
                break;
            case 52602690:
                if (str.equals("android.permission.SEND_SMS")) {
                    c10 = 18;
                    break;
                }
                break;
            case 112197485:
                if (str.equals("android.permission.CALL_PHONE")) {
                    c10 = 19;
                    break;
                }
                break;
            case 175802396:
                if (str.equals("android.permission.READ_MEDIA_IMAGES")) {
                    c10 = 20;
                    break;
                }
                break;
            case 214526995:
                if (str.equals("android.permission.WRITE_CONTACTS")) {
                    c10 = 21;
                    break;
                }
                break;
            case 361658321:
                if (str.equals("android.permission.BODY_SENSORS_BACKGROUND")) {
                    c10 = 22;
                    break;
                }
                break;
            case 463403621:
                if (str.equals("android.permission.CAMERA")) {
                    c10 = 23;
                    break;
                }
                break;
            case 603653886:
                if (str.equals("android.permission.WRITE_CALENDAR")) {
                    c10 = 24;
                    break;
                }
                break;
            case 610633091:
                if (str.equals("android.permission.WRITE_CALL_LOG")) {
                    c10 = 25;
                    break;
                }
                break;
            case 691260818:
                if (str.equals("android.permission.READ_MEDIA_AUDIO")) {
                    c10 = 26;
                    break;
                }
                break;
            case 710297143:
                if (str.equals("android.permission.READ_MEDIA_VIDEO")) {
                    c10 = 27;
                    break;
                }
                break;
            case 784519842:
                if (str.equals("android.permission.USE_SIP")) {
                    c10 = 28;
                    break;
                }
                break;
            case 970694249:
                if (str.equals("android.permission.SCHEDULE_EXACT_ALARM")) {
                    c10 = 29;
                    break;
                }
                break;
            case 1166454870:
                if (str.equals("android.permission.BLUETOOTH_ADVERTISE")) {
                    c10 = 30;
                    break;
                }
                break;
            case 1271781903:
                if (str.equals("android.permission.GET_ACCOUNTS")) {
                    c10 = 31;
                    break;
                }
                break;
            case 1365911975:
                if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    c10 = ' ';
                    break;
                }
                break;
            case 1777263169:
                if (str.equals("android.permission.REQUEST_INSTALL_PACKAGES")) {
                    c10 = '!';
                    break;
                }
                break;
            case 1780337063:
                if (str.equals("android.permission.ACTIVITY_RECOGNITION")) {
                    c10 = '\"';
                    break;
                }
                break;
            case 1831139720:
                if (str.equals("android.permission.RECORD_AUDIO")) {
                    c10 = '#';
                    break;
                }
                break;
            case 1977429404:
                if (str.equals("android.permission.READ_CONTACTS")) {
                    c10 = '$';
                    break;
                }
                break;
            case 2024715147:
                if (str.equals("android.permission.ACCESS_BACKGROUND_LOCATION")) {
                    c10 = '%';
                    break;
                }
                break;
            case 2062356686:
                if (str.equals("android.permission.BLUETOOTH_SCAN")) {
                    c10 = '&';
                    break;
                }
                break;
            case 2114579147:
                if (str.equals("android.permission.ACCESS_MEDIA_LOCATION")) {
                    c10 = '\'';
                    break;
                }
                break;
            case 2133799037:
                if (str.equals("com.android.voicemail.permission.ADD_VOICEMAIL")) {
                    c10 = '(';
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
            case '\b':
            case '\f':
            case '\r':
            case 18:
                return 13;
            case 1:
            case 24:
                return 0;
            case 2:
                return 17;
            case 3:
            case '\n':
            case 17:
            case 19:
            case 25:
            case 28:
            case '(':
                return 8;
            case 4:
            case 16:
                return 3;
            case 5:
                return 22;
            case 6:
                return 27;
            case 7:
                return 23;
            case '\t':
                return 12;
            case 11:
                return 31;
            case 14:
                return 30;
            case 15:
            case C1417R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                return 15;
            case 20:
                return 9;
            case 21:
            case C1417R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
            case C1417R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                return 2;
            case 22:
                return 35;
            case 23:
                return 1;
            case 26:
                return 33;
            case 27:
                return 32;
            case 29:
                return 34;
            case C1417R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return 29;
            case C1417R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return 24;
            case C1417R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                return 19;
            case C1417R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                return 7;
            case C1417R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                return 4;
            case C1417R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                return 28;
            case C1417R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                return 18;
            default:
                return 20;
        }
    }

    /* renamed from: h */
    public static void m23871h(Context context, String str) {
        context.getSharedPreferences(str, 0).edit().putBoolean("sp_permission_handler_permission_was_denied_before", true).apply();
    }

    /* renamed from: i */
    public static Integer m23872i(Integer num, Integer num2) {
        HashSet hashSet = new HashSet();
        hashSet.add(num);
        hashSet.add(num2);
        return m23873j(hashSet);
    }

    /* renamed from: j */
    public static Integer m23873j(Collection<Integer> collection) {
        if (collection.contains(4)) {
            return 4;
        }
        if (collection.contains(2)) {
            return 2;
        }
        if (collection.contains(0)) {
            return 0;
        }
        return collection.contains(3) ? 3 : 1;
    }

    /* renamed from: k */
    public static int m23874k(Activity activity, String str, int i10) {
        if (i10 == -1) {
            return m23865b(activity, str);
        }
        return 1;
    }

    /* renamed from: l */
    public static boolean m23875l(Context context, String str) {
        return context.getSharedPreferences(str, 0).getBoolean("sp_permission_handler_permission_was_denied_before", false);
    }
}
