.class public Lw6/a;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lf6/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lf6/a<",
            "Lf6/a$d$c;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final b:Lw6/b;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/location/zzag;->zzb:Lf6/a;

    sput-object v0, Lw6/a;->a:Lf6/a;

    new-instance v0, Lcom/google/android/gms/internal/location/zzw;

    invoke-direct {v0}, Lcom/google/android/gms/internal/location/zzw;-><init>()V

    sput-object v0, Lw6/a;->b:Lw6/b;

    return-void
.end method
