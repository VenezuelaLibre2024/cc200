.class final Lcom/google/android/recaptcha/internal/zzau;
.super Lld/l;
.source ""

# interfaces
.implements Lsd/p;


# instance fields
.field public zza:I

.field public final synthetic zzb:Lcom/google/android/recaptcha/internal/zzaw;

.field public final synthetic zzc:Lcom/google/android/recaptcha/RecaptchaAction;

.field public final synthetic zzd:J


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzaw;Lcom/google/android/recaptcha/RecaptchaAction;JLjd/d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzau;->zzb:Lcom/google/android/recaptcha/internal/zzaw;

    iput-object p2, p0, Lcom/google/android/recaptcha/internal/zzau;->zzc:Lcom/google/android/recaptcha/RecaptchaAction;

    iput-wide p3, p0, Lcom/google/android/recaptcha/internal/zzau;->zzd:J

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lld/l;-><init>(ILjd/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ljd/d;)Ljd/d;
    .locals 6

    new-instance p1, Lcom/google/android/recaptcha/internal/zzau;

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzau;->zzb:Lcom/google/android/recaptcha/internal/zzaw;

    iget-object v2, p0, Lcom/google/android/recaptcha/internal/zzau;->zzc:Lcom/google/android/recaptcha/RecaptchaAction;

    iget-wide v3, p0, Lcom/google/android/recaptcha/internal/zzau;->zzd:J

    move-object v0, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/recaptcha/internal/zzau;-><init>(Lcom/google/android/recaptcha/internal/zzaw;Lcom/google/android/recaptcha/RecaptchaAction;JLjd/d;)V

    return-object p1
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lce/p0;

    check-cast p2, Ljd/d;

    invoke-virtual {p0, p1, p2}, Lcom/google/android/recaptcha/internal/zzau;->create(Ljava/lang/Object;Ljd/d;)Ljd/d;

    move-result-object p1

    sget-object p2, Lgd/s;->a:Lgd/s;

    check-cast p1, Lcom/google/android/recaptcha/internal/zzau;

    invoke-virtual {p1, p2}, Lcom/google/android/recaptcha/internal/zzau;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/google/android/recaptcha/internal/zzau;->zza:I

    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    if-eqz v1, :cond_0

    check-cast p1, Lgd/k;

    invoke-virtual {p1}, Lgd/k;->i()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzau;->zzb:Lcom/google/android/recaptcha/internal/zzaw;

    iget-object v1, p0, Lcom/google/android/recaptcha/internal/zzau;->zzc:Lcom/google/android/recaptcha/RecaptchaAction;

    iget-wide v2, p0, Lcom/google/android/recaptcha/internal/zzau;->zzd:J

    const/4 v4, 0x1

    iput v4, p0, Lcom/google/android/recaptcha/internal/zzau;->zza:I

    invoke-static {p1, v1, v2, v3, p0}, Lcom/google/android/recaptcha/internal/zzaw;->zze(Lcom/google/android/recaptcha/internal/zzaw;Lcom/google/android/recaptcha/RecaptchaAction;JLjd/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_1

    return-object v0

    :cond_1
    :goto_0
    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    return-object p1
.end method
