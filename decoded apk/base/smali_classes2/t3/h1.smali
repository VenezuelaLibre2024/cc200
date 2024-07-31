.class public final synthetic Lt3/h1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp5/q$b;


# instance fields
.field public final synthetic a:Lt3/n1;

.field public final synthetic b:Ls3/b3;


# direct methods
.method public synthetic constructor <init>(Lt3/n1;Ls3/b3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt3/h1;->a:Lt3/n1;

    iput-object p2, p0, Lt3/h1;->b:Ls3/b3;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lp5/l;)V
    .locals 2

    iget-object v0, p0, Lt3/h1;->a:Lt3/n1;

    iget-object v1, p0, Lt3/h1;->b:Ls3/b3;

    check-cast p1, Lt3/b;

    invoke-static {v0, v1, p1, p2}, Lt3/n1;->K0(Lt3/n1;Ls3/b3;Lt3/b;Lp5/l;)V

    return-void
.end method
