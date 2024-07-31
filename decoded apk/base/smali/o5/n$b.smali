.class public final Lo5/n$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo5/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public a:Landroid/net/Uri;

.field public b:J

.field public c:I

.field public d:[B

.field public e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public f:J

.field public g:J

.field public h:Ljava/lang/String;

.field public i:I

.field public j:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lo5/n$b;->c:I

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lo5/n$b;->e:Ljava/util/Map;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lo5/n$b;->g:J

    return-void
.end method

.method public constructor <init>(Lo5/n;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lo5/n;->a:Landroid/net/Uri;

    iput-object v0, p0, Lo5/n$b;->a:Landroid/net/Uri;

    iget-wide v0, p1, Lo5/n;->b:J

    iput-wide v0, p0, Lo5/n$b;->b:J

    iget v0, p1, Lo5/n;->c:I

    iput v0, p0, Lo5/n$b;->c:I

    iget-object v0, p1, Lo5/n;->d:[B

    iput-object v0, p0, Lo5/n$b;->d:[B

    iget-object v0, p1, Lo5/n;->e:Ljava/util/Map;

    iput-object v0, p0, Lo5/n$b;->e:Ljava/util/Map;

    iget-wide v0, p1, Lo5/n;->g:J

    iput-wide v0, p0, Lo5/n$b;->f:J

    iget-wide v0, p1, Lo5/n;->h:J

    iput-wide v0, p0, Lo5/n$b;->g:J

    iget-object v0, p1, Lo5/n;->i:Ljava/lang/String;

    iput-object v0, p0, Lo5/n$b;->h:Ljava/lang/String;

    iget v0, p1, Lo5/n;->j:I

    iput v0, p0, Lo5/n$b;->i:I

    iget-object p1, p1, Lo5/n;->k:Ljava/lang/Object;

    iput-object p1, p0, Lo5/n$b;->j:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lo5/n;Lo5/n$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lo5/n$b;-><init>(Lo5/n;)V

    return-void
.end method


# virtual methods
.method public a()Lo5/n;
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lo5/n$b;->a:Landroid/net/Uri;

    const-string v2, "The uri must be set."

    invoke-static {v1, v2}, Lp5/a;->i(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lo5/n;

    iget-object v4, v0, Lo5/n$b;->a:Landroid/net/Uri;

    iget-wide v5, v0, Lo5/n$b;->b:J

    iget v7, v0, Lo5/n$b;->c:I

    iget-object v8, v0, Lo5/n$b;->d:[B

    iget-object v9, v0, Lo5/n$b;->e:Ljava/util/Map;

    iget-wide v10, v0, Lo5/n$b;->f:J

    iget-wide v12, v0, Lo5/n$b;->g:J

    iget-object v14, v0, Lo5/n$b;->h:Ljava/lang/String;

    iget v15, v0, Lo5/n$b;->i:I

    iget-object v2, v0, Lo5/n$b;->j:Ljava/lang/Object;

    const/16 v17, 0x0

    move-object v3, v1

    move-object/from16 v16, v2

    invoke-direct/range {v3 .. v17}, Lo5/n;-><init>(Landroid/net/Uri;JI[BLjava/util/Map;JJLjava/lang/String;ILjava/lang/Object;Lo5/n$a;)V

    return-object v1
.end method

.method public b(I)Lo5/n$b;
    .locals 0

    iput p1, p0, Lo5/n$b;->i:I

    return-object p0
.end method

.method public c([B)Lo5/n$b;
    .locals 0

    iput-object p1, p0, Lo5/n$b;->d:[B

    return-object p0
.end method

.method public d(I)Lo5/n$b;
    .locals 0

    iput p1, p0, Lo5/n$b;->c:I

    return-object p0
.end method

.method public e(Ljava/util/Map;)Lo5/n$b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lo5/n$b;"
        }
    .end annotation

    iput-object p1, p0, Lo5/n$b;->e:Ljava/util/Map;

    return-object p0
.end method

.method public f(Ljava/lang/String;)Lo5/n$b;
    .locals 0

    iput-object p1, p0, Lo5/n$b;->h:Ljava/lang/String;

    return-object p0
.end method

.method public g(J)Lo5/n$b;
    .locals 0

    iput-wide p1, p0, Lo5/n$b;->g:J

    return-object p0
.end method

.method public h(J)Lo5/n$b;
    .locals 0

    iput-wide p1, p0, Lo5/n$b;->f:J

    return-object p0
.end method

.method public i(Landroid/net/Uri;)Lo5/n$b;
    .locals 0

    iput-object p1, p0, Lo5/n$b;->a:Landroid/net/Uri;

    return-object p0
.end method

.method public j(Ljava/lang/String;)Lo5/n$b;
    .locals 0

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iput-object p1, p0, Lo5/n$b;->a:Landroid/net/Uri;

    return-object p0
.end method
