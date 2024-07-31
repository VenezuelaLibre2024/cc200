.class public final Lc7/j8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lc7/w7;


# direct methods
.method public constructor <init>(Lc7/w7;)V
    .locals 0

    iput-object p1, p0, Lc7/j8;->h:Lc7/w7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lc7/j8;->h:Lc7/w7;

    iget-object v0, v0, Lc7/w7;->n:Lc7/uc;

    invoke-virtual {v0}, Lc7/uc;->a()V

    return-void
.end method
