.class public final synthetic Lz7/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lz7/p$c;


# instance fields
.field public final synthetic a:Lz7/o;

.field public final synthetic b:Ljava/lang/Runnable;

.field public final synthetic c:J

.field public final synthetic d:Ljava/util/concurrent/TimeUnit;


# direct methods
.method public synthetic constructor <init>(Lz7/o;Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz7/d;->a:Lz7/o;

    iput-object p2, p0, Lz7/d;->b:Ljava/lang/Runnable;

    iput-wide p3, p0, Lz7/d;->c:J

    iput-object p5, p0, Lz7/d;->d:Ljava/util/concurrent/TimeUnit;

    return-void
.end method


# virtual methods
.method public final a(Lz7/p$b;)Ljava/util/concurrent/ScheduledFuture;
    .locals 6

    iget-object v0, p0, Lz7/d;->a:Lz7/o;

    iget-object v1, p0, Lz7/d;->b:Ljava/lang/Runnable;

    iget-wide v2, p0, Lz7/d;->c:J

    iget-object v4, p0, Lz7/d;->d:Ljava/util/concurrent/TimeUnit;

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lz7/o;->a(Lz7/o;Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Lz7/p$b;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    return-object p1
.end method
