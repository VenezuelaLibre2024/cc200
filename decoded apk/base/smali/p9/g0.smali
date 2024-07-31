.class public Lp9/g0;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static a:Lp9/g0;

.field public static b:Ljava/util/concurrent/Executor;

.field public static c:Ljava/util/concurrent/Executor;

.field public static d:Ljava/util/concurrent/Executor;

.field public static e:Ljava/util/concurrent/Executor;

.field public static f:Ljava/util/concurrent/Executor;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp9/g0;

    invoke-direct {v0}, Lp9/g0;-><init>()V

    sput-object v0, Lp9/g0;->a:Lp9/g0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Lp9/g0;
    .locals 1

    sget-object v0, Lp9/g0;->a:Lp9/g0;

    return-object v0
.end method

.method public static d(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V
    .locals 1

    const/4 v0, 0x5

    invoke-static {p0, v0}, Lz7/y;->a(Ljava/util/concurrent/Executor;I)Ljava/util/concurrent/Executor;

    move-result-object v0

    sput-object v0, Lp9/g0;->b:Ljava/util/concurrent/Executor;

    const/4 v0, 0x3

    invoke-static {p0, v0}, Lz7/y;->a(Ljava/util/concurrent/Executor;I)Ljava/util/concurrent/Executor;

    move-result-object v0

    sput-object v0, Lp9/g0;->d:Ljava/util/concurrent/Executor;

    const/4 v0, 0x2

    invoke-static {p0, v0}, Lz7/y;->a(Ljava/util/concurrent/Executor;I)Ljava/util/concurrent/Executor;

    move-result-object v0

    sput-object v0, Lp9/g0;->c:Ljava/util/concurrent/Executor;

    invoke-static {p0}, Lz7/y;->b(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object p0

    sput-object p0, Lp9/g0;->e:Ljava/util/concurrent/Executor;

    sput-object p1, Lp9/g0;->f:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/concurrent/Executor;
    .locals 1

    sget-object v0, Lp9/g0;->b:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public c()Ljava/util/concurrent/Executor;
    .locals 1

    sget-object v0, Lp9/g0;->f:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public e(Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, Lp9/g0;->e:Ljava/util/concurrent/Executor;

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public f(Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, Lp9/g0;->b:Ljava/util/concurrent/Executor;

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public g(Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, Lp9/g0;->d:Ljava/util/concurrent/Executor;

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public h(Ljava/lang/Runnable;)V
    .locals 1

    sget-object v0, Lp9/g0;->c:Ljava/util/concurrent/Executor;

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
