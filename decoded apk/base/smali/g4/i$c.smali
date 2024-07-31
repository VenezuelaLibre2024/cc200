.class public final Lg4/i$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lg4/g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg4/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lg4/i$a;)V
    .locals 0

    invoke-direct {p0}, Lg4/i$c;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lx3/l;)J
    .locals 2

    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public b()Lx3/z;
    .locals 3

    new-instance v0, Lx3/z$b;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v0, v1, v2}, Lx3/z$b;-><init>(J)V

    return-object v0
.end method

.method public c(J)V
    .locals 0

    return-void
.end method
