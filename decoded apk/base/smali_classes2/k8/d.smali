.class public final synthetic Lk8/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lk8/e;

.field public final synthetic i:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method public synthetic constructor <init>(Lk8/e;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk8/d;->h:Lk8/e;

    iput-object p2, p0, Lk8/d;->i:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lk8/d;->h:Lk8/e;

    iget-object v1, p0, Lk8/d;->i:Ljava/util/concurrent/CountDownLatch;

    invoke-static {v0, v1}, Lk8/e;->b(Lk8/e;Ljava/util/concurrent/CountDownLatch;)V

    return-void
.end method
