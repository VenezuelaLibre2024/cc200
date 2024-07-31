.class final Lcom/google/android/recaptcha/internal/zzev;
.super Lld/d;
.source ""


# instance fields
.field public zza:J

.field public synthetic zzb:Ljava/lang/Object;

.field public final synthetic zzc:Lcom/google/android/recaptcha/internal/zzez;

.field public zzd:I

.field public zze:Lcom/google/android/recaptcha/internal/zzez;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzez;Ljd/d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzev;->zzc:Lcom/google/android/recaptcha/internal/zzez;

    invoke-direct {p0, p2}, Lld/d;-><init>(Ljd/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzev;->zzb:Ljava/lang/Object;

    iget p1, p0, Lcom/google/android/recaptcha/internal/zzev;->zzd:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/google/android/recaptcha/internal/zzev;->zzd:I

    iget-object p1, p0, Lcom/google/android/recaptcha/internal/zzev;->zzc:Lcom/google/android/recaptcha/internal/zzez;

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2, p0}, Lcom/google/android/recaptcha/internal/zzez;->zzb(JLcom/google/android/recaptcha/internal/zzoe;Ljd/d;)Ljava/lang/Object;

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
