.class public final Lcom/google/android/gms/internal/location/zzce;
.super Lf6/e;
.source ""

# interfaces
.implements Lw6/u;


# static fields
.field public static final synthetic zza:I


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/location/zzbp;->zzb:Lf6/a;

    sget-object v1, Lf6/a$d;->d:Lf6/a$d$c;

    sget-object v2, Lf6/e$a;->c:Lf6/e$a;

    invoke-direct {p0, p1, v0, v1, v2}, Lf6/e;-><init>(Landroid/app/Activity;Lf6/a;Lf6/a$d;Lf6/e$a;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    sget-object v0, Lcom/google/android/gms/internal/location/zzbp;->zzb:Lf6/a;

    sget-object v1, Lf6/a$d;->d:Lf6/a$d$c;

    sget-object v2, Lf6/e$a;->c:Lf6/e$a;

    invoke-direct {p0, p1, v0, v1, v2}, Lf6/e;-><init>(Landroid/content/Context;Lf6/a;Lf6/a$d;Lf6/e$a;)V

    return-void
.end method


# virtual methods
.method public final checkLocationSettings(Lw6/p;)Lcom/google/android/gms/tasks/Task;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw6/p;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Lw6/q;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lg6/v;->a()Lg6/v$a;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/location/zzcd;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/location/zzcd;-><init>(Lw6/p;)V

    invoke-virtual {v0, v1}, Lg6/v$a;->b(Lg6/q;)Lg6/v$a;

    move-result-object p1

    const/16 v0, 0x97a

    invoke-virtual {p1, v0}, Lg6/v$a;->e(I)Lg6/v$a;

    move-result-object p1

    invoke-virtual {p1}, Lg6/v$a;->a()Lg6/v;

    move-result-object p1

    invoke-virtual {p0, p1}, Lf6/e;->doRead(Lg6/v;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
