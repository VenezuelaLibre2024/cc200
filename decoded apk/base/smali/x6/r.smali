.class public final Lx6/r;
.super Ly6/i;
.source ""


# instance fields
.field public final synthetic a:Lx6/c$g;


# direct methods
.method public constructor <init>(Lx6/c;Lx6/c$g;)V
    .locals 0

    iput-object p2, p0, Lx6/r;->a:Lx6/c$g;

    invoke-direct {p0}, Ly6/i;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/maps/zzad;)V
    .locals 1

    new-instance v0, Lz6/m;

    invoke-direct {v0, p1}, Lz6/m;-><init>(Lcom/google/android/gms/internal/maps/zzad;)V

    iget-object p1, p0, Lx6/r;->a:Lx6/c$g;

    invoke-interface {p1, v0}, Lx6/c$g;->b(Lz6/m;)V

    return-void
.end method
