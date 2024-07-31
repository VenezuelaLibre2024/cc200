.class public final synthetic Lq5/r;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lq5/w$a;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:J

.field public final synthetic k:J


# direct methods
.method public synthetic constructor <init>(Lq5/w$a;Ljava/lang/String;JJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq5/r;->h:Lq5/w$a;

    iput-object p2, p0, Lq5/r;->i:Ljava/lang/String;

    iput-wide p3, p0, Lq5/r;->j:J

    iput-wide p5, p0, Lq5/r;->k:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-object v0, p0, Lq5/r;->h:Lq5/w$a;

    iget-object v1, p0, Lq5/r;->i:Ljava/lang/String;

    iget-wide v2, p0, Lq5/r;->j:J

    iget-wide v4, p0, Lq5/r;->k:J

    invoke-static/range {v0 .. v5}, Lq5/w$a;->g(Lq5/w$a;Ljava/lang/String;JJ)V

    return-void
.end method
