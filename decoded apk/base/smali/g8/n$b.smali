.class public final Lg8/n$b;
.super Lg8/f0$e$d$a$b$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg8/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lg8/f0$e$d$a$b$e;",
            ">;"
        }
    .end annotation
.end field

.field public b:Lg8/f0$e$d$a$b$c;

.field public c:Lg8/f0$a;

.field public d:Lg8/f0$e$d$a$b$d;

.field public e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lg8/f0$e$d$a$b$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lg8/f0$e$d$a$b$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lg8/f0$e$d$a$b;
    .locals 9

    iget-object v0, p0, Lg8/n$b;->d:Lg8/f0$e$d$a$b$d;

    const-string v1, ""

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " signal"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_0
    iget-object v0, p0, Lg8/n$b;->e:Ljava/util/List;

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " binaries"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Lg8/n;

    iget-object v3, p0, Lg8/n$b;->a:Ljava/util/List;

    iget-object v4, p0, Lg8/n$b;->b:Lg8/f0$e$d$a$b$c;

    iget-object v5, p0, Lg8/n$b;->c:Lg8/f0$a;

    iget-object v6, p0, Lg8/n$b;->d:Lg8/f0$e$d$a$b$d;

    iget-object v7, p0, Lg8/n$b;->e:Ljava/util/List;

    const/4 v8, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Lg8/n;-><init>(Ljava/util/List;Lg8/f0$e$d$a$b$c;Lg8/f0$a;Lg8/f0$e$d$a$b$d;Ljava/util/List;Lg8/n$a;)V

    return-object v0

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing required properties:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(Lg8/f0$a;)Lg8/f0$e$d$a$b$b;
    .locals 0

    iput-object p1, p0, Lg8/n$b;->c:Lg8/f0$a;

    return-object p0
.end method

.method public c(Ljava/util/List;)Lg8/f0$e$d$a$b$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lg8/f0$e$d$a$b$a;",
            ">;)",
            "Lg8/f0$e$d$a$b$b;"
        }
    .end annotation

    const-string v0, "Null binaries"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lg8/n$b;->e:Ljava/util/List;

    return-object p0
.end method

.method public d(Lg8/f0$e$d$a$b$c;)Lg8/f0$e$d$a$b$b;
    .locals 0

    iput-object p1, p0, Lg8/n$b;->b:Lg8/f0$e$d$a$b$c;

    return-object p0
.end method

.method public e(Lg8/f0$e$d$a$b$d;)Lg8/f0$e$d$a$b$b;
    .locals 1

    const-string v0, "Null signal"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lg8/n$b;->d:Lg8/f0$e$d$a$b$d;

    return-object p0
.end method

.method public f(Ljava/util/List;)Lg8/f0$e$d$a$b$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lg8/f0$e$d$a$b$e;",
            ">;)",
            "Lg8/f0$e$d$a$b$b;"
        }
    .end annotation

    iput-object p1, p0, Lg8/n$b;->a:Ljava/util/List;

    return-object p0
.end method
