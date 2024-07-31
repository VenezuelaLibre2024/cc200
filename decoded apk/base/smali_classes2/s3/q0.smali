.class public final synthetic Ls3/q0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp5/q$a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ls3/b3$e;

.field public final synthetic c:Ls3/b3$e;


# direct methods
.method public synthetic constructor <init>(ILs3/b3$e;Ls3/b3$e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ls3/q0;->a:I

    iput-object p2, p0, Ls3/q0;->b:Ls3/b3$e;

    iput-object p3, p0, Ls3/q0;->c:Ls3/b3$e;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 3

    iget v0, p0, Ls3/q0;->a:I

    iget-object v1, p0, Ls3/q0;->b:Ls3/b3$e;

    iget-object v2, p0, Ls3/q0;->c:Ls3/b3$e;

    check-cast p1, Ls3/b3$d;

    invoke-static {v0, v1, v2, p1}, Ls3/w0;->c0(ILs3/b3$e;Ls3/b3$e;Ls3/b3$d;)V

    return-void
.end method
