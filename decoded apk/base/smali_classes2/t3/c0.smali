.class public final synthetic Lt3/c0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp5/q$a;


# instance fields
.field public final synthetic a:Lt3/b$a;

.field public final synthetic b:Lk4/a;


# direct methods
.method public synthetic constructor <init>(Lt3/b$a;Lk4/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt3/c0;->a:Lt3/b$a;

    iput-object p2, p0, Lt3/c0;->b:Lk4/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lt3/c0;->a:Lt3/b$a;

    iget-object v1, p0, Lt3/c0;->b:Lk4/a;

    check-cast p1, Lt3/b;

    invoke-static {v0, v1, p1}, Lt3/n1;->h0(Lt3/b$a;Lk4/a;Lt3/b;)V

    return-void
.end method
