.class public final Lc7/m;
.super Lc7/xb;
.source ""


# static fields
.field public static final f:[Ljava/lang/String;

.field public static final g:[Ljava/lang/String;

.field public static final h:[Ljava/lang/String;

.field public static final i:[Ljava/lang/String;

.field public static final j:[Ljava/lang/String;

.field public static final k:[Ljava/lang/String;

.field public static final l:[Ljava/lang/String;

.field public static final m:[Ljava/lang/String;

.field public static final n:[Ljava/lang/String;

.field public static final o:[Ljava/lang/String;


# instance fields
.field public final d:Lc7/s;

.field public final e:Lc7/rb;


# direct methods
.method public static constructor <clinit>()V
    .locals 75

    const-string v0, "last_bundled_timestamp"

    const-string v1, "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;"

    const-string v2, "last_bundled_day"

    const-string v3, "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;"

    const-string v4, "last_sampled_complex_event_id"

    const-string v5, "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;"

    const-string v6, "last_sampling_rate"

    const-string v7, "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;"

    const-string v8, "last_exempt_from_sampling"

    const-string v9, "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;"

    const-string v10, "current_session_count"

    const-string v11, "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"

    filled-new-array/range {v0 .. v11}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lc7/m;->f:[Ljava/lang/String;

    const-string v0, "origin"

    const-string v1, "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lc7/m;->g:[Ljava/lang/String;

    const-string v1, "app_version"

    const-string v2, "ALTER TABLE apps ADD COLUMN app_version TEXT;"

    const-string v3, "app_store"

    const-string v4, "ALTER TABLE apps ADD COLUMN app_store TEXT;"

    const-string v5, "gmp_version"

    const-string v6, "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;"

    const-string v7, "dev_cert_hash"

    const-string v8, "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;"

    const-string v9, "measurement_enabled"

    const-string v10, "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;"

    const-string v11, "last_bundle_start_timestamp"

    const-string v12, "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;"

    const-string v13, "day"

    const-string v14, "ALTER TABLE apps ADD COLUMN day INTEGER;"

    const-string v15, "daily_public_events_count"

    const-string v16, "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;"

    const-string v17, "daily_events_count"

    const-string v18, "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;"

    const-string v19, "daily_conversions_count"

    const-string v20, "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;"

    const-string v21, "remote_config"

    const-string v22, "ALTER TABLE apps ADD COLUMN remote_config BLOB;"

    const-string v23, "config_fetched_time"

    const-string v24, "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;"

    const-string v25, "failed_config_fetch_time"

    const-string v26, "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;"

    const-string v27, "app_version_int"

    const-string v28, "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;"

    const-string v29, "firebase_instance_id"

    const-string v30, "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;"

    const-string v31, "daily_error_events_count"

    const-string v32, "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;"

    const-string v33, "daily_realtime_events_count"

    const-string v34, "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;"

    const-string v35, "health_monitor_sample"

    const-string v36, "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;"

    const-string v37, "android_id"

    const-string v38, "ALTER TABLE apps ADD COLUMN android_id INTEGER;"

    const-string v39, "adid_reporting_enabled"

    const-string v40, "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;"

    const-string v41, "ssaid_reporting_enabled"

    const-string v42, "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;"

    const-string v43, "admob_app_id"

    const-string v44, "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;"

    const-string v45, "linked_admob_app_id"

    const-string v46, "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;"

    const-string v47, "dynamite_version"

    const-string v48, "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;"

    const-string v49, "safelisted_events"

    const-string v50, "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;"

    const-string v51, "ga_app_id"

    const-string v52, "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;"

    const-string v53, "config_last_modified_time"

    const-string v54, "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;"

    const-string v55, "e_tag"

    const-string v56, "ALTER TABLE apps ADD COLUMN e_tag TEXT;"

    const-string v57, "session_stitching_token"

    const-string v58, "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;"

    const-string v59, "sgtm_upload_enabled"

    const-string v60, "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;"

    const-string v61, "target_os_version"

    const-string v62, "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;"

    const-string v63, "session_stitching_token_hash"

    const-string v64, "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;"

    const-string v65, "ad_services_version"

    const-string v66, "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;"

    const-string v67, "unmatched_first_open_without_ad_id"

    const-string v68, "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;"

    const-string v69, "npa_metadata_value"

    const-string v70, "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;"

    const-string v71, "attribution_eligibility_status"

    const-string v72, "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;"

    const-string v73, "sgtm_preview_key"

    const-string v74, "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;"

    filled-new-array/range {v1 .. v74}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lc7/m;->h:[Ljava/lang/String;

    const-string v0, "realtime"

    const-string v1, "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lc7/m;->i:[Ljava/lang/String;

    const-string v0, "has_realtime"

    const-string v1, "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;"

    const-string v2, "retry_count"

    const-string v3, "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lc7/m;->j:[Ljava/lang/String;

    const-string v0, "session_scoped"

    const-string v1, "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lc7/m;->k:[Ljava/lang/String;

    const-string v1, "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lc7/m;->l:[Ljava/lang/String;

    const-string v0, "previous_install_count"

    const-string v1, "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lc7/m;->m:[Ljava/lang/String;

    const-string v0, "consent_source"

    const-string v1, "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;"

    const-string v2, "dma_consent_settings"

    const-string v3, "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;"

    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lc7/m;->n:[Ljava/lang/String;

    const-string v0, "idempotent"

    const-string v1, "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lc7/m;->o:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lc7/yb;)V
    .locals 2

    invoke-direct {p0, p1}, Lc7/xb;-><init>(Lc7/yb;)V

    new-instance p1, Lc7/rb;

    invoke-virtual {p0}, Lc7/j7;->zzb()Lo6/d;

    move-result-object v0

    invoke-direct {p1, v0}, Lc7/rb;-><init>(Lo6/d;)V

    iput-object p1, p0, Lc7/m;->e:Lc7/rb;

    new-instance p1, Lc7/s;

    invoke-virtual {p0}, Lc7/j7;->zza()Landroid/content/Context;

    move-result-object v0

    const-string v1, "google_app_measurement.db"

    invoke-direct {p1, p0, v0, v1}, Lc7/s;-><init>(Lc7/m;Landroid/content/Context;Ljava/lang/String;)V

    iput-object p1, p0, Lc7/m;->d:Lc7/s;

    return-void
.end method

.method public static synthetic F(Landroid/database/Cursor;)Lc7/n7;
    .locals 2

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {p0, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result p0

    invoke-static {v0, p0}, Lc7/n7;->f(Ljava/lang/String;I)Lc7/n7;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic G(Lc7/m;)Lc7/rb;
    .locals 0

    iget-object p0, p0, Lc7/m;->e:Lc7/rb;

    return-object p0
.end method

.method public static O(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    invoke-static {p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    instance-of v0, p2, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    instance-of v0, p2, Ljava/lang/Long;

    if-eqz v0, :cond_1

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p0, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    return-void

    :cond_1
    instance-of v0, p2, Ljava/lang/Double;

    if-eqz v0, :cond_2

    check-cast p2, Ljava/lang/Double;

    invoke-virtual {p0, p1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Double;)V

    return-void

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Invalid value type"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static bridge synthetic f0()[Ljava/lang/String;
    .locals 1

    sget-object v0, Lc7/m;->m:[Ljava/lang/String;

    return-object v0
.end method

.method public static bridge synthetic g0()[Ljava/lang/String;
    .locals 1

    sget-object v0, Lc7/m;->h:[Ljava/lang/String;

    return-object v0
.end method

.method public static bridge synthetic h0()[Ljava/lang/String;
    .locals 1

    sget-object v0, Lc7/m;->n:[Ljava/lang/String;

    return-object v0
.end method

.method public static bridge synthetic i0()[Ljava/lang/String;
    .locals 1

    sget-object v0, Lc7/m;->f:[Ljava/lang/String;

    return-object v0
.end method

.method public static bridge synthetic j0()[Ljava/lang/String;
    .locals 1

    sget-object v0, Lc7/m;->k:[Ljava/lang/String;

    return-object v0
.end method

.method public static bridge synthetic k0()[Ljava/lang/String;
    .locals 1

    sget-object v0, Lc7/m;->l:[Ljava/lang/String;

    return-object v0
.end method

.method public static bridge synthetic l0()[Ljava/lang/String;
    .locals 1

    sget-object v0, Lc7/m;->j:[Ljava/lang/String;

    return-object v0
.end method

.method public static bridge synthetic m0()[Ljava/lang/String;
    .locals 1

    sget-object v0, Lc7/m;->i:[Ljava/lang/String;

    return-object v0
.end method

.method public static bridge synthetic n0()[Ljava/lang/String;
    .locals 1

    sget-object v0, Lc7/m;->o:[Ljava/lang/String;

    return-object v0
.end method

.method public static bridge synthetic o0()[Ljava/lang/String;
    .locals 1

    sget-object v0, Lc7/m;->g:[Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public final A(Ljava/lang/String;)J
    .locals 6

    invoke-static {p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/xb;->p()V

    :try_start_0
    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v1

    sget-object v2, Lc7/i0;->r:Lc7/m4;

    invoke-virtual {v1, p1, v2}, Lc7/h;->q(Ljava/lang/String;Lc7/m4;)I

    move-result v1

    const v2, 0xf4240

    invoke-static {v2, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    const/4 v2, 0x0

    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v3, "raw_events"

    const-string v4, "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/String;

    aput-object p1, v5, v2

    const/4 v2, 0x1

    aput-object v1, v5, v2

    invoke-virtual {v0, v3, v4, v5}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    int-to-long v0, p1

    return-wide v0

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v2, "Error deleting over the limit events. appId"

    invoke-virtual {v1, v2, p1, v0}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final A0(Ljava/lang/String;Ljava/lang/String;)Lc7/nc;
    .locals 18

    move-object/from16 v8, p2

    invoke-static/range {p1 .. p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static/range {p2 .. p2}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->i()V

    invoke-virtual/range {p0 .. p0}, Lc7/xb;->p()V

    const/4 v9, 0x0

    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v10

    const-string v11, "user_attributes"

    const-string v0, "set_timestamp"

    const-string v1, "value"

    const-string v2, "origin"

    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v12

    const-string v13, "app_id=? and name=?"

    const/4 v0, 0x2

    new-array v14, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v14, v1

    const/4 v2, 0x1

    aput-object v8, v14, v2

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-virtual/range {v10 .. v17}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v10
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-interface {v10}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v3, :cond_0

    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    return-object v9

    :cond_0
    :try_start_2
    invoke-interface {v10, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v5
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object/from16 v11, p0

    :try_start_3
    invoke-virtual {v11, v10, v2}, Lc7/m;->H(Landroid/database/Cursor;I)Ljava/lang/Object;

    move-result-object v7
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-nez v7, :cond_1

    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    return-object v9

    :cond_1
    :try_start_4
    invoke-interface {v10, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    new-instance v0, Lc7/nc;

    move-object v1, v0

    move-object/from16 v2, p1

    move-object/from16 v4, p2

    invoke-direct/range {v1 .. v7}, Lc7/nc;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    invoke-interface {v10}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    const-string v2, "Got multiple records for user property, expected one. appId"

    invoke-static/range {p1 .. p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :cond_2
    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object/from16 v11, p0

    goto :goto_1

    :catch_1
    move-exception v0

    move-object/from16 v11, p0

    goto :goto_0

    :catchall_1
    move-exception v0

    move-object/from16 v11, p0

    goto :goto_2

    :catch_2
    move-exception v0

    move-object/from16 v11, p0

    move-object v10, v9

    :goto_0
    :try_start_5
    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    const-string v2, "Error querying user property. appId"

    invoke-static/range {p1 .. p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->d()Lc7/u4;

    move-result-object v4

    invoke-virtual {v4, v8}, Lc7/u4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4, v0}, Lc7/x4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    if-eqz v10, :cond_3

    invoke-interface {v10}, Landroid/database/Cursor;->close()V

    :cond_3
    return-object v9

    :catchall_2
    move-exception v0

    :goto_1
    move-object v9, v10

    :goto_2
    if-eqz v9, :cond_4

    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    :cond_4
    throw v0
.end method

.method public final B(Ljava/lang/String;[Ljava/lang/String;J)J
    .locals 2

    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v0, p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    invoke-interface {v1, p2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide p1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    return-wide p1

    :cond_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    return-wide p3

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p2

    :try_start_1
    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p3

    invoke-virtual {p3}, Lc7/v4;->B()Lc7/x4;

    move-result-object p3

    const-string p4, "Database error"

    invoke-virtual {p3, p4, p1, p2}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    if-eqz v1, :cond_1

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_1
    throw p1
.end method

.method public final B0(Ljava/lang/String;)Lc7/w;
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzns;->zza()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v0

    sget-object v1, Lc7/i0;->Q0:Lc7/m4;

    invoke-virtual {v0, v1}, Lc7/h;->o(Lc7/m4;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/xb;->p()V

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "select dma_consent_settings from consent_settings where app_id=? limit 1;"

    const-string v1, ""

    invoke-virtual {p0, p1, v0, v1}, Lc7/m;->K(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lc7/w;->c(Ljava/lang/String;)Lc7/w;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    sget-object p1, Lc7/w;->f:Lc7/w;

    return-object p1
.end method

.method public final C(Ljava/lang/String;Ljava/lang/Long;)Landroid/util/Pair;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ")",
            "Landroid/util/Pair<",
            "Lcom/google/android/gms/internal/measurement/zzfi$zze;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/xb;->p()V

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    aput-object v5, v3, v6

    invoke-virtual {v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->F()Lc7/x4;

    move-result-object p1

    const-string p2, "Main event not found"

    invoke-virtual {p1, p2}, Lc7/x4;->a(Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    return-object v0

    :cond_0
    :try_start_2
    invoke-interface {v1, v4}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v2

    invoke-interface {v1, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfi$zze;->zze()Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;

    move-result-object v4

    invoke-static {v4, v2}, Lc7/ic;->E(Lcom/google/android/gms/internal/measurement/zzku;[B)Lcom/google/android/gms/internal/measurement/zzku;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzfi$zze;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-static {v2, v3}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p1
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    return-object p1

    :catch_0
    move-exception v2

    :try_start_5
    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v3

    invoke-virtual {v3}, Lc7/v4;->B()Lc7/x4;

    move-result-object v3

    const-string v4, "Failed to merge main event. appId, eventId"

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v3, v4, p1, p2, v2}, Lc7/x4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    return-object v0

    :catch_1
    move-exception p1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    move-object v1, v0

    :goto_0
    :try_start_6
    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p2

    invoke-virtual {p2}, Lc7/v4;->B()Lc7/x4;

    move-result-object p2

    const-string v2, "Error selecting main event"

    invoke-virtual {p2, v2, p1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    if-eqz v1, :cond_1

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_1
    return-object v0

    :catchall_1
    move-exception p1

    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_2

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_2
    throw p1
.end method

.method public final C0(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/measurement/zzew$zzb;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lc7/xb;->p()V

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-static {p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    new-instance v0, Lu/a;

    invoke-direct {v0}, Lu/a;-><init>()V

    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const/4 v9, 0x0

    :try_start_0
    const-string v2, "event_filters"

    const-string v3, "audience_id"

    const-string v4, "data"

    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, "app_id=? AND event_name=?"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/String;

    const/4 v10, 0x0

    aput-object p1, v5, v10

    const/4 v11, 0x1

    aput-object p2, v5, v11

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v1 .. v8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    invoke-interface {v9}, Landroid/database/Cursor;->moveToFirst()Z

    move-result p2

    if-nez p2, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    return-object p1

    :cond_0
    :try_start_1
    invoke-interface {v9, v11}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object p2
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzew$zzb;->zzc()Lcom/google/android/gms/internal/measurement/zzew$zzb$zza;

    move-result-object v1

    invoke-static {v1, p2}, Lc7/ic;->E(Lcom/google/android/gms/internal/measurement/zzku;[B)Lcom/google/android/gms/internal/measurement/zzku;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/measurement/zzew$zzb$zza;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast p2, Lcom/google/android/gms/internal/measurement/zzew$zzb;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-interface {v9, v10}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-nez v2, :cond_1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-interface {v2, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catch_0
    move-exception p2

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    const-string v2, "Failed to merge filter. appId"

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v2, v3, p2}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z

    move-result p2
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez p2, :cond_0

    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    return-object v0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p2

    :try_start_4
    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->B()Lc7/x4;

    move-result-object v0

    const-string v1, "Database error querying filters. appId"

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v1, p1, p2}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v9, :cond_2

    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    :cond_2
    return-object p1

    :goto_1
    if-eqz v9, :cond_3

    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    :cond_3
    throw p1
.end method

.method public final D(JLjava/lang/String;JZZZZZ)Lc7/r;
    .locals 14

    invoke-static/range {p3 .. p3}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/xb;->p()V

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/String;

    const/4 v2, 0x0

    aput-object p3, v1, v2

    new-instance v3, Lc7/r;

    invoke-direct {v3}, Lc7/r;-><init>()V

    const/4 v4, 0x0

    :try_start_0
    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v13

    const-string v6, "apps"

    const-string v7, "day"

    const-string v8, "daily_events_count"

    const-string v9, "daily_public_events_count"

    const-string v10, "daily_conversions_count"

    const-string v11, "daily_error_events_count"

    const-string v12, "daily_realtime_events_count"

    filled-new-array/range {v7 .. v12}, [Ljava/lang/String;

    move-result-object v7

    const-string v8, "app_id=?"

    new-array v9, v0, [Ljava/lang/String;

    aput-object p3, v9, v2

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v5, v13

    invoke-virtual/range {v5 .. v12}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    invoke-interface {v4}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v5

    if-nez v5, :cond_0

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->G()Lc7/x4;

    move-result-object v0

    const-string v1, "Not updating daily counts, app is not known. appId"

    invoke-static/range {p3 .. p3}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    return-object v3

    :cond_0
    :try_start_1
    invoke-interface {v4, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v5

    cmp-long v2, v5, p1

    if-nez v2, :cond_1

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v5

    iput-wide v5, v3, Lc7/r;->b:J

    const/4 v0, 0x2

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v5

    iput-wide v5, v3, Lc7/r;->a:J

    const/4 v0, 0x3

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v5

    iput-wide v5, v3, Lc7/r;->c:J

    const/4 v0, 0x4

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v5

    iput-wide v5, v3, Lc7/r;->d:J

    const/4 v0, 0x5

    invoke-interface {v4, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v5

    iput-wide v5, v3, Lc7/r;->e:J

    :cond_1
    if-eqz p6, :cond_2

    iget-wide v5, v3, Lc7/r;->b:J

    add-long v5, v5, p4

    iput-wide v5, v3, Lc7/r;->b:J

    :cond_2
    if-eqz p7, :cond_3

    iget-wide v5, v3, Lc7/r;->a:J

    add-long v5, v5, p4

    iput-wide v5, v3, Lc7/r;->a:J

    :cond_3
    if-eqz p8, :cond_4

    iget-wide v5, v3, Lc7/r;->c:J

    add-long v5, v5, p4

    iput-wide v5, v3, Lc7/r;->c:J

    :cond_4
    if-eqz p9, :cond_5

    iget-wide v5, v3, Lc7/r;->d:J

    add-long v5, v5, p4

    iput-wide v5, v3, Lc7/r;->d:J

    :cond_5
    if-eqz p10, :cond_6

    iget-wide v5, v3, Lc7/r;->e:J

    add-long v5, v5, p4

    iput-wide v5, v3, Lc7/r;->e:J

    :cond_6
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    const-string v2, "day"

    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v0, v2, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v2, "daily_public_events_count"

    iget-wide v5, v3, Lc7/r;->a:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v0, v2, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v2, "daily_events_count"

    iget-wide v5, v3, Lc7/r;->b:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v0, v2, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v2, "daily_conversions_count"

    iget-wide v5, v3, Lc7/r;->c:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v0, v2, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v2, "daily_error_events_count"

    iget-wide v5, v3, Lc7/r;->d:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v0, v2, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v2, "daily_realtime_events_count"

    iget-wide v5, v3, Lc7/r;->e:J

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v0, v2, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v2, "apps"

    const-string v5, "app_id=?"

    invoke-virtual {v13, v2, v0, v5, v1}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    return-object v3

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_2
    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    const-string v2, "Error updating daily counts. appId"

    invoke-static/range {p3 .. p3}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v1, v2, v5, v0}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v4, :cond_7

    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    :cond_7
    return-object v3

    :goto_0
    if-eqz v4, :cond_8

    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    :cond_8
    throw v0
.end method

.method public final D0(Ljava/lang/String;)Lc7/n7;
    .locals 4

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/xb;->p()V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzns;->zza()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v0

    sget-object v3, Lc7/i0;->Q0:Lc7/m4;

    invoke-virtual {v0, v3}, Lc7/h;->o(Lc7/m4;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-array v0, v2, [Ljava/lang/String;

    aput-object p1, v0, v1

    sget-object p1, Lc7/p;->a:Lc7/p;

    const-string v1, "select consent_state, consent_source from consent_settings where app_id=? limit 1;"

    invoke-virtual {p0, v1, v0, p1}, Lc7/m;->I(Ljava/lang/String;[Ljava/lang/String;Lc7/t;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lc7/n7;

    if-nez p1, :cond_0

    sget-object p1, Lc7/n7;->c:Lc7/n7;

    :cond_0
    return-object p1

    :cond_1
    new-array v0, v2, [Ljava/lang/String;

    aput-object p1, v0, v1

    const-string p1, "select consent_state from consent_settings where app_id=? limit 1;"

    const-string v1, "G1"

    invoke-virtual {p0, p1, v0, v1}, Lc7/m;->K(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lc7/n7;->e(Ljava/lang/String;)Lc7/n7;

    move-result-object p1

    return-object p1
.end method

.method public final E(JLjava/lang/String;ZZZZZ)Lc7/r;
    .locals 11

    const-wide/16 v4, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    move-wide v1, p1

    move-object v3, p3

    move/from16 v8, p6

    move/from16 v10, p8

    invoke-virtual/range {v0 .. v10}, Lc7/m;->D(JLjava/lang/String;JZZZZZ)Lc7/r;

    move-result-object v0

    return-object v0
.end method

.method public final E0(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/measurement/zzew$zze;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lc7/xb;->p()V

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-static {p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    new-instance v0, Lu/a;

    invoke-direct {v0}, Lu/a;-><init>()V

    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const/4 v9, 0x0

    :try_start_0
    const-string v2, "property_filters"

    const-string v3, "audience_id"

    const-string v4, "data"

    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, "app_id=? AND property_name=?"

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/String;

    const/4 v10, 0x0

    aput-object p1, v5, v10

    const/4 v11, 0x1

    aput-object p2, v5, v11

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v1 .. v8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    invoke-interface {v9}, Landroid/database/Cursor;->moveToFirst()Z

    move-result p2

    if-nez p2, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    return-object p1

    :cond_0
    :try_start_1
    invoke-interface {v9, v11}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object p2
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzew$zze;->zzc()Lcom/google/android/gms/internal/measurement/zzew$zze$zza;

    move-result-object v1

    invoke-static {v1, p2}, Lc7/ic;->E(Lcom/google/android/gms/internal/measurement/zzku;[B)Lcom/google/android/gms/internal/measurement/zzku;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/measurement/zzew$zze$zza;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast p2, Lcom/google/android/gms/internal/measurement/zzew$zze;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-interface {v9, v10}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-nez v2, :cond_1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-interface {v2, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catch_0
    move-exception p2

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    const-string v2, "Failed to merge filter"

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v2, v3, p2}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z

    move-result p2
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez p2, :cond_0

    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    return-object v0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception p2

    :try_start_4
    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->B()Lc7/x4;

    move-result-object v0

    const-string v1, "Database error querying filters. appId"

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v1, p1, p2}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v9, :cond_2

    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    :cond_2
    return-object p1

    :goto_1
    if-eqz v9, :cond_3

    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    :cond_3
    throw p1
.end method

.method public final F0(Ljava/lang/String;)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lc7/qb;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/xb;->p()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    const-string v3, "trigger_uris"

    const-string v4, "trigger_uri"

    const-string v5, "timestamp_millis"

    const-string v6, "source"

    filled-new-array {v4, v5, v6}, [Ljava/lang/String;

    move-result-object v4

    const-string v5, "app_id=?"

    const/4 v11, 0x1

    new-array v6, v11, [Ljava/lang/String;

    const/4 v12, 0x0

    aput-object p1, v6, v12

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-string v9, "rowid"

    const/4 v10, 0x0

    invoke-virtual/range {v2 .. v10}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    return-object v0

    :cond_0
    :try_start_1
    invoke-interface {v1, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    const-string v2, ""

    :cond_1
    invoke-interface {v1, v11}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    const/4 v5, 0x2

    invoke-interface {v1, v5}, Landroid/database/Cursor;->getInt(I)I

    move-result v5

    new-instance v6, Lc7/qb;

    invoke-direct {v6, v2, v3, v4, v5}, Lc7/qb;-><init>(Ljava/lang/String;JI)V

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v2, :cond_0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    return-object v0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_2
    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->B()Lc7/x4;

    move-result-object v2

    const-string v3, "Error querying trigger uris. appId"

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, v3, p1, v0}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v1, :cond_2

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_2
    return-object p1

    :goto_0
    if-eqz v1, :cond_3

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_3
    throw p1
.end method

.method public final G0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    invoke-static {p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/xb;->p()V

    :try_start_0
    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v1, "user_attributes"

    const-string v2, "app_id=? and name=?"

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    const/4 v4, 0x1

    aput-object p2, v3, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0}, Lc7/j7;->d()Lc7/u4;

    move-result-object v2

    invoke-virtual {v2, p2}, Lc7/u4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v2, "Error deleting user property. appId"

    invoke-virtual {v1, v2, p1, p2, v0}, Lc7/x4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final H(Landroid/database/Cursor;I)Ljava/lang/Object;
    .locals 3

    invoke-interface {p1, p2}, Landroid/database/Cursor;->getType(I)I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    const/4 v2, 0x1

    if-eq v0, v2, :cond_3

    const/4 v2, 0x2

    if-eq v0, v2, :cond_2

    const/4 v2, 0x3

    if-eq v0, v2, :cond_1

    const/4 p1, 0x4

    if-eq v0, p1, :cond_0

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->B()Lc7/x4;

    move-result-object p1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const-string v0, "Loaded invalid unknown value type, ignoring it"

    invoke-virtual {p1, v0, p2}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v1

    :cond_0
    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->B()Lc7/x4;

    move-result-object p1

    const-string p2, "Loaded invalid blob type value, ignoring it"

    invoke-virtual {p1, p2}, Lc7/x4;->a(Ljava/lang/String;)V

    return-object v1

    :cond_1
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getDouble(I)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->B()Lc7/x4;

    move-result-object p1

    const-string p2, "Loaded invalid null value from database"

    invoke-virtual {p1, p2}, Lc7/x4;->a(Ljava/lang/String;)V

    return-object v1
.end method

.method public final H0(Ljava/lang/String;)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lc7/nc;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/xb;->p()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    const-string v3, "user_attributes"

    const-string v4, "name"

    const-string v5, "origin"

    const-string v6, "set_timestamp"

    const-string v7, "value"

    filled-new-array {v4, v5, v6, v7}, [Ljava/lang/String;

    move-result-object v4

    const-string v5, "app_id=?"

    const/4 v11, 0x1

    new-array v6, v11, [Ljava/lang/String;

    const/4 v12, 0x0

    aput-object p1, v6, v12

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-string v9, "rowid"

    const-string v10, "1000"

    invoke-virtual/range {v2 .. v10}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    return-object v0

    :cond_0
    :try_start_1
    invoke-interface {v1, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v1, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    const-string v2, ""

    :cond_1
    move-object v5, v2

    const/4 v2, 0x2

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v7

    const/4 v2, 0x3

    invoke-virtual {p0, v1, v2}, Lc7/m;->H(Landroid/database/Cursor;I)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_2

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->B()Lc7/x4;

    move-result-object v2

    const-string v3, "Read invalid user property value, ignoring it. appId"

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    new-instance v2, Lc7/nc;

    move-object v3, v2

    move-object v4, p1

    invoke-direct/range {v3 .. v9}, Lc7/nc;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v2, :cond_0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    return-object v0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    move-exception v0

    :try_start_2
    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->B()Lc7/x4;

    move-result-object v2

    const-string v3, "Error querying user properties. appId"

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, v3, p1, v0}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v1, :cond_3

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_3
    return-object p1

    :goto_1
    if-eqz v1, :cond_4

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_4
    throw p1
.end method

.method public final I(Ljava/lang/String;[Ljava/lang/String;Lc7/t;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            "Lc7/t<",
            "TT;>;)TT;"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result p2

    if-nez p2, :cond_0

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p2

    invoke-virtual {p2}, Lc7/v4;->F()Lc7/x4;

    move-result-object p2

    const-string p3, "No data found"

    invoke-virtual {p2, p3}, Lc7/x4;->a(Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    return-object v0

    :cond_0
    :try_start_2
    invoke-interface {p3, p1}, Lc7/t;->a(Landroid/database/Cursor;)Ljava/lang/Object;

    move-result-object p2
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    return-object p2

    :catch_0
    move-exception p2

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :catch_1
    move-exception p2

    move-object p1, v0

    :goto_0
    :try_start_3
    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p3

    invoke-virtual {p3}, Lc7/v4;->B()Lc7/x4;

    move-result-object p3

    const-string v1, "Error querying database."

    invoke-virtual {p3, v1, p2}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_1
    return-object v0

    :catchall_1
    move-exception p2

    move-object v0, p1

    :goto_1
    if-eqz v0, :cond_2

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_2
    throw p2
.end method

.method public final I0(Ljava/lang/String;)Ljava/util/Map;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lcom/google/android/gms/internal/measurement/zzfi$zzl;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lc7/xb;->p()V

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-static {p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const/4 v8, 0x0

    :try_start_0
    const-string v1, "audience_filter_values"

    const-string v2, "audience_id"

    const-string v3, "current_results"

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    const-string v3, "app_id=?"

    const/4 v9, 0x1

    new-array v4, v9, [Ljava/lang/String;

    const/4 v10, 0x0

    aput-object p1, v4, v10

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v7}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v8

    invoke-interface {v8}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    return-object p1

    :cond_0
    :try_start_1
    new-instance v0, Lu/a;

    invoke-direct {v0}, Lu/a;-><init>()V

    :cond_1
    invoke-interface {v8, v10}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-interface {v8, v9}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v2
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfi$zzl;->zze()Lcom/google/android/gms/internal/measurement/zzfi$zzl$zza;

    move-result-object v3

    invoke-static {v3, v2}, Lc7/ic;->E(Lcom/google/android/gms/internal/measurement/zzku;[B)Lcom/google/android/gms/internal/measurement/zzku;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzfi$zzl$zza;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzfi$zzl;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catch_0
    move-exception v2

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v3

    invoke-virtual {v3}, Lc7/v4;->B()Lc7/x4;

    move-result-object v3

    const-string v4, "Failed to merge filter results. appId, audienceId, error"

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v3, v4, v5, v1, v2}, Lc7/x4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez v1, :cond_1

    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    return-object v0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception v0

    :try_start_4
    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    const-string v2, "Database error querying filter results. appId"

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, v2, p1, v0}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v8, :cond_2

    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    :cond_2
    return-object p1

    :goto_1
    if-eqz v8, :cond_3

    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    :cond_3
    throw p1
.end method

.method public final J(J)Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/xb;->p()V

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    aput-object p1, v3, p2

    invoke-virtual {v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object p1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {p1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p2

    invoke-virtual {p2}, Lc7/v4;->F()Lc7/x4;

    move-result-object p2

    const-string v1, "No expired configs for apps with pending events"

    invoke-virtual {p2, v1}, Lc7/x4;->a(Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    return-object v0

    :cond_0
    :try_start_2
    invoke-interface {p1, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p2
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    return-object p2

    :catch_0
    move-exception p2

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :catch_1
    move-exception p2

    move-object p1, v0

    :goto_0
    :try_start_3
    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    const-string v2, "Error selecting expired configs"

    invoke-virtual {v1, v2, p2}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    :cond_1
    return-object v0

    :catchall_1
    move-exception p2

    move-object v0, p1

    :goto_1
    if-eqz v0, :cond_2

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_2
    throw p2
.end method

.method public final J0(Ljava/lang/String;)Ljava/util/Map;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/measurement/zzew$zzb;",
            ">;>;"
        }
    .end annotation

    invoke-static {p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    new-instance v0, Lu/a;

    invoke-direct {v0}, Lu/a;-><init>()V

    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const/4 v9, 0x0

    :try_start_0
    const-string v2, "event_filters"

    const-string v3, "audience_id"

    const-string v4, "data"

    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, "app_id=?"

    const/4 v10, 0x1

    new-array v5, v10, [Ljava/lang/String;

    const/4 v11, 0x0

    aput-object p1, v5, v11

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v1 .. v8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9

    invoke-interface {v9}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    return-object p1

    :cond_0
    :try_start_1
    invoke-interface {v9, v10}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v1
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzew$zzb;->zzc()Lcom/google/android/gms/internal/measurement/zzew$zzb$zza;

    move-result-object v2

    invoke-static {v2, v1}, Lc7/ic;->E(Lcom/google/android/gms/internal/measurement/zzku;[B)Lcom/google/android/gms/internal/measurement/zzku;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/zzew$zzb$zza;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v1, Lcom/google/android/gms/internal/measurement/zzew$zzb;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual {v1}, Lcom/google/android/gms/internal/measurement/zzew$zzb;->zzk()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v9, v11}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-nez v3, :cond_1

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->B()Lc7/x4;

    move-result-object v2

    const-string v3, "Failed to merge filter. appId"

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v3, v4, v1}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    :goto_0
    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-nez v1, :cond_0

    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    return-object v0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception v0

    :try_start_4
    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    const-string v2, "Database error querying filters. appId"

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, v2, p1, v0}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-eqz v9, :cond_3

    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    :cond_3
    return-object p1

    :goto_1
    if-eqz v9, :cond_4

    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    :cond_4
    throw p1
.end method

.method public final K(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v0, p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    invoke-interface {v1, p2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    return-object p1

    :cond_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    return-object p3

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p2

    :try_start_1
    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p3

    invoke-virtual {p3}, Lc7/v4;->B()Lc7/x4;

    move-result-object p3

    const-string v0, "Database error"

    invoke-virtual {p3, v0, p1, p2}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    if-eqz v1, :cond_1

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_1
    throw p1
.end method

.method public final K0(Ljava/lang/String;)Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lc7/xb;->p()V

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-static {p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    new-instance v0, Lu/a;

    invoke-direct {v0}, Lu/a;-><init>()V

    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const/4 v2, 0x0

    :try_start_0
    const-string v3, "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/String;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    const/4 v6, 0x1

    aput-object p1, v4, v6

    invoke-virtual {v1, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    return-object p1

    :cond_0
    :try_start_1
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-nez v3, :cond_1

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v1, :cond_0

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    return-object v0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_2
    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    const-string v3, "Database error querying scoped filters. appId"

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, v3, p1, v0}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v2, :cond_2

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    :cond_2
    return-object p1

    :goto_0
    if-eqz v2, :cond_3

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    :cond_3
    throw p1
.end method

.method public final L(Ljava/lang/String;II)Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II)",
            "Ljava/util/List<",
            "Landroid/util/Pair<",
            "Lcom/google/android/gms/internal/measurement/zzfi$zzj;",
            "Ljava/lang/Long;",
            ">;>;"
        }
    .end annotation

    move/from16 v1, p3

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->i()V

    invoke-virtual/range {p0 .. p0}, Lc7/xb;->p()V

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-lez p2, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    invoke-static {v0}, Lh6/s;->a(Z)V

    if-lez v1, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v3

    :goto_1
    invoke-static {v0}, Lh6/s;->a(Z)V

    invoke-static/range {p1 .. p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    const/4 v4, 0x0

    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v5

    const-string v6, "queue"

    const-string v0, "rowid"

    const-string v7, "data"

    const-string v8, "retry_count"

    filled-new-array {v0, v7, v8}, [Ljava/lang/String;

    move-result-object v7

    const-string v8, "app_id=?"

    new-array v9, v2, [Ljava/lang/String;

    aput-object p1, v9, v3

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-string v12, "rowid"

    invoke-static/range {p2 .. p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v13

    invoke-virtual/range {v5 .. v13}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v4

    invoke-interface {v4}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    return-object v0

    :cond_2
    :try_start_1
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    move v6, v3

    :goto_2
    invoke-interface {v4, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v7
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-interface {v4, v2}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lc7/ub;->j()Lc7/ic;

    move-result-object v9

    invoke-virtual {v9, v0}, Lc7/ic;->h0([B)[B

    move-result-object v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_3

    array-length v9, v0
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    add-int/2addr v9, v6

    if-gt v9, v1, :cond_c

    :cond_3
    :try_start_4
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzu()Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    move-result-object v9

    invoke-static {v9, v0}, Lc7/ic;->E(Lcom/google/android/gms/internal/measurement/zzku;[B)Lcom/google/android/gms/internal/measurement/zzku;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzns;->zza()Z

    move-result v10

    if-eqz v10, :cond_9

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v10

    sget-object v11, Lc7/i0;->U0:Lc7/m4;

    invoke-virtual {v10, v11}, Lc7/h;->o(Lc7/m4;)Z

    move-result v10

    if-eqz v10, :cond_9

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_9

    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/util/Pair;

    iget-object v10, v10, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v10, Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v11

    check-cast v11, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v11, Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzac()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzac()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzab()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzab()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzas()Z

    move-result v12

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzas()Z

    move-result v13

    if-ne v12, v13, :cond_8

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzad()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzad()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v12, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzaq()Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v12
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    const-string v13, "_npa"

    const-wide/16 v14, -0x1

    if-eqz v12, :cond_5

    :try_start_6
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/google/android/gms/internal/measurement/zzfi$zzn;

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzfi$zzn;->zzg()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v13, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzfi$zzn;->zzc()J

    move-result-wide v16

    goto :goto_4

    :cond_4
    const/4 v2, 0x1

    goto :goto_3

    :cond_5
    move-wide/from16 v16, v14

    :goto_4
    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzaq()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/google/android/gms/internal/measurement/zzfi$zzn;

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfi$zzn;->zzg()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v13, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzfi$zzn;->zzc()J

    move-result-wide v14

    :cond_7
    cmp-long v2, v16, v14

    if-nez v2, :cond_8

    const/4 v2, 0x1

    goto :goto_5

    :cond_8
    move v2, v3

    :goto_5
    if-eqz v2, :cond_c

    :cond_9
    const/4 v2, 0x2

    invoke-interface {v4, v2}, Landroid/database/Cursor;->isNull(I)Z

    move-result v10

    if-nez v10, :cond_a

    invoke-interface {v4, v2}, Landroid/database/Cursor;->getInt(I)I

    move-result v2

    invoke-virtual {v9, v2}, Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;->zzh(I)Lcom/google/android/gms/internal/measurement/zzfi$zzj$zza;

    :cond_a
    array-length v0, v0

    add-int/2addr v6, v0

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v0, Lcom/google/android/gms/internal/measurement/zzfi$zzj;

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object v0

    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :catch_0
    move-exception v0

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->B()Lc7/x4;

    move-result-object v2

    const-string v7, "Failed to merge queued bundle. appId"

    invoke-static/range {p1 .. p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    :goto_6
    invoke-virtual {v2, v7, v8, v0}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_7

    :catch_1
    move-exception v0

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->B()Lc7/x4;

    move-result-object v2

    const-string v7, "Failed to unzip queued bundle. appId"

    invoke-static/range {p1 .. p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v8

    goto :goto_6

    :goto_7
    invoke-interface {v4}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0
    :try_end_6
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    if-eqz v0, :cond_c

    if-le v6, v1, :cond_b

    goto :goto_8

    :cond_b
    const/4 v2, 0x1

    goto/16 :goto_2

    :cond_c
    :goto_8
    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    return-object v5

    :catchall_0
    move-exception v0

    goto :goto_9

    :catch_2
    move-exception v0

    :try_start_7
    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    const-string v2, "Error querying bundles. appId"

    invoke-static/range {p1 .. p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v2, v3, v0}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    if-eqz v4, :cond_d

    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    :cond_d
    return-object v0

    :goto_9
    if-eqz v4, :cond_e

    invoke-interface {v4}, Landroid/database/Cursor;->close()V

    :cond_e
    throw v0
.end method

.method public final L0()V
    .locals 1

    invoke-virtual {p0}, Lc7/xb;->p()V

    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    return-void
.end method

.method public final M(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lc7/f;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/xb;->p()V

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v1, "app_id=?"

    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string p2, " and origin=?"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-static {p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p2

    if-nez p2, :cond_1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "*"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string p2, " and name glob ?"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p2

    new-array p2, p2, [Ljava/lang/String;

    invoke-interface {v0, p2}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lc7/m;->N(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final M0()V
    .locals 1

    invoke-virtual {p0}, Lc7/xb;->p()V

    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    return-void
.end method

.method public final N(Ljava/lang/String;[Ljava/lang/String;)Ljava/util/List;
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lc7/f;",
            ">;"
        }
    .end annotation

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->i()V

    invoke-virtual/range {p0 .. p0}, Lc7/xb;->p()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    const-string v3, "conditional_properties"

    const-string v4, "app_id"

    const-string v5, "origin"

    const-string v6, "name"

    const-string v7, "value"

    const-string v8, "active"

    const-string v9, "trigger_event_name"

    const-string v10, "trigger_timeout"

    const-string v11, "timed_out_event"

    const-string v12, "creation_timestamp"

    const-string v13, "triggered_event"

    const-string v14, "triggered_timestamp"

    const-string v15, "time_to_live"

    const-string v16, "expired_event"

    filled-new-array/range {v4 .. v16}, [Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-string v9, "rowid"

    const-string v10, "1001"

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    invoke-virtual/range {v2 .. v10}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    return-object v0

    :cond_0
    :try_start_1
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    const/16 v3, 0x3e8

    if-lt v2, v3, :cond_1

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->B()Lc7/x4;

    move-result-object v2

    const-string v4, "Read more than the max allowed conditional properties, ignoring extra"

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v4, v3}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_1
    const/4 v2, 0x0

    invoke-interface {v1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    const/4 v3, 0x1

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v11

    const/4 v5, 0x2

    invoke-interface {v1, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    const/4 v5, 0x3

    move-object/from16 v15, p0

    invoke-virtual {v15, v1, v5}, Lc7/m;->H(Landroid/database/Cursor;I)Ljava/lang/Object;

    move-result-object v9

    const/4 v5, 0x4

    invoke-interface {v1, v5}, Landroid/database/Cursor;->getInt(I)I

    move-result v5

    if-eqz v5, :cond_2

    move v2, v3

    :cond_2
    const/4 v3, 0x5

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v12

    const/4 v3, 0x6

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v13

    invoke-virtual/range {p0 .. p0}, Lc7/ub;->j()Lc7/ic;

    move-result-object v3

    const/4 v5, 0x7

    invoke-interface {v1, v5}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v5

    sget-object v7, Lc7/g0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {v3, v5, v7}, Lc7/ic;->y([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object/from16 v16, v3

    check-cast v16, Lc7/g0;

    const/16 v3, 0x8

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v17

    invoke-virtual/range {p0 .. p0}, Lc7/ub;->j()Lc7/ic;

    move-result-object v3

    const/16 v5, 0x9

    invoke-interface {v1, v5}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v5

    invoke-virtual {v3, v5, v7}, Lc7/ic;->y([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object/from16 v19, v3

    check-cast v19, Lc7/g0;

    const/16 v3, 0xa

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v20

    const/16 v3, 0xb

    invoke-interface {v1, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v22

    invoke-virtual/range {p0 .. p0}, Lc7/ub;->j()Lc7/ic;

    move-result-object v3

    const/16 v5, 0xc

    invoke-interface {v1, v5}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v5

    invoke-virtual {v3, v5, v7}, Lc7/ic;->y([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v3

    move-object/from16 v24, v3

    check-cast v24, Lc7/g0;

    new-instance v25, Lc7/lc;

    move-object/from16 v5, v25

    move-wide/from16 v7, v20

    move-object v10, v11

    invoke-direct/range {v5 .. v10}, Lc7/lc;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    new-instance v10, Lc7/f;

    move-object v3, v10

    move-object v5, v11

    move-object/from16 v6, v25

    move-wide/from16 v7, v17

    move v9, v2

    move-object v2, v10

    move-object v10, v12

    move-object/from16 v11, v16

    move-wide v12, v13

    move-object/from16 v14, v19

    move-wide/from16 v15, v22

    move-object/from16 v17, v24

    invoke-direct/range {v3 .. v17}, Lc7/f;-><init>(Ljava/lang/String;Ljava/lang/String;Lc7/lc;JZLjava/lang/String;Lc7/g0;JLc7/g0;JLc7/g0;)V

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v2
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v2, :cond_0

    :goto_0
    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    return-object v0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    :try_start_2
    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->B()Lc7/x4;

    move-result-object v2

    const-string v3, "Error querying conditional user property value"

    invoke-virtual {v2, v3, v0}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v1, :cond_3

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_3
    return-object v0

    :goto_1
    if-eqz v1, :cond_4

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_4
    throw v0
.end method

.method public final N0()V
    .locals 6

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/xb;->p()V

    invoke-virtual {p0}, Lc7/m;->p0()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Lc7/ub;->n()Lc7/xa;

    move-result-object v0

    iget-object v0, v0, Lc7/xa;->e:Lc7/n5;

    invoke-virtual {v0}, Lc7/n5;->a()J

    move-result-wide v0

    invoke-virtual {p0}, Lc7/j7;->zzb()Lo6/d;

    move-result-object v2

    invoke-interface {v2}, Lo6/d;->b()J

    move-result-wide v2

    sub-long v0, v2, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    sget-object v4, Lc7/i0;->A:Lc7/m4;

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Lc7/m4;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Long;

    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    cmp-long v0, v0, v4

    if-lez v0, :cond_1

    invoke-virtual {p0}, Lc7/ub;->n()Lc7/xa;

    move-result-object v0

    iget-object v0, v0, Lc7/xa;->e:Lc7/n5;

    invoke-virtual {v0, v2, v3}, Lc7/n5;->b(J)V

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/xb;->p()V

    invoke-virtual {p0}, Lc7/m;->p0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x0

    invoke-virtual {p0}, Lc7/j7;->zzb()Lo6/d;

    move-result-object v3

    invoke-interface {v3}, Lo6/d;->a()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-static {}, Lc7/h;->H()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const-string v2, "queue"

    const-string v3, "abs(bundle_end_timestamp - ?) > cast(? as integer)"

    invoke-virtual {v0, v2, v3, v1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->F()Lc7/x4;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v2, "Deleted stale rows. rowsDeleted"

    invoke-virtual {v1, v2, v0}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public final O0()V
    .locals 1

    invoke-virtual {p0}, Lc7/xb;->p()V

    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    return-void
.end method

.method public final P(Lc7/c0;)V
    .locals 5

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/xb;->p()V

    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    iget-object v1, p1, Lc7/c0;->a:Ljava/lang/String;

    const-string v2, "app_id"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p1, Lc7/c0;->b:Ljava/lang/String;

    const-string v2, "name"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-wide v1, p1, Lc7/c0;->c:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "lifetime_count"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    iget-wide v1, p1, Lc7/c0;->d:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "current_bundle_count"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    iget-wide v1, p1, Lc7/c0;->f:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "last_fire_timestamp"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    iget-wide v1, p1, Lc7/c0;->g:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "last_bundled_timestamp"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    iget-object v1, p1, Lc7/c0;->h:Ljava/lang/Long;

    const-string v2, "last_bundled_day"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    iget-object v1, p1, Lc7/c0;->i:Ljava/lang/Long;

    const-string v2, "last_sampled_complex_event_id"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    iget-object v1, p1, Lc7/c0;->j:Ljava/lang/Long;

    const-string v2, "last_sampling_rate"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    iget-wide v1, p1, Lc7/c0;->e:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "current_session_count"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    iget-object v1, p1, Lc7/c0;->k:Ljava/lang/Boolean;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_0

    const-wide/16 v3, 0x1

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    const-string v3, "last_exempt_from_sampling"

    invoke-virtual {v0, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    :try_start_0
    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v3, "events"

    const/4 v4, 0x5

    invoke-virtual {v1, v3, v2, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->B()Lc7/x4;

    move-result-object v0

    const-string v1, "Failed to insert/update event aggregates (got -1). appId"

    iget-object v2, p1, Lc7/c0;->a:Ljava/lang/String;

    invoke-static {v2}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-void

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    iget-object p1, p1, Lc7/c0;->a:Ljava/lang/String;

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v2, "Error storing event aggregates. appId"

    invoke-virtual {v1, v2, p1, v0}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final P0()Z
    .locals 4

    const-string v0, "select count(1) > 0 from raw_events"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lc7/m;->s0(Ljava/lang/String;[Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final Q(Lc7/g5;)V
    .locals 8

    const-string v0, "apps"

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/xb;->p()V

    invoke-virtual {p1}, Lc7/g5;->v0()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    const-string v3, "app_id"

    invoke-virtual {v2, v3, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lc7/g5;->w0()Ljava/lang/String;

    move-result-object v3

    const-string v4, "app_instance_id"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lc7/g5;->j()Ljava/lang/String;

    move-result-object v3

    const-string v4, "gmp_app_id"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lc7/g5;->l()Ljava/lang/String;

    move-result-object v3

    const-string v4, "resettable_device_id_hash"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lc7/g5;->m0()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "last_bundle_index"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p1}, Lc7/g5;->o0()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "last_bundle_start_timestamp"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p1}, Lc7/g5;->k0()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "last_bundle_end_timestamp"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p1}, Lc7/g5;->h()Ljava/lang/String;

    move-result-object v3

    const-string v4, "app_version"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lc7/g5;->x0()Ljava/lang/String;

    move-result-object v3

    const-string v4, "app_store"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lc7/g5;->i0()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "gmp_version"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p1}, Lc7/g5;->c0()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "dev_cert_hash"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p1}, Lc7/g5;->s()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const-string v4, "measurement_enabled"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    invoke-virtual {p1}, Lc7/g5;->a0()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "day"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p1}, Lc7/g5;->U()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "daily_public_events_count"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p1}, Lc7/g5;->R()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "daily_events_count"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p1}, Lc7/g5;->L()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "daily_conversions_count"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p1}, Lc7/g5;->I()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "config_fetched_time"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p1}, Lc7/g5;->g0()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "failed_config_fetch_time"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p1}, Lc7/g5;->A()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "app_version_int"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p1}, Lc7/g5;->i()Ljava/lang/String;

    move-result-object v3

    const-string v4, "firebase_instance_id"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lc7/g5;->O()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "daily_error_events_count"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p1}, Lc7/g5;->X()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "daily_realtime_events_count"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p1}, Lc7/g5;->k()Ljava/lang/String;

    move-result-object v3

    const-string v4, "health_monitor_sample"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lc7/g5;->w()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "android_id"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p1}, Lc7/g5;->r()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const-string v4, "adid_reporting_enabled"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    invoke-virtual {p1}, Lc7/g5;->t0()Ljava/lang/String;

    move-result-object v3

    const-string v4, "admob_app_id"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lc7/g5;->e0()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "dynamite_version"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p1}, Lc7/g5;->m()Ljava/lang/String;

    move-result-object v3

    const-string v4, "session_stitching_token"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lc7/g5;->u()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const-string v4, "sgtm_upload_enabled"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    invoke-virtual {p1}, Lc7/g5;->r0()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "target_os_version"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p1}, Lc7/g5;->q0()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "session_stitching_token_hash"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzph;->zza()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v3

    sget-object v4, Lc7/i0;->H0:Lc7/m4;

    invoke-virtual {v3, v1, v4}, Lc7/h;->y(Ljava/lang/String;Lc7/m4;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p1}, Lc7/g5;->a()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "ad_services_version"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-virtual {p1}, Lc7/g5;->E()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "attribution_eligibility_status"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    :cond_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznm;->zza()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v3

    sget-object v4, Lc7/i0;->V0:Lc7/m4;

    invoke-virtual {v3, v1, v4}, Lc7/h;->y(Ljava/lang/String;Lc7/m4;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p1}, Lc7/g5;->v()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const-string v4, "unmatched_first_open_without_ad_id"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    :cond_1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzqa;->zza()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v3

    sget-object v4, Lc7/i0;->w0:Lc7/m4;

    invoke-virtual {v3, v1, v4}, Lc7/h;->y(Ljava/lang/String;Lc7/m4;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p1}, Lc7/g5;->n()Ljava/lang/String;

    move-result-object v3

    const-string v4, "sgtm_preview_key"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    invoke-virtual {p1}, Lc7/g5;->o()Ljava/util/List;

    move-result-object v3

    const-string v4, "safelisted_events"

    if-eqz v3, :cond_4

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v3

    invoke-virtual {v3}, Lc7/v4;->G()Lc7/x4;

    move-result-object v3

    const-string v5, "Safelisted events should not be an empty list. appId"

    invoke-virtual {v3, v5, v1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    const-string v5, ","

    invoke-static {v5, v3}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    :goto_0
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznx;->zza()Z

    move-result v3

    const/4 v5, 0x0

    if-eqz v3, :cond_5

    invoke-virtual {p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v3

    sget-object v6, Lc7/i0;->p0:Lc7/m4;

    invoke-virtual {v3, v6}, Lc7/h;->o(Lc7/m4;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {v2, v4}, Landroid/content/ContentValues;->containsKey(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_5

    invoke-virtual {v2, v4, v5}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzns;->zza()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v3

    sget-object v4, Lc7/i0;->Q0:Lc7/m4;

    invoke-virtual {v3, v1, v4}, Lc7/h;->y(Ljava/lang/String;Lc7/m4;)Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-virtual {p1}, Lc7/g5;->s0()Ljava/lang/Boolean;

    move-result-object p1

    const-string v3, "npa_metadata_value"

    invoke-virtual {v2, v3, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    :cond_6
    :try_start_0
    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    const-string v3, "app_id = ?"

    const/4 v4, 0x1

    new-array v4, v4, [Ljava/lang/String;

    const/4 v6, 0x0

    aput-object v1, v4, v6

    invoke-virtual {p1, v0, v2, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v3

    int-to-long v3, v3

    const-wide/16 v6, 0x0

    cmp-long v3, v3, v6

    if-nez v3, :cond_7

    const/4 v3, 0x5

    invoke-virtual {p1, v0, v5, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long p1, v2, v4

    if-nez p1, :cond_7

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->B()Lc7/x4;

    move-result-object p1

    const-string v0, "Failed to insert/update app (got -1). appId"

    invoke-static {v1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p1, v0, v2}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_7
    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->B()Lc7/x4;

    move-result-object v0

    invoke-static {v1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Error storing app. appId"

    invoke-virtual {v0, v2, v1, p1}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final Q0()Z
    .locals 4

    const-string v0, "select count(1) > 0 from queue where has_realtime = 1"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lc7/m;->s0(Ljava/lang/String;[Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final R(Ljava/lang/String;Lc7/w;)V
    .locals 2

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzns;->zza()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v0

    sget-object v1, Lc7/i0;->Q0:Lc7/m4;

    invoke-virtual {v0, v1}, Lc7/h;->o(Lc7/m4;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/xb;->p()V

    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    const-string v1, "app_id"

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2}, Lc7/w;->i()Ljava/lang/String;

    move-result-object p1

    const-string p2, "dma_consent_settings"

    invoke-virtual {v0, p2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "consent_settings"

    invoke-virtual {p0, p1, v1, v0}, Lc7/m;->T(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public final R0()Z
    .locals 4

    const-string v0, "select count(1) > 0 from raw_events where realtime = 1"

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lc7/m;->s0(Ljava/lang/String;[Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final S(Ljava/lang/String;Lc7/n7;)V
    .locals 5

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/xb;->p()V

    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    const-string v1, "app_id"

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p2}, Lc7/n7;->v()Ljava/lang/String;

    move-result-object v2

    const-string v3, "consent_state"

    invoke-virtual {v0, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzns;->zza()Z

    move-result v2

    const-string v3, "consent_settings"

    if-eqz v2, :cond_0

    invoke-virtual {p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v2

    sget-object v4, Lc7/i0;->Q0:Lc7/m4;

    invoke-virtual {v2, v4}, Lc7/h;->o(Lc7/m4;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p2}, Lc7/n7;->b()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "consent_source"

    invoke-virtual {v0, p2, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-virtual {p0, v3, v1, v0}, Lc7/m;->T(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)V

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p2

    const/4 v1, 0x0

    const/4 v2, 0x5

    invoke-virtual {p2, v3, v1, v0, v2}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long p2, v0, v2

    if-nez p2, :cond_1

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p2

    invoke-virtual {p2}, Lc7/v4;->B()Lc7/x4;

    move-result-object p2

    const-string v0, "Failed to insert/update consent setting (got -1). appId"

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-void

    :catch_0
    move-exception p2

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->B()Lc7/x4;

    move-result-object v0

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v1, "Error storing consent setting. appId, error"

    invoke-virtual {v0, v1, p1, p2}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final T(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)V
    .locals 5

    :try_start_0
    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {p3, p2}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p3

    invoke-virtual {p3}, Lc7/v4;->C()Lc7/x4;

    move-result-object p3

    const-string v0, "Value of the primary key is not set."

    invoke-static {p2}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p3, v0, v1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " = ?"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    invoke-virtual {v0, p1, p3, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v1

    int-to-long v1, v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-nez v1, :cond_1

    const/4 v1, 0x0

    const/4 v2, 0x5

    invoke-virtual {v0, p1, v1, p3, v2}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long p3, v0, v2

    if-nez p3, :cond_1

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p3

    invoke-virtual {p3}, Lc7/v4;->B()Lc7/x4;

    move-result-object p3

    const-string v0, "Failed to insert/update table (got -1). key"

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {p2}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p3, v0, v1, v2}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-void

    :catch_0
    move-exception p3

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->B()Lc7/x4;

    move-result-object v0

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    const-string v1, "Error storing into table. key"

    invoke-virtual {v0, v1, p1, p2, p3}, Lc7/x4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public final U(Ljava/lang/String;Ljava/util/List;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/google/android/gms/internal/measurement/zzew$zza;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    const-string v3, "app_id=? and audience_id=?"

    const-string v4, "event_filters"

    const-string v5, "app_id=?"

    const-string v6, "property_filters"

    invoke-static/range {p2 .. p2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v8, 0x0

    :goto_0
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    move-result v9

    if-ge v8, v9, :cond_7

    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/measurement/zzew$zza;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzjf;->zzby()Lcom/google/android/gms/internal/measurement/zzjf$zzb;

    move-result-object v9

    check-cast v9, Lcom/google/android/gms/internal/measurement/zzew$zza$zza;

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzew$zza$zza;->zza()I

    move-result v11

    if-eqz v11, :cond_4

    const/4 v11, 0x0

    :goto_1
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzew$zza$zza;->zza()I

    move-result v12

    if-ge v11, v12, :cond_4

    invoke-virtual {v9, v11}, Lcom/google/android/gms/internal/measurement/zzew$zza$zza;->zza(I)Lcom/google/android/gms/internal/measurement/zzew$zzb;

    move-result-object v12

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzjf;->zzby()Lcom/google/android/gms/internal/measurement/zzjf$zzb;

    move-result-object v12

    check-cast v12, Lcom/google/android/gms/internal/measurement/zzew$zzb$zza;

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzhn;->clone()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lcom/google/android/gms/internal/measurement/zzjf$zzb;

    check-cast v13, Lcom/google/android/gms/internal/measurement/zzew$zzb$zza;

    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzew$zzb$zza;->zzb()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lc7/o7;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    if-eqz v14, :cond_0

    invoke-virtual {v13, v14}, Lcom/google/android/gms/internal/measurement/zzew$zzb$zza;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzew$zzb$zza;

    const/4 v14, 0x1

    goto :goto_2

    :cond_0
    const/4 v14, 0x0

    :goto_2
    const/4 v15, 0x0

    :goto_3
    invoke-virtual {v12}, Lcom/google/android/gms/internal/measurement/zzew$zzb$zza;->zza()I

    move-result v7

    if-ge v15, v7, :cond_2

    invoke-virtual {v12, v15}, Lcom/google/android/gms/internal/measurement/zzew$zzb$zza;->zza(I)Lcom/google/android/gms/internal/measurement/zzew$zzc;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzew$zzc;->zze()Ljava/lang/String;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lc7/q7;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_1

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzjf;->zzby()Lcom/google/android/gms/internal/measurement/zzjf$zzb;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/measurement/zzew$zzc$zza;

    invoke-virtual {v7, v10}, Lcom/google/android/gms/internal/measurement/zzew$zzc$zza;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzew$zzc$zza;

    move-result-object v7

    invoke-virtual {v7}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v7, Lcom/google/android/gms/internal/measurement/zzew$zzc;

    invoke-virtual {v13, v15, v7}, Lcom/google/android/gms/internal/measurement/zzew$zzb$zza;->zza(ILcom/google/android/gms/internal/measurement/zzew$zzc;)Lcom/google/android/gms/internal/measurement/zzew$zzb$zza;

    const/4 v14, 0x1

    :cond_1
    add-int/lit8 v15, v15, 0x1

    goto :goto_3

    :cond_2
    if-eqz v14, :cond_3

    invoke-virtual {v9, v11, v13}, Lcom/google/android/gms/internal/measurement/zzew$zza$zza;->zza(ILcom/google/android/gms/internal/measurement/zzew$zzb$zza;)Lcom/google/android/gms/internal/measurement/zzew$zza$zza;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v7

    check-cast v7, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v7, Lcom/google/android/gms/internal/measurement/zzew$zza;

    invoke-interface {v2, v8, v7}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_3
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_4
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzew$zza$zza;->zzb()I

    move-result v7

    if-eqz v7, :cond_6

    const/4 v7, 0x0

    :goto_4
    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzew$zza$zza;->zzb()I

    move-result v10

    if-ge v7, v10, :cond_6

    invoke-virtual {v9, v7}, Lcom/google/android/gms/internal/measurement/zzew$zza$zza;->zzb(I)Lcom/google/android/gms/internal/measurement/zzew$zze;

    move-result-object v10

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzew$zze;->zze()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lc7/p7;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    if-eqz v11, :cond_5

    invoke-virtual {v10}, Lcom/google/android/gms/internal/measurement/zzjf;->zzby()Lcom/google/android/gms/internal/measurement/zzjf$zzb;

    move-result-object v10

    check-cast v10, Lcom/google/android/gms/internal/measurement/zzew$zze$zza;

    invoke-virtual {v10, v11}, Lcom/google/android/gms/internal/measurement/zzew$zze$zza;->zza(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/zzew$zze$zza;

    move-result-object v10

    invoke-virtual {v9, v7, v10}, Lcom/google/android/gms/internal/measurement/zzew$zza$zza;->zza(ILcom/google/android/gms/internal/measurement/zzew$zze$zza;)Lcom/google/android/gms/internal/measurement/zzew$zza$zza;

    move-result-object v9

    invoke-virtual {v9}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v10

    check-cast v10, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v10, Lcom/google/android/gms/internal/measurement/zzew$zza;

    invoke-interface {v2, v8, v10}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_5
    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_6
    add-int/lit8 v8, v8, 0x1

    goto/16 :goto_0

    :cond_7
    invoke-virtual/range {p0 .. p0}, Lc7/xb;->p()V

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->i()V

    invoke-static/range {p1 .. p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static/range {p2 .. p2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p0 .. p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v7

    invoke-virtual {v7}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lc7/xb;->p()V

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->i()V

    invoke-static/range {p1 .. p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v8

    const/4 v9, 0x1

    new-array v10, v9, [Ljava/lang/String;

    const/4 v11, 0x0

    aput-object v0, v10, v11

    invoke-virtual {v8, v6, v5, v10}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    new-array v10, v9, [Ljava/lang/String;

    aput-object v0, v10, v11

    invoke-virtual {v8, v4, v5, v10}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_12

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/google/android/gms/internal/measurement/zzew$zza;

    invoke-virtual/range {p0 .. p0}, Lc7/xb;->p()V

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->i()V

    invoke-static/range {p1 .. p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {v8}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzew$zza;->zzg()Z

    move-result v9

    if-nez v9, :cond_8

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v8

    invoke-virtual {v8}, Lc7/v4;->G()Lc7/x4;

    move-result-object v8

    const-string v9, "Audience with no ID. appId"

    invoke-static/range {p1 .. p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v8, v9, v10}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_5

    :cond_8
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzew$zza;->zza()I

    move-result v9

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzew$zza;->zze()Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_9
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_a

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/google/android/gms/internal/measurement/zzew$zzb;

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzew$zzb;->zzl()Z

    move-result v11

    if-nez v11, :cond_9

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v8

    invoke-virtual {v8}, Lc7/v4;->G()Lc7/x4;

    move-result-object v8

    const-string v10, "Event filter with no ID. Audience definition ignored. appId, audienceId"

    invoke-static/range {p1 .. p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    :goto_6
    invoke-virtual {v8, v10, v11, v9}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_5

    :cond_a
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzew$zza;->zzf()Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_b
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_c

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/google/android/gms/internal/measurement/zzew$zze;

    invoke-virtual {v11}, Lcom/google/android/gms/internal/measurement/zzew$zze;->zzi()Z

    move-result v11

    if-nez v11, :cond_b

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v8

    invoke-virtual {v8}, Lc7/v4;->G()Lc7/x4;

    move-result-object v8

    const-string v10, "Property filter with no ID. Audience definition ignored. appId, audienceId"

    invoke-static/range {p1 .. p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    goto :goto_6

    :cond_c
    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzew$zza;->zze()Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_d
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_e

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/google/android/gms/internal/measurement/zzew$zzb;

    invoke-virtual {v1, v0, v9, v11}, Lc7/m;->a0(Ljava/lang/String;ILcom/google/android/gms/internal/measurement/zzew$zzb;)Z

    move-result v11

    if-nez v11, :cond_d

    const/4 v10, 0x0

    goto :goto_7

    :cond_e
    const/4 v10, 0x1

    :goto_7
    if-eqz v10, :cond_10

    invoke-virtual {v8}, Lcom/google/android/gms/internal/measurement/zzew$zza;->zzf()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_f
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_10

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/google/android/gms/internal/measurement/zzew$zze;

    invoke-virtual {v1, v0, v9, v11}, Lc7/m;->b0(Ljava/lang/String;ILcom/google/android/gms/internal/measurement/zzew$zze;)Z

    move-result v11

    if-nez v11, :cond_f

    const/4 v10, 0x0

    :cond_10
    if-nez v10, :cond_11

    invoke-virtual/range {p0 .. p0}, Lc7/xb;->p()V

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->i()V

    invoke-static/range {p1 .. p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v8

    const/4 v10, 0x2

    new-array v11, v10, [Ljava/lang/String;

    const/4 v12, 0x0

    aput-object v0, v11, v12

    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x1

    aput-object v12, v11, v13

    invoke-virtual {v8, v6, v3, v11}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    new-array v10, v10, [Ljava/lang/String;

    const/4 v11, 0x0

    aput-object v0, v10, v11

    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v9

    const/4 v12, 0x1

    aput-object v9, v10, v12

    invoke-virtual {v8, v4, v3, v10}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    goto/16 :goto_5

    :cond_11
    const/4 v11, 0x0

    const/4 v12, 0x1

    goto/16 :goto_5

    :cond_12
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface/range {p2 .. p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_14

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/measurement/zzew$zza;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzew$zza;->zzg()Z

    move-result v5

    if-eqz v5, :cond_13

    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/zzew$zza;->zza()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_9

    :cond_13
    const/4 v4, 0x0

    :goto_9
    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_14
    invoke-virtual {v1, v0, v3}, Lc7/m;->u0(Ljava/lang/String;Ljava/util/List;)Z

    invoke-virtual {v7}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v7}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {v7}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0
.end method

.method public final V(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/xb;->p()V

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    invoke-static {v0}, Lh6/s;->n(I)I

    invoke-virtual {p0}, Lc7/m;->p0()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, ","

    invoke-static {v0, p1}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SELECT COUNT(1) FROM queue WHERE rowid IN "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " AND retry_count =  2147483647 LIMIT 1"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lc7/m;->s0(Ljava/lang/String;[Ljava/lang/String;)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->G()Lc7/x4;

    move-result-object v0

    const-string v1, "The number of upload retries exceeds the limit. Will remain unchanged."

    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    :cond_1
    :try_start_0
    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " AND (retry_count IS NULL OR retry_count < 2147483647)"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->B()Lc7/x4;

    move-result-object v0

    const-string v1, "Error incrementing retry count. error"

    invoke-virtual {v0, v1, p1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public final W(Lc7/f;)Z
    .locals 8

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/xb;->p()V

    iget-object v0, p1, Lc7/f;->h:Ljava/lang/String;

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p1, Lc7/f;->j:Lc7/lc;

    iget-object v1, v1, Lc7/lc;->i:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lc7/m;->A0(Ljava/lang/String;Ljava/lang/String;)Lc7/nc;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    new-array v1, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    aput-object v0, v1, v3

    const-string v4, "SELECT COUNT(1) FROM conditional_properties WHERE app_id=?"

    invoke-virtual {p0, v4, v1}, Lc7/m;->s0(Ljava/lang/String;[Ljava/lang/String;)J

    move-result-wide v4

    const-wide/16 v6, 0x3e8

    cmp-long v1, v4, v6

    if-ltz v1, :cond_0

    return v3

    :cond_0
    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    const-string v3, "app_id"

    invoke-virtual {v1, v3, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p1, Lc7/f;->i:Ljava/lang/String;

    const-string v4, "origin"

    invoke-virtual {v1, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p1, Lc7/f;->j:Lc7/lc;

    iget-object v3, v3, Lc7/lc;->i:Ljava/lang/String;

    const-string v4, "name"

    invoke-virtual {v1, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, p1, Lc7/f;->j:Lc7/lc;

    invoke-virtual {v3}, Lc7/lc;->I()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "value"

    invoke-static {v1, v4, v3}, Lc7/m;->O(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/Object;)V

    iget-boolean v3, p1, Lc7/f;->l:Z

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    const-string v4, "active"

    invoke-virtual {v1, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    iget-object v3, p1, Lc7/f;->m:Ljava/lang/String;

    const-string v4, "trigger_event_name"

    invoke-virtual {v1, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-wide v3, p1, Lc7/f;->o:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "trigger_timeout"

    invoke-virtual {v1, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p0}, Lc7/j7;->f()Lc7/qc;

    iget-object v3, p1, Lc7/f;->n:Lc7/g0;

    invoke-static {v3}, Lc7/qc;->l0(Landroid/os/Parcelable;)[B

    move-result-object v3

    const-string v4, "timed_out_event"

    invoke-virtual {v1, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    iget-wide v3, p1, Lc7/f;->k:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "creation_timestamp"

    invoke-virtual {v1, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p0}, Lc7/j7;->f()Lc7/qc;

    iget-object v3, p1, Lc7/f;->p:Lc7/g0;

    invoke-static {v3}, Lc7/qc;->l0(Landroid/os/Parcelable;)[B

    move-result-object v3

    const-string v4, "triggered_event"

    invoke-virtual {v1, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    iget-object v3, p1, Lc7/f;->j:Lc7/lc;

    iget-wide v3, v3, Lc7/lc;->j:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "triggered_timestamp"

    invoke-virtual {v1, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    iget-wide v3, p1, Lc7/f;->q:J

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "time_to_live"

    invoke-virtual {v1, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-virtual {p0}, Lc7/j7;->f()Lc7/qc;

    iget-object p1, p1, Lc7/f;->r:Lc7/g0;

    invoke-static {p1}, Lc7/qc;->l0(Landroid/os/Parcelable;)[B

    move-result-object p1

    const-string v3, "expired_event"

    invoke-virtual {v1, v3, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    :try_start_0
    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p1

    const-string v3, "conditional_properties"

    const/4 v4, 0x0

    const/4 v5, 0x5

    invoke-virtual {p1, v3, v4, v1, v5}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    move-result-wide v3

    const-wide/16 v5, -0x1

    cmp-long p1, v3, v5

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->B()Lc7/x4;

    move-result-object p1

    const-string v1, "Failed to insert/update conditional user property (got -1)"

    invoke-static {v0}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p1, v1, v3}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    invoke-static {v0}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v3, "Error storing conditional user property"

    invoke-virtual {v1, v3, v0, p1}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    :goto_0
    return v2
.end method

.method public final X(Lc7/y;JZ)Z
    .locals 4

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/xb;->p()V

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p1, Lc7/y;->a:Ljava/lang/String;

    invoke-static {v0}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0}, Lc7/ub;->j()Lc7/ic;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc7/ic;->C(Lc7/y;)Lcom/google/android/gms/internal/measurement/zzfi$zze;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/measurement/zzhl;->zzbv()[B

    move-result-object v0

    new-instance v1, Landroid/content/ContentValues;

    invoke-direct {v1}, Landroid/content/ContentValues;-><init>()V

    iget-object v2, p1, Lc7/y;->a:Ljava/lang/String;

    const-string v3, "app_id"

    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p1, Lc7/y;->b:Ljava/lang/String;

    const-string v3, "name"

    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-wide v2, p1, Lc7/y;->d:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v3, "timestamp"

    invoke-virtual {v1, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    const-string p3, "metadata_fingerprint"

    invoke-virtual {v1, p3, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string p2, "data"

    invoke-virtual {v1, p2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const-string p3, "realtime"

    invoke-virtual {v1, p3, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const/4 p2, 0x0

    :try_start_0
    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p3

    const-string p4, "raw_events"

    const/4 v0, 0x0

    invoke-virtual {p3, p4, v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide p3

    const-wide/16 v0, -0x1

    cmp-long p3, p3, v0

    if-nez p3, :cond_0

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p3

    invoke-virtual {p3}, Lc7/v4;->B()Lc7/x4;

    move-result-object p3

    const-string p4, "Failed to insert raw event (got -1). appId"

    iget-object v0, p1, Lc7/y;->a:Ljava/lang/String;

    invoke-static {v0}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p3, p4, v0}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    return p2

    :cond_0
    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception p3

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p4

    invoke-virtual {p4}, Lc7/v4;->B()Lc7/x4;

    move-result-object p4

    iget-object p1, p1, Lc7/y;->a:Ljava/lang/String;

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "Error storing raw event. appId"

    invoke-virtual {p4, v0, p1, p3}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return p2
.end method

.method public final Y(Lc7/nc;)Z
    .locals 9

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/xb;->p()V

    iget-object v0, p1, Lc7/nc;->a:Ljava/lang/String;

    iget-object v1, p1, Lc7/nc;->c:Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lc7/m;->A0(Ljava/lang/String;Ljava/lang/String;)Lc7/nc;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    iget-object v0, p1, Lc7/nc;->c:Ljava/lang/String;

    invoke-static {v0}, Lc7/qc;->E0(Ljava/lang/String;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    new-array v0, v1, [Ljava/lang/String;

    iget-object v3, p1, Lc7/nc;->a:Ljava/lang/String;

    aput-object v3, v0, v2

    const-string v3, "select count(1) from user_attributes where app_id=? and name not like \'!_%\' escape \'!\'"

    invoke-virtual {p0, v3, v0}, Lc7/m;->s0(Ljava/lang/String;[Ljava/lang/String;)J

    move-result-wide v3

    invoke-virtual {p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v0

    iget-object v5, p1, Lc7/nc;->a:Ljava/lang/String;

    sget-object v6, Lc7/i0;->I:Lc7/m4;

    const/16 v7, 0x19

    const/16 v8, 0x64

    invoke-virtual {v0, v5, v6, v7, v8}, Lc7/h;->l(Ljava/lang/String;Lc7/m4;II)I

    move-result v0

    int-to-long v5, v0

    cmp-long v0, v3, v5

    if-ltz v0, :cond_1

    return v2

    :cond_0
    iget-object v0, p1, Lc7/nc;->c:Ljava/lang/String;

    const-string v3, "_npa"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/String;

    iget-object v3, p1, Lc7/nc;->a:Ljava/lang/String;

    aput-object v3, v0, v2

    iget-object v3, p1, Lc7/nc;->b:Ljava/lang/String;

    aput-object v3, v0, v1

    const-string v3, "select count(1) from user_attributes where app_id=? and origin=? AND name like \'!_%\' escape \'!\'"

    invoke-virtual {p0, v3, v0}, Lc7/m;->s0(Ljava/lang/String;[Ljava/lang/String;)J

    move-result-wide v3

    const-wide/16 v5, 0x19

    cmp-long v0, v3, v5

    if-ltz v0, :cond_1

    return v2

    :cond_1
    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    iget-object v2, p1, Lc7/nc;->a:Ljava/lang/String;

    const-string v3, "app_id"

    invoke-virtual {v0, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p1, Lc7/nc;->b:Ljava/lang/String;

    const-string v3, "origin"

    invoke-virtual {v0, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p1, Lc7/nc;->c:Ljava/lang/String;

    const-string v3, "name"

    invoke-virtual {v0, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-wide v2, p1, Lc7/nc;->d:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const-string v3, "set_timestamp"

    invoke-virtual {v0, v3, v2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    iget-object v2, p1, Lc7/nc;->e:Ljava/lang/Object;

    const-string v3, "value"

    invoke-static {v0, v3, v2}, Lc7/m;->O(Landroid/content/ContentValues;Ljava/lang/String;Ljava/lang/Object;)V

    :try_start_0
    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v2

    const-string v3, "user_attributes"

    const/4 v4, 0x0

    const/4 v5, 0x5

    invoke-virtual {v2, v3, v4, v0, v5}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->B()Lc7/x4;

    move-result-object v0

    const-string v2, "Failed to insert/update user property (got -1). appId"

    iget-object v3, p1, Lc7/nc;->a:Ljava/lang/String;

    invoke-static {v3}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->B()Lc7/x4;

    move-result-object v2

    iget-object p1, p1, Lc7/nc;->a:Ljava/lang/String;

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v3, "Error storing user property. appId"

    invoke-virtual {v2, v3, p1, v0}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    :goto_0
    return v1
.end method

.method public final Z(Lcom/google/android/gms/internal/measurement/zzfi$zzj;Z)Z
    .locals 6

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/xb;->p()V

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzbe()Z

    move-result v0

    invoke-static {v0}, Lh6/s;->o(Z)V

    invoke-virtual {p0}, Lc7/m;->N0()V

    invoke-virtual {p0}, Lc7/j7;->zzb()Lo6/d;

    move-result-object v0

    invoke-interface {v0}, Lo6/d;->a()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzl()J

    move-result-wide v2

    invoke-static {}, Lc7/h;->H()J

    move-result-wide v4

    sub-long v4, v0, v4

    cmp-long v2, v2, v4

    if-ltz v2, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzl()J

    move-result-wide v2

    invoke-static {}, Lc7/h;->H()J

    move-result-wide v4

    add-long/2addr v4, v0

    cmp-long v2, v2, v4

    if-lez v2, :cond_1

    :cond_0
    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->G()Lc7/x4;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzl()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v4, "Storing bundle outside of the max uploading time span. appId, now, timestamp"

    invoke-virtual {v2, v4, v3, v0, v1}, Lc7/x4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzhl;->zzbv()[B

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p0}, Lc7/ub;->j()Lc7/ic;

    move-result-object v2

    invoke-virtual {v2, v0}, Lc7/ic;->e0([B)[B

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->F()Lc7/x4;

    move-result-object v2

    array-length v3, v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "Saving bundle, size"

    invoke-virtual {v2, v4, v3}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v2, Landroid/content/ContentValues;

    invoke-direct {v2}, Landroid/content/ContentValues;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v3

    const-string v4, "app_id"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzl()J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-string v4, "bundle_end_timestamp"

    invoke-virtual {v2, v4, v3}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v3, "data"

    invoke-virtual {v2, v3, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const-string v0, "has_realtime"

    invoke-virtual {v2, v0, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzbl()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzf()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const-string v0, "retry_count"

    invoke-virtual {v2, v0, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    :cond_2
    :try_start_1
    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p2

    const-string v0, "queue"

    const/4 v3, 0x0

    invoke-virtual {p2, v0, v3, v2}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long p2, v2, v4

    if-nez p2, :cond_3

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p2

    invoke-virtual {p2}, Lc7/v4;->B()Lc7/x4;

    move-result-object p2

    const-string v0, "Failed to insert bundle (got -1). appId"

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p2, v0, v2}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0

    return v1

    :cond_3
    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception p2

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->B()Lc7/x4;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v2, "Error storing bundle. appId"

    :goto_0
    invoke-virtual {v0, v2, p1, p2}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return v1

    :catch_1
    move-exception p2

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->B()Lc7/x4;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v2, "Data loss. Failed to serialize bundle. appId"

    goto :goto_0
.end method

.method public final a0(Ljava/lang/String;ILcom/google/android/gms/internal/measurement/zzew$zzb;)Z
    .locals 5

    invoke-virtual {p0}, Lc7/xb;->p()V

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-static {p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p3}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzew$zzb;->zzf()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->G()Lc7/x4;

    move-result-object v0

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzew$zzb;->zzl()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzew$zzb;->zzb()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :cond_0
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    const-string v2, "Event filter had no event name. Audience definition ignored. appId, audienceId, filterId"

    invoke-virtual {v0, v2, p1, p2, p3}, Lc7/x4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return v1

    :cond_1
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzhl;->zzbv()[B

    move-result-object v0

    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    const-string v4, "app_id"

    invoke-virtual {v3, v4, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const-string v4, "audience_id"

    invoke-virtual {v3, v4, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzew$zzb;->zzl()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzew$zzb;->zzb()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto :goto_0

    :cond_2
    move-object p2, v2

    :goto_0
    const-string v4, "filter_id"

    invoke-virtual {v3, v4, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzew$zzb;->zzf()Ljava/lang/String;

    move-result-object p2

    const-string v4, "event_name"

    invoke-virtual {v3, v4, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzew$zzb;->zzm()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzew$zzb;->zzj()Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    goto :goto_1

    :cond_3
    move-object p2, v2

    :goto_1
    const-string p3, "session_scoped"

    invoke-virtual {v3, p3, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    const-string p2, "data"

    invoke-virtual {v3, p2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    :try_start_0
    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p2

    const-string p3, "event_filters"

    const/4 v0, 0x5

    invoke-virtual {p2, p3, v2, v3, v0}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    move-result-wide p2

    const-wide/16 v2, -0x1

    cmp-long p2, p2, v2

    if-nez p2, :cond_4

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p2

    invoke-virtual {p2}, Lc7/v4;->B()Lc7/x4;

    move-result-object p2

    const-string p3, "Failed to insert event filter (got -1). appId"

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2, p3, v0}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_4
    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception p2

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p3

    invoke-virtual {p3}, Lc7/v4;->B()Lc7/x4;

    move-result-object p3

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "Error storing event filter. appId"

    invoke-virtual {p3, v0, p1, p2}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return v1
.end method

.method public final b0(Ljava/lang/String;ILcom/google/android/gms/internal/measurement/zzew$zze;)Z
    .locals 5

    invoke-virtual {p0}, Lc7/xb;->p()V

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-static {p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p3}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzew$zze;->zze()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->G()Lc7/x4;

    move-result-object v0

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzew$zze;->zzi()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzew$zze;->zza()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :cond_0
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    const-string v2, "Property filter had no property name. Audience definition ignored. appId, audienceId, filterId"

    invoke-virtual {v0, v2, p1, p2, p3}, Lc7/x4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return v1

    :cond_1
    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzhl;->zzbv()[B

    move-result-object v0

    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    const-string v4, "app_id"

    invoke-virtual {v3, v4, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const-string v4, "audience_id"

    invoke-virtual {v3, v4, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzew$zze;->zzi()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzew$zze;->zza()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    goto :goto_0

    :cond_2
    move-object p2, v2

    :goto_0
    const-string v4, "filter_id"

    invoke-virtual {v3, v4, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzew$zze;->zze()Ljava/lang/String;

    move-result-object p2

    const-string v4, "property_name"

    invoke-virtual {v3, v4, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzew$zze;->zzj()Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {p3}, Lcom/google/android/gms/internal/measurement/zzew$zze;->zzh()Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    goto :goto_1

    :cond_3
    move-object p2, v2

    :goto_1
    const-string p3, "session_scoped"

    invoke-virtual {v3, p3, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Boolean;)V

    const-string p2, "data"

    invoke-virtual {v3, p2, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    :try_start_0
    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p2

    const-string p3, "property_filters"

    const/4 v0, 0x5

    invoke-virtual {p2, p3, v2, v3, v0}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    move-result-wide p2

    const-wide/16 v2, -0x1

    cmp-long p2, p2, v2

    if-nez p2, :cond_4

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p2

    invoke-virtual {p2}, Lc7/v4;->B()Lc7/x4;

    move-result-object p2

    const-string p3, "Failed to insert property filter (got -1). appId"

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p2, p3, v0}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :cond_4
    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception p2

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p3

    invoke-virtual {p3}, Lc7/v4;->B()Lc7/x4;

    move-result-object p3

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "Error storing property filter. appId"

    invoke-virtual {p3, v0, p1, p2}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return v1
.end method

.method public final c0(Ljava/lang/String;Landroid/os/Bundle;)Z
    .locals 11

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/xb;->p()V

    new-instance v10, Lc7/y;

    iget-object v1, p0, Lc7/j7;->a:Lc7/k6;

    const-string v2, ""

    const-string v4, "dep"

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    move-object v0, v10

    move-object v3, p1

    move-object v9, p2

    invoke-direct/range {v0 .. v9}, Lc7/y;-><init>(Lc7/k6;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;)V

    invoke-virtual {p0}, Lc7/ub;->j()Lc7/ic;

    move-result-object p2

    invoke-virtual {p2, v10}, Lc7/ic;->C(Lc7/y;)Lcom/google/android/gms/internal/measurement/zzfi$zze;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/measurement/zzhl;->zzbv()[B

    move-result-object p2

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->F()Lc7/x4;

    move-result-object v0

    invoke-virtual {p0}, Lc7/j7;->d()Lc7/u4;

    move-result-object v1

    invoke-virtual {v1, p1}, Lc7/u4;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    array-length v2, p2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "Saving default event parameters, appId, data size"

    invoke-virtual {v0, v3, v1, v2}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    const-string v1, "app_id"

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "parameters"

    invoke-virtual {v0, v1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    const/4 p2, 0x0

    :try_start_0
    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "default_event_params"

    const/4 v3, 0x0

    const/4 v4, 0x5

    invoke-virtual {v1, v2, v3, v0, v4}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->B()Lc7/x4;

    move-result-object v0

    const-string v1, "Failed to insert default event parameters (got -1). appId"

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    return p2

    :cond_0
    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v2, "Error storing default event parameters. appId"

    invoke-virtual {v1, v2, p1, v0}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return p2
.end method

.method public final d0(Ljava/lang/String;Lc7/qb;)Z
    .locals 6

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/xb;->p()V

    invoke-static {p2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0}, Lc7/j7;->zzb()Lo6/d;

    move-result-object v0

    invoke-interface {v0}, Lo6/d;->a()J

    move-result-wide v0

    iget-wide v2, p2, Lc7/qb;->i:J

    invoke-static {}, Lc7/h;->H()J

    move-result-wide v4

    sub-long v4, v0, v4

    cmp-long v2, v2, v4

    if-ltz v2, :cond_0

    iget-wide v2, p2, Lc7/qb;->i:J

    invoke-static {}, Lc7/h;->H()J

    move-result-wide v4

    add-long/2addr v4, v0

    cmp-long v2, v2, v4

    if-lez v2, :cond_1

    :cond_0
    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->G()Lc7/x4;

    move-result-object v2

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-wide v4, p2, Lc7/qb;->i:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v4, "Storing trigger URI outside of the max retention time span. appId, now, timestamp"

    invoke-virtual {v2, v4, v3, v0, v1}, Lc7/x4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->F()Lc7/x4;

    move-result-object v0

    const-string v1, "Saving trigger URI"

    invoke-virtual {v0, v1}, Lc7/x4;->a(Ljava/lang/String;)V

    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    const-string v1, "app_id"

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p2, Lc7/qb;->h:Ljava/lang/String;

    const-string v2, "trigger_uri"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    iget v1, p2, Lc7/qb;->j:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "source"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    iget-wide v1, p2, Lc7/qb;->i:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    const-string v1, "timestamp_millis"

    invoke-virtual {v0, v1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const/4 p2, 0x0

    :try_start_0
    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "trigger_uris"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v0}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->B()Lc7/x4;

    move-result-object v0

    const-string v1, "Failed to insert trigger URI (got -1). appId"

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    return p2

    :cond_2
    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v2, "Error storing trigger URI. appId"

    invoke-virtual {v1, v2, p1, v0}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return p2
.end method

.method public final e0(Ljava/lang/String;Ljava/lang/Long;JLcom/google/android/gms/internal/measurement/zzfi$zze;)Z
    .locals 4

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/xb;->p()V

    invoke-static {p5}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p5}, Lcom/google/android/gms/internal/measurement/zzhl;->zzbv()[B

    move-result-object p5

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->F()Lc7/x4;

    move-result-object v0

    invoke-virtual {p0}, Lc7/j7;->d()Lc7/u4;

    move-result-object v1

    invoke-virtual {v1, p1}, Lc7/u4;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    array-length v2, p5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "Saving complex main event, appId, data size"

    invoke-virtual {v0, v3, v1, v2}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/content/ContentValues;

    invoke-direct {v0}, Landroid/content/ContentValues;-><init>()V

    const-string v1, "app_id"

    invoke-virtual {v0, v1, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "event_id"

    invoke-virtual {v0, v1, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    const-string p3, "children_to_process"

    invoke-virtual {v0, p3, p2}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string p2, "main_event"

    invoke-virtual {v0, p2, p5}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    const/4 p2, 0x0

    :try_start_0
    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object p3

    const-string p4, "main_event_params"

    const/4 p5, 0x0

    const/4 v1, 0x5

    invoke-virtual {p3, p4, p5, v0, v1}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    move-result-wide p3

    const-wide/16 v0, -0x1

    cmp-long p3, p3, v0

    if-nez p3, :cond_0

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p3

    invoke-virtual {p3}, Lc7/v4;->B()Lc7/x4;

    move-result-object p3

    const-string p4, "Failed to insert complex main event (got -1). appId"

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p5

    invoke-virtual {p3, p4, p5}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    return p2

    :cond_0
    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception p3

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p4

    invoke-virtual {p4}, Lc7/v4;->B()Lc7/x4;

    move-result-object p4

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string p5, "Error storing complex main event. appId"

    invoke-virtual {p4, p5, p1, p3}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return p2
.end method

.method public final p0()Z
    .locals 2

    invoke-virtual {p0}, Lc7/j7;->zza()Landroid/content/Context;

    move-result-object v0

    const-string v1, "google_app_measurement.db"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    return v0
.end method

.method public final q0(Ljava/lang/String;)J
    .locals 3

    invoke-static {p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const-string p1, "select count(1) from events where app_id=? and name not like \'!_%\' escape \'!\'"

    const-wide/16 v1, 0x0

    invoke-virtual {p0, p1, v0, v1, v2}, Lc7/m;->B(Ljava/lang/String;[Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final r0(Ljava/lang/String;Ljava/lang/String;)J
    .locals 13

    invoke-static {p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/xb;->p()V

    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    const-wide/16 v1, 0x0

    :try_start_0
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "select "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " from app2 where app_id=?"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/String;

    const/4 v6, 0x0

    aput-object p1, v5, v6

    const-wide/16 v7, -0x1

    invoke-virtual {p0, v3, v5, v7, v8}, Lc7/m;->B(Ljava/lang/String;[Ljava/lang/String;J)J

    move-result-wide v9
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    cmp-long v3, v9, v7

    const-string v5, "app2"

    const-string v11, "app_id"

    if-nez v3, :cond_1

    :try_start_1
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    invoke-virtual {v3, v11, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v9, "first_open_count"

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v3, v9, v10}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v9, "previous_install_count"

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v3, v9, v10}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const/4 v9, 0x0

    const/4 v10, 0x5

    invoke-virtual {v0, v5, v9, v3, v10}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J

    move-result-wide v9

    cmp-long v3, v9, v7

    if-nez v3, :cond_0

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v3

    invoke-virtual {v3}, Lc7/v4;->B()Lc7/x4;

    move-result-object v3

    const-string v4, "Failed to insert column (got -1). appId"

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v3, v4, v5, p2}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    return-wide v7

    :cond_0
    move-wide v9, v1

    :cond_1
    :try_start_2
    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    invoke-virtual {v3, v11, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v11, 0x1

    add-long/2addr v11, v9

    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11

    invoke-virtual {v3, p2, v11}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v11, "app_id = ?"

    new-array v4, v4, [Ljava/lang/String;

    aput-object p1, v4, v6

    invoke-virtual {v0, v5, v3, v11, v4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v3

    int-to-long v3, v3

    cmp-long v1, v3, v1

    if-nez v1, :cond_2

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    const-string v2, "Failed to update column (got 0). appId"

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v2, v3, p2}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    return-wide v7

    :cond_2
    :try_start_3
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    goto :goto_1

    :catch_0
    move-exception v3

    move-wide v1, v9

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_1
    move-exception v3

    :goto_0
    :try_start_4
    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v4

    invoke-virtual {v4}, Lc7/v4;->B()Lc7/x4;

    move-result-object v4

    const-string v5, "Error inserting column. appId"

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v4, v5, p1, p2, v3}, Lc7/x4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    move-wide v9, v1

    :goto_1
    return-wide v9

    :goto_2
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw p1
.end method

.method public final s()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final s0(Ljava/lang/String;[Ljava/lang/String;)J
    .locals 3

    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v0, p1, p2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1

    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x0

    invoke-interface {v1, p2}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide p1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    return-wide p1

    :cond_0
    :try_start_1
    new-instance p2, Landroid/database/sqlite/SQLiteException;

    const-string v0, "Database returned empty set"

    invoke-direct {p2, v0}, Landroid/database/sqlite/SQLiteException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p2

    :try_start_2
    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->B()Lc7/x4;

    move-result-object v0

    const-string v2, "Database error"

    invoke-virtual {v0, v2, p1, p2}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    throw p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    if-eqz v1, :cond_1

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_1
    throw p1
.end method

.method public final t()J
    .locals 6

    const-wide/16 v0, -0x1

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    const-string v4, "select rowid from raw_events order by rowid desc limit 1;"

    invoke-virtual {v3, v4, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v3, :cond_0

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    return-wide v0

    :cond_0
    const/4 v3, 0x0

    :try_start_1
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    return-wide v0

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v3

    :try_start_2
    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v4

    invoke-virtual {v4}, Lc7/v4;->B()Lc7/x4;

    move-result-object v4

    const-string v5, "Error querying raw events"

    invoke-virtual {v4, v5, v3}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v2, :cond_1

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    :cond_1
    return-wide v0

    :goto_0
    if-eqz v2, :cond_2

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    :cond_2
    throw v0
.end method

.method public final t0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lc7/nc;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p3

    invoke-static/range {p1 .. p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->i()V

    invoke-virtual/range {p0 .. p0}, Lc7/xb;->p()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    :try_start_0
    new-instance v3, Ljava/util/ArrayList;

    const/4 v4, 0x3

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v12, p1

    :try_start_1
    invoke-interface {v3, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "app_id=?"

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static/range {p2 .. p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v6, :cond_0

    move-object/from16 v6, p2

    :try_start_2
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v7, " and origin=?"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    move-object/from16 v6, p2

    :goto_0
    invoke-static/range {p3 .. p3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    if-nez v7, :cond_1

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "*"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v7, " and name glob ?"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v7

    new-array v7, v7, [Ljava/lang/String;

    invoke-interface {v3, v7}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v17, v3

    check-cast v17, [Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v13

    const-string v14, "user_attributes"

    const-string v3, "name"

    const-string v7, "set_timestamp"

    const-string v8, "value"

    const-string v9, "origin"

    filled-new-array {v3, v7, v8, v9}, [Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-string v20, "rowid"

    const-string v21, "1001"

    invoke-virtual/range {v13 .. v21}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v3, :cond_2

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    return-object v1

    :cond_2
    :goto_1
    :try_start_3
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v3

    const/16 v5, 0x3e8

    if-lt v3, v5, :cond_3

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->B()Lc7/x4;

    move-result-object v0

    const-string v3, "Read more than the max allowed user properties, ignoring excess"

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v13, p0

    goto :goto_3

    :cond_3
    const/4 v3, 0x0

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v8

    const/4 v3, 0x1

    invoke-interface {v2, v3}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v9
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    const/4 v3, 0x2

    move-object/from16 v13, p0

    :try_start_4
    invoke-virtual {v13, v2, v3}, Lc7/m;->H(Landroid/database/Cursor;I)Ljava/lang/Object;

    move-result-object v11

    invoke-interface {v2, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-nez v11, :cond_4

    :try_start_5
    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v5

    invoke-virtual {v5}, Lc7/v4;->B()Lc7/x4;

    move-result-object v5

    const-string v6, "(2)Read invalid user property value, ignoring it"

    invoke-static/range {p1 .. p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v5, v6, v7, v3, v0}, Lc7/x4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    new-instance v14, Lc7/nc;

    move-object v5, v14

    move-object/from16 v6, p1

    move-object v7, v3

    invoke-direct/range {v5 .. v11}, Lc7/nc;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V

    invoke-interface {v1, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_2
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    move-result v5
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    if-nez v5, :cond_5

    :goto_3
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    return-object v1

    :cond_5
    move-object v6, v3

    goto :goto_1

    :catch_0
    move-exception v0

    move-object v6, v3

    goto :goto_5

    :catch_1
    move-exception v0

    goto :goto_5

    :catch_2
    move-exception v0

    move-object/from16 v13, p0

    goto :goto_5

    :catch_3
    move-exception v0

    move-object/from16 v13, p0

    goto :goto_4

    :catchall_0
    move-exception v0

    move-object/from16 v13, p0

    goto :goto_6

    :catch_4
    move-exception v0

    move-object/from16 v13, p0

    move-object/from16 v12, p1

    :goto_4
    move-object/from16 v6, p2

    :goto_5
    :try_start_6
    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    const-string v3, "(2)Error querying user properties"

    invoke-static/range {p1 .. p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v1, v3, v4, v6, v0}, Lc7/x4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    if-eqz v2, :cond_6

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    :cond_6
    return-object v0

    :catchall_1
    move-exception v0

    :goto_6
    if-eqz v2, :cond_7

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    :cond_7
    throw v0
.end method

.method public final u()J
    .locals 4

    const-string v0, "select max(bundle_end_timestamp) from queue"

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, Lc7/m;->B(Ljava/lang/String;[Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final u0(Ljava/lang/String;Ljava/util/List;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)Z"
        }
    .end annotation

    invoke-static {p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0}, Lc7/xb;->p()V

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "select count(1) from audience_filter_values where app_id=?"

    const/4 v3, 0x1

    new-array v4, v3, [Ljava/lang/String;

    aput-object p1, v4, v1

    invoke-virtual {p0, v2, v4}, Lc7/m;->s0(Ljava/lang/String;[Ljava/lang/String;)J

    move-result-wide v4
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v2

    sget-object v6, Lc7/i0;->H:Lc7/m4;

    invoke-virtual {v2, p1, v6}, Lc7/h;->q(Ljava/lang/String;Lc7/m4;)I

    move-result v2

    const/16 v6, 0x7d0

    invoke-static {v6, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    int-to-long v6, v2

    cmp-long v4, v4, v6

    if-gtz v4, :cond_0

    return v1

    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    move v5, v1

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_2

    invoke-interface {p2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    if-nez v6, :cond_1

    return v1

    :cond_1
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    const-string p2, ","

    invoke-static {p2, v4}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object p2

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "("

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ")"

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " order by rowid desc limit -1 offset ?)"

    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/String;

    aput-object p1, v4, v1

    invoke-static {v2}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v4, v3

    const-string p1, "audience_filter_values"

    invoke-virtual {v0, p1, p2, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p1

    if-lez p1, :cond_3

    return v3

    :cond_3
    return v1

    :catch_0
    move-exception p2

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->B()Lc7/x4;

    move-result-object v0

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v2, "Database error querying filters. appId"

    invoke-virtual {v0, v2, p1, p2}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    return v1
.end method

.method public final v()J
    .locals 4

    const-string v0, "select max(timestamp) from raw_events"

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-virtual {p0, v0, v1, v2, v3}, Lc7/m;->B(Ljava/lang/String;[Ljava/lang/String;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final v0(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 5

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/xb;->p()V

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "select parameters from default_event_params where app_id=?"

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    aput-object p1, v3, v4

    invoke-virtual {v1, v2, v3}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object p1

    invoke-virtual {p1}, Lc7/v4;->F()Lc7/x4;

    move-result-object p1

    const-string v2, "Default event parameters not found"

    invoke-virtual {p1, v2}, Lc7/x4;->a(Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    return-object v0

    :cond_0
    :try_start_2
    invoke-interface {v1, v4}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v2
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzfi$zze;->zze()Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;

    move-result-object v3

    invoke-static {v3, v2}, Lc7/ic;->E(Lcom/google/android/gms/internal/measurement/zzku;[B)Lcom/google/android/gms/internal/measurement/zzku;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzfi$zze$zza;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzjf$zzb;->zzah()Lcom/google/android/gms/internal/measurement/zzkr;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzjf;

    check-cast v2, Lcom/google/android/gms/internal/measurement/zzfi$zze;
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-virtual {p0}, Lc7/ub;->j()Lc7/ic;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/measurement/zzfi$zze;->zzh()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lc7/ic;->w(Ljava/util/List;)Landroid/os/Bundle;

    move-result-object p1
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    return-object p1

    :catch_0
    move-exception v2

    :try_start_5
    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v3

    invoke-virtual {v3}, Lc7/v4;->B()Lc7/x4;

    move-result-object v3

    const-string v4, "Failed to retrieve default event parameters. appId"

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v3, v4, p1, v2}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    return-object v0

    :catch_1
    move-exception p1

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    move-object v1, v0

    :goto_0
    :try_start_6
    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->B()Lc7/x4;

    move-result-object v2

    const-string v3, "Error selecting default event parameters"

    invoke-virtual {v2, v3, p1}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    if-eqz v1, :cond_1

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_1
    return-object v0

    :catchall_1
    move-exception p1

    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_2

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_2
    throw p1
.end method

.method public final w()Landroid/database/sqlite/SQLiteDatabase;
    .locals 3

    invoke-virtual {p0}, Lc7/j7;->i()V

    :try_start_0
    iget-object v0, p0, Lc7/m;->d:Lc7/s;

    invoke-virtual {v0}, Lc7/s;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->G()Lc7/x4;

    move-result-object v1

    const-string v2, "Error opening database"

    invoke-virtual {v1, v2, v0}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V

    throw v0
.end method

.method public final w0(Ljava/lang/String;Ljava/lang/String;)Lc7/f;
    .locals 29

    move-object/from16 v7, p2

    invoke-static/range {p1 .. p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static/range {p2 .. p2}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->i()V

    invoke-virtual/range {p0 .. p0}, Lc7/xb;->p()V

    const/4 v8, 0x0

    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v9

    const-string v10, "conditional_properties"

    const-string v11, "origin"

    const-string v12, "value"

    const-string v13, "active"

    const-string v14, "trigger_event_name"

    const-string v15, "trigger_timeout"

    const-string v16, "timed_out_event"

    const-string v17, "creation_timestamp"

    const-string v18, "triggered_event"

    const-string v19, "triggered_timestamp"

    const-string v20, "time_to_live"

    const-string v21, "expired_event"

    filled-new-array/range {v11 .. v21}, [Ljava/lang/String;

    move-result-object v11

    const-string v12, "app_id=? and name=?"

    const/4 v0, 0x2

    new-array v13, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    aput-object p1, v13, v1

    const/4 v2, 0x1

    aput-object v7, v13, v2

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-virtual/range {v9 .. v16}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v9
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-interface {v9}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v3
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v3, :cond_0

    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    return-object v8

    :cond_0
    :try_start_2
    invoke-interface {v9, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    const-string v3, ""
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_1
    move-object/from16 v10, p0

    move-object/from16 v16, v3

    :try_start_3
    invoke-virtual {v10, v9, v2}, Lc7/m;->H(Landroid/database/Cursor;I)Ljava/lang/Object;

    move-result-object v5

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    if-eqz v0, :cond_2

    move/from16 v20, v2

    goto :goto_0

    :cond_2
    move/from16 v20, v1

    :goto_0
    const/4 v0, 0x3

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v21

    const/4 v0, 0x4

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v23

    invoke-virtual/range {p0 .. p0}, Lc7/ub;->j()Lc7/ic;

    move-result-object v0

    const/4 v1, 0x5

    invoke-interface {v9, v1}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v1

    sget-object v2, Lc7/g0;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-virtual {v0, v1, v2}, Lc7/ic;->y([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v0

    move-object/from16 v22, v0

    check-cast v22, Lc7/g0;

    const/4 v0, 0x6

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v18

    invoke-virtual/range {p0 .. p0}, Lc7/ub;->j()Lc7/ic;

    move-result-object v0

    const/4 v1, 0x7

    invoke-interface {v9, v1}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Lc7/ic;->y([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v0

    move-object/from16 v25, v0

    check-cast v25, Lc7/g0;

    const/16 v0, 0x8

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v3

    const/16 v0, 0x9

    invoke-interface {v9, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v26

    invoke-virtual/range {p0 .. p0}, Lc7/ub;->j()Lc7/ic;

    move-result-object v0

    const/16 v1, 0xa

    invoke-interface {v9, v1}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v1

    invoke-virtual {v0, v1, v2}, Lc7/ic;->y([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    move-result-object v0

    move-object/from16 v28, v0

    check-cast v28, Lc7/g0;

    new-instance v17, Lc7/lc;

    move-object/from16 v1, v17

    move-object/from16 v2, p2

    move-object/from16 v6, v16

    invoke-direct/range {v1 .. v6}, Lc7/lc;-><init>(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lc7/f;

    move-object v14, v0

    move-object/from16 v15, p1

    invoke-direct/range {v14 .. v28}, Lc7/f;-><init>(Ljava/lang/String;Ljava/lang/String;Lc7/lc;JZLjava/lang/String;Lc7/g0;JLc7/g0;JLc7/g0;)V

    invoke-interface {v9}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    const-string v2, "Got multiple records for conditional property, expected one"

    invoke-static/range {p1 .. p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->d()Lc7/u4;

    move-result-object v4

    invoke-virtual {v4, v7}, Lc7/u4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :cond_3
    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object/from16 v10, p0

    goto :goto_2

    :catch_1
    move-exception v0

    move-object/from16 v10, p0

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object/from16 v10, p0

    goto :goto_3

    :catch_2
    move-exception v0

    move-object/from16 v10, p0

    move-object v9, v8

    :goto_1
    :try_start_4
    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    const-string v2, "Error querying conditional property"

    invoke-static/range {p1 .. p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->d()Lc7/u4;

    move-result-object v4

    invoke-virtual {v4, v7}, Lc7/u4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4, v0}, Lc7/x4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-eqz v9, :cond_4

    invoke-interface {v9}, Landroid/database/Cursor;->close()V

    :cond_4
    return-object v8

    :catchall_2
    move-exception v0

    :goto_2
    move-object v8, v9

    :goto_3
    if-eqz v8, :cond_5

    invoke-interface {v8}, Landroid/database/Cursor;->close()V

    :cond_5
    throw v0
.end method

.method public final x()Ljava/lang/String;
    .locals 6

    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "select app_id from queue order by has_realtime desc, rowid asc limit 1;"

    invoke-virtual {v0, v2, v1}, Landroid/database/sqlite/SQLiteDatabase;->rawQuery(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x0

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    return-object v1

    :cond_0
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    return-object v1

    :catch_0
    move-exception v2

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v5, v1

    move-object v1, v0

    move-object v0, v5

    goto :goto_1

    :catch_1
    move-exception v2

    move-object v0, v1

    :goto_0
    :try_start_2
    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v3

    invoke-virtual {v3}, Lc7/v4;->B()Lc7/x4;

    move-result-object v3

    const-string v4, "Database error getting next bundle app id"

    invoke-virtual {v3, v4, v2}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_1
    return-object v1

    :catchall_1
    move-exception v1

    :goto_1
    if-eqz v0, :cond_2

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_2
    throw v1
.end method

.method public final x0(Ljava/lang/String;Ljava/lang/String;)Lc7/c0;
    .locals 25

    move-object/from16 v15, p2

    invoke-static/range {p1 .. p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static/range {p2 .. p2}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->i()V

    invoke-virtual/range {p0 .. p0}, Lc7/xb;->p()V

    new-instance v0, Ljava/util/ArrayList;

    const-string v1, "lifetime_count"

    const-string v2, "current_bundle_count"

    const-string v3, "last_fire_timestamp"

    const-string v4, "last_bundled_timestamp"

    const-string v5, "last_bundled_day"

    const-string v6, "last_sampled_complex_event_id"

    const-string v7, "last_sampling_rate"

    const-string v8, "last_exempt_from_sampling"

    const-string v9, "current_session_count"

    filled-new-array/range {v1 .. v9}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/16 v18, 0x0

    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "events"

    const/4 v9, 0x0

    new-array v3, v9, [Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, [Ljava/lang/String;

    const-string v4, "app_id=? and name=?"

    const/4 v0, 0x2

    new-array v5, v0, [Ljava/lang/String;

    aput-object p1, v5, v9

    const/4 v10, 0x1

    aput-object v15, v5, v10

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v1 .. v8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v14
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    invoke-interface {v14}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v1, :cond_0

    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    return-object v18

    :cond_0
    :try_start_2
    invoke-interface {v14, v9}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v4

    invoke-interface {v14, v10}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    invoke-interface {v14, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v11

    const/4 v0, 0x3

    invoke-interface {v14, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    const-wide/16 v2, 0x0

    if-eqz v1, :cond_1

    move-wide/from16 v16, v2

    goto :goto_0

    :cond_1
    invoke-interface {v14, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    move-wide/from16 v16, v0

    :goto_0
    const/4 v0, 0x4

    invoke-interface {v14, v0}, Landroid/database/Cursor;->isNull(I)Z

    move-result v1

    if-eqz v1, :cond_2

    move-object/from16 v0, v18

    goto :goto_1

    :cond_2
    invoke-interface {v14, v0}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    :goto_1
    const/4 v1, 0x5

    invoke-interface {v14, v1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_3

    move-object/from16 v19, v18

    goto :goto_2

    :cond_3
    invoke-interface {v14, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v19

    invoke-static/range {v19 .. v20}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    move-object/from16 v19, v1

    :goto_2
    const/4 v1, 0x6

    invoke-interface {v14, v1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_4

    move-object/from16 v20, v18

    goto :goto_3

    :cond_4
    invoke-interface {v14, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v20

    invoke-static/range {v20 .. v21}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    move-object/from16 v20, v1

    :goto_3
    const/4 v1, 0x7

    invoke-interface {v14, v1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v8
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-nez v8, :cond_6

    :try_start_3
    invoke-interface {v14, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v21

    const-wide/16 v23, 0x1

    cmp-long v1, v21, v23

    if-nez v1, :cond_5

    move v9, v10

    :cond_5
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    move-object/from16 v21, v1

    goto :goto_4

    :catch_0
    move-exception v0

    goto :goto_7

    :cond_6
    move-object/from16 v21, v18

    :goto_4
    const/16 v1, 0x8

    :try_start_4
    invoke-interface {v14, v1}, Landroid/database/Cursor;->isNull(I)Z

    move-result v8

    if-eqz v8, :cond_7

    move-wide v8, v2

    goto :goto_5

    :cond_7
    invoke-interface {v14, v1}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v1

    move-wide v8, v1

    :goto_5
    new-instance v22, Lc7/c0;
    :try_end_4
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    move-object/from16 v1, v22

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-wide v10, v11

    move-wide/from16 v12, v16

    move-object/from16 v23, v14

    move-object v14, v0

    move-object/from16 v15, v19

    move-object/from16 v16, v20

    move-object/from16 v17, v21

    :try_start_5
    invoke-direct/range {v1 .. v17}, Lc7/c0;-><init>(Ljava/lang/String;Ljava/lang/String;JJJJJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V

    invoke-interface/range {v23 .. v23}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->B()Lc7/x4;

    move-result-object v0

    const-string v1, "Got multiple records for event aggregates, expected one. appId"

    invoke-static/range {p1 .. p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :cond_8
    invoke-interface/range {v23 .. v23}, Landroid/database/Cursor;->close()V

    return-object v22

    :catchall_0
    move-exception v0

    goto :goto_6

    :catch_1
    move-exception v0

    move-object/from16 v14, v23

    goto :goto_7

    :catchall_1
    move-exception v0

    move-object/from16 v23, v14

    :goto_6
    move-object/from16 v18, v23

    goto :goto_8

    :catch_2
    move-exception v0

    move-object/from16 v23, v14

    goto :goto_7

    :catchall_2
    move-exception v0

    goto :goto_8

    :catch_3
    move-exception v0

    move-object/from16 v14, v18

    :goto_7
    :try_start_6
    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    const-string v2, "Error querying events. appId"

    invoke-static/range {p1 .. p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->d()Lc7/u4;

    move-result-object v4

    move-object/from16 v5, p2

    invoke-virtual {v4, v5}, Lc7/u4;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4, v0}, Lc7/x4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    if-eqz v14, :cond_9

    invoke-interface {v14}, Landroid/database/Cursor;->close()V

    :cond_9
    return-object v18

    :catchall_3
    move-exception v0

    move-object/from16 v18, v14

    :goto_8
    if-eqz v18, :cond_a

    invoke-interface/range {v18 .. v18}, Landroid/database/Cursor;->close()V

    :cond_a
    throw v0
.end method

.method public final y(Ljava/lang/String;Ljava/lang/String;)I
    .locals 6

    invoke-static {p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {p2}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/xb;->p()V

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "conditional_properties"

    const-string v3, "app_id=? and name=?"

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/String;

    aput-object p1, v4, v0

    const/4 v5, 0x1

    aput-object p2, v4, v5

    invoke-virtual {v1, v2, v3, v4}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    move-result p1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception v1

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v2

    invoke-virtual {v2}, Lc7/v4;->B()Lc7/x4;

    move-result-object v2

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0}, Lc7/j7;->d()Lc7/u4;

    move-result-object v3

    invoke-virtual {v3, p2}, Lc7/u4;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string v3, "Error deleting conditional property"

    invoke-virtual {v2, v3, p1, p2, v1}, Lc7/x4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return v0
.end method

.method public final y0(Ljava/lang/String;)Lc7/g5;
    .locals 42

    move-object/from16 v1, p1

    invoke-static/range {p1 .. p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->i()V

    invoke-virtual/range {p0 .. p0}, Lc7/xb;->p()V

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual/range {p0 .. p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v3

    const-string v4, "apps"

    const-string v5, "app_instance_id"

    const-string v6, "gmp_app_id"

    const-string v7, "resettable_device_id_hash"

    const-string v8, "last_bundle_index"

    const-string v9, "last_bundle_start_timestamp"

    const-string v10, "last_bundle_end_timestamp"

    const-string v11, "app_version"

    const-string v12, "app_store"

    const-string v13, "gmp_version"

    const-string v14, "dev_cert_hash"

    const-string v15, "measurement_enabled"

    const-string v16, "day"

    const-string v17, "daily_public_events_count"

    const-string v18, "daily_events_count"

    const-string v19, "daily_conversions_count"

    const-string v20, "config_fetched_time"

    const-string v21, "failed_config_fetch_time"

    const-string v22, "app_version_int"

    const-string v23, "firebase_instance_id"

    const-string v24, "daily_error_events_count"

    const-string v25, "daily_realtime_events_count"

    const-string v26, "health_monitor_sample"

    const-string v27, "android_id"

    const-string v28, "adid_reporting_enabled"

    const-string v29, "admob_app_id"

    const-string v30, "dynamite_version"

    const-string v31, "safelisted_events"

    const-string v32, "ga_app_id"

    const-string v33, "session_stitching_token"

    const-string v34, "sgtm_upload_enabled"

    const-string v35, "target_os_version"

    const-string v36, "session_stitching_token_hash"

    const-string v37, "ad_services_version"

    const-string v38, "unmatched_first_open_without_ad_id"

    const-string v39, "npa_metadata_value"

    const-string v40, "attribution_eligibility_status"

    const-string v41, "sgtm_preview_key"

    filled-new-array/range {v5 .. v41}, [Ljava/lang/String;

    move-result-object v5

    const-string v6, "app_id=?"

    const/4 v0, 0x1

    new-array v7, v0, [Ljava/lang/String;

    const/4 v11, 0x0

    aput-object v1, v7, v11

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-virtual/range {v3 .. v10}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v4
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v4, :cond_0

    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    return-object v2

    :cond_0
    :try_start_2
    new-instance v4, Lc7/g5;
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object/from16 v5, p0

    :try_start_3
    iget-object v6, v5, Lc7/ub;->b:Lc7/yb;

    invoke-virtual {v6}, Lc7/yb;->e0()Lc7/k6;

    move-result-object v6

    invoke-direct {v4, v6, v1}, Lc7/g5;-><init>(Lc7/k6;Ljava/lang/String;)V

    invoke-interface {v3, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lc7/g5;->y(Ljava/lang/String;)V

    invoke-interface {v3, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lc7/g5;->N(Ljava/lang/String;)V

    const/4 v6, 0x2

    invoke-interface {v3, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lc7/g5;->T(Ljava/lang/String;)V

    const/4 v6, 0x3

    invoke-interface {v3, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Lc7/g5;->j0(J)V

    const/4 v6, 0x4

    invoke-interface {v3, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Lc7/g5;->l0(J)V

    const/4 v6, 0x5

    invoke-interface {v3, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Lc7/g5;->h0(J)V

    const/4 v6, 0x6

    invoke-interface {v3, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lc7/g5;->G(Ljava/lang/String;)V

    const/4 v6, 0x7

    invoke-interface {v3, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lc7/g5;->C(Ljava/lang/String;)V

    const/16 v6, 0x8

    invoke-interface {v3, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Lc7/g5;->f0(J)V

    const/16 v6, 0x9

    invoke-interface {v3, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Lc7/g5;->Y(J)V

    const/16 v6, 0xa

    invoke-interface {v3, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v7

    if-nez v7, :cond_2

    invoke-interface {v3, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_0

    :cond_1
    move v6, v11

    goto :goto_1

    :cond_2
    :goto_0
    move v6, v0

    :goto_1
    invoke-virtual {v4, v6}, Lc7/g5;->z(Z)V

    const/16 v6, 0xb

    invoke-interface {v3, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Lc7/g5;->V(J)V

    const/16 v6, 0xc

    invoke-interface {v3, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Lc7/g5;->P(J)V

    const/16 v6, 0xd

    invoke-interface {v3, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Lc7/g5;->M(J)V

    const/16 v6, 0xe

    invoke-interface {v3, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Lc7/g5;->F(J)V

    const/16 v6, 0xf

    invoke-interface {v3, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Lc7/g5;->B(J)V

    const/16 v6, 0x10

    invoke-interface {v3, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Lc7/g5;->d0(J)V

    const/16 v6, 0x11

    invoke-interface {v3, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_3

    const-wide/32 v6, -0x80000000

    goto :goto_2

    :cond_3
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    int-to-long v6, v6

    :goto_2
    invoke-virtual {v4, v6, v7}, Lc7/g5;->c(J)V

    const/16 v6, 0x12

    invoke-interface {v3, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lc7/g5;->K(Ljava/lang/String;)V

    const/16 v6, 0x13

    invoke-interface {v3, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Lc7/g5;->J(J)V

    const/16 v6, 0x14

    invoke-interface {v3, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Lc7/g5;->S(J)V

    const/16 v6, 0x15

    invoke-interface {v3, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lc7/g5;->Q(Ljava/lang/String;)V

    const/16 v6, 0x17

    invoke-interface {v3, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v7

    if-nez v7, :cond_5

    invoke-interface {v3, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    if-eqz v6, :cond_4

    goto :goto_3

    :cond_4
    move v6, v11

    goto :goto_4

    :cond_5
    :goto_3
    move v6, v0

    :goto_4
    invoke-virtual {v4, v6}, Lc7/g5;->g(Z)V

    const/16 v6, 0x18

    invoke-interface {v3, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lc7/g5;->e(Ljava/lang/String;)V

    const/16 v6, 0x19

    invoke-interface {v3, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_6

    const-wide/16 v6, 0x0

    goto :goto_5

    :cond_6
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    :goto_5
    invoke-virtual {v4, v6, v7}, Lc7/g5;->b0(J)V

    const/16 v6, 0x1a

    invoke-interface {v3, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v7

    if-nez v7, :cond_7

    invoke-interface {v3, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    const-string v7, ","

    const/4 v8, -0x1

    invoke-virtual {v6, v7, v8}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-virtual {v4, v6}, Lc7/g5;->f(Ljava/util/List;)V

    :cond_7
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzpt;->zza()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v6

    sget-object v7, Lc7/i0;->t0:Lc7/m4;

    invoke-virtual {v6, v1, v7}, Lc7/h;->y(Ljava/lang/String;Lc7/m4;)Z

    move-result v6

    if-nez v6, :cond_8

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v6

    sget-object v7, Lc7/i0;->r0:Lc7/m4;

    invoke-virtual {v6, v7}, Lc7/h;->o(Lc7/m4;)Z

    move-result v6

    if-eqz v6, :cond_9

    :cond_8
    const/16 v6, 0x1c

    invoke-interface {v3, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lc7/g5;->W(Ljava/lang/String;)V

    :cond_9
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzqa;->zza()Z

    move-result v6

    if-eqz v6, :cond_b

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v6

    sget-object v7, Lc7/i0;->v0:Lc7/m4;

    invoke-virtual {v6, v7}, Lc7/h;->o(Lc7/m4;)Z

    move-result v6

    if-eqz v6, :cond_b

    const/16 v6, 0x1d

    invoke-interface {v3, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v7

    if-nez v7, :cond_a

    invoke-interface {v3, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    if-eqz v6, :cond_a

    move v6, v0

    goto :goto_6

    :cond_a
    move v6, v11

    :goto_6
    invoke-virtual {v4, v6}, Lc7/g5;->D(Z)V

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v6

    sget-object v7, Lc7/i0;->w0:Lc7/m4;

    invoke-virtual {v6, v7}, Lc7/h;->o(Lc7/m4;)Z

    move-result v6

    if-eqz v6, :cond_b

    const/16 v6, 0x24

    invoke-interface {v3, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Lc7/g5;->Z(Ljava/lang/String;)V

    :cond_b
    const/16 v6, 0x1e

    invoke-interface {v3, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Lc7/g5;->p0(J)V

    const/16 v6, 0x1f

    invoke-interface {v3, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Lc7/g5;->n0(J)V

    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzph;->zza()Z

    move-result v6

    if-eqz v6, :cond_c

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v6

    sget-object v7, Lc7/i0;->H0:Lc7/m4;

    invoke-virtual {v6, v1, v7}, Lc7/h;->y(Ljava/lang/String;Lc7/m4;)Z

    move-result v6

    if-eqz v6, :cond_c

    const/16 v6, 0x20

    invoke-interface {v3, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    invoke-virtual {v4, v6}, Lc7/g5;->b(I)V

    const/16 v6, 0x23

    invoke-interface {v3, v6}, Landroid/database/Cursor;->getLong(I)J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Lc7/g5;->x(J)V

    :cond_c
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zznm;->zza()Z

    move-result v6

    if-eqz v6, :cond_e

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v6

    sget-object v7, Lc7/i0;->V0:Lc7/m4;

    invoke-virtual {v6, v1, v7}, Lc7/h;->y(Ljava/lang/String;Lc7/m4;)Z

    move-result v6

    if-eqz v6, :cond_e

    const/16 v6, 0x21

    invoke-interface {v3, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v7

    if-nez v7, :cond_d

    invoke-interface {v3, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    if-eqz v6, :cond_d

    move v6, v0

    goto :goto_7

    :cond_d
    move v6, v11

    :goto_7
    invoke-virtual {v4, v6}, Lc7/g5;->H(Z)V

    :cond_e
    invoke-static {}, Lcom/google/android/gms/internal/measurement/zzns;->zza()Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->a()Lc7/h;

    move-result-object v6

    sget-object v7, Lc7/i0;->Q0:Lc7/m4;

    invoke-virtual {v6, v1, v7}, Lc7/h;->y(Ljava/lang/String;Lc7/m4;)Z

    move-result v6

    if-eqz v6, :cond_11

    const/16 v6, 0x22

    invoke-interface {v3, v6}, Landroid/database/Cursor;->isNull(I)Z

    move-result v7

    if-eqz v7, :cond_f

    move-object v0, v2

    goto :goto_9

    :cond_f
    invoke-interface {v3, v6}, Landroid/database/Cursor;->getInt(I)I

    move-result v6

    if-eqz v6, :cond_10

    goto :goto_8

    :cond_10
    move v0, v11

    :goto_8
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_9
    invoke-virtual {v4, v0}, Lc7/g5;->d(Ljava/lang/Boolean;)V

    :cond_11
    invoke-virtual {v4}, Lc7/g5;->p()V

    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/v4;->B()Lc7/x4;

    move-result-object v0

    const-string v6, "Got multiple records for app, expected one. appId"

    invoke-static/range {p1 .. p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v0, v6, v7}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :cond_12
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    return-object v4

    :catch_0
    move-exception v0

    goto :goto_a

    :catchall_0
    move-exception v0

    move-object/from16 v5, p0

    goto :goto_b

    :catch_1
    move-exception v0

    move-object/from16 v5, p0

    goto :goto_a

    :catchall_1
    move-exception v0

    move-object/from16 v5, p0

    goto :goto_c

    :catch_2
    move-exception v0

    move-object/from16 v5, p0

    move-object v3, v2

    :goto_a
    :try_start_4
    invoke-virtual/range {p0 .. p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v4

    invoke-virtual {v4}, Lc7/v4;->B()Lc7/x4;

    move-result-object v4

    const-string v6, "Error querying app. appId"

    invoke-static/range {p1 .. p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v4, v6, v1, v0}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    if-eqz v3, :cond_13

    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    :cond_13
    return-object v2

    :catchall_2
    move-exception v0

    :goto_b
    move-object v2, v3

    :goto_c
    if-eqz v2, :cond_14

    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    :cond_14
    throw v0
.end method

.method public final z(Lcom/google/android/gms/internal/measurement/zzfi$zzj;)J
    .locals 7

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/xb;->p()V

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzhl;->zzbv()[B

    move-result-object v0

    invoke-virtual {p0}, Lc7/ub;->j()Lc7/ic;

    move-result-object v1

    invoke-virtual {v1, v0}, Lc7/ic;->v([B)J

    move-result-wide v1

    new-instance v3, Landroid/content/ContentValues;

    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object v4

    const-string v5, "app_id"

    invoke-virtual {v3, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    const-string v5, "metadata_fingerprint"

    invoke-virtual {v3, v5, v4}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const-string v4, "metadata"

    invoke-virtual {v3, v4, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;[B)V

    :try_start_0
    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    const-string v4, "raw_events_metadata"

    const/4 v5, 0x0

    const/4 v6, 0x4

    invoke-virtual {v0, v4, v5, v3, v6}, Landroid/database/sqlite/SQLiteDatabase;->insertWithOnConflict(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;I)J
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v1

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v1

    invoke-virtual {v1}, Lc7/v4;->B()Lc7/x4;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/measurement/zzfi$zzj;->zzx()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v2, "Error storing raw event metadata. appId"

    invoke-virtual {v1, v2, p1, v0}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    throw v0
.end method

.method public final z0(Ljava/lang/String;)Lc7/o;
    .locals 11

    invoke-static {p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    invoke-virtual {p0}, Lc7/j7;->i()V

    invoke-virtual {p0}, Lc7/xb;->p()V

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Lc7/m;->w()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v1

    const-string v2, "apps"

    const-string v3, "remote_config"

    const-string v4, "config_last_modified_time"

    const-string v5, "e_tag"

    filled-new-array {v3, v4, v5}, [Ljava/lang/String;

    move-result-object v3

    const-string v4, "app_id=?"

    const/4 v9, 0x1

    new-array v5, v9, [Ljava/lang/String;

    const/4 v10, 0x0

    aput-object p1, v5, v10

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v1 .. v8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v1
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v2
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v2, :cond_0

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    return-object v0

    :cond_0
    :try_start_2
    invoke-interface {v1, v10}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object v2

    invoke-interface {v1, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    invoke-interface {v1, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1}, Landroid/database/Cursor;->moveToNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v5

    invoke-virtual {v5}, Lc7/v4;->B()Lc7/x4;

    move-result-object v5

    const-string v6, "Got multiple records for app config, expected one. appId"

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lc7/x4;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_1
    if-nez v2, :cond_2

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    return-object v0

    :cond_2
    :try_start_3
    new-instance v5, Lc7/o;

    invoke-direct {v5, v2, v3, v4}, Lc7/o;-><init>([BLjava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    return-object v5

    :catch_0
    move-exception v2

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_1
    move-exception v2

    move-object v1, v0

    :goto_0
    :try_start_4
    invoke-virtual {p0}, Lc7/j7;->zzj()Lc7/v4;

    move-result-object v3

    invoke-virtual {v3}, Lc7/v4;->B()Lc7/x4;

    move-result-object v3

    const-string v4, "Error querying remote config. appId"

    invoke-static {p1}, Lc7/v4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v3, v4, p1, v2}, Lc7/x4;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    if-eqz v1, :cond_3

    invoke-interface {v1}, Landroid/database/Cursor;->close()V

    :cond_3
    return-object v0

    :catchall_1
    move-exception p1

    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_4

    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_4
    throw p1
.end method
