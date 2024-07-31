.class public final Ls3/i1$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls3/i1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ls3/s2$c;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lu4/o0;

.field public final c:I

.field public final d:J


# direct methods
.method public constructor <init>(Ljava/util/List;Lu4/o0;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ls3/s2$c;",
            ">;",
            "Lu4/o0;",
            "IJ)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls3/i1$b;->a:Ljava/util/List;

    iput-object p2, p0, Ls3/i1$b;->b:Lu4/o0;

    iput p3, p0, Ls3/i1$b;->c:I

    iput-wide p4, p0, Ls3/i1$b;->d:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lu4/o0;IJLs3/i1$a;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Ls3/i1$b;-><init>(Ljava/util/List;Lu4/o0;IJ)V

    return-void
.end method

.method public static synthetic a(Ls3/i1$b;)I
    .locals 0

    iget p0, p0, Ls3/i1$b;->c:I

    return p0
.end method

.method public static synthetic b(Ls3/i1$b;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Ls3/i1$b;->a:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic c(Ls3/i1$b;)Lu4/o0;
    .locals 0

    iget-object p0, p0, Ls3/i1$b;->b:Lu4/o0;

    return-object p0
.end method

.method public static synthetic d(Ls3/i1$b;)J
    .locals 2

    iget-wide v0, p0, Ls3/i1$b;->d:J

    return-wide v0
.end method
