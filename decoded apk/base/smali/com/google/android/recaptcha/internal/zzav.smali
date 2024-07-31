.class final Lcom/google/android/recaptcha/internal/zzav;
.super Lld/l;
.source ""

# interfaces
.implements Lsd/p;


# instance fields
.field public final synthetic zza:Lcom/google/android/recaptcha/internal/zzbd;

.field public final synthetic zzb:Lcom/google/android/recaptcha/internal/zzaw;

.field public final synthetic zzc:Lcom/google/android/recaptcha/RecaptchaAction;

.field public final synthetic zzd:Lcom/google/android/recaptcha/internal/zzog;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzbd;Lcom/google/android/recaptcha/internal/zzaw;Lcom/google/android/recaptcha/RecaptchaAction;Lcom/google/android/recaptcha/internal/zzog;Ljd/d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzav;->zza:Lcom/google/android/recaptcha/internal/zzbd;

    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzav;->zzb:Lcom/google/android/recaptcha/internal/zzaw;

    iput-object p3, p0, Lcom/google/android/recaptcha/internal/zzav;->zzc:Lcom/google/android/recaptcha/RecaptchaAction;

    iput-object p4, p0, Lcom/google/android/recaptcha/internal/zzav;->zzd:Lcom/google/android/recaptcha/internal/zzog;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lld/l;-><init>(ILjd/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljd/d;)Ljd/d;
    .locals 6

    new-instance p1, Lcom/google/android/recaptcha/internal/zzav;

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzav;->zza:Lcom/google/android/recaptcha/internal/zzbd;

    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzav;->zzb:Lcom/google/android/recaptcha/internal/zzaw;

    iget-object v3, p0, Lcom/google/android/recaptcha/internal/zzav;->zzc:Lcom/google/android/recaptcha/RecaptchaAction;

    iget-object v4, p0, Lcom/google/android/recaptcha/internal/zzav;->zzd:Lcom/google/android/recaptcha/internal/zzog;

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/recaptcha/internal/zzav;-><init>(Lcom/google/android/recaptcha/internal/zzbd;Lcom/google/android/recaptcha/internal/zzaw;Lcom/google/android/recaptcha/RecaptchaAction;Lcom/google/android/recaptcha/internal/zzog;Ljd/d;)V

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lce/p0;

    check-cast p2, Ljd/d;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzav;->create(Ljava/lang/Object;Ljd/d;)Ljd/d;

    move-result-object p1

    sget-object p2, Lgd/s;->a:Lgd/s;

    check-cast p1, Lcom/google/android/recaptcha/internal/zzav;

    invoke-virtual {p1, p2}, Lcom/google/android/recaptcha/internal/zzav;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzav;->zza:Lcom/google/android/recaptcha/internal/zzbd;

    sget-object v0, Lcom/google/android/recaptcha/internal/zzne;->zzq:Lcom/google/android/recaptcha/internal/zzne;

    invoke-virtual {p1, v0}, Lcom/google/android/recaptcha/internal/zzbd;->zza(Lcom/google/android/recaptcha/internal/zzne;)Lcom/google/android/recaptcha/internal/zzbb;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzav;->zzb:Lcom/google/android/recaptcha/internal/zzaw;

    invoke-static {v0}, Lcom/google/android/recaptcha/internal/zzaw;->zzb(Lcom/google/android/recaptcha/internal/zzaw;)Lcom/google/android/recaptcha/internal/zzbg;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Lcom/google/android/recaptcha/internal/zzbg;->zzc(Lcom/google/android/recaptcha/internal/zzbg;Lcom/google/android/recaptcha/internal/zzbb;Lcom/google/android/recaptcha/internal/zzac;ILjava/lang/Object;)V

    invoke-static {}, Lcom/google/android/recaptcha/internal/zzoc;->zzf()Lcom/google/android/recaptcha/internal/zzob;

    move-result-object v0

    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzav;->zzb:Lcom/google/android/recaptcha/internal/zzaw;

    invoke-virtual {v2}, Lcom/google/android/recaptcha/internal/zzaw;->zzg()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/google/android/recaptcha/internal/zzob;->zzr(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzob;

    iget-object v3, p0, Lcom/google/android/recaptcha/internal/zzav;->zzc:Lcom/google/android/recaptcha/RecaptchaAction;

    invoke-virtual {v3}, Lcom/google/android/recaptcha/RecaptchaAction;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/google/android/recaptcha/internal/zzob;->zzd(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzob;

    invoke-static {v2}, Lcom/google/android/recaptcha/internal/zzaw;->zzc(Lcom/google/android/recaptcha/internal/zzaw;)Lcom/google/android/recaptcha/internal/zzoe;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/recaptcha/internal/zzoe;->zzI()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/google/android/recaptcha/internal/zzob;->zzq(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzob;

    invoke-static {v2}, Lcom/google/android/recaptcha/internal/zzaw;->zzc(Lcom/google/android/recaptcha/internal/zzaw;)Lcom/google/android/recaptcha/internal/zzoe;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/recaptcha/internal/zzoe;->zzH()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/recaptcha/internal/zzob;->zzp(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzob;

    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzav;->zzd:Lcom/google/android/recaptcha/internal/zzog;

    invoke-virtual {v2}, Lcom/google/android/recaptcha/internal/zzog;->zzH()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/google/android/recaptcha/internal/zzob;->zzt(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzob;

    invoke-virtual {v2}, Lcom/google/android/recaptcha/internal/zzog;->zzj()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/google/android/recaptcha/internal/zzob;->zze(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzob;

    invoke-virtual {v2}, Lcom/google/android/recaptcha/internal/zzog;->zzI()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/android/recaptcha/internal/zzob;->zzs(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzob;

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzin;->zzh()Lcom/google/android/recaptcha/internal/zzit;

    move-result-object v0

    check-cast v0, Lcom/google/android/recaptcha/internal/zzoc;

    :try_start_0
    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzav;->zzb:Lcom/google/android/recaptcha/internal/zzaw;

    invoke-static {v2}, Lcom/google/android/recaptcha/internal/zzaw;->zza(Lcom/google/android/recaptcha/internal/zzaw;)Lcom/google/android/recaptcha/internal/zzab;

    move-result-object v2

    new-instance v3, Ljava/net/URL;

    invoke-virtual {v2}, Lcom/google/android/recaptcha/internal/zzab;->zzd()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type java.net.HttpURLConnection"

    invoke-static {v2, v3}, Ltd/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/net/HttpURLConnection;

    const-string v3, "POST"

    invoke-virtual {v2, v3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V

    const-string v3, "application/x-protobuffer"

    const-string v4, "Content-Type"

    invoke-virtual {v2, v4, v3}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    :try_start_1
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->connect()V

    invoke-static {}, Lcom/google/android/recaptcha/internal/zzoj;->zzf()Lcom/google/android/recaptcha/internal/zzoi;

    move-result-object v3

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzoc;->zzi()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/recaptcha/internal/zzoi;->zzd(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzoi;

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzoc;->zzk()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/recaptcha/internal/zzoi;->zzq(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzoi;

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzoc;->zzI()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/recaptcha/internal/zzoi;->zzt(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzoi;

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzoc;->zzH()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/recaptcha/internal/zzoi;->zzp(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzoi;

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzoc;->zzJ()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/recaptcha/internal/zzoi;->zzr(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzoi;

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzoc;->zzK()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/google/android/recaptcha/internal/zzoi;->zzs(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzoi;

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzoc;->zzj()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Lcom/google/android/recaptcha/internal/zzoi;->zze(Ljava/lang/String;)Lcom/google/android/recaptcha/internal/zzoi;

    invoke-virtual {v3}, Lcom/google/android/recaptcha/internal/zzin;->zzh()Lcom/google/android/recaptcha/internal/zzit;

    move-result-object v0

    check-cast v0, Lcom/google/android/recaptcha/internal/zzoj;

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzgf;->zzd()[B

    move-result-object v0

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    const/16 v3, 0xc8

    if-ne v0, v3, :cond_0

    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    invoke-static {v0}, Lcom/google/android/recaptcha/internal/zzol;->zzg(Ljava/io/InputStream;)Lcom/google/android/recaptcha/internal/zzol;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzav;->zzb:Lcom/google/android/recaptcha/internal/zzaw;

    invoke-static {v1}, Lcom/google/android/recaptcha/internal/zzaw;->zzb(Lcom/google/android/recaptcha/internal/zzaw;)Lcom/google/android/recaptcha/internal/zzbg;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/recaptcha/internal/zzbg;->zza(Lcom/google/android/recaptcha/internal/zzbb;)V

    return-object v0

    :catch_0
    :try_start_3
    new-instance v0, Lcom/google/android/recaptcha/internal/zzp;

    sget-object v2, Lcom/google/android/recaptcha/internal/zzn;->zzc:Lcom/google/android/recaptcha/internal/zzn;

    sget-object v3, Lcom/google/android/recaptcha/internal/zzl;->zzR:Lcom/google/android/recaptcha/internal/zzl;

    invoke-direct {v0, v2, v3, v1}, Lcom/google/android/recaptcha/internal/zzp;-><init>(Lcom/google/android/recaptcha/internal/zzn;Lcom/google/android/recaptcha/internal/zzl;Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/recaptcha/internal/zzbr;->zza(I)Lcom/google/android/recaptcha/internal/zzp;

    move-result-object v0

    throw v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    move-exception v0

    :try_start_4
    instance-of v2, v0, Lcom/google/android/recaptcha/internal/zzp;

    if-eqz v2, :cond_1

    check-cast v0, Lcom/google/android/recaptcha/internal/zzp;

    goto :goto_0

    :cond_1
    new-instance v0, Lcom/google/android/recaptcha/internal/zzp;

    sget-object v2, Lcom/google/android/recaptcha/internal/zzn;->zze:Lcom/google/android/recaptcha/internal/zzn;

    sget-object v3, Lcom/google/android/recaptcha/internal/zzl;->zzQ:Lcom/google/android/recaptcha/internal/zzl;

    invoke-direct {v0, v2, v3, v1}, Lcom/google/android/recaptcha/internal/zzp;-><init>(Lcom/google/android/recaptcha/internal/zzn;Lcom/google/android/recaptcha/internal/zzl;Ljava/lang/String;)V

    :goto_0
    throw v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    :catch_2
    move-exception v0

    instance-of v2, v0, Lcom/google/android/recaptcha/internal/zzp;

    if-eqz v2, :cond_2

    check-cast v0, Lcom/google/android/recaptcha/internal/zzp;

    goto :goto_1

    :cond_2
    new-instance v0, Lcom/google/android/recaptcha/internal/zzp;

    sget-object v2, Lcom/google/android/recaptcha/internal/zzn;->zzc:Lcom/google/android/recaptcha/internal/zzn;

    sget-object v3, Lcom/google/android/recaptcha/internal/zzl;->zzam:Lcom/google/android/recaptcha/internal/zzl;

    invoke-direct {v0, v2, v3, v1}, Lcom/google/android/recaptcha/internal/zzp;-><init>(Lcom/google/android/recaptcha/internal/zzn;Lcom/google/android/recaptcha/internal/zzl;Ljava/lang/String;)V

    :goto_1
    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzav;->zzb:Lcom/google/android/recaptcha/internal/zzaw;

    invoke-static {v2}, Lcom/google/android/recaptcha/internal/zzaw;->zzb(Lcom/google/android/recaptcha/internal/zzaw;)Lcom/google/android/recaptcha/internal/zzbg;

    move-result-object v2

    invoke-virtual {v2, p1, v0, v1}, Lcom/google/android/recaptcha/internal/zzbg;->zzb(Lcom/google/android/recaptcha/internal/zzbb;Lcom/google/android/recaptcha/internal/zzp;Ljava/lang/String;)V

    throw v0
.end method
