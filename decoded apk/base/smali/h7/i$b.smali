.class public final Lh7/i$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lh7/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh7/i$b$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lh7/i$b$a;

.field public c:Lh7/i$b$a;

.field public d:Z

.field public e:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lh7/i$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh7/i$b$a;-><init>(Lh7/i$a;)V

    iput-object v0, p0, Lh7/i$b;->b:Lh7/i$b$a;

    iput-object v0, p0, Lh7/i$b;->c:Lh7/i$b$a;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lh7/i$b;->d:Z

    iput-boolean v0, p0, Lh7/i$b;->e:Z

    invoke-static {p1}, Lh7/o;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lh7/i$b;->a:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lh7/i$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lh7/i$b;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static d(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p0, Ljava/lang/CharSequence;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    check-cast p0, Ljava/lang/CharSequence;

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    return v1

    :cond_1
    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_2

    check-cast p0, Ljava/util/Collection;

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result p0

    return p0

    :cond_2
    instance-of v0, p0, Ljava/util/Map;

    if-eqz v0, :cond_3

    check-cast p0, Ljava/util/Map;

    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    move-result p0

    return p0

    :cond_3
    instance-of v0, p0, Lh7/l;

    if-eqz v0, :cond_4

    check-cast p0, Lh7/l;

    invoke-virtual {p0}, Lh7/l;->c()Z

    move-result p0

    xor-int/2addr p0, v1

    return p0

    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-static {p0}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result p0

    if-nez p0, :cond_5

    goto :goto_1

    :cond_5
    move v1, v2

    :goto_1
    return v1

    :cond_6
    return v2
.end method


# virtual methods
.method public final a()Lh7/i$b$a;
    .locals 2

    new-instance v0, Lh7/i$b$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lh7/i$b$a;-><init>(Lh7/i$a;)V

    iget-object v1, p0, Lh7/i$b;->c:Lh7/i$b$a;

    iput-object v0, v1, Lh7/i$b$a;->c:Lh7/i$b$a;

    iput-object v0, p0, Lh7/i$b;->c:Lh7/i$b$a;

    return-object v0
.end method

.method public final b(Ljava/lang/Object;)Lh7/i$b;
    .locals 1

    invoke-virtual {p0}, Lh7/i$b;->a()Lh7/i$b$a;

    move-result-object v0

    iput-object p1, v0, Lh7/i$b$a;->b:Ljava/lang/Object;

    return-object p0
.end method

.method public c(Ljava/lang/Object;)Lh7/i$b;
    .locals 0

    invoke-virtual {p0, p1}, Lh7/i$b;->b(Ljava/lang/Object;)Lh7/i$b;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-boolean v0, p0, Lh7/i$b;->d:Z

    iget-boolean v1, p0, Lh7/i$b;->e:Z

    new-instance v2, Ljava/lang/StringBuilder;

    const/16 v3, 0x20

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    iget-object v3, p0, Lh7/i$b;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x7b

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lh7/i$b;->b:Lh7/i$b$a;

    iget-object v3, v3, Lh7/i$b$a;->c:Lh7/i$b$a;

    const-string v4, ""

    :goto_0
    if-eqz v3, :cond_5

    iget-object v5, v3, Lh7/i$b$a;->b:Ljava/lang/Object;

    if-nez v5, :cond_0

    if-nez v0, :cond_4

    goto :goto_1

    :cond_0
    if-eqz v1, :cond_1

    invoke-static {v5}, Lh7/i$b;->d(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_4

    :cond_1
    :goto_1
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v3, Lh7/i$b$a;->a:Ljava/lang/String;

    if-eqz v4, :cond_2

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v4, 0x3d

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_2
    if-eqz v5, :cond_3

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->isArray()Z

    move-result v4

    if-eqz v4, :cond_3

    const/4 v4, 0x1

    new-array v6, v4, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v5, v6, v7

    invoke-static {v6}, Ljava/util/Arrays;->deepToString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    sub-int/2addr v6, v4

    invoke-virtual {v2, v5, v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_3
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :goto_2
    const-string v4, ", "

    :cond_4
    iget-object v3, v3, Lh7/i$b$a;->c:Lh7/i$b$a;

    goto :goto_0

    :cond_5
    const/16 v0, 0x7d

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
