.class public Lu4/h0$a;
.super Lu4/l;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu4/h0;->F()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>(Lu4/h0;Ls3/u3;)V
    .locals 0

    invoke-direct {p0, p2}, Lu4/l;-><init>(Ls3/u3;)V

    return-void
.end method


# virtual methods
.method public k(ILs3/u3$b;Z)Ls3/u3$b;
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lu4/l;->k(ILs3/u3$b;Z)Ls3/u3$b;

    const/4 p1, 0x1

    iput-boolean p1, p2, Ls3/u3$b;->m:Z

    return-object p2
.end method

.method public s(ILs3/u3$d;J)Ls3/u3$d;
    .locals 0

    invoke-super {p0, p1, p2, p3, p4}, Lu4/l;->s(ILs3/u3$d;J)Ls3/u3$d;

    const/4 p1, 0x1

    iput-boolean p1, p2, Ls3/u3$d;->s:Z

    return-object p2
.end method
