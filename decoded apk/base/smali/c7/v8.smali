.class public final Lc7/v8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Lc7/w7;


# direct methods
.method public constructor <init>(Lc7/w7;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/v8;->h:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 p2, 0x0

    iput-object p2, p0, Lc7/v8;->i:Ljava/lang/String;

    iput-object p4, p0, Lc7/v8;->j:Ljava/lang/String;

    iput-object p5, p0, Lc7/v8;->k:Ljava/lang/String;

    iput-object p1, p0, Lc7/v8;->l:Lc7/w7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lc7/v8;->l:Lc7/w7;

    iget-object v0, v0, Lc7/j7;->a:Lc7/k6;

    invoke-virtual {v0}, Lc7/k6;->E()Lc7/y9;

    move-result-object v0

    iget-object v1, p0, Lc7/v8;->h:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v2, p0, Lc7/v8;->j:Ljava/lang/String;

    iget-object v3, p0, Lc7/v8;->k:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v4, v2, v3}, Lc7/y9;->N(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
