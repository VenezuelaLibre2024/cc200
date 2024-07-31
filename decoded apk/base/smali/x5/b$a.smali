.class public final Lx5/b$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx5/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Lx5/b$e;

.field public b:Lx5/b$b;

.field public c:Lx5/b$d;

.field public d:Lx5/b$c;

.field public e:Ljava/lang/String;

.field public f:Z

.field public g:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lx5/b$e;->I()Lx5/b$e$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lx5/b$e$a;->b(Z)Lx5/b$e$a;

    invoke-virtual {v0}, Lx5/b$e$a;->a()Lx5/b$e;

    move-result-object v0

    iput-object v0, p0, Lx5/b$a;->a:Lx5/b$e;

    invoke-static {}, Lx5/b$b;->I()Lx5/b$b$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lx5/b$b$a;->b(Z)Lx5/b$b$a;

    invoke-virtual {v0}, Lx5/b$b$a;->a()Lx5/b$b;

    move-result-object v0

    iput-object v0, p0, Lx5/b$a;->b:Lx5/b$b;

    invoke-static {}, Lx5/b$d;->I()Lx5/b$d$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lx5/b$d$a;->b(Z)Lx5/b$d$a;

    invoke-virtual {v0}, Lx5/b$d$a;->a()Lx5/b$d;

    move-result-object v0

    iput-object v0, p0, Lx5/b$a;->c:Lx5/b$d;

    invoke-static {}, Lx5/b$c;->I()Lx5/b$c$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lx5/b$c$a;->b(Z)Lx5/b$c$a;

    invoke-virtual {v0}, Lx5/b$c$a;->a()Lx5/b$c;

    move-result-object v0

    iput-object v0, p0, Lx5/b$a;->d:Lx5/b$c;

    return-void
.end method


# virtual methods
.method public a()Lx5/b;
    .locals 9

    new-instance v8, Lx5/b;

    iget-object v1, p0, Lx5/b$a;->a:Lx5/b$e;

    iget-object v2, p0, Lx5/b$a;->b:Lx5/b$b;

    iget-object v3, p0, Lx5/b$a;->e:Ljava/lang/String;

    iget-boolean v4, p0, Lx5/b$a;->f:Z

    iget v5, p0, Lx5/b$a;->g:I

    iget-object v6, p0, Lx5/b$a;->c:Lx5/b$d;

    iget-object v7, p0, Lx5/b$a;->d:Lx5/b$c;

    move-object v0, v8

    invoke-direct/range {v0 .. v7}, Lx5/b;-><init>(Lx5/b$e;Lx5/b$b;Ljava/lang/String;ZILx5/b$d;Lx5/b$c;)V

    return-object v8
.end method

.method public b(Z)Lx5/b$a;
    .locals 0

    iput-boolean p1, p0, Lx5/b$a;->f:Z

    return-object p0
.end method

.method public c(Lx5/b$b;)Lx5/b$a;
    .locals 0

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx5/b$b;

    iput-object p1, p0, Lx5/b$a;->b:Lx5/b$b;

    return-object p0
.end method

.method public d(Lx5/b$c;)Lx5/b$a;
    .locals 0

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx5/b$c;

    iput-object p1, p0, Lx5/b$a;->d:Lx5/b$c;

    return-object p0
.end method

.method public e(Lx5/b$d;)Lx5/b$a;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx5/b$d;

    iput-object p1, p0, Lx5/b$a;->c:Lx5/b$d;

    return-object p0
.end method

.method public f(Lx5/b$e;)Lx5/b$a;
    .locals 0

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx5/b$e;

    iput-object p1, p0, Lx5/b$a;->a:Lx5/b$e;

    return-object p0
.end method

.method public final g(Ljava/lang/String;)Lx5/b$a;
    .locals 0

    iput-object p1, p0, Lx5/b$a;->e:Ljava/lang/String;

    return-object p0
.end method

.method public final h(I)Lx5/b$a;
    .locals 0

    iput p1, p0, Lx5/b$a;->g:I

    return-object p0
.end method
