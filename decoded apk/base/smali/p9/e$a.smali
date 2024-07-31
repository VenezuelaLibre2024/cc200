.class public Lp9/e$a;
.super Lp9/e0$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp9/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lp9/e0<",
        "Lp9/e$a;",
        ">.b;"
    }
.end annotation


# instance fields
.field public final c:J

.field public final synthetic d:Lp9/e;


# direct methods
.method public constructor <init>(Lp9/e;Ljava/lang/Exception;J)V
    .locals 0

    iput-object p1, p0, Lp9/e$a;->d:Lp9/e;

    invoke-direct {p0, p1, p2}, Lp9/e0$b;-><init>(Lp9/e0;Ljava/lang/Exception;)V

    iput-wide p3, p0, Lp9/e$a;->c:J

    return-void
.end method


# virtual methods
.method public d()J
    .locals 2

    iget-wide v0, p0, Lp9/e$a;->c:J

    return-wide v0
.end method

.method public e()J
    .locals 2

    iget-object v0, p0, Lp9/e$a;->d:Lp9/e;

    invoke-virtual {v0}, Lp9/e;->m0()J

    move-result-wide v0

    return-wide v0
.end method
