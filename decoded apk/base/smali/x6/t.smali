.class public final Lx6/t;
.super Ly6/r0;
.source ""


# instance fields
.field public final synthetic a:Lx6/c$e;


# direct methods
.method public constructor <init>(Lx6/c;Lx6/c$e;)V
    .locals 0

    iput-object p2, p0, Lx6/t;->a:Lx6/c$e;

    invoke-direct {p0}, Ly6/r0;-><init>()V

    return-void
.end method


# virtual methods
.method public final g1(Lcom/google/android/gms/internal/maps/zzl;)V
    .locals 1

    new-instance v0, Lz6/f;

    invoke-direct {v0, p1}, Lz6/f;-><init>(Lcom/google/android/gms/internal/maps/zzl;)V

    iget-object p1, p0, Lx6/t;->a:Lx6/c$e;

    invoke-interface {p1, v0}, Lx6/c$e;->onCircleClick(Lz6/f;)V

    return-void
.end method
