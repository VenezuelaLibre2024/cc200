.class public Lx3/t$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx3/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:[J

.field public final b:[J


# direct methods
.method public constructor <init>([J[J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx3/t$a;->a:[J

    iput-object p2, p0, Lx3/t$a;->b:[J

    return-void
.end method
