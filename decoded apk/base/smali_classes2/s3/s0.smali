.class public final synthetic Ls3/s0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp5/q$a;


# instance fields
.field public final synthetic a:Ls3/u1;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Ls3/u1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls3/s0;->a:Ls3/u1;

    iput p2, p0, Ls3/s0;->b:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Ls3/s0;->a:Ls3/u1;

    iget v1, p0, Ls3/s0;->b:I

    check-cast p1, Ls3/b3$d;

    invoke-static {v0, v1, p1}, Ls3/w0;->h0(Ls3/u1;ILs3/b3$d;)V

    return-void
.end method
