.class public final synthetic Ln3/n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp3/b$a;


# instance fields
.field public final synthetic a:Ln3/s;

.field public final synthetic b:Lg3/p;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Ln3/s;Lg3/p;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln3/n;->a:Ln3/s;

    iput-object p2, p0, Ln3/n;->b:Lg3/p;

    iput-wide p3, p0, Ln3/n;->c:J

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Ln3/n;->a:Ln3/s;

    iget-object v1, p0, Ln3/n;->b:Lg3/p;

    iget-wide v2, p0, Ln3/n;->c:J

    invoke-static {v0, v1, v2, v3}, Ln3/s;->f(Ln3/s;Lg3/p;J)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
