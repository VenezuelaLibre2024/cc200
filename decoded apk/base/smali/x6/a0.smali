.class public final Lx6/a0;
.super Ly6/k;
.source ""


# instance fields
.field public final synthetic a:Lx6/c$h;


# direct methods
.method public constructor <init>(Lx6/c;Lx6/c$h;)V
    .locals 0

    iput-object p2, p0, Lx6/a0;->a:Lx6/c$h;

    invoke-direct {p0}, Ly6/k;-><init>()V

    return-void
.end method


# virtual methods
.method public final d(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1

    iget-object v0, p0, Lx6/a0;->a:Lx6/c$h;

    invoke-interface {v0, p1}, Lx6/c$h;->onMapClick(Lcom/google/android/gms/maps/model/LatLng;)V

    return-void
.end method
