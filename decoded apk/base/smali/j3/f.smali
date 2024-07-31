.class public final Lj3/f;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj3/f$a;
    }
.end annotation


# static fields
.field public static final c:Lj3/f;


# instance fields
.field public final a:J

.field public final b:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj3/f$a;

    invoke-direct {v0}, Lj3/f$a;-><init>()V

    invoke-virtual {v0}, Lj3/f$a;->a()Lj3/f;

    move-result-object v0

    sput-object v0, Lj3/f;->c:Lj3/f;

    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lj3/f;->a:J

    iput-wide p3, p0, Lj3/f;->b:J

    return-void
.end method

.method public static c()Lj3/f$a;
    .locals 1

    new-instance v0, Lj3/f$a;

    invoke-direct {v0}, Lj3/f$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()J
    .locals 2
    .annotation build Lt8/d;
        tag = 0x2
    .end annotation

    iget-wide v0, p0, Lj3/f;->b:J

    return-wide v0
.end method

.method public b()J
    .locals 2
    .annotation build Lt8/d;
        tag = 0x1
    .end annotation

    iget-wide v0, p0, Lj3/f;->a:J

    return-wide v0
.end method
