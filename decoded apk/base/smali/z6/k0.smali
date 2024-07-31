.class public final Lz6/k0;
.super Lcom/google/android/gms/internal/maps/zzao;
.source ""


# instance fields
.field public final synthetic a:Lz6/d0;


# direct methods
.method public constructor <init>(Lz6/c0;Lz6/d0;)V
    .locals 0

    iput-object p2, p0, Lz6/k0;->a:Lz6/d0;

    invoke-direct {p0}, Lcom/google/android/gms/internal/maps/zzao;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzb(III)Lz6/a0;
    .locals 1

    iget-object v0, p0, Lz6/k0;->a:Lz6/d0;

    invoke-interface {v0, p1, p2, p3}, Lz6/d0;->getTile(III)Lz6/a0;

    move-result-object p1

    return-object p1
.end method
