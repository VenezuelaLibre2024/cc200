.class public final synthetic Lc7/y5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public synthetic a:Lc7/u5;

.field public synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lc7/u5;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc7/y5;->a:Lc7/u5;

    iput-object p2, p0, Lc7/y5;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lc7/y5;->a:Lc7/u5;

    iget-object v1, p0, Lc7/y5;->b:Ljava/lang/String;

    new-instance v2, Lcom/google/android/gms/internal/measurement/zzx;

    new-instance v3, Lc7/w5;

    invoke-direct {v3, v0, v1}, Lc7/w5;-><init>(Lc7/u5;Ljava/lang/String;)V

    const-string v0, "internal.appMetadata"

    invoke-direct {v2, v0, v3}, Lcom/google/android/gms/internal/measurement/zzx;-><init>(Ljava/lang/String;Ljava/util/concurrent/Callable;)V

    return-object v2
.end method