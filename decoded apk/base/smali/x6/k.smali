.class public final Lx6/k;
.super Ly6/m;
.source ""


# instance fields
.field public final synthetic a:Lx6/c$i;


# direct methods
.method public constructor <init>(Lx6/c;Lx6/c$i;)V
    .locals 0

    iput-object p2, p0, Lx6/k;->a:Lx6/c$i;

    invoke-direct {p0}, Ly6/m;-><init>()V

    return-void
.end method


# virtual methods
.method public final d(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1

    iget-object v0, p0, Lx6/k;->a:Lx6/c$i;

    invoke-interface {v0, p1}, Lx6/c$i;->onMapLongClick(Lcom/google/android/gms/maps/model/LatLng;)V

    return-void
.end method
