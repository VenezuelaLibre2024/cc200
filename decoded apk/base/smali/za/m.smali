.class public final Lza/m;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lza/m$a;
    }
.end annotation


# instance fields
.field public a:I

.field public b:Lza/m$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lza/m;->a:I

    sget-object v0, Lza/m$a;->h:Lza/m$a;

    iput-object v0, p0, Lza/m;->b:Lza/m$a;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lza/m;->a:I

    return v0
.end method

.method public b(I)V
    .locals 1

    iget v0, p0, Lza/m;->a:I

    add-int/2addr v0, p1

    iput v0, p0, Lza/m;->a:I

    return-void
.end method

.method public c()Z
    .locals 2

    iget-object v0, p0, Lza/m;->b:Lza/m$a;

    sget-object v1, Lza/m$a;->i:Lza/m$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public d()Z
    .locals 2

    iget-object v0, p0, Lza/m;->b:Lza/m$a;

    sget-object v1, Lza/m$a;->j:Lza/m$a;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e()V
    .locals 1

    sget-object v0, Lza/m$a;->i:Lza/m$a;

    iput-object v0, p0, Lza/m;->b:Lza/m$a;

    return-void
.end method

.method public f()V
    .locals 1

    sget-object v0, Lza/m$a;->j:Lza/m$a;

    iput-object v0, p0, Lza/m;->b:Lza/m$a;

    return-void
.end method

.method public g()V
    .locals 1

    sget-object v0, Lza/m$a;->h:Lza/m$a;

    iput-object v0, p0, Lza/m;->b:Lza/m$a;

    return-void
.end method

.method public h(I)V
    .locals 0

    iput p1, p0, Lza/m;->a:I

    return-void
.end method
