.class public final Lc7/c7;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lc7/g0;

.field public final synthetic i:Lc7/rc;

.field public final synthetic j:Lc7/o6;


# direct methods
.method public constructor <init>(Lc7/o6;Lc7/g0;Lc7/rc;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/c7;->h:Lc7/g0;

    iput-object p3, p0, Lc7/c7;->i:Lc7/rc;

    iput-object p1, p0, Lc7/c7;->j:Lc7/o6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lc7/c7;->j:Lc7/o6;

    iget-object v1, p0, Lc7/c7;->h:Lc7/g0;

    iget-object v2, p0, Lc7/c7;->i:Lc7/rc;

    invoke-virtual {v0, v1, v2}, Lc7/o6;->N1(Lc7/g0;Lc7/rc;)Lc7/g0;

    move-result-object v0

    iget-object v1, p0, Lc7/c7;->j:Lc7/o6;

    iget-object v2, p0, Lc7/c7;->i:Lc7/rc;

    invoke-virtual {v1, v0, v2}, Lc7/o6;->P1(Lc7/g0;Lc7/rc;)V

    return-void
.end method
