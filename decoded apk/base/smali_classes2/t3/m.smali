.class public final synthetic Lt3/m;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp5/q$a;


# instance fields
.field public final synthetic a:Lt3/b$a;

.field public final synthetic b:I

.field public final synthetic c:Z


# direct methods
.method public synthetic constructor <init>(Lt3/b$a;IZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt3/m;->a:Lt3/b$a;

    iput p2, p0, Lt3/m;->b:I

    iput-boolean p3, p0, Lt3/m;->c:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lt3/m;->a:Lt3/b$a;

    iget v1, p0, Lt3/m;->b:I

    iget-boolean v2, p0, Lt3/m;->c:Z

    check-cast p1, Lt3/b;

    invoke-static {v0, v1, v2, p1}, Lt3/n1;->L(Lt3/b$a;IZLt3/b;)V

    return-void
.end method
