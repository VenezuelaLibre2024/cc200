.class public final Lcom/google/android/recaptcha/internal/zzbj;
.super Ljava/util/TimerTask;
.source ""


# instance fields
.field public final synthetic zza:Lcom/google/android/recaptcha/internal/zzbm;


# direct methods
.method public constructor <init>(Lcom/google/android/recaptcha/internal/zzbm;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/recaptcha/internal/zzbj;->zza:Lcom/google/android/recaptcha/internal/zzbm;

    invoke-direct {p0}, Ljava/util/TimerTask;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lcom/google/android/recaptcha/internal/zzbj;->zza:Lcom/google/android/recaptcha/internal/zzbm;

    invoke-static {v0}, Lcom/google/android/recaptcha/internal/zzbm;->zzd(Lcom/google/android/recaptcha/internal/zzbm;)Lce/p0;

    move-result-object v1

    new-instance v4, Lcom/google/android/recaptcha/internal/zzbk;

    const/4 v2, 0x0

    invoke-direct {v4, v0, v2}, Lcom/google/android/recaptcha/internal/zzbk;-><init>(Lcom/google/android/recaptcha/internal/zzbm;Ljd/d;)V

    const/4 v3, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lce/i;->d(Lce/p0;Ljd/g;Lce/r0;Lsd/p;ILjava/lang/Object;)Lce/c2;

    return-void
.end method
