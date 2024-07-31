.class public Lbc/c$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbc/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:Lcc/d;

.field public b:I

.field public c:J

.field public d:F

.field public e:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcc/d;

    invoke-direct {v0}, Lcc/d;-><init>()V

    iput-object v0, p0, Lbc/c$b;->a:Lcc/d;

    const/16 v0, 0x1e

    iput v0, p0, Lbc/c$b;->b:I

    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Lbc/c$b;->c:J

    const/high16 v0, 0x40400000    # 3.0f

    iput v0, p0, Lbc/c$b;->d:F

    const-string v0, "video/avc"

    iput-object v0, p0, Lbc/c$b;->e:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcc/e;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcc/d;

    invoke-direct {v0}, Lcc/d;-><init>()V

    iput-object v0, p0, Lbc/c$b;->a:Lcc/d;

    const/16 v1, 0x1e

    iput v1, p0, Lbc/c$b;->b:I

    const-wide/high16 v1, -0x8000000000000000L

    iput-wide v1, p0, Lbc/c$b;->c:J

    const/high16 v1, 0x40400000    # 3.0f

    iput v1, p0, Lbc/c$b;->d:F

    const-string v1, "video/avc"

    iput-object v1, p0, Lbc/c$b;->e:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcc/d;->b(Lcc/e;)V

    return-void
.end method


# virtual methods
.method public a(J)Lbc/c$b;
    .locals 0

    iput-wide p1, p0, Lbc/c$b;->c:J

    return-object p0
.end method

.method public b()Lbc/c;
    .locals 2

    new-instance v0, Lbc/c;

    invoke-virtual {p0}, Lbc/c$b;->e()Lbc/c$c;

    move-result-object v1

    invoke-direct {v0, v1}, Lbc/c;-><init>(Lbc/c$c;)V

    return-object v0
.end method

.method public c(I)Lbc/c$b;
    .locals 0

    iput p1, p0, Lbc/c$b;->b:I

    return-object p0
.end method

.method public d(F)Lbc/c$b;
    .locals 0

    iput p1, p0, Lbc/c$b;->d:F

    return-object p0
.end method

.method public e()Lbc/c$c;
    .locals 3

    new-instance v0, Lbc/c$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbc/c$c;-><init>(Lbc/c$a;)V

    iget-object v1, p0, Lbc/c$b;->a:Lcc/d;

    invoke-static {v0, v1}, Lbc/c$c;->b(Lbc/c$c;Lcc/e;)Lcc/e;

    iget v1, p0, Lbc/c$b;->b:I

    invoke-static {v0, v1}, Lbc/c$c;->d(Lbc/c$c;I)I

    iget-wide v1, p0, Lbc/c$b;->c:J

    invoke-static {v0, v1, v2}, Lbc/c$c;->f(Lbc/c$c;J)J

    iget v1, p0, Lbc/c$b;->d:F

    invoke-static {v0, v1}, Lbc/c$c;->h(Lbc/c$c;F)F

    iget-object v1, p0, Lbc/c$b;->e:Ljava/lang/String;

    invoke-static {v0, v1}, Lbc/c$c;->j(Lbc/c$c;Ljava/lang/String;)Ljava/lang/String;

    return-object v0
.end method
