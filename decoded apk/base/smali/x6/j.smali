.class public final Lx6/j;
.super Ly6/q;
.source ""


# instance fields
.field public final synthetic a:Lx6/c$j;


# direct methods
.method public constructor <init>(Lx6/c;Lx6/c$j;)V
    .locals 0

    iput-object p2, p0, Lx6/j;->a:Lx6/c$j;

    invoke-direct {p0}, Ly6/q;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/maps/zzad;)Z
    .locals 1

    new-instance v0, Lz6/m;

    invoke-direct {v0, p1}, Lz6/m;-><init>(Lcom/google/android/gms/internal/maps/zzad;)V

    iget-object p1, p0, Lx6/j;->a:Lx6/c$j;

    invoke-interface {p1, v0}, Lx6/c$j;->onMarkerClick(Lz6/m;)Z

    move-result p1

    return p1
.end method