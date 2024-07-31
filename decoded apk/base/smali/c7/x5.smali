.class public final synthetic Lc7/x5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public synthetic a:Lc7/u5;


# direct methods
.method public synthetic constructor <init>(Lc7/u5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc7/x5;->a:Lc7/u5;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lc7/x5;->a:Lc7/u5;

    new-instance v1, Lcom/google/android/gms/internal/measurement/zzr;

    iget-object v0, v0, Lc7/u5;->k:Lcom/google/android/gms/internal/measurement/zzv;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/measurement/zzr;-><init>(Lcom/google/android/gms/internal/measurement/zzv;)V

    return-object v1
.end method
