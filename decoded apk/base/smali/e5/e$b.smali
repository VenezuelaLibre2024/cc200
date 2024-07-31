.class public final Le5/e$b;
.super Ld5/l;
.source ""

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le5/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ld5/l;",
        "Ljava/lang/Comparable<",
        "Le5/e$b;",
        ">;"
    }
.end annotation


# instance fields
.field public q:J


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ld5/l;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Le5/e$a;)V
    .locals 0

    invoke-direct {p0}, Le5/e$b;-><init>()V

    return-void
.end method

.method public static synthetic B(Le5/e$b;J)J
    .locals 0

    iput-wide p1, p0, Le5/e$b;->q:J

    return-wide p1
.end method


# virtual methods
.method public C(Le5/e$b;)I
    .locals 8

    invoke-virtual {p0}, Lv3/a;->q()Z

    move-result v0

    invoke-virtual {p1}, Lv3/a;->q()Z

    move-result v1

    const/4 v2, 0x1

    const/4 v3, -0x1

    if-eq v0, v1, :cond_1

    invoke-virtual {p0}, Lv3/a;->q()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    return v2

    :cond_1
    iget-wide v0, p0, Lv3/g;->l:J

    iget-wide v4, p1, Lv3/g;->l:J

    sub-long/2addr v0, v4

    const-wide/16 v4, 0x0

    cmp-long v6, v0, v4

    if-nez v6, :cond_2

    iget-wide v0, p0, Le5/e$b;->q:J

    iget-wide v6, p1, Le5/e$b;->q:J

    sub-long/2addr v0, v6

    cmp-long p1, v0, v4

    if-nez p1, :cond_2

    const/4 p1, 0x0

    return p1

    :cond_2
    cmp-long p1, v0, v4

    if-lez p1, :cond_3

    goto :goto_1

    :cond_3
    move v2, v3

    :goto_1
    return v2
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Le5/e$b;

    invoke-virtual {p0, p1}, Le5/e$b;->C(Le5/e$b;)I

    move-result p1

    return p1
.end method
