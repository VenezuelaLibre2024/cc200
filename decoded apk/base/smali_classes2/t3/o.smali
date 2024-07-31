.class public final synthetic Lt3/o;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp5/q$a;


# instance fields
.field public final synthetic a:Lt3/b$a;

.field public final synthetic b:J


# direct methods
.method public synthetic constructor <init>(Lt3/b$a;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt3/o;->a:Lt3/b$a;

    iput-wide p2, p0, Lt3/o;->b:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lt3/o;->a:Lt3/b$a;

    iget-wide v1, p0, Lt3/o;->b:J

    check-cast p1, Lt3/b;

    invoke-static {v0, v1, v2, p1}, Lt3/n1;->N0(Lt3/b$a;JLt3/b;)V

    return-void
.end method
