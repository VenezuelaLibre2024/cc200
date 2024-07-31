.class public final Lka/a$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lka/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:[Z

.field public final b:I


# direct methods
.method public constructor <init>([ZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lka/a$b;->a:[Z

    iput p2, p0, Lka/a$b;->b:I

    return-void
.end method

.method public static synthetic a(Lka/a$b;)[Z
    .locals 0

    iget-object p0, p0, Lka/a$b;->a:[Z

    return-object p0
.end method

.method public static synthetic b(Lka/a$b;)I
    .locals 0

    iget p0, p0, Lka/a$b;->b:I

    return p0
.end method
