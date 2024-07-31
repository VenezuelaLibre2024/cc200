.class public La5/g$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La5/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# instance fields
.field public final h:Ljava/lang/String;

.field public final i:La5/g$d;

.field public final j:J

.field public final k:I

.field public final l:J

.field public final m:Lw3/m;

.field public final n:Ljava/lang/String;

.field public final o:Ljava/lang/String;

.field public final p:J

.field public final q:J

.field public final r:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;La5/g$d;JIJLw3/m;Ljava/lang/String;Ljava/lang/String;JJZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La5/g$e;->h:Ljava/lang/String;

    iput-object p2, p0, La5/g$e;->i:La5/g$d;

    iput-wide p3, p0, La5/g$e;->j:J

    iput p5, p0, La5/g$e;->k:I

    iput-wide p6, p0, La5/g$e;->l:J

    iput-object p8, p0, La5/g$e;->m:Lw3/m;

    iput-object p9, p0, La5/g$e;->n:Ljava/lang/String;

    iput-object p10, p0, La5/g$e;->o:Ljava/lang/String;

    iput-wide p11, p0, La5/g$e;->p:J

    iput-wide p13, p0, La5/g$e;->q:J

    iput-boolean p15, p0, La5/g$e;->r:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;La5/g$d;JIJLw3/m;Ljava/lang/String;Ljava/lang/String;JJZLa5/g$a;)V
    .locals 0

    invoke-direct/range {p0 .. p15}, La5/g$e;-><init>(Ljava/lang/String;La5/g$d;JIJLw3/m;Ljava/lang/String;Ljava/lang/String;JJZ)V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Long;)I
    .locals 4

    iget-wide v0, p0, La5/g$e;->l:J

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    iget-wide v0, p0, La5/g$e;->l:J

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-gez p1, :cond_1

    const/4 p1, -0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p0, p1}, La5/g$e;->b(Ljava/lang/Long;)I

    move-result p1

    return p1
.end method
