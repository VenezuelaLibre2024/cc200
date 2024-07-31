.class public Lc8/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc8/a;


# instance fields
.field public final a:Lp7/a;


# direct methods
.method public constructor <init>(Lp7/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc8/e;->a:Lp7/a;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lc8/e;->a:Lp7/a;

    const-string v1, "clx"

    invoke-interface {v0, v1, p1, p2}, Lp7/a;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
