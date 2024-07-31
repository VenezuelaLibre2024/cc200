.class public final synthetic Lt3/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp5/q$a;


# instance fields
.field public final synthetic a:Lt3/b$a;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lt3/b$a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt3/d;->a:Lt3/b$a;

    iput p2, p0, Lt3/d;->b:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lt3/d;->a:Lt3/b$a;

    iget v1, p0, Lt3/d;->b:I

    check-cast p1, Lt3/b;

    invoke-static {v0, v1, p1}, Lt3/n1;->i0(Lt3/b$a;ILt3/b;)V

    return-void
.end method
