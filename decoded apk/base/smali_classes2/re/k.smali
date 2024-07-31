.class public final Lre/k;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lue/g;


# direct methods
.method public constructor <init>()V
    .locals 4

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const/4 v1, 0x5

    const-wide/16 v2, 0x5

    invoke-direct {p0, v1, v2, v3, v0}, Lre/k;-><init>(IJLjava/util/concurrent/TimeUnit;)V

    return-void
.end method

.method public constructor <init>(IJLjava/util/concurrent/TimeUnit;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lue/g;

    invoke-direct {v0, p1, p2, p3, p4}, Lue/g;-><init>(IJLjava/util/concurrent/TimeUnit;)V

    iput-object v0, p0, Lre/k;->a:Lue/g;

    return-void
.end method
