.class public final Ld4/a$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld4/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:I

.field public final b:J


# direct methods
.method public constructor <init>(IJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ld4/a$b;->a:I

    iput-wide p2, p0, Ld4/a$b;->b:J

    return-void
.end method

.method public synthetic constructor <init>(IJLd4/a$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ld4/a$b;-><init>(IJ)V

    return-void
.end method

.method public static synthetic a(Ld4/a$b;)J
    .locals 2

    iget-wide v0, p0, Ld4/a$b;->b:J

    return-wide v0
.end method

.method public static synthetic b(Ld4/a$b;)I
    .locals 0

    iget p0, p0, Ld4/a$b;->a:I

    return p0
.end method
