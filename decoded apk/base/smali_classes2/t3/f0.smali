.class public final synthetic Lt3/f0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp5/q$a;


# instance fields
.field public final synthetic a:Lt3/b$a;

.field public final synthetic b:Ls3/m1;

.field public final synthetic c:Lv3/i;


# direct methods
.method public synthetic constructor <init>(Lt3/b$a;Ls3/m1;Lv3/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt3/f0;->a:Lt3/b$a;

    iput-object p2, p0, Lt3/f0;->b:Ls3/m1;

    iput-object p3, p0, Lt3/f0;->c:Lv3/i;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lt3/f0;->a:Lt3/b$a;

    iget-object v1, p0, Lt3/f0;->b:Ls3/m1;

    iget-object v2, p0, Lt3/f0;->c:Lv3/i;

    check-cast p1, Lt3/b;

    invoke-static {v0, v1, v2, p1}, Lt3/n1;->N(Lt3/b$a;Ls3/m1;Lv3/i;Lt3/b;)V

    return-void
.end method
