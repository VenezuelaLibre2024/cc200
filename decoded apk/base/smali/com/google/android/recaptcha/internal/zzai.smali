.class final Lcom/google/android/recaptcha/internal/zzai;
.super Lld/d;
.source ""


# instance fields
.field public zza:Ljava/lang/Object;

.field public zzb:Ljava/lang/Object;

.field public zzc:Ljava/lang/Object;

.field public zzd:J

.field public synthetic zze:Ljava/lang/Object;

.field public final synthetic zzf:Lcom/google/android/recaptcha/internal/zzam;

.field public zzg:I

.field public zzh:Lle/a;

.field public zzi:Lcom/google/android/recaptcha/internal/zzt;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzam;Ljd/d;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzai;->zzf:Lcom/google/android/recaptcha/internal/zzam;

    invoke-direct {p0, p2}, Lld/d;-><init>(Ljd/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzai;->zze:Ljava/lang/Object;

    iget p1, p0, Lcom/google/android/recaptcha/internal/zzai;->zzg:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcom/google/android/recaptcha/internal/zzai;->zzg:I

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzai;->zzf:Lcom/google/android/recaptcha/internal/zzam;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v9, p0

    invoke-virtual/range {v0 .. v9}, Lcom/google/android/recaptcha/internal/zzam;->zza(Landroid/app/Application;Ljava/lang/String;JLcom/google/android/recaptcha/internal/zzab;Landroid/webkit/WebView;Lcom/google/android/recaptcha/internal/zzbq;Lcom/google/android/recaptcha/internal/zzt;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
