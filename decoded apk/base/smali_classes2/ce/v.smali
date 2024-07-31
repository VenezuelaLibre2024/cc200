.class public final Lce/v;
.super Lce/e2;
.source ""

# interfaces
.implements Lce/u;


# instance fields
.field public final l:Lce/w;


# direct methods
.method public constructor <init>(Lce/w;)V
    .locals 0

    invoke-direct {p0}, Lce/e2;-><init>()V

    iput-object p1, p0, Lce/v;->l:Lce/w;

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Throwable;)Z
    .locals 1

    invoke-virtual {p0}, Lce/i2;->v()Lce/j2;

    move-result-object v0

    invoke-virtual {v0, p1}, Lce/j2;->C(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public getParent()Lce/c2;
    .locals 1

    invoke-virtual {p0}, Lce/i2;->v()Lce/j2;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lce/v;->u(Ljava/lang/Throwable;)V

    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method

.method public u(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lce/v;->l:Lce/w;

    invoke-virtual {p0}, Lce/i2;->v()Lce/j2;

    move-result-object v0

    invoke-interface {p1, v0}, Lce/w;->I(Lce/r2;)V

    return-void
.end method
