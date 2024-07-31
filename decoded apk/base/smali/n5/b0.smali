.class public abstract Ln5/b0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln5/b0$a;
    }
.end annotation


# instance fields
.field public a:Ln5/b0$a;

.field public b:Lo5/e;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lo5/e;
    .locals 1

    iget-object v0, p0, Ln5/b0;->b:Lo5/e;

    invoke-static {v0}, Lp5/a;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo5/e;

    return-object v0
.end method

.method public b(Ln5/b0$a;Lo5/e;)V
    .locals 0

    iput-object p1, p0, Ln5/b0;->a:Ln5/b0$a;

    iput-object p2, p0, Ln5/b0;->b:Lo5/e;

    return-void
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Ln5/b0;->a:Ln5/b0$a;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ln5/b0$a;->c()V

    :cond_0
    return-void
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract e(Ljava/lang/Object;)V
.end method

.method public f()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Ln5/b0;->a:Ln5/b0$a;

    iput-object v0, p0, Ln5/b0;->b:Lo5/e;

    return-void
.end method

.method public abstract g([Ls3/j3;Lu4/u0;Lu4/t$b;Ls3/u3;)Ln5/c0;
.end method

.method public h(Lu3/e;)V
    .locals 0

    return-void
.end method
