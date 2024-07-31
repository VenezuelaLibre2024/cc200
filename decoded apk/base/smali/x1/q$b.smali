.class public Lx1/q$b;
.super Lx1/n;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:Lx1/q;


# direct methods
.method public constructor <init>(Lx1/q;)V
    .locals 0

    invoke-direct {p0}, Lx1/n;-><init>()V

    iput-object p1, p0, Lx1/q$b;->a:Lx1/q;

    return-void
.end method


# virtual methods
.method public a(Lx1/m;)V
    .locals 1

    iget-object p1, p0, Lx1/q$b;->a:Lx1/q;

    iget-boolean v0, p1, Lx1/q;->T:Z

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lx1/m;->e0()V

    iget-object p1, p0, Lx1/q$b;->a:Lx1/q;

    const/4 v0, 0x1

    iput-boolean v0, p1, Lx1/q;->T:Z

    :cond_0
    return-void
.end method

.method public d(Lx1/m;)V
    .locals 2

    iget-object v0, p0, Lx1/q$b;->a:Lx1/q;

    iget v1, v0, Lx1/q;->S:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, Lx1/q;->S:I

    if-nez v1, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, v0, Lx1/q;->T:Z

    invoke-virtual {v0}, Lx1/m;->s()V

    :cond_0
    invoke-virtual {p1, p0}, Lx1/m;->T(Lx1/m$f;)Lx1/m;

    return-void
.end method
