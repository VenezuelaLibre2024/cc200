.class public final Lj3/e;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj3/e$a;
    }
.end annotation


# static fields
.field public static final c:Lj3/e;


# instance fields
.field public final a:J

.field public final b:J


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj3/e$a;

    invoke-direct {v0}, Lj3/e$a;-><init>()V

    invoke-virtual {v0}, Lj3/e$a;->a()Lj3/e;

    move-result-object v0

    sput-object v0, Lj3/e;->c:Lj3/e;

    return-void
.end method

.method public constructor <init>(JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lj3/e;->a:J

    iput-wide p3, p0, Lj3/e;->b:J

    return-void
.end method

.method public static c()Lj3/e$a;
    .locals 1

    new-instance v0, Lj3/e$a;

    invoke-direct {v0}, Lj3/e$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()J
    .locals 2
    .annotation build Lt8/d;
        tag = 0x1
    .end annotation

    iget-wide v0, p0, Lj3/e;->a:J

    return-wide v0
.end method

.method public b()J
    .locals 2
    .annotation build Lt8/d;
        tag = 0x2
    .end annotation

    iget-wide v0, p0, Lj3/e;->b:J

    return-wide v0
.end method
