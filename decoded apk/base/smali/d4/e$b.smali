.class public final Ld4/e$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld4/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld4/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Ld4/e;


# direct methods
.method public constructor <init>(Ld4/e;)V
    .locals 0

    iput-object p1, p0, Ld4/e$b;->a:Ld4/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ld4/e;Ld4/e$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ld4/e$b;-><init>(Ld4/e;)V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 1

    iget-object v0, p0, Ld4/e$b;->a:Ld4/e;

    invoke-virtual {v0, p1}, Ld4/e;->o(I)V

    return-void
.end method

.method public b(I)I
    .locals 1

    iget-object v0, p0, Ld4/e$b;->a:Ld4/e;

    invoke-virtual {v0, p1}, Ld4/e;->u(I)I

    move-result p1

    return p1
.end method

.method public c(I)Z
    .locals 1

    iget-object v0, p0, Ld4/e$b;->a:Ld4/e;

    invoke-virtual {v0, p1}, Ld4/e;->z(I)Z

    move-result p1

    return p1
.end method

.method public d(ILjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Ld4/e$b;->a:Ld4/e;

    invoke-virtual {v0, p1, p2}, Ld4/e;->H(ILjava/lang/String;)V

    return-void
.end method

.method public e(ID)V
    .locals 1

    iget-object v0, p0, Ld4/e$b;->a:Ld4/e;

    invoke-virtual {v0, p1, p2, p3}, Ld4/e;->r(ID)V

    return-void
.end method

.method public f(IILx3/l;)V
    .locals 1

    iget-object v0, p0, Ld4/e$b;->a:Ld4/e;

    invoke-virtual {v0, p1, p2, p3}, Ld4/e;->l(IILx3/l;)V

    return-void
.end method

.method public g(IJJ)V
    .locals 6

    iget-object v0, p0, Ld4/e$b;->a:Ld4/e;

    move v1, p1

    move-wide v2, p2

    move-wide v4, p4

    invoke-virtual/range {v0 .. v5}, Ld4/e;->G(IJJ)V

    return-void
.end method

.method public h(IJ)V
    .locals 1

    iget-object v0, p0, Ld4/e$b;->a:Ld4/e;

    invoke-virtual {v0, p1, p2, p3}, Ld4/e;->x(IJ)V

    return-void
.end method
