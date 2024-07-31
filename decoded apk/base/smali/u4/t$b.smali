.class public final Lu4/t$b;
.super Lu4/s;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu4/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Lu4/s;-><init>(Ljava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;IIJ)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lu4/s;-><init>(Ljava/lang/Object;IIJ)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;J)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lu4/s;-><init>(Ljava/lang/Object;J)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;JI)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lu4/s;-><init>(Ljava/lang/Object;JI)V

    return-void
.end method

.method public constructor <init>(Lu4/s;)V
    .locals 0

    invoke-direct {p0, p1}, Lu4/s;-><init>(Lu4/s;)V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Object;)Lu4/t$b;
    .locals 1

    new-instance v0, Lu4/t$b;

    invoke-super {p0, p1}, Lu4/s;->a(Ljava/lang/Object;)Lu4/s;

    move-result-object p1

    invoke-direct {v0, p1}, Lu4/t$b;-><init>(Lu4/s;)V

    return-object v0
.end method
