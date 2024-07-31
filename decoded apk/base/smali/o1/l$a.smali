.class public Lo1/l$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo1/l;->execute(Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Ljava/lang/Runnable;

.field public final synthetic i:Lo1/l;


# direct methods
.method public constructor <init>(Lo1/l;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lo1/l$a;->i:Lo1/l;

    iput-object p2, p0, Lo1/l$a;->h:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lo1/l$a;->h:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lo1/l$a;->i:Lo1/l;

    invoke-virtual {v0}, Lo1/l;->a()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lo1/l$a;->i:Lo1/l;

    invoke-virtual {v1}, Lo1/l;->a()V

    throw v0
.end method
