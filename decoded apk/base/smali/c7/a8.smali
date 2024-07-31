.class public final synthetic Lc7/a8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public synthetic h:Lc7/w7;

.field public synthetic i:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lc7/w7;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc7/a8;->h:Lc7/w7;

    iput-object p2, p0, Lc7/a8;->i:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lc7/a8;->h:Lc7/w7;

    iget-object v1, p0, Lc7/a8;->i:Ljava/util/List;

    invoke-virtual {v0, v1}, Lc7/w7;->Z(Ljava/util/List;)V

    return-void
.end method
