.class public final Lx5/q;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf6/a$d;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    instance-of p1, p1, Lx5/q;

    return p1
.end method

.method public final hashCode()I
    .locals 3

    const-class v0, Lx5/q;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    invoke-static {v1}, Lh6/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
