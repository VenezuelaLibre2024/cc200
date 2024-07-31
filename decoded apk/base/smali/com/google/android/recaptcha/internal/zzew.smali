.class final Lcom/google/android/recaptcha/internal/zzew;
.super Lld/l;
.source ""

# interfaces
.implements Lsd/p;


# instance fields
.field public zza:I

.field public final synthetic zzb:Lcom/google/android/recaptcha/internal/zzez;

.field public final synthetic zzc:Lcom/google/android/recaptcha/internal/zzoe;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzez;Lcom/google/android/recaptcha/internal/zzoe;Ljd/d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzew;->zzb:Lcom/google/android/recaptcha/internal/zzez;

    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzew;->zzc:Lcom/google/android/recaptcha/internal/zzoe;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lld/l;-><init>(ILjd/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljd/d;)Ljd/d;
    .locals 2

    new-instance p1, Lcom/google/android/recaptcha/internal/zzew;

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzew;->zzb:Lcom/google/android/recaptcha/internal/zzez;

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzew;->zzc:Lcom/google/android/recaptcha/internal/zzoe;

    invoke-direct {p1, v0, v1, p2}, Lcom/google/android/recaptcha/internal/zzew;-><init>(Lcom/google/android/recaptcha/internal/zzez;Lcom/google/android/recaptcha/internal/zzoe;Ljd/d;)V

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lce/p0;

    check-cast p2, Ljd/d;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzew;->create(Ljava/lang/Object;Ljd/d;)Ljd/d;

    move-result-object p1

    sget-object p2, Lgd/s;->a:Lgd/s;

    check-cast p1, Lcom/google/android/recaptcha/internal/zzew;

    invoke-virtual {p1, p2}, Lcom/google/android/recaptcha/internal/zzew;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/google/android/recaptcha/internal/zzew;->zza:I

    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzew;->zzb:Lcom/google/android/recaptcha/internal/zzez;

    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzez;->zze(Lcom/google/android/recaptcha/internal/zzez;)Lcom/google/android/recaptcha/internal/zzbg;

    move-result-object v1

    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzez;->zzd(Lcom/google/android/recaptcha/internal/zzez;)Lcom/google/android/recaptcha/internal/zzbd;

    move-result-object p1

    sget-object v2, Lcom/google/android/recaptcha/internal/zzne;->zzb:Lcom/google/android/recaptcha/internal/zzne;

    invoke-virtual {p1, v2}, Lcom/google/android/recaptcha/internal/zzbd;->zza(Lcom/google/android/recaptcha/internal/zzne;)Lcom/google/android/recaptcha/internal/zzbb;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/recaptcha/internal/zzbg;->zza(Lcom/google/android/recaptcha/internal/zzbb;)V

    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzew;->zzc:Lcom/google/android/recaptcha/internal/zzoe;

    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzoe;->zzJ()Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lcom/google/android/recaptcha/internal/zzfy;->zzh()Lcom/google/android/recaptcha/internal/zzfy;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/recaptcha/internal/zzfy;->zzj(Ljava/lang/CharSequence;)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zznz;->zzj([B)Lcom/google/android/recaptcha/internal/zznz;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzcb;->zza(Lcom/google/android/recaptcha/internal/zznz;)V

    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzew;->zzb:Lcom/google/android/recaptcha/internal/zzez;

    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzez;->zzh(Lcom/google/android/recaptcha/internal/zzez;)Lcom/google/android/recaptcha/internal/zzfh;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzfh;->zzd()Lcom/google/android/recaptcha/internal/zzfh;

    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzew;->zzb:Lcom/google/android/recaptcha/internal/zzez;

    invoke-static {p1}, Lcom/google/android/recaptcha/internal/zzez;->zzh(Lcom/google/android/recaptcha/internal/zzez;)Lcom/google/android/recaptcha/internal/zzfh;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzfh;->zze()Lcom/google/android/recaptcha/internal/zzfh;

    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzew;->zzb:Lcom/google/android/recaptcha/internal/zzez;

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzew;->zzc:Lcom/google/android/recaptcha/internal/zzoe;

    invoke-static {p1, v1}, Lcom/google/android/recaptcha/internal/zzez;->zzl(Lcom/google/android/recaptcha/internal/zzez;Lcom/google/android/recaptcha/internal/zzoe;)V

    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzew;->zzb:Lcom/google/android/recaptcha/internal/zzez;

    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzez;->zzk()Lce/x;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    invoke-static {p1}, Lld/b;->b(I)Ljava/lang/Integer;

    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzew;->zzb:Lcom/google/android/recaptcha/internal/zzez;

    invoke-virtual {p1}, Lcom/google/android/recaptcha/internal/zzez;->zzk()Lce/x;

    move-result-object p1

    const/4 v1, 0x1

    iput v1, p0, Lcom/google/android/recaptcha/internal/zzew;->zza:I

    invoke-interface {p1, p0}, Lce/x0;->f0(Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_1

    return-object v0

    :cond_1
    :goto_0
    sget-object p1, Lgd/s;->a:Lgd/s;

    invoke-static {p1}, Lgd/k;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lgd/k;->a(Ljava/lang/Object;)Lgd/k;

    move-result-object p1

    return-object p1
.end method
