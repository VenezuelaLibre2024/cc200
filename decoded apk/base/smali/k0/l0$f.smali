.class public Lk0/l0$f;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk0/l0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation


# instance fields
.field public final a:Lk0/l0;

.field public b:[La0/b;


# direct methods
.method public constructor <init>()V
    .locals 2

    new-instance v0, Lk0/l0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lk0/l0;-><init>(Lk0/l0;)V

    invoke-direct {p0, v0}, Lk0/l0$f;-><init>(Lk0/l0;)V

    return-void
.end method

.method public constructor <init>(Lk0/l0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk0/l0$f;->a:Lk0/l0;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 5

    iget-object v0, p0, Lk0/l0$f;->b:[La0/b;

    if-eqz v0, :cond_4

    const/4 v1, 0x1

    invoke-static {v1}, Lk0/l0$m;->b(I)I

    move-result v2

    aget-object v0, v0, v2

    iget-object v2, p0, Lk0/l0$f;->b:[La0/b;

    const/4 v3, 0x2

    invoke-static {v3}, Lk0/l0$m;->b(I)I

    move-result v4

    aget-object v2, v2, v4

    if-nez v2, :cond_0

    iget-object v2, p0, Lk0/l0$f;->a:Lk0/l0;

    invoke-virtual {v2, v3}, Lk0/l0;->f(I)La0/b;

    move-result-object v2

    :cond_0
    if-nez v0, :cond_1

    iget-object v0, p0, Lk0/l0$f;->a:Lk0/l0;

    invoke-virtual {v0, v1}, Lk0/l0;->f(I)La0/b;

    move-result-object v0

    :cond_1
    invoke-static {v0, v2}, La0/b;->a(La0/b;La0/b;)La0/b;

    move-result-object v0

    invoke-virtual {p0, v0}, Lk0/l0$f;->f(La0/b;)V

    iget-object v0, p0, Lk0/l0$f;->b:[La0/b;

    const/16 v1, 0x10

    invoke-static {v1}, Lk0/l0$m;->b(I)I

    move-result v1

    aget-object v0, v0, v1

    if-eqz v0, :cond_2

    invoke-virtual {p0, v0}, Lk0/l0$f;->e(La0/b;)V

    :cond_2
    iget-object v0, p0, Lk0/l0$f;->b:[La0/b;

    const/16 v1, 0x20

    invoke-static {v1}, Lk0/l0$m;->b(I)I

    move-result v1

    aget-object v0, v0, v1

    if-eqz v0, :cond_3

    invoke-virtual {p0, v0}, Lk0/l0$f;->c(La0/b;)V

    :cond_3
    iget-object v0, p0, Lk0/l0$f;->b:[La0/b;

    const/16 v1, 0x40

    invoke-static {v1}, Lk0/l0$m;->b(I)I

    move-result v1

    aget-object v0, v0, v1

    if-eqz v0, :cond_4

    invoke-virtual {p0, v0}, Lk0/l0$f;->g(La0/b;)V

    :cond_4
    return-void
.end method

.method public b()Lk0/l0;
    .locals 1

    invoke-virtual {p0}, Lk0/l0$f;->a()V

    iget-object v0, p0, Lk0/l0$f;->a:Lk0/l0;

    return-object v0
.end method

.method public c(La0/b;)V
    .locals 0

    return-void
.end method

.method public d(La0/b;)V
    .locals 0

    return-void
.end method

.method public e(La0/b;)V
    .locals 0

    return-void
.end method

.method public f(La0/b;)V
    .locals 0

    return-void
.end method

.method public g(La0/b;)V
    .locals 0

    return-void
.end method
