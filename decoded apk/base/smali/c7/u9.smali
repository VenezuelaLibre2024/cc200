.class public final Lc7/u9;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lc7/p9;


# direct methods
.method public constructor <init>(Lc7/p9;)V
    .locals 0

    iput-object p1, p0, Lc7/u9;->h:Lc7/p9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lc7/u9;->h:Lc7/p9;

    invoke-static {v0}, Lc7/p9;->w(Lc7/p9;)Lc7/q9;

    move-result-object v1

    iput-object v1, v0, Lc7/p9;->e:Lc7/q9;

    return-void
.end method
