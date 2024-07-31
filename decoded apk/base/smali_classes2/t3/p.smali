.class public final synthetic Lt3/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp5/q$a;


# instance fields
.field public final synthetic a:Lt3/b$a;

.field public final synthetic b:J

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lt3/b$a;JI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt3/p;->a:Lt3/b$a;

    iput-wide p2, p0, Lt3/p;->b:J

    iput p4, p0, Lt3/p;->c:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, Lt3/p;->a:Lt3/b$a;

    iget-wide v1, p0, Lt3/p;->b:J

    iget v3, p0, Lt3/p;->c:I

    check-cast p1, Lt3/b;

    invoke-static {v0, v1, v2, v3, p1}, Lt3/n1;->S(Lt3/b$a;JILt3/b;)V

    return-void
.end method
