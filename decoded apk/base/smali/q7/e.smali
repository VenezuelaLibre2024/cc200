.class public final Lq7/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb7/a$a;


# instance fields
.field public final synthetic a:Lq7/f;


# direct methods
.method public constructor <init>(Lq7/f;)V
    .locals 0

    iput-object p1, p0, Lq7/e;->a:Lq7/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-static {p2}, Lq7/a;->f(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v0, "name"

    invoke-virtual {p1, v0, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "timestampInMillis"

    invoke-virtual {p1, p2, p4, p5}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    const-string p2, "params"

    invoke-virtual {p1, p2, p3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    iget-object p2, p0, Lq7/e;->a:Lq7/f;

    invoke-static {p2}, Lq7/f;->a(Lq7/f;)Lp7/a$b;

    move-result-object p2

    const/4 p3, 0x3

    invoke-interface {p2, p3, p1}, Lp7/a$b;->a(ILandroid/os/Bundle;)V

    :cond_0
    return-void
.end method
