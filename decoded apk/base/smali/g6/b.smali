.class public final Lg6/b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<O::",
        "Lf6/a$d;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:Lf6/a;

.field public final c:Lf6/a$d;

.field public final d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lf6/a;Lf6/a$d;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg6/b;->b:Lf6/a;

    iput-object p2, p0, Lg6/b;->c:Lf6/a$d;

    iput-object p3, p0, Lg6/b;->d:Ljava/lang/String;

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x1

    aput-object p2, v0, p1

    const/4 p1, 0x2

    aput-object p3, v0, p1

    invoke-static {v0}, Lh6/q;->c([Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Lg6/b;->a:I

    return-void
.end method

.method public static a(Lf6/a;Lf6/a$d;Ljava/lang/String;)Lg6/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<O::",
            "Lf6/a$d;",
            ">(",
            "Lf6/a<",
            "TO;>;TO;",
            "Ljava/lang/String;",
            ")",
            "Lg6/b<",
            "TO;>;"
        }
    .end annotation

    new-instance v0, Lg6/b;

    invoke-direct {v0, p0, p1, p2}, Lg6/b;-><init>(Lf6/a;Lf6/a$d;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lg6/b;->b:Lf6/a;

    invoke-virtual {v0}, Lf6/a;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x1

    if-ne p1, p0, :cond_1

    return v1

    :cond_1
    instance-of v2, p1, Lg6/b;

    if-nez v2, :cond_2

    return v0

    :cond_2
    check-cast p1, Lg6/b;

    iget-object v2, p0, Lg6/b;->b:Lf6/a;

    iget-object v3, p1, Lg6/b;->b:Lf6/a;

    invoke-static {v2, v3}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lg6/b;->c:Lf6/a$d;

    iget-object v3, p1, Lg6/b;->c:Lf6/a$d;

    invoke-static {v2, v3}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Lg6/b;->d:Ljava/lang/String;

    iget-object p1, p1, Lg6/b;->d:Ljava/lang/String;

    invoke-static {v2, p1}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    return v1

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, Lg6/b;->a:I

    return v0
.end method
