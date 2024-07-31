.class public final synthetic Lc7/sc;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public synthetic h:Lc7/w7;


# direct methods
.method public synthetic constructor <init>(Lc7/w7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc7/sc;->h:Lc7/w7;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lc7/sc;->h:Lc7/w7;

    invoke-virtual {v0}, Lc7/w7;->l0()V

    return-void
.end method
