.class public Lq1/f$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq1/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lq1/f$c;",
        ">;"
    }
.end annotation


# instance fields
.field public final h:I

.field public final i:I

.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/String;


# direct methods
.method public constructor <init>(IILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lq1/f$c;->h:I

    iput p2, p0, Lq1/f$c;->i:I

    iput-object p3, p0, Lq1/f$c;->j:Ljava/lang/String;

    iput-object p4, p0, Lq1/f$c;->k:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public b(Lq1/f$c;)I
    .locals 2

    iget v0, p0, Lq1/f$c;->h:I

    iget v1, p1, Lq1/f$c;->h:I

    sub-int/2addr v0, v1

    if-nez v0, :cond_0

    iget v0, p0, Lq1/f$c;->i:I

    iget p1, p1, Lq1/f$c;->i:I

    sub-int/2addr v0, p1

    :cond_0
    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lq1/f$c;

    invoke-virtual {p0, p1}, Lq1/f$c;->b(Lq1/f$c;)I

    move-result p1

    return p1
.end method
