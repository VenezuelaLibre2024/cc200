.class public final synthetic Lz7/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lz7/o;

.field public final synthetic b:Ljava/util/concurrent/Callable;

.field public final synthetic c:Lz7/p$b;


# direct methods
.method public synthetic constructor <init>(Lz7/o;Ljava/util/concurrent/Callable;Lz7/p$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz7/l;->a:Lz7/o;

    iput-object p2, p0, Lz7/l;->b:Ljava/util/concurrent/Callable;

    iput-object p3, p0, Lz7/l;->c:Lz7/p$b;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lz7/l;->a:Lz7/o;

    iget-object v1, p0, Lz7/l;->b:Ljava/util/concurrent/Callable;

    iget-object v2, p0, Lz7/l;->c:Lz7/p$b;

    invoke-static {v0, v1, v2}, Lz7/o;->d(Lz7/o;Ljava/util/concurrent/Callable;Lz7/p$b;)Ljava/util/concurrent/Future;

    move-result-object v0

    return-object v0
.end method
