.class public final synthetic Lc7/d8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public synthetic h:Lc7/w7;

.field public synthetic i:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lc7/w7;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc7/d8;->h:Lc7/w7;

    iput-object p2, p0, Lc7/d8;->i:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lc7/d8;->h:Lc7/w7;

    iget-object v1, p0, Lc7/d8;->i:Ljava/lang/String;

    invoke-virtual {v0}, Lc7/f4;->k()Lc7/p4;

    move-result-object v2

    invoke-virtual {v2, v1}, Lc7/p4;->F(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lc7/f4;->k()Lc7/p4;

    move-result-object v0

    invoke-virtual {v0}, Lc7/p4;->D()V

    :cond_0
    return-void
.end method
