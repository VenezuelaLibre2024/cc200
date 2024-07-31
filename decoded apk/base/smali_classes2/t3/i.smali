.class public final synthetic Lt3/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp5/q$a;


# instance fields
.field public final synthetic a:Lt3/b$a;

.field public final synthetic b:I

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lt3/b$a;IJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt3/i;->a:Lt3/b$a;

    iput p2, p0, Lt3/i;->b:I

    iput-wide p3, p0, Lt3/i;->c:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Lt3/i;->a:Lt3/b$a;

    iget v1, p0, Lt3/i;->b:I

    iget-wide v2, p0, Lt3/i;->c:J

    check-cast p1, Lt3/b;

    invoke-static {v0, v1, v2, v3, p1}, Lt3/n1;->t0(Lt3/b$a;IJLt3/b;)V

    return-void
.end method
