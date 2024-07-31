.class public final Lre/b0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lre/b0$a;
    }
.end annotation


# instance fields
.field public final a:Lre/v;

.field public final b:Ljava/lang/String;

.field public final c:Lre/u;

.field public final d:Lre/c0;

.field public final e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public volatile f:Lre/d;


# direct methods
.method public constructor <init>(Lre/b0$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lre/b0$a;->a:Lre/v;

    iput-object v0, p0, Lre/b0;->a:Lre/v;

    iget-object v0, p1, Lre/b0$a;->b:Ljava/lang/String;

    iput-object v0, p0, Lre/b0;->b:Ljava/lang/String;

    iget-object v0, p1, Lre/b0$a;->c:Lre/u$a;

    invoke-virtual {v0}, Lre/u$a;->d()Lre/u;

    move-result-object v0

    iput-object v0, p0, Lre/b0;->c:Lre/u;

    iget-object v0, p1, Lre/b0$a;->d:Lre/c0;

    iput-object v0, p0, Lre/b0;->d:Lre/c0;

    iget-object p1, p1, Lre/b0$a;->e:Ljava/util/Map;

    invoke-static {p1}, Lse/e;->u(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lre/b0;->e:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a()Lre/c0;
    .locals 1

    iget-object v0, p0, Lre/b0;->d:Lre/c0;

    return-object v0
.end method

.method public b()Lre/d;
    .locals 1

    iget-object v0, p0, Lre/b0;->f:Lre/d;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lre/b0;->c:Lre/u;

    invoke-static {v0}, Lre/d;->k(Lre/u;)Lre/d;

    move-result-object v0

    iput-object v0, p0, Lre/b0;->f:Lre/d;

    :goto_0
    return-object v0
.end method

.method public c(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lre/b0;->c:Lre/u;

    invoke-virtual {v0, p1}, Lre/u;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public d()Lre/u;
    .locals 1

    iget-object v0, p0, Lre/b0;->c:Lre/u;

    return-object v0
.end method

.method public e()Z
    .locals 1

    iget-object v0, p0, Lre/b0;->a:Lre/v;

    invoke-virtual {v0}, Lre/v;->m()Z

    move-result v0

    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lre/b0;->b:Ljava/lang/String;

    return-object v0
.end method

.method public g()Lre/b0$a;
    .locals 1

    new-instance v0, Lre/b0$a;

    invoke-direct {v0, p0}, Lre/b0$a;-><init>(Lre/b0;)V

    return-object v0
.end method

.method public h()Lre/v;
    .locals 1

    iget-object v0, p0, Lre/b0;->a:Lre/v;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Request{method="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lre/b0;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", url="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lre/b0;->a:Lre/v;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", tags="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lre/b0;->e:Ljava/util/Map;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
