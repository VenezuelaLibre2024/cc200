.class public Lhc/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lhc/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lvb/c;Lvb/c;)Z
    .locals 2

    sget-object v0, Lvb/c;->k:Lvb/c;

    const/4 v1, 0x1

    if-eq p1, v0, :cond_2

    if-ne p2, v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lvb/c;->i:Lvb/c;

    if-eq p1, v0, :cond_2

    if-ne p2, v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    :goto_0
    return v1
.end method
