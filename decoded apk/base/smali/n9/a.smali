.class public final Ln9/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln9/a$a;
    }
.end annotation


# static fields
.field public static final a:Ln9/a;

.field public static final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ln9/b$a;",
            "Ln9/a$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln9/a;

    invoke-direct {v0}, Ln9/a;-><init>()V

    sput-object v0, Ln9/a;->a:Ln9/a;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Ln9/a;->b:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Ln9/b$a;)V
    .locals 6

    const-string v0, "subscriberName"

    invoke-static {p0, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ln9/b$a;->i:Ln9/b$a;

    if-eq p0, v0, :cond_1

    sget-object v0, Ln9/a;->b:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "SessionsDependencies"

    if-eqz v1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Dependency "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " already added."

    :goto_0
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v2, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const-string v1, "dependencies"

    invoke-static {v0, v1}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ln9/a$a;

    const/4 v3, 0x1

    invoke-static {v3}, Lle/c;->a(Z)Lle/a;

    move-result-object v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    invoke-direct {v1, v3, v5, v4, v5}, Ln9/a$a;-><init>(Lle/a;Ln9/b;ILtd/g;)V

    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Dependency to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " added."

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final e(Ln9/b;)V
    .locals 5

    const-string v0, "subscriber"

    invoke-static {p0, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ln9/b;->c()Ln9/b$a;

    move-result-object v0

    sget-object v1, Ln9/a;->a:Ln9/a;

    invoke-virtual {v1, v0}, Ln9/a;->b(Ln9/b$a;)Ln9/a$a;

    move-result-object v1

    invoke-virtual {v1}, Ln9/a$a;->b()Ln9/b;

    move-result-object v2

    const-string v3, "Subscriber "

    const-string v4, "SessionsDependencies"

    if-eqz v2, :cond_0

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " already registered."

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v4, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-virtual {v1, p0}, Ln9/a$a;->c(Ln9/b;)V

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " registered."

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v4, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v1}, Ln9/a$a;->a()Lle/a;

    move-result-object p0

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p0, v1, v0, v1}, Lle/a$a;->a(Lle/a;Ljava/lang/Object;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final b(Ln9/b$a;)Ln9/a$a;
    .locals 3

    sget-object v0, Ln9/a;->b:Ljava/util/Map;

    const-string v1, "dependencies"

    invoke-static {v0, v1}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string p1, "dependencies.getOrElse(s\u2026load time.\"\n      )\n    }"

    invoke-static {v0, p1}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ln9/a$a;

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot get dependency "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ". Dependencies should be added at class load time."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final c(Ljd/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/d<",
            "-",
            "Ljava/util/Map<",
            "Ln9/b$a;",
            "+",
            "Ln9/b;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Ln9/a$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ln9/a$b;

    iget v1, v0, Ln9/a$b;->p:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ln9/a$b;->p:I

    goto :goto_0

    :cond_0
    new-instance v0, Ln9/a$b;

    invoke-direct {v0, p0, p1}, Ln9/a$b;-><init>(Ln9/a;Ljd/d;)V

    :goto_0
    iget-object p1, v0, Ln9/a$b;->n:Ljava/lang/Object;

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Ln9/a$b;->p:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v2, v0, Ln9/a$b;->m:Ljava/lang/Object;

    iget-object v5, v0, Ln9/a$b;->l:Ljava/lang/Object;

    check-cast v5, Ljava/util/Map;

    iget-object v6, v0, Ln9/a$b;->k:Ljava/lang/Object;

    check-cast v6, Lle/a;

    iget-object v7, v0, Ln9/a$b;->j:Ljava/lang/Object;

    check-cast v7, Ln9/b$a;

    iget-object v8, v0, Ln9/a$b;->i:Ljava/lang/Object;

    check-cast v8, Ljava/util/Iterator;

    iget-object v9, v0, Ln9/a$b;->h:Ljava/lang/Object;

    check-cast v9, Ljava/util/Map;

    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    sget-object p1, Ln9/a;->b:Ljava/util/Map;

    const-string v2, "dependencies"

    invoke-static {p1, v2}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v5

    invoke-static {v5}, Lhd/d0;->a(I)I

    move-result v5

    invoke-direct {v2, v5}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v8, p1

    move-object v5, v2

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Ln9/b$a;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ln9/a$a;

    invoke-virtual {p1}, Ln9/a$a;->a()Lle/a;

    move-result-object v6

    iput-object v5, v0, Ln9/a$b;->h:Ljava/lang/Object;

    iput-object v8, v0, Ln9/a$b;->i:Ljava/lang/Object;

    iput-object v7, v0, Ln9/a$b;->j:Ljava/lang/Object;

    iput-object v6, v0, Ln9/a$b;->k:Ljava/lang/Object;

    iput-object v5, v0, Ln9/a$b;->l:Ljava/lang/Object;

    iput-object v2, v0, Ln9/a$b;->m:Ljava/lang/Object;

    iput v4, v0, Ln9/a$b;->p:I

    invoke-interface {v6, v3, v0}, Lle/a;->b(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v9, v5

    :goto_2
    :try_start_0
    sget-object p1, Ln9/a;->a:Ln9/a;

    invoke-virtual {p1, v7}, Ln9/a;->d(Ln9/b$a;)Ln9/b;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v6, v3}, Lle/a;->c(Ljava/lang/Object;)V

    invoke-interface {v5, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v5, v9

    goto :goto_1

    :catchall_0
    move-exception p1

    invoke-interface {v6, v3}, Lle/a;->c(Ljava/lang/Object;)V

    throw p1

    :cond_4
    return-object v5
.end method

.method public final d(Ln9/b$a;)Ln9/b;
    .locals 3

    const-string v0, "subscriberName"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ln9/a;->b(Ln9/b$a;)Ln9/a$a;

    move-result-object v0

    invoke-virtual {v0}, Ln9/a$a;->b()Ln9/b;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Subscriber "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " has not been registered."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
