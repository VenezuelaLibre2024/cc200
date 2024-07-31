.class public final Lx7/d2;
.super Lw7/c;
.source ""


# instance fields
.field public final b:Lw7/j0;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lw7/j0;)V
    .locals 0

    invoke-direct {p0}, Lw7/c;-><init>()V

    invoke-static {p1}, Lh6/s;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lw7/b;->a:Ljava/lang/String;

    invoke-static {p2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw7/j0;

    iput-object p1, p0, Lx7/d2;->b:Lw7/j0;

    return-void
.end method
