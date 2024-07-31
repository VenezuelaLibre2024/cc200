.class public final Lm9/x$f$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lfe/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm9/x$f;->a(Lfe/c;Ljd/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lfe/c;"
    }
.end annotation


# instance fields
.field public final synthetic h:Lfe/c;

.field public final synthetic i:Lm9/x;


# direct methods
.method public constructor <init>(Lfe/c;Lm9/x;)V
    .locals 0

    iput-object p1, p0, Lm9/x$f$a;->h:Lfe/c;

    iput-object p2, p0, Lm9/x$f$a;->i:Lm9/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lm9/x$f$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lm9/x$f$a$a;

    iget v1, v0, Lm9/x$f$a$a;->i:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lm9/x$f$a$a;->i:I

    goto :goto_0

    :cond_0
    new-instance v0, Lm9/x$f$a$a;

    invoke-direct {v0, p0, p2}, Lm9/x$f$a$a;-><init>(Lm9/x$f$a;Ljd/d;)V

    :goto_0
    iget-object p2, v0, Lm9/x$f$a$a;->h:Ljava/lang/Object;

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lm9/x$f$a$a;->i:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lgd/l;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lgd/l;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lm9/x$f$a;->h:Lfe/c;

    check-cast p1, Lu0/d;

    iget-object v2, p0, Lm9/x$f$a;->i:Lm9/x;

    invoke-static {v2, p1}, Lm9/x;->h(Lm9/x;Lu0/d;)Lm9/l;

    move-result-object p1

    iput v3, v0, Lm9/x$f$a$a;->i:I

    invoke-interface {p2, p1, v0}, Lfe/c;->emit(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method
