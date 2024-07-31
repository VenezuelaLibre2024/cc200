package p363z2;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p329x.C5484b;
import p329x.C5497o;
import p345y.C5782a;

/* renamed from: z2.n */
/* loaded from: classes.dex */
public final class C5959n implements PluginRegistry.ActivityResultListener, PluginRegistry.RequestPermissionsResultListener {

    /* renamed from: h */
    public final Context f22124h;

    /* renamed from: i */
    public b f22125i;

    /* renamed from: j */
    public Activity f22126j;

    /* renamed from: k */
    public int f22127k;

    /* renamed from: l */
    public Map<Integer, Integer> f22128l;

    @FunctionalInterface
    /* renamed from: z2.n$a */
    /* loaded from: classes.dex */
    public interface a {
        void onSuccess(int i10);
    }

    @FunctionalInterface
    /* renamed from: z2.n$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo23839a(Map<Integer, Integer> map);
    }

    @FunctionalInterface
    /* renamed from: z2.n$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        void mo23840a(boolean z10);
    }

    public C5959n(Context context) {
        this.f22124h = context;
    }

    /* renamed from: a */
    public final int m23855a() {
        List<String> m23866c = C5960o.m23866c(this.f22124h, 21);
        if (!(m23866c == null || m23866c.isEmpty())) {
            return 1;
        }
        Log.d("permissions_handler", "Bluetooth permission missing in manifest");
        return 0;
    }

    /* renamed from: b */
    public final int m23856b() {
        if (Build.VERSION.SDK_INT < 33) {
            return C5497o.m22067f(this.f22124h).m22070a() ? 1 : 0;
        }
        if (this.f22124h.checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
            return 1;
        }
        return C5960o.m23865b(this.f22126j, "android.permission.POST_NOTIFICATIONS");
    }

    /* renamed from: c */
    public void m23857c(int i10, a aVar) {
        aVar.onSuccess(m23858d(i10));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d */
    public final int m23858d(int i10) {
        int i11;
        int i12;
        if (i10 == 17) {
            return m23856b();
        }
        if (i10 == 21) {
            return m23855a();
        }
        if ((i10 == 30 || i10 == 28 || i10 == 29) && Build.VERSION.SDK_INT < 31) {
            return m23855a();
        }
        if ((i10 == 37 || i10 == 0) && !m23859e()) {
            return 0;
        }
        List<String> m23866c = C5960o.m23866c(this.f22124h, i10);
        if (m23866c == null) {
            Log.d("permissions_handler", "No android specific permissions needed for: " + i10);
            return 1;
        }
        if (m23866c.size() == 0) {
            Log.d("permissions_handler", "No permissions found in manifest for: " + m23866c + i10);
            if (i10 == 16 && Build.VERSION.SDK_INT < 23) {
                return 2;
            }
            if (i10 != 22 || Build.VERSION.SDK_INT >= 30) {
                return Build.VERSION.SDK_INT < 23 ? 1 : 0;
            }
            return 2;
        }
        if (this.f22124h.getApplicationInfo().targetSdkVersion >= 23) {
            HashSet hashSet = new HashSet();
            for (String str : m23866c) {
                if (i10 == 16) {
                    String packageName = this.f22124h.getPackageName();
                    PowerManager powerManager = (PowerManager) this.f22124h.getSystemService("power");
                    if (powerManager == null || !powerManager.isIgnoringBatteryOptimizations(packageName)) {
                        i11 = 0;
                        hashSet.add(i11);
                    }
                    i11 = 1;
                    hashSet.add(i11);
                } else {
                    if (i10 == 22) {
                        if (Build.VERSION.SDK_INT < 30) {
                            hashSet.add(2);
                        }
                        i12 = Environment.isExternalStorageManager();
                    } else if (i10 == 23) {
                        i12 = Settings.canDrawOverlays(this.f22124h);
                    } else {
                        if (i10 == 24) {
                            if (Build.VERSION.SDK_INT >= 26) {
                                i12 = this.f22124h.getPackageManager().canRequestPackageInstalls();
                            }
                        } else if (i10 == 27) {
                            i12 = ((NotificationManager) this.f22124h.getSystemService(FlutterFirebaseMessagingUtils.EXTRA_REMOTE_MESSAGE)).isNotificationPolicyAccessGranted();
                        } else if (i10 == 34) {
                            if (Build.VERSION.SDK_INT >= 31) {
                                i12 = ((AlarmManager) this.f22124h.getSystemService("alarm")).canScheduleExactAlarms();
                            }
                            i11 = 1;
                        } else if (C5782a.checkSelfPermission(this.f22124h, str) != 0) {
                            i12 = C5960o.m23865b(this.f22126j, str);
                        }
                        hashSet.add(i11);
                    }
                    i11 = Integer.valueOf(i12);
                    hashSet.add(i11);
                }
            }
            if (!hashSet.isEmpty()) {
                return C5960o.m23873j(hashSet).intValue();
            }
        }
        return 1;
    }

    /* renamed from: e */
    public final boolean m23859e() {
        List<String> m23866c = C5960o.m23866c(this.f22124h, 37);
        boolean z10 = m23866c != null && m23866c.contains("android.permission.WRITE_CALENDAR");
        boolean z11 = m23866c != null && m23866c.contains("android.permission.READ_CALENDAR");
        if (z10 && z11) {
            return true;
        }
        if (!z10) {
            Log.d("permissions_handler", "android.permission.WRITE_CALENDAR missing in manifest");
        }
        if (!z11) {
            Log.d("permissions_handler", "android.permission.READ_CALENDAR missing in manifest");
        }
        return false;
    }

    /* renamed from: f */
    public final void m23860f(String str, int i10) {
        if (this.f22126j == null) {
            return;
        }
        Intent intent = new Intent(str);
        if (!str.equals("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS")) {
            intent.setData(Uri.parse("package:" + this.f22126j.getPackageName()));
        }
        this.f22126j.startActivityForResult(intent, i10);
        this.f22127k++;
    }

    /* renamed from: g */
    public void m23861g(List<Integer> list, b bVar, InterfaceC5947b interfaceC5947b) {
        Map<Integer, Integer> map;
        int i10;
        Map<Integer, Integer> map2;
        int i11;
        int i12;
        int i13;
        String str;
        String str2;
        if (this.f22127k > 0) {
            str2 = "A request for permissions is already running, please wait for it to finish before doing another request (note that you can request multiple permissions at the same time).";
        } else {
            if (this.f22126j != null) {
                this.f22125i = bVar;
                this.f22128l = new HashMap();
                this.f22127k = 0;
                ArrayList arrayList = new ArrayList();
                for (Integer num : list) {
                    if (m23858d(num.intValue()) != 1) {
                        List<String> m23866c = C5960o.m23866c(this.f22126j, num.intValue());
                        if (m23866c != null && !m23866c.isEmpty()) {
                            int i14 = Build.VERSION.SDK_INT;
                            if (i14 >= 23 && num.intValue() == 16) {
                                i13 = 209;
                                str = "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS";
                            } else if (i14 >= 30 && num.intValue() == 22) {
                                i13 = 210;
                                str = "android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION";
                            } else if (i14 >= 23 && num.intValue() == 23) {
                                i13 = 211;
                                str = "android.settings.action.MANAGE_OVERLAY_PERMISSION";
                            } else if (i14 >= 26 && num.intValue() == 24) {
                                i13 = 212;
                                str = "android.settings.MANAGE_UNKNOWN_APP_SOURCES";
                            } else if (i14 >= 23 && num.intValue() == 27) {
                                i13 = 213;
                                str = "android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS";
                            } else if (i14 < 31 || num.intValue() != 34) {
                                if (num.intValue() != 37 && num.intValue() != 0) {
                                    arrayList.addAll(m23866c);
                                    i12 = this.f22127k + m23866c.size();
                                } else if (m23859e()) {
                                    arrayList.add("android.permission.WRITE_CALENDAR");
                                    arrayList.add("android.permission.READ_CALENDAR");
                                    i12 = this.f22127k + 2;
                                } else {
                                    map = this.f22128l;
                                    i10 = 0;
                                }
                                this.f22127k = i12;
                            } else {
                                i13 = 214;
                                str = "android.settings.REQUEST_SCHEDULE_EXACT_ALARM";
                            }
                            m23860f(str, i13);
                        } else if (!this.f22128l.containsKey(num)) {
                            if (num.intValue() != 16 || Build.VERSION.SDK_INT >= 23) {
                                map2 = this.f22128l;
                                i11 = 0;
                            } else {
                                map2 = this.f22128l;
                                i11 = 2;
                            }
                            map2.put(num, i11);
                            if (num.intValue() == 22 && Build.VERSION.SDK_INT < 30) {
                                map = this.f22128l;
                                i10 = 2;
                            }
                            map = this.f22128l;
                            i10 = 0;
                        }
                        map.put(num, i10);
                    } else if (!this.f22128l.containsKey(num)) {
                        map = this.f22128l;
                        i10 = 1;
                        map.put(num, i10);
                    }
                }
                if (arrayList.size() > 0) {
                    C5484b.m21745g(this.f22126j, (String[]) arrayList.toArray(new String[0]), 24);
                }
                b bVar2 = this.f22125i;
                if (bVar2 == null || this.f22127k != 0) {
                    return;
                }
                bVar2.mo23839a(this.f22128l);
                return;
            }
            Log.d("permissions_handler", "Unable to detect current Activity.");
            str2 = "Unable to detect current Android Activity.";
        }
        interfaceC5947b.mo23838a("PermissionHandler.PermissionManager", str2);
    }

    /* renamed from: h */
    public void m23862h(Activity activity) {
        this.f22126j = activity;
    }

    /* renamed from: i */
    public void m23863i(int i10, c cVar, InterfaceC5947b interfaceC5947b) {
        Activity activity = this.f22126j;
        if (activity == null) {
            Log.d("permissions_handler", "Unable to detect current Activity.");
            interfaceC5947b.mo23838a("PermissionHandler.PermissionManager", "Unable to detect current Android Activity.");
            return;
        }
        List<String> m23866c = C5960o.m23866c(activity, i10);
        if (m23866c == null) {
            Log.d("permissions_handler", "No android specific permissions needed for: " + i10);
            cVar.mo23840a(false);
            return;
        }
        if (!m23866c.isEmpty()) {
            cVar.mo23840a(C5484b.m21748j(this.f22126j, m23866c.get(0)));
            return;
        }
        Log.d("permissions_handler", "No permissions found in manifest for: " + i10 + " no need to show request rationale");
        cVar.mo23840a(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v9, types: [int] */
    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public boolean onActivityResult(int i10, int i11, Intent intent) {
        ?? canScheduleExactAlarms;
        Activity activity = this.f22126j;
        char c10 = 0;
        c10 = 0;
        if (activity == null) {
            return false;
        }
        int i12 = 23;
        if (i10 == 209) {
            if (Build.VERSION.SDK_INT >= 23) {
                String packageName = this.f22124h.getPackageName();
                PowerManager powerManager = (PowerManager) this.f22124h.getSystemService("power");
                if (powerManager != null && powerManager.isIgnoringBatteryOptimizations(packageName)) {
                    c10 = 1;
                }
            } else {
                c10 = 2;
            }
            i12 = 16;
            canScheduleExactAlarms = c10;
        } else if (i10 == 210) {
            if (Build.VERSION.SDK_INT < 30) {
                return false;
            }
            i12 = 22;
            canScheduleExactAlarms = Environment.isExternalStorageManager();
        } else if (i10 == 211) {
            if (Build.VERSION.SDK_INT < 23) {
                return false;
            }
            canScheduleExactAlarms = Settings.canDrawOverlays(activity);
        } else if (i10 == 212) {
            if (Build.VERSION.SDK_INT < 26) {
                return false;
            }
            i12 = 24;
            canScheduleExactAlarms = activity.getPackageManager().canRequestPackageInstalls();
        } else if (i10 == 213) {
            if (Build.VERSION.SDK_INT < 23) {
                return false;
            }
            i12 = 27;
            canScheduleExactAlarms = ((NotificationManager) activity.getSystemService(FlutterFirebaseMessagingUtils.EXTRA_REMOTE_MESSAGE)).isNotificationPolicyAccessGranted();
        } else {
            if (i10 != 214) {
                return false;
            }
            i12 = 34;
            canScheduleExactAlarms = Build.VERSION.SDK_INT >= 31 ? ((AlarmManager) activity.getSystemService("alarm")).canScheduleExactAlarms() : 1;
        }
        this.f22128l.put(Integer.valueOf(i12), Integer.valueOf((int) canScheduleExactAlarms));
        int i13 = this.f22127k - 1;
        this.f22127k = i13;
        b bVar = this.f22125i;
        if (bVar != null && i13 == 0) {
            bVar.mo23839a(this.f22128l);
        }
        return true;
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        int m23870g;
        Map<Integer, Integer> map;
        int i11;
        Integer valueOf;
        if (i10 != 24) {
            this.f22127k = 0;
            return false;
        }
        if (this.f22128l == null) {
            return false;
        }
        if (strArr.length == 0 && iArr.length == 0) {
            Log.w("permissions_handler", "onRequestPermissionsResult is called without results. This is probably caused by interfering request codes. If you see this error, please file an issue in flutter-permission-handler, including a list of plugins used by this application: https://github.com/Baseflow/flutter-permission-handler/issues");
            return false;
        }
        List asList = Arrays.asList(strArr);
        int indexOf = asList.indexOf("android.permission.WRITE_CALENDAR");
        if (indexOf >= 0) {
            int m23874k = C5960o.m23874k(this.f22126j, "android.permission.WRITE_CALENDAR", iArr[indexOf]);
            this.f22128l.put(36, Integer.valueOf(m23874k));
            int indexOf2 = asList.indexOf("android.permission.READ_CALENDAR");
            if (indexOf2 >= 0) {
                int intValue = C5960o.m23872i(Integer.valueOf(m23874k), Integer.valueOf(C5960o.m23874k(this.f22126j, "android.permission.READ_CALENDAR", iArr[indexOf2]))).intValue();
                this.f22128l.put(37, Integer.valueOf(intValue));
                this.f22128l.put(0, Integer.valueOf(intValue));
            }
        }
        for (int i12 = 0; i12 < strArr.length; i12++) {
            String str = strArr[i12];
            if (!str.equals("android.permission.WRITE_CALENDAR") && !str.equals("android.permission.READ_CALENDAR") && (m23870g = C5960o.m23870g(str)) != 20) {
                int i13 = iArr[i12];
                if (m23870g == 8) {
                    valueOf = C5960o.m23872i(this.f22128l.get(8), Integer.valueOf(C5960o.m23874k(this.f22126j, str, i13)));
                    map = this.f22128l;
                    i11 = 8;
                } else if (m23870g == 7) {
                    if (!this.f22128l.containsKey(7)) {
                        this.f22128l.put(7, Integer.valueOf(C5960o.m23874k(this.f22126j, str, i13)));
                    }
                    if (!this.f22128l.containsKey(14)) {
                        this.f22128l.put(14, Integer.valueOf(C5960o.m23874k(this.f22126j, str, i13)));
                    }
                } else if (m23870g == 4) {
                    int m23874k2 = C5960o.m23874k(this.f22126j, str, i13);
                    if (!this.f22128l.containsKey(4)) {
                        map = this.f22128l;
                        i11 = 4;
                        valueOf = Integer.valueOf(m23874k2);
                    }
                } else if (m23870g == 3) {
                    int m23874k3 = C5960o.m23874k(this.f22126j, str, i13);
                    if (Build.VERSION.SDK_INT < 29 && !this.f22128l.containsKey(4)) {
                        this.f22128l.put(4, Integer.valueOf(m23874k3));
                    }
                    if (!this.f22128l.containsKey(5)) {
                        this.f22128l.put(5, Integer.valueOf(m23874k3));
                    }
                    this.f22128l.put(Integer.valueOf(m23870g), Integer.valueOf(m23874k3));
                } else if (!this.f22128l.containsKey(Integer.valueOf(m23870g))) {
                    this.f22128l.put(Integer.valueOf(m23870g), Integer.valueOf(C5960o.m23874k(this.f22126j, str, i13)));
                }
                map.put(i11, valueOf);
            }
        }
        int length = this.f22127k - iArr.length;
        this.f22127k = length;
        b bVar = this.f22125i;
        if (bVar == null || length != 0) {
            return true;
        }
        bVar.mo23839a(this.f22128l);
        return true;
    }
}
