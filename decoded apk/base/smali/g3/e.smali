.class public final Lg3/e;
.super Lg3/v;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg3/e$b;
    }
.end annotation


# instance fields
.field public h:Lfd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfd/a<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field public i:Lfd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfd/a<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public j:Lfd/a;

.field public k:Lfd/a;

.field public l:Lfd/a;

.field public m:Lfd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfd/a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public n:Lfd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfd/a<",
            "Lo3/m0;",
            ">;"
        }
    .end annotation
.end field

.field public o:Lfd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfd/a<",
            "Ln3/g;",
            ">;"
        }
    .end annotation
.end field

.field public p:Lfd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfd/a<",
            "Ln3/y;",
            ">;"
        }
    .end annotation
.end field

.field public q:Lfd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfd/a<",
            "Lm3/c;",
            ">;"
        }
    .end annotation
.end field

.field public r:Lfd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfd/a<",
            "Ln3/s;",
            ">;"
        }
    .end annotation
.end field

.field public s:Lfd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfd/a<",
            "Ln3/w;",
            ">;"
        }
    .end annotation
.end field

.field public t:Lfd/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfd/a<",
            "Lg3/u;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Lg3/v;-><init>()V

    invoke-virtual {p0, p1}, Lg3/e;->j(Landroid/content/Context;)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lg3/e$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lg3/e;-><init>(Landroid/content/Context;)V

    return-void
.end method

.method public static f()Lg3/v$a;
    .locals 2

    new-instance v0, Lg3/e$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lg3/e$b;-><init>(Lg3/e$a;)V

    return-object v0
.end method


# virtual methods
.method public a()Lo3/d;
    .locals 1

    iget-object v0, p0, Lg3/e;->n:Lfd/a;

    invoke-interface {v0}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo3/d;

    return-object v0
.end method

.method public d()Lg3/u;
    .locals 1

    iget-object v0, p0, Lg3/e;->t:Lfd/a;

    invoke-interface {v0}, Lfd/a;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg3/u;

    return-object v0
.end method

.method public final j(Landroid/content/Context;)V
    .locals 9

    invoke-static {}, Lg3/k;->a()Lg3/k;

    move-result-object v0

    invoke-static {v0}, Li3/a;->a(Lfd/a;)Lfd/a;

    move-result-object v0

    iput-object v0, p0, Lg3/e;->h:Lfd/a;

    invoke-static {p1}, Li3/c;->a(Ljava/lang/Object;)Li3/b;

    move-result-object p1

    iput-object p1, p0, Lg3/e;->i:Lfd/a;

    invoke-static {}, Lq3/c;->a()Lq3/c;

    move-result-object v0

    invoke-static {}, Lq3/d;->a()Lq3/d;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lh3/j;->a(Lfd/a;Lfd/a;Lfd/a;)Lh3/j;

    move-result-object p1

    iput-object p1, p0, Lg3/e;->j:Lfd/a;

    iget-object v0, p0, Lg3/e;->i:Lfd/a;

    invoke-static {v0, p1}, Lh3/l;->a(Lfd/a;Lfd/a;)Lh3/l;

    move-result-object p1

    invoke-static {p1}, Li3/a;->a(Lfd/a;)Lfd/a;

    move-result-object p1

    iput-object p1, p0, Lg3/e;->k:Lfd/a;

    iget-object p1, p0, Lg3/e;->i:Lfd/a;

    invoke-static {}, Lo3/g;->a()Lo3/g;

    move-result-object v0

    invoke-static {}, Lo3/i;->a()Lo3/i;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lo3/u0;->a(Lfd/a;Lfd/a;Lfd/a;)Lo3/u0;

    move-result-object p1

    iput-object p1, p0, Lg3/e;->l:Lfd/a;

    iget-object p1, p0, Lg3/e;->i:Lfd/a;

    invoke-static {p1}, Lo3/h;->a(Lfd/a;)Lo3/h;

    move-result-object p1

    invoke-static {p1}, Li3/a;->a(Lfd/a;)Lfd/a;

    move-result-object p1

    iput-object p1, p0, Lg3/e;->m:Lfd/a;

    invoke-static {}, Lq3/c;->a()Lq3/c;

    move-result-object p1

    invoke-static {}, Lq3/d;->a()Lq3/d;

    move-result-object v0

    invoke-static {}, Lo3/j;->a()Lo3/j;

    move-result-object v1

    iget-object v2, p0, Lg3/e;->l:Lfd/a;

    iget-object v3, p0, Lg3/e;->m:Lfd/a;

    invoke-static {p1, v0, v1, v2, v3}, Lo3/n0;->a(Lfd/a;Lfd/a;Lfd/a;Lfd/a;Lfd/a;)Lo3/n0;

    move-result-object p1

    invoke-static {p1}, Li3/a;->a(Lfd/a;)Lfd/a;

    move-result-object p1

    iput-object p1, p0, Lg3/e;->n:Lfd/a;

    invoke-static {}, Lq3/c;->a()Lq3/c;

    move-result-object p1

    invoke-static {p1}, Lm3/g;->b(Lfd/a;)Lm3/g;

    move-result-object p1

    iput-object p1, p0, Lg3/e;->o:Lfd/a;

    iget-object v0, p0, Lg3/e;->i:Lfd/a;

    iget-object v1, p0, Lg3/e;->n:Lfd/a;

    invoke-static {}, Lq3/d;->a()Lq3/d;

    move-result-object v2

    invoke-static {v0, v1, p1, v2}, Lm3/i;->a(Lfd/a;Lfd/a;Lfd/a;Lfd/a;)Lm3/i;

    move-result-object p1

    iput-object p1, p0, Lg3/e;->p:Lfd/a;

    iget-object v0, p0, Lg3/e;->h:Lfd/a;

    iget-object v1, p0, Lg3/e;->k:Lfd/a;

    iget-object v2, p0, Lg3/e;->n:Lfd/a;

    invoke-static {v0, v1, p1, v2, v2}, Lm3/d;->a(Lfd/a;Lfd/a;Lfd/a;Lfd/a;Lfd/a;)Lm3/d;

    move-result-object p1

    iput-object p1, p0, Lg3/e;->q:Lfd/a;

    iget-object v0, p0, Lg3/e;->i:Lfd/a;

    iget-object v1, p0, Lg3/e;->k:Lfd/a;

    iget-object v5, p0, Lg3/e;->n:Lfd/a;

    iget-object v3, p0, Lg3/e;->p:Lfd/a;

    iget-object v4, p0, Lg3/e;->h:Lfd/a;

    invoke-static {}, Lq3/c;->a()Lq3/c;

    move-result-object v6

    invoke-static {}, Lq3/d;->a()Lq3/d;

    move-result-object v7

    iget-object v8, p0, Lg3/e;->n:Lfd/a;

    move-object v2, v5

    invoke-static/range {v0 .. v8}, Ln3/t;->a(Lfd/a;Lfd/a;Lfd/a;Lfd/a;Lfd/a;Lfd/a;Lfd/a;Lfd/a;Lfd/a;)Ln3/t;

    move-result-object p1

    iput-object p1, p0, Lg3/e;->r:Lfd/a;

    iget-object p1, p0, Lg3/e;->h:Lfd/a;

    iget-object v0, p0, Lg3/e;->n:Lfd/a;

    iget-object v1, p0, Lg3/e;->p:Lfd/a;

    invoke-static {p1, v0, v1, v0}, Ln3/x;->a(Lfd/a;Lfd/a;Lfd/a;Lfd/a;)Ln3/x;

    move-result-object p1

    iput-object p1, p0, Lg3/e;->s:Lfd/a;

    invoke-static {}, Lq3/c;->a()Lq3/c;

    move-result-object p1

    invoke-static {}, Lq3/d;->a()Lq3/d;

    move-result-object v0

    iget-object v1, p0, Lg3/e;->q:Lfd/a;

    iget-object v2, p0, Lg3/e;->r:Lfd/a;

    iget-object v3, p0, Lg3/e;->s:Lfd/a;

    invoke-static {p1, v0, v1, v2, v3}, Lg3/w;->a(Lfd/a;Lfd/a;Lfd/a;Lfd/a;Lfd/a;)Lg3/w;

    move-result-object p1

    invoke-static {p1}, Li3/a;->a(Lfd/a;)Lfd/a;

    move-result-object p1

    iput-object p1, p0, Lg3/e;->t:Lfd/a;

    return-void
.end method
