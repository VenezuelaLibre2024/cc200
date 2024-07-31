.class public final synthetic Lt3/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp5/q$a;


# instance fields
.field public final synthetic a:Lt3/b$a;

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lt3/b$a;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt3/h;->a:Lt3/b$a;

    iput p2, p0, Lt3/h;->b:I

    iput p3, p0, Lt3/h;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lt3/h;->a:Lt3/b$a;

    iget v1, p0, Lt3/h;->b:I

    iget v2, p0, Lt3/h;->c:I

    check-cast p1, Lt3/b;

    invoke-static {v0, v1, v2, p1}, Lt3/n1;->f0(Lt3/b$a;IILt3/b;)V

    return-void
.end method
