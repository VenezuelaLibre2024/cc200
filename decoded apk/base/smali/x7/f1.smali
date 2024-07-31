.class public final Lx7/f1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lg6/c$a;


# instance fields
.field public final synthetic a:Lx7/g1;


# direct methods
.method public constructor <init>(Lx7/g1;)V
    .locals 0

    iput-object p1, p0, Lx7/f1;->a:Lx7/g1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lx7/f1;->a:Lx7/g1;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lx7/g1;->d(Lx7/g1;Z)V

    iget-object p1, p0, Lx7/f1;->a:Lx7/g1;

    invoke-virtual {p1}, Lx7/g1;->b()V

    return-void

    :cond_0
    iget-object p1, p0, Lx7/f1;->a:Lx7/g1;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lx7/g1;->d(Lx7/g1;Z)V

    iget-object p1, p0, Lx7/f1;->a:Lx7/g1;

    invoke-static {p1}, Lx7/g1;->f(Lx7/g1;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lx7/f1;->a:Lx7/g1;

    invoke-static {p1}, Lx7/g1;->a(Lx7/g1;)Lx7/t;

    move-result-object p1

    invoke-virtual {p1}, Lx7/t;->c()V

    :cond_1
    return-void
.end method
