.class public final Lx6/p;
.super Ly6/s;
.source ""


# instance fields
.field public final synthetic a:Lx6/c$k;


# direct methods
.method public constructor <init>(Lx6/c;Lx6/c$k;)V
    .locals 0

    iput-object p2, p0, Lx6/p;->a:Lx6/c$k;

    invoke-direct {p0}, Ly6/s;-><init>()V

    return-void
.end method


# virtual methods
.method public final Z0(Lcom/google/android/gms/internal/maps/zzad;)V
    .locals 1

    new-instance v0, Lz6/m;

    invoke-direct {v0, p1}, Lz6/m;-><init>(Lcom/google/android/gms/internal/maps/zzad;)V

    iget-object p1, p0, Lx6/p;->a:Lx6/c$k;

    invoke-interface {p1, v0}, Lx6/c$k;->onMarkerDragStart(Lz6/m;)V

    return-void
.end method

.method public final a(Lcom/google/android/gms/internal/maps/zzad;)V
    .locals 1

    new-instance v0, Lz6/m;

    invoke-direct {v0, p1}, Lz6/m;-><init>(Lcom/google/android/gms/internal/maps/zzad;)V

    iget-object p1, p0, Lx6/p;->a:Lx6/c$k;

    invoke-interface {p1, v0}, Lx6/c$k;->onMarkerDrag(Lz6/m;)V

    return-void
.end method

.method public final b(Lcom/google/android/gms/internal/maps/zzad;)V
    .locals 1

    new-instance v0, Lz6/m;

    invoke-direct {v0, p1}, Lz6/m;-><init>(Lcom/google/android/gms/internal/maps/zzad;)V

    iget-object p1, p0, Lx6/p;->a:Lx6/c$k;

    invoke-interface {p1, v0}, Lx6/c$k;->onMarkerDragEnd(Lz6/m;)V

    return-void
.end method
