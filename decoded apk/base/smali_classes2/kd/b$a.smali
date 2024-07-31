.class public final Lkd/b$a;
.super Lld/j;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkd/b;->a(Lsd/p;Ljava/lang/Object;Ljd/d;)Ljd/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public h:I

.field public final synthetic i:Lsd/p;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljd/d;Lsd/p;Ljava/lang/Object;)V
    .locals 0

    iput-object p2, p0, Lkd/b$a;->i:Lsd/p;

    iput-object p3, p0, Lkd/b$a;->j:Ljava/lang/Object;

    const-string p2, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>"

    invoke-static {p1, p2}, Ltd/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lld/j;-><init>(Ljd/d;)V

    return-void
.end method


# virtual methods
.method public invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lkd/b$a;->h:I

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v2, :cond_0

    iput v1, p0, Lkd/b$a;->h:I

    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This coroutine had already completed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iput v2, p0, Lkd/b$a;->h:I

    invoke-static {p1}, Lgd/l;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lkd/b$a;->i:Lsd/p;

    const-string v0, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>"

    invoke-static {p1, v0}, Ltd/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lkd/b$a;->i:Lsd/p;

    invoke-static {p1, v1}, Ltd/a0;->a(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lsd/p;

    iget-object v0, p0, Lkd/b$a;->j:Ljava/lang/Object;

    invoke-interface {p1, v0, p0}, Lsd/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    return-object p1
.end method
