.class public final synthetic Lt3/q0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp5/q$a;


# instance fields
.field public final synthetic a:Lt3/b$a;

.field public final synthetic b:Lu4/n;

.field public final synthetic c:Lu4/q;


# direct methods
.method public synthetic constructor <init>(Lt3/b$a;Lu4/n;Lu4/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt3/q0;->a:Lt3/b$a;

    iput-object p2, p0, Lt3/q0;->b:Lu4/n;

    iput-object p3, p0, Lt3/q0;->c:Lu4/q;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lt3/q0;->a:Lt3/b$a;

    iget-object v1, p0, Lt3/q0;->b:Lu4/n;

    iget-object v2, p0, Lt3/q0;->c:Lu4/q;

    check-cast p1, Lt3/b;

    invoke-static {v0, v1, v2, p1}, Lt3/n1;->d0(Lt3/b$a;Lu4/n;Lu4/q;Lt3/b;)V

    return-void
.end method
