.class final Lcom/google/android/recaptcha/internal/zzat;
.super Lld/l;
.source ""

# interfaces
.implements Lsd/p;


# instance fields
.field public zza:I

.field public final synthetic zzb:Lcom/google/android/recaptcha/internal/zzaw;

.field public final synthetic zzc:J

.field public final synthetic zzd:Lcom/google/android/recaptcha/RecaptchaAction;

.field public final synthetic zze:Lcom/google/android/recaptcha/internal/zzbd;

.field public final synthetic zzf:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzaw;JLcom/google/android/recaptcha/RecaptchaAction;Lcom/google/android/recaptcha/internal/zzbd;Ljava/lang/String;Ljd/d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzat;->zzb:Lcom/google/android/recaptcha/internal/zzaw;

    iput-wide p2, p0, Lcom/google/android/recaptcha/internal/zzat;->zzc:J

    iput-object p4, p0, Lcom/google/android/recaptcha/internal/zzat;->zzd:Lcom/google/android/recaptcha/RecaptchaAction;

    iput-object p5, p0, Lcom/google/android/recaptcha/internal/zzat;->zze:Lcom/google/android/recaptcha/internal/zzbd;

    iput-object p6, p0, Lcom/google/android/recaptcha/internal/zzat;->zzf:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lld/l;-><init>(ILjd/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljd/d;)Ljd/d;
    .locals 8

    new-instance p1, Lcom/google/android/recaptcha/internal/zzat;

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzat;->zzb:Lcom/google/android/recaptcha/internal/zzaw;

    iget-wide v2, p0, Lcom/google/android/recaptcha/internal/zzat;->zzc:J

    iget-object v4, p0, Lcom/google/android/recaptcha/internal/zzat;->zzd:Lcom/google/android/recaptcha/RecaptchaAction;

    iget-object v5, p0, Lcom/google/android/recaptcha/internal/zzat;->zze:Lcom/google/android/recaptcha/internal/zzbd;

    iget-object v6, p0, Lcom/google/android/recaptcha/internal/zzat;->zzf:Ljava/lang/String;

    move-object v0, p1

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lcom/google/android/recaptcha/internal/zzat;-><init>(Lcom/google/android/recaptcha/internal/zzaw;JLcom/google/android/recaptcha/RecaptchaAction;Lcom/google/android/recaptcha/internal/zzbd;Ljava/lang/String;Ljd/d;)V

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lce/p0;

    check-cast p2, Ljd/d;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzat;->create(Ljava/lang/Object;Ljd/d;)Ljd/d;

    move-result-object p1

    sget-object p2, Lgd/s;->a:Lgd/s;

    check-cast p1, Lcom/google/android/recaptcha/internal/zzat;

    invoke-virtual {p1, p2}, Lcom/google/android/recaptcha/internal/zzat;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/google/android/recaptcha/internal/zzat;->zza:I

    const/4 v2, 0x1

    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    if-eqz v1, :cond_0

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzat;->zzb:Lcom/google/android/recaptcha/internal/zzaw;

    iget-wide v3, p0, Lcom/google/android/recaptcha/internal/zzat;->zzc:J

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzat;->zzd:Lcom/google/android/recaptcha/RecaptchaAction;

    iget-object v5, p0, Lcom/google/android/recaptcha/internal/zzat;->zze:Lcom/google/android/recaptcha/internal/zzbd;

    invoke-static {p1, v3, v4, v1, v5}, Lcom/google/android/recaptcha/internal/zzaw;->zzi(Lcom/google/android/recaptcha/internal/zzaw;JLcom/google/android/recaptcha/RecaptchaAction;Lcom/google/android/recaptcha/internal/zzbd;)V

    iget-object v6, p0, Lcom/google/android/recaptcha/internal/zzat;->zzb:Lcom/google/android/recaptcha/internal/zzaw;

    iget-wide v7, p0, Lcom/google/android/recaptcha/internal/zzat;->zzc:J

    iget-object v9, p0, Lcom/google/android/recaptcha/internal/zzat;->zzf:Ljava/lang/String;

    iget-object v10, p0, Lcom/google/android/recaptcha/internal/zzat;->zze:Lcom/google/android/recaptcha/internal/zzbd;

    iput v2, p0, Lcom/google/android/recaptcha/internal/zzat;->zza:I

    move-object v11, p0

    invoke-static/range {v6 .. v11}, Lcom/google/android/recaptcha/internal/zzaw;->zzd(Lcom/google/android/recaptcha/internal/zzaw;JLjava/lang/String;Lcom/google/android/recaptcha/internal/zzbd;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    if-eq p1, v0, :cond_3

    :cond_1
    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzat;->zzb:Lcom/google/android/recaptcha/internal/zzaw;

    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzat;->zzd:Lcom/google/android/recaptcha/RecaptchaAction;

    iget-object v3, p0, Lcom/google/android/recaptcha/internal/zzat;->zze:Lcom/google/android/recaptcha/internal/zzbd;

    check-cast p1, Lcom/google/android/recaptcha/internal/zzog;

    const/4 v4, 0x2

    iput v4, p0, Lcom/google/android/recaptcha/internal/zzat;->zza:I

    invoke-static {v1, v2, p1, v3, p0}, Lcom/google/android/recaptcha/internal/zzaw;->zzf(Lcom/google/android/recaptcha/internal/zzaw;Lcom/google/android/recaptcha/RecaptchaAction;Lcom/google/android/recaptcha/internal/zzog;Lcom/google/android/recaptcha/internal/zzbd;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzat;->zzb:Lcom/google/android/recaptcha/internal/zzaw;

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzat;->zze:Lcom/google/android/recaptcha/internal/zzbd;

    check-cast p1, Lcom/google/android/recaptcha/internal/zzol;

    invoke-static {v0, p1, v1}, Lcom/google/android/recaptcha/internal/zzaw;->zzh(Lcom/google/android/recaptcha/internal/zzaw;Lcom/google/android/recaptcha/internal/zzol;Lcom/google/android/recaptcha/internal/zzbd;)V

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzat;->zzb:Lcom/google/android/recaptcha/internal/zzaw;

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzat;->zze:Lcom/google/android/recaptcha/internal/zzbd;

    invoke-static {v0}, Lcom/google/android/recaptcha/internal/zzaw;->zzb(Lcom/google/android/recaptcha/internal/zzaw;)Lcom/google/android/recaptcha/internal/zzbg;

    move-result-object v0

    sget-object v2, Lcom/google/android/recaptcha/internal/zzne;->zzo:Lcom/google/android/recaptcha/internal/zzne;

    invoke-virtual {v1, v2}, Lcom/google/android/recaptcha/internal/zzbd;->zza(Lcom/google/android/recaptcha/internal/zzne;)Lcom/google/android/recaptcha/internal/zzbb;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/recaptcha/internal/zzbg;->zza(Lcom/google/android/recaptcha/internal/zzbb;)V

    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzol;->zzi()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lgd/k;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lgd/k;->a(Ljava/lang/Object;)Lgd/k;

    move-result-object p1

    return-object p1

    :cond_3
    :goto_1
    return-object v0
.end method
