.class public Lbc/a$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbc/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field public c:J

.field public d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lbc/a$b;->a:I

    iput v0, p0, Lbc/a$b;->b:I

    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Lbc/a$b;->c:J

    const-string v0, "audio/mp4a-latm"

    iput-object v0, p0, Lbc/a$b;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Lbc/a;
    .locals 2

    new-instance v0, Lbc/a;

    invoke-virtual {p0}, Lbc/a$b;->c()Lbc/a$c;

    move-result-object v1

    invoke-direct {v0, v1}, Lbc/a;-><init>(Lbc/a$c;)V

    return-object v0
.end method

.method public b(I)Lbc/a$b;
    .locals 0

    iput p1, p0, Lbc/a$b;->a:I

    return-object p0
.end method

.method public c()Lbc/a$c;
    .locals 3

    new-instance v0, Lbc/a$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbc/a$c;-><init>(Lbc/a$a;)V

    iget v1, p0, Lbc/a$b;->a:I

    invoke-static {v0, v1}, Lbc/a$c;->b(Lbc/a$c;I)I

    iget v1, p0, Lbc/a$b;->b:I

    invoke-static {v0, v1}, Lbc/a$c;->d(Lbc/a$c;I)I

    iget-object v1, p0, Lbc/a$b;->d:Ljava/lang/String;

    invoke-static {v0, v1}, Lbc/a$c;->f(Lbc/a$c;Ljava/lang/String;)Ljava/lang/String;

    iget-wide v1, p0, Lbc/a$b;->c:J

    invoke-static {v0, v1, v2}, Lbc/a$c;->h(Lbc/a$c;J)J

    return-object v0
.end method

.method public d(I)Lbc/a$b;
    .locals 0

    iput p1, p0, Lbc/a$b;->b:I

    return-object p0
.end method
