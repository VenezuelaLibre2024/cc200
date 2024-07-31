.class public final synthetic Lt3/g1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp5/q$a;


# instance fields
.field public final synthetic a:Lt3/b$a;

.field public final synthetic b:Z

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lt3/b$a;ZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt3/g1;->a:Lt3/b$a;

    iput-boolean p2, p0, Lt3/g1;->b:Z

    iput p3, p0, Lt3/g1;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lt3/g1;->a:Lt3/b$a;

    iget-boolean v1, p0, Lt3/g1;->b:Z

    iget v2, p0, Lt3/g1;->c:I

    check-cast p1, Lt3/b;

    invoke-static {v0, v1, v2, p1}, Lt3/n1;->F0(Lt3/b$a;ZILt3/b;)V

    return-void
.end method
