.class public abstract Lv0/y;
.super Lv0/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv0/y$b;,
        Lv0/y$e;,
        Lv0/y$d;,
        Lv0/y$c;,
        Lv0/y$a;,
        Lv0/y$f;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lv0/y<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lv0/y$a<",
        "TMessageType;TBuilderType;>;>",
        "Lv0/a<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# static fields
.field private static defaultInstanceMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Lv0/y<",
            "**>;>;"
        }
    .end annotation
.end field


# instance fields
.field public memoizedSerializedSize:I

.field public unknownFields:Lv0/o1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lv0/y;->defaultInstanceMap:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lv0/a;-><init>()V

    invoke-static {}, Lv0/o1;->e()Lv0/o1;

    move-result-object v0

    iput-object v0, p0, Lv0/y;->unknownFields:Lv0/o1;

    const/4 v0, -0x1

    iput v0, p0, Lv0/y;->memoizedSerializedSize:I

    return-void
.end method

.method public static varargs A(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    instance-of p1, p0, Ljava/lang/RuntimeException;

    if-nez p1, :cond_1

    instance-of p1, p0, Ljava/lang/Error;

    if-eqz p1, :cond_0

    check-cast p0, Ljava/lang/Error;

    throw p0

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Unexpected exception thrown by generated accessor method."

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_1
    check-cast p0, Ljava/lang/RuntimeException;

    throw p0

    :catch_1
    move-exception p0

    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Couldn\'t use Java reflection to implement protocol message reflection."

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static final B(Lv0/y;Z)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lv0/y<",
            "TT;*>;>(TT;Z)Z"
        }
    .end annotation

    sget-object v0, Lv0/y$f;->h:Lv0/y$f;

    invoke-virtual {p0, v0}, Lv0/y;->u(Lv0/y$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Byte;

    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    if-nez v0, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    invoke-static {}, Lv0/c1;->a()Lv0/c1;

    move-result-object v0

    invoke-virtual {v0, p0}, Lv0/c1;->e(Ljava/lang/Object;)Lv0/g1;

    move-result-object v0

    invoke-interface {v0, p0}, Lv0/g1;->c(Ljava/lang/Object;)Z

    move-result v0

    if-eqz p1, :cond_3

    sget-object p1, Lv0/y$f;->i:Lv0/y$f;

    if-eqz v0, :cond_2

    move-object v1, p0

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0, p1, v1}, Lv0/y;->v(Lv0/y$f;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return v0
.end method

.method public static D(Lv0/a0$i;)Lv0/a0$i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Lv0/a0$i<",
            "TE;>;)",
            "Lv0/a0$i<",
            "TE;>;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0xa

    goto :goto_0

    :cond_0
    mul-int/lit8 v0, v0, 0x2

    :goto_0
    invoke-interface {p0, v0}, Lv0/a0$i;->i(I)Lv0/a0$i;

    move-result-object p0

    return-object p0
.end method

.method public static G(Lv0/r0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lv0/e1;

    invoke-direct {v0, p0, p1, p2}, Lv0/e1;-><init>(Lv0/r0;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0
.end method

.method public static H(Lv0/y;Ljava/io/InputStream;)Lv0/y;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lv0/y<",
            "TT;*>;>(TT;",
            "Ljava/io/InputStream;",
            ")TT;"
        }
    .end annotation

    invoke-static {p1}, Lv0/i;->f(Ljava/io/InputStream;)Lv0/i;

    move-result-object p1

    invoke-static {}, Lv0/p;->b()Lv0/p;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lv0/y;->I(Lv0/y;Lv0/i;Lv0/p;)Lv0/y;

    move-result-object p0

    invoke-static {p0}, Lv0/y;->s(Lv0/y;)Lv0/y;

    move-result-object p0

    return-object p0
.end method

.method public static I(Lv0/y;Lv0/i;Lv0/p;)Lv0/y;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lv0/y<",
            "TT;*>;>(TT;",
            "Lv0/i;",
            "Lv0/p;",
            ")TT;"
        }
    .end annotation

    sget-object v0, Lv0/y$f;->k:Lv0/y$f;

    invoke-virtual {p0, v0}, Lv0/y;->u(Lv0/y$f;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lv0/y;

    :try_start_0
    invoke-static {}, Lv0/c1;->a()Lv0/c1;

    move-result-object v0

    invoke-virtual {v0, p0}, Lv0/c1;->e(Ljava/lang/Object;)Lv0/g1;

    move-result-object v0

    invoke-static {p1}, Lv0/j;->Q(Lv0/i;)Lv0/j;

    move-result-object p1

    invoke-interface {v0, p0, p1, p2}, Lv0/g1;->e(Ljava/lang/Object;Lv0/f1;Lv0/p;)V

    invoke-interface {v0, p0}, Lv0/g1;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    instance-of p1, p1, Lv0/b0;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ljava/lang/RuntimeException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Lv0/b0;

    throw p0

    :cond_0
    throw p0

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    instance-of p2, p2, Lv0/b0;

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Ljava/io/IOException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Lv0/b0;

    throw p0

    :cond_1
    new-instance p2, Lv0/b0;

    invoke-virtual {p1}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lv0/b0;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lv0/b0;->i(Lv0/r0;)Lv0/b0;

    move-result-object p0

    throw p0
.end method

.method public static J(Ljava/lang/Class;Lv0/y;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lv0/y<",
            "**>;>(",
            "Ljava/lang/Class<",
            "TT;>;TT;)V"
        }
    .end annotation

    sget-object v0, Lv0/y;->defaultInstanceMap:Ljava/util/Map;

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static s(Lv0/y;)Lv0/y;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lv0/y<",
            "TT;*>;>(TT;)TT;"
        }
    .end annotation

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lv0/y;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lv0/a;->o()Lv0/m1;

    move-result-object v0

    invoke-virtual {v0}, Lv0/m1;->a()Lv0/b0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lv0/b0;->i(Lv0/r0;)Lv0/b0;

    move-result-object p0

    throw p0

    :cond_1
    :goto_0
    return-object p0
.end method

.method public static x()Lv0/a0$i;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()",
            "Lv0/a0$i<",
            "TE;>;"
        }
    .end annotation

    invoke-static {}, Lv0/d1;->c()Lv0/d1;

    move-result-object v0

    return-object v0
.end method

.method public static y(Ljava/lang/Class;)Lv0/y;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lv0/y<",
            "**>;>(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    sget-object v0, Lv0/y;->defaultInstanceMap:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv0/y;

    if-nez v0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-static {v0, v1, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v0, Lv0/y;->defaultInstanceMap:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv0/y;

    goto :goto_0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Class initialization cannot fail."

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    :goto_0
    if-nez v0, :cond_2

    invoke-static {p0}, Lv0/r1;->i(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv0/y;

    invoke-virtual {v0}, Lv0/y;->z()Lv0/y;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-object v1, Lv0/y;->defaultInstanceMap:Ljava/util/Map;

    invoke-interface {v1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0

    :cond_2
    :goto_1
    return-object v0
.end method


# virtual methods
.method public C()V
    .locals 1

    invoke-static {}, Lv0/c1;->a()Lv0/c1;

    move-result-object v0

    invoke-virtual {v0, p0}, Lv0/c1;->e(Ljava/lang/Object;)Lv0/g1;

    move-result-object v0

    invoke-interface {v0, p0}, Lv0/g1;->b(Ljava/lang/Object;)V

    return-void
.end method

.method public final F()Lv0/y$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TBuilderType;"
        }
    .end annotation

    sget-object v0, Lv0/y$f;->l:Lv0/y$f;

    invoke-virtual {p0, v0}, Lv0/y;->u(Lv0/y$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv0/y$a;

    return-object v0
.end method

.method public final K()Lv0/y$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TBuilderType;"
        }
    .end annotation

    sget-object v0, Lv0/y$f;->l:Lv0/y$f;

    invoke-virtual {p0, v0}, Lv0/y;->u(Lv0/y$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv0/y$a;

    invoke-virtual {v0, p0}, Lv0/y$a;->w(Lv0/y;)Lv0/y$a;

    return-object v0
.end method

.method public bridge synthetic b()Lv0/r0;
    .locals 1

    invoke-virtual {p0}, Lv0/y;->z()Lv0/y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c()Lv0/r0$a;
    .locals 1

    invoke-virtual {p0}, Lv0/y;->K()Lv0/y$a;

    move-result-object v0

    return-object v0
.end method

.method public e(Lv0/k;)V
    .locals 1

    invoke-static {}, Lv0/c1;->a()Lv0/c1;

    move-result-object v0

    invoke-virtual {v0, p0}, Lv0/c1;->e(Ljava/lang/Object;)Lv0/g1;

    move-result-object v0

    invoke-static {p1}, Lv0/l;->P(Lv0/k;)Lv0/l;

    move-result-object p1

    invoke-interface {v0, p0, p1}, Lv0/g1;->d(Ljava/lang/Object;Lv0/u1;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-virtual {p0}, Lv0/y;->z()Lv0/y;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-static {}, Lv0/c1;->a()Lv0/c1;

    move-result-object v0

    invoke-virtual {v0, p0}, Lv0/c1;->e(Ljava/lang/Object;)Lv0/g1;

    move-result-object v0

    check-cast p1, Lv0/y;

    invoke-interface {v0, p0, p1}, Lv0/g1;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public g()I
    .locals 2

    iget v0, p0, Lv0/y;->memoizedSerializedSize:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-static {}, Lv0/c1;->a()Lv0/c1;

    move-result-object v0

    invoke-virtual {v0, p0}, Lv0/c1;->e(Ljava/lang/Object;)Lv0/g1;

    move-result-object v0

    invoke-interface {v0, p0}, Lv0/g1;->g(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Lv0/y;->memoizedSerializedSize:I

    :cond_0
    iget v0, p0, Lv0/y;->memoizedSerializedSize:I

    return v0
.end method

.method public bridge synthetic h()Lv0/r0$a;
    .locals 1

    invoke-virtual {p0}, Lv0/y;->F()Lv0/y$a;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lv0/a;->memoizedHashCode:I

    if-eqz v0, :cond_0

    return v0

    :cond_0
    invoke-static {}, Lv0/c1;->a()Lv0/c1;

    move-result-object v0

    invoke-virtual {v0, p0}, Lv0/c1;->e(Ljava/lang/Object;)Lv0/g1;

    move-result-object v0

    invoke-interface {v0, p0}, Lv0/g1;->i(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Lv0/a;->memoizedHashCode:I

    return v0
.end method

.method public final i()Lv0/z0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lv0/z0<",
            "TMessageType;>;"
        }
    .end annotation

    sget-object v0, Lv0/y$f;->n:Lv0/y$f;

    invoke-virtual {p0, v0}, Lv0/y;->u(Lv0/y$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv0/z0;

    return-object v0
.end method

.method public final k()Z
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lv0/y;->B(Lv0/y;Z)Z

    move-result v0

    return v0
.end method

.method public l()I
    .locals 1

    iget v0, p0, Lv0/y;->memoizedSerializedSize:I

    return v0
.end method

.method public p(I)V
    .locals 0

    iput p1, p0, Lv0/y;->memoizedSerializedSize:I

    return-void
.end method

.method public r()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lv0/y$f;->j:Lv0/y$f;

    invoke-virtual {p0, v0}, Lv0/y;->u(Lv0/y$f;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final t()Lv0/y$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<MessageType:",
            "Lv0/y<",
            "TMessageType;TBuilderType;>;BuilderType:",
            "Lv0/y$a<",
            "TMessageType;TBuilderType;>;>()TBuilderType;"
        }
    .end annotation

    sget-object v0, Lv0/y$f;->l:Lv0/y$f;

    invoke-virtual {p0, v0}, Lv0/y;->u(Lv0/y$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv0/y$a;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lv0/t0;->e(Lv0/r0;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(Lv0/y$f;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0, v0}, Lv0/y;->w(Lv0/y$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public v(Lv0/y$f;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0}, Lv0/y;->w(Lv0/y$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract w(Lv0/y$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public final z()Lv0/y;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    sget-object v0, Lv0/y$f;->m:Lv0/y$f;

    invoke-virtual {p0, v0}, Lv0/y;->u(Lv0/y$f;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv0/y;

    return-object v0
.end method
