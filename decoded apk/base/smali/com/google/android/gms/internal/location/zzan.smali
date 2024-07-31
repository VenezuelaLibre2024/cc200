.class final Lcom/google/android/gms/internal/location/zzan;
.super Lcom/google/android/gms/internal/location/zzat;
.source ""


# instance fields
.field public final synthetic zza:Lw6/n;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/location/zzau;Lf6/f;Lw6/n;)V
    .locals 0

    iput-object p3, p0, Lcom/google/android/gms/internal/location/zzan;->zza:Lw6/n;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/location/zzat;-><init>(Lf6/f;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic doExecute(Lf6/a$b;)V
    .locals 3

    check-cast p1, Lcom/google/android/gms/internal/location/zzda;

    iget-object v0, p0, Lcom/google/android/gms/internal/location/zzan;->zza:Lw6/n;

    const-class v1, Lw6/n;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lg6/k;->c(Ljava/lang/Object;Ljava/lang/String;)Lg6/j$a;

    move-result-object v0

    invoke-static {p0}, Lcom/google/android/gms/internal/location/zzau;->zza(Lg6/d;)Lcom/google/android/gms/tasks/TaskCompletionSource;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {p1, v0, v2, v1}, Lcom/google/android/gms/internal/location/zzda;->zzC(Lg6/j$a;ZLcom/google/android/gms/tasks/TaskCompletionSource;)V

    return-void
.end method
