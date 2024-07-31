.class public final Lhe/o;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:I

.field public static final b:Lhe/j;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, Ljava/lang/Throwable;

    const/4 v1, -0x1

    invoke-static {v0, v1}, Lhe/o;->e(Ljava/lang/Class;I)I

    move-result v0

    sput v0, Lhe/o;->a:I

    :try_start_0
    invoke-static {}, Lhe/q;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lhe/v0;->a:Lhe/v0;

    goto :goto_0

    :cond_0
    sget-object v0, Lhe/c;->a:Lhe/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    sget-object v0, Lhe/v0;->a:Lhe/v0;

    :goto_0
    sput-object v0, Lhe/o;->b:Lhe/j;

    return-void
.end method

.method public static final synthetic a(Ljava/lang/Class;)Lsd/l;
    .locals 0

    invoke-static {p0}, Lhe/o;->b(Ljava/lang/Class;)Lsd/l;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/lang/Class;)Lsd/l;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Throwable;",
            ">(",
            "Ljava/lang/Class<",
            "TE;>;)",
            "Lsd/l<",
            "Ljava/lang/Throwable;",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation

    const-class v0, Ljava/lang/String;

    sget-object v1, Lhe/o$e;->h:Lhe/o$e;

    sget v2, Lhe/o;->a:I

    const/4 v3, 0x0

    invoke-static {p0, v3}, Lhe/o;->e(Ljava/lang/Class;I)I

    move-result v4

    if-eq v2, v4, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getConstructors()[Ljava/lang/reflect/Constructor;

    move-result-object p0

    new-instance v2, Ljava/util/ArrayList;

    array-length v4, p0

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    array-length v4, p0

    move v5, v3

    :goto_0
    const/4 v6, 0x0

    if-ge v5, v4, :cond_6

    aget-object v7, p0, v5

    invoke-virtual {v7}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    move-result-object v8

    array-length v9, v8

    if-eqz v9, :cond_5

    const/4 v10, 0x2

    const/4 v11, -0x1

    const/4 v12, 0x1

    if-eq v9, v12, :cond_3

    if-eq v9, v10, :cond_2

    :cond_1
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    goto :goto_1

    :cond_2
    aget-object v9, v8, v3

    invoke-static {v9, v0}, Ltd/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    aget-object v8, v8, v12

    const-class v9, Ljava/lang/Throwable;

    invoke-static {v8, v9}, Ltd/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    new-instance v6, Lhe/o$a;

    invoke-direct {v6, v7}, Lhe/o$a;-><init>(Ljava/lang/reflect/Constructor;)V

    invoke-static {v6}, Lhe/o;->f(Lsd/l;)Lsd/l;

    move-result-object v6

    const/4 v7, 0x3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    goto :goto_1

    :cond_3
    aget-object v8, v8, v3

    invoke-static {v8, v0}, Ltd/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    new-instance v6, Lhe/o$b;

    invoke-direct {v6, v7}, Lhe/o$b;-><init>(Ljava/lang/reflect/Constructor;)V

    invoke-static {v6}, Lhe/o;->f(Lsd/l;)Lsd/l;

    move-result-object v6

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    goto :goto_1

    :cond_4
    const-class v9, Ljava/lang/Throwable;

    invoke-static {v8, v9}, Ltd/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    new-instance v6, Lhe/o$c;

    invoke-direct {v6, v7}, Lhe/o$c;-><init>(Ljava/lang/reflect/Constructor;)V

    invoke-static {v6}, Lhe/o;->f(Lsd/l;)Lsd/l;

    move-result-object v6

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    goto :goto_1

    :cond_5
    new-instance v6, Lhe/o$d;

    invoke-direct {v6, v7}, Lhe/o$d;-><init>(Ljava/lang/reflect/Constructor;)V

    invoke-static {v6}, Lhe/o;->f(Lsd/l;)Lsd/l;

    move-result-object v6

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    :goto_1
    invoke-static {v6, v7}, Lgd/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Lgd/j;

    move-result-object v6

    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_6
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_2

    :cond_7
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_2

    :cond_8
    move-object v0, v6

    check-cast v0, Lgd/j;

    invoke-virtual {v0}, Lgd/j;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    :cond_9
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lgd/j;

    invoke-virtual {v3}, Lgd/j;->d()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    if-ge v0, v3, :cond_a

    move-object v6, v2

    move v0, v3

    :cond_a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_9

    :goto_2
    check-cast v6, Lgd/j;

    if-eqz v6, :cond_c

    invoke-virtual {v6}, Lgd/j;->c()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lsd/l;

    if-nez p0, :cond_b

    goto :goto_3

    :cond_b
    move-object v1, p0

    :cond_c
    :goto_3
    return-object v1
.end method

.method public static final c(Ljava/lang/Class;I)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;I)I"
        }
    .end annotation

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v4, v0, v2

    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getModifiers()I

    move-result v4

    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    move-result v4

    xor-int/lit8 v4, v4, 0x1

    if-eqz v4, :cond_1

    add-int/lit8 v3, v3, 0x1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    add-int/2addr p1, v3

    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object p0

    if-nez p0, :cond_0

    return p1
.end method

.method public static synthetic d(Ljava/lang/Class;IILjava/lang/Object;)I
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Lhe/o;->c(Ljava/lang/Class;I)I

    move-result p0

    return p0
.end method

.method public static final e(Ljava/lang/Class;I)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;I)I"
        }
    .end annotation

    invoke-static {p0}, Lrd/a;->c(Ljava/lang/Class;)Lyd/c;

    :try_start_0
    sget-object v0, Lgd/k;->i:Lgd/k$a;

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2}, Lhe/o;->d(Ljava/lang/Class;IILjava/lang/Object;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p0}, Lgd/k;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    sget-object v0, Lgd/k;->i:Lgd/k$a;

    invoke-static {p0}, Lgd/l;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lgd/k;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p0}, Lgd/k;->f(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move-object p0, p1

    :cond_0
    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method public static final f(Lsd/l;)Lsd/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsd/l<",
            "-",
            "Ljava/lang/Throwable;",
            "+",
            "Ljava/lang/Throwable;",
            ">;)",
            "Lsd/l<",
            "Ljava/lang/Throwable;",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation

    new-instance v0, Lhe/o$f;

    invoke-direct {v0, p0}, Lhe/o$f;-><init>(Lsd/l;)V

    return-object v0
.end method

.method public static final g(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Throwable;",
            ">(TE;)TE;"
        }
    .end annotation

    instance-of v0, p0, Lce/i0;

    if-eqz v0, :cond_1

    :try_start_0
    sget-object v0, Lgd/k;->i:Lgd/k$a;

    check-cast p0, Lce/i0;

    invoke-interface {p0}, Lce/i0;->a()Ljava/lang/Throwable;

    move-result-object p0

    invoke-static {p0}, Lgd/k;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    sget-object v0, Lgd/k;->i:Lgd/k$a;

    invoke-static {p0}, Lgd/l;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lgd/k;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    invoke-static {p0}, Lgd/k;->f(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    :cond_0
    check-cast p0, Ljava/lang/Throwable;

    return-object p0

    :cond_1
    sget-object v0, Lhe/o;->b:Lhe/j;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lhe/j;->a(Ljava/lang/Class;)Lsd/l;

    move-result-object v0

    invoke-interface {v0, p0}, Lsd/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Throwable;

    return-object p0
.end method
