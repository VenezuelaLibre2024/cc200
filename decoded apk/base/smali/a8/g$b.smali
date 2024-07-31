.class public La8/g$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La8/g;->e(Ln7/g;Lz8/h;Ly8/a;Ly8/a;Ly8/a;)La8/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Le8/r;

.field public final synthetic c:Ll8/f;


# direct methods
.method public constructor <init>(ZLe8/r;Ll8/f;)V
    .locals 0

    iput-boolean p1, p0, La8/g$b;->a:Z

    iput-object p2, p0, La8/g$b;->b:Le8/r;

    iput-object p3, p0, La8/g$b;->c:Ll8/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Void;
    .locals 2

    iget-boolean v0, p0, La8/g$b;->a:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, La8/g$b;->b:Le8/r;

    iget-object v1, p0, La8/g$b;->c:Ll8/f;

    invoke-virtual {v0, v1}, Le8/r;->j(Ll8/i;)Lcom/google/android/gms/tasks/Task;

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, La8/g$b;->a()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method
