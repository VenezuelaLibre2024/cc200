.class public final Lf4/b$g;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf4/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation


# instance fields
.field public final a:I

.field public final b:J

.field public final c:I


# direct methods
.method public constructor <init>(IJI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lf4/b$g;->a:I

    iput-wide p2, p0, Lf4/b$g;->b:J

    iput p4, p0, Lf4/b$g;->c:I

    return-void
.end method

.method public static synthetic a(Lf4/b$g;)J
    .locals 2

    iget-wide v0, p0, Lf4/b$g;->b:J

    return-wide v0
.end method

.method public static synthetic b(Lf4/b$g;)I
    .locals 0

    iget p0, p0, Lf4/b$g;->a:I

    return p0
.end method

.method public static synthetic c(Lf4/b$g;)I
    .locals 0

    iget p0, p0, Lf4/b$g;->c:I

    return p0
.end method
