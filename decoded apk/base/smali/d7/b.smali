.class public final Ld7/b;
.super Lf6/a$a;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lf6/a$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic buildClient(Landroid/content/Context;Landroid/os/Looper;Lh6/e;Ljava/lang/Object;Lf6/f$a;Lf6/f$b;)Lf6/a$f;
    .locals 8

    check-cast p4, Ld7/a;

    new-instance p4, Le7/a;

    invoke-static {p3}, Le7/a;->c(Lh6/e;)Landroid/os/Bundle;

    move-result-object v5

    const/4 v3, 0x1

    move-object v0, p4

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Le7/a;-><init>(Landroid/content/Context;Landroid/os/Looper;ZLh6/e;Landroid/os/Bundle;Lf6/f$a;Lf6/f$b;)V

    return-object p4
.end method
