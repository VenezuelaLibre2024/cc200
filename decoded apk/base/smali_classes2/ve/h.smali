.class public final Lve/h;
.super Lre/e0;
.source ""


# instance fields
.field public final h:Ljava/lang/String;

.field public final i:J

.field public final j:Lbf/e;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLbf/e;)V
    .locals 0

    invoke-direct {p0}, Lre/e0;-><init>()V

    iput-object p1, p0, Lve/h;->h:Ljava/lang/String;

    iput-wide p2, p0, Lve/h;->i:J

    iput-object p4, p0, Lve/h;->j:Lbf/e;

    return-void
.end method


# virtual methods
.method public f()J
    .locals 2

    iget-wide v0, p0, Lve/h;->i:J

    return-wide v0
.end method

.method public n()Lbf/e;
    .locals 1

    iget-object v0, p0, Lve/h;->j:Lbf/e;

    return-object v0
.end method
