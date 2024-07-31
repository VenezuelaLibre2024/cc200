.class public Lca/f$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx6/c$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lca/f;->onAdd()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Lca/f;


# direct methods
.method public constructor <init>(Lca/f;)V
    .locals 0

    iput-object p1, p0, Lca/f$a;->h:Lca/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMarkerClick(Lz6/m;)Z
    .locals 2

    iget-object v0, p0, Lca/f$a;->h:Lca/f;

    invoke-static {v0}, Lca/f;->access$200(Lca/f;)Laa/c$f;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lca/f$a;->h:Lca/f;

    invoke-static {v0}, Lca/f;->access$200(Lca/f;)Laa/c$f;

    move-result-object v0

    iget-object v1, p0, Lca/f$a;->h:Lca/f;

    invoke-static {v1}, Lca/f;->access$300(Lca/f;)Lca/f$e;

    move-result-object v1

    invoke-virtual {v1, p1}, Lca/f$e;->a(Lz6/m;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Laa/b;

    invoke-interface {v0, p1}, Laa/c$f;->onClusterItemClick(Laa/b;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
