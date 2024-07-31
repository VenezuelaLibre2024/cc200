.class public Lw6/o;
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

.field public static final b:Lw6/f;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final c:Lw6/j;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final d:Lw6/t;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/location/zzbp;->zzb:Lf6/a;

    sput-object v0, Lw6/o;->a:Lf6/a;

    new-instance v0, Lcom/google/android/gms/internal/location/zzau;

    invoke-direct {v0}, Lcom/google/android/gms/internal/location/zzau;-><init>()V

    sput-object v0, Lw6/o;->b:Lw6/f;

    new-instance v0, Lcom/google/android/gms/internal/location/zzbv;

    invoke-direct {v0}, Lcom/google/android/gms/internal/location/zzbv;-><init>()V

    sput-object v0, Lw6/o;->c:Lw6/j;

    new-instance v0, Lcom/google/android/gms/internal/location/zzcc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/location/zzcc;-><init>()V

    sput-object v0, Lw6/o;->d:Lw6/t;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lw6/g;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/location/zzbp;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/location/zzbp;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public static b(Landroid/content/Context;)Lw6/u;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/location/zzce;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/location/zzce;-><init>(Landroid/content/Context;)V

    return-object v0
.end method
