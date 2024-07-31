.class public final Lg6/i1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lg6/l1;


# direct methods
.method public constructor <init>(Lg6/l1;)V
    .locals 0

    iput-object p1, p0, Lg6/i1;->h:Lg6/l1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lg6/i1;->h:Lg6/l1;

    invoke-static {v0}, Lg6/l1;->M1(Lg6/l1;)Lg6/k1;

    move-result-object v0

    new-instance v1, Le6/b;

    const/4 v2, 0x4

    invoke-direct {v1, v2}, Le6/b;-><init>(I)V

    invoke-interface {v0, v1}, Lg6/k1;->a(Le6/b;)V

    return-void
.end method
