.class public Lz7/p;
.super Lv/a;
.source ""

# interfaces
.implements Ljava/util/concurrent/ScheduledFuture;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "RestrictedApi"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz7/p$c;,
        Lz7/p$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lv/a<",
        "TV;>;",
        "Ljava/util/concurrent/ScheduledFuture<",
        "TV;>;"
    }
.end annotation


# instance fields
.field public final o:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lz7/p$c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lz7/p$c<",
            "TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lv/a;-><init>()V

    new-instance v0, Lz7/p$a;

    invoke-direct {v0, p0}, Lz7/p$a;-><init>(Lz7/p;)V

    invoke-interface {p1, v0}, Lz7/p$c;->a(Lz7/p$b;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    iput-object p1, p0, Lz7/p;->o:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method

.method public static synthetic A(Lz7/p;Ljava/lang/Throwable;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lv/a;->w(Ljava/lang/Throwable;)Z

    move-result p0

    return p0
.end method

.method public static synthetic z(Lz7/p;Ljava/lang/Object;)Z
    .locals 0

    invoke-virtual {p0, p1}, Lv/a;->v(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public B(Ljava/util/concurrent/Delayed;)I
    .locals 1

    iget-object v0, p0, Lz7/p;->o:Ljava/util/concurrent/ScheduledFuture;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ScheduledFuture;->compareTo(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ljava/util/concurrent/Delayed;

    invoke-virtual {p0, p1}, Lz7/p;->B(Ljava/util/concurrent/Delayed;)I

    move-result p1

    return p1
.end method

.method public f()V
    .locals 2

    iget-object v0, p0, Lz7/p;->o:Ljava/util/concurrent/ScheduledFuture;

    invoke-virtual {p0}, Lv/a;->y()Z

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    return-void
.end method

.method public getDelay(Ljava/util/concurrent/TimeUnit;)J
    .locals 2

    iget-object v0, p0, Lz7/p;->o:Ljava/util/concurrent/ScheduledFuture;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ScheduledFuture;->getDelay(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v0

    return-wide v0
.end method
