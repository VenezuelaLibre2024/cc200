.class public Lq9/g;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static b:Z = false


# instance fields
.field public final a:Ljava/util/concurrent/Executor;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 0
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ThreadPoolCreation"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_1

    sget-boolean p1, Lq9/g;->b:Z

    if-nez p1, :cond_0

    invoke-static {}, Lp9/g0;->b()Lp9/g0;

    move-result-object p1

    invoke-virtual {p1}, Lp9/g0;->c()Ljava/util/concurrent/Executor;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :cond_1
    :goto_0
    iput-object p1, p0, Lq9/g;->a:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Runnable;)V
    .locals 1

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lq9/g;->a:Ljava/util/concurrent/Executor;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lp9/g0;->b()Lp9/g0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lp9/g0;->e(Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method
