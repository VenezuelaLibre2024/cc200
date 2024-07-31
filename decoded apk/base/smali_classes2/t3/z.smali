.class public final synthetic Lt3/z;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp5/q$a;


# instance fields
.field public final synthetic a:Lt3/b$a;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:J

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(Lt3/b$a;Ljava/lang/String;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt3/z;->a:Lt3/b$a;

    iput-object p2, p0, Lt3/z;->b:Ljava/lang/String;

    iput-wide p3, p0, Lt3/z;->c:J

    iput-wide p5, p0, Lt3/z;->d:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 7

    iget-object v0, p0, Lt3/z;->a:Lt3/b$a;

    iget-object v1, p0, Lt3/z;->b:Ljava/lang/String;

    iget-wide v2, p0, Lt3/z;->c:J

    iget-wide v4, p0, Lt3/z;->d:J

    move-object v6, p1

    check-cast v6, Lt3/b;

    invoke-static/range {v0 .. v6}, Lt3/n1;->v0(Lt3/b$a;Ljava/lang/String;JJLt3/b;)V

    return-void
.end method
