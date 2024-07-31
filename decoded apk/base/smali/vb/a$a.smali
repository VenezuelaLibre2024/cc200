.class public Lvb/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lec/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvb/a;->c(Lvb/d;ILec/b;)Lec/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public a:J

.field public b:J

.field public c:J

.field public final synthetic d:J

.field public final synthetic e:Lec/b;

.field public final synthetic f:Lvb/a;


# direct methods
.method public constructor <init>(Lvb/a;JLec/b;)V
    .locals 2

    iput-object p1, p0, Lvb/a$a;->f:Lvb/a;

    iput-wide p2, p0, Lvb/a$a;->d:J

    iput-object p4, p0, Lvb/a$a;->e:Lec/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide v0, 0x7fffffffffffffffL

    iput-wide v0, p0, Lvb/a$a;->b:J

    const-wide/16 v0, 0xa

    add-long/2addr p2, v0

    iput-wide p2, p0, Lvb/a$a;->c:J

    return-void
.end method


# virtual methods
.method public a(Lvb/d;J)J
    .locals 4

    const-wide v0, 0x7fffffffffffffffL

    cmp-long v2, p2, v0

    if-nez v2, :cond_0

    iget-wide p1, p0, Lvb/a$a;->a:J

    return-wide p1

    :cond_0
    iget-wide v2, p0, Lvb/a$a;->b:J

    cmp-long v0, v2, v0

    if-nez v0, :cond_1

    iput-wide p2, p0, Lvb/a$a;->b:J

    :cond_1
    iget-wide v0, p0, Lvb/a$a;->c:J

    iget-wide v2, p0, Lvb/a$a;->b:J

    sub-long/2addr p2, v2

    add-long/2addr v0, p2

    iput-wide v0, p0, Lvb/a$a;->a:J

    iget-object p2, p0, Lvb/a$a;->e:Lec/b;

    invoke-interface {p2, p1, v0, v1}, Lec/b;->a(Lvb/d;J)J

    move-result-wide p1

    return-wide p1
.end method
