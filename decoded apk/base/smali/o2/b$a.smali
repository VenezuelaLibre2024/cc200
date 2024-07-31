.class public Lo2/b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Executor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:Lo2/b;


# direct methods
.method public constructor <init>(Lo2/b;)V
    .locals 0

    iput-object p1, p0, Lo2/b$a;->h:Lo2/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lo2/b$a;->h:Lo2/b;

    invoke-virtual {v0, p1}, Lo2/b;->d(Ljava/lang/Runnable;)V

    return-void
.end method
