.class final Lcom/google/android/recaptcha/internal/zzas;
.super Lld/d;
.source ""


# instance fields
.field public synthetic zza:Ljava/lang/Object;

.field public final synthetic zzb:Lcom/google/android/recaptcha/internal/zzaw;

.field public zzc:I

.field public zzd:Lcom/google/android/recaptcha/internal/zzaw;

.field public zze:Lcom/google/android/recaptcha/internal/zzbd;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzaw;Ljd/d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzas;->zzb:Lcom/google/android/recaptcha/internal/zzaw;

    invoke-direct {p0, p2}, Lld/d;-><init>(Ljd/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzas;->zza:Ljava/lang/Object;

    iget p1, p0, Lcom/google/android/recaptcha/internal/zzas;->zzc:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/google/android/recaptcha/internal/zzas;->zzc:I

    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzas;->zzb:Lcom/google/android/recaptcha/internal/zzaw;

    const/4 v0, 0x0

    const-wide/16 v1, 0x0

    invoke-static {p1, v0, v1, v2, p0}, Lcom/google/android/recaptcha/internal/zzaw;->zze(Lcom/google/android/recaptcha/internal/zzaw;Lcom/google/android/recaptcha/RecaptchaAction;JLjd/d;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    invoke-static {p1}, Lgd/k;->a(Ljava/lang/Object;)Lgd/k;

    move-result-object p1

    return-object p1
.end method
