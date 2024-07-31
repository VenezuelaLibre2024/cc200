.class public Lhb/o;
.super Lhb/i;
.source ""


# instance fields
.field public c:Z


# direct methods
.method public constructor <init>(Lia/l;)V
    .locals 0

    invoke-direct {p0, p1}, Lhb/i;-><init>(Lia/l;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lhb/o;->c:Z

    return-void
.end method


# virtual methods
.method public e(Lia/h;)Lia/c;
    .locals 2

    iget-boolean v0, p0, Lhb/o;->c:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lhb/o;->c:Z

    new-instance v0, Lia/c;

    new-instance v1, Loa/k;

    invoke-virtual {p1}, Lia/h;->e()Lia/h;

    move-result-object p1

    invoke-direct {v1, p1}, Loa/k;-><init>(Lia/h;)V

    invoke-direct {v0, v1}, Lia/c;-><init>(Lia/b;)V

    return-object v0

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lhb/o;->c:Z

    new-instance v0, Lia/c;

    new-instance v1, Loa/k;

    invoke-direct {v1, p1}, Loa/k;-><init>(Lia/h;)V

    invoke-direct {v0, v1}, Lia/c;-><init>(Lia/b;)V

    return-object v0
.end method
