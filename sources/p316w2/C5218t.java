package p316w2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import io.flutter.plugin.common.EventChannel;

/* renamed from: w2.t */
/* loaded from: classes.dex */
public class C5218t extends BroadcastReceiver {

    /* renamed from: a */
    public final EventChannel.EventSink f19778a;

    /* renamed from: b */
    public EnumC5222x f19779b;

    public C5218t(EventChannel.EventSink eventSink) {
        this.f19778a = eventSink;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        EnumC5222x enumC5222x;
        if ("android.location.PROVIDERS_CHANGED".equals(intent.getAction())) {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            boolean isProviderEnabled = locationManager.isProviderEnabled("gps");
            boolean isProviderEnabled2 = locationManager.isProviderEnabled("network");
            if (isProviderEnabled || isProviderEnabled2) {
                EnumC5222x enumC5222x2 = this.f19779b;
                if (enumC5222x2 != null && enumC5222x2 != EnumC5222x.disabled) {
                    return;
                } else {
                    enumC5222x = EnumC5222x.enabled;
                }
            } else {
                EnumC5222x enumC5222x3 = this.f19779b;
                if (enumC5222x3 != null && enumC5222x3 != EnumC5222x.enabled) {
                    return;
                } else {
                    enumC5222x = EnumC5222x.disabled;
                }
            }
            this.f19779b = enumC5222x;
            this.f19778a.success(Integer.valueOf(enumC5222x.ordinal()));
        }
    }
}
