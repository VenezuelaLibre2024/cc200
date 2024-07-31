.class public final Lc7/i8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final synthetic h:Lc7/w7;


# direct methods
.method public constructor <init>(Lc7/w7;)V
    .locals 0

    iput-object p1, p0, Lc7/i8;->h:Lc7/w7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    iget-object v0, p0, Lc7/i8;->h:Lc7/w7;

    invoke-virtual {v0}, Lc7/j7;->zzl()Lc7/d6;

    move-result-object v0

    invoke-virtual {v0, p1}, Lc7/d6;->y(Ljava/lang/Runnable;)V

    return-void
.end method
