.class public final synthetic Lt3/q;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp5/q$a;


# instance fields
.field public final synthetic a:Lt3/b$a;

.field public final synthetic b:Ld5/e;


# direct methods
.method public synthetic constructor <init>(Lt3/b$a;Ld5/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt3/q;->a:Lt3/b$a;

    iput-object p2, p0, Lt3/q;->b:Ld5/e;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lt3/q;->a:Lt3/b$a;

    iget-object v1, p0, Lt3/q;->b:Ld5/e;

    check-cast p1, Lt3/b;

    invoke-static {v0, v1, p1}, Lt3/n1;->r0(Lt3/b$a;Ld5/e;Lt3/b;)V

    return-void
.end method