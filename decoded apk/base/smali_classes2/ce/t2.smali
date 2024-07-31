.class public final Lce/t2;
.super Lce/i2;
.source ""


# instance fields
.field public final l:Ljd/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljd/d<",
            "Lgd/s;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljd/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lce/i2;-><init>()V

    iput-object p1, p0, Lce/t2;->l:Ljd/d;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lce/t2;->u(Ljava/lang/Throwable;)V

    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method

.method public u(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lce/t2;->l:Ljd/d;

    sget-object v0, Lgd/k;->i:Lgd/k$a;

    sget-object v0, Lgd/s;->a:Lgd/s;

    invoke-static {v0}, Lgd/k;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v0}, Ljd/d;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
