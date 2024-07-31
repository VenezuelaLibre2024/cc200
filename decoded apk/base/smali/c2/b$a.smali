.class public final Lc2/b$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc2/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Z

.field public b:Z

.field public c:Lc2/k;

.field public d:Z

.field public e:Z

.field public f:J

.field public g:J

.field public h:Lc2/c;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lc2/b$a;->a:Z

    iput-boolean v0, p0, Lc2/b$a;->b:Z

    sget-object v1, Lc2/k;->h:Lc2/k;

    iput-object v1, p0, Lc2/b$a;->c:Lc2/k;

    iput-boolean v0, p0, Lc2/b$a;->d:Z

    iput-boolean v0, p0, Lc2/b$a;->e:Z

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lc2/b$a;->f:J

    iput-wide v0, p0, Lc2/b$a;->g:J

    new-instance v0, Lc2/c;

    invoke-direct {v0}, Lc2/c;-><init>()V

    iput-object v0, p0, Lc2/b$a;->h:Lc2/c;

    return-void
.end method


# virtual methods
.method public a()Lc2/b;
    .locals 1

    new-instance v0, Lc2/b;

    invoke-direct {v0, p0}, Lc2/b;-><init>(Lc2/b$a;)V

    return-object v0
.end method

.method public b(Lc2/k;)Lc2/b$a;
    .locals 0

    iput-object p1, p0, Lc2/b$a;->c:Lc2/k;

    return-object p0
.end method

.method public c(Z)Lc2/b$a;
    .locals 0

    iput-boolean p1, p0, Lc2/b$a;->e:Z

    return-object p0
.end method
