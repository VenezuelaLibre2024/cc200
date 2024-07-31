.class public final Lc7/eb;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lc7/yb;

.field public final synthetic i:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lc7/za;Lc7/yb;Ljava/lang/Runnable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/eb;->h:Lc7/yb;

    iput-object p3, p0, Lc7/eb;->i:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lc7/eb;->h:Lc7/yb;

    invoke-virtual {v0}, Lc7/yb;->k0()V

    iget-object v0, p0, Lc7/eb;->h:Lc7/yb;

    iget-object v1, p0, Lc7/eb;->i:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Lc7/yb;->t(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lc7/eb;->h:Lc7/yb;

    invoke-virtual {v0}, Lc7/yb;->p0()V

    return-void
.end method
