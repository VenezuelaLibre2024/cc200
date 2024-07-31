.class public final Lm9/x$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lfe/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm9/x$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
.field public final synthetic h:Lm9/x;


# direct methods
.method public constructor <init>(Lm9/x;)V
    .locals 0

    iput-object p1, p0, Lm9/x$a$a;->h:Lm9/x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lm9/l;Ljd/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm9/l;",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, Lm9/x$a$a;->h:Lm9/x;

    invoke-static {p2}, Lm9/x;->e(Lm9/x;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object p2

    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method

.method public bridge synthetic emit(Ljava/lang/Object;Ljd/d;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm9/l;

    invoke-virtual {p0, p1, p2}, Lm9/x$a$a;->a(Lm9/l;Ljd/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
