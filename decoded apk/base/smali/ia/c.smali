.class public final Lia/c;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lia/b;

.field public b:Loa/b;


# direct methods
.method public constructor <init>(Lia/b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_0

    iput-object p1, p0, Lia/c;->a:Lia/b;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Binarizer must be non-null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()Loa/b;
    .locals 1

    iget-object v0, p0, Lia/c;->b:Loa/b;

    if-nez v0, :cond_0

    iget-object v0, p0, Lia/c;->a:Lia/b;

    invoke-virtual {v0}, Lia/b;->b()Loa/b;

    move-result-object v0

    iput-object v0, p0, Lia/c;->b:Loa/b;

    :cond_0
    iget-object v0, p0, Lia/c;->b:Loa/b;

    return-object v0
.end method

.method public b(ILoa/a;)Loa/a;
    .locals 1

    iget-object v0, p0, Lia/c;->a:Lia/b;

    invoke-virtual {v0, p1, p2}, Lia/b;->c(ILoa/a;)Loa/a;

    move-result-object p1

    return-object p1
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Lia/c;->a:Lia/b;

    invoke-virtual {v0}, Lia/b;->d()I

    move-result v0

    return v0
.end method

.method public d()I
    .locals 1

    iget-object v0, p0, Lia/c;->a:Lia/b;

    invoke-virtual {v0}, Lia/b;->f()I

    move-result v0

    return v0
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Lia/c;->a:Lia/b;

    invoke-virtual {v0}, Lia/b;->e()Lia/h;

    move-result-object v0

    invoke-virtual {v0}, Lia/h;->f()Z

    move-result v0

    return v0
.end method

.method public f()Lia/c;
    .locals 3

    iget-object v0, p0, Lia/c;->a:Lia/b;

    invoke-virtual {v0}, Lia/b;->e()Lia/h;

    move-result-object v0

    invoke-virtual {v0}, Lia/h;->g()Lia/h;

    move-result-object v0

    new-instance v1, Lia/c;

    iget-object v2, p0, Lia/c;->a:Lia/b;

    invoke-virtual {v2, v0}, Lia/b;->a(Lia/h;)Lia/b;

    move-result-object v0

    invoke-direct {v1, v0}, Lia/c;-><init>(Lia/b;)V

    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Lia/c;->a()Loa/b;

    move-result-object v0

    invoke-virtual {v0}, Loa/b;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Lia/j; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const-string v0, ""

    return-object v0
.end method
