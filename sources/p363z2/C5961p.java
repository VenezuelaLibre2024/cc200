package p363z2;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import io.flutter.plugins.firebase.auth.Constants;
import java.util.List;

/* renamed from: z2.p */
/* loaded from: classes.dex */
public final class C5961p {

    @FunctionalInterface
    /* renamed from: z2.p$a */
    /* loaded from: classes.dex */
    public interface a {
        void onSuccess(int i10);
    }

    /* renamed from: d */
    public static boolean m23876d(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            return false;
        }
        return !TextUtils.isEmpty(Settings.Secure.getString(context.getContentResolver(), "location_providers_allowed"));
    }

    /* renamed from: f */
    public static boolean m23877f(Context context) {
        if (Build.VERSION.SDK_INT < 19) {
            return false;
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "location_mode") != 0;
        } catch (Settings.SettingNotFoundException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public void m23878a(int i10, Context context, a aVar, InterfaceC5947b interfaceC5947b) {
        if (context == null) {
            Log.d("permissions_handler", "Context cannot be null.");
            interfaceC5947b.mo23838a("PermissionHandler.ServiceManager", "Android context cannot be null.");
            return;
        }
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            aVar.onSuccess(m23881e(context) ? 1 : 0);
            return;
        }
        if (i10 == 21) {
            aVar.onSuccess(m23880c(context) ? 1 : 0);
            return;
        }
        if (i10 != 8) {
            if (i10 == 16) {
                aVar.onSuccess(Build.VERSION.SDK_INT < 23 ? 2 : 1);
                return;
            } else {
                aVar.onSuccess(2);
                return;
            }
        }
        PackageManager packageManager = context.getPackageManager();
        if (!packageManager.hasSystemFeature("android.hardware.telephony")) {
            aVar.onSuccess(2);
            return;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Constants.SIGN_IN_METHOD_PHONE);
        if (telephonyManager == null || telephonyManager.getPhoneType() == 0) {
            aVar.onSuccess(2);
            return;
        }
        if (m23879b(packageManager).isEmpty()) {
            aVar.onSuccess(2);
        } else if (telephonyManager.getSimState() != 5) {
            aVar.onSuccess(0);
        } else {
            aVar.onSuccess(1);
        }
    }

    /* renamed from: b */
    public final List<ResolveInfo> m23879b(PackageManager packageManager) {
        Intent intent = new Intent("android.intent.action.CALL");
        intent.setData(Uri.parse("tel:123123"));
        return Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.queryIntentActivities(intent, 0);
    }

    /* renamed from: c */
    public final boolean m23880c(Context context) {
        return (Build.VERSION.SDK_INT < 18 ? BluetoothAdapter.getDefaultAdapter() : ((BluetoothManager) context.getSystemService("bluetooth")).getAdapter()).isEnabled();
    }

    /* renamed from: e */
    public final boolean m23881e(Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 28) {
            return i10 >= 19 ? m23877f(context) : m23876d(context);
        }
        LocationManager locationManager = (LocationManager) context.getSystemService(LocationManager.class);
        if (locationManager == null) {
            return false;
        }
        return locationManager.isLocationEnabled();
    }
}
