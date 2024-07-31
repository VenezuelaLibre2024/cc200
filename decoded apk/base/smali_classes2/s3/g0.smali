.class public final synthetic Ls3/g0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp5/q$a;


# instance fields
.field public final synthetic a:Ls3/y2;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Ls3/y2;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls3/g0;->a:Ls3/y2;

    iput p2, p0, Ls3/g0;->b:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Ls3/g0;->a:Ls3/y2;

    iget v1, p0, Ls3/g0;->b:I

    check-cast p1, Ls3/b3$d;

    invoke-static {v0, v1, p1}, Ls3/w0;->j0(Ls3/y2;ILs3/b3$d;)V

    return-void
.end method
