.class public final Lx6/u;
.super Ly6/v;
.source ""


# instance fields
.field public final synthetic a:Lx6/c$l;


# direct methods
.method public constructor <init>(Lx6/c;Lx6/c$l;)V
    .locals 0

    iput-object p2, p0, Lx6/u;->a:Lx6/c$l;

    invoke-direct {p0}, Ly6/v;-><init>()V

    return-void
.end method


# virtual methods
.method public final K0(Lcom/google/android/gms/internal/maps/zzag;)V
    .locals 1

    new-instance v0, Lz6/q;

    invoke-direct {v0, p1}, Lz6/q;-><init>(Lcom/google/android/gms/internal/maps/zzag;)V

    iget-object p1, p0, Lx6/u;->a:Lx6/c$l;

    invoke-interface {p1, v0}, Lx6/c$l;->onPolygonClick(Lz6/q;)V

    return-void
.end method
