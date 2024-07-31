.class public final synthetic Lz7/n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lz7/p$c;


# instance fields
.field public final synthetic a:Lz7/o;

.field public final synthetic b:Ljava/lang/Runnable;

.field public final synthetic c:J

.field public final synthetic d:J

.field public final synthetic e:Ljava/util/concurrent/TimeUnit;


# direct methods
.method public synthetic constructor <init>(Lz7/o;Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz7/n;->a:Lz7/o;

    iput-object p2, p0, Lz7/n;->b:Ljava/lang/Runnable;

    iput-wide p3, p0, Lz7/n;->c:J

    iput-wide p5, p0, Lz7/n;->d:J

    iput-object p7, p0, Lz7/n;->e:Ljava/util/concurrent/TimeUnit;

    return-void
.end method


# virtual methods
.method public final a(Lz7/p$b;)Ljava/util/concurrent/ScheduledFuture;
    .locals 8

    iget-object v0, p0, Lz7/n;->a:Lz7/o;

    iget-object v1, p0, Lz7/n;->b:Ljava/lang/Runnable;

    iget-wide v2, p0, Lz7/n;->c:J

    iget-wide v4, p0, Lz7/n;->d:J

    iget-object v6, p0, Lz7/n;->e:Ljava/util/concurrent/TimeUnit;

    move-object v7, p1

    invoke-static/range {v0 .. v7}, Lz7/o;->j(Lz7/o;Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;Lz7/p$b;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    return-object p1
.end method
