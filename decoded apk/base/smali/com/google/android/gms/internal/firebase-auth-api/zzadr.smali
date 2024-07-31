.class final Lcom/google/android/gms/internal/firebase-auth-api/zzadr;
.super Lcom/google/firebase/auth/b$b;
.source ""


# instance fields
.field private final synthetic zza:Lcom/google/firebase/auth/b$b;

.field private final synthetic zzb:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/google/firebase/auth/b$b;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzadr;->zza:Lcom/google/firebase/auth/b$b;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzadr;->zzb:Ljava/lang/String;

    invoke-direct {p0}, Lcom/google/firebase/auth/b$b;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCodeAutoRetrievalTimeOut(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzadr;->zzb:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzads;->zza(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzadr;->zza:Lcom/google/firebase/auth/b$b;

    invoke-virtual {v0, p1}, Lcom/google/firebase/auth/b$b;->onCodeAutoRetrievalTimeOut(Ljava/lang/String;)V

    return-void
.end method

.method public final onCodeSent(Ljava/lang/String;Lcom/google/firebase/auth/b$a;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzadr;->zza:Lcom/google/firebase/auth/b$b;

    invoke-virtual {v0, p1, p2}, Lcom/google/firebase/auth/b$b;->onCodeSent(Ljava/lang/String;Lcom/google/firebase/auth/b$a;)V

    return-void
.end method

.method public final onVerificationCompleted(Lw7/o0;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzadr;->zzb:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzads;->zza(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzadr;->zza:Lcom/google/firebase/auth/b$b;

    invoke-virtual {v0, p1}, Lcom/google/firebase/auth/b$b;->onVerificationCompleted(Lw7/o0;)V

    return-void
.end method

.method public final onVerificationFailed(Ln7/m;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzadr;->zzb:Ljava/lang/String;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/zzads;->zza(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/zzadr;->zza:Lcom/google/firebase/auth/b$b;

    invoke-virtual {v0, p1}, Lcom/google/firebase/auth/b$b;->onVerificationFailed(Ln7/m;)V

    return-void
.end method
