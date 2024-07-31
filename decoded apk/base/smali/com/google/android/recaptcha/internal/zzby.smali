.class final Lcom/google/android/recaptcha/internal/zzby;
.super Lld/l;
.source ""

# interfaces
.implements Lsd/p;


# instance fields
.field public final synthetic zza:Ljava/lang/Exception;

.field public final synthetic zzb:Lcom/google/android/recaptcha/internal/zzcj;

.field public final synthetic zzc:Lcom/google/android/recaptcha/internal/zzca;

.field private synthetic zzd:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/lang/Exception;Lcom/google/android/recaptcha/internal/zzcj;Lcom/google/android/recaptcha/internal/zzca;Ljd/d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzby;->zza:Ljava/lang/Exception;

    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzby;->zzb:Lcom/google/android/recaptcha/internal/zzcj;

    iput-object p3, p0, Lcom/google/android/recaptcha/internal/zzby;->zzc:Lcom/google/android/recaptcha/internal/zzca;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lld/l;-><init>(ILjd/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljd/d;)Ljd/d;
    .locals 4

    new-instance v0, Lcom/google/android/recaptcha/internal/zzby;

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzby;->zza:Ljava/lang/Exception;

    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzby;->zzb:Lcom/google/android/recaptcha/internal/zzcj;

    iget-object v3, p0, Lcom/google/android/recaptcha/internal/zzby;->zzc:Lcom/google/android/recaptcha/internal/zzca;

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/google/android/recaptcha/internal/zzby;-><init>(Ljava/lang/Exception;Lcom/google/android/recaptcha/internal/zzcj;Lcom/google/android/recaptcha/internal/zzca;Ljd/d;)V

    iput-object p1, v0, Lcom/google/android/recaptcha/internal/zzby;->zzd:Ljava/lang/Object;

    return-object v0
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lce/p0;

    check-cast p2, Ljd/d;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzby;->create(Ljava/lang/Object;Ljd/d;)Ljd/d;

    move-result-object p1

    sget-object p2, Lgd/s;->a:Lgd/s;

    check-cast p1, Lcom/google/android/recaptcha/internal/zzby;

    invoke-virtual {p1, p2}, Lcom/google/android/recaptcha/internal/zzby;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzby;->zzd:Ljava/lang/Object;

    check-cast p1, Lce/p0;

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzby;->zza:Ljava/lang/Exception;

    instance-of v1, v0, Lcom/google/android/recaptcha/internal/zzae;

    const/4 v2, 0x2

    if-eqz v1, :cond_0

    check-cast v0, Lcom/google/android/recaptcha/internal/zzae;

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzae;->zza()Lcom/google/android/recaptcha/internal/zzpg;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzby;->zzb:Lcom/google/android/recaptcha/internal/zzcj;

    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zzcj;->zza()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/recaptcha/internal/zzpg;->zzd(I)Lcom/google/android/recaptcha/internal/zzpg;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzby;->zzb:Lcom/google/android/recaptcha/internal/zzcj;

    invoke-static {}, Lcom/google/android/recaptcha/internal/zzph;->zzf()Lcom/google/android/recaptcha/internal/zzpg;

    move-result-object v1

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzcj;->zza()I

    move-result v0

    invoke-virtual {v1, v0}, Lcom/google/android/recaptcha/internal/zzpg;->zzd(I)Lcom/google/android/recaptcha/internal/zzpg;

    invoke-virtual {v1, v2}, Lcom/google/android/recaptcha/internal/zzpg;->zzp(I)Lcom/google/android/recaptcha/internal/zzpg;

    invoke-virtual {v1, v2}, Lcom/google/android/recaptcha/internal/zzpg;->zze(I)Lcom/google/android/recaptcha/internal/zzpg;

    move-object v0, v1

    :goto_0
    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzin;->zzh()Lcom/google/android/recaptcha/internal/zzit;

    move-result-object v0

    check-cast v0, Lcom/google/android/recaptcha/internal/zzph;

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzph;->zzk()I

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzph;->zzj()I

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzby;->zza:Ljava/lang/Exception;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Ltd/x;->b(Ljava/lang/Class;)Lyd/c;

    move-result-object v1

    invoke-interface {v1}, Lyd/c;->a()Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzby;->zza:Ljava/lang/Exception;

    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzby;->zzb:Lcom/google/android/recaptcha/internal/zzcj;

    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zzcj;->zzb()Lcom/google/android/recaptcha/internal/zzz;

    move-result-object v3

    iget-object v1, v1, Lcom/google/android/recaptcha/internal/zzcj;->zza:Lcom/google/android/recaptcha/internal/zzz;

    if-nez v1, :cond_1

    const/4 v1, 0x0

    :cond_1
    invoke-static {v3, v1}, Lcom/google/android/recaptcha/internal/zzbp;->zza(Lcom/google/android/recaptcha/internal/zzz;Lcom/google/android/recaptcha/internal/zzz;)Lcom/google/android/recaptcha/internal/zzno;

    move-result-object v1

    iget-object v3, p0, Lcom/google/android/recaptcha/internal/zzby;->zzb:Lcom/google/android/recaptcha/internal/zzcj;

    invoke-virtual {v3}, Lcom/google/android/recaptcha/internal/zzcj;->zzd()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-nez v4, :cond_2

    const-string v3, "recaptcha.m.Main.rge"

    :cond_2
    invoke-static {p1}, Lce/q0;->e(Lce/p0;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzby;->zzc:Lcom/google/android/recaptcha/internal/zzca;

    new-array v2, v2, [Ljava/lang/String;

    invoke-static {}, Lcom/google/android/recaptcha/internal/zzfy;->zzh()Lcom/google/android/recaptcha/internal/zzfy;

    move-result-object v4

    invoke-virtual {v0}, Lcom/google/android/recaptcha/internal/zzgf;->zzd()[B

    move-result-object v0

    array-length v5, v0

    const/4 v6, 0x0

    invoke-virtual {v4, v0, v6, v5}, Lcom/google/android/recaptcha/internal/zzfy;->zzi([BII)Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, v6

    const/4 v0, 0x1

    invoke-static {}, Lcom/google/android/recaptcha/internal/zzfy;->zzh()Lcom/google/android/recaptcha/internal/zzfy;

    move-result-object v4

    invoke-virtual {v1}, Lcom/google/android/recaptcha/internal/zzgf;->zzd()[B

    move-result-object v1

    array-length v5, v1

    invoke-virtual {v4, v1, v6, v5}, Lcom/google/android/recaptcha/internal/zzfy;->zzi([BII)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v2, v0

    invoke-static {p1, v3, v2}, Lcom/google/android/recaptcha/internal/zzca;->zze(Lcom/google/android/recaptcha/internal/zzca;Ljava/lang/String;[Ljava/lang/String;)V

    :cond_3
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method
