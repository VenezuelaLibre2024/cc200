.class public final synthetic Lt3/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp5/q$a;


# instance fields
.field public final synthetic a:Lt3/b$a;

.field public final synthetic b:I

.field public final synthetic c:Ls3/b3$e;

.field public final synthetic d:Ls3/b3$e;


# direct methods
.method public synthetic constructor <init>(Lt3/b$a;ILs3/b3$e;Ls3/b3$e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt3/l;->a:Lt3/b$a;

    iput p2, p0, Lt3/l;->b:I

    iput-object p3, p0, Lt3/l;->c:Ls3/b3$e;

    iput-object p4, p0, Lt3/l;->d:Ls3/b3$e;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Lt3/l;->a:Lt3/b$a;

    iget v1, p0, Lt3/l;->b:I

    iget-object v2, p0, Lt3/l;->c:Ls3/b3$e;

    iget-object v3, p0, Lt3/l;->d:Ls3/b3$e;

    check-cast p1, Lt3/b;

    invoke-static {v0, v1, v2, v3, p1}, Lt3/n1;->o0(Lt3/b$a;ILs3/b3$e;Ls3/b3$e;Lt3/b;)V

    return-void
.end method
