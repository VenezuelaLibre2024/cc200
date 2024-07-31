.class public final Lce/e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lce/e$a;,
        Lce/e$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field public static final b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field public final a:[Lce/x0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lce/x0<",
            "TT;>;"
        }
    .end annotation
.end field

.field private volatile notCompletedCount:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    const-class v0, Lce/e;

    const-string v1, "notCompletedCount"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, Lce/e;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>([Lce/x0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lce/x0<",
            "+TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lce/e;->a:[Lce/x0;

    array-length p1, p1

    iput p1, p0, Lce/e;->notCompletedCount:I

    return-void
.end method

.method public static final synthetic a(Lce/e;)[Lce/x0;
    .locals 0

    iget-object p0, p0, Lce/e;->a:[Lce/x0;

    return-object p0
.end method

.method public static final synthetic b()Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;
    .locals 1

    sget-object v0, Lce/e;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-object v0
.end method


# virtual methods
.method public final c(Ljd/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/d<",
            "-",
            "Ljava/util/List<",
            "+TT;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lce/p;

    invoke-static {p1}, Lkd/b;->b(Ljd/d;)Ljd/d;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lce/p;-><init>(Ljd/d;I)V

    invoke-virtual {v0}, Lce/p;->B()V

    invoke-static {p0}, Lce/e;->a(Lce/e;)[Lce/x0;

    move-result-object v1

    array-length v1, v1

    new-array v2, v1, [Lce/e$a;

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v1, :cond_0

    invoke-static {p0}, Lce/e;->a(Lce/e;)[Lce/x0;

    move-result-object v5

    aget-object v5, v5, v4

    invoke-interface {v5}, Lce/c2;->start()Z

    new-instance v6, Lce/e$a;

    invoke-direct {v6, p0, v0}, Lce/e$a;-><init>(Lce/e;Lce/n;)V

    invoke-interface {v5, v6}, Lce/c2;->x0(Lsd/l;)Lce/i1;

    move-result-object v5

    invoke-virtual {v6, v5}, Lce/e$a;->A(Lce/i1;)V

    sget-object v5, Lgd/s;->a:Lgd/s;

    aput-object v6, v2, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    new-instance v4, Lce/e$b;

    invoke-direct {v4, p0, v2}, Lce/e$b;-><init>(Lce/e;[Lce/e$a;)V

    :goto_1
    if-ge v3, v1, :cond_1

    aget-object v5, v2, v3

    invoke-virtual {v5, v4}, Lce/e$a;->z(Lce/e$b;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    invoke-interface {v0}, Lce/n;->k()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v4}, Lce/e$b;->f()V

    goto :goto_2

    :cond_2
    invoke-interface {v0, v4}, Lce/n;->c(Lsd/l;)V

    :goto_2
    invoke-virtual {v0}, Lce/p;->y()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_3

    invoke-static {p1}, Lld/h;->c(Ljd/d;)V

    :cond_3
    return-object v0
.end method
