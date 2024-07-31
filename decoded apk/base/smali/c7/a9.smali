.class public final Lc7/a9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Ljava/lang/Boolean;

.field public final synthetic i:Lc7/w7;


# direct methods
.method public constructor <init>(Lc7/w7;Ljava/lang/Boolean;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p2, p0, Lc7/a9;->h:Ljava/lang/Boolean;

    iput-object p1, p0, Lc7/a9;->i:Lc7/w7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lc7/a9;->i:Lc7/w7;

    iget-object v1, p0, Lc7/a9;->h:Ljava/lang/Boolean;

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lc7/w7;->L(Lc7/w7;Ljava/lang/Boolean;Z)V

    return-void
.end method
