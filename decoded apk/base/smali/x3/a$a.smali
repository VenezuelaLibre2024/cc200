.class public Lx3/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx3/z;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx3/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Lx3/a$d;

.field public final b:J

.field public final c:J

.field public final d:J

.field public final e:J

.field public final f:J

.field public final g:J


# direct methods
.method public constructor <init>(Lx3/a$d;JJJJJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx3/a$a;->a:Lx3/a$d;

    iput-wide p2, p0, Lx3/a$a;->b:J

    iput-wide p4, p0, Lx3/a$a;->c:J

    iput-wide p6, p0, Lx3/a$a;->d:J

    iput-wide p8, p0, Lx3/a$a;->e:J

    iput-wide p10, p0, Lx3/a$a;->f:J

    iput-wide p12, p0, Lx3/a$a;->g:J

    return-void
.end method

.method public static synthetic b(Lx3/a$a;)J
    .locals 2

    iget-wide v0, p0, Lx3/a$a;->c:J

    return-wide v0
.end method

.method public static synthetic c(Lx3/a$a;)J
    .locals 2

    iget-wide v0, p0, Lx3/a$a;->d:J

    return-wide v0
.end method

.method public static synthetic g(Lx3/a$a;)J
    .locals 2

    iget-wide v0, p0, Lx3/a$a;->e:J

    return-wide v0
.end method

.method public static synthetic h(Lx3/a$a;)J
    .locals 2

    iget-wide v0, p0, Lx3/a$a;->f:J

    return-wide v0
.end method

.method public static synthetic j(Lx3/a$a;)J
    .locals 2

    iget-wide v0, p0, Lx3/a$a;->g:J

    return-wide v0
.end method


# virtual methods
.method public d()J
    .locals 2

    iget-wide v0, p0, Lx3/a$a;->b:J

    return-wide v0
.end method

.method public f()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public i(J)Lx3/z$a;
    .locals 13

    iget-object v0, p0, Lx3/a$a;->a:Lx3/a$d;

    invoke-interface {v0, p1, p2}, Lx3/a$d;->a(J)J

    move-result-wide v1

    iget-wide v3, p0, Lx3/a$a;->c:J

    iget-wide v5, p0, Lx3/a$a;->d:J

    iget-wide v7, p0, Lx3/a$a;->e:J

    iget-wide v9, p0, Lx3/a$a;->f:J

    iget-wide v11, p0, Lx3/a$a;->g:J

    invoke-static/range {v1 .. v12}, Lx3/a$c;->h(JJJJJJ)J

    move-result-wide v0

    new-instance v2, Lx3/z$a;

    new-instance v3, Lx3/a0;

    invoke-direct {v3, p1, p2, v0, v1}, Lx3/a0;-><init>(JJ)V

    invoke-direct {v2, v3}, Lx3/z$a;-><init>(Lx3/a0;)V

    return-object v2
.end method

.method public k(J)J
    .locals 1

    iget-object v0, p0, Lx3/a$a;->a:Lx3/a$d;

    invoke-interface {v0, p1, p2}, Lx3/a$d;->a(J)J

    move-result-wide p1

    return-wide p1
.end method
