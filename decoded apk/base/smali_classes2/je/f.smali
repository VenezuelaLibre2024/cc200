.class public Lje/f;
.super Lce/s1;
.source ""


# instance fields
.field public final k:I

.field public final l:I

.field public final m:J

.field public final n:Ljava/lang/String;

.field public o:Lje/a;


# direct methods
.method public constructor <init>(IIJLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lce/s1;-><init>()V

    iput p1, p0, Lje/f;->k:I

    iput p2, p0, Lje/f;->l:I

    iput-wide p3, p0, Lje/f;->m:J

    iput-object p5, p0, Lje/f;->n:Ljava/lang/String;

    invoke-virtual {p0}, Lje/f;->K0()Lje/a;

    move-result-object p1

    iput-object p1, p0, Lje/f;->o:Lje/a;

    return-void
.end method


# virtual methods
.method public H0(Ljd/g;Ljava/lang/Runnable;)V
    .locals 6

    iget-object v0, p0, Lje/f;->o:Lje/a;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v5, 0x0

    move-object v1, p2

    invoke-static/range {v0 .. v5}, Lje/a;->x(Lje/a;Ljava/lang/Runnable;Lje/i;ZILjava/lang/Object;)V

    return-void
.end method

.method public final K0()Lje/a;
    .locals 7

    new-instance v6, Lje/a;

    iget v1, p0, Lje/f;->k:I

    iget v2, p0, Lje/f;->l:I

    iget-wide v3, p0, Lje/f;->m:J

    iget-object v5, p0, Lje/f;->n:Ljava/lang/String;

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lje/a;-><init>(IIJLjava/lang/String;)V

    return-object v6
.end method

.method public final L0(Ljava/lang/Runnable;Lje/i;Z)V
    .locals 1

    iget-object v0, p0, Lje/f;->o:Lje/a;

    invoke-virtual {v0, p1, p2, p3}, Lje/a;->w(Ljava/lang/Runnable;Lje/i;Z)V

    return-void
.end method
