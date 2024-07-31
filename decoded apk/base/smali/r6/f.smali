.class public final Lr6/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:Lr6/a;


# direct methods
.method public constructor <init>(Lr6/a;)V
    .locals 0

    iput-object p1, p0, Lr6/f;->a:Lr6/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lr6/c;)V
    .locals 2

    iget-object v0, p0, Lr6/f;->a:Lr6/a;

    invoke-static {v0, p1}, Lr6/a;->l(Lr6/a;Lr6/c;)V

    iget-object p1, p0, Lr6/f;->a:Lr6/a;

    invoke-static {p1}, Lr6/a;->k(Lr6/a;)Ljava/util/LinkedList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/LinkedList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr6/k;

    iget-object v1, p0, Lr6/f;->a:Lr6/a;

    invoke-static {v1}, Lr6/a;->j(Lr6/a;)Lr6/c;

    move-result-object v1

    invoke-interface {v0, v1}, Lr6/k;->b(Lr6/c;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lr6/f;->a:Lr6/a;

    invoke-static {p1}, Lr6/a;->k(Lr6/a;)Ljava/util/LinkedList;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/LinkedList;->clear()V

    iget-object p1, p0, Lr6/f;->a:Lr6/a;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lr6/a;->m(Lr6/a;Landroid/os/Bundle;)V

    return-void
.end method
