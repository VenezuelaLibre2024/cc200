.class public final Lb9/a$b;
.super Lb9/d$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb9/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Lb9/c$a;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/Long;

.field public f:Ljava/lang/Long;

.field public g:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb9/d$a;-><init>()V

    return-void
.end method

.method public constructor <init>(Lb9/d;)V
    .locals 2

    invoke-direct {p0}, Lb9/d$a;-><init>()V

    invoke-virtual {p1}, Lb9/d;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lb9/a$b;->a:Ljava/lang/String;

    invoke-virtual {p1}, Lb9/d;->g()Lb9/c$a;

    move-result-object v0

    iput-object v0, p0, Lb9/a$b;->b:Lb9/c$a;

    invoke-virtual {p1}, Lb9/d;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lb9/a$b;->c:Ljava/lang/String;

    invoke-virtual {p1}, Lb9/d;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lb9/a$b;->d:Ljava/lang/String;

    invoke-virtual {p1}, Lb9/d;->c()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lb9/a$b;->e:Ljava/lang/Long;

    invoke-virtual {p1}, Lb9/d;->h()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lb9/a$b;->f:Ljava/lang/Long;

    invoke-virtual {p1}, Lb9/d;->e()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lb9/a$b;->g:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lb9/d;Lb9/a$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lb9/a$b;-><init>(Lb9/d;)V

    return-void
.end method


# virtual methods
.method public a()Lb9/d;
    .locals 13

    iget-object v0, p0, Lb9/a$b;->b:Lb9/c$a;

    const-string v1, ""

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " registrationStatus"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_0
    iget-object v0, p0, Lb9/a$b;->e:Ljava/lang/Long;

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " expiresInSecs"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_1
    iget-object v0, p0, Lb9/a$b;->f:Ljava/lang/Long;

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " tokenCreationEpochInSecs"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Lb9/a;

    iget-object v3, p0, Lb9/a$b;->a:Ljava/lang/String;

    iget-object v4, p0, Lb9/a$b;->b:Lb9/c$a;

    iget-object v5, p0, Lb9/a$b;->c:Ljava/lang/String;

    iget-object v6, p0, Lb9/a$b;->d:Ljava/lang/String;

    iget-object v1, p0, Lb9/a$b;->e:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    iget-object v1, p0, Lb9/a$b;->f:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    iget-object v11, p0, Lb9/a$b;->g:Ljava/lang/String;

    const/4 v12, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v12}, Lb9/a;-><init>(Ljava/lang/String;Lb9/c$a;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Lb9/a$a;)V

    return-object v0

    :cond_3
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

.method public b(Ljava/lang/String;)Lb9/d$a;
    .locals 0

    iput-object p1, p0, Lb9/a$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public c(J)Lb9/d$a;
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lb9/a$b;->e:Ljava/lang/Long;

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lb9/d$a;
    .locals 0

    iput-object p1, p0, Lb9/a$b;->a:Ljava/lang/String;

    return-object p0
.end method

.method public e(Ljava/lang/String;)Lb9/d$a;
    .locals 0

    iput-object p1, p0, Lb9/a$b;->g:Ljava/lang/String;

    return-object p0
.end method

.method public f(Ljava/lang/String;)Lb9/d$a;
    .locals 0

    iput-object p1, p0, Lb9/a$b;->d:Ljava/lang/String;

    return-object p0
.end method

.method public g(Lb9/c$a;)Lb9/d$a;
    .locals 1

    const-string v0, "Null registrationStatus"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lb9/a$b;->b:Lb9/c$a;

    return-object p0
.end method

.method public h(J)Lb9/d$a;
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lb9/a$b;->f:Ljava/lang/Long;

    return-object p0
.end method
