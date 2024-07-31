.class public Lgc/f$b;
.super Lgc/f;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lgc/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public b:D

.field public c:D

.field public d:D

.field public e:I


# direct methods
.method public constructor <init>(II)V
    .locals 4

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lgc/f;-><init>(Lgc/f$a;)V

    int-to-double v0, p1

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    div-double v0, v2, v0

    iput-wide v0, p0, Lgc/f$b;->b:D

    int-to-double p1, p2

    div-double/2addr v2, p1

    iput-wide v2, p0, Lgc/f$b;->c:D

    invoke-static {}, Lgc/f;->a()Lwb/e;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "inFrameRateReciprocal:"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, Lgc/f$b;->b:D

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, " outFrameRateReciprocal:"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, Lgc/f$b;->c:D

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lwb/e;->b(Ljava/lang/String;)V

    return-void
.end method

.method public synthetic constructor <init>(IILgc/f$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lgc/f$b;-><init>(II)V

    return-void
.end method


# virtual methods
.method public c(J)Z
    .locals 4

    iget-wide p1, p0, Lgc/f$b;->d:D

    iget-wide v0, p0, Lgc/f$b;->b:D

    add-double/2addr p1, v0

    iput-wide p1, p0, Lgc/f$b;->d:D

    iget v0, p0, Lgc/f$b;->e:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lgc/f$b;->e:I

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-static {}, Lgc/f;->a()Lwb/e;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "RENDERING (first frame) - frameRateReciprocalSum:"

    :goto_0
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lgc/f$b;->d:D

    invoke-virtual {p2, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lwb/e;->g(Ljava/lang/String;)V

    return v1

    :cond_0
    iget-wide v2, p0, Lgc/f$b;->c:D

    cmpl-double v0, p1, v2

    if-lez v0, :cond_1

    sub-double/2addr p1, v2

    iput-wide p1, p0, Lgc/f$b;->d:D

    invoke-static {}, Lgc/f;->a()Lwb/e;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "RENDERING - frameRateReciprocalSum:"

    goto :goto_0

    :cond_1
    invoke-static {}, Lgc/f;->a()Lwb/e;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "DROPPING - frameRateReciprocalSum:"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v0, p0, Lgc/f$b;->d:D

    invoke-virtual {p2, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lwb/e;->g(Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1
.end method
