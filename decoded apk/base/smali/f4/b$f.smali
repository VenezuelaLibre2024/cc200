.class public final Lf4/b$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf4/b$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf4/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "f"
.end annotation


# instance fields
.field public final a:Lp5/a0;

.field public final b:I

.field public final c:I

.field public d:I

.field public e:I


# direct methods
.method public constructor <init>(Lf4/a$b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object p1, p1, Lf4/a$b;->b:Lp5/a0;

    iput-object p1, p0, Lf4/b$f;->a:Lp5/a0;

    const/16 v0, 0xc

    invoke-virtual {p1, v0}, Lp5/a0;->T(I)V

    invoke-virtual {p1}, Lp5/a0;->K()I

    move-result v0

    and-int/lit16 v0, v0, 0xff

    iput v0, p0, Lf4/b$f;->c:I

    invoke-virtual {p1}, Lp5/a0;->K()I

    move-result p1

    iput p1, p0, Lf4/b$f;->b:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lf4/b$f;->b:I

    return v0
.end method

.method public c()I
    .locals 2

    iget v0, p0, Lf4/b$f;->c:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lf4/b$f;->a:Lp5/a0;

    invoke-virtual {v0}, Lp5/a0;->G()I

    move-result v0

    return v0

    :cond_0
    const/16 v1, 0x10

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lf4/b$f;->a:Lp5/a0;

    invoke-virtual {v0}, Lp5/a0;->M()I

    move-result v0

    return v0

    :cond_1
    iget v0, p0, Lf4/b$f;->d:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lf4/b$f;->d:I

    rem-int/lit8 v0, v0, 0x2

    if-nez v0, :cond_2

    iget-object v0, p0, Lf4/b$f;->a:Lp5/a0;

    invoke-virtual {v0}, Lp5/a0;->G()I

    move-result v0

    iput v0, p0, Lf4/b$f;->e:I

    and-int/lit16 v0, v0, 0xf0

    shr-int/lit8 v0, v0, 0x4

    return v0

    :cond_2
    iget v0, p0, Lf4/b$f;->e:I

    and-int/lit8 v0, v0, 0xf

    return v0
.end method
