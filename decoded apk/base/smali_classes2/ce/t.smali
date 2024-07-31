.class public final Lce/t;
.super Lce/e2;
.source ""


# instance fields
.field public final l:Lce/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lce/p<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lce/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lce/p<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lce/e2;-><init>()V

    iput-object p1, p0, Lce/t;->l:Lce/p;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lce/t;->u(Ljava/lang/Throwable;)V

    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method

.method public u(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lce/t;->l:Lce/p;

    invoke-virtual {p0}, Lce/i2;->v()Lce/j2;

    move-result-object v0

    invoke-virtual {p1, v0}, Lce/p;->w(Lce/c2;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p1, v0}, Lce/p;->I(Ljava/lang/Throwable;)V

    return-void
.end method
