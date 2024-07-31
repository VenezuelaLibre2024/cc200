.class public Lhb/n;
.super Lhb/i;
.source ""


# direct methods
.method public constructor <init>(Lia/l;)V
    .locals 0

    invoke-direct {p0, p1}, Lhb/i;-><init>(Lia/l;)V

    return-void
.end method


# virtual methods
.method public e(Lia/h;)Lia/c;
    .locals 2

    new-instance v0, Lia/c;

    new-instance v1, Loa/k;

    invoke-virtual {p1}, Lia/h;->e()Lia/h;

    move-result-object p1

    invoke-direct {v1, p1}, Loa/k;-><init>(Lia/h;)V

    invoke-direct {v0, v1}, Lia/c;-><init>(Lia/b;)V

    return-object v0
.end method
