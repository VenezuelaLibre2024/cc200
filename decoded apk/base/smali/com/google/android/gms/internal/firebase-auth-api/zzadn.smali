.class public final Lcom/google/android/gms/internal/firebase-auth-api/zzadn;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static zza(Lw7/o0;)Lcom/google/android/gms/internal/firebase-auth-api/zzagx;
    .locals 2

    invoke-virtual {p0}, Lw7/o0;->zzd()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lw7/o0;->O()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lw7/o0;->zzd()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lw7/o0;->Q()Z

    move-result p0

    invoke-static {v0, v1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzagx;->zzb(Ljava/lang/String;Ljava/lang/String;Z)Lcom/google/android/gms/internal/firebase-auth-api/zzagx;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lw7/o0;->zzc()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lw7/o0;->L()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lw7/o0;->Q()Z

    move-result p0

    invoke-static {v0, v1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/zzagx;->zza(Ljava/lang/String;Ljava/lang/String;Z)Lcom/google/android/gms/internal/firebase-auth-api/zzagx;

    move-result-object p0

    return-object p0
.end method
