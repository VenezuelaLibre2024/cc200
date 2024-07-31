.class public final synthetic Lq5/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic h:Lq5/w$a;

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:J


# direct methods
.method public synthetic constructor <init>(Lq5/w$a;Ljava/lang/Object;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq5/p;->h:Lq5/w$a;

    iput-object p2, p0, Lq5/p;->i:Ljava/lang/Object;

    iput-wide p3, p0, Lq5/p;->j:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lq5/p;->h:Lq5/w$a;

    iget-object v1, p0, Lq5/p;->i:Ljava/lang/Object;

    iget-wide v2, p0, Lq5/p;->j:J

    invoke-static {v0, v1, v2, v3}, Lq5/w$a;->e(Lq5/w$a;Ljava/lang/Object;J)V

    return-void
.end method
