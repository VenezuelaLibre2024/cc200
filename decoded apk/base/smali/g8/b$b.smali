.class public final Lg8/b$b;
.super Lg8/f0$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/Integer;

.field public d:Ljava/lang/String;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public i:Lg8/f0$e;

.field public j:Lg8/f0$d;

.field public k:Lg8/f0$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lg8/f0$b;-><init>()V

    return-void
.end method

.method public constructor <init>(Lg8/f0;)V
    .locals 1

    invoke-direct {p0}, Lg8/f0$b;-><init>()V

    invoke-virtual {p1}, Lg8/f0;->l()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lg8/b$b;->a:Ljava/lang/String;

    invoke-virtual {p1}, Lg8/f0;->h()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lg8/b$b;->b:Ljava/lang/String;

    invoke-virtual {p1}, Lg8/f0;->k()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lg8/b$b;->c:Ljava/lang/Integer;

    invoke-virtual {p1}, Lg8/f0;->i()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lg8/b$b;->d:Ljava/lang/String;

    invoke-virtual {p1}, Lg8/f0;->g()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lg8/b$b;->e:Ljava/lang/String;

    invoke-virtual {p1}, Lg8/f0;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lg8/b$b;->f:Ljava/lang/String;

    invoke-virtual {p1}, Lg8/f0;->e()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lg8/b$b;->g:Ljava/lang/String;

    invoke-virtual {p1}, Lg8/f0;->f()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lg8/b$b;->h:Ljava/lang/String;

    invoke-virtual {p1}, Lg8/f0;->m()Lg8/f0$e;

    move-result-object v0

    iput-object v0, p0, Lg8/b$b;->i:Lg8/f0$e;

    invoke-virtual {p1}, Lg8/f0;->j()Lg8/f0$d;

    move-result-object v0

    iput-object v0, p0, Lg8/b$b;->j:Lg8/f0$d;

    invoke-virtual {p1}, Lg8/f0;->c()Lg8/f0$a;

    move-result-object p1

    iput-object p1, p0, Lg8/b$b;->k:Lg8/f0$a;

    return-void
.end method

.method public synthetic constructor <init>(Lg8/f0;Lg8/b$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lg8/b$b;-><init>(Lg8/f0;)V

    return-void
.end method


# virtual methods
.method public a()Lg8/f0;
    .locals 15

    iget-object v0, p0, Lg8/b$b;->a:Ljava/lang/String;

    const-string v1, ""

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " sdkVersion"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_0
    iget-object v0, p0, Lg8/b$b;->b:Ljava/lang/String;

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " gmpAppId"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_1
    iget-object v0, p0, Lg8/b$b;->c:Ljava/lang/Integer;

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " platform"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_2
    iget-object v0, p0, Lg8/b$b;->d:Ljava/lang/String;

    if-nez v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " installationUuid"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_3
    iget-object v0, p0, Lg8/b$b;->g:Ljava/lang/String;

    if-nez v0, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " buildVersion"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_4
    iget-object v0, p0, Lg8/b$b;->h:Ljava/lang/String;

    if-nez v0, :cond_5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " displayVersion"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :cond_5
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance v0, Lg8/b;

    iget-object v3, p0, Lg8/b$b;->a:Ljava/lang/String;

    iget-object v4, p0, Lg8/b$b;->b:Ljava/lang/String;

    iget-object v1, p0, Lg8/b$b;->c:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-object v6, p0, Lg8/b$b;->d:Ljava/lang/String;

    iget-object v7, p0, Lg8/b$b;->e:Ljava/lang/String;

    iget-object v8, p0, Lg8/b$b;->f:Ljava/lang/String;

    iget-object v9, p0, Lg8/b$b;->g:Ljava/lang/String;

    iget-object v10, p0, Lg8/b$b;->h:Ljava/lang/String;

    iget-object v11, p0, Lg8/b$b;->i:Lg8/f0$e;

    iget-object v12, p0, Lg8/b$b;->j:Lg8/f0$d;

    iget-object v13, p0, Lg8/b$b;->k:Lg8/f0$a;

    const/4 v14, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v14}, Lg8/b;-><init>(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lg8/f0$e;Lg8/f0$d;Lg8/f0$a;Lg8/b$a;)V

    return-object v0

    :cond_6
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

.method public b(Lg8/f0$a;)Lg8/f0$b;
    .locals 0

    iput-object p1, p0, Lg8/b$b;->k:Lg8/f0$a;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lg8/f0$b;
    .locals 0

    iput-object p1, p0, Lg8/b$b;->f:Ljava/lang/String;

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lg8/f0$b;
    .locals 1

    const-string v0, "Null buildVersion"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lg8/b$b;->g:Ljava/lang/String;

    return-object p0
.end method

.method public e(Ljava/lang/String;)Lg8/f0$b;
    .locals 1

    const-string v0, "Null displayVersion"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lg8/b$b;->h:Ljava/lang/String;

    return-object p0
.end method

.method public f(Ljava/lang/String;)Lg8/f0$b;
    .locals 0

    iput-object p1, p0, Lg8/b$b;->e:Ljava/lang/String;

    return-object p0
.end method

.method public g(Ljava/lang/String;)Lg8/f0$b;
    .locals 1

    const-string v0, "Null gmpAppId"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lg8/b$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public h(Ljava/lang/String;)Lg8/f0$b;
    .locals 1

    const-string v0, "Null installationUuid"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lg8/b$b;->d:Ljava/lang/String;

    return-object p0
.end method

.method public i(Lg8/f0$d;)Lg8/f0$b;
    .locals 0

    iput-object p1, p0, Lg8/b$b;->j:Lg8/f0$d;

    return-object p0
.end method

.method public j(I)Lg8/f0$b;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lg8/b$b;->c:Ljava/lang/Integer;

    return-object p0
.end method

.method public k(Ljava/lang/String;)Lg8/f0$b;
    .locals 1

    const-string v0, "Null sdkVersion"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lg8/b$b;->a:Ljava/lang/String;

    return-object p0
.end method

.method public l(Lg8/f0$e;)Lg8/f0$b;
    .locals 0

    iput-object p1, p0, Lg8/b$b;->i:Lg8/f0$e;

    return-object p0
.end method
