package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.zzdd;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p034c7.C0767k6;
import p034c7.C0768k7;
import p034c7.InterfaceC0714g9;
import p108h6.C2394s;

@Deprecated
/* loaded from: classes.dex */
public class AppMeasurement {

    /* renamed from: b */
    public static volatile AppMeasurement f4602b;

    /* renamed from: a */
    public final AbstractC1181a f4603a;

    /* loaded from: classes.dex */
    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @Keep
        public String mName;

        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(Bundle bundle) {
            C2394s.m9619l(bundle);
            this.mAppId = (String) C0768k7.m3519a(bundle, "app_id", String.class, null);
            this.mOrigin = (String) C0768k7.m3519a(bundle, "origin", String.class, null);
            this.mName = (String) C0768k7.m3519a(bundle, "name", String.class, null);
            this.mValue = C0768k7.m3519a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) C0768k7.m3519a(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) C0768k7.m3519a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) C0768k7.m3519a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) C0768k7.m3519a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) C0768k7.m3519a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) C0768k7.m3519a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) C0768k7.m3519a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) C0768k7.m3519a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) C0768k7.m3519a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) C0768k7.m3519a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) C0768k7.m3519a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) C0768k7.m3519a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    /* renamed from: com.google.android.gms.measurement.AppMeasurement$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1181a implements InterfaceC0714g9 {
        public AbstractC1181a() {
        }
    }

    public AppMeasurement(InterfaceC0714g9 interfaceC0714g9) {
        this.f4603a = new C1183b(interfaceC0714g9);
    }

    public AppMeasurement(C0767k6 c0767k6) {
        this.f4603a = new C1182a(c0767k6);
    }

    /* renamed from: a */
    public static InterfaceC0714g9 m5100a(Context context, Bundle bundle) {
        return (InterfaceC0714g9) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
    }

    /* renamed from: b */
    public static AppMeasurement m5101b(Context context, String str, String str2) {
        if (f4602b == null) {
            synchronized (AppMeasurement.class) {
                if (f4602b == null) {
                    InterfaceC0714g9 m5100a = m5100a(context, null);
                    if (m5100a != null) {
                        f4602b = new AppMeasurement(m5100a);
                    } else {
                        f4602b = new AppMeasurement(C0767k6.m3480a(context, new zzdd(0L, 0L, true, null, null, null, null, null), null));
                    }
                }
            }
        }
        return f4602b;
    }

    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        return m5101b(context, null, null);
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f4603a.zzb(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f4603a.mo3246a(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f4603a.zzc(str);
    }

    @Keep
    public long generateEventId() {
        return this.f4603a.zza();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f4603a.zzf();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> mo3247b = this.f4603a.mo3247b(str, str2);
        ArrayList arrayList = new ArrayList(mo3247b == null ? 0 : mo3247b.size());
        Iterator<Bundle> it = mo3247b.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty(it.next()));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f4603a.zzg();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f4603a.zzh();
    }

    @Keep
    public String getGmpAppId() {
        return this.f4603a.zzi();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f4603a.zza(str);
    }

    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z10) {
        return this.f4603a.mo3248c(str, str2, z10);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f4603a.mo3249d(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        C2394s.m9619l(conditionalUserProperty);
        AbstractC1181a abstractC1181a = this.f4603a;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            C0768k7.m3520b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        abstractC1181a.zza(bundle);
    }
}
