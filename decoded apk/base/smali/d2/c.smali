.class public Ld2/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc2/m;


# instance fields
.field public final c:Landroidx/lifecycle/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/q<",
            "Lc2/m$b;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Ln2/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln2/c<",
            "Lc2/m$b$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Landroidx/lifecycle/q;

    invoke-direct {v0}, Landroidx/lifecycle/q;-><init>()V

    iput-object v0, p0, Ld2/c;->c:Landroidx/lifecycle/q;

    invoke-static {}, Ln2/c;->t()Ln2/c;

    move-result-object v0

    iput-object v0, p0, Ld2/c;->d:Ln2/c;

    sget-object v0, Lc2/m;->b:Lc2/m$b$b;

    invoke-virtual {p0, v0}, Ld2/c;->a(Lc2/m$b;)V

    return-void
.end method


# virtual methods
.method public a(Lc2/m$b;)V
    .locals 1

    iget-object v0, p0, Ld2/c;->c:Landroidx/lifecycle/q;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/q;->postValue(Ljava/lang/Object;)V

    instance-of v0, p1, Lc2/m$b$c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ld2/c;->d:Ln2/c;

    check-cast p1, Lc2/m$b$c;

    invoke-virtual {v0, p1}, Ln2/c;->p(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lc2/m$b$a;

    if-eqz v0, :cond_1

    check-cast p1, Lc2/m$b$a;

    iget-object v0, p0, Ld2/c;->d:Ln2/c;

    invoke-virtual {p1}, Lc2/m$b$a;->a()Ljava/lang/Throwable;

    move-result-object p1

    invoke-virtual {v0, p1}, Ln2/c;->q(Ljava/lang/Throwable;)Z

    :cond_1
    :goto_0
    return-void
.end method
