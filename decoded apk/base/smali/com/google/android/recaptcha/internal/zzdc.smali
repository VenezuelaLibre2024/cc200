.class public final synthetic Lcom/google/android/recaptcha/internal/zzdc;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static zza(Lcom/google/android/recaptcha/internal/zzdd;II)V
    .locals 1

    if-ne p1, p2, :cond_0

    return-void

    :cond_0
    new-instance p0, Lcom/google/android/recaptcha/internal/zzae;

    const/4 p1, 0x4

    const/16 p2, 0x18

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/android/recaptcha/internal/zzae;-><init>(IILjava/lang/Throwable;)V

    throw p0
.end method
