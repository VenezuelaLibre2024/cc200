.class public final Lj4/o$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj4/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final e:Lj4/o$c;


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J

.field public final d:Lp5/i0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp5/i0<",
            "Ls3/m1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 8

    new-instance v7, Lj4/o$c;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lj4/o$c;-><init>(JJJ)V

    sput-object v7, Lj4/o$c;->e:Lj4/o$c;

    return-void
.end method

.method public constructor <init>(JJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lj4/o$c;->a:J

    iput-wide p3, p0, Lj4/o$c;->b:J

    iput-wide p5, p0, Lj4/o$c;->c:J

    new-instance p1, Lp5/i0;

    invoke-direct {p1}, Lp5/i0;-><init>()V

    iput-object p1, p0, Lj4/o$c;->d:Lp5/i0;

    return-void
.end method
