.class public final Lx6/s;
.super Ly6/i0;
.source ""


# instance fields
.field public final synthetic a:Lx6/c$a;


# direct methods
.method public constructor <init>(Lx6/c;Lx6/c$a;)V
    .locals 0

    iput-object p2, p0, Lx6/s;->a:Lx6/c$a;

    invoke-direct {p0}, Ly6/i0;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/internal/maps/zzad;)Lr6/b;
    .locals 1

    new-instance v0, Lz6/m;

    invoke-direct {v0, p1}, Lz6/m;-><init>(Lcom/google/android/gms/internal/maps/zzad;)V

    iget-object p1, p0, Lx6/s;->a:Lx6/c$a;

    invoke-interface {p1, v0}, Lx6/c$a;->a(Lz6/m;)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lr6/d;->g(Ljava/lang/Object;)Lr6/b;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lcom/google/android/gms/internal/maps/zzad;)Lr6/b;
    .locals 1

    new-instance v0, Lz6/m;

    invoke-direct {v0, p1}, Lz6/m;-><init>(Lcom/google/android/gms/internal/maps/zzad;)V

    iget-object p1, p0, Lx6/s;->a:Lx6/c$a;

    invoke-interface {p1, v0}, Lx6/c$a;->c(Lz6/m;)Landroid/view/View;

    move-result-object p1

    invoke-static {p1}, Lr6/d;->g(Ljava/lang/Object;)Lr6/b;

    move-result-object p1

    return-object p1
.end method
