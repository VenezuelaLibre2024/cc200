.class public final Lc7/j5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Z

.field public final synthetic i:Lc7/f5;


# direct methods
.method public constructor <init>(Lc7/f5;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-boolean p2, p0, Lc7/j5;->h:Z

    iput-object p1, p0, Lc7/j5;->i:Lc7/f5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lc7/j5;->i:Lc7/f5;

    invoke-static {v0}, Lc7/f5;->a(Lc7/f5;)Lc7/yb;

    move-result-object v0

    iget-boolean v1, p0, Lc7/j5;->h:Z

    invoke-virtual {v0, v1}, Lc7/yb;->D(Z)V

    return-void
.end method
