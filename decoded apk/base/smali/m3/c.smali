.class public Lm3/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lm3/e;


# static fields
.field public static final f:Ljava/util/logging/Logger;


# instance fields
.field public final a:Ln3/y;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lh3/e;

.field public final d:Lo3/d;

.field public final e:Lp3/b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lg3/u;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lm3/c;->f:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;Lh3/e;Ln3/y;Lo3/d;Lp3/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm3/c;->b:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lm3/c;->c:Lh3/e;

    iput-object p3, p0, Lm3/c;->a:Ln3/y;

    iput-object p4, p0, Lm3/c;->d:Lo3/d;

    iput-object p5, p0, Lm3/c;->e:Lp3/b;

    return-void
.end method

.method public static synthetic b(Lm3/c;Lg3/p;Ld3/j;Lg3/i;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lm3/c;->e(Lg3/p;Ld3/j;Lg3/i;)V

    return-void
.end method

.method public static synthetic c(Lm3/c;Lg3/p;Lg3/i;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lm3/c;->d(Lg3/p;Lg3/i;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private synthetic d(Lg3/p;Lg3/i;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lm3/c;->d:Lo3/d;

    invoke-interface {v0, p1, p2}, Lo3/d;->D(Lg3/p;Lg3/i;)Lo3/k;

    iget-object p2, p0, Lm3/c;->a:Ln3/y;

    const/4 v0, 0x1

    invoke-interface {p2, p1, v0}, Ln3/y;->a(Lg3/p;I)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic e(Lg3/p;Ld3/j;Lg3/i;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lm3/c;->c:Lh3/e;

    invoke-virtual {p1}, Lg3/p;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lh3/e;->get(Ljava/lang/String;)Lh3/m;

    move-result-object v0

    if-nez v0, :cond_0

    const-string p3, "Transport backend \'%s\' is not registered"

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p1}, Lg3/p;->b()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v0, v1

    invoke-static {p3, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    sget-object p3, Lm3/c;->f:Ljava/util/logging/Logger;

    invoke-virtual {p3, p1}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    new-instance p3, Ljava/lang/IllegalArgumentException;

    invoke-direct {p3, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, p3}, Ld3/j;->a(Ljava/lang/Exception;)V

    return-void

    :cond_0
    invoke-interface {v0, p3}, Lh3/m;->b(Lg3/i;)Lg3/i;

    move-result-object p3

    iget-object v0, p0, Lm3/c;->e:Lp3/b;

    new-instance v1, Lm3/b;

    invoke-direct {v1, p0, p1, p3}, Lm3/b;-><init>(Lm3/c;Lg3/p;Lg3/i;)V

    invoke-interface {v0, v1}, Lp3/b;->a(Lp3/b$a;)Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Ld3/j;->a(Ljava/lang/Exception;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    sget-object p3, Lm3/c;->f:Ljava/util/logging/Logger;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error scheduling event "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    invoke-interface {p2, p1}, Ld3/j;->a(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public a(Lg3/p;Lg3/i;Ld3/j;)V
    .locals 2

    iget-object v0, p0, Lm3/c;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Lm3/a;

    invoke-direct {v1, p0, p1, p3, p2}, Lm3/a;-><init>(Lm3/c;Lg3/p;Ld3/j;Lg3/i;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
