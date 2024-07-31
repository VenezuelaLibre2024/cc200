.class public final La5/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La5/k;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La5/h;La5/g;)Lo5/g0$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La5/h;",
            "La5/g;",
            ")",
            "Lo5/g0$a<",
            "La5/i;",
            ">;"
        }
    .end annotation

    new-instance v0, La5/j;

    invoke-direct {v0, p1, p2}, La5/j;-><init>(La5/h;La5/g;)V

    return-object v0
.end method

.method public b()Lo5/g0$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lo5/g0$a<",
            "La5/i;",
            ">;"
        }
    .end annotation

    new-instance v0, La5/j;

    invoke-direct {v0}, La5/j;-><init>()V

    return-object v0
.end method
