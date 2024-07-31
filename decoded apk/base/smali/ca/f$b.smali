.class public Lca/f$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx6/c$f;


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

    iput-object p1, p0, Lca/f$b;->h:Lca/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInfoWindowClick(Lz6/m;)V
    .locals 2

    iget-object v0, p0, Lca/f$b;->h:Lca/f;

    invoke-static {v0}, Lca/f;->access$400(Lca/f;)Laa/c$g;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lca/f$b;->h:Lca/f;

    invoke-static {v0}, Lca/f;->access$400(Lca/f;)Laa/c$g;

    move-result-object v0

    iget-object v1, p0, Lca/f$b;->h:Lca/f;

    invoke-static {v1}, Lca/f;->access$300(Lca/f;)Lca/f$e;

    move-result-object v1

    invoke-virtual {v1, p1}, Lca/f$e;->a(Lz6/m;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Laa/b;

    invoke-interface {v0, p1}, Laa/c$g;->a(Laa/b;)V

    :cond_0
    return-void
.end method
