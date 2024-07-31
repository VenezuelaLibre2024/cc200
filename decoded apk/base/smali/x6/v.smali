.class public final Lx6/v;
.super Ly6/x;
.source ""


# instance fields
.field public final synthetic a:Lx6/c$m;


# direct methods
.method public constructor <init>(Lx6/c;Lx6/c$m;)V
    .locals 0

    iput-object p2, p0, Lx6/v;->a:Lx6/c$m;

    invoke-direct {p0}, Ly6/x;-><init>()V

    return-void
.end method


# virtual methods
.method public final K(Lcom/google/android/gms/internal/maps/zzaj;)V
    .locals 1

    new-instance v0, Lz6/s;

    invoke-direct {v0, p1}, Lz6/s;-><init>(Lcom/google/android/gms/internal/maps/zzaj;)V

    iget-object p1, p0, Lx6/v;->a:Lx6/c$m;

    invoke-interface {p1, v0}, Lx6/c$m;->onPolylineClick(Lz6/s;)V

    return-void
.end method
