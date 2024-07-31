.class public final Lcom/google/android/recaptcha/internal/zzam;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final zza:Lcom/google/android/recaptcha/internal/zzam;

.field private static zzb:Lcom/google/android/recaptcha/internal/zzaw;

.field private static final zzc:Ljava/lang/String;

.field private static final zzd:Lle/a;

.field private static final zze:Lcom/google/android/recaptcha/internal/zzt;

.field private static zzf:Lcom/google/android/recaptcha/internal/zzg;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/android/recaptcha/internal/zzam;

    invoke-direct {v0}, Lcom/google/android/recaptcha/internal/zzam;-><init>()V

    sput-object v0, Lcom/google/android/recaptcha/internal/zzam;->zza:Lcom/google/android/recaptcha/internal/zzam;

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/google/android/recaptcha/internal/zzam;->zzc:Ljava/lang/String;

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lle/c;->b(ZILjava/lang/Object;)Lle/a;

    move-result-object v0

    sput-object v0, Lcom/google/android/recaptcha/internal/zzam;->zzd:Lle/a;

    new-instance v0, Lcom/google/android/recaptcha/internal/zzt;

    invoke-direct {v0}, Lcom/google/android/recaptcha/internal/zzt;-><init>()V

    sput-object v0, Lcom/google/android/recaptcha/internal/zzam;->zze:Lcom/google/android/recaptcha/internal/zzt;

    new-instance v0, Lcom/google/android/recaptcha/internal/zzg;

    invoke-direct {v0, v2, v1, v2}, Lcom/google/android/recaptcha/internal/zzg;-><init>(Ljava/util/List;ILtd/g;)V

    sput-object v0, Lcom/google/android/recaptcha/internal/zzam;->zzf:Lcom/google/android/recaptcha/internal/zzg;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic zzb(Lcom/google/android/recaptcha/internal/zzam;Landroid/app/Application;Ljava/lang/String;JLcom/google/android/recaptcha/internal/zzab;Landroid/webkit/WebView;Lcom/google/android/recaptcha/internal/zzbq;Lcom/google/android/recaptcha/internal/zzt;Ljd/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 10

    new-instance v5, Lcom/google/android/recaptcha/internal/zzab;

    const-string v0, "https://www.recaptcha.net/recaptcha/api3"

    invoke-direct {v5, v0}, Lcom/google/android/recaptcha/internal/zzab;-><init>(Ljava/lang/String;)V

    sget-object v8, Lcom/google/android/recaptcha/internal/zzam;->zze:Lcom/google/android/recaptcha/internal/zzt;

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-wide v3, p3

    move-object/from16 v9, p9

    invoke-virtual/range {v0 .. v9}, Lcom/google/android/recaptcha/internal/zzam;->zza(Landroid/app/Application;Ljava/lang/String;JLcom/google/android/recaptcha/internal/zzab;Landroid/webkit/WebView;Lcom/google/android/recaptcha/internal/zzbq;Lcom/google/android/recaptcha/internal/zzt;Ljd/d;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public static final zzc(Landroid/app/Application;Ljava/lang/String;JLcom/google/android/recaptcha/internal/zzbq;Ljd/d;)Ljava/lang/Object;
    .locals 8

    sget-object p4, Lcom/google/android/recaptcha/internal/zzam;->zze:Lcom/google/android/recaptcha/internal/zzt;

    invoke-virtual {p4}, Lcom/google/android/recaptcha/internal/zzt;->zzb()Lce/p0;

    move-result-object p4

    invoke-interface {p4}, Lce/p0;->b()Ljd/g;

    move-result-object p4

    new-instance v7, Lcom/google/android/recaptcha/internal/zzah;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    invoke-direct/range {v0 .. v6}, Lcom/google/android/recaptcha/internal/zzah;-><init>(Landroid/app/Application;Ljava/lang/String;JLcom/google/android/recaptcha/internal/zzbq;Ljd/d;)V

    invoke-static {p4, v7, p5}, Lce/i;->g(Ljd/g;Lsd/p;Ljd/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final zzd(Landroid/app/Application;Ljava/lang/String;J)Lcom/google/android/gms/tasks/Task;
    .locals 8

    sget-object v0, Lcom/google/android/recaptcha/internal/zzam;->zze:Lcom/google/android/recaptcha/internal/zzt;

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzt;->zzb()Lce/p0;

    move-result-object v1

    new-instance v0, Lcom/google/android/recaptcha/internal/zzak;

    const/4 v7, 0x0

    move-object v2, v0

    move-object v3, p0

    move-object v4, p1

    move-wide v5, p2

    invoke-direct/range {v2 .. v7}, Lcom/google/android/recaptcha/internal/zzak;-><init>(Landroid/app/Application;Ljava/lang/String;JLjd/d;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x0

    move-object v4, v0

    invoke-static/range {v1 .. v6}, Lce/i;->b(Lce/p0;Ljd/g;Lce/r0;Lsd/p;ILjava/lang/Object;)Lce/x0;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/recaptcha/internal/zzj;->zza(Lce/x0;)Lcom/google/android/gms/tasks/Task;

    move-result-object p0

    return-object p0
.end method

.method public static final zze()Lcom/google/android/recaptcha/internal/zzg;
    .locals 1

    sget-object v0, Lcom/google/android/recaptcha/internal/zzam;->zzf:Lcom/google/android/recaptcha/internal/zzg;

    return-object v0
.end method

.method public static final zzf(Lcom/google/android/recaptcha/internal/zzg;)V
    .locals 0

    sput-object p0, Lcom/google/android/recaptcha/internal/zzam;->zzf:Lcom/google/android/recaptcha/internal/zzg;

    return-void
.end method


# virtual methods
.method public final zza(Landroid/app/Application;Ljava/lang/String;JLcom/google/android/recaptcha/internal/zzab;Landroid/webkit/WebView;Lcom/google/android/recaptcha/internal/zzbq;Lcom/google/android/recaptcha/internal/zzt;Ljd/d;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p9

    instance-of v1, v0, Lcom/google/android/recaptcha/internal/zzai;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/google/android/recaptcha/internal/zzai;

    iget v2, v1, Lcom/google/android/recaptcha/internal/zzai;->zzg:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lcom/google/android/recaptcha/internal/zzai;->zzg:I

    move-object/from16 v2, p0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/google/android/recaptcha/internal/zzai;

    move-object/from16 v2, p0

    invoke-direct {v1, v2, v0}, Lcom/google/android/recaptcha/internal/zzai;-><init>(Lcom/google/android/recaptcha/internal/zzam;Ljd/d;)V

    :goto_0
    iget-object v0, v1, Lcom/google/android/recaptcha/internal/zzai;->zze:Ljava/lang/Object;

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v3

    iget v4, v1, Lcom/google/android/recaptcha/internal/zzai;->zzg:I

    const/4 v5, 0x1

    const/4 v6, 0x2

    const/4 v7, 0x0

    if-eqz v4, :cond_3

    if-eq v4, v5, :cond_2

    if-ne v4, v6, :cond_1

    iget-object v3, v1, Lcom/google/android/recaptcha/internal/zzai;->zzc:Ljava/lang/Object;

    check-cast v3, Lcom/google/android/recaptcha/internal/zzbg;

    iget-object v4, v1, Lcom/google/android/recaptcha/internal/zzai;->zzb:Ljava/lang/Object;

    check-cast v4, Lcom/google/android/recaptcha/internal/zzbd;

    iget-object v1, v1, Lcom/google/android/recaptcha/internal/zzai;->zza:Ljava/lang/Object;

    check-cast v1, Lle/a;

    :try_start_0
    invoke-static {v0}, Lgd/l;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/google/android/recaptcha/RecaptchaException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_4
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_2

    :catchall_0
    move-exception v0

    goto/16 :goto_7

    :catch_0
    move-exception v0

    goto/16 :goto_6

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-wide v4, v1, Lcom/google/android/recaptcha/internal/zzai;->zzd:J

    iget-object v8, v1, Lcom/google/android/recaptcha/internal/zzai;->zzh:Lle/a;

    iget-object v9, v1, Lcom/google/android/recaptcha/internal/zzai;->zzi:Lcom/google/android/recaptcha/internal/zzt;

    iget-object v10, v1, Lcom/google/android/recaptcha/internal/zzai;->zzc:Ljava/lang/Object;

    check-cast v10, Lcom/google/android/recaptcha/internal/zzab;

    iget-object v11, v1, Lcom/google/android/recaptcha/internal/zzai;->zzb:Ljava/lang/Object;

    check-cast v11, Ljava/lang/String;

    iget-object v12, v1, Lcom/google/android/recaptcha/internal/zzai;->zza:Ljava/lang/Object;

    check-cast v12, Landroid/app/Application;

    invoke-static {v0}, Lgd/l;->b(Ljava/lang/Object;)V

    move-object v15, v8

    move-object v14, v9

    move-object v9, v12

    goto :goto_1

    :cond_3
    invoke-static {v0}, Lgd/l;->b(Ljava/lang/Object;)V

    sget-object v0, Lcom/google/android/recaptcha/internal/zzam;->zzd:Lle/a;

    move-object/from16 v4, p1

    iput-object v4, v1, Lcom/google/android/recaptcha/internal/zzai;->zza:Ljava/lang/Object;

    move-object/from16 v8, p2

    iput-object v8, v1, Lcom/google/android/recaptcha/internal/zzai;->zzb:Ljava/lang/Object;

    move-object/from16 v9, p5

    iput-object v9, v1, Lcom/google/android/recaptcha/internal/zzai;->zzc:Ljava/lang/Object;

    move-object/from16 v10, p8

    iput-object v10, v1, Lcom/google/android/recaptcha/internal/zzai;->zzi:Lcom/google/android/recaptcha/internal/zzt;

    iput-object v0, v1, Lcom/google/android/recaptcha/internal/zzai;->zzh:Lle/a;

    move-wide/from16 v11, p3

    iput-wide v11, v1, Lcom/google/android/recaptcha/internal/zzai;->zzd:J

    iput v5, v1, Lcom/google/android/recaptcha/internal/zzai;->zzg:I

    invoke-interface {v0, v7, v1}, Lle/a;->b(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;

    move-result-object v5

    if-eq v5, v3, :cond_8

    move-object v15, v0

    move-object v14, v10

    move-object v10, v9

    move-object v9, v4

    move-wide v4, v11

    move-object v11, v8

    :goto_1
    :try_start_1
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v8, Lcom/google/android/recaptcha/internal/zzam;->zzc:Ljava/lang/String;

    new-instance v13, Lcom/google/android/recaptcha/internal/zzbd;

    invoke-direct {v13, v8, v0, v7}, Lcom/google/android/recaptcha/internal/zzbd;-><init>(Ljava/lang/String;Ljava/lang/String;Ltd/g;)V

    invoke-virtual {v13, v0}, Lcom/google/android/recaptcha/internal/zzbd;->zzc(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzbd;

    new-instance v0, Lcom/google/android/recaptcha/internal/zzbg;

    new-instance v8, Lcom/google/android/recaptcha/internal/zzbm;

    new-instance v12, Lcom/google/android/recaptcha/internal/zzbo;

    invoke-virtual {v10}, Lcom/google/android/recaptcha/internal/zzab;->zzc()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v12, v6}, Lcom/google/android/recaptcha/internal/zzbo;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14}, Lcom/google/android/recaptcha/internal/zzt;->zza()Lce/p0;

    move-result-object v6

    invoke-direct {v8, v9, v12, v6}, Lcom/google/android/recaptcha/internal/zzbm;-><init>(Landroid/content/Context;Lcom/google/android/recaptcha/internal/zzbn;Lce/p0;)V

    move-object/from16 p1, v0

    move-object/from16 p2, v11

    move-object/from16 p3, v9

    move-object/from16 p4, v10

    move-object/from16 p5, v14

    move-object/from16 p6, v8

    invoke-direct/range {p1 .. p6}, Lcom/google/android/recaptcha/internal/zzbg;-><init>(Ljava/lang/String;Landroid/content/Context;Lcom/google/android/recaptcha/internal/zzab;Lcom/google/android/recaptcha/internal/zzt;Lcom/google/android/recaptcha/internal/zzbh;)V

    sget-object v6, Lcom/google/android/recaptcha/internal/zzne;->zzg:Lcom/google/android/recaptcha/internal/zzne;

    invoke-virtual {v13, v6}, Lcom/google/android/recaptcha/internal/zzbd;->zza(Lcom/google/android/recaptcha/internal/zzne;)Lcom/google/android/recaptcha/internal/zzbb;

    move-result-object v8

    const/4 v12, 0x2

    invoke-static {v0, v8, v7, v12, v7}, Lcom/google/android/recaptcha/internal/zzbg;->zzc(Lcom/google/android/recaptcha/internal/zzbg;Lcom/google/android/recaptcha/internal/zzbb;Lcom/google/android/recaptcha/internal/zzac;ILjava/lang/Object;)V

    const-wide/16 v16, 0x1388

    cmp-long v8, v4, v16

    if-ltz v8, :cond_7

    const-string v8, "android.permission.INTERNET"

    invoke-static {v9, v8}, Ly/a;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v8

    if-nez v8, :cond_6

    new-instance v12, Lcom/google/android/recaptcha/internal/zzbq;

    new-instance v8, Lcom/google/android/recaptcha/internal/zzy;

    invoke-direct {v8, v9}, Lcom/google/android/recaptcha/internal/zzy;-><init>(Landroid/content/Context;)V

    invoke-direct {v12, v8, v0}, Lcom/google/android/recaptcha/internal/zzbq;-><init>(Lcom/google/android/recaptcha/internal/zzh;Lcom/google/android/recaptcha/internal/zzbg;)V

    sget-object v8, Lcom/google/android/recaptcha/internal/zzam;->zzb:Lcom/google/android/recaptcha/internal/zzaw;

    if-eqz v8, :cond_5

    invoke-virtual {v8}, Lcom/google/android/recaptcha/internal/zzaw;->zzg()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v11}, Ltd/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v13, v6}, Lcom/google/android/recaptcha/internal/zzbd;->zza(Lcom/google/android/recaptcha/internal/zzne;)Lcom/google/android/recaptcha/internal/zzbb;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/recaptcha/internal/zzbg;->zza(Lcom/google/android/recaptcha/internal/zzbb;)V

    goto :goto_3

    :cond_4
    new-instance v0, Lcom/google/android/recaptcha/RecaptchaException;

    sget-object v1, Lcom/google/android/recaptcha/RecaptchaErrorCode;->INVALID_SITEKEY:Lcom/google/android/recaptcha/RecaptchaErrorCode;

    invoke-virtual {v8}, Lcom/google/android/recaptcha/internal/zzaw;->zzg()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Only one site key can be used per runtime. The site key you provided "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " is different than "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v3}, Lcom/google/android/recaptcha/RecaptchaException;-><init>(Lcom/google/android/recaptcha/RecaptchaErrorCode;Ljava/lang/String;)V

    throw v0

    :cond_5
    iput-object v15, v1, Lcom/google/android/recaptcha/internal/zzai;->zza:Ljava/lang/Object;

    iput-object v13, v1, Lcom/google/android/recaptcha/internal/zzai;->zzb:Ljava/lang/Object;

    iput-object v0, v1, Lcom/google/android/recaptcha/internal/zzai;->zzc:Ljava/lang/Object;

    iput-object v7, v1, Lcom/google/android/recaptcha/internal/zzai;->zzi:Lcom/google/android/recaptcha/internal/zzt;

    iput-object v7, v1, Lcom/google/android/recaptcha/internal/zzai;->zzh:Lle/a;

    const/4 v6, 0x2

    iput v6, v1, Lcom/google/android/recaptcha/internal/zzai;->zzg:I

    new-instance v6, Lcom/google/android/recaptcha/internal/zzaj;
    :try_end_1
    .catch Lcom/google/android/recaptcha/RecaptchaException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    const/16 v16, 0x0

    const/16 v19, 0x0

    move-object v8, v6

    move-object/from16 p1, v13

    move-object/from16 v20, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v0

    move-wide/from16 v17, v4

    :try_start_2
    invoke-direct/range {v8 .. v19}, Lcom/google/android/recaptcha/internal/zzaj;-><init>(Landroid/app/Application;Lcom/google/android/recaptcha/internal/zzab;Ljava/lang/String;Lcom/google/android/recaptcha/internal/zzbq;Lcom/google/android/recaptcha/internal/zzbd;Lcom/google/android/recaptcha/internal/zzt;Landroid/webkit/WebView;Lcom/google/android/recaptcha/internal/zzbg;JLjd/d;)V

    invoke-static {v4, v5, v6, v1}, Lce/f3;->c(JLsd/p;Ljd/d;)Ljava/lang/Object;

    move-result-object v1
    :try_end_2
    .catch Lcom/google/android/recaptcha/RecaptchaException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_3
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eq v1, v3, :cond_8

    move-object/from16 v4, p1

    move-object v3, v0

    move-object v0, v1

    move-object/from16 v1, v20

    :goto_2
    :try_start_3
    move-object v8, v0

    check-cast v8, Lcom/google/android/recaptcha/internal/zzaw;

    sput-object v8, Lcom/google/android/recaptcha/internal/zzam;->zzb:Lcom/google/android/recaptcha/internal/zzaw;

    sget-object v0, Lcom/google/android/recaptcha/internal/zzne;->zzg:Lcom/google/android/recaptcha/internal/zzne;

    invoke-virtual {v4, v0}, Lcom/google/android/recaptcha/internal/zzbd;->zza(Lcom/google/android/recaptcha/internal/zzne;)Lcom/google/android/recaptcha/internal/zzbb;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/google/android/recaptcha/internal/zzbg;->zza(Lcom/google/android/recaptcha/internal/zzbb;)V
    :try_end_3
    .catch Lcom/google/android/recaptcha/RecaptchaException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_4
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object v15, v1

    :goto_3
    invoke-interface {v15, v7}, Lle/a;->c(Ljava/lang/Object;)V

    return-object v8

    :cond_6
    move-object/from16 v20, v15

    move-object v1, v13

    :try_start_4
    invoke-virtual {v1, v6}, Lcom/google/android/recaptcha/internal/zzbd;->zza(Lcom/google/android/recaptcha/internal/zzne;)Lcom/google/android/recaptcha/internal/zzbb;

    move-result-object v1

    new-instance v3, Lcom/google/android/recaptcha/internal/zzp;

    sget-object v4, Lcom/google/android/recaptcha/internal/zzn;->zze:Lcom/google/android/recaptcha/internal/zzn;

    sget-object v5, Lcom/google/android/recaptcha/internal/zzl;->zzv:Lcom/google/android/recaptcha/internal/zzl;

    invoke-direct {v3, v4, v5, v7}, Lcom/google/android/recaptcha/internal/zzp;-><init>(Lcom/google/android/recaptcha/internal/zzn;Lcom/google/android/recaptcha/internal/zzl;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v3, v7}, Lcom/google/android/recaptcha/internal/zzbg;->zzb(Lcom/google/android/recaptcha/internal/zzbb;Lcom/google/android/recaptcha/internal/zzp;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/recaptcha/RecaptchaException;

    sget-object v1, Lcom/google/android/recaptcha/RecaptchaErrorCode;->NETWORK_ERROR:Lcom/google/android/recaptcha/RecaptchaErrorCode;

    const/4 v3, 0x2

    invoke-direct {v0, v1, v7, v3, v7}, Lcom/google/android/recaptcha/RecaptchaException;-><init>(Lcom/google/android/recaptcha/RecaptchaErrorCode;Ljava/lang/String;ILtd/g;)V

    throw v0

    :cond_7
    move-object v1, v13

    move-object/from16 v20, v15

    new-instance v3, Lcom/google/android/recaptcha/internal/zzp;

    sget-object v4, Lcom/google/android/recaptcha/internal/zzn;->zzm:Lcom/google/android/recaptcha/internal/zzn;

    sget-object v5, Lcom/google/android/recaptcha/internal/zzl;->zzT:Lcom/google/android/recaptcha/internal/zzl;

    invoke-direct {v3, v4, v5, v7}, Lcom/google/android/recaptcha/internal/zzp;-><init>(Lcom/google/android/recaptcha/internal/zzn;Lcom/google/android/recaptcha/internal/zzl;Ljava/lang/String;)V

    invoke-virtual {v1, v6}, Lcom/google/android/recaptcha/internal/zzbd;->zza(Lcom/google/android/recaptcha/internal/zzne;)Lcom/google/android/recaptcha/internal/zzbb;

    move-result-object v1

    invoke-virtual {v0, v1, v3, v7}, Lcom/google/android/recaptcha/internal/zzbg;->zzb(Lcom/google/android/recaptcha/internal/zzbb;Lcom/google/android/recaptcha/internal/zzp;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/recaptcha/RecaptchaException;

    sget-object v1, Lcom/google/android/recaptcha/RecaptchaErrorCode;->INVALID_TIMEOUT:Lcom/google/android/recaptcha/RecaptchaErrorCode;

    const/4 v3, 0x2

    invoke-direct {v0, v1, v7, v3, v7}, Lcom/google/android/recaptcha/RecaptchaException;-><init>(Lcom/google/android/recaptcha/RecaptchaErrorCode;Ljava/lang/String;ILtd/g;)V

    throw v0
    :try_end_4
    .catch Lcom/google/android/recaptcha/RecaptchaException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception v0

    goto :goto_4

    :catch_1
    move-exception v0

    goto :goto_5

    :catchall_2
    move-exception v0

    move-object/from16 v20, v15

    :goto_4
    move-object/from16 v1, v20

    goto :goto_7

    :catch_2
    move-object/from16 v20, v15

    :catch_3
    move-object/from16 v1, v20

    :catch_4
    :try_start_5
    new-instance v0, Lcom/google/android/recaptcha/RecaptchaException;

    sget-object v3, Lcom/google/android/recaptcha/RecaptchaErrorCode;->INTERNAL_ERROR:Lcom/google/android/recaptcha/RecaptchaErrorCode;

    const/4 v4, 0x2

    invoke-direct {v0, v3, v7, v4, v7}, Lcom/google/android/recaptcha/RecaptchaException;-><init>(Lcom/google/android/recaptcha/RecaptchaErrorCode;Ljava/lang/String;ILtd/g;)V

    throw v0

    :catch_5
    move-exception v0

    move-object/from16 v20, v15

    :goto_5
    move-object/from16 v1, v20

    :goto_6
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_7
    invoke-interface {v1, v7}, Lle/a;->c(Ljava/lang/Object;)V

    throw v0

    :cond_8
    return-object v3
.end method
