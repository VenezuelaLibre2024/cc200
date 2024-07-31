.class public Lg6/p$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg6/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A::",
        "Lf6/a$b;",
        "L:Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public a:Lg6/q;

.field public b:Lg6/q;

.field public c:Ljava/lang/Runnable;

.field public d:Lg6/j;

.field public e:[Le6/d;

.field public f:Z

.field public g:I


# direct methods
.method public synthetic constructor <init>(Lg6/e1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object p1, Lg6/b1;->h:Lg6/b1;

    iput-object p1, p0, Lg6/p$a;->c:Ljava/lang/Runnable;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lg6/p$a;->f:Z

    return-void
.end method

.method public static bridge synthetic f(Lg6/p$a;)Lg6/q;
    .locals 0

    iget-object p0, p0, Lg6/p$a;->a:Lg6/q;

    return-object p0
.end method

.method public static bridge synthetic g(Lg6/p$a;)Lg6/q;
    .locals 0

    iget-object p0, p0, Lg6/p$a;->b:Lg6/q;

    return-object p0
.end method


# virtual methods
.method public a()Lg6/p;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lg6/p<",
            "TA;T",
            "L;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lg6/p$a;->a:Lg6/q;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    const-string v3, "Must set register function"

    invoke-static {v0, v3}, Lh6/s;->b(ZLjava/lang/Object;)V

    iget-object v0, p0, Lg6/p$a;->b:Lg6/q;

    if-eqz v0, :cond_1

    move v0, v1

    goto :goto_1

    :cond_1
    move v0, v2

    :goto_1
    const-string v3, "Must set unregister function"

    invoke-static {v0, v3}, Lh6/s;->b(ZLjava/lang/Object;)V

    iget-object v0, p0, Lg6/p$a;->d:Lg6/j;

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    move v1, v2

    :goto_2
    const-string v0, "Must set holder"

    invoke-static {v1, v0}, Lh6/s;->b(ZLjava/lang/Object;)V

    iget-object v0, p0, Lg6/p$a;->d:Lg6/j;

    invoke-virtual {v0}, Lg6/j;->b()Lg6/j$a;

    move-result-object v0

    const-string v1, "Key must not be null"

    invoke-static {v0, v1}, Lh6/s;->m(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg6/j$a;

    new-instance v1, Lg6/p;

    new-instance v8, Lg6/c1;

    iget-object v4, p0, Lg6/p$a;->d:Lg6/j;

    iget-object v5, p0, Lg6/p$a;->e:[Le6/d;

    iget-boolean v6, p0, Lg6/p$a;->f:Z

    iget v7, p0, Lg6/p$a;->g:I

    move-object v2, v8

    move-object v3, p0

    invoke-direct/range {v2 .. v7}, Lg6/c1;-><init>(Lg6/p$a;Lg6/j;[Le6/d;ZI)V

    new-instance v2, Lg6/d1;

    invoke-direct {v2, p0, v0}, Lg6/d1;-><init>(Lg6/p$a;Lg6/j$a;)V

    iget-object v0, p0, Lg6/p$a;->c:Ljava/lang/Runnable;

    const/4 v3, 0x0

    invoke-direct {v1, v8, v2, v0, v3}, Lg6/p;-><init>(Lg6/o;Lg6/x;Ljava/lang/Runnable;Lg6/f1;)V

    return-object v1
.end method

.method public b(Lg6/q;)Lg6/p$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg6/q<",
            "TA;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Ljava/lang/Void;",
            ">;>;)",
            "Lg6/p$a<",
            "TA;T",
            "L;",
            ">;"
        }
    .end annotation

    iput-object p1, p0, Lg6/p$a;->a:Lg6/q;

    return-object p0
.end method

.method public c(I)Lg6/p$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lg6/p$a<",
            "TA;T",
            "L;",
            ">;"
        }
    .end annotation

    iput p1, p0, Lg6/p$a;->g:I

    return-object p0
.end method

.method public d(Lg6/q;)Lg6/p$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg6/q<",
            "TA;",
            "Lcom/google/android/gms/tasks/TaskCompletionSource<",
            "Ljava/lang/Boolean;",
            ">;>;)",
            "Lg6/p$a<",
            "TA;T",
            "L;",
            ">;"
        }
    .end annotation

    iput-object p1, p0, Lg6/p$a;->b:Lg6/q;

    return-object p0
.end method

.method public e(Lg6/j;)Lg6/p$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg6/j<",
            "T",
            "L;",
            ">;)",
            "Lg6/p$a<",
            "TA;T",
            "L;",
            ">;"
        }
    .end annotation

    iput-object p1, p0, Lg6/p$a;->d:Lg6/j;

    return-object p0
.end method
