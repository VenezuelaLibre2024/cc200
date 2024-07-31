.class public abstract Lv0/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lv0/r0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv0/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lv0/a<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lv0/a$a<",
        "TMessageType;TBuilderType;>;>",
        "Ljava/lang/Object;",
        "Lv0/r0;"
    }
.end annotation


# instance fields
.field public memoizedHashCode:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lv0/a;->memoizedHashCode:I

    return-void
.end method

.method public static d(Ljava/lang/Iterable;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable<",
            "TT;>;",
            "Ljava/util/List<",
            "-TT;>;)V"
        }
    .end annotation

    invoke-static {p0, p1}, Lv0/a$a;->l(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public f()Lv0/h;
    .locals 3

    :try_start_0
    invoke-interface {p0}, Lv0/r0;->g()I

    move-result v0

    invoke-static {v0}, Lv0/h;->p(I)Lv0/h$h;

    move-result-object v0

    invoke-virtual {v0}, Lv0/h$h;->b()Lv0/k;

    move-result-object v1

    invoke-interface {p0, v1}, Lv0/r0;->e(Lv0/k;)V

    invoke-virtual {v0}, Lv0/h$h;->a()Lv0/h;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "ByteString"

    invoke-virtual {p0, v2}, Lv0/a;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public l()I
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public m(Lv0/g1;)I
    .locals 2

    invoke-virtual {p0}, Lv0/a;->l()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-interface {p1, p0}, Lv0/g1;->g(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0, v0}, Lv0/a;->p(I)V

    :cond_0
    return v0
.end method

.method public final n(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Serializing "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " to a "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " threw an IOException (should never happen)."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public o()Lv0/m1;
    .locals 1

    new-instance v0, Lv0/m1;

    invoke-direct {v0, p0}, Lv0/m1;-><init>(Lv0/r0;)V

    return-object v0
.end method

.method public p(I)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public q(Ljava/io/OutputStream;)V
    .locals 1

    invoke-interface {p0}, Lv0/r0;->g()I

    move-result v0

    invoke-static {v0}, Lv0/k;->I(I)I

    move-result v0

    invoke-static {p1, v0}, Lv0/k;->f0(Ljava/io/OutputStream;I)Lv0/k;

    move-result-object p1

    invoke-interface {p0, p1}, Lv0/r0;->e(Lv0/k;)V

    invoke-virtual {p1}, Lv0/k;->c0()V

    return-void
.end method
