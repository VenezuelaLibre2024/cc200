.class public final Lx6/w;
.super Ly6/a0;
.source ""


# instance fields
.field public final synthetic a:Lx6/c$n;


# direct methods
.method public constructor <init>(Lx6/c;Lx6/c$n;)V
    .locals 0

    iput-object p2, p0, Lx6/w;->a:Lx6/c$n;

    invoke-direct {p0}, Ly6/a0;-><init>()V

    return-void
.end method


# virtual methods
.method public final E0(Lr6/b;)V
    .locals 1

    invoke-static {p1}, Lr6/d;->e(Lr6/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;

    iget-object v0, p0, Lx6/w;->a:Lx6/c$n;

    invoke-interface {v0, p1}, Lx6/c$n;->onSnapshotReady(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public final V(Landroid/graphics/Bitmap;)V
    .locals 1

    iget-object v0, p0, Lx6/w;->a:Lx6/c$n;

    invoke-interface {v0, p1}, Lx6/c$n;->onSnapshotReady(Landroid/graphics/Bitmap;)V

    return-void
.end method
