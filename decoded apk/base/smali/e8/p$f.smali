.class public Le8/p$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le8/p;->d0(Ljava/lang/Thread;Ljava/lang/Throwable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:J

.field public final synthetic i:Ljava/lang/Throwable;

.field public final synthetic j:Ljava/lang/Thread;

.field public final synthetic k:Le8/p;


# direct methods
.method public constructor <init>(Le8/p;JLjava/lang/Throwable;Ljava/lang/Thread;)V
    .locals 0

    iput-object p1, p0, Le8/p$f;->k:Le8/p;

    iput-wide p2, p0, Le8/p$f;->h:J

    iput-object p4, p0, Le8/p$f;->i:Ljava/lang/Throwable;

    iput-object p5, p0, Le8/p$f;->j:Ljava/lang/Thread;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    iget-object v0, p0, Le8/p$f;->k:Le8/p;

    invoke-virtual {v0}, Le8/p;->L()Z

    move-result v0

    if-nez v0, :cond_1

    iget-wide v0, p0, Le8/p$f;->h:J

    invoke-static {v0, v1}, Le8/p;->b(J)J

    move-result-wide v6

    iget-object v0, p0, Le8/p$f;->k:Le8/p;

    invoke-static {v0}, Le8/p;->c(Le8/p;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_0

    invoke-static {}, Lb8/g;->f()Lb8/g;

    move-result-object v0

    const-string v1, "Tried to write a non-fatal exception while no session was open."

    invoke-virtual {v0, v1}, Lb8/g;->k(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Le8/p$f;->k:Le8/p;

    invoke-static {v0}, Le8/p;->h(Le8/p;)Le8/j0;

    move-result-object v2

    iget-object v3, p0, Le8/p$f;->i:Ljava/lang/Throwable;

    iget-object v4, p0, Le8/p$f;->j:Ljava/lang/Thread;

    invoke-virtual/range {v2 .. v7}, Le8/j0;->u(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;J)V

    :cond_1
    return-void
.end method
