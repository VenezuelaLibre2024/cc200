.class public final Lu4/g0$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu4/m0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu4/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation


# instance fields
.field public final h:I

.field public final synthetic i:Lu4/g0;


# direct methods
.method public constructor <init>(Lu4/g0;I)V
    .locals 0

    iput-object p1, p0, Lu4/g0$c;->i:Lu4/g0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lu4/g0$c;->h:I

    return-void
.end method

.method public static synthetic b(Lu4/g0$c;)I
    .locals 0

    iget p0, p0, Lu4/g0$c;->h:I

    return p0
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lu4/g0$c;->i:Lu4/g0;

    iget v1, p0, Lu4/g0$c;->h:I

    invoke-virtual {v0, v1}, Lu4/g0;->X(I)V

    return-void
.end method

.method public e()Z
    .locals 2

    iget-object v0, p0, Lu4/g0$c;->i:Lu4/g0;

    iget v1, p0, Lu4/g0$c;->h:I

    invoke-virtual {v0, v1}, Lu4/g0;->P(I)Z

    move-result v0

    return v0
.end method

.method public j(Ls3/n1;Lv3/g;I)I
    .locals 2

    iget-object v0, p0, Lu4/g0$c;->i:Lu4/g0;

    iget v1, p0, Lu4/g0$c;->h:I

    invoke-virtual {v0, v1, p1, p2, p3}, Lu4/g0;->d0(ILs3/n1;Lv3/g;I)I

    move-result p1

    return p1
.end method

.method public n(J)I
    .locals 2

    iget-object v0, p0, Lu4/g0$c;->i:Lu4/g0;

    iget v1, p0, Lu4/g0$c;->h:I

    invoke-virtual {v0, v1, p1, p2}, Lu4/g0;->h0(IJ)I

    move-result p1

    return p1
.end method
