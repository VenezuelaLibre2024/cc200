.class public final Lm9/x;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lm9/w;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm9/x$d;,
        Lm9/x$c;
    }
.end annotation


# static fields
.field public static final f:Lm9/x$c;

.field public static final g:Lud/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lud/a<",
            "Landroid/content/Context;",
            "Lr0/f<",
            "Lu0/d;",
            ">;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field public final b:Landroid/content/Context;

.field public final c:Ljd/g;

.field public final d:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Lm9/l;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lfe/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lfe/b<",
            "Lm9/l;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Lm9/x$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm9/x$c;-><init>(Ltd/g;)V

    sput-object v0, Lm9/x;->f:Lm9/x$c;

    sget-object v0, Lm9/v;->a:Lm9/v;

    invoke-virtual {v0}, Lm9/v;->a()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ls0/b;

    sget-object v0, Lm9/x$b;->h:Lm9/x$b;

    invoke-direct {v2, v0}, Ls0/b;-><init>(Lsd/l;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xc

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lt0/a;->b(Ljava/lang/String;Ls0/b;Lsd/l;Lce/p0;ILjava/lang/Object;)Lud/a;

    move-result-object v0

    sput-object v0, Lm9/x;->g:Lud/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljd/g;)V
    .locals 8

    const-string v0, "context"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundDispatcher"

    invoke-static {p2, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm9/x;->b:Landroid/content/Context;

    iput-object p2, p0, Lm9/x;->c:Ljd/g;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v0, p0, Lm9/x;->d:Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v0, Lm9/x;->f:Lm9/x$c;

    invoke-static {v0, p1}, Lm9/x$c;->a(Lm9/x$c;Landroid/content/Context;)Lr0/f;

    move-result-object p1

    invoke-interface {p1}, Lr0/f;->getData()Lfe/b;

    move-result-object p1

    new-instance v0, Lm9/x$e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm9/x$e;-><init>(Ljd/d;)V

    invoke-static {p1, v0}, Lfe/d;->a(Lfe/b;Lsd/q;)Lfe/b;

    move-result-object p1

    new-instance v0, Lm9/x$f;

    invoke-direct {v0, p1, p0}, Lm9/x$f;-><init>(Lfe/b;Lm9/x;)V

    iput-object v0, p0, Lm9/x;->e:Lfe/b;

    invoke-static {p2}, Lce/q0;->a(Ljd/g;)Lce/p0;

    move-result-object v2

    new-instance v5, Lm9/x$a;

    invoke-direct {v5, p0, v1}, Lm9/x$a;-><init>(Lm9/x;Ljd/d;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x3

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Lce/i;->d(Lce/p0;Ljd/g;Lce/r0;Lsd/p;ILjava/lang/Object;)Lce/c2;

    return-void
.end method

.method public static final synthetic c()Lm9/x$c;
    .locals 1

    sget-object v0, Lm9/x;->f:Lm9/x$c;

    return-object v0
.end method

.method public static final synthetic d(Lm9/x;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lm9/x;->b:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic e(Lm9/x;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    iget-object p0, p0, Lm9/x;->d:Ljava/util/concurrent/atomic/AtomicReference;

    return-object p0
.end method

.method public static final synthetic f()Lud/a;
    .locals 1

    sget-object v0, Lm9/x;->g:Lud/a;

    return-object v0
.end method

.method public static final synthetic g(Lm9/x;)Lfe/b;
    .locals 0

    iget-object p0, p0, Lm9/x;->e:Lfe/b;

    return-object p0
.end method

.method public static final synthetic h(Lm9/x;Lu0/d;)Lm9/l;
    .locals 0

    invoke-virtual {p0, p1}, Lm9/x;->i(Lu0/d;)Lm9/l;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lm9/x;->d:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm9/l;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lm9/l;->a()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 7

    const-string v0, "sessionId"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm9/x;->c:Ljd/g;

    invoke-static {v0}, Lce/q0;->a(Ljd/g;)Lce/p0;

    move-result-object v1

    new-instance v4, Lm9/x$g;

    const/4 v0, 0x0

    invoke-direct {v4, p0, p1, v0}, Lm9/x$g;-><init>(Lm9/x;Ljava/lang/String;Ljd/d;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lce/i;->d(Lce/p0;Ljd/g;Lce/r0;Lsd/p;ILjava/lang/Object;)Lce/c2;

    return-void
.end method

.method public final i(Lu0/d;)Lm9/l;
    .locals 2

    new-instance v0, Lm9/l;

    sget-object v1, Lm9/x$d;->a:Lm9/x$d;

    invoke-virtual {v1}, Lm9/x$d;->a()Lu0/d$a;

    move-result-object v1

    invoke-virtual {p1, v1}, Lu0/d;->b(Lu0/d$a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-direct {v0, p1}, Lm9/l;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
