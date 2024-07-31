package p034c7;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzew;
import com.google.android.gms.internal.measurement.zzfi;
import com.google.android.gms.internal.measurement.zzjf;
import com.google.android.gms.internal.measurement.zznm;
import com.google.android.gms.internal.measurement.zzns;
import com.google.android.gms.internal.measurement.zznx;
import com.google.android.gms.internal.measurement.zzph;
import com.google.android.gms.internal.measurement.zzqa;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p108h6.C2394s;
import p285u.C4771a;

/* renamed from: c7.m */
/* loaded from: classes.dex */
public final class C0788m extends AbstractC0954xb {

    /* renamed from: f */
    public static final String[] f3296f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g */
    public static final String[] f3297g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: h */
    public static final String[] f3298h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;"};

    /* renamed from: i */
    public static final String[] f3299i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: j */
    public static final String[] f3300j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: k */
    public static final String[] f3301k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: l */
    public static final String[] f3302l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m */
    public static final String[] f3303m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: n */
    public static final String[] f3304n = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;"};

    /* renamed from: o */
    public static final String[] f3305o = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* renamed from: d */
    public final C0872s f3306d;

    /* renamed from: e */
    public final C0870rb f3307e;

    public C0788m(C0968yb c0968yb) {
        super(c0968yb);
        this.f3307e = new C0870rb(zzb());
        this.f3306d = new C0872s(this, zza(), "google_app_measurement.db");
    }

    /* renamed from: O */
    public static void m3532O(ContentValues contentValues, String str, Object obj) {
        C2394s.m9613f(str);
        C2394s.m9619l(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put(str, (Double) obj);
        }
    }

    /* renamed from: A */
    public final long m3543A(String str) {
        C2394s.m9613f(str);
        mo3099i();
        m4002p();
        try {
            return m3599w().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(1000000, mo3092a().m3283q(str, C0733i0.f3125r))))});
        } catch (SQLiteException e10) {
            zzj().m3914B().m3997c("Error deleting over the limit events. appId", C0919v4.m3906q(str), e10);
            return 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* renamed from: A0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p034c7.C0815nc m3544A0(java.lang.String r19, java.lang.String r20) {
        /*
            r18 = this;
            r8 = r20
            p108h6.C2394s.m9613f(r19)
            p108h6.C2394s.m9613f(r20)
            r18.mo3099i()
            r18.m4002p()
            r9 = 0
            android.database.sqlite.SQLiteDatabase r10 = r18.m3599w()     // Catch: java.lang.Throwable -> L80 android.database.sqlite.SQLiteException -> L84
            java.lang.String r11 = "user_attributes"
            java.lang.String r0 = "set_timestamp"
            java.lang.String r1 = "value"
            java.lang.String r2 = "origin"
            java.lang.String[] r12 = new java.lang.String[]{r0, r1, r2}     // Catch: java.lang.Throwable -> L80 android.database.sqlite.SQLiteException -> L84
            java.lang.String r13 = "app_id=? and name=?"
            r0 = 2
            java.lang.String[] r14 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L80 android.database.sqlite.SQLiteException -> L84
            r1 = 0
            r14[r1] = r19     // Catch: java.lang.Throwable -> L80 android.database.sqlite.SQLiteException -> L84
            r2 = 1
            r14[r2] = r8     // Catch: java.lang.Throwable -> L80 android.database.sqlite.SQLiteException -> L84
            r15 = 0
            r16 = 0
            r17 = 0
            android.database.Cursor r10 = r10.query(r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L80 android.database.sqlite.SQLiteException -> L84
            boolean r3 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteException -> L7c
            if (r3 != 0) goto L3d
            r10.close()
            return r9
        L3d:
            long r5 = r10.getLong(r1)     // Catch: java.lang.Throwable -> L78 android.database.sqlite.SQLiteException -> L7c
            r11 = r18
            java.lang.Object r7 = r11.m3555H(r10, r2)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> La7
            if (r7 != 0) goto L4d
            r10.close()
            return r9
        L4d:
            java.lang.String r3 = r10.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> La7
            c7.nc r0 = new c7.nc     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> La7
            r1 = r0
            r2 = r19
            r4 = r20
            r1.<init>(r2, r3, r4, r5, r7)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> La7
            boolean r1 = r10.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> La7
            if (r1 == 0) goto L72
            c7.v4 r1 = r18.zzj()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> La7
            c7.x4 r1 = r1.m3914B()     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> La7
            java.lang.String r2 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r3 = p034c7.C0919v4.m3906q(r19)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> La7
            r1.m3996b(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L76 java.lang.Throwable -> La7
        L72:
            r10.close()
            return r0
        L76:
            r0 = move-exception
            goto L88
        L78:
            r0 = move-exception
            r11 = r18
            goto La8
        L7c:
            r0 = move-exception
            r11 = r18
            goto L88
        L80:
            r0 = move-exception
            r11 = r18
            goto La9
        L84:
            r0 = move-exception
            r11 = r18
            r10 = r9
        L88:
            c7.v4 r1 = r18.zzj()     // Catch: java.lang.Throwable -> La7
            c7.x4 r1 = r1.m3914B()     // Catch: java.lang.Throwable -> La7
            java.lang.String r2 = "Error querying user property. appId"
            java.lang.Object r3 = p034c7.C0919v4.m3906q(r19)     // Catch: java.lang.Throwable -> La7
            c7.u4 r4 = r18.mo3094d()     // Catch: java.lang.Throwable -> La7
            java.lang.String r4 = r4.m3860g(r8)     // Catch: java.lang.Throwable -> La7
            r1.m3998d(r2, r3, r4, r0)     // Catch: java.lang.Throwable -> La7
            if (r10 == 0) goto La6
            r10.close()
        La6:
            return r9
        La7:
            r0 = move-exception
        La8:
            r9 = r10
        La9:
            if (r9 == 0) goto Lae
            r9.close()
        Lae:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c7.C0788m.m3544A0(java.lang.String, java.lang.String):c7.nc");
    }

    /* renamed from: B */
    public final long m3545B(String str, String[] strArr, long j10) {
        Cursor cursor = null;
        try {
            try {
                cursor = m3599w().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return j10;
                }
                long j11 = cursor.getLong(0);
                cursor.close();
                return j11;
            } catch (SQLiteException e10) {
                zzj().m3914B().m3997c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: B0 */
    public final C0928w m3546B0(String str) {
        if (!zzns.zza() || !mo3092a().m3281o(C0733i0.f3070Q0)) {
            return C0928w.f3681f;
        }
        C2394s.m9619l(str);
        mo3099i();
        m4002p();
        return C0928w.m3928c(m3561K("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x008b: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:29:0x008b */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair<com.google.android.gms.internal.measurement.zzfi.zze, java.lang.Long> m3547C(java.lang.String r8, java.lang.Long r9) {
        /*
            r7 = this;
            r7.mo3099i()
            r7.m4002p()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.m3599w()     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String r2 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            r3 = 2
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            r4 = 0
            r3[r4] = r8     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            java.lang.String r5 = java.lang.String.valueOf(r9)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            r6 = 1
            r3[r6] = r5     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L73 android.database.sqlite.SQLiteException -> L75
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            if (r2 != 0) goto L35
            c7.v4 r8 = r7.zzj()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            c7.x4 r8 = r8.m3918F()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            java.lang.String r9 = "Main event not found"
            r8.m3995a(r9)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            r1.close()
            return r0
        L35:
            byte[] r2 = r1.getBlob(r4)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            long r3 = r1.getLong(r6)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.zzfi$zze$zza r4 = com.google.android.gms.internal.measurement.zzfi.zze.zze()     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.zzku r2 = p034c7.C0745ic.m3435E(r4, r2)     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.zzfi$zze$zza r2 = (com.google.android.gms.internal.measurement.zzfi.zze.zza) r2     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.zzkr r2 = r2.zzah()     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.zzjf r2 = (com.google.android.gms.internal.measurement.zzjf) r2     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            com.google.android.gms.internal.measurement.zzfi$zze r2 = (com.google.android.gms.internal.measurement.zzfi.zze) r2     // Catch: java.io.IOException -> L5b android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            android.util.Pair r8 = android.util.Pair.create(r2, r3)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            r1.close()
            return r8
        L5b:
            r2 = move-exception
            c7.v4 r3 = r7.zzj()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            c7.x4 r3 = r3.m3914B()     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            java.lang.String r4 = "Failed to merge main event. appId, eventId"
            java.lang.Object r8 = p034c7.C0919v4.m3906q(r8)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            r3.m3998d(r4, r8, r9, r2)     // Catch: android.database.sqlite.SQLiteException -> L71 java.lang.Throwable -> L8a
            r1.close()
            return r0
        L71:
            r8 = move-exception
            goto L77
        L73:
            r8 = move-exception
            goto L8c
        L75:
            r8 = move-exception
            r1 = r0
        L77:
            c7.v4 r9 = r7.zzj()     // Catch: java.lang.Throwable -> L8a
            c7.x4 r9 = r9.m3914B()     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = "Error selecting main event"
            r9.m3996b(r2, r8)     // Catch: java.lang.Throwable -> L8a
            if (r1 == 0) goto L89
            r1.close()
        L89:
            return r0
        L8a:
            r8 = move-exception
            r0 = r1
        L8c:
            if (r0 == 0) goto L91
            r0.close()
        L91:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c7.C0788m.m3547C(java.lang.String, java.lang.Long):android.util.Pair");
    }

    /* renamed from: C0 */
    public final Map<Integer, List<zzew.zzb>> m3548C0(String str, String str2) {
        m4002p();
        mo3099i();
        C2394s.m9613f(str);
        C2394s.m9613f(str2);
        C4771a c4771a = new C4771a();
        Cursor cursor = null;
        try {
            try {
                Cursor query = m3599w().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<zzew.zzb>> emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                do {
                    try {
                        zzew.zzb zzbVar = (zzew.zzb) ((zzjf) ((zzew.zzb.zza) C0745ic.m3435E(zzew.zzb.zzc(), query.getBlob(1))).zzah());
                        int i10 = query.getInt(0);
                        List list = (List) c4771a.get(Integer.valueOf(i10));
                        if (list == null) {
                            list = new ArrayList();
                            c4771a.put(Integer.valueOf(i10), list);
                        }
                        list.add(zzbVar);
                    } catch (IOException e10) {
                        zzj().m3914B().m3997c("Failed to merge filter. appId", C0919v4.m3906q(str), e10);
                    }
                } while (query.moveToNext());
                query.close();
                return c4771a;
            } catch (SQLiteException e11) {
                zzj().m3914B().m3997c("Database error querying filters. appId", C0919v4.m3906q(str), e11);
                Map<Integer, List<zzew.zzb>> emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: D */
    public final C0858r m3549D(long j10, String str, long j11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        C2394s.m9613f(str);
        mo3099i();
        m4002p();
        String[] strArr = {str};
        C0858r c0858r = new C0858r();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase m3599w = m3599w();
                Cursor query = m3599w.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    zzj().m3919G().m3996b("Not updating daily counts, app is not known. appId", C0919v4.m3906q(str));
                    query.close();
                    return c0858r;
                }
                if (query.getLong(0) == j10) {
                    c0858r.f3497b = query.getLong(1);
                    c0858r.f3496a = query.getLong(2);
                    c0858r.f3498c = query.getLong(3);
                    c0858r.f3499d = query.getLong(4);
                    c0858r.f3500e = query.getLong(5);
                }
                if (z10) {
                    c0858r.f3497b += j11;
                }
                if (z11) {
                    c0858r.f3496a += j11;
                }
                if (z12) {
                    c0858r.f3498c += j11;
                }
                if (z13) {
                    c0858r.f3499d += j11;
                }
                if (z14) {
                    c0858r.f3500e += j11;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j10));
                contentValues.put("daily_public_events_count", Long.valueOf(c0858r.f3496a));
                contentValues.put("daily_events_count", Long.valueOf(c0858r.f3497b));
                contentValues.put("daily_conversions_count", Long.valueOf(c0858r.f3498c));
                contentValues.put("daily_error_events_count", Long.valueOf(c0858r.f3499d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(c0858r.f3500e));
                m3599w.update("apps", contentValues, "app_id=?", strArr);
                query.close();
                return c0858r;
            } catch (SQLiteException e10) {
                zzj().m3914B().m3997c("Error updating daily counts. appId", C0919v4.m3906q(str), e10);
                if (0 != 0) {
                    cursor.close();
                }
                return c0858r;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: D0 */
    public final C0810n7 m3550D0(String str) {
        C2394s.m9619l(str);
        mo3099i();
        m4002p();
        if (!zzns.zza() || !mo3092a().m3281o(C0733i0.f3070Q0)) {
            return C0810n7.m3622e(m3561K("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str}, "G1"));
        }
        C0810n7 c0810n7 = (C0810n7) m3557I("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str}, C0830p.f3418a);
        return c0810n7 == null ? C0810n7.f3353c : c0810n7;
    }

    /* renamed from: E */
    public final C0858r m3551E(long j10, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return m3549D(j10, str, 1L, false, false, z12, false, z14);
    }

    /* renamed from: E0 */
    public final Map<Integer, List<zzew.zze>> m3552E0(String str, String str2) {
        m4002p();
        mo3099i();
        C2394s.m9613f(str);
        C2394s.m9613f(str2);
        C4771a c4771a = new C4771a();
        Cursor cursor = null;
        try {
            try {
                Cursor query = m3599w().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<zzew.zze>> emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                do {
                    try {
                        zzew.zze zzeVar = (zzew.zze) ((zzjf) ((zzew.zze.zza) C0745ic.m3435E(zzew.zze.zzc(), query.getBlob(1))).zzah());
                        int i10 = query.getInt(0);
                        List list = (List) c4771a.get(Integer.valueOf(i10));
                        if (list == null) {
                            list = new ArrayList();
                            c4771a.put(Integer.valueOf(i10), list);
                        }
                        list.add(zzeVar);
                    } catch (IOException e10) {
                        zzj().m3914B().m3997c("Failed to merge filter", C0919v4.m3906q(str), e10);
                    }
                } while (query.moveToNext());
                query.close();
                return c4771a;
            } catch (SQLiteException e11) {
                zzj().m3914B().m3997c("Database error querying filters. appId", C0919v4.m3906q(str), e11);
                Map<Integer, List<zzew.zze>> emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: F0 */
    public final List<C0856qb> m3553F0(String str) {
        C2394s.m9613f(str);
        mo3099i();
        m4002p();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = m3599w().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    arrayList.add(new C0856qb(string, cursor.getLong(1), cursor.getInt(2)));
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e10) {
                zzj().m3914B().m3997c("Error querying trigger uris. appId", C0919v4.m3906q(str), e10);
                List<C0856qb> emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: G0 */
    public final void m3554G0(String str, String str2) {
        C2394s.m9613f(str);
        C2394s.m9613f(str2);
        mo3099i();
        m4002p();
        try {
            m3599w().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            zzj().m3914B().m3998d("Error deleting user property. appId", C0919v4.m3906q(str), mo3094d().m3860g(str2), e10);
        }
    }

    /* renamed from: H */
    public final Object m3555H(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 0) {
            zzj().m3914B().m3995a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i10));
        }
        if (type == 3) {
            return cursor.getString(i10);
        }
        if (type != 4) {
            zzj().m3914B().m3996b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        zzj().m3914B().m3995a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* renamed from: H0 */
    public final List<C0815nc> m3556H0(String str) {
        C2394s.m9613f(str);
        mo3099i();
        m4002p();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = m3599w().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j10 = cursor.getLong(2);
                    Object m3555H = m3555H(cursor, 3);
                    if (m3555H == null) {
                        zzj().m3914B().m3996b("Read invalid user property value, ignoring it. appId", C0919v4.m3906q(str));
                    } else {
                        arrayList.add(new C0815nc(str, str2, string, j10, m3555H));
                    }
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e10) {
                zzj().m3914B().m3997c("Error querying user properties. appId", C0919v4.m3906q(str), e10);
                List<C0815nc> emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* renamed from: I */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> T m3557I(java.lang.String r3, java.lang.String[] r4, p034c7.InterfaceC0886t<T> r5) {
        /*
            r2 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r2.m3599w()     // Catch: java.lang.Throwable -> L2a android.database.sqlite.SQLiteException -> L2c
            android.database.Cursor r3 = r1.rawQuery(r3, r4)     // Catch: java.lang.Throwable -> L2a android.database.sqlite.SQLiteException -> L2c
            boolean r4 = r3.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L28 java.lang.Throwable -> L41
            if (r4 != 0) goto L20
            c7.v4 r4 = r2.zzj()     // Catch: android.database.sqlite.SQLiteException -> L28 java.lang.Throwable -> L41
            c7.x4 r4 = r4.m3918F()     // Catch: android.database.sqlite.SQLiteException -> L28 java.lang.Throwable -> L41
            java.lang.String r5 = "No data found"
            r4.m3995a(r5)     // Catch: android.database.sqlite.SQLiteException -> L28 java.lang.Throwable -> L41
            r3.close()
            return r0
        L20:
            java.lang.Object r4 = r5.mo3696a(r3)     // Catch: android.database.sqlite.SQLiteException -> L28 java.lang.Throwable -> L41
            r3.close()
            return r4
        L28:
            r4 = move-exception
            goto L2e
        L2a:
            r4 = move-exception
            goto L43
        L2c:
            r4 = move-exception
            r3 = r0
        L2e:
            c7.v4 r5 = r2.zzj()     // Catch: java.lang.Throwable -> L41
            c7.x4 r5 = r5.m3914B()     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = "Error querying database."
            r5.m3996b(r1, r4)     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto L40
            r3.close()
        L40:
            return r0
        L41:
            r4 = move-exception
            r0 = r3
        L43:
            if (r0 == 0) goto L48
            r0.close()
        L48:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c7.C0788m.m3557I(java.lang.String, java.lang.String[], c7.t):java.lang.Object");
    }

    /* renamed from: I0 */
    public final Map<Integer, zzfi.zzl> m3558I0(String str) {
        m4002p();
        mo3099i();
        C2394s.m9613f(str);
        Cursor cursor = null;
        try {
            try {
                Cursor query = m3599w().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, zzfi.zzl> emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                C4771a c4771a = new C4771a();
                do {
                    int i10 = query.getInt(0);
                    try {
                        c4771a.put(Integer.valueOf(i10), (zzfi.zzl) ((zzjf) ((zzfi.zzl.zza) C0745ic.m3435E(zzfi.zzl.zze(), query.getBlob(1))).zzah()));
                    } catch (IOException e10) {
                        zzj().m3914B().m3998d("Failed to merge filter results. appId, audienceId, error", C0919v4.m3906q(str), Integer.valueOf(i10), e10);
                    }
                } while (query.moveToNext());
                query.close();
                return c4771a;
            } catch (SQLiteException e11) {
                zzj().m3914B().m3997c("Database error querying filter results. appId", C0919v4.m3906q(str), e11);
                Map<Integer, zzfi.zzl> emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m3559J(long r5) {
        /*
            r4 = this;
            r4.mo3099i()
            r4.m4002p()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r4.m3599w()     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            java.lang.String r2 = "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            r6 = 0
            r3[r6] = r5     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            android.database.Cursor r5 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L3c android.database.sqlite.SQLiteException -> L3e
            boolean r1 = r5.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            if (r1 != 0) goto L32
            c7.v4 r6 = r4.zzj()     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            c7.x4 r6 = r6.m3918F()     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            java.lang.String r1 = "No expired configs for apps with pending events"
            r6.m3995a(r1)     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            r5.close()
            return r0
        L32:
            java.lang.String r6 = r5.getString(r6)     // Catch: android.database.sqlite.SQLiteException -> L3a java.lang.Throwable -> L53
            r5.close()
            return r6
        L3a:
            r6 = move-exception
            goto L40
        L3c:
            r6 = move-exception
            goto L55
        L3e:
            r6 = move-exception
            r5 = r0
        L40:
            c7.v4 r1 = r4.zzj()     // Catch: java.lang.Throwable -> L53
            c7.x4 r1 = r1.m3914B()     // Catch: java.lang.Throwable -> L53
            java.lang.String r2 = "Error selecting expired configs"
            r1.m3996b(r2, r6)     // Catch: java.lang.Throwable -> L53
            if (r5 == 0) goto L52
            r5.close()
        L52:
            return r0
        L53:
            r6 = move-exception
            r0 = r5
        L55:
            if (r0 == 0) goto L5a
            r0.close()
        L5a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c7.C0788m.m3559J(long):java.lang.String");
    }

    /* renamed from: J0 */
    public final Map<Integer, List<zzew.zzb>> m3560J0(String str) {
        C2394s.m9613f(str);
        C4771a c4771a = new C4771a();
        Cursor cursor = null;
        try {
            try {
                Cursor query = m3599w().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    Map<Integer, List<zzew.zzb>> emptyMap = Collections.emptyMap();
                    query.close();
                    return emptyMap;
                }
                do {
                    try {
                        zzew.zzb zzbVar = (zzew.zzb) ((zzjf) ((zzew.zzb.zza) C0745ic.m3435E(zzew.zzb.zzc(), query.getBlob(1))).zzah());
                        if (zzbVar.zzk()) {
                            int i10 = query.getInt(0);
                            List list = (List) c4771a.get(Integer.valueOf(i10));
                            if (list == null) {
                                list = new ArrayList();
                                c4771a.put(Integer.valueOf(i10), list);
                            }
                            list.add(zzbVar);
                        }
                    } catch (IOException e10) {
                        zzj().m3914B().m3997c("Failed to merge filter. appId", C0919v4.m3906q(str), e10);
                    }
                } while (query.moveToNext());
                query.close();
                return c4771a;
            } catch (SQLiteException e11) {
                zzj().m3914B().m3997c("Database error querying filters. appId", C0919v4.m3906q(str), e11);
                Map<Integer, List<zzew.zzb>> emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: K */
    public final String m3561K(String str, String[] strArr, String str2) {
        Cursor cursor = null;
        try {
            try {
                cursor = m3599w().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return str2;
                }
                String string = cursor.getString(0);
                cursor.close();
                return string;
            } catch (SQLiteException e10) {
                zzj().m3914B().m3997c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: K0 */
    public final Map<Integer, List<Integer>> m3562K0(String str) {
        m4002p();
        mo3099i();
        C2394s.m9613f(str);
        C4771a c4771a = new C4771a();
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = m3599w().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str, str});
                if (!rawQuery.moveToFirst()) {
                    Map<Integer, List<Integer>> emptyMap = Collections.emptyMap();
                    rawQuery.close();
                    return emptyMap;
                }
                do {
                    int i10 = rawQuery.getInt(0);
                    List list = (List) c4771a.get(Integer.valueOf(i10));
                    if (list == null) {
                        list = new ArrayList();
                        c4771a.put(Integer.valueOf(i10), list);
                    }
                    list.add(Integer.valueOf(rawQuery.getInt(1)));
                } while (rawQuery.moveToNext());
                rawQuery.close();
                return c4771a;
            } catch (SQLiteException e10) {
                zzj().m3914B().m3997c("Database error querying scoped filters. appId", C0919v4.m3906q(str), e10);
                Map<Integer, List<Integer>> emptyMap2 = Collections.emptyMap();
                if (0 != 0) {
                    cursor.close();
                }
                return emptyMap2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x017f A[EDGE_INSN: B:63:0x017f->B:25:0x017f BREAK  A[LOOP:0: B:16:0x0054->B:76:0x017c], SYNTHETIC] */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<android.util.Pair<com.google.android.gms.internal.measurement.zzfi.zzj, java.lang.Long>> m3563L(java.lang.String r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c7.C0788m.m3563L(java.lang.String, int, int):java.util.List");
    }

    /* renamed from: L0 */
    public final void m3564L0() {
        m4002p();
        m3599w().beginTransaction();
    }

    /* renamed from: M */
    public final List<C0690f> m3565M(String str, String str2, String str3) {
        C2394s.m9613f(str);
        mo3099i();
        m4002p();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb2.append(" and name glob ?");
        }
        return m3567N(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* renamed from: M0 */
    public final void m3566M0() {
        m4002p();
        m3599w().endTransaction();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        zzj().m3914B().m3996b("Read more than the max allowed conditional properties, ignoring extra", 1000);
     */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<p034c7.C0690f> m3567N(java.lang.String r27, java.lang.String[] r28) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c7.C0788m.m3567N(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* renamed from: N0 */
    public final void m3568N0() {
        int delete;
        mo3099i();
        m4002p();
        if (m3589p0()) {
            long m3618a = mo3124n().f3741e.m3618a();
            long mo14933b = zzb().mo14933b();
            if (Math.abs(mo14933b - m3618a) > C0733i0.f3037A.m3607a(null).longValue()) {
                mo3124n().f3741e.m3619b(mo14933b);
                mo3099i();
                m4002p();
                if (!m3589p0() || (delete = m3599w().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(zzb().mo14932a()), String.valueOf(C0718h.m3259H())})) <= 0) {
                    return;
                }
                zzj().m3918F().m3996b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
            }
        }
    }

    /* renamed from: O0 */
    public final void m3569O0() {
        m4002p();
        m3599w().setTransactionSuccessful();
    }

    /* renamed from: P */
    public final void m3570P(C0648c0 c0648c0) {
        C2394s.m9619l(c0648c0);
        mo3099i();
        m4002p();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c0648c0.f2808a);
        contentValues.put("name", c0648c0.f2809b);
        contentValues.put("lifetime_count", Long.valueOf(c0648c0.f2810c));
        contentValues.put("current_bundle_count", Long.valueOf(c0648c0.f2811d));
        contentValues.put("last_fire_timestamp", Long.valueOf(c0648c0.f2813f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c0648c0.f2814g));
        contentValues.put("last_bundled_day", c0648c0.f2815h);
        contentValues.put("last_sampled_complex_event_id", c0648c0.f2816i);
        contentValues.put("last_sampling_rate", c0648c0.f2817j);
        contentValues.put("current_session_count", Long.valueOf(c0648c0.f2812e));
        Boolean bool = c0648c0.f2818k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (m3599w().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                zzj().m3914B().m3996b("Failed to insert/update event aggregates (got -1). appId", C0919v4.m3906q(c0648c0.f2808a));
            }
        } catch (SQLiteException e10) {
            zzj().m3914B().m3997c("Error storing event aggregates. appId", C0919v4.m3906q(c0648c0.f2808a), e10);
        }
    }

    /* renamed from: P0 */
    public final boolean m3571P0() {
        return m3592s0("select count(1) > 0 from raw_events", null) != 0;
    }

    /* renamed from: Q */
    public final void m3572Q(C0710g5 c0710g5) {
        C2394s.m9619l(c0710g5);
        mo3099i();
        m4002p();
        String m3238v0 = c0710g5.m3238v0();
        C2394s.m9619l(m3238v0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", m3238v0);
        contentValues.put("app_instance_id", c0710g5.m3240w0());
        contentValues.put("gmp_app_id", c0710g5.m3213j());
        contentValues.put("resettable_device_id_hash", c0710g5.m3217l());
        contentValues.put("last_bundle_index", Long.valueOf(c0710g5.m3220m0()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c0710g5.m3224o0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c0710g5.m3216k0()));
        contentValues.put("app_version", c0710g5.m3209h());
        contentValues.put("app_store", c0710g5.m3242x0());
        contentValues.put("gmp_version", Long.valueOf(c0710g5.m3212i0()));
        contentValues.put("dev_cert_hash", Long.valueOf(c0710g5.m3200c0()));
        contentValues.put("measurement_enabled", Boolean.valueOf(c0710g5.m3231s()));
        contentValues.put("day", Long.valueOf(c0710g5.m3196a0()));
        contentValues.put("daily_public_events_count", Long.valueOf(c0710g5.m3189U()));
        contentValues.put("daily_events_count", Long.valueOf(c0710g5.m3186R()));
        contentValues.put("daily_conversions_count", Long.valueOf(c0710g5.m3180L()));
        contentValues.put("config_fetched_time", Long.valueOf(c0710g5.m3177I()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(c0710g5.m3208g0()));
        contentValues.put("app_version_int", Long.valueOf(c0710g5.m3169A()));
        contentValues.put("firebase_instance_id", c0710g5.m3211i());
        contentValues.put("daily_error_events_count", Long.valueOf(c0710g5.m3183O()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(c0710g5.m3192X()));
        contentValues.put("health_monitor_sample", c0710g5.m3215k());
        contentValues.put("android_id", Long.valueOf(c0710g5.m3239w()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c0710g5.m3229r()));
        contentValues.put("admob_app_id", c0710g5.m3234t0());
        contentValues.put("dynamite_version", Long.valueOf(c0710g5.m3204e0()));
        contentValues.put("session_stitching_token", c0710g5.m3219m());
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(c0710g5.m3235u()));
        contentValues.put("target_os_version", Long.valueOf(c0710g5.m3230r0()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(c0710g5.m3228q0()));
        if (zzph.zza() && mo3092a().m3291y(m3238v0, C0733i0.f3052H0)) {
            contentValues.put("ad_services_version", Integer.valueOf(c0710g5.m3195a()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(c0710g5.m3173E()));
        }
        if (zznm.zza() && mo3092a().m3291y(m3238v0, C0733i0.f3080V0)) {
            contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(c0710g5.m3237v()));
        }
        if (zzqa.zza() && mo3092a().m3291y(m3238v0, C0733i0.f3136w0)) {
            contentValues.put("sgtm_preview_key", c0710g5.m3221n());
        }
        List<String> m3223o = c0710g5.m3223o();
        if (m3223o != null) {
            if (m3223o.isEmpty()) {
                zzj().m3919G().m3996b("Safelisted events should not be an empty list. appId", m3238v0);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", m3223o));
            }
        }
        if (zznx.zza() && mo3092a().m3281o(C0733i0.f3122p0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        if (zzns.zza() && mo3092a().m3291y(m3238v0, C0733i0.f3070Q0)) {
            contentValues.put("npa_metadata_value", c0710g5.m3232s0());
        }
        try {
            SQLiteDatabase m3599w = m3599w();
            if (m3599w.update("apps", contentValues, "app_id = ?", new String[]{m3238v0}) == 0 && m3599w.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                zzj().m3914B().m3996b("Failed to insert/update app (got -1). appId", C0919v4.m3906q(m3238v0));
            }
        } catch (SQLiteException e10) {
            zzj().m3914B().m3997c("Error storing app. appId", C0919v4.m3906q(m3238v0), e10);
        }
    }

    /* renamed from: Q0 */
    public final boolean m3573Q0() {
        return m3592s0("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    /* renamed from: R */
    public final void m3574R(String str, C0928w c0928w) {
        if (zzns.zza() && mo3092a().m3281o(C0733i0.f3070Q0)) {
            C2394s.m9619l(str);
            C2394s.m9619l(c0928w);
            mo3099i();
            m4002p();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("dma_consent_settings", c0928w.m3935i());
            m3577T("consent_settings", "app_id", contentValues);
        }
    }

    /* renamed from: R0 */
    public final boolean m3575R0() {
        return m3592s0("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    /* renamed from: S */
    public final void m3576S(String str, C0810n7 c0810n7) {
        C2394s.m9619l(str);
        C2394s.m9619l(c0810n7);
        mo3099i();
        m4002p();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", c0810n7.m3641v());
        if (zzns.zza() && mo3092a().m3281o(C0733i0.f3070Q0)) {
            contentValues.put("consent_source", Integer.valueOf(c0810n7.m3631b()));
            m3577T("consent_settings", "app_id", contentValues);
            return;
        }
        try {
            if (m3599w().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                zzj().m3914B().m3996b("Failed to insert/update consent setting (got -1). appId", C0919v4.m3906q(str));
            }
        } catch (SQLiteException e10) {
            zzj().m3914B().m3997c("Error storing consent setting. appId, error", C0919v4.m3906q(str), e10);
        }
    }

    /* renamed from: T */
    public final void m3577T(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase m3599w = m3599w();
            if (contentValues.getAsString(str2) == null) {
                zzj().m3915C().m3996b("Value of the primary key is not set.", C0919v4.m3906q(str2));
                return;
            }
            if (m3599w.update(str, contentValues, str2 + " = ?", new String[]{r1}) == 0 && m3599w.insertWithOnConflict(str, null, contentValues, 5) == -1) {
                zzj().m3914B().m3997c("Failed to insert/update table (got -1). key", C0919v4.m3906q(str), C0919v4.m3906q(str2));
            }
        } catch (SQLiteException e10) {
            zzj().m3914B().m3998d("Error storing into table. key", C0919v4.m3906q(str), C0919v4.m3906q(str2), e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0164, code lost:
    
        r8.m3997c(r10, r11, r9);
     */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3578U(java.lang.String r18, java.util.List<com.google.android.gms.internal.measurement.zzew.zza> r19) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c7.C0788m.m3578U(java.lang.String, java.util.List):void");
    }

    /* renamed from: V */
    public final void m3579V(List<Long> list) {
        mo3099i();
        m4002p();
        C2394s.m9619l(list);
        C2394s.m9621n(list.size());
        if (m3589p0()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (m3592s0("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                zzj().m3919G().m3995a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                m3599w().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e10) {
                zzj().m3914B().m3996b("Error incrementing retry count. error", e10);
            }
        }
    }

    /* renamed from: W */
    public final boolean m3580W(C0690f c0690f) {
        C2394s.m9619l(c0690f);
        mo3099i();
        m4002p();
        String str = c0690f.f2907h;
        C2394s.m9619l(str);
        if (m3544A0(str, c0690f.f2909j.f3289i) == null && m3592s0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", c0690f.f2908i);
        contentValues.put("name", c0690f.f2909j.f3289i);
        m3532O(contentValues, "value", C2394s.m9619l(c0690f.f2909j.m3529I()));
        contentValues.put("active", Boolean.valueOf(c0690f.f2911l));
        contentValues.put("trigger_event_name", c0690f.f2912m);
        contentValues.put("trigger_timeout", Long.valueOf(c0690f.f2914o));
        mo3096f();
        contentValues.put("timed_out_event", C0857qc.m3753l0(c0690f.f2913n));
        contentValues.put("creation_timestamp", Long.valueOf(c0690f.f2910k));
        mo3096f();
        contentValues.put("triggered_event", C0857qc.m3753l0(c0690f.f2915p));
        contentValues.put("triggered_timestamp", Long.valueOf(c0690f.f2909j.f3290j));
        contentValues.put("time_to_live", Long.valueOf(c0690f.f2916q));
        mo3096f();
        contentValues.put("expired_event", C0857qc.m3753l0(c0690f.f2917r));
        try {
            if (m3599w().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                zzj().m3914B().m3996b("Failed to insert/update conditional user property (got -1)", C0919v4.m3906q(str));
            }
        } catch (SQLiteException e10) {
            zzj().m3914B().m3997c("Error storing conditional user property", C0919v4.m3906q(str), e10);
        }
        return true;
    }

    /* renamed from: X */
    public final boolean m3581X(C0956y c0956y, long j10, boolean z10) {
        mo3099i();
        m4002p();
        C2394s.m9619l(c0956y);
        C2394s.m9613f(c0956y.f3752a);
        byte[] zzbv = mo3120j().m3455C(c0956y).zzbv();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c0956y.f3752a);
        contentValues.put("name", c0956y.f3753b);
        contentValues.put(Constants.TIMESTAMP, Long.valueOf(c0956y.f3755d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j10));
        contentValues.put("data", zzbv);
        contentValues.put("realtime", Integer.valueOf(z10 ? 1 : 0));
        try {
            if (m3599w().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            zzj().m3914B().m3996b("Failed to insert raw event (got -1). appId", C0919v4.m3906q(c0956y.f3752a));
            return false;
        } catch (SQLiteException e10) {
            zzj().m3914B().m3997c("Error storing raw event. appId", C0919v4.m3906q(c0956y.f3752a), e10);
            return false;
        }
    }

    /* renamed from: Y */
    public final boolean m3582Y(C0815nc c0815nc) {
        C2394s.m9619l(c0815nc);
        mo3099i();
        m4002p();
        if (m3544A0(c0815nc.f3377a, c0815nc.f3379c) == null) {
            if (C0857qc.m3737E0(c0815nc.f3379c)) {
                if (m3592s0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{c0815nc.f3377a}) >= mo3092a().m3278l(c0815nc.f3377a, C0733i0.f3053I, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(c0815nc.f3379c) && m3592s0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{c0815nc.f3377a, c0815nc.f3378b}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c0815nc.f3377a);
        contentValues.put("origin", c0815nc.f3378b);
        contentValues.put("name", c0815nc.f3379c);
        contentValues.put("set_timestamp", Long.valueOf(c0815nc.f3380d));
        m3532O(contentValues, "value", c0815nc.f3381e);
        try {
            if (m3599w().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                zzj().m3914B().m3996b("Failed to insert/update user property (got -1). appId", C0919v4.m3906q(c0815nc.f3377a));
            }
        } catch (SQLiteException e10) {
            zzj().m3914B().m3997c("Error storing user property. appId", C0919v4.m3906q(c0815nc.f3377a), e10);
        }
        return true;
    }

    /* renamed from: Z */
    public final boolean m3583Z(zzfi.zzj zzjVar, boolean z10) {
        C0947x4 m3914B;
        Object m3906q;
        String str;
        mo3099i();
        m4002p();
        C2394s.m9619l(zzjVar);
        C2394s.m9613f(zzjVar.zzx());
        C2394s.m9622o(zzjVar.zzbe());
        m3568N0();
        long mo14932a = zzb().mo14932a();
        if (zzjVar.zzl() < mo14932a - C0718h.m3259H() || zzjVar.zzl() > C0718h.m3259H() + mo14932a) {
            zzj().m3919G().m3998d("Storing bundle outside of the max uploading time span. appId, now, timestamp", C0919v4.m3906q(zzjVar.zzx()), Long.valueOf(mo14932a), Long.valueOf(zzjVar.zzl()));
        }
        try {
            byte[] m3467e0 = mo3120j().m3467e0(zzjVar.zzbv());
            zzj().m3918F().m3996b("Saving bundle, size", Integer.valueOf(m3467e0.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", zzjVar.zzx());
            contentValues.put("bundle_end_timestamp", Long.valueOf(zzjVar.zzl()));
            contentValues.put("data", m3467e0);
            contentValues.put("has_realtime", Integer.valueOf(z10 ? 1 : 0));
            if (zzjVar.zzbl()) {
                contentValues.put("retry_count", Integer.valueOf(zzjVar.zzf()));
            }
            try {
                if (m3599w().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                zzj().m3914B().m3996b("Failed to insert bundle (got -1). appId", C0919v4.m3906q(zzjVar.zzx()));
                return false;
            } catch (SQLiteException e10) {
                e = e10;
                m3914B = zzj().m3914B();
                m3906q = C0919v4.m3906q(zzjVar.zzx());
                str = "Error storing bundle. appId";
                m3914B.m3997c(str, m3906q, e);
                return false;
            }
        } catch (IOException e11) {
            e = e11;
            m3914B = zzj().m3914B();
            m3906q = C0919v4.m3906q(zzjVar.zzx());
            str = "Data loss. Failed to serialize bundle. appId";
        }
    }

    /* renamed from: a0 */
    public final boolean m3584a0(String str, int i10, zzew.zzb zzbVar) {
        m4002p();
        mo3099i();
        C2394s.m9613f(str);
        C2394s.m9619l(zzbVar);
        if (zzbVar.zzf().isEmpty()) {
            zzj().m3919G().m3998d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", C0919v4.m3906q(str), Integer.valueOf(i10), String.valueOf(zzbVar.zzl() ? Integer.valueOf(zzbVar.zzb()) : null));
            return false;
        }
        byte[] zzbv = zzbVar.zzbv();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i10));
        contentValues.put("filter_id", zzbVar.zzl() ? Integer.valueOf(zzbVar.zzb()) : null);
        contentValues.put("event_name", zzbVar.zzf());
        contentValues.put("session_scoped", zzbVar.zzm() ? Boolean.valueOf(zzbVar.zzj()) : null);
        contentValues.put("data", zzbv);
        try {
            if (m3599w().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().m3914B().m3996b("Failed to insert event filter (got -1). appId", C0919v4.m3906q(str));
            return true;
        } catch (SQLiteException e10) {
            zzj().m3914B().m3997c("Error storing event filter. appId", C0919v4.m3906q(str), e10);
            return false;
        }
    }

    /* renamed from: b0 */
    public final boolean m3585b0(String str, int i10, zzew.zze zzeVar) {
        m4002p();
        mo3099i();
        C2394s.m9613f(str);
        C2394s.m9619l(zzeVar);
        if (zzeVar.zze().isEmpty()) {
            zzj().m3919G().m3998d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", C0919v4.m3906q(str), Integer.valueOf(i10), String.valueOf(zzeVar.zzi() ? Integer.valueOf(zzeVar.zza()) : null));
            return false;
        }
        byte[] zzbv = zzeVar.zzbv();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("audience_id", Integer.valueOf(i10));
        contentValues.put("filter_id", zzeVar.zzi() ? Integer.valueOf(zzeVar.zza()) : null);
        contentValues.put("property_name", zzeVar.zze());
        contentValues.put("session_scoped", zzeVar.zzj() ? Boolean.valueOf(zzeVar.zzh()) : null);
        contentValues.put("data", zzbv);
        try {
            if (m3599w().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().m3914B().m3996b("Failed to insert property filter (got -1). appId", C0919v4.m3906q(str));
            return false;
        } catch (SQLiteException e10) {
            zzj().m3914B().m3997c("Error storing property filter. appId", C0919v4.m3906q(str), e10);
            return false;
        }
    }

    /* renamed from: c0 */
    public final boolean m3586c0(String str, Bundle bundle) {
        mo3099i();
        m4002p();
        byte[] zzbv = mo3120j().m3455C(new C0956y(this.f3198a, "", str, "dep", 0L, 0L, bundle)).zzbv();
        zzj().m3918F().m3997c("Saving default event parameters, appId, data size", mo3094d().m3857c(str), Integer.valueOf(zzbv.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put(io.flutter.plugins.firebase.analytics.Constants.PARAMETERS, zzbv);
        try {
            if (m3599w().insertWithOnConflict("default_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().m3914B().m3996b("Failed to insert default event parameters (got -1). appId", C0919v4.m3906q(str));
            return false;
        } catch (SQLiteException e10) {
            zzj().m3914B().m3997c("Error storing default event parameters. appId", C0919v4.m3906q(str), e10);
            return false;
        }
    }

    /* renamed from: d0 */
    public final boolean m3587d0(String str, C0856qb c0856qb) {
        mo3099i();
        m4002p();
        C2394s.m9619l(c0856qb);
        C2394s.m9613f(str);
        long mo14932a = zzb().mo14932a();
        if (c0856qb.f3486i < mo14932a - C0718h.m3259H() || c0856qb.f3486i > C0718h.m3259H() + mo14932a) {
            zzj().m3919G().m3998d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", C0919v4.m3906q(str), Long.valueOf(mo14932a), Long.valueOf(c0856qb.f3486i));
        }
        zzj().m3918F().m3995a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", c0856qb.f3485h);
        contentValues.put("source", Integer.valueOf(c0856qb.f3487j));
        contentValues.put("timestamp_millis", Long.valueOf(c0856qb.f3486i));
        try {
            if (m3599w().insert("trigger_uris", null, contentValues) != -1) {
                return true;
            }
            zzj().m3914B().m3996b("Failed to insert trigger URI (got -1). appId", C0919v4.m3906q(str));
            return false;
        } catch (SQLiteException e10) {
            zzj().m3914B().m3997c("Error storing trigger URI. appId", C0919v4.m3906q(str), e10);
            return false;
        }
    }

    /* renamed from: e0 */
    public final boolean m3588e0(String str, Long l10, long j10, zzfi.zze zzeVar) {
        mo3099i();
        m4002p();
        C2394s.m9619l(zzeVar);
        C2394s.m9613f(str);
        C2394s.m9619l(l10);
        byte[] zzbv = zzeVar.zzbv();
        zzj().m3918F().m3997c("Saving complex main event, appId, data size", mo3094d().m3857c(str), Integer.valueOf(zzbv.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", zzbv);
        try {
            if (m3599w().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().m3914B().m3996b("Failed to insert complex main event (got -1). appId", C0919v4.m3906q(str));
            return false;
        } catch (SQLiteException e10) {
            zzj().m3914B().m3997c("Error storing complex main event. appId", C0919v4.m3906q(str), e10);
            return false;
        }
    }

    /* renamed from: p0 */
    public final boolean m3589p0() {
        return zza().getDatabasePath("google_app_measurement.db").exists();
    }

    /* renamed from: q0 */
    public final long m3590q0(String str) {
        C2394s.m9613f(str);
        return m3545B("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* renamed from: r0 */
    public final long m3591r0(String str, String str2) {
        C2394s.m9613f(str);
        C2394s.m9613f(str2);
        mo3099i();
        m4002p();
        SQLiteDatabase m3599w = m3599w();
        m3599w.beginTransaction();
        long j10 = 0;
        try {
            try {
                long m3545B = m3545B("select " + str2 + " from app2 where app_id=?", new String[]{str}, -1L);
                if (m3545B == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (m3599w.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        zzj().m3914B().m3997c("Failed to insert column (got -1). appId", C0919v4.m3906q(str), str2);
                        return -1L;
                    }
                    m3545B = 0;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put(str2, Long.valueOf(1 + m3545B));
                    if (m3599w.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        zzj().m3914B().m3997c("Failed to update column (got 0). appId", C0919v4.m3906q(str), str2);
                        return -1L;
                    }
                    m3599w.setTransactionSuccessful();
                    return m3545B;
                } catch (SQLiteException e10) {
                    e = e10;
                    j10 = m3545B;
                    zzj().m3914B().m3998d("Error inserting column. appId", C0919v4.m3906q(str), str2, e);
                    m3599w.endTransaction();
                    return j10;
                }
            } finally {
                m3599w.endTransaction();
            }
        } catch (SQLiteException e11) {
            e = e11;
        }
    }

    @Override // p034c7.AbstractC0954xb
    /* renamed from: s */
    public final boolean mo3126s() {
        return false;
    }

    /* renamed from: s0 */
    public final long m3592s0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = m3599w().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j10 = rawQuery.getLong(0);
                rawQuery.close();
                return j10;
            } catch (SQLiteException e10) {
                zzj().m3914B().m3997c("Database error", str, e10);
                throw e10;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* renamed from: t */
    public final long m3593t() {
        Cursor cursor = null;
        try {
            try {
                cursor = m3599w().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return -1L;
                }
                long j10 = cursor.getLong(0);
                cursor.close();
                return j10;
            } catch (SQLiteException e10) {
                zzj().m3914B().m3996b("Error querying raw events", e10);
                if (cursor != null) {
                    cursor.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0097, code lost:
    
        zzj().m3914B().m3996b("Read more than the max allowed user properties, ignoring excess", 1000);
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0122  */
    /* renamed from: t0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<p034c7.C0815nc> m3594t0(java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c7.C0788m.m3594t0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: u */
    public final long m3595u() {
        return m3545B("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    /* renamed from: u0 */
    public final boolean m3596u0(String str, List<Integer> list) {
        C2394s.m9613f(str);
        m4002p();
        mo3099i();
        SQLiteDatabase m3599w = m3599w();
        try {
            long m3592s0 = m3592s0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, mo3092a().m3283q(str, C0733i0.f3051H)));
            if (m3592s0 <= max) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < list.size(); i10++) {
                Integer num = list.get(i10);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String str2 = "(" + TextUtils.join(",", arrayList) + ")";
            StringBuilder sb2 = new StringBuilder("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb2.append(str2);
            sb2.append(" order by rowid desc limit -1 offset ?)");
            return m3599w.delete("audience_filter_values", sb2.toString(), new String[]{str, Integer.toString(max)}) > 0;
        } catch (SQLiteException e10) {
            zzj().m3914B().m3997c("Database error querying filters. appId", C0919v4.m3906q(str), e10);
            return false;
        }
    }

    /* renamed from: v */
    public final long m3597v() {
        return m3545B("select max(timestamp) from raw_events", null, 0L);
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0083: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:29:0x0083 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* renamed from: v0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle m3598v0(java.lang.String r6) {
        /*
            r5 = this;
            r5.mo3099i()
            r5.m4002p()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r5.m3599w()     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            java.lang.String r2 = "select parameters from default_event_params where app_id=?"
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            r4 = 0
            r3[r4] = r6     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            android.database.Cursor r1 = r1.rawQuery(r2, r3)     // Catch: java.lang.Throwable -> L6b android.database.sqlite.SQLiteException -> L6d
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            if (r2 != 0) goto L2e
            c7.v4 r6 = r5.zzj()     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            c7.x4 r6 = r6.m3918F()     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            java.lang.String r2 = "Default event parameters not found"
            r6.m3995a(r2)     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            r1.close()
            return r0
        L2e:
            byte[] r2 = r1.getBlob(r4)     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            com.google.android.gms.internal.measurement.zzfi$zze$zza r3 = com.google.android.gms.internal.measurement.zzfi.zze.zze()     // Catch: java.io.IOException -> L53 android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            com.google.android.gms.internal.measurement.zzku r2 = p034c7.C0745ic.m3435E(r3, r2)     // Catch: java.io.IOException -> L53 android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            com.google.android.gms.internal.measurement.zzfi$zze$zza r2 = (com.google.android.gms.internal.measurement.zzfi.zze.zza) r2     // Catch: java.io.IOException -> L53 android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            com.google.android.gms.internal.measurement.zzkr r2 = r2.zzah()     // Catch: java.io.IOException -> L53 android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            com.google.android.gms.internal.measurement.zzjf r2 = (com.google.android.gms.internal.measurement.zzjf) r2     // Catch: java.io.IOException -> L53 android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            com.google.android.gms.internal.measurement.zzfi$zze r2 = (com.google.android.gms.internal.measurement.zzfi.zze) r2     // Catch: java.io.IOException -> L53 android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            r5.mo3120j()     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            java.util.List r6 = r2.zzh()     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            android.os.Bundle r6 = p034c7.C0745ic.m3452w(r6)     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            r1.close()
            return r6
        L53:
            r2 = move-exception
            c7.v4 r3 = r5.zzj()     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            c7.x4 r3 = r3.m3914B()     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r6 = p034c7.C0919v4.m3906q(r6)     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            r3.m3997c(r4, r6, r2)     // Catch: android.database.sqlite.SQLiteException -> L69 java.lang.Throwable -> L82
            r1.close()
            return r0
        L69:
            r6 = move-exception
            goto L6f
        L6b:
            r6 = move-exception
            goto L84
        L6d:
            r6 = move-exception
            r1 = r0
        L6f:
            c7.v4 r2 = r5.zzj()     // Catch: java.lang.Throwable -> L82
            c7.x4 r2 = r2.m3914B()     // Catch: java.lang.Throwable -> L82
            java.lang.String r3 = "Error selecting default event parameters"
            r2.m3996b(r3, r6)     // Catch: java.lang.Throwable -> L82
            if (r1 == 0) goto L81
            r1.close()
        L81:
            return r0
        L82:
            r6 = move-exception
            r0 = r1
        L84:
            if (r0 == 0) goto L89
            r0.close()
        L89:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c7.C0788m.m3598v0(java.lang.String):android.os.Bundle");
    }

    /* renamed from: w */
    public final SQLiteDatabase m3599w() {
        mo3099i();
        try {
            return this.f3306d.getWritableDatabase();
        } catch (SQLiteException e10) {
            zzj().m3919G().m3996b("Error opening database", e10);
            throw e10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0123  */
    /* renamed from: w0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p034c7.C0690f m3600w0(java.lang.String r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c7.C0788m.m3600w0(java.lang.String, java.lang.String):c7.f");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.database.Cursor] */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m3601x() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.m3599w()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L25
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            if (r2 == 0) goto L1a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            r0.close()
            return r1
        L1a:
            r0.close()
            return r1
        L1e:
            r2 = move-exception
            goto L27
        L20:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L3b
        L25:
            r2 = move-exception
            r0 = r1
        L27:
            c7.v4 r3 = r6.zzj()     // Catch: java.lang.Throwable -> L3a
            c7.x4 r3 = r3.m3914B()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.m3996b(r4, r2)     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L39
            r0.close()
        L39:
            return r1
        L3a:
            r1 = move-exception
        L3b:
            if (r0 == 0) goto L40
            r0.close()
        L40:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c7.C0788m.m3601x():java.lang.String");
    }

    /* JADX WARN: Not initialized variable reg: 14, insn: 0x0147: MOVE (r18 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]), block:B:69:0x0147 */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0142  */
    /* renamed from: x0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p034c7.C0648c0 m3602x0(java.lang.String r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c7.C0788m.m3602x0(java.lang.String, java.lang.String):c7.c0");
    }

    /* renamed from: y */
    public final int m3603y(String str, String str2) {
        C2394s.m9613f(str);
        C2394s.m9613f(str2);
        mo3099i();
        m4002p();
        try {
            return m3599w().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            zzj().m3914B().m3998d("Error deleting conditional property", C0919v4.m3906q(str), mo3094d().m3860g(str2), e10);
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0191 A[Catch: SQLiteException -> 0x02aa, all -> 0x02d3, TryCatch #1 {SQLiteException -> 0x02aa, blocks: (B:14:0x007d, B:16:0x00de, B:20:0x00e8, B:23:0x0132, B:25:0x0161, B:29:0x016b, B:32:0x0186, B:34:0x0191, B:35:0x01a3, B:37:0x01a9, B:39:0x01b5, B:41:0x01c1, B:42:0x01ca, B:44:0x01d0, B:46:0x01dc, B:48:0x01e4, B:51:0x01ed, B:53:0x01fc, B:55:0x0205, B:57:0x021d, B:59:0x0229, B:60:0x023b, B:62:0x0241, B:64:0x024d, B:66:0x0255, B:69:0x025e, B:71:0x0261, B:73:0x0267, B:75:0x0273, B:78:0x0289, B:79:0x027d, B:82:0x0285, B:84:0x028c, B:86:0x0295, B:90:0x0182, B:92:0x012d), top: B:13:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01a9 A[Catch: SQLiteException -> 0x02aa, all -> 0x02d3, TryCatch #1 {SQLiteException -> 0x02aa, blocks: (B:14:0x007d, B:16:0x00de, B:20:0x00e8, B:23:0x0132, B:25:0x0161, B:29:0x016b, B:32:0x0186, B:34:0x0191, B:35:0x01a3, B:37:0x01a9, B:39:0x01b5, B:41:0x01c1, B:42:0x01ca, B:44:0x01d0, B:46:0x01dc, B:48:0x01e4, B:51:0x01ed, B:53:0x01fc, B:55:0x0205, B:57:0x021d, B:59:0x0229, B:60:0x023b, B:62:0x0241, B:64:0x024d, B:66:0x0255, B:69:0x025e, B:71:0x0261, B:73:0x0267, B:75:0x0273, B:78:0x0289, B:79:0x027d, B:82:0x0285, B:84:0x028c, B:86:0x0295, B:90:0x0182, B:92:0x012d), top: B:13:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d0 A[Catch: SQLiteException -> 0x02aa, all -> 0x02d3, TryCatch #1 {SQLiteException -> 0x02aa, blocks: (B:14:0x007d, B:16:0x00de, B:20:0x00e8, B:23:0x0132, B:25:0x0161, B:29:0x016b, B:32:0x0186, B:34:0x0191, B:35:0x01a3, B:37:0x01a9, B:39:0x01b5, B:41:0x01c1, B:42:0x01ca, B:44:0x01d0, B:46:0x01dc, B:48:0x01e4, B:51:0x01ed, B:53:0x01fc, B:55:0x0205, B:57:0x021d, B:59:0x0229, B:60:0x023b, B:62:0x0241, B:64:0x024d, B:66:0x0255, B:69:0x025e, B:71:0x0261, B:73:0x0267, B:75:0x0273, B:78:0x0289, B:79:0x027d, B:82:0x0285, B:84:0x028c, B:86:0x0295, B:90:0x0182, B:92:0x012d), top: B:13:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01fc A[Catch: SQLiteException -> 0x02aa, all -> 0x02d3, TryCatch #1 {SQLiteException -> 0x02aa, blocks: (B:14:0x007d, B:16:0x00de, B:20:0x00e8, B:23:0x0132, B:25:0x0161, B:29:0x016b, B:32:0x0186, B:34:0x0191, B:35:0x01a3, B:37:0x01a9, B:39:0x01b5, B:41:0x01c1, B:42:0x01ca, B:44:0x01d0, B:46:0x01dc, B:48:0x01e4, B:51:0x01ed, B:53:0x01fc, B:55:0x0205, B:57:0x021d, B:59:0x0229, B:60:0x023b, B:62:0x0241, B:64:0x024d, B:66:0x0255, B:69:0x025e, B:71:0x0261, B:73:0x0267, B:75:0x0273, B:78:0x0289, B:79:0x027d, B:82:0x0285, B:84:0x028c, B:86:0x0295, B:90:0x0182, B:92:0x012d), top: B:13:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x021d A[Catch: SQLiteException -> 0x02aa, all -> 0x02d3, TryCatch #1 {SQLiteException -> 0x02aa, blocks: (B:14:0x007d, B:16:0x00de, B:20:0x00e8, B:23:0x0132, B:25:0x0161, B:29:0x016b, B:32:0x0186, B:34:0x0191, B:35:0x01a3, B:37:0x01a9, B:39:0x01b5, B:41:0x01c1, B:42:0x01ca, B:44:0x01d0, B:46:0x01dc, B:48:0x01e4, B:51:0x01ed, B:53:0x01fc, B:55:0x0205, B:57:0x021d, B:59:0x0229, B:60:0x023b, B:62:0x0241, B:64:0x024d, B:66:0x0255, B:69:0x025e, B:71:0x0261, B:73:0x0267, B:75:0x0273, B:78:0x0289, B:79:0x027d, B:82:0x0285, B:84:0x028c, B:86:0x0295, B:90:0x0182, B:92:0x012d), top: B:13:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0241 A[Catch: SQLiteException -> 0x02aa, all -> 0x02d3, TryCatch #1 {SQLiteException -> 0x02aa, blocks: (B:14:0x007d, B:16:0x00de, B:20:0x00e8, B:23:0x0132, B:25:0x0161, B:29:0x016b, B:32:0x0186, B:34:0x0191, B:35:0x01a3, B:37:0x01a9, B:39:0x01b5, B:41:0x01c1, B:42:0x01ca, B:44:0x01d0, B:46:0x01dc, B:48:0x01e4, B:51:0x01ed, B:53:0x01fc, B:55:0x0205, B:57:0x021d, B:59:0x0229, B:60:0x023b, B:62:0x0241, B:64:0x024d, B:66:0x0255, B:69:0x025e, B:71:0x0261, B:73:0x0267, B:75:0x0273, B:78:0x0289, B:79:0x027d, B:82:0x0285, B:84:0x028c, B:86:0x0295, B:90:0x0182, B:92:0x012d), top: B:13:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0267 A[Catch: SQLiteException -> 0x02aa, all -> 0x02d3, TryCatch #1 {SQLiteException -> 0x02aa, blocks: (B:14:0x007d, B:16:0x00de, B:20:0x00e8, B:23:0x0132, B:25:0x0161, B:29:0x016b, B:32:0x0186, B:34:0x0191, B:35:0x01a3, B:37:0x01a9, B:39:0x01b5, B:41:0x01c1, B:42:0x01ca, B:44:0x01d0, B:46:0x01dc, B:48:0x01e4, B:51:0x01ed, B:53:0x01fc, B:55:0x0205, B:57:0x021d, B:59:0x0229, B:60:0x023b, B:62:0x0241, B:64:0x024d, B:66:0x0255, B:69:0x025e, B:71:0x0261, B:73:0x0267, B:75:0x0273, B:78:0x0289, B:79:0x027d, B:82:0x0285, B:84:0x028c, B:86:0x0295, B:90:0x0182, B:92:0x012d), top: B:13:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x027d A[Catch: SQLiteException -> 0x02aa, all -> 0x02d3, TryCatch #1 {SQLiteException -> 0x02aa, blocks: (B:14:0x007d, B:16:0x00de, B:20:0x00e8, B:23:0x0132, B:25:0x0161, B:29:0x016b, B:32:0x0186, B:34:0x0191, B:35:0x01a3, B:37:0x01a9, B:39:0x01b5, B:41:0x01c1, B:42:0x01ca, B:44:0x01d0, B:46:0x01dc, B:48:0x01e4, B:51:0x01ed, B:53:0x01fc, B:55:0x0205, B:57:0x021d, B:59:0x0229, B:60:0x023b, B:62:0x0241, B:64:0x024d, B:66:0x0255, B:69:0x025e, B:71:0x0261, B:73:0x0267, B:75:0x0273, B:78:0x0289, B:79:0x027d, B:82:0x0285, B:84:0x028c, B:86:0x0295, B:90:0x0182, B:92:0x012d), top: B:13:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0295 A[Catch: SQLiteException -> 0x02aa, all -> 0x02d3, TRY_LEAVE, TryCatch #1 {SQLiteException -> 0x02aa, blocks: (B:14:0x007d, B:16:0x00de, B:20:0x00e8, B:23:0x0132, B:25:0x0161, B:29:0x016b, B:32:0x0186, B:34:0x0191, B:35:0x01a3, B:37:0x01a9, B:39:0x01b5, B:41:0x01c1, B:42:0x01ca, B:44:0x01d0, B:46:0x01dc, B:48:0x01e4, B:51:0x01ed, B:53:0x01fc, B:55:0x0205, B:57:0x021d, B:59:0x0229, B:60:0x023b, B:62:0x0241, B:64:0x024d, B:66:0x0255, B:69:0x025e, B:71:0x0261, B:73:0x0267, B:75:0x0273, B:78:0x0289, B:79:0x027d, B:82:0x0285, B:84:0x028c, B:86:0x0295, B:90:0x0182, B:92:0x012d), top: B:13:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0182 A[Catch: SQLiteException -> 0x02aa, all -> 0x02d3, TryCatch #1 {SQLiteException -> 0x02aa, blocks: (B:14:0x007d, B:16:0x00de, B:20:0x00e8, B:23:0x0132, B:25:0x0161, B:29:0x016b, B:32:0x0186, B:34:0x0191, B:35:0x01a3, B:37:0x01a9, B:39:0x01b5, B:41:0x01c1, B:42:0x01ca, B:44:0x01d0, B:46:0x01dc, B:48:0x01e4, B:51:0x01ed, B:53:0x01fc, B:55:0x0205, B:57:0x021d, B:59:0x0229, B:60:0x023b, B:62:0x0241, B:64:0x024d, B:66:0x0255, B:69:0x025e, B:71:0x0261, B:73:0x0267, B:75:0x0273, B:78:0x0289, B:79:0x027d, B:82:0x0285, B:84:0x028c, B:86:0x0295, B:90:0x0182, B:92:0x012d), top: B:13:0x007d }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012d A[Catch: SQLiteException -> 0x02aa, all -> 0x02d3, TryCatch #1 {SQLiteException -> 0x02aa, blocks: (B:14:0x007d, B:16:0x00de, B:20:0x00e8, B:23:0x0132, B:25:0x0161, B:29:0x016b, B:32:0x0186, B:34:0x0191, B:35:0x01a3, B:37:0x01a9, B:39:0x01b5, B:41:0x01c1, B:42:0x01ca, B:44:0x01d0, B:46:0x01dc, B:48:0x01e4, B:51:0x01ed, B:53:0x01fc, B:55:0x0205, B:57:0x021d, B:59:0x0229, B:60:0x023b, B:62:0x0241, B:64:0x024d, B:66:0x0255, B:69:0x025e, B:71:0x0261, B:73:0x0267, B:75:0x0273, B:78:0x0289, B:79:0x027d, B:82:0x0285, B:84:0x028c, B:86:0x0295, B:90:0x0182, B:92:0x012d), top: B:13:0x007d }] */
    /* renamed from: y0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p034c7.C0710g5 m3604y0(java.lang.String r43) {
        /*
            Method dump skipped, instructions count: 731
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c7.C0788m.m3604y0(java.lang.String):c7.g5");
    }

    /* renamed from: z */
    public final long m3605z(zzfi.zzj zzjVar) {
        mo3099i();
        m4002p();
        C2394s.m9619l(zzjVar);
        C2394s.m9613f(zzjVar.zzx());
        byte[] zzbv = zzjVar.zzbv();
        long m3472v = mo3120j().m3472v(zzbv);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", zzjVar.zzx());
        contentValues.put("metadata_fingerprint", Long.valueOf(m3472v));
        contentValues.put("metadata", zzbv);
        try {
            m3599w().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return m3472v;
        } catch (SQLiteException e10) {
            zzj().m3914B().m3997c("Error storing raw event metadata. appId", C0919v4.m3906q(zzjVar.zzx()), e10);
            throw e10;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0084: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:27:0x0084 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* renamed from: z0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p034c7.C0816o m3606z0(java.lang.String r12) {
        /*
            r11 = this;
            p108h6.C2394s.m9613f(r12)
            r11.mo3099i()
            r11.m4002p()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r11.m3599w()     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a
            java.lang.String r2 = "apps"
            java.lang.String r3 = "remote_config"
            java.lang.String r4 = "config_last_modified_time"
            java.lang.String r5 = "e_tag"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4, r5}     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a
            java.lang.String r4 = "app_id=?"
            r9 = 1
            java.lang.String[] r5 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a
            r10 = 0
            r5[r10] = r12     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L68 android.database.sqlite.SQLiteException -> L6a
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            if (r2 != 0) goto L33
            r1.close()
            return r0
        L33:
            byte[] r2 = r1.getBlob(r10)     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            java.lang.String r3 = r1.getString(r9)     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            r4 = 2
            java.lang.String r4 = r1.getString(r4)     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            boolean r5 = r1.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            if (r5 == 0) goto L57
            c7.v4 r5 = r11.zzj()     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            c7.x4 r5 = r5.m3914B()     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            java.lang.String r6 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r7 = p034c7.C0919v4.m3906q(r12)     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            r5.m3996b(r6, r7)     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
        L57:
            if (r2 != 0) goto L5d
            r1.close()
            return r0
        L5d:
            c7.o r5 = new c7.o     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            r5.<init>(r2, r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L66 java.lang.Throwable -> L83
            r1.close()
            return r5
        L66:
            r2 = move-exception
            goto L6c
        L68:
            r12 = move-exception
            goto L85
        L6a:
            r2 = move-exception
            r1 = r0
        L6c:
            c7.v4 r3 = r11.zzj()     // Catch: java.lang.Throwable -> L83
            c7.x4 r3 = r3.m3914B()     // Catch: java.lang.Throwable -> L83
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r12 = p034c7.C0919v4.m3906q(r12)     // Catch: java.lang.Throwable -> L83
            r3.m3997c(r4, r12, r2)     // Catch: java.lang.Throwable -> L83
            if (r1 == 0) goto L82
            r1.close()
        L82:
            return r0
        L83:
            r12 = move-exception
            r0 = r1
        L85:
            if (r0 == 0) goto L8a
            r0.close()
        L8a:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p034c7.C0788m.m3606z0(java.lang.String):c7.o");
    }
}
