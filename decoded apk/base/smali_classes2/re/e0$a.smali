.class public Lre/e0$a;
.super Lre/e0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lre/e0;->j(Lre/x;JLbf/e;)Lre/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic h:J

.field public final synthetic i:Lbf/e;


# direct methods
.method public constructor <init>(Lre/x;JLbf/e;)V
    .locals 0

    iput-wide p2, p0, Lre/e0$a;->h:J

    iput-object p4, p0, Lre/e0$a;->i:Lbf/e;

    invoke-direct {p0}, Lre/e0;-><init>()V

    return-void
.end method


# virtual methods
.method public f()J
    .locals 2

    iget-wide v0, p0, Lre/e0$a;->h:J

    return-wide v0
.end method

.method public n()Lbf/e;
    .locals 1

    iget-object v0, p0, Lre/e0$a;->i:Lbf/e;

    return-object v0
.end method
