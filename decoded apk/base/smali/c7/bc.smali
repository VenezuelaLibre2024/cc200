.class public final Lc7/bc;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lc7/kc;

.field public final synthetic i:Lc7/yb;


# direct methods
.method public constructor <init>(Lc7/yb;Lc7/kc;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/bc;->h:Lc7/kc;

    iput-object p1, p0, Lc7/bc;->i:Lc7/yb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lc7/bc;->i:Lc7/yb;

    iget-object v1, p0, Lc7/bc;->h:Lc7/kc;

    invoke-static {v0, v1}, Lc7/yb;->o(Lc7/yb;Lc7/kc;)V

    iget-object v0, p0, Lc7/bc;->i:Lc7/yb;

    invoke-virtual {v0}, Lc7/yb;->o0()V

    return-void
.end method
