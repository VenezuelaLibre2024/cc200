.class public final Lz4/f$e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz4/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field public final a:La5/g$e;

.field public final b:J

.field public final c:I

.field public final d:Z


# direct methods
.method public constructor <init>(La5/g$e;JI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz4/f$e;->a:La5/g$e;

    iput-wide p2, p0, Lz4/f$e;->b:J

    iput p4, p0, Lz4/f$e;->c:I

    instance-of p2, p1, La5/g$b;

    if-eqz p2, :cond_0

    check-cast p1, La5/g$b;

    iget-boolean p1, p1, La5/g$b;->t:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lz4/f$e;->d:Z

    return-void
.end method
