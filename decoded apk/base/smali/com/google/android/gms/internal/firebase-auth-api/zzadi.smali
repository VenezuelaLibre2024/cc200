.class public final synthetic Lcom/google/android/gms/internal/firebase-auth-api/zzadi;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private synthetic zza:Lcom/google/android/gms/internal/firebase-auth-api/zzadf;

.field private synthetic zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzadh;

.field private synthetic zzc:Lcom/google/android/gms/tasks/TaskCompletionSource;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/zzadf;Lcom/google/android/gms/internal/firebase-auth-api/zzadh;Lcom/google/android/gms/tasks/TaskCompletionSource;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzadi;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzadf;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzadi;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzadh;

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzadi;->zzc:Lcom/google/android/gms/tasks/TaskCompletionSource;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzadi;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzadf;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzadi;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/zzadh;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzadi;->zzc:Lcom/google/android/gms/tasks/TaskCompletionSource;

    iget-object v0, v0, Lcom/google/android/gms/internal/firebase-auth-api/zzadf;->zza:Lcom/google/android/gms/internal/firebase-auth-api/zzace;

    invoke-interface {v1, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzadh;->zza(Lcom/google/android/gms/tasks/TaskCompletionSource;Lcom/google/android/gms/internal/firebase-auth-api/zzace;)V

    return-void
.end method
